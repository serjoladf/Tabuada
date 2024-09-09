public class Tabuada {

    public static void somar(int number){
        for( int i = 1;i <=10 ; i++) { // for para impressão da tabuada somar
            System.out.printf("%d + %d = %d \n",i, number, i + number);
        }
    }
    public static void Subtrair(int number){
        // Essa tabuada a inicilização dela é diferente pq a tabuada de subtrair ela começa do (numero + 1 - o numero)
        // tabuada de 5 começa de (5 - 4 = 1) e é Acrescentada de 1 em 1
        for( int i = number +1 ;i<= number+10; i++) { // for para impressão da tabuada subtrair
            System.out.printf("%d - %d = %d \n",i, number, i - number);
        }
    }
    public static void multiplicar(int number){ // for para impressão da tabuada Multiplicar
        for( int i = 1;i<=10; i++) {
            System.out.printf("%d x %d = %d \n",i, number, i * number);
        }
    }
    public static void dividir(int number){
        // A tabuada de Dividir também tem uma inicilização diferente pq a tabuada de dividir ela começa do (numero / numero )
        // tabuada de dividir 5 começa de (5 / 5 = 1) e o dividendo é Acrescentada com o mesmo numero a cada interação
        for( int i = number ;i<=10*number;  i += number) {
            System.out.printf("%d / %d = %d \n",i, number,i / number);
        }
    }
}

