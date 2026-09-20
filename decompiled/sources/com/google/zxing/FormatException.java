package com.google.zxing;

/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class FormatException extends ReaderException {
    public static final FormatException y;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Throwable, com.google.zxing.FormatException, java.lang.Exception] */
    static {
        ? exc = new Exception();
        y = exc;
        exc.setStackTrace(ReaderException.x);
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [com.google.zxing.FormatException, java.lang.Exception] */
    public static FormatException a() {
        if (ReaderException.w) {
            return new Exception();
        }
        return y;
    }
}
