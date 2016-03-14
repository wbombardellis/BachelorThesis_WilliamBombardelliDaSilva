package main;

import de.silvawb.utils.*;

public class Driver extends Person {
	/*
	 * Fields
	 */
	@Inv(constraint = "driverLicense >= 1")
	public Integer driverLicense;	
	public Integer driverLicenseStatus;
	private Integer experience = 0; 
	
	/*
	 * Methods
	 */
	public void checkRep(){
		assert driverLicense >= 1;
	}
	public void driveCheckInvConstraint(Drivable vehicle){
		assert vehicle != null;
	}
	public void driveCheckPreConstraint(Drivable vehicle){
		assert driverLicenseStatus >= 1;
	}
	public void driveCheckPosConstraint(Drivable vehicle){
	}

	@Inv(constraint = "vehicle <> null")
	@Pre(constraint = "driverLicenseStatus >= 1")
	@Pos(constraint = "experience > experience@pre")
	@Interaction(interactionSequence = {
			"start","drive","stop",
	})
	public void drive(Drivable vehicle){
		checkRep();
		driveCheckInvConstraint(vehicle);
		driveCheckPreConstraint(vehicle);
		
		vehicle.start();
		vehicle.drive();
		vehicle.stop();
		
		checkRep();
		driveCheckInvConstraint(vehicle);
		driveCheckPosConstraint(vehicle);
	}
}