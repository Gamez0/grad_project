package com.example.myapplication.Item;

import androidx.annotation.Keep;

@Keep
public class emoItem {
    // emotion Item
    String name;
    String subName;
    public emoItem(){

    }
    public emoItem(String name,String subName){
        this.name=name;
        this.subName=subName;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubName() {
        return subName;
    }

    public void setSubName(String subName) {
        this.subName = subName;
    }
    @Override
    public String toString() {
        return "emoData{" +
                "name='" + name + '\'' +
                ", subName='" + subName + '\'' +
                '}';
    }
}
