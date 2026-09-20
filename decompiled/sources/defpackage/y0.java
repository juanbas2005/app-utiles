package defpackage;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Application;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import android.view.ActionMode;
import android.view.Choreographer;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.credentials.exceptions.GetCredentialUnknownException;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import com.journeyapps.barcodescanner.BarcodeView;
import cu.lestebang.utiletecsa.feature.settings.service.CallAlertActivity;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: y0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class y0 implements Runnable {
    public final /* synthetic */ int w;
    public final /* synthetic */ Object x;

    public /* synthetic */ y0(int i, Object obj) {
        this.w = i;
        this.x = obj;
    }

    private final void a() {
        o9 o9Var = (o9) this.x;
        synchronized (((ArrayDeque) o9Var.A)) {
            SharedPreferences.Editor edit = ((SharedPreferences) o9Var.x).edit();
            String str = (String) o9Var.y;
            StringBuilder sb = new StringBuilder();
            Iterator it = ((ArrayDeque) o9Var.A).iterator();
            while (it.hasNext()) {
                sb.append((String) it.next());
                sb.append((String) o9Var.z);
            }
            edit.putString(str, sb.toString()).apply();
        }
    }

    private final void b() {
        l90 l90 = (l90) this.x;
        Map map = null;
        ((AtomicReference) l90.c).set((Object) null);
        synchronized (l90) {
            if (((AtomicMarkableReference) l90.b).isMarked()) {
                jt3 jt3 = (jt3) ((AtomicMarkableReference) l90.b).getReference();
                synchronized (jt3) {
                    map = Collections.unmodifiableMap(new HashMap(jt3.a));
                }
                AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) l90.b;
                atomicMarkableReference.set((jt3) atomicMarkableReference.getReference(), false);
            }
        }
        if (map != null) {
            cw0 cw0 = (cw0) l90.d;
            ((fk4) cw0.w).h((String) cw0.y, map, l90.a);
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01c3, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01c6, code lost:
        if (r4 != 0) goto L_0x023e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:?, code lost:
        r3 = defpackage.uk7.a;
        android.os.Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
        r0 = r1.c;
        r3 = r1.a;
        r0.getClass();
        r0 = new defpackage.dm2[]{r2};
        r4 = defpackage.mq7.a;
        android.os.Trace.beginSection(defpackage.f55.v("TypefaceCompat.createFromFontInfo"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:?, code lost:
        r0 = defpackage.mq7.a.e(r3, r0, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:?, code lost:
        android.os.Trace.endSection();
        r2 = defpackage.b35.w(r1.a, r2.a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x01f6, code lost:
        if (r2 == null) goto L_0x0229;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x01f8, code lost:
        if (r0 == null) goto L_0x0229;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:?, code lost:
        android.os.Trace.beginSection("EmojiCompat.MetadataRepo.create");
        r3 = new defpackage.am6(r0, defpackage.uq3.I(r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:?, code lost:
        android.os.Trace.endSection();
        r2 = r1.d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0210, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:?, code lost:
        r0 = r1.h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0213, code lost:
        if (r0 == null) goto L_0x021b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0215, code lost:
        r0.L(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0219, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x021b, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:?, code lost:
        r1.b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0222, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:?, code lost:
        r2 = defpackage.uk7.a;
        android.os.Trace.endSection();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0228, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0230, code lost:
        throw new java.lang.RuntimeException("Unable to open file.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0231, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0233, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0237, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:?, code lost:
        r2 = defpackage.uk7.a;
        android.os.Trace.endSection();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x023d, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0254, code lost:
        throw new java.lang.RuntimeException("fetchFonts result is not OK. (" + r4 + ")");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0257, code lost:
        monitor-enter(r1.d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:?, code lost:
        r2 = r1.h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x025a, code lost:
        if (r2 != null) goto L_0x025c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x025c, code lost:
        r2.J(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0260, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0263, code lost:
        r1.b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0268, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:355:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:357:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:?, code lost:
        r2 = r1.c();
        r4 = r2.f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01b9, code lost:
        if (r4 != 2) goto L_0x01c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01bb, code lost:
        r3 = r1.d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01bd, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:?, code lost:
        monitor-exit(r3);
     */
    public final void run() {
        Application application;
        o8 o8Var;
        long j;
        long j2;
        boolean z;
        boolean z2;
        View findFocus;
        boolean z3 = true;
        boolean z4 = false;
        Boolean bool = null;
        switch (this.w) {
            case b85.b:
                ((a1) this.x).b();
                return;
            case 1:
                boolean z5 = true;
                Activity activity = (Activity) this.x;
                if (!activity.isFinishing()) {
                    Handler handler = p8.g;
                    Method method = p8.f;
                    int i = Build.VERSION.SDK_INT;
                    if (i >= 28) {
                        activity.recreate();
                        return;
                    }
                    if (!(((i == 26 || i == 27) && method == null) || (p8.e == null && p8.d == null))) {
                        try {
                            Object obj = p8.c.get(activity);
                            if (obj != null) {
                                Object obj2 = p8.b.get(activity);
                                if (obj2 != null) {
                                    application = activity.getApplication();
                                    o8Var = new o8(activity);
                                    application.registerActivityLifecycleCallbacks(o8Var);
                                    handler.post(new nt2(2, (Object) o8Var, obj));
                                    if (!(i == 26 || i == 27)) {
                                        z5 = false;
                                    }
                                    if (z5) {
                                        Boolean bool2 = Boolean.FALSE;
                                        method.invoke(obj2, new Object[]{obj, null, null, 0, bool2, null, null, bool2, bool2});
                                    } else {
                                        activity.recreate();
                                    }
                                    handler.post(new nt2(3, (Object) application, (Object) o8Var));
                                    return;
                                }
                            }
                        } catch (Throwable unused) {
                        }
                    }
                    activity.recreate();
                    return;
                }
                return;
            case 2:
                oe oeVar = (oe) this.x;
                Trace.beginSection("measureAndLayout");
                try {
                    oeVar.z.r(true);
                    Trace.endSection();
                    Trace.beginSection("checkForSemanticsChanges");
                    try {
                        oeVar.m();
                        Trace.endSection();
                        oeVar.f0 = false;
                        return;
                    } catch (Throwable th) {
                        Trace.endSection();
                        throw th;
                    }
                } catch (Throwable th2) {
                    Trace.endSection();
                    throw th2;
                }
            case 3:
                ActionMode actionMode = ((ui) this.x).h;
                if (actionMode != null) {
                    actionMode.finish();
                    return;
                }
                return;
            case 4:
                dl dlVar = (dl) ((dl) this.x).c.x;
                long uptimeMillis = SystemClock.uptimeMillis();
                ArrayList arrayList = dlVar.b;
                long uptimeMillis2 = SystemClock.uptimeMillis();
                int i2 = 0;
                while (i2 < arrayList.size()) {
                    u17 u17 = (u17) arrayList.get(i2);
                    if (u17 != null) {
                        zt6 zt6 = dlVar.a;
                        Long l = (Long) zt6.get(u17);
                        if (l != null) {
                            if (l.longValue() < uptimeMillis2) {
                                zt6.remove(u17);
                            }
                        }
                        long j3 = u17.i;
                        if (j3 == 0) {
                            u17.i = uptimeMillis;
                            u17.c(u17.b);
                        } else {
                            long j4 = uptimeMillis - j3;
                            u17.i = uptimeMillis;
                            float f = u17.b().g;
                            if (f == 0.0f) {
                                j2 = 2147483647L;
                            } else {
                                j2 = (long) (((float) j4) / f);
                            }
                            long j5 = j2;
                            boolean z6 = u17.o;
                            float f2 = u17.n;
                            if (z6) {
                                if (f2 != Float.MAX_VALUE) {
                                    j = uptimeMillis2;
                                    u17.m.i = (double) f2;
                                    u17.n = Float.MAX_VALUE;
                                } else {
                                    j = uptimeMillis2;
                                }
                                u17.b = (float) u17.m.i;
                                u17.a = 0.0f;
                                u17.o = z4;
                                z = z3;
                            } else {
                                j = uptimeMillis2;
                                int i3 = (f2 > Float.MAX_VALUE ? 1 : (f2 == Float.MAX_VALUE ? 0 : -1));
                                v17 v17 = u17.m;
                                float f3 = u17.b;
                                float f4 = u17.a;
                                if (i3 != 0) {
                                    long j6 = j5 / 2;
                                    pj c = v17.c((double) f3, (double) f4, j6);
                                    v17 v172 = u17.m;
                                    v172.i = (double) u17.n;
                                    u17.n = Float.MAX_VALUE;
                                    pj c2 = v172.c((double) c.w, (double) c.x, j6);
                                    u17.b = c2.w;
                                    u17.a = c2.x;
                                } else {
                                    pj c3 = v17.c((double) f3, (double) f4, j5);
                                    u17.b = c3.w;
                                    u17.a = c3.x;
                                }
                                float max = Math.max(u17.b, u17.h);
                                u17.b = max;
                                float min = Math.min(max, u17.g);
                                u17.b = min;
                                float f5 = u17.a;
                                v17 v173 = u17.m;
                                v173.getClass();
                                if (((double) Math.abs(f5)) >= v173.e || ((double) Math.abs(min - ((float) v173.i))) >= v173.d) {
                                    z = false;
                                } else {
                                    u17.b = (float) u17.m.i;
                                    u17.a = 0.0f;
                                    z = true;
                                }
                            }
                            float min2 = Math.min(u17.b, u17.g);
                            u17.b = min2;
                            float max2 = Math.max(min2, u17.h);
                            u17.b = max2;
                            u17.c(max2);
                            if (z) {
                                ArrayList arrayList2 = u17.k;
                                u17.f = false;
                                dl b = u17.b();
                                b.a.remove(u17);
                                ArrayList arrayList3 = b.b;
                                int indexOf = arrayList3.indexOf(u17);
                                if (indexOf >= 0) {
                                    arrayList3.set(indexOf, (Object) null);
                                    b.f = true;
                                }
                                u17.i = 0;
                                u17.c = false;
                                for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                                    if (arrayList2.get(i4) != null) {
                                        float f6 = u17.b;
                                        ((em7) arrayList2.get(i4)).getClass();
                                        if (f6 < 1.0f) {
                                            throw null;
                                        }
                                        throw null;
                                    }
                                }
                                for (int size = arrayList2.size() - 1; size >= 0; size--) {
                                    if (arrayList2.get(size) == null) {
                                        arrayList2.remove(size);
                                    }
                                }
                            } else {
                                continue;
                            }
                            i2++;
                            uptimeMillis2 = j;
                            z3 = true;
                            z4 = false;
                        }
                    }
                    j = uptimeMillis2;
                    i2++;
                    uptimeMillis2 = j;
                    z3 = true;
                    z4 = false;
                }
                if (dlVar.f) {
                    for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                        if (arrayList.get(size2) == null) {
                            arrayList.remove(size2);
                        }
                    }
                    if (arrayList.size() == 0 && Build.VERSION.SDK_INT >= 33) {
                        qc3 qc3 = dlVar.h;
                        boolean unused2 = ValueAnimator.unregisterDurationScaleChangeListener((bl) qc3.x);
                        qc3.x = null;
                    }
                    dlVar.f = false;
                }
                if (arrayList.size() > 0) {
                    ((Choreographer) dlVar.e.x).postFrameCallback(new cl(dlVar.d));
                    return;
                }
                return;
            case 5:
                ay ayVar = ((zx) this.x).a;
                ayVar.b = false;
                ayVar.a();
                return;
            case 6:
                WeakReference weakReference = CallAlertActivity.R;
                ((CallAlertActivity) this.x).finish();
                return;
            case 7:
                dk0.a((BarcodeView) ((ns8) this.x).x);
                return;
            case 8:
                ((CarouselLayoutManager) this.x).m0();
                return;
            case 9:
                ((jr0) this.x).s(true);
                return;
            case 10:
                ov0 ov0 = (ov0) this.x;
                Runnable runnable = ov0.x;
                if (runnable != null) {
                    runnable.run();
                    ov0.x = null;
                    return;
                }
                return;
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER:
                vv0.a((vv0) this.x);
                return;
            case 12:
                ((kb1) ((rb1) this.x).c()).a(new GetCredentialUnknownException("Failed to launch the selector UI. Hint: ensure the `context` parameter is an Activity-based context."));
                return;
            case ry4.PERF_SESSIONS_FIELD_NUMBER:
                n02 n02 = (n02) this.x;
                boolean isPopupShowing = n02.h.isPopupShowing();
                n02.s(isPopupShowing);
                n02.m = isPopupShowing;
                return;
            case 14:
                ll2 ll2 = (ll2) this.x;
                synchronized (ll2.d) {
                    try {
                        if (ll2.h == null) {
                            return;
                        }
                    } finally {
                        while (true) {
                            break;
                        }
                    }
                }
                break;
            case h75.g:
                bq2 bq2 = (bq2) this.x;
                bq2.m0.B.G(bq2.z);
                bq2.z = null;
                return;
            case 16:
                Iterator it = ((rq2) this.x).n.iterator();
                if (it.hasNext()) {
                    throw pb4.g(it);
                }
                return;
            case 17:
                el3 el3 = (el3) this.x;
                if (el3 != null) {
                    el3.o((CancellationException) null);
                    return;
                }
                return;
            case 18:
                MaterialButton.a((MaterialButton) this.x);
                return;
            case 19:
                gp5 gp5 = (gp5) this.x;
                w54 w54 = gp5.B;
                if (gp5.x == 0) {
                    gp5.y = true;
                    w54.f1(j54.ON_PAUSE);
                }
                if (gp5.w == 0 && gp5.y) {
                    w54.f1(j54.ON_STOP);
                    gp5.z = true;
                    return;
                }
                return;
            case 20:
                ((tv5) this.x).m();
                return;
            case 21:
                a86.setRippleState$lambda$1((a86) this.x);
                return;
            case 22:
                a();
                return;
            case 23:
                za0 za0 = (za0) this.x;
                za0.c = false;
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) za0.e;
                i58 i58 = sideSheetBehavior.i;
                if (i58 != null && i58.f()) {
                    za0.b(za0.b);
                    return;
                } else if (sideSheetBehavior.h == 2) {
                    sideSheetBehavior.r(za0.b);
                    return;
                } else {
                    return;
                }
            case 24:
                ((TextInputLayout) this.x).A.requestLayout();
                return;
            case 25:
                uf7 uf7 = (uf7) this.x;
                wr0 wr0 = uf7.b;
                uf7.n = null;
                eq4 eq4 = uf7.m;
                View view = uf7.a;
                if (view.isFocused() || (findFocus = view.getRootView().findFocus()) == null || !findFocus.onCheckIsTextEditor()) {
                    Object[] objArr = eq4.w;
                    int i5 = eq4.y;
                    Boolean bool3 = null;
                    for (int i6 = 0; i6 < i5; i6++) {
                        tf7 tf7 = (tf7) objArr[i6];
                        int ordinal = tf7.ordinal();
                        if (ordinal == 0) {
                            bool = Boolean.TRUE;
                        } else if (ordinal == 1) {
                            bool = Boolean.FALSE;
                        } else if (ordinal == 2 || ordinal == 3) {
                            if (!sg3.e(bool, Boolean.FALSE)) {
                                if (tf7 == tf7.y) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                bool3 = Boolean.valueOf(z2);
                            }
                        } else {
                            h.c();
                            return;
                        }
                        bool3 = bool;
                    }
                    eq4.g();
                    if (sg3.e(bool, Boolean.TRUE)) {
                        ((InputMethodManager) ((nz3) wr0.y).getValue()).restartInput((View) wr0.x);
                    }
                    if (bool3 != null) {
                        if (bool3.booleanValue()) {
                            ((rg4) ((ay4) wr0.z).x).s();
                        } else {
                            ((rg4) ((ay4) wr0.z).x).m();
                        }
                    }
                    if (sg3.e(bool, Boolean.FALSE)) {
                        ((InputMethodManager) ((nz3) wr0.y).getValue()).restartInput((View) wr0.x);
                        return;
                    }
                    return;
                }
                eq4.g();
                return;
            case 26:
                b();
                return;
            case 27:
                zc8 zc8 = (zc8) this.x;
                Log.w("FirebaseMessaging", "Service took too long to process intent: " + zc8.a.getAction() + " finishing.");
                zc8.b.d((Object) null);
                return;
            default:
                no7 no7 = (no7) this.x;
                ((za6) no7.A).v(new c9(25, no7));
                return;
        }
    }
}
