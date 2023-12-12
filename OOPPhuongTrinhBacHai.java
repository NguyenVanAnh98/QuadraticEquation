package QuadraticEquation;

import java.util.Scanner;

public class OOPPhuongTrinhBacHai {

    public static void main(String[] args) {
        double a, b, c;
        System.out.println("Enter a,b,c: ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        QuadraticEquation qe = new QuadraticEquation(a, b, c);
        if (qe.getDiscriminant() < 0) System.out.println("Phương trình không có nghiệm");
        else if (qe.getDiscriminant() == 0) System.out.println("Phương trình có một nghiệm: " + qe.getRoot1());
        else {
            System.out.println("Phương trình có hai nghiệm: ");
            System.out.println("Denta is: " + qe.getDiscriminant());
            System.out.println("Root1 is: " + qe.getRoot1());
            System.out.println("Root2 is: " + qe.getRoot2());
        }
    }

}
