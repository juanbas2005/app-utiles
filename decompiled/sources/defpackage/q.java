package defpackage;

import io.github.jan.supabase.auth.jwt.AMREntry;
import io.github.jan.supabase.auth.jwt.AMRMethod;

/* renamed from: q  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class q implements av2 {
    public static final q a;
    private static final ll6 descriptor;

    /* JADX WARNING: type inference failed for: r0v0, types: [q, java.lang.Object, av2] */
    static {
        ? obj = new Object();
        a = obj;
        ik5 ik5 = new ik5("io.github.jan.supabase.auth.jwt.AMREntry", obj, 2);
        ik5.k("method", false);
        ik5.k("timestamp", false);
        descriptor = ik5;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: zr3[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    public final zr3[] childSerializers() {
        return new zr3[]{AMREntry.$childSerializers[0].getValue(), tc4.a};
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: io.github.jan.supabase.auth.jwt.AMRMethod} */
    /* JADX WARNING: Multi-variable type inference failed */
    public final Object deserialize(ok1 ok1) {
        ll6 ll6 = descriptor;
        gy0 c = ok1.c(ll6);
        nz3[] access$get$childSerializers$cp = AMREntry.$childSerializers;
        int i = 0;
        AMRMethod aMRMethod = null;
        long j = 0;
        boolean z = true;
        while (z) {
            int h = c.h(ll6);
            if (h == -1) {
                z = false;
            } else if (h == 0) {
                aMRMethod = c.r(ll6, 0, (zr3) access$get$childSerializers$cp[0].getValue(), aMRMethod);
                i |= 1;
            } else if (h == 1) {
                j = c.D(ll6, 1);
                i |= 2;
            } else {
                h.e(h);
                return null;
            }
        }
        c.b(ll6);
        return new AMREntry(i, aMRMethod, j, (rl6) null);
    }

    public final ll6 getDescriptor() {
        return descriptor;
    }

    public final void serialize(j42 j42, Object obj) {
        AMREntry aMREntry = (AMREntry) obj;
        aMREntry.getClass();
        ll6 ll6 = descriptor;
        hy0 c = j42.c(ll6);
        AMREntry.write$Self$auth_kt(aMREntry, c, ll6);
        c.b(ll6);
    }
}
