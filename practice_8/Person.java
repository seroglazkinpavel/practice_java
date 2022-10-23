public abstract class Person {
    protected String name;
    protected String parent;
    protected int id;

    public Person(int id, String parent, String name) {
        this.parent = parent;
        this.name = name;
        this.id = id;
    }

    public Person() {
    }

    @Override
    public String toString() {
        return "Person [parent=" + parent + ", name=" + name + "]";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getParents() {
        return parent;
    }

    public void setParents(String parents) {
        this.parent = parent;
    }

    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
