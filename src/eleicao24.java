import java.util.Scanner;

public class eleicao24 {
    public static void main(String[] args) {
        int taffe = 99;
        int rodrigo = 88;
        int lucas = 77;
        int alessandro = 66;

        int votoTaffe = 0;
        int votoRodrigo = 0;
        int votoLucas = 0;
        int votoAlessandro = 0;

        Scanner scanner = new Scanner(System.in);

        int eleitor = 0;
            
        System.out.println("Insira quantos eleitores irão votar: ");
        eleitor = scanner.nextInt();

        System.out.println("Os candidatos disponiveis são: ");

        System.out.println("Taffe: " + taffe);
        System.out.println("Rodrigo " + rodrigo);
        System.out.println("Lucas " + lucas);
        System.out.println("Alessandro " + alessandro);

        for(int i = 1; i <= eleitor; i++){
            int voto = 0;
            System.out.println("Em qual canditado o eleitor nº " + i + " votou?");
            voto = scanner.nextInt();

            if(99 == voto){
                votoTaffe ++;
            }else if(88 == voto){
                votoRodrigo ++;
            }else if(77 == voto){
                votoLucas ++;
            }else if(66 == voto){
                votoAlessandro ++;
            }else{
                System.out.println("Insira um número valido!!");
                i --;
            }
        }
            System.out.println("Taffe obteve: " + votoTaffe + " votos");
            System.out.println("Rodrigo obteve " + votoRodrigo + " votos");
            System.out.println("Lucas obteve " + votoLucas + " votos");
            System.out.println("Alessandro obteve " + votoAlessandro + " votos");

            if(votoTaffe > votoAlessandro && votoTaffe > votoLucas && votoTaffe > votoRodrigo){
                System.out.println("Taffe venceu!");
            }else if(votoAlessandro > votoTaffe && votoAlessandro > votoLucas && votoAlessandro > votoRodrigo){
                System.out.println("Alessandro venceu!");
            }else if(votoLucas > votoAlessandro && votoLucas > votoTaffe && votoLucas > votoRodrigo){
                System.out.println("Lucas venceu!");
            }else if(votoRodrigo > votoAlessandro && votoRodrigo > votoLucas && votoRodrigo > votoTaffe){
                System.out.println("Rodrigo venceu!");
            }
        




    }
}

