import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    MyRectangle[] rectangles = new MyRectangle[5];

        for (int i = 0; i < rectangles.length; i++) {
            rectangles[i] = new MyRectangle(i+1,i+2);
        }

        for (MyRectangle rectangle:rectangles
             ) {
            System.out.println(rectangle.calulateArea());
        }
        System.out.println("Suma ariilor dreptunghiurilor este: " + MyRectangle.sum(rectangles));

        Scanner scn = new Scanner(System.in);
        System.out.print("Introduceti numarul de dreptunghiuri pe care vreti sa il creati: ");
        int numberOfRectangles = scn.nextInt();
        int sumOfAreas = 0;

        MyRectangle[] rectangles1 = new MyRectangle[numberOfRectangles];
        for (int i = 0; i < rectangles1.length; i++) {
            rectangles1[i]=new MyRectangle((int)(Math.random() * (100+1)),(int)(Math.random() * 100)+1);
        }
        for (MyRectangle rectangle:rectangles1
             ) {
            if (rectangle.getHeigth()>rectangle.getLength()){
                sumOfAreas+=rectangle.calulateArea();
            }
        }
        System.out.println("Suma ariilor dreptunghiurilor care au inltimea mai mare ca lungimea este egala cu: " + sumOfAreas);
        System.out.print("Introduceti inaltimea: ");
        int heigth = scn.nextInt();
        System.out.print("Introduceti luncgimea: ");
        int length = scn.nextInt();

        MyRectangle rectangle1 = new MyRectangle(heigth,length);
        System.out.println("Aria dreptunghiului dumneavoastra este: " + rectangle1.calulateArea());

System.out.println("Aria dreptunghiului dumneavoastra este: " + rectangle1.calulateArea());
System.out.println("Aria dreptunghiului dumneavoastra este: " + rectangle1.calulateArea());
System.out.println("Aria dreptunghiului dumneavoastra este: " + rectangle1.calulateArea());

    }
}
