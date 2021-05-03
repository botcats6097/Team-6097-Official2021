package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;



public class FullMecanumDrive extends Command {

  public FullMecanumDrive() {
    requires(Robot.driveTrains);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {

    

  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    Robot.driveTrains.TeleopDrive();
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {

    Robot.driveTrains.StopDrive();
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
  }
}
