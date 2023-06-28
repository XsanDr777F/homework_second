public class Main {
    public static void main(String[] args) {
        float dog = 8;
        var cat = 3.6;
        var paper = 763789;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        dog = (float) (dog - 3.5);
        cat = cat - 1.6;
        paper = paper - 7639;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        var friend = 19;
        System.out.println(friend);

        friend = friend + 2;
        System.out.println(friend);

        friend = friend / 7;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println(frog);

        frog = frog * 10;
        System.out.println(frog);

        frog = frog / 3.5;
        System.out.println(frog);

        frog = frog + 4;
        System.out.println(frog);

        var fighterWeightOne = 78.2;
        var fighterWeightTwo = 82.7;

        var totalWeight = fighterWeightOne + fighterWeightTwo;
        System.out.println("Общий вес двух бойцов " + totalWeight + " КГ");

        var weightDifference = fighterWeightOne - fighterWeightTwo;
        System.out.println("Разница в весе составляет " + weightDifference + " КГ");

        weightDifference = fighterWeightTwo - fighterWeightOne;
        System.out.println(weightDifference);
        weightDifference = fighterWeightTwo % fighterWeightOne;
        System.out.println(weightDifference);

        var totalWorkingHours = 640;
        var workingHoursPerWorker = 8;
        var allWorkers = totalWorkingHours / workingHoursPerWorker;
        System.out.println("Всего работников в компании — " + allWorkers + " человек");

        allWorkers = allWorkers + 94;
        workingHoursPerWorker = totalWorkingHours / allWorkers;


        System.out.println("Если в компании работает " + allWorkers + " человек, то всего " + workingHoursPerWorker + " часов работы может быть поделено между сотрудниками");
    }
}
