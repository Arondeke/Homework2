public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();

    }
    public static void task1 () {
        System.out.println("Задача 1");
        var dog = 8;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }

    public static void task2 () {
        System.out.println("Задача 2");
        var dog = 8;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog + 4);
        System.out.println(cat + 4);
        System.out.println(paper + 4);
    }
    public static void task3 () {
        System.out.println("Задача 3");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog - 3.5);
        System.out.println(cat - 1.6);
        System.out.println(paper - 7639);
    }
    public static void task4(){
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);
        System.out.println(friend + 2);
        System.out.println( (friend + 2) / 7);
    }
    public static void task5() {
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        System.out.println(frog * 10);
        System.out.println((frog * 10) / 3.5);
        System.out.println(((frog * 10) / 3.5) + 4.0);
    }
    public static void task6() {
        System.out.println("Задача 6");
        var boxerOne = 78.2;
        var boxerTwo = 82.7;
        var allBoxersWeight = boxerOne + boxerTwo;
        System.out.println("общий вес бойцов " + allBoxersWeight + "кг");
        var differentBoxersWeight = boxerTwo - boxerOne;
        System.out.println("разница в весе бойцов " + differentBoxersWeight + "кг");
    }
    public static void task7() {
        System.out.println("Задача 7");
        var boxerOne = 78.2;
        var boxerTwo = 82.7;
        var differentBoxersWeightMethodeOne = boxerTwo - boxerOne;
        System.out.println("разница в весе бойцов (способ '-')" + differentBoxersWeightMethodeOne + "кг");
        var differentBoxersWeightMethodeTwo = boxerTwo % boxerOne;
        System.out.println("разница в весе бойцов (способ '%')" + differentBoxersWeightMethodeTwo + "кг");
    }
    public static void task8() {
        System.out.println("Задача 8");
        var allHours = 640;
        var hoursWorkPerson = 8;
        var allPersons = allHours / hoursWorkPerson;
        System.out.println("Всего работников в компании -  " + allPersons + " человек");

        var allPersonsMore = allPersons + 94;
        var hoursWorkPersonMore = allPersonsMore * 8;
        System.out.println("Если в компании работает " + allPersonsMore + " человек, " +
                "то всего " + hoursWorkPersonMore + " часов работы может быть поделено между сотрудниками");

    }
}