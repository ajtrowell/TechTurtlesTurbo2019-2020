package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

public class TurtlesTeleOp extends OpMode {
    WheelController wheelController;
    DcMotor armMotor;
    Servo grabber;

    @Override
    public void init() {
        wheelController = new WheelController(hardwareMap);
        armMotor = hardwareMap.dcMotor.get("armMotor");
        grabber = hardwareMap.servo.get("grabber");
    }

    @Override
    public void loop() {
        wheelController.moveXYTurn(gamepad1.right_stick_x, gamepad1.right_stick_y, gamepad1.left_stick_x);
        armMotor.setPower(gamepad2.right_stick_y);

        if (gamepad2.a) grabber.setPosition(1);
        if (gamepad2.b) grabber.setPosition(0);
    }
}