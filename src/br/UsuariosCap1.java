package br;

import java.util.List;
import java.util.Arrays;

import br.com.lambda.Usuario;

public class UsuariosCap1 {
   public static void main(String[] args) {
    Usuario user = new Usuario("Benevanio", 150, "082.882.745-10");
    Usuario user2 = new Usuario("Beniel", 120, "082.882.745-10");
    Usuario user3 = new Usuario("Bene", 90, "082.882.745-10");
    Usuario user4 = new Usuario("Nikola Tesla", 150, "082.882.745-10");
    Usuario user5 = new Usuario("Ada Lovelace", 150, "082.882.745-10");
    Usuario user6 = new Usuario("Alan Turing", 150, "082.882.745-10");
    Usuario user7 = new Usuario("Grace Hopper", 150, "082.882.745-10");

    List<Usuario> usuarios = Arrays.asList(user, user2, user3, user4, user5, user6, user7);

    usuarios.forEach(u -> {
      u.tornaModerador();
      System.out.println(u.getNome());
    }); 
   }

}
