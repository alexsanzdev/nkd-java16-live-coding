package live_coding.general_class;

public class GenericDataContainer <T> {

    private T data;

    public void reset() {
        data = null;
    }

    public boolean isEmpty() {
        return data == null;
    }

    public T get() {
        return data;
    }

    public void put(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "DataContainer{" +
                "data=" + data +
                '}';
    }
}
