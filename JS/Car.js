//Clase para definir los tipos de vehiculos Uber que existen
class Car {
    constructor(license, driver) {
        this.id;
        this.license = license;
        this.driver = driver;
        this.passengers;
    }
    printDataCar() {
        console.log(this.driver);
        console.log(this.driver.name);
        console.log(this.driver.document);

    }
}

