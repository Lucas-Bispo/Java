package br.com.exemplo.secao08;
//Ainda sobre funções
public class programa21 {
    public static void main(String[] args) {//função principal
        //declaração de variáveis.
        int valor1 = 6, valor2 = 4;
//comando de imprimir menssagem na tela com quebra de linha 
        System.out.println("O resultado é "+ soma(valor1,valor2,"Olá"));//chamada de função dentro do comando
        //de imprimir 
        System.out.println(menssagem());//chamada de função dentro do comando de imprimir.
    }
    static int soma(int v1,int v2,String msg){//declaração de função com retorno mais três parâmetros
        System.out.println(msg);//imprimindo a menssagem olá que vem por parâmetro através do comando println
        return v1 + v2;//retorna o valor somado que vem no argumento.
    }
    static String menssagem(){//declaração de função do tipo string 
        return "olá usuário";
    }

}