package live_coding.general_class;

public class DataContainer {

    private Object data;

    public void reset() {
        data = null;
    }

    public boolean isEmpty() {
        return data == null;
    }

    public Object get() {
        return data;
    }

    public void put(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "DataContainer{" +
                "data=" + data +
                '}';
    }
}
