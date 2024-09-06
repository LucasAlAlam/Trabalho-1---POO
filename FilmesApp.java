public class FilmesApp {
    public static void main(String[] args) {
        InterfaceCSV listaFilmes = new InterfaceCSV("filmes.csv");
        System.out.println(listaFilmes.buscaPorTitulo("Spider-Man 3")+"\n\n\n");
        System.out.println(listaFilmes.buscaPorGenero("Horror")+"\n\n\n");
        System.out.println(listaFilmes.buscaPorDiretor("Quentin Tarantino")+"\n\n\n");
        System.out.println(listaFilmes.buscaPorAtor("Jack Black")+"\n\n\n");
    }
}
