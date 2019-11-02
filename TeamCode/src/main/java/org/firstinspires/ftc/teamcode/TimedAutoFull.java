package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.Servo;

import org.firstinspires.ftc.teamcode.lib.Configurator;
import org.firstinspires.ftc.teamcode.lib.WheelController;

@Autonomous(name="Autonomous")
public class TimedAutoFull extends LinearOpMode {
    Configurator config;
    WheelController wheelController;

    public void runOpMode(){
        config = new Configurator(this);
        wheelController = new WheelController(config);
        Servo foundationGrabber;
        foundationGrabber = hardwareMap.servo.get("foundationGrabber");

        //moves forward to foundation
        wheelController.moveXY(0,-0.25);
        sleep(2000);
        wheelController.stopWheels();

        //lifts arm and then drops it to grab foundation
        foundationGrabber.setPosition(0);
        foundationGrabber.setPosition(1);

        //pushes foundation into the corner
        wheelController.moveXY(0,0.25);
        sleep(1000);
        wheelController.stopWheels();

        //releases foundation
        foundationGrabber.setPosition(0);

        //moves backward under the skybridge
        wheelController.moveXY(0,0.25);
        sleep(875);
        wheelController.stopWheels();
    }
}
