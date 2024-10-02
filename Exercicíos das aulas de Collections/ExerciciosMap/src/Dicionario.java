import java.util.HashMap;

public class Dicionario {
    HashMap<String,String> conceitos;

    public Dicionario() {
        conceitos = new HashMap<>();
    }

    public void adicionarPalavra(String palavra , String definicao) {
        conceitos.put(palavra,definicao);
    }

    public  void removerPalavra(String palavra) {
        conceitos.remove(palavra);
    }
    public void  exibirPalavras() {
        System.out.println(conceitos);
    }
    public String pesquisarDefinicaoPorPalavra(String palavra) {
        return conceitos.get(palavra);
    }

}
