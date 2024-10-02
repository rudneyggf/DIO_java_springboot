public class TestaContagemPalavra {
    public static void main(String[] args) {
        ContagemPalavras contagemPalavra = new ContagemPalavras();
        contagemPalavra.adicionaContagemPalavra("Herinal",4);
        contagemPalavra.adicionaContagemPalavra("VovoG",15);
        contagemPalavra.adicionaContagemPalavra("Borbinha",7);
        contagemPalavra.adicionaContagemPalavra("Blankman",2);
        contagemPalavra.ExibirContagemPalavra();
        contagemPalavra.removerContagemPalavra("Blankman");
        contagemPalavra.ExibirContagemPalavra();
        System.out.println(contagemPalavra.EncontrarPalavraMaisFrequente());
    }
}
