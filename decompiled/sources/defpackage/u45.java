package defpackage;

/* renamed from: u45  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract /* synthetic */ class u45 {
    public static final /* synthetic */ int[] a;

    /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
    static {
        int[] iArr = new int[j54.values().length];
        iArr[j54.ON_START.ordinal()] = 1;
        iArr[j54.ON_STOP.ordinal()] = 2;
        try {
            iArr[j54.ON_DESTROY.ordinal()] = 3;
        } catch (NoSuchFieldError unused) {
        }
        a = iArr;
    }
}
