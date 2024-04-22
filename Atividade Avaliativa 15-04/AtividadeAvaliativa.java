import java.util.Scanner;
import java.util.ArrayList;

public class AtividadeAvaliativa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> listaDeNomes = new ArrayList<String>();
        ArrayList<Double> Media = new ArrayList<Double>();

        System.out.println("Insira o nome dos alunos");
        System.out.println("escreva (q) para parar de inserir os nomes");
        String nomes = scanner.nextLine();

        while (!nomes.equals("q")) {
            listaDeNomes.add(nomes);
            nomes = scanner.nextLine();
        }

        System.out.println("Agora insira as 5 notas desses alunos.");
        System.out.println("0 - 10");

        Double[] notas = new Double[5];

        for (int i = 0; i < listaDeNomes.size(); i++) {
            System.out.println("Insira as notas do " + (i + 1) + "º aluno:");

            Double Maior = Double.MIN_VALUE;
            Double Menor = Double.MAX_VALUE;
            double soma = 0;

            for (int j = 0; j < 5; j++) {
                notas[j] = scanner.nextDouble();
                soma += notas[j];
                if (notas[j] > Maior) {
                    Maior = notas[j];
                }
                if (notas[j] < Menor) {
                    Menor = notas[j];
                }
            }

            double media = soma / 5;
            Media.add(media);

            if (media <= 4) {
                System.out.println("Aluno reprovado");
            } else if (media > 4 && media <= 6) {
                System.out.println("Aluno em recuperação");
            } else if (media > 6) {
                System.out.println("Aluno Aprovado");
            }
            System.out.println("A Maior nota do aluno " + (i + 1) + " foi " + Maior + " e a menor nota foi " + Menor);
        }

        scanner.close();
    }
}