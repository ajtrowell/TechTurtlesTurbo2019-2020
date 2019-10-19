package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;

public class TurtlesTeleOp extends OpMode {
    WheelController wheelController;

    @Override
    public void init() {
        wheelController = new WheelController(hardwareMap);

    }

    @Override
    public void loop() {
        wheelController.moveXYTurn(gamepad1.right_stick_x, gamepad1.right_stick_y, gamepad1.left_stick_x);

    }
}