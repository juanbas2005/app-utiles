package defpackage;

import android.app.RemoteAction;
import android.view.textclassifier.TextClassification;
import cu.lestebang.utiletecsa.R;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ph6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class ph6 implements gs2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ Object x;

    public /* synthetic */ ph6(int i, int i2, Object obj) {
        this.w = i2;
        this.x = obj;
    }

    public final Object H(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        Object obj3;
        String str;
        Object obj4 = obj;
        int i = this.w;
        xk6 xk6 = null;
        boolean z3 = false;
        Object obj5 = this.x;
        switch (i) {
            case b85.b:
                th6 th6 = (th6) obj5;
                ar7.H(th6.J0(), (e81) null, (r81) null, new sh6(th6, ((Float) obj4).floatValue(), ((Float) obj2).floatValue(), (f61) null), 3);
                return Boolean.TRUE;
            case 1:
                ((Integer) obj2).getClass();
                ((xi6) obj5).a(b85.v(7), (yt2) obj4);
                return vs7.a;
            case 2:
                ((qk5) obj4).a();
                ((g06) obj5).w = ((l35) obj2).a;
                return vs7.a;
            case 3:
                jy7 jy7 = (jy7) obj5;
                yt2 yt2 = (yt2) obj4;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z3 = true;
                }
                if (yt2.V(intValue & 1, z3)) {
                    yf7.b(bb0.s0(jy7, yt2), (ml4) null, 0, 0, (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt2, 0, 0, 262142);
                } else {
                    yt2.Y();
                }
                return vs7.a;
            case 4:
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                for (q35 q35 : ((vt6) obj5).b) {
                    boolean e = sg3.e(q35.a.w.get(obj4), Boolean.TRUE);
                    zq5 zq5 = q35.a;
                    if (booleanValue != e) {
                        z = true;
                    } else {
                        z = false;
                    }
                    zq5.v(obj4, Boolean.valueOf(z));
                }
                return vs7.a;
            case 5:
                mu6 mu6 = (mu6) obj5;
                yt2 yt22 = (yt2) obj4;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (yt22.V(intValue2 & 1, z2)) {
                    mu6.b.a(0, yt22);
                } else {
                    yt22.Y();
                }
                return vs7.a;
            case 6:
                qu6 qu6 = (qu6) obj5;
                Set set = (Set) obj4;
                ix6 ix6 = (ix6) obj2;
                synchronized (qu6.w) {
                    try {
                        up4 up4 = qu6.z;
                        if (up4 != null) {
                            Object[] objArr = up4.b;
                            long[] jArr = up4.a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i2 = 0;
                                while (true) {
                                    long j = jArr[i2];
                                    if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                                        int i3 = 8 - ((~(i2 - length)) >>> 31);
                                        int i4 = 0;
                                        while (true) {
                                            if (i4 < i3) {
                                                if ((255 & j) >= 128 || !set.contains(objArr[(i2 << 3) + i4])) {
                                                    j >>= 8;
                                                    i4++;
                                                } else {
                                                    xk6 = qu6.B;
                                                }
                                            } else if (i3 != 8) {
                                            }
                                        }
                                    }
                                    if (i2 != length) {
                                        i2++;
                                    }
                                }
                            }
                        } else if (dt0.q0(set, qu6.x)) {
                            xk6 = qu6.B;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (xk6 != null) {
                    xk6.c(vs7.a);
                }
                return vs7.a;
            case 7:
                ((Integer) obj2).getClass();
                dw6.d((nu0) obj5, (yt2) obj4, b85.v(1));
                return vs7.a;
            case 8:
                xv6 xv6 = (xv6) obj5;
                yt2 yt23 = (yt2) obj4;
                int intValue3 = ((Integer) obj2).intValue();
                if ((intValue3 & 3) != 2) {
                    z3 = true;
                }
                if (yt23.V(intValue3 & 1, z3)) {
                    yf7.b(l55.v(R.string.dialog_sms_cost_warning, new Object[]{xv6.a}, yt23), (ml4) null, 0, 0, (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt23, 0, 0, 262142);
                } else {
                    yt23.Y();
                }
                return vs7.a;
            case 9:
                cy6 cy6 = (cy6) obj5;
                Set set2 = (Set) obj4;
                ix6 ix62 = (ix6) obj2;
                AtomicReference atomicReference = (AtomicReference) cy6.d;
                while (true) {
                    Object obj6 = atomicReference.get();
                    if (obj6 == null) {
                        obj3 = set2;
                    } else if (obj6 instanceof Set) {
                        obj3 = sg3.E(obj6, set2);
                    } else if (obj6 instanceof List) {
                        obj3 = dt0.M0((Collection) obj6, sg3.D(set2));
                    } else {
                        ey0.b("Unexpected notification");
                        ta1.e();
                        return null;
                    }
                    while (true) {
                        if (atomicReference.compareAndSet(obj6, obj3)) {
                            if (cy6.c()) {
                                ((vr2) cy6.c).y(new hx4(25, cy6));
                            }
                            return vs7.a;
                        } else if (atomicReference.get() != obj6) {
                        }
                    }
                }
            case 10:
                q07 q07 = (q07) obj5;
                yt2 yt24 = (yt2) obj4;
                int intValue4 = ((Integer) obj2).intValue();
                if ((intValue4 & 3) != 2) {
                    z3 = true;
                }
                if (yt24.V(intValue4 & 1, z3)) {
                    yf7.b(l55.u(q17.l(q07), yt24), (ml4) null, 0, ya5.k(12), (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt24, 24576, 0, 262126);
                } else {
                    yt24.Y();
                }
                return vs7.a;
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                o11 o11 = (o11) obj5;
                yt2 yt25 = (yt2) obj4;
                int intValue5 = ((Integer) obj2).intValue();
                if ((intValue5 & 3) != 2) {
                    z3 = true;
                }
                if (yt25.V(intValue5 & 1, z3)) {
                    yf7.b(l55.v(R.string.spot_delete_message, new Object[]{o11.e}, yt25), (ml4) null, q17.i(), ya5.k(14), (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt25, 24576, 0, 262122);
                } else {
                    yt25.Y();
                }
                return vs7.a;
            case 12:
                String str2 = (String) obj4;
                List list = (List) obj2;
                str2.getClass();
                list.getClass();
                ((in8) obj5).L(str2, list);
                return vs7.a;
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                CharSequence charSequence = (CharSequence) obj4;
                int intValue6 = ((Integer) obj2).intValue();
                charSequence.getClass();
                int H0 = d57.H0(charSequence, (char[]) obj5, intValue6, false);
                if (H0 < 0) {
                    return null;
                }
                return new yb5(Integer.valueOf(H0), 1);
            case 14:
                yt2 yt26 = (yt2) obj4;
                ((Integer) obj2).getClass();
                yt26.e0(950061013);
                String valueOf = String.valueOf(((TextClassification) obj5).getLabel());
                yt26.r(false);
                return valueOf;
            case h75.g:
                yt2 yt27 = (yt2) obj4;
                ((Integer) obj2).getClass();
                yt27.e0(-1376593684);
                String obj7 = ((RemoteAction) obj5).getTitle().toString();
                yt27.r(false);
                return obj7;
            case 16:
                ((Integer) obj2).getClass();
                ((fg7) obj5).a(b85.v(1), (yt2) obj4);
                return vs7.a;
            case 17:
                ru4 ru4 = (ru4) obj5;
                yt2 yt28 = (yt2) obj4;
                int intValue7 = ((Integer) obj2).intValue();
                if ((intValue7 & 3) != 2) {
                    z3 = true;
                }
                if (yt28.V(intValue7 & 1, z3)) {
                    hj8.e(ru4, (ml4) null, false, (a83) null, (pq6) null, gl0.l, yt28, 1572864, 62);
                } else {
                    yt28.Y();
                }
                return vs7.a;
            case 18:
                String str3 = (String) obj4;
                List list2 = (List) obj2;
                str3.getClass();
                list2.getClass();
                ((yr7) obj5).i.L(str3, list2);
                return vs7.a;
            case 19:
                dn8 dn8 = (dn8) obj5;
                String str4 = (String) obj4;
                List<String> list3 = (List) obj2;
                str4.getClass();
                list3.getClass();
                if (!"Content-Length".equals(str4) && !"Content-Type".equals(str4)) {
                    if (n18.a.contains(str4)) {
                        for (String H : list3) {
                            dn8.H(str4, H);
                        }
                    } else {
                        if ("Cookie".equals(str4)) {
                            str = "; ";
                        } else {
                            str = ",";
                        }
                        dn8.H(str4, dt0.E0(list3, str, (String) null, (String) null, (vr2) null, 62));
                    }
                }
                return vs7.a;
            case 20:
                return new oe3(((long) ((g80) obj5).a(0, (int) (((we3) obj4).a >> 32), (ey3) obj2)) << 32);
            case 21:
                ey3 ey3 = (ey3) obj2;
                return new oe3(((long) ((h80) obj5).a(0, (int) (((we3) obj4).a & 4294967295L))) & 4294967295L);
            default:
                return new oe3(((jb) obj5).a(0, ((we3) obj4).a, (ey3) obj2));
        }
    }

    public /* synthetic */ ph6(int i, Object obj) {
        this.w = i;
        this.x = obj;
    }
}
