import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;


/**
* @author LucasAlAlam 
*/
public class InterfaceCSV {
    private String arquivo;
    private ArrayList<Filme> filmes = new ArrayList<Filme>();

    public InterfaceCSV(String arquivo) {
        this.arquivo = arquivo;
        this.filmes = accessFilmesInCSV();
    }

    private ArrayList<Filme> accessFilmesInCSV() {
        ArrayList<Filme> filmes = new ArrayList<>();
        String linha;
        try (BufferedReader br = new BufferedReader(new FileReader(arquivo))) {
            br.readLine(); // Pular cabeçalho
            while ((linha = br.readLine()) != null) {
                // Ajuste na expressão regular 
                String[] campos = linha.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)", -1);
                if (campos.length >= 11) { // Verificação para evitar ArrayIndexOutOfBoundsException
                    try {
                        String titulo = campos[1];
                        ArrayList<String> genero = new ArrayList<>(Arrays.asList(campos[2].replace("\"", "").split(",")));
                        String descricao = campos[3].replace("\"", "");
                        String diretor = campos[4];
                        ArrayList<String> atores = new ArrayList<>(Arrays.asList(campos[5].replace("\"", "").split(",")));
                        int ano = Integer.parseInt(campos[6]);
                        int duracao = Integer.parseInt(campos[7]);
                        double avaliacao = Double.parseDouble(campos[8]);
                        int votos = Integer.parseInt(campos[9]);
                        double bilheteria = campos[10].isEmpty() ? 0 : Double.parseDouble(campos[10]);

                        Filme filme = new Filme(titulo, genero, descricao, diretor, atores, ano, duracao, avaliacao, votos, bilheteria);
                        filmes.add(filme);
                    } catch (NumberFormatException e) {
                        System.err.println("Erro ao converter número: " + e.getMessage());
                    }
                } else {
                    System.err.println("Linha CSV com número insuficiente de campos: " + Arrays.toString(campos));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return filmes;
    }

    public ArrayList<Filme> getFilmes() {
        return filmes;
    }
/**
* metodo que busca por titutolos e retorna filme
* @param titulo
* @return filme
*/
    public Filme buscaPorTitulo(String titulo) {
        for (Filme filme : filmes) {
            if (filme.titulo.equals(titulo)) {
                return filme;
            }
        }
        return null;
    }
/**
* metodo que busca por genero
* @param genero
* @return genero
*/
    public ArrayList<Filme> buscaPorGenero(String genero) {
        ArrayList<Filme> filmesGenero = new ArrayList<>();
        for (Filme filme : filmes) {
            if (filme.genero.contains(genero)) {
                filmesGenero.add(filme);
            }
        }
        return filmesGenero;
    }
/**
* metodo que busca por diretor
* @param diretor
* @return diretor
*/
    public ArrayList<Filme> buscaPorDiretor(String diretor) {
        ArrayList<Filme> filmesDiretor = new ArrayList<>();
        for (Filme filme : filmes) {
            if (filme.diretor.equals(diretor)) {
                filmesDiretor.add(filme);
            }
        }
        return filmesDiretor;
    }
/**
* metodo que busca por ator
* @param aor
* @return ator
*/
    public ArrayList<Filme> buscaPorAtor(String ator) {
        ArrayList<Filme> filmesAtor = new ArrayList<>();
        for (Filme filme : filmes) {
            if (filme.atores.contains(ator)) {
                filmesAtor.add(filme);
            }
        }
        return filmesAtor;
    }
/**
* metodo que organiza a avaliação
* @param null
* @return avaliação do filme
*/
    public ArrayList<Filme> organizaPorAvaliacao() {
        ArrayList<Filme> filmesAvaliacao = new ArrayList<>(filmes);
        filmesAvaliacao.sort((f1, f2) -> Double.compare(f2.avaliação, f1.avaliação));
        return filmesAvaliacao;
    }
/**
* metodo que organiza os votos
* @param null
* @return votos do filme
*/
    public ArrayList<Filme> organizaPorVotos() {
        ArrayList<Filme> filmesVotos = new ArrayList<>(filmes);
        filmesVotos.sort((f1, f2) -> Integer.compare(f2.votos, f1.votos));
        return filmesVotos;
    }
/**
* metodo que organiza por bilehteria
* @param null
* @return filmes em bilheteria
*/
    public ArrayList<Filme> organizaPorBilheteria() {
        ArrayList<Filme> filmesBilheteria = new ArrayList<>(filmes);
        filmesBilheteria.sort((f1, f2) -> Double.compare(f2.bilheteria, f1.bilheteria));
        return filmesBilheteria;
    }
/**
* metodo que organiza por duração
* @param null
* @return duração do filme
*/
    public ArrayList<Filme> organizaPorDuração() {
        ArrayList<Filme> filmesDuracao = new ArrayList<>(filmes);
        filmesDuracao.sort((f1, f2) -> Integer.compare(f2.duracao, f1.duracao));
        return filmesDuracao;
    }


    @Override
    public String toString() {
        return "Filmes: " + filmes;
    }
}
