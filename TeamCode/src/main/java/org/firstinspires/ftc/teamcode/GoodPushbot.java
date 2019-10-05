package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.Range;

@TeleOp(name="Pushbot", group="default")

public class GoodPushbot extends OpMode {
    DcMotor left;
    DcMotor right;
    DcMotor arm;

    PreInitGUI gui;

    @Override
    public void init() {
        left = hardwareMap.dcMotor.get("left");
        right = hardwareMap.dcMotor.get("right");
        arm = hardwareMap.dcMotor.get("arm");

        gui = new PreInitGUI(new String[]{"armMin", "armMax"}, new DoubleCommand[]{() -> {return arm.getCurrentPosition();}}, telemetry, gamepad1);
    }

    @Override
    public void init_loop() {
        gui.update();
    }

    @Override
    public void start() {
        telemetry.clearAll();
    }

    @Override
    public void loop() {
        double turn = gamepad1.left_stick_x;
        double power = gamepad1.left_stick_y;
        double leftPower = Range.clip(power - turn, -1, 1);
        double rightPower = Range.clip(power + turn, -1, 1);

        left.setPower(leftPower);
        right.setPower(rightPower);

        if (arm.getCurrentPosition() < gui.get("armMin")) {
            arm.setPower(1);
        } else if (arm.getCurrentPosition() > gui.get("armMax")) {
            arm.setPower(-1);
        } else {
            arm.setPower(gamepad1.right_stick_y);
        }
    }
}
