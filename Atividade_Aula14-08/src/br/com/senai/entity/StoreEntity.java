package br.com.senai.entity;

public class StoreEntity {

    private String product;
    private double productValue;
    private int quantity;
    private double totalValue;
    private int totalQuantityProducts;
    private double totalValueProducts;

    public int getTotalQuantityProducts() {
        return totalQuantityProducts;
    }

    public void setTotalQuantityProducts(int totalQuantityProducts) {
        this.totalQuantityProducts = totalQuantityProducts;
    }

    public double getTotalValueProducts() {
        return totalValueProducts;
    }

    public void setTotalValueProducts(double totalValueProducts) {
        this.totalValueProducts = totalValueProducts;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public double getProductValue() {
        return productValue;
    }

    public void setProductValue(double productValue) {
        this.productValue = productValue;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(double totalValue) {
        this.totalValue = totalValue;
    }
}