package tema9;

public abstract class Shape {
    abstract void getArea();
    abstract void getPerimeter();
     protected String color;
     protected String fiiled;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFiiled() {
        return fiiled;
    }

    public void setFiiled(String fiiled) {
        this.fiiled = fiiled;
    }

    @Override
    public String toString() {
        System.out.println(" The color is blue");
        return " ";
    }
}
