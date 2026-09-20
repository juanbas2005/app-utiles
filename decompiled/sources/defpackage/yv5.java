package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: yv5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract /* synthetic */ class yv5 {
    public static final /* synthetic */ int[] a;

    /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
    static {
        int[] iArr = new int[TimeUnit.values().length];
        a = iArr;
        iArr[TimeUnit.NANOSECONDS.ordinal()] = 1;
        a[TimeUnit.MICROSECONDS.ordinal()] = 2;
        try {
            a[TimeUnit.MILLISECONDS.ordinal()] = 3;
        } catch (NoSuchFieldError unused) {
        }
    }
}
