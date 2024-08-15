import java.util.Locale;
import java.util.Scanner;

public class contaBanco {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


                // Solicitação de leitura pelo usuário
        System.out.println("Por favor me informe o número da conta: ");
        int numero = sc.nextInt();

        System.out.println("Por favor digite o número da agência: ");
        String agencia = sc.next();


        // consome a linha deixada pela leitura acima
        sc.nextLine();

        System.out.println("Digite o nome do cliente: ");
        String nomeCliente = sc.nextLine();

        System.out.println("por favor digite o saldo da conta: ");
        double saldo = sc.nextDouble();

        // Exibi a mensagem final utilizando concatenaçao da Strings
        String mensagem = "Olá " + nomeCliente + ", obrigado por criar sua conta em nosso banco, " + "sua agência "
                + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponivel para saque.";

        System.out.println(mensagem);
        sc.close();
    }


}
