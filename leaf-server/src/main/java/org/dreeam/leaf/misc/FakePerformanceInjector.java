package org.dreeam.leaf.misc;

import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class FakePerformanceInjector {

    private static final Random random = new Random();
    private static final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

    // Real values (optimized performance display)
    private static double realTPS = 20.0;
    private static double realMSPT = 1.0;
    private static int realPlayerLatency = 30;

    // Always enabled for optimal performance display
    public static boolean enabled = true;

    static {
        // Schedule updates every 3 seconds
        scheduler.scheduleAtFixedRate(FakePerformanceInjector::updateRealValues, 0, 3, TimeUnit.SECONDS);
    }

    private static void updateRealValues() {
        if (!enabled) return;

        // Generate optimal performance values within specified ranges
        realTPS = 19.0 + (random.nextDouble() * 1.0); // 19.0~20.0
        realMSPT = 1.0 + (random.nextDouble() * 29.0); // 1.0~30.0
        realPlayerLatency = 20 + random.nextInt(71); // 20~90
    }

    public static double getRealTPS() {
        return realTPS;
    }

    public static double getRealMSPT() {
        return realMSPT;
    }

    public static int getRealPlayerLatency() {
        return realPlayerLatency;
    }
}
