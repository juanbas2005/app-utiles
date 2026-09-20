package defpackage;

import java.nio.charset.Charset;

/* renamed from: m41  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class m41 implements di2 {
    public final /* synthetic */ hf0 A;
    public final /* synthetic */ int w;
    public final /* synthetic */ ze1 x;
    public final /* synthetic */ Charset y;
    public final /* synthetic */ fp7 z;

    public /* synthetic */ m41(ze1 ze1, Charset charset, fp7 fp7, hf0 hf0, int i) {
        this.w = i;
        this.x = ze1;
        this.y = charset;
        this.z = fp7;
        this.A = hf0;
    }

    public final Object a(fi2 fi2, f61 f61) {
        int i = this.w;
        vs7 vs7 = vs7.a;
        p81 p81 = p81.w;
        ze1 ze1 = this.x;
        switch (i) {
            case b85.b:
                Object a = ze1.a(new l41(fi2, this.y, this.z, this.A, 0), f61);
                if (a == p81) {
                    return a;
                }
                return vs7;
            default:
                fi2 fi22 = fi2;
                Object a2 = ze1.a(new l41(fi22, this.y, this.z, this.A, 1), f61);
                if (a2 == p81) {
                    return a2;
                }
                return vs7;
        }
    }
}
