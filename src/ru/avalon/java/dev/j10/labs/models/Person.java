package ru.avalon.java.dev.j10.labs.models;

import ru.avalon.java.dev.j10.labs.commons.Address;
import ru.avalon.java.dev.j10.labs.models.Passport;
/**
 * Представление о человеке.
 * <p>
 * С точки зрения задания человек представляется как сущность,
 * наделённая:
 * <ol>
 *     <li>именем;
 *     <li>паспортными данными;
 *     <li>пропиской по месту жительства.
 * </ol>
 */
public class Person {
    private String firstName;
    private String lastName;
    private String middleName;
    private String secondName;
    private  String fullName;
    private Address registration;
    private Passport passport;
         
    public Person (String firstName, String middleName, String secondName, String lastName, Passport passport, Address registration){
        this(firstName, middleName, secondName, lastName);
        this.passport = passport;
        this.registration = registration;
    }    
       public Person (String firstName, String middleName, String secondName, String lastName){
           this.firstName = firstName;
           this.lastName = lastName;
           this.middleName = middleName;
           this.secondName = secondName;
       }
              
    /**
     * Возвращает полное имя человека.
     * <p>
     * Должен быть метод, возвращающие полное имя человека в нужном формате 
     * одной строкой. Если у человека есть Имя, Фамилия и Отчество, то
     * возвращет Имя, Фимилию и Отчество, разделённые пробелом.
     * <p>
     * Если у человека есть второе имя, полное имя выводится
     * в формате Имя Второе имя Фамилия.
     * <p>
     *
     * @return имя человека в виде строки.
     */
    String str = " ";
    public String getfullName() {
        if (middleName.equals(str)) {
            fullName ="| " + firstName + " " + secondName + " " + lastName;
           }
           else fullName ="| " + lastName + " " + firstName + " " + middleName;
        return fullName;
    }
        /*
         * TODO(Студент): Закончить определение метода 'getFullName()' класса 'Person'
         */
    
    /**
     * Возвращает адрес, по которому проживает человек.
     * <p>
     * Возвращаемый адрес соответствует месту постоянной
     * регистрации человека, согласно паспортным данным.
     *
     * @return адрес регистрации в виде строки.
     */
    
    public Address getAddress() {
        return registration;
        /*
         * TODO(Студент): Закончить определение метода 'getAddress()' класса 'Person'
         */
    }
    public void setAddress(Address registration){
        this.registration = registration;
    }
    
    
    @Override
    public String toString (){
        return getfullName() + passport + registration;
    }
}