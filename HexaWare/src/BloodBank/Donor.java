package BloodBank;

public class Donor {
	private String donarId;
	private String donarName;
	private String phone;
	private String bloodGroup;

	public Donor() {
		
	}

	public Donor(String donarId, String donarName, String phone, String bloodGroup) {
		this.donarId = donarId;
		this.donarName = donarName;
		this.phone = phone;
		this.bloodGroup = bloodGroup;
	}

	public String getDonarId() {
		return donarId;
	}

	public void setDonarId(String donarId) {
		this.donarId = donarId;
	}

	public String getDonarName() {
		return donarName;
	}

	public void setDonarName(String donarName) {
		this.donarName = donarName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	@Override
	public String toString() {
		return "Donor [donarId=" + donarId + ", DonarName=" + donarName + ", phone=" + phone + ", bloodGroup="
				+ bloodGroup + "]";
	}

}
