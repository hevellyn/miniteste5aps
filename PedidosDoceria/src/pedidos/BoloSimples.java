package pedidos;

public class BoloSimples extends Pedido{
	private String sabor;
	private String cobertura;
	
	
	
	public String toString(){
		String s = "";
		s += this.getQuantidade();
		s += "#"+this.getData();
		s += "#"+this.getContratante();
		s += "#"+this.getSabor();
		s += "#"+this.getCobertura();
		
		return s;
	}
	public String getSabor() {
		return sabor;
	}
	public void setSabor(String sabor) {
		this.sabor = sabor;
	}
	public String getCobertura() {
		return cobertura;
	}
	public void setCobertura(String cobertura) {
		this.cobertura = cobertura;
	}
}
