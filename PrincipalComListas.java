package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("Homem Aranha", 2019);
        meuFilme.avalia(9);
        Filme novoFilme = new Filme("Naruto", 2023);
        novoFilme.avalia(6);
        Filme filmeDoPaulo = new Filme("Dogville", 2003);
        filmeDoPaulo.avalia(10);
        Serie lost = new Serie("Lost", 2000);


      List<Titulo> lista = new LinkedList<>();
        lista.add(filmeDoPaulo);
        lista.add(meuFilme);
        lista.add(novoFilme);
        lista.add(lost);

        for( Titulo item: lista){
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2){
                System.out.println("Classificação " + filme.getClassificacao());

            }


        }
        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("paulo");
        buscaPorArtista.add("Jaqueline");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("DEPOIS DA ORDENAÇÃO:");
        System.out.println(buscaPorArtista);
        System.out.println("Lista de titulo ordenados");

        Collections.sort(lista);
        System.out.println(lista);
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ano de lançamento: " + lista);

    }
}
