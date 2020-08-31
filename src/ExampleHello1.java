import java.util.Scanner;
public class ExampleHello1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.print("Skriv ditt namn : ");
        String inputNamn=scan.nextLine();

        System.out.print(inputNamn);
    }

}
