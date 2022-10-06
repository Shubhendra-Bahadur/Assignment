import BloodBank.BloodBank;
import BloodBank.Donor;
import Exceptions.InvalidBloodGroupException;
import Exceptions.InvalidDonorIDException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Donor donor1=new Donor("111","Sunny","1234567891","A+");
		Donor donor2=new Donor("112","Dhruv","1234567892","B+");
		Donor donor3=new Donor("113","Rishi","1234567893","B+");
		Donor donor4=new Donor("114","Ravi","1234567894","O+");
		
		BloodBank bloodBank1=new BloodBank("1234", "ABC blood Bank");
		
		System.out.println(bloodBank1.addNewDonor(donor1));
		System.out.println(bloodBank1.addNewDonor(donor2));
		System.out.println(bloodBank1.addNewDonor(donor3));
		System.out.println(bloodBank1.addNewDonor(donor4));
		
		System.out.println("----------------");
		
		try {
			System.out.println(bloodBank1.getDonorDetails("111"));
		} catch (InvalidDonorIDException e) {
			// TODO Auto-generated catch block
			System.out.println("No such ID present in record, please enter valid ID");
		}
		
		System.out.println("----------------");
		
		Donor donor5=new Donor("111","Sunny","1234567895","B+");
		
		try {
			System.out.println(donor1);
			System.out.println(bloodBank1.updateDonor(donor5));
			System.out.println(donor1);
		} catch (InvalidDonorIDException e) {
			// TODO Auto-generated catch block
			System.out.println("No such ID present in record, please enter valid ID");
		}
		
		System.out.println("----------------");
		
		try {
			System.out.println(bloodBank1.deleteDonor("111"));
		} catch (InvalidDonorIDException e) {
			// TODO Auto-generated catch block
			System.out.println("No such ID present in record, please enter valid ID.");
		}
		
		System.out.println("----------------");
		try {
			System.out.println(bloodBank1.getDonors("BA+"));
		} catch (InvalidBloodGroupException e) {
			// TODO Auto-generated catch block
			System.out.println("No person with such blood group present in record.");
		}
	}

}
