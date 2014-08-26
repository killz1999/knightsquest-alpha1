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
        while (it >= 1) {
            System.out.printf("You: %s hp", you);
            System.out.printf("Goblin: %s hp", it);
            System.out.print("Options: Hit it with a stick(1)");
            String Fight1 = fc.nextLine();
            if (Fight1.equals("1")) {
                it -= 2;
                System.out.println("You hit the Goblin for 2 hp!");
                System.out.println("The Goblin hits you for 1 hp!");
                you -= 1;
            } else {
                System.out.println("That it not a valid option, please type in a number.");
            }
        }
        if (b1.pClass.equals("knight")) {
            b1.wFirst = "Rusty Sword (Dmg: 5)";
            b1.dFirst = 5;
        } else if (b1.pClass.equals("wizard")) {
            b1.wFirst = "Fireball Spell (Dmg: 5)";
            b1.dFirst = 5;
        } else {
            b1.wFirst = "Frayed Hand-Me-Down Bow (Dmg: 5)";
            b1.dFirst = 5;
        }
        System.out.printf("Congratulations! You have beaten your first enemy! You got a %s!", b1.wFirst);
    }
}

