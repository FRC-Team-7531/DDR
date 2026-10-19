// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package first.robot;

import org.wpilib.opmode.OpMode;
import org.wpilib.opmode.Teleop;

@Teleop
public class ExampleTeleop implements OpMode {

  

  public ExampleTeleop(Robot robot) {

    robot.exampleController.faceDown().whileTrue(robot.exampleMechanism.aCommand());
    robot.exampleController.faceRight().whileTrue(robot.exampleMechanism.bCommand());
    robot.exampleController.dpadDown().whileTrue(robot.exampleMechanism.dPadDownCommand());


    // robot.exampleController.faceLeft().whileTrue(robot.exampleMechanism.xCommand());
    // robot.exampleController.faceUp().whileTrue(robot.exampleMechanism.yCommand());
    // robot.exampleController.start().whileTrue(robot.exampleMechanism.startCommand());
    // robot.exampleController.back().whileTrue(robot.exampleMechanism.backCommand());
    // robot.exampleController.rightBumper().whileTrue(robot.exampleMechanism.rightBumperCommand());
    // robot.exampleController.leftBumper().whileTrue(robot.exampleMechanism.leftBumperCommand());
    // robot.exampleController.leftStick().whileTrue(robot.exampleMechanism.leftStickCommand());
    // robot.exampleController.rightStick().whileTrue(robot.exampleMechanism.rightStickCommand());
    
  }
}
