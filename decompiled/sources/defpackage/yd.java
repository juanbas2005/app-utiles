package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.view.View;
import android.view.contentcapture.ContentCaptureSession;
import cu.lestebang.utiletecsa.MainActivity;
import cu.lestebang.utiletecsa.feature.home.navigation.Pamarillas;
import cu.lestebang.utiletecsa.feature.home.navigation.Vpn;
import cu.lestebang.utiletecsa.feature.nauta.service.NautaOverlayService;
import cu.lestebang.utiletecsa.feature.settings.service.CallAlertActivity;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: yd  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class yd extends ct2 implements sr2 {
    public final /* synthetic */ int D;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yd(int i, Object obj, Class cls, String str, String str2, int i2, int i3, int i4) {
        super(i, obj, cls, str, str2, i2, i3);
        this.D = i4;
    }

    public final Object b() {
        ContentCaptureSession a;
        Object value;
        String str;
        o00 o00;
        char c;
        char c2;
        Object value2;
        is7 is7;
        mo2 mo2;
        int i = this.D;
        vs7 vs7 = vs7.a;
        Object obj = this.x;
        switch (i) {
            case b85.b:
                View view = (View) obj;
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 30) {
                    x4.h(view);
                }
                if (i2 < 29 || (a = dn.a(view)) == null) {
                    return null;
                }
                return new jz0(3, a, view);
            case 1:
                ((CallAlertActivity) obj).finish();
                return vs7;
            case 2:
                ((fi0) obj).getClass();
                fi0.b.post(new ka(2));
                return vs7;
            case 3:
                e41 e41 = (e41) obj;
                String str2 = e41.f;
                Context context = e41.b;
                boolean A = sg3.A(context, "android.permission.CALL_PHONE");
                rg5 rg5 = e41.c;
                if (A) {
                    int i3 = e41.j;
                    rg5.getClass();
                    rg5.a(context, str2, i3);
                } else {
                    rg5.getClass();
                    rg5.d(context, str2);
                }
                return vs7;
            case 4:
                e41 e412 = (e41) obj;
                e412.getClass();
                ar7.H(u58.a(e412), (e81) null, (r81) null, new n0(e412, (f61) null, 22), 3);
                return vs7;
            case 5:
                e41 e413 = (e41) obj;
                rg5 rg52 = e413.c;
                Context context2 = e413.b;
                String str3 = e413.f;
                rg52.getClass();
                rg5.c(context2, str3, "");
                return vs7;
            case 6:
                return ((zc7) obj).Q();
            case 7:
                d37 d37 = ((ku1) obj).f;
                do {
                    value = d37.getValue();
                    str = (String) value;
                    if (str.length() > 0) {
                        int length = str.length() - 1;
                        if (length < 0) {
                            length = 0;
                        }
                        str = d57.i1(length, str);
                    }
                } while (!d37.i(value, str));
                return vs7;
            case 8:
                ku1 ku1 = (ku1) obj;
                Context context3 = ku1.c;
                String str4 = ku1.d + ku1.f.getValue();
                if (!d57.I0(str4)) {
                    boolean A2 = sg3.A(context3, "android.permission.CALL_PHONE");
                    rg5 rg53 = ku1.b;
                    if (A2) {
                        int i4 = ku1.h;
                        rg53.getClass();
                        rg5.b(context3, str4, i4);
                    } else {
                        rg53.getClass();
                        rg5.e(context3, str4);
                    }
                }
                return vs7;
            case 9:
                gk2 gk2 = (gk2) obj;
                up4 up4 = gk2.c;
                up4 up42 = gk2.d;
                lk2 lk2 = gk2.a;
                vk2 g = lk2.g();
                sk2 sk2 = sk2.y;
                char c3 = 7;
                if (g == null) {
                    Object[] objArr = up42.b;
                    long[] jArr = up42.a;
                    int length2 = jArr.length - 2;
                    if (length2 >= 0) {
                        int i5 = 0;
                        while (true) {
                            long j = jArr[i5];
                            if ((((~j) << c3) & j & -9187201950435737472L) != -9187201950435737472L) {
                                int i6 = 8 - ((~(i5 - length2)) >>> 31);
                                int i7 = 0;
                                while (i7 < i6) {
                                    if ((j & 255) < 128) {
                                        c2 = c3;
                                        ((ck2) objArr[(i5 << 3) + i7]).D(sk2);
                                    } else {
                                        c2 = c3;
                                    }
                                    j >>= 8;
                                    i7++;
                                    c3 = c2;
                                }
                                c = c3;
                                if (i6 != 8) {
                                }
                            } else {
                                c = c3;
                            }
                            if (i5 != length2) {
                                i5++;
                                c3 = c;
                            }
                        }
                    }
                } else if (g.J) {
                    if (up4.c(g)) {
                        g.b1();
                    }
                    sk2 a1 = g.a1();
                    if (!g.w.J) {
                        yb3.b("visitAncestors called on an unattached node");
                    }
                    ll4 ll4 = g.w;
                    uy3 O0 = rc9.O0(g);
                    int i8 = 0;
                    while (O0 != null) {
                        if ((((ll4) O0.a0.g).z & 5120) != 0) {
                            while (ll4 != null) {
                                int i9 = ll4.y;
                                if ((i9 & 5120) != 0) {
                                    if ((i9 & 1024) != 0) {
                                        i8++;
                                    }
                                    if ((ll4 instanceof ck2) && up42.c(ll4)) {
                                        if (i8 <= 1) {
                                            ((ck2) ll4).D(a1);
                                        } else {
                                            ((ck2) ll4).D(sk2.x);
                                        }
                                        up42.l(ll4);
                                    }
                                }
                                ll4 = ll4.A;
                            }
                        }
                        O0 = O0.v();
                        if (O0 == null || (o00 = O0.a0) == null) {
                            ll4 = null;
                        } else {
                            ll4 = (ib7) o00.f;
                        }
                    }
                    Object[] objArr2 = up42.b;
                    long[] jArr2 = up42.a;
                    int length3 = jArr2.length - 2;
                    if (length3 >= 0) {
                        int i10 = 0;
                        while (true) {
                            long j2 = jArr2[i10];
                            if ((((~j2) << 7) & j2 & -9187201950435737472L) != -9187201950435737472L) {
                                int i11 = 8 - ((~(i10 - length3)) >>> 31);
                                for (int i12 = 0; i12 < i11; i12++) {
                                    if ((j2 & 255) < 128) {
                                        ((ck2) objArr2[(i10 << 3) + i12]).D(sk2);
                                    }
                                    j2 >>= 8;
                                }
                                if (i11 != 8) {
                                }
                            }
                            if (i10 != length3) {
                                i10++;
                            }
                        }
                    }
                }
                if (lk2.g() == null || lk2.c.a1() == sk2) {
                    lk2.d();
                }
                up4.b();
                up42.b();
                gk2.e = false;
                return vs7;
            case 10:
                return Boolean.valueOf(((xk2) obj).R.c1(7));
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER:
                d37 d372 = ((np2) obj).e;
                do {
                    value2 = d372.getValue();
                    is7 = (is7) value2;
                    mo2 = (mo2) is7.a;
                    mo2.getClass();
                } while (!d372.i(value2, is7.a(is7, mo2.a(mo2, (ArrayList) null, (List) null, (String) null, (String) null, false, false, (hv2) null, (String) null, a42.w, false, (Boolean) null, (Map) null, false, false, 15999), false, (hv2) null, 6)));
                return vs7;
            case 12:
                np2 np2 = (np2) obj;
                np2.getClass();
                ar7.H(u58.a(np2), (e81) null, (r81) null, new hp2(np2, (f61) null, 3), 3);
                return vs7;
            case ry4.PERF_SESSIONS_FIELD_NUMBER:
                np2 np22 = (np2) obj;
                d37 d373 = np22.e;
                is7 is72 = (is7) d373.getValue();
                boolean z = is72.b;
                Object obj2 = is72.a;
                if (!z) {
                    mo2 mo22 = (mo2) obj2;
                    if (!mo22.m && !mo22.n) {
                        int size = mo22.a.size();
                        String str5 = mo22.c;
                        String str6 = mo22.d;
                        while (true) {
                            Object value3 = d373.getValue();
                            is7 is73 = (is7) value3;
                            mo2 mo23 = (mo2) is73.a;
                            mo23.getClass();
                            if (d373.i(value3, is7.a(is73, mo2.a(mo23, (ArrayList) null, (List) null, (String) null, (String) null, false, false, (hv2) null, (String) null, (List) null, false, (Boolean) null, (Map) null, true, false, 12287), false, (hv2) null, 6))) {
                                np22.h = ar7.H(u58.a(np22), (e81) null, (r81) null, new eu0((Object) np22, size, (Object) str5, (Object) str6, (f61) null, 2), 3);
                            } else {
                                int i13 = size;
                                String str7 = str6;
                                int i14 = i13;
                                String str8 = str7;
                                size = i14;
                                str6 = str8;
                            }
                        }
                    }
                }
                return vs7;
            case 14:
                ((c23) obj).h();
                return vs7;
            case h75.g:
                c23 c23 = (c23) obj;
                Context context4 = c23.h;
                boolean A3 = sg3.A(context4, "android.permission.CALL_PHONE");
                rg5 rg54 = c23.g;
                String str9 = c23.o;
                if (A3) {
                    int i15 = c23.q;
                    rg54.getClass();
                    rg5.b(context4, str9, i15);
                } else {
                    rg54.getClass();
                    rg5.e(context4, str9);
                }
                return vs7;
            case 16:
                c23 c232 = (c23) obj;
                Context context5 = c232.h;
                boolean A4 = sg3.A(context5, "android.permission.CALL_PHONE");
                rg5 rg55 = c232.g;
                String str10 = c232.p;
                if (A4) {
                    int i16 = c232.q;
                    rg55.getClass();
                    rg5.b(context5, str10, i16);
                } else {
                    rg55.getClass();
                    rg5.e(context5, str10);
                }
                return vs7;
            case 17:
                rh3 rh3 = (rh3) obj;
                d37 d374 = rh3.d;
                if (!((is7) d374.getValue()).b) {
                    ar7.H(u58.a(rh3), (e81) null, (r81) null, new p0(d374, (f61) null, rh3), 3);
                }
                return vs7;
            case 18:
                MainActivity.t((MainActivity) obj);
                return vs7;
            case 19:
                ne4 ne4 = (ne4) obj;
                ne4.getClass();
                ar7.H(u58.a(ne4), (e81) null, (r81) null, new fe4(ne4, (f61) null, 0), 3);
                return vs7;
            case 20:
                ((MainActivity) obj).finish();
                return vs7;
            case 21:
                NautaOverlayService nautaOverlayService = (NautaOverlayService) obj;
                d37 d375 = NautaOverlayService.K;
                Intent launchIntentForPackage = nautaOverlayService.getPackageManager().getLaunchIntentForPackage(nautaOverlayService.getPackageName());
                if (launchIntentForPackage != null) {
                    launchIntentForPackage.addFlags(805306368);
                    launchIntentForPackage.putExtra("cu.lestebang.utiletecsa.extra.OPEN_NAUTA", true);
                    nautaOverlayService.startActivity(launchIntentForPackage);
                }
                return vs7;
            case 22:
                iu4 iu4 = (iu4) obj;
                iu4.getClass();
                iu4.a(new vd2(10), Vpn.INSTANCE);
                return vs7;
            case 23:
                iu4 iu42 = (iu4) obj;
                iu42.getClass();
                iu42.a(new vd2(11), Pamarillas.INSTANCE);
                return vs7;
            case 24:
                ic5 ic5 = (ic5) obj;
                d37 d376 = ic5.c;
                if (!((is7) d376.getValue()).b) {
                    ar7.H(u58.a(ic5), (e81) null, (r81) null, new ii3(d376, (f61) null, (r58) ic5, 10), 3);
                }
                return vs7;
            case 25:
                dj5 dj5 = (dj5) obj;
                dj5.getClass();
                dj5.f(new aj5(5, (f61) null, dj5));
                return vs7;
            case 26:
                dj5 dj52 = (dj5) obj;
                dj52.getClass();
                dj52.f(new aj5(0, (f61) null, dj52));
                return vs7;
            case 27:
                dj5 dj53 = (dj5) obj;
                dj53.getClass();
                dj53.f(new aj5(3, (f61) null, dj53));
                return vs7;
            case 28:
                dj5 dj54 = (dj5) obj;
                dj54.getClass();
                dj54.f(new aj5(2, (f61) null, dj54));
                return vs7;
            default:
                dj5 dj55 = (dj5) obj;
                dj55.getClass();
                dj55.f(new aj5(1, (f61) null, dj55));
                return vs7;
        }
    }
}
