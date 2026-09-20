package defpackage;

import java.io.InputStream;

/* renamed from: k93  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class k93 implements oy2, ja9 {
    public boolean w;

    public /* synthetic */ k93(boolean z) {
        this.w = z;
    }

    public /* bridge */ /* synthetic */ Object d(ia9 ia9) {
        l69 l69;
        InputStream x = o55.x(ia9);
        try {
            int i = 4096;
            if (this.w) {
                if (x instanceof ra9) {
                    long length = ((ra9) x).a().length();
                    if (length == 0) {
                        i = 512;
                    } else if (length < 4096) {
                        i = (int) length;
                    }
                }
                l69 = l69.a(yk8.h(x, i), true);
            } else {
                l69 = l69.a(yk8.h(x, 4096), false);
            }
            ed1.i(x, (Throwable) null);
            return l69;
        } catch (Throwable th) {
            ed1.i(x, th);
            throw th;
        }
    }

    public boolean h() {
        return this.w;
    }

    public boolean i(uu6 uu6) {
        return this.w;
    }
}
