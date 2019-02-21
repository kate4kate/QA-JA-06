package lesson04.hometask;

public class MainSomeNumber {
    public static void main(String[] args) {
        //создаем объект с именем someNumber используя передачу параметра '5' в конструктор
        SomeNumber someNumber = new SomeNumber(5);


        //c помощью цикла проверяю работу методов setN, isPositive, getN для массива из положит.и отрицат.чисел
        int arr[] = new int[]{-110,-1,0,10,15};
        for (int i = 0; i<arr.length; i++){
            //присваиваю  переменной n в классе SomeNumber значение каждого i-го элемента массива
            someNumber.setN(arr[i]);
             //получаю значение переменной n и сразу же проверяю его на
            // положительность/отрицательность с помощью метода isPositive
            someNumber.isPositive(someNumber.getN());
           // вывожу результат на консоль чтобы проверить правильность
            System.out.println("Число " + someNumber.getN() + " является положительным --> " + someNumber.isPositive(someNumber.getN()) );
        }

        //  в итоге после перебора в цикле в переменной n  остается записано значение последнего элемента массива
        System.out.println(someNumber.getN());

    }

}
