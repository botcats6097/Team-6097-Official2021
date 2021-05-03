/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class AutoDriveForward extends CommandGroup {
  /**
   * Add your docs here.
   */
  //.5 speed with 1.15 time is a perfect 180 with a charged battery
  //.5 speed with a 0.56 time is a perfect 90 degree turn with a carge battery
  //.4 speed with a .4 time is a decent 45, but not perfect.
  //Do not try to strafe, trust me. It won't work well
  public AutoDriveForward() {
    addSequential(new AutoDrive(.6, 0, 0, 1.5));
    //addSequential(new AutoDrive(-.5,0,0,2));
    //addSequential(new AutoDrive(0, 0, .4, .4));//positive on rotate is clockwise
    //addSequential(new AutoDrive(.5, 0, 0, 1));
   // addSequential(new AutoDrive(0, 0, -.4, .4));
    addSequential(new AutoDrive(0, 0, 0, 2));
    addSequential(new AutoDrive(0, 0, .5, 1.15));
    addSequential(new AutoDrive(.5, 0, 0 ,2 ));
  }
} 
