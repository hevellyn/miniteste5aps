package pedidos;

import java.util.ArrayList;
import java.util.List;

public class Cadastrante {
	private List<Pedido> pedidos;
	
	
	public List<Pedido> getPedidos() {
		return pedidos;
	}

	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}

	public Cadastrante() {
		pedidos = new ArrayList<Pedido>();
	}
	
	public void cadastrarPedido(String pedido, Gerador gerador) {
		pedidos.add(gerador.gerarPedido(pedido));
	}

}
