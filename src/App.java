import javax.swing.JOptionPane;
import java.util.Random;

public class App {

    public static void main(String[] args) {
        
        Random random = new Random();
        String resposta;
        int contPar = 0;
        int contImpar =0;
        
        do {
            int resultado = random.nextInt(6) + 1; // Número aleatório de 1 a 6
           //Mostra mensagem inicial
           String mensagem ="Espaço amostral:{1,2,3,4,5,6}\n"+
        "Probabilidade de numero par:50%\n" +
        "Probabilidade de numero impar 50% \n" +
         "Deseja lançar o Dado";
         JOptionPane.showConfirmDialog(null, mensagem,"Jogar Dados",JOptionPane.YES_NO_OPTION);
            // Mostra o resultado do lançamento
            JOptionPane.showMessageDialog(null, "Você lançou o dado e saiu: " + resultado);

            // Pergunta se o usuário deseja lançar novamente
            resposta = JOptionPane.showInputDialog("Deseja lançar o dado novamente? (s/n)");

            if (resposta == null) { // Se o usuário fechar a janela
                break;
            }

            resposta = resposta.trim().toLowerCase();

        } while (resposta.equals("s"));

        JOptionPane.showMessageDialog(null, "Fim do programa. Obrigado por jogar!");
       
        //Contador de par ou impar
       
       /*  String[]espacoAmostral ={"1","2","3","4","5","6"};
                  int resultado;
             String mensagem = "Você lançou o dado e saiu: " + resultado;
        if(resultado % 2 == 0){
            contPar++;
           
         }else{
            contImpar++;
               
         }
          
         String saida = "Resultado do lançamento"+espacoAmostral[resultado]+
                        "\n (indice gerado:"+resultado+")";
                        JOptionPane.showMessageDialog(null,  saida, "Resultado",JOptionPane.INFORMATION_MESSAGE);*/
    }
}