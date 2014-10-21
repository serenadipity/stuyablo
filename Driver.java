import java.util.*;
import java.io.*;

public class Driver {

   public static void twosec() {
       try {
	   Thread.sleep(2000);
	   } catch (Exception e) {}
	}

    public static void main(String[] args) {
	boolean gameover = false;
	/*
	Warrior w = new Warrior();
	Mage m = new Mage();
	*/
	System.out.println("You wake up alone in the forest");
	System.out.println("Are you a warrior or a mage?*Type warrior or mage*");
        Scanner scan = new Scanner(System.in);
	String type = scan.nextLine();
        type = type.toLowerCase();
	type = type.replaceAll("\\s+","");
	if (type.equals("warrior")) {
	    Warrior player = new Warrior();
        }
	else {
	    Mage player = new Mage();
        }
        Mage enemy = new Mage();
	System.out.println("A mysterious figure approaches...");	
	twosec();
	System.out.println("It speaks...");
	twosec();
	System.out.println("'I command you...tell me asl ;)'");
	String nametroll = scan.nextLine();
	twosec();
	System.out.println("'Excellent!'");
	twosec();
	System.out.println("'What is your name hottie? ;)' *Type name below:*");
	String name = scan.nextLine();
        //player.setName(name);
	System.out.println("Mucho gusto "  + name + ". My name is ??? but you can call me tonight ;)");
	System.out.println("How many kidneys do you have?");
	String kidnum = scan.nextLine();
	System.out.println(kidnum);
        if (kidnum.equals("2")) {
	    System.out.println("Niceee");
	}
	else {
	    System.out.println("You Lie!!!!");
	}
	System.out.println("Now give me your kidneys!!! *Yes or No*");
	String story = scan.nextLine();
	story = story.toLowerCase();
	story = story.replaceAll("\\s+","");
	if (story.equals("yes")) {
	    System.out.println("*insert kidney stealing + death here*");
	    gameover = true;
	}
	else {
	    System.out.println("*insert fight initiation here*");
	}

	//fight sequence//

	if (type.equals("warrior")) {
	    player.swipe();
	    enemy.FeelingsofInadequacy();
	}

	
	if (gameover == true) {
	    System.exit(0);
	}
    }
}
