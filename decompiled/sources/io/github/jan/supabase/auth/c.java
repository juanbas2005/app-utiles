package io.github.jan.supabase.auth;

import io.github.jan.supabase.auth.GoTrueErrorResponse;
import java.util.List;

/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class c implements av2 {
    public static final c a;
    private static final ll6 descriptor;

    /* JADX WARNING: type inference failed for: r0v0, types: [io.github.jan.supabase.auth.c, java.lang.Object, av2] */
    static {
        ? obj = new Object();
        a = obj;
        ik5 ik5 = new ik5("io.github.jan.supabase.auth.GoTrueErrorResponse.WeakPassword", obj, 1);
        ik5.k("reasons", false);
        descriptor = ik5;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: zr3[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    public final zr3[] childSerializers() {
        return new zr3[]{GoTrueErrorResponse.WeakPassword.$childSerializers[0].getValue()};
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: java.util.List} */
    /* JADX WARNING: Multi-variable type inference failed */
    public final Object deserialize(ok1 ok1) {
        ll6 ll6 = descriptor;
        gy0 c = ok1.c(ll6);
        nz3[] access$get$childSerializers$cp = GoTrueErrorResponse.WeakPassword.$childSerializers;
        boolean z = true;
        int i = 0;
        List list = null;
        while (z) {
            int h = c.h(ll6);
            if (h == -1) {
                z = false;
            } else if (h == 0) {
                list = c.r(ll6, 0, (zr3) access$get$childSerializers$cp[0].getValue(), list);
                i = 1;
            } else {
                h.e(h);
                return null;
            }
        }
        c.b(ll6);
        return new GoTrueErrorResponse.WeakPassword(i, list, (rl6) null);
    }

    public final ll6 getDescriptor() {
        return descriptor;
    }

    public final void serialize(j42 j42, Object obj) {
        GoTrueErrorResponse.WeakPassword weakPassword = (GoTrueErrorResponse.WeakPassword) obj;
        weakPassword.getClass();
        ll6 ll6 = descriptor;
        hy0 c = j42.c(ll6);
        c.o(ll6, 0, (zr3) GoTrueErrorResponse.WeakPassword.$childSerializers[0].getValue(), weakPassword.reasons);
        c.b(ll6);
    }
}
