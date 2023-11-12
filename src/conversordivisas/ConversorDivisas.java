package conversordivisas;

import javax.swing.JOptionPane;
public class ConversorDivisas {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        String[] options = { "MXN-USD", "USD-MXN", "MXN-EUR", "EUR-MXN" };
        var selection = JOptionPane.showOptionDialog(null, "Selecciona la conversion a realizar:", "Convertidor de divisas", 
                                                      0, 3, null, options, options[0]);
        Double num;
        
        if (selection == 0) {
            num = Double.valueOf(JOptionPane.showInputDialog(null, "Ingresa la cantidad a convertir"));
            num = num / 17.65; 
            JOptionPane.showMessageDialog(null, "El resultado es: " + num);
        }
        if (selection == 1) { 
         num = Double.valueOf(JOptionPane.showInputDialog(null, "Ingresa la cantidad a convertir"));
            num = num * 17.65; 
            JOptionPane.showMessageDialog(null, "El resultado es: " + num);
        }
        if (selection == 2) { 
            num = Double.valueOf(JOptionPane.showInputDialog(null, "Ingresa la cantidad a convertir"));
            num = num / 18.86; 
            JOptionPane.showMessageDialog(null, "El resultado es: " + num);
        }
        if (selection == 3) { 
            num = Double.valueOf(JOptionPane.showInputDialog(null, "Ingresa la cantidad a convertir"));
            num = num * 18.86; 
            JOptionPane.showMessageDialog(null, "El resultado es: " + num);
        }
        
    }  
}
