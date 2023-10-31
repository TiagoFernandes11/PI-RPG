package senac.domain.funcionalidades.funcionalidade_dado;

import lombok.Data;

import java.util.ArrayList;
import java.util.ListIterator;

@Data
public class LogRolagens {

    private ArrayList<ArrayList<Integer>> todasRolagens;
    private ArrayList<Integer> somaRolagens;

    public LogRolagens() {
        this.todasRolagens = new ArrayList<>();
        this.somaRolagens = new ArrayList<>();
    }

    // invocar ele em toda a rolagem de dados

    public void salvarRolagem(ArrayList<Integer> rolagem, Integer somaRolagem){
        todasRolagens.add(rolagem);
        somaRolagens.add(somaRolagem);
        System.out.println("Rolagem salva no Log");
    }

    public void imprimirLog(){
        String s = "";
        ListIterator<ArrayList<Integer>> listIterator = todasRolagens.listIterator();
        while(listIterator.hasNext()){
            s += "Rolagem " + (listIterator.nextIndex() + 1) + " : " + "soma("+ somaRolagens.get(listIterator.nextIndex()) +") - "  + listIterator.next() + "\n";
        }
        System.out.println(s);
    }
}
