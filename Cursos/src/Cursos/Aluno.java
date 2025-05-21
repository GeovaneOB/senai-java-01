package Cursos;

public class Aluno {
	
	private String nome;
	private String matricula;
	private int idade;
	
	public Aluno(String nome, String matricula, int idade) {
		this.nome = nome;
		this.matricula = matricula;
		this.idade = idade;
	}
		
	public String getNome() {
		return nome;
	}
	public String getMatricula() {
		return matricula;
	}
	public int getIdade() {
		return idade;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void exibirAluno1 (Matricula matricula1, Curso curso1) {
		
		System.out.println("====== INFORMAÇÕES DO ALUNO 01 ======");
		
		System.out.println();
		
		System.out.println("ALUNO: " + getNome());
		System.out.println("MATRICULA: " + getMatricula());
		System.out.println("IDADE: " + getIdade());
	}
	
	public void exibirAluno2 (Matricula matricula2, Curso curso2) {
		
		System.out.println("====== INFORMAÇÕES DO ALUNO 02 ======");
		
		System.out.println();
		
		System.out.println("ALUNO: " + getNome());
		System.out.println("MATRICULA: " + getMatricula());
		System.out.println("IDADE: " + getIdade());
	}
}
