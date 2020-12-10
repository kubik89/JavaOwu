package lection5.HomeWork;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        store1[0].addToShop("Огірок", 25);
//        store1[1].addToShop("Помідор", 35);
//        System.out.println(store1);
        List<Product> list1 = new ArrayList<>();

//        Product product1 = new Product("Огірок0", 25, ProductType.VEGETABLES);
//        list1.add(product1.someFunction("Огірок1", 25, ProductType.VEGETABLES));
//        list1.add(product1.someFunction("Огірок2", 30, ProductType.VEGETABLES));
//        list1.add(product1.someFunction("Огірок3", 35, ProductType.VEGETABLES));
//        System.out.println(list1);

        List<Store> storeList = new ArrayList<>();

        storeList.add(new Store().addToShopNew("Огірок0", 25, ProductType.VEGETABLES));
        storeList.add(new Store().addToShopNew("Огірок1", -25, ProductType.VEGETABLES));
        storeList.add(new Store().addToShopNew("Огірок2", 55, ProductType.VEGETABLES));
        storeList.add(new Store().addToShopNew("Горілка", 155, ProductType.ALCOHOL));
        storeList.add(new Store().addToShopNew("Пиво", 45, ProductType.ALCOHOL));
        storeList.add(new Store().addToShopNew("Коньяк", 450, ProductType.ALCOHOL));
        storeList.add(new Store().addToShopNew("Авокадо", 100, ProductType.FRUICTS));
        storeList.add(new Store().addToShopNew("Фінік", -5, ProductType.FRUICTS));
        storeList.add(new Store().addToShopNew("Банан", 55, ProductType.FRUICTS));
        storeList.add(new Store().addToShopNew("Цукерки", -120, ProductType.SWEETS));
        storeList.add(new Store().addToShopNew("Печиво", 70, ProductType.SWEETS));
        storeList.add(new Store().addToShopNew("Зефір", 90, ProductType.SWEETS));

        for (Store product : storeList) {
            System.out.println(product);
        }

//        System.out.println(list1.get(1));
//        store1.setList(new Product("Томат", 60, ProductType.VEGETABLES));
//        System.out.println(store1.getList());

//        System.out.println(store1.getList());


//        List<Store> list1 = new ArrayList<>();
//        list1.add(new Store(new Product("Помідор", 45, ProductType.VEGETABLES)));

    }
}
