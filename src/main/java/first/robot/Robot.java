// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package first.robot;

import org.wpilib.command3.Scheduler;
import org.wpilib.command3.button.CommandGamepad;
import org.wpilib.framework.OpModeRobot;
import first.robot.constants.DriverConstants;
import first.robot.mechanisms.ExampleMechanism;

public class Robot extends OpModeRobot {
  final ExampleMechanism exampleMechanism = new ExampleMechanism();
  final CommandGamepad exampleController = new CommandGamepad(DriverConstants.DRIVER_CONTROLLER_PORT);

  public Robot() {
  }

  @Override
  public void robotPeriodic() {
    System.out.println(getAllPressedButtons());
    Scheduler.getDefault().run();
  }

  private String getAllPressedButtons() {
    StringBuilder sb = new StringBuilder();
    if (exampleController.faceDown().getAsBoolean())
      sb.append("A ");
    if (exampleController.faceUp().getAsBoolean())
      sb.append("Y ");
    if (exampleController.faceLeft().getAsBoolean())
      sb.append("X ");
    if (exampleController.faceRight().getAsBoolean())
      sb.append("B ");
    if (exampleController.leftBumper().getAsBoolean())
      sb.append("Left Bumper ");
    if (exampleController.rightBumper().getAsBoolean())
      sb.append("Right Bumper ");
    if (exampleController.start().getAsBoolean())
      sb.append("Start ");
    if (exampleController.back().getAsBoolean())
      sb.append("Back ");
    if (exampleController.dpadDown().getAsBoolean())
      sb.append("D Down ");
    if (exampleController.dpadUp().getAsBoolean())
      sb.append("D Up ");
    if (exampleController.dpadLeft().getAsBoolean())
      sb.append("D Left ");
    if (exampleController.dpadRight().getAsBoolean())
      sb.append("D Right ");
    if (exampleController.leftStick().getAsBoolean())
      sb.append("Left Stick ");
    if (exampleController.rightStick().getAsBoolean())
      sb.append("Right Stick ");
    if (exampleController.leftTrigger().getAsBoolean())
      sb.append("Left Trigger ");
    if (exampleController.rightTrigger().getAsBoolean())
      sb.append("Right Trigger ");
    if (exampleController.getLeftY() == -1)
      sb.append("Left Stick Up ");
    if (exampleController.getLeftY() == 1)
      sb.append("Left Stick Down ");
    if (exampleController.getLeftX() == -1)
      sb.append("Left Stick Left ");
    if (exampleController.getLeftX() == 1)
      sb.append("Left Stick Right ");
    if (exampleController.getRightY() == -1)
      sb.append("Right Stick Up ");
    if (exampleController.getRightY() == 1)
      sb.append("Right Stick Down ");
    if (exampleController.getRightX() == -1)
      sb.append("Right Stick Left ");
    if (exampleController.getRightX() == 1)
      sb.append("Right Stick Right ");
    if (exampleController.guide().getAsBoolean())
      sb.append("Guide ");
    if (exampleController.leftPaddle1().getAsBoolean())
      sb.append("Left Paddle 1 ");
    if (exampleController.leftPaddle2().getAsBoolean())
      sb.append("Left Paddle 2 ");
    if (exampleController.rightPaddle1().getAsBoolean())
      sb.append("Right Paddle 1 ");
    if (exampleController.rightPaddle2().getAsBoolean())
      sb.append("Right Paddle 2 ");
    if (exampleController.misc1().getAsBoolean())
      sb.append("Misc 1 ");
    if (exampleController.misc2().getAsBoolean())
      sb.append("Misc 2 ");
    if (exampleController.misc3().getAsBoolean())
      sb.append("Misc 3 ");
    if (exampleController.misc4().getAsBoolean())
      sb.append("Misc 4 ");
    if (exampleController.misc5().getAsBoolean())
      sb.append("Misc 5 ");
    if (exampleController.misc6().getAsBoolean())
      sb.append("Misc 6 ");
    return sb.toString().trim();
  }
}
