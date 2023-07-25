package com.alura.samuel.conversor;

	import javax.swing.JOptionPane;

	public class MenuInicial {
		
		@SuppressWarnings("unused")
			public void moedas() {	
					Object[] possibleValues = {
								"De Reais a Euros",
								"De Reais a Dólares",
								"De Reais a Libras",
								"De Reais a Yenes",
								"De Reais a Won Coreano",
								"De Dólares a Reais",
								"De Euro a Reais",
								"De Libra a Reais" };
					
					Object selectedValue = JOptionPane.showInputDialog(null, 
				             "Agora escolha a moeda que deseja converter seu dinheiro", "Moedas",
				             JOptionPane.INFORMATION_MESSAGE, null, 
				             possibleValues, possibleValues[0]);
					
		}

	}

