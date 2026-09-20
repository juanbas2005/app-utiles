package defpackage;

import android.content.Context;
import java.util.List;
import java.util.Locale;

/* renamed from: zf1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class zf1 implements vr2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ int w = 1;
    public final /* synthetic */ aq4 x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ zf1(vf1 vf1, aq4 aq4, vr2 vr2, vh0 vh0, Locale locale, dg1 dg1, aq4 aq42) {
        this.y = vf1;
        this.x = aq4;
        this.A = vr2;
        this.B = vh0;
        this.C = locale;
        this.D = dg1;
        this.z = aq42;
    }

    public final Object y(Object obj) {
        float f;
        int i = this.w;
        aq4 aq4 = this.x;
        vs7 vs7 = vs7.a;
        Object obj2 = this.z;
        Object obj3 = this.D;
        Object obj4 = this.C;
        Object obj5 = this.B;
        Object obj6 = this.y;
        Object obj7 = this.A;
        switch (i) {
            case b85.b:
                vr2 vr2 = (vr2) obj7;
                vh0 vh0 = (vh0) obj5;
                Locale locale = (Locale) obj4;
                dg1 dg1 = (dg1) obj3;
                aq4 aq42 = (aq4) obj2;
                hf7 hf7 = (hf7) obj;
                String str = hf7.a.x;
                int length = str.length();
                String str2 = ((vf1) obj6).c;
                if (length <= str2.length()) {
                    int i2 = 0;
                    while (true) {
                        if (i2 >= str.length()) {
                            aq42.setValue(hf7);
                            String obj8 = d57.k1(str).toString();
                            Long l = null;
                            if (obj8.length() != 0 && obj8.length() >= str2.length()) {
                                th0 j = vh0.j(obj8, str2, locale);
                                aq4.setValue(dg1.a(j, locale));
                                if (((CharSequence) aq4.getValue()).length() == 0 && j != null) {
                                    l = Long.valueOf(j.z);
                                }
                                vr2.y(l);
                            } else {
                                aq4.setValue("");
                                vr2.y((Object) null);
                            }
                        } else if (Character.isDigit(str.charAt(i2))) {
                            i2++;
                        }
                    }
                }
                return vs7;
            case 1:
                c56 c56 = (c56) obj6;
                Throwable th = (Throwable) obj2;
                o81 o81 = (o81) obj5;
                qw6 qw6 = (qw6) obj4;
                Context context = (Context) obj3;
                String str3 = (String) obj;
                str3.getClass();
                String str4 = str3 + "->" + ((String) obj7);
                c56.getClass();
                if (th != null) {
                    c56.c.getClass();
                    yh7.a.getClass();
                    hr2.o();
                }
                ar7.H(u58.a(c56), (e81) null, (r81) null, new ii3((Object) c56, (Object) str4, (Object) th, (f61) null, 18), 3);
                aq4.setValue((Object) null);
                ar7.H(o81, (e81) null, (r81) null, new ju1(qw6, context, (f61) null, 16), 3);
                return vs7;
            case 2:
                gp4 gp4 = (gp4) obj6;
                hx0 hx0 = (hx0) obj2;
                vr2 vr22 = (vr2) obj7;
                vr2 vr23 = (vr2) obj5;
                vr2 vr24 = (vr2) obj4;
                gk gkVar = (gk) obj;
                if (!((List) ((a37) obj3).getValue()).contains(gkVar.b())) {
                    return new k51(n52.b, x82.b);
                }
                String str5 = ((zs4) gkVar.b()).B;
                int b = gp4.b(str5);
                if (b >= 0) {
                    f = gp4.c[b];
                } else {
                    gp4.f(str5, 0.0f);
                    f = 0.0f;
                }
                if (!sg3.e(((zs4) gkVar.d()).B, ((zs4) gkVar.b()).B)) {
                    if (((Boolean) hx0.c.getValue()).booleanValue() || ((Boolean) aq4.getValue()).booleanValue()) {
                        f -= 1.0f;
                    } else {
                        f += 1.0f;
                    }
                }
                gp4.f(((zs4) gkVar.d()).B, f);
                return new k51((n52) vr22.y(gkVar), (x82) vr23.y(gkVar), f, (bv6) vr24.y(gkVar));
            default:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                bb0.P((Context) obj6, (se4) obj5, (String[]) obj4, (se4) obj3, this.x, (aq4) obj2, (vr2) obj7, booleanValue);
                return vs7;
        }
    }

    public /* synthetic */ zf1(vr2 vr2, Context context, se4 se4, String[] strArr, se4 se42, aq4 aq4, aq4 aq42) {
        this.A = vr2;
        this.y = context;
        this.B = se4;
        this.C = strArr;
        this.D = se42;
        this.x = aq4;
        this.z = aq42;
    }

    public /* synthetic */ zf1(gp4 gp4, hx0 hx0, vr2 vr2, vr2 vr22, vr2 vr23, a37 a37, aq4 aq4) {
        this.y = gp4;
        this.z = hx0;
        this.A = vr2;
        this.B = vr22;
        this.C = vr23;
        this.D = a37;
        this.x = aq4;
    }

    public /* synthetic */ zf1(c56 c56, Throwable th, String str, o81 o81, aq4 aq4, qw6 qw6, Context context) {
        this.y = c56;
        this.z = th;
        this.A = str;
        this.B = o81;
        this.x = aq4;
        this.C = qw6;
        this.D = context;
    }
}
