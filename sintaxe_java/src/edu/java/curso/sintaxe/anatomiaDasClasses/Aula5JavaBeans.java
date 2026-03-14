/* 
Uma das maiores dificuldades na programação é escrever algoritmos legíveis 
a níveis de serem compreendidos por todo seu time ou por você mesmo no futuro. 
Para isso a linguagem java sugere, através de convenções, 
formas de escrita universal para nossas classes, atributos, métodos e pacotes.
Mais cedo aprendemos alguams regras de declaração de variaveís, 
mas agora iremos conhecer alguams sugestões de nomeclatura:
    
* Uma variável deve ser clara, sem abreviações ou definições sem sentido.
* Uma variável é sempre no singular, exceto quando se refere alguma array ou coleção.
* Defina um idioma único para suas variáveis. Se você for declarar variáveis em inglês.
   
Não recomendado:

double salMedio = 1500.23 => variável abreviada. correto: salarioMedio
String emails = "aluno@escola.com" => confuso pois corresponde a um valor. Correto: email
String myName = "JOSHEPH" => Se idioma pt-BR, sempre no mesmo idioma que foi adotado o projeto.

Metodos:

Os métodos deverão ser nomeados como verbos, 
através de uma mistura de letras minúsculas com maiúsculas.
Em princípio todas as letras deve ser mantidas em minúsculos, 
com exerção da primeira de cada palavra composta a partir da segunda palavra.
Exemplos:

somar(int n1, int n2){}
abrirConexao(){}
concluirProcessamentoDados(){}
findById(int id){} Não se assuste vocês verá muitos metodos inglês na sua jornada.
calcularImprimir(){} Algo de errado nesse método ele deveria ter uma única finalidade.



 */