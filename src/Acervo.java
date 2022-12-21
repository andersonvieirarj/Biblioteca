import java.util.Scanner;
public class Acervo extends Livro{
    public int quantidade;
    public String editora;
    Scanner input = new Scanner (System.in);
    //Sobrescrita
    public void entradaDados(){
        super.entradaDados();
        System.out.println("Digite a quantidade de livros:");
        quantidade = input.nextInt();
        System.out.println("Informe a editora: ");
        editora = input.nextLine();
    }
    // SOBRESCRITA (OVERRIDE)
    // Sobrescrita é a sobreposição de métodos com assinatura
    // e nomes iguais, mas em classes diferentes, sendo
    // herdados da classe mãe.
    // A assinatura é idêntica ao método sobrescrito na classe
    // mãe
    public void imprimeDados(){
        super.imprimeDados();
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Editora: " + editora);
    }
}
