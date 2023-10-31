package senac.domain.funcionalidades.funcionalidade_dado;

import java.util.ArrayList;

public class LancadorDeDados{

    private final LogRolagens log = new LogRolagens();

    public void rolagemDeDados(int qtd, TipoDado dado) {

        ArrayList<Integer> valoresDados = new ArrayList<>();
        int valorTotRolagem = 0;

        for (int i = 0; i < qtd; i++) {
            int numeroRandomizado = (int) (Math.random() * dado.getLados()) + 1;
            valoresDados.add(numeroRandomizado);
        }

        for (Integer valor : valoresDados) {
            valorTotRolagem += valor;
        }

        Rolagem rolagem = new Rolagem(valorTotRolagem, valoresDados);
        log.salvarRolagem(rolagem);

        System.out.printf("Rolagem com Sucesso!!!\n");
    }

    public void imprimirLog(){
        System.out.println(log.getLog());
    }

    public void mostrarUltimaRolagem(){
        System.out.println(log.getStrUltimaRolagem());
    }

//
//     public String mostrarUltimaRolagem(){
////
////        StringBuilder sb = new StringBuilder("Rolagem: " + valorTotRolagem + " (");
////       ListIterator<Integer> listIterator = valoresDados.listIterator();
//        while (listIterator.hasNext()) {
//            // System.out.println(listIterator.previousIndex());
//            // -2 porque ele começa no -1, sempre pega o próximo
//            if(listIterator.previousIndex() != valoresDados.size()-2){
//                sb.append(listIterator.next().toString() + ", ");
//
//            }
//            else{
//                sb.append(listIterator.next().toString() + ")");
//            }
//        }
//        return sb.toString();
//    }
//
//
//    public String mostrarRolagem(){
//        this.getValoresDados();
//        return "";
//    }
//
//
//    public int getValorTotRolagem() {
//        return valorTotRolagem;
//    }
//
//    public void setValorTotRolagem(int valorTotRolagem) {
//        this.valorTotRolagem = valorTotRolagem;
//    }
//
//    public ArrayList<Integer> getValoresDados() {
//        return valoresDados;
//    }
//
//    public void setValoresDados(ArrayList<Integer> valoresDados) {
//        this.valoresDados = valoresDados;
//    }
// mostrar rolagem atual
//
//
//    @Override
//    public String toString() {
//        return "(" + valorTotRolagem + ") " + this.getValoresDados();
//    }

}
