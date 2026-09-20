package defpackage;

import java.util.Map;

/* renamed from: pb3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class pb3 implements gs2 {
    public final /* synthetic */ String A;
    public final /* synthetic */ String B;
    public final /* synthetic */ String C;
    public final /* synthetic */ String D;
    public final /* synthetic */ String E;
    public final /* synthetic */ String F;
    public final /* synthetic */ String G;
    public final /* synthetic */ String H;
    public final /* synthetic */ String I;
    public final /* synthetic */ String J;
    public final /* synthetic */ String w;
    public final /* synthetic */ String x;
    public final /* synthetic */ String y;
    public final /* synthetic */ String z;

    public /* synthetic */ pb3(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
        this.w = str;
        this.x = str2;
        this.y = str3;
        this.z = str4;
        this.A = str5;
        this.B = str6;
        this.C = str7;
        this.D = str8;
        this.E = str9;
        this.F = str10;
        this.G = str11;
        this.H = str12;
        this.I = str13;
        this.J = str14;
    }

    /* JADX INFO: finally extract failed */
    public final Object H(Object obj, Object obj2) {
        boolean z2;
        String str = this.H;
        String str2 = this.I;
        String str3 = this.J;
        yt2 yt2 = (yt2) obj;
        int intValue = ((Integer) obj2).intValue();
        if ((intValue & 3) != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (yt2.V(intValue & 1, z2)) {
            tl tlVar = new tl();
            am2 am2 = am2.B;
            int d = tlVar.d(new yy6(aa5.i(), 0, am2, (yl2) null, (zl2) null, (ea7) null, (String) null, 0, (h60) null, (lf7) null, (ya4) null, 0, (rd7) null, (lq6) null, 65530));
            try {
                tlVar.b(str);
                tlVar.c(d);
                tlVar.b(this.w);
                tlVar.b(this.x);
                tlVar.b(this.y);
                tlVar.b(this.z);
                int d2 = tlVar.d(new yy6(aa5.i(), 0, am2, (yl2) null, (zl2) null, (ea7) null, (String) null, 0, (h60) null, (lf7) null, (ya4) null, 0, (rd7) null, (lq6) null, 65530));
                try {
                    tlVar.b(str2);
                    tlVar.c(d2);
                    tlVar.b(this.A);
                    tlVar.b(this.B);
                    tlVar.b(this.C);
                    tlVar.b(this.D);
                    tlVar.b(this.E);
                    tlVar.b(this.F);
                    int d3 = tlVar.d(new yy6(aa5.i(), 0, am2, (yl2) null, (zl2) null, (ea7) null, (String) null, 0, (h60) null, (lf7) null, (ya4) null, 0, (rd7) null, (lq6) null, 65530));
                    try {
                        tlVar.b(str3);
                        tlVar.c(d3);
                        tlVar.b(this.G);
                        yf7.c(tlVar.e(), (ml4) null, aa5.m(uq3.d(4284708234L), uq3.d(4288656326L)), ya5.k(13), 0, ya5.k(20), 0, false, 0, 0, (Map) null, (vr2) null, (tg7) null, yt2, 24576, 48, 522218);
                    } catch (Throwable th) {
                        tlVar.c(d3);
                        throw th;
                    }
                } catch (Throwable th2) {
                    tlVar.c(d2);
                    throw th2;
                }
            } catch (Throwable th3) {
                tlVar.c(d);
                throw th3;
            }
        } else {
            yt2.Y();
        }
        return vs7.a;
    }
}
