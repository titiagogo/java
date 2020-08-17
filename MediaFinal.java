import java.util.Scanner;

public class MediaFinal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite a nota 1: ");
        double nota1 = scanner.nextDouble();

        System.out.println("digite a nota 2: ");
        double nota2 = scanner.nextDouble();

        System.out.println("digite a nota 3: ");
        double nota3 = scanner.nextDouble();

        double media = Math.round(((nota1+nota2+nota3)/3)* 10)/ 10.0;
        System.out.println("a media é :"+media);

        scanner.close();
    }
}
