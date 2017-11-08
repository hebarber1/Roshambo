
public class RandomPlayer extends Player {

	@Override
	public int generateRoshambo() {
		
		int Roshambo = (int) (Math.random() * 3);
		
		return Roshambo;
	}

}
