package senac.domain.teste_dado;

import java.util.ArrayList;
import java.util.ListIterator;

public class Dado {

    private int valorTotRolagem;
    private ArrayList<Integer> valoresDados;

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

    // mostrar rolagem atual
//    @Override
//    public String toString() {
//
//        ;
//    }
}
