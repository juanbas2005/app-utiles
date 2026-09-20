package defpackage;

import java.util.concurrent.CancellationException;

/* renamed from: p63  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class p63 implements yk6 {
    public final int a;
    public final j43 b;
    public int c;
    public l43 d;

    public p63(int i, j43 j43) {
        j43.getClass();
        this.a = i;
        this.b = j43;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0020  */
    public final Object a(y53 y53, h61 h61) {
        o63 o63;
        Object obj;
        int i;
        l43 l43;
        if (h61 instanceof o63) {
            o63 = (o63) h61;
            int i2 = o63.B;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                o63.B = i2 - Integer.MIN_VALUE;
                obj = o63.z;
                i = o63.B;
                if (i != 0) {
                    o85.q(obj);
                    l43 l432 = this.d;
                    if (l432 != null) {
                        gl0.J(l432, (CancellationException) null);
                    }
                    int i3 = this.c;
                    int i4 = this.a;
                    if (i3 < i4) {
                        this.c = i3 + 1;
                        s53 s53 = this.b.B;
                        Object obj2 = y53.d;
                        o63.B = 1;
                        obj = s53.a(y53, obj2, o63);
                        p81 p81 = p81.w;
                        if (obj == p81) {
                            return p81;
                        }
                    } else {
                        throw new IllegalStateException(pb4.i(i4, "Max send count ", " exceeded. Consider increasing the property maxSendCount if more is required."));
                    }
                } else if (i == 1) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                if (!(obj instanceof l43)) {
                    l43 = (l43) obj;
                } else {
                    l43 = null;
                }
                if (l43 == null) {
                    this.d = l43;
                    return l43;
                }
                ta1.l("Failed to execute send pipeline. Expected [HttpClientCall], but received ", obj);
                return null;
            }
        }
        o63 = new o63(this, h61);
        obj = o63.z;
        i = o63.B;
        if (i != 0) {
        }
        if (!(obj instanceof l43)) {
        }
        if (l43 == null) {
        }
    }
}
