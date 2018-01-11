package projetofinal;

public class Video implements AcoesVideo{
	
	private String titulo;
	private int avaliacao;
	private int curtidas;
	private int view;
	private boolean reproduzindo;
	
	
	
	// Constructor
	
	public Video(String titulo) {
		
		this.titulo = titulo;
		this.avaliacao = 1;
		this.view = 0;
		this.setCurtidas(0);
		this.reproduzindo = false;
		
		
	}
	
	// Especial methods
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getAvaliacao() {
		return avaliacao;
	}
	public void setAvaliacao(int avaliacao) {
		int nova;
		
		nova = (this.avaliacao+avaliacao)/this.view;
		
		this.avaliacao = nova;
	}
	public int getCurtidas() {
		return curtidas;
	}
	public void setCurtidas(int curtidas) {
		this.curtidas = curtidas;
	}
	public int getView() {
		return view;
	}
	public void setView(int view) {
		this.view = view;
	}
	public boolean isReproduzindo() {
		return reproduzindo;
	}
	public void setReproduzindo(boolean reproduzindo) {
		this.reproduzindo = reproduzindo;
	}
	
	// Methods
	
	@Override
	public void play() {
		// TODO Auto-generated method stub
		if(!this.isReproduzindo()) {
			this.setReproduzindo(true);
			System.out.println("Reproduzindo");
		} else {System.out.println("Já está sendo Reproduzido!");}
		
	}
	
	@Override
	public void pause() {
		// TODO Auto-generated method stub
		if(this.isReproduzindo()) {
			setReproduzindo(false);
			System.out.println("Pausado");
		} else {
			System.out.println("Já está em pause");
		}
	}
	@Override
	public void like() {
		// TODO Auto-generated method stub
		this.setCurtidas(getCurtidas()+1);
		
	}

	@Override
	public String toString() {
		return "Video [titulo=" + titulo + ", avaliacao=" + avaliacao + ", curtidas=" + curtidas + ", view=" + view
				+ ", reproduzindo=" + isReproduzindo() + "]";
	}
	
	
	
	
	
	

}
