package br.com.lambda;

import java.util.Objects;

@FunctionalInterface
public interface Consumer<T> {
    void accept(Usuario u);

    default Consumer<Usuario> andThen(Consumer<? super Usuario> after) {
        Objects.requireNonNull(after);
        return (Usuario t) -> {
            accept(t);
            after.accept(t);
        };
    }
}
