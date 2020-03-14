package ru.avalon.java.dev.j10.labs;

import ru.avalon.java.dev.j10.labs.models.Person;
import ru.avalon.java.dev.j10.labs.models.Building;
import ru.avalon.java.dev.j10.labs.commons.Address;
//classlab1

public class Main {

    /*
     * FIXME(Студент): Измените определение метода так, чтобы он стал точкой входа в приложение.
     */

        public static void main(String arrgs []) {

        Person ivanov = null;
        Person smith = null;

        //Создаём объект и кладём в переменную
        Building myBuilding = new Building ("red", 4);
        //Вызываем метод объекта и кладём возвращённое значение в переменную
        String myBuildingDescription = myBuilding.getBuildigDescription();
        
        Address myAddress = new Address ("SPB", "Avenue", 55);
        String myAddressDescription = myAddress.getAddressDescription();
        
            System.out.println(myAddressDescription);
            System.out.println(myBuildingDescription);
            
        
        /*
         * TODO(Студент): Создайте экземпляры класса 'Person'
         *
         * 1. Проинициализируейте переменную 'ivanov', так,
         *    чтобы она адресовала объект типа 'Person'
         *    описывающий человека по имени 'Иванов Иван Иванович'.
         *
         * 2. Проинициализируейте переменную 'smith', так,
         *    чтобы она адресовала объект типа 'Person'
         *    описывающий человека по имени 'John Edvard Smith'.
         */

        /*
         * TODO(Студент): Создайте несколько строковых переменных:
         *
         * 1. Объявлялись и инициализировались две переменные типа Person, 
         *    содержащих информацию о людях (паспортные данные, адрес прописки). 
         *    У одного человека есть отчество, но нет второго имени, у второго 
         *    наоборот - есть второе имя, но нет отчества.
         * 2. Объявлялись и инициализировались переменные нужного типа для 
         *    хранения полного имени каждого человека и адреса в виде строки.
         * 3. Значения каждой переменной выводились в консоль отдельной строкой.
         */

        /*
         * TODO(Студент): Выведите в консоль значения созданных строковых переменных:
         *
         * Значение каждой переменной должно быть выведено на
         * отдельной строке.
         */
    }
}
