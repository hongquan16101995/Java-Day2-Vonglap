package Menu2;

import java.util.Scanner;

public class Menu2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Draw the rectangle");
        System.out.println("2. Draw the triangle bottom-left");
        System.out.println("3. Draw the triangle top-left");
        System.out.println("4. Draw the triangle bottom-right");
        System.out.println("5. Draw the triangle top-right");
        System.out.println("6. Draw the isosceles triangle");
        System.out.println("0. Exit");

        while (true){
            System.out.println("Enter your choice: ");
            int choice = input.nextInt();
            switch (choice){
                case 1:
                    for (int i=0; i < 3; i++){
                        System.out.println();
                        for (int j=0; j < 5;j++){
                            System.out.print("* ");
                        }
                    }
                    System.out.println();
                    break;
                case 2:
                    for (int i=1; i <= 5; i++){
                        System.out.println();
                        for (int j=0; j < i;j++){
                            System.out.print("* ");
                        }
                    }
                    System.out.println();
                    break;
                case 3:
                    for (int i=5; i >= 0; i--){
                        System.out.println();
                        for (int j=0; j < i;j++){
                            System.out.print("* ");
                        }
                    }
                    System.out.println();
                    break;
                case 4:
                    for (int i=5,j=0; i >= 0 || j <= 5; i--,j++){
                        System.out.println();
                        for (int h=0; h < i; h++){
                            System.out.print(" ");
                        }
                        for (int k=0; k < j ; k++){
                            System.out.print("*");
                        }
                    }
                    System.out.println();
                    break;
                case 5:
                    for (int i=0,j=5; i <= 5 || j >= 0; i++,j--){
                        System.out.println();
                        for (int h=0; h < i; h++){
                            System.out.print(" ");
                        }
                        for (int k=0; k < j ; k++){
                            System.out.print("*");
                        }
                    }
                    System.out.println();
                    break;
                case 6:
                    for (int i=5,j=0; i >= 0 || j <= 5; i--,j++){
                        System.out.println();
                        for (int h=0; h < i; h++){
                            System.out.print(" ");
                        }
                        for (int k=0; k < j; k++){
                            System.out.print("* ");
                        }
                    }
                    System.out.println();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("No choice!");
            }
        }
    }
}
