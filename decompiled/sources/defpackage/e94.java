package defpackage;

/* renamed from: e94  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class e94 {
    public final g35 w;
    public boolean x;
    public int y = -1;
    public final /* synthetic */ bp4 z;

    public e94(bp4 bp4, g35 g35) {
        this.z = bp4;
        this.w = g35;
    }

    public final void b(boolean z2) {
        int i;
        boolean z3;
        boolean z4;
        if (z2 != this.x) {
            this.x = z2;
            if (z2) {
                i = 1;
            } else {
                i = -1;
            }
            bp4 bp4 = this.z;
            int i2 = bp4.c;
            bp4.c = i + i2;
            if (!bp4.d) {
                bp4.d = true;
                while (true) {
                    try {
                        int i3 = bp4.c;
                        if (i2 == i3) {
                            break;
                        }
                        if (i2 != 0 || i3 <= 0) {
                            z3 = false;
                        } else {
                            z3 = true;
                        }
                        if (i2 <= 0 || i3 != 0) {
                            z4 = false;
                        } else {
                            z4 = true;
                        }
                        if (z3) {
                            bp4.e();
                        } else if (z4) {
                            bp4.f();
                        }
                        i2 = i3;
                    } catch (Throwable th) {
                        bp4.d = false;
                        throw th;
                    }
                }
                bp4.d = false;
            }
            if (this.x) {
                bp4.c(this);
            }
        }
    }

    public boolean d(t54 t54) {
        return false;
    }

    public abstract boolean e();

    public void c() {
    }
}
