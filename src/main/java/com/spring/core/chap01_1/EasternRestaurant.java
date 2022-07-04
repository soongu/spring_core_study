package com.spring.core.chap01_1;

public class EasternRestaurant implements Restaurant {

    private Chef chef;
    private Course course;

    @Override
    public void reserve() {
        course.combineMenu();
    }

    @Override
    public void order() {
        chef.cook();
    }
}
