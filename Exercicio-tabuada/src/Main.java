// O exercício deve permitir que o usuário possa escolher o tipo de tabuada que deseja visualizar.
// Deve ser possível calcular e visualizar N vezes

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Utilização do scanner para entrada de dados
        int operacao; // Variavel para a switch(case)
        String operacao2; // Variavel para operação sequencial apos a primeira operação
        int number; // Variavel para calcular

        do { // entrei com esse Whihle pela preferência de não testar o sistema antes de entrar
            System.out.println("Digite o numero para o tipo de Operação;"); // Entrada da Operação desejada
            System.out.println("1 - Somar | 2 - Subtrair | 3 - Multiplicar | 4 - Dividir | 5 ou 0 - Sair");
            operacao = sc.nextInt(); // leitor de Operação desejada

            if (operacao == 5) { // Um break com uma condicional para sair
                System.out.println("Sair da operação"); // Mensagem na condicional para sair do loop
                break; // sai do loop
            }
            if (operacao > 5 || operacao <= 0) {
                continue; // Uma condião para se o numero for fora do padrão ele retorna ao inicio
            }
            System.out.println("Digite o numero para a Calcular;");
            number = sc.nextInt(); // Leitura e declaração da variável numero a ser calculado
            sc.nextLine();// para consumir a quebra de linha restante,

            switch (operacao) { // Entrada de Switch case
                case 1:
                    System.out.println("Tabuada de Somar");
                    Tabuada.somar(number); // chamando o metodo somar
                    break;
                case 2:
                    System.out.println("Tapuada de Subtração");
                    Tabuada.Subtrair(number); // chamando o metodo Subtrair
                    break;
                case 3:
                    System.out.println("Tabuada de Multiplicação");
                    Tabuada.multiplicar(number); // chamando o metodo multiplicar
                    break;
                case 4:
                    System.out.println("Tabuada de Divisão");
                    Tabuada.dividir(number); // chamando o metodo dividir
                    break;
            }
            System.out.println("Gostaria de Fazer mais uma operação?");
            System.out.println("Digite: 1 - p/ Não ou Qualquer outra Tecla para outra Operação;"); // Opção para mais operação
            operacao2 = sc.nextLine(); // // Leitura e declaração da variável para mais operação ou não
            if (operacao2.equals("1")) {
                System.out.println("Sair da operação"); // Mensagem na condicional para sair do loop
                break;  // sai do loop
            }

        } while (operacao != 0); // Mensagem na condicional que sai do loop

        sc.close(); // Ferchamento do Scanner
    }
}
// Classe Utilitária: É uma classe com métodos estáticos e geralmente tem um construtor privado para evitar instância.
// Não se crie instâncias de classes utilitárias. Use seus métodos estáticos diretamente.
// Construtores são usados para criar e inicializar instâncias de uma classe.
// Como a classe Tabuada não tem atributos de instância e não precisa de inicialização especial para uma instância,
// você não precisa de um construtor público.