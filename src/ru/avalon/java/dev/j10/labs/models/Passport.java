package ru.avalon.java.dev.j10.labs.models;

import java.time.LocalDate;
import javax.print.DocFlavor;
import ru.avalon.java.dev.j10.labs.models.Person;
/**
 * Представление о паспортных данных человека.
 * <p>
 * Паспортные данные должны включать:
 * <ol>
 *  <li> серию и номер документа;
 *  <li> имя;
 *  <li> фамилию;
 *  <li> отчество;
 *  <li> второе имя;
 *  <li> день рождения;
 *  <li> дату выдачи;
 *  <li> орган, выдавший документ.
 * </ol>
 */
public class Passport {
       private int passportNumber;
       private LocalDate birthday;
       private LocalDate dateOFissue;
       private String service;
       private Person person;
        
       public Passport (Person person, int passportNumber, LocalDate birthday, LocalDate dateOFissue, String service){
           this(passportNumber, birthday, dateOFissue, service);
           this.person = person;
       }        
       public Passport (int passportNumber, LocalDate birthday, LocalDate dateOFissue, String service){
           this.passportNumber = passportNumber;
           this.birthday = birthday;
           this.dateOFissue = dateOFissue;
           this.service = service;
       }
    
    /*
     * TODO(Студент): Закончить определение класса.
     *
     * 1. Объявить атрибуты класса.
     *
     * 2. Определить необходимые методы класса. Подумайте о
     *    том, какие методы должны существовать в классе,
     *    чтобы обеспечивать получение всей необходимой
     *    информации о состоянии объектов данного класса.
     *    Все ли поля обязательно будут проинициализированы
     *    при создании экземпляра?
     *
     * 3. Создайте все необходимые конструкторы класса.
     *
     * 4. Помните о возможности существования перегруженных
     *    конструкторов.
     *
     * 5. Обеспечьте возможность использования класса за
     *    пределами пакета.
     */
    @Override
    public String toString() {
        return "| Passport: №" + passportNumber + "; Date of birth: " + birthday + "; Date of issue: " + dateOFissue + "; Place of issue: " + service;  //To change body of generated methods, choose Tools | Templates.
    }
}
