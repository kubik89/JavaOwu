package lection5.HomeWork;

public class Store {
    Product list;

    public Product getList() {
        return list;
    }

    public void setList(Product list) {
        this.list = list;
        }

    public Product addToShopNew (String name, int price, ProductType type) {
        if (price>=0) {
            return new Product(name, price, type);
        } return null;
    }

    @Override
    public String toString() {
        return "Store{" +
                "list=" + list +
                '}';
    }
}
