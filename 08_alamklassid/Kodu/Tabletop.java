import java.util.concurrent.ThreadLocalRandom;

public class Tabletop{
	
	public static class Human{
		int health = 20;
		int ac = 10; //armor class aka chance to hit.
		int dr = 0; //damage resistance.
	}
	
	public static class Skeleton{
		int health = 10;
		int ac = 10; //armor class aka chance to hit.
		int dr = 3; //damage resistance.
	}
	
	public static class Warrior extends Human{
		static String name;
		int hitBonus = 4;
		int damageBonus = 3;
		void setname(String input){name = input;}
		int attack(int target){
			int hit = ThreadLocalRandom.current().nextInt(1, 20 + 1);
			int toHit = hit + hitBonus;
			if(toHit > target){
				int damage = ThreadLocalRandom.current().nextInt(1, 6 + 1);
				int toDamage = damage + damageBonus;
				System.out.println(Warrior.name+ " has hit Zerg for " +toDamage);
				return toDamage;
			}
			else{System.out.println(Warrior.name+ " has missed"); return 0;}
		}
	}
	
	public static class Lich extends Skeleton{
		static String name;
		int hitBonus = 6;
		int damageBonus = 2;
		void setname(String input){name = input;}
		int attack(int target){
			int hit = ThreadLocalRandom.current().nextInt(1, 20 + 1);
			int toHit = hit + hitBonus;
			if(toHit > target){
				int damage = ThreadLocalRandom.current().nextInt(1, 8 + 1);
				int toDamage = damage + damageBonus;
				System.out.println(Lich.name+ " has hit Jack for " +toDamage);
				return toDamage;
			}
			else{System.out.println(Lich.name+ " has missed"); return 0;}
		}
	}
	
	
	public static void main(String args[]){
		Warrior jack = new Warrior();
		jack.setname("Jack");
		Lich zerg = new Lich();
		zerg.setname("Zerg");
		
		for(int i=0; i<10; i++){
			if(jack.health > 0){
				int damage = jack.attack(zerg.ac);
				zerg.health = zerg.health - damage;
				damage = 0;
			}
			else{System.out.println("Jack is dead. Game over"); break;}
			
			if(zerg.health > 0){
				int damage = zerg.attack(jack.ac);
				zerg.health = zerg.health - damage;
				damage = 0;
			}
			else{System.out.println("Zerg is dead. You win"); break;}
		}
	}
}