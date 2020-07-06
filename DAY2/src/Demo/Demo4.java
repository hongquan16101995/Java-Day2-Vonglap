package Demo;

import java.util.Scanner;

public class Demo4 {
    public static void main(String[] args) {
//        Integer a = 1;
//        Integer b = 1;
//        Integer c = 127;
//        Integer d = 127;
//        System.out.println("a==b" + (a==b));
//        System.out.println("c==d" + (c==d));


        Scanner sc = new Scanner(System.in);
        int diem;
        System.out.println("nhap diem:");
        diem = sc.nextInt();
        System.out.println("diem:" + diem);

        String name = "";
        System.out.println("nhap ten:");
        sc.nextLine();
        name = sc.nextLine();
        System.out.println("ten:" + name);


//        String name = new String();
//        System.out.println("a:");
//        name = sc.next();
//        System.out.println("a:"+name);
//
//        String namej = new String();
//        System.out.println("b:");
//        namej = sc.nextLine();
//        System.out.println("b:"+namej);
    }
}
