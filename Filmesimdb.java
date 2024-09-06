import java.util.ArrayList;


public class Filmesimdb {
	
	private String titulo; //nome
	private ArrayList<String> genero;
	private String descrição;
	private String diretor;
	private ArrayList<String>atores;
	private int ano;
	private int tempo; //duração
	private int avaliação;
	private int votos;
	private double bilheteria;
	
	//construtor
	public Filmesimdb(String titulo, ArrayList<String> genero, String descrição, String diretor, ArrayList<String> atores, int ano, int tempo, int votos, double bilheteria) {
		this.titulo = titulo;
		this.genero = genero;
		this.descrição = descrição;
		this.diretor = diretor;
		this.atores = atores;
		this.ano = ano;
		this.tempo = tempo;
		this.votos = votos;
		this.bilheteria = bilheteria;
	}
				
		//getters
		public String getTitulo() {
			return titulo;
		}
		public ArrayList<String> getGenero() {
			return genero;
		}
		public String getDescrição() {
			return descrição;
		}
		public String getDiretor() {
			return diretor;
		}
		public ArrayList<String> getAtores() {
			return atores;
		}
		public int getAno() {
			return ano;
		}
		public int getTempo() {
			return tempo;
		}
		public int getAva() {
			return avaliação;
		}
		public int getVotos() {
			return votos;
		}
		public double getBilehteria() {
			return bilheteria;
		}
		
		//setters
		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}
		public void setGenero(ArrayList<String> genero) {
			this.genero = genero;
		}
		public void setDescrição(String descrição) {
			this.descrição = descrição;
		}
		public void setDiretor(String diretor) {
			this.diretor = diretor;
		}
		public void setAtores(ArrayList<String> atores) {
			this.atores = atores;
		}
		public void setAno(int ano) {
			this.ano = ano; 
		}
		public void setTempo(int tempo) {
			this.tempo = tempo;
		}
		public void setAva(int avaliação) {
			this.avaliação = avaliação;
		}
		public void setVotos(int votos) {
			this.votos = votos;
		}
		public void setBilheteria(Double bilheteria) {
			this.bilheteria = bilheteria;
		}
		
		public String ToString() {
			return "Titulo: " + titulo + ", Genero: " + genero + ", Descrição: " + descrição + ", Diretor: " + diretor +
		               ", Atores: " + atores + ", Ano: " + ano + ", Duração: " + tempo + ", Avaliação: " + avaliação +
		               ", Votos: " + votos + ", Bilehteria: " + bilheteria;
		
		
		
		
}
}
