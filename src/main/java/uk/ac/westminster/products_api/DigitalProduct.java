//TUT4 Activity:1 Task:3 - create new class and declare 2 new fields
package uk.ac.westminster.products_api;

public class DigitalProduct extends Product {
    private String downloadUrl;
    private double fileSizeMB;

    //TUT4 Activity:1 Task:4 - Write full constructor
    public DigitalProduct(Long id, String name, double price,
                          String downloadUrl, double fileSizeMB){
        super(id, name, price);
        this.downloadUrl =  downloadUrl;
        this.fileSizeMB = fileSizeMB;
    }

    //TUT4 Activity:1 Task:5 Add no args constructor & getters
    public DigitalProduct(){}

        //getters
    public String getDownloadUrl() {return downloadUrl;}
    public double getFileSizeMB() {return fileSizeMB;}
}
