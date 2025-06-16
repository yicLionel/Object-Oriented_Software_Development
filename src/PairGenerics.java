/**
 * Write an immutable class Pair that accepts two type parameters T and U, and simply stores two objects
 * (one of type T and one of type U). The class should take in the two objects in its constructor.
 */

public class PairGenerics<T,U> {
    private final T first;
    private final U second;

    public PairGenerics(T first, U second) {
        this.first = first;
        this.second = second;
    }

    /**
     * Generics enables code reuse with different data types
     * @param args
     */
    public static void main(String[] args) {
        PairGenerics<String, Integer> si = new PairGenerics<>("abc",12);
        System.out.println("First: " + si.first);
        System.out.println("Second: " + si.second);
        PairGenerics<Boolean, Double> bd = new PairGenerics<>(true, 3.24);
        System.out.println("First: " + bd.first);
        System.out.println("Second: " + bd.second);
    }

}

