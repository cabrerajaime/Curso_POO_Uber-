package Java;

//Clase para definir los tipos de vehiculos Uber que existen
public class Car {
    Integer id;
    String license;
    Account driver;
    Integer passengers;

    public Car(String license, Account driver){ //Parametros declarados de manera local
        this.license = license;
        this.driver = driver;

    }
    
    void printDataCar(){
        System.out.println("License: " + license + "Driver: " + driver.name + " Document: " + driver.document);
    }
}
