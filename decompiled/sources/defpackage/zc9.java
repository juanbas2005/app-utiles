package defpackage;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: zc9  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class zc9 implements ww3 {
    public static final zc9 A = new zc9(true, (Object) null, (Object) null, 0);
    public final /* synthetic */ int w;
    public boolean x;
    public Object y;
    public Object z;

    public zc9(ku4 ku4, Map map, int i) {
        boolean z2;
        this.w = 3;
        map = (i & 2) != 0 ? new LinkedHashMap() : map;
        if ((i & 4) != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        ku4.getClass();
        map.getClass();
        this.y = ku4;
        this.z = map;
        this.x = z2;
    }

    public static zc9 i(String str) {
        return new zc9(false, str, (Object) null, 0);
    }

    public static zc9 j(String str, Exception exc) {
        return new zc9(false, str, exc, 0);
    }

    public void a(String str, xd2 xd2, Object obj) {
        String str2;
        Map map = (Map) this.z;
        Collection collection = (List) sf4.b0(map).get(str);
        if (collection == null) {
            collection = a42.w;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(xd2.w);
        sb.append('.');
        boolean z2 = this.x;
        List list = wd2.a;
        switch (xd2.ordinal()) {
            case b85.b:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 20:
            case 21:
            case 22:
            case 23:
                if (!z2) {
                    str2 = String.valueOf(obj);
                    break;
                } else {
                    str2 = wd2.a(obj);
                    break;
                }
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER:
                if (!(obj instanceof List)) {
                    str2 = wd2.a(obj);
                    break;
                } else {
                    str2 = dt0.E0((List) obj, ",", "(", ")", new vd2(0), 24);
                    break;
                }
            case 12:
            case ry4.PERF_SESSIONS_FIELD_NUMBER:
            case 19:
                if (!(obj instanceof List)) {
                    if (!(obj instanceof yb5)) {
                        if (!z2) {
                            str2 = String.valueOf(obj);
                            break;
                        } else {
                            str2 = wd2.a(obj);
                            break;
                        }
                    } else {
                        yb5 yb5 = (yb5) obj;
                        str2 = "[" + yb5.w + ',' + yb5.x + ']';
                        break;
                    }
                } else {
                    str2 = dt0.E0((List) obj, ",", "{", "}", (vr2) null, 56);
                    break;
                }
            case 14:
            case h75.g:
            case 16:
            case 17:
            case 18:
                if (!(obj instanceof yb5)) {
                    if (!(obj instanceof List)) {
                        str2 = wd2.a(obj);
                        break;
                    } else {
                        List list2 = (List) obj;
                        str2 = "(" + list2.get(0) + ',' + list2.get(1) + ')';
                        break;
                    }
                } else {
                    yb5 yb52 = (yb5) obj;
                    str2 = "(" + yb52.w + ',' + yb52.x + ')';
                    break;
                }
            default:
                h.c();
                return;
        }
        sb.append(str2);
        map.put(str, dt0.M0(collection, sg3.D(sb.toString())));
    }

    public fc1 b() {
        tt2 tt2 = (tt2) this.z;
        int i = tt2.b;
        int i2 = tt2.c;
        if (i < i2) {
            return fc1.x;
        }
        if (i > i2) {
            return fc1.w;
        }
        return fc1.y;
    }

    public boolean c(wo7 wo7, wo7 wo72) {
        boolean z2 = this.x;
        pi0 pi0 = (pi0) this.y;
        pi0 pi02 = (pi0) this.z;
        wo7.getClass();
        wo72.getClass();
        if (wo7.equals(wo72)) {
            return true;
        }
        vq0 u = wo7.u();
        vq0 u2 = wo72.u();
        if (!(u instanceof qp7) || !(u2 instanceof qp7)) {
            return false;
        }
        return pe2.C.p((qp7) u, (qp7) u2, z2, new qq1(0, (Object) pi0, (Object) pi02));
    }

    public void d() {
        if (this.x) {
            ze7.b((ze7) this.z, (lg7) this.y);
        }
    }

    public long e(hf7 hf7, long j, boolean z2, lj6 lj6) {
        ey2 ey2;
        ze7 ze7 = (ze7) this.z;
        long c = ze7.c(ze7, hf7, j, z2, false, lj6, false, (ny2) null);
        if (!lg7.a(c, (lg7) this.y)) {
            this.x = false;
        }
        if (lg7.c(c)) {
            ey2 = ey2.y;
        } else {
            ey2 = ey2.x;
        }
        ze7.q(ey2);
        return c;
    }

    public String f() {
        return (String) this.y;
    }

    public void g(k99 k99) {
        synchronized (this.y) {
            try {
                if (((ArrayDeque) this.z) == null) {
                    this.z = new ArrayDeque();
                }
                ((ArrayDeque) this.z).add(k99);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0012, code lost:
        r1 = r2.y;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0014, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r0 = (defpackage.k99) ((java.util.ArrayDeque) r2.z).poll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001f, code lost:
        if (r0 != null) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0021, code lost:
        r2.x = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0024, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0025, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0026, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0028, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0029, code lost:
        r0.a(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x002e, code lost:
        throw r2;
     */
    public void h(yb9 yb9) {
        synchronized (this.y) {
            if (((ArrayDeque) this.z) != null) {
                if (!this.x) {
                    this.x = true;
                }
            }
        }
    }

    public String toString() {
        switch (this.w) {
            case 2:
                return "JavaTypeEnhancementState(jsr305=" + ((ln3) this.y) + ')';
            case 4:
                boolean z2 = this.x;
                fc1 b = b();
                return "SingleSelectionLayout(isStartHandle=" + z2 + ", crossed=" + b + ", info=\n\t" + ((tt2) this.z) + ")";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ zc9(boolean z2, Object obj, Object obj2, int i) {
        this.w = i;
        this.x = z2;
        this.y = obj;
        this.z = obj2;
    }

    public zc9(ln3 ln3, b0 b0Var) {
        this.w = 2;
        this.y = ln3;
        this.z = b0Var;
        this.x = ln3.d || b0Var.y(mj3.a) == x46.IGNORE;
    }

    public zc9() {
        this.w = 6;
        this.y = new Object();
    }

    public zc9(ze7 ze7) {
        this.w = 5;
        this.z = ze7;
        this.x = true;
    }
}
