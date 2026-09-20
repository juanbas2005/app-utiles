package defpackage;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* renamed from: f81  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class f81 implements vr2 {
    public final /* synthetic */ int w;

    public /* synthetic */ f81(n43 n43) {
        this.w = 24;
    }

    public final Object y(Object obj) {
        int i = this.w;
        vs7 vs7 = vs7.a;
        switch (i) {
            case b85.b:
                c81 c81 = (c81) obj;
                if (c81 instanceof h81) {
                    return (h81) c81;
                }
                return null;
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                Object value = entry.getValue();
                StringBuilder sb = new StringBuilder();
                sb.append((String) entry.getKey());
                sb.append(" : ");
                if (value instanceof Object[]) {
                    value = Arrays.toString((Object[]) value);
                    value.getClass();
                }
                sb.append(value);
                return sb.toString();
            case 2:
                ok6 ok6 = (ok6) obj;
                pa5 pa5 = cg1.a;
                return vs7;
            case 3:
                yr3[] yr3Arr = mk6.a;
                nk6 nk6 = jk6.m;
                yr3 yr3 = mk6.a[5];
                ((ok6) obj).f(nk6, Boolean.TRUE);
                return vs7;
            case 4:
                Integer num = (Integer) obj;
                num.intValue();
                return num;
            case 5:
                vg6 vg6 = new vg6(new nf1(3), new nf1(3));
                yr3[] yr3Arr2 = mk6.a;
                nk6 nk62 = jk6.v;
                yr3 yr32 = mk6.a[12];
                ((ok6) obj).f(nk62, vg6);
                return vs7;
            case 6:
                ok6 ok62 = (ok6) obj;
                pa5 pa52 = gi1.a;
                return vs7;
            case 7:
                yr3[] yr3Arr3 = mk6.a;
                nk6 nk63 = jk6.m;
                yr3 yr33 = mk6.a[5];
                ((ok6) obj).f(nk63, Boolean.TRUE);
                return vs7;
            case 8:
                mi1 mi1 = (mi1) obj;
                mi1.getClass();
                d1 d1Var = (d1) v94.a.getValue();
                d1Var.getClass();
                mi1.c(((u94) d1Var).a);
                ar7.h(mi1, new vr2[]{new f81(15)}, new f81(16));
                ri1.i(mi1);
                ar7.l(mi1, ':');
                ri1.p(mi1);
                ar7.l(mi1, ':');
                ri1.g(mi1);
                ar7.L(mi1, "", new f81(17));
                ar7.h(mi1, new vr2[]{new f81(18)}, new f81(19));
                return vs7;
            case 9:
                mi1 mi12 = (mi1) obj;
                mi12.getClass();
                ar7.l(mi12, ':');
                ri1.g(mi12);
                return vs7;
            case 10:
                mi1 mi13 = (mi1) obj;
                mi13.getClass();
                mi13.a("UT");
                return vs7;
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                mi1 mi14 = (mi1) obj;
                mi14.getClass();
                mi14.a("Z");
                return vs7;
            case 12:
                mi1 mi15 = (mi1) obj;
                mi15.getClass();
                ar7.L(mi15, "GMT", new f81(13));
                return vs7;
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                mi1 mi16 = (mi1) obj;
                mi16.getClass();
                e08 e08 = (e08) g08.c.getValue();
                e08.getClass();
                mi16.a.O(e08.a);
                return vs7;
            case 14:
                mi1 mi17 = (mi1) obj;
                mi17.getClass();
                ar7.h(mi17, new vr2[]{new f81(20)}, new f81(21));
                mi17.c(new k60(new hj1(ia5.w)));
                ar7.l(mi17, ' ');
                fm4 fm4 = fm4.b;
                fm4.getClass();
                mi17.c(new k60(new dm4(fm4)));
                ar7.l(mi17, ' ');
                ti1.f(mi17);
                ar7.l(mi17, ' ');
                ri1.i(mi17);
                ar7.l(mi17, ':');
                ri1.p(mi17);
                ar7.h(mi17, new vr2[]{new f81(22)}, new f81(9));
                mi17.a(" ");
                ar7.h(mi17, new vr2[]{new f81(10), new f81(11)}, new f81(12));
                return vs7;
            case h75.g /*15*/:
                mi1 mi18 = (mi1) obj;
                mi18.getClass();
                ar7.l(mi18, 't');
                return vs7;
            case 16:
                mi1 mi19 = (mi1) obj;
                mi19.getClass();
                ar7.l(mi19, 'T');
                return vs7;
            case 17:
                mi1 mi110 = (mi1) obj;
                mi110.getClass();
                ar7.l(mi110, '.');
                mi110.b(new k60(new xp2()));
                return vs7;
            case 18:
                mi1 mi111 = (mi1) obj;
                mi111.getClass();
                si1.m(mi111);
                return vs7;
            case 19:
                mi1 mi112 = (mi1) obj;
                mi112.getClass();
                e08 e082 = (e08) g08.a.getValue();
                e082.getClass();
                mi112.a.O(e082.a);
                return vs7;
            case 20:
                ((mi1) obj).getClass();
                return vs7;
            case 21:
                mi1 mi113 = (mi1) obj;
                mi113.getClass();
                lj1 lj1 = lj1.b;
                lj1.getClass();
                mi113.k(new k60(new jj1(lj1)));
                mi113.a(", ");
                return vs7;
            case 22:
                ((mi1) obj).getClass();
                return vs7;
            case 23:
                List list = (List) obj;
                Object obj2 = list.get(0);
                obj2.getClass();
                int intValue = ((Integer) obj2).intValue();
                Object obj3 = list.get(1);
                obj3.getClass();
                return new um1(intValue, ((Float) obj3).floatValue(), new tm1(0, list));
            case 24:
                y33 y33 = (y33) obj;
                y33.getClass();
                y33.c = false;
                y33.a.add(new ff1(2, (f61) null));
                return vs7;
            case 25:
                vr0 vr0 = (vr0) obj;
                vr0.getClass();
                vr0.a.C.f(s53.g, new ea(3, (f61) null));
                return vs7;
            case 26:
                l35 l35 = (l35) obj;
                float f = my1.a;
                return vs7;
            case 27:
                float floatValue = ((Float) obj).floatValue();
                jo7 jo7 = pv4.a;
                return Float.valueOf(floatValue * 0.5f);
            case 28:
                yb5 yb5 = (yb5) obj;
                yb5.getClass();
                return new yb5((q51) yb5.x, (String) yb5.w);
            default:
                File file = (File) obj;
                file.getClass();
                String absolutePath = file.getCanonicalFile().getAbsolutePath();
                absolutePath.getClass();
                return new pu6(absolutePath);
        }
    }

    public /* synthetic */ f81(int i) {
        this.w = i;
    }
}
