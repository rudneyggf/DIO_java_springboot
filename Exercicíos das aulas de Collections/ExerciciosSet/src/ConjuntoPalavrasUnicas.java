import java.util.HashSet;

public class ConjuntoPalavrasUnicas {
    private HashSet<String> palavras;

    public ConjuntoPalavrasUnicas() {
        this.palavras = new HashSet<>();
    }

    public void adicionaPalavra(String palavra) {
        this.palavras.add(palavra);
    }

    public void removerPalavra(String palavra) {
        this.palavras.remove(palavra);
    }

    public void VerificaPalavra(String palavra) {
        if (this.palavras.contains(palavra)) {
            System.out.println("Palavra está no conjunto");
        }else{
            System.out.println("A palavra não está no conjunto");
        }
    }

    public void exibirPalavras() {
        System.out.println(this.palavras);
    }
}
