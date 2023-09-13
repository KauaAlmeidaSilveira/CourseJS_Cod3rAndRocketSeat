package GenericsSetMap;

import Model.Entities.Client;

public class HashCodeEquals {
    public static void main(String[] args) {
        Client c1 = new Client("Maria", "maria@gmail.com");
        Client c2 = new Client("Maria", "maria@gmail.com");

        System.out.println(c1.equals(c2)); // Compara o conteudo
        System.out.println(c1 == c2); // Compara a referencia, a não ser se for valores literais, como "str" == "str"
    }
}
