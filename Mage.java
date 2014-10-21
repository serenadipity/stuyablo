public class Mage extends Basechar{
    private int magic = randomValue(10,21);
    private int manna = 25;
    
    public int setManna(int value){
        int manna = value;
    }

    public int getManna(){
    return manna;
    }
    public int getMagic(){
    return magic;
    }

    public void FeelingsofInadequacy(Basechar opponent){
	if (Success() == true){
	    String s = this+" casted 'Feelings of Inadequacy' on "+opponent)".\n";
	    if (randomValue(1,100)< 20){
	        s = s + "However " + opponent + "has blocked your attack.\n";
		int newHealth = opponent.getHealth() - (this.magic*1.5 - opponent.getDefense);
		opponent.setHealth(newHealth);
		s = s + this.magic*1.5 - opponent.getDefense + "pts damage dealt, ";
		s = s + opponent + "now has " + opponent.getHealth() + "hp.\n";
		return s;
		this.setManna(this.getManna()-5);
	    } else {		    		        	    
		int newHealth = opponent.getHealth() - this.magic*1.5;
		opponent.setHealth(newHealth);
		s = s + this.magic*1.5 + "pts damage dealt, ";
		s = s + opponent + " now has " + opponent.getHealth() + "hp.\n";
		return s;
		this.setManna(this.getManna()-5)	    
	    
	
	}else{
	    return this+" failed to cast 'Feelings of Inadequacy' on " + opponent;
	}
    }
   public void Caffine Crash(Basechar opponent){
    if (Success() == true){
        String s = this+" casted 'Caffine Crash' on "+opponent)".\n";
        if (randomValue(1,100)< 20){
            s = s + "However " + opponent + "has blocked your attack.\n";
    	    int newHealth = opponent.getHealth() - (this.magic*2.2 - opponent.getDefense);
            opponent.setHealth(newHealth);
	    s = s + this.magic*2.2 - opponent.getDefense + "pts damage dealt, ";
	    s = s + opponent + "now has " + opponent.getHealth() + "hp.\n";
	    return s;
	    this.setManna(this.getManna()-10);
        } else {		    		        	    
	    int newHealth = opponent.getHealth() - this.magic*2.2;
	    opponent.setHealth(newHealth);
	    s = s + this.magic*2.2 + "pts damage dealt, ";
	    s = s + opponent + " now has " + opponent.getHealth() + "hp.\n";
	    return s;
	    this.setManna(this.getManna()-10)	    
	    
	
    }else{
        return this+" failed to cast 'Caffine Crash' on " + opponent;
	}
   }
}


