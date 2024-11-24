public class Sample4_13 {
    public static void main(String[] args) {
        Car13 car1 = new Car13(1234, 20.5);
        car1.vShow();
        car1.mShow();
    }
}

interface iVehicle13 {
    void vShow();
}

interface iMaterial13 {
    void mShow();
}

class Car13 implements iVehicle13, iMaterial13 {
    private int num;
    private double gas;

    public Car13(int num, double gas) {
        this.num = num;
        this.gas = gas;
        System.out.println("生產了車號為" + num + "汽油量" + gas + "的車子");
    }

    public void vShow() {
        System.out.println("車號是" + num);
        System.out.println("汽油量是" + gas);
    }

    public void mShow() {
        System.out.println("車子的材質是鐵");
    }
}
