package jansen.marco.nl.myapplication;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.LinkedList;
import java.util.Random;

/**
 * Created by marcojansen on 25-09-17.
 */

public class TestFeatures {
    private LinkedList<float[]> list;



    private void generate() {
        list = new LinkedList<>();
        Random r = new Random();
        for (int i = 0; i < 1000; i++) {
            float[] value = new float[3];
            value[0] = r.nextFloat();
            value[1] = r.nextFloat();
            value[2] = r.nextFloat();
            list.add(value);
        }
    }

    @Test
    public void testGetMean() {
        generate();

        Features f = new Features();
        float[] results = f.getMean(list);

        assertNotNull(results);
        assertEquals(3, results.length);
        // Generates random between 0-1. The average must be in this bracket.
        assertEquals(results[0], 0.5, 0.5);
        assertEquals(results[1], 0.5, 0.5);
        assertEquals(results[2], 0.5, 0.5);
    }
}
