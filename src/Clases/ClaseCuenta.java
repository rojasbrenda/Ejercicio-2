package Clases;

/**
 *
 * @author Brenda R
 */
public class ClaseCuenta {
 Double saldo;
 int numero;

    public ClaseCuenta(Double saldo, int numero) {
        this.saldo = saldo;
        this.numero = numero;
        
        
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    

   public void recibir(double monto){
    this.setSaldo(this.getSaldo()+monto);
}
 public void pagar(double monto){
    this.setSaldo(this.getSaldo()- monto);
}

        
        
}