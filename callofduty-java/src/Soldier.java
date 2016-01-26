
public class Soldier {
		private int lives;
		private int hitpoints;
		private int remainingHitpoint;
		
		public Soldier(int newlives,int newhitpoints){
			this.lives=newlives;
			this.hitpoints= newhitpoints;
			this.remainingHitpoint=newhitpoints;
		}
		public void setHitpoints(int hit){
			this.hitpoints=hit;
			/*if(this.hitpoints<=100){
			 die();
		}*/
        }
		public int getHitPoints(){
			return this.hitpoints;
		}
		public void setLives(int live){
			this.lives=live;
		}
		public int getLives(){
			return this.lives;
		}
		public int getRemainingHitpoint(){
			return this.remainingHitpoint;
		}
        public void setRemainingHitpoint(int rpoints){
        	this.remainingHitpoint=getHitPoints()-rpoints;
        }
		public void takeDamage(int damage) {
			// TODO Auto-generated method stub
			
		}
        
	
}
