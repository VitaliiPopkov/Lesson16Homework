public class Calculator<T> {
    public T add(T a, T b) {
        if (a.getClass().equals(Integer.class)) {
            return (T) (Object) ((Integer) a + (Integer) b);

        }
        if (a.getClass().equals(Double.class)) {
            return (T) (Object) ((Double) a + (Double) b);

        }
        return (T) (Object) 0;
    }

    public T minus(T a1, T b1) {
        if (a1.getClass().equals(Integer.class)) {
            return (T) (Object) ((Integer) a1 - (Integer) b1);

        }
        if (a1.getClass().equals(Double.class)) {
            return (T) (Object) ((Double) a1 - (Double) b1);

        }
        return (T) (Object) 0;
    }
}

