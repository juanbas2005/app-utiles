package defpackage;

import java.util.Iterator;
import java.util.List;

/* renamed from: g43  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class g43 {
    public static final cc4 a = fc4.b("io.ktor.client.plugins.HttpCallValidator");
    public static final wr0 b = new wr0("HttpResponseValidator", (sr2) z33.D, (vr2) new vd2(12));
    public static final au c;

    static {
        as3 as3;
        gq3 b2 = b26.a.b(Boolean.class);
        try {
            as3 = b26.b(Boolean.TYPE);
        } catch (Throwable unused) {
            as3 = null;
        }
        c = new au("ExpectSuccessAttributeKey", new fp7(b2, as3));
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [h61] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001e  */
    public static final void a(List list, Throwable th, x53 x53, h61 h61) {
        d43 d43;
        int i;
        Iterator it;
        if (h61 instanceof d43) {
            d43 d432 = (d43) h61;
            int i2 = d432.A;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                d432.A = i2 - Integer.MIN_VALUE;
                d43 = d432;
                Object obj = d43.z;
                i = d43.A;
                if (i != 0) {
                    o85.q(obj);
                    a.h("Processing exception " + th + " for request " + x53.D());
                    it = list.iterator();
                } else if (i == 1 || i == 2) {
                    o85.q(obj);
                    it = null;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return;
                }
                if (!it.hasNext()) {
                    if (it.next() == null) {
                        h.c();
                        return;
                    } else {
                        ku4.a();
                        return;
                    }
                } else {
                    return;
                }
            }
        }
        d43 = new h61(h61);
        Object obj2 = d43.z;
        i = d43.A;
        if (i != 0) {
        }
        if (!it.hasNext()) {
        }
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [h61] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
    public static final Object b(List list, yl1 yl1, h61 h61) {
        e43 e43;
        int i;
        yl1 yl12;
        Iterator it;
        int i2;
        if (h61 instanceof e43) {
            e43 e432 = (e43) h61;
            int i3 = e432.D;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                e432.D = i3 - Integer.MIN_VALUE;
                e43 = e432;
                Object obj = e43.C;
                i = e43.D;
                if (i != 0) {
                    o85.q(obj);
                    a.h("Validating response for request " + yl1.V().c().D());
                    yl1 yl13 = yl1;
                    it = list.iterator();
                    i2 = 0;
                    yl12 = yl13;
                } else if (i == 1) {
                    i2 = e43.B;
                    it = e43.A;
                    yl1 yl14 = e43.z;
                    o85.q(obj);
                    yl12 = yl14;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                while (it.hasNext()) {
                    e43.z = yl12;
                    e43.A = it;
                    e43.B = i2;
                    e43.D = 1;
                    Object H = ((gs2) it.next()).H(yl12, e43);
                    p81 p81 = p81.w;
                    if (H == p81) {
                        return p81;
                    }
                }
                return vs7.a;
            }
        }
        e43 = new h61(h61);
        Object obj2 = e43.C;
        i = e43.D;
        if (i != 0) {
        }
        while (it.hasNext()) {
        }
        return vs7.a;
    }
}
