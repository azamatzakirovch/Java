package org.example;

public class Second {
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;

    public Second(String partNumber, String partDescription, int quantity, double pricePerItem) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public void setQuantity(int setQuantity) {
        this.quantity = Math.max(setQuantity, 0);
    }

    public void setPricePerItem(double setPricePerItem) {
        this.pricePerItem = Math.max(setPricePerItem, 0);
    }

    public String getPartNumber() {
        return partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public double getTotalPrice() {
        return quantity * pricePerItem;
    }

    public static void main(String[] args){
        Second invoice = new Second("P101", "Screwdriver", 3, 4.5);
        System.out.println("==================TASK2==================");
        System.out.println("Part: " + invoice.getPartNumber());
        System.out.println("Desc: " + invoice.getPartDescription());
        System.out.println("Qty: " + invoice.getQuantity());
        System.out.println("Price each: $" + invoice.getPricePerItem());
        System.out.println("Total: $" + invoice.getTotalPrice());
    }



}
