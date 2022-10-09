import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.print("Informe a temperatura em Fahrenheit : ");
        Scanner sc = new Scanner(System.in);
        double tempF = sc.nextDouble();
        double tempC = 5* ((tempF-32)/9);
        sc.close();
        System.out.println();
        System.out.println("A temperatura em graus Celsius é : " + tempC + "°C");
    }
}
