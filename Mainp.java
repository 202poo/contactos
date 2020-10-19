import java.util.Scanner;

import poli.Figure;
import poli.Rectangle;
import poli.Triangle;

public class Mainp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Choice option: 1 or 2 ");
        int OPC = input.nextInt();
        input.nextLine(); // Limpiar el buffer

        Figure f = null;

        if (OPC == 1) {
            f = new Rectangle();
        } else if (OPC == 2) {
            f = new Triangle();
        } else {
            System.out.println("Choice 1 or 2 ");
            System.exit(0);
        }
        f.calculateArea();
    }
}
