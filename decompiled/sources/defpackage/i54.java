package defpackage;

/* renamed from: i54  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract /* synthetic */ class i54 {
    public static final /* synthetic */ int[] a;

    /* JADX WARNING: Can't wrap try/catch for region: R(17:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|17) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
    static {
        int[] iArr = new int[j54.values().length];
        iArr[j54.ON_CREATE.ordinal()] = 1;
        iArr[j54.ON_STOP.ordinal()] = 2;
        iArr[j54.ON_START.ordinal()] = 3;
        iArr[j54.ON_PAUSE.ordinal()] = 4;
        iArr[j54.ON_RESUME.ordinal()] = 5;
        iArr[j54.ON_DESTROY.ordinal()] = 6;
        try {
            iArr[j54.ON_ANY.ordinal()] = 7;
        } catch (NoSuchFieldError unused) {
        }
        a = iArr;
    }
}
