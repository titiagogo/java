import java.util.Scanner;

public class PreçoProduto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("valor do item :");
        double preco = scanner.nextDouble();

        System.out.println("escolha o metado de pagamento: \n1-A vista em dinheiro ou cheque = 10% off\n2-A vista no credito = 5%\n3-em 2x s/ juros\n4-em 3* com 10% de juros totais");
        int pagamento = scanner.nextInt();

        if (pagamento==1) {
            double valorFinal = preco * 0.9;
            System.out.println("valor final é :" + valorFinal);
        }
        if (pagamento == 2) {
            double valorFinal1 = preco * 0.95;
            System.out.println("valor final é :" + valorFinal1);
        }
        if (pagamento == 3) {
            double valorFinal2 = preco / 2;
            System.out.println("valor final é de 2 parcelas de:" + valorFinal2);
        }
        if (pagamento == 4) {
            double valorFinal3 = Math.round(((preco * 1.1) / 3) *10)/10.00;
            System.out.println("valor final é de 3 parcelas de :" + valorFinal3);
            }
    }
}
