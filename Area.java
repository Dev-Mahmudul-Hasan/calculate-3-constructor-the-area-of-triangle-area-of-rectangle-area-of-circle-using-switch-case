
package com.mycompany.area;

import java.util.Scanner;

class Area {

    double x, y;
    double lab3, lab4;
    float lab2,m,n;

    Area(double a, double b) {
        lab3 = (a * b) / 2;
    }

    Area(double b) {
        x = b;
        lab4 = 3.1416 * (x * x);
    }
    Area(float a, float b) {
        m=a;
        n=b;
        lab2 = m*n;
    }
    

    public static void main(String[] args) {

        System.out.println("1.Area Of Triangle.\n2.Area Of Rectangle.\n3.Area Of Circle.");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your choice: ");
        int choice = input.nextInt();
        switch (choice) {

            case 1 -> {

                System.out.println("Enter Your Base value: ");
                double n = input.nextDouble();
                System.out.println("Enter Your Height value: ");
                double m = input.nextDouble();
                Area s1 = new Area(n, m);
                System.out.println("Area Of Triangle: "+s1.lab3);
            }
            case 2 ->
            {
                System.out.println("Enter Your Length value: ");
                float r = input.nextFloat();
                System.out.println("Enter Your Width value: ");
                float a= input.nextFloat();
                Area s2 = new Area(r,a);
                System.out.println("Area Of Rectangle: "+s2.lab2);
                
            }

            case 3 -> {
                System.out.println("Enter Your Radius value: ");
                double r = input.nextDouble();
                Area s2 = new Area(r);
                System.out.println("Area Of Circle: "+s2.lab4);
                

            }
            default -> System.out.println("Ente Your Right Key");

        }

    }
}
