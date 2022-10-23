public class Father extends Person {
    private String children;

    public Father(int id, String parent, String name, String children) {
        super(id, parent, name);
        this.children = children;
    }

    public Father(String parent, String children) {
        this.children = children;
    }

    @Override
    public String toString() {
        return "Person [parent = " + parent + ", name = " + name + ", children = " + children + "]";
    }

}
