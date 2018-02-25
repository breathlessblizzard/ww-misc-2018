package frc.team2478.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.team2478.robot.ControlHandler;
import frc.team2478.robot.subsystems.WheelMotor;

public class RunMotorAtPercentage extends Command {

	public RunMotorAtPercentage() {
		requires(WheelMotor.getInstance());
	}
	
	@Override
	protected void execute() {
		WheelMotor.getInstance().setMotor(ControlHandler.getInstance().getRightY());
	}
	
	@Override
	protected boolean isFinished() {
		return false;
	}

}
