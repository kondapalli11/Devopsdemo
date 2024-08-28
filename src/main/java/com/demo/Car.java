package com.demo;
/* <bean id="car" class="com.demo.Car" autowire="byType">
        <property name="carName" value="tata "/>
    </bean>

 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value = "car")
public class Car {
    @Value("tata car") // @Value is used to get the propertyname
    public String carName;
    @Autowired
    private Tyre tyre;

    public void setCarName(String carName)
    {
        this.carName = carName;
    }
    public void setTyre(Tyre Tyre)
    {
        this.tyre = Tyre;
    }
    public void move(){
        tyre.rotate();
        System.out.println("moving in a car" + carName);
    }
}
