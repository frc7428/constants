/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.XboxController;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants.  This class should not be used for any other purpose.  All constants should be
 * declared globally (i.e. public static).  Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
  // Using internal classes can make organizing your constants easier.
  // It can also provide some safety (preventing duplicate IDs).

  // If you have any PWM Devices, you should have one for PWM IDs.
  // There is only one set of PWMs, so you only need one class.
  public static final class PWM {
    public static final int DRIVE_LEFT = 0;
  }

  // If you have any pneumatics (solenoids), you should have one for the PCM.
  // If you have to add another PCM, this can get more complicated.
  public static final class PCM {
    public static final int ARM_UP = 2;
  }

  // If you have CAN devices, you should have one for each type of CAN device.
  // Since devices of different types can have the same IDs, we want a separate class for each.
  public static final class VICTOR_SPX_CAN {
    public static final int SHOOTER_LEFT = 1;
  }

  public static final class TALON_SRX_CAN {
    public static final int SHOOTER_RIGHT = 2;
  }

  public static final class SPARK_MAX_CAN {
    public static final int DRIVE_RIGHT = 2;
  }

  // You should have one class for your USB Devices.
  public static final class USB {
    public static final int DRIVE_JOYSTICK = 0;
    public static final int MECHANISM_CONTROLLER = 1;
  }

  // You should have one class for the buttons for each controller object.
  // For example, two joysticks should have two classes.
  // This will help prevent using the same button for two things.
  public static final class DRIVE_JOYSTICK_BUTTON {
    public static final int RAISE_ARM = 1;
  }

  public static final class MECHANISM_CONTROLLER_BUTTON {
    public static final int SHOOT = XboxController.Button.kA.value;
  }
}
