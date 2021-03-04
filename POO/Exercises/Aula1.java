import java.utils.Scanner;
import java.date.LocalDate;

public class Aula1 
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LocalDate date = LocalDate.now();
        int currentYear = date.getYear();

        System.out.print("Enter your birth year => ");
        int userBirthYear = input.nextInt();
        int userAge = currentYear - userBirthYear;

        System.out.prinln("Ignoring the months you are "+userAge+" years old");
    }
}