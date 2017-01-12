class Item{
    String name;
    String cname;
    float price;

    public void Setname(String a){
        name = a;
    }
    public void Setcname(String bc){
        cname = bc;
    }
    public void Setprice(float c){
        price = c;
    }
    public String Getname(){
        return name;
    }
    public String Getcname(){
        return cname;
    }
    public float Getprice(){
        return price;
    }
    public Item(String a, String bc, float c){
        name = a;
        cname = bc;
        price = c;
    }
}