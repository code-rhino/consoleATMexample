package sandbox.bakeryitems;

public abstract class BakeryItem {
    private String name;

    public BakeryItem(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "BakeryItem{" +
                "name='" + name + '\'' +
                '}';
    }
}
