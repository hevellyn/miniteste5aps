package pedidos;

public class GeradorBoloAndares implements Gerador {

	@Override
	public Pedido gerarPedido(String pedido) {
		BoloAndares bolo = new BoloAndares();
		String[] detalhes = pedido.split("#");
		bolo.setQuantidade(detalhes[0]);
		bolo.setData(detalhes[1]);
		bolo.setContratante(detalhes[2]);
		bolo.setQuantCamadas(detalhes[3]);
		bolo.setSabor(detalhes[4]);
		bolo.setRecheio(detalhes[5]);
		bolo.setCobertura(detalhes[6]);
		return bolo;
	}

}
