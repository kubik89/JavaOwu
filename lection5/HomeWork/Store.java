package lection5.HomeWork;

public class Store {
    Product list;

    public Product getList() {
        return list;
    }

    public void setList(Product list) {
        this.list = list;
    }

    public Product addToShopNew(String name, int price, ProductType type) {
        if (price > 0) {
            for (int j = 0; j <= 9; j++) {
                String number = Integer.toString(j);
                if (name.contains(number)) {
                    return null;
                }
            }
            return new Product(name, price, type);
        } else return null;
    }

    public void deleteFromShopByName(String name) {
        if (getList().getName().equals(name)) {
            System.out.println("Знайдено" + getList().getName());
        }
//        return getList().getName().indexOf(name);
    }
    public int getIntByPrice (int price) {
        if (getList().getPrice() == price) {
            return getList().getName().length();
        }
        return getList().getName().length();
    }

    @Override
    public String toString() {
        return "Store{" +
                "list=" + list +
                '}';
    }
}
