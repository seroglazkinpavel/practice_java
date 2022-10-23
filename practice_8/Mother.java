public class Mother extends Person {
    private String children;

    public Mother(int id, String parent, String name, String children) {
        super(id, parent, name);
        this.children = children;
    }

    public Mother(String parent, String children) {
        this.children = children;
    }

    @Override
    public String toString() {
        return "Person [parent = " + parent + ", name = " + name + ", children = " + children + "]";
    }

}
