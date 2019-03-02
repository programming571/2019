package org.usfirst.frc571.IntialAttempt.commands;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc571.IntialAttempt.Robot;
import org.usfirst.frc571.IntialAttempt.subsystems.RotatingArm;

public class RotateToPanelPickup extends Command {

    public RotateToPanelPickup() {

    }

    // Called just before this Command runs the first time
    @Override
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    @Override
    protected void execute() {
        Robot.rotatingArm.RotateTo(RotatingArm.DEGREE * 65);
        // Robot.rotatingArm.rotateToPanelPickup();
    }

    // Make this return true when this Command no longer needs to run execute()
    @Override
    protected boolean isFinished() {
        // if(Math.abs(Robot.rotatingArm.getEncoderCount()))
        //NO.
        return true;

    }

    // Called once after isFinished returns true
    @Override
    protected void end() {
        Robot.rotatingArm.RotateArm(0.0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    @Override
    protected void interrupted() {
    }
}
