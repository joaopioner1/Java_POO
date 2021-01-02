package class14;

public class Video implements AcoesVideo {
	
	private String titulo;
	private double avaliacao;
	private int views, curtidas;
	private boolean reproduzindo;
	
	public Video(String titulo) {
		
		this.setTitulo(titulo);
		this.setAvaliacao(1);
		this.setCurtidas(0);
		this.setViews(0);
		this.setReproduzindo(false);
	}
	
	@Override
	public void play() {
		this.setReproduzindo(true);
	}
	@Override
	public void pause() {
		this.setReproduzindo(false);
	}
	@Override
	public void like() {
		this.setCurtidas(this.getCurtidas() + 1);
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public double getAvaliacao() {
		return avaliacao;
	}
	
	public void setAvaliacao(double avaliacao) {
		this.avaliacao = avaliacao;
	}
	
	public int getViews() {
		return views;
	}
	
	public void setViews(int views) {
		this.views = views;
	}
	
	public int getCurtidas() {
		return curtidas;
	}
	
	public void setCurtidas(int curtidas) {
		this.curtidas = curtidas;
	}
	
	public boolean isReproduzindo() {
		return reproduzindo;
	}
	
	public void setReproduzindo(boolean reproduzindo) {
		this.reproduzindo = reproduzindo;
	}
	
	
}
