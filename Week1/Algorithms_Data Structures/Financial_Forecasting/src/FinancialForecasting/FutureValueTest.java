package FinancialForecasting;
import java.util.Scanner;

public class FutureValueTest {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter present value: ");
        double principal = sc.nextDouble();

        System.out.print("Enter annual growth rate: ");
        double rate = sc.nextDouble();

        System.out.print("Enter number of years: ");
        int years = sc.nextInt();
        
        double fv = FutureValuePredictor.futureValue(principal, rate, years);
        System.out.println("Future Value after " + years + " years: " + fv);
    }
}
