package defpackage;

import android.content.Context;
import android.content.Intent;
import android.database.SQLException;
import android.os.Build;
import android.os.CancellationSignal;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.identityauth.HiddenActivity;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: m0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class m0 implements vr2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;

    public /* synthetic */ m0(boolean z, String str, String str2, String str3, m92 m92, gy6 gy6) {
        this.w = 17;
        this.x = m92;
        this.y = gy6;
    }

    /* JADX WARNING: type inference failed for: r13v2, types: [re3, pe3] */
    public final Object y(Object obj) {
        u84 u84;
        float f;
        long j;
        float f2;
        int i = this.w;
        boolean z = true;
        vs7 vs7 = vs7.a;
        Object obj2 = this.y;
        Object obj3 = this.x;
        switch (i) {
            case b85.b:
                Throwable th = (Throwable) obj;
                ((ap4) obj3).c((do5) obj2);
                return vs7;
            case 1:
                w84 w84 = (w84) obj3;
                AccessibilityManager accessibilityManager = (AccessibilityManager) obj2;
                if (((j54) obj) == j54.ON_RESUME) {
                    w84.getClass();
                    w84.y.setValue(Boolean.valueOf(accessibilityManager.isEnabled()));
                    accessibilityManager.addAccessibilityStateChangeListener(w84);
                    v84 v84 = w84.z;
                    if (v84 != null) {
                        v84.w.setValue(Boolean.valueOf(accessibilityManager.isTouchExplorationEnabled()));
                        accessibilityManager.addTouchExplorationStateChangeListener(v84);
                    }
                    if (Build.VERSION.SDK_INT >= 33 && (u84 = w84.A) != null) {
                        u84.a.setValue(Boolean.valueOf(w84.b(accessibilityManager)));
                        u84.b.setValue(Boolean.valueOf(w84.c(accessibilityManager)));
                        y4.a(accessibilityManager, v4.g(u84));
                    }
                }
                return vs7;
            case 2:
                vc vcVar = (vc) obj3;
                ad adVar = (ad) obj2;
                long j2 = ((by1) obj).a;
                if (vcVar.r1()) {
                    f = -1.0f;
                } else {
                    f = 1.0f;
                }
                long f3 = l35.f(f, j2);
                if (vcVar.M == z75.w) {
                    j = f3 & 4294967295L;
                } else {
                    j = f3 >> 32;
                }
                adVar.a(vcVar.f0.d(Float.intBitsToFloat((int) j)), 0.0f);
                return vs7;
            case 3:
                vr2 vr2 = (vr2) obj2;
                y53 y53 = (y53) obj;
                y53.getClass();
                vr2 vr22 = ((aw) obj3).d.c.a;
                if (vr22 != null) {
                    vr22.y(y53);
                }
                vr2.y(y53);
                return vs7;
            case 4:
                String str = (String) obj;
                str.getClass();
                return (String) ((aw) obj3).a.y(((String) obj2) + '/' + str);
            case 5:
                e20 e20 = (e20) obj3;
                f20 f20 = (f20) obj2;
                s36 s36 = (s36) obj;
                ph7 ph7 = e20.K;
                if (ph7 != null) {
                    ph7.b();
                }
                e20.K = null;
                xu0 xu0 = f20.x;
                if (xu0 != null) {
                    xu0.c0(vs7);
                }
                f20.x = null;
                return vs7;
            case 6:
                h30 h30 = (h30) obj3;
                ax0 ax0 = (ax0) obj2;
                kw1 kw1 = (kw1) obj;
                h30.a(ax0);
                return new m30(0, h30, ax0);
            case 7:
                hz1 hz1 = (hz1) obj;
                hz1.getClass();
                hz1.q(hz1, (p64) obj3, 0, 0, 0.0f, (iz1) null, (lt0) null, 126);
                hz1.q(hz1, (p64) obj2, 0, 0, 0.0f, (iz1) null, (lt0) null, 126);
                return vs7;
            case 8:
                eh5 eh5 = (eh5) obj3;
                eh5 eh52 = (eh5) obj2;
                dh5 dh5 = (dh5) obj;
                if (eh5.w <= dh5.r0(ar7.e)) {
                    z = false;
                }
                float f4 = 6.0f;
                if (z) {
                    f2 = 12.0f;
                } else {
                    f2 = 6.0f;
                }
                if (z) {
                    f4 = 14.0f;
                }
                dh5.k(dh5, eh52, 0, 0);
                dh5.k(dh5, eh5, Math.min(eh52.w - dh5.r0(f2), ((int) dh5.c(mp7.x, Float.POSITIVE_INFINITY)) - eh5.w), Math.max(dh5.r0(f4) + (-eh5.x), (int) dh5.c(mp7.w, Float.NEGATIVE_INFINITY)));
                return vs7;
            case 9:
                vr2 vr23 = (vr2) obj2;
                hf7 hf7 = (hf7) obj;
                if (!sg3.e((hf7) obj3, hf7)) {
                    vr23.y(hf7);
                }
                return vs7;
            case 10:
                wy3 wy3 = (wy3) obj;
                wy3.a();
                hz1.U(wy3, (eh) obj3, (kc0) obj2, 0.0f, (l57) null, (lt0) null, 60);
                return vs7;
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                wy3 wy32 = (wy3) obj;
                wy32.a();
                hz1.U(wy32, ((k85) obj3).l, (kc0) obj2, 0.0f, (l57) null, (lt0) null, 60);
                return vs7;
            case 12:
                Throwable th2 = (Throwable) obj;
                ((eq4) ((f96) obj3).x).k((q41) obj2);
                return vs7;
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                u44 u44 = (u44) obj3;
                kc0 kc0 = (kc0) obj2;
                wy3 wy33 = (wy3) obj;
                wy33.a();
                if (((Boolean) u44.s.getValue()).booleanValue() || ((Boolean) u44.t.getValue()).booleanValue()) {
                    hz1.q(wy33, kc0, 0, 0, 0.0f, (iz1) null, (lt0) null, 126);
                }
                return vs7;
            case 14:
                CancellationSignal cancellationSignal = (CancellationSignal) obj3;
                rb1 rb1 = (rb1) obj2;
                Context context = rb1.c;
                c80 c80 = (c80) obj;
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!ac1.a(cancellationSignal)) {
                    Intent intent = new Intent(context, HiddenActivity.class);
                    sb1.a(rb1.g, intent, "BEGIN_SIGN_IN");
                    intent.putExtra("EXTRA_FLOW_PENDING_INTENT", c80.w);
                    try {
                        context.startActivity(intent);
                    } catch (Exception unused) {
                        CredentialProviderPlayServicesImpl.Companion.getClass();
                        if (!ac1.a(cancellationSignal)) {
                            rb1.d().execute(new y0(12, rb1));
                        }
                    }
                }
                return vs7;
            case h75.g:
                List list = (List) obj;
                Long l = (Long) list.get(0);
                Long l2 = (Long) list.get(1);
                Object obj4 = list.get(2);
                obj4.getClass();
                int intValue = ((Integer) obj4).intValue();
                Object obj5 = list.get(3);
                obj5.getClass();
                ? pe3 = new pe3(intValue, ((Integer) obj5).intValue(), 1);
                Object obj6 = list.get(4);
                obj6.getClass();
                return new hi1(l, l2, pe3, ((Integer) obj6).intValue(), (kg1) obj3, (Locale) obj2);
            case 16:
                ua6 ua6 = (ua6) obj;
                ua6.getClass();
                ((cq1) obj3).b.v(ua6, (yp1) obj2);
                return vs7;
            case 17:
                ok6 ok6 = (ok6) obj;
                mk6.f(ok6, 6);
                ok6.f(zj6.b, new h4((String) null, new zh((m92) obj3, (gy6) obj2)));
                return vs7;
            case 18:
                kw1 kw12 = (kw1) obj;
                return new d9(8, new r92((View) obj3, (sr2) obj2));
            case 19:
                Throwable th3 = (Throwable) obj;
                ((ap4) obj3).c((df3) obj2);
                return vs7;
            case 20:
                String str2 = (String) obj;
                str2.getClass();
                ((gs2) obj3).H((String) obj2, str2);
                return vs7;
            case 21:
                String str3 = (String) obj3;
                en2 en2 = (en2) obj2;
                mo2 mo2 = (mo2) obj;
                mo2.getClass();
                List<en2> list2 = mo2.a;
                ArrayList arrayList = new ArrayList(et0.e0(list2, 10));
                for (en2 en22 : list2) {
                    if (sg3.e(en22.a, str3)) {
                        en22 = en2;
                    }
                    arrayList.add(en22);
                }
                return mo2.a(mo2, arrayList, (List) null, (String) null, (String) null, false, false, (hv2) null, (String) null, (List) null, false, (Boolean) null, (Map) null, false, false, 16382);
            case 22:
                String str4 = (String) obj3;
                tm2 tm2 = (tm2) obj2;
                mo2 mo22 = (mo2) obj;
                mo22.getClass();
                List<tm2> list3 = mo22.i;
                ArrayList arrayList2 = new ArrayList(et0.e0(list3, 10));
                for (tm2 tm22 : list3) {
                    if (sg3.e(tm22.a, str4)) {
                        tm22 = tm2;
                    }
                    arrayList2.add(tm22);
                }
                return mo2.a(mo22, (ArrayList) null, (List) null, (String) null, (String) null, false, false, (hv2) null, (String) null, arrayList2, false, (Boolean) null, (Map) null, false, false, 16127);
            case 23:
                Throwable th4 = (Throwable) obj;
                ((gy2) obj3).y.removeCallbacks((ga) obj2);
                return vs7;
            case 24:
                f06 f06 = (f06) obj3;
                f06 f062 = (f06) obj2;
                xf4 xf4 = (xf4) obj;
                if (f06.w == -1) {
                    f06.w = xf4.b().w;
                }
                f062.w = xf4.b().x + 1;
                return "";
            case 25:
                lb3 lb3 = (lb3) obj3;
                jb3 jb3 = (jb3) obj2;
                kw1 kw13 = (kw1) obj;
                lb3.a.b(jb3);
                lb3.b.setValue(Boolean.TRUE);
                return new m30(2, lb3, jb3);
            case 26:
                al3 al3 = (al3) obj2;
                ua6 ua62 = (ua6) obj;
                ua62.getClass();
                jz0 jz0 = ((xk3) obj3).b;
                jz0.getClass();
                try {
                    ((pd8) jz0.x).v(ua62, al3);
                } catch (SQLException e) {
                    jz0.j(e);
                    ((ar7) jz0.y).A(ua62, al3);
                }
                return vs7;
            case 27:
                a04 a04 = (a04) obj2;
                cm2 b = ((j04) obj3).b(((Integer) obj).intValue());
                int i2 = b.a;
                List list4 = b.b;
                ArrayList arrayList3 = new ArrayList(list4.size());
                int size = list4.size();
                int i3 = 0;
                for (int i4 = 0; i4 < size; i4++) {
                    int i5 = (int) ((px2) list4.get(i4)).a;
                    arrayList3.add(new yb5(Integer.valueOf(i2), new k31(a04.a(i3, i5))));
                    i2++;
                    i3 += i5;
                }
                return arrayList3;
            case 28:
                a04 a042 = (a04) obj3;
                zz3 zz3 = (zz3) obj2;
                int intValue2 = ((Integer) obj).intValue();
                j04 j04 = a042.e;
                int i6 = j04.i;
                int e2 = j04.e(intValue2);
                return zz3.d1(intValue2, 0, e2, zz3.z, a042.a(0, e2));
            default:
                x34 x34 = (x34) obj3;
                kw1 kw14 = (kw1) obj;
                x34.y.i(obj2);
                return new m30(3, x34, obj2);
        }
    }

    public /* synthetic */ m0(int i, Object obj, Object obj2) {
        this.w = i;
        this.x = obj;
        this.y = obj2;
    }
}
