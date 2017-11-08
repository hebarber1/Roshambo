/**
 * 
 */

/**
 * @author hbm1
 *
 */
public abstract class Player {
	private String name;
	private int Roshambo;
	
	public abstract int generateRoshambo();
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoshambo() {
		return Roshambo;
	}
	public void setRoshambo(int roshambo) {
		this.Roshambo = roshambo;
	}
}
