package ru.avalon.java.dev.j10.labs.commons;
/*
 * TODO(Студент): Создайте класс Address.
 *
 * 1. Добавте файл в пакет ru.avalon.java.dev.j10.labs.commons.
 *
 * 2. Создайте класс, видимый за пределами пакета. Подумайте о том
 *    Какое имя должен иметь класс, если он объявленн в этом
 *    файле.
 *
 * 3. Подумайте над тем, какие переменные должены быть
 *    определены в классе.
 *
 * 4. Подумайте над тем, какие методы должны быть объявлены
 *    в классе.
 */
public class Address {
         private String town;
         private String street;
         private int number;

         public Address (String town, String street, int number){
             this.town = town;
             this.street = street;
             this.number = number;
         }

    public String getTown() {
        return town;
    }
    public void setTown(String town) {
        this.town = town;
    }
    public String getStreet() {
        return street;
    }
    public void setStreet(String street) {
        this.street = street;
    }
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }        
         
    @Override
          public String toString (){
             return "| Town - " + getTown() + ", Street - " + getStreet() + ", Number - " + getNumber();
          }
}
