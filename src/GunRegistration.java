import java.util.Scanner;

public class GunRegistration {

	public static void main(String[] args) {
		LuigiFranchi lui = new LuigiFranchi();
		lui.setOwnerName("sarantis");
		lui.setRegistrationNumber(007);
		lui.setShotGunShellBarrelSize(3);
		System.out.println(lui);

		int register = gunRegistrationPage();
		LuigiFranchi luigi;
		Berreta berr;

		switch (register) {
		case 1:
			System.out.println("you  going to register a luigi gun!");
			luigi = getNewLuigiFranchi();
			System.out.println("your gun is now registered " + luigi.toString());
			break;
		case 2:
			System.out.println("you  going to register a Berreta gun!");
			berr = getNewBerreta();
			System.out.println("your gun is now registered " + berr.toString());
			break;
		case 3:
			System.out.println("you dont have a gun? well then u should buy one!!");

		}

	}

	public static int gunRegistrationPage() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("*******************************************");
		System.out.println("* Welcome to Sarantis Gun Registration Page *");
		System.out.println("*******************************************");
		System.out.println("What would you like to do today?");
		System.out.println("-------------------------------------------");
		System.out.println("Enter '1' to add a new Luigi Franchi ShotGun");
		System.out.println("Enter '2' to add a new Berreta ShotGun");
		System.out.println("Enter '3' to quit");
		System.out.println("-------------------------------------------");
		System.out.println("*******************************************");
		int result = Integer.parseInt(scanner.nextLine());
		return result;
	}

	public static LuigiFranchi getNewLuigiFranchi() {
		Scanner scanner = new Scanner(System.in);
		LuigiFranchi lui = new LuigiFranchi();
		System.out.println("enter the name of the owner");
		lui.setOwnerName(scanner.nextLine());
		System.out.println("enter the size of the barrel");
		lui.setShotGunShellBarrelSize(Integer.parseInt(scanner.nextLine()));
		System.out.println("Now enter the registration on the gun and you are done!!");
		lui.setRegistrationNumber(Integer.parseInt(scanner.nextLine()));
		return lui;
	}

	public static Berreta getNewBerreta() {
		Scanner scanner = new Scanner(System.in);
		Berreta ber = new Berreta();
		System.out.println("enter the name of the owner");
		ber.setOwnerName(scanner.nextLine());
		System.out.println("enter the size of the barrel");
		ber.setShotGunShellBarrelSize(Integer.parseInt(scanner.nextLine()));
		System.out.println("Now enter the registration on the gun and you are done!!");
		ber.setRegistrationNumber(Integer.parseInt(scanner.nextLine()));
		return ber;

	}
}