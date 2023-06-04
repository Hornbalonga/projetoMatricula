package atvMatricula;

public class TesteMatricula {

	public static void main(String[] args) {

		Matricula m1 = new Matricula("ADS","Masculino","Pedro", 20,890 );
		System.out.println("Curso:"+m1.curso+"\nSexo:"+m1.sexo+"\nNome:"+m1.nome+"\nIdade:"+m1.idade+"\nMatricula:"+m1.matricula);
		
		m1.andar("andando");
		System.out.println(m1.status);
		
		m1.correr("correndo");
		System.out.println(m1.status);
		
		m1.parar("parado");
		System.out.println(m1.status);


		
		}
	
}
