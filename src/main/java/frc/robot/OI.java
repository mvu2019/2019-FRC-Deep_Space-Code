/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;
import frc.robot.commands.NitrogenPusher;
import frc.robot.commands.ArgonPusher;
import frc.robot.commands.LimeDrive;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;;
/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
  /**
   * Thanks to Jack Derunz this template lists all the buttons avalible
   * and it makes button integration very EZ
   * Don't change this it is perfect 
   */
  public static Joystick driver = new Joystick(0);
	public static Joystick operator = new Joystick(1);
	public static Joystick autonomousSelect = new Joystick(2);
	
	static Button A = new JoystickButton(driver, 1);
	static Button B = new JoystickButton(driver, 2);
	static Button X = new JoystickButton(driver, 3);
	static Button Y = new JoystickButton(driver, 4);
	static Button LB = new JoystickButton(driver, 5);
	static Button RB = new JoystickButton(driver, 6);
	static Button Start = new JoystickButton(driver, 7);
	static Button Select = new JoystickButton(driver, 8);
	
	static Button opA = new JoystickButton(operator, 1);
	static Button opB = new JoystickButton(operator, 2);
	static Button opX = new JoystickButton(operator, 3);
	static Button opY = new JoystickButton(operator, 4);
	static Button opLB = new JoystickButton(operator, 5);
	static Button opRB = new JoystickButton(operator, 6);
	static Button opStart = new JoystickButton(operator, 7);
	static Button opSelect = new JoystickButton(operator, 8);
		
	public static int leftX = 0;
	public static int rightX = 4;
	public static int leftY = 1;
	public static int rightY = 5;
	public static int leftTrigger = 2;
  public static int rightTrigger = 3;
  
  /**
   * add the new button imputs here under the second OI class
   */
  public OI(){
	  A.whenPressed(new NitrogenPusher());
	  B.whenPressed(new ArgonPusher());
	  RB.whileHeld(new LimeDrive());

  }
}
