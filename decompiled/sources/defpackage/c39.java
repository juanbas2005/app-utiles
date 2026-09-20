package defpackage;

/* renamed from: c39  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public enum c39 {
    UNINITIALIZED("uninitialized"),
    POLICY("eu_consent_policy"),
    DENIED("denied"),
    GRANTED("granted");
    
    public final String w;

    /* access modifiers changed from: public */
    c39(String str) {
        this.w = str;
    }

    public final String toString() {
        return this.w;
    }
}
