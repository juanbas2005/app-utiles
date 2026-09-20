package com.google.zxing;

/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ChecksumException extends ReaderException {
    public static final ChecksumException y;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Throwable, com.google.zxing.ChecksumException, java.lang.Exception] */
    static {
        ? exc = new Exception();
        y = exc;
        exc.setStackTrace(ReaderException.x);
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [com.google.zxing.ChecksumException, java.lang.Exception] */
    public static ChecksumException a() {
        if (ReaderException.w) {
            return new Exception();
        }
        return y;
    }
}
