package defpackage;

/* renamed from: hq7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class hq7 extends gp1 {
    public final String x;

    public hq7(String str) {
        this.x = str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0044  */
    public static /* synthetic */ void B0(int i) {
        String str;
        int i2;
        String format;
        Throwable th;
        if (i == 1 || i == 4) {
            str = "@NotNull method %s.%s must not return null";
        } else {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        }
        if (i == 1 || i == 4) {
            i2 = 2;
        } else {
            i2 = 3;
        }
        Object[] objArr = new Object[i2];
        if (i != 1) {
            if (i == 2) {
                objArr[0] = "delegate";
            } else if (i == 3) {
                objArr[0] = "kotlinTypeRefiner";
            } else if (i != 4) {
                objArr[0] = "newAttributes";
            }
            if (i != 1) {
                objArr[1] = "toString";
            } else if (i != 4) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils$SpecialType";
            } else {
                objArr[1] = "refine";
            }
            if (i != 1) {
                if (i == 2) {
                    objArr[2] = "replaceDelegate";
                } else if (i == 3) {
                    objArr[2] = "refine";
                } else if (i != 4) {
                    objArr[2] = "replaceAttributes";
                }
            }
            format = String.format(str, objArr);
            if (i != 1 || i == 4) {
                th = new IllegalStateException(format);
            } else {
                th = new IllegalArgumentException(format);
            }
            throw th;
        }
        objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils$SpecialType";
        if (i != 1) {
        }
        if (i != 1) {
        }
        format = String.format(str, objArr);
        if (i != 1) {
        }
        th = new IllegalStateException(format);
        throw th;
    }

    public final gp1 A0(fu6 fu6) {
        throw new IllegalStateException(this.x);
    }

    public final vw3 Y(ax3 ax3) {
        if (ax3 != null) {
            return this;
        }
        B0(3);
        throw null;
    }

    public final /* bridge */ /* synthetic */ du7 o0(boolean z) {
        w0(z);
        throw null;
    }

    public final du7 p0(ax3 ax3) {
        if (ax3 != null) {
            return this;
        }
        B0(3);
        throw null;
    }

    public final String toString() {
        return this.x;
    }

    public final /* bridge */ /* synthetic */ du7 v0(ro7 ro7) {
        x0(ro7);
        throw null;
    }

    public final fu6 w0(boolean z) {
        throw new IllegalStateException(this.x);
    }

    public final fu6 x0(ro7 ro7) {
        if (ro7 == null) {
            B0(0);
            throw null;
        }
        throw new IllegalStateException(this.x);
    }

    public final fu6 y0() {
        throw new IllegalStateException(this.x);
    }

    public final fu6 z0(ax3 ax3) {
        if (ax3 != null) {
            return this;
        }
        B0(3);
        throw null;
    }
}
