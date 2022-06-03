import java.util.*;
import java.util.Random;
import java.io.FileWriter;
import java.io.IOException;

 class Game {
	
	static class Being{
		int health;
		int dice_count;
		int dice_highest = 0;
		int dice_lowest = 0;
		int drop = 0;
		int drop_rec = 0;
		
		 Being(int t_health, int t_dice_count){ // Constructor
		this.health = t_health;
		this.dice_count = t_dice_count;
		}
		 void takeDamage(int damage){ // The function for removing health from an entity
			health = health - damage;
		}
		 int en_attack(int amount){ // The attack function but for NPCs. Doesn't use a weapon stat.
			int total_damage = 0;
			for(int i=0; i < amount; i++){
				int temp_damage = roll();
				total_damage = total_damage + temp_damage;
				}
			System.out.println("You got hit for " + total_damage);
			return total_damage;
		}
		 int roll(){ // The roll function used for damage
			Random rand = new Random();
			int d6 = 6; // dice parameter
			int randomint = rand.nextInt(d6) + 1; // Adds 1 to make it more useable
			if(randomint == 1 || randomint == 2){return 0;} else if (randomint == 6){return 2;} else{return 1;}
		}
	}
	
	
	static class Player extends Being{
		
		 Player(int t_health, int t_dice_count){super(t_health, t_dice_count);} // Subclass constructor
		int weapon = 0; // Weapon damage. Added passively to damage rolls
		int dice_temporary; // An often modified value for the remaining dice in a fight.
		
		 int attack(int amount){ // The attack function, with a check for bad rolls built in. Uses the roll function and checks for misses.
			int total_damage = 0;
			for(int i=0; i < amount; i++){
				int temp_damage = roll();
				if(temp_damage != 0){total_damage = total_damage + temp_damage + weapon;}
				else{total_damage = 0; System.out.println("Miss!"); break;}
			}  
			total_damage = total_damage * amount;
			System.out.println("You dealt " + total_damage + " damage!!");
			
			return total_damage; 
		}
		
		 int fight(){
			Scanner sc= new Scanner(System.in); //Scanner prep for later use.
			System.out.println("Current dice: " + dice_temporary);
			System.out.println("How many dice would you like to use? ");
			int attack_size = sc.nextInt();
			if(attack_size > dice_temporary){System.out.println("You do not have enough dice"); return 0;}
			else if (attack_size <= 0){System.out.println("You need to use at least one dice."); return 0;}
			else {
				int fight_damage = attack(attack_size); 
				dice_temporary = dice_temporary - attack_size;
				if(dice_count > dice_highest){
					dice_highest = dice_count;
					dice_lowest = dice_highest;
				}	
				if(dice_lowest > dice_temporary){
					dice_lowest = dice_temporary;
					drop = dice_highest - dice_lowest;
					if (drop_rec < drop){
						drop_rec = drop;
						try {
						FileWriter writer = new FileWriter("log.txt", true);
						writer.write("New Drop record!");
						writer.write("\r\n");   // write new line
						writer.write(String.valueOf(drop));
						writer.write("\r\n");
						writer.close();
						}
					catch (IOException e) {
						e.printStackTrace();
						}
					}
				}
				return fight_damage;
				} // Puts the current dice value to the correct valu and outputs damage.
		}
	}
	
	public static void main( String args[] ) {
		Player player1 = new Player(10, 2);
		int streak = -1;
		while(player1.health > 0){
			streak = streak + 1;
			player1.weapon = player1.weapon + 1;
			player1.dice_count = player1.dice_count+1; // A bunch of rewards for winning
			player1.dice_temporary = player1.dice_count;
			Being enemy = new Being(4 + (streak*4), 2 + streak);
			System.out.println("The enemy has " +enemy.health+ " HP and you are on streak: " +streak+ ", have a +" +player1.weapon+ " weapon and have " +player1.dice_count+ " dice!");
			while(enemy.health > 0){
				enemy.takeDamage(player1.fight());
				if(player1.health < 1){break;}
				System.out.println("The enemy has " +enemy.health+ " remaining!");
				if(enemy.health > 0){
					player1.takeDamage(enemy.en_attack(enemy.dice_count));
					System.out.println("You have " +player1.health+ " remaining!");
					if(player1.dice_temporary == 0){System.out.println("You have died due to dice overuse"); player1.health = 0; break;}
				}
				else System.out.println("Enemy dead");
			}
			if(player1.health>0){System.out.println("You Win one game");}
		}
		System.out.println("Game over! Streak: " +streak);
	}
}