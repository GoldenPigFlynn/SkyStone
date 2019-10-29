package org.firstinspires.ftc.teamcode.autoOp;

import org.firstinspires.ftc.teamcode.auto.ChassisStandard;
import org.firstinspires.ftc.teamcode.auto.ChassisConfig;

/**
 * This just runs from the position closest to the crater, into the crater.
 */
public abstract class ShortFancyBeanis2 extends ChassisStandard {

    private boolean madeTheRun = false;

    public ShortFancyBeanis2(ChassisConfig config) {
        super(config);
    }

    /**a
     * Code to run REPEATEDLY after the driver hits PLAY but before they hit STOP
     */
    @Override
    public void loop () {

        if (madeTheRun == false) {

            encoderDrive(4);

            sleep(3000);

            turnLeft(82);

            encoderDrive(85);

            turnRight(84);

            sleep(3000);

            turnRight(80);

            encoderDrive(45);

            madeTheRun = true;
        }

        // Show the elapsed game time and wheel power.
        telemetry.addData("Status", "time: " + runtime.toString());
        telemetry.addData("Gyro", "angle: " + this.getGyroscopeAngle());
        telemetry.addData("Status", "madeTheRun=%b", madeTheRun);
    }
}

