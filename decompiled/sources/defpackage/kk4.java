package defpackage;

import io.github.jan.supabase.storage.vectors.index.MetadataConfiguration;
import java.util.List;

/* renamed from: kk4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class kk4 implements av2 {
    public static final kk4 a;
    private static final ll6 descriptor;

    /* JADX WARNING: type inference failed for: r0v0, types: [kk4, java.lang.Object, av2] */
    static {
        ? obj = new Object();
        a = obj;
        ik5 ik5 = new ik5("io.github.jan.supabase.storage.vectors.index.MetadataConfiguration", obj, 1);
        ik5.k("nonFilterableMetadataKeys", true);
        descriptor = ik5;
    }

    public final zr3[] childSerializers() {
        return new zr3[]{hj8.x((zr3) MetadataConfiguration.$childSerializers[0].getValue())};
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: java.util.List} */
    /* JADX WARNING: Multi-variable type inference failed */
    public final Object deserialize(ok1 ok1) {
        ll6 ll6 = descriptor;
        gy0 c = ok1.c(ll6);
        nz3[] access$get$childSerializers$cp = MetadataConfiguration.$childSerializers;
        boolean z = true;
        int i = 0;
        List list = null;
        while (z) {
            int h = c.h(ll6);
            if (h == -1) {
                z = false;
            } else if (h == 0) {
                list = c.x(ll6, 0, (zr3) access$get$childSerializers$cp[0].getValue(), list);
                i = 1;
            } else {
                h.e(h);
                return null;
            }
        }
        c.b(ll6);
        return new MetadataConfiguration(i, list, (rl6) null);
    }

    public final ll6 getDescriptor() {
        return descriptor;
    }

    public final void serialize(j42 j42, Object obj) {
        MetadataConfiguration metadataConfiguration = (MetadataConfiguration) obj;
        metadataConfiguration.getClass();
        ll6 ll6 = descriptor;
        hy0 c = j42.c(ll6);
        MetadataConfiguration.write$Self$storage_kt(metadataConfiguration, c, ll6);
        c.b(ll6);
    }
}
