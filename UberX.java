//@author Alondra Yoclein Osornio Vega 14/02/2022
package Uber; 
class UberX extends Car {
    int passenger, id;
    String brand, model, notif = ""; 
    public UberX(String license, Account driver, int id, String brand, String model, int passenger) {
        super(license, driver);
        this.id = id;
        this.brand = brand;
        this.model = model;
        //Se crea condición de cantidad de pasajeros segun tipo de auto
        notif = "Numero maximo de pasajeros ha sido alcanzado";
        if (passenger >= 3) {
            System.out.println(notif);
        } else {
            this.passenger = passenger;
        }
    } 
    public void setPassenger(int passenger) {
        if (passenger >=3) {
            System.out.println(notif);
        } else {
            this.passenger = passenger;
        }
    } 
    public void setId(int id) {
        this.id = id;
    } 
    public void setBrand(String brand) {
        this.brand = brand;
    } 
    public void setModel(String model) {
        this.model = model;
    } 
    public int getPassenger() {
        return passenger;
    } 
    public int getId() {
        return id;
    } 
    public String getBrand() {
        return brand;
    } 
    public String getModel() {
        return model;
    } 
    public String toString() {
        String car = "";
        car = car + "\nUBER\n " + this.getClass().getSimpleName();
        car = car + "Id: " + this.getId() + "\nBrand: " + this.getBrand() + "\nModel: " + this.getModel() + "\nPssengers number: " + this.getPassenger();
        car = car + super.toString();
        return car;
    }
} 