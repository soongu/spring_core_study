package com.spring.core.chap03.config;

import com.spring.core.chap03.computer.Computer;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class ComputerAutoConfigTest {


    @Test
    void autoconfigTest() {
        AnnotationConfigApplicationContext ac
                = new AnnotationConfigApplicationContext(ComputerAutoConfig.class);
        Computer computer = ac.getBean(Computer.class);
        computer.showSpec();
    }
}