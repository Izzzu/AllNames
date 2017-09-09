package pl.sda;

public class AllNames {

	private final String myName = "Iza Kułakowska";
	private final String myName1 = "Kamil Brzoza";
	private final String myName2 = "Tomasz Seidler";



	@Override
	public String toString() {
		return "AllNames: \n" + myName1 + "\n" + myName2;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((myName == null) ? 0 : myName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AllNames other = (AllNames) obj;
		if (myName == null) {
			if (other.myName != null)
				return false;
		} else if (!myName.equals(other.myName))
			return false;
		return true;
	}
}
