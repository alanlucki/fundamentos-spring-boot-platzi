package com.fundamentosplatzi.springboot.fundamentos.component;

import org.springframework.stereotype.Component;

@Component
public class ComponentImplement02 implements ComponentDependecy{
    @Override
    public void Saludar() {
        System.out.println("Hola Mundo desde mi componente 02");
    }
}
