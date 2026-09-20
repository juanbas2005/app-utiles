package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.graphics.Canvas;
import android.net.NetworkRequest;
import android.os.Build;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.credentials.exceptions.GetCredentialCustomException;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.exceptions.publickeycredential.GetPublicKeyCredentialDomException;
import androidx.credentials.internal.FrameworkClassParsingException;
import cu.lestebang.utiletecsa.R;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: pv8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class pv8 {
    public static final float[][] a = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};
    public static final float[][] b = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};
    public static final float[] c = {95.047f, 100.0f, 108.883f};
    public static final float[][] d = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};
    public static final fw0 e = new fw0(-902818892, new xw0(6), false);
    public static final vr7 f = new vr7(true, 5);
    public static final vr7 g = new vr7(true, 1);
    public static final vr7 h = new vr7(false, 3);
    public static final vr7 i = new vr7(true, 2);
    public static final vr7 j = new vr7(true, 4);
    public static final vr7 k = new vr7(true, 6);
    public static final vr7 l = new vr7(false, 7);
    public static final zf3 m = new zf3(true, 2);
    public static final zf3 n = new zf3(true, 3);
    public static final zf3 o = new zf3(true, 0);
    public static final zf3 p = new zf3(true, 1);
    public static final int[] q = {13, 15, 14};
    public static final q86 r = new q86(new Object());
    public static final nh s = new nh(1022);
    public static x83 t;
    public static Method u;
    public static Method v;
    public static boolean w;
    public static x83 x;
    public static x83 y;
    public static x83 z;

    /* JADX WARNING: type inference failed for: r1v21, types: [java.lang.Object, p86] */
    static {
        new fw0(-1698044865, new ww0(11), false);
        new fw0(2077124918, new ww0(12), false);
        new fw0(-1252279561, new ww0(13), false);
        new fw0(-286716744, new ww0(14), false);
    }

    public static void A(Canvas canvas, boolean z2) {
        Method method;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 29) {
            if (!w) {
                Class<Canvas> cls = Canvas.class;
                if (i2 == 28) {
                    Class<Class> cls2 = Class.class;
                    try {
                        Method declaredMethod = cls2.getDeclaredMethod("getDeclaredMethod", new Class[]{String.class, new Class[0].getClass()});
                        u = (Method) declaredMethod.invoke(cls, new Object[]{"insertReorderBarrier", new Class[0]});
                        v = (Method) declaredMethod.invoke(cls, new Object[]{"insertInorderBarrier", new Class[0]});
                    } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                    }
                } else {
                    u = cls.getDeclaredMethod("insertReorderBarrier", (Class[]) null);
                    v = cls.getDeclaredMethod("insertInorderBarrier", (Class[]) null);
                }
                Method method2 = u;
                if (method2 != null) {
                    method2.setAccessible(true);
                }
                Method method3 = v;
                if (method3 != null) {
                    method3.setAccessible(true);
                }
                w = true;
            }
            if (z2) {
                try {
                    Method method4 = u;
                    if (method4 != null) {
                        method4.invoke(canvas, (Object[]) null);
                    }
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                    return;
                }
            }
            if (!z2 && (method = v) != null) {
                method.invoke(canvas, (Object[]) null);
            }
        } else if (z2) {
            canvas.enableZ();
        } else {
            canvas.disableZ();
        }
    }

    public static String B(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 11);
    }

    public static final void C(u44 u44) {
        vf7 vf7 = u44.e;
        if (vf7 != null) {
            u44.v.y(hf7.a((hf7) u44.d.x, (vl) null, 0, 3));
            rf7 rf7 = vf7.a;
            AtomicReference atomicReference = rf7.b;
            while (true) {
                if (!atomicReference.compareAndSet(vf7, (Object) null)) {
                    if (atomicReference.get() != vf7) {
                        break;
                    }
                } else {
                    rf7.a.c();
                    break;
                }
            }
        }
        u44.e = null;
    }

    public static final int D(View view, int i2) {
        int i3 = 0;
        int i4 = Integer.MAX_VALUE;
        Object obj = null;
        while (view != null) {
            Object tag = view.getTag(i2);
            if (tag != null) {
                if (obj != null) {
                    if (!tag.equals(obj)) {
                        break;
                    }
                } else {
                    obj = tag;
                }
                i4 = i3;
            }
            i3++;
            ViewParent k2 = z85.k(view);
            if (k2 instanceof View) {
                view = (View) k2;
            } else {
                view = null;
            }
        }
        return i4;
    }

    public static final View E(View view) {
        View view2;
        if (!view.isAttachedToWindow()) {
            return view;
        }
        int min = Math.min(D(view, R.id.view_tree_lifecycle_owner), D(view, R.id.view_tree_saved_state_registry_owner));
        View view3 = view;
        int i2 = 0;
        View view4 = view3;
        while (view != null) {
            if (i2 == min) {
                if (!(view.getParent() instanceof ViewGroup)) {
                    return view3;
                }
            } else if (H(view) == null) {
                i2++;
                ViewParent k2 = z85.k(view);
                if (k2 instanceof View) {
                    view2 = (View) k2;
                } else {
                    view2 = null;
                }
                View view5 = view3;
                view3 = view;
                view = view2;
                view4 = view5;
            }
            return view;
        }
        return view4;
    }

    public static gq0 F(String str, boolean z2) {
        String str2;
        str.getClass();
        int F0 = d57.F0(str, '`', 0, 6);
        if (F0 == -1) {
            F0 = str.length();
        }
        int K0 = d57.K0(F0, 4, str, "/");
        String str3 = "";
        if (K0 == -1) {
            str2 = k57.s0(str, "`", str3);
        } else {
            String replace = str.substring(0, K0).replace('/', '.');
            replace.getClass();
            str2 = k57.s0(str.substring(K0 + 1), "`", str3);
            str3 = replace;
        }
        return new gq0(new up2(str3), new up2(str2), z2);
    }

    public static final x83 G() {
        x83 x83 = t;
        if (x83 != null) {
            return x83;
        }
        w83 w83 = new w83("Rounded.Add", 24.0f, 24.0f, 24.0f, 24.0f, 0, 0, false, 96);
        int i2 = e38.a;
        ky6 ky6 = new ky6(jt0.b);
        be5 be5 = new be5();
        be5.j(18.0f, 13.0f);
        be5.g(-5.0f);
        be5.n(5.0f);
        be5.e(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        be5.l(-1.0f, -0.45f, -1.0f, -1.0f);
        be5.n(-5.0f);
        be5.f(6.0f);
        be5.e(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        be5.l(0.45f, -1.0f, 1.0f, -1.0f);
        be5.g(5.0f);
        be5.m(6.0f);
        be5.e(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        be5.l(1.0f, 0.45f, 1.0f, 1.0f);
        be5.n(5.0f);
        be5.g(5.0f);
        be5.e(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        be5.l(-0.45f, 1.0f, -1.0f, 1.0f);
        be5.c();
        w83.a(w83, be5.a, ky6, 14336);
        x83 b2 = w83.b();
        t = b2;
        return b2;
    }

    public static final yx0 H(View view) {
        WeakReference weakReference;
        Object tag = view.getTag(R.id.androidx_compose_ui_view_compose_view_context);
        if (tag instanceof WeakReference) {
            weakReference = (WeakReference) tag;
        } else {
            weakReference = null;
        }
        if (weakReference != null) {
            return (yx0) weakReference.get();
        }
        return null;
    }

    public static final x83 I() {
        x83 x83 = x;
        if (x83 != null) {
            return x83;
        }
        w83 w83 = new w83("Filled.ErrorOutline", 24.0f, 24.0f, 24.0f, 24.0f, 0, 0, false, 96);
        int i2 = e38.a;
        ky6 ky6 = new ky6(jt0.b);
        be5 be5 = new be5();
        be5.j(11.0f, 15.0f);
        be5.g(2.0f);
        be5.n(2.0f);
        be5.g(-2.0f);
        be5.c();
        be5.j(11.0f, 7.0f);
        be5.g(2.0f);
        be5.n(6.0f);
        be5.g(-2.0f);
        be5.c();
        be5.j(11.99f, 2.0f);
        be5.d(6.47f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        be5.l(4.47f, 10.0f, 9.99f, 10.0f);
        be5.d(17.52f, 22.0f, 22.0f, 17.52f, 22.0f, 12.0f);
        be5.k(17.52f, 2.0f, 11.99f, 2.0f);
        be5.c();
        be5.j(12.0f, 20.0f);
        be5.e(-4.42f, 0.0f, -8.0f, -3.58f, -8.0f, -8.0f);
        be5.l(3.58f, -8.0f, 8.0f, -8.0f);
        be5.l(8.0f, 3.58f, 8.0f, 8.0f);
        be5.l(-3.58f, 8.0f, -8.0f, 8.0f);
        be5.c();
        w83.a(w83, be5.a, ky6, 14336);
        x83 b2 = w83.b();
        x = b2;
        return b2;
    }

    public static final x83 J() {
        x83 x83 = y;
        if (x83 != null) {
            return x83;
        }
        w83 w83 = new w83("Rounded.Language", 24.0f, 24.0f, 24.0f, 24.0f, 0, 0, false, 96);
        int i2 = e38.a;
        ky6 ky6 = new ky6(jt0.b);
        be5 e2 = pb4.e(11.99f, 2.0f);
        e2.d(6.47f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        e2.l(4.47f, 10.0f, 9.99f, 10.0f);
        e2.d(17.52f, 22.0f, 22.0f, 17.52f, 22.0f, 12.0f);
        e2.k(17.52f, 2.0f, 11.99f, 2.0f);
        e2.c();
        e2.j(18.92f, 8.0f);
        e2.g(-2.95f);
        e2.e(-0.32f, -1.25f, -0.78f, -2.45f, -1.38f, -3.56f);
        e2.e(1.84f, 0.63f, 3.37f, 1.91f, 4.33f, 3.56f);
        e2.c();
        e2.j(12.0f, 4.04f);
        e2.e(0.83f, 1.2f, 1.48f, 2.53f, 1.91f, 3.96f);
        e2.g(-3.82f);
        e2.e(0.43f, -1.43f, 1.08f, -2.76f, 1.91f, -3.96f);
        e2.c();
        e2.j(4.26f, 14.0f);
        e2.d(4.1f, 13.36f, 4.0f, 12.69f, 4.0f, 12.0f);
        e2.l(0.1f, -1.36f, 0.26f, -2.0f);
        e2.g(3.38f);
        e2.e(-0.08f, 0.66f, -0.14f, 1.32f, -0.14f, 2.0f);
        e2.l(0.06f, 1.34f, 0.14f, 2.0f);
        e2.h(4.26f, 14.0f);
        e2.c();
        e2.j(5.08f, 16.0f);
        e2.g(2.95f);
        e2.e(0.32f, 1.25f, 0.78f, 2.45f, 1.38f, 3.56f);
        e2.e(-1.84f, -0.63f, -3.37f, -1.9f, -4.33f, -3.56f);
        b81.v(e2, 8.03f, 8.0f, 5.08f, 8.0f);
        e2.e(0.96f, -1.66f, 2.49f, -2.93f, 4.33f, -3.56f);
        e2.d(8.81f, 5.55f, 8.35f, 6.75f, 8.03f, 8.0f);
        e2.c();
        e2.j(12.0f, 19.96f);
        e2.e(-0.83f, -1.2f, -1.48f, -2.53f, -1.91f, -3.96f);
        e2.g(3.82f);
        e2.e(-0.43f, 1.43f, -1.08f, 2.76f, -1.91f, 3.96f);
        b81.v(e2, 14.34f, 14.0f, 9.66f, 14.0f);
        e2.e(-0.09f, -0.66f, -0.16f, -1.32f, -0.16f, -2.0f);
        e2.l(0.07f, -1.35f, 0.16f, -2.0f);
        e2.g(4.68f);
        e2.e(0.09f, 0.65f, 0.16f, 1.32f, 0.16f, 2.0f);
        e2.l(-0.07f, 1.34f, -0.16f, 2.0f);
        e2.c();
        e2.j(14.59f, 19.56f);
        e2.e(0.6f, -1.11f, 1.06f, -2.31f, 1.38f, -3.56f);
        e2.g(2.95f);
        e2.e(-0.96f, 1.65f, -2.49f, 2.93f, -4.33f, 3.56f);
        e2.c();
        e2.j(16.36f, 14.0f);
        e2.e(0.08f, -0.66f, 0.14f, -1.32f, 0.14f, -2.0f);
        e2.l(-0.06f, -1.34f, -0.14f, -2.0f);
        e2.g(3.38f);
        e2.e(0.16f, 0.64f, 0.26f, 1.31f, 0.26f, 2.0f);
        e2.l(-0.1f, 1.36f, -0.26f, 2.0f);
        e2.g(-3.38f);
        e2.c();
        w83.a(w83, e2.a, ky6, 14336);
        x83 b2 = w83.b();
        y = b2;
        return b2;
    }

    public static int K(float f2) {
        float f3;
        boolean z2;
        float f4;
        if (f2 < 1.0f) {
            return -16777216;
        }
        if (f2 > 99.0f) {
            return -1;
        }
        float f5 = (f2 + 16.0f) / 116.0f;
        if (f2 > 8.0f) {
            f3 = f5 * f5 * f5;
        } else {
            f3 = f2 / 903.2963f;
        }
        float f6 = f5 * f5 * f5;
        if (f6 > 0.008856452f) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            f4 = f6;
        } else {
            f4 = ((f5 * 116.0f) - 16.0f) / 903.2963f;
        }
        if (!z2) {
            f6 = ((f5 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = c;
        return yt0.a((double) (f4 * fArr[0]), (double) (f3 * fArr[1]), (double) (f6 * fArr[2]));
    }

    public static float L(int i2) {
        float pow;
        float f2 = ((float) i2) / 255.0f;
        if (f2 <= 0.04045f) {
            pow = f2 / 12.92f;
        } else {
            pow = (float) Math.pow((double) ((f2 + 0.055f) / 1.055f), 2.4000000953674316d);
        }
        return pow * 100.0f;
    }

    public static final void M(u44 u44, hf7 hf7, v35 v35) {
        vr2 vr2;
        ix6 h2 = j45.h();
        if (h2 != null) {
            vr2 = h2.e();
        } else {
            vr2 = null;
        }
        vr2 vr22 = vr2;
        ix6 j2 = j45.j(h2);
        try {
            cg7 d2 = u44.d();
            if (d2 == null) {
                j45.m(h2, j2, vr22);
                return;
            }
            vf7 vf7 = u44.e;
            if (vf7 == null) {
                j45.m(h2, j2, vr22);
                return;
            }
            dy3 c2 = u44.c();
            if (c2 == null) {
                j45.m(h2, j2, vr22);
                return;
            }
            u55.q(hf7, u44.a, d2.a, c2, vf7, u44.b(), v35);
            j45.m(h2, j2, vr22);
        } catch (Throwable th) {
            Throwable th2 = th;
            j45.m(h2, j2, vr22);
            throw th2;
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Object, h06] */
    public static final void N(rf7 rf7, u44 u44, hf7 hf7, c93 c93, v35 v35) {
        jz0 jz0 = u44.d;
        j71 j71 = u44.v;
        j71 j712 = u44.w;
        ? obj = new Object();
        h17 h17 = new h17(jz0, j71, obj, 2);
        ck5 ck5 = rf7.a;
        ck5.g(hf7, c93, h17, j712);
        vf7 vf7 = new vf7(rf7, ck5);
        rf7.b.set(vf7);
        obj.w = vf7;
        u44.e = vf7;
        M(u44, hf7, v35);
    }

    public static final long O(long j2) {
        return (((long) Float.floatToRawIntBits((float) ((int) (j2 & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits((float) ((int) (j2 >> 32)))) << 32);
    }

    public static gq0 P(up2 up2) {
        up2.getClass();
        return new gq0(up2.b(), up2.a.g());
    }

    public static float Q() {
        return ((float) Math.pow(0.5689655172413793d, 3.0d)) * 100.0f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:198:0x03d1, code lost:
        if (r4.h == r9) goto L_0x03d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x04ad, code lost:
        if (r8 > (r11 + 5000)) goto L_0x04af;
     */
    /* JADX WARNING: Removed duplicated region for block: B:282:0x061d A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:287:0x066f A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:295:0x06a4  */
    /* JADX WARNING: Removed duplicated region for block: B:296:0x06a7  */
    /* JADX WARNING: Removed duplicated region for block: B:302:0x06b8 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:307:0x071c  */
    /* JADX WARNING: Removed duplicated region for block: B:308:0x0728  */
    /* JADX WARNING: Removed duplicated region for block: B:311:0x075e  */
    /* JADX WARNING: Removed duplicated region for block: B:312:0x0760  */
    /* JADX WARNING: Removed duplicated region for block: B:315:0x0773  */
    /* JADX WARNING: Removed duplicated region for block: B:316:0x0775  */
    /* JADX WARNING: Removed duplicated region for block: B:319:0x0782 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:324:0x07bd A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:334:0x07ef  */
    /* JADX WARNING: Removed duplicated region for block: B:335:0x0804  */
    /* JADX WARNING: Removed duplicated region for block: B:342:0x082c  */
    /* JADX WARNING: Removed duplicated region for block: B:343:0x082e  */
    /* JADX WARNING: Removed duplicated region for block: B:350:0x0840  */
    /* JADX WARNING: Removed duplicated region for block: B:351:0x0842  */
    /* JADX WARNING: Removed duplicated region for block: B:354:0x084a A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:359:0x086b  */
    /* JADX WARNING: Removed duplicated region for block: B:361:0x086e  */
    /* JADX WARNING: Removed duplicated region for block: B:366:0x0891  */
    /* JADX WARNING: Removed duplicated region for block: B:367:0x0893  */
    /* JADX WARNING: Removed duplicated region for block: B:376:0x08c3  */
    /* JADX WARNING: Removed duplicated region for block: B:380:0x08d8  */
    /* JADX WARNING: Removed duplicated region for block: B:383:0x08fa  */
    /* JADX WARNING: Removed duplicated region for block: B:396:0x09a2  */
    /* JADX WARNING: Removed duplicated region for block: B:397:0x09a5  */
    /* JADX WARNING: Removed duplicated region for block: B:401:0x09b0  */
    /* JADX WARNING: Removed duplicated region for block: B:403:0x09be  */
    public static final void a(hf7 hf7, vr2 vr2, ml4 ml4, tg7 tg7, m78 m78, vr2 vr22, ap4 ap4, ky6 ky6, boolean z2, int i2, int i3, c93 c93, zs3 zs3, boolean z3, boolean z4, fw0 fw0, yt2 yt2, int i4, int i5) {
        int i6;
        int i7;
        yt2 yt22;
        z75 z75;
        se7 se7;
        Object obj;
        w98 w98;
        og ogVar;
        v35 v35;
        ok2 ok2;
        int i8;
        tl7 tl7;
        long j2;
        dl2 dl2;
        tp1 tp1;
        boolean z5;
        tg7 tg72;
        vl vlVar;
        ik2 ik2;
        boolean z6;
        boolean z7;
        boolean z8;
        hf7 hf72;
        yt2 yt23;
        ps7 ps7;
        ok2 ok22;
        wj5 wj5;
        boolean z9;
        int i9;
        boolean z10;
        c93 c932;
        boolean z11;
        boolean i10;
        yb0 yb0;
        int i11;
        int i12;
        Object obj2;
        yt2 yt24;
        int i13;
        ok2 ok23;
        v35 v352;
        hf7 hf73;
        boolean z12;
        ze7 ze7;
        c93 c933;
        o81 o81;
        rf7 rf7;
        u44 u44;
        vr2 vr23;
        u44 u442;
        boolean z13;
        boolean z14;
        ml4 ml42;
        o81 o812;
        int i14;
        ok2 ok24;
        ap4 ap42;
        ml4 ml43;
        rf7 rf72;
        ze7 ze72;
        u44 u443;
        gs2 gs2;
        w98 w982;
        boolean i15;
        Object Q;
        w98 w983;
        u44 u444;
        boolean z15;
        c93 c934;
        ml4 ml44;
        Object Q2;
        boolean i16;
        Object Q3;
        c93 c935;
        boolean z16;
        boolean booleanValue;
        Object Q4;
        ml4 ml45;
        Object obj3;
        long j3;
        Object Q5;
        String str;
        hf7 hf74 = hf7;
        vr2 vr24 = vr2;
        ml4 ml46 = ml4;
        tg7 tg73 = tg7;
        m78 m782 = m78;
        ap4 ap43 = ap4;
        boolean z17 = z2;
        int i17 = i2;
        c93 c936 = c93;
        zs3 zs32 = zs3;
        boolean z18 = z3;
        boolean z19 = z4;
        yt2 yt25 = yt2;
        int i18 = i4;
        int i19 = i5;
        yt25.g0(31062401);
        if ((i18 & 6) == 0) {
            i6 = i18 | (yt25.g(hf74) ? 4 : 2);
        } else {
            i6 = i18;
        }
        int i20 = 16;
        if ((i18 & 48) == 0) {
            i6 |= yt25.i(vr24) ? 32 : 16;
        }
        int i21 = 128;
        if ((i18 & 384) == 0) {
            i6 |= yt25.g(ml46) ? 256 : 128;
        }
        int i22 = 1024;
        if ((i18 & 3072) == 0) {
            i6 |= yt25.g(tg73) ? 2048 : 1024;
        }
        int i23 = 8192;
        if ((i18 & 24576) == 0) {
            i6 |= yt25.g(m782) ? 16384 : 8192;
        }
        int i24 = 131072;
        vr2 vr25 = vr22;
        if ((i18 & 196608) == 0) {
            i6 |= yt25.i(vr25) ? 131072 : 65536;
        }
        if ((i18 & 1572864) == 0) {
            i6 |= yt25.g(ap43) ? 1048576 : 524288;
        }
        ky6 ky62 = ky6;
        if ((i18 & 12582912) == 0) {
            i6 |= yt25.g(ky62) ? 8388608 : 4194304;
        }
        if ((i18 & 100663296) == 0) {
            i6 |= yt25.h(z17) ? 67108864 : 33554432;
        }
        if ((i18 & 805306368) == 0) {
            i6 |= yt25.e(i17) ? 536870912 : 268435456;
        }
        int i25 = i3;
        if ((i19 & 6) == 0) {
            i7 = i19 | (yt25.e(i25) ? 4 : 2);
        } else {
            i7 = i19;
        }
        if ((i19 & 48) == 0) {
            if (yt25.g(c936)) {
                i20 = 32;
            }
            i7 |= i20;
        }
        if ((i19 & 384) == 0) {
            if (yt25.g(zs32)) {
                i21 = 256;
            }
            i7 |= i21;
        }
        if ((i19 & 3072) == 0) {
            if (yt25.h(z18)) {
                i22 = 2048;
            }
            i7 |= i22;
        }
        if ((i19 & 24576) == 0) {
            if (yt25.h(z19)) {
                i23 = 16384;
            }
            i7 |= i23;
        }
        if ((i19 & 196608) == 0) {
            if (!yt25.i(fw0)) {
                i24 = 65536;
            }
            i7 |= i24;
        } else {
            fw0 fw02 = fw0;
        }
        int i26 = i7 | 1572864;
        if (yt25.V(i6 & 1, ((i6 & 306783379) == 306783378 && (i26 & 599187) == 599186) ? false : true)) {
            yt25.a0();
            if ((i18 & 1) != 0 && !yt25.C()) {
                yt25.Y();
            }
            yt25.s();
            Object Q6 = yt25.Q();
            Object obj4 = ay0.a;
            if (Q6 == obj4) {
                Q6 = new ok2();
                yt25.o0(Q6);
            }
            ok2 ok25 = (ok2) Q6;
            Object Q7 = yt25.Q();
            if (Q7 == obj4) {
                r44 r44 = s44.a;
                Q7 = new Object();
                yt25.o0(Q7);
            }
            og ogVar2 = (og) Q7;
            Object Q8 = yt25.Q();
            if (Q8 == obj4) {
                Q8 = new rf7(ogVar2);
                yt25.o0(Q8);
            }
            rf7 rf73 = (rf7) Q8;
            tp1 tp12 = (tp1) yt25.k(xy0.h);
            dl2 dl22 = (dl2) yt25.k(xy0.k);
            og ogVar3 = ogVar2;
            long j4 = ((ng7) yt25.k(og7.a)).b;
            ik2 ik22 = (ik2) yt25.k(xy0.i);
            w98 w984 = (w98) yt25.k(xy0.v);
            gy6 gy6 = (gy6) yt25.k(xy0.r);
            boolean z20 = i17 == 1 && !z2 && c936.a;
            z75 z752 = z75.w;
            z75 z753 = z20 ? z75.x : z752;
            yt25.e0(-213744626);
            Object[] objArr = {z753};
            kg5 kg5 = se7.g;
            long j5 = j4;
            boolean e2 = yt25.e(z753.ordinal());
            Object Q9 = yt25.Q();
            if (e2 || Q9 == obj4) {
                z75 = z753;
                Q9 = new zh(10, (Object) z75);
                yt25.o0(Q9);
            } else {
                z75 = z753;
            }
            se7 se72 = (se7) u55.t(objArr, kg5, (sr2) Q9, yt25, 0);
            yt25.r(false);
            if (((z75) se72.f.getValue()) != z75) {
                if (z75 == z752) {
                    str = "only single-line, non-wrap text fields can scroll horizontally";
                } else {
                    str = "single-line, non-wrap text fields can only scroll horizontally";
                }
                throw new IllegalArgumentException("Mismatching scroller orientation; ".concat(str));
            }
            int i27 = i6 & 14;
            boolean z21 = (i27 == 4) | ((i6 & 57344) == 16384);
            Object Q10 = yt25.Q();
            if (z21 || Q10 == obj4) {
                tl7 a2 = w18.a(m782, hf74.a);
                v35 v353 = a2.b;
                lg7 lg7 = hf74.c;
                if (lg7 != null) {
                    se7 = se72;
                    long j6 = lg7.a;
                    int i28 = lg7.c;
                    long j7 = j6;
                    int p2 = v353.p((int) (j7 >> 32));
                    int p3 = v353.p((int) (j7 & 4294967295L));
                    int min = Math.min(p2, p3);
                    int max = Math.max(p2, p3);
                    tl tlVar = new tl(a2.a);
                    tlVar.y.add(new sl((rl) new yy6(0, 0, (am2) null, (yl2) null, (zl2) null, (ea7) null, (String) null, 0, (h60) null, (lf7) null, (ya4) null, 0, rd7.c, (lq6) null, 61439), min, max, 8));
                    a2 = new tl7(tlVar.e(), v353);
                } else {
                    se7 = se72;
                }
                Q10 = a2;
                yt25.o0(Q10);
            } else {
                se7 = se72;
            }
            tl7 tl72 = (tl7) Q10;
            vl vlVar2 = tl72.a;
            v35 v354 = tl72.b;
            yx5 B = yt25.B();
            if (B != null) {
                B.b |= 1;
                boolean g2 = yt25.g(gy6);
                Object Q11 = yt25.Q();
                if (g2 || Q11 == obj4) {
                    ok2 = ok25;
                    yt2 yt26 = yt25;
                    gy6 gy62 = gy6;
                    vlVar = vlVar2;
                    yx5 yx5 = B;
                    obj = obj4;
                    tl7 = tl72;
                    i8 = i27;
                    v35 = v354;
                    tp1 = tp12;
                    dl2 = dl22;
                    ogVar = ogVar3;
                    ik2 = ik22;
                    w98 = w984;
                    j2 = j5;
                    tg72 = tg7;
                    z5 = z2;
                    u44 u445 = new u44(new td7(vlVar, tg72, z5, tp1, dl2, 0), yx5, gy62);
                    yt26.o0(u445);
                    Q11 = u445;
                } else {
                    tg72 = tg7;
                    ok2 = ok25;
                    obj = obj4;
                    yt2 yt27 = yt25;
                    vlVar = vlVar2;
                    tl7 = tl72;
                    i8 = i27;
                    v35 = v354;
                    tp1 = tp12;
                    dl2 = dl22;
                    ogVar = ogVar3;
                    ik2 = ik22;
                    w98 = w984;
                    j2 = j5;
                    z5 = z2;
                }
                u44 u446 = (u44) Q11;
                vl vlVar3 = hf74.a;
                long j8 = hf74.b;
                u446.u = vr2;
                u446.z = j2;
                ys3 ys3 = u446.r;
                ys3.b = zs32;
                ys3.c = ik2;
                u446.j = vlVar3;
                td7 td7 = u446.a;
                if (!sg3.e(td7.a, vlVar) || !sg3.e(td7.b, tg72) || td7.e != z5) {
                    z6 = true;
                    td7 = new td7(vlVar, tg72, z5, tp1, dl2, 0);
                } else {
                    z6 = true;
                    if (td7.f == 1) {
                        if (td7.c == Integer.MAX_VALUE) {
                            if (td7.d == 1) {
                                if (sg3.e(td7.g, tp1)) {
                                    if (sg3.e(td7.i, a42.w)) {
                                    }
                                }
                            }
                        }
                    }
                    td7 = new td7(vlVar, tg72, z5, tp1, dl2, 0);
                }
                tp1 tp13 = tp1;
                if (u446.a != td7) {
                    u446.p = z6;
                }
                u446.a = td7;
                jz0 jz0 = u446.d;
                vf7 vf7 = u446.e;
                jz0.getClass();
                lg7 lg72 = hf74.c;
                boolean e3 = sg3.e(lg72, ((i22) jz0.y).c());
                String str2 = ((hf7) jz0.x).a.x;
                vl vlVar4 = hf74.a;
                if (!sg3.e(str2, vlVar4.x)) {
                    jz0.y = new i22(vlVar4, j8);
                    z7 = z6;
                    z8 = false;
                } else {
                    if (!lg7.b(((hf7) jz0.x).b, j8)) {
                        ((i22) jz0.y).f(lg7.f(j8), lg7.e(j8));
                        z8 = z6;
                    } else {
                        z8 = false;
                    }
                    z7 = false;
                }
                if (lg72 == null) {
                    i22 i222 = (i22) jz0.y;
                    i222.z = -1;
                    i222.A = -1;
                } else {
                    long j9 = lg72.a;
                    if (!lg7.c(j9)) {
                        ((i22) jz0.y).e(lg7.f(j9), lg7.e(j9));
                    }
                }
                long j10 = 0;
                if (z7 || (!z8 && !e3)) {
                    i22 i223 = (i22) jz0.y;
                    i223.z = -1;
                    i223.A = -1;
                    hf72 = hf7.a(hf74, (vl) null, 0, 3);
                } else {
                    hf72 = hf74;
                }
                hf7 hf75 = (hf7) jz0.x;
                jz0.x = hf72;
                if (vf7 != null) {
                    vf7.a(hf75, hf72);
                }
                Object Q12 = yt2.Q();
                Object obj5 = obj;
                if (Q12 == obj5) {
                    Q12 = new Object();
                    yt23 = yt2;
                    yt23.o0(Q12);
                } else {
                    yt23 = yt2;
                }
                ps7 ps72 = (ps7) Q12;
                long currentTimeMillis = System.currentTimeMillis();
                if (!ps72.e) {
                    Long l2 = ps72.d;
                    if (l2 != null) {
                        j10 = l2.longValue();
                    }
                }
                ps72.d = Long.valueOf(currentTimeMillis);
                ps72.a(hf74);
                Object Q13 = yt23.Q();
                if (Q13 == obj5) {
                    Q13 = t49.D(yt23);
                    yt23.o0(Q13);
                }
                o81 o813 = (o81) Q13;
                Object Q14 = yt23.Q();
                if (Q14 == obj5) {
                    Q14 = new yb0();
                    yt23.o0(Q14);
                }
                yb0 yb02 = (yb0) Q14;
                Object Q15 = yt23.Q();
                if (Q15 == obj5) {
                    Q15 = new ze7(ps72);
                    yt23.o0(Q15);
                }
                ze7 ze73 = (ze7) Q15;
                v35 v355 = v35;
                ze73.b = v355;
                ze73.f = m78;
                ze73.c = u446.v;
                ze73.d = u446;
                ze73.e.setValue(hf74);
                ze73.w = new lg7(j8);
                ze73.h = (bs0) yt23.k(xy0.f);
                ze73.i = o813;
                ug7 ug7 = (ug7) yt23.k(xy0.s);
                ze73.k = (my2) yt23.k(xy0.l);
                ok2 ok26 = ok2;
                ze73.l = ok26;
                boolean z22 = !z4;
                ik2 ik23 = ik2;
                ze73.m.setValue(Boolean.valueOf(z22));
                ze73.n.setValue(Boolean.valueOf(z3));
                yt23.e0(1966756105);
                ya4 ya4 = tg7.a.k;
                t37 t37 = xj5.a;
                yt23.e0(430530635);
                if (Build.VERSION.SDK_INT < 28) {
                    z9 = false;
                    yt23.r(false);
                    ps7 = ps72;
                    ok22 = ok26;
                    wj5 = null;
                } else {
                    Context context = (Context) yt23.k(ye.b);
                    e81 e81 = (e81) yt23.k(xj5.a);
                    boolean g3 = yt23.g(e81) | yt23.g(context) | yt23.g(ya4);
                    ps7 = ps72;
                    Object Q16 = yt23.Q();
                    if (g3 || Q16 == obj5) {
                        xj5.b.getClass();
                        ok22 = ok26;
                        Q16 = new wj5(e81, context, hj6.w, ya4);
                        yt23.o0(Q16);
                    } else {
                        ok22 = ok26;
                    }
                    wj5 = (wj5) Q16;
                    z9 = false;
                    yt23.r(false);
                }
                ze73.j = wj5;
                yt23.r(z9);
                u446.b();
                int i29 = i26;
                int i30 = i29 & 7168;
                rf7 rf74 = rf73;
                int i31 = i8;
                boolean z23 = z22;
                boolean i32 = yt23.i(u446) | (i30 == 2048) | ((i29 & 57344) == 16384) | yt23.i(rf74) | (i31 == 4);
                int i33 = (i29 & 112) ^ 48;
                if (i33 > 32) {
                    c932 = c93;
                    if (yt23.g(c932)) {
                        z10 = i32;
                        i9 = i29;
                        z11 = true;
                        i10 = z10 | z11 | yt23.i(v355) | yt23.i(o813) | yt23.i(yb02) | yt23.i(ze73);
                        Object Q17 = yt23.Q();
                        if (!i10 || Q17 == obj5) {
                            ok2 ok27 = ok22;
                            i12 = i31;
                            c93 c937 = c932;
                            yt24 = yt23;
                            v35 v356 = v355;
                            ok23 = ok27;
                            u44 = u446;
                            i13 = i30;
                            obj2 = obj5;
                            i11 = i9;
                            hf7 hf76 = hf7;
                            boolean z24 = z3;
                            vr23 = new m71(u44, z24, z4, rf74, hf76, c937, v356, ze73, o813, yb02);
                            o81 = o813;
                            yb0 = yb02;
                            hf73 = hf76;
                            v352 = v356;
                            ze7 = ze73;
                            z12 = z24;
                            rf7 = rf74;
                            c933 = c937;
                            yt24.o0(vr23);
                        } else {
                            vr23 = Q17;
                            u44 = u446;
                            i13 = i30;
                            rf7 = rf74;
                            obj2 = obj5;
                            ze7 = ze73;
                            o81 = o813;
                            c933 = c932;
                            i11 = i9;
                            hf73 = hf7;
                            z12 = z3;
                            yt24 = yt23;
                            yb0 = yb02;
                            v352 = v355;
                            ok23 = ok22;
                            i12 = i31;
                        }
                        ml4 ml47 = jl4.w;
                        ap4 ap44 = ap4;
                        ml4 n2 = dh4.n(sg3.K(uq3.s(ml47, ok23), vr23), z12, ap44);
                        aq4 v2 = u55.v(Boolean.valueOf(!z12 && !z4), yt24);
                        boolean g4 = yt24.g(v2) | yt24.i(u44) | yt24.i(rf7) | yt24.i(ze7);
                        aq4 aq4 = v2;
                        if (i33 <= 32 || !yt24.g(c933)) {
                            u442 = u44;
                            if ((i11 & 48) != 32) {
                                z13 = false;
                                z14 = g4 | z13;
                                Object Q18 = yt24.Q();
                                if (!z14 || Q18 == obj2) {
                                    ze7 ze74 = ze7;
                                    c93 c938 = c933;
                                    ze72 = ze74;
                                    o812 = o81;
                                    ok24 = ok23;
                                    ml42 = n2;
                                    ml43 = ml47;
                                    rf7 rf75 = rf7;
                                    i14 = i33;
                                    u443 = u442;
                                    ap42 = ap4;
                                    gs2 = new w6(u443, aq4, rf75, ze72, c938, (f61) null, 4);
                                    rf72 = rf75;
                                    yt24.o0(gs2);
                                } else {
                                    gs2 = Q18;
                                    o812 = o81;
                                    ze72 = ze7;
                                    ok24 = ok23;
                                    ml42 = n2;
                                    u443 = u442;
                                    ml43 = ml47;
                                    i14 = i33;
                                    ap42 = ap44;
                                    rf72 = rf7;
                                }
                                t49.h(gs2, yt24, vs7.a);
                                ze7 ze75 = ze72;
                                boolean z25 = z12;
                                v35 v357 = v352;
                                ml4 a3 = d97.a(ml43, 8675309, new wf(5, new j71(u443, 4)));
                                ok2 ok28 = ok24;
                                ne7 ne7 = new ne7(u443, ok28, z4, z25, ze75, v357);
                                ok2 ok29 = ok28;
                                ze7 ze76 = ze75;
                                rf7 rf76 = rf72;
                                ml4 d2 = (!z3 ? gw8.p(a3, new gc5(25, (Object) ne7, (Object) ap42)) : a3).d(new b97(ze76.A, ze76.z, new wf(8, ze76), 4));
                                ok5.a.getClass();
                                ml4 y2 = p25.y(d2, r16.p);
                                ml4 x2 = x(ml43, new g5((Object) u443, (Object) hf73, (Object) v357, 10));
                                w982 = w98;
                                boolean i34 = yt24.i(u443) | (i13 != 2048) | yt24.g(w982) | yt24.i(ze76);
                                int i35 = i12;
                                i15 = i34 | (i35 != 4) | yt24.i(v357);
                                Q = yt24.Q();
                                if (!i15 || Q == obj2) {
                                    n71 n71 = new n71(u443, z3, w982, ze76, hf73, v357);
                                    w983 = w982;
                                    yt24.o0(n71);
                                    Q = n71;
                                } else {
                                    w983 = w982;
                                }
                                ml4 I = h49.I(ml43, (vr2) Q);
                                ml4 ml48 = y2;
                                v35 v358 = v357;
                                c93 c939 = c93;
                                boolean z26 = z3;
                                u44 u447 = u443;
                                ml4 ml49 = ml48;
                                ze7 ze77 = ze76;
                                rf7 rf77 = rf76;
                                u71 u71 = new u71(tl7, hf7, u447, z4, z26, m78 instanceof zd5, v358, ze77, c939, ok29);
                                u444 = u447;
                                z15 = z26;
                                c934 = c939;
                                u71 u712 = u71;
                                if (!(!z15 && !z4 && ((k44) w983).b() && lg7.c(((lg7) u444.A.getValue()).a) && lg7.c(((lg7) u444.B.getValue()).a))) {
                                    u44 u448 = u444;
                                    u444 = u448;
                                    ml44 = gw8.p(ml43, new uo2((Object) ky6, (Object) u448, (Object) hf7, (Object) v358, 9));
                                } else {
                                    ml44 = ml43;
                                }
                                boolean i36 = yt24.i(ze77);
                                Q2 = yt24.Q();
                                if (i36 || Q2 == obj2) {
                                    Q2 = new o71(ze77, 0);
                                    yt24.o0(Q2);
                                }
                                t49.e(ze77, (vr2) Q2, yt24);
                                i16 = yt24.i(u444) | yt24.i(rf77) | (i35 != 4) | ((i14 > 32 && yt24.g(c934)) || (i11 & 48) == 32);
                                Q3 = yt24.Q();
                                if (!i16 || Q3 == obj2) {
                                    c93 c9310 = c934;
                                    qj qjVar = new qj((Object) u444, (Object) rf77, (Object) hf7, (Object) c9310, 2);
                                    c935 = c9310;
                                    yt24.o0(qjVar);
                                    Q3 = qjVar;
                                } else {
                                    c935 = c934;
                                }
                                t49.e(c935, (vr2) Q3, yt24);
                                u71 u713 = u712;
                                ze7 ze78 = ze77;
                                v35 v359 = v358;
                                ze7 ze79 = ze78;
                                ml4 p4 = gw8.p(ml43, new ie7(u444, ze78, hf7, z23, i2 != 1, v359, ps7, u444.v, c935.e));
                                int i37 = c935.d;
                                z16 = i37 == 7 && i37 == 8;
                                booleanValue = ((Boolean) aq4.getValue()).booleanValue();
                                og ogVar4 = ogVar;
                                boolean h2 = yt24.h(z16) | yt24.i(ogVar4);
                                Q4 = yt24.Q();
                                if (h2 || Q4 == obj2) {
                                    Q4 = new j11(2, ogVar4, z16);
                                    yt24.o0(Q4);
                                }
                                sr2 sr2 = (sr2) Q4;
                                if (!booleanValue || !e67.a) {
                                    ml45 = ml43;
                                } else {
                                    ml45 = (z16 ? new f67(uq3.g) : ml43).d(new c67(sr2));
                                }
                                obj3 = (kc0) yt24.k(y10.a);
                                j3 = ((jt0) yt24.k(y10.b)).a;
                                v35 v3510 = v359;
                                if (!jt0.c(j3, uq3.c(1308617531))) {
                                    obj3 = new ky6(j3);
                                }
                                boolean i38 = yt24.i(u444) | yt24.g(obj3);
                                Q5 = yt24.Q();
                                if (i38 || Q5 == obj2) {
                                    Q5 = new m0(13, u444, obj3);
                                    yt24.o0(Q5);
                                }
                                se7 se73 = se7;
                                o81 o814 = o812;
                                ml4 f2 = kl8.f(h49.I(t49.V(t49.V(fd1.R(ml4.d(z(ml43, (vr2) Q5)), ogVar4, u444, ze79).d(ml45).d(ml42), new e3(21, (Object) ik23, (Object) u444)), new e3(4, (Object) u444, (Object) ze79)).d(p4).d(new zx0(new n92(se73, z15, ap4))).d(ml49).d(u713), new j71(u444, 0)), new dx4(19, ze79, o814));
                                boolean z27 = z15 && u444.b() && ((Boolean) u444.q.getValue()).booleanValue() && ((k44) w983).b();
                                ze7 ze710 = ze79;
                                yt22 = yt2;
                                b(f2, ze710, su0.J(-814563849, new k71(fw0, tg7, u444, i3, i2, z20, z2, se73, hf7, m78, ml44, x2, I, (!z27 || !sd4.a()) ? ml43 : gw8.p(ml43, new xa7(20, (Object) ze79)), yb0, ze710, z27, z4, w983, o814, vr22, v3510, tp13), yt22), yt22, 384);
                            }
                        } else {
                            u442 = u44;
                        }
                        z13 = true;
                        z14 = g4 | z13;
                        Object Q182 = yt24.Q();
                        if (!z14) {
                        }
                        ze7 ze742 = ze7;
                        c93 c9382 = c933;
                        ze72 = ze742;
                        o812 = o81;
                        ok24 = ok23;
                        ml42 = n2;
                        ml43 = ml47;
                        rf7 rf752 = rf7;
                        i14 = i33;
                        u443 = u442;
                        ap42 = ap4;
                        gs2 = new w6(u443, aq4, rf752, ze72, c9382, (f61) null, 4);
                        rf72 = rf752;
                        yt24.o0(gs2);
                        t49.h(gs2, yt24, vs7.a);
                        ze7 ze752 = ze72;
                        boolean z252 = z12;
                        v35 v3572 = v352;
                        ml4 a32 = d97.a(ml43, 8675309, new wf(5, new j71(u443, 4)));
                        ok2 ok282 = ok24;
                        ne7 ne72 = new ne7(u443, ok282, z4, z252, ze752, v3572);
                        ok2 ok292 = ok282;
                        ze7 ze762 = ze752;
                        rf7 rf762 = rf72;
                        ml4 d22 = (!z3 ? gw8.p(a32, new gc5(25, (Object) ne72, (Object) ap42)) : a32).d(new b97(ze762.A, ze762.z, new wf(8, ze762), 4));
                        ok5.a.getClass();
                        ml4 y22 = p25.y(d22, r16.p);
                        ml4 x22 = x(ml43, new g5((Object) u443, (Object) hf73, (Object) v3572, 10));
                        w982 = w98;
                        boolean i342 = yt24.i(u443) | (i13 != 2048) | yt24.g(w982) | yt24.i(ze762);
                        int i352 = i12;
                        i15 = i342 | (i352 != 4) | yt24.i(v3572);
                        Q = yt24.Q();
                        if (!i15) {
                        }
                        n71 n712 = new n71(u443, z3, w982, ze762, hf73, v3572);
                        w983 = w982;
                        yt24.o0(n712);
                        Q = n712;
                        ml4 I2 = h49.I(ml43, (vr2) Q);
                        ml4 ml482 = y22;
                        v35 v3582 = v3572;
                        c93 c9392 = c93;
                        boolean z262 = z3;
                        u44 u4472 = u443;
                        ml4 ml492 = ml482;
                        ze7 ze772 = ze762;
                        rf7 rf772 = rf762;
                        u71 u714 = new u71(tl7, hf7, u4472, z4, z262, m78 instanceof zd5, v3582, ze772, c9392, ok292);
                        u444 = u4472;
                        z15 = z262;
                        c934 = c9392;
                        u71 u7122 = u714;
                        if (!(!z15 && !z4 && ((k44) w983).b() && lg7.c(((lg7) u444.A.getValue()).a) && lg7.c(((lg7) u444.B.getValue()).a))) {
                        }
                        boolean i362 = yt24.i(ze772);
                        Q2 = yt24.Q();
                        Q2 = new o71(ze772, 0);
                        yt24.o0(Q2);
                        t49.e(ze772, (vr2) Q2, yt24);
                        i16 = yt24.i(u444) | yt24.i(rf772) | (i352 != 4) | ((i14 > 32 && yt24.g(c934)) || (i11 & 48) == 32);
                        Q3 = yt24.Q();
                        if (!i16) {
                        }
                        c93 c93102 = c934;
                        qj qjVar2 = new qj((Object) u444, (Object) rf772, (Object) hf7, (Object) c93102, 2);
                        c935 = c93102;
                        yt24.o0(qjVar2);
                        Q3 = qjVar2;
                        t49.e(c935, (vr2) Q3, yt24);
                        u71 u7132 = u7122;
                        ze7 ze782 = ze772;
                        v35 v3592 = v3582;
                        ze7 ze792 = ze782;
                        ml4 p42 = gw8.p(ml43, new ie7(u444, ze782, hf7, z23, i2 != 1, v3592, ps7, u444.v, c935.e));
                        int i372 = c935.d;
                        if (i372 == 7 || i372 == 8) {
                        }
                        booleanValue = ((Boolean) aq4.getValue()).booleanValue();
                        og ogVar42 = ogVar;
                        boolean h22 = yt24.h(z16) | yt24.i(ogVar42);
                        Q4 = yt24.Q();
                        Q4 = new j11(2, ogVar42, z16);
                        yt24.o0(Q4);
                        sr2 sr22 = (sr2) Q4;
                        if (!booleanValue || !e67.a) {
                        }
                        obj3 = (kc0) yt24.k(y10.a);
                        j3 = ((jt0) yt24.k(y10.b)).a;
                        v35 v35102 = v3592;
                        if (!jt0.c(j3, uq3.c(1308617531))) {
                        }
                        boolean i382 = yt24.i(u444) | yt24.g(obj3);
                        Q5 = yt24.Q();
                        Q5 = new m0(13, u444, obj3);
                        yt24.o0(Q5);
                        se7 se732 = se7;
                        o81 o8142 = o812;
                        ml4 f22 = kl8.f(h49.I(t49.V(t49.V(fd1.R(ml4.d(z(ml43, (vr2) Q5)), ogVar42, u444, ze792).d(ml45).d(ml42), new e3(21, (Object) ik23, (Object) u444)), new e3(4, (Object) u444, (Object) ze792)).d(p42).d(new zx0(new n92(se732, z15, ap4))).d(ml492).d(u7132), new j71(u444, 0)), new dx4(19, ze792, o8142));
                        if (z15 || u444.b() || ((Boolean) u444.q.getValue()).booleanValue() || ((k44) w983).b()) {
                        }
                        ze7 ze7102 = ze792;
                        yt22 = yt2;
                        b(f22, ze7102, su0.J(-814563849, new k71(fw0, tg7, u444, i3, i2, z20, z2, se732, hf7, m78, ml44, x22, I2, (!z27 || !sd4.a()) ? ml43 : gw8.p(ml43, new xa7(20, (Object) ze792)), yb0, ze7102, z27, z4, w983, o8142, vr22, v35102, tp13), yt22), yt22, 384);
                    }
                } else {
                    c932 = c93;
                }
                z10 = i32;
                i9 = i29;
                if ((i29 & 48) != 32) {
                    z11 = false;
                    i10 = z10 | z11 | yt23.i(v355) | yt23.i(o813) | yt23.i(yb02) | yt23.i(ze73);
                    Object Q172 = yt23.Q();
                    if (!i10) {
                    }
                    ok2 ok272 = ok22;
                    i12 = i31;
                    c93 c9372 = c932;
                    yt24 = yt23;
                    v35 v3562 = v355;
                    ok23 = ok272;
                    u44 = u446;
                    i13 = i30;
                    obj2 = obj5;
                    i11 = i9;
                    hf7 hf762 = hf7;
                    boolean z242 = z3;
                    vr23 = new m71(u44, z242, z4, rf74, hf762, c9372, v3562, ze73, o813, yb02);
                    o81 = o813;
                    yb0 = yb02;
                    hf73 = hf762;
                    v352 = v3562;
                    ze7 = ze73;
                    z12 = z242;
                    rf7 = rf74;
                    c933 = c9372;
                    yt24.o0(vr23);
                    ml4 ml472 = jl4.w;
                    ap4 ap442 = ap4;
                    ml4 n22 = dh4.n(sg3.K(uq3.s(ml472, ok23), vr23), z12, ap442);
                    aq4 v22 = u55.v(Boolean.valueOf(!z12 && !z4), yt24);
                    boolean g42 = yt24.g(v22) | yt24.i(u44) | yt24.i(rf7) | yt24.i(ze7);
                    aq4 aq42 = v22;
                    if (i33 <= 32 || !yt24.g(c933)) {
                    }
                    z13 = true;
                    z14 = g42 | z13;
                    Object Q1822 = yt24.Q();
                    if (!z14) {
                    }
                    ze7 ze7422 = ze7;
                    c93 c93822 = c933;
                    ze72 = ze7422;
                    o812 = o81;
                    ok24 = ok23;
                    ml42 = n22;
                    ml43 = ml472;
                    rf7 rf7522 = rf7;
                    i14 = i33;
                    u443 = u442;
                    ap42 = ap4;
                    gs2 = new w6(u443, aq42, rf7522, ze72, c93822, (f61) null, 4);
                    rf72 = rf7522;
                    yt24.o0(gs2);
                    t49.h(gs2, yt24, vs7.a);
                    ze7 ze7522 = ze72;
                    boolean z2522 = z12;
                    v35 v35722 = v352;
                    ml4 a322 = d97.a(ml43, 8675309, new wf(5, new j71(u443, 4)));
                    ok2 ok2822 = ok24;
                    ne7 ne722 = new ne7(u443, ok2822, z4, z2522, ze7522, v35722);
                    ok2 ok2922 = ok2822;
                    ze7 ze7622 = ze7522;
                    rf7 rf7622 = rf72;
                    ml4 d222 = (!z3 ? gw8.p(a322, new gc5(25, (Object) ne722, (Object) ap42)) : a322).d(new b97(ze7622.A, ze7622.z, new wf(8, ze7622), 4));
                    ok5.a.getClass();
                    ml4 y222 = p25.y(d222, r16.p);
                    ml4 x222 = x(ml43, new g5((Object) u443, (Object) hf73, (Object) v35722, 10));
                    w982 = w98;
                    boolean i3422 = yt24.i(u443) | (i13 != 2048) | yt24.g(w982) | yt24.i(ze7622);
                    int i3522 = i12;
                    i15 = i3422 | (i3522 != 4) | yt24.i(v35722);
                    Q = yt24.Q();
                    if (!i15) {
                    }
                    n71 n7122 = new n71(u443, z3, w982, ze7622, hf73, v35722);
                    w983 = w982;
                    yt24.o0(n7122);
                    Q = n7122;
                    ml4 I22 = h49.I(ml43, (vr2) Q);
                    ml4 ml4822 = y222;
                    v35 v35822 = v35722;
                    c93 c93922 = c93;
                    boolean z2622 = z3;
                    u44 u44722 = u443;
                    ml4 ml4922 = ml4822;
                    ze7 ze7722 = ze7622;
                    rf7 rf7722 = rf7622;
                    u71 u7142 = new u71(tl7, hf7, u44722, z4, z2622, m78 instanceof zd5, v35822, ze7722, c93922, ok2922);
                    u444 = u44722;
                    z15 = z2622;
                    c934 = c93922;
                    u71 u71222 = u7142;
                    if (!(!z15 && !z4 && ((k44) w983).b() && lg7.c(((lg7) u444.A.getValue()).a) && lg7.c(((lg7) u444.B.getValue()).a))) {
                    }
                    boolean i3622 = yt24.i(ze7722);
                    Q2 = yt24.Q();
                    Q2 = new o71(ze7722, 0);
                    yt24.o0(Q2);
                    t49.e(ze7722, (vr2) Q2, yt24);
                    i16 = yt24.i(u444) | yt24.i(rf7722) | (i3522 != 4) | ((i14 > 32 && yt24.g(c934)) || (i11 & 48) == 32);
                    Q3 = yt24.Q();
                    if (!i16) {
                    }
                    c93 c931022 = c934;
                    qj qjVar22 = new qj((Object) u444, (Object) rf7722, (Object) hf7, (Object) c931022, 2);
                    c935 = c931022;
                    yt24.o0(qjVar22);
                    Q3 = qjVar22;
                    t49.e(c935, (vr2) Q3, yt24);
                    u71 u71322 = u71222;
                    ze7 ze7822 = ze7722;
                    v35 v35922 = v35822;
                    ze7 ze7922 = ze7822;
                    ml4 p422 = gw8.p(ml43, new ie7(u444, ze7822, hf7, z23, i2 != 1, v35922, ps7, u444.v, c935.e));
                    int i3722 = c935.d;
                    if (i3722 == 7 && i3722 == 8) {
                    }
                    booleanValue = ((Boolean) aq42.getValue()).booleanValue();
                    og ogVar422 = ogVar;
                    boolean h222 = yt24.h(z16) | yt24.i(ogVar422);
                    Q4 = yt24.Q();
                    Q4 = new j11(2, ogVar422, z16);
                    yt24.o0(Q4);
                    sr2 sr222 = (sr2) Q4;
                    if (!booleanValue || !e67.a) {
                    }
                    obj3 = (kc0) yt24.k(y10.a);
                    j3 = ((jt0) yt24.k(y10.b)).a;
                    v35 v351022 = v35922;
                    if (!jt0.c(j3, uq3.c(1308617531))) {
                    }
                    boolean i3822 = yt24.i(u444) | yt24.g(obj3);
                    Q5 = yt24.Q();
                    Q5 = new m0(13, u444, obj3);
                    yt24.o0(Q5);
                    se7 se7322 = se7;
                    o81 o81422 = o812;
                    ml4 f222 = kl8.f(h49.I(t49.V(t49.V(fd1.R(ml4.d(z(ml43, (vr2) Q5)), ogVar422, u444, ze7922).d(ml45).d(ml42), new e3(21, (Object) ik23, (Object) u444)), new e3(4, (Object) u444, (Object) ze7922)).d(p422).d(new zx0(new n92(se7322, z15, ap4))).d(ml4922).d(u71322), new j71(u444, 0)), new dx4(19, ze7922, o81422));
                    if (z15 || u444.b() || ((Boolean) u444.q.getValue()).booleanValue() || ((k44) w983).b()) {
                    }
                    ze7 ze71022 = ze7922;
                    yt22 = yt2;
                    b(f222, ze71022, su0.J(-814563849, new k71(fw0, tg7, u444, i3, i2, z20, z2, se7322, hf7, m78, ml44, x222, I22, (!z27 || !sd4.a()) ? ml43 : gw8.p(ml43, new xa7(20, (Object) ze7922)), yb0, ze71022, z27, z4, w983, o81422, vr22, v351022, tp13), yt22), yt22, 384);
                }
                z11 = true;
                i10 = z10 | z11 | yt23.i(v355) | yt23.i(o813) | yt23.i(yb02) | yt23.i(ze73);
                Object Q1722 = yt23.Q();
                if (!i10) {
                }
                ok2 ok2722 = ok22;
                i12 = i31;
                c93 c93722 = c932;
                yt24 = yt23;
                v35 v35622 = v355;
                ok23 = ok2722;
                u44 = u446;
                i13 = i30;
                obj2 = obj5;
                i11 = i9;
                hf7 hf7622 = hf7;
                boolean z2422 = z3;
                vr23 = new m71(u44, z2422, z4, rf74, hf7622, c93722, v35622, ze73, o813, yb02);
                o81 = o813;
                yb0 = yb02;
                hf73 = hf7622;
                v352 = v35622;
                ze7 = ze73;
                z12 = z2422;
                rf7 = rf74;
                c933 = c93722;
                yt24.o0(vr23);
                ml4 ml4722 = jl4.w;
                ap4 ap4422 = ap4;
                ml4 n222 = dh4.n(sg3.K(uq3.s(ml4722, ok23), vr23), z12, ap4422);
                aq4 v222 = u55.v(Boolean.valueOf(!z12 && !z4), yt24);
                boolean g422 = yt24.g(v222) | yt24.i(u44) | yt24.i(rf7) | yt24.i(ze7);
                aq4 aq422 = v222;
                if (i33 <= 32 || !yt24.g(c933)) {
                }
                z13 = true;
                z14 = g422 | z13;
                Object Q18222 = yt24.Q();
                if (!z14) {
                }
                ze7 ze74222 = ze7;
                c93 c938222 = c933;
                ze72 = ze74222;
                o812 = o81;
                ok24 = ok23;
                ml42 = n222;
                ml43 = ml4722;
                rf7 rf75222 = rf7;
                i14 = i33;
                u443 = u442;
                ap42 = ap4;
                gs2 = new w6(u443, aq422, rf75222, ze72, c938222, (f61) null, 4);
                rf72 = rf75222;
                yt24.o0(gs2);
                t49.h(gs2, yt24, vs7.a);
                ze7 ze75222 = ze72;
                boolean z25222 = z12;
                v35 v357222 = v352;
                ml4 a3222 = d97.a(ml43, 8675309, new wf(5, new j71(u443, 4)));
                ok2 ok28222 = ok24;
                ne7 ne7222 = new ne7(u443, ok28222, z4, z25222, ze75222, v357222);
                ok2 ok29222 = ok28222;
                ze7 ze76222 = ze75222;
                rf7 rf76222 = rf72;
                ml4 d2222 = (!z3 ? gw8.p(a3222, new gc5(25, (Object) ne7222, (Object) ap42)) : a3222).d(new b97(ze76222.A, ze76222.z, new wf(8, ze76222), 4));
                ok5.a.getClass();
                ml4 y2222 = p25.y(d2222, r16.p);
                ml4 x2222 = x(ml43, new g5((Object) u443, (Object) hf73, (Object) v357222, 10));
                w982 = w98;
                boolean i34222 = yt24.i(u443) | (i13 != 2048) | yt24.g(w982) | yt24.i(ze76222);
                int i35222 = i12;
                i15 = i34222 | (i35222 != 4) | yt24.i(v357222);
                Q = yt24.Q();
                if (!i15) {
                }
                n71 n71222 = new n71(u443, z3, w982, ze76222, hf73, v357222);
                w983 = w982;
                yt24.o0(n71222);
                Q = n71222;
                ml4 I222 = h49.I(ml43, (vr2) Q);
                ml4 ml48222 = y2222;
                v35 v358222 = v357222;
                c93 c939222 = c93;
                boolean z26222 = z3;
                u44 u447222 = u443;
                ml4 ml49222 = ml48222;
                ze7 ze77222 = ze76222;
                rf7 rf77222 = rf76222;
                u71 u71422 = new u71(tl7, hf7, u447222, z4, z26222, m78 instanceof zd5, v358222, ze77222, c939222, ok29222);
                u444 = u447222;
                z15 = z26222;
                c934 = c939222;
                u71 u712222 = u71422;
                if (!(!z15 && !z4 && ((k44) w983).b() && lg7.c(((lg7) u444.A.getValue()).a) && lg7.c(((lg7) u444.B.getValue()).a))) {
                }
                boolean i36222 = yt24.i(ze77222);
                Q2 = yt24.Q();
                Q2 = new o71(ze77222, 0);
                yt24.o0(Q2);
                t49.e(ze77222, (vr2) Q2, yt24);
                i16 = yt24.i(u444) | yt24.i(rf77222) | (i35222 != 4) | ((i14 > 32 && yt24.g(c934)) || (i11 & 48) == 32);
                Q3 = yt24.Q();
                if (!i16) {
                }
                c93 c9310222 = c934;
                qj qjVar222 = new qj((Object) u444, (Object) rf77222, (Object) hf7, (Object) c9310222, 2);
                c935 = c9310222;
                yt24.o0(qjVar222);
                Q3 = qjVar222;
                t49.e(c935, (vr2) Q3, yt24);
                u71 u713222 = u712222;
                ze7 ze78222 = ze77222;
                v35 v359222 = v358222;
                ze7 ze79222 = ze78222;
                ml4 p4222 = gw8.p(ml43, new ie7(u444, ze78222, hf7, z23, i2 != 1, v359222, ps7, u444.v, c935.e));
                int i37222 = c935.d;
                if (i37222 == 7 && i37222 == 8) {
                }
                booleanValue = ((Boolean) aq422.getValue()).booleanValue();
                og ogVar4222 = ogVar;
                boolean h2222 = yt24.h(z16) | yt24.i(ogVar4222);
                Q4 = yt24.Q();
                Q4 = new j11(2, ogVar4222, z16);
                yt24.o0(Q4);
                sr2 sr2222 = (sr2) Q4;
                if (!booleanValue || !e67.a) {
                }
                obj3 = (kc0) yt24.k(y10.a);
                j3 = ((jt0) yt24.k(y10.b)).a;
                v35 v3510222 = v359222;
                if (!jt0.c(j3, uq3.c(1308617531))) {
                }
                boolean i38222 = yt24.i(u444) | yt24.g(obj3);
                Q5 = yt24.Q();
                Q5 = new m0(13, u444, obj3);
                yt24.o0(Q5);
                se7 se73222 = se7;
                o81 o814222 = o812;
                ml4 f2222 = kl8.f(h49.I(t49.V(t49.V(fd1.R(ml4.d(z(ml43, (vr2) Q5)), ogVar4222, u444, ze79222).d(ml45).d(ml42), new e3(21, (Object) ik23, (Object) u444)), new e3(4, (Object) u444, (Object) ze79222)).d(p4222).d(new zx0(new n92(se73222, z15, ap4))).d(ml49222).d(u713222), new j71(u444, 0)), new dx4(19, ze79222, o814222));
                if (z15 || u444.b() || ((Boolean) u444.q.getValue()).booleanValue() || ((k44) w983).b()) {
                }
                ze7 ze710222 = ze79222;
                yt22 = yt2;
                b(f2222, ze710222, su0.J(-814563849, new k71(fw0, tg7, u444, i3, i2, z20, z2, se73222, hf7, m78, ml44, x2222, I222, (!z27 || !sd4.a()) ? ml43 : gw8.p(ml43, new xa7(20, (Object) ze79222)), yb0, ze710222, z27, z4, w983, o814222, vr22, v3510222, tp13), yt22), yt22, 384);
            } else {
                h.s("no recompose scope found");
                return;
            }
        } else {
            yt22 = yt25;
            yt22.Y();
        }
        yx5 v3 = yt22.v();
        if (v3 != null) {
            v3.d = new l71(hf7, vr2, ml4, tg7, m78, vr22, ap4, ky6, z2, i2, i3, c93, zs3, z3, z4, fw0, i4, i5);
        }
    }

    public static final void b(ml4 ml4, ze7 ze7, fw0 fw0, yt2 yt2, int i2) {
        int i3;
        int i4;
        boolean z2;
        yt2.g0(2036174316);
        if (yt2.g(ml4)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i5 = i3 | i2;
        if (yt2.i(ze7)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i6 = i5 | i4;
        if ((i6 & 147) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (yt2.V(i6 & 1, z2)) {
            lh4 d2 = mb0.d(xb4.y, true);
            int hashCode = Long.hashCode(yt2.T);
            vf5 m2 = yt2.m();
            ml4 E = gw8.E(yt2, ml4);
            ux0.d.getClass();
            vy0 vy0 = tx0.b;
            yt2.i0();
            if (yt2.S) {
                yt2.l(vy0);
            } else {
                yt2.r0();
            }
            g75.Q(tx0.f, yt2, d2);
            g75.Q(tx0.e, yt2, m2);
            g75.Q(tx0.g, yt2, Integer.valueOf(hashCode));
            g75.O(yt2, tx0.h);
            g75.Q(tx0.d, yt2, E);
            r16.f(ze7, fw0, yt2, (i6 >> 3) & 126);
            yt2.r(true);
        } else {
            yt2.Y();
        }
        yx5 v2 = yt2.v();
        if (v2 != null) {
            v2.d = new y30(i2, 11, ml4, ze7, fw0);
        }
    }

    public static final long c(float f2, float f3) {
        long floatToRawIntBits = (long) Float.floatToRawIntBits(f2);
        return (((long) Float.floatToRawIntBits(f3)) & 4294967295L) | (floatToRawIntBits << 32);
    }

    public static final void d(sr2 sr2, fw0 fw0, ml4 ml4, boolean z2, yt2 yt2, int i2, int i3) {
        int i4;
        int i5;
        boolean z3;
        boolean z4;
        ml4 ml42;
        boolean z5;
        int i6;
        int i7;
        sr2.getClass();
        yt2.g0(-1353754052);
        if (yt2.i(sr2)) {
            i4 = 4;
        } else {
            i4 = 2;
        }
        int i8 = i4 | i2;
        int i9 = i3 & 4;
        if (i9 != 0) {
            i8 |= 384;
        } else if ((i2 & 384) == 0) {
            if (yt2.g(ml4)) {
                i7 = 256;
            } else {
                i7 = 128;
            }
            i8 |= i7;
        }
        int i10 = i3 & 8;
        if (i10 != 0) {
            i5 = i8 | 3072;
        } else {
            if (yt2.h(z2)) {
                i6 = 2048;
            } else {
                i6 = 1024;
            }
            i5 = i8 | i6;
        }
        int i11 = i5 | 24576;
        if ((i11 & 9363) != 9362) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (yt2.V(i11 & 1, z3)) {
            if (i9 != 0) {
                ml4 = jl4.w;
            }
            ml4 ml43 = ml4;
            if (i10 != 0) {
                z5 = true;
            } else {
                z5 = z2;
            }
            int i12 = i11 >> 3;
            e(sr2, ml43, z5, yd0.a, su0.J(-1894199319, new ge0(fw0, 0), yt2), yt2, (i11 & 14) | 24576 | (i12 & 112) | (i12 & 896), 0);
            ml42 = ml43;
            z4 = z5;
        } else {
            yt2.Y();
            ml42 = ml4;
            z4 = z2;
        }
        yx5 v2 = yt2.v();
        if (v2 != null) {
            v2.d = new de0(sr2, fw0, ml42, z4, i2, i3);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    public static final void e(sr2 sr2, ml4 ml4, boolean z2, la5 la5, fw0 fw0, yt2 yt2, int i2, int i3) {
        int i4;
        boolean z3;
        la5 la52;
        boolean z4;
        la5 la53;
        yx5 v2;
        pa5 pa5;
        boolean z5;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        yt2 yt22 = yt2;
        int i10 = i2;
        sr2.getClass();
        yt22.g0(1114189749);
        sr2 sr22 = sr2;
        if ((i10 & 6) == 0) {
            if (yt22.i(sr22)) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            i4 = i9 | i10;
        } else {
            i4 = i10;
        }
        ml4 ml42 = ml4;
        if ((i10 & 48) == 0) {
            if (yt22.g(ml42)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i4 |= i8;
        }
        int i11 = i3 & 4;
        if (i11 != 0) {
            i4 |= 384;
        } else if ((i10 & 384) == 0) {
            z3 = z2;
            if (yt22.h(z3)) {
                i7 = 256;
            } else {
                i7 = 128;
            }
            i4 |= i7;
            if ((i10 & 3072) != 0) {
                if ((i3 & 8) == 0) {
                    la52 = la5;
                    if (yt22.g(la52)) {
                        i6 = 2048;
                        i4 |= i6;
                    }
                } else {
                    la52 = la5;
                }
                i6 = 1024;
                i4 |= i6;
            } else {
                la52 = la5;
            }
            fw0 fw02 = fw0;
            if ((i10 & 24576) == 0) {
                if (yt22.i(fw02)) {
                    i5 = 16384;
                } else {
                    i5 = 8192;
                }
                i4 |= i5;
            }
            if ((i4 & 9363) == 9362) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (!yt22.V(i4 & 1, z4)) {
                yt22.a0();
                if ((i10 & 1) == 0 || yt22.C()) {
                    if (i11 != 0) {
                        z3 = true;
                    }
                    if ((i3 & 8) != 0) {
                        i4 &= -7169;
                        pa5 = yd0.a;
                        z5 = z3;
                        yt22.s();
                        pa5 pa52 = yd0.a;
                        int i12 = i4;
                        z3 = z5;
                        la5 la54 = pa5;
                        gw8.a(sr2, ml4, z3, (pq6) null, yd0.a(((zg4) yt22.k(ch4.b)).a.o, 0, 0, 0, yt22, 14), (ce0) null, (ua0) null, la54, fw02, yt2, (i12 & 1022) | ((i12 << 12) & 29360128) | ((i12 << 15) & 1879048192), 360);
                        la53 = la54;
                    }
                } else {
                    yt22.Y();
                    if ((i3 & 8) != 0) {
                        i4 &= -7169;
                    }
                }
                z5 = z3;
                pa5 = la52;
                yt22.s();
                pa5 pa522 = yd0.a;
                int i122 = i4;
                z3 = z5;
                la5 la542 = pa5;
                gw8.a(sr2, ml4, z3, (pq6) null, yd0.a(((zg4) yt22.k(ch4.b)).a.o, 0, 0, 0, yt22, 14), (ce0) null, (ua0) null, la542, fw02, yt2, (i122 & 1022) | ((i122 << 12) & 29360128) | ((i122 << 15) & 1879048192), 360);
                la53 = la542;
            } else {
                yt2.Y();
                la53 = la52;
            }
            boolean z6 = z3;
            v2 = yt2.v();
            if (v2 == null) {
                v2.d = new fe0(sr2, ml4, z6, la53, fw0, i10, i3, 1);
                return;
            }
            return;
        }
        z3 = z2;
        if ((i10 & 3072) != 0) {
        }
        fw0 fw022 = fw0;
        if ((i10 & 24576) == 0) {
        }
        if ((i4 & 9363) == 9362) {
        }
        if (!yt22.V(i4 & 1, z4)) {
        }
        boolean z62 = z3;
        v2 = yt2.v();
        if (v2 == null) {
        }
    }

    public static final void f(fw0 fw0, gs2 gs2, yt2 yt2, int i2) {
        int i3;
        int i4;
        boolean z2;
        boolean z3;
        fw0 fw02 = fw0;
        gs2 gs22 = gs2;
        yt2 yt22 = yt2;
        int i5 = i2;
        yt22.g0(598344624);
        if (yt22.i(fw02)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i6 = i3 | i5;
        if (yt22.i(gs22)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i7 = i6 | i4;
        if ((i7 & 19) != 18) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (yt22.V(i7 & 1, z2)) {
            ea6 a2 = ca6.a(wr.a, xb4.H, yt22, 0);
            int hashCode = Long.hashCode(yt22.T);
            vf5 m2 = yt22.m();
            jl4 jl4 = jl4.w;
            ml4 E = gw8.E(yt22, jl4);
            ux0.d.getClass();
            vy0 vy0 = tx0.b;
            yt22.i0();
            if (yt22.S) {
                yt22.l(vy0);
            } else {
                yt22.r0();
            }
            ck ckVar = tx0.f;
            g75.Q(ckVar, yt22, a2);
            ck ckVar2 = tx0.e;
            g75.Q(ckVar2, yt22, m2);
            Integer valueOf = Integer.valueOf(hashCode);
            ck ckVar3 = tx0.g;
            g75.Q(ckVar3, yt22, valueOf);
            ce ceVar = tx0.h;
            g75.O(yt22, ceVar);
            ck ckVar4 = tx0.d;
            g75.Q(ckVar4, yt22, E);
            if (gs22 != null) {
                yt22.e0(533333776);
                ck ckVar5 = ckVar4;
                vy0 vy02 = vy0;
                ck ckVar6 = ckVar;
                ml4 o2 = yu6.o(jl4, 0.0f, 0.0f, 0.0f, yd0.e, 7);
                lh4 d2 = mb0.d(xb4.y, false);
                int hashCode2 = Long.hashCode(yt22.T);
                vf5 m3 = yt22.m();
                ml4 E2 = gw8.E(yt22, o2);
                yt22.i0();
                if (yt22.S) {
                    yt22.l(vy02);
                } else {
                    yt22.r0();
                }
                g75.Q(ckVar6, yt22, d2);
                g75.Q(ckVar2, yt22, m3);
                f21.s(hashCode2, yt22, ckVar3, yt22, ceVar);
                g75.Q(ckVar5, yt22, E2);
                gs22.H(yt22, Integer.valueOf((i7 >> 3) & 14));
                z3 = true;
                yt22.r(true);
                k75.a(yt22, yu6.p(jl4, yd0.f));
                yt22.r(false);
            } else {
                z3 = true;
                yt22.e0(533516366);
                yt22.r(false);
            }
            f21.r(i7 & 14, fw02, yt22, z3);
        } else {
            yt22.Y();
        }
        yx5 v2 = yt22.v();
        if (v2 != null) {
            v2.d = new xa(fw02, gs22, i5);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    public static final void g(sr2 sr2, fw0 fw0, ml4 ml4, boolean z2, gs2 gs2, yt2 yt2, int i2, int i3) {
        int i4;
        boolean z3;
        boolean z4;
        yx5 v2;
        pa5 pa5;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        gs2 gs22 = gs2;
        yt2 yt22 = yt2;
        int i10 = i2;
        sr2.getClass();
        yt22.g0(-311564354);
        if ((i10 & 6) == 0) {
            if (yt22.i(sr2)) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            i4 = i9 | i10;
        } else {
            i4 = i10;
        }
        if ((i10 & 48) == 0) {
            if (yt22.i(fw0)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i4 |= i8;
        }
        ml4 ml42 = ml4;
        if ((i10 & 384) == 0) {
            if (yt22.g(ml42)) {
                i7 = 256;
            } else {
                i7 = 128;
            }
            i4 |= i7;
        }
        int i11 = i3 & 8;
        if (i11 != 0) {
            i4 |= 3072;
        } else if ((i10 & 3072) == 0) {
            z3 = z2;
            if (yt22.h(z3)) {
                i6 = 2048;
            } else {
                i6 = 1024;
            }
            i4 |= i6;
            if ((i10 & 24576) == 0) {
                if (yt22.i(gs22)) {
                    i5 = 16384;
                } else {
                    i5 = 8192;
                }
                i4 |= i5;
            }
            boolean z5 = true;
            if ((i4 & 9363) == 9362) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (!yt22.V(i4 & 1, z4)) {
                if (i11 == 0) {
                    z5 = z3;
                }
                if (gs22 != null) {
                    pa5 = yd0.b;
                } else {
                    pa5 = yd0.a;
                }
                int i12 = i4 >> 3;
                h(sr2, ml42, z5, pa5, su0.J(-350213779, new gc5(6, (Object) fw0, (Object) gs22), yt22), yt22, (i4 & 14) | 24576 | (i12 & 112) | (i12 & 896), 0);
                z3 = z5;
            } else {
                yt2.Y();
            }
            v2 = yt2.v();
            if (v2 == null) {
                v2.d = new fe0(sr2, fw0, ml4, z3, gs22, i2, i3);
                return;
            }
            return;
        }
        z3 = z2;
        if ((i10 & 24576) == 0) {
        }
        boolean z52 = true;
        if ((i4 & 9363) == 9362) {
        }
        if (!yt22.V(i4 & 1, z4)) {
        }
        v2 = yt2.v();
        if (v2 == null) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    public static final void h(sr2 sr2, ml4 ml4, boolean z2, la5 la5, fw0 fw0, yt2 yt2, int i2, int i3) {
        int i4;
        boolean z3;
        la5 la52;
        boolean z4;
        yx5 v2;
        pa5 pa5;
        boolean z5;
        long j2;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        yt2 yt22 = yt2;
        int i10 = i2;
        sr2.getClass();
        yt22.g0(-405240137);
        if ((i10 & 6) == 0) {
            if (yt22.i(sr2)) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            i4 = i9 | i10;
        } else {
            i4 = i10;
        }
        if ((i10 & 48) == 0) {
            if (yt22.g(ml4)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i4 |= i8;
        }
        int i11 = i3 & 4;
        if (i11 != 0) {
            i4 |= 384;
        } else if ((i10 & 384) == 0) {
            z3 = z2;
            if (yt22.h(z3)) {
                i7 = 256;
            } else {
                i7 = 128;
            }
            i4 |= i7;
            if ((i10 & 3072) != 0) {
                if ((i3 & 8) == 0) {
                    la52 = la5;
                    if (yt22.g(la52)) {
                        i6 = 2048;
                        i4 |= i6;
                    }
                } else {
                    la52 = la5;
                }
                i6 = 1024;
                i4 |= i6;
            } else {
                la52 = la5;
            }
            if ((i10 & 24576) != 0) {
                if (yt22.i(fw0)) {
                    i5 = 16384;
                } else {
                    i5 = 8192;
                }
                i4 |= i5;
            } else {
                fw0 fw02 = fw0;
            }
            boolean z6 = true;
            if ((i4 & 9363) == 9362) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (!yt22.V(i4 & 1, z4)) {
                yt22.a0();
                if ((i10 & 1) == 0 || yt22.C()) {
                    if (i11 == 0) {
                        z6 = z3;
                    }
                    if ((i3 & 8) != 0) {
                        i4 &= -7169;
                        pa5 = yd0.a;
                    } else {
                        pa5 = la52;
                    }
                    z5 = z6;
                } else {
                    yt22.Y();
                    if ((i3 & 8) != 0) {
                        i4 &= -7169;
                    }
                    z5 = z3;
                    pa5 = la52;
                }
                yt22.s();
                pa5 pa52 = yd0.a;
                t37 t37 = ch4.b;
                xd0 f2 = yd0.f(((zg4) yt22.k(t37)).a.o, yt22);
                if (z5) {
                    yt22.e0(644745898);
                    j2 = ((zg4) yt22.k(t37)).a.A;
                    yt22.r(false);
                } else {
                    yt22.e0(644819895);
                    j2 = jt0.b(0.12f, ((zg4) yt22.k(t37)).a.q);
                    yt22.r(false);
                }
                gw8.b(sr2, ml4, z5, (pq6) null, f2, uq3.a(1.0f, j2), pa5, fw0, yt22, (i4 & 1022) | ((i4 << 12) & 29360128) | ((i4 << 15) & 1879048192), 296);
                z3 = z5;
                la52 = pa5;
            } else {
                yt2.Y();
            }
            v2 = yt2.v();
            if (v2 == null) {
                v2.d = new fe0(sr2, ml4, z3, la52, fw0, i10, i3, 0);
                return;
            }
            return;
        }
        z3 = z2;
        if ((i10 & 3072) != 0) {
        }
        if ((i10 & 24576) != 0) {
        }
        boolean z62 = true;
        if ((i4 & 9363) == 9362) {
        }
        if (!yt22.V(i4 & 1, z4)) {
        }
        v2 = yt2.v();
        if (v2 == null) {
        }
    }

    public static final void i(sr2 sr2, ml4 ml4, boolean z2, hs2 hs2, yt2 yt2, int i2, int i3) {
        int i4;
        boolean z3;
        boolean z4;
        ml4 ml42;
        ml4 ml43;
        int i5;
        int i6;
        int i7;
        int i8 = i2;
        sr2.getClass();
        hs2.getClass();
        yt2.g0(-1468588055);
        if ((i8 & 6) == 0) {
            if (yt2.i(sr2)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i4 = i7 | i8;
        } else {
            i4 = i8;
        }
        int i9 = i3 & 2;
        if (i9 != 0) {
            i4 |= 48;
        } else if ((i8 & 48) == 0) {
            if (yt2.g(ml4)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i4 |= i6;
        }
        int i10 = i4 | 384;
        if ((i8 & 3072) == 0) {
            if (yt2.i(hs2)) {
                i5 = 2048;
            } else {
                i5 = 1024;
            }
            i10 |= i5;
        }
        if ((i10 & 1171) != 1170) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (yt2.V(i10 & 1, z3)) {
            if (i9 != 0) {
                ml43 = jl4.w;
            } else {
                ml43 = ml4;
            }
            pa5 pa5 = yd0.a;
            int i11 = (i10 & 1022) | ((i10 << 18) & 1879048192);
            ml4 ml44 = ml43;
            gw8.e(sr2, ml44, true, (pq6) null, yd0.g(((zg4) yt2.k(ch4.b)).a.o, yt2), (la5) null, hs2, yt2, i11, 488);
            z4 = true;
            ml42 = ml44;
        } else {
            yt2.Y();
            ml42 = ml4;
            z4 = z2;
        }
        yx5 v2 = yt2.v();
        if (v2 != null) {
            v2.d = new de0(sr2, ml42, z4, hs2, i8, i3);
        }
    }

    public static final void j(ze7 ze7, boolean z2, yt2 yt2, int i2) {
        int i3;
        int i4;
        boolean z3;
        cg7 d2;
        boolean z4;
        yt2.g0(626339208);
        if (yt2.i(ze7)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i5 = i3 | i2;
        if (yt2.h(z2)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i6 = i5 | i4;
        if ((i6 & 19) != 18) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!yt2.V(i6 & 1, z3)) {
            yt2.Y();
        } else if (z2) {
            yt2.e0(1530097388);
            u44 u44 = ze7.d;
            bg7 bg7 = null;
            if (!(u44 == null || (d2 = u44.d()) == null)) {
                bg7 bg72 = d2.a;
                u44 u442 = ze7.d;
                if (u442 != null) {
                    z4 = u442.p;
                } else {
                    z4 = true;
                }
                if (!z4) {
                    bg7 = bg72;
                }
            }
            if (bg7 == null) {
                yt2.e0(1530097387);
                yt2.r(false);
            } else {
                yt2.e0(1530097388);
                if (!lg7.c(ze7.n().b)) {
                    yt2.e0(2109807302);
                    int p2 = ze7.b.p((int) (ze7.n().b >> 32));
                    int p3 = ze7.b.p((int) (ze7.n().b & 4294967295L));
                    p56 a2 = bg7.a(p2);
                    p56 a3 = bg7.a(Math.max(p3 - 1, 0));
                    u44 u443 = ze7.d;
                    if (u443 == null || !((Boolean) u443.m.getValue()).booleanValue()) {
                        yt2.e0(2110490542);
                        yt2.r(false);
                    } else {
                        yt2.e0(2110225306);
                        i75.a(true, a2, ze7, yt2, ((i6 << 6) & 896) | 6);
                        yt2.r(false);
                    }
                    u44 u444 = ze7.d;
                    if (u444 == null || !((Boolean) u444.n.getValue()).booleanValue()) {
                        yt2.e0(2110838734);
                        yt2.r(false);
                    } else {
                        yt2.e0(2110574459);
                        i75.a(false, a3, ze7, yt2, ((i6 << 6) & 896) | 6);
                        yt2.r(false);
                    }
                    yt2.r(false);
                } else {
                    yt2.e0(2110860558);
                    yt2.r(false);
                }
                u44 u445 = ze7.d;
                if (u445 != null) {
                    ed5 ed5 = u445.l;
                    if (!sg3.e(ze7.u.a.x, ze7.n().a.x)) {
                        ed5.setValue(Boolean.FALSE);
                    }
                    if (u445.b()) {
                        if (((Boolean) ed5.getValue()).booleanValue()) {
                            ze7.r();
                        } else {
                            ze7.o();
                        }
                    }
                }
                yt2.r(false);
            }
            yt2.r(false);
        } else {
            yt2.e0(1989076778);
            yt2.r(false);
            ze7.o();
        }
        yx5 v2 = yt2.v();
        if (v2 != null) {
            v2.d = new i71(ze7, z2, i2);
        }
    }

    public static final void k(ze7 ze7, yt2 yt2, int i2) {
        int i3;
        boolean z2;
        vl m2;
        cg7 cg7;
        ze7 ze72 = ze7;
        yt2 yt22 = yt2;
        int i4 = i2;
        yt22.g0(-1436003720);
        if (yt22.i(ze72)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i5 = i3 | i4;
        if ((i5 & 3) != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (yt22.V(i5 & 1, z2)) {
            u44 u44 = ze72.d;
            if (u44 == null || !((Boolean) u44.o.getValue()).booleanValue() || (m2 = ze72.m()) == null || m2.x.length() <= 0) {
                yt22.e0(-2111042550);
                yt22.r(false);
            } else {
                yt22.e0(-2112351432);
                boolean g2 = yt22.g(ze72);
                Object Q = yt22.Q();
                Object obj = ay0.a;
                if (g2 || Q == obj) {
                    Q = new ve7(ze72);
                    yt22.o0(Q);
                }
                wd7 wd7 = (wd7) Q;
                tp1 tp1 = (tp1) yt22.k(xy0.h);
                v35 v35 = ze72.b;
                long j2 = ze72.n().b;
                int i6 = lg7.c;
                int p2 = v35.p((int) (j2 >> 32));
                u44 u442 = ze72.d;
                if (u442 != null) {
                    cg7 = u442.d();
                } else {
                    cg7 = null;
                }
                cg7.getClass();
                bg7 bg7 = cg7.a;
                ly5 c2 = bg7.c(z65.p(p2, 0, bg7.a.a.x.length()));
                long floatToRawIntBits = (((long) Float.floatToRawIntBits((tp1.e0(2.0f) / 2.0f) + c2.a)) << 32) | (((long) Float.floatToRawIntBits(c2.d)) & 4294967295L);
                boolean f2 = yt22.f(floatToRawIntBits);
                Object Q2 = yt22.Q();
                if (f2 || Q2 == obj) {
                    Q2 = new q71(floatToRawIntBits);
                    yt22.o0(Q2);
                }
                x35 x35 = (x35) Q2;
                boolean i7 = yt22.i(wd7) | yt22.i(ze72);
                Object Q3 = yt22.Q();
                if (i7 || Q3 == obj) {
                    Q3 = new t71(wd7, ze72);
                    yt22.o0(Q3);
                }
                ml4 a2 = d97.a(jl4.w, wd7, (PointerInputEventHandler) Q3);
                boolean f3 = yt22.f(floatToRawIntBits);
                Object Q4 = yt22.Q();
                if (f3 || Q4 == obj) {
                    Q4 = new hf(floatToRawIntBits, 2);
                    yt22.o0(Q4);
                }
                kf.a(x35, ck6.a(a2, false, (vr2) Q4), 0, yt22, 0);
                yt22.r(false);
            }
        } else {
            yt22.Y();
        }
        yx5 v2 = yt22.v();
        if (v2 != null) {
            v2.d = new yg(i4, 6, ze72);
        }
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [h61] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
    public static final Object l(th7 th7, hs2 hs2, Throwable th, h61 h61) {
        mi2 mi2;
        int i2;
        if (h61 instanceof mi2) {
            mi2 mi22 = (mi2) h61;
            int i3 = mi22.B;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                mi22.B = i3 - Integer.MIN_VALUE;
                mi2 = mi22;
                Object obj = mi2.A;
                i2 = mi2.B;
                if (i2 != 0) {
                    o85.q(obj);
                    mi2.z = th;
                    mi2.B = 1;
                    Object u2 = hs2.u(th7, th, mi2);
                    p81 p81 = p81.w;
                    if (u2 == p81) {
                        return p81;
                    }
                } else if (i2 == 1) {
                    th = mi2.z;
                    try {
                        o85.q(obj);
                    } catch (Throwable th2) {
                        if (!(th == null || th == th2)) {
                            su0.b(th2, th);
                        }
                        throw th2;
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return vs7.a;
            }
        }
        mi2 = new h61(h61);
        Object obj2 = mi2.A;
        i2 = mi2.B;
        if (i2 != 0) {
        }
        return vs7.a;
    }

    public static final void n(r58 r58, kg5 kg5, in8 in8) {
        kg5.getClass();
        in8.getClass();
        ze6 ze6 = (ze6) r58.c("androidx.lifecycle.savedstate.vm.tag");
        if (ze6 != null && !ze6.y) {
            ze6.k(kg5, in8);
            k54 G0 = in8.G0();
            if (G0 == k54.x || G0.compareTo(k54.z) >= 0) {
                kg5.O();
            } else {
                in8.x0(new pm1(kg5, in8));
            }
        }
    }

    public static final Long o(yl1 yl1) {
        yl1.getClass();
        String x2 = yl1.a().x("Content-Length");
        if (x2 != null) {
            return k57.w0(x2);
        }
        return null;
    }

    public static final q51 p(h53 h53) {
        h53.getClass();
        String E0 = h53.a().E0("Content-Type");
        if (E0 == null) {
            return null;
        }
        q51 q51 = q51.e;
        return kw5.m(E0);
    }

    public static final void q(h53 h53, q51 q51) {
        h53.getClass();
        q51.getClass();
        h53.a().J("Content-Type", q51.toString());
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [ml2, t22] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    public static ml2 r(Context context) {
        me6 me6;
        ProviderInfo providerInfo;
        kl2 kl2;
        ApplicationInfo applicationInfo;
        if (Build.VERSION.SDK_INT >= 28) {
            me6 = new me6(25);
        } else {
            me6 = new me6(25);
        }
        PackageManager packageManager = context.getPackageManager();
        k75.i("Package manager required to locate emoji font provider", packageManager);
        Iterator<ResolveInfo> it = packageManager.queryIntentContentProviders(new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                providerInfo = null;
                break;
            }
            providerInfo = it.next().providerInfo;
            if (providerInfo != null && (applicationInfo = providerInfo.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                break;
            }
        }
        if (providerInfo != null) {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                Signature[] j2 = me6.j(packageManager, str2);
                ArrayList arrayList = new ArrayList();
                for (Signature byteArray : j2) {
                    arrayList.add(byteArray.toByteArray());
                }
                kl2 = new kl2(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList), (String) null, (String) null);
            } catch (PackageManager.NameNotFoundException e2) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e2);
            }
            if (kl2 != null) {
                return null;
            }
            return new t22((v22) new ll2(context, kl2));
        }
        kl2 = null;
        if (kl2 != null) {
        }
    }

    public static final Object s(Class cls, Map map, List list) {
        cls.getClass();
        list.getClass();
        z97 z97 = new z97(new k3(3, map));
        Object newProxyInstance = Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new em(cls, map, new z97(new p3(cls, false, map, 1)), z97, list));
        newProxyInstance.getClass();
        return newProxyInstance;
    }

    public static /* synthetic */ Object t(Class cls, Map map) {
        Iterable<String> keySet = map.keySet();
        ArrayList arrayList = new ArrayList(et0.e0(keySet, 10));
        for (String declaredMethod : keySet) {
            arrayList.add(cls.getDeclaredMethod(declaredMethod, (Class[]) null));
        }
        return s(cls, map, arrayList);
    }

    public static GetCredentialException u(String str, String str2) {
        Exception exc;
        str.getClass();
        try {
            GetPublicKeyCredentialDomException getPublicKeyCredentialDomException = new GetPublicKeyCredentialDomException(new u(26), (String) null);
            if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_ABORT_ERROR")) {
                exc = gr8.r(new u(0), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_CONSTRAINT_ERROR")) {
                exc = gr8.r(new u(1), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_DATA_CLONE_ERROR")) {
                exc = gr8.r(new u(2), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_DATA_ERROR")) {
                exc = gr8.r(new u(3), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_ENCODING_ERROR")) {
                exc = gr8.r(new u(4), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_HIERARCHY_REQUEST_ERROR")) {
                exc = gr8.r(new u(5), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_IN_USE_ATTRIBUTE_ERROR")) {
                exc = gr8.r(new u(6), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_CHARACTER_ERROR")) {
                exc = gr8.r(new u(7), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_MODIFICATION_ERROR")) {
                exc = gr8.r(new u(8), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_NODE_TYPE_ERROR")) {
                exc = gr8.r(new u(9), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_STATE_ERROR")) {
                exc = gr8.r(new u(10), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NAMESPACE_ERROR")) {
                exc = gr8.r(new u(11), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NETWORK_ERROR")) {
                exc = gr8.r(new u(12), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NO_MODIFICATION_ALLOWED_ERROR")) {
                exc = gr8.r(new u(13), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_ALLOWED_ERROR")) {
                exc = gr8.r(new u(14), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_FOUND_ERROR")) {
                exc = gr8.r(new u(15), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_READABLE_ERROR")) {
                exc = gr8.r(new u(16), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_SUPPORTED_ERROR")) {
                exc = gr8.r(new u(17), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_OPERATION_ERROR")) {
                exc = gr8.r(new u(18), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_OPT_OUT_ERROR")) {
                exc = gr8.r(new u(19), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_QUOTA_EXCEEDED_ERROR")) {
                exc = gr8.r(new u(20), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_READ_ONLY_ERROR")) {
                exc = gr8.r(new u(21), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_SECURITY_ERROR")) {
                exc = gr8.r(new u(22), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_SYNTAX_ERROR")) {
                exc = gr8.r(new u(23), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_TIMEOUT_ERROR")) {
                exc = gr8.r(new u(24), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_TRANSACTION_INACTIVE_ERROR")) {
                exc = gr8.r(new u(25), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_UNKNOWN_ERROR")) {
                exc = gr8.r(new u(26), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_VERSION_ERROR")) {
                exc = gr8.r(new u(27), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_WRONG_DOCUMENT_ERROR")) {
                exc = gr8.r(new u(28), str2, getPublicKeyCredentialDomException);
            } else {
                throw new Exception();
            }
            return (GetCredentialException) exc;
        } catch (FrameworkClassParsingException unused) {
            return new GetCredentialCustomException(str2, str);
        }
    }

    public static ny4 v(int[] iArr, int[] iArr2) {
        NetworkRequest.Builder builder = new NetworkRequest.Builder();
        for (int i2 : iArr) {
            try {
                builder.addCapability(i2);
            } catch (IllegalArgumentException e2) {
                bc4 k2 = bc4.k();
                String str = ny4.b;
                String str2 = ny4.b;
                String str3 = "Ignoring adding capability '" + i2 + '\'';
                if (k2.x <= 5) {
                    Log.w(str2, str3, e2);
                }
            }
        }
        for (int i3 = 0; i3 < 3; i3++) {
            int i4 = q[i3];
            if (!qs.G0(iArr, i4)) {
                try {
                    builder.removeCapability(i4);
                } catch (IllegalArgumentException e3) {
                    bc4 k3 = bc4.k();
                    String str4 = ny4.b;
                    String str5 = ny4.b;
                    String str6 = "Ignoring removing default capability '" + i4 + '\'';
                    if (k3.x <= 5) {
                        Log.w(str5, str6, e3);
                    }
                }
            }
        }
        for (int addTransportType : iArr2) {
            builder.addTransportType(addTransportType);
        }
        NetworkRequest build = builder.build();
        build.getClass();
        return new ny4(build);
    }

    public static final void w(nd2 nd2, ae5 ae5) {
        try {
            IOException iOException = null;
            for (ae5 ae52 : nd2.B(ae5)) {
                try {
                    if (nd2.D(ae52).c) {
                        w(nd2, ae52);
                    }
                    nd2.o(ae52);
                } catch (IOException e2) {
                    if (iOException == null) {
                        iOException = e2;
                    }
                }
            }
            if (iOException != null) {
                throw iOException;
            }
        } catch (FileNotFoundException unused) {
        }
    }

    public static final ml4 x(ml4 ml4, vr2 vr2) {
        return ml4.d(new cz1(vr2));
    }

    public static final ml4 y(ml4 ml4, vr2 vr2) {
        return ml4.d(new kz1(vr2));
    }

    public static final ml4 z(ml4 ml4, vr2 vr2) {
        return ml4.d(new lz1(vr2));
    }

    public abstract String m();
}
