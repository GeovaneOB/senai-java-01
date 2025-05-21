package Cursos;

public class Matricula {
	
	private String aluno;
	private String curso;
	private int ano;
	private int semestre;
	
	public Matricula(String aluno, String curso, int ano, int semestre) {
		this.aluno = aluno;
		this.curso = curso;
		this.ano = ano;
		this.semestre = semestre;
	}
	
	public String getAluno() {
		return aluno;
	}
	public String getCurso() {
		return curso;
	}
	public int getAno() {
		return ano;
	}
	public int getSemestre() {
		return semestre;
	}
	public void setAluno(String aluno) {
		this.aluno = aluno;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}
	
	public void exibirMatricula1 (Aluno aluno1, Curso curso1, Matricula matricula1 ) {
		
		System.out.println("====== INFORMAÇÕES DA MATRICULA 01 ======");
		
		System.out.println();
		
		System.out.println("ALUNO: " + aluno1.getNome());
		System.out.println("CURSO: " + curso1.getNome());
		System.out.println("ANO: " + matricula1.getAno());
		System.out.println("SEMESTRE: " + matricula1.getSemestre());
	}
	
	public void exibirMatricula2 (Aluno aluno2, Curso curso2, Matricula matricula2) {
		
		System.out.println("====== INFORMAÇÕES DA MATRICULA 02 ======");
		
		System.out.println();
		
		System.out.println("ALUNO: " + aluno2.getNome());
		System.out.println("CURSO: " + curso2.getNome());
		System.out.println("ANO: " + matricula2.getAno());
		System.out.println("SEMESTRE: " + matricula2.getSemestre());
	}
}
