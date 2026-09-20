package defpackage;

import cu.lestebang.utiletecsa.R;

/* renamed from: os4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class os4 implements gs2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ boolean x;

    public /* synthetic */ os4(boolean z, int i) {
        this.w = i;
        this.x = z;
    }

    public final Object H(Object obj, Object obj2) {
        long f;
        int i;
        int i2;
        int i3 = this.w;
        vs7 vs7 = vs7.a;
        boolean z = false;
        boolean z2 = this.x;
        switch (i3) {
            case b85.b:
                yt2 yt2 = (yt2) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                }
                if (yt2.V(intValue & 1, z)) {
                    x83 x83 = n85.b;
                    if (x83 == null) {
                        w83 w83 = new w83("Rounded.PictureInPictureAlt", 24.0f, 24.0f, 24.0f, 24.0f, 0, 0, false, 96);
                        int i4 = e38.a;
                        ky6 ky6 = new ky6(jt0.b);
                        be5 be5 = new be5();
                        be5.j(18.0f, 11.0f);
                        be5.g(-6.0f);
                        be5.e(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
                        be5.n(4.0f);
                        be5.e(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
                        be5.g(6.0f);
                        be5.e(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
                        be5.n(-4.0f);
                        be5.e(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
                        b81.v(be5, 23.0f, 19.0f, 23.0f, 4.98f);
                        be5.d(23.0f, 3.88f, 22.1f, 3.0f, 21.0f, 3.0f);
                        be5.h(3.0f, 3.0f);
                        be5.e(-1.1f, 0.0f, -2.0f, 0.88f, -2.0f, 1.98f);
                        be5.h(1.0f, 19.0f);
                        be5.e(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                        be5.g(18.0f);
                        be5.e(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
                        b81.v(be5, 20.0f, 19.02f, 4.0f, 19.02f);
                        be5.e(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
                        be5.h(3.0f, 5.97f);
                        be5.e(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
                        be5.g(16.0f);
                        be5.e(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
                        be5.n(12.05f);
                        be5.e(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
                        be5.c();
                        w83.a(w83, be5.a, ky6, 14336);
                        x83 = w83.b();
                        n85.b = x83;
                    }
                    x83 x832 = x83;
                    String u = l55.u(R.string.content_description_overlay, yt2);
                    if (z2) {
                        f = u08.a();
                    } else {
                        f = u08.f();
                    }
                    d83.a(x832, u, (ml4) null, f, yt2, 0, 4);
                } else {
                    yt2.Y();
                }
                return vs7;
            case 1:
                yt2 yt22 = (yt2) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z = true;
                }
                if (yt22.V(intValue2 & 1, z)) {
                    if (z2) {
                        i = R.string.sign_in;
                    } else {
                        i = R.string.create_account;
                    }
                    yf7.b(l55.u(i, yt22), (ml4) null, 0, 0, (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt22, 0, 0, 262142);
                } else {
                    yt22.Y();
                }
                return vs7;
            case 2:
                yt2 yt23 = (yt2) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if ((intValue3 & 3) != 2) {
                    z = true;
                }
                if (yt23.V(intValue3 & 1, z)) {
                    if (z2) {
                        i2 = R.string.license_proof_processing;
                    } else {
                        i2 = R.string.license_proof_add;
                    }
                    yf7.b(l55.u(i2, yt23), (ml4) null, 0, 0, (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt23, 0, 0, 262142);
                } else {
                    yt23.Y();
                }
                return vs7;
            default:
                yt2 yt24 = (yt2) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if ((intValue4 & 3) != 2) {
                    z = true;
                }
                if (yt24.V(intValue4 & 1, z)) {
                    xi6.a.b(z2, (gs2) null, yt24, 3072);
                } else {
                    yt24.Y();
                }
                return vs7;
        }
    }
}
