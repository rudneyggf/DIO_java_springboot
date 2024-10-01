public class TesteOrdenacaoNumeros {
    public static void main(String[] args) {
        OrdenacaoNumero ord = new OrdenacaoNumero();
        ord.adicionarNumero(10);
        ord.adicionarNumero(20);
        ord.adicionarNumero(30);
        ord.adicionarNumero(40);
        System.out.println(ord.ordenarAscendente());
        System.out.println(ord.ordenarDescendente());
    }
}
