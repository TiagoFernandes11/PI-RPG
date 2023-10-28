package senac.domain.teste_dado;

import java.util.ArrayList;
import java.util.ListIterator;

public class LogRolagens {

    private ArrayList<ArrayList<Integer>> todasRolagens;

    public LogRolagens() {
        this.todasRolagens = new ArrayList<>();
    }

    // invocar ele em toda a rolagem de dados

    public ArrayList<ArrayList<Integer>> getTodasRolagens() {
        return todasRolagens;
    }


    public void salvarRolagem(ArrayList<Integer> rolagem){
        todasRolagens.add(rolagem);
        System.out.println("Rolagem salva no Log");
    }
}
