import java.util.List;
import java.util.ArrayList;

class Inventory{
    public static void main(String[]args){
        System.out.println("Vince STORE");
        List<Item> INV = new ArrayList();
        float total = 0.0f;

        Item t1 = new Item("Penshoppe", "Dress",500.00f);

        Item t2 = new Item("H&M", "Dress", 2500.00f);

        Item t3 = new Item("Bench", "Dress", 500.00f);

        Item t4 = new Item("Regatta", "Dress", 600.00f);

        Item t5 = new Item("Forever21", "Dress", 1000.00f);

        Item t6 = new Item("Wrangler", "Dress", 1200.00f);

        Item t7 = new Item("Bum", "Dress", 600.00f);

        Item t8 = new Item("Oxygen", "Dress", 500.00f);

        Item t9 = new Item("Human", "Dress", 500.00f);

        Item t10 = new Item("Cotton On", "Dress", 2000.00f);

        INV.add(t1);
        INV.add(t2);
        INV.add(t3);
        INV.add(t4);
        INV.add(t5);
        INV.add(t6);
        INV.add(t7);
        INV.add(t8);
        INV.add(t9);
        INV.add(t10);
        for(Item d: INV){
            if(d.Getname()=="H&M"){
                System.out.println("Found!");
            }else{
                System.out.println("Not this");
            }
            total = total + d.Getprice();
        }
        System.out.println(total);
    }
}