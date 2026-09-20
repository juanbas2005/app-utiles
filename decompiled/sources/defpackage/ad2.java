package defpackage;

import io.github.jan.supabase.storage.FileObject;
import kotlinx.serialization.json.JsonObject;

/* renamed from: ad2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class ad2 implements av2 {
    public static final ad2 a;
    private static final ll6 descriptor;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, av2, ad2] */
    static {
        ? obj = new Object();
        a = obj;
        ik5 ik5 = new ik5("io.github.jan.supabase.storage.FileObject", obj, 6);
        ik5.k("name", false);
        ik5.k("id", false);
        ik5.k("updated_at", false);
        ik5.k("created_at", false);
        ik5.k("last_accessed_at", false);
        ik5.k("metadata", false);
        descriptor = ik5;
    }

    public final zr3[] childSerializers() {
        t47 t47 = t47.a;
        zr3 x = hj8.x(t47);
        wd3 wd3 = wd3.a;
        return new zr3[]{t47, x, hj8.x(wd3), hj8.x(wd3), hj8.x(wd3), hj8.x(xm3.a)};
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: qd3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: qd3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: qd3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: kotlinx.serialization.json.JsonObject} */
    /* JADX WARNING: Multi-variable type inference failed */
    public final Object deserialize(ok1 ok1) {
        ll6 ll6 = descriptor;
        gy0 c = ok1.c(ll6);
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        qd3 qd3 = null;
        qd3 qd32 = null;
        qd3 qd33 = null;
        JsonObject jsonObject = null;
        while (z) {
            int h = c.h(ll6);
            switch (h) {
                case -1:
                    z = false;
                    break;
                case b85.b /*0*/:
                    str = c.n(ll6, 0);
                    i |= 1;
                    break;
                case 1:
                    str2 = c.x(ll6, 1, t47.a, str2);
                    i |= 2;
                    break;
                case 2:
                    qd3 = c.x(ll6, 2, wd3.a, qd3);
                    i |= 4;
                    break;
                case 3:
                    qd32 = c.x(ll6, 3, wd3.a, qd32);
                    i |= 8;
                    break;
                case 4:
                    qd33 = c.x(ll6, 4, wd3.a, qd33);
                    i |= 16;
                    break;
                case 5:
                    jsonObject = c.x(ll6, 5, xm3.a, jsonObject);
                    i |= 32;
                    break;
                default:
                    h.e(h);
                    return null;
            }
        }
        c.b(ll6);
        return new FileObject(i, str, str2, qd3, qd32, qd33, jsonObject, (rl6) null);
    }

    public final ll6 getDescriptor() {
        return descriptor;
    }

    public final void serialize(j42 j42, Object obj) {
        FileObject fileObject = (FileObject) obj;
        fileObject.getClass();
        ll6 ll6 = descriptor;
        hy0 c = j42.c(ll6);
        FileObject.write$Self$storage_kt(fileObject, c, ll6);
        c.b(ll6);
    }
}
