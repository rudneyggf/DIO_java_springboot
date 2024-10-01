public class Tarefa {
    private String descricao;
    private boolean concluido;

    public Tarefa(String descricao, boolean concluido) {
        this.descricao = descricao;
        this.concluido = concluido;
    }

    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public void setConcluido(boolean concluido) {
        this.concluido = concluido;
    }
    public boolean isConcluido() {
        return concluido;
    }

}
