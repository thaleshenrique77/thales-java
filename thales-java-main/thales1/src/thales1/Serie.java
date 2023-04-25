package thales1;

public class Serie {
	  // Atributos da classe
	  private String nome;
	  private int temporadaAtual;
	  private int totalTemporadas;
	  
	  // Construtor da classe
	  public Serie(String nome, int temporadaAtual, int totalTemporadas) {
	    this.nome = nome;
	    this.temporadaAtual = temporadaAtual;
	    this.totalTemporadas = totalTemporadas;
	  }
	  
	  // Métodos da classe
	  public void assistirProximoEpisodio() {
	    if (temporadaAtual < totalTemporadas) {
	      temporadaAtual++;
	      System.out.println("Assistindo episódio da temporada " + temporadaAtual);
	    } else {
	      System.out.println("Você já assistiu todos os episódios da série.");
	    }
	  }
	  
	  public void setTemporadaAtual(int temporadaAtual) {
	    this.temporadaAtual = temporadaAtual;
	  }
	  
	  public int getTemporadaAtual() {
	    return temporadaAtual;
	  }
	  
	  public int getTotalTemporadas() {
	    return totalTemporadas;
	  }
	  
	  public String getNome() {
	    return nome;
	  }
	  
	  public void setNome(String nome) {
	    this.nome = nome;
	  }
	}
