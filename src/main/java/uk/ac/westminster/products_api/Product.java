package uk.ac.westminster.products_api;

public class Product {
    private Long id;
    private String name;
    private double price;

    public Product(Long id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    //TUT2 Activity:2 Encapsulation: no argument constructor
    public Product(){}

    //TUT2 Activity:2 Encapsulation: getters
    public Long getId() {return id;}
    public double getPrice() {return price;}

    //TUT2 Activity:3 Commented the getter out, ran  GET /products/{id} with id 1
    public String getName() {return name;}

    //TUT3 Activity:1 Task:1 - Add Missing setters to product class
    public void setId(Long id) {this.id = id;}
    public void setName(String name) {this.name = name;}
    public void setPrice(double price) {this.price = price;}
}