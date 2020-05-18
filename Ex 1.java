import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
       
        int n1,r;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        n1 = teclado.nextInt();

        r = n % 2;

        if(r==0){System.out.println("O número "+n1+" o número é par");
}
    else{System.out.println("O número "+n1+" o número é impar");
}
     
}

}