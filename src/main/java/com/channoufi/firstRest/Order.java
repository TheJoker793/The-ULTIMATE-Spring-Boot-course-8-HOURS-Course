package com.channoufi.firstRest;

public class Order {
    private String client;
   private String product;
   private int quantity;

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    @Override
    public String toString(){
        return "client "+this.getClient()+ " buy product "+
                this.getProduct()+" with qte "+this.getQuantity();
    }
}
