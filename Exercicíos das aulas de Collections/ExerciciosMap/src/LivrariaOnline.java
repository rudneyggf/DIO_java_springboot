import java.util.*;

public class LivrariaOnline {
    HashMap<String,Livro> livros;
    public LivrariaOnline() {
        this.livros = new HashMap<>();
    }
    public void adicionarLivro(String link, String titulo, String autor, double preco) {
        Livro l = new Livro(titulo, autor, preco);
        this.livros.put(link, l);
    }
    public void  removeLivro(String link) {
        this.livros.remove(link);
    }
    public Livro obterLivroMaisCaro(){
        double maiorPreco=Double.MIN_VALUE;
        Livro LivroMaisCaro=null;
        for(Livro l : this.livros.values()){
            if(l.getPreco()>maiorPreco){
                maiorPreco=l.getPreco();
                LivroMaisCaro=l;
            }
        }
        return LivroMaisCaro;
    }

    public Livro obterLivroMaisBarato(){
        double menorPreco=Double.MAX_VALUE;
        Livro LivroMaisBarato=null;
        for(Livro l : this.livros.values()){
            if(l.getPreco()<menorPreco){
                menorPreco=l.getPreco();
                LivroMaisBarato=l;
            }
        }
        return LivroMaisBarato;
    }

    public Set<Livro> PesquisarPorAutor(String autor){
        Set<Livro> livrosPesquisado = new HashSet<>();
        for(Livro l : this.livros.values()){
            if(l.getAutor().equalsIgnoreCase(autor)){
                livrosPesquisado.add(l);
            }
        }
        return livrosPesquisado;
    }

    public List<Livro> ExibirLivrosPrecoAsc(){
        List<Livro> livrosPrecoAsc = new ArrayList<>();
        for(Livro l : this.livros.values()){
            livrosPrecoAsc.add(l);
        }
        Collections.sort(livrosPrecoAsc);
        for(Livro l : livrosPrecoAsc){
            System.out.println(l.toString());
        }
        return livrosPrecoAsc;
    }
}
