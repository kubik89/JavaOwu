package lection5.HomeWork;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Store> storeList = new ArrayList<>();
        Store store1 = new Store();
        storeList.add(store1.addToShopNew("Огірок0", 25, ProductType.VEGETABLES));
        storeList.add(store1.addToShopNew("Огірок1", -25, ProductType.VEGETABLES));
        storeList.add(store1.addToShopNew("Огірок2", 55, ProductType.VEGETABLES));
        storeList.add(store1.addToShopNew("Горілка", 155, ProductType.ALCOHOL));
        storeList.add(store1.addToShopNew("Пиво", 45, ProductType.ALCOHOL));
        storeList.add(store1.addToShopNew("Коньяк", 450, ProductType.ALCOHOL));
        storeList.add(store1.addToShopNew("Авокадо", 100, ProductType.FRUICTS));
        storeList.add(store1.addToShopNew("Фінік", -5, ProductType.FRUICTS));
        storeList.add(store1.addToShopNew("Бан1ан", 55, ProductType.FRUICTS));
        storeList.add(store1.addToShopNew("Цукерки", -120, ProductType.SWEETS));
        storeList.add(store1.addToShopNew("Печиво", 70, ProductType.SWEETS));
        storeList.add(store1.addToShopNew("Зефір", 90, ProductType.SWEETS));

        storeList.remove(store1.getIntByPrice(70)); // ????







//        storeList.remove(5);

//        store1.deleteFromShopByName("Печиво");

//        for (Store product : storeList) {
//            System.out.println(product);
//        }

//        for (int i = 0; i < storeList.size(); i++) {
//            System.out.println(storeList.);
//            storeList.remove(5);
//        }
//        store1.getIntByName("Зефір");

//        System.out.println(storeList.remove(5));
//        System.out.println(store1.getList().getName().length());


//        store1.deleteFromShopByName("Фінік");

//        System.out.println(storeList.size());
//        System.out.println(store1.getList());




    }
}
