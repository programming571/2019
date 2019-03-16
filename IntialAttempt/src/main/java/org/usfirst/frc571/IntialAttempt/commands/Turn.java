package org.usfirst.frc571.IntialAttempt.commands;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc571.IntialAttempt.Robot;

/**
 *
 */
public class Turn extends Command {
    
    private double leftSpeed;
    private double rightSpeed;

    public Turn(double turnRate) {
        leftSpeed = turnRate;
        rightSpeed = -turnRate;

        requires(Robot.driveTrain);
    }

    // Called just before this Command runs the first time
    @Override
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    @Override
    protected void execute() {
        Robot.driveTrain.tankDrive(leftSpeed, rightSpeed);
    }

    // Make this return true when this Command no longer needs to run execute()
    @Override
    protected boolean isFinished() {
		return true;
    }

    // Called once after isFinished returns true
    @Override
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    @Override
    protected void interrupted() {
    }
}