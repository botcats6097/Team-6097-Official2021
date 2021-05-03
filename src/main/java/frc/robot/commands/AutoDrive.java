/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.ADXRS450_Gyro;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class AutoDrive extends Command {
  private double speed1, speed2, speed3, timeOUT;
  private Timer timer = new Timer();
  ADXRS450_Gyro gyro = new ADXRS450_Gyro();
  
  public AutoDrive(double speed1, double speed2, double speed3, double timeOUT) {
    
    requires(Robot.driveTrains);
    this.speed1 = speed1; //Strafing
    this.speed2 = speed2; //Forward
    this.speed3 = speed3; //Turning
    this.timeOUT = timeOUT;

  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
    timer.reset();
    timer.start();
    gyro.reset();
  }


  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    Robot.driveTrains.AutoDrive(speed2, speed1, speed3);
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return timer.get() > timeOUT;
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
