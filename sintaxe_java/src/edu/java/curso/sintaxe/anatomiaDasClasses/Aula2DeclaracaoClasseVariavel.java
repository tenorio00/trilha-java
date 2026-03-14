package edu.java.curso.sintaxe.anatomiaDasClasses;

public class Aula2 {

    // Declarar uma variável segue as seguintes estruturas:
    // Tipo n omeBemDefinido = Atribuição(opcional em alguns casos).
    // Exemplos:
    // int idade = 23;
    // double altura = 1.80;
    // boolean verdadeira = true;
    // Dog spike; Observe que está variável não tem valor

    // Declarando metodos:
    // TipoRetorno NomeObjetoNoInifinitivo Parametro(s)
    // Exemplo:
    // int Somar(int numeroUm, int numeroDois)
    // String formatarCep (long cep)

    public static void main(String[] args) {
        String primeiroNome = "Washington";
        String segundoNome = "Tenório";

        String nomeCompleto = nomeCompeto(primeiroNome, segundoNome); 

        System.out.println(nomeCompleto);
    }

    public static String nomeCompeto(String primeiroNome, String segundoNome) {

        return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
        
    }


    }

    

