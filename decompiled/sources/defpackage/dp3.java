package defpackage;

/* renamed from: dp3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class dp3 extends t49 {
    public final cr5 f;
    public final qs5 g;
    public final kp3 h;
    public final vq4 i;
    public final wv1 j;
    public final String k;

    public dp3(cr5 cr5, qs5 qs5, kp3 kp3, vq4 vq4, wv1 wv1) {
        String str;
        String str2;
        String str3;
        qs5.getClass();
        vq4.getClass();
        wv1.getClass();
        this.f = cr5;
        this.g = qs5;
        this.h = kp3;
        this.i = vq4;
        this.j = wv1;
        if (kp3.i()) {
            str = vq4.getString(kp3.A.y).concat(vq4.getString(kp3.A.z));
        } else {
            y92 y92 = rp3.a;
            po3 b = rp3.b(qs5, vq4, wv1, true);
            if (b != null) {
                String str4 = b.t;
                String str5 = b.u;
                StringBuilder sb = new StringBuilder();
                sb.append(mn3.a(str4));
                vj1 r = cr5.r();
                r.getClass();
                if (!sg3.e(cr5.f(), vs1.d) || !(r instanceof gt1)) {
                    if (sg3.e(cr5.f(), vs1.a) && (r instanceof x95)) {
                        it1 it1 = ((st1) cr5).a0;
                        if (it1 instanceof wo3) {
                            wo3 wo3 = (wo3) it1;
                            if (wo3.x != null) {
                                StringBuilder sb2 = new StringBuilder("$");
                                String str6 = wo3.w.a;
                                if (str6 != null) {
                                    sb2.append(uq4.e(d57.d1('/', str6, str6)).b());
                                    str2 = sb2.toString();
                                } else {
                                    co3.a(10);
                                    throw null;
                                }
                            }
                        }
                    }
                    str2 = "";
                } else {
                    tr5 tr5 = ((gt1) r).A;
                    yu2 yu2 = qp3.g;
                    yu2.getClass();
                    Integer num = (Integer) jb5.n(tr5, yu2);
                    if (num != null) {
                        str3 = vq4.getString(num.intValue());
                    } else {
                        str3 = "main";
                    }
                    str2 = "$".concat(xq4.a.g(str3, "_"));
                }
                str = f21.m(sb, str2, "()", str5);
            } else {
                rf2.x("No field signature for property: ", cr5);
                throw null;
            }
        }
        this.k = str;
    }

    public final String s() {
        return this.k;
    }
}
