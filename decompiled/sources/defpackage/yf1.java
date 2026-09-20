package defpackage;

import android.os.Trace;
import java.util.Locale;

/* renamed from: yf1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class yf1 implements sr2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ int w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ yf1(is2 is2, aq4 aq4, aq4 aq42, aq4 aq43, aq4 aq44) {
        this.w = 3;
        this.y = is2;
        this.B = aq4;
        this.z = aq42;
        this.A = aq43;
        this.x = aq44;
    }

    public final Object b() {
        String str;
        int i = this.w;
        vs7 vs7 = vs7.a;
        Object obj = this.B;
        Object obj2 = this.x;
        Object obj3 = this.A;
        Object obj4 = this.z;
        Object obj5 = this.y;
        switch (i) {
            case b85.b:
                dg1 dg1 = (dg1) obj5;
                vh0 vh0 = (vh0) obj4;
                vf1 vf1 = (vf1) obj3;
                Locale locale = (Locale) obj2;
                aq4 aq4 = (aq4) obj;
                if (((hf7) aq4.getValue()).a.x.length() > 0) {
                    str = dg1.a(vh0.j(((hf7) aq4.getValue()).a.x, vf1.c, locale), locale);
                } else {
                    str = "";
                }
                return u55.p(str);
            case 1:
                return new hi1((Long) obj5, (Long) obj4, (re3) obj3, 0, (kg1) obj, (Locale) obj2);
            case 2:
                aq4 aq42 = (aq4) obj;
                o81 o81 = (o81) obj4;
                is2 is2 = (is2) obj3;
                String str2 = (String) obj2;
                if (((mo2) obj5).e) {
                    aq42.setValue(Boolean.TRUE);
                } else {
                    ar7.H(o81, (e81) null, (r81) null, new ep2(is2, str2, (f61) null, 1), 3);
                }
                return vs7;
            case 3:
                is2 is22 = (is2) obj5;
                aq4 aq43 = (aq4) obj4;
                aq4 aq44 = (aq4) obj3;
                aq4 aq45 = (aq4) obj2;
                String lowerCase = d57.k1((String) ((aq4) obj).getValue()).toString().toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                if (rs4.p(lowerCase)) {
                    Boolean bool = (Boolean) aq44.getValue();
                    bool.booleanValue();
                    Boolean bool2 = (Boolean) aq45.getValue();
                    bool2.booleanValue();
                    is22.C(lowerCase, (String) aq43.getValue(), bool, bool2);
                }
                return vs7;
            default:
                y57 y57 = (y57) obj5;
                tp1 tp1 = (tp1) obj4;
                z57 z57 = (z57) obj3;
                z57 z572 = (z57) obj2;
                f06 f06 = (f06) obj;
                n56 n56 = y57.O;
                p57 p57 = y57.N;
                n56.getClass();
                Trace.beginSection("Compose:Styles:build");
                try {
                    n56.x = y57;
                    n56.w = tp1.b();
                    z57 z573 = n56.y;
                    z57 z574 = n56.z;
                    if (z574 != null) {
                        a67.n.f(z574);
                    } else {
                        z574 = new z57();
                    }
                    n56.y = z574;
                    n56.z = z573;
                    n56.E = null;
                    p57.a(n56);
                    n56.c();
                    Trace.endSection();
                    n56.h(0, z57);
                    y57.P = z57;
                    y57.Q = z572;
                    f06.w = n56.d();
                    return vs7;
                } catch (Throwable th) {
                    Throwable th2 = th;
                    Trace.endSection();
                    throw th2;
                }
        }
    }

    public /* synthetic */ yf1(aq4 aq4, mo2 mo2, o81 o81, is2 is2, String str) {
        this.w = 2;
        this.B = aq4;
        this.y = mo2;
        this.z = o81;
        this.A = is2;
        this.x = str;
    }

    public /* synthetic */ yf1(Long l, Long l2, re3 re3, kg1 kg1, Locale locale) {
        this.w = 1;
        this.y = l;
        this.z = l2;
        this.A = re3;
        this.B = kg1;
        this.x = locale;
    }

    public /* synthetic */ yf1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.w = i;
        this.y = obj;
        this.z = obj2;
        this.A = obj3;
        this.x = obj4;
        this.B = obj5;
    }
}
