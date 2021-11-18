public class Teste {
    public static void main(String[] args) {
        
        ContaCorrente conta=new ContaCorrente();

        conta.setSaldo(200);
        conta.depositar(1100);
        System.out.println("Com o deposito saldo no total de: "+conta.getSaldo());

        conta.saque(2000);
        System.out.println("Seu limite é de: "+conta.getLimite());

        System.out.println("Saldo total: "+conta.getSaldo());

        conta.limiUtilizado(); 
        
        if(conta.getLimite()>0){
            System.out.println("Você utilizou o cheque especial");
        }else{
            System.out.println("No azul...");
        }
        
    }


    }
    
