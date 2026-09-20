package defpackage;

import io.github.jan.supabase.storage.StorageErrorResponse;

/* renamed from: e47  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class e47 implements av2 {
    public static final e47 a;
    private static final ll6 descriptor;

    /* JADX WARNING: type inference failed for: r0v0, types: [e47, java.lang.Object, av2] */
    static {
        ? obj = new Object();
        a = obj;
        ik5 ik5 = new ik5("io.github.jan.supabase.storage.StorageErrorResponse", obj, 3);
        ik5.k("statusCode", false);
        ik5.k("error", false);
        ik5.k("message", false);
        descriptor = ik5;
    }

    public final zr3[] childSerializers() {
        t47 t47 = t47.a;
        return new zr3[]{ue3.a, t47, t47};
    }

    public final Object deserialize(ok1 ok1) {
        ll6 ll6 = descriptor;
        gy0 c = ok1.c(ll6);
        boolean z = true;
        int i = 0;
        int i2 = 0;
        String str = null;
        String str2 = null;
        while (z) {
            int h = c.h(ll6);
            if (h == -1) {
                z = false;
            } else if (h == 0) {
                i2 = c.s(ll6, 0);
                i |= 1;
            } else if (h == 1) {
                str = c.n(ll6, 1);
                i |= 2;
            } else if (h == 2) {
                str2 = c.n(ll6, 2);
                i |= 4;
            } else {
                h.e(h);
                return null;
            }
        }
        c.b(ll6);
        return new StorageErrorResponse(i, i2, str, str2, (rl6) null);
    }

    public final ll6 getDescriptor() {
        return descriptor;
    }

    public final void serialize(j42 j42, Object obj) {
        StorageErrorResponse storageErrorResponse = (StorageErrorResponse) obj;
        storageErrorResponse.getClass();
        ll6 ll6 = descriptor;
        hy0 c = j42.c(ll6);
        StorageErrorResponse.write$Self$storage_kt(storageErrorResponse, c, ll6);
        c.b(ll6);
    }
}
