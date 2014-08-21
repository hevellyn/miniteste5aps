package pedidos;

public class BoloAndares extends Pedido{
	private String quantCamadas;
	private String sabor;
	private String recheio;
	private String cobertura;
	
	public String toString(){
		String s = "";
		s += this.getQuantidade();
		s += "#"+this.getData();
		s += "#"+this.getContratante();
		s += "#"+this.getQuantCamadas();
		s += "#"+this.getSabor();
		s += "#"+this.getRecheio();
		s += "#"+this.getCobertura();
		return s;
	}

	public String getQuantCamadas() {
		return quantCamadas;
	}

	public void setQuantCamadas(String quantCamadas) {
		this.quantCamadas = quantCamadas;
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public String getRecheio() {
		return recheio;
	}

	public void setRecheio(String recheio) {
		this.recheio = recheio;
	}

	public String getCobertura() {
		return cobertura;
	}

	public void setCobertura(String cobertura) {
		this.cobertura = cobertura;
	}
}
