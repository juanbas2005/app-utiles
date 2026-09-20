package defpackage;

/* renamed from: wt1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class wt1 extends jz0 {
    public final boolean z;

    public wt1(fb0 fb0, boolean z2) {
        super(fb0);
        this.z = z2;
    }

    public final e50 c0() {
        e50[] e50Arr = (e50[]) this.y;
        g50 g50 = new g50();
        g50 g502 = new g50();
        g50 g503 = new g50();
        g50 g504 = new g50();
        for (e50 e50 : e50Arr) {
            if (e50 != null) {
                e50.c();
                int i = e50.e % 30;
                int i2 = e50.f;
                if (!this.z) {
                    i2 += 2;
                }
                int i3 = i2 % 3;
                if (i3 == 0) {
                    g502.b((i * 3) + 1);
                } else if (i3 == 1) {
                    g504.b(i / 3);
                    g503.b(i % 3);
                } else if (i3 == 2) {
                    g50.b(i + 1);
                }
            }
        }
        if (g50.a().length == 0 || g502.a().length == 0 || g503.a().length == 0 || g504.a().length == 0 || g50.a()[0] <= 0 || g502.a()[0] + g503.a()[0] < 3 || g502.a()[0] + g503.a()[0] > 90) {
            return null;
        }
        e50 e502 = new e50(g50.a()[0], g502.a()[0], g503.a()[0], g504.a()[0], 0);
        d0(e50Arr, e502);
        return e502;
    }

    public final void d0(e50[] e50Arr, e50 e50) {
        for (int i = 0; i < e50Arr.length; i++) {
            e50 e502 = e50Arr[i];
            if (e502 != null) {
                int i2 = e502.e % 30;
                int i3 = e502.f;
                if (i3 > e50.f) {
                    e50Arr[i] = null;
                } else {
                    if (!this.z) {
                        i3 += 2;
                    }
                    int i4 = i3 % 3;
                    if (i4 != 0) {
                        if (i4 != 1) {
                            if (i4 == 2 && i2 + 1 != e50.b) {
                                e50Arr[i] = null;
                            }
                        } else if (i2 / 3 != e50.c || i2 % 3 != e50.e) {
                            e50Arr[i] = null;
                        }
                    } else if ((i2 * 3) + 1 != e50.d) {
                        e50Arr[i] = null;
                    }
                }
            }
        }
    }

    public final String toString() {
        return "IsLeft: " + this.z + 10 + super.toString();
    }
}
