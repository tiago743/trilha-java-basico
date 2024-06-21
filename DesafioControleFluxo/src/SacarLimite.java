import java.util.Scanner;

public class SacarLimite {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //double saldo = scanner.nextDouble();
        //double saque = scanner.nextDouble();

        double saldo = 1000;
        double saque = 1500;

        // Define um limite para o cheque especial
        double limiteChequeEspecial = 500.0;

        // Verifica se o saque ultrapassa o saldo disponível
        if (saque <= saldo) {
            // TODO: Imprimir "Transação realizada com sucesso."
            System.out.println("Transação realizada com sucesso.");
        } else {
            // TODO: Verificar se o saque ultrapassa o limite do cheque especial
            // Em caso positivo, imprimir "Transacao realizada com sucesso utilizando o cheque especial."
            double saldoLimite = saldo + limiteChequeEspecial;
            if (saque <= saldoLimite){
            System.out.println("Transação realizada com sucesso utilizando o cheque especial.");              
            } else {
            System.out.println("Transação não realizada. Limite do cheque especial excedido.");              
            }
            
            // Caso contrário, imprimir "Transacao nao realizada. Limite do cheque especial excedido."
        }

        // Fechar o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}