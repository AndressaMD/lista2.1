import java.util.Scanner;

public class ntermos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
      System.out.print("Digite o valor de n: ");
        int n = scanner.nextInt();
        
        if (n <= 0) {
            System.out.println("O valor de n deve ser um número positivo.");
            return;
        }
        int[] termos = new int[n];
       int count = 1; 
       
           for (int i = 0; i < n; i++) {
           if (i % 3 == 0) {
                termos[i] = count; 
            } else {
                termos[i] = count + 3; 
            }
            if (i % 3 == 2) { count++;
}
}
       System.out.println("Os primeiros " + n + " termos da série são:");
        for (int i = 0; i < n; i++) {
            System.out.print(termos[i] + " ");
}}}
