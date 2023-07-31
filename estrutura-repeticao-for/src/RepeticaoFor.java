import java.util.Scanner;

public class RepeticaoFor {
    public static void main(String[] args) throws Exception {
        try(Scanner leia = new Scanner(System.in)){;
            int passos;
            System.out.printf("Olá, sou obsessivo compulsivo, adivinha quantos passos eu dei hoje? "); // Não resisto... kkkk
            passos = leia.nextInt();

            for(int i = 1; i<=passos; i++){
                if (i == 1)
                System.out.println( i + " Passo");
                else
                System.out.println( i + " Passos");
            }
        }
    }
}
