import java.util.*;

public class product {
    public String Name;
    public String ID;
    public Integer Price;
    public String Category;
    public String Type;
    public brand BrandName;
    public int views = 0;

    product() {
        this.Name = "";
        this.ID = "";
        this.Price = 0;
        this.Category = "";
        this.Type = "";
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String id) {
        this.ID = id;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        this.Price = price;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        this.Category = category;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        this.Type = type;
    }

    public brand getBrandName() {
        return BrandName;
    }

    public void setBrandName(brand brandName) {
        this.BrandName = brandName;
    }


    public void Add() {
    }

    public void update() {
    }

    public void delete() {
    }
}
