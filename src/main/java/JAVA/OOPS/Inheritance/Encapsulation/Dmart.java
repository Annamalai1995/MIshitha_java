package JAVA.OOPS.Inheritance.Encapsulation;

public class Dmart {
    public int product_id;
    public String Product_name;
    public String categeory;
    public  int quantity;
    public  int price;


    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public String getProduct_name() {
        return Product_name;
    }

    public void setProduct_name(String product_name) {
        Product_name = product_name;
    }

    public String getCategeory() {
        return categeory;
    }

    public void setCategeory(String categeory) {
        this.categeory = categeory;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
