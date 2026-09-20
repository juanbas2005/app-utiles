package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: t49  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class t49 {
    public static volatile o75 a;
    public static final js0 b = new js0((Throwable) null);
    public static final fw0 c = new fw0(33406410, new xw0(9), false);
    public static final kw1 d = new Object();
    public static final a91 e = new a91(29);

    public static ImageView.ScaleType A(int i) {
        if (i == 0) {
            return ImageView.ScaleType.FIT_XY;
        }
        if (i == 1) {
            return ImageView.ScaleType.FIT_START;
        }
        if (i == 2) {
            return ImageView.ScaleType.FIT_CENTER;
        }
        if (i == 3) {
            return ImageView.ScaleType.FIT_END;
        }
        if (i == 5) {
            return ImageView.ScaleType.CENTER_CROP;
        }
        if (i != 6) {
            return ImageView.ScaleType.CENTER;
        }
        return ImageView.ScaleType.CENTER_INSIDE;
    }

    public static final xp7 B(xp7 xp7, qp7 qp7) {
        if (qp7 == null || xp7.a() == k28.y) {
            return xp7;
        }
        if (qp7.I() != xp7.a()) {
            kl0 kl0 = new kl0(xp7);
            ro7.x.getClass();
            return new p27((vw3) new hl0(xp7, kl0, false, ro7.y));
        } else if (!xp7.c()) {
            return new p27(xp7.b());
        } else {
            cb4 cb4 = kb4.e;
            cb4.getClass();
            return new p27((vw3) new l44(cb4, new k3(6, xp7)));
        }
    }

    public static uo7 C(boolean z, hz2 hz2, s3 s3Var, int i) {
        ax3 ax3 = ax3.p;
        if ((i & 4) != 0) {
            hz2 = hz2.L;
        }
        hz2 hz22 = hz2;
        if ((i & 8) != 0) {
            s3Var = s3.x;
        }
        return new uo7(z, true, true, hz22, s3Var, ax3);
    }

    public static final o81 D(yt2 yt2) {
        return new x36(yt2.R);
    }

    public static final wj2 E(a96 a96, boolean z, String[] strArr, vr2 vr2) {
        yb5 yb5;
        a96.getClass();
        eh3 g = a96.g();
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        do7 do7 = g.b;
        do7.getClass();
        sn6 sn6 = new sn6();
        int i = 0;
        for (String str : strArr2) {
            LinkedHashMap linkedHashMap = do7.c;
            String lowerCase = str.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            Set set = (Set) linkedHashMap.get(lowerCase);
            if (set != null) {
                sn6.addAll(set);
            } else {
                sn6.add(str);
            }
        }
        String[] strArr3 = (String[]) wn6.d(sn6).toArray(new String[0]);
        int length = strArr3.length;
        int[] iArr = new int[length];
        while (true) {
            if (i >= length) {
                yb5 = new yb5(strArr3, iArr);
                break;
            }
            String str2 = strArr3[i];
            LinkedHashMap linkedHashMap2 = do7.f;
            String lowerCase2 = str2.toLowerCase(Locale.ROOT);
            lowerCase2.getClass();
            Integer num = (Integer) linkedHashMap2.get(lowerCase2);
            if (num == null) {
                h.q("There is no table with name ".concat(str2));
                yb5 = null;
                break;
            }
            iArr[i] = num.intValue();
            i++;
        }
        String[] strArr4 = (String[]) yb5.w;
        int[] iArr2 = (int[]) yb5.x;
        strArr4.getClass();
        iArr2.getClass();
        return new wj2(gr8.u(new ze1(3, new ng((Object) do7, (Object) iArr2, (Object) strArr4, (f61) null, 24)), -1), a96, z, vr2);
    }

    public static final Object G(long j, f61 f61) {
        if (j > 0) {
            kk0 kk0 = new kk0(1, rc9.a0(f61));
            kk0.v();
            if (j < Long.MAX_VALUE) {
                M(kk0.A).k(j, kk0);
            }
            Object t = kk0.t();
            if (t == p81.w) {
                return t;
            }
        }
        return vs7.a;
    }

    public static final void H(hz1 hz1, cx2 cx2) {
        boolean z;
        boolean z2;
        boolean z3;
        Canvas canvas;
        long j;
        boolean z4;
        float f;
        Canvas canvas2;
        cx2 cx22 = cx2;
        qk0 D = hz1.j0().D();
        cx2 cx23 = (cx2) hz1.j0().y;
        ex2 ex2 = cx22.a;
        if (!cx22.s) {
            long j2 = cx22.h;
            Canvas a2 = pd.a(D);
            boolean isHardwareAccelerated = a2.isHardwareAccelerated();
            if (!isHardwareAccelerated) {
                long j3 = cx22.t;
                float f2 = (float) ((int) (j3 >> 32));
                float f3 = f2 - ((float) cx22.v);
                float f4 = (float) ((int) (j3 & 4294967295L));
                float f5 = f4 - ((float) cx22.w);
                long j4 = cx22.u;
                float f6 = f2 + ((float) ((int) (j4 >> 32))) + ((float) cx22.x);
                float f7 = f4 + ((float) ((int) (j4 & 4294967295L))) + ((float) cx22.y);
                float a3 = ex2.a();
                lt0 l = ex2.l();
                int N = ex2.N();
                if (a3 >= 1.0f && N == 3 && l == null) {
                    canvas2 = a2;
                    if (ex2.k() != 1) {
                        canvas2.save();
                        f = f3;
                        a2 = canvas2;
                        a2.translate(f, f5);
                        Matrix I = ex2.I();
                        I.preTranslate((float) cx22.v, (float) cx22.w);
                        a2.concat(I);
                        cx22.h = l35.d(cx22.h, (((long) Float.floatToRawIntBits((float) cx22.w)) & 4294967295L) | (((long) Float.floatToRawIntBits((float) cx22.v)) << 32));
                    }
                } else {
                    canvas2 = a2;
                }
                kb9 kb9 = cx22.p;
                if (kb9 == null) {
                    kb9 = dh4.b();
                    cx22.p = kb9;
                }
                kb9.i(a3);
                kb9.j(N);
                kb9.l(l);
                float f8 = f3;
                float f9 = f7;
                f = f8;
                a2 = canvas2;
                a2.saveLayer(f, f5, f6, f9, (Paint) kb9.y);
                a2.translate(f, f5);
                Matrix I2 = ex2.I();
                I2.preTranslate((float) cx22.v, (float) cx22.w);
                a2.concat(I2);
                cx22.h = l35.d(cx22.h, (((long) Float.floatToRawIntBits((float) cx22.w)) & 4294967295L) | (((long) Float.floatToRawIntBits((float) cx22.v)) << 32));
            }
            cx22.a();
            if (!ex2.p()) {
                try {
                    cx22.a.E(cx22.b, cx22.c, cx22, cx22.e);
                } catch (Throwable unused) {
                }
            }
            if (ex2.K() > 0.0f) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                D.t();
            }
            if (isHardwareAccelerated || !cx22.A) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2) {
                D.h();
                n85 d2 = cx22.d();
                if (d2 instanceof l85) {
                    qk0.q(D, ((l85) d2).l);
                } else if (d2 instanceof m85) {
                    eh ehVar = cx22.m;
                    if (ehVar != null) {
                        ehVar.h();
                    } else {
                        ehVar = gh.a();
                        cx22.m = ehVar;
                    }
                    eh.c(ehVar, ((m85) d2).l);
                    D.k(ehVar);
                } else if (d2 instanceof k85) {
                    D.k(((k85) d2).l);
                } else {
                    h.c();
                    return;
                }
            }
            if (cx23 != null) {
                ge2 ge2 = cx23.r;
                if (!ge2.a) {
                    xb3.a("Only add dependencies during a tracking");
                }
                up4 up4 = (up4) ge2.d;
                if (up4 != null) {
                    up4.a(cx22);
                } else if (((cx2) ge2.b) != null) {
                    up4 up42 = cg6.a;
                    up4 up43 = new up4();
                    cx2 cx24 = (cx2) ge2.b;
                    cx24.getClass();
                    up43.a(cx24);
                    up43.a(cx22);
                    ge2.d = up43;
                    ge2.b = null;
                } else {
                    ge2.b = cx22;
                }
                up4 up44 = (up4) ge2.e;
                if (up44 != null) {
                    z4 = !up44.l(cx22);
                } else if (((cx2) ge2.c) != cx22) {
                    z4 = true;
                } else {
                    ge2.c = null;
                    z4 = false;
                }
                if (z4) {
                    cx22.q++;
                }
            }
            if (!((od) D).a.isHardwareAccelerated()) {
                tk0 tk0 = cx22.o;
                if (tk0 == null) {
                    tk0 = new tk0();
                    cx22.o = tk0;
                }
                wr0 wr0 = tk0.x;
                tp1 tp1 = cx22.b;
                ey3 ey3 = cx22.c;
                long O = pv8.O(cx22.u);
                tp1 H = wr0.H();
                ey3 J = wr0.J();
                canvas = a2;
                qk0 D2 = wr0.D();
                j = j2;
                long L = wr0.L();
                z3 = z;
                cx2 cx25 = (cx2) wr0.y;
                wr0.c0(tp1);
                wr0.d0(ey3);
                wr0.b0(D);
                wr0.e0(O);
                wr0.y = cx22;
                D.h();
                try {
                    cx22.c(tk0);
                } finally {
                    D.p();
                    wr0.c0(H);
                    wr0.d0(J);
                    wr0.b0(D2);
                    wr0.e0(L);
                    wr0.y = cx25;
                }
            } else {
                j = j2;
                canvas = a2;
                z3 = z;
                ex2.j(D);
            }
            if (z2) {
                D.p();
            }
            if (z3) {
                D.i();
            }
            if (!isHardwareAccelerated) {
                canvas.restore();
            }
            cx22.h = j;
        }
    }

    public static final dy3 I(dy3 dy3) {
        dy3 dy32;
        xz4 xz4;
        dy3 D = dy3.D();
        while (true) {
            dy3 dy33 = D;
            dy32 = dy3;
            dy3 = dy33;
            if (dy3 == null) {
                break;
            }
            D = dy3.D();
        }
        if (dy32 instanceof xz4) {
            xz4 = (xz4) dy32;
        } else {
            xz4 = null;
        }
        if (xz4 == null) {
            return dy32;
        }
        xz4 xz42 = xz4.Q;
        while (true) {
            xz4 xz43 = xz42;
            xz4 xz44 = xz4;
            xz4 = xz43;
            if (xz4 == null) {
                return xz44;
            }
            xz42 = xz4.Q;
        }
    }

    public static final gq0 J(vq4 vq4, int i) {
        vq4.getClass();
        return pv8.F(vq4.a(i), vq4.b(i));
    }

    public static ColorStateList K(Context context, cf4 cf4, int i) {
        int resourceId;
        ColorStateList r;
        TypedArray typedArray = (TypedArray) cf4.y;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (r = ag8.r(context, resourceId)) == null) {
            return cf4.g(i);
        }
        return r;
    }

    public static ColorStateList L(Context context, TypedArray typedArray, int i) {
        int resourceId;
        ColorStateList r;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (r = ag8.r(context, resourceId)) == null) {
            return typedArray.getColorStateList(i);
        }
        return r;
    }

    public static final so1 M(e81 e81) {
        so1 so1;
        c81 a0 = e81.a0(hz2.z);
        if (a0 instanceof so1) {
            so1 = (so1) a0;
        } else {
            so1 = null;
        }
        if (so1 == null) {
            return pl1.a;
        }
        return so1;
    }

    public static Drawable N(Context context, TypedArray typedArray, int i) {
        int resourceId;
        Drawable N;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (N = rc9.N(context, resourceId)) == null) {
            return typedArray.getDrawable(i);
        }
        return N;
    }

    public static final l54 O(rv0 rv0) {
        w54 w54 = rv0.w;
        w54.getClass();
        ji8 ji8 = (ji8) w54.w;
        while (true) {
            l54 l54 = (l54) ((AtomicReference) ji8.x).get();
            if (l54 != null) {
                return l54;
            }
            w77 d2 = b85.d();
            dn1 dn1 = aw1.a;
            l54 l542 = new l54(w54, rc9.D0(d2, pe4.a.B));
            AtomicReference atomicReference = (AtomicReference) ji8.x;
            while (true) {
                if (atomicReference.compareAndSet((Object) null, l542)) {
                    dn1 dn12 = aw1.a;
                    ar7.H(l542, pe4.a.B, (r81) null, new tc1(l542, (f61) null, 7), 2);
                    return l542;
                } else if (atomicReference.get() != null) {
                }
            }
        }
    }

    public static final uq4 P(vq4 vq4, int i) {
        vq4.getClass();
        return uq4.d(vq4.getString(i));
    }

    public static ArrayList Q(MaterialToolbar materialToolbar, CharSequence charSequence) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < materialToolbar.getChildCount(); i++) {
            View childAt = materialToolbar.getChildAt(i);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (TextUtils.equals(textView.getText(), charSequence)) {
                    arrayList.add(textView);
                }
            }
        }
        return arrayList;
    }

    public static boolean R(Context context) {
        if (context.getResources().getConfiguration().fontScale >= 1.3f) {
            return true;
        }
        return false;
    }

    public static final boolean S(Throwable th) {
        Class cls = th.getClass();
        while (!sg3.e(cls.getCanonicalName(), "com.intellij.openapi.progress.ProcessCanceledException")) {
            cls = cls.getSuperclass();
            if (cls == null) {
                return false;
            }
        }
        return true;
    }

    public static void T(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        if (inputConnection != null && editorInfo.hintText == null) {
            for (ViewParent parent = textView.getParent(); parent instanceof View; parent = parent.getParent()) {
            }
        }
    }

    public static final ml4 U(ml4 ml4, vr2 vr2) {
        return ml4.d(new ts3(vr2, (vr2) null));
    }

    public static final ml4 V(ml4 ml4, vr2 vr2) {
        return ml4.d(new ts3((vr2) null, vr2));
    }

    public static final ml4 W(ml4 ml4, vr2 vr2) {
        return ml4.d(new i55(vr2));
    }

    public static void X(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() != null && colorStateList != null && colorStateList.isStateful()) {
            int[] drawableState = textInputLayout.getDrawableState();
            int[] drawableState2 = checkableImageButton.getDrawableState();
            int length = drawableState.length;
            int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
            System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
            int colorForState = colorStateList.getColorForState(copyOf, colorStateList.getDefaultColor());
            Drawable mutate = drawable.mutate();
            mutate.setTintList(ColorStateList.valueOf(colorForState));
            checkableImageButton.setImageDrawable(mutate);
        }
    }

    public static final gh6 Y(yt2 yt2) {
        Object[] objArr = new Object[0];
        boolean e2 = yt2.e(0);
        Object Q = yt2.Q();
        if (e2 || Q == ay0.a) {
            Q = new pp5(12);
            yt2.o0(Q);
        }
        return (gh6) u55.t(objArr, gh6.k, (sr2) Q, yt2, 0);
    }

    public static ml4 Z(ml4 ml4, gh6 gh6, boolean z) {
        z75 z75;
        ml4 ml42;
        z75 z752 = z75.w;
        if (z) {
            z75 = z752;
        } else {
            z75 = z75.x;
        }
        ap4 ap4 = gh6.e;
        jl4 jl4 = jl4.w;
        if (z75 == z752) {
            ml42 = we.f(jl4, m23.c);
        } else {
            ml42 = we.f(jl4, m23.b);
        }
        gh6 gh62 = gh6;
        return ml4.d(ml42).d(new hh6((xf) null, (fc0) null, (eh2) null, ap4, z75, gh62, true, true)).d(new vh6(gh62, z));
    }

    public static final void a(vl vlVar, ml4 ml4, tg7 tg7, vr2 vr2, int i, boolean z, int i2, int i3, Map map, yt2 yt2, int i4, int i5) {
        int i6;
        tg7 tg72;
        boolean z2;
        int i7;
        boolean z3;
        int i8;
        boolean z4;
        boolean z5;
        boolean z6;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        vl vlVar2 = vlVar;
        int i19 = i2;
        int i20 = i3;
        yt2 yt22 = yt2;
        int i21 = i4;
        yt22.g0(-1343466571);
        if ((i21 & 6) == 0) {
            if (yt22.g(vlVar2)) {
                i18 = 4;
            } else {
                i18 = 2;
            }
            i6 = i18 | i21;
        } else {
            i6 = i21;
        }
        ml4 ml42 = ml4;
        if ((i21 & 48) == 0) {
            if (yt22.g(ml42)) {
                i17 = 32;
            } else {
                i17 = 16;
            }
            i6 |= i17;
        }
        if ((i21 & 384) == 0) {
            tg72 = tg7;
            if (yt22.g(tg72)) {
                i16 = 256;
            } else {
                i16 = 128;
            }
            i6 |= i16;
        } else {
            tg72 = tg7;
        }
        if ((i21 & 3072) == 0) {
            if (yt22.i(vr2)) {
                i15 = 2048;
            } else {
                i15 = 1024;
            }
            i6 |= i15;
        } else {
            vr2 vr22 = vr2;
        }
        if ((i21 & 24576) == 0) {
            if (yt22.e(i)) {
                i14 = 16384;
            } else {
                i14 = 8192;
            }
            i6 |= i14;
        } else {
            int i22 = i;
        }
        if ((196608 & i21) == 0) {
            z2 = z;
            if (yt22.h(z2)) {
                i13 = 131072;
            } else {
                i13 = 65536;
            }
            i6 |= i13;
        } else {
            z2 = z;
        }
        if ((1572864 & i21) == 0) {
            if (yt22.e(i19)) {
                i12 = 1048576;
            } else {
                i12 = 524288;
            }
            i6 |= i12;
        }
        if ((12582912 & i21) == 0) {
            if (yt22.e(i20)) {
                i11 = 8388608;
            } else {
                i11 = 4194304;
            }
            i6 |= i11;
        }
        if ((100663296 & i21) == 0) {
            if (yt22.i(map)) {
                i10 = 67108864;
            } else {
                i10 = 33554432;
            }
            i6 |= i10;
        } else {
            Map map2 = map;
        }
        int i23 = i6 | 805306368;
        if ((i5 & 6) == 0) {
            if ((i5 & 8) == 0) {
                z6 = yt22.g((Object) null);
            } else {
                z6 = yt22.i((Object) null);
            }
            if (z6) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            i7 = i5 | i9;
        } else {
            i7 = i5;
        }
        boolean z7 = false;
        if ((306783379 & i23) == 306783378 && (i7 & 3) == 2) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (yt22.V(i23 & 1, z3)) {
            rd3.K(i20, i19);
            if (yt22.k(yj6.a) == null) {
                yt22.e0(1588900273);
                yt22.r(false);
                yb5 yb5 = yl.a;
                int length = vlVar2.x.length();
                List list = vlVar2.w;
                if (list != null) {
                    int size = list.size();
                    int i24 = 0;
                    while (true) {
                        if (i24 >= size) {
                            break;
                        }
                        ul ulVar = (ul) list.get(i24);
                        i8 = i23;
                        if (!(ulVar.a instanceof o47) || !"androidx.compose.foundation.text.inlineContent".equals(ulVar.d)) {
                            z7 = false;
                        } else {
                            int i25 = ulVar.b;
                            int i26 = ulVar.c;
                            z7 = false;
                            if (wl.b(0, length, i25, i26)) {
                                z4 = true;
                                break;
                            }
                        }
                        i24++;
                        vl vlVar3 = vlVar;
                        i23 = i8;
                    }
                }
                i8 = i23;
                z4 = z7;
                boolean j = i35.j(vlVar);
                dl2 dl2 = (dl2) yt22.k(xy0.k);
                if (z4 || j) {
                    yt2 yt23 = yt22;
                    boolean z8 = z7;
                    yt23.e0(1590195670);
                    if ((i8 & 14) == 4) {
                        z5 = true;
                    } else {
                        z5 = z8;
                    }
                    Object Q = yt23.Q();
                    Object obj = ay0.a;
                    if (z5 || Q == obj) {
                        Q = u55.p(vlVar);
                        yt23.o0(Q);
                    }
                    aq4 aq4 = (aq4) Q;
                    vl vlVar4 = (vl) aq4.getValue();
                    boolean g = yt23.g(aq4);
                    Object Q2 = yt23.Q();
                    if (g || Q2 == obj) {
                        Q2 = new xi(aq4, 3);
                        yt23.o0(Q2);
                    }
                    int i27 = i8 << 6;
                    int i28 = ((i8 >> 3) & 910) | ((i8 >> 12) & 57344) | ((i8 << 9) & 458752) | (3670016 & i27) | (29360128 & i27) | (234881024 & i27) | (i27 & 1879048192);
                    int i29 = ((i8 >> 21) & 896) | (57344 & (i7 << 12));
                    int i30 = i28;
                    boolean z9 = z8;
                    ml4 ml43 = ml4;
                    int i31 = i29;
                    vl vlVar5 = vlVar4;
                    vr2 vr23 = vr2;
                    k(ml43, vlVar5, vr23, z4, map, tg7, i, z, i2, i3, dl2, (vr2) Q2, yt23, i30, i31);
                    yt22 = yt23;
                    yt22.r(z9);
                } else {
                    yt22.e0(1589148149);
                    b70.a(vlVar, tg72, dl2, (List) null, z2, yt22);
                    yt2 yt24 = yt22;
                    boolean z10 = z7;
                    ml4 c0 = c0(ml42, vlVar, tg7, vr2, i, z, i19, i20, dl2, (List) null, (vr2) null, (vr2) null);
                    pf pfVar = pf.h;
                    int hashCode = Long.hashCode(yt24.T);
                    ml4 E = gw8.E(yt24, c0);
                    vf5 m = yt24.m();
                    ux0.d.getClass();
                    vy0 vy0 = tx0.b;
                    yt24.i0();
                    if (yt24.S) {
                        yt24.l(vy0);
                    } else {
                        yt24.r0();
                    }
                    g75.Q(tx0.f, yt24, pfVar);
                    g75.Q(tx0.e, yt24, m);
                    g75.O(yt24, tx0.h);
                    g75.Q(tx0.d, yt24, E);
                    g75.Q(tx0.g, yt24, Integer.valueOf(hashCode));
                    yt24.r(true);
                    yt24.r(z10);
                    yt22 = yt24;
                }
            } else {
                ku4.a();
                return;
            }
        } else {
            yt22.Y();
        }
        yx5 v = yt22.v();
        if (v != null) {
            v.d = new w60(vlVar, ml4, tg7, vr2, i, z, i2, i3, map, i4, i5);
        }
    }

    public static void a0(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        boolean z;
        boolean hasOnClickListeners = checkableImageButton.hasOnClickListeners();
        boolean z2 = false;
        int i = 1;
        if (onLongClickListener != null) {
            z = true;
        } else {
            z = false;
        }
        if (hasOnClickListeners || z) {
            z2 = true;
        }
        checkableImageButton.setFocusable(z2);
        checkableImageButton.setClickable(hasOnClickListeners);
        checkableImageButton.setPressable(hasOnClickListeners);
        checkableImageButton.setLongClickable(z);
        if (!z2) {
            i = 2;
        }
        checkableImageButton.setImportantForAccessibility(i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:127:0x01da  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x01e6  */
    /* JADX WARNING: Removed duplicated region for block: B:132:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x00fc  */
    public static final void b(String str, ml4 ml4, tg7 tg7, int i, boolean z, int i2, int i3, yt2 yt2, int i4, int i5) {
        int i6;
        int i7;
        int i8;
        boolean z2;
        int i9;
        int i10;
        int i11;
        boolean z3;
        int i12;
        boolean z4;
        int i13;
        yx5 v;
        boolean z5;
        int i14;
        boolean z6;
        boolean z7;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        ml4 ml42 = ml4;
        int i24 = i2;
        yt2 yt22 = yt2;
        int i25 = i4;
        int i26 = i5;
        yt22.g0(-1040751001);
        String str2 = str;
        if ((i25 & 6) == 0) {
            if (yt22.g(str2)) {
                i23 = 4;
            } else {
                i23 = 2;
            }
            i6 = i23 | i25;
        } else {
            i6 = i25;
        }
        if ((i25 & 48) == 0) {
            if (yt22.g(ml42)) {
                i22 = 32;
            } else {
                i22 = 16;
            }
            i6 |= i22;
        }
        tg7 tg72 = tg7;
        if ((i25 & 384) == 0) {
            if (yt22.g(tg72)) {
                i21 = 256;
            } else {
                i21 = 128;
            }
            i6 |= i21;
        }
        if ((i26 & 8) != 0) {
            i6 |= 3072;
        } else if ((i25 & 3072) == 0) {
            if (yt22.i((Object) null)) {
                i20 = 2048;
            } else {
                i20 = 1024;
            }
            i6 |= i20;
        }
        int i27 = i26 & 16;
        if (i27 != 0) {
            i6 |= 24576;
        } else if ((i25 & 24576) == 0) {
            i7 = i;
            if (yt22.e(i7)) {
                i19 = 16384;
            } else {
                i19 = 8192;
            }
            i6 |= i19;
            i8 = i26 & 32;
            if (i8 == 0) {
                i6 |= 196608;
            } else if ((196608 & i25) == 0) {
                z2 = z;
                if (yt22.h(z2)) {
                    i18 = 131072;
                } else {
                    i18 = 65536;
                }
                i6 |= i18;
                if ((1572864 & i25) == 0) {
                    if (yt22.e(i24)) {
                        i17 = 1048576;
                    } else {
                        i17 = 524288;
                    }
                    i6 |= i17;
                }
                i9 = i26 & 128;
                if (i9 != 0) {
                    i6 |= 12582912;
                } else if ((12582912 & i25) == 0) {
                    i10 = i3;
                    if (yt22.e(i10)) {
                        i16 = 8388608;
                    } else {
                        i16 = 4194304;
                    }
                    i6 |= i16;
                    i11 = 100663296 | i6;
                    if ((i26 & 512) == 0) {
                        i11 = i6 | 905969664;
                    } else if ((805306368 & i25) == 0) {
                        if ((1073741824 & i25) == 0) {
                            z7 = yt22.g((Object) null);
                        } else {
                            z7 = yt22.i((Object) null);
                        }
                        if (z7) {
                            i15 = 536870912;
                        } else {
                            i15 = 268435456;
                        }
                        i11 |= i15;
                    }
                    if ((306783379 & i11) == 306783378) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (!yt22.V(i11 & 1, z3)) {
                        if (i27 != 0) {
                            i7 = 1;
                        }
                        if (i8 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        if (i9 != 0) {
                            i14 = 1;
                        } else {
                            i14 = i10;
                        }
                        rd3.K(i14, i24);
                        if (yt22.k(yj6.a) == null) {
                            yt22.e0(357055103);
                            yt22.r(false);
                            dl2 dl2 = (dl2) yt22.k(xy0.k);
                            Executor executor = (Executor) yt22.k(b70.a);
                            if (executor == null || !b70.b(str2.length())) {
                                z6 = false;
                                yt22.e0(-1248455541);
                                yt22.r(false);
                            } else {
                                yt22.e0(-1250263182);
                                try {
                                    boolean z8 = z5;
                                    try {
                                        z5 = z8;
                                        executor.execute(new a70(tg72, (ey3) yt22.k(xy0.n), str2, (tp1) yt22.k(xy0.h), dl2, z8));
                                    } catch (RejectedExecutionException unused) {
                                        z5 = z8;
                                    }
                                } catch (RejectedExecutionException unused2) {
                                }
                                z6 = false;
                                yt22.r(false);
                            }
                            yt22.e0(358076243);
                            yt22.r(z6);
                            ml4 d2 = ml42.d(new pg7(str, tg7, dl2, i7, z5, i24, i14));
                            pf pfVar = pf.h;
                            int hashCode = Long.hashCode(yt22.T);
                            ml4 E = gw8.E(yt22, d2);
                            vf5 m = yt22.m();
                            ux0.d.getClass();
                            vy0 vy0 = tx0.b;
                            yt22.i0();
                            if (yt22.S) {
                                yt22.l(vy0);
                            } else {
                                yt22.r0();
                            }
                            g75.Q(tx0.f, yt22, pfVar);
                            g75.Q(tx0.e, yt22, m);
                            g75.O(yt22, tx0.h);
                            g75.Q(tx0.d, yt22, E);
                            g75.Q(tx0.g, yt22, Integer.valueOf(hashCode));
                            yt22.r(true);
                            i13 = i7;
                            z4 = z5;
                            i12 = i14;
                        } else {
                            ku4.a();
                            return;
                        }
                    } else {
                        yt22.Y();
                        i13 = i7;
                        z4 = z2;
                        i12 = i10;
                    }
                    v = yt22.v();
                    if (v == null) {
                        v.d = new u60(str, ml42, tg7, i13, z4, i2, i12, i4, i26);
                        return;
                    }
                    return;
                }
                i10 = i3;
                i11 = 100663296 | i6;
                if ((i26 & 512) == 0) {
                }
                if ((306783379 & i11) == 306783378) {
                }
                if (!yt22.V(i11 & 1, z3)) {
                }
                v = yt22.v();
                if (v == null) {
                }
            }
            z2 = z;
            if ((1572864 & i25) == 0) {
            }
            i9 = i26 & 128;
            if (i9 != 0) {
            }
            i10 = i3;
            i11 = 100663296 | i6;
            if ((i26 & 512) == 0) {
            }
            if ((306783379 & i11) == 306783378) {
            }
            if (!yt22.V(i11 & 1, z3)) {
            }
            v = yt22.v();
            if (v == null) {
            }
        }
        i7 = i;
        i8 = i26 & 32;
        if (i8 == 0) {
        }
        z2 = z;
        if ((1572864 & i25) == 0) {
        }
        i9 = i26 & 128;
        if (i9 != 0) {
        }
        i10 = i3;
        i11 = 100663296 | i6;
        if ((i26 & 512) == 0) {
        }
        if ((306783379 & i11) == 306783378) {
        }
        if (!yt22.V(i11 & 1, z3)) {
        }
        v = yt22.v();
        if (v == null) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    public static final void c(ju5 ju5, gs2 gs2, yt2 yt2, int i) {
        c28 c28;
        boolean z;
        yx5 v;
        yt2.g0(-149765515);
        xe3 xe3 = yt2.x;
        vf5 m = yt2.m();
        yt2.b0(201, ey0.b);
        Object Q = yt2.Q();
        if (sg3.e(Q, ay0.a)) {
            c28 = null;
        } else {
            Q.getClass();
            c28 = (c28) Q;
        }
        hu5 hu5 = ju5.a;
        c28 d2 = hu5.d(ju5, c28);
        boolean equals = d2.equals(c28);
        if (!equals) {
            yt2.o0(d2);
        }
        boolean z2 = true;
        if (yt2.S) {
            if (ju5.g || !m.containsKey(hu5)) {
                m = m.g(hu5, d2);
            }
            yt2.J = true;
        } else {
            fv6 fv6 = yt2.G;
            Object b2 = fv6.b(fv6.b, fv6.g);
            b2.getClass();
            vf5 vf5 = (vf5) b2;
            if ((!yt2.F() || !equals) && (ju5.g || !m.containsKey(hu5))) {
                m = m.g(hu5, d2);
            } else if ((equals && !yt2.w) || !yt2.w) {
                m = vf5;
            }
            if (yt2.y || vf5 != m) {
                z = true;
                if (z && !yt2.S) {
                    yt2.O(m);
                }
                xe3.c(yt2.w ? 1 : 0);
                yt2.w = z;
                yt2.K = m;
                yt2.Z(ey0.c, 202, m, 0);
                pb4.q((i >> 3) & 14, gs2, yt2, false, false);
                if (xe3.b() == 0) {
                    z2 = false;
                }
                yt2.w = z2;
                yt2.K = null;
                v = yt2.v();
                if (v == null) {
                    v.d = new dj7((Object) ju5, (Object) gs2, i, 5);
                    return;
                }
                return;
            }
        }
        z = false;
        yt2.O(m);
        xe3.c(yt2.w ? 1 : 0);
        yt2.w = z;
        yt2.K = m;
        yt2.Z(ey0.c, 202, m, 0);
        pb4.q((i >> 3) & 14, gs2, yt2, false, false);
        if (xe3.b() == 0) {
        }
        yt2.w = z2;
        yt2.K = null;
        v = yt2.v();
        if (v == null) {
        }
    }

    public static final ml4 c0(ml4 ml4, vl vlVar, tg7 tg7, vr2 vr2, int i, boolean z, int i2, int i3, dl2 dl2, List list, vr2 vr22, vr2 vr23) {
        return ml4.d(jl4.w).d(new kc7(vlVar, tg7, dl2, vr2, i, z, i2, i3, list, vr22, vr23));
    }

    /* JADX WARNING: type inference failed for: r7v4, types: [uf5, yf5] */
    /* JADX WARNING: type inference failed for: r7v6, types: [uf5, yf5] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    public static final void d(ju5[] ju5Arr, gs2 gs2, yt2 yt2, int i) {
        boolean z;
        vf5 vf5;
        yx5 v;
        yt2.g0(415205898);
        xe3 xe3 = yt2.x;
        vf5 m = yt2.m();
        yt2.b0(201, ey0.b);
        boolean z2 = yt2.S;
        t55 t55 = ey0.d;
        boolean z3 = true;
        if (z2) {
            vf5 c1 = rc9.c1(ju5Arr, m, vf5.z);
            m.getClass();
            ? yf5 = new yf5(m);
            yf5.C = m;
            yf5.putAll(c1);
            vf5 = yf5.b();
            yt2.b0(204, t55);
            yt2.I();
            yt2.p0(vf5);
            yt2.I();
            yt2.p0(c1);
            yt2.r(false);
            yt2.J = true;
        } else {
            fv6 fv6 = yt2.G;
            Object h = fv6.h(fv6.g, 0);
            h.getClass();
            vf5 vf52 = (vf5) h;
            fv6 fv62 = yt2.G;
            Object h2 = fv62.h(fv62.g, 1);
            h2.getClass();
            vf5 vf53 = (vf5) h2;
            vf5 c12 = rc9.c1(ju5Arr, m, vf53);
            if (!yt2.F() || yt2.y || !vf53.equals(c12)) {
                m.getClass();
                ? yf52 = new yf5(m);
                yf52.C = m;
                yf52.putAll(c12);
                vf5 = yf52.b();
                yt2.b0(204, t55);
                yt2.I();
                yt2.p0(vf5);
                yt2.I();
                yt2.p0(c12);
                yt2.r(false);
                if (yt2.y || !sg3.e(vf5, vf52)) {
                    z = true;
                    if (z && !yt2.S) {
                        yt2.O(vf5);
                    }
                    xe3.c(yt2.w ? 1 : 0);
                    yt2.w = z;
                    yt2.K = vf5;
                    yt2.Z(ey0.c, 202, vf5, 0);
                    pb4.q((i >> 3) & 14, gs2, yt2, false, false);
                    if (xe3.b() == 0) {
                        z3 = false;
                    }
                    yt2.w = z3;
                    yt2.K = null;
                    v = yt2.v();
                    if (v == null) {
                        v.d = new dj7((Object) ju5Arr, (Object) gs2, i, 4);
                        return;
                    }
                    return;
                }
            } else {
                yt2.l = yt2.G.s() + yt2.l;
                vf5 = vf52;
            }
        }
        z = false;
        yt2.O(vf5);
        xe3.c(yt2.w ? 1 : 0);
        yt2.w = z;
        yt2.K = vf5;
        yt2.Z(ey0.c, 202, vf5, 0);
        pb4.q((i >> 3) & 14, gs2, yt2, false, false);
        if (xe3.b() == 0) {
        }
        yt2.w = z3;
        yt2.K = null;
        v = yt2.v();
        if (v == null) {
        }
    }

    public static final long d0(long j) {
        boolean z;
        xb4 xb4 = u02.x;
        if (j > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return u02.e(u02.h(j, gl0.f0(999999, y02.NANOSECONDS)));
        }
        if (!z) {
            return 0;
        }
        h.c();
        return 0;
    }

    public static final void e(Object obj, vr2 vr2, yt2 yt2) {
        boolean g = yt2.g(obj);
        Object Q = yt2.Q();
        if (g || Q == ay0.a) {
            Q = new iw1(vr2);
            yt2.o0(Q);
        }
        iw1 iw1 = (iw1) Q;
    }

    public static final String e0(int i) {
        if (i == 0) {
            return "0";
        }
        char[] cArr = su0.b;
        int i2 = 0;
        char[] cArr2 = {cArr[(i >> 28) & 15], cArr[(i >> 24) & 15], cArr[(i >> 20) & 15], cArr[(i >> 16) & 15], cArr[(i >> 12) & 15], cArr[(i >> 8) & 15], cArr[(i >> 4) & 15], cArr[i & 15]};
        while (i2 < 8 && cArr2[i2] == '0') {
            i2++;
        }
        return k57.j0(cArr2, i2, 8);
    }

    public static final void f(Object obj, Object obj2, vr2 vr2, yt2 yt2) {
        boolean g = yt2.g(obj) | yt2.g(obj2);
        Object Q = yt2.Q();
        if (g || Q == ay0.a) {
            Q = new iw1(vr2);
            yt2.o0(Q);
        }
        iw1 iw1 = (iw1) Q;
    }

    public static bq7 f0(bq7 bq7) {
        if (!(bq7 instanceof ja3)) {
            return new ll0(bq7, 0);
        }
        ja3 ja3 = (ja3) bq7;
        qp7[] qp7Arr = ja3.b;
        ArrayList s1 = qs.s1(ja3.c, qp7Arr);
        ArrayList arrayList = new ArrayList(et0.e0(s1, 10));
        Iterator it = s1.iterator();
        while (it.hasNext()) {
            yb5 yb5 = (yb5) it.next();
            arrayList.add(B((xp7) yb5.w, (qp7) yb5.x));
        }
        return new ja3(qp7Arr, (xp7[]) arrayList.toArray(new xp7[0]), true);
    }

    public static final void g(Object[] objArr, vr2 vr2, yt2 yt2) {
        boolean z = false;
        for (Object g : Arrays.copyOf(objArr, objArr.length)) {
            z |= yt2.g(g);
        }
        Object Q = yt2.Q();
        if (z || Q == ay0.a) {
            yt2.o0(new iw1(vr2));
        }
    }

    public static o75 g0(Context context) {
        o75 o75;
        Context context2;
        StrictMode.ThreadPolicy allowThreadDiskReads;
        o75 o752;
        o75 o753;
        BufferedReader bufferedReader;
        Throwable th;
        char c2;
        o75 o754 = a;
        if (o754 != null) {
            return o754;
        }
        synchronized (t49.class) {
            try {
                o75 = a;
                if (o75 == null) {
                    String str = Build.TYPE;
                    String str2 = Build.TAGS;
                    js jsVar = u49.a;
                    if (!str.equals("eng")) {
                        if (str.equals("userdebug")) {
                        }
                        o75 = y.w;
                        a = o75;
                    }
                    if (!str2.contains("dev-keys")) {
                        if (str2.contains("test-keys")) {
                        }
                        o75 = y.w;
                        a = o75;
                    }
                    if (!context.isDeviceProtectedStorage()) {
                        context2 = context.createDeviceProtectedStorageContext();
                    } else {
                        context2 = context;
                    }
                    allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    StrictMode.allowThreadDiskWrites();
                    char c3 = 0;
                    try {
                        File file = new File(context2.getDir("phenotype_hermetic", 0), "overrides.txt");
                        if (file.exists()) {
                            o752 = new xn5(file);
                        } else {
                            o752 = y.w;
                        }
                    } catch (RuntimeException e2) {
                        Log.e("HermeticFileOverrides", "no data dir", e2);
                        o752 = y.w;
                    }
                    if (o752.b()) {
                        File file2 = (File) o752.a();
                        try {
                            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file2)));
                            zt6 zt6 = new zt6(0);
                            HashMap hashMap = new HashMap();
                            while (true) {
                                String readLine = bufferedReader.readLine();
                                if (readLine == null) {
                                    break;
                                }
                                String[] split = readLine.split(" ", 3);
                                if (split.length != 3) {
                                    StringBuilder sb = new StringBuilder(readLine.length() + 9);
                                    sb.append("Invalid: ");
                                    sb.append(readLine);
                                    Log.e("HermeticFileOverrides", sb.toString());
                                } else {
                                    String str3 = new String(split[c3]);
                                    String decode = Uri.decode(new String(split[1]));
                                    String str4 = (String) hashMap.get(split[2]);
                                    if (str4 == null) {
                                        String str5 = new String(split[2]);
                                        str4 = Uri.decode(str5);
                                        if (str4.length() < 1024 || str4 == str5) {
                                            hashMap.put(str5, str4);
                                        }
                                    }
                                    zt6 zt62 = (zt6) zt6.get(str3);
                                    if (zt62 == null) {
                                        c2 = 0;
                                        zt62 = new zt6(0);
                                        zt6.put(str3, zt62);
                                    } else {
                                        c2 = 0;
                                    }
                                    zt62.put(decode, str4);
                                    c3 = c2;
                                }
                            }
                            String obj = file2.toString();
                            String packageName = context2.getPackageName();
                            StringBuilder sb2 = new StringBuilder(obj.length() + 28 + String.valueOf(packageName).length());
                            sb2.append("Parsed ");
                            sb2.append(obj);
                            sb2.append(" for Android package ");
                            sb2.append(packageName);
                            Log.w("HermeticFileOverrides", sb2.toString());
                            s49 s49 = new s49(zt6);
                            bufferedReader.close();
                            o753 = new xn5(s49);
                        } catch (IOException e3) {
                            throw new RuntimeException(e3);
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    } else {
                        o753 = y.w;
                    }
                    StrictMode.setThreadPolicy(allowThreadDiskReads);
                    o75 = o753;
                    a = o75;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return o75;
        throw th;
    }

    public static final void h(gs2 gs2, yt2 yt2, Object obj) {
        e81 e81 = yt2.R;
        boolean g = yt2.g(obj);
        Object Q = yt2.Q();
        if (g || Q == ay0.a) {
            Q = new yx3(e81, gs2);
            yt2.o0(Q);
        }
        yx3 yx3 = (yx3) Q;
    }

    public static final void i(Object obj, Boolean bool, Object obj2, gs2 gs2, yt2 yt2) {
        e81 e81 = yt2.R;
        boolean g = yt2.g(obj) | yt2.g(bool) | yt2.g(obj2);
        Object Q = yt2.Q();
        if (g || Q == ay0.a) {
            Q = new yx3(e81, gs2);
            yt2.o0(Q);
        }
        yx3 yx3 = (yx3) Q;
    }

    public static final void j(Object obj, Object obj2, gs2 gs2, yt2 yt2) {
        e81 e81 = yt2.R;
        boolean g = yt2.g(obj) | yt2.g(obj2);
        Object Q = yt2.Q();
        if (g || Q == ay0.a) {
            Q = new yx3(e81, gs2);
            yt2.o0(Q);
        }
        yx3 yx3 = (yx3) Q;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: aq4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: a42} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v14, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v15, resolved type: a42} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v16, resolved type: a42} */
    /* JADX WARNING: type inference failed for: r9v2, types: [aq4, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r9v4 */
    /* JADX WARNING: Multi-variable type inference failed */
    public static final void k(ml4 ml4, vl vlVar, vr2 vr2, boolean z, Map map, tg7 tg7, int i, boolean z2, int i2, int i3, dl2 dl2, vr2 vr22, yt2 yt2, int i4, int i5) {
        int i6;
        int i7;
        fg7 fg7;
        sr2 sr2;
        sr2 sr22;
        fg7 fg72;
        yb5 yb5;
        vr2 vr23;
        aq4 aq4;
        Object obj;
        boolean z3;
        boolean z4;
        a42 a42;
        vl vlVar2 = vlVar;
        vr2 vr24 = vr2;
        boolean z5 = z;
        Map map2 = map;
        yt2 yt22 = yt2;
        int i8 = i4;
        int i9 = i5;
        yt22.g0(-2118572703);
        ml4 ml42 = ml4;
        if ((i8 & 6) == 0) {
            i6 = (yt22.g(ml42) ? 4 : 2) | i8;
        } else {
            i6 = i8;
        }
        if ((i8 & 48) == 0) {
            i6 |= yt22.g(vlVar2) ? 32 : 16;
        }
        if ((i8 & 384) == 0) {
            i6 |= yt22.i(vr24) ? 256 : 128;
        }
        int i10 = 1024;
        if ((i8 & 3072) == 0) {
            i6 |= yt22.h(z5) ? 2048 : 1024;
        }
        int i11 = 8192;
        if ((i8 & 24576) == 0) {
            i6 |= yt22.i(map2) ? 16384 : 8192;
        }
        if ((196608 & i8) == 0) {
            i6 |= yt22.g(tg7) ? 131072 : 65536;
        } else {
            tg7 tg72 = tg7;
        }
        int i12 = i;
        if ((i8 & 1572864) == 0) {
            i6 |= yt22.e(i12) ? 1048576 : 524288;
        }
        boolean z6 = z2;
        if ((i8 & 12582912) == 0) {
            i6 |= yt22.h(z6) ? 8388608 : 4194304;
        }
        int i13 = i2;
        if ((i8 & 100663296) == 0) {
            i6 |= yt22.e(i13) ? 67108864 : 33554432;
        }
        int i14 = i3;
        if ((i8 & 805306368) == 0) {
            i6 |= yt22.e(i14) ? 536870912 : 268435456;
        }
        dl2 dl22 = dl2;
        if ((i9 & 6) == 0) {
            i7 = i9 | (yt22.i(dl22) ? 4 : 2);
        } else {
            i7 = i9;
        }
        if ((i9 & 48) == 0) {
            i7 |= yt22.i((Object) null) ? 32 : 16;
        }
        int i15 = i6;
        if ((i9 & 384) == 0) {
            i7 |= yt22.i((Object) null) ? 256 : 128;
        }
        if ((i9 & 3072) == 0) {
            if (yt22.i(vr22)) {
                i10 = 2048;
            }
            i7 |= i10;
        } else {
            vr2 vr25 = vr22;
        }
        if ((i9 & 24576) == 0) {
            if ((32768 & i9) == 0 ? yt22.g((Object) null) : yt22.i((Object) null)) {
                i11 = 16384;
            }
            i7 |= i11;
        }
        if (yt22.V(i15 & 1, ((i15 & 306783379) == 306783378 && (i7 & 9363) == 9362) ? false : true)) {
            boolean j = i35.j(vlVar2);
            Object obj2 = ay0.a;
            if (j) {
                yt22.e0(145641571);
                boolean z7 = (i15 & 112) == 32;
                Object Q = yt22.Q();
                if (z7 || Q == obj2) {
                    Q = new fg7(vlVar2);
                    yt22.o0(Q);
                }
                fg7 = (fg7) Q;
                yt22.r(false);
            } else {
                yt22.e0(145707228);
                yt22.r(false);
                fg7 = null;
            }
            if (i35.j(vlVar2)) {
                yt22.e0(145905443);
                boolean g = ((i15 & 112) == 32) | yt22.g(fg7);
                Object Q2 = yt22.Q();
                if (g || Q2 == obj2) {
                    Q2 = new f5(8, fg7, vlVar2);
                    yt22.o0(Q2);
                }
                sr2 = (sr2) Q2;
                yt22.r(false);
            } else {
                yt22.e0(146002721);
                boolean z8 = (i15 & 112) == 32;
                Object Q3 = yt22.Q();
                if (z8 || Q3 == obj2) {
                    Q3 = new zh(4, (Object) vlVar2);
                    yt22.o0(Q3);
                }
                sr2 = (sr2) Q3;
                yt22.r(false);
            }
            if (z) {
                if (map2 != null) {
                    yb5 yb52 = yl.a;
                    if (!map2.isEmpty()) {
                        int length = vlVar2.x.length();
                        fg72 = fg7;
                        List list = vlVar2.w;
                        if (list != null) {
                            ArrayList arrayList = new ArrayList(list.size());
                            int size = list.size();
                            int i16 = 0;
                            while (i16 < size) {
                                List list2 = list;
                                ul ulVar = (ul) list.get(i16);
                                int i17 = size;
                                Object obj3 = ulVar.a;
                                int i18 = i16;
                                int i19 = ulVar.c;
                                sr2 sr23 = sr2;
                                int i20 = ulVar.b;
                                String str = ulVar.d;
                                if ((obj3 instanceof o47) && "androidx.compose.foundation.text.inlineContent".equals(str) && wl.b(0, length, i20, i19)) {
                                    Object obj4 = ulVar.a;
                                    obj4.getClass();
                                    arrayList.add(new ul(i20, i19, ((o47) obj4).a, str));
                                }
                                i16 = i18 + 1;
                                int i21 = i;
                                size = i17;
                                list = list2;
                                sr2 = sr23;
                            }
                            sr22 = sr2;
                            a42 = arrayList;
                        } else {
                            sr22 = sr2;
                            a42 = a42.w;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        ArrayList arrayList3 = new ArrayList();
                        int size2 = a42.size();
                        int i22 = 0;
                        while (i22 < size2) {
                            if (map2.get(((ul) a42.get(i22)).a) == null) {
                                i22++;
                            } else {
                                ku4.a();
                                return;
                            }
                        }
                        yb5 = new yb5(arrayList2, arrayList3);
                        vr23 = null;
                    }
                }
                fg72 = fg7;
                sr22 = sr2;
                yb5 = yl.a;
                vr23 = null;
            } else {
                fg72 = fg7;
                sr22 = sr2;
                vr23 = null;
                yb5 = new yb5((Object) null, (Object) null);
            }
            List list3 = (List) yb5.w;
            List list4 = (List) yb5.x;
            if (z) {
                yt22.e0(146318828);
                Object Q4 = yt22.Q();
                if (Q4 == obj2) {
                    Q4 = u55.p(vr23);
                    yt22.o0(Q4);
                }
                yt22.r(false);
                aq4 = (aq4) Q4;
            } else {
                yt22.e0(146406588);
                yt22.r(false);
                aq4 = vr23;
            }
            if (z) {
                yt22.e0(146499837);
                boolean g2 = yt22.g(aq4);
                Object Q5 = yt22.Q();
                if (g2 || Q5 == obj2) {
                    Q5 = new xi(aq4, 4);
                    yt22.o0(Q5);
                }
                vr23 = (vr2) Q5;
                yt22.r(false);
            } else {
                yt22.e0(146571260);
                yt22.r(false);
            }
            vr2 vr26 = vr23;
            int i23 = (i15 >> 3) & 14;
            fg7 fg73 = fg72;
            vl vlVar3 = vlVar;
            b70.a(vlVar3, tg7, dl2, list3, z2, yt22);
            vlVar2 = vlVar3;
            vl vlVar4 = (vl) sr22.b();
            boolean i24 = yt22.i(fg73) | ((i15 & 896) == 256);
            Object Q6 = yt22.Q();
            if (i24 || Q6 == obj2) {
                Q6 = new x60(fg73, vr24, 0);
                yt22.o0(Q6);
            }
            ml4 c0 = c0(ml42, vlVar4, tg7, (vr2) Q6, i, z2, i2, i3, dl2, list3, vr26, vr22);
            if (!z) {
                yt22.e0(147779703);
                boolean i25 = yt22.i(fg73);
                Object Q7 = yt22.Q();
                if (i25 || Q7 == obj2) {
                    z4 = false;
                    Q7 = new y60(fg73, 0);
                    yt22.o0(Q7);
                } else {
                    z4 = false;
                }
                obj = new l74((sr2) Q7);
                yt22.r(z4);
            } else {
                yt22.e0(147956465);
                boolean i26 = yt22.i(fg73);
                Object Q8 = yt22.Q();
                if (i26 || Q8 == obj2) {
                    Q8 = new y60(fg73, 1);
                    yt22.o0(Q8);
                }
                sr2 sr24 = (sr2) Q8;
                boolean g3 = yt22.g(aq4);
                Object Q9 = yt22.Q();
                if (g3 || Q9 == obj2) {
                    Q9 = new wi(aq4, 18);
                    yt22.o0(Q9);
                }
                Object shVar = new sh(3, sr24, (sr2) Q9);
                yt22.r(false);
                obj = shVar;
            }
            int hashCode = Long.hashCode(yt22.T);
            vf5 m = yt22.m();
            ml4 E = gw8.E(yt22, c0);
            ux0.d.getClass();
            vy0 vy0 = tx0.b;
            yt22.i0();
            if (yt22.S) {
                yt22.l(vy0);
            } else {
                yt22.r0();
            }
            g75.Q(tx0.f, yt22, obj);
            g75.Q(tx0.e, yt22, m);
            g75.Q(tx0.g, yt22, Integer.valueOf(hashCode));
            g75.O(yt22, tx0.h);
            g75.Q(tx0.d, yt22, E);
            if (fg73 == null) {
                yt22.e0(-433557001);
                z3 = false;
            } else {
                z3 = false;
                yt22.e0(-291080374);
                fg73.a(0, yt22);
            }
            yt22.r(z3);
            if (list4 == null) {
                yt22.e0(-433506223);
            } else {
                yt22.e0(-433506222);
                yl.a(vlVar2, list4, yt22, i23);
            }
            yt22.r(z3);
            yt22.r(true);
        } else {
            yt22.Y();
        }
        yx5 v = yt22.v();
        if (v != null) {
            v.d = new v60(ml4, vlVar2, vr24, z, map, tg7, i, z2, i2, i3, dl2, vr22, i8, i9);
        }
    }

    public static final void l(sr2 sr2, yt2 yt2) {
        j75 j75 = yt2.M.b.u;
        j75.s(u65.d);
        i75.l(j75, 0, sr2);
    }

    public static final int m(int i, eq4 eq4) {
        int i2 = eq4.y - 1;
        int i3 = 0;
        while (i3 < i2) {
            int i4 = ((i2 - i3) / 2) + i3;
            Object[] objArr = eq4.w;
            int i5 = ((hg3) objArr[i4]).a;
            if (i5 != i) {
                if (i5 < i) {
                    i3 = i4 + 1;
                    if (i < ((hg3) objArr[i3]).a) {
                    }
                } else {
                    i2 = i4 - 1;
                }
            }
            return i4;
        }
        return i3;
    }

    public static final ArrayList n(List list, sr2 sr2) {
        o21 o21;
        if (!((Boolean) sr2.b()).booleanValue()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            gh4 gh4 = (gh4) list.get(i);
            Object B = gh4.B();
            B.getClass();
            yv0 yv0 = ((mg7) B).w;
            ul ulVar = (ul) yv0.y;
            bg7 bg7 = (bg7) ((fg7) yv0.x).a.getValue();
            if (bg7 == null) {
                o21 = new o21(0, 0, (sr2) new pp5(26));
            } else {
                ul c2 = fg7.c(ulVar, bg7);
                if (c2 == null) {
                    o21 = new o21(0, 0, (sr2) new pp5(27));
                } else {
                    se3 O = tf4.O(bg7.i(c2.b, c2.c).d());
                    o21 = new o21(O.d(), O.b(), (sr2) new fd7(3, (Object) O));
                }
            }
            int i2 = o21.w;
            int i3 = o21.x;
            arrayList.add(new yb5(gh4.y(x91.x(i2, i2, i3, i3)), (sr2) o21.y));
        }
        return arrayList;
    }

    public static void p(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            if (colorStateList == null || !colorStateList.isStateful()) {
                drawable.setTintList(colorStateList);
            } else {
                int[] drawableState = textInputLayout.getDrawableState();
                int[] drawableState2 = checkableImageButton.getDrawableState();
                int length = drawableState.length;
                int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
                System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
                drawable.setTintList(ColorStateList.valueOf(colorStateList.getColorForState(copyOf, colorStateList.getDefaultColor())));
            }
            if (mode != null) {
                drawable.setTintMode(mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    public static final boolean q(int i, int i2, int i3, byte[] bArr, byte[] bArr2) {
        bArr.getClass();
        bArr2.getClass();
        for (int i4 = 0; i4 < i3; i4++) {
            if (bArr[i4 + i] != bArr2[i4 + i2]) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [yi0, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, m56] */
    public static bj0 r(mo1 mo1) {
        ? obj = new Object();
        obj.c = new Object();
        bj0 bj0 = new bj0(obj);
        obj.b = bj0;
        obj.a = b81.class;
        try {
            mo1.v(new lh(7, obj, mo1));
            obj.a = "Deferred.asListenableFuture";
            return bj0;
        } catch (Exception e2) {
            bj0.x.k(e2);
            return bj0;
        }
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [h61] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
    public static final void t(h61 h61) {
        to1 to1;
        int i;
        if (h61 instanceof to1) {
            to1 to12 = (to1) h61;
            int i2 = to12.A;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                to12.A = i2 - Integer.MIN_VALUE;
                to1 = to12;
                Object obj = to1.z;
                i = to1.A;
                if (i != 0) {
                    o85.q(obj);
                    to1.A = 1;
                    kk0 kk0 = new kk0(1, rc9.a0(to1));
                    kk0.v();
                    if (kk0.t() == p81.w) {
                        return;
                    }
                } else if (i != 1) {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return;
                } else {
                    o85.q(obj);
                }
                ta1.e();
            }
        }
        to1 = new h61(h61);
        Object obj2 = to1.z;
        i = to1.A;
        if (i != 0) {
        }
        ta1.e();
    }

    public static final ly5 u(dy3 dy3) {
        dy3 D = dy3.D();
        if (D != null) {
            return D.Q(dy3, true);
        }
        return new ly5(0.0f, 0.0f, (float) ((int) (dy3.k() >> 32)), (float) ((int) (dy3.k() & 4294967295L)));
    }

    public static final ly5 v(dy3 dy3, boolean z) {
        dy3 I = I(dy3);
        float k = (float) ((int) (I.k() >> 32));
        float k2 = (float) ((int) (I.k() & 4294967295L));
        ly5 Q = I.Q(dy3, z);
        float f = Q.a;
        float f2 = 0.0f;
        if (z) {
            if (f < 0.0f) {
                f = 0.0f;
            }
            if (f > k) {
                f = k;
            }
        }
        float f3 = Q.b;
        if (z) {
            if (f3 < 0.0f) {
                f3 = 0.0f;
            }
            if (f3 > k2) {
                f3 = k2;
            }
        }
        float f4 = Q.c;
        if (z) {
            if (f4 < 0.0f) {
                f4 = 0.0f;
            }
            if (f4 <= k) {
                k = f4;
            }
            f4 = k;
        }
        float f5 = Q.d;
        if (z) {
            if (f5 >= 0.0f) {
                f2 = f5;
            }
            if (f2 <= k2) {
                k2 = f2;
            }
            f5 = k2;
        }
        if (f == f4 || f3 == f5) {
            return ly5.e;
        }
        long d2 = I.d((((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L));
        long d3 = I.d((((long) Float.floatToRawIntBits(f4)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L));
        long d4 = I.d((((long) Float.floatToRawIntBits(f4)) << 32) | (((long) Float.floatToRawIntBits(f5)) & 4294967295L));
        long d5 = I.d((((long) Float.floatToRawIntBits(f5)) & 4294967295L) | (((long) Float.floatToRawIntBits(f)) << 32));
        float intBitsToFloat = Float.intBitsToFloat((int) (d2 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (d3 >> 32));
        float intBitsToFloat3 = Float.intBitsToFloat((int) (d5 >> 32));
        float intBitsToFloat4 = Float.intBitsToFloat((int) (d4 >> 32));
        float min = Math.min(intBitsToFloat, Math.min(intBitsToFloat2, Math.min(intBitsToFloat3, intBitsToFloat4)));
        float max = Math.max(intBitsToFloat, Math.max(intBitsToFloat2, Math.max(intBitsToFloat3, intBitsToFloat4)));
        float intBitsToFloat5 = Float.intBitsToFloat((int) (d2 & 4294967295L));
        float intBitsToFloat6 = Float.intBitsToFloat((int) (d3 & 4294967295L));
        float intBitsToFloat7 = Float.intBitsToFloat((int) (d5 & 4294967295L));
        float intBitsToFloat8 = Float.intBitsToFloat((int) (d4 & 4294967295L));
        return new ly5(min, Math.min(intBitsToFloat5, Math.min(intBitsToFloat6, Math.min(intBitsToFloat7, intBitsToFloat8))), max, Math.max(intBitsToFloat5, Math.max(intBitsToFloat6, Math.max(intBitsToFloat7, intBitsToFloat8))));
    }

    public static final void w(hf0 hf0) {
        hf0.getClass();
        hf0.a(new IOException("Channel was cancelled"));
    }

    public static final void x(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            StringBuilder q = hl6.q(j, "size=", " offset=");
            q.append(j2);
            q.append(" byteCount=");
            q.append(j3);
            throw new ArrayIndexOutOfBoundsException(q.toString());
        }
    }

    public abstract int F(lu0 lu0);

    public void b0(ri0 ri0, Collection collection) {
        ri0.getClass();
        ri0.m0(collection);
    }

    public abstract void o(ri0 ri0);

    public abstract String s();

    public abstract void y(lu0 lu0, Set set);

    public abstract void z(ri0 ri0, ri0 ri02);
}
