
public class soldierDemo {
 public static void main(String[] args) {
	
	 Soldier ghost=new Soldier(5,3000);
	 ghost.takeDamage(150);
	 System.out.println("Soldier");
	 System.out.println("Hit point: "+ghost.getRemainingHitpoint()+"/"+ghost.getHitPoints());
	 System.out.println("Lives: "+ghost.getLives());
	 System.out.println();
	 
	 SuperSoldier supersoldier=new SuperSoldier(10,2999);
	 if(supersoldier.checkHitpoints()){
		 System.out.println("Super soldier");
		 supersoldier.takeDamage(100);
		 System.out.println("Hit point: "+supersoldier.getRemainingHitpoint()+"/"+supersoldier.getHitPoints());
		 System.out.println("Lives: "+supersoldier.getLives());
		 }
	 else{
		 System.out.println("Super Soldiers cannot have less than 3000 Hit Points.");
		 
	 }

	}

}
