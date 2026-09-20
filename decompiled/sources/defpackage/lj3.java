package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: lj3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class lj3 extends au6 implements ei3 {
    public static final jt1 b0 = new Object();
    public static final jt1 c0 = new Object();
    public int Z;
    public final boolean a0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public lj3(vj1 vj1, au6 au6, rm rmVar, uq4 uq4, int i, sy6 sy6, boolean z) {
        super(vj1, au6, rmVar, uq4, i, sy6);
        if (vj1 == null) {
            v0(0);
            throw null;
        } else if (rmVar == null) {
            v0(1);
            throw null;
        } else if (uq4 == null) {
            v0(2);
            throw null;
        } else if (i != 0) {
            this.Z = 0;
            this.a0 = z;
        } else {
            v0(3);
            throw null;
        }
    }

    public static lj3 u1(vj1 vj1, u04 u04, uq4 uq4, sa6 sa6, boolean z) {
        if (vj1 == null) {
            v0(5);
            throw null;
        } else if (uq4 != null) {
            return new lj3(vj1, (au6) null, u04, uq4, 1, sa6, z);
        } else {
            v0(7);
            throw null;
        }
    }

    public static /* synthetic */ void v0(int i) {
        String str;
        int i2;
        Throwable th;
        if (i == 13 || i == 18 || i == 21) {
            str = "@NotNull method %s.%s must not return null";
        } else {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        }
        if (i == 13 || i == 18 || i == 21) {
            i2 = 2;
        } else {
            i2 = 3;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 6:
            case 16:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = "name";
                break;
            case 3:
            case h75.g:
                objArr[0] = "kind";
                break;
            case 4:
            case 8:
            case 17:
                objArr[0] = "source";
                break;
            case 9:
                objArr[0] = "contextReceiverParameters";
                break;
            case 10:
                objArr[0] = "typeParameters";
                break;
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 12:
                objArr[0] = "visibility";
                break;
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
            case 18:
            case 21:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
                break;
            case 14:
                objArr[0] = "newOwner";
                break;
            case 19:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 20:
                objArr[0] = "enhancedReturnType";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i == 13) {
            objArr[1] = "initialize";
        } else if (i == 18) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i != 21) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i) {
            case 5:
            case 6:
            case 7:
            case 8:
                objArr[2] = "createJavaMethod";
                break;
            case 9:
            case 10:
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
            case 12:
                objArr[2] = "initialize";
                break;
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
            case 18:
            case 21:
                break;
            case 14:
            case h75.g:
            case 16:
            case 17:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 19:
            case 20:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i == 13 || i == 18 || i == 21) {
            th = new IllegalStateException(format);
        } else {
            th = new IllegalArgumentException(format);
        }
        throw th;
    }

    public final boolean E() {
        return f21.c(this.Z);
    }

    public final zs2 h1(int i, rm rmVar, vj1 vj1, xs2 xs2, uq4 uq4, sy6 sy6) {
        if (vj1 == null) {
            v0(14);
            throw null;
        } else if (i == 0) {
            v0(15);
            throw null;
        } else if (rmVar != null) {
            au6 au6 = (au6) xs2;
            if (uq4 == null) {
                uq4 = getName();
            }
            vj1 vj12 = vj1;
            lj3 lj3 = new lj3(vj12, au6, rmVar, uq4, i, sy6, this.a0);
            int i2 = this.Z;
            boolean z = false;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            throw null;
                        }
                    }
                }
                z = true;
            }
            lj3.v1(z, f21.c(i2));
            return lj3;
        } else {
            v0(16);
            throw null;
        }
    }

    public final ei3 t0(vw3 vw3, ArrayList arrayList, vw3 vw32, yb5 yb5) {
        qz3 qz3;
        ArrayList f = wn6.f(arrayList, S(), this);
        if (vw3 == null) {
            qz3 = null;
        } else {
            qz3 = fd1.B(this, vw3, me6.x);
        }
        ys2 l1 = l1(dq7.b);
        l1.C = f;
        l1.G = vw32;
        l1.E = qz3;
        l1.L = true;
        l1.K = true;
        lj3 lj3 = (lj3) l1.T.i1(l1);
        if (yb5 != null) {
            lj3.m1((jt1) yb5.w, yb5.x);
        }
        if (lj3 != null) {
            return lj3;
        }
        v0(21);
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0057, code lost:
        if (r6 >= r4) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005f, code lost:
        if (r2[r6].c(r1) == null) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0061, code lost:
        r2 = new defpackage.po0(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0067, code lost:
        r6 = r6 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0072, code lost:
        if (((java.lang.String) r3.d.y(r1)) == null) goto L_0x007a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0074, code lost:
        r2 = new defpackage.po0(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x007a, code lost:
        r2 = defpackage.po0.c;
     */
    public final au6 t1(qz3 qz3, qz3 qz32, List list, List list2, List list3, vw3 vw3, fl4 fl4, us1 us1, Map map) {
        po0 po0;
        if (list == null) {
            v0(9);
            throw null;
        } else if (list2 == null) {
            v0(10);
            throw null;
        } else if (list3 == null) {
            v0(11);
            throw null;
        } else if (us1 != null) {
            super.t1(qz3, qz32, list, list2, list3, vw3, fl4, us1, map);
            Iterator it = l75.a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    po0 = po0.b;
                    break;
                }
                yo0 yo0 = (yo0) it.next();
                k26 k26 = yo0.b;
                uq4 uq4 = yo0.a;
                if (uq4 == null || sg3.e(getName(), uq4)) {
                    if (k26 != null) {
                        String b = getName().b();
                        b.getClass();
                        if (!k26.e(b)) {
                            continue;
                        }
                    }
                    Collection collection = yo0.c;
                    if (collection == null || collection.contains(getName())) {
                        no0[] no0Arr = yo0.e;
                        int length = no0Arr.length;
                        int i = 0;
                    }
                }
            }
            this.I = po0.a;
            return this;
        } else {
            v0(12);
            throw null;
        }
    }

    public final void v1(boolean z, boolean z2) {
        int i;
        if (z) {
            if (z2) {
                i = 4;
            } else {
                i = 2;
            }
        } else if (z2) {
            i = 3;
        } else {
            i = 1;
        }
        this.Z = i;
    }
}
