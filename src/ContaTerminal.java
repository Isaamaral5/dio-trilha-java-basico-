import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número da conta: ");
        int numeroConta = scanner.nextInt();

        System.out.println("Digite a agência: ");
        String agencia = scanner.next();

        System.out.println("Digite o nome do cliente: ");
        String nomeCliente = scanner.next();

        System.out.println("Digite o saldo: ");
        double saldo = scanner.nextDouble();

        System.out.println("Conta criada com sucesso!");

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " conta " + numeroConta + " e seu saldo é de R$" + saldo + " já está disponível para saque.");
        
        scanner.close();
    }
}
//Numero da conta: 1021 (int)
//Agencia: 067-8 (string)
//Nome do Cliente: MARIO ANDRADE (string)
//Saldo: 237.48 (double)

//TO DO: conhecer e importar a classe Scanner ✔
//Exibir as mensagens para o nosso usuario ✔
//Obter pela scanner os valores digitados no terminal
//Exibir a mensagem da conta criada