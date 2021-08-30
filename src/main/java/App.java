import entities.Diem;
import entities.TamGiac;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("x,y =  ");
//        String str = sc.nextLine();
//        Diem d1 = Diem.parseFromString("3,5");
//        System.out.println(d1);

        Diem d2 = new Diem();
        System.out.println(d2);

        Diem d3 = new Diem(4,6);
        System.out.println(d3);

        Diem d4 = Diem.generate();
        System.out.println(d4);
        System.out.println(d4.detecQuadrant());

        System.out.println("------------------------------");

        double n = d2.distance(d3);
        System.out.println(n);

        System.out.println(d3.findCentralSymmetry());
        System.out.println(d3.findXAxisSymmetry());
        System.out.println(d3.findYAxisSymmetry());

        System.out.println("------------------------------");

        TamGiac tg1 = new TamGiac();
        System.out.println(tg1);

        System.out.format("p = %.2f\n", tg1.calculateArea());
        System.out.format("S = %.2f\n", tg1.calculatePerimeter());


    }
}
