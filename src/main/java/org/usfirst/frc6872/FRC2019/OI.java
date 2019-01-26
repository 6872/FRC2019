// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc6872.FRC2019;

import org.usfirst.frc6872.FRC2019.commands.*;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.*;
import org.usfirst.frc6872.FRC2019.subsystems.*;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);

    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.

    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:

    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());

    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());

    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());


    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public JoystickButton pistonButton;
    public JoystickButton loadDiskButton;
    public JoystickButton ballGroundButton;
    public JoystickButton ballChassisButton;
    public JoystickButton ballLoadButton;
    public JoystickButton ballLevel1Button;
    public JoystickButton ballLevel2Button;
    public JoystickButton ballLevel3Button;
    public JoystickButton diskLoadButton;
    public JoystickButton diskLevel1Button;
    public JoystickButton diskLevel2Button;
    public JoystickButton diskLevel3Button;
    public Joystick joystick;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public OI() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS

        joystick = new Joystick(0);
        
        diskLevel3Button = new JoystickButton(joystick, 5);
        diskLevel3Button.whenPressed(new SetLevel(Tower.Disk3));
        diskLevel2Button = new JoystickButton(joystick, 3);
        diskLevel2Button.whenPressed(new SetLevel(Tower.Disk2));
        diskLevel1Button = new JoystickButton(joystick, 4);
        diskLevel1Button.whenPressed(new SetLevel(Tower.Disk1));
        diskLoadButton = new JoystickButton(joystick, 6);
        diskLoadButton.whenPressed(new SetLevel(Tower.DiskLoad));
        ballLevel3Button = new JoystickButton(joystick, 7);
        ballLevel3Button.whenPressed(new SetLevel(Tower.Ball3));
        ballLevel2Button = new JoystickButton(joystick, 8);
        ballLevel2Button.whenPressed(new SetLevel(Tower.Ball2));
        ballLevel1Button = new JoystickButton(joystick, 9);
        ballLevel1Button.whenPressed(new SetLevel(Tower.Ball1));
        ballLoadButton = new JoystickButton(joystick, 10);
        ballLoadButton.whenPressed(new SetLevel(Tower.BallLoad));
        ballChassisButton = new JoystickButton(joystick, 11);
        ballChassisButton.whenPressed(new SetLevel(Tower.Robot));
        ballGroundButton = new JoystickButton(joystick, 12);
        ballGroundButton.whenPressed(new SetLevel(Tower.Ground));
        loadDiskButton = new JoystickButton(joystick, 1);
        loadDiskButton.whenPressed(new LoadDisk());
        pistonButton = new JoystickButton(joystick, 2);
        pistonButton.whenPressed(new TogglePiston());


        // SmartDashboard Buttons
        SmartDashboard.putData("Autonomous Command", new AutonomousCommand());
        SmartDashboard.putData("Drive With Joysticks", new DriveWithJoysticks());
        SmartDashboard.putData("Set Piston: Extend Piston", new SetPiston(true));
        SmartDashboard.putData("Set Piston: Retract Piston", new SetPiston(false));
        SmartDashboard.putData("Toggle Piston", new TogglePiston());
        SmartDashboard.putData("Set Level: Ground", new SetLevel(0.5));
        SmartDashboard.putData("Load Disk", new LoadDisk());

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
    public Joystick getJoystick() {
        return joystick;
    }


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
}

