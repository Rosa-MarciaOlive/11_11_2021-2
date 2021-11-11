public class Teste {
    public static void main(String[] args) {
        
        ContaCorrente conta=new ContaCorrente();
        conta.setSaldo(200);
        conta.deposita(1100);
        conta.saca(2000);
        conta.getLimUtilizado();
        
        System.out.println("Saldo total: "+conta.getSaldo());
        System.out.println("Limite disponivel: "+conta.getLimite());

    }
    
}
