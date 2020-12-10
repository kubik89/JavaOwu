package lection5.HomeWork;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Product products = new Product();
        products.addToShopNew("Огірок0", 25, ProductType.VEGETABLES);
        products.addToShopNew("Огірок1", -25, ProductType.VEGETABLES);
        products.addToShopNew("Огірок2", 55, ProductType.VEGETABLES);
        products.addToShopNew("Горілка", 155, ProductType.ALCOHOL);
        products.addToShopNew("Пиво", 45, ProductType.ALCOHOL);
        products.addToShopNew("Коньяк", 450, ProductType.ALCOHOL);
        products.addToShopNew("Авокадо", 100, ProductType.FRUICTS);
        products.addToShopNew("Фінік", -5, ProductType.FRUICTS);
        products.addToShopNew("Бан1ан", 55, ProductType.FRUICTS);
        products.addToShopNew("Цукерки", -120, ProductType.SWEETS);
        products.addToShopNew("Печиво", 70, ProductType.SWEETS);
        products.addToShopNew("Зефір", 90, ProductType.SWEETS);

        products.getNameByFood("Горілка");
        products.increasePrice(ProductType.ALCOHOL);
        products.premiumFoods(100);
        products.sumFoodByType(ProductType.SWEETS);
        products.avgSumAllGoods();



    }
}
