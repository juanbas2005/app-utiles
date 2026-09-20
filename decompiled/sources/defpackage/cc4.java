package defpackage;

/* renamed from: cc4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public interface cc4 {
    boolean a();

    boolean b();

    boolean c();

    boolean d();

    boolean e();

    void f(String str, Throwable th);

    void g(String str);

    void h(String str);

    boolean i(int i) {
        boolean z;
        String str;
        if (i == 1) {
            z = true;
        } else if (i == 2) {
            z = true;
        } else if (i == 3) {
            z = true;
        } else if (i == 4) {
            z = true;
        } else if (i == 5) {
            z = false;
        } else {
            throw null;
        }
        if (!z) {
            return e();
        }
        if (z) {
            return b();
        }
        if (z) {
            return d();
        }
        if (z) {
            return a();
        }
        if (z) {
            return c();
        }
        if (i == 1) {
            str = "ERROR";
        } else if (i == 2) {
            str = "WARN";
        } else if (i == 3) {
            str = "INFO";
        } else if (i == 4) {
            str = "DEBUG";
        } else if (i != 5) {
            str = "null";
        } else {
            str = "TRACE";
        }
        throw new IllegalArgumentException("Level [" + str + "] not recognized.");
    }
}
