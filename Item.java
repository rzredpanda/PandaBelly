public class Item {
    private String name;
    private double price;
    private int quantity;
    private int SKU;

    public Item(String n, double p, int q, int s){
        name=n;
        price=p;
        quantity=q;
        SKU=s;
    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public int getQuantity(){
        return quantity;
    }
    public int getSKU(){
        return SKU;
    }
}
