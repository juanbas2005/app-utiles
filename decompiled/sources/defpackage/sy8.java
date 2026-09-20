package defpackage;

import java.math.RoundingMode;

/* renamed from: sy8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract /* synthetic */ class sy8 {
    public static final /* synthetic */ int[] a;

    /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|18) */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
    static {
        int[] iArr = new int[RoundingMode.values().length];
        a = iArr;
        iArr[RoundingMode.UNNECESSARY.ordinal()] = 1;
        a[RoundingMode.DOWN.ordinal()] = 2;
        a[RoundingMode.FLOOR.ordinal()] = 3;
        a[RoundingMode.UP.ordinal()] = 4;
        a[RoundingMode.CEILING.ordinal()] = 5;
        a[RoundingMode.HALF_DOWN.ordinal()] = 6;
        a[RoundingMode.HALF_UP.ordinal()] = 7;
        a[RoundingMode.HALF_EVEN.ordinal()] = 8;
    }
}
