package com.example.parentchildrelatonship;

import java.util.ArrayList;
import java.util.List;

public class Parent {
    private String Id;
    private String parentId;
    private String name;
    private double age;
    private List<Parent> childrenItems;

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public Parent() {
        this.Id ="";
        this.parentId ="";
        this.name = "";
        this.age = 0.0;
        this.childrenItems = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public List<Parent> getChildrenItems() {
        return childrenItems;
    }

    public void setChildrenItems(List<Parent> childrenItems) {
        this.childrenItems = childrenItems;
    }

    public void addChildrenItem(Parent childrenItem){
        if(!this.childrenItems.contains(childrenItem))
            this.childrenItems.add(childrenItem);
    }

}
