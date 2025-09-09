import java.util.*;

public class PerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double l = sc.nextDouble(), w = sc.nextDouble();
        double perimeter = 2 * (l + w);
        System.out.println("Perimeter: " + perimeter);
        sc.close();
    }
}

