import java.util.Scanner;

public class Ex3 {


    public static void main(String[] args) {
    
        String nome;
        float n1, n2, media;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite seu nome: ");
        nome = teclado.next();
        
        System.out.println("Digite a primeira nota: ");
        n1 = teclado.nextFloat();
        
        System.out.println("Digite a segunda nota: ");
        n2 = teclado.nextFloat();
        
        media = (n1 + n2) / 2;
        
        if(media > 0.00 && media <= 3.99){
            System.out.println("Nome: " + nome + "\n Media: " + media + "\n Situacao: Reprovado");
            
        }else if(media >= 4.00 && media <= 5.99){
            System.out.println("Nome: " + nome + "\n Media: " + media + "\n Situacao: Recuperacao");
            
        }else{
            System.out.println("Nome: " + nome + "\n Media: " + media + "\n Situacao: Aprovado");
            
        }
        
        
        
        
    }
    
}