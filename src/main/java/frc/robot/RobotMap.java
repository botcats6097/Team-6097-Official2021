/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
  public static final int KController = 0; // Xbox Controller
  public static final int KLogitech = 1; // Logitech Flight Stick
  public static final int KXbox2 = 2;

  //Motors
  public static int KDrive0 = 0;
  public static int KDrive1 = 1;
  public static int KDrive2 = 2;
  public static int KDrive3 = 3;
}
