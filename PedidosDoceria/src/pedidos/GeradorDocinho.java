package pedidos;

public class GeradorDocinho implements Gerador {

	@Override
	public Pedido gerarPedido(String pedido) {
		Docinho p = new Docinho();
		String[] detalhes = pedido.split("#");
		p.setQuantidade(detalhes[0]);
		p.setData(detalhes[1]);
		p.setContratante(detalhes[2]);
		p.setTipo(detalhes[3]);
		return p;
	}

}
