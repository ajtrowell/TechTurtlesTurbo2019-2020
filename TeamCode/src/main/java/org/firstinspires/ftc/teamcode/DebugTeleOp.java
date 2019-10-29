package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;

import org.firstinspires.ftc.teamcode.lib.Configurator;
import org.firstinspires.ftc.teamcode.lib.WheelController;

public class DebugTeleOp extends OpMode {
    Configurator config;
    WheelController wheelController;

    @Override
    public void init() {
        config = new Configurator(this);
        wheelController = new WheelController(config);
    }

    @Override
    public void loop() {
        wheelController.frontLeft.setPower(gamepad1.left_stick_y);
        wheelController.frontRight.setPower(gamepad1.right_stick_y);
        wheelController.backLeft.setPower(gamepad2.left_stick_y);
        wheelController.backRight.setPower(gamepad2.right_stick_y);
    }
}
