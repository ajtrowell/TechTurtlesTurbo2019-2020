package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

@Autonomous(name="Autonomous")
public class TimedAutoFull extends LinearOpMode {
    public void runOpMode(){
    WheelController wheelController = new WheelController(hardwareMap);
    Servo arm;
    arm = hardwareMap.servo.get("arm");

    //moves forward to foundation
        wheelController.moveXY(0,1);
        sleep(4000);
        wheelController.stopWheels();

        //lifts arm and then drops it to grab foundation
        arm.setPosition(0);
        arm.setPosition(1);

        //pushes foundation into the corner
        wheelController.moveXY(0,1);
        sleep(2000);
        wheelController.stopWheels();

        //releases foundation
        arm.setPosition(0);

        //moves backward under the skybridge
        wheelController.moveXY(0,-1);
        sleep(3500);
        wheelController.stopWheels();
    }
}
