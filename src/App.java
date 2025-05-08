/*import javax.swing.JOptionPane;
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
       
         String[]espacoAmostral ={"1","2","3","4","5","6"};
                  
             String mensagem = "Você lançou o dado e saiu: " + resultado;
        if( resultado % 2 == 0){
            contPar++;
           
         }else{
            contImpar++;
               
         }
          
         String saida = "Resultado do lançamento"+espacoAmostral[resultado]+
                        "\n (indice gerado:"+resultado+")";
                        JOptionPane.showMessageDialog(null,  saida, "Resultado",JOptionPane.INFORMATION_MESSAGE);
    }
}*/

import javax.swing.JOptionPane;
import java.util.Random;

public class App {

    public static void main(String[] args) {

        Random random = new Random();
        int contPar = 0;
        int contImpar = 0;
        //String resposta;

        String mensagemInicial = "Espaço amostral: {1, 2, 3, 4, 5, 6}\n" +
                                 "Probabilidade de número par: 50%\n" +
                                 "Probabilidade de número ímpar: 50%\n" +
                                 "Deseja lançar o dado?";

        int escolha = JOptionPane.showConfirmDialog(null, mensagemInicial, "Jogar Dados", JOptionPane.YES_NO_OPTION);

        while (escolha == JOptionPane.YES_OPTION) {
            int resultado = random.nextInt(6) + 1;

            // Verifica par ou ímpar e conta
            if (resultado % 2 == 0) {
                contPar++;
            } else {
                contImpar++;
            }

           
            
            // Mostra resultado do lançamento
            JOptionPane.showMessageDialog(null, "Você lançou o dado e saiu: " + resultado +
                                                "\n" + (resultado % 2 == 0 ? "PAR" : "ÍMPAR"));

            // Pergunta se quer continuar
            escolha = JOptionPane.showConfirmDialog(null, "Deseja lançar o dado novamente?", 
                                                    "Continuar", JOptionPane.YES_NO_OPTION);
        }
        double totoLancamento = contImpar + contPar;
        double probabilidadePar = (contImpar/totoLancamento) *100;
        double probabilidadeImpar =(contPar/totoLancamento) *100;
        
        // Exibe o resumo final
        String resumo = "Fim do programa!\n\n" +
                        "Total de lançamentos:\n" +
                        "- Números pares: " + contPar + "\n" +
                        "- Probabilidade Par: " + probabilidadePar +"%"+ "\n" +
                        "- Probabilidade Impar  " + probabilidadeImpar +"%"+ "\n" +
                        "- Números ímpares: " + contImpar;

        JOptionPane.showMessageDialog(null, resumo, "Resumo", JOptionPane.INFORMATION_MESSAGE);
    }
}
