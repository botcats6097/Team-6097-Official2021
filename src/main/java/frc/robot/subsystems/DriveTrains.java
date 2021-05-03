package frc.robot.subsystems;

import edu.wpi.first.wpilibj.ADXRS450_Gyro;
//import edu.wpi.first.wpilibj.ADXRS450_Gyro;
//import edu.wpi.first.wpilibj.SPI;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.PWMVictorSPX;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.MecanumDrive;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.SPI;

import frc.robot.commands.FullMecanumDrive;


public class DriveTrains extends Subsystem {

	
ADXRS450_Gyro gyro = new ADXRS450_Gyro(SPI.Port.kOnboardCS0);
public static final int kFrontLeft = 0;
public static final int kFrontRight = 1;
public static final int kBackLeft = 2;
public static final int kBackRight = 3;
public static final int kJoystickChannel = 0;
private MecanumDrive driveSystem;
private Joystick m_stick;
//private Joystick logitech;
//private double slider;
//private double x;
//private double rotateSpeed;	    

 //public static SpeedController motor1, motor2, motor3, motor4; 
	    
	    public DriveTrains() {
				
		gyro.reset();
	    PWMVictorSPX frontL = new PWMVictorSPX(kFrontLeft);
        PWMVictorSPX frontR = new PWMVictorSPX(kFrontRight);
        PWMVictorSPX backL = new PWMVictorSPX(kBackLeft);
        PWMVictorSPX backR = new PWMVictorSPX(kBackRight);
		//frontL.setInverted(true);

		driveSystem = new MecanumDrive(frontL, backL, frontR, backR);
	
		m_stick = new Joystick(0);
		
	  //logitech = new Joystick(1);
	  //x = logitech.getRawAxis(3);
	  //slider = Math.tanh(-x + 1);

	    	
	    	
	        
	    }
	        public void TeleopDrive() {

            	driveSystem.driveCartesian(1.00 * m_stick.getRawAxis(4), -1.00 * m_stick.getY(), 0.75*m_stick.getRawAxis(3) - 0.75*m_stick.getRawAxis(2), gyro.getAngle());
				SmartDashboard.putNumber("Gyro Data", gyro.getAngle());


			}
			   
	        public void AutoDrive(double speed1, double speed2, double speed3) {
	        	
	        	driveSystem.driveCartesian(speed1, speed2, speed3);

	        	
			}
			public void LowGoalDrive(){
				driveSystem.driveCartesian(0, 0.5, 0);
			}
			public void LowGoalBackwards(){
				driveSystem.driveCartesian(0, -0.5, 0);
			}
			
	        public void StopDrive() {
	        	
	        	driveSystem.driveCartesian(0, 0, 0, 0);
	        	
	        }

	        public void initDefaultCommand() {
	            // Set the default command for a subsystem here.
	            setDefaultCommand(new FullMecanumDrive());
	        }
}
