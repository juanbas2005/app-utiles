package defpackage;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;

/* renamed from: pm1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class pm1 implements q54 {
    public final /* synthetic */ int w = 1;
    public final Object x;
    public final Object y;

    public pm1(s54 s54) {
        this.x = s54;
        sq0 sq0 = sq0.c;
        Class<?> cls = s54.getClass();
        qq0 qq0 = (qq0) sq0.a.get(cls);
        this.y = qq0 == null ? sq0.a(cls, (Method[]) null) : qq0;
    }

    public final void o(t54 t54, j54 j54) {
        int i = this.w;
        Object obj = this.x;
        Object obj2 = this.y;
        switch (i) {
            case b85.b:
                nm1 nm1 = (nm1) obj;
                switch (om1.a[j54.ordinal()]) {
                    case 1:
                        nm1.getClass();
                        break;
                    case 2:
                        nm1.l(t54);
                        break;
                    case 3:
                        nm1.v(t54);
                        break;
                    case 4:
                        nm1.getClass();
                        break;
                    case 5:
                        nm1.a(t54);
                        break;
                    case 6:
                        nm1.u(t54);
                        break;
                    case 7:
                        h.q("ON_ANY must not been send by anybody");
                        return;
                    default:
                        h.c();
                        return;
                }
                q54 q54 = (q54) obj2;
                if (q54 != null) {
                    q54.o(t54, j54);
                    return;
                }
                return;
            case 1:
                if (j54 == j54.ON_START) {
                    ((in8) obj).M0(this);
                    ((kg5) obj2).O();
                    return;
                }
                return;
            case 2:
                q45 q45 = (q45) obj;
                int i2 = u45.a[j54.ordinal()];
                if (i2 == 1) {
                    q45.j(true);
                    return;
                } else if (i2 == 2) {
                    q45.j(false);
                    return;
                } else if (i2 == 3) {
                    q45.h();
                    ((in8) obj2).M0(this);
                    return;
                } else {
                    return;
                }
            default:
                HashMap hashMap = ((qq0) obj2).a;
                qq0.a((List) hashMap.get(j54), t54, j54, obj);
                qq0.a((List) hashMap.get(j54.ON_ANY), t54, j54, obj);
                return;
        }
    }

    public pm1(nm1 nm1, q54 q54) {
        nm1.getClass();
        this.x = nm1;
        this.y = q54;
    }

    public pm1(kg5 kg5, in8 in8) {
        this.x = in8;
        this.y = kg5;
    }

    public pm1(q45 q45, v45 v45, in8 in8) {
        this.x = q45;
        this.y = in8;
    }
}
