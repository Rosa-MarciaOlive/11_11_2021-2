public class ContaCorrente{
    private int numero;
    private double saldo;
    private boolean status;
    private double limite=2000;
    private double limUtilizado;

    //status true no cheque especial
    //Status false estou com conta azul
    public void saca(double valor) {       
        if(valor > saldo && limite <= 2000){
            status=true;
            saldo =saldo-valor; 
            limite=limite+saldo;
              
        } 
        else{
            status=false;
            saldo=saldo-valor;
        }
        



    //
    public void deposita(double valor){
        saldo+=valor;
    }
 
    //automatico --source...
    public int getNumero() {
        return numero;
    }public void setNumero(int numero) {
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

    public double getLimUtilizado() {
        return limUtilizado;
    }public void setLimUtilizado(double limUtilizado) {
        this.limUtilizado = limUtilizado;
    }
    
        
}