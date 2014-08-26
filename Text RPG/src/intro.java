import java.util.Scanner;
public class intro {
    basic b1 = new basic();

    public void setsName(){
        Scanner aName = new Scanner(System.in);
        System.out.println("Welcome, weary traveler, to the mystical world of Whitt. May I ask your name?");
        b1.name = aName.nextLine();
        System.out.printf("Hello %s, now you much choose your class.", b1.name);
        System.out.println("The classes are as follows:");
        System.out.println("Knight");
        System.out.println("Wizard");
        System.out.println("Archer");
        System.out.println("Which would you like to be?");
    }
    public void setsClass() {
        Scanner aClass = new Scanner(System.in);
        String bClass = aClass.nextLine();
        if (bClass.equals("Knight") || bClass.equals("knight")){
            b1.pClass = "knight";
            System.out.printf("You are now a %s", b1.pClass);
        }else if (bClass.equals("Wizard") || bClass.equals("wizard")){
            b1.pClass = "wizard";
            System.out.printf("You are a Wizard, %s", b1.name);
        }else if (bClass.equals("Archer") || bClass.equals("archer")){
            b1.pClass = "archer";
            System.out.printf("You are now a %s", b1.pClass);
        }else{
            System.out.println("That is not a class option.");
            setsClass();
        }
        System.out.println("You are now ready to adventure into the world of Whitt");
    }
}
