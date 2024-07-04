package inheritanceassignments;

public class Max extends Hospital{
	@Override
	public void treatPatient() {
		System.out.println("Max child class treatPatient method that is overridden from Hospital");

	}

	@Override
	public void dischargePatient() {
		System.out.println("Max child class dischargePatient method that is overridden from Hospital");

	}

	public void conductTests() {
		System.out.println("Max child class individual conductTests method");
	}

}
