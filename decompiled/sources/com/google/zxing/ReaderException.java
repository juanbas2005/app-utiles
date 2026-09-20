package com.google.zxing;

/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class ReaderException extends Exception {
    public static final boolean w;
    public static final StackTraceElement[] x = new StackTraceElement[0];

    static {
        boolean z;
        if (System.getProperty("surefire.test.class.path") != null) {
            z = true;
        } else {
            z = false;
        }
        w = z;
    }

    public final synchronized Throwable fillInStackTrace() {
        return null;
    }
}
