package com.demo;

import org.springframework.stereotype.Component;
@Component(value = "tyre2")
public class MrfTyre implements Tyre{
    //<bean id="tyre2" class="com.demo.MrfTyre"/>
    public void rotate(){
        System.out.println("mrf tyre");
    }

}
