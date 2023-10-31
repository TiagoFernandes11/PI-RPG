package senac.domain.funcionalidades.funcionalidade_dado;

import lombok.Data;

import java.util.ArrayList;
@Data
public class Rolagem {

    private int valorTotRolagem;
    private ArrayList<Integer> valoresDados;
    private final LogRolagens log = new LogRolagens();

    public Rolagem(int valorTotRolagem, ArrayList<Integer> valoresDados) {
        this.valorTotRolagem = valorTotRolagem;
        this.valoresDados = valoresDados;
    }

    public int getValorTotRolagem() {
        return valorTotRolagem;
    }

    public void setValorTotRolagem(int valorTotRolagem) {
        this.valorTotRolagem = valorTotRolagem;
    }

    public ArrayList<Integer> getValoresDados() {
        return valoresDados;
    }

    public void setValoresDados(ArrayList<Integer> valoresDados) {
        this.valoresDados = valoresDados;
    }
// mostrar rolagem atual


    @Override
    public String toString() {
        return "Rolagem{" + "valorTotRolagem=" + valorTotRolagem + ", valoresDados=" + valoresDados + '}';
    }

    public String getTotEValores(){
        return "(" + valorTotRolagem + ") " + this.getValoresDados();
    }
}
