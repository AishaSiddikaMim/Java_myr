public class VendingItem {
    private String name;
    private double price;

public VendingItem(String name, double price) {
  this.name = name;
  this.price = price;
}
public String getName() {return name;}
public double getPrice() {return price;}

public String toString() {
   return this.name + " : " +  this.price;

}
}
