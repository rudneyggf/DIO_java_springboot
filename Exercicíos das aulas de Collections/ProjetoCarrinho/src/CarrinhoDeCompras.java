
import java.util.ArrayList;

public class CarrinhoDeCompras {
    private ArrayList<Item> compras;

    public CarrinhoDeCompras() {
        this.compras= new ArrayList<>();
    }

    public ArrayList<Item> getCompras() {
        return compras;
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        Item item= new Item(nome,preco,quantidade);
        this.compras.add(item);
    }

    public void removerItem(String nome) {
        this.compras.removeIf(itemVerificarNome -> itemVerificarNome.getNome().equalsIgnoreCase(nome));
    }

    public double calcularValorTotal(){
        double valorTotal=0;
        for( Item item : compras){
            valorTotal += item.getPreco();
        }
        return valorTotal;
    }

    public void exibirItems(){
        for( Item item : compras){
            System.out.println(item.toString());
        }
    }
}
