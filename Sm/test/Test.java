import utils.Shop;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        Shop shop=new Shop();
        boolean flag=false;

        //初始化超市
        shop.init();

        do{

            System.out.println("= = = = = = = = = = = 欢迎光临新华超市 = = = = = = = = = = =");
            System.out.println("1.货物清单" +
                    "\n2.添加新货物" +
                    "\n3.删除货物" +
                    "\n4.修改货物" +
                    "\n5.退出系统" +
                    "\n请输入要操作的功能序号(1~5):");
            int sum=input.nextInt();

            switch (sum){
                case 1:
                    flag=shop.select();
                    break;
                case 2:
                    flag=shop.insert();
                    break;
                case 3:
                    flag=shop.del();
                    break;
                case 4:
                    flag=shop.update();
                    break;
                case 5:
                    flag=shop.exit();
                    break;
                default:
                    flag=shop.hint();
                    break;
            }

        }while (flag);

    }
}
