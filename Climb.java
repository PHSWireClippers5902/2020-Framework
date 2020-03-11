package frc.robot.subsystems;

import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.commands.FlyWheelOutput;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;


public class Climb extends Subsystem {
  OI m_oi = new OI();
  

public final WPI_TalonSRX tclimb = RobotMap.tclimb;


  @Override
  public void initDefaultCommand() {
  }

  public void Up (double speed){
    tclimb.set(speed);
    System.out.println("wHAT UP");
  }

  public void Stop(){
    tclimb.set(0);
  }

  public void climbing(){
    boolean xboxX = m_oi.getXbox().getXButton();
    boolean xboxY = m_oi.getXbox().getYButton();
    if (xboxX){  
      Up(0.05);
    }else if(xboxY) {
      Up(-0.05);
    }else{
      Up(0);
    }
  }

}//closes class