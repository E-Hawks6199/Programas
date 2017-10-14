package org.usfirst.frc.team6199.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Talon;


/**
 *
 */
public class chasis extends Subsystem {
	// Put methods for controlling this subsystem
	// here. Call these from Commands.
Talon mano = new Talon(1); 

RobotDrive arcadeDrive = new RobotDrive(2,3);


	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());
	}
	public void setMotorOutput() {
		mano.set(0.5);
	}
	public void {
		arcadeDrive.arcadeDrive();
	}
}
