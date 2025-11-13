public class car {
    String color;
    int year;

    car(String color, int year) {
        this.color = color;
        this.year = year;
    }

    void honk() {
        System.out.println("Beep beep!");
    }
}

public class Main {
    public static void main(String[] args) {
        car myCar = new car("Red", 2020);
        System.out.println(myCar.color);
        myCar.honk();
        
    }
}
