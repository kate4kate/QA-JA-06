package com.academy.lesson10;

import com.academy.lesson06.model.Abonent;
import com.academy.lesson06.tests.AbonentParser;
import com.academy.lesson08.ParseAbonentException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionDemo {
    public static void main(String[] args) {
        String[] abonentRawArray = {
               " heLen iVanova 35 f 0501234567",
               "  Андрей Сидоров 26 m 0501234568",
               " Peter Lvovich 37 m 0501234569"
        };

        String[] abonentRawArray2 = {
                "  Андрей Сидоров 26 m 0501234568",
                "  heLen iVanova 35 f 0501234567",
                "  Peter Lvovich 37 m 0501234569",
        };

        try {
            Abonent[] abonentArray = parseAbonents(abonentRawArray);
          /*  for (int i= 0;i<abonentArray.length;i++){
                System.out.println(abonentArray[i]);
            }
*/
            List<Abonent> abonentList = new ArrayList<>();

            for (int i = 0;i<abonentArray.length;i++){
                abonentList.add(abonentArray[i]);
                System.out.println(abonentList);
            }

      /*      List<Abonent> abonentList2 = new ArrayList<>(Arrays.asList(abonentRawArray2));
            System.out.println(abonentList2);
            System.out.println();

*/
        } catch (ParseAbonentException e) {
            e.printStackTrace();
    }

    }

    private static Abonent[] parseAbonents(String[] abonentRawArray) throws ParseAbonentException {
        Abonent[] abonents = new Abonent[abonentRawArray.length];
        for (int i = 0; i < abonentRawArray.length; i++) {
// String firstName = AbonentParser.parseFirstName(abonentRawArray[i]);
// String lastName = "";
// int age = 0;
// char gender = 'f';
// String phoneNumber = "";
            abonents[i] = AbonentParser.parseAbonent(abonentRawArray[i]);
        }
        return abonents;
    }

}