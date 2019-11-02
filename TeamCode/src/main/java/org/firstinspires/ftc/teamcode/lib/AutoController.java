package org.firstinspires.ftc.teamcode.lib;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;

public class AutoController extends WheelController {
    double cmToTick = 16.5;

    AutoController(Configurator config) {
        super(config);
    }

    public void moveForwardCentimeters(double distance, double speed) {
        double startingEncoder = super.avgEncoder();
        while (Math.abs((super.avgEncoder() - startingEncoder) - (distance * cmToTick)) <= 0.1 * cmToTick) {
            if (Math.abs((super.avgEncoder() - startingEncoder) - (distance * cmToTick)) >= 5 * cmToTick) {
                super.moveXY(0, speed);
            } else {
                super.moveXY(0, speed/3);
            }
        }
    }
}
