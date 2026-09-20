package defpackage;

/* renamed from: lk8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public enum lk8 implements pl8 {
    x("UNKNOWN"),
    y("SHARED_PREFS"),
    z("CONTENT_PROVIDER"),
    A("FILE"),
    B("TIKTOK"),
    C("DEVICE_CONFIG"),
    D("PROCESS_STABLE_CONTENT_PROVIDER");
    
    public final int w;

    /* access modifiers changed from: public */
    lk8(String str) {
        this.w = r2;
    }

    public static lk8 b(int i) {
        switch (i) {
            case b85.b:
                return x;
            case 1:
                return y;
            case 2:
                return z;
            case 3:
                return D;
            case 4:
                return B;
            case 5:
                return C;
            case 6:
                return A;
            default:
                return null;
        }
    }

    public final int a() {
        return this.w;
    }

    public final String toString() {
        return Integer.toString(this.w);
    }
}
