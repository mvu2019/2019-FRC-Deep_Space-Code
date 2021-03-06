/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;
import frc.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;

public class FD_Intake extends Command {

  private double power = 0.0;

  public FD_Intake(double power){
    requires(Robot.fd);
    this.power = power;
  }

  @Override
  protected void initialize(){
  }

  @Override
  protected void execute(){
    Robot.fd.setPower(power);
  }

  @Override
  protected boolean isFinished(){
    return false;
  }

  @Override
  protected void end(){
    Robot.fd.stop();
  }

  @Override
  protected void interrupted(){
    end();
  }
}
