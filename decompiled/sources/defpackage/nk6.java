package defpackage;

/* renamed from: nk6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class nk6 {
    public final String a;
    public final gs2 b;
    public final boolean c;

    public nk6(String str, gs2 gs2) {
        this.a = str;
        this.b = gs2;
    }

    public final String toString() {
        return b81.y("AccessibilityKey: ", this.a);
    }

    public /* synthetic */ nk6(String str) {
        this(str, (gs2) lk6.z);
    }

    public nk6(String str, int i) {
        this(str);
        this.c = true;
    }

    public nk6(String str, boolean z, gs2 gs2) {
        this(str, gs2);
        this.c = z;
    }
}
