import java.util.Scanner;

public class simulaAposentadoria {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
       
       System.out.print("Digite o sexo (1 - feminino, 2 - masculino): ");
        int sexo = entry.nextInt();
        System.out.print("Digite o tempo de contribuição em 2019 (anos): ");
        int tempoContribuicao = entry.nextInt();
        System.out.print("Digite a idade em 2019: ");
        int idade = entry.nextInt();

        int ano = 2019;
        int pontuacaoMinima;
        int pontuacaoObtida = idade + tempoContribuicao;
        
        if (sexo == 1) { 
            pontuacaoMinima = 86;
        } else {
            pontuacaoMinima = 96;
        }
        
        System.out.printf("%-10s %-20s %-20s%n", "Ano", "Pontuação Mínima", "Pontuação Obtida");
        while (pontuacaoObtida < pontuacaoMinima) {
           System.out.printf("%-10d %-20d %-20d%n", ano, pontuacaoMinima, pontuacaoObtida);
            ano++;
            pontuacaoMinima++;
            pontuacaoObtida += 2;
        }
        System.out.printf("%-10d %-20d %-20d%n", ano, pontuacaoMinima, pontuacaoObtida);
        System.out.println("A aposentadoria é possível no ano " + ano + ".");
}}
