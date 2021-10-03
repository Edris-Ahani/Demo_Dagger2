package com.example.demo_dagger2;

import dagger.Component;

//the injector
//dagger2 check all thing on compile time
@Component
public interface CarComponent {
    Car getCar();
}
