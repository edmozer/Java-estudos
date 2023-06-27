package teste_tio_mick;

public class MaiorNumero {
    public static int maior(int a, int b, int c) {
        int maior = a;

        if (b > maior) {
            maior = b;
        }

        if (c > maior) {
            maior = c;
        }

        return maior;
    }

    public static void main(String[] args) {
        int teste;

        teste = maior(10, 20, 30);
        System.out.println("O maior é " + teste + " -> " + ( teste == 30) );

        teste = maior(50, 20, 30);
        System.out.println("O maior é " + teste + " -> " + ( teste == 50) );

        teste = maior(10, 90, 30);
        System.out.println("O maior é " + teste + " -> " + ( teste == 90) );

        teste = maior(15, 45, 25);
        System.out.println("O maior é " + teste + " -> " + ( teste == 45) );

        teste = maior(80, 20, 10);
        System.out.println("O maior é " + teste + " -> " + ( teste == 80) );

        teste = maior(35, 75, 60);
        System.out.println("O maior é " + teste + " -> " + ( teste == 75) );
    }
}
