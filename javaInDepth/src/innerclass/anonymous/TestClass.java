package innerclass.anonymous;

public class TestClass {

    private String name = "Godoro";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void perform(){
        System.out.println("Class name: " + getName());
    }
}
