import java.util.List;
import java.util.Arrays;
import br.com.lambda.Usuario;

public class App {
    public static void main(String[] args) throws Exception {
        
        Usuario user1 = new Usuario("Benevanio", 150);
        Usuario user2 = new Usuario("BeneTesla", 120);
        Usuario user3 = new Usuario("Beniel", 190);

        List<Usuario> usuarios = Arrays.asList(user1, user2, user3);

        for (Usuario u : usuarios) {
            System.out.println(u.getNome() + " - " + u.getPontos());
        }
    }
}
