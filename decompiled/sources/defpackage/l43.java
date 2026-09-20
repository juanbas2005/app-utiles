package defpackage;

import io.ktor.client.call.DoubleReceiveException;
import io.ktor.client.call.NoTransformationFoundException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: l43  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class l43 implements o81 {
    public static final au A;
    public static final /* synthetic */ AtomicIntegerFieldUpdater z = AtomicIntegerFieldUpdater.newUpdater(l43.class, "received");
    private volatile /* synthetic */ int received = 0;
    public final j43 w;
    public x53 x;
    public yl1 y;

    static {
        as3 as3;
        Class<Object> cls = Object.class;
        gq3 b = b26.a.b(cls);
        try {
            as3 = b26.b(cls);
        } catch (Throwable unused) {
            as3 = null;
        }
        A = new au("CustomResponse", new fp7(b, as3));
    }

    public l43(j43 j43) {
        this.w = j43;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00ba, code lost:
        if (r8 != r5) goto L_0x00bd;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    public final Object a(fp7 fp7, h61 h61) {
        k43 k43;
        int i;
        if (h61 instanceof k43) {
            k43 = (k43) h61;
            int i2 = k43.C;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                k43.C = i2 - Integer.MIN_VALUE;
                Object obj = k43.A;
                i = k43.C;
                Object obj2 = null;
                p81 p81 = p81.w;
                if (i != 0) {
                    o85.q(obj);
                    yl1 d = d();
                    gq3 gq3 = fp7.a;
                    gq3.getClass();
                    if (kl8.u(gq3).isInstance(d)) {
                        return d();
                    }
                    if (!b()) {
                        yl1 d2 = d();
                        au auVar = hx1.a;
                        iz0 attributes = d2.V().getAttributes();
                        au auVar2 = hx1.b;
                        attributes.getClass();
                        auVar2.getClass();
                        if (!attributes.c().containsKey(auVar2)) {
                            if (!z.compareAndSet(this, 0, 1)) {
                                throw new DoubleReceiveException(this);
                            }
                        }
                    }
                    obj = getAttributes().d(A);
                    if (obj == null) {
                        k43.z = fp7;
                        k43.C = 1;
                        obj = d().b();
                        if (obj == p81) {
                            return p81;
                        }
                    }
                } else if (i == 1) {
                    fp7 = k43.z;
                    o85.q(obj);
                } else if (i == 2) {
                    fp7 = k43.z;
                    try {
                        o85.q(obj);
                        Object obj3 = ((h63) obj).b;
                        if (!sg3.e(obj3, m15.a)) {
                            obj2 = obj3;
                        }
                        if (obj2 != null) {
                            gq3 gq32 = fp7.a;
                            gq32.getClass();
                            if (!kl8.u(gq32).isInstance(obj2)) {
                                throw new NoTransformationFoundException(d(), b26.a.b(obj2.getClass()), fp7.a);
                            }
                        }
                        return obj2;
                    } catch (Throwable th) {
                        gl0.J(d(), rc9.b("Receive failed", th));
                        throw th;
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                h63 h63 = new h63(fp7, obj);
                s53 s53 = this.w.A;
                k43.z = fp7;
                k43.C = 2;
                obj = s53.a(this, h63, k43);
            }
        }
        k43 = new k43(this, h61);
        Object obj4 = k43.A;
        i = k43.C;
        Object obj22 = null;
        p81 p812 = p81.w;
        if (i != 0) {
        }
        h63 h632 = new h63(fp7, obj4);
        s53 s532 = this.w.A;
        k43.z = fp7;
        k43.C = 2;
        obj4 = s532.a(this, h632, k43);
    }

    public boolean b() {
        return false;
    }

    public final x53 c() {
        x53 x53 = this.x;
        if (x53 != null) {
            return x53;
        }
        sg3.a0("request");
        throw null;
    }

    public final yl1 d() {
        yl1 yl1 = this.y;
        if (yl1 != null) {
            return yl1;
        }
        sg3.a0("response");
        throw null;
    }

    public final iz0 getAttributes() {
        return c().getAttributes();
    }

    public final e81 k() {
        return d().k();
    }

    public final String toString() {
        return "HttpClientCall[" + c().D() + ", " + d().e() + ']';
    }
}
