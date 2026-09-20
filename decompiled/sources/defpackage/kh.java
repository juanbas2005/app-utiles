package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.inputmethodservice.InputMethodService;
import android.os.Build;
import android.os.Trace;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputMethodManager;
import java.util.concurrent.CancellationException;

/* renamed from: kh  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class kh extends wx3 implements sr2 {
    public final /* synthetic */ int x;
    public final /* synthetic */ Object y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kh(int i, Object obj) {
        super(0);
        this.x = i;
        this.y = obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: android.content.Context} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: android.content.Context} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: android.content.Context} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v25, resolved type: dy3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v13, resolved type: android.content.Context} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v14, resolved type: android.content.Context} */
    /* JADX WARNING: Multi-variable type inference failed */
    public final Object b() {
        vb8 vb8;
        py0 py0;
        int i = this.x;
        Context context = null;
        boolean z = false;
        vs7 vs7 = vs7.a;
        Object obj = this.y;
        switch (i) {
            case b85.b:
                gl0.J(((mh) obj).y, (CancellationException) null);
                return vs7;
            case 1:
                return vs7;
            case 2:
                mm7 mm7 = (mm7) obj;
                Object H0 = mm7.a.H0();
                Object obj2 = a52.y;
                if (H0 == obj2 && mm7.d.getValue() == obj2) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 3:
                boolean a = we3.a(0, 0);
                View view = ((yx0) obj).a;
                if (!a) {
                    return new lq1(0, rj1.f(view.getContext()).p(pv8.O(0)));
                }
                Context context2 = view.getContext();
                Context context3 = context2;
                while (true) {
                    if (context3 instanceof ContextWrapper) {
                        if (!(context3 instanceof Activity) && !(context3 instanceof InputMethodService) && !(context3 instanceof Application)) {
                            ContextWrapper contextWrapper = (ContextWrapper) context3;
                            if (contextWrapper.getBaseContext() != null) {
                                context3 = contextWrapper.getBaseContext();
                            }
                        }
                    }
                }
                context = context3;
                if (context != null) {
                    tb8.a.getClass();
                    ub8 ub8 = sb8.b;
                    ub8.getClass();
                    int i2 = Build.VERSION.SDK_INT;
                    if (i2 >= 34) {
                        vb8 = vp1.x;
                    } else if (i2 >= 30) {
                        vb8 = jb0.x;
                    } else {
                        vb8 = pe2.Q;
                    }
                    gb0 gb0 = vb8.h(context, ub8.b).a;
                    long height = (((long) gb0.c().height()) & 4294967295L) | (((long) gb0.c().width()) << 32);
                    return new lq1(height, rj1.f(context).p(pv8.O(height)));
                }
                Configuration configuration = context2.getResources().getConfiguration();
                xp1 f = rj1.f(context2);
                long c = pv8.c((float) configuration.screenWidthDp, (float) configuration.screenHeightDp);
                long A0 = f.A0(c);
                return new lq1((((long) ((int) Float.intBitsToFloat((int) (A0 & 4294967295L)))) & 4294967295L) | (((long) ((int) Float.intBitsToFloat((int) (A0 >> 32)))) << 32), c);
            case 4:
                return new qk(1, (nz1) obj);
            case 5:
                tr6 tr6 = (tr6) obj;
                ed5 ed5 = tr6.b;
                Boolean bool = Boolean.FALSE;
                ed5.setValue(bool);
                tr6.c(false);
                wz0 wz0 = tr6.c;
                ((ed5) wz0.a).setValue(bool);
                ((ed5) wz0.c).setValue(bool);
                ((ed5) wz0.e).setValue(bool);
                ((ed5) wz0.g).setValue(bool);
                tr6.e = jt0.f;
                tr6.f = 1.0f;
                tr6.g = 1.0f;
                z38 z38 = tr6.j;
                if (z38 != null) {
                    qs.S0(0, z38.d.length, (Object) null, z38.d);
                    z38.e = 0;
                }
                tr6.h = ql7.b;
                tr6.i = 0;
                return vs7;
            case 6:
                ((vk2) obj).X0();
                return vs7;
            case 7:
                Object systemService = ((View) ((wr0) obj).x).getContext().getSystemService("input_method");
                systemService.getClass();
                return (InputMethodManager) systemService;
            case 8:
                yy3 yy3 = ((uy3) obj).b0;
                yy3.p.V = true;
                jd4 jd4 = yy3.q;
                if (jd4 != null) {
                    jd4.P = true;
                }
                return vs7;
            case 9:
                az3 az3 = (az3) obj;
                if (!((Boolean) az3.g.getValue()).booleanValue() && (py0 = az3.c) != null) {
                    py0.n();
                }
                return vs7;
            case 10:
                te4 te4 = (te4) ((y54) obj).a.x;
                if (!te4.x) {
                    if (te4.y) {
                        wm5.a("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                    }
                    te4.a();
                    te4.y = true;
                }
                return vs7;
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                return (o81) ((am6) obj).A;
            case 12:
                return ((zx4) obj).V0();
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                pl5 pl5 = (pl5) obj;
                dy3 n = pl5.getParentLayoutCoordinates();
                if (n != 0 && n.n()) {
                    context = n;
                }
                if (!(context == null || pl5.m70getPopupContentSizebOM6tXw() == null)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 14:
                ny5 ny5 = (ny5) obj;
                ny5.i = null;
                Trace.beginSection("OnPositionedDispatch");
                try {
                    ny5.a();
                    return vs7;
                } finally {
                    Trace.endSection();
                }
            case h75.g:
                iz3 a2 = ((p67) obj).a();
                uy3 uy3 = a2.w;
                if (a2.J != ((eq4) ((jp4) uy3.o()).x).y) {
                    tp4 tp4 = a2.B;
                    Object[] objArr = tp4.c;
                    long[] jArr = tp4.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i3 = 0;
                        while (true) {
                            long j = jArr[i3];
                            if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                                int i4 = 8 - ((~(i3 - length)) >>> 31);
                                for (int i5 = 0; i5 < i4; i5++) {
                                    if ((255 & j) < 128) {
                                        ((az3) objArr[(i3 << 3) + i5]).d = true;
                                    }
                                    j >>= 8;
                                }
                                if (i4 != 8) {
                                }
                            }
                            if (i3 != length) {
                                i3++;
                            }
                        }
                    }
                    if (uy3.D != null) {
                        if (!uy3.b0.e) {
                            uy3.X(uy3, false, 7);
                        }
                    } else if (!uy3.q()) {
                        uy3.Z(uy3, false, 7);
                    }
                }
                return vs7;
            case 16:
                return new BaseInputConnection(((uf7) obj).a, false);
            default:
                ((k38) obj).D.setValue(vs7);
                return vs7;
        }
    }
}
