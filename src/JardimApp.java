import java.awt.im.InputContext;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class JardimApp {

	public static void main(String[] args) {
		int totalJardins = 0;
        double somaAreas = 0;
        int continuar;

        do{
        String nome;
		String endereco;
		JOptionPane.showMessageDialog(null, "Olá Jardim");
		nome = JOptionPane.showInputDialog("Digite o seu nome:");
		endereco = JOptionPane.showInputDialog("Digite o seu endereço:");
		JOptionPane.showMessageDialog(null,"Cliente cadastrado \n mome:"+ nome + " endereço"+endereco);
		String larguraStr = JOptionPane.showInputDialog("Digite a largura");
		String comprimentoStr = JOptionPane.showInputDialog("Digite o comprimento");
		
		double largura=Double.parseDouble(comprimentoStr);
		double comprimento=Double.parseDouble(comprimentoStr);
		
		
		 double area = largura * comprimento;

	        JOptionPane.showMessageDialog(null, "A área do jardim é: " + area + " metros quadrados.");
	        
	        if(area >100) {
	        	JOptionPane.showMessageDialog(null, "Jardim é Grande");
	        }else {
				JOptionPane.showMessageDialog(null, "Jardim é pequeno");
			}
	        somaAreas += area;
            totalJardins ++;

           
            continuar = JOptionPane.showConfirmDialog(null, "Deseja calcular outro jardim?", "Continuar", JOptionPane.YES_NO_OPTION);

	        //####################################################################
        }while (continuar == JOptionPane.YES_OPTION);


        if (totalJardins > 0){
            double mediaAreas = somaAreas /totalJardins;
            JOptionPane.showConfirmDialog(null,"A média das areas dos Jardins"+totalJardins+"jardins é"+mediaAreas +"metros quadrados");
        }else{
            JOptionPane.showMessageDialog(null,"Nenhum jardim foi registrado");
        }
    





	       


            //aqui começa o switch
           
             
            int tipo;     

do {
   
    String tipoString = JOptionPane.showInputDialog("Digite o tipo de serviço \n1 - Poda \n2 - Adubação \n3 - Irrigação \n4 - Paisagismo \n0 - Sair");
    tipo = Integer.parseInt(tipoString);
    String servicoEscolhido;

    switch (tipo) {
        case 1:
        servicoEscolhido = "Poda de plantas e árvores";
            break;
        case 2:
        servicoEscolhido = "Aplicação de adubos e nutrientes";
            break;
        case 3:
        servicoEscolhido = "Instalação e manutenção da irrigação";
            break;
        case 4:
        servicoEscolhido = "Projeto paisagístico personalizado";
            break;
        case 0:
        servicoEscolhido = "Saindo";
           
        default:
        servicoEscolhido = "Tipo de serviço não contemplado";
            break;
    }

    JOptionPane.showMessageDialog(null, "Serviço solicitado: " + servicoEscolhido);
} while (tipo != 0);

        
	        
	        //##################################################
	        // desconto por quantidade de serv
	        int qtdServicos =Integer.parseInt(JOptionPane.showInputDialog("Qual a quantidade de serviços realizada pelo cliente? "));
	      double precoBase= Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do serviço")) ;
	      double desconto;
	      
	      if(qtdServicos>=10) {
	    	  desconto =0.20;
	      }else if (qtdServicos<=5) {
	    	  desconto=0.10;
	      }else {
	    	  desconto=0;
	      }
	      
	      double precoFinal = precoBase -(precoBase * desconto );
	      JOptionPane.showMessageDialog(null, String.format("Desconto aplicado: %.0f%%\nPreço final do serviço: R$ %.2f", desconto * 100, precoFinal));
	}

}


