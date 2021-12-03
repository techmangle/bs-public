package org.bs.train;

public class Mobile {
    private String modelName;
    private String manufacturer;
    private Integer price;
    private Integer stock;

    public Mobile(String modelName, String manufacturer, Integer price, Integer stock) {
        this.modelName = modelName;
        this.manufacturer = manufacturer;
        this.price = price;
        this.stock = stock;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Mobile{" +
                "modelName='" + modelName + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", price=" + price +
                ", stock=" + stock +
                '}';
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}
