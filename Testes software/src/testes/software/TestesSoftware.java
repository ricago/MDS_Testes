
package testes.software;

import java.util.Scanner;


public class TestesSoftware {
    public static void main(String[] args) {
        int n;
        Scanner ler = new Scanner(System.in);
                //pedir valor ao user
        System.out.println("Insira um valor inteiro");
        n = ler.nextInt();
        //verifica se é par ou impar
        if(n%2==0)
            System.out.println(n+" é par\n"+n+" é multiplo de 2");
        else
            System.out.println(n+" é impar");
        if(n%3==0)
            System.out.println(n+" é multiplo de 3");
        if (n%5==0)
            System.out.println(n+" é multiplo de 5");
        if (n%7==0 && n%14==0)
            System.out.println(n+" é multiplo de 7 e de 14");
        if(n%13==0 || n%19 ==0)
            System.out.println(n+" é multiplo de 13 e 19");

    }
    
}
