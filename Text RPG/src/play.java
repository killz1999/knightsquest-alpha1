import java.util.Scanner;

public class play {
    basic b1 = new basic();

    public void first() {
        Scanner fc = new Scanner(System.in);
        System.out.println("This is your first battle!");
        System.out.println("A Lvl. 1 Goblin appeared!!");
        int you, it;
        you = 20;
        it = 4;
        do {
            if (it == 0) {
                System.out.printf("You: %sHP", you);
                System.out.println("");
                System.out.printf("Goblin: %sHP", it);
                System.out.println("");
                System.out.println("You WIN!");
                it--;
            }else {
                System.out.printf("You: %sHP", you);
                System.out.println("");
                System.out.printf("Goblin: %sHP", it);
                System.out.println("");
                System.out.println("Options:");
                System.out.println("Hit it with a stick (1)");
                String option = fc.nextLine();
                if (option.equals("1")) {
                    System.out.println("You whack the goblin for 2HP!");
                    you--;
                    System.out.println("The goblin slaps you for 1 HP!");
                    it--;
                } else {
                    System.out.println("That is not a valid option");
                    System.out.println("Please enter a numerical value");
                }
            }
        }while (it != -1);
        System.out.println("");
        System.out.printf("Congratulations %s you have just killed your first enemy!", b1.name);
        if (b1.pClass == "knight") {
            b1.wFirst = "Rusty Sword (Dmg: 5)";
            b1.dmg = 5;
        } else if (b1.pClass == "wizard") {
            b1.wFirst = "Fireball Spell (Dmg: 3)";
            b1.dmg = 3;
            b1.dot = 1;
        } else {
            b1.wFirst = "Frayed Hand-Me-Down Bow (Dmg: 6)";
            b1.dmg = 5;
            b1.miss = 0.5;
        }
        System.out.println("");
        System.out.printf("You got a %s!", b1.wFirst);
    }
}

