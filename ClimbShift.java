package frc.robot.subsystems;

import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.commands.FlyWheelOutput;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;


public class ClimbShift extends Subsystem {
  OI m_oi = new OI();
  

public final WPI_TalonSRX tclimbShift = RobotMap.tclimbShift;

  @Override
  public void initDefaultCommand() {
      //RobotMap.climbShift2.follow(climbShift);
  }

  public void Up (double speed){
    tclimbShift.set(speed);
  }

  public void Stop(){
    tclimbShift.set(0);
  }

  public void ClimbingShift(){
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