package com.ecommerce.project.controller;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Category {
    @Id
    private Long categoryID;
    private String categoryName;
    public Category(long categoryID, String categoryName) {
        this.categoryID = categoryID;
        this.categoryName = categoryName;
    }

    public Long getCategoryID() {
        return categoryID;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryID(long categoryID) {
        this.categoryID = categoryID;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }


}
