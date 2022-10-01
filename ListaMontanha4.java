import java.util.Scanner;


public class ListaMontanha4 {


    public static void main(String[] args) {
        Scanner leia = new Scanner (System.in);
        int n1, n2, n3, n4, media;
        System.out.print("Digite a primeira nota do bimestre");
        n1 = leia.nextInt();
        System.out.print("Digite a segunda nota do bimestre");
        n2 = leia.nextInt();
        System.out.print("Digite a terceira nota do bimestre");
        n3 = leia.nextInt();
        System.out.print("Digite a quarta nota do bimestre");
        n4 = leia.nextInt();
        media = (n1 + n2 + n3 + n4)/4;
        System.out.print("A media das notas e: " + media);
    }
    
}