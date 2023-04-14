import br.com.lambda.Usuario;
import br.com.lambda.Validator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
public class App {
    public static void main(String[] args) {
        Usuario user1 = new Usuario("Benevanio", 150, "082.882.745-10");
        Usuario user2 = new Usuario("Beniel", 120, "082.882.745-10");
        Usuario user3 = new Usuario("Bene", 90, "082.882.745-10");
        user1.tornaModerador();
        Usuario user4 = new Usuario("Nikola Tesla", 150, "082.882.745-10");
        Runnable UserRun = () -> user4.tornaModerador();
        UserRun.run();
        List<Usuario> usuarios = Arrays.asList(user1, user2, user3);
        Validator<Usuario> validaCPF = new Validator<Usuario>() {
            public boolean valida(Usuario u) {
                if (u.getCpf().length() == 14) {
                    System.out.println("CPF válido");
                    return u.matches("[0-9]{3}.[0-9]{3}.[0-9]{3}-[0-9]{2}");
                } else {
                    System.out.println("CPF inválido");
                    return false;
                }
            }
        };
        validaCPF.valida(user1);
        usuarios.sort(Comparator.comparing(Usuario::getNome));
        Consumer<Usuario> mostraMensagem = new Consumer<Usuario>() {
            public void accept(Usuario u) {
                System.out.println("Salvando usuário " + u.getNome());
            }
        };
        Consumer<Usuario> imprimeNome = new Consumer<Usuario>() {
            public void accept(Usuario u) {
                System.out.println(u.getNome());
            }
        };
        Predicate<Usuario> ehModerador = new Predicate<Usuario>() {
            public boolean test(Usuario u) {
                return u.isModerador();
            }
        };
        ToIntFunction<String> tamanho = new ToIntFunction<String>() {
            public int applyAsInt(String s) {
                return s.length();
            }
        };

        Function<Usuario, String> byName = new Function<Usuario, String>() {
            public String apply(Usuario u) {
                return u.getNome();
            }
        };
        usuarios.sort(Comparator.comparing(byName));
        // use comparator.reversed para comparar o numero de pontos de forma decrescente
        usuarios.sort(Comparator.comparingInt(Usuario::getPontos).reversed());
        System.out.println("Estamos usando o reverside para ordenar os pontos de forma decrescente");
        System.out.println(tamanho.applyAsInt("Benevanio"));
        usuarios.stream().filter(ehModerador).forEach(imprimeNome);
        usuarios.sort((u1, u2) -> u1.getNome().compareTo(u2.getNome()));
        usuarios.forEach(mostraMensagem.andThen(imprimeNome));
        List<String> palavras = Arrays.asList("Dragon ball", "Naruto", "One piece", "Bleach");
        palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
        palavras.forEach(s -> System.out.println(s));
    }
}