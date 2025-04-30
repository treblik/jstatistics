import java.util.Locale;

import javax.swing.JOptionPane;

public class mediana {
    public static void main(String[] args) {
        String nome = (JOptionPane.showInputDialog("Qual a medida de tendência central que mostra?"));
         
        
        if(nome.equalsIgnoreCase("mediana")){
            JOptionPane.showMessageDialog(null, "Resposta Certa " );
        }else{
            JOptionPane.showMessageDialog(null, "Resposta errada ");
        
        }
    }
}
