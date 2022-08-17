package utils;

import pojo.Goods;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Shop {

    Goods goods;
    Scanner input=new Scanner(System.in);

    List<Goods> goodsList=new ArrayList<Goods>();

    //初始化商店
    public void init(){
        goodsList.add(goods=new Goods(1,"苹果",13.3,100));
        goodsList.add(goods=new Goods(2,"荔枝",20.0,100));
        goodsList.add(goods=new Goods(3,"香蕉",15.5,100));
        goodsList.add(goods=new Goods(4,"芒果",16.6,100));
        goodsList.add(goods=new Goods(5,"橙子",8.8,100));
    }

    /**
     * 1.货物清单
     */
    public boolean select(){
        System.out.println("= = = = = = = 商品货物清单 = = = = = = =" +
                "\n商品编号\t\t商品名称\t\t商品价格");
        for(Goods goods:goodsList){
            System.out.println(goods.getId()+"\t\t\t"+goods.getName()+"\t\t\t"+goods.getPrice());
        }

        boolean flag=nextStep();
        return flag;
    }

    /**
     * 2.添加新货物
     */
    public boolean insert(){
        System.out.println("= = = = = = = 增加货物 = = = = = = =" );
        Goods goods=new Goods();
        System.out.println("输入商品编号:");
        goods.setId(input.nextInt());
        System.out.println("输入商品名称:");
        goods.setName(input.next());
        System.out.println("输入商品价格");
        goods.setPrice(input.nextDouble());
        System.out.println("输入商品数量");
        goods.setCount(input.nextInt());

        goodsList.add(goods);
        System.out.println("\n添加完成!\n");

        boolean flag=nextStep();
        return flag;
    }

    /**
     * 3.删除货物
     */
    public boolean del(){
        System.out.println("= = = = = = = 删除货物 = = = = = = =" );
        System.out.println("输入删除商品的编号:");
        int id=input.nextInt();

        goodsList.remove(id-1);
        System.out.println("\n删除成功!\n");

        boolean flag=nextStep();
        return flag;
    }

    /**
     * 4.修改货物
     */
    public boolean update(){
        System.out.println("= = = = = = = 修改货物 = = = = = = =" );
        System.out.println("输入修改商品的编号:");
        int id1=input.nextInt();
        System.out.println("请输入该商品的新编号:");
        int id2=input.nextInt();
        System.out.println("输入商品名称:");
        String newName=input.next();
        System.out.println("输入商品价格");
        double newPrice=input.nextDouble();

        goodsList.get(id1-1).setId(id2);
        goodsList.get(id1-1).setName(newName);
        goodsList.get(id1-1).setPrice(newPrice);
        System.out.println("\n商品更新完成!\n");

        boolean flag=nextStep();
        return flag;
    }

    /**
     * 5.退出系统
     */
    public boolean exit(){
        System.out.println("您已退出系统,感谢使用!");
        return false;
    }

    /**
     * default
     */
    public boolean hint(){
        System.out.println("\n请输入正确的选项!\n");
        return true;
    }

    //是否继续
    public boolean nextStep(){
        boolean flag=false;

        System.out.println("是否继续使用系统(y/n):");
        String nextStep=input.next();
        if(nextStep.equals("y")){
            flag=true;
        }else if(nextStep.equals("n")) {
            flag=exit();
        }else {
            nextStep();
        }

        return flag;
    }

}
