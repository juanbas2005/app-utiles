package defpackage;

import java.io.IOException;

/* renamed from: k47  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class k47 extends f56 {
    public final Long b;
    public final sr2 c;

    public k47(e81 e81, Long l, sr2 sr2) {
        e81.getClass();
        this.b = l;
        this.c = sr2;
    }

    public final long a() {
        Long l = this.b;
        if (l != null) {
            return l.longValue();
        }
        return -1;
    }

    public final yh4 b() {
        return null;
    }

    public final boolean c() {
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: java.lang.Throwable} */
    /* JADX WARNING: type inference failed for: r5v2, types: [java.lang.Throwable] */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    public final void d(dd0 dd0) {
        Throwable th;
        try {
            hf0 hf0 = (hf0) this.c.b();
            hf0.getClass();
            wc3 q = j45.q(new aa0(0, (Object) hf0));
            Long th2 = null;
            try {
                Long valueOf = Long.valueOf(dd0.t(q));
                try {
                    q.close();
                } catch (Throwable th3) {
                    th2 = th3;
                }
                Long l = th2;
                th2 = valueOf;
                th = l;
            } catch (Throwable th4) {
                su0.b(th, th4);
                th = th;
            }
            if (th == 0) {
                th2.getClass();
                return;
            }
            throw th;
        } catch (IOException e) {
            throw e;
        } catch (Throwable th5) {
            throw new IOException(th5);
        }
    }
}
