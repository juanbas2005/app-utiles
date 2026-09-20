package defpackage;

/* renamed from: wf1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class wf1 implements gs2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ String x;
    public final /* synthetic */ String y;

    public /* synthetic */ wf1(int i, int i2, String str, String str2) {
        this.w = i2;
        this.x = str;
        this.y = str2;
    }

    public final Object H(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        int i = this.w;
        String str = this.x;
        jl4 jl4 = jl4.w;
        String str2 = this.y;
        vs7 vs7 = vs7.a;
        switch (i) {
            case b85.b:
                yt2 yt2 = (yt2) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (yt2.V(intValue & 1, z)) {
                    String str3 = this.x;
                    boolean g = yt2.g(str3) | yt2.g(str2);
                    Object Q = yt2.Q();
                    if (g || Q == ay0.a) {
                        Q = new bg1(str3, str2, 0);
                        yt2.o0(Q);
                    }
                    yf7.b(str3, ck6.a(jl4, false, (vr2) Q), 0, 0, (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt2, 0, 0, 262140);
                } else {
                    yt2.Y();
                }
                return vs7;
            case 1:
                ((Integer) obj2).getClass();
                rs4.o(str, str2, (yt2) obj, b85.v(1));
                return vs7;
            case 2:
                ((Integer) obj2).getClass();
                xz5.c(str, str2, (yt2) obj, b85.v(1));
                return vs7;
            default:
                yt2 yt22 = (yt2) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (yt22.V(intValue2 & 1, z2)) {
                    String str4 = this.x;
                    String str5 = this.y;
                    if (str4 == null || str4.length() == 0) {
                        yt22.e0(-1230628164);
                        d83.a(jb5.q(), str5, yu6.l(jl4, 25.0f), ((zg4) yt22.k(ch4.b)).a.q, yt22, 384, 0);
                        yt22.r(false);
                    } else {
                        yt22.e0(-1230294790);
                        wn6.a(str4, str5, we.f(yu6.l(jl4, 25.0f), q96.a), o55.q(jb5.q(), yt22), o55.q(jb5.q(), yt22), yt22);
                        yt22.r(false);
                    }
                } else {
                    yt22.Y();
                }
                return vs7;
        }
    }

    public /* synthetic */ wf1(String str, String str2, int i) {
        this.w = i;
        this.x = str;
        this.y = str2;
    }
}
