import java.util.Scanner;

public class Bmi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("身長を入力してください(m)");
        double s = sc.nextDouble();
        System.out.println("体重を入力してください(kg)");
        double t = sc.nextDouble();
        double bmi = t / (s * s);
        System.out.println(String.format("%.2f",bmi));

        if(bmi < 18.5){
            System.out.println("低体重(痩せ型)");
        } else if (bmi < 25) {
            System.out.println("普通体重");
        } else if (bmi < 30) {
            System.out.println("肥満(1度)");
        } else if (bmi < 35) {
            System.out.println("肥満(2度)");
        } else if (bmi < 40) {
            System.out.println("肥満(3度)");
        } else {
            System.out.println("肥満(4度)");
        }
    	
        System.out.println("");
        System.out.println("身長を入力してください(m)");
        double s2 = sc.nextDouble();
        System.out.println("体重を入力してください(kg)");
        double t2 = sc.nextDouble();
        double bmi2 = t2 / (s2 * s2);
        System.out.println(String.format("%.2f",bmi2));

        if(bmi2 < 18.5){
            System.out.println("低体重(痩せ型)");
        } else if (bmi2 < 25) {
            System.out.println("普通体重");
        } else if (bmi2 < 30) {
            System.out.println("肥満(1度)");
        } else if (bmi2 < 35) {
            System.out.println("肥満(2度)");
        } else if (bmi2 < 40) {
            System.out.println("肥満(3度)");
        } else {
            System.out.println("肥満(4度)");
        }
    }
}
