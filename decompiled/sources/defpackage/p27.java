package defpackage;

/* renamed from: p27  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class p27 extends xp7 {
    public final /* synthetic */ int a = 0;
    public final Object b;
    public final Object c;

    public p27(qp7 qp7) {
        qp7.getClass();
        this.b = qp7;
        this.c = rg3.y(i44.w, new xo3(12, this));
    }

    public static /* synthetic */ void e(int i) {
        String str;
        int i2;
        Throwable th;
        if (i == 4 || i == 5) {
            str = "@NotNull method %s.%s must not return null";
        } else {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        }
        if (i == 4 || i == 5) {
            i2 = 2;
        } else {
            i2 = 3;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 2:
            case 3:
                objArr[0] = "type";
                break;
            case 4:
            case 5:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
                break;
            case 6:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "projection";
                break;
        }
        if (i == 4) {
            objArr[1] = "getProjectionKind";
        } else if (i != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
        } else {
            objArr[1] = "getType";
        }
        if (i == 3) {
            objArr[2] = "replaceType";
        } else if (!(i == 4 || i == 5)) {
            if (i != 6) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "refine";
            }
        }
        String format = String.format(str, objArr);
        if (i == 4 || i == 5) {
            th = new IllegalStateException(format);
        } else {
            th = new IllegalArgumentException(format);
        }
        throw th;
    }

    public final k28 a() {
        switch (this.a) {
            case b85.b:
                return k28.A;
            default:
                k28 k28 = (k28) this.b;
                if (k28 != null) {
                    return k28;
                }
                e(4);
                throw null;
        }
    }

    public final vw3 b() {
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case b85.b:
                return (vw3) ((nz3) obj).getValue();
            default:
                vw3 vw3 = (vw3) obj;
                if (vw3 != null) {
                    return vw3;
                }
                e(5);
                throw null;
        }
    }

    public final boolean c() {
        switch (this.a) {
            case b85.b:
                return true;
            default:
                return false;
        }
    }

    public final xp7 d(ax3 ax3) {
        switch (this.a) {
            case b85.b:
                ax3.getClass();
                return this;
            default:
                if (ax3 != null) {
                    vw3 vw3 = (vw3) this.c;
                    ax3.getClass();
                    vw3.getClass();
                    return new p27(vw3, (k28) this.b);
                }
                e(6);
                throw null;
        }
    }

    public p27(vw3 vw3, k28 k28) {
        if (k28 == null) {
            e(0);
            throw null;
        } else if (vw3 != null) {
            this.b = k28;
            this.c = vw3;
        } else {
            e(1);
            throw null;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public p27(vw3 vw3) {
        this(vw3, k28.y);
        if (vw3 != null) {
        } else {
            e(2);
            throw null;
        }
    }
}
