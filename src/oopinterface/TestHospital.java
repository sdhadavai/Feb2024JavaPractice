package oopinterface;

public class TestHospital {

	public static void main(String[] args) {
		
		FortisHospital fh = new FortisHospital();
		fh.dentalServices();
		fh.oncologyServices();
		fh.gatroServices();
		fh.neuroServices();
		fh.gynecServices();
		fh.physioServices();
		fh.physioServices(10);
		//common
		fh.emergenyServices();
		//individual 		
		fh.medicalTraining();
		fh.pathologyServices();
		
		System.out.println(USMedical.MIN_FEE);
		System.out.println(fh.MIN_FEE);
		System.out.println(FortisHospital.MAX_FEE);
		
		USMedical.billing();
		FortisHospital.billing();
		fh.helpDesk();
		fh.covidVaccination();
		
		fh.medicalNews();
		fh.medicalRND();
		
		//Top Casting: Child class object can be referred by Parent interface ref varaiable
		
		USMedical us = new FortisHospital();
		us.dentalServices();
		us.physioServices();
		us.oncologyServices();
		us.emergenyServices();
		
		
		//normal casting
		UKMedical uk = (UKMedical) us;
		uk.gynecServices();
		uk.gatroServices();
		
		WHO wh = (WHO)us;
		wh.covidVaccination();
		
		//down casting: not possible at compile time as well for interface
		//FortisHospital us1 = new USMedical();
		
	}

}
