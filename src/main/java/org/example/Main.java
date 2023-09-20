package org.example;


class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.speed = 100;
        car1.name = "k5";
        car1.run();

        Car car2 = new Car();
        car2.speed = 200;
        car2.name = "벤츠";
        car2.run();

        Car car3 = new Car();
        car3.speed = 300;
        car3.name = "페라리";
        car3.run();

    }
}