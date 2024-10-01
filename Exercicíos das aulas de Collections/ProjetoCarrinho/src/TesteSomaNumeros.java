public class TesteSomaNumeros {
    public static void main(String[] args) {
        SomaNumeros soma = new SomaNumeros();
        soma.adicionarNumero(33);
        soma.adicionarNumero(34);
        soma.adicionarNumero(35);
        System.out.println(soma.calcularSoma());
        System.out.println(soma.encontrarMaiorNumero());
        System.out.println(soma.encontrarMaiorNumero());
        soma.exibirNumeros();
    }
}
