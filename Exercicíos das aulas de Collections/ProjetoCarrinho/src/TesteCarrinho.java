public class TesteCarrinho {
    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionarItem("leite",4.5,6);
        carrinho.adicionarItem("café",2.5,5);
        carrinho.adicionarItem("arroz",20,2);

        carrinho.exibirItems();

        System.out.println(carrinho.calcularValorTotal());

        carrinho.removerItem("leite");
        carrinho.exibirItems();
    }
}
