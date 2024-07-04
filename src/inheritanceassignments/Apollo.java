package inheritanceassignments;

public class Apollo extends Hospital{
	
@Override
public void treatPatient() {
	System.out.println("Apollo child class treatPatient method that is overridden from Hospital");
	
}
@Override
public void dischargePatient() {
	System.out.println("Apollo child class dischargePatient method that is overridden from Hospital");
	
}

public void performSurgery() {
	System.out.println("Apollo child class individual performSurgery method");
}


}
