import java.util.HashSet;

public class ListaTarefas {
    private HashSet<Tarefa> tarefas;

    public ListaTarefas() {
        this.tarefas = new HashSet();
    }
    public void adicionaTarefa(Tarefa tarefa){
        this.tarefas.add(tarefa);
    }
    public void removerTarefa(Tarefa tarefa){
        this.tarefas.remove(tarefa);
    }
    public void exibirTarefas(){
        System.out.println(this.tarefas);
    }
    public void contarTarefas(){
        System.out.println(this.tarefas.size());
    }
    public HashSet<Tarefa> obterTarefasConcluidas(){
       HashSet<Tarefa> tarefasConcluidas = new HashSet<>();
       for(Tarefa tarefa : this.tarefas){
           if (tarefa.isConcluido())
               tarefasConcluidas.add(tarefa);
       }
       return tarefasConcluidas;
    }

    public HashSet<Tarefa> obterTarefasPendentes(){
        HashSet<Tarefa> tarefasPendentes = new HashSet<>();
        for(Tarefa tarefa : this.tarefas){
            if (!tarefa.isConcluido())
                tarefasPendentes.add(tarefa);
        }
        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao){
        for (Tarefa tarefa : this.tarefas) {
            if (tarefa.getDescricao().equalsIgnoreCase(descricao))
                tarefa.setConcluido(true);
            break;
        }
    }
    public void marcarTarefaPendente(String descricao){
        for (Tarefa tarefa : this.tarefas) {
            if (tarefa.getDescricao().equalsIgnoreCase(descricao))
                tarefa.setConcluido(false);
        }
    }
    public void limparLista(){
        this.tarefas.clear();
    }
}
