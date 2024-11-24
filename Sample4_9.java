public class Sample4_9 {
    public static void main(String[] args) {
        Car9[] cars;
        cars = new Car9[2];

        cars[0] = new Car9();
        cars[0].setCar(1234, 20.5);

        cars[1] = new RacingCar9();
        cars[1].setCar(4597, 30.5);

        for (int i = 0; i < cars.length; i++) {
            Class cl = cars[i].getClass();
            System.out.println("第" + (i + 1) + "個物件的類別是" + cl);
        }
    }
}

class Car9 {
    protected int num;
    protected double gas;

    public Car9() {
        num = 0;
        gas = 0.0;
        System.out.println("生產了車子");
    }

    public void setCar(int n, double g) {
        num = n;
        gas = g;
        System.out.println("將車號設為" + num + "，汽油量設為" + gas);
    }

    public void show() {
        System.out.println("車號是" + num);
        System.out.println("汽油量是" + gas);
    }
}

class RacingCar9 extends Car9 {
    private int course;

    public RacingCar9() {
        course = 0;
        System.out.println("生產了賽車");
    }

    public void setCourse(int c) {
        course = c;
        System.out.println("將賽車編號設為" + course);
    }

    public void show() {
        System.out.println("賽車的車號是" + num);
        System.out.println("汽油量是" + gas);
        System.out.println("賽車編號是" + course);
    }
}
