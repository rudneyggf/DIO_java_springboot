import java.util.*;

public class GerenciadorAlunos {
    HashSet<Aluno> alunos;

    public GerenciadorAlunos() {
        alunos = new HashSet<>();
    }
    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }
    public void removerAluno(Aluno aluno) {
        alunos.remove(aluno);
    }
    public void exibirAlunos(){
        System.out.println(this.alunos);
    }
    public Set<Aluno> OrdenarPorNome(){
        TreeSet<Aluno> alunosPorNome = new TreeSet<>();
        return alunosPorNome;
    }
    public Set<Aluno> OrdenarPorNota(){
        TreeSet<Aluno> alunosPorNota= new TreeSet<>(new ComparadorNota());
        alunosPorNota.addAll(alunos);
        return alunosPorNota;
    }
}
