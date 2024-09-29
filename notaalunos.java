import java.util.Scanner;

public class notaalunos {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        
    
    int[] matriculas = new int[100];
    double[] notas = new double[100];

        for (int i = 0; i < 100; i++) {
            System.out.print("Digite a matrícula do aluno " + (i + 1) + ": ");
            matriculas[i] = entry.nextInt();
            System.out.print("Digite a nota do aluno " + (i + 1) + ": ");
            notas[i] = entry.nextDouble();
        }
     double maiorNota1 = Double.NEGATIVE_INFINITY;
     double maiorNota2 = Double.NEGATIVE_INFINITY;
     int matriculaMaior1 = -1;
     int matriculaMaior2 = -1;

        for (int i = 0; i < 100; i++) {
            if (notas[i] > maiorNota1) {
                maiorNota2 = maiorNota1;
                matriculaMaior2 = matriculaMaior1;
                maiorNota1 = notas[i];
                matriculaMaior1 = matriculas[i];
            } else if (notas[i] > maiorNota2) {
                maiorNota2 = notas[i];
                matriculaMaior2 = matriculas[i];
}
}
        System.out.println("A maior nota foi: " + maiorNota1 + " (Matrícula: " + matriculaMaior1 + ")");
        System.out.println("A segunda maior nota foi: " + maiorNota2 + " (Matrícula: " + matriculaMaior2 + ")");
}
}
