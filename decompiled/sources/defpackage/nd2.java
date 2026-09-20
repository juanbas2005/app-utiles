package defpackage;

import java.io.Closeable;
import java.util.List;

/* renamed from: nd2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class nd2 implements Closeable {
    public static final sp3 w;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: sp3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: sp3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: sp3} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        sp3 sp3;
        try {
            Class.forName("java.nio.file.Files");
            sp3 = new Object();
        } catch (ClassNotFoundException unused) {
            sp3 = new Object();
        }
        w = sp3;
        String str = ae5.x;
        String property = System.getProperty("java.io.tmpdir");
        property.getClass();
        tz2.k(property);
        ClassLoader classLoader = q56.class.getClassLoader();
        classLoader.getClass();
        new q56(classLoader);
    }

    public abstract List B(ae5 ae5);

    public final dq1 D(ae5 ae5) {
        ae5.getClass();
        dq1 E = E(ae5);
        if (E != null) {
            return E;
        }
        ta1.m("no such file: ", ae5);
        return null;
    }

    public abstract dq1 E(ae5 ae5);

    public abstract go3 G(ae5 ae5);

    public abstract tu6 I(ae5 ae5);

    public abstract oy6 L(ae5 ae5);

    public abstract tu6 a(ae5 ae5);

    public abstract void k(ae5 ae5, ae5 ae52);

    public abstract void l(ae5 ae5);

    public abstract void o(ae5 ae5);

    public final void u(ae5 ae5) {
        ae5.getClass();
        o(ae5);
    }

    public final boolean v(ae5 ae5) {
        ae5.getClass();
        if (E(ae5) != null) {
            return true;
        }
        return false;
    }

    public void close() {
    }
}
