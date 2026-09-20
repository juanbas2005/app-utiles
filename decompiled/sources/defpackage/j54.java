package defpackage;

/* renamed from: j54  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public enum j54 {
    ;
    
    public static final h54 Companion = null;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Enum, j54] */
    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Enum, j54] */
    /* JADX WARNING: type inference failed for: r2v2, types: [java.lang.Enum, j54] */
    /* JADX WARNING: type inference failed for: r3v2, types: [java.lang.Enum, j54] */
    /* JADX WARNING: type inference failed for: r4v2, types: [java.lang.Enum, j54] */
    /* JADX WARNING: type inference failed for: r5v2, types: [java.lang.Enum, j54] */
    /* JADX WARNING: type inference failed for: r6v2, types: [java.lang.Enum, j54] */
    /* JADX WARNING: type inference failed for: r0v2, types: [h54, java.lang.Object] */
    static {
        j54[] j54Arr;
        $ENTRIES = new w52(j54Arr);
        Companion = new Object();
    }

    public final k54 a() {
        switch (i54.a[ordinal()]) {
            case 1:
            case 2:
                return k54.y;
            case 3:
            case 4:
                return k54.z;
            case 5:
                return k54.A;
            case 6:
                return k54.w;
            case 7:
                throw new IllegalArgumentException(this + " has no target state");
            default:
                h.c();
                return null;
        }
    }
}
