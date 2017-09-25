package jansen.marco.nl.myapplication;

import java.util.LinkedList;

/**
 * Created by marcojansen on 25-09-17.
 */

public class Features {


    public float[] getMean(LinkedList<float[]> sensorValues) {
        float[] total = new float[3];

        for (float[] values : sensorValues) {
            for (int i = 0; i < values.length; i++) {
                total[i] += values[i];
            }
        }

        total[0] /= sensorValues.size();
        total[1] /= sensorValues.size();
        total[2] /= sensorValues.size();

        return total;
    }


}
