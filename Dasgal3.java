import java.util.Scanner;

public class Dasgal3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("a коэффициент оруулна уу: ");
        double a = scanner.nextDouble();
        
        System.out.print("b коэффициент оруулна уу: ");
        double b = scanner.nextDouble();
        
        System.out.print("c коэффициент оруулна уу: ");
        double c = scanner.nextDouble();
        
        double discriminant = b * b - 4 * a * c;
        
        if (discriminant > 0) {
            double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Хоёр бодит шийд: x1 = " + x1 + ", x2 = " + x2);
        } else if (discriminant == 0) {
            double x = -b / (2 * a);
            System.out.println("Нэг бодит шийд: x = " + x);
        } else {
            System.out.println("Ямар ч бодит шийд байхгүй");
        }
        
        scanner.close();
    }
}