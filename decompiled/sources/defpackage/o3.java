package defpackage;

import java.io.ByteArrayInputStream;
import java.lang.reflect.Type;

/* renamed from: o3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class o3 implements sr2 {
    public final /* synthetic */ int w;
    public final Object x;
    public final Object y;
    public final Object z;

    public o3(r3 r3Var, kb4 kb4, pe2 pe2) {
        this.w = 0;
        this.z = r3Var;
        this.x = kb4;
        this.y = pe2;
    }

    public final Object b() {
        int i = this.w;
        Object obj = this.z;
        Object obj2 = this.y;
        Object obj3 = this.x;
        switch (i) {
            case b85.b:
                return new q3((r3) obj, (kb4) obj3, (pe2) obj2);
            case 1:
                return ((fp3) obj3).a((ByteArrayInputStream) obj2, ((ws1) ((qt1) obj).b.a).p);
            case 2:
                en2 en2 = (en2) obj3;
                ((aq4) obj).setValue(en2);
                if (en2.e == null && en2.g) {
                    ((vr2) obj2).y(en2.a);
                }
                return vs7.a;
            case 3:
                oq3 oq3 = (oq3) obj3;
                Class cls = (Class) obj2;
                gq0 gq0 = (gq0) obj;
                Class cls2 = oq3.x;
                if (sg3.e(cls2.getSuperclass(), cls)) {
                    Type genericSuperclass = cls2.getGenericSuperclass();
                    genericSuperclass.getClass();
                    return genericSuperclass;
                }
                Class[] interfaces = cls2.getInterfaces();
                interfaces.getClass();
                int c1 = qs.c1(cls, interfaces);
                if (c1 >= 0) {
                    Type type = cls2.getGenericInterfaces()[c1];
                    type.getClass();
                    return type;
                }
                h.r("No superclass of ", oq3, " in Java reflection for ", gq0);
                return null;
            default:
                m14 m14 = (m14) obj3;
                kb4 kb4 = ((pj3) m14.b.x).a;
                p3 p3Var = new p3(m14, (e16) obj2, (h06) obj);
                kb4.getClass();
                return new hb4(kb4, p3Var);
        }
    }

    public /* synthetic */ o3(Object obj, Object obj2, Object obj3, int i) {
        this.w = i;
        this.x = obj;
        this.y = obj2;
        this.z = obj3;
    }
}
