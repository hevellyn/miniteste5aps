package pedidos;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

public class PedidosTest {
	private Cadastrante cadastrante;
	@Before
	public void criarGerente(){
		cadastrante = new Cadastrante();
	}
	
	@Test
	public void cadastrarPedidoDocinho() {
		String pedido = "1000#02/02/2015#maria lucia#brigadeiro";
		cadastrante.cadastrarPedido(pedido, new GeradorDocinho());
		Assert.assertEquals(1, cadastrante.getPedidos().size());
		Assert.assertEquals(pedido, cadastrante.getPedidos().get(0).toString());
	}
	@Test
	public void cadastrarPedidoBoloSimples(){
		String pedido = "2#10/02/2015#joao carlos#chocolate#morango";
		cadastrante.cadastrarPedido(pedido, new GeradorBoloSimples());
		Assert.assertEquals(1, cadastrante.getPedidos().size());
		Assert.assertEquals(pedido, cadastrante.getPedidos().get(0).toString());
	}
	@Test
	public void cadastrarPedidoBoloAndares(){
		String pedido = "1#10/04/2015#maria josés#3#baunilha#chocolate#morango";
		cadastrante.cadastrarPedido(pedido, new GeradorBoloAndares());
		Assert.assertEquals(1, cadastrante.getPedidos().size());
		Assert.assertEquals(pedido, cadastrante.getPedidos().get(0).toString());
	}

}
