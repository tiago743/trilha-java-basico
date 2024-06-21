import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean continuar = true;   

        //String menu = "Selecione a opção desejada: 1. Depositar | 2. Sacar | 3. Consultar Saldo | 0. Encerrar";        
  
        while (continuar) {

            //System.out.println(menu);  
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    //System.out.println("valor a ser depositado:"); 
                    double deposito = scanner.nextDouble();     
                    saldo = saldo + deposito;
                    System.out.printf("Saldo atual: %.1f %n",(saldo));  
                    // TODO: Ler o valor a ser depositado e atualizar/imprimir o saldo.
                    break;
                case 2:
                    //System.out.println("valor a ser sacado:");      
                    double saque = scanner.nextDouble();  
                    if (saque <= saldo){
                     saldo = saldo - saque;     
                     System.out.printf("Saldo atual: %.1f %n",(saldo)); 
                    } else {
                    System.out.println("Saldo insuficiente.");
                    break;
                    }
                    // TODO: Ler o valor a ser sacado e verificar/imprimir se há saldo suficiente.
                    break;
                case 3:
                    System.out.printf("Saldo atual: %.1f %n",(saldo));                 
                    // TODO: Exibir o saldo atual da conta.
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    continuar = false;  // Atualiza a variável de controle para encerrar o loop
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
}