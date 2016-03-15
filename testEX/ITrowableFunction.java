/**
 * Created by lyz on 3/15/16.
 */
@FunctionalInterface
public interface ITrowableFunction<T, R> {
    public R apply(T t) throws Exception;

    static <T> ThrowableFunction<T, T> identity() {
        return t -> t;
    }
}
