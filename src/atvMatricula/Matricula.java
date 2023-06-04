package atvMatricula;

public class Matricula {
	
	String curso;
	String sexo;
	String nome;
	int idade;
	int matricula;
	String status;
	
	Matricula(String curso,String sexo, String nome, int idade, int matricula){
		this.curso = curso;
		this.sexo = sexo;
		this.nome = nome;
		this.idade = idade;
		this.matricula = matricula;
	}
	void andar(String andar) {
		status = andar;
	}
	void parar(String parar) {
		status = parar;
	}
	
	void correr(String correr) {
		status = correr;
	}
}
