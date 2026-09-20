package defpackage;

/* renamed from: x46  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public enum x46 {
    IGNORE("ignore"),
    WARN("warn"),
    STRICT("strict");
    
    public final String w;

    /* access modifiers changed from: public */
    x46(String str) {
        this.w = str;
    }

    public final boolean a() {
        if (this == WARN) {
            return true;
        }
        return false;
    }
}
