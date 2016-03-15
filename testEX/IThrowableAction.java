/**
 * Created by lyz on 3/15/16.
 */
@FunctionalInterface
public interface IThrowableAction {

    public void call(T t)
            throws Exception;
}
