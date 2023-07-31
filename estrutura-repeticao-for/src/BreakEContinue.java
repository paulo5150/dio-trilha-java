public class BreakEContinue {
    public static void main(String[] args) {
        System.out.println("Ilustração comando 'continue':");
        for(int i = 1; i<=5; i++){
    
            if(i==3)
                continue;//pulou a ação no índice "3"
            System.out.println("Índice " + i);
        }
        System.out.println();
        
        System.out.println("Ilustração comando 'break':");
        for(int i = 1; i<=5; i++){
    
            if(i==3)
                break;//interrompeu o laço de repetição
            System.out.println("Índice " + i);
        }
    }
}
