package defpackage;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import cu.lestebang.utiletecsa.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.time.format.DateTimeFormatter;
import java.time.format.DecimalStyle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.UUID;
import java.util.WeakHashMap;

/* renamed from: h03  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class h03 {
    public static final rt0 A;
    public static final Object A0 = new Object();
    public static final rt0 B;
    public static final cc2 B0;
    public static final float C = 1.0f;
    public static final cc2 C0;
    public static final rt0 D;
    public static final cc2[] D0;
    public static final rt0 E;
    public static x83 E0 = null;
    public static final float F = 120.0f;
    public static x83 F0 = null;
    public static final rt0 G;
    public static x83 G0 = null;
    public static final cr7 H = cr7.z;
    public static x83 H0 = null;
    public static final rt0 I;
    public static boolean I0 = false;
    public static final cr7 J;
    public static Method J0 = null;
    public static final rt0 K;
    public static boolean K0 = false;
    public static final rt0 L;
    public static Field L0 = null;
    public static final rt0 M;
    public static x83 M0 = null;
    public static final rt0 N;
    public static final cr7 O;
    public static final float P = 36.0f;
    public static final float Q = 72.0f;
    public static final cr7 R;
    public static final rt0 S;
    public static final rt0 T;
    public static final vq6 U;
    public static final rt0 V;
    public static final vq6 W = vq6.D;
    public static final rt0 X;
    public static final float Y = 0.38f;
    public static final float Z = 8.0f;
    public static final rt0 a = rt0.M;
    public static final rt0 a0;
    public static final rt0 b;
    public static final float b0 = 0.12f;
    public static final rt0 c = rt0.N;
    public static final rt0 c0;
    public static final rt0 d;
    public static final float d0 = 0.12f;
    public static final rt0 e;
    public static final rt0 e0;
    public static final rt0 f;
    public static final float f0 = 1.0f;
    public static final fw0 g = new fw0(-1400977773, new sw0(2), false);
    public static final rt0 g0 = rt0.G;
    public static final fw0 h = new fw0(-1815333486, new rw0(20), false);
    public static final float h0 = 1.0f;
    public static final fw0 i = new fw0(-29919031, new rw0(21), false);
    public static final cr7 i0;
    public static final fw0 j = new fw0(-733782006, new rw0(22), false);
    public static final rt0 j0;
    public static final fw0 k = new fw0(-1437644981, new rw0(23), false);
    public static final rt0 k0;
    public static final fw0 l = new fw0(-1169879295, new rw0(24), false);
    public static final rt0 l0;
    public static final fw0 m = new fw0(-420413855, new rw0(25), false);
    public static final float m0 = 0.38f;
    public static final fw0 n = new fw0(768354762, new rw0(16), false);
    public static final rt0 n0;
    public static final fw0 o = new fw0(-1405259279, new rw0(17), false);
    public static final rt0 o0;
    public static final fw0 p = new fw0(1435882337, new rw0(18), false);
    public static final rt0 p0;
    public static final fw0 q = new fw0(71644991, new rw0(19), false);
    public static final float q0 = 0.38f;
    public static final rt0 r = rt0.O;
    public static final rt0 r0;
    public static final float s = 568.0f;
    public static final rt0 s0;
    public static final vq6 t = vq6.w;
    public static final float t0 = 38.0f;
    public static final float u = 360.0f;
    public static final rt0 u0 = rt0.B;
    public static final float v = 40.0f;
    public static final rt0 v0 = rt0.I;
    public static final vq6 w;
    public static final float w0 = 48.0f;
    public static final float x = 40.0f;
    public static final vq6 x0;
    public static final cr7 y;
    public static final float y0 = 48.0f;
    public static final rt0 z;
    public static final StackTraceElement[] z0 = new StackTraceElement[0];

    static {
        rt0 rt0 = rt0.D;
        b = rt0;
        rt0 rt02 = rt0.E;
        d = rt02;
        e = rt0;
        f = rt02;
        vq6 vq6 = vq6.y;
        w = vq6;
        cr7 cr7 = cr7.w;
        y = cr7;
        rt0 rt03 = rt0.H;
        z = rt03;
        rt0 rt04 = rt0.A;
        A = rt04;
        B = rt03;
        D = rt03;
        E = rt0;
        G = rt02;
        I = rt02;
        cr7 cr72 = cr7.B;
        J = cr72;
        rt0 rt05 = rt0.L;
        K = rt05;
        rt0 rt06 = rt0.C;
        L = rt06;
        M = rt02;
        N = rt0;
        O = cr7;
        R = cr7;
        S = rt03;
        T = rt04;
        U = vq6;
        V = rt02;
        X = rt0;
        a0 = rt0;
        c0 = rt0;
        e0 = rt05;
        i0 = cr72;
        j0 = rt06;
        k0 = rt02;
        l0 = rt0;
        n0 = rt06;
        o0 = rt03;
        p0 = rt0;
        r0 = rt06;
        s0 = rt02;
        x0 = vq6;
        cc2 cc2 = new cc2(1, "CLIENT_TELEMETRY");
        B0 = cc2;
        cc2 cc22 = new cc2(1, "CLIENT_NOTIFICATION_TELEMETRY");
        C0 = cc22;
        D0 = new cc2[]{cc2, cc22};
    }

    public static /* synthetic */ void a(int i2) {
        String str;
        int i3;
        Throwable th;
        if (i2 != 4) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i2 != 4) {
            i3 = 3;
        } else {
            i3 = 2;
        }
        Object[] objArr = new Object[i3];
        switch (i2) {
            case 1:
            case 6:
                objArr[0] = "originalSubstitution";
                break;
            case 2:
            case 7:
                objArr[0] = "newContainingDeclaration";
                break;
            case 3:
            case 8:
                objArr[0] = "result";
                break;
            case 4:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
                break;
            default:
                objArr[0] = "typeParameters";
                break;
        }
        if (i2 != 4) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
        } else {
            objArr[1] = "substituteTypeParameters";
        }
        if (i2 != 4) {
            objArr[2] = "substituteTypeParameters";
        }
        String format = String.format(str, objArr);
        if (i2 != 4) {
            th = new IllegalArgumentException(format);
        } else {
            th = new IllegalStateException(format);
        }
        throw th;
    }

    public static final qc1 b(float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        return new qc1(new float[]{f2, f3, f4, f5, f6, f7, f8, f9});
    }

    public static final void c(sr2 sr2, wu1 wu1, fw0 fw0, yt2 yt2, int i2) {
        int i3;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i4;
        int i5;
        int i6;
        sr2 sr22 = sr2;
        wu1 wu12 = wu1;
        yt2 yt22 = yt2;
        int i7 = i2;
        yt22.g0(826668973);
        if ((i7 & 6) == 0) {
            if (yt22.i(sr22)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i3 = i6 | i7;
        } else {
            i3 = i7;
        }
        if ((i7 & 48) == 0) {
            if (yt22.g(wu12)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        fw0 fw02 = fw0;
        if ((i7 & 384) == 0) {
            if (yt22.i(fw02)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i3 |= i4;
        }
        int i8 = i3;
        if ((i8 & 147) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (yt22.V(i8 & 1, z2)) {
            View view = (View) yt22.k(ye.f);
            tp1 tp1 = (tp1) yt22.k(xy0.h);
            ey3 ey3 = (ey3) yt22.k(xy0.n);
            wt2 E2 = kl8.E(yt22);
            aq4 v2 = u55.v(fw0, yt2);
            Object[] objArr = new Object[0];
            Object Q2 = yt22.Q();
            d63 d63 = ay0.a;
            if (Q2 == d63) {
                Q2 = xe.D;
                yt22.o0(Q2);
            }
            UUID uuid = (UUID) u55.s(objArr, (sr2) Q2, yt22, 48);
            boolean e2 = yt22.e(wu12.g) | yt22.g(view) | yt22.g(tp1) | yt22.g((Object) null);
            Object Q3 = yt22.Q();
            if (e2 || Q3 == d63) {
                wt2 wt2 = E2;
                yu1 yu1 = new yu1(sr22, wu12, view, ey3, tp1, uuid);
                z3 = true;
                fw0 fw03 = new fw0(-1338939603, new z0(2, v2), true);
                tu1 tu1 = yu1.D;
                tu1.setParentCompositionContext(wt2);
                tu1.G.setValue(fw03);
                tu1.K = true;
                tu1.d();
                yt22.o0(yu1);
                Q3 = yu1;
            } else {
                z3 = true;
            }
            yu1 yu12 = (yu1) Q3;
            boolean i9 = yt22.i(yu12);
            Object Q4 = yt22.Q();
            if (i9 || Q4 == d63) {
                z4 = false;
                Q4 = new lf(yu12, 0);
                yt22.o0(Q4);
            } else {
                z4 = false;
            }
            t49.e(yu12, (vr2) Q4, yt22);
            boolean i10 = yt22.i(yu12);
            if ((i8 & 14) == 4) {
                z5 = z3;
            } else {
                z5 = z4;
            }
            boolean z6 = i10 | z5;
            if ((i8 & 112) == 32) {
                z4 = z3;
            }
            boolean e3 = z4 | z6 | yt22.e(ey3.ordinal());
            Object Q5 = yt22.Q();
            if (e3 || Q5 == d63) {
                Q5 = new mf(yu12, sr22, wu12, ey3);
                yt22.o0(Q5);
            }
            t49.l((sr2) Q5, yt22);
        } else {
            yt22.Y();
        }
        yx5 v3 = yt22.v();
        if (v3 != null) {
            v3.d = new nf(sr22, wu12, fw02, i7, 0);
        }
    }

    public static final y92 d(vr2 vr2) {
        y92 y92 = new y92();
        vr2.y(y92);
        return new y92(y92);
    }

    public static final void e(ml4 ml4, gs2 gs2, yt2 yt2, int i2) {
        int i3;
        boolean z2;
        int i4;
        int i5;
        yt2.g0(1090521195);
        if ((i2 & 6) == 0) {
            if (yt2.g(ml4)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i3 = i5 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (yt2.i(gs2)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i3 |= i4;
        }
        if ((i3 & 19) != 18) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (yt2.V(i3 & 1, z2)) {
            Object Q2 = yt2.Q();
            if (Q2 == ay0.a) {
                Q2 = pf.b;
                yt2.o0(Q2);
            }
            lh4 lh4 = (lh4) Q2;
            int hashCode = Long.hashCode(yt2.T);
            vf5 m2 = yt2.m();
            ml4 E2 = gw8.E(yt2, ml4);
            ux0.d.getClass();
            vy0 vy0 = tx0.b;
            int i6 = (((((i3 << 3) & 112) | (((i3 >> 3) & 14) | 384)) << 6) & 896) | 6;
            yt2.i0();
            if (yt2.S) {
                yt2.l(vy0);
            } else {
                yt2.r0();
            }
            g75.Q(tx0.f, yt2, lh4);
            g75.Q(tx0.e, yt2, m2);
            g75.Q(tx0.g, yt2, Integer.valueOf(hashCode));
            g75.O(yt2, tx0.h);
            g75.Q(tx0.d, yt2, E2);
            gs2.H(yt2, Integer.valueOf((i6 >> 6) & 14));
            yt2.r(true);
        } else {
            yt2.Y();
        }
        yx5 v2 = yt2.v();
        if (v2 != null) {
            v2.d = new qf(ml4, gs2, i2);
        }
    }

    public static final float f(long j2, long j3) {
        return Math.min(Float.intBitsToFloat((int) (j3 >> 32)) / Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)) / Float.intBitsToFloat((int) (j2 & 4294967295L)));
    }

    public static final void g(fu4 fu4, gq3 gq3, fw0 fw0) {
        ox4 ox4 = fu4.g;
        ox4.getClass();
        fu4.j.add(new ix0((hx0) ox4.b(tf4.A(hx0.class)), gq3, fw0).a());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.ref.WeakReference} */
    /* JADX WARNING: type inference failed for: r1v5, types: [d58, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    public static boolean h(View view, KeyEvent keyEvent) {
        ArrayList arrayList;
        int size;
        int indexOfKey;
        WeakHashMap weakHashMap = e58.a;
        if (Build.VERSION.SDK_INT < 28) {
            ArrayList arrayList2 = d58.d;
            d58 d58 = (d58) view.getTag(R.id.tag_unhandled_key_event_manager);
            WeakReference weakReference = null;
            d58 d582 = d58;
            if (d58 == null) {
                ? obj = new Object();
                obj.a = null;
                obj.b = null;
                obj.c = null;
                view.setTag(R.id.tag_unhandled_key_event_manager, obj);
                d582 = obj;
            }
            WeakReference weakReference2 = d582.c;
            if (weakReference2 == null || weakReference2.get() != keyEvent) {
                d582.c = new WeakReference(keyEvent);
                if (d582.b == null) {
                    d582.b = new SparseArray();
                }
                SparseArray sparseArray = d582.b;
                if (keyEvent.getAction() == 1 && (indexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                    weakReference = (WeakReference) sparseArray.valueAt(indexOfKey);
                    sparseArray.removeAt(indexOfKey);
                }
                if (weakReference == null) {
                    weakReference = sparseArray.get(keyEvent.getKeyCode());
                }
                if (weakReference != null) {
                    View view2 = (View) weakReference.get();
                    if (view2 == null || !view2.isAttachedToWindow() || (arrayList = (ArrayList) view2.getTag(R.id.tag_unhandled_key_listeners)) == null || (size = arrayList.size() - 1) < 0) {
                        return true;
                    }
                    arrayList.get(size).getClass();
                    ku4.a();
                    return false;
                }
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:53:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    public static boolean i(rs3 rs3, View view, Window.Callback callback, KeyEvent keyEvent) {
        DialogInterface.OnKeyListener onKeyListener;
        boolean z2 = false;
        if (rs3 != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                return rs3.f(keyEvent);
            }
            KeyEvent.DispatcherState dispatcherState = null;
            if (callback instanceof Activity) {
                Activity activity = (Activity) callback;
                activity.onUserInteraction();
                Window window = activity.getWindow();
                if (window.hasFeature(8)) {
                    ActionBar actionBar = activity.getActionBar();
                    if (keyEvent.getKeyCode() == 82 && actionBar != null) {
                        if (!I0) {
                            try {
                                J0 = actionBar.getClass().getMethod("onMenuKeyEvent", new Class[]{KeyEvent.class});
                            } catch (NoSuchMethodException unused) {
                            }
                            I0 = true;
                        }
                        Method method = J0;
                        if (method != null) {
                            try {
                                Object invoke = method.invoke(actionBar, new Object[]{keyEvent});
                                if (invoke != null) {
                                    z2 = ((Boolean) invoke).booleanValue();
                                }
                            } catch (IllegalAccessException | InvocationTargetException unused2) {
                            }
                        }
                        if (z2) {
                            return true;
                        }
                    }
                }
                if (window.superDispatchKeyEvent(keyEvent)) {
                    return true;
                }
                View decorView = window.getDecorView();
                if (e58.c(decorView, keyEvent)) {
                    return true;
                }
                if (decorView != null) {
                    dispatcherState = decorView.getKeyDispatcherState();
                }
                return keyEvent.dispatch(activity, dispatcherState, activity);
            } else if (callback instanceof Dialog) {
                Dialog dialog = (Dialog) callback;
                if (!K0) {
                    try {
                        Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                        L0 = declaredField;
                        declaredField.setAccessible(true);
                    } catch (NoSuchFieldException unused3) {
                    }
                    K0 = true;
                }
                Field field = L0;
                if (field != null) {
                    try {
                        onKeyListener = (DialogInterface.OnKeyListener) field.get(dialog);
                    } catch (IllegalAccessException unused4) {
                    }
                    if (onKeyListener != null && onKeyListener.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
                        return true;
                    }
                    Window window2 = dialog.getWindow();
                    if (window2.superDispatchKeyEvent(keyEvent)) {
                        return true;
                    }
                    View decorView2 = window2.getDecorView();
                    if (e58.c(decorView2, keyEvent)) {
                        return true;
                    }
                    if (decorView2 != null) {
                        dispatcherState = decorView2.getKeyDispatcherState();
                    }
                    return keyEvent.dispatch(dialog, dispatcherState, dialog);
                }
                onKeyListener = null;
                if (onKeyListener != null || onKeyListener.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
                }
            } else if ((view == null || !e58.c(view, keyEvent)) && !rs3.f(keyEvent)) {
                return false;
            } else {
                return true;
            }
        }
        return false;
    }

    public static boolean j(pi0 pi0, pi0 pi02) {
        pi0.getClass();
        pi02.getClass();
        if (!(pi02 instanceof lj3) || !(pi0 instanceof xs2)) {
            return false;
        }
        lj3 lj3 = (lj3) pi02;
        lj3.S().size();
        xs2 xs2 = (xs2) pi0;
        xs2.S().size();
        List S2 = lj3.e1().S();
        S2.getClass();
        List S3 = xs2.a().S();
        S3.getClass();
        Iterator it = dt0.i1(S2, S3).iterator();
        while (it.hasNext()) {
            yb5 yb5 = (yb5) it.next();
            h28 h28 = (h28) yb5.w;
            h28 h282 = (h28) yb5.x;
            h28.getClass();
            boolean z2 = r((xs2) pi02, h28) instanceof vp3;
            h282.getClass();
            if (z2 != (r(xs2, h282) instanceof vp3)) {
                return true;
            }
        }
        return false;
    }

    public static final HashSet k(Iterable iterable) {
        HashSet hashSet = new HashSet();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Iterable d2 = ((ji4) it.next()).d();
            if (d2 == null) {
                return null;
            }
            it0.h0(hashSet, d2);
        }
        return hashSet;
    }

    public static final x83 l() {
        x83 x83 = E0;
        if (x83 != null) {
            return x83;
        }
        w83 w83 = new w83("Rounded.AttachMoney", 24.0f, 24.0f, 24.0f, 24.0f, 0, 0, false, 96);
        int i2 = e38.a;
        ky6 ky6 = new ky6(jt0.b);
        be5 e2 = pb4.e(11.8f, 10.9f);
        e2.e(-2.27f, -0.59f, -3.0f, -1.2f, -3.0f, -2.15f);
        e2.e(0.0f, -1.09f, 1.01f, -1.85f, 2.7f, -1.85f);
        e2.e(1.42f, 0.0f, 2.13f, 0.54f, 2.39f, 1.4f);
        e2.e(0.12f, 0.4f, 0.45f, 0.7f, 0.87f, 0.7f);
        e2.g(0.3f);
        e2.e(0.66f, 0.0f, 1.13f, -0.65f, 0.9f, -1.27f);
        e2.e(-0.42f, -1.18f, -1.4f, -2.16f, -2.96f, -2.54f);
        e2.m(4.5f);
        e2.e(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f);
        e2.k(10.0f, 3.67f, 10.0f, 4.5f);
        e2.n(0.66f);
        e2.e(-1.94f, 0.42f, -3.5f, 1.68f, -3.5f, 3.61f);
        e2.e(0.0f, 2.31f, 1.91f, 3.46f, 4.7f, 4.13f);
        e2.e(2.5f, 0.6f, 3.0f, 1.48f, 3.0f, 2.41f);
        e2.e(0.0f, 0.69f, -0.49f, 1.79f, -2.7f, 1.79f);
        e2.e(-1.65f, 0.0f, -2.5f, -0.59f, -2.83f, -1.43f);
        e2.e(-0.15f, -0.39f, -0.49f, -0.67f, -0.9f, -0.67f);
        e2.g(-0.28f);
        e2.e(-0.67f, 0.0f, -1.14f, 0.68f, -0.89f, 1.3f);
        e2.e(0.57f, 1.39f, 1.9f, 2.21f, 3.4f, 2.53f);
        e2.n(0.67f);
        e2.e(0.0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f);
        e2.l(1.5f, -0.67f, 1.5f, -1.5f);
        e2.n(-0.65f);
        e2.e(1.95f, -0.37f, 3.5f, -1.5f, 3.5f, -3.55f);
        e2.e(0.0f, -2.84f, -2.43f, -3.81f, -4.7f, -4.4f);
        e2.c();
        w83.a(w83, e2.a, ky6, 14336);
        x83 b2 = w83.b();
        E0 = b2;
        return b2;
    }

    public static DateTimeFormatter m(String str, Locale locale, LinkedHashMap linkedHashMap) {
        String h2 = f21.h("P:", str, locale.toLanguageTag());
        Object obj = linkedHashMap.get(h2);
        if (obj == null) {
            obj = DateTimeFormatter.ofPattern(str, locale).withDecimalStyle(DecimalStyle.of(locale));
            linkedHashMap.put(h2, obj);
        }
        obj.getClass();
        return z10.q(obj);
    }

    public static final x83 n() {
        x83 x83 = G0;
        if (x83 != null) {
            return x83;
        }
        w83 w83 = new w83("Rounded.Forum", 24.0f, 24.0f, 24.0f, 24.0f, 0, 0, false, 96);
        int i2 = e38.a;
        ky6 ky6 = new ky6(jt0.b);
        be5 be5 = new be5();
        be5.j(20.0f, 6.0f);
        be5.g(-1.0f);
        be5.n(8.0f);
        be5.e(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        be5.h(6.0f, 15.0f);
        be5.n(1.0f);
        be5.e(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        be5.g(10.0f);
        be5.i(4.0f, 4.0f);
        be5.h(22.0f, 8.0f);
        be5.e(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        b81.v(be5, 17.0f, 11.0f, 17.0f, 4.0f);
        be5.e(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        be5.h(4.0f, 2.0f);
        be5.e(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        be5.n(13.0f);
        be5.i(4.0f, -4.0f);
        be5.g(9.0f);
        be5.e(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        be5.c();
        w83.a(w83, be5.a, ky6, 14336);
        x83 b2 = w83.b();
        G0 = b2;
        return b2;
    }

    public static final x83 o() {
        x83 x83 = H0;
        if (x83 != null) {
            return x83;
        }
        w83 w83 = new w83("Rounded.HeadsetMic", 24.0f, 24.0f, 24.0f, 24.0f, 0, 0, false, 96);
        int i2 = e38.a;
        ky6 ky6 = new ky6(jt0.b);
        be5 e2 = pb4.e(11.4f, 1.02f);
        e2.d(6.62f, 1.33f, 3.0f, 5.52f, 3.0f, 10.31f);
        e2.m(17.0f);
        e2.e(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f);
        e2.g(1.0f);
        e2.e(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        e2.n(-4.0f);
        e2.e(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        e2.f(5.0f);
        e2.n(-1.71f);
        e2.d(5.0f, 6.45f, 7.96f, 3.11f, 11.79f, 3.0f);
        e2.d(15.76f, 2.89f, 19.0f, 6.06f, 19.0f, 10.0f);
        e2.n(2.0f);
        e2.g(-2.0f);
        e2.e(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        e2.n(4.0f);
        e2.e(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        e2.g(2.0f);
        e2.n(1.0f);
        e2.g(-6.0f);
        e2.e(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        e2.l(0.45f, 1.0f, 1.0f, 1.0f);
        e2.g(5.0f);
        e2.e(1.66f, 0.0f, 3.0f, -1.34f, 3.0f, -3.0f);
        e2.m(10.0f);
        e2.e(0.0f, -5.17f, -4.36f, -9.32f, -9.6f, -8.98f);
        e2.c();
        w83.a(w83, e2.a, ky6, 14336);
        x83 b2 = w83.b();
        H0 = b2;
        return b2;
    }

    public static final x83 p() {
        x83 x83 = M0;
        if (x83 != null) {
            return x83;
        }
        w83 w83 = new w83("Rounded.LocalOffer", 24.0f, 24.0f, 24.0f, 24.0f, 0, 0, false, 96);
        int i2 = e38.a;
        ky6 ky6 = new ky6(jt0.b);
        be5 f2 = pb4.f(21.41f, 11.58f, -9.0f, -9.0f);
        f2.d(12.05f, 2.22f, 11.55f, 2.0f, 11.0f, 2.0f);
        f2.f(4.0f);
        f2.e(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        f2.n(7.0f);
        f2.e(0.0f, 0.55f, 0.22f, 1.05f, 0.59f, 1.42f);
        f2.i(9.0f, 9.0f);
        f2.e(0.36f, 0.36f, 0.86f, 0.58f, 1.41f, 0.58f);
        f2.l(1.05f, -0.22f, 1.41f, -0.59f);
        f2.i(7.0f, -7.0f);
        f2.e(0.37f, -0.36f, 0.59f, -0.86f, 0.59f, -1.41f);
        f2.l(-0.23f, -1.06f, -0.59f, -1.42f);
        f2.c();
        f2.j(5.5f, 7.0f);
        f2.d(4.67f, 7.0f, 4.0f, 6.33f, 4.0f, 5.5f);
        f2.k(4.67f, 4.0f, 5.5f, 4.0f);
        f2.k(7.0f, 4.67f, 7.0f, 5.5f);
        f2.k(6.33f, 7.0f, 5.5f, 7.0f);
        f2.c();
        w83.a(w83, f2.a, ky6, 14336);
        x83 b2 = w83.b();
        M0 = b2;
        return b2;
    }

    public static List q(Object... objArr) {
        int length = objArr.length;
        if (length == 0) {
            return Collections.EMPTY_LIST;
        }
        if (length != 1) {
            return Collections.unmodifiableList(Arrays.asList(objArr));
        }
        return Collections.singletonList(objArr[0]);
    }

    /* JADX WARNING: type inference failed for: r6v13, types: [vq0] */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00b6, code lost:
        if (((defpackage.up3) r4).i.equals("java/lang/Object") != false) goto L_0x010a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0108, code lost:
        if (defpackage.ts1.g(r1).equals(defpackage.ts1.g(r2)) == false) goto L_0x011e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x010a, code lost:
        r6 = r7.b();
        r6.getClass();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x011d, code lost:
        return (defpackage.wp3) defpackage.ed1.u(defpackage.jb5.z(r6), defpackage.op7.i, r0);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    public static wp3 r(xs2 xs2, h28 h28) {
        ql4 ql4;
        vp3 vp3;
        zo3 zo3;
        xs2 a2;
        iw0 iw0 = iw0.A;
        xs2.getClass();
        ql4 ql42 = null;
        if (sg3.e(((wj1) xs2).getName().b(), "remove") && xs2.S().size() == 1 && !(ts1.i(xs2).r() instanceof w04) && !fv3.A(xs2)) {
            List S2 = xs2.a().S();
            S2.getClass();
            vw3 b2 = ((h28) dt0.Q0(S2)).b();
            b2.getClass();
            op7 op7 = op7.i;
            wp3 wp3 = (wp3) ed1.u(b2, op7, iw0);
            if (wp3 instanceof vp3) {
                vp3 = (vp3) wp3;
            } else {
                vp3 = null;
            }
            if (vp3 != null) {
                zo3 = vp3.i;
            } else {
                zo3 = null;
            }
            if (zo3 == zo3.INT && (a2 = vd0.a(xs2)) != null) {
                List S3 = a2.a().S();
                S3.getClass();
                vw3 b3 = ((h28) dt0.Q0(S3)).b();
                b3.getClass();
                wp3 wp32 = (wp3) ed1.u(b3, op7, iw0);
                vj1 r2 = a2.r();
                r2.getClass();
                vp2 f2 = rs1.f(r2);
                f2.getClass();
                if (f2.equals(m27.K.a)) {
                    if (wp32 instanceof up3) {
                    }
                }
            }
        }
        if (xs2.S().size() == 1) {
            vj1 r3 = xs2.r();
            if (r3 instanceof ql4) {
                ql4 = (ql4) r3;
            } else {
                ql4 = null;
            }
            if (ql4 != null) {
                List S4 = xs2.S();
                S4.getClass();
                ? u2 = ((h28) dt0.Q0(S4)).b().L().u();
                if (u2 instanceof ql4) {
                    ql42 = u2;
                }
                if (ql42 != null) {
                    if (fv3.u(ql4) != null) {
                    }
                }
            }
        }
        vw3 b4 = h28.b();
        b4.getClass();
        return (wp3) ed1.u(b4, op7.i, iw0);
    }

    public static final u04 s(am6 am6, ci3 ci3) {
        am6.getClass();
        ci3.getClass();
        return new u04(am6, ci3, false);
    }

    public static dq7 t(List list, bq7 bq7, vj1 vj1, ArrayList arrayList) {
        if (bq7 == null) {
            a(1);
            throw null;
        } else if (vj1 == null) {
            a(2);
            throw null;
        } else if (arrayList != null) {
            dq7 u2 = u(list, bq7, vj1, arrayList, (boolean[]) null);
            if (u2 != null) {
                return u2;
            }
            throw new AssertionError("Substitution failed");
        } else {
            a(3);
            throw null;
        }
    }

    public static dq7 u(List list, bq7 bq7, vj1 vj1, List list2, boolean[] zArr) {
        dq7 dq7;
        bq7 bq72 = bq7;
        List list3 = list2;
        if (bq72 == null) {
            a(6);
            throw null;
        } else if (vj1 == null) {
            a(7);
            throw null;
        } else if (list3 != null) {
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            Iterator it = list.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                qp7 qp7 = (qp7) it.next();
                rp7 h1 = rp7.h1(vj1, qp7.getAnnotations(), qp7.D(), qp7.I(), qp7.getName(), i2, qp7.X());
                hashMap.put(qp7.n(), new p27((vw3) h1.g0()));
                hashMap2.put(qp7, h1);
                list3.add(h1);
                i2++;
            }
            q27 q27 = new q27(1, hashMap);
            dq7 e2 = dq7.e(bq72, q27);
            dq7 e3 = dq7.e(new ll0(bq72, 1), q27);
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                qp7 qp72 = (qp7) it2.next();
                rp7 rp7 = (rp7) hashMap2.get(qp72);
                for (vw3 vw3 : qp72.getUpperBounds()) {
                    vq0 u2 = vw3.L().u();
                    if (!(u2 instanceof qp7) || !jb5.t((qp7) u2, (wo7) null, (Set) null)) {
                        dq7 = e3;
                    } else {
                        dq7 = e2;
                    }
                    vw3 h2 = dq7.h(vw3, k28.A);
                    if (h2 == null) {
                        return null;
                    }
                    if (!(h2 == vw3 || zArr == null)) {
                        zArr[0] = true;
                    }
                    if (rp7.H) {
                        h.s("Type parameter descriptor is already initialized: ".concat(rp7.j1()));
                        return null;
                    } else if (!gr8.N(h2)) {
                        rp7.G.add(h2);
                    }
                }
                if (!rp7.H) {
                    rp7.H = true;
                } else {
                    h.s("Type parameter descriptor is already initialized: ".concat(rp7.j1()));
                    return null;
                }
            }
            return e2;
        } else {
            a(8);
            throw null;
        }
    }

    public static final void v(gq3 gq3, String str) {
        String str2;
        gq3.getClass();
        String str3 = "in the polymorphic scope of '" + gq3.A() + '\'';
        if (str == null) {
            str2 = pb4.h('.', "Class discriminator was missing and no default serializers were registered ", str3);
        } else {
            StringBuilder o2 = f21.o("Serializer for subclass '", str, "' is not found ", str3, ".\nCheck if class with serial name '");
            f21.v(o2, str, "' exists and serializer is registered in a corresponding SerializersModule.\nTo be registered automatically, class '", str, "' has to be '@Serializable', and the base class '");
            o2.append(gq3.A());
            o2.append("' has to be sealed and '@Serializable'.");
            str2 = o2.toString();
        }
        throw new IllegalArgumentException(str2);
    }

    public static final void w() {
        throw new UnsupportedOperationException();
    }

    public static final long x(long j2, long j3) {
        boolean z2;
        boolean z3;
        int d2;
        boolean z4;
        boolean z5;
        boolean z6;
        int f2 = lg7.f(j2);
        int e2 = lg7.e(j2);
        boolean z7 = false;
        if (lg7.f(j3) < lg7.e(j2)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (lg7.f(j2) < lg7.e(j3)) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z2 && z3) {
            if (lg7.f(j3) <= lg7.f(j2)) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (lg7.e(j2) <= lg7.e(j3)) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z4 && z5) {
                f2 = lg7.f(j3);
                e2 = f2;
            } else {
                if (lg7.f(j2) <= lg7.f(j3)) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (lg7.e(j3) <= lg7.e(j2)) {
                    z7 = true;
                }
                if (z6 && z7) {
                    d2 = lg7.d(j3);
                } else {
                    int f3 = lg7.f(j3);
                    if (f2 >= lg7.e(j3) || f3 > f2) {
                        e2 = lg7.f(j3);
                    } else {
                        f2 = lg7.f(j3);
                        d2 = lg7.d(j3);
                    }
                }
            }
            return i95.a(f2, e2);
        }
        if (e2 > lg7.f(j3)) {
            f2 -= lg7.d(j3);
            d2 = lg7.d(j3);
        }
        return i95.a(f2, e2);
        e2 -= d2;
        return i95.a(f2, e2);
    }
}
