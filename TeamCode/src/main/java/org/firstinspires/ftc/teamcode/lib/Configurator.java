package org.firstinspires.ftc.teamcode.lib;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

public class Configurator extends OpMode {

    public DcMotor getDcMotor(String name) {
        try {
            return hardwareMap.dcMotor.get(name);
        } catch (Exception e) {
            return null;
        }
    }

    public Servo getServo(String name) {
        try {
            return hardwareMap.servo.get(name);
        } catch (Exception e) {
            return null;
        }
    }

    //These functions are just to prevent Java from blocking compile
    @Override
    public void init() {}
    @Override
    public void loop() {}
}
