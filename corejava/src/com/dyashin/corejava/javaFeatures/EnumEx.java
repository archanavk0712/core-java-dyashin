package com.dyashin.corejava.javaFeatures;

enum Player implements OrgRules {
	DHONI, RAINA, VIRAT;

	public static void test() {

	}

	public static void main(String[] args) {
		DHONI.work();
		Player.test();
	}

	@Override
	public void work() {
		System.out.println("Playing");
	}

	@Override
	public void rotateShifts() {
		System.out.println("Rotational shift");
	}

	@Override
	public void relocate() {
		System.out.println("Relocation needed");
	}

}

public class EnumEx {

	public static void main(String[] args) {

//		enum Books{
//			SHATTER_ME,  HARRY_POTTER, THE_ALCHEMIST
//		}

		Player p1 = Player.VIRAT;
		System.out.println(p1);

		p1.work();

		switch (p1) {
		case DHONI: {
			System.out.println("Dhoni plays");
			break;
		}
		case RAINA: {
			System.out.println("Raina plays");
			break;
		}
		default:
			System.out.println("Any other player");
		}

		System.out.println("------------------");

		Player[] players = Player.values();
		for (Player player : players) {
			System.out.print(player);
			System.out.println(player.ordinal());
		}
	}
}
