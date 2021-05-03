/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.buttons.POVButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
  public static Joystick xbox = new Joystick(RobotMap.KController);
	public static Joystick logitechstick = new Joystick(RobotMap.KLogitech);
	public static Joystick xbox2 = new Joystick(RobotMap.KXbox2);
	public static JoystickButton

	AButton = new JoystickButton(xbox, 1), // A button
			BButton = new JoystickButton(xbox, 2), // B button
			XButton = new JoystickButton(xbox, 3), // X button
			YButton = new JoystickButton(xbox, 4), // Y button
			LeftBumper = new JoystickButton(xbox, 5), // Left Bumper
			RightBumper = new JoystickButton(xbox, 6), // Right Bumper
			SelectButton = new JoystickButton(xbox, 7), // Back
			StartButton = new JoystickButton(xbox, 8), // Start
			L3 = new JoystickButton(xbox, 9), // Left Stick Click
			R3 = new JoystickButton(xbox, 10), // Right Stick Click

			// Xbox 2
			AButton2 = new JoystickButton(xbox2, 1), // A button
			BButton2 = new JoystickButton(xbox2, 2), // B button
			XButton2 = new JoystickButton(xbox2, 3), // X button
			YButton2 = new JoystickButton(xbox2, 4), // Y button
			LeftBumper2 = new JoystickButton(xbox2, 5), // Left Bumper
			RightBumper2 = new JoystickButton(xbox2, 6), // Right Bumper
			SelectButton2 = new JoystickButton(xbox2, 7), // Back
			StartButton2 = new JoystickButton(xbox2, 8), // Start
			L3Two = new JoystickButton(xbox2, 9), // Left Stick Click
			R3Two = new JoystickButton(xbox2, 10), // Right Stick Click

			// Logitech
			LogitechButton1 = new JoystickButton(logitechstick, 1),
			LogitechButton2 = new JoystickButton(logitechstick, 2),
			LogitechButton3 = new JoystickButton(logitechstick, 3),
			LogitechButton4 = new JoystickButton(logitechstick, 4),
			LogitechButton5 = new JoystickButton(logitechstick, 5),
			LogitechButton6 = new JoystickButton(logitechstick, 6),
			LogitechButton7 = new JoystickButton(logitechstick, 7),
			LogitechButton8 = new JoystickButton(logitechstick, 8),
			LogitechButton9 = new JoystickButton(logitechstick, 9),
			LogitechButton10 = new JoystickButton(logitechstick, 10),
			LogitechButton11 = new JoystickButton(logitechstick, 11),
			LogitechButton12 = new JoystickButton(logitechstick, 12);
	// POVButton LPOV1 = new POVButton(logitechstick, 0);
	public static POVButton
	// Starts at the top, with the topmost being 0 degrees
	// and goesclockwise, meaning the right most one is 90
	Xbox0 = new POVButton(xbox, 0), 
	Xbox90 = new POVButton(xbox, 90), 
	Xbox180 = new POVButton(xbox, 180),
	Xbox270 = new POVButton(xbox, 270),

	Xbox0Two = new POVButton(xbox2, 0), 
	Xbox90Two = new POVButton(xbox2, 90),
	Xbox180Two = new POVButton(xbox2, 180), 
	Xbox270Two = new POVButton(xbox2, 270),

	Logitech0 = new POVButton(logitechstick, 0), 
	Logitech90 = new POVButton(logitechstick, 90),
	Logitech180 = new POVButton(logitechstick, 180), 
	Logitech270 = new POVButton(logitechstick, 270);
}
