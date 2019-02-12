/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class Conveyor extends Command {
  
  public Conveyor(){
    requires(Robot.cv);
  }

  @Override
  protected void initialize(){
  }

  @Override 
  public void execute(){
    Robot.cv.setMotor(0.50);
  }

  @Override
  protected boolean isFinished(){
    return true;
  }

  @Override 
  public void end(){
  }

  @Override 
  protected void interrupted(){
  }
}

