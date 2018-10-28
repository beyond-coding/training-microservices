package com.beyondcoding.teahouse.dessertexpert;

public class Product {

    private String name;

    private String expert;

    private String teahouse;

    public Product() {
    }

    public Product(String name, String expert, String teahouse) {
        this.name = name;
        this.expert = expert;
        this.teahouse = teahouse;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExpert() {
        return expert;
    }

    public void setExpert(String expert) {
        this.expert = expert;
    }

    public String getTeahouse() {
        return teahouse;
    }

    public void setTeahouse(String teahouse) {
        this.teahouse = teahouse;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", expert='" + expert + '\'' +
                ", teahouse='" + teahouse + '\'' +
                '}';
    }
}
