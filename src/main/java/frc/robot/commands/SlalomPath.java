// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class SlalomPath extends CommandGroup {
  /** Add your docs here. */
  public SlalomPath() {
    addSequential(new AutoDrive(.5, 0, 0, 1.185));
    addSequential(new AutoDrive(0, 0, -0.5 , 0.56));
    addSequential(new AutoDrive(.5, 0, 0 , 1.185));
    addSequential(new AutoDrive(0, 0, .5 , 0.567));
    addSequential(new AutoDrive(.5, 0, 0 , 2.5));
    addSequential(new AutoDrive(0, 0, .5 , 0.541));
    addSequential(new AutoDrive(0.5, 0, 0 , 1.1));
    addSequential(new AutoDrive(0, 0, -.5 , 0.6));
    addSequential(new AutoDrive(0.5, 0, 0 , 1));
    addSequential(new AutoDrive(0, 0, -0.5 , 0.62));
    addSequential(new AutoDrive(0.5, 0, 0 , .9));
    addSequential(new AutoDrive(0, 0, -0.5 , 0.62));
    addSequential(new AutoDrive(0.5, 0, 0 , 1.1));
    addSequential(new AutoDrive(0, 0, -0.5 , 0.64));
    addSequential(new AutoDrive(0.5, 0, 0 , 1.4));
    addSequential(new AutoDrive(0, 0, .5 , .57 ));
    addSequential(new AutoDrive(.5, 0, 0 , 2.7));
    addSequential(new AutoDrive(0, 0, .5 , 0.56));
    addSequential(new AutoDrive(0.5, 0, 0 , 1));
    addSequential(new AutoDrive(0, 0, -0.5 , 0.56));
    addSequential(new AutoDrive(0.5, 0, 0 , 1));
    addSequential(new AutoDrive(-0.2, 0, 0 , .3));
  }
}
