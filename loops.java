import java.util.Scanner;

public class loops {


    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {



        boolean keepAlive = true;

        while (keepAlive) {
            System.out.println(" skriv in ett tal:");
            int tal = Integer.parseInt(scanner.nextLine());
            System.out.println("du skriver in talet " + tal);
            System.out.println("vill du försätta ? (y/n)");
            String ansswer = scanner.nextLine();
            switch (ansswer) {
                case "n":
                    keepAlive = false;
                    break;
                case "N":
                    keepAlive = false;
                    break;
                default:
                    System.out.println(" okej vid forsätter");
            }
        }
    }
}
