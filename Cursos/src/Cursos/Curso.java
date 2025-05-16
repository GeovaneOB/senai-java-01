package Cursos;

public class Curso {

	public String nome;
	public int codigo;
	public int cargaHoraria;
	
	public Curso(String nome, int codigo, int cargaHoraria) {
		this.nome = nome;
		this.codigo = codigo;
		this.cargaHoraria = cargaHoraria;
	}
	
	public String getNome() {
		return nome;
	}
	public int getCodigo() {
		return codigo;
	}
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
	public void exibirCurso1 (Curso curso1) {
		
		System.out.println("====== INFORMAÇÕES DO CURSO 01 ======");
		
		System.out.println();
		
		System.out.println("NOME: " + getNome());
		System.out.println("CÓDIGO: " + getCodigo());
		System.out.println("NOME: " + getCargaHoraria());
		
	}

	
	public void exibirCurso2 (Curso curso2) {
		
		System.out.println("====== INFORMAÇÕES DO CURSO 02 ======");
		
		System.out.println();
		
		System.out.println("NOME: " + curso2.getNome());
		System.out.println("CÓDIGO: " + curso2.getCodigo());
		System.out.println("NOME: " + curso2.getCargaHoraria());
		
	}
	
}
