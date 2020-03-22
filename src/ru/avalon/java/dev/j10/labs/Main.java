package ru.avalon.java.dev.j10.labs;

import java.time.LocalDate;
import ru.avalon.java.dev.j10.labs.models.Person;
import ru.avalon.java.dev.j10.labs.commons.Address;
import ru.avalon.java.dev.j10.labs.models.Passport;
//classlab1
public class Main {
    /*
     * FIXME(Студент): Измените определение метода так, чтобы он стал точкой входа в приложение.
     */
        public static void main(String arrgs []) {
            
        Address registration = new Address("SPB", "Nevsky", 55);
        Passport passportDate = new Passport(19225699, LocalDate.of(1988,5,5), LocalDate.of(2000,5,5), "SPB passport office");
        Person ivanov = new Person("Ivan", "Ivanovich", " ", "Ivanov", passportDate, registration);
        
        Address registration1 = new Address("NY", "5 street", 73);
        Passport passportDate1 = new Passport(56423588, LocalDate.of(1998,6,6), LocalDate.of(2010,6,6), "NY passport office");
        Person smith = new Person("John", " ", "Edvard", "Smith", passportDate1, registration1);
        
        Person [] persons = new Person [2];
        persons [0] = ivanov;
        persons [1] = smith;

        System.out.println(persons [0]); 
        System.out.println(persons [1]);
        
        //Создаём объект и кладём в переменную
        //Building myBuilding = new Building ("red", 4);
        //Вызываем метод объекта и кладём возвращённое значение в переменную
        //String myBuildingDescription = myBuilding.getBuildigDescription();
        //System.out.println(myBuildingDescription);
                  
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
