import java.util.HashMap;

public class ContagemPalavras {
    HashMap<String, Integer> contagemPalavras;

    public ContagemPalavras() {
        contagemPalavras = new HashMap<>();
    }
    public void adicionaContagemPalavra(String palavra, int contagem) {
        contagemPalavras.put(palavra, contagem);
    }
    public void removerContagemPalavra(String palavra) {
        contagemPalavras.remove(palavra);
    }
    public void ExibirContagemPalavra(){
        System.out.println(contagemPalavras);
    }
    public String EncontrarPalavraMaisFrequente(){
        String palavraMaisFrequente="";
        Integer maior= Integer.MIN_VALUE;
        for (String palavra : contagemPalavras.keySet()) {
            if (contagemPalavras.get(palavra) > maior) {
                maior = contagemPalavras.get(palavra);
                palavraMaisFrequente = palavra;
            }
        }
        return palavraMaisFrequente;
    }

}
