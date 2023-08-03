import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        
        Scanner terminal = new Scanner(System.in);
    
        System.out.println("Digite o primeiro parâmetro: ");
        int parametroUm = terminal.nextInt();

        System.out.println("Digite o segundo parâmetro: ");
        int parametroDois = terminal.nextInt();

        terminal.close();

        try{
            contar(parametroUm, parametroDois);
        }
        catch (ParametrosInvalidosException exception){
            System.out.println("O parâmetro dois deve ser MAIOR que o parâmetro um");
        }
    }
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
        int contagem = parametroDois - parametroUm;
        if(contagem > 0){
            for (int indice = 0; indice < contagem; indice++){
            System.out.println("Imprimindo o número: " + (indice+1));
            }
        }
        else{
            throw new ParametrosInvalidosException();
        }
    }
}
