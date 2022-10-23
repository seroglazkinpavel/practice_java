public class Children extends Person {

    public Children(int id, String parent, String name) {
        super(id, parent, name);
    }

    public Children() {
    }

    @Override
    public String toString() {
        return "Children [name = " + name + "]";
    }

}
