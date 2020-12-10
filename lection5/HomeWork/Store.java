package lection5.HomeWork;

import java.util.ArrayList;
import java.util.List;

public class Store {

    List<Product> prodList = new ArrayList<>();

    public List<Product> getProdList() {
        return prodList;
    }

    public void setProdList(List<Product> prodList) {
        this.prodList = prodList;
    }

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

    public void increasePrice (ProductType type) {
        for (int i = 0; i < prodList.size(); i++) {
            if (prodList.get(i).getType()==type) {
                prodList.get(i).setPrice(prodList.get(i).getPrice()*2);
                System.out.println(prodList.get(i).getPrice());
            }
        }
    }
}
