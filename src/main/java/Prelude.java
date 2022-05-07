import java.util.function.Function;

public class Main {
    @org.jetbrains.annotations.NotNull
    @org.jetbrains.annotations.Contract(pure = true)
    public static Function<Integer, Function<Integer, Integer>> add() {
        return x -> y -> x + y;
    }
}
