package defpackage;

import cu.lestebang.utiletecsa.data.repository.spots.SpotInsertDto;

/* renamed from: o07  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class o07 implements av2 {
    public static final o07 a;
    private static final ll6 descriptor;

    /* JADX WARNING: type inference failed for: r0v0, types: [o07, java.lang.Object, av2] */
    static {
        ? obj = new Object();
        a = obj;
        ik5 ik5 = new ik5("cu.lestebang.utiletecsa.data.repository.spots.SpotInsertDto", obj, 10);
        ik5.k("nick", false);
        ik5.k("connection_type", false);
        ik5.k("quality", false);
        ik5.k("address", false);
        ik5.k("province", true);
        ik5.k("note", true);
        ik5.k("latitude", true);
        ik5.k("longitude", true);
        ik5.k("user_id", true);
        ik5.k("device_id", false);
        descriptor = ik5;
    }

    public final zr3[] childSerializers() {
        t47 t47 = t47.a;
        zr3 x = hj8.x(t47);
        zr3 x2 = hj8.x(t47);
        ix1 ix1 = ix1.a;
        return new zr3[]{t47, t47, t47, t47, x, x2, hj8.x(ix1), hj8.x(ix1), hj8.x(t47), t47};
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: java.lang.Double} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v3, resolved type: java.lang.Double} */
    /* JADX WARNING: Multi-variable type inference failed */
    public final Object deserialize(ok1 ok1) {
        ll6 ll6 = descriptor;
        gy0 c = ok1.c(ll6);
        Object obj = null;
        boolean z = true;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        Double d = null;
        Double d2 = null;
        String str8 = null;
        int i = 0;
        while (z) {
            int h = c.h(ll6);
            switch (h) {
                case -1:
                    z = false;
                    continue;
                case b85.b:
                    str2 = c.n(ll6, 0);
                    i |= 1;
                    break;
                case 1:
                    str3 = c.n(ll6, 1);
                    i |= 2;
                    break;
                case 2:
                    str4 = c.n(ll6, 2);
                    i |= 4;
                    break;
                case 3:
                    str5 = c.n(ll6, 3);
                    i |= 8;
                    break;
                case 4:
                    str6 = c.x(ll6, 4, t47.a, str6);
                    i |= 16;
                    break;
                case 5:
                    str7 = c.x(ll6, 5, t47.a, str7);
                    i |= 32;
                    break;
                case 6:
                    d = c.x(ll6, 6, ix1.a, d);
                    i |= 64;
                    break;
                case 7:
                    d2 = c.x(ll6, 7, ix1.a, d2);
                    i |= 128;
                    break;
                case 8:
                    str = (String) c.x(ll6, 8, t47.a, str);
                    i |= 256;
                    break;
                case 9:
                    str8 = c.n(ll6, 9);
                    i |= 512;
                    break;
                default:
                    h.e(h);
                    return obj;
            }
            obj = null;
        }
        c.b(ll6);
        return new SpotInsertDto(i, str2, str3, str4, str5, str6, str7, d, d2, str, str8, (rl6) null);
    }

    public final ll6 getDescriptor() {
        return descriptor;
    }

    public final void serialize(j42 j42, Object obj) {
        SpotInsertDto spotInsertDto = (SpotInsertDto) obj;
        spotInsertDto.getClass();
        ll6 ll6 = descriptor;
        hy0 c = j42.c(ll6);
        SpotInsertDto.write$Self$data(spotInsertDto, c, ll6);
        c.b(ll6);
    }
}
