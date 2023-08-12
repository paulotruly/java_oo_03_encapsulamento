class Conta {
    private int numero;
    private double saldo;

        public static void main(String[] args) {

            Conta c = new Conta(1, 0);
            c.creditar(50);
            c.debitar(50);
            c.imprimaSaldo();
 }
  


    public Conta(int codigo, double valor) {
        numero = codigo;
        if (saldo > 0) {
        saldo = valor;
        }
    }



    public double getSaldo() {
        return saldo;
    }
    
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }


    
    public void creditar(double valor) {
        saldo = saldo + valor;
    }
    
    public double debitar(double valor) {
        if (valor > saldo)
        valor = saldo; 
        saldo = saldo - valor;
        return valor;
    }
    
    public void imprimaSaldo() {
        System.out.println("Conta: "+ numero);
         System.out.println("Saldo: R$ "+ saldo);
    }   

}










