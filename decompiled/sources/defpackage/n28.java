package defpackage;

import io.github.jan.supabase.storage.vectors.data.VectorData;

/* renamed from: n28  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class n28 implements av2 {
    public static final n28 a;
    private static final ll6 descriptor;

    /* JADX WARNING: type inference failed for: r0v0, types: [n28, java.lang.Object, av2] */
    static {
        ? obj = new Object();
        a = obj;
        ik5 ik5 = new ik5("io.github.jan.supabase.storage.vectors.data.VectorData", obj, 1);
        ik5.k("float32", false);
        descriptor = ik5;
    }

    public final zr3[] childSerializers() {
        return new zr3[]{kh2.c};
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: float[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    public final Object deserialize(ok1 ok1) {
        ll6 ll6 = descriptor;
        gy0 c = ok1.c(ll6);
        boolean z = true;
        int i = 0;
        float[] fArr = null;
        while (z) {
            int h = c.h(ll6);
            if (h == -1) {
                z = false;
            } else if (h == 0) {
                fArr = c.r(ll6, 0, kh2.c, fArr);
                i = 1;
            } else {
                h.e(h);
                return null;
            }
        }
        c.b(ll6);
        return new VectorData(i, fArr, (rl6) null);
    }

    public final ll6 getDescriptor() {
        return descriptor;
    }

    public final void serialize(j42 j42, Object obj) {
        VectorData vectorData = (VectorData) obj;
        vectorData.getClass();
        ll6 ll6 = descriptor;
        hy0 c = j42.c(ll6);
        c.o(ll6, 0, kh2.c, vectorData.float32);
        c.b(ll6);
    }
}
