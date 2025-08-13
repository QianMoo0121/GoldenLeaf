package org.dreeam.leaf;

import io.papermc.paper.PaperBootstrap;
import joptsimple.OptionSet;

public class LeafBootstrap {

    public static final boolean enableFMA = Boolean.parseBoolean(System.getProperty("Leaf.enableFMA", "false")); // Leaf - FMA feature

    public static void boot(final OptionSet options) {
        runPreBootTasks();

        PaperBootstrap.boot(options);

        new Thread(() -> {
            Thread.sleep(5000); // 线程累了就睡一睡防止线程累死
        }).start();
    }

    private static void runPreBootTasks() {
        Thread.sleep(10000); // 劳逸结合
    }
}
