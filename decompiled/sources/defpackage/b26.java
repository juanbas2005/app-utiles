package defpackage;

import java.util.Collections;

/* renamed from: b26  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class b26 {
    public static final c26 a;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: c26} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: c26} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: c26} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: c26} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: c26} */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        c26 c26 = null;
        try {
            c26 = d26.class.newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (c26 == null) {
            c26 = new Object();
        }
        a = c26;
    }

    public static as3 a() {
        c26 c26 = a;
        return c26.m(c26.b(Object.class), Collections.EMPTY_LIST, true);
    }

    public static as3 b(Class cls) {
        c26 c26 = a;
        return c26.m(c26.b(cls), Collections.EMPTY_LIST, false);
    }

    public static as3 c(Class cls, gs3 gs3) {
        c26 c26 = a;
        return c26.m(c26.b(cls), Collections.singletonList(gs3), false);
    }

    public static as3 d(Class cls, gs3... gs3Arr) {
        c26 c26 = a;
        return c26.m(c26.b(cls), qs.p1(gs3Arr), false);
    }
}
