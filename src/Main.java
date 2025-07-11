public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        System.out.println("Задача 2");
        var dog1 = dog + 4;
        var cat1 = cat + 4;
        var paper1 = paper + 4;
        System.out.println(dog1);
        System.out.println(cat1);
        System.out.println(paper1);

        System.out.println("Задача 3");
        var dog2 = dog - 3.5;
        var cat2 = cat - 1.6;
        var paper2 = paper - 7639;
        System.out.println(dog2);
        System.out.println(cat2);
        System.out.println(paper2);

        System.out.println("Задача 4");
        var friend = 19;
        var friend1 = friend + 2;
        var friend2 = friend1 / 7;
        System.out.println(friend1);
        System.out.println(friend2);

        System.out.println("Задача 5");
        var frog = 3.5;
        frog = (frog * 10) / 3.5;
        frog += 4;
        System.out.println(frog);

        System.out.println("Задача 6");
        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var massBoxers = boxer1 + boxer2;
        System.out.println("Общая масса двух бойцов " + massBoxers + " кг");
        var massDiff = boxer2 - boxer1;
        System.out.println("Разница между бойцами " + massDiff + " кг");

        System.out.println("Задача 7");
        var precentMass = boxer2 % boxer1;
        System.out.println("Остаток между двумя весами " + precentMass + " кг");

        System.out.println("Задача 8");
        var totalTime = 640;
        var hour = 8;
        var workers = totalTime / hour;
        System.out.println("Всего в компании " + workers + " работников" );
        var newWorkers = workers + 94;
        var newTime = hour * newWorkers;
        System.out.println("Если в компании работает " + newWorkers + " человека, то всего " + newTime + " часов работы может быть поделено между сотрудниками" );






    }
}