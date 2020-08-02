package Clases;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author Brenda R
 */
public class ClasePersona {
   int DNI;
  ArrayList<ClaseCuenta> cuentas= new ArrayList<>();

    public ClasePersona(int DNI) {
        this.DNI = DNI;
    }
   public void agregrar_cuenta(ClaseCuenta cuenta){
       int num= cuentas.size();
       if (num<=3) {
               cuentas.add(cuenta);
           }
        
   }
    public void consulta(){
        for (int i = 0; i < 2; i++) {
            
            if (cuentas.get(i).getSaldo()<0) {
                JOptionPane.showMessageDialog(null, "La cuenta se encuentra morosa " + cuentas.get(i).getSaldo() );
            }else {
                JOptionPane.showMessageDialog(null,"Trasnferencia Existosa");
            
            }
        }
    
    }
        
        
    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public ArrayList<ClaseCuenta> getCuentas() {
        return cuentas;
    }

    public void setCuentas(ArrayList<ClaseCuenta> cuentas) {
        this.cuentas = cuentas;
    }
}
