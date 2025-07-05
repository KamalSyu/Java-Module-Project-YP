public class Car {
    String carName;
    int raceCar;
    public Car(String carName, int raceCar){
        this.carName = carName;
        this.raceCar = raceCar;
    }

    public Car() {
        this.carName = "";
        this.raceCar = 0;
    }

    // Метод для получения названия машины
    public String getCarName() {
        return carName;
    }

    // Метод для установки названия машины
    public void setCarName(String carName) {
        this.carName = carName;
    }

    // Метод для получения скорости машины
    public int getRaceCar() {
        return raceCar;
    }

    // Метод для установки скорости машины
    public void setRaceCar(int raceCar) {
        this.raceCar = raceCar;
    }
}
