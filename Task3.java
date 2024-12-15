import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double temperature = scanner.nextDouble();
        boolean isHigh, isLow;
        isHigh = temperature > 38.0;
        isLow = temperature < 36.0;
        if (isHigh) {
            System.out.println("High temperature");
        } else if (isLow) {
            System.out.println("Low temperature");
        } else {
            System.out.println("Normal temperature");
        }
    }
}
