package com.academy.lesson02;

/*13)
	Нарисовать треугольник заданной размерности. Пример для размера 6:
*
**
***
****
*****
******
*/
public class Triangle {

    public static void main(String[] args) {
        String []s = new String []{"*","**", "***", "****", "*****", "******"};
        for (int i=0;i<s.length;i++){
            System.out.println(s[i]);

        }

    }
}
