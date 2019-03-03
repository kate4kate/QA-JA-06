package com.academy.lesson10.HomeTask;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionHomeDemo {

    public static void main(String[] args) {
        //дан массив строк
        String[] namesArray = new String[]{"Peter", "Helen", "Andry", "Abdel", "Kate", "Veronica", "Leonid", "Alex", "max"};
//a) создаем список с именем namesList
        List<String> namesList = new ArrayList<>();
        //в цикле добавляем в каждый элемент новосозданного списка каждый элемент массива
        for (int i = 0; i < namesArray.length; i++) {
            namesList.add(namesArray[i]);
        }
        //выводим  весь список на консоль - выведет: [Peter, Helen, Andry, Abdel, Kate, Veronica, Leonid, Alex, Max]
        System.out.println("a) " + namesList);
//	b) Добавить 3 новых имени в список (Philip, Joseph, Leon) и вывести весь список на экран
        namesList.add("Philip");
        namesList.add("Joseph");
        namesList.add("Leon");

        System.out.println("b) " + namesList);
//	c) Удалить из списка все имена: Veronica, Leonid и вывести на экран

        namesList.remove("Veronica");
        namesList.remove("Leonid");

        System.out.println("c) " + namesList);
//	d) Поменять имя Helen на Elizabet
        namesList.set(1, "Elizabet");
        System.out.println("d) " + namesList);
//	e) Отсортировать имена по алфавиту и вывести на экран

        Collections.sort(namesList);
        System.out.println("e) " + namesList);

//	f) Отсортировать имена в обратном порядке и вывести имена на экран

        Collections.reverse(namesList);
        System.out.println("f) " + namesList);

        //	g) Перевести все первые символы в верхний регистр

        for (int i = 0; i < namesList.size(); i++) {

            String c = Character.toString(namesList.get(i).charAt(0)).toUpperCase() + namesList.get(i).substring(1);
            namesList.set(i, c);

        }
        System.out.println("g) " + namesList);

//	h) Вывести все имена, начинающиеся на букву A
        System.out.print("h)");
        for (int i = 0; i < namesList.size(); i++) {

            if (namesList.get(i).charAt(0) == 'A') {
                System.out.print(" " + namesList.get(i));
            } else continue;
        }
        System.out.println();
        //	i) Проверить, содержит ли список имя Andry
        boolean c = true;
        if (namesList.contains("Andry")) {
            System.out.println("i) " + c);
        } else System.out.println("i) " + !c);


     /*   //	j) Удалить из списка все имена кроме Kate и Helen

        for (int i = 0; i < namesList.size(); i++) {
            if (namesList.get(i).contains("Kate") || namesList.get(i).contains("Helen" ))
            {
                System.out.println(namesList.get(i));
            }
            else {
                namesList.remove(i);
            }
        }
       System.out.println("j) " + namesList); //ISSUE. WHY I get as result [Philip, Leon, Kate, Elizabet, Alex] ???
*/
        //	j)  ВТОРОЙ СПОСОБ -  Удалить из списка все имена кроме Kate и Elizabet
        //создаю второй список с Элизабет,Кейт и потом удаляю из первого списка все элементы,
        // кроме тех,что содержатся во втором списке
        List<String> compareRemove = new ArrayList<>();
        compareRemove.add( "Elizabet");
        compareRemove.add("Kate");

        System.out.println(namesList);

        namesList.retainAll(compareRemove);
        System.out.println("j) " + namesList);
    }
}