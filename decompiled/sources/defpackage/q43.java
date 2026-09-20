package defpackage;

import java.io.Closeable;
import java.util.Set;

/* renamed from: q43  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public interface q43 extends o81, Closeable {
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x007d, code lost:
        if (r11 == r5) goto L_0x00a0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00a0 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00a1 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    static Object O(q43 q43, md2 md2, h61 h61) {
        o43 o43;
        int i;
        p81 p81;
        Object h;
        q43.getClass();
        if (h61 instanceof o43) {
            o43 = (o43) h61;
            int i2 = o43.C;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                o43.C = i2 - Integer.MIN_VALUE;
                Object obj = o43.A;
                i = o43.C;
                p81 = p81.w;
                if (i != 0) {
                    o85.q(obj);
                    o43.z = md2;
                    o43.C = 1;
                    k81 k81 = w43.a;
                    fl3 fl3 = new fl3((el3) md2.f);
                    obj = q43.k().X(fl3).X(w43.a);
                    e81 e81 = o43.x;
                    e81.getClass();
                    el3 el3 = (el3) e81.a0(me6.E);
                    if (el3 != null) {
                        fl3.v(new st6(4, el3.T(true, true, new st6(5, fl3))));
                    }
                } else if (i == 1) {
                    md2 = o43.z;
                    o85.q(obj);
                } else if (i == 2) {
                    o85.q(obj);
                    return obj;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                e81 e812 = (e81) obj;
                mo1 j = ar7.j(q43, e812.X(new qx3(e812)), new ju1(q43, md2, (f61) null, 13), 2);
                o43.z = null;
                o43.C = 2;
                h = j.h(o43);
                if (h != p81) {
                    return p81;
                }
                return h;
            }
        }
        o43 = new o43(q43, h61);
        Object obj2 = o43.A;
        i = o43.C;
        p81 = p81.w;
        if (i != 0) {
        }
        e81 e8122 = (e81) obj2;
        mo1 j2 = ar7.j(q43, e8122.X(new qx3(e8122)), new ju1(q43, md2, (f61) null, 13), 2);
        o43.z = null;
        o43.C = 2;
        h = j2.h(o43);
        if (h != p81) {
        }
    }

    Set A() {
        return g42.w;
    }
}
