
public class LuigiFranchi {
	private int registrationNumber;
	private int shotGunShellBarrelSize;
	private String ownerName;

	public int getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(int number) {
		this.registrationNumber = number;
	}

	public int getShotGunShellBarrelSize() {
		return shotGunShellBarrelSize;
	}

	public void setShotGunShellBarrelSize(int no) {
		this.shotGunShellBarrelSize = no;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String name) {
		this.ownerName = name;
	}

	public String toString()
	{
		return String.format("%s has a %d bullet shutgun with registration number: %d"
				, getOwnerName()
				, getShotGunShellBarrelSize()
				, getRegistrationNumber());
	}
	
	
}
