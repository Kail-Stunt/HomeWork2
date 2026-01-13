//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 2.1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("Значение переменной dog = " + dog);
        System.out.println("Значение переменной cat = " + cat);
        System.out.println("Значение переменной paper = " + paper);

        System.out.println("Задача 2.2");
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println("Значение переменной dog = " + dog);
        System.out.println("Значение переменной cat = " + cat);
        System.out.println("Значение переменной paper = " + paper);

        System.out.println("Задача 2.3");
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println("Значение переменной dog = " + dog);
        System.out.println("Значение переменной cat = " + cat);
        System.out.println("Значение переменной paper = " + paper);

        System.out.println("Задача 2.4");
        var friend = 19;
        System.out.println("Значение исходной переменной friend = " + friend);
        friend = friend + 2;
        System.out.println("Значение исходной переменной friend увеличенной на 2 = " + friend);
        friend = friend / 7;
        System.out.println("Значение переменной friend делённой на 7 = " + friend);

        System.out.println("Задача 2.5");
        var frog = 3.5;
        System.out.println("Значение исходной переменной frog = " + frog);
        frog = frog * 10;
        System.out.println("Значение исходной переменной frog, увеличенной в 10 раз = " + frog);
        frog = frog / 3.5;
        System.out.println("Значение переменной frog, делённой на 3.5 = " + frog);
        frog = frog + 4;
        System.out.println("Значение переменной frog, увеличенной на 4 = " + frog);

        System.out.println("Задача 2.6");
        var boxer_1 = 78.2;
        var boxer_2 = 82.7;
        var mass1 = boxer_1 + boxer_2;
        System.out.println("Общая масса двух боксёров = " + mass1);
        var mass2 = Math.abs(boxer_1 - boxer_2);
        System.out.println("Разница между массами двух боксёров = " + mass2);

        System.out.println("Задача 2.7");
        var massDiv = boxer_2 % boxer_1;
        System.out.println("Отсаток от деления масс двух боксёров = " + massDiv);

        System.out.println("Задача 2.8");
        var hours = 640;
        var allEmpl = hours / 8;
        System.out.println("Всего работников в компании - " + allEmpl + " человек.");
        var moreEmpl = allEmpl + 94;
        var newHours = hours / moreEmpl;
        System.out.println("Если в компании работает " + moreEmpl + " человека, то всего " + newHours + " часа работы может быть поделено между сотрудниками");

    }
}