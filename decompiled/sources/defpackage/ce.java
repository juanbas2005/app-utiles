package defpackage;

import android.content.Context;

/* renamed from: ce  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ce extends wx3 implements vr2 {
    public static final ce A = new ce(1, 2);
    public static final ce B = new ce(1, 3);
    public static final ce C = new ce(1, 4);
    public static final ce D = new ce(1, 5);
    public static final ce E = new ce(1, 6);
    public static final ce F = new ce(1, 7);
    public static final ce G = new ce(1, 8);
    public static final ce H = new ce(1, 9);
    public static final ce I = new ce(1, 10);
    public static final ce J = new ce(1, 11);
    public static final ce K = new ce(1, 12);
    public static final ce L = new ce(1, 13);
    public static final ce M = new ce(1, 14);
    public static final ce N = new ce(1, 15);
    public static final ce O = new ce(1, 16);
    public static final ce P = new ce(1, 17);
    public static final ce Q = new ce(1, 18);
    public static final ce R = new ce(1, 19);
    public static final ce S = new ce(1, 20);
    public static final ce T = new ce(1, 21);
    public static final ce U = new ce(1, 22);
    public static final ce V = new ce(1, 23);
    public static final ce W = new ce(1, 24);
    public static final ce X = new ce(1, 25);
    public static final ce Y = new ce(1, 26);
    public static final ce Z = new ce(1, 27);
    public static final ce a0 = new ce(1, 28);
    public static final ce b0 = new ce(1, 29);
    public static final ce y = new ce(1, 0);
    public static final ce z = new ce(1, 1);
    public final /* synthetic */ int x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ce(int i, int i2) {
        super(i);
        this.x = i2;
    }

    /* JADX WARNING: type inference failed for: r13v19, types: [java.lang.Object, ux0] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    public final Object y(Object obj) {
        int i = this.x;
        uy3 uy3 = null;
        vs7 vs7 = vs7.a;
        switch (i) {
            case b85.b:
                vk2 vk2 = (vk2) obj;
                return Boolean.TRUE;
            case 1:
                ak6 k = ((fk6) obj).k();
                return Boolean.valueOf(k.w.c(jk6.B));
            case 2:
                qy0 qy0 = (qy0) obj;
                qy0.g0(ye.a);
                return ((Context) qy0.g0(ye.b)).getResources();
            case 3:
                ak6 k2 = ((fk6) obj).k();
                return Boolean.valueOf(k2.w.c(jk6.B));
            case 4:
                yr3[] yr3Arr = mk6.a;
                ((ok6) obj).f(jk6.y, vs7);
                return vs7;
            case 5:
                ((Number) obj).longValue();
                return vs7;
            case 6:
                dh5 dh5 = (dh5) obj;
                return vs7;
            case 7:
                yr3[] yr3Arr2 = mk6.a;
                ((ok6) obj).f(jk6.x, vs7);
                return vs7;
            case 8:
                dh5 dh52 = (dh5) obj;
                return vs7;
            case 9:
                return obj;
            case 10:
                gk gkVar = (gk) obj;
                return null;
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            case 12:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                return bool2;
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                return bool3;
            case 14:
                long a = jt0.a(((jt0) obj).a, vt0.x);
                return new nl(jt0.d(a), jt0.h(a), jt0.g(a), jt0.e(a));
            case h75.g /*15*/:
                ((Number) obj).longValue();
                return vs7;
            case 16:
                ? r13 = (ux0) obj;
                if (r13 instanceof uy3) {
                    uy3 = r13;
                }
                if (uy3 != null && uy3.j0) {
                    yb3.b("Apply is called on deactivated node " + r13);
                }
                return vs7;
            case 17:
                return Boolean.valueOf(!(((kl4) obj) instanceof zx0));
            case 18:
                return (xa4) dt0.v0((Iterable) ((qy0) obj).g0(xy0.o));
            case 19:
                float[] fArr = ((eh4) obj).a;
                return vs7;
            case 20:
                float[] fArr2 = ((eh4) obj).a;
                return vs7;
            case 21:
                return Boolean.valueOf(ag8.h(obj));
            case 22:
                long j = ((ql7) obj).a;
                return new ll(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
            case 23:
                ll llVar = (ll) obj;
                return new ql7(o55.a(llVar.a, llVar.b));
            case 24:
                gm7 gm7 = (gm7) obj;
                return kl8.M(0.0f, 0.0f, (Object) null, 7);
            case 25:
                gm7 gm72 = (gm7) obj;
                return i52.d;
            case 26:
                gk0 gk0 = (gk0) obj;
                return vs7;
            case 27:
                gk0 gk02 = (gk0) obj;
                return vs7;
            case 28:
                hz1 hz1 = (hz1) obj;
                return vs7;
            default:
                hz1.f0((hz1) obj, jt0.f, 0, 0, 0.0f, 126);
                return vs7;
        }
    }
}
