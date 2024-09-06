import java.util.ArrayList;

public class Filme {

	String titulo; // nome
	ArrayList<String> genero;
	String descrição;
	String diretor;
	ArrayList<String> atores;
	int ano;
	int duracao; // duração
	double avaliação;
	int votos;
	double bilheteria;

	public Filme(String titulo, ArrayList<String> genero, String descrição, String diretor, ArrayList<String> atores, int ano, int duracao, double avaliação, int votos, double bilheteria) {
		this.titulo = titulo;
		this.genero = genero;
		this.descrição = descrição;
		this.diretor = diretor;
		this.atores = atores;
		this.ano = ano;
		this.duracao = duracao;
		this.avaliação = avaliação;
		this.votos = votos;
		this.bilheteria = bilheteria;
	}

	@Override
	public String toString() {
		return "Titulo: " + titulo + ", Genero: " + genero + ", Descrição: " + descrição + ", Diretor: " + diretor +
				", Atores: " + atores + ", Ano: " + ano + ", Duração: " + duracao + ", Avaliação: " + avaliação +
				", Votos: " + votos + ", Bilehteria: " + bilheteria;
	}
}
