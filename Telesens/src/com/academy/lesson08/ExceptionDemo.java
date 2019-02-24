package com.academy.lesson08;

import com.academy.lesson06.tests.AbonentTestsDemo2;

public class ExceptionDemo {
    public static void main(String[] args) {
//        String abonentRawString = "  heLen iVanova 35 f 0501234567";
        String abonentRawString = "hfg";

        //Оработать ситуацию ParseAbonentException
        //Оработать ситуацию "Другая ошибка"
String name;
String lastName;
int age;
String gender;


        try {
             name = AbonentTestsDemo2.parseFirstName(abonentRawString);
             lastName = AbonentTestsDemo2.parseLastName(abonentRawString);
             age = Integer.parseInt(String.valueOf(AbonentTestsDemo2.parseAge(abonentRawString)));
             gender = String.valueOf(AbonentTestsDemo2.parseGender(abonentRawString));
            System.out.println(name);
            System.out.println(lastName);
            System.out.println(age);
            System.out.println(gender);

        }
        catch (ParseAbonentException exc){ //Оработать ситуацию ParseAbonentException
            System.err.println("Empty row. Please enter any value. Details: " + exc.getMsg());
        }
        catch (ParseAbonentNameException s){
            System.err.println("Too short Last Name or First Name. Details:  " + s.getMessage());
        }

        catch (ParseAgeException e){
            System.out.println(e.getMessage());
        }

        catch (ParseAbonentGenderException w){
            System.out.println("wrong gender. Details: " + w.getMessage() );

        }


   /*     catch (Exception exc){  //Оработать ситуацию "Другая ошибка"
            System.out.println("Unknown error");
        }*/
        // => Abonent
    }
}
