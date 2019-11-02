package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.Servo;

import org.firstinspires.ftc.teamcode.lib.AutoController;
import org.firstinspires.ftc.teamcode.lib.Configurator;
import org.firstinspires.ftc.teamcode.lib.WheelController;

@Autonomous(name="Autonomous")
public class EncoderAutoFull extends LinearOpMode {
    Configurator config;
    AutoController autoController;

    public void runOpMode(){
        config = new Configurator(this);
        autoController = new AutoController(config);
        Servo foundationGrabber;
        foundationGrabber = hardwareMap.servo.get("foundationGrabber");
        waitForStart();

        //moves forward to foundation
        autoController.moveForwardCentimeters(152.4,0.25);
        autoController.stopWheels();
        autoController.moveXY(-0.25,0);
        sleep(4000);
        autoController.stopWheels();

        //lifts arm and then drops it to grab foundation
        foundationGrabber.setPosition(0);
        foundationGrabber.setPosition(1);

        //pushes foundation into the corner
        autoController.moveXY(0.25,0);
        sleep(4000);
        autoController.stopWheels();

        //releases foundation
        foundationGrabber.setPosition(0);

        //moves backward under the skybridge
        autoController.moveForwardCentimeters(91.4, 0.25);
        autoController.stopWheels();
    }
}
