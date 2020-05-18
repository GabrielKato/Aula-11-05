import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
       
        int ano;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um ano: ");
        ano = teclado.nextInt();


        if(ano>2020){System.out.println("O ano de "+ano+" é passado");
}
        else if(ano<2020){System.out.println("O ano de "+ano+" é futuro");
}
        else{System.out.println("O ano de "+ano+" é o ano atual");
} 
}

}