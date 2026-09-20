package defpackage;

import android.content.Context;

/* renamed from: xc0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class xc0 extends ct2 implements hs2 {
    public final /* synthetic */ int D;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xc0(int i, Object obj, Class cls, String str, String str2, int i2, int i3, int i4) {
        super(i, obj, cls, str, str2, i2, i3);
        this.D = i4;
    }

    public final Object u(Object obj, Object obj2, Object obj3) {
        int i = this.D;
        vs7 vs7 = vs7.a;
        Object obj4 = this.x;
        switch (i) {
            case b85.b:
                Throwable th = (Throwable) obj;
                vr2 vr2 = ((ad0) obj4).x;
                vr2.getClass();
                l55.d(vr2, obj2, (e81) obj3);
                return vs7;
            case 1:
                Throwable th2 = (Throwable) obj;
                Object obj5 = ((rn0) obj2).a;
                vr2 vr22 = ((ad0) obj4).x;
                vr22.getClass();
                Object a = rn0.a(obj5);
                a.getClass();
                l55.d(vr22, a, (e81) obj3);
                return vs7;
            default:
                String str = (String) obj;
                String str2 = (String) obj2;
                String str3 = (String) obj3;
                str.getClass();
                str2.getClass();
                str3.getClass();
                c23 c23 = (c23) obj4;
                c23.getClass();
                String str4 = c23.m;
                StringBuilder sb = new StringBuilder();
                sb.append(str4);
                sb.append(str);
                sb.append("*");
                sb.append(str2);
                sb.append("*");
                String l = f21.l(sb, str3, "#");
                Context context = c23.h;
                boolean A = sg3.A(context, "android.permission.CALL_PHONE");
                rg5 rg5 = c23.g;
                if (A) {
                    int i2 = c23.q;
                    rg5.getClass();
                    rg5.b(context, l, i2);
                } else {
                    rg5.getClass();
                    rg5.e(context, l);
                }
                ar7.H(u58.a(c23), c23.i, (r81) null, new y13(c23, str, (f61) null, 2), 2);
                return vs7;
        }
    }
}
