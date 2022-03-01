public class Person {
    //Мы создали класс по имени Person;
    String name; // Переменная текст - имя Персоны;
    int age; // Переменная инт (целочисленная цифра) - возраст Персоны;


    public static void main(String[] args) {

        Person personOne = new Person(); //Создаем объект (Новую персону) на основание класса;
        personOne.name = "Сергей Михайлов"; // Даем непосредственно имя,
        personOne.age = 15; // возраст Персоне;
        System.out.println("Имя: " + personOne.name + " Возраст: " + personOne.age);
        // Выводим на экран Имя и возраст Объекта;

        personOne.walk(); // Обозначаем методом что он может делать;
        personOne.sleep(); // или же какие функции выполнять.


        // Но для начала мы создали метод: walk и sleep.
    }
    public void walk(){
        System.out.println("Он может ходит.");
    }
    public void sleep(){
        System.out.println("Он может спат.");
    }

}
