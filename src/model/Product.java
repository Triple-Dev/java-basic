package model;
//A normal class
public class Product {

    private String id;
    private double salePrice;
    private double purchasePrice;
    private Type quantityType;
    private double quantity;

    public Product() {
    }

    public Product(String id, double salePrice, double purchasePrice, Type quantityType, double quantity) {
        this.id = id;
        this.salePrice = salePrice;
        this.purchasePrice = purchasePrice;
        this.quantityType = quantityType;
        this.quantity = quantity;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public Type getQuantityType() {
        return quantityType;
    }

    public void setQuantityType(Type quantityType) {
        this.quantityType = quantityType;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", salePrice=" + salePrice +
                ", purchasePrice=" + purchasePrice +
                ", quantityType=" + quantityType +
                ", quantity=" + quantity +
                '}';
    }
}
