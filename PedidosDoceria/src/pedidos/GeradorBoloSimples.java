package pedidos;

public class GeradorBoloSimples implements Gerador {

	@Override
	public Pedido gerarPedido(String pedido) {
		BoloSimples bolo = new BoloSimples();
		String[] detalhes = pedido.split("#");
		bolo.setQuantidade(detalhes[0]);
		bolo.setData(detalhes[1]);
		bolo.setContratante(detalhes[2]);
		bolo.setSabor(detalhes[3]);
		bolo.setCobertura(detalhes[4]);
		return bolo;
	}

}
