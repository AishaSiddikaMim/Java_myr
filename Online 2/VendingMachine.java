public class VendingMachine {

    private static double totalSales = 0;

    private int totalItems = 10;

    public VendingItem [] shelf;

    public VendingMachine() {
        this.totalItems = totalItems;
        shelf = new VendingItem[10];
        restock();
    }

    public VendingItem vend(int code) {
        VendingItem item;
        if (code < totalItems-1) {
            item = shelf[code];
            totalSales += shelf[code].getPrice();
            totalItems--;
            for (int i = code; i < totalItems; i++) {
                if (i <= totalItems - 1) {
                    item = shelf[i];
                    shelf[i] = shelf[i + 1];

                }
                else {
                    item = null;
                }

            }

        }
        else  {
            return null;
        }
        return item;
    }


    public void restock(){
        shelf[0] = new VendingItem("Lays", 1.50);
        shelf[1] = new VendingItem("Doritos", 1.50);
        shelf[2] = new VendingItem("Coke", 2.50);
        shelf[3] = new VendingItem("Rubik's Cube", 30);
        shelf[4] = new VendingItem("Pie", 3.14);
        shelf[5] = new VendingItem("Clicker", 55.55);
        shelf[6] = new VendingItem("Cheetos", 1.25);
        shelf[7] = new VendingItem("Cold Pizza", 0.99);
        shelf[8] = new VendingItem("Graphing Calculator", 120);
        shelf[9] = new VendingItem("Ramen", 3.15);
    }

    public static double getTotalSales() { return totalSales;}

    public int getNumberOfItems() {
        return totalItems;
    }
    public double getTotalValue(){
        double value = 0.0 ;
        for (int i = 0; i < totalItems; i++){
            value = value + shelf[i].getPrice();
        }
        return value;
    }

    public String toString() {
        String name = " ";
        for (int i = 0; i < totalItems; i++) {
                name += shelf[i].getName() + "," ;
        }
        return name;

    }


    }

