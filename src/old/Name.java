package old;

/**
 * Created by alex-training on 2016-11-10.
 */
public class Name {

    private int id;
    public String first;

    public Name(String first) {
        this.first = first;
    }

    public String toString() {
        return first;
    }

    @Override
    public boolean equals(Object otherObject) {
        if (otherObject != null && otherObject instanceof Name) {
            Name otherName = (Name) otherObject;
            return id == otherName.id;
        } else {
            return false;
        }
    }
}
