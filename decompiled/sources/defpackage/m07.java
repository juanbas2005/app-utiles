package defpackage;

import cu.lestebang.utiletecsa.data.repository.spots.SpotFeedDto;

/* renamed from: m07  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class m07 implements av2 {
    public static final m07 a;
    private static final ll6 descriptor;

    /* JADX WARNING: type inference failed for: r0v0, types: [m07, java.lang.Object, av2] */
    static {
        ? obj = new Object();
        a = obj;
        ik5 ik5 = new ik5("cu.lestebang.utiletecsa.data.repository.spots.SpotFeedDto", obj, 13);
        ik5.k("id", false);
        ik5.k("nick", false);
        ik5.k("connection_type", false);
        ik5.k("quality", false);
        ik5.k("address", false);
        ik5.k("province", true);
        ik5.k("note", true);
        ik5.k("latitude", true);
        ik5.k("longitude", true);
        ik5.k("device_id", false);
        ik5.k("created_at", false);
        ik5.k("likes", true);
        ik5.k("dislikes", true);
        descriptor = ik5;
    }

    public final zr3[] childSerializers() {
        t47 t47 = t47.a;
        zr3 x = hj8.x(t47);
        zr3 x2 = hj8.x(t47);
        ix1 ix1 = ix1.a;
        zr3 x3 = hj8.x(ix1);
        zr3 x4 = hj8.x(ix1);
        tc4 tc4 = tc4.a;
        return new zr3[]{t47, t47, t47, t47, t47, x, x2, x3, x4, t47, t47, tc4, tc4};
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v3, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    public final Object deserialize(ok1 ok1) {
        ll6 ll6 = descriptor;
        gy0 c = ok1.c(ll6);
        Object obj = null;
        Double d = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        long j = 0;
        long j2 = 0;
        int i = 0;
        boolean z = true;
        Double d2 = null;
        while (z) {
            int h = c.h(ll6);
            switch (h) {
                case -1:
                    z = false;
                    continue;
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
                    str4 = c.n(ll6, 3);
                    i |= 8;
                    break;
                case 4:
                    str5 = c.n(ll6, 4);
                    i |= 16;
                    break;
                case 5:
                    str6 = c.x(ll6, 5, t47.a, str6);
                    i |= 32;
                    break;
                case 6:
                    str7 = c.x(ll6, 6, t47.a, str7);
                    i |= 64;
                    break;
                case 7:
                    d2 = (Double) c.x(ll6, 7, ix1.a, d2);
                    i |= 128;
                    break;
                case 8:
                    d = (Double) c.x(ll6, 8, ix1.a, d);
                    i |= 256;
                    break;
                case 9:
                    str8 = c.n(ll6, 9);
                    i |= 512;
                    break;
                case 10:
                    str9 = c.n(ll6, 10);
                    i |= 1024;
                    break;
                case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                    j = c.D(ll6, 11);
                    i |= 2048;
                    break;
                case 12:
                    j2 = c.D(ll6, 12);
                    i |= 4096;
                    break;
                default:
                    h.e(h);
                    return obj;
            }
            obj = null;
        }
        c.b(ll6);
        return new SpotFeedDto(i, str, str2, str3, str4, str5, str6, str7, d2, d, str8, str9, j, j2, (rl6) null);
    }

    public final ll6 getDescriptor() {
        return descriptor;
    }

    public final void serialize(j42 j42, Object obj) {
        SpotFeedDto spotFeedDto = (SpotFeedDto) obj;
        spotFeedDto.getClass();
        ll6 ll6 = descriptor;
        hy0 c = j42.c(ll6);
        SpotFeedDto.write$Self$data(spotFeedDto, c, ll6);
        c.b(ll6);
    }
}
