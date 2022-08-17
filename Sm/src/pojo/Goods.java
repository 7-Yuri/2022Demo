package pojo;

public class Goods {

    private int id;         //商品编号
    private String name;    //商品名称
    private double price;   //商品价格
    private int count;      //商品数量
    private double money;   //商品金额

    public Goods(){}
    public Goods(int id,String name,double price,int count){

        this.id=id;
        this.name=name;
        this.price=price;
        this.count=count;
//        this.money=money;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
