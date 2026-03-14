package edu.java.curso.sintaxe.anatomiaDasClasses;

public class Aula3DeclaracaoMetodos {
    // Identação:
    // Identar é p termo utilizado para escrever o código do programa  de forma  hierárquica, 
    // facilitando assim a visualização e o entendimento do programa.
    //Exemplos:
    public static void main(String[] args) {
        int medialFinal = 6;
        if(medialFinal<6)
        System.out.print("Reprovado");
        else if(medialFinal==6)
        System.out.println("Prova Minerva");
        else
        System.out.println("Aprovado");        
    }
    
    //Exemplo com identação:

    public static void  boletimEstudantil(String[] args) {
        int medialFinal = 6;
        if(medialFinal<6)
            System.out.print("Reprovado");
        else if(medialFinal==6)
            System.out.println("Prova Minerva");
        else
            System.out.println("Aprovado"); 
            
        }
    }



