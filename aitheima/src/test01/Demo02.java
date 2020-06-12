package test01;

import java.util.Random;
import java.util.Scanner;

/**
 * @author 张枫彬
 * @time 2020/6/4.
 */
public class Demo02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int sun = random.nextInt(100) + 1;
        System.out.println("请输入一个1-100的数：");
        System.out.println(sun);
        while (true) {
            int sc = scanner.nextInt();
            if (sc >= 1 && sc <= 100) {
                if (sc > sun) {
                    System.out.println("猜大了");
                }
                if (sc < sun) {
                    System.out.println("猜小了");
                }
                if (sc == sun) {
                    System.out.println("恭喜你猜对了");
                    System.out.println("游戏结束感谢使用！");
                    return;
                }
            } else {
                System.out.println("你输入的数不合格请重新输入！");
            }
        }

    }

    private static void name04() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print(" @ ");
            }
            System.out.println();
        }
    }

    private static void name02(Scanner scanner) {
        int num = scanner.nextInt();
        int mid = 0;
        for (int i = 0; i <= num; i++) {
            if (i % 2 != 0) {

            }
            mid += i;
        }
        System.out.println(mid);
    }

    private static void name01(int num) {
        switch (num) {
            case 1:
                System.out.println("一");
                break;
            case 2:
                System.out.println("二");
                break;
            case 3:
                System.out.println("三");
                break;
            case 4:
                System.out.println("四");
            case 5:
                System.out.println("五");
            case 6:
                System.out.println("六");
                break;
            default:
                System.out.println("没有语句体");
        }
    }
}
