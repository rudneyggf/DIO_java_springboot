public class TesteConjuntoPalavras {
    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavras = new ConjuntoPalavrasUnicas();
        conjuntoPalavras.adicionaPalavra("Nani");
        conjuntoPalavras.adicionaPalavra("Dani");
        conjuntoPalavras.adicionaPalavra("Shalashaska");
        conjuntoPalavras.adicionaPalavra("Michael");
        conjuntoPalavras.exibirPalavras();
        conjuntoPalavras.removerPalavra("Michael");
        conjuntoPalavras.exibirPalavras();
        conjuntoPalavras.VerificaPalavra("Michael");
        conjuntoPalavras.VerificaPalavra("Nani");
    }
}
