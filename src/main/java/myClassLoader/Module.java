package myClassLoader;

/**
 * Created by Dmitry on 23.02.2017.
 */
public interface Module {

    public static final int EXIT_SUCCESS = 0;
    public static final int EXIT_FAILURE = 1;

    public void load();

    public int run();

    public void unload();

}