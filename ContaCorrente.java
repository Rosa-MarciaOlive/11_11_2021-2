public class ContaCorrente{
    private double numero;
    private double saldo;
    private boolean status;
    private double limite=2000;
    //private double limiUtilizado;
    //private int deposita;

    public void depositar(double valor){
        saldo+=valor;
    }

    //status true, cliente está no cheque especial
    //Status false, Cliente não esta no cheque espeial
    public void saque (double valor) {       
        if(valor > saldo && limite <= 2000){
            status=true;
            saldo =saldo-valor; 
            limite=limite+saldo;
           // limitilizado=limite+saldo;   
              
        }else{
            status=false;
            //saldo=saldo-valor;
        }
   
    }
 
    //automatico --source...
    public double getNumero() {
        return numero;
    }public void setNumero(double numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }public void setStatus(boolean status) {
        this.status = status;
    }

    public double getLimite() {
        return limite;
    }public void setLimite(double limite) {
        this.limite = limite;
    }

    public void limiUtilizado(){
        if(limite !=2000){
            double utilizado;
            utilizado =getLimite()-2000;
            System.out.println("Limite utilizado: "+utilizado);
            }
        }
    }
    
    