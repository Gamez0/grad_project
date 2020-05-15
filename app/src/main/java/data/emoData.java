package data;

import androidx.annotation.Keep;

@Keep
public class emoData {
    String name;
    String subname;
    public emoData(){

    }
    public emoData(String name,String subname){
        this.name=name;
        this.subname=subname;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubname() {
        return subname;
    }

    public void setSubname(String subname) {
        this.subname = subname;
    }
    @Override
    public String toString() {
        return "emoData{" +
                "name='" + name + '\'' +
                ", subname='" + subname + '\'' +
                '}';
    }
}
