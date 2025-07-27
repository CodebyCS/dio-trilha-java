import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência!");
        setNumero(input.nextInt());
        
        System.out.println("Por favor, digite o número da Conta!");
        setConta(input.next());
        
        System.out.println("Por favor, digite o nome do cliente!");
        setNomeCliente(input.next());

        System.out.println("Por favor, digite o saldo");
        setSaldo(input.nextDouble());

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo R$%.2f já está disponível para saque.", getNomeCliente(), getNumero(), getConta(), getSaldo());

    }
    private static Integer numero;

    private static String conta; 

    private static String nomeCliente; 

    private static double saldo;

    public static Integer getNumero() {
        return numero;
    }
    public static void setNumero(Integer numero1) {
        numero = numero1;
    }

    public static void setConta(String conta1) {
        conta = conta1;
    }

    public static void setNomeCliente(String nomeCliente1) {
        nomeCliente = nomeCliente1;
    }

    public static void setSaldo(double saldo1) {
        saldo = saldo1;
    }

    public static String getConta() {
        return conta;
    }

    public static String getNomeCliente() {
        return nomeCliente;
    }

    public static Double getSaldo() {
        return saldo;
    }
}
