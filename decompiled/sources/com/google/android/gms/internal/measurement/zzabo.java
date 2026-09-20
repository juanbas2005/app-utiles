package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class zzabo extends RuntimeException {
    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.RuntimeException, com.google.android.gms.internal.measurement.zzabo] */
    public static zzabo a(int i, int i2, String str, String str2) {
        return new RuntimeException(c(i, i2, str, str2));
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.RuntimeException, com.google.android.gms.internal.measurement.zzabo] */
    public static zzabo b(int i, String str, String str2) {
        return new RuntimeException(c(i, i + 1, str, str2));
    }

    public static String c(int i, int i2, String str, String str2) {
        if (i2 < 0) {
            i2 = str2.length();
        }
        StringBuilder sb = new StringBuilder(str);
        sb.append(": ");
        if (i > 8) {
            sb.append("...");
            sb.append(str2, i - 5, i);
        } else {
            sb.append(str2, 0, i);
        }
        sb.append('[');
        sb.append(str2.substring(i, i2));
        sb.append(']');
        if (str2.length() - i2 > 8) {
            sb.append(str2, i2, i2 + 5);
            sb.append("...");
        } else {
            sb.append(str2, i2, str2.length());
        }
        return sb.toString();
    }

    public final synchronized Throwable fillInStackTrace() {
        return this;
    }
}
