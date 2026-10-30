class vehicle2 {

    public void Start() {
        System.out.println("Vehicle started");
    }
}
class car2 extends vehicle2 {

    @Override
    public void Start() {
        System.out.println("Car started");
    }
}

public class RuntimePolymorphism {

    public static void main(String[] args) {

        vehicle2 v = new car2();

        v.Start();
    }
}
