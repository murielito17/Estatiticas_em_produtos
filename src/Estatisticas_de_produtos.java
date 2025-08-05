import java.util.Scanner;

public class Estatisticas_de_produtos {
    public static void main(String[] args){

        String nomeProdu="",Continuar="S", menorp="";
        double SomaPreco=0, contal=0,precoProduto=0,menor = 0,contmil=0;
        Scanner sc = new Scanner(System.in);



        System.out.printf("%s%s%s",("-".repeat(5)),("Loja Do Murielito"),("-".repeat(5)));
        System.out.println("\nDigite as informações para a mostragem de estatisticas:");
        while (Continuar.equalsIgnoreCase("S")){
            System.out.print("\nNome do produto: ");
            nomeProdu = sc.nextLine();

            System.out.print("Preço do produto: ");
            precoProduto = sc.nextInt();
            sc.nextLine();

            SomaPreco+=precoProduto;
            contal++;
            if (contal==1){
                menor=precoProduto;
                menorp=nomeProdu;
            } else if (precoProduto<menor) {
                menor=precoProduto;
                menorp=nomeProdu;
            }
            if (precoProduto>=1000){
                contmil++;
            }

            System.out.print("\nDeseja continuar? [S/N]: ");
            Continuar= sc.nextLine();
        }
        System.out.printf("%s%s%s",("-".repeat(5)),("Fim do Programa"),("-".repeat(5)));
        System.out.printf("\n\nO total da compra foi de %.2f.%nTemos %.0f produtos custando mais que R$1000.00.%nO produto mais " +
                "barato foi %s que custa %.2f.",SomaPreco,contmil,menorp,menor);
        sc.close();
    }
}
