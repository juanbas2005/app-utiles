package defpackage;

import com.google.android.gms.internal.measurement.zzaeh;
import com.google.android.gms.internal.measurement.zzafy;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: ml8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ml8 implements rm8 {
    public final nl8 a;

    static {
        gl8 gl8 = gl8.a;
        int i = rk8.a;
    }

    public ml8(nl8 nl8) {
        this.a = nl8;
    }

    public final nl8 a(InputStream inputStream, gl8 gl8) {
        yk8 h = yk8.h(inputStream, 4096);
        int i = nl8.zzd;
        nl8 i2 = this.a.i();
        try {
            wm8 a2 = tm8.c.a(i2.getClass());
            tt2 tt2 = h.c;
            if (tt2 == null) {
                tt2 = new tt2(h);
            }
            a2.c(i2, tt2, gl8);
            a2.f(i2);
            h.m(0);
            if (nl8.q(i2, true)) {
                return i2;
            }
            throw new zzafy().a();
        } catch (zzaeh e) {
            if (e.w) {
                throw new IOException(e.getMessage(), e);
            }
            throw e;
        } catch (zzafy e2) {
            throw e2.a();
        } catch (IOException e3) {
            if (e3.getCause() instanceof zzaeh) {
                throw ((zzaeh) e3.getCause());
            }
            throw new IOException(e3.getMessage(), e3);
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof zzaeh) {
                throw ((zzaeh) e4.getCause());
            }
            throw e4;
        }
    }
}
