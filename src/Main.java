import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*float a = 0.0f;
        double b = 0.0;
        Scanner scanner = new Scanner( (System.in)).useLocale(Locale.US);
        double input3 = scanner.nextDouble();
        System.out.println(input3);*/
        /*Scanner scanner = new Scanner( (System.in)).useLocale(Locale.US);
        double c = scanner.nextDouble();
        double f = 0.0;
        f = c * 1.8 + 32;
        System.out.println(f);*/
        Scanner scanner = new Scanner( (System.in)).useLocale(Locale.US);
        double x = scanner.nextDouble();
        double result = Math.pow(x , 3) + Math.pow(x , 2) +  x + 1;
        System.out.println(result);
    }
}