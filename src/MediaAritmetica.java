


import javax.swing.JOptionPane;

public class MediaAritmetica {
    public static void main(String[] args) {
        // Entrada dos valores com JOptionPane
        double entrada = Double.parseDouble(JOptionPane.showInputDialog(":digite o valor da media \n aritimetica simples"));
        //String input2 = JOptionPane.showInputDialog("Digite o segundo número:");
        //String input3 = JOptionPane.showInputDialog("Digite o terceiro número:");
        //String input4 = JOptionPane.showInputDialog("Digite o quarto número:");

        
        
        // Cálculo da média
        double media = (30 + 50 + 80+ 90) / 4.0;

        // Exibição do resultado
       if(entrada== media){
        JOptionPane.showMessageDialog(null, "Resposta Certa " );
       }else{
        JOptionPane.showMessageDialog(null, "Você errou a média é: " + media);
       }
       
    }
}