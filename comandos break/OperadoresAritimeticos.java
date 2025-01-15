package com.bruna.cursojava.aula16;

public class OperadoresAritimeticos {

	public static void main(String[] args) {
		
		int resultado = 1 + 2;
		System.out.println(resultado);
		
		resultado = resultado - 1;
		System.out.println(resultado);
		
		resultado = resultado * 2;
		System.out.println(resultado);	

		resultado = resultado / 2;
		System.out.println(resultado);	
		
		resultado = resultado + 8;
		System.out.println(resultado);
		
		resultado = resultado % 7;
		System.out.println(resultado);
		
		String primeiroNome = "Esta é";
		String segundoNome = "Uma String concatenada";
		String terceiroNome = primeiroNome + segundoNome;
		System.out.println(terceiroNome);
		
		
		System.out.println(resultado);
		// mesma coisa 
		// System.out.println(resulado);
		//resultado = resultado + 1;
		//resultado += 1;
		
		System.out.println(++resultado);
		// mesma coisa que 
		// resultado += 1;
		//System.out.println(resultado)
		
	}

}
