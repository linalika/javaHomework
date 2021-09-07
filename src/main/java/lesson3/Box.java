package lesson3;

public class Box {
    private Object object;

    public Box(Object object) {
        this.object = object;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    @Override
    public String toString() {
        return "Box{" +
                "object=" + object +
                '}';
    }

    public static void main(String[] args) {
        Box box1 = new Box(5);
        Box box2 = new Box(10);
        Box box3 = new Box("reeer");
        System.out.println(box1.getObject().getClass());
        int sum = (Integer) box1.getObject() + (Integer) box2.getObject();
        int sum2 = (Integer) box1.getObject() + (Integer) box3.getObject();
    }
}
