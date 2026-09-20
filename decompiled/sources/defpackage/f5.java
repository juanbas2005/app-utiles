package defpackage;

import android.os.Build;
import android.telephony.TelephonyManager;
import android.view.accessibility.AccessibilityManager;
import androidx.work.impl.WorkDatabase;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* renamed from: f5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class f5 implements sr2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;

    public /* synthetic */ f5(t54 t54, sr2 sr2) {
        this.w = 18;
        this.x = t54;
        this.y = sr2;
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: w33[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v12, resolved type: x25} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: v36} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v9, resolved type: v36} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v18, resolved type: w33[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v30, resolved type: w33} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v23, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v24, resolved type: w33[]} */
    /* JADX WARNING: type inference failed for: r3v11 */
    /* JADX WARNING: type inference failed for: r1v29, types: [java.lang.Object, h06] */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x02a6, code lost:
        r3 = new defpackage.x25(r6, java.lang.Integer.valueOf(r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x02af, code lost:
        r5.c();
        r3 = r3;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    public final Object b() {
        u84 u84;
        List list;
        int i;
        cu2 cu2;
        Object obj;
        cu2 cu22;
        v36 v36;
        long a;
        int i2;
        w33[] w33Arr = 0;
        int i3 = 0;
        switch (this.w) {
            case b85.b:
                w84 w84 = (w84) this.x;
                AccessibilityManager accessibilityManager = (AccessibilityManager) this.y;
                w84.getClass();
                accessibilityManager.removeAccessibilityStateChangeListener(w84);
                v84 v84 = w84.z;
                if (v84 != null) {
                    accessibilityManager.removeTouchExplorationStateChangeListener(v84);
                }
                if (Build.VERSION.SDK_INT >= 33 && (u84 = w84.A) != null) {
                    y4.h(accessibilityManager, v4.g(u84));
                }
                return vs7.a;
            case 1:
                ((rv0) this.x).F.remove((l8) this.y);
                return vs7.a;
            case 2:
                ((h06) this.x).w = ((sr2) this.y).b();
                return vs7.a;
            case 3:
                ((en0) this.x).c(this.y);
                return vs7.a;
            case 4:
                ((ax0) this.x).c = (sr2) this.y;
                return vs7.a;
            case 5:
                b40 b40 = (b40) this.x;
                wy3 wy3 = (wy3) this.y;
                b40.S = b40.N.a(wy3.w.e(), wy3.getLayoutDirection(), wy3);
                return vs7.a;
            case 6:
                o50 o50 = (o50) this.y;
                x21 x21 = ((p50) this.x).a;
                x21.getClass();
                synchronized (x21.c) {
                    try {
                        if (x21.d.remove(o50) && x21.d.isEmpty()) {
                            x21.d();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return vs7.a;
            case 7:
                hf7 hf7 = (hf7) this.x;
                aq4 aq4 = (aq4) this.y;
                if (!lg7.b(hf7.b, ((hf7) aq4.getValue()).b) || !sg3.e(hf7.c, ((hf7) aq4.getValue()).c)) {
                    aq4.setValue(hf7);
                }
                return vs7.a;
            case 8:
                fg7 fg7 = (fg7) this.x;
                vl vlVar = (vl) this.y;
                if (fg7 == null) {
                    return vlVar;
                }
                yx6 yx6 = fg7.c;
                boolean isEmpty = yx6.isEmpty();
                vl vlVar2 = fg7.b;
                if (!isEmpty) {
                    oc7 oc7 = new oc7(vlVar2);
                    int size = yx6.size();
                    while (i3 < size) {
                        ((vr2) yx6.get(i3)).y(oc7);
                        i3++;
                    }
                    vlVar2 = oc7.b;
                }
                fg7.b = vlVar2;
                if (vlVar2 == null) {
                    return vlVar;
                }
                return vlVar2;
            case 9:
                ar7.H((o81) this.x, (e81) null, (r81) null, new g70((ek7) this.y, (f61) null, 0), 3);
                return Boolean.TRUE;
            case 10:
                nd8 nd8 = (nd8) this.x;
                WorkDatabase workDatabase = nd8.c;
                workDatabase.getClass();
                workDatabase.o(new hx4(13, new ga(6, (Object) nd8, (Object) (UUID) this.y)));
                mg6.b(nd8.b, nd8.c, nd8.e);
                return vs7.a;
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                nd8 nd82 = (nd8) this.y;
                WorkDatabase workDatabase2 = nd82.c;
                workDatabase2.getClass();
                workDatabase2.o(new hx4(13, new ti(workDatabase2, (String) this.x, nd82, 1)));
                mg6.b(nd82.b, workDatabase2, nd82.e);
                return vs7.a;
            case 12:
                ((TelephonyManager) this.x).unregisterTelephonyCallback(se.d((om0) this.y));
                return vs7.a;
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                Object obj2 = this.y;
                yt2 yt2 = ((ny0) this.x).w;
                gv6 gv6 = yt2.c;
                fv6 n = gv6.n();
                int i4 = 0;
                while (true) {
                    if (i4 >= gv6.x) {
                        break;
                    } else {
                        if (n.l(i4)) {
                            Object n2 = n.n(i4);
                            if (n2 != obj2) {
                                if (n2 instanceof cu2) {
                                    cu22 = (cu2) n2;
                                } else {
                                    cu22 = null;
                                }
                                if (cu22 != null) {
                                    v36 = cu22.a;
                                } else {
                                    v36 = null;
                                }
                                if (v36 == obj2) {
                                }
                            }
                        }
                        try {
                            int[] iArr = n.b;
                            int b = iv6.b(iArr, i4);
                            int i5 = i4 + 1;
                            if (i5 < n.c) {
                                i = iArr[(i5 * 5) + 4];
                            } else {
                                i = n.e;
                            }
                            int i6 = i - b;
                            int i7 = 0;
                            while (i7 < i6) {
                                Object h = n.h(i4, i7);
                                if (h == obj2) {
                                    break;
                                } else {
                                    if (h instanceof cu2) {
                                        cu2 = (cu2) h;
                                    } else {
                                        cu2 = null;
                                    }
                                    if (cu2 != null) {
                                        obj = cu2.a;
                                    } else {
                                        obj = null;
                                    }
                                    if (obj == obj2) {
                                        break;
                                    } else {
                                        i7++;
                                    }
                                }
                            }
                            i4 = i5;
                        } catch (Throwable th2) {
                            Throwable th3 = th2;
                            n.c();
                            throw th3;
                        }
                    }
                }
                x25 x25 = new x25(i4, (Integer) null);
                n.c();
                x25 x252 = x25;
                if (x252 != null) {
                    int i8 = x252.a;
                    Integer num = x252.b;
                    fv6 n3 = gv6.n();
                    try {
                        ArrayList Z = gr8.Z(n3, i8, num);
                        n3.c();
                        list = dt0.M0(Z, yt2.J());
                    } catch (Throwable th4) {
                        Throwable th5 = th4;
                        n3.c();
                        throw th5;
                    }
                } else {
                    list = a42.w;
                }
                return new qx0(list, yt2.C);
            case 14:
                ((vr2) this.x).y(((h06) this.y).w);
                return vs7.a;
            case h75.g /*15*/:
                return new oe3(gr8.V(((zc7) this.x).g((dy3) ((sr2) this.y).b())));
            case 16:
                ((hd7) this.x).d.y((md7) this.y);
                return vs7.a;
            case 17:
                ((vu1) this.x).e((zs4) this.y, false);
                return vs7.a;
            case 18:
                k54 k54 = k54.A;
                sr2 sr2 = (sr2) this.y;
                if (((t54) this.x).k().G0().compareTo(k54) >= 0) {
                    sr2.b();
                }
                return vs7.a;
            case 19:
                a62 a62 = (a62) this.x;
                String str = (String) this.y;
                t52 t52 = (t52) a62.c;
                if (t52 == null) {
                    Enum[] enumArr = (Enum[]) a62.b;
                    t52 = new t52(str, enumArr.length);
                    for (Enum name : enumArr) {
                        t52.k(name.name(), false);
                    }
                }
                return t52;
            case 20:
                ((h06) this.x).w = h49.w((xk2) this.y, wg5.a);
                return vs7.a;
            case 21:
                ((vr2) this.x).y(((en2) this.y).a);
                return vs7.a;
            case 22:
                hn4 hn4 = (hn4) this.y;
                ((yt2) this.x).H(hn4.a, hn4.g, hn4.b, true);
                return vs7.a;
            case 23:
                hj hjVar = (hj) this.x;
                String str2 = ((uq5) this.y).b;
                if (str2 == null) {
                    str2 = "https://www.etecsa.cu/";
                }
                hjVar.a(str2);
                return vs7.a;
            case 24:
                ((vr2) this.x).y(((oh5) this.y).e);
                return vs7.a;
            case 25:
                ((aq4) this.y).setValue(Boolean.FALSE);
                ((ta2) this.x).c.b();
                return vs7.a;
            case 26:
                p33 p33 = (p33) this.x;
                w33 w33 = (w33) this.y;
                try {
                    p33.w.b(w33);
                } catch (IOException e) {
                    ej5 ej5 = ej5.a;
                    ej5.a.i("Http2Connection.Listener failure for " + p33.y, 4, e);
                    try {
                        w33.c(k62.z, e);
                    } catch (IOException unused) {
                    }
                }
                return vs7.a;
            case 27:
                ao6 ao6 = (ao6) this.y;
                ? obj3 = new Object();
                p33 p332 = (p33) ((p3) this.x).y;
                synchronized (p332.S) {
                    try {
                        synchronized (p332) {
                            ao6 ao62 = p332.N;
                            ao6 ao63 = new ao6();
                            ao62.getClass();
                            for (int i9 = 0; i9 < 10; i9++) {
                                if (((1 << i9) & ao62.a) != 0) {
                                    ao63.b(i9, ao62.b[i9]);
                                }
                            }
                            for (int i10 = 0; i10 < 10; i10++) {
                                if (((1 << i10) & ao6.a) != 0) {
                                    ao63.b(i10, ao6.b[i10]);
                                }
                            }
                            obj3.w = ao63;
                            a = ((long) ao63.a()) - ((long) ao62.a());
                            i2 = (a > 0 ? 1 : (a == 0 ? 0 : -1));
                            if (i2 != 0) {
                                if (!p332.x.isEmpty()) {
                                    w33Arr = (w33[]) p332.x.values().toArray(new w33[0]);
                                }
                            }
                            ao6 ao64 = (ao6) obj3.w;
                            ao64.getClass();
                            p332.N = ao64;
                            ac7.c(p332.F, p332.y + " onSettings", 0, new f5(28, p332, obj3), 6);
                        }
                        try {
                            p332.S.a((ao6) obj3.w);
                        } catch (IOException e2) {
                            k62 k62 = k62.z;
                            p332.a(k62, k62, e2);
                        }
                    } catch (Throwable th6) {
                        throw th6;
                    }
                }
                if (w33Arr != null) {
                    int length = w33Arr.length;
                    while (i3 < length) {
                        w33 w332 = w33Arr[i3];
                        synchronized (w332) {
                            try {
                                w332.A += a;
                                if (i2 > 0) {
                                    w332.notifyAll();
                                }
                            } catch (Throwable th7) {
                                throw th7;
                            }
                        }
                        i3++;
                    }
                }
                return vs7.a;
            case 28:
                p33 p333 = (p33) this.x;
                p333.w.a(p333, (ao6) ((h06) this.y).w);
                return vs7.a;
            default:
                ((sk3) this.x).c((lk7) this.y);
                return vs7.a;
        }
    }

    public /* synthetic */ f5(int i, Object obj, Object obj2) {
        this.w = i;
        this.x = obj;
        this.y = obj2;
    }
}
