
public class HumanPlayer extends Player{

//	@Override
//	public int getRoshambo() {
//		// TODO Auto-generated method stub
//		return super.getRoshambo();
//	}

	public HumanPlayer(String userName, int choice) {
		setName(userName);
		setRoshambo(choice);
	}

	@Override
	public int generateRoshambo() {
		
		return getRoshambo();
	}

	
}
