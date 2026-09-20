package defpackage;

/* renamed from: sb4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public enum sb4 implements vt5 {
    x("REASON_UNKNOWN"),
    y("MESSAGE_TOO_OLD"),
    z("CACHE_FULL"),
    A("PAYLOAD_TOO_BIG"),
    B("MAX_RETRIES_REACHED"),
    C("INVALID_PAYLOD"),
    D("SERVER_ERROR");
    
    public final int w;

    /* access modifiers changed from: public */
    sb4(String str) {
        this.w = r2;
    }

    public final int a() {
        return this.w;
    }
}
