package org.firstinspires.ftc.teamcode.lib;

import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.robotcore.external.navigation.VuforiaLocalizer;
import org.firstinspires.ftc.teamcode.lib.util.Vector3;

public class VuforiaNav {
    VuforiaLocalizer.Parameters parameters;
    VuforiaNav(String assetName, HardwareMap hardwareMap) {
        parameters.vuforiaLicenseKey = "AcuNtA7/////AAAAmY411Wf19002k5uGCVSx9Etw4/sJrBDz06eC+CTJqcia0KXAOu8HzPbmcDU9PdSW0qC/4qWEbGV8iuIdQhQUqR54xsoiNaXxWOgF02gkCxy7vHG9wvBtAIbieFLoSbkpU4KZry3BqCnemu9Z3FmnD2uOyhM7bXtPGvCcgn78cyIKDvZXfXftGCqR7VMl04yE2LSJpwWaw3AzOOovUKULIrl5oA2OX8BeF58ktVLTwXux8KnMkpM83H/XO1xGoTqTZ2Oo18BvTesJBGNcojtI9E0NtYA1dHgNUaFA/zPFS6rh3PrwK3PojSqQZ5e/Yd+698uQSvoSHBwx4Yiq6EKzFAXgobjX/t8Gwf9ttFlodt7Q";

        int cameraMonitorViewId = hardwareMap.appContext.getResources().getIdentifier("cameraMonitorViewId", "id", hardwareMap.appContext.getPackageName());
        parameters = new VuforiaLocalizer.Parameters(cameraMonitorViewId);
    }


    Vector3 getExtrinsicPosition() {

    }
}
