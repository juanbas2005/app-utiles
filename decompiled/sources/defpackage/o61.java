package defpackage;

import io.ktor.http.Cookie;
import io.ktor.util.date.GMTDate;
import java.util.Map;

/* renamed from: o61  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class o61 implements av2 {
    public static final o61 a;
    private static final ll6 descriptor;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, o61, av2] */
    static {
        ? obj = new Object();
        a = obj;
        ik5 ik5 = new ik5("io.ktor.http.Cookie", obj, 10);
        ik5.k("name", false);
        ik5.k("value", false);
        ik5.k("encoding", true);
        ik5.k("maxAge", true);
        ik5.k("expires", true);
        ik5.k("domain", true);
        ik5.k("path", true);
        ik5.k("secure", true);
        ik5.k("httpOnly", true);
        ik5.k("extensions", true);
        descriptor = ik5;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: zr3[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    public final zr3[] childSerializers() {
        nz3[] access$get$childSerializers$cp = Cookie.$childSerializers;
        t47 t47 = t47.a;
        ja0 ja0 = ja0.a;
        return new zr3[]{t47, t47, access$get$childSerializers$cp[2].getValue(), hj8.x(ue3.a), hj8.x(qt2.a), hj8.x(t47), hj8.x(t47), ja0, ja0, access$get$childSerializers$cp[9].getValue()};
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: r61} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v3, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: io.ktor.util.date.GMTDate} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v3, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    public final Object deserialize(ok1 ok1) {
        ll6 ll6 = descriptor;
        gy0 c = ok1.c(ll6);
        nz3[] access$get$childSerializers$cp = Cookie.$childSerializers;
        Object obj = null;
        boolean z = true;
        Map map = null;
        String str = null;
        String str2 = null;
        r61 r61 = null;
        Integer num = null;
        GMTDate gMTDate = null;
        String str3 = null;
        String str4 = null;
        int i = 0;
        boolean z2 = false;
        boolean z3 = false;
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
                    r61 = c.r(ll6, 2, (zr3) access$get$childSerializers$cp[2].getValue(), r61);
                    i |= 4;
                    break;
                case 3:
                    num = c.x(ll6, 3, ue3.a, num);
                    i |= 8;
                    break;
                case 4:
                    gMTDate = c.x(ll6, 4, qt2.a, gMTDate);
                    i |= 16;
                    break;
                case 5:
                    str3 = c.x(ll6, 5, t47.a, str3);
                    i |= 32;
                    break;
                case 6:
                    str4 = c.x(ll6, 6, t47.a, str4);
                    i |= 64;
                    break;
                case 7:
                    z2 = c.z(ll6, 7);
                    i |= 128;
                    break;
                case 8:
                    z3 = c.z(ll6, 8);
                    i |= 256;
                    break;
                case 9:
                    map = (Map) c.r(ll6, 9, (zr3) access$get$childSerializers$cp[9].getValue(), map);
                    i |= 512;
                    break;
                default:
                    h.e(h);
                    return obj;
            }
            obj = null;
        }
        c.b(ll6);
        return new Cookie(i, str, str2, r61, num, gMTDate, str3, str4, z2, z3, map, (rl6) null);
    }

    public final ll6 getDescriptor() {
        return descriptor;
    }

    public final void serialize(j42 j42, Object obj) {
        Cookie cookie = (Cookie) obj;
        cookie.getClass();
        ll6 ll6 = descriptor;
        hy0 c = j42.c(ll6);
        Cookie.write$Self$ktor_http(cookie, c, ll6);
        c.b(ll6);
    }
}
