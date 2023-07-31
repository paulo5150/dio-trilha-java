import java.util.Scanner;

public class CondicionalIf{

    public static void main(String[] args) throws Exception {

        try (Scanner ler = new Scanner(System.in)){;

            int idade ;

            System.out.printf("Digite a sua idade: ");
            idade = ler.nextInt();

            if(idade >= 18) System.out.println("Acesso Permitido");   
        }
    }
}
