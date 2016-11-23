package live_coding.generic_method;

public final class Functions {

    private Functions() {}

    public static <T> T passThrough(T o) {
        return o;
    }

    public static <I extends Integer> I highestInteger(I a, I b) {
        return a.compareTo(b) == 1 ? a : b;
    }

    public static <N1 extends Number, N2 extends Number > Number highestNumber(N1 a, N2 b) {
        return a.longValue() > b.longValue() ? a : b;
    }

}
