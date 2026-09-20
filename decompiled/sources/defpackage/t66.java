package defpackage;

import io.github.jan.supabase.storage.resumable.ResumableCacheEntry;

/* renamed from: t66  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class t66 implements av2 {
    public static final t66 a;
    private static final ll6 descriptor;

    /* JADX WARNING: type inference failed for: r0v0, types: [t66, java.lang.Object, av2] */
    static {
        ? obj = new Object();
        a = obj;
        ik5 ik5 = new ik5("io.github.jan.supabase.storage.resumable.ResumableCacheEntry", obj, 6);
        ik5.k("url", false);
        ik5.k("path", false);
        ik5.k("bucketId", false);
        ik5.k("expiresAt", false);
        ik5.k("upsert", true);
        ik5.k("contentType", true);
        descriptor = ik5;
    }

    public final zr3[] childSerializers() {
        t47 t47 = t47.a;
        return new zr3[]{t47, t47, t47, wd3.a, ja0.a, t47};
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: qd3} */
    /* JADX WARNING: Multi-variable type inference failed */
    public final Object deserialize(ok1 ok1) {
        ll6 ll6 = descriptor;
        gy0 c = ok1.c(ll6);
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        String str = null;
        String str2 = null;
        String str3 = null;
        qd3 qd3 = null;
        String str4 = null;
        while (z) {
            int h = c.h(ll6);
            switch (h) {
                case -1:
                    z = false;
                    break;
                case b85.b:
                    str = c.n(ll6, 0);
                    i |= 1;
                    break;
                case 1:
                    str2 = c.n(ll6, 1);
                    i |= 2;
                    break;
                case 2:
                    str3 = c.n(ll6, 2);
                    i |= 4;
                    break;
                case 3:
                    qd3 = c.r(ll6, 3, wd3.a, qd3);
                    i |= 8;
                    break;
                case 4:
                    z2 = c.z(ll6, 4);
                    i |= 16;
                    break;
                case 5:
                    str4 = c.n(ll6, 5);
                    i |= 32;
                    break;
                default:
                    h.e(h);
                    return null;
            }
        }
        c.b(ll6);
        return new ResumableCacheEntry(i, str, str2, str3, qd3, z2, str4, (rl6) null);
    }

    public final ll6 getDescriptor() {
        return descriptor;
    }

    public final void serialize(j42 j42, Object obj) {
        ResumableCacheEntry resumableCacheEntry = (ResumableCacheEntry) obj;
        resumableCacheEntry.getClass();
        ll6 ll6 = descriptor;
        hy0 c = j42.c(ll6);
        ResumableCacheEntry.write$Self$storage_kt(resumableCacheEntry, c, ll6);
        c.b(ll6);
    }
}
