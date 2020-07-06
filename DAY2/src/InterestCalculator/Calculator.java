package InterestCalculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int a,b;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào số thứ 1: ");
        a = input.nextInt();
        System.out.println("Nhập vào số thứ 2: ");
        b = input.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);

        if (a == 0 || b == 0){
            System.out.println("Không có ước chung lớn nhất!");
        } else {
            while (a != b){
                if (a > b){
                    a = a - b;
                }else{
                    b = b - a;
                }
            }
            System.out.println("Ước chung lớn nhất là :" + a);
        }
    }
}
