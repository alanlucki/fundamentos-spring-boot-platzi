package com.fundamentosplatzi.springboot.fundamentos.bean;

public class MyBeanImplement implements MyBean{
    @Override
    public void Print() {
        System.out.println("Hola desde la implementación de mi MyBeanImplement");
    }
}
