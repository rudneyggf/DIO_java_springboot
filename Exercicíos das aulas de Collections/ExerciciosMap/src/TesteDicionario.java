public class TesteDicionario {
    public static void main(String[] args) {
        Dicionario d = new Dicionario();
        d.adicionarPalavra("Omar","Apatia");
        d.adicionarPalavra("Abraão","Enrolar");
        d.adicionarPalavra("João Carlos","Join");
        d.exibirPalavras();
        d.removerPalavra("Omar");
        d.exibirPalavras();
        System.out.println(d.pesquisarDefinicaoPorPalavra("Abraão"));
    }
}
