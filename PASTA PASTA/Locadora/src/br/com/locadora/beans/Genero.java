
package br.com.locadora.beans;

import java.util.Scanner;

public class Genero {
	private int idGenero=-1;
	private String[] genero = {"Terror", "Romance", "A��o", "Com�dia", "Outro"};
	
	Scanner s = new Scanner(System.in);
	
	public String selecionaGenero() {
		
		while(idGenero<0 || idGenero>4) {
			System.out.println("Selecione a op��o: ");
			System.out.println("0: Terror");
			System.out.println("1: Romance");
			System.out.println("2: A��o");
			System.out.println("3: Com�dia");
			System.out.println("4: Outro");
			
			idGenero = s.nextInt();
			if(idGenero<0 || idGenero>4) {
				System.out.println("puts...... coloca de novo xamps");
			}
		}
		return (genero[idGenero]);
		//System.out.println("G�nero cadastrado com sucesso!");
	}
		
}


