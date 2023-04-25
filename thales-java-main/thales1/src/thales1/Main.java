package thales1;

public class Main {

	public static void main(String[] args) {
	    Video video = new Video(null, null, null, null, null, 0, 0);
	    video.setTitulo("Matrix");
	    video.setDiretor("Lana Wachowski");
	    video.setElenco("Keanu Reeves, Laurence Fishburne, Carrie-Anne Moss");
	    video.setGenero("Ficção científica");
	    video.setSinopse("Em um futuro próximo, um jovem programador é atormentado por visões sombrias do passado e do futuro.");
	    video.setAnoLancamento(1999);
	    video.setClassificacaoIndicativa(16);
	    
	    System.out.println("---------------VIDEO--------------------");
	    // Criando e imprimindo um video
	    System.out.println("Título: " + video.getTitulo());
	    System.out.println("Diretor: " + video.getDiretor());
	    System.out.println("Elenco: " + video.getElenco());
	    System.out.println("Gênero: " + video.getGenero());
	    System.out.println("Sinopse: " + video.getSinopse());
	    System.out.println("Ano de Lançamento: " + video.getAnoLancamento());
	    System.out.println("Classificação Indicativa: " + video.getClassificacaoIndicativa());
	    
	    System.out.println("---------------FILME--------------------");
	    // Criando e imprimindo um filme
        Filme filme1 = new Filme("O Poderoso Chefão", "Francis Ford Coppola", 1972, 9.2, 175);
        
        // chamando o método imprimirFilme()
        filme1.imprimirFilme();
        
        // chamando métodos da classe Filme
        filme1.setDuracao(180);
        System.out.println("Nova duração: " + filme1.getDuracao() + " minutos");
        
        System.out.println("---------------SÉRIE--------------------");
        Serie serie = new Serie("Breaking Bad", 1, 5);
     // Exibir informações sobre a série
        System.out.println("Nome da série: " + serie.getNome());
        System.out.println("Temporada atual: " + serie.getTemporadaAtual());
        System.out.println("Total de temporadas: " + serie.getTotalTemporadas());
        
        // Assistir alguns episódios
        serie.assistirProximoEpisodio();
        serie.assistirProximoEpisodio();
        
        // Definir a temporada atual
        serie.setTemporadaAtual(3);
        System.out.println("Temporada atual: " + serie.getTemporadaAtual());


	}


}
