package br.com.lambda;
@FunctionalInterface
public interface Validator<T> {
    boolean valida(T t);
}
