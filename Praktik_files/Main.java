package Praktik_files;//import java.util.Scanner;
//
//public class Praktik_files.Main {
//    public static void main(String[] args) {
//        System.out.println("Hi world");
//        Scanner in = new Scanner(System.in);
//        String i = in.next();
//        byte b = 127;
//        short sh = 32767;
//        int ii;
//        long l;
//        float f;
//        // + - * / %
//        float d = 2/3f;
//        System.out.println(Math.pow(2,3));
//        System.out.println(i+" Ввод");
//    }
//}


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int a = in.nextInt();
//        int b = in.nextInt();
//        System.out.println(Math.abs(a%10) + (a/10)%10 + a/100);

//        int n = in.nextInt();
//        n = n + 2 - n%2;
//        System.out.println(n);


//4
//        int a = in.nextInt();
//        int b = in.nextInt();
//        int n = in.nextInt();
//        System.out.println((a*100 + n + b * n)/100 + " ");


//5
//        int h = in.nextInt();
//        int m = in.nextInt();
//        int s = in.nextInt();
//        int allt = in.nextInt();
//        System.out.println(h + ":" + m + ":" + s );


//6
//        int a = in.nextInt();
//        int b = in.nextInt();
//        System.out.println(Math.sqrt(Math.pow(a,2)+Math.pow(b,2)));


// all information
//        int a = 101;
//        int b = 111;
//        int p = a&b; // kon
//        int p1 = a | b; // dis
//        int p2 = ~a; // not
//        int p3 = a ^ b;
//        a = a ^ b;// 101 111
//        b = a ^ b;
//        a = a^b;//111 101
//        int p4 = a << 3;
//        int p5 = a >> 3;
//        System.out.println(a >>> 3);


//7
//        int n = in.nextInt();
//        System.out.println(Math.pow(2, n));

//8
//        int a = in.nextInt();
//        int i = in.nextInt();
//        System.out.println(a | 1 << i);


//        boolean tf = true;
//        String str2 = "home";
//        switch (str2){
//            case "home":
//                System.out.println("Hi");
////                break;
//            case "cold":
//                System.out.println("clear");
//                break;
//        }

//        boolean tf2 = true;
//        while(tf2){
//            System.out.println("YES");

//        do{//Нужен для выполнения начального действия и последующего цикла
//        }while(true);

//        for(int j=0; j > -10; j-=2){//Инициализация, условие, шаг
//
//        }

        //Массивы
//        String[] str3 = {"str", "fdf"};//строковой массив
//        int[];//int массив
//        double[];//double массив


//        double[] a = new double[100];
//        for(double kk:a){
//            k = 0;
//        }
//        Arrays.fill(a, 0);
//        ArrayList<Integer> arrayList = new ArrayList<>();
//        arrayList.add(1);


//Практика 2 - №1
//        int a = in.nextInt();
//        if(a < 10 && a >= 0){
//            System.out.println("DIGIT");
//        }
//        if(a >= 10 && a < 100) {
//            System.out.println("NUM");
//        }
//        if(a >= 100 && a < 1000){
//            System.out.println("OTHER");
//        }

//        int a = in.nextInt();
//        int b = in.nextInt();
//        int c = in.nextInt();
//        if (a > b){
//            b = a;
//        }
//        if (b > c){
//            c = b;
//
//        }
//        elseif (a > c){
//            c = a;
//        }
//        System.out.print(a + " ");
//        System.out.print(b + " ");
//        System.out.print(c + " ");


//        int a = 0;
//        int sum = 1;
//        while(a >= 0){
//            a = in.nextInt();
//            sum++;
//        }
//        System.out.println(sum);


        //Делить без использования /
//        int a = in.nextInt();//большее
//        int b = in.nextInt();//делимое
//        int sum = 0;
//        while (a > b || a != 0) {
//            a -= b;
//            sum++;
//        }
//        System.out.println(sum);
//        System.out.println(a);

        int[] mas = {};
        int schet = 5;
        int k = 0;
        while(schet >= 0){
            int x = in.nextInt();
            mas.push(x);
            schet -= 1;
        }
        while (k != mas.length){
            System.out.println(mas[k]);
            k += 1;
        }
    }
}