public class RepeticaoForArrays {
    public static void main(String[] args) {
        
        String alunos[] = {"Carlos", "Jean", "Luana", "Marta", "Mijardina"};

        for(int i = 0; i<alunos.length; i++){
            System.out.println("O aluno no indice i =  " + i + " é " + alunos[i]);//nesse formato é necesário incluir o índice na variável
        }
        System.out.println("\nModo mais apropriado para Arrays:\n");

        for(String aluno:alunos){// Modo simplificado do laço "for" para Arrays(Pilhas)
            System.out.println("O nome do aluno é: " + aluno);
        }
    }
}