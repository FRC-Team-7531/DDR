// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package first.robot.mechanisms;

import org.wpilib.command3.Command;
import org.wpilib.command3.Mechanism;
import org.wpilib.command3.Trigger;
import org.wpilib.drivers.motor.Talon;

import first.robot.constants.ExampleConstants;

/** An example class demonstrating basic use of mechanisms and commands. */
public class ExampleMechanism implements Mechanism {
  public final Trigger exampleCondition = new Trigger(() -> false);

  public double speed = 0;

  /**
   * An example command that requires this mechanism. Only one command that requires this mechanism
   * may run at a time - if a command is already running, this command will interrupt it.
   *
   * <p>This example runs indefinitely and prints a message every time it executes.
   *
   * @return An example command.
   */
  public Command exampleCommand() {
    return run(coroutine -> {
          while (true) {
            ExampleConstants.EXAMPLE_TALON.setThrottle(1);
            coroutine.yield();
          }
        })
        .named("Example Command");
  }

  public Command xCommand() {
    return run(coroutine -> {
          while (true) {
            System.out.println("East");
            coroutine.yield();
          }
        })
        .named("X Command");
  }

  public Command yCommand() {
    return run(coroutine -> {
          while (true) {
            System.out.println("West");
            coroutine.yield();
          }
        })
        .named("Y Command");
  }

  public Command aCommand() {
    return run(coroutine -> {
          while (true) {
            System.out.println("North");
            speed += 0.01;
            ExampleConstants.EXAMPLE_TALON.setThrottle(1);
            coroutine.yield();
          }
        })
        .named("A Command");
  }

  public Command bCommand() {
    return run(coroutine -> {
          while (true) {
            System.out.println("South");
            speed -= 0.01;
            ExampleConstants.EXAMPLE_TALON.setThrottle(1);
            coroutine.yield();
          }
        })
        .named("B Command");
  }

  public Command startCommand() {
    return run(coroutine -> {
          while (true) {
            System.out.println("Start");
            coroutine.yield();
          }
        })
        .named("Start Command");
  }

  public Command backCommand() {
    return run(coroutine -> {
          while (true) {
            System.out.println("Select");
            coroutine.yield();
          }
        })
        .named("Back Command");
  }

  public Command rightBumperCommand() {
    return run(coroutine -> {
          while (true) {
            System.out.println("Square");
            coroutine.yield();
          }
        })
        .named("Right Bumper Command");
  }
  
  public Command leftBumperCommand() {
    return run(coroutine -> {
          while (true) {
            System.out.println("Triangle");
            coroutine.yield();
          }
        })
        .named("Left Bumper Command");
  }

  public Command dPadDownCommand() {
    return run(coroutine -> {
          while (true) {
            System.out.println("Middle");
            speed = 0;
            ExampleConstants.EXAMPLE_TALON.setThrottle(1);
            coroutine.yield();
          }
        })
        .named("D Pad Down Command");
  }
}
