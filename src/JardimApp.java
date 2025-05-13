import java.awt.im.InputContext;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class JardimApp {

	public static void main(String[] args) {
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
	        	JOptionPane.showMessageDialog(null, "Jarim é Grande");
	        }else {
				JOptionPane.showMessageDialog(null, "Jardim é pequeno");
			}
	        
	        //####################################################################
	        
	        /* ArrayList<String> servicosEscolhidos = new ArrayList<>();
	        
	        int escolha;
	        
	        do {
				String inputString = JOptionPane.showInputDialog(null,"Escolha um serviço:\n" +
                        "1 - Poda de plantas e árvores\n" +
                        "2 - Aplicação de adubos e nutrientes\n" +
                        "3 - Instalação e manutenção da irrigação\n" +
                        "4 - Projeto paisagístico personalizado\n" +
                        "0 - Sair",
                "Seleção de Serviços",
                JOptionPane.showMessageDialog(null, "Opção inválida.", "Erro", JOptionPane.ERROR_MESSAGE);
					break; 
			} while (condition);
	        
	        if (InputContext ==null) {//usuario clicou em cancelar
	        	escolha =0;
	        }else {
	        	try {
	        		escolha =Integer.parseInt(input);
				} catch (Exception e) {
					 JOptionPane.showMessageDialog(null, "Entrada inválida. Digite um número.", "Erro", JOptionPane.ERROR_MESSAGE);
	                    escolha = -1; // Valor inválido para continuar o loop
				}
	        }
	        
	        switch (escolha) {
			case 1: {
				servicosEscolhidos.add("Poda de planta e arvores");
				JOptionPane.showMessageDialog(null, "Serviço de pode de arvore adicionado.");
				break;
			}
			case 2: {
				servicosEscolhidos.add("Aplicação de adubos e nutrientes");
				JOptionPane.showMessageDialog(null, "Aplicação de adubos e nutrientes adicionado.");
				break;
			}
			case 3: {
				servicosEscolhidos.add("Instalação e manutenção da irrigação.");
				JOptionPane.showMessageDialog(null, "Serviço de Instalação e manutenção da irrigação adicionado. ");
				break;
			}
			case 4: {
				servicosEscolhidos.add("Projeto paisagístico personalizado");
				JOptionPane.showMessageDialog(null, "Serviço de Projeto paisagístico personalizado ");
				break;
			}
			case 0:{
				JOptionPane.showMessageDialog(null, "Saindo da aplicação");
				break;
			}
			default:
				if(escolha!=-1) {
					JOptionPane.showMessageDialog(null, "Opção inválida.", "Erro", JOptionPane.ERROR_MESSAGE);
					break;
				}
			}while (escolha != 0);*/


            //aqui começa o switch
	        String tipoString = JOptionPane.showInputDialog("Digite o tipo de serviço \n1 Poda - \n2 - Adubação \n3 Irrigação \n4 - Paisagismo ");
	        int tipo=Integer.parseInt(tipoString);
	        String descricaoString;
	        
	        switch (tipo) {
			case 1:
				descricaoString="Poda de plantas e arvores";
				
				break;
			case 2:
				descricaoString="Aplicação de adubos e nutrientes";
				break;
			case 3:
				descricaoString="Instalação e manutenção da irrigação";
				break;
			case 4:
				descricaoString="Projeto paisagistico personalizado";
				break;
			default:
				
				descricaoString="Tipo de serviço não comtemplado";
				break;
			}
	        JOptionPane.showMessageDialog(null,"Serviço solicitado"+ descricaoString);
	        
	        
	        
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


