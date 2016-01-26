
public class SuperSoldier extends Soldier{
	
	public SuperSoldier(int newlives, int newhitpoints){
		super(newlives, newhitpoints);
		//TODO Auto-generated constructor stub
        }
	public void takeDamage(int damage){
		//super.takeDamage(damage/2);
		super.setRemainingHitpoint(super.getRemainingHitpoint()-(damage/2));
	}
	public boolean checkHitpoints(){
		if(getHitPoints()<3000){
			return false;
		}
		else{
			return true;
		}
	}

}
