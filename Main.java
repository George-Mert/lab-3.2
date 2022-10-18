import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int nrClienti = getNrClienti();
        printNumarClienti(nrClienti);
        printChenar();
    }

    private static void printNumarClienti(int nrClienti) {
        int pret = 35;
        int pretTotal = pret * nrClienti;
        System.out.println("pretul total este:" + pretTotal);
        if (nrClienti > 50) {
            System.out.println("Evenimentul este mare!");
        }
    }

    private static void printChenar() {
        System.out.println(
                "***********************************************\n" +
                        "*Carly’s makes the food that makes it a party.*\n" +
                        "***********************************************\n");
    }

    private static int getNrClienti() {
        Scanner sc = new Scanner(System.in);
        System.out.print("introduceti numarul de clienti");
        int nrClienti = sc.nextInt();
        return nrClienti;
    }
}