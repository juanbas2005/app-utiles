package defpackage;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* renamed from: rp3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class rp3 {
    public static final y92 a = h03.d(jo3.y);

    public static qo3 a(wr5 wr5, vq4 vq4, wv1 wv1) {
        String str;
        String str2;
        wr5.getClass();
        vq4.getClass();
        wv1.getClass();
        yu2 yu2 = qp3.a;
        yu2.getClass();
        ip3 ip3 = (ip3) jb5.n(wr5, yu2);
        if (ip3 == null || (ip3.x & 1) != 1) {
            str = "<init>";
        } else {
            str = vq4.getString(ip3.y);
        }
        if (ip3 == null || (ip3.x & 2) != 2) {
            List<jt5> list = wr5.A;
            list.getClass();
            ArrayList arrayList = new ArrayList(et0.e0(list, 10));
            for (jt5 jt5 : list) {
                jt5.getClass();
                String e = e(p25.E(jt5, wv1), vq4);
                if (e == null) {
                    return null;
                }
                arrayList.add(e);
            }
            str2 = dt0.E0(arrayList, "", "(", ")V", (vr2) null, 56);
        } else {
            str2 = vq4.getString(ip3.z);
        }
        return new qo3(str, str2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004a, code lost:
        if (r4 == null) goto L_0x004c;
     */
    public static po3 b(qs5 qs5, vq4 vq4, wv1 wv1, boolean z) {
        hp3 hp3;
        int i;
        String str;
        qs5.getClass();
        vq4.getClass();
        wv1.getClass();
        yu2 yu2 = qp3.d;
        yu2.getClass();
        kp3 kp3 = (kp3) jb5.n(qs5, yu2);
        if (kp3 != null) {
            if ((kp3.x & 1) == 1) {
                hp3 = kp3.y;
            } else {
                hp3 = null;
            }
            if (hp3 != null || !z) {
                if (hp3 == null || (hp3.x & 1) != 1) {
                    i = qs5.B;
                } else {
                    i = hp3.y;
                }
                if (hp3 == null || (hp3.x & 2) != 2) {
                    str = e(p25.C(qs5, wv1), vq4);
                } else {
                    str = vq4.getString(hp3.z);
                }
                return new po3(vq4.getString(i), str);
            }
        }
        return null;
    }

    public static qo3 c(js5 js5, vq4 vq4, wv1 wv1) {
        int i;
        String str;
        js5.getClass();
        vq4.getClass();
        wv1.getClass();
        yu2 yu2 = qp3.b;
        yu2.getClass();
        ip3 ip3 = (ip3) jb5.n(js5, yu2);
        if (ip3 == null || (ip3.x & 1) != 1) {
            i = js5.B;
        } else {
            i = ip3.y;
        }
        if (ip3 == null || (ip3.x & 2) != 2) {
            List F = sg3.F(p25.z(js5, wv1));
            List<jt5> list = js5.L;
            list.getClass();
            ArrayList arrayList = new ArrayList(et0.e0(list, 10));
            for (jt5 jt5 : list) {
                jt5.getClass();
                arrayList.add(p25.E(jt5, wv1));
            }
            ArrayList M0 = dt0.M0(F, arrayList);
            ArrayList arrayList2 = new ArrayList(et0.e0(M0, 10));
            Iterator it = M0.iterator();
            while (it.hasNext()) {
                String e = e((bt5) it.next(), vq4);
                if (e == null) {
                    return null;
                }
                arrayList2.add(e);
            }
            String e2 = e(p25.B(js5, wv1), vq4);
            if (e2 == null) {
                return null;
            }
            str = dt0.E0(arrayList2, "", "(", ")", (vr2) null, 56).concat(e2);
        } else {
            str = vq4.getString(ip3.z);
        }
        return new qo3(vq4.getString(i), str);
    }

    public static final boolean d(qs5 qs5) {
        qs5.getClass();
        tg2 tg2 = ho3.a;
        tg2 tg22 = ho3.a;
        Object k = qs5.k(qp3.e);
        k.getClass();
        return tg22.e(((Number) k).intValue()).booleanValue();
    }

    public static String e(bt5 bt5, vq4 vq4) {
        if (bt5.p()) {
            return kq0.b(vq4.a(bt5.E));
        }
        return null;
    }

    public static final yb5 f(String[] strArr, String[] strArr2) {
        strArr2.getClass();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(j90.a(strArr));
        uo3 h = h(byteArrayInputStream, strArr2);
        fp3 fp3 = tr5.d0;
        fp3.getClass();
        ts0 ts0 = new ts0(byteArrayInputStream);
        k2 k2Var = (k2) fp3.b(ts0, a);
        try {
            ts0.a(0);
            if (k2Var.a()) {
                return new yb5(h, (tr5) k2Var);
            }
            InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(new UninitializedMessageException().getMessage());
            invalidProtocolBufferException.w = k2Var;
            throw invalidProtocolBufferException;
        } catch (InvalidProtocolBufferException e) {
            e.w = k2Var;
            throw e;
        }
    }

    public static final yb5 g(String[] strArr, String[] strArr2) {
        strArr2.getClass();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(j90.a(strArr));
        uo3 h = h(byteArrayInputStream, strArr2);
        fp3 fp3 = js5.V;
        fp3.getClass();
        ts0 ts0 = new ts0(byteArrayInputStream);
        k2 k2Var = (k2) fp3.b(ts0, a);
        try {
            ts0.a(0);
            if (k2Var.a()) {
                return new yb5(h, (js5) k2Var);
            }
            InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(new UninitializedMessageException().getMessage());
            invalidProtocolBufferException.w = k2Var;
            throw invalidProtocolBufferException;
        } catch (InvalidProtocolBufferException e) {
            e.w = k2Var;
            throw e;
        }
    }

    public static uo3 h(ByteArrayInputStream byteArrayInputStream, String[] strArr) {
        pp3 pp3 = (pp3) pp3.D.a(byteArrayInputStream, a);
        pp3.getClass();
        return new uo3(pp3, strArr);
    }

    public static final yb5 i(String[] strArr, String[] strArr2) {
        strArr2.getClass();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(j90.a(strArr));
        uo3 h = h(byteArrayInputStream, strArr2);
        fp3 fp3 = ns5.H;
        fp3.getClass();
        ts0 ts0 = new ts0(byteArrayInputStream);
        k2 k2Var = (k2) fp3.b(ts0, a);
        try {
            ts0.a(0);
            if (k2Var.a()) {
                return new yb5(h, (ns5) k2Var);
            }
            InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(new UninitializedMessageException().getMessage());
            invalidProtocolBufferException.w = k2Var;
            throw invalidProtocolBufferException;
        } catch (InvalidProtocolBufferException e) {
            e.w = k2Var;
            throw e;
        }
    }
}
