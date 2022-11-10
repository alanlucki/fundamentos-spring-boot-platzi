package com.fundamentosplatzi.springboot.fundamentos.bean;

public class MyOperationImplement implements MyOperation{
    @Override
    public int Sum(int number) {
        number++;
        return  number;
    }
}
