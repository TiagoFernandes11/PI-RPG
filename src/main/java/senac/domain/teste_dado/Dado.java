package senac.domain.teste_dado;

import java.util.ArrayList;
import java.util.ListIterator;

public class Dado {

    private int valorTotRolagem;
    private ArrayList<Integer> valoresDados;
    private final LogRolagens log = new LogRolagens();

    public void rolagemDeDados(int qtd, TipoDado dado) {

        valoresDados = new ArrayList<>();


        int resultado = 0;
        for (int i = 0; i < qtd; i++) {
            int numeroRandomizado = (int) (Math.random() * dado.getLados()) + 1;
            valoresDados.add(numeroRandomizado);
        }

        ListIterator<Integer> listIterator = valoresDados.listIterator();
        while (listIterator.hasNext()) {
            resultado += listIterator.next();
        }
        valorTotRolagem = resultado;

        log.salvarRolagem(valoresDados);

        System.out.printf("Rolagem com Sucesso!!!\n");
    }

    public void mostrarRolagem(){

        StringBuilder sb = new StringBuilder("Rolagem: " + valorTotRolagem + " (");
        ListIterator<Integer> listIterator = valoresDados.listIterator();
        while (listIterator.hasNext()) {
            // System.out.println(listIterator.previousIndex());
            // -2 porque ele começa no -1, sempre pega o próximo
            if(listIterator.previousIndex() != valoresDados.size()-2){
                sb.append(listIterator.next().toString() + ", ");

            }
            else{
                sb.append(listIterator.next().toString() + ")");
            }
        }
        System.out.println(sb);
    }

    public void imprimirTodasRolagens(){

        // Iterando sobre o ArrayList principal
        ListIterator<ArrayList<Integer>> iterator = log.getTodasRolagens().listIterator();
        while (iterator.hasNext()) {
            ArrayList<Integer> rolagem = iterator.next();
            System.out.println("Rolagem " + iterator.nextIndex() + " - " + rolagem.toString());
            /*
            // Iterando sobre os ArrayLists internos
            Iterator<Integer> iteratorInterno = rolagem.iterator();
            while (iteratorInterno.hasNext()) {
                Integer valor = iteratorInterno.next();
                System.out.println("Valor: " + valor);
            }*/
        }
    }


    // mostrar rolagem atual
//    @Override
//    public String toString() {
//
//        ;
//    }
}
