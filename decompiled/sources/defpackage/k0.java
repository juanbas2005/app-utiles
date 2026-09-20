package defpackage;

/* renamed from: k0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class k0 extends n3 {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k0(kb4 kb4) {
        super(kb4);
        if (kb4 != null) {
        } else {
            i(0);
            throw null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0045  */
    public static /* synthetic */ void i(int i) {
        String str;
        int i2;
        String format;
        Throwable th;
        if (i == 1 || i == 3 || i == 4) {
            str = "@NotNull method %s.%s must not return null";
        } else {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        }
        if (i == 1 || i == 3 || i == 4) {
            i2 = 2;
        } else {
            i2 = 3;
        }
        Object[] objArr = new Object[i2];
        if (i != 1) {
            if (i == 2) {
                objArr[0] = "classifier";
            } else if (!(i == 3 || i == 4)) {
                objArr[0] = "storageManager";
            }
            if (i != 1) {
                objArr[1] = "getBuiltIns";
            } else if (i == 3 || i == 4) {
                objArr[1] = "getAdditionalNeighboursInSupertypeGraph";
            } else {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor";
            }
            if (i != 1) {
                if (i == 2) {
                    objArr[2] = "isSameClassifier";
                } else if (!(i == 3 || i == 4)) {
                    objArr[2] = "<init>";
                }
            }
            format = String.format(str, objArr);
            if (i != 1 || i == 3 || i == 4) {
                th = new IllegalStateException(format);
            } else {
                th = new IllegalArgumentException(format);
            }
            throw th;
        }
        objArr[0] = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor";
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

    public final vw3 b() {
        ql4 j = u();
        if (j != null) {
            uq4 uq4 = fv3.e;
            if (fv3.b(j, m27.a) || fv3.b(j, m27.b)) {
                return null;
            }
            return g().e();
        }
        fv3.a(107);
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004d, code lost:
        if (defpackage.sg3.e(((defpackage.y95) ((defpackage.x95) r4)).A, ((defpackage.y95) ((defpackage.x95) r5)).A) != false) goto L_0x004f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0070 A[RETURN] */
    public final boolean f(vq0 vq0) {
        boolean z;
        if (vq0 instanceof ql4) {
            ql4 j = u();
            j.getClass();
            if (sg3.e(j.getName(), vq0.getName())) {
                vj1 r = j.r();
                vj1 r2 = vq0.r();
                while (true) {
                    if (r != null && r2 != null) {
                        if (!(r instanceof sl4)) {
                            if (!(r2 instanceof sl4)) {
                                if (!(r instanceof x95)) {
                                    if ((r2 instanceof x95) || !sg3.e(r.getName(), r2.getName())) {
                                        break;
                                    }
                                    r = r.r();
                                    r2 = r2.r();
                                } else if (r2 instanceof x95) {
                                }
                            } else {
                                break;
                            }
                        } else {
                            z = r2 instanceof sl4;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                z = true;
                if (!z) {
                    return true;
                }
            }
            z = false;
            if (!z) {
                return false;
            }
        }
        return false;
    }

    public final fv3 g() {
        fv3 e = ts1.e(u());
        if (e != null) {
            return e;
        }
        i(1);
        throw null;
    }

    /* renamed from: j */
    public abstract ql4 u();
}
