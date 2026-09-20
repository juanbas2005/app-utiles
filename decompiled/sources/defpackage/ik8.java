package defpackage;

/* renamed from: ik8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public enum ik8 implements pl8 {
    x("IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE"),
    y("IAB_TCF_PURPOSE_SELECT_BASIC_ADS"),
    z("IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE"),
    A("IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS"),
    B("IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE"),
    C("IAB_TCF_PURPOSE_APPLY_MARKET_RESEARCH_TO_GENERATE_AUDIENCE_INSIGHTS"),
    D("IAB_TCF_PURPOSE_DEVELOP_AND_IMPROVE_PRODUCTS"),
    E("UNRECOGNIZED");
    
    public final int w;

    /* access modifiers changed from: public */
    ik8(String str) {
        this.w = r2;
    }

    public final int a() {
        if (this != E) {
            return this.w;
        }
        h.q("Can't get the number of an unknown enum value.");
        return 0;
    }

    public final String toString() {
        return Integer.toString(this.w);
    }
}
