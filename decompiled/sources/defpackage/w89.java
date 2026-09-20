package defpackage;

import android.content.Context;
import android.os.StrictMode;

/* renamed from: w89  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class w89 {
    public static final q11 i = new q11(1);
    public static final b89 j;
    public volatile ge2 a;
    public final x49 b;
    public final String c;
    public final String d;
    public final boolean e;
    public final s93 f;
    public final n49 g;
    public final fm8 h;

    static {
        on8 on8 = on8.y;
        int i2 = s93.y;
        j = new b89(on8, false, o36.F);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    public w89(x49 x49, b89 b89) {
        this.b = x49;
        Context context = x49.b;
        String str = b89.d;
        if (str == null) {
            str = b89.a.apply(context);
            b89.d = str;
        }
        this.c = str;
        this.d = "";
        this.e = b89.b;
        this.f = b89.c;
        this.a = null;
        this.g = new n49();
        this.h = new fm8(x49, str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b6 A[Catch:{ all -> 0x00ba, all -> 0x005f }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b7 A[Catch:{ all -> 0x00ba, all -> 0x005f }] */
    public final ge2 a() {
        ge2 ge2;
        StrictMode.ThreadPolicy allowThreadDiskWrites;
        ge2 ge22 = this.a;
        if (ge22 != null) {
            return ge22;
        }
        synchronized (this) {
            try {
                ge2 = this.a;
                if (ge2 == null) {
                    allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
                    ge2 b2 = this.h.b();
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    int i2 = ((dv5) b2.e).c - 2;
                    if (!(i2 == 15 || i2 == 16)) {
                        x49 x49 = this.b;
                        x49.g.a();
                        if (this.e || this.h.g() || !((String) b2.b).isEmpty()) {
                            x49.a().execute(new e89(this, 3));
                            x49.a.d((vk8) b2.c, this.f, this.c);
                            if (!this.d.equals("")) {
                                x49.a().execute(new e89(this, 1));
                            }
                            if (this.h.g()) {
                                x49.a().execute(new e89(this, 2));
                            }
                        } else {
                            x49.a().execute(new e89(this, 0));
                            ge2 = new ge2(t99.A(), (dv5) b2.e);
                            if (!this.e || ((dv5) ge2.e).c != 17) {
                                this.a = ge2;
                            }
                        }
                    }
                    ge2 = b2;
                    if (!this.e || ((dv5) ge2.e).c != 17) {
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return ge2;
    }

    public final void b() {
        fm8 fm8 = this.h;
        x49 x49 = (x49) fm8.x;
        a69 a69 = (a69) x49.d.get();
        String str = (String) fm8.z;
        a69.getClass();
        str.getClass();
        b49 b49 = a69.a;
        za0 b2 = i93.b();
        b2.d = new py2(str, 5);
        i3 f2 = pt2.f(a69.b(b49.b(0, b2.a()).f(fv1.w, new lx8(3))), on8.z, x49.a());
        h89 h89 = new h89(1, fm8);
        x49 x492 = this.b;
        pt2.g(f2, h89, x492.a()).a(new j89(this, f2, 1), x492.a());
    }
}
