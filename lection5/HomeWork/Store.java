package lection5.HomeWork;

import java.util.ArrayList;
import java.util.List;

public class Store {

    List<Product> prodList = new ArrayList<>();
//
//    public List<Product> getProdList() {
//        return prodList;
//    }
//
//    public void setProdList(List<Product> prodList) {
//        this.prodList = prodList;
//    }

    public boolean addToShopNew(String name, int price, ProductType type) {
        if (price > 0) {
            for (int j = 0; j <= 9; j++) {
                String number = Integer.toString(j);
                if (name.contains(number)) {
                    return false;
                }
            }
            return prodList.add(new Product(name, price, type));
        }
        return false;
    }

    public void getNameByFood(String name) {
        for (int i = 0; i < prodList.size(); i++) {
            if (prodList.get(i).getName().equals(name)) {
                prodList.remove(prodList.get(i));
            }
        }
    }

    public void increasePrice(ProductType type) {
        for (int i = 0; i < prodList.size(); i++) {
            if (prodList.get(i).getType() == type) {
                prodList.get(i).setPrice(prodList.get(i).getPrice() * 2);
                System.out.println(prodList.get(i).getPrice());
            }
        }
    }

    public void premiumFoods(int maxPrice) {
        List<Store> tempList = new ArrayList<>();
        for (int i = 0; i < prodList.size(); i++) {
            if (prodList.get(i).getPrice() >= maxPrice) {
                tempList.add(new Product(prodList.get(i).getName(), prodList.get(i).getPrice(), prodList.get(i).getType()));
            }
        }
        System.out.println("В нашому магазині продаються такі преміум товари: " + tempList);
    }

    public void sumFoodByType(ProductType type) {
        int sum = 0;
        for (int i = 0; i < prodList.size(); i++) {
            if (prodList.get(i).getType() == type) {
                sum += prodList.get(i).getPrice();
            }
        }
        System.out.println("Сума всіх товарів по типу: " + sum);
    }

    public void avgSumAllGoods() {
        int sum = 0;
        for (int i = 0; i < prodList.size(); i++) {
            sum += prodList.get(i).getPrice();
        }
        int avgSum = sum / prodList.size();
        System.out.println("Середня ціна всіх товарів: " + avgSum);
    }
}
