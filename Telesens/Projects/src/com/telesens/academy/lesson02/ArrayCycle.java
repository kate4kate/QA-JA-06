package com.telesens.academy.lesson02;

/*Проинициализировать одномерный массив произвольными целыми числами
	Вывести массив в виде:
		[3, 4, 9, 10, 34, 239, 8, 0, -3, 19, 17]
		a) используя цикл for
		b) используя цикл while*/
public class ArrayCycle {
    public static void main(String[] args) {
        System.out.println("For: ");
        int [] digits = new int []{3, 4, 9, 10, 34, 239, 8, 0, -3, 19, 17};
        for (int i=0; i<digits.length;i++){
            System.out.print(digits[i] + " ");
        }
        System.out.println();
        System.out.println("While: ");
        int i = 0;
        while(i<digits.length){
            System.out.print(digits[i]+ " ");
            i++;
        }
    }
}
