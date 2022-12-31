<?php

#Clase para definir los tipos de vehiculos Uber que existen
class Car {
    public $id;
    public $license;
    public $driver;
    public $passengers;
  
    public function __construct($license, $driver){
      $this->license = $license;
      $this->driver = $driver;
    }

    public function printDataCar(){
        return $this->license;
    }
  
}





