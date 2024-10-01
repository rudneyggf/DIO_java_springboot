import java.util.ArrayList;
import java.util.Collections;


public class OrdenacaoNumero {
    private ArrayList<Integer> numeros;

    public OrdenacaoNumero() {
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        this.numeros.add(numero);
    }

    public ArrayList<Integer> ordenarAscendente(){
        ArrayList<Integer> numerosAsc = new ArrayList<>(numeros);
        Collections.sort(numerosAsc);
        return numerosAsc;
    }

    public ArrayList<Integer> ordenarDescendente(){
        ArrayList<Integer> numerosDesc = new ArrayList<>(numeros);
        numerosDesc.sort(Collections.reverseOrder());
        return numerosDesc;
    }

}
