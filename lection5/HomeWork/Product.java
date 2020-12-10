package lection5.HomeWork;

import java.util.Objects;

public class Product extends Store{
    private String name;
    private int price;
    private ProductType type;

    public Product(String name, int price, ProductType type) {
        this.name = name;
        this.price = price;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public ProductType getType() {
        return type;
    }

    public void setType(ProductType type) {
        this.type = type;
    }

    public Product someFunction (String name, int price, ProductType type) {
        return new Product(name, price, type);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", type=" + type +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return price == product.price &&
                Objects.equals(name, product.name) &&
                type == product.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, type);
    }
}
