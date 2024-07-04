package oopinterface;

public class FortisHospital extends Hospital implements USMedical, UKMedical, IndianMedical {
	
	int MIN_FEE = 20;
	static final int MAX_FEE = 90;

	// US
	@Override
	public void physioServices() {
		System.out.println("FH -- physioServices");

	}

	@Override
	public void oncologyServices() {

		System.out.println("FH -- oncologyServices");
	}

	@Override
	public void dentalServices() {

		System.out.println("FH -- dentalServices");
	}
	@Override
	public void physioServices(int a) {
		System.out.println("FH -- physioServices "  + a);
		
	}
	
	@Override
	public void ENTServcies() {
		System.out.println("FH -- ENTServcies " );
		
	}
	
	@Override
	public void covidVaccination() {
		System.out.println("FH -- covidVaccination " );
		
	}
	
	@Override
	public void bloodTesting() {
		// TODO Auto-generated method stub
		
	}

	// UK
	@Override
	public void gynecServices() {
		System.out.println("FH -- gynecServices");

	}

	@Override
	public void gatroServices() {
		System.out.println("FH -- gatroServices");

	}

	// India
	@Override
	public void pediaServices() {
		System.out.println("FH -- pediaServices");

	}

	@Override
	public void neuroServices() {
		System.out.println("FH -- neuroServices");

	}

	// common
	@Override
	public void emergenyServices() {
		System.out.println("FH -- emergenyServices");

	}

	// Individual methods
	public void medicalTraining() {
		System.out.println("FH -- medical training");

	}

	public void pathologyServices() {
		System.out.println("FH -- pathologyServices");

	}
	//method hiding
	public static void billing() {
		System.out.println("FH -- Billing");
	}
	
	@Override
	public void helpDesk() {
		System.out.println("FH -- helpDesk");
	}
	
	@Override
	public void medicalRND() {
		System.out.println("FH Medical RND");
	}





}
