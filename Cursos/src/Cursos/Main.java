package Cursos;

public class Main {

	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno ("Geovane", "0001", 19);
		Aluno aluno2 = new Aluno ("Euclides", "0002", 72);
		
		Curso curso1 = new Curso ("Análise e Desenvolvimento de Sistemas", 101, 360);
		Curso curso2 = new Curso ("Administração", 202, 200);
		
		Matricula matricula1 = new Matricula (aluno1.getNome(), curso1.getNome(), 2025, 1);
		Matricula matricula2 = new Matricula (aluno2.getNome(), curso2.getNome(), 2024, 2);
		
		aluno1.exibirAluno1 (matricula1, curso1);
		
		System.out.println();
		
		aluno2.exibirAluno2 (matricula2, curso2);
		
		System.out.println();
		
		matricula1.exibirMatricula1 (aluno1, curso1, matricula1);
		
		System.out.println();
		
		matricula1.exibirMatricula2 (aluno2, curso2, matricula2);
		
		System.out.println();
		
		curso1.exibirCurso1 (curso1);
		
		System.out.println();
		
		curso1.exibirCurso2 (curso2);

	}

}
