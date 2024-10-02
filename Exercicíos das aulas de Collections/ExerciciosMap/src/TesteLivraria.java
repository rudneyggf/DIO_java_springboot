public class TesteLivraria {
    public static void main(String[] args) {
        LivrariaOnline livraria = new LivrariaOnline();
        livraria.adicionarLivro("A","Xiriney","Nasle",20);
        livraria.adicionarLivro("B","Manifestação da Praga","Rudney",200);
        livraria.adicionarLivro("C","Strad Corno", "Geraldo",50);
        livraria.ExibirLivrosPrecoAsc();
    }
}
