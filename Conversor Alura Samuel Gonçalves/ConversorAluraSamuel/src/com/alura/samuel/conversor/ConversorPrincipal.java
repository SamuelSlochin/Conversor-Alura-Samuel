package com.alura.samuel.conversor;

import java.io.ObjectInputStream.GetField;

import javax.swing.JOptionPane;

public class ConversorPrincipal {

	public static void main(String[] args) {

		Finalizada cancelando = new Finalizada();
		Continuar continuando = new Continuar();
		
		double ValorDoDolar = 4.75;
		double ValorDoEuro = 5.25;
		double ValorDaLibra = 6.13;
		double ValorDoIene = 0.034;
		double ValorDoWon = 0.0037;
		int responda = 0;
		int fahrenheit = 32;
		
		
				Object[] menuInicial = {"Conversor de Moedas", "Conversor de Temperatura"};
				
				Object SelecionandoPrograma = JOptionPane.showInputDialog(null, "Escolha uma opção valida ", "Menu",
						JOptionPane.INFORMATION_MESSAGE, null, menuInicial, menuInicial[0]);
				
				if (SelecionandoPrograma == "Conversor de Moedas") {
				
					String ColocandoValor = JOptionPane.showInputDialog("Insira um valor");
					
					if(ColocandoValor.isEmpty()) {
						JOptionPane.showMessageDialog(null, "Valor inválido, comece o programa novamente!");
						main(null);
				}
					
					double valor = Double.parseDouble(ColocandoValor);
					
					
					Object [] escolhaumamoeda = { "De Reais a Dólares", "De Reais a Euros", "De Reais a Libras", "De Reais a Yenes",
							"De Reais a Won Coreano", "De Dólares a Reais", "De Euros a Reais", "De Libras a Reais" }; 
					
					Object mudaMoedas = JOptionPane.showInputDialog(null,
							"Escolha a moeda para a qual você deseja girar seu dinheiro", "Moedas", JOptionPane.INFORMATION_MESSAGE,
							null, escolhaumamoeda, escolhaumamoeda[0]);
					
					if (mudaMoedas == "De Reais a Dólares") {
						JOptionPane.showMessageDialog(null, String.format("O valor convertido é $ %.2f ", valor / ValorDoDolar));
					} else if (mudaMoedas == "De Reais a Euros") {
						JOptionPane.showMessageDialog(null, String.format("O valor convertido é € %.2f ", valor / ValorDoEuro));
		
					} else if (mudaMoedas == "De Reais a Libras") {
						JOptionPane.showMessageDialog(null, String.format("O valor convertido é £ %.2f ", valor / ValorDaLibra));
		
					} else if (mudaMoedas == "De Reais a Yenes") {
						JOptionPane.showMessageDialog(null, String.format("O valor convertido é ¥ %.2f ", valor / ValorDoIene));
		
					} else if (mudaMoedas == "De Reais a Won Coreano") {
						JOptionPane.showMessageDialog(null, String.format("O valor convertido é ₩ %.2f ", valor / ValorDoWon));
		
					} else if (mudaMoedas == "De Dólares a Reais") {
						JOptionPane.showMessageDialog(null, String.format("O valor convertido é R$ %.2f ", valor * ValorDoDolar));
		
					} else if (mudaMoedas == "De Euros a Reais") {
						JOptionPane.showMessageDialog(null, String.format("O valor convertido é R$ %.2f ", valor * ValorDoEuro));
		
					} else if (mudaMoedas == "De Libras a Reais") {
						JOptionPane.showMessageDialog(null, String.format("O valor convertido é R$ %.2f ", valor * ValorDaLibra));
						
					} else {
						cancelando.finalizado();
						return;
					}
					
				} else if(SelecionandoPrograma == "Conversor de Temperatura") {
					
					String ColocandoValor2 = JOptionPane.showInputDialog("Insira um valor");
					
					if(ColocandoValor2.isEmpty()) {
						JOptionPane.showMessageDialog(null, "Valor inválido, tente novamente!");
						main(null);
					}
					
					double valor2 = Double.parseDouble(ColocandoValor2);
					JOptionPane.showMessageDialog(null, String.format("O valor convertido é %.0fºF", valor2 * 1.8 + 32));
					
				} else {
					cancelando.finalizado();
					return;
				}
				
				 responda = JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Pergunta ao Usuário",
						JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
				if (responda == JOptionPane.CANCEL_OPTION || responda == JOptionPane.NO_OPTION) {
					cancelando.finalizado();
				} if(responda == JOptionPane.YES_OPTION) {
					main(null);
				}
				
	}
}
