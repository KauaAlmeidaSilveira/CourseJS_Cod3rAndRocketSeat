package GenericsSetMap;

import Model.Entities.Product;

import java.util.Set;
import java.util.TreeSet;

public class ComparatorTreeSet {
    public static void main(String[] args) {

        /*
            Para utilizar o TreeSet com a vantagem da ordenação é preciso que o tipo implemente Comparable<>
            desta forma ele consiguira ordenar os objetos utilizando o compareTo()
         */

        Set<Product> set = new TreeSet<>();

        set.add(new Product("TV", 900.0));
        set.add(new Product("Notebook", 1200.0));
        set.add(new Product("Tablet", 400.0));

        for (Product p : set) {
            System.out.println(p);
        }
    }
}
