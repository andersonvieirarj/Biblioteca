// CLASSE ABSTRATA: uma classe do Java que não pode
// ser instanciada, ou seja, não é possível gerar
// objetos dela. A idéia é que sejam gerados apenas
// objetos das classes-filhas

import java.util.Scanner;
public abstract class Livro {
    public String nome;
    public String autor;
    Scanner input = new Scanner (System.in);
    public void entradaDados(){
        System.out.println("Informe o nome do livro:");
        nome = input.nextLine();
        System.out.println("Informe o autor do livro:");
        autor = input.nextLine();
    }
    public void imprimeDados(){
        System.out.println("Livro: " + nome);
        System.out.println("Autor: " + autor);
    }
}
