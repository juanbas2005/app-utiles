package defpackage;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import kotlin.Metadata;

/* renamed from: nk3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class nk3 implements sr2 {
    public final Object A;
    public final /* synthetic */ int w;
    public final Object x;
    public final Object y;
    public final Object z;

    public /* synthetic */ nk3(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.w = i;
        this.x = obj;
        this.y = obj2;
        this.z = obj3;
        this.A = obj4;
    }

    public final Object b() {
        Object zq1;
        int i = this.w;
        Class<Metadata> cls = Metadata.class;
        Object obj = this.A;
        Object obj2 = this.z;
        Object obj3 = this.y;
        Object obj4 = this.x;
        switch (i) {
            case b85.b:
                ((sk3) obj4).c((lk7) obj3);
                ar7.H((o81) obj2, (e81) null, (r81) null, new mk3((xz1) obj, (f61) null, 1), 3);
                return vs7.a;
            case 1:
                String str = (String) obj4;
                yq3 yq3 = (yq3) obj3;
                xz3 xz3 = (xz3) obj2;
                Object obj5 = xz3.x;
                String str2 = (String) obj;
                xf4 d = yq3.w.d(str);
                if (d != null) {
                    return yq3.F(Integer.parseInt((String) ((vf4) d.a()).get(1)), str);
                }
                if (yq3 instanceof oq3) {
                    oq3 oq3 = (oq3) yq3;
                    if (oq3.x.getAnnotation(cls) == null) {
                        try {
                            Field K = yq3.K(xz3.z);
                            if (Modifier.isStatic(K.getModifiers())) {
                                return new kj3(yq3, K, obj5, fq3.j);
                            }
                        } catch (Exception unused) {
                            if (str.equals("getEntries()Lkotlin/enums/EnumEntries;")) {
                                return new si3(oq3);
                            }
                        }
                    }
                }
                if (yq3 instanceof pr3) {
                    xz3 xz32 = xz3;
                    su3 O = yq3.O(str2, str);
                    return new mw3(yq3, str, xz32.x, O, fq3.j);
                }
                return new rr1(yq3, str2, str, obj5);
            case 2:
                String str3 = (String) obj4;
                yq3 yq32 = (yq3) obj3;
                ji1 ji1 = (ji1) obj2;
                Object obj6 = ji1.x;
                String str4 = (String) obj;
                xf4 d2 = yq3.w.d(str3);
                if (d2 != null) {
                    return yq32.F(Integer.parseInt((String) ((vf4) d2.a()).get(1)), str3);
                }
                if ((yq32 instanceof oq3) && ((oq3) yq32).x.getAnnotation(cls) == null) {
                    Field K2 = yq32.K(ji1.z);
                    if (Modifier.isStatic(K2.getModifiers())) {
                        return new cj3(yq32, K2, obj6, fq3.j);
                    }
                }
                if (yq32 instanceof pr3) {
                    yq3 yq33 = yq32;
                    su3 O2 = yq33.O(str4, str3);
                    zq1 = new xv3(yq33, str3, ji1.x, O2, fq3.j);
                } else {
                    zq1 = new zq1(yq32, str4, str3, obj6);
                }
                return zq1;
            case 3:
                yq3 yq34 = (yq3) obj4;
                String str5 = (String) obj3;
                String str6 = (String) obj2;
                gr5 gr5 = (gr5) obj;
                if (!(yq34 instanceof pr3)) {
                    return new ur1(yq34, str5, str6, gr5.x);
                }
                return new pw3(yq34, str6, gr5.x, yq34.O(str5, str6), fq3.j);
            default:
                yq3 yq35 = (yq3) obj4;
                String str7 = (String) obj3;
                String str8 = (String) obj2;
                qp4 qp4 = (qp4) obj;
                if (!(yq35 instanceof pr3)) {
                    return new br1(yq35, str7, str8, qp4.x);
                }
                return new zv3(yq35, str8, qp4.x, yq35.O(str7, str8), fq3.j);
        }
    }
}
