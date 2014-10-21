import java.util.*;
import java.io.*;

public class Driver {

   public static void pause(int n) {
       try {
	   Thread.sleep(n);
	   } catch (Exception e) {}
	}

    public static void main(String[] args) {
	boolean gameover = false;
	System.out.println("You wake up alone in the forest");
	System.out.println("Are you a warrior or a mage?*Type warrior or mage*");
        Scanner scan = new Scanner(System.in);
	String type = scan.nextLine();
        type = type.toLowerCase();
	type = type.replaceAll("\\s+","");
	if (type.equals("warrior")) {
      	    Warrior player = new Warrior();
        }
	if (type.equals("mage")) {
	    Mage player = new Mage();
        }
	else {
	    System.out.println("*Please type mage or warrior*");
	    type = scan.nextLine();
	    type = type.replaceAll("\\s+","");
	}
        Mage enemy = new Mage();
	System.out.println("A mysterious figure approaches...");	
        pause(2000);
	System.out.println("It speaks...");
	pause(2000);
	System.out.println("'I command you...tell me asl ;)'");
	String nametroll = scan.nextLine();
        pause(1000);
	System.out.println("'Excellent!'");
	pause(1000);
	System.out.println("'What is your name hottie? ;)' *Type name below:*");
	String name = scan.nextLine();
        //player.setName(name);
	System.out.println("Mucho gusto "  + name + ". My name is ??? but you can call me tonight ;)");
	System.out.println("How many kidneys do you have?");
	String kidnum = scan.nextLine();
	System.out.println(kidnum);
        if (kidnum.equals("2") || kidnum.toLowerCase.equals("two")) {
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
	    System.out.println("The flirtatious stranger gently places his fingers upon your waist. He gropes slightly, and whispers 'You got some healthy beans there!! ;)");
	    pause(4000);
	    System.out.println("*shoves hand into sides and pulls out kidneys*");
	    pause(2000);
	    System.out.println("Game Over");
	    gameover = true;
	}
	else {
	    System.out.println("'Fine. Then I'll just have to take them by force!'");
	    pause(1000);
	    System.out.println("*Initiate battle*");
	}

	//fight sequence//
	/*
	if (type.equals("warrior")) {
	    player.swipe();
	    enemy.FeelingsofInadequacy();
	    manna += 2;
	    if (manna > 25) {
	        manna = 25;
	    }
	}

	*/
	if (gameover == true) {
	    System.exit(0);
	}
    }
}
