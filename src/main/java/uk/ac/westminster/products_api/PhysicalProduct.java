/* TUT4 Activity:2 Task:9 -
A PhysicalProduct IS-A Product because
Line 2: name one other class a shop system mighthave that would NOT pass this test, and say why.
 */
package uk.ac.westminster.products_api;

//TUT4 Activity:2 Task:7 - Create class and declare fields.
public class PhysicalProduct extends Product {
    private double weightKg;
    private String dimensions;

    //TUT4 Activity:2 Task:8 - Create constructors & getters
    public PhysicalProduct(){}

    public PhysicalProduct(Long id, String name, double price,
                           double weightKg, String dimensions) {
        super(id, name, price);
        this.weightKg = weightKg;
        this.dimensions = dimensions;
    }

    public double getWeightKg() {return weightKg;}
    public String getDimensions() {return dimensions;}
}
