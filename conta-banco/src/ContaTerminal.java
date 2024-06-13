import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        
    Scanner dados = new Scanner(System.in);
        
        System.out.println("Por favor, digite o nome!");
        String nome = dados.nextLine();
        
        System.out.println("Por favor, digite a agência!");
        String agencia = dados.next();

        System.out.println("Por favor, digite o número da conta!");
        short conta = (short) dados.nextInt();
        
        System.out.println("Por favor, digite o sTaldo!");
        double saldo = dados.nextDouble();

        
        //imprimindo os dados obtidos pelo usuario
        System.out.println("Olá " + nome + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo R$" + saldo + " já está disponível para saque!");
     
        dados.close();
    }
}
