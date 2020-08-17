import java.util.Scanner;

public class Combustivel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Combustivel utilizado: \nA= Alcool G= Gasolina");
        String combustivel = scanner.nextLine();
        double preco;
        if (combustivel.equals("A")){
            System.out.println("Quantidade de Litros: ");
            double litros = scanner.nextDouble();
            if (litros>=20){
                preco = (litros*2.9)*0.95;
            } else {
                preco = (litros*2.9)*0.97;
            }
            System.out.println("valor da compra é de:" +preco);
        }
        if (combustivel.equals("G")){
            System.out.println("Quandidade de litros: ");
            double litros = scanner.nextDouble();
            if (litros>=20){
                preco = (litros*3.3)*0.94;
            }else {
                preco = (litros*3.3)*0.96;
            }
            System.out.println("valor da compra é de:" +preco);
        }
    }
}

