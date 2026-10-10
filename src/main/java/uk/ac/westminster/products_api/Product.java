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
    public String getName() {return name;}
    public double getPrice() {return price;}
}