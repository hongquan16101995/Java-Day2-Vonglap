package Demo;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập mật khẩu: ");
        String password = sc.nextLine();
        while (!password.equals("vung oi mo ra")) {
            System.out.println("Không đúng! Mời bạn nhập lại mật khẩu: ");
            password = sc.nextLine();
        }
    }
}
