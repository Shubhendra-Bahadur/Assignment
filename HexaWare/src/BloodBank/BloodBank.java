package BloodBank;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import Exceptions.InvalidBloodGroupException;
import Exceptions.InvalidDonorIDException;

public class BloodBank {
	private String bloodBankId;
	private String bloodBankName;
	private Set<Donor> Donors;

	public BloodBank(String bloodBankId, String bloodBankName) {
		this.bloodBankId = bloodBankId;
		this.bloodBankName = bloodBankName;
		Donors = new HashSet<>();
	}

	public boolean addNewDonor(Donor newDonor) {
		return addDonorsToSet(newDonor);
	}

	public Donor getDonorDetails(String donorID) throws InvalidDonorIDException {
		Donor d = Donors.stream().filter(donor -> donor.getDonarId() == donorID).findFirst()
				.orElseThrow(() -> new InvalidDonorIDException());
		return d;
	}

	public boolean updateDonor(Donor updatedDonor) throws InvalidDonorIDException {
		Donor d = Donors.stream().filter(donor -> donor.getDonarId() == updatedDonor.getDonarId()).findFirst()
				.orElseThrow(() -> new InvalidDonorIDException());
		d.setPhone(updatedDonor.getPhone());
		return true;
	}

	public boolean deleteDonor(String DonorID) throws InvalidDonorIDException {
		Donor d = Donors.stream().filter(donor -> donor.getDonarId() == DonorID).findFirst()
				.orElseThrow(() -> new InvalidDonorIDException());
		Donors.remove(d);
		return true;
	}

	public Set<Donor> getDonors(String BloodGroup) throws InvalidBloodGroupException {
		Set<Donor> donorList = Donors.stream().filter(donor -> donor.getBloodGroup() == BloodGroup)
				.collect(Collectors.toSet());
		
		if(donorList.isEmpty()) throw new InvalidBloodGroupException();
		
		return donorList;
	}

	private boolean addDonorsToSet(Donor donor) {

		try {
			Donors.add(donor);
			return true;
		} catch (Exception e) {
			return false;
		}

	}
}
