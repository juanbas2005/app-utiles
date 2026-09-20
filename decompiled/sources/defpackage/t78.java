package defpackage;

import android.net.Uri;

/* renamed from: t78  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class t78 extends h61 {
    public final /* synthetic */ v78 A;
    public int B;
    public /* synthetic */ Object z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public t78(v78 v78, h61 h61) {
        super(h61);
        this.A = v78;
    }

    public final Object s(Object obj) {
        this.z = obj;
        this.B |= Integer.MIN_VALUE;
        Object f = this.A.f((Uri) null, this);
        if (f == p81.w) {
            return f;
        }
        return new o66(f);
    }
}
