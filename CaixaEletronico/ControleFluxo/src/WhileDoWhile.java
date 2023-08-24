import java.util.concurrent.ThreadLocalRandom;

public class WhileDoWhile {
    public static void main(String[] args) {
        double mesada = 50.0;
        while (mesada > 0) {
            Double valorDoce = valorAleatorio();

            if (valorDoce > mesada)
                valorDoce = mesada;

            System.out.println("Doce do valor: " + valorDoce + " Adicionado no carrinho");
            mesada = mesada - valorDoce;
        }
        System.out.println("Mesada:" + mesada);
        System.out.println("Joãozinho gastou toda a sua mesada em doces");

        /*
         * Não se preocupe quanto a formatação de valores
         * Iremos explorar os recursos de formatação em breve !!
         */
    }

    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }
}

/*
 * doWhile:
 * 
 * // ExemploDoWhile.java

import java.util.Random;
public class ExemploDoWhile {

	public static void main(String[] args) {
		System.out.println("Discando...");
		
		do {
			//excutando repetidas vezes até alguém atender
			System.out.println("Telefone tocando");
		
		}while(tocando());
		
		System.out.println("Alô !!!");
	}
	private static boolean tocando() {
		boolean atendeu = new Random().nextInt(3)==1;
		System.out.println("Atendeu? " + atendeu);
		//negando o ato de continuar tocando
		return ! atendeu;
	}
}
 */