import javax.swing.JOptionPane;

public class Moda {
    public static void main(String[] args) {
        double input = Double.parseDouble(JOptionPane.showInputDialog("Considerando os valores 10,40,50,80,10 qual é a moda?"));
        double media =10;
        if(input == media){
            JOptionPane.showMessageDialog(null, "Resposta Certa " );
        }else{
            JOptionPane.showMessageDialog(null, "Resposta errada o correto é "+"10");
        }


        

    }
}
