package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.os.Trace;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import java.util.List;
import java.util.Objects;

/* renamed from: bf  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class bf implements nm1, View.OnAttachStateChangeListener, Runnable {
    public final long A = 100;
    public ze B = ze.w;
    public boolean C = true;
    public long D;
    public yo4 E;
    public long F;
    public final yo4 G;
    public gk6 H;
    public boolean I;
    public final je w;
    public final yd x;
    public jz0 y;
    public final lp4 z = new lp4();

    public bf(je jeVar, yd ydVar) {
        this.w = jeVar;
        this.x = ydVar;
        new Handler(Looper.getMainLooper());
        yo4 yo4 = ne3.a;
        yo4.getClass();
        this.E = yo4;
        this.G = new yo4();
        this.H = new gk6(jeVar.getSemanticsOwner().a(), yo4);
    }

    public final void a(t54 t54) {
        i(this.w.getSemanticsOwner().a());
        d();
        this.y = null;
    }

    public final void b(me3 me3) {
        int[] iArr;
        long j;
        int[] iArr2;
        long j2;
        char c;
        int i;
        int i2;
        fk6 fk6;
        long j3;
        vl vlVar;
        vl vlVar2;
        long j4;
        vl vlVar3;
        me3 me32 = me3;
        int[] iArr3 = me32.b;
        long[] jArr = me32.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j5 = jArr[i3];
                char c2 = 7;
                long j6 = -9187201950435737472L;
                if ((((~j5) << 7) & j5 & -9187201950435737472L) != -9187201950435737472L) {
                    int i4 = 8;
                    int i5 = 8 - ((~(i3 - length)) >>> 31);
                    int i6 = 0;
                    while (i6 < i5) {
                        if ((j5 & 255) < 128) {
                            int i7 = iArr3[(i3 << 3) + i6];
                            c = c2;
                            gk6 gk6 = (gk6) this.G.b(i7);
                            hk6 hk6 = (hk6) me32.b(i7);
                            if (hk6 != null) {
                                fk6 = hk6.a;
                            } else {
                                fk6 = null;
                            }
                            if (fk6 != null) {
                                j2 = j6;
                                int i8 = fk6.f;
                                tp4 tp4 = fk6.d.w;
                                if (gk6 == null) {
                                    Object[] objArr = tp4.b;
                                    long[] jArr2 = tp4.a;
                                    int length2 = jArr2.length - 2;
                                    iArr2 = iArr3;
                                    if (length2 >= 0) {
                                        int i9 = i4;
                                        int i10 = 0;
                                        while (true) {
                                            long j7 = jArr2[i10];
                                            j = j5;
                                            if ((((~j7) << c) & j7 & j2) != j2) {
                                                int i11 = 8 - ((~(i10 - length2)) >>> 31);
                                                for (int i12 = 0; i12 < i11; i12++) {
                                                    if ((j7 & 255) < 128) {
                                                        j4 = j7;
                                                        nk6 nk6 = jk6.C;
                                                        if (sg3.e((nk6) objArr[(i10 << 3) + i12], nk6)) {
                                                            Object g = tp4.g(nk6);
                                                            if (g == null) {
                                                                g = null;
                                                            }
                                                            List list = (List) g;
                                                            if (list != null) {
                                                                vlVar3 = (vl) dt0.y0(list);
                                                            } else {
                                                                vlVar3 = null;
                                                            }
                                                            g(i8, String.valueOf(vlVar3));
                                                        }
                                                    } else {
                                                        j4 = j7;
                                                    }
                                                    j7 = j4 >> i9;
                                                }
                                                if (i11 != i9) {
                                                    break;
                                                }
                                            }
                                            if (i10 == length2) {
                                                break;
                                            }
                                            i10++;
                                            j5 = j;
                                            i9 = 8;
                                        }
                                    } else {
                                        j = j5;
                                    }
                                } else {
                                    iArr2 = iArr3;
                                    j = j5;
                                    Object[] objArr2 = tp4.b;
                                    long[] jArr3 = tp4.a;
                                    int length3 = jArr3.length - 2;
                                    if (length3 >= 0) {
                                        Object[] objArr3 = objArr2;
                                        long[] jArr4 = jArr3;
                                        int i13 = 0;
                                        while (true) {
                                            long j8 = jArr4[i13];
                                            long[] jArr5 = jArr4;
                                            i = i6;
                                            if ((((~j8) << c) & j8 & j2) != j2) {
                                                int i14 = 8 - ((~(i13 - length3)) >>> 31);
                                                int i15 = 0;
                                                while (i15 < i14) {
                                                    if ((j8 & 255) < 128) {
                                                        j3 = j8;
                                                        nk6 nk62 = jk6.C;
                                                        if (sg3.e((nk6) objArr3[(i13 << 3) + i15], nk62)) {
                                                            Object g2 = gk6.a.w.g(nk62);
                                                            if (g2 == null) {
                                                                g2 = null;
                                                            }
                                                            List list2 = (List) g2;
                                                            if (list2 != null) {
                                                                vlVar = (vl) dt0.y0(list2);
                                                            } else {
                                                                vlVar = null;
                                                            }
                                                            Object g3 = tp4.g(nk62);
                                                            if (g3 == null) {
                                                                g3 = null;
                                                            }
                                                            List list3 = (List) g3;
                                                            if (list3 != null) {
                                                                vlVar2 = (vl) dt0.y0(list3);
                                                            } else {
                                                                vlVar2 = null;
                                                            }
                                                            if (!sg3.e(vlVar, vlVar2)) {
                                                                g(i8, String.valueOf(vlVar2));
                                                            }
                                                        }
                                                    } else {
                                                        j3 = j8;
                                                    }
                                                    i15++;
                                                    j8 = j3 >> 8;
                                                }
                                                if (i14 != 8) {
                                                    break;
                                                }
                                            }
                                            if (i13 == length3) {
                                                break;
                                            }
                                            i13++;
                                            i6 = i;
                                            jArr4 = jArr5;
                                        }
                                        i2 = 8;
                                    }
                                }
                                i = i6;
                                i2 = 8;
                            } else {
                                throw b81.t("no value for specified key");
                            }
                        } else {
                            iArr2 = iArr3;
                            j = j5;
                            c = c2;
                            j2 = j6;
                            i = i6;
                            i2 = i4;
                        }
                        j5 = j >> i2;
                        i6 = i + 1;
                        i4 = i2;
                        c2 = c;
                        j6 = j2;
                        iArr3 = iArr2;
                        me32 = me3;
                    }
                    iArr = iArr3;
                    if (i5 != i4) {
                        return;
                    }
                } else {
                    iArr = iArr3;
                }
                if (i3 != length) {
                    i3++;
                    me32 = me3;
                    iArr3 = iArr;
                } else {
                    return;
                }
            }
        }
    }

    public final me3 c() {
        if (this.C) {
            this.C = false;
            this.E = we.m(this.w.getSemanticsOwner(), ce.B);
            this.F = System.currentTimeMillis();
        }
        return this.E;
    }

    public final void d() {
        jz0 jz0 = this.y;
        if (jz0 != null) {
            Object obj = jz0.x;
            if (Build.VERSION.SDK_INT >= 29) {
                lp4 lp4 = this.z;
                if (lp4.i()) {
                    Object[] objArr = lp4.a;
                    int i = lp4.b;
                    for (int i2 = 0; i2 < i; i2++) {
                        h41 h41 = (h41) objArr[i2];
                        int ordinal = h41.c.ordinal();
                        if (ordinal == 0) {
                            rg4 rg4 = h41.d;
                            if (rg4 != null) {
                                ViewStructure viewStructure = (ViewStructure) rg4.x;
                                if (Build.VERSION.SDK_INT >= 29) {
                                    dn.f(wk0.m(obj), viewStructure);
                                }
                            }
                        } else if (ordinal == 1) {
                            AutofillId P = jz0.P((long) h41.a);
                            if (P != null && Build.VERSION.SDK_INT >= 29) {
                                dn.g(wk0.m(obj), P);
                            }
                        } else {
                            h.c();
                            return;
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 29) {
                        ContentCaptureSession m = wk0.m(obj);
                        a20 e = i75.e((View) jz0.y);
                        Objects.requireNonNull(e);
                        dn.i(m, z10.c(e.w), new long[]{Long.MIN_VALUE});
                    }
                    lp4.d();
                }
            }
        }
    }

    public final void e() {
        Handler handler = this.w.getHandler();
        if (handler != null && this.y != null && !this.I) {
            this.I = true;
            long uptimeMillis = (this.D + this.A) - SystemClock.uptimeMillis();
            if (uptimeMillis <= 0) {
                handler.post(this);
            } else {
                handler.postDelayed(this, uptimeMillis);
            }
        }
    }

    public final void f(fk6 fk6, gk6 gk6) {
        af afVar = new af(0, (Object) gk6, (Object) this);
        fk6.getClass();
        List j = fk6.j(4, fk6);
        int size = j.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = j.get(i2);
            if (c().a(((fk6) obj).f)) {
                afVar.H(Integer.valueOf(i), obj);
                i++;
            }
        }
        List j2 = fk6.j(4, fk6);
        int size2 = j2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            fk6 fk62 = (fk6) j2.get(i3);
            me3 c = c();
            int i4 = fk62.f;
            if (c.a(i4)) {
                yo4 yo4 = this.G;
                if (!yo4.a(i4)) {
                    continue;
                } else {
                    Object b = yo4.b(i4);
                    if (b != null) {
                        f(fk62, (gk6) b);
                    } else {
                        throw b81.t("node not present in pruned tree before this change");
                    }
                }
            }
        }
    }

    public final void g(int i, String str) {
        jz0 jz0;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29 && (jz0 = this.y) != null) {
            AutofillId P = jz0.P((long) i);
            if (P == null) {
                throw b81.t("Invalid content capture ID");
            } else if (i2 >= 29) {
                dn.h(wk0.m(jz0.x), P, str);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0094, code lost:
        if (r8 == null) goto L_0x0072;
     */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x01b0  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x01ca  */
    public final void h(int i, fk6 fk6) {
        rg4 rg4;
        int size;
        int i2;
        a20 e;
        AutofillId autofillId;
        rg4 rg42;
        ly5 ly5;
        String p;
        vr2 vr2;
        vr2 vr22;
        fk6 fk62 = fk6;
        if (this.y != null) {
            tp4 tp4 = fk62.d.w;
            Object g = tp4.g(jk6.E);
            xz4 xz4 = null;
            if (g == null) {
                g = null;
            }
            Boolean bool = (Boolean) g;
            if (this.B == ze.w && sg3.e(bool, Boolean.TRUE)) {
                Object g2 = tp4.g(zj6.m);
                if (g2 == null) {
                    g2 = null;
                }
                h4 h4Var = (h4) g2;
                if (!(h4Var == null || (vr22 = (vr2) h4Var.b) == null)) {
                    Boolean bool2 = (Boolean) vr22.y(Boolean.FALSE);
                }
            } else if (this.B == ze.x && sg3.e(bool, Boolean.FALSE)) {
                Object g3 = tp4.g(zj6.m);
                if (g3 == null) {
                    g3 = null;
                }
                h4 h4Var2 = (h4) g3;
                if (!(h4Var2 == null || (vr2 = (vr2) h4Var2.b) == null)) {
                    Boolean bool3 = (Boolean) vr2.y(Boolean.TRUE);
                }
            }
            int i3 = fk62.f;
            jz0 jz0 = this.y;
            if (!(jz0 == null || (i2 = Build.VERSION.SDK_INT) < 29 || (e = i75.e(this.w)) == null)) {
                fk6 l = fk62.l();
                int i4 = fk62.f;
                if (l != null) {
                    autofillId = jz0.P((long) l.f);
                } else {
                    autofillId = z10.c(e.w);
                }
                long j = (long) i4;
                if (i2 >= 29) {
                    rg42 = new rg4(13, (Object) dn.e(wk0.m(jz0.x), autofillId, j));
                } else {
                    rg42 = null;
                }
                if (rg42 != null) {
                    ViewStructure viewStructure = (ViewStructure) rg42.x;
                    ak6 ak6 = fk62.d;
                    nk6 nk6 = jk6.L;
                    tp4 tp42 = ak6.w;
                    if (!tp42.c(nk6)) {
                        Bundle extras = viewStructure.getExtras();
                        if (extras != null) {
                            extras.putLong("android.view.contentcapture.EventTimestamp", this.F);
                            extras.putInt("android.view.ViewStructure.extra.EXTRA_VIEW_NODE_INDEX", i);
                        }
                        Object g4 = tp42.g(jk6.A);
                        if (g4 == null) {
                            g4 = null;
                        }
                        String str = (String) g4;
                        if (str != null) {
                            viewStructure.setId(i4, (String) null, (String) null, str);
                        }
                        Object g5 = tp42.g(jk6.n);
                        if (g5 == null) {
                            g5 = null;
                        }
                        if (((Boolean) g5) != null) {
                            viewStructure.setClassName("android.widget.ViewGroup");
                        }
                        Object g6 = tp42.g(jk6.C);
                        if (g6 == null) {
                            g6 = null;
                        }
                        List list = (List) g6;
                        if (list != null) {
                            viewStructure.setClassName("android.widget.TextView");
                            viewStructure.setText(i84.a(list, "\n", (tm3) null, 62));
                        }
                        Object g7 = tp42.g(jk6.G);
                        if (g7 == null) {
                            g7 = null;
                        }
                        vl vlVar = (vl) g7;
                        if (vlVar != null) {
                            viewStructure.setClassName("android.widget.EditText");
                            viewStructure.setText(vlVar);
                        }
                        Object g8 = tp42.g(jk6.a);
                        if (g8 == null) {
                            g8 = null;
                        }
                        List list2 = (List) g8;
                        if (list2 != null) {
                            viewStructure.setContentDescription(i84.a(list2, "\n", (tm3) null, 62));
                        }
                        Object g9 = tp42.g(jk6.z);
                        if (g9 == null) {
                            g9 = null;
                        }
                        s86 s86 = (s86) g9;
                        if (!(s86 == null || (p = i75.p(s86.a)) == null)) {
                            viewStructure.setClassName(p);
                        }
                        bg7 f = i75.f(ak6);
                        if (f != null) {
                            ag7 ag7 = f.a;
                            tg7 tg7 = ag7.b;
                            tp1 tp1 = ag7.g;
                            viewStructure.setTextStyle(tp1.Y() * tp1.b() * wg7.c(tg7.a.b), 0, 0, 0);
                        }
                        xz4 d = fk62.d();
                        if (d != null) {
                            if (d.c1().J) {
                                xz4 = d;
                            }
                            if (xz4 != null) {
                                ly5 = fk62.a(xz4);
                                float f2 = ly5.a;
                                float f3 = ly5.b;
                                viewStructure.setDimens((int) f2, (int) f3, 0, 0, (int) (ly5.c - f2), (int) (ly5.d - f3));
                                rg4 = rg42;
                                if (rg4 != null) {
                                    this.z.a(new h41(i3, this.F, i41.w, rg4));
                                }
                                List j2 = fk6.j(4, fk62);
                                size = j2.size();
                                int i5 = 0;
                                for (int i6 = 0; i6 < size; i6++) {
                                    Object obj = j2.get(i6);
                                    if (c().a(((fk6) obj).f)) {
                                        h(i5, (fk6) obj);
                                        i5++;
                                    }
                                }
                            }
                        }
                        ly5 = ly5.e;
                        float f22 = ly5.a;
                        float f32 = ly5.b;
                        viewStructure.setDimens((int) f22, (int) f32, 0, 0, (int) (ly5.c - f22), (int) (ly5.d - f32));
                        rg4 = rg42;
                        if (rg4 != null) {
                        }
                        List j22 = fk6.j(4, fk62);
                        size = j22.size();
                        int i52 = 0;
                        while (i6 < size) {
                        }
                    }
                }
            }
            rg4 = null;
            if (rg4 != null) {
            }
            List j222 = fk6.j(4, fk62);
            size = j222.size();
            int i522 = 0;
            while (i6 < size) {
            }
        }
    }

    public final void i(fk6 fk6) {
        if (this.y != null) {
            this.z.a(new h41(fk6.f, this.F, i41.x, (rg4) null));
            List j = fk6.j(4, fk6);
            int size = j.size();
            for (int i = 0; i < size; i++) {
                i((fk6) j.get(i));
            }
        }
    }

    public final void j() {
        yo4 yo4 = this.G;
        yo4.c();
        me3 c = c();
        int[] iArr = c.b;
        Object[] objArr = c.c;
        long[] jArr = c.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            yo4.i(iArr[i4], new gk6(((hk6) objArr[i4]).a, c()));
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        this.H = new gk6(this.w.getSemanticsOwner().a(), c());
    }

    public final void l(t54 t54) {
        this.y = (jz0) this.x.b();
        h(-1, this.w.getSemanticsOwner().a());
        d();
    }

    public final void onViewDetachedFromWindow(View view) {
        Handler handler = this.w.getHandler();
        if (handler != null) {
            handler.removeCallbacks(this);
        }
        this.y = null;
    }

    public final void run() {
        long[] jArr;
        long[] jArr2;
        je jeVar = this.w;
        this.D = SystemClock.uptimeMillis();
        int i = 0;
        this.I = false;
        if (this.y != null) {
            d();
            Trace.beginSection("ContentCapture:changeChecker");
            try {
                jeVar.r(true);
                yo4 yo4 = this.G;
                int[] iArr = yo4.b;
                long[] jArr3 = yo4.a;
                int length = jArr3.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    while (true) {
                        long j = jArr3[i2];
                        if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                            int i3 = 8 - ((~(i2 - length)) >>> 31);
                            int i4 = i;
                            while (i4 < i3) {
                                if ((255 & j) < 128) {
                                    int i5 = iArr[(i2 << 3) + i4];
                                    if (!c().a(i5)) {
                                        jArr2 = jArr3;
                                        this.z.a(new h41(i5, this.F, i41.x, (rg4) null));
                                        e();
                                        j >>= 8;
                                        i4++;
                                        jArr3 = jArr2;
                                    }
                                }
                                jArr2 = jArr3;
                                j >>= 8;
                                i4++;
                                jArr3 = jArr2;
                            }
                            jArr = jArr3;
                            if (i3 != 8) {
                                break;
                            }
                        } else {
                            jArr = jArr3;
                        }
                        if (i2 == length) {
                            break;
                        }
                        i2++;
                        jArr3 = jArr;
                        i = 0;
                    }
                }
                Trace.beginSection("ContentCapture:sendAppearEvents");
                f(jeVar.getSemanticsOwner().a(), this.H);
                Trace.endSection();
                b(c());
                j();
            } catch (Throwable th) {
                throw th;
            } finally {
                Trace.endSection();
            }
        }
    }

    public final void onViewAttachedToWindow(View view) {
    }
}
