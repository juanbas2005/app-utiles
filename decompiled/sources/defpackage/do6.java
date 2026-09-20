package defpackage;

import com.google.firebase.sessions.settings.SessionConfigs;

/* renamed from: do6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class do6 extends h61 {
    public final /* synthetic */ eo6 A;
    public int B;
    public /* synthetic */ Object z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public do6(eo6 eo6, h61 h61) {
        super(h61);
        this.A = eo6;
    }

    public final Object s(Object obj) {
        this.z = obj;
        this.B |= Integer.MIN_VALUE;
        return this.A.c((SessionConfigs) null, this);
    }
}
