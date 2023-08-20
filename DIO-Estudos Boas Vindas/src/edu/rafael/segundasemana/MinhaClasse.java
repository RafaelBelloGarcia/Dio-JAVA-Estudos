package edu.rafael.segundasemana;
public class MinhaClasse {
    public static void main(String[] args) {
        String primeiroNome = "Rafael";
        String segundoNome = "Bello";
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}

// final MAIUSCULA == const

// String meuNome = "Rafael";
// int anoFabricacao = 2023;
// boolean verdadeira = false;
// anoFabricacao = 2018;

// Tipos primitivos da linguagem:
// int, byte, short, long, float, double, boolean, char