package defpackage;

/* renamed from: w87  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class w87 implements f61, q81 {
    public int w = Integer.MIN_VALUE;
    public final /* synthetic */ x87 x;

    public w87(x87 x87) {
        this.x = x87;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: b27} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: b27} */
    /* JADX WARNING: Multi-variable type inference failed */
    public final q81 e() {
        f61 f61 = b27.w;
        int i = this.w;
        x87 x87 = this.x;
        if (i == Integer.MIN_VALUE) {
            this.w = x87.B;
        }
        int i2 = this.w;
        if (i2 < 0) {
            this.w = Integer.MIN_VALUE;
            f61 = null;
        } else {
            try {
                f61 f612 = x87.A[i2];
                if (f612 != null) {
                    this.w = i2 - 1;
                    f61 = f612;
                }
            } catch (Throwable unused) {
            }
        }
        if (f61 instanceof q81) {
            return (q81) f61;
        }
        return null;
    }

    public final void f(Object obj) {
        Throwable a = o66.a(obj);
        x87 x87 = this.x;
        if (a != null) {
            x87.f(new m66(a));
        } else {
            x87.e(false);
        }
    }

    public final e81 r() {
        x87 x87 = this.x;
        for (int i = x87.B; -1 < i; i--) {
            f61 f61 = x87.A[i];
            if (f61 != this && f61 != null) {
                return f61.r();
            }
        }
        h.s("Not started");
        return null;
    }
}
