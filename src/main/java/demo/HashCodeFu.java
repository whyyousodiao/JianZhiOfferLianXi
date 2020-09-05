package demo;

import java.util.Objects;

public class HashCodeFu {
    Integer integer1;
    Integer integer2;
    String string1;

    /*@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HashCodeFu that = (HashCodeFu) o;

        if (!integer1.equals(that.integer1)) return false;
        if (integer2 != null ? !integer2.equals(that.integer2) : that.integer2 != null) return false;
        return string1 != null ? string1.equals(that.string1) : that.string1 == null;
    }

    @Override
    public int hashCode() {
        int result = integer1.hashCode();
        result = 31 * result + (integer2 != null ? integer2.hashCode() : 0);
        result = 31 * result + (string1 != null ? string1.hashCode() : 0);
        return result;
    }*/

    /*@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HashCodeFu that = (HashCodeFu) o;

        if (integer1 != null ? !integer1.equals(that.integer1) : that.integer1 != null) return false;
        if (integer2 != null ? !integer2.equals(that.integer2) : that.integer2 != null) return false;
        return string1 != null ? string1.equals(that.string1) : that.string1 == null;
    }

    @Override
    public int hashCode() {
        int result = integer1 != null ? integer1.hashCode() : 0;
        result = 31 * result + (integer2 != null ? integer2.hashCode() : 0);
        result = 31 * result + (string1 != null ? string1.hashCode() : 0);
        return result;
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HashCodeFu that = (HashCodeFu) o;
        return Objects.equals(integer1, that.integer1) &&
                Objects.equals(integer2, that.integer2) &&
                Objects.equals(string1, that.string1);
    }

    @Override
    public int hashCode() {
        return Objects.hash(integer1, integer2, string1);
    }
}
