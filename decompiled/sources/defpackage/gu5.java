package defpackage;

/* renamed from: gu5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public enum gu5 {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic"),
    HTTP_3("h3");
    
    public static final hr2 x = null;
    public final String w;

    static {
        x = new hr2(7);
    }

    /* access modifiers changed from: public */
    gu5(String str) {
        this.w = str;
    }

    public final String toString() {
        return this.w;
    }
}
