public class Main {
    public static void main(String[] args) {

        //task1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //task2
        dog = dog + 4;
        cat = cat + 4;
        paper = paper+4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //task3
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //task4
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        //task5
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        //task6
        var weightBoxer1 = 78.2;
        var weightBoxer2 = 82.7;
        var weightTotal = weightBoxer1 + weightBoxer2;
        System.out.println(weightTotal);
        var weightDifference = weightBoxer2 - weightBoxer1;
        System.out.println(weightDifference);

        //task7
        var difference = weightBoxer2 % weightBoxer1;
        System.out.println(difference);

        //task8
        var totalTime = 640;
        var workerTime = 8;
        var workersAmount = totalTime / workerTime;
        System.out.println(workersAmount);
        var newWorkersAmount = workersAmount + 94;
        var newTotalTime = newWorkersAmount * workerTime;
        System.out.println("Если в компании работает " + newWorkersAmount + " человек, то всего "
        + newTotalTime + " часов работы может быть поделено между сотрудниками");

        // nu i vse
    }
}