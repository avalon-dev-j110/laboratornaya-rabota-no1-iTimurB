package ru.avalon.java.dev.j10.labs.models;

import java.time.LocalDateTime;
import javax.print.DocFlavor;

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
       private String firstName;
       private String lastName;
       private String middleName;
       private String secondName;
       private LocalDateTime birthday;
       private LocalDateTime dateOFissue;
       private String service;
       
       public Passport (int passportNumber, String firstName, String lastName, String middleName,String secondName, LocalDateTime birthday, LocalDateTime dateOFissue, String service){
           this.passportNumber = passportNumber;
           this.firstName = firstName;
           this.lastName = lastName;
           this.middleName = middleName;
           this.secondName = secondName;
           this.birthday = birthday;
           this.dateOFissue = dateOFissue;
           this.service = service;
        }
       
      // public String getPassportDescription (){
           
       //}
       
       
    

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
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
}
