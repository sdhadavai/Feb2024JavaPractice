package inheritanceassignments;

public class TestHospital {

	public static void main(String[] args) {

		//Parent Class Object
		Hospital h = new Hospital();
		//By using Parent reference we can only access Hospital data members
		System.out.println("---Using Parent Class Object---");
		h.admitPatient();//Hospital parent class admitPatient method
		h.treatPatient();//Hospital parent class dischargePatient method
		h.dischargePatient();//Hospital parent class dischargePatient method
		
		//Using child class object
		
		//By using child class reference we can access child class and parent class data members
		//If child class have overridden method then it access from child class otherwise it will go to parent class and access the methods
		//for variable if it has in child class it access otherwise from parent class
		
		System.out.println("---Using Apollo Child Class Object---");
		Apollo a = new Apollo();
		a.admitPatient();//Hospital parent class admitPatient method
		a.treatPatient();//Apollo child class treatPatient method that is overridden from Hospital
		a.dischargePatient();//Apollo child class dischargePatient method that is overridden from Hospital
		a.performSurgery();//Apollo child class individual performSurgery method
		
		System.out.println("---Using Fortis Child Class Object---");
		Fortis f = new Fortis();
		f.admitPatient();//Hospital parent class admitPatient method
		f.treatPatient();//Fortis child class treatPatient method that is overridden from Hospital
		f.dischargePatient();//Fortis child class dischargePatient method that is overridden from Hospital
		f.prescribeMedication();//Fortis child class individual prescribeMedication method
		
		System.out.println("---Using Max Child Class Object---");
		Max m = new Max();
		m.admitPatient();//Hospital parent class admitPatient method
		m.treatPatient();//Max child class treatPatient method that is overridden from Hospital
		m.dischargePatient();//Max child class dischargePatient method that is overridden from Hospital
		m.conductTests();//Max child class individual conductTests method
		
		//Up casting: Casting a child class object to a parent class reference.
		//By using parent class reference we can access all inherited methods from parent class and only overridden methods from child class
		//we cannot access child class individual members
		
		System.out.println("---created Apollo child class object by using  Parent class reference ---");
		Hospital ha = new Apollo();
		ha.admitPatient();//Hospital parent class admitPatient method
		ha.treatPatient();//Apollo child class treatPatient method that is overridden from Hospital
		ha.dischargePatient();//Apollo child class dischargePatient method that is overridden from Hospital
		//ha.performSurgery();//Cannot access with parent class reference
		
		System.out.println("---created Fortis child class object by using  Parent class reference ---");
		
		Hospital hf = new Fortis();
		hf.admitPatient();//Hospital parent class admitPatient method
		hf.treatPatient();//Apollo child class treatPatient method that is overridden from Hospital
		hf.dischargePatient();//Apollo child class dischargePatient method that is overridden from Hospital
		//hf.prescribeMedication();//Cannot access with parent class reference
		
		System.out.println("---created Max child class object by using  Parent class reference ---");
		
		Hospital hm = new Max();
		hm.admitPatient();//Hospital parent class admitPatient method
		hm.treatPatient();//Apollo child class treatPatient method that is overridden from Hospital
		hm.dischargePatient();//Apollo child class dischargePatient method that is overridden from Hospital
		//hm.conductTests();//Cannot access with parent class reference
		
		//We get ClasCastException for down casting that is whenever we create child class of parenet class with child class reference
		//Apollo ah =  (Apollo) new Hospital();//ClassCastException
		//Fortis fh =  (Fortis) new Hospital();//ClassCastException
		//Max mh =  (Max) new Hospital();//ClassCastException
	}

}
