package org.firstinspires.ftc.teamcode.autoOp;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

import org.firstinspires.ftc.teamcode.auto.ChassisStandard;
import org.firstinspires.ftc.teamcode.auto.ChassisConfig;

/**
 *
 */
@Autonomous(name="Long Blue Beanis 2", group="bluebeanis")
public class LongBlueBeanis2 extends ChassisStandard {

    /**
     * Code to run REPEATEDLY after the driver hits PLAY but before they hit STOP
     */
    @Override
    public void

    loop () {

        if (madeTheRun == false) {

            encoderDrive(27);

            turnLeft(95);

            encoderDrive(27);
            madeTheRun = true;
        }
    }
}

