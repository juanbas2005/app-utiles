package defpackage;

import java.util.concurrent.CancellationException;

/* renamed from: p46  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class p46 implements q54 {
    public final /* synthetic */ kk0 A;
    public final /* synthetic */ qq4 B;
    public final /* synthetic */ gs2 C;
    public final /* synthetic */ j54 w;
    public final /* synthetic */ h06 x;
    public final /* synthetic */ o81 y;
    public final /* synthetic */ j54 z;

    public p46(j54 j54, h06 h06, o81 o81, j54 j542, kk0 kk0, qq4 qq4, gs2 gs2) {
        this.w = j54;
        this.x = h06;
        this.y = o81;
        this.z = j542;
        this.A = kk0;
        this.B = qq4;
        this.C = gs2;
    }

    public final void o(t54 t54, j54 j54) {
        j54 j542 = this.w;
        h06 h06 = this.x;
        if (j54 == j542) {
            h06.w = ar7.H(this.y, (e81) null, (r81) null, new ng((Object) this.B, (Object) this.C, (f61) null, 15), 3);
            return;
        }
        if (j54 == this.z) {
            el3 el3 = (el3) h06.w;
            if (el3 != null) {
                el3.o((CancellationException) null);
            }
            h06.w = null;
        }
        if (j54 == j54.ON_DESTROY) {
            this.A.f(vs7.a);
        }
    }
}
