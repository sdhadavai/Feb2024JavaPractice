package inheritanceassignments;

public class Fortis extends Hospital {

	@Override
	public void treatPatient() {
		System.out.println("Fortis child class treatPatient method that is overridden from Hospital");

	}

	@Override
	public void dischargePatient() {
		System.out.println("Fortis child class dischargePatient method that is overridden from Hospital");

	}

	public void prescribeMedication() {
		System.out.println("Fortis child class individual prescribeMedication method");
	}

}
