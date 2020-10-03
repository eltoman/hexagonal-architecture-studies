package org.example.tutorial.domain;

public class Product {
    private Integer productId;
    private String type;
    private String description;


    public Product() {
        super();
    }

    public Product(Integer productId, String type, String description) {
        this.productId = productId;
        this.type = type;
        this.description = description;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
