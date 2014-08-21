package pedidos;

public class Docinho extends Pedido {
	private String tipo;
	
	public String toString(){
		String s = "";
		s += this.getQuantidade();
		s += "#"+this.getData();
		s += "#"+this.getContratante();
		s += "#"+this.getTipo();
		return s;
	}
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}
