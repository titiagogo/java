import java.util.Scanner;

public class Cadastro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //criando usuario:
        System.out.println("Digite seu primeiro nome: ");
        String nome = scanner.nextLine();
        System.out.println("Digite seu ultimo sobrenome: ");
        String sobrenome = scanner.nextLine();

        char primeiraletra = nome.charAt(0);
        String usuario = primeiraletra+sobrenome;
        System.out.println("O Usuario criado é: "+usuario);

        //criando senha:
        System.out.println("sua senha deve conter:\nLetras Maiuscula e minuscula,\nnumero, uns dos caracteres especiais - , ! ou @ \ne no minimo 8 caracteres");
        System.out.println("Digite sua senha: ");
        String senha = scanner.nextLine();

        //verificando se a senha é válida:
        if (senha.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[-, !, @])(?=.*[A-Z])(?=.*\\d).+")&& senha.length()>7){
            System.out.println("senha criada com sucesso");
            }else{
                System.out.println("senha inválida!");
            }
        //logando:
        System.out.println("Vamos para o primeiro login!");
        boolean login = false;

        while (login == false){
            System.out.println("Digite seu usuario: ");
            String tlogin = scanner.nextLine();

            System.out.println("Digite sua senha: ");
            String tsenha = scanner.nextLine();

            if(tlogin.equals(usuario) && tsenha.equals(senha)){
                System.out.println("Login realizado !");
                login = true;
            }else{
                System.out.println("usuario ou senha invalidos!");
            }

        }
    }
}
