package defpackage;

import io.github.jan.supabase.storage.vectors.data.ListVectorsResponse;
import java.util.List;

/* renamed from: l84  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class l84 implements av2 {
    public static final l84 a;
    private static final ll6 descriptor;

    /* JADX WARNING: type inference failed for: r0v0, types: [l84, java.lang.Object, av2] */
    static {
        ? obj = new Object();
        a = obj;
        ik5 ik5 = new ik5("io.github.jan.supabase.storage.vectors.data.ListVectorsResponse", obj, 2);
        ik5.k("vectors", false);
        ik5.k("nextToken", true);
        descriptor = ik5;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: zr3[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    public final zr3[] childSerializers() {
        return new zr3[]{ListVectorsResponse.$childSerializers[0].getValue(), hj8.x(t47.a)};
    }

    public final Object deserialize(ok1 ok1) {
        ll6 ll6 = descriptor;
        gy0 c = ok1.c(ll6);
        nz3[] access$get$childSerializers$cp = ListVectorsResponse.$childSerializers;
        boolean z = true;
        int i = 0;
        List list = null;
        String str = null;
        while (z) {
            int h = c.h(ll6);
            if (h == -1) {
                z = false;
            } else if (h == 0) {
                list = (List) c.r(ll6, 0, (zr3) access$get$childSerializers$cp[0].getValue(), list);
                i |= 1;
            } else if (h == 1) {
                str = (String) c.x(ll6, 1, t47.a, str);
                i |= 2;
            } else {
                h.e(h);
                return null;
            }
        }
        c.b(ll6);
        return new ListVectorsResponse(i, list, str, (rl6) null);
    }

    public final ll6 getDescriptor() {
        return descriptor;
    }

    public final void serialize(j42 j42, Object obj) {
        ListVectorsResponse listVectorsResponse = (ListVectorsResponse) obj;
        listVectorsResponse.getClass();
        ll6 ll6 = descriptor;
        hy0 c = j42.c(ll6);
        ListVectorsResponse.write$Self$storage_kt(listVectorsResponse, c, ll6);
        c.b(ll6);
    }
}
