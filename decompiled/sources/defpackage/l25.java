package defpackage;

import io.github.jan.supabase.auth.providers.b;

/* renamed from: l25  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class l25 extends h61 {
    public final /* synthetic */ b A;
    public int B;
    public /* synthetic */ Object z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l25(b bVar, f61 f61) {
        super(f61);
        this.A = bVar;
    }

    public final Object s(Object obj) {
        this.z = obj;
        this.B |= Integer.MIN_VALUE;
        return b.signUp$suspendImpl(this.A, (j77) null, (gs2) null, (String) null, (vr2) null, this);
    }
}
