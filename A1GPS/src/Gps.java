import java.util.Random;

public class Gps {

	public enum Direction {
		NORTH(0), EAST(1), WEST(2), SOUTH(3);
		private final int index;

		Direction(int index) {
			this.index = index;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// the number of turns based on 60 miles per hour for an hour drive
		// GPS randomly generates the new direction every 5 minutes
		// 60/5=12
		final int TURNS = 12;
		Random rand = new Random();

		// 0=north, 1= east, 2=south, 3=west int direction;
		
		Direction aDirection = Direction.NORTH;
		for (int i = 0; i < TURNS; i++) {
			System.out.println(aDirection.values()[rand.nextInt(4)]);
			//aDirection = ;
		}
		// System.out.println(aDirection)
		System.out.println(aDirection);

		switch (aDirection) {
		case NORTH:
			System.out.println("Moving NORTH");
			break;
		case EAST:
			System.out.println("Moving EAST");
			break;
		case WEST:
			System.out.println("Moving WEST");
			break;
		case SOUTH:
			System.out.println("Moving SOUTH");
			break;
		}

	}

}
