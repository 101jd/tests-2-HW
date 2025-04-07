package org._jd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;

public class VehicleTest {

    private Car car;
    private Motorcycle motorcycle;

    @BeforeEach
    public void initVehicles(){
        car = new Car("A", "a", 2000);
        motorcycle = new Motorcycle("B", "b", 2001);
    }

    @Test
    public void isCarInstanceOfVehicle(){
        assertInstanceOf(Vehicle.class, car);
    }

    @Test
    public void numberOfCarWheels(){
        assertThat(car.getNumWheels()).isEqualTo(4);
    }

    @Test
    public void numberOfMotorcycleWheels(){
        assertThat(motorcycle.getNumWheels()).isEqualTo(2);
    }

    @Test
    public void testDriveCarSpeed(){
        car.testDrive();
        assertThat(car.getSpeed()).isEqualTo(60);
    }

    @Test
    public void testDriveMotorcycle(){
        motorcycle.testDrive();
        assertThat(motorcycle.getSpeed()).isEqualTo(75);
    }

    @Test
    public void testParkingCar(){
        car.testDrive();
        car.park();

        assertThat(car.getSpeed()).isEqualTo(0);
    }

    @Test
    public void testParkingMotorcycle(){
        motorcycle.testDrive();
        motorcycle.park();

        assertThat(motorcycle.getSpeed()).isEqualTo(0);
    }




}
