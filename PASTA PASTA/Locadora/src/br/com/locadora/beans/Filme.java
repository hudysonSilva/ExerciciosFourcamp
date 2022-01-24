
package br.com.locadora.beans;

import java.util.Scanner;

public class Filme {
	private int idFilme;
	private String nome;
	private String genero;
	private int faixaEtaria;
	static int qntFilme=0;
	static int var = 0;
	
	Scanner s = new Scanner(System.in);
	
	
	public int getIdFilme() { return idFilme; }
	public void setIdFilme(int idFilme) { this.idFilme = idFilme; }
	public String getNome() { return nome; }
	public void setNome(String nome) {this.nome = nome; }
	public String getGenero() {	return genero; }
	public void setGenero(String genero) {this.genero = genero;	}
	public int getFaixaEtaria() {return faixaEtaria;}
	public void setFaixaEtaria(int faixaEtaria) { this.faixaEtaria = faixaEtaria; }
	
	// metodos
	public int somaId() {
		return qntFilme++;
	}
	public int somaIndex() {
		return var++;
	}
	
	public void cadastraFilme() {
		Filme[] f = new Filme[somaIndex()];
		

		setIdFilme(somaId());
		System.out.print("Insira o nome do filme: ");
		setNome(s.nextLine());
		System.out.print("Insira o g�nero do filme: ");
		Genero g = new Genero();
		setGenero(g.selecionaGenero());
		System.out.print("Insira faixa et�ria: ");
		s.nextInt();
		System.out.println("Filme cadastrado com sucesso.");
		
	}
	
		
	public void acessarCatalogo(){
		// FOR EACH : PARA CADA POSI��O
		System.out.println("Id" + " 	 "+ "Filme" +"		"+"Class"+"	"+"Genero");
		for(Filme i : -- insira o vetor aqui --) {
			System.out.println(i.getIdFilme()+"	"+i.getNome() +"	"+ i.getFaixaEtaria() + "	"+ i.getGenero());
		}
		int opcao = -1;
		System.out.print("Escolha o filme: ");
		opcao = s.nextInt();
	}
	

}
