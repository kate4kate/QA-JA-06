package com.academy.lesson04;

public class SomeNumber {
    private int n; // единственное поле класса

    //Конструктор без параметров
    public SomeNumber(){
        this.n = 0;  //инициализируем как 0
    }

    //Конструктор, с одним параметром (int n)
    public SomeNumber(int n){

        this.n = n;
    }

//Метод int getN();
    public  int getN() {

        return n;
    }

   // Метод int setN();
    public void setN(int n) {

        this.n = n;
    }

    //Метод print();
    //			который выводит строку, напр: "Число: 5"

    public void print(int n){
        String s = "Число:" + n;
        System.out.println(s);
    }

    //Метод boolean isPositive(); // которые возвращает true, если число положительное и false, если число отрицательное
    public boolean isPositive(int n){
        boolean positive =true;
        if(n>=0){
            return positive;
        }
        else {
            positive =  false;
            return positive;
        }

    }
}
