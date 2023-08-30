import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Income");
        float tax = 0.0f;
        float income = sc.nextFloat();

        if(income < 2.5f){
            tax = 0.0f;
        }

        else if(income > 2.5f && income <= 5.0f){
            tax = tax + 0.05f * (income - 2.5f);
        }
        else if(income > 5.0f && income <=10.0f){
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (income - 5.0f);
        }
        else if(income > 10.0f){
            tax = tax + 0.05f * (5.0f - 2.5f);
    }

        System.out.println("Your tax for income "+ income+ "is "+ tax);
    }
}