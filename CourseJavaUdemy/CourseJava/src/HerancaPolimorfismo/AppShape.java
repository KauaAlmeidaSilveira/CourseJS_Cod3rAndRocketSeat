package HerancaPolimorfismo;

import Model.Entities.Circle;
import Model.Entities.Rectangle;
import Model.Entities.Shape;
import Model.Enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppShape {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Shape> shapes = new ArrayList<>();

        System.out.print("Enter the number of shapes: ");
        int numOfShapes = sc.nextInt();

        for(int i=0; i<numOfShapes; i++){
            System.out.printf("Shape #%d data: %n", (i+1));
            System.out.print("Rectangle or Circle (r/c)? ");
            char rC = sc.next().charAt(0);
            System.out.print("Color (BLACK/BLUE/RED): ");
            Color bBR = Color.valueOf(sc.next());
            if(rC == 'r'){
                System.out.print("Width: ");
                double width = sc.nextDouble();
                System.out.print("Height: ");
                double height = sc.nextDouble();

                shapes.add(new Rectangle(bBR, width, height));
            }else {
                System.out.print("Radius: ");
                double radius = sc.nextDouble();

                shapes.add(new Circle(bBR, radius));
            }
        }

        System.out.println("Shape areas: ");

        shapes.forEach( shape -> System.out.printf("%.2f", shape.area()) );

        sc.close();
    }
}
