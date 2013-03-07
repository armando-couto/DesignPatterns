package padroesEstruturais.facade;

public class TestePedidoFacade {

	public static void main(String[] args) {
		
		Estoque estoque = new Estoque();
		Financeiro financeiro = new Financeiro();	
		PosVenda posVenda = new PosVenda();
		
		PedidoFacade facade = new PedidoFacade(estoque, financeiro, posVenda);
		
		Pedido pedido = new Pedido(" Notebook ", " Rafael Cosentino ", "Av Brigadeiro Faria Lima , 1571 , S�o Paulo , SP");
		facade.registraPedido(pedido);
	}
}