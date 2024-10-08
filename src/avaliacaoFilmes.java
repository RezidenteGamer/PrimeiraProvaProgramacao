import java.util.Scanner;

public class avaliacaoFilmes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantidade = 0;
        System.out.println("Quantos filmes você deseja avaliar?");
        quantidade = scanner.nextInt();
        int acum = 0;

        quantidade ++;

        int[] nota = new int[quantidade];
        String[] filme = new String[quantidade];
        scanner.nextLine();
        for(int i = 1; i < quantidade; i++){
            System.out.println("Diga o nome do filme " + i + ": ");
            filme[i] = scanner.nextLine();

            if(filme == null){
                System.out.println("Insira alguma coisa!!!");
            }
        }

        for (int i = 1; i < quantidade; i++) {
            System.out.println("Diga a nota do filme " + filme[i] + ": ");
            nota[i] = scanner.nextInt();
            acum = acum + nota[i];    
            if(nota[i] > 10 || nota[i] < 0){
                System.out.println("Insira uma nota valida!");
                i = i-1;
            }        
        }
        scanner.nextLine();

        for(int i=1; i < quantidade; i++){
            System.out.println("O filme " + filme[i] + " obteve nota " + nota[i]);
        
        if(nota[i] >= 6){
            System.out.println("O filme é bom");
        }else{
            System.out.println("O filme é ruim :[ ");
        }

    }
    System.out.println("A média de notas foi de: " + acum/quantidade);
    }
    }
