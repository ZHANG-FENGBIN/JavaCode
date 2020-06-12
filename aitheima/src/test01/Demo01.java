package test01;

import java.util.Random;
import java.util.Scanner;

/**
 * @author 张枫彬
 * @time 2020/4/23.
 */
public class Demo01 {
    public static void main(String[] args) {






    }

    private static void name06() {
        //数组
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int[] arr1 = new int[]{4, 5, 6, 7, 8, 9, 42};
        int[] arr2 = new int[10];
        //最大值
        int min = arr1[0];
        int max = arr1[0];
        for (int i = 1; i < arr1.length; i++) {
            if (min > arr1[i]) {
                min = arr1[i];
            }
            if (max < arr1[i]) {
                max = arr1[i];
            }
        }
        System.out.println("max="+max);
        System.out.println("min="+min);
        System.out.println("changdu" + arr1.length);
    }

    private static void name05() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int r = random.nextInt(100) + 1;
        System.out.println(r);
        while (true) {
            System.out.println("请输入一个数");
            int sc = scanner.nextInt();
            if (r < sc) {
                System.out.println("大");
            }
            if (r > sc) {
                System.out.println("小");
            }
            if (sc == r) {
                System.out.println("恭喜你！");
                break;
            }
        }
    }

    private static void name04() {
        //珠穆朗玛峰高度
        int sun = 0;
        int sun1 = 8844430;
        double sun2 = 0.1;
        while (sun2 <= sun1) {
            sun2 = sun2 * 2;
            sun++;
        }
        System.out.println(sun);
    }

    private static void name03() {
        for (int i = 99; i <= 999; i++) {
            int a = i % 10;
            int b = i / 10 % 10;
            int c = i / 100 % 10;
            if (a * a * a + b * b * b + c * c * c == i) {
                System.out.println(i);
            }
        }
    }

    private static void name02() {
        int a = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                a += i;
            }
        }
        System.out.println(a);
    }

    private static void name01() {
        System.out.println("请输入一个星期数");
        Scanner scanner = new Scanner(System.in);
        int sc = scanner.nextInt();
        if (sc > 0 && sc <= 5) {
            if (sc == 1) {
                System.out.println("一");
            } else if (sc == 2) {
                System.out.println("二");
            } else if (sc == 3) {
                System.out.println("三");
            } else if (sc == 4) {
                System.out.println("四");
            } else {
                System.out.println("五");
            }
        } else {
            System.out.println("你输入有误，请重新输入！");
        }
    }
}
