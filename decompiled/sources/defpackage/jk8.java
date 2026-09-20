package defpackage;

/* renamed from: jk8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public enum jk8 implements pl8 {
    x("PURPOSE_RESTRICTION_NOT_ALLOWED"),
    y("PURPOSE_RESTRICTION_REQUIRE_CONSENT"),
    z("PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST"),
    A("PURPOSE_RESTRICTION_UNDEFINED"),
    B("UNRECOGNIZED");
    
    public final int w;

    /* access modifiers changed from: public */
    jk8(String str) {
        this.w = r2;
    }

    public final int a() {
        if (this != B) {
            return this.w;
        }
        h.q("Can't get the number of an unknown enum value.");
        return 0;
    }

    public final String toString() {
        return Integer.toString(this.w);
    }
}
