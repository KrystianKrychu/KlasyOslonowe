package pl.akademia108;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        System.out.println("Wprowadz kurs USD: ");
        Scanner scan = new Scanner(System.in);

        Double kurs = Double.valueOf(scan.next());
        Double mnozonyKurs = 100 * kurs;

        System.out.println(kurs);
        System.out.println(mnozonyKurs);
    }
}
