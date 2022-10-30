public class Main {
    public static void main(String[] args) {
        //Задача 1.
System.out.println("Задача 1");

        var dog = 8.0;
        var cat = 3.6;
        var paper = 763_789;

        System.out.println("значение переменной dog " + dog);
        System.out.println("значение переменной cat " + cat);
        System.out.println("значение переменной paper " + paper);

        //Задача 2.
        System.out.println("Задача 2");

        dog += 4; //закрепляю фишки Java
        cat += 4;
        paper = paper + 4;

        System.out.println("значение переменной dog " + dog);
        System.out.println("значение переменной cat " + cat);
        System.out.println("значение переменной paper " + paper);

        //Задача 3.
        System.out.println("Задача 3");

        dog = dog - 3.5;
        cat = cat - 1.6;
        paper -= 7_639; //закрепляю фишки java

        System.out.println("значение переменной dog " + dog);
        System.out.println("значение переменной cat " + cat);
        System.out.println("значение переменной paper " + paper);

        //задача 4.
            System.out.println("Задача 4");
            var friend = 19;
            System.out.println("значение переменной friend " + friend);
            friend = friend + 2;
            System.out.println("значение переменной friend " + friend);
            friend = friend / 7;
            System.out.println("значение переменной friend " + friend);

            //Задача 5.
            System.out.println("Задача 5");
            var frog = 3.5;
            System.out.println("значение переменной frog " + frog);
            frog = frog * 10;
            System.out.println("значение переменной frog " + frog);
            frog = frog / 3.5;
            System.out.println("значение переменной frog " + frog);
            frog = frog + 4;
            System.out.println("значение переменной frog " + frog);

            //Задача 6.
            System.out.println("Задача 6");
            var boxerOne = 78.2;
            var boxerTwo = 82.7;
            var totalWeight = boxerOne + boxerTwo;
            System.out.println("Общий вес двух бойцов = " + totalWeight + "кг");
            var weightDifference = boxerTwo - boxerOne;
            System.out.println("Разница в весе бойцов = " + weightDifference + "кг");

            //задача 7.
            System.out.println("Задача 7");
            var subtraction = boxerTwo - boxerOne;
            System.out.println("разница веса двух спортсменов вычисленная вычитанием = " + subtraction + "кг");
            var remains = boxerTwo % boxerOne;
            System.out.println("разница веса двух спортсменов вычисленная функцией остаток от деления = " + remains + "кг");

            //задача 8.
            System.out.println("Задача 8");
            var totalHours = 640;
            var totalWorkers = totalHours / 8;
            System.out.println("Всего работников в компании – " + totalWorkers + " человек");
            var moreWorkers = totalWorkers + 94; //Увеличили количество сотрудников.
            var remainingTime = totalHours % moreWorkers; //Остаток от деления на цело, количество не задействованного времени.
            var timeWorkers = totalHours - remainingTime; //Время, которое может быть поделено между всеми сотрудниками.
        var overTime = moreWorkers * 8;
            System.out.println("Если в компании работает " + moreWorkers + " человека, то всего " + timeWorkers + " часа работы может быть поделено между сотрудниками.");
        System.out.println("Если в компании работает " + moreWorkers + " человека и каждый посвятит работе 8 часов, то всего " + overTime + " часа работы может быть поделено между сотрудниками.");




    }
}