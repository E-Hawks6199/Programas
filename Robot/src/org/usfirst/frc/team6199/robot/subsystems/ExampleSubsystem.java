package org.usfirst.frc.team6199.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Talon;


/**
 *
 */
public class ExampleSubsystem extends Subsystem {
	// Put methods for controlling this subsystem
	// here. Call these from Commands.
Talon mano = new Talon(1); 
	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());
	}
	public void setMotorOutput() {
		mano.set(0.5);
	}
}
