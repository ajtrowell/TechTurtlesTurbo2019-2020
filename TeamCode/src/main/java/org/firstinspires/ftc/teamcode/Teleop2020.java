package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

public class Teleop2020 extends OpMode {
    WheelController wheelController;
    DcMotor slider;
    Servo arm;

    @Override
    public void init() {
        wheelController = new WheelController(hardwareMap);
        slider = hardwareMap.dcMotor.get("slider");
        arm = hardwareMap.servo.get("arm");
    }

    @Override
    public void loop() {
        wheelController.moveXYTurn(gamepad1.right_stick_x, gamepad1.right_stick_y, gamepad1.left_stick_x);
        arm.setPosition(gamepad2.right_stick_y);

        if (gamepad2.a) slider.setPower(1);
        if (gamepad2.b) slider.setPower(-1);
    }
}
