package creational_dp.factory;

public abstract class abstract_factory {
    private String carName;
    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public int getCarPrice() {
        return carPrice;
    }

    public void setCarPrice(int carPrice) {
        this.carPrice = carPrice;
    }

    public int getCarMileage() {
        return carMileage;
    }

    public void setCarMileage(int carMileage) {
        this.carMileage = carMileage;
    }

    public int getCarTopSpeed() {
        return carTopSpeed;
    }

    public void setCarTopSpeed(int carTopSpeed) {
        this.carTopSpeed = carTopSpeed;
    }

    public int getNumber_of_seats() {
        return number_of_seats;
    }

    public void setNumber_of_seats(int number_of_seats) {
        this.number_of_seats = number_of_seats;
    }

    private int carPrice, carMileage, carTopSpeed,number_of_seats;
   
    abstract void engine();

}
