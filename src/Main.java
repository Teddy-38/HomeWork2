public class Main {
    public static void main(String[] args) {
        //write your code here
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
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
        frog  = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        var box1 = 78.2;
        var box2 = 82.7;
        var box3 = box1 + box2;
        System.out.println("общий вес спортсменов " + box3);
        var box4 = box2 - box1;
        System.out.println("разница спортсменов " + box4);
        var box5 = box2 % box1;
        System.out.println("остаток деления между весами " + box5);
        var workClock = 640;
        var peopleClock = 8;
        var result1 = workClock / peopleClock;
        System.out.println("Всего работников в компании " + result1 + " человек");
        var result2 = result1 + 94;
        var result3 = workClock / result2;
        System.out.println("Если в компании работает " +result2+ " человека, то всего " +result3+ " часа работы может быть поделено между сотрудниками");
    }
}