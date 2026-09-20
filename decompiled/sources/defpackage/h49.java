package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Process;
import android.os.UserManager;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.DragEvent;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: h49  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class h49 implements si6 {
    public static final rt0 A = rt0.J;
    public static x83 B = null;
    public static UserManager w = null;
    public static volatile boolean x = false;
    public static final fw0 y = new fw0(-1548712596, new ww0(18), false);
    public static final String[] z = new String[0];

    public static final int B(Layout layout, int i, boolean z2) {
        if (i <= 0) {
            return 0;
        }
        if (i >= layout.getText().length()) {
            return layout.getLineCount() - 1;
        }
        int lineForOffset = layout.getLineForOffset(i);
        int lineStart = layout.getLineStart(lineForOffset);
        int lineEnd = layout.getLineEnd(lineForOffset);
        if (lineStart == i || lineEnd == i) {
            if (lineStart == i) {
                if (z2) {
                    return lineForOffset - 1;
                }
            } else if (!z2) {
                return lineForOffset + 1;
            }
        }
        return lineForOffset;
    }

    public static final long C(f96 f96) {
        DragEvent dragEvent = (DragEvent) f96.x;
        return (((long) Float.floatToRawIntBits(dragEvent.getX())) << 32) | (((long) Float.floatToRawIntBits(dragEvent.getY())) & 4294967295L);
    }

    public static boolean D(ri0 ri0) {
        ri0.getClass();
        if (!wd0.d.contains(ri0.getName())) {
            return false;
        }
        if (dt0.q0(wd0.c, ts1.c(ri0)) && ri0.S().isEmpty()) {
            return true;
        }
        if (!fv3.A(ri0)) {
            return false;
        }
        Collection s = ri0.s();
        s.getClass();
        Iterable<ri0> iterable = s;
        if (((Collection) iterable).isEmpty()) {
            return false;
        }
        for (ri0 ri02 : iterable) {
            ri02.getClass();
            if (D(ri02)) {
                return true;
            }
        }
        return false;
    }

    public static boolean E(int i) {
        double d;
        double pow;
        double d2;
        if (i == 0) {
            return false;
        }
        ThreadLocal threadLocal = yt0.a;
        double[] dArr = (double[]) threadLocal.get();
        if (dArr == null) {
            dArr = new double[3];
            threadLocal.set(dArr);
        }
        int red = Color.red(i);
        int green = Color.green(i);
        int blue = Color.blue(i);
        if (dArr.length == 3) {
            double d3 = ((double) red) / 255.0d;
            if (d3 < 0.04045d) {
                d = d3 / 12.92d;
            } else {
                d = Math.pow((d3 + 0.055d) / 1.055d, 2.4d);
            }
            double d4 = ((double) green) / 255.0d;
            if (d4 < 0.04045d) {
                pow = d4 / 12.92d;
            } else {
                pow = Math.pow((d4 + 0.055d) / 1.055d, 2.4d);
            }
            double d5 = ((double) blue) / 255.0d;
            if (d5 < 0.04045d) {
                d2 = d5 / 12.92d;
            } else {
                d2 = Math.pow((d5 + 0.055d) / 1.055d, 2.4d);
            }
            dArr[0] = ((0.1805d * d2) + (0.3576d * pow) + (0.4124d * d)) * 100.0d;
            double d6 = ((0.0722d * d2) + (0.7152d * pow) + (0.2126d * d)) * 100.0d;
            dArr[1] = d6;
            double d7 = d2 * 0.9505d;
            dArr[2] = (d7 + (pow * 0.1192d) + (d * 0.0193d)) * 100.0d;
            if (d6 / 100.0d > 0.5d) {
                return true;
            }
            return false;
        }
        h.q("outXyz must have a length of 3.");
        return false;
    }

    public static final boolean F(KeyEvent keyEvent) {
        long x2 = rd3.x(keyEvent);
        int i = os3.O;
        if (os3.a(x2, os3.h) || os3.a(x2, os3.r) || os3.a(x2, os3.E) || os3.a(x2, os3.q)) {
            return true;
        }
        return false;
    }

    public static int G(float f, int i, int i2) {
        return yt0.b(yt0.d(i2, Math.round(((float) Color.alpha(i2)) * f)), i);
    }

    public static final ml4 I(ml4 ml4, vr2 vr2) {
        return ml4.d(new d55(vr2));
    }

    public static final String K(vp2 vp2) {
        vp2.getClass();
        List<uq4> f = vp2.f(vp2);
        StringBuilder sb = new StringBuilder();
        for (uq4 uq4 : f) {
            if (sb.length() > 0) {
                sb.append(".");
            }
            sb.append(L(uq4));
        }
        return sb.toString();
    }

    public static String L(uq4 uq4) {
        uq4.getClass();
        String b = uq4.b();
        b.getClass();
        if (!kt3.a.contains(b)) {
            int i = 0;
            while (true) {
                if (i < b.length()) {
                    char charAt = b.charAt(i);
                    if (!Character.isLetterOrDigit(charAt) && charAt != '_') {
                        break;
                    }
                    i++;
                } else if (b.length() != 0 && Character.isJavaIdentifierStart(b.codePointAt(0))) {
                    return b;
                }
            }
        }
        return "`".concat(b).concat("`");
    }

    public static final vw3 M(vw3 vw3, ArrayList arrayList) {
        p27 p27;
        k28 k28;
        vw3.G().size();
        arrayList.size();
        ArrayList arrayList2 = new ArrayList(et0.e0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            oo7 oo7 = (oo7) it.next();
            oo7.getClass();
            vw3 vw32 = oo7.c;
            vw3 vw33 = oo7.b;
            qp7 qp7 = oo7.a;
            xw3.a.b(vw33, vw32);
            if (sg3.e(vw33, vw32) || qp7.I() == (k28 = k28.z)) {
                p27 = new p27(vw33);
            } else {
                boolean F = fv3.F(vw33);
                k28 k282 = k28.A;
                k28 k283 = k28.y;
                if (F && qp7.I() != k28) {
                    if (k282 == qp7.I()) {
                        k282 = k283;
                    }
                    p27 = new p27(vw32, k282);
                } else if (vw32 == null) {
                    fv3.a(140);
                    throw null;
                } else if (!fv3.y(vw32) || !vw32.Q()) {
                    if (k282 == qp7.I()) {
                        k282 = k283;
                    }
                    p27 = new p27(vw32, k282);
                } else {
                    if (k28 == qp7.I()) {
                        k28 = k283;
                    }
                    p27 = new p27(vw33, k28);
                }
            }
            arrayList2.add(p27);
        }
        return wn6.u(vw3, arrayList2, (rm) null, 6);
    }

    public static Object N(sr2 sr2, h61 h61) {
        return ar7.e0(x32.w, new tc1(sr2, (f61) null, 4), h61);
    }

    public static final int O(aj6 aj6, int i) {
        int i2;
        int[] iArr = aj6.B;
        int i3 = i + 1;
        int length = aj6.A.length;
        iArr.getClass();
        int i4 = length - 1;
        int i5 = 0;
        while (true) {
            if (i5 <= i4) {
                i2 = (i5 + i4) >>> 1;
                int i6 = iArr[i2];
                if (i6 >= i3) {
                    if (i6 <= i3) {
                        break;
                    }
                    i4 = i2 - 1;
                } else {
                    i5 = i2 + 1;
                }
            } else {
                i2 = (-i5) - 1;
                break;
            }
        }
        if (i2 >= 0) {
            return i2;
        }
        return ~i2;
    }

    public static void P(EditorInfo editorInfo, CharSequence charSequence) {
        int i;
        int i2;
        CharSequence charSequence2;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 30) {
            x4.i(editorInfo, charSequence);
            return;
        }
        charSequence.getClass();
        if (i3 >= 30) {
            x4.i(editorInfo, charSequence);
            return;
        }
        int i4 = editorInfo.initialSelStart;
        int i5 = editorInfo.initialSelEnd;
        if (i4 > i5) {
            i = i5;
        } else {
            i = i4;
        }
        if (i4 <= i5) {
            i4 = i5;
        }
        int length = charSequence.length();
        if (i < 0 || i4 > length) {
            R(editorInfo, (CharSequence) null, 0, 0);
            return;
        }
        int i6 = editorInfo.inputType & 4095;
        if (i6 == 129 || i6 == 225 || i6 == 18) {
            R(editorInfo, (CharSequence) null, 0, 0);
        } else if (length <= 2048) {
            R(editorInfo, charSequence, i, i4);
        } else {
            int i7 = i4 - i;
            if (i7 > 1024) {
                i2 = 0;
            } else {
                i2 = i7;
            }
            int i8 = 2048 - i2;
            int min = Math.min(charSequence.length() - i4, i8 - Math.min(i, (int) (((double) i8) * 0.8d)));
            int min2 = Math.min(i, i8 - min);
            int i9 = i - min2;
            if (Character.isLowSurrogate(charSequence.charAt(i9))) {
                i9++;
                min2--;
            }
            if (Character.isHighSurrogate(charSequence.charAt((i4 + min) - 1))) {
                min--;
            }
            int i10 = min2 + i2;
            int i11 = i10 + min;
            if (i2 != i7) {
                charSequence2 = TextUtils.concat(new CharSequence[]{charSequence.subSequence(i9, i9 + min2), charSequence.subSequence(i4, min + i4)});
            } else {
                charSequence2 = charSequence.subSequence(i9, i11 + i9);
            }
            R(editorInfo, charSequence2, min2, i10);
        }
    }

    public static void Q(EditorInfo editorInfo, boolean z2) {
        if (Build.VERSION.SDK_INT >= 35) {
            l22.b(editorInfo, z2);
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED", z2);
    }

    public static void R(EditorInfo editorInfo, CharSequence charSequence, int i, int i2) {
        SpannableStringBuilder spannableStringBuilder;
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        if (charSequence != null) {
            spannableStringBuilder = new SpannableStringBuilder(charSequence);
        } else {
            spannableStringBuilder = null;
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", spannableStringBuilder);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i2);
    }

    public static final ml4 S(boolean z2, ap4 ap4, boolean z3, s86 s86, vr2 vr2) {
        return al4.w.d(new fj7(z2, ap4, z3, s86, vr2));
    }

    public static final ml4 T(ij7 ij7, o86 o86, boolean z2, s86 s86, sr2 sr2) {
        if (o86 != null) {
            return new on7(ij7, (ap4) null, o86, z2, s86, sr2);
        }
        ij7 ij72 = ij7;
        boolean z3 = z2;
        s86 s862 = s86;
        sr2 sr22 = sr2;
        o86 o862 = o86;
        if (o862 == null) {
            return new on7(ij72, (ap4) null, (oa3) null, z3, s862, sr22);
        }
        return gw8.p(jl4.w, new gj7((oa3) o862, ij72, z3, s862, sr22));
    }

    public static final Throwable U(Throwable th) {
        th.getClass();
        Throwable th2 = th;
        while (true) {
            if (th2 instanceof CancellationException) {
                CancellationException cancellationException = (CancellationException) th2;
                if (th2.equals(cancellationException.getCause())) {
                    break;
                }
                th2 = cancellationException.getCause();
            } else if (th2 == null) {
                return th;
            } else {
                return th2;
            }
        }
        return th;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [xn6, x1, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r12v6, types: [ho7, com.google.common.util.concurrent.ListenableFuture, java.lang.Object, java.lang.Runnable] */
    /* JADX WARNING: type inference failed for: r12v8, types: [ho7, x1, java.lang.Object, java.lang.Runnable] */
    public static x1 V(Context context, Callable callable, Executor executor) {
        ay4 ay4 = new ay4(21, callable);
        if (W(context)) {
            ? obj = new Object();
            obj.E = new go7((ho7) obj, (ct) ay4);
            executor.execute(obj);
            return obj;
        }
        ? obj2 = new Object();
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        Context context2 = context;
        Executor executor2 = executor;
        g49 g49 = new g49(atomicBoolean, context2, obj2, ay4, executor2);
        context2.registerReceiver(g49, new IntentFilter("android.intent.action.USER_UNLOCKED"));
        if (!W(context2) || !atomicBoolean.compareAndSet(false, true)) {
            Object obj3 = obj2;
            obj2.a(new yl0(obj3, atomicBoolean, context2, g49, 6, false), fv1.w);
            return obj2;
        }
        try {
            context2.unregisterReceiver(g49);
        } catch (IllegalArgumentException e) {
            Log.w("DirectBootUtils", "Failed to unregister receiver", e);
        }
        ? obj4 = new Object();
        obj4.E = new go7((ho7) obj4, (ct) ay4);
        executor2.execute(obj4);
        obj2.n(obj4);
        return obj2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0053, code lost:
        return r5;
     */
    public static boolean W(Context context) {
        int i;
        boolean z2;
        if (x) {
            return true;
        }
        synchronized (h49.class) {
            try {
                if (x) {
                    return true;
                }
                i = 1;
                while (true) {
                    z2 = false;
                    if (i > 2) {
                        break;
                    }
                    if (w == null) {
                        w = (UserManager) context.getSystemService(UserManager.class);
                    }
                    UserManager userManager = w;
                    if (userManager == null) {
                        z2 = true;
                        break;
                    } else if (userManager.isUserUnlocked() || !userManager.isUserRunning(Process.myUserHandle())) {
                        z2 = true;
                    }
                }
                if (z2) {
                    w = null;
                }
                if (z2) {
                    x = true;
                }
            } catch (NullPointerException e) {
                Log.w("DirectBootUtils", "Failed to check if user is unlocked.", e);
                w = null;
                i++;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [tc0, java.lang.Object] */
    public static qy6 c(byte[] bArr) {
        int length = bArr.length;
        bArr.getClass();
        ? obj = new Object();
        obj.D(length, bArr);
        return new qy6(obj);
    }

    public static final void d(String str, double d, vr2 vr2, vr2 vr22, yt2 yt2, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z2;
        yt2 yt22 = yt2;
        yt22.g0(-1886628794);
        String str2 = str;
        if (yt22.g(str2)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i6 = i | i2;
        if (yt22.c(d)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i7 = i6 | i3;
        if (yt22.i(vr2)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i8 = i7 | i4;
        vr2 vr23 = vr22;
        if (yt22.i(vr23)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i9 = i8 | i5;
        if ((i9 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (yt22.V(i9 & 1, z2)) {
            ml4 M = x91.M(yu6.a, 24.0f, 0.0f, 2);
            au0 a = zt0.a(wr.c, xb4.K, yt22, 0);
            int hashCode = Long.hashCode(yt22.T);
            vf5 m = yt22.m();
            ml4 E = gw8.E(yt22, M);
            ux0.d.getClass();
            vy0 vy0 = tx0.b;
            yt22.i0();
            if (yt22.S) {
                yt22.l(vy0);
            } else {
                yt22.r0();
            }
            g75.Q(tx0.f, yt22, a);
            g75.Q(tx0.e, yt22, m);
            g75.Q(tx0.g, yt22, Integer.valueOf(hashCode));
            g75.O(yt22, tx0.h);
            g75.Q(tx0.d, yt22, E);
            jl4 jl4 = jl4.w;
            k75.a(yt22, yu6.d(jl4, 16.0f));
            tf4.g(str2, vr2, rd3.d, rd3.e, (ml4) null, (bt3) null, (gs2) null, (String) null, yt22, (i9 & 14) | 3456 | ((i9 >> 3) & 112), 240);
            k75.a(yt22, yu6.d(jl4, 16.0f));
            String valueOf = String.valueOf(d);
            fw0 fw0 = rd3.f;
            fw0 fw02 = rd3.g;
            bt3 bt3 = bt3.e;
            tf4.g(valueOf, vr23, fw0, fw02, (ml4) null, bt3.a(3), (gs2) null, (String) null, yt22, ((i9 >> 6) & 112) | 3456, 208);
            yt22.r(true);
        } else {
            yt22.Y();
        }
        yx5 v = yt22.v();
        if (v != null) {
            v.d = new ph3(str, d, vr2, vr22, i);
        }
    }

    public static final void g(ml4 ml4, tr trVar, vr vrVar, h80 h80, int i, int i2, fw0 fw0, yt2 yt2, int i3, int i4) {
        int i5;
        boolean z2;
        int i6;
        int i7;
        h80 h802;
        vr vrVar2;
        jl4 jl4;
        vr vrVar3;
        int i8;
        int i9;
        yt2 yt22 = yt2;
        yt22.g0(-1303174015);
        int i10 = i3 | 6;
        if ((i3 & 48) == 0) {
            if (yt22.g(trVar)) {
                i9 = 32;
            } else {
                i9 = 16;
            }
            i10 |= i9;
        }
        int i11 = i4 & 4;
        if (i11 != 0) {
            i5 = i10 | 384;
        } else {
            if (yt22.g(vrVar)) {
                i8 = 256;
            } else {
                i8 = 128;
            }
            i5 = i10 | i8;
        }
        int i12 = i5 | 224256;
        if ((599187 & i12) != 599186) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (yt22.V(i12 & 1, z2)) {
            if (i11 != 0) {
                vrVar3 = wr.c;
            } else {
                vrVar3 = vrVar;
            }
            h80 h803 = xb4.H;
            hz2 hz2 = hz2.C;
            int i13 = (i12 & 896) | (i12 & 112) | 1572870 | 12807168;
            jl4 jl42 = jl4.w;
            h(jl42, trVar, vrVar3, hz2, fw0, yt22, i13);
            jl4 = jl42;
            i6 = Integer.MAX_VALUE;
            vrVar2 = vrVar3;
            h802 = h803;
            i7 = Integer.MAX_VALUE;
        } else {
            yt2.Y();
            jl4 = ml4;
            vrVar2 = vrVar;
            h802 = h80;
            i7 = i;
            i6 = i2;
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new nj2(jl4, trVar, vrVar2, h802, i7, i6, fw0, i3, i4);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v19, resolved type: java.util.ArrayList} */
    /* JADX WARNING: type inference failed for: r6v12, types: [ec1, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    public static final void h(ml4 ml4, tr trVar, vr vrVar, hz2 hz2, fw0 fw0, yt2 yt2, int i) {
        int i2;
        hz2 hz22;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        Object obj;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        ml4 ml42 = ml4;
        tr trVar2 = trVar;
        vr vrVar2 = vrVar;
        fw0 fw02 = fw0;
        yt2 yt22 = yt2;
        int i11 = i;
        h80 h80 = xb4.H;
        yt22.g0(-1956591841);
        if ((i11 & 6) == 0) {
            if (yt22.g(ml42)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            i2 = i10 | i11;
        } else {
            i2 = i11;
        }
        if ((i11 & 48) == 0) {
            if (yt22.g(trVar2)) {
                i9 = 32;
            } else {
                i9 = 16;
            }
            i2 |= i9;
        }
        if ((i11 & 384) == 0) {
            if (yt22.g(vrVar2)) {
                i8 = 256;
            } else {
                i8 = 128;
            }
            i2 |= i8;
        }
        if ((i11 & 3072) == 0) {
            if (yt22.g(h80)) {
                i7 = 2048;
            } else {
                i7 = 1024;
            }
            i2 |= i7;
        }
        if ((i11 & 24576) == 0) {
            if (yt22.e(Integer.MAX_VALUE)) {
                i6 = 16384;
            } else {
                i6 = 8192;
            }
            i2 |= i6;
        }
        if ((196608 & i11) == 0) {
            if (yt22.e(Integer.MAX_VALUE)) {
                i5 = 131072;
            } else {
                i5 = 65536;
            }
            i2 |= i5;
        }
        if ((1572864 & i11) == 0) {
            hz22 = hz2;
            if (yt22.g(hz22)) {
                i4 = 1048576;
            } else {
                i4 = 524288;
            }
            i2 |= i4;
        } else {
            hz22 = hz2;
        }
        if ((i11 & 12582912) == 0) {
            if (yt22.i(fw02)) {
                i3 = 8388608;
            } else {
                i3 = 4194304;
            }
            i2 |= i3;
        }
        int i12 = i2;
        if ((i12 & 4793491) != 4793490) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (yt22.V(i12 & 1, z2)) {
            int i13 = i12 & 3670016;
            if (i13 == 1048576) {
                z3 = true;
            } else {
                z3 = false;
            }
            Object Q = yt22.Q();
            Object obj2 = ay0.a;
            if (z3 || Q == obj2) {
                hz22.getClass();
                Q = new Object();
                yt22.o0(Q);
            }
            pj2 pj2 = (pj2) Q;
            int i14 = i12 >> 3;
            if ((((i14 & 14) ^ 6) <= 4 || !yt22.g(trVar2)) && (i14 & 6) != 4) {
                z4 = false;
            } else {
                z4 = true;
            }
            if ((((i14 & 112) ^ 48) <= 32 || !yt22.g(vrVar2)) && (i14 & 48) != 32) {
                z5 = false;
            } else {
                z5 = true;
            }
            boolean z13 = z5 | z4;
            if ((((i14 & 896) ^ 384) <= 256 || !yt22.g(h80)) && (i14 & 384) != 256) {
                z6 = false;
            } else {
                z6 = true;
            }
            boolean z14 = z6 | z13;
            if ((((i14 & 7168) ^ 3072) <= 2048 || !yt22.e(Integer.MAX_VALUE)) && (i14 & 3072) != 2048) {
                z7 = false;
            } else {
                z7 = true;
            }
            boolean z15 = z14 | z7;
            if ((((57344 & i14) ^ 24576) <= 16384 || !yt22.e(Integer.MAX_VALUE)) && (i14 & 24576) != 16384) {
                z8 = false;
            } else {
                z8 = true;
            }
            boolean g = z15 | z8 | yt22.g(pj2);
            Object Q2 = yt22.Q();
            if (g || Q2 == obj2) {
                Object rj2 = new rj2(trVar, vrVar2, trVar2.a(), new Object(), vrVar2.a(), pj2);
                yt22.o0(rj2);
                Q2 = rj2;
            }
            rj2 rj22 = (rj2) Q2;
            if (i13 == 1048576) {
                z9 = true;
            } else {
                z9 = false;
            }
            if ((i12 & 29360128) == 8388608) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean z16 = z9 | z10;
            if ((i12 & 458752) == 131072) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean z17 = z16 | z11;
            Object Q3 = yt22.Q();
            if (z17 || Q3 == obj2) {
                ArrayList arrayList = new ArrayList();
                z12 = true;
                arrayList.add(new fw0(-1192950673, new x30(fw02, 4), true));
                hz2.getClass();
                yt22.o0(arrayList);
                obj = arrayList;
            } else {
                z12 = true;
                obj = Q3;
            }
            fw0 fw03 = new fw0(1271844412, new z0(7, (List) obj), z12);
            boolean g2 = yt22.g(rj22);
            Object Q4 = yt22.Q();
            if (g2 || Q4 == obj2) {
                Q4 = new jn4(rj22);
                yt22.o0(Q4);
            }
            lh4 lh4 = (lh4) Q4;
            int hashCode = Long.hashCode(yt22.T);
            vf5 m = yt22.m();
            ml4 E = gw8.E(yt22, ml42);
            ux0.d.getClass();
            vy0 vy0 = tx0.b;
            yt22.i0();
            if (yt22.S) {
                yt22.l(vy0);
            } else {
                yt22.r0();
            }
            g75.Q(tx0.f, yt22, lh4);
            g75.Q(tx0.e, yt22, m);
            g75.Q(tx0.g, yt22, Integer.valueOf(hashCode));
            g75.O(yt22, tx0.h);
            g75.Q(tx0.d, yt22, E);
            f21.r(0, fw03, yt22, true);
        } else {
            yt22.Y();
        }
        yx5 v = yt22.v();
        if (v != null) {
            v.d = new ft(ml42, trVar, vrVar, hz2, fw0, i11, 2);
        }
    }

    public static final void i(ru4 ru4, is2 is2, rh3 rh3, yt2 yt2, int i) {
        int i2;
        int i3;
        boolean z2;
        is2.getClass();
        yt2.g0(1932731040);
        if (yt2.i(ru4)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i2 | i;
        if (yt2.g(is2)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i5 = i4 | i3 | 128;
        if ((i5 & 147) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (yt2.V(i5 & 1, z2)) {
            yt2.a0();
            if ((i & 1) == 0 || yt2.C()) {
                a68 a = va4.a(yt2);
                if (a != null) {
                    rh3 = (rh3) n85.p(b26.a.b(rh3.class), a, b96.O(o85.l(a), yt2), o85.k(a), yt2);
                } else {
                    h.s("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
            } else {
                yt2.Y();
            }
            int i6 = i5 & -897;
            yt2.s();
            sg3.c((is7) hj8.n(rh3.e, yt2).getValue(), is2, su0.J(980300193, new gc5(13, (Object) ru4, (Object) rh3), yt2), yt2, (i6 & 112) | 392);
        } else {
            yt2.Y();
        }
        rh3 rh32 = rh3;
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new y30(i, 21, ru4, is2, rh32);
        }
    }

    public static final void j(String str, double d, vr2 vr2, vr2 vr22, sr2 sr2, ru4 ru4, yt2 yt2, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z2;
        yt2 yt22 = yt2;
        yt22.g0(-517957712);
        String str2 = str;
        if (yt22.g(str2)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i8 = i | i2;
        double d2 = d;
        if (yt22.c(d2)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i9 = i8 | i3;
        vr2 vr23 = vr2;
        if (yt22.i(vr23)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i10 = i9 | i4;
        vr2 vr24 = vr22;
        if (yt22.i(vr24)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i11 = i10 | i5;
        sr2 sr22 = sr2;
        if (yt22.i(sr22)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i12 = i11 | i6;
        if (yt22.i(ru4)) {
            i7 = 131072;
        } else {
            i7 = 65536;
        }
        int i13 = i12 | i7;
        if ((74899 & i13) != 74898) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (yt22.V(i13 & 1, z2)) {
            sd2 sd2 = yu6.a;
            au0 a = zt0.a(wr.c, xb4.K, yt22, 0);
            int hashCode = Long.hashCode(yt22.T);
            vf5 m = yt22.m();
            ml4 E = gw8.E(yt22, sd2);
            ux0.d.getClass();
            vy0 vy0 = tx0.b;
            yt22.i0();
            if (yt22.S) {
                yt22.l(vy0);
            } else {
                yt22.r0();
            }
            g75.Q(tx0.f, yt22, a);
            g75.Q(tx0.e, yt22, m);
            g75.Q(tx0.g, yt22, Integer.valueOf(hashCode));
            g75.O(yt22, tx0.h);
            g75.Q(tx0.d, yt22, E);
            pa5 pa5 = gk7.a;
            j45.a(sr22, ru4, (ml4) null, gk7.c(jt0.f, yt22), yt22, (i13 >> 6) & 8064);
            yt2 yt23 = yt2;
            d(str2, d2, vr23, vr24, yt23, i13 & 8190);
            yt22 = yt23;
            yt22.r(true);
        } else {
            yt22.Y();
        }
        yx5 v = yt22.v();
        if (v != null) {
            v.d = new oh3(str, d, vr2, vr22, sr2, ru4, i);
        }
    }

    public static final void k(Boolean bool, Object obj, t54 t54, vr2 vr2, yt2 yt2, int i) {
        int i2;
        boolean z2;
        int i3;
        int i4;
        int i5;
        yt2.g0(696924721);
        if ((i & 6) == 0) {
            if (yt2.i(bool)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (yt2.i(obj)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 384) == 0) {
            i2 |= 128;
        }
        if ((i & 3072) == 0) {
            if (yt2.i(vr2)) {
                i3 = 2048;
            } else {
                i3 = 1024;
            }
            i2 |= i3;
        }
        if ((i2 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (yt2.V(i2 & 1, z2)) {
            yt2.a0();
            if ((i & 1) == 0 || yt2.C()) {
                t54 = (t54) yt2.k(ha4.a);
            } else {
                yt2.Y();
            }
            int i6 = i2 & -897;
            yt2.s();
            boolean g = yt2.g(bool) | yt2.g(obj) | yt2.g(t54);
            Object Q = yt2.Q();
            if (g || Q == ay0.a) {
                Q = new a64(t54.k());
                yt2.o0(Q);
            }
            l(t54, (a64) Q, vr2, yt2, (i6 >> 3) & 896);
        } else {
            yt2.Y();
        }
        t54 t542 = t54;
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new m13(i, 4, bool, obj, t542, vr2);
        }
    }

    public static final void l(t54 t54, a64 a64, vr2 vr2, yt2 yt2, int i) {
        int i2;
        boolean z2;
        int i3;
        int i4;
        int i5;
        yt2.g0(228371534);
        if ((i & 6) == 0) {
            if (yt2.i(t54)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (yt2.i(a64)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 384) == 0) {
            if (yt2.i(vr2)) {
                i3 = 256;
            } else {
                i3 = 128;
            }
            i2 |= i3;
        }
        boolean z3 = false;
        if ((i2 & 147) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (yt2.V(i2 & 1, z2)) {
            boolean i6 = yt2.i(a64);
            if ((i2 & 896) == 256) {
                z3 = true;
            }
            boolean i7 = i6 | z3 | yt2.i(t54);
            Object Q = yt2.Q();
            if (i7 || Q == ay0.a) {
                Q = new g5((Object) t54, (Object) a64, vr2, 19);
                yt2.o0(Q);
            }
            t49.f(t54, a64, (vr2) Q, yt2);
        } else {
            yt2.Y();
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new bi(i, 13, (Object) t54, (Object) a64, (Object) vr2);
        }
    }

    public static final void m(ml4 ml4, hu5 hu5, fw0 fw0, yt2 yt2, int i) {
        int i2;
        boolean z2;
        int i3;
        int i4;
        int i5;
        int i6;
        fw0 fw02 = ed1.E;
        yt2.g0(-714464401);
        if ((i & 6) == 0) {
            if (yt2.g(ml4)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i2 = i6 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (yt2.g(hu5)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i2 |= i5;
        }
        if ((i & 384) == 0) {
            if (yt2.i(fw02)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i2 |= i4;
        }
        if ((i & 3072) == 0) {
            if (yt2.i(fw0)) {
                i3 = 2048;
            } else {
                i3 = 1024;
            }
            i2 |= i3;
        }
        if ((i2 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (yt2.V(i2 & 1, z2)) {
            Object Q = yt2.Q();
            if (Q == ay0.a) {
                ed5 ed5 = new ed5((Object) null, d63.G);
                yt2.o0(ed5);
                Q = ed5;
            }
            p60 p = p(fw02, yt2, (i2 >> 6) & 14);
            t49.c(hu5.a(p), su0.J(274270255, new q60(ml4, (aq4) Q, fw0, p), yt2), yt2, 56);
        } else {
            yt2.Y();
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new bi(i, 1, (Object) ml4, (Object) hu5, (Object) fw0);
        }
    }

    public static final ll4 n(vo1 vo1, int i) {
        ll4 ll4 = ((ll4) vo1).w.B;
        if (ll4 == null || (ll4.z & i) == 0) {
            return null;
        }
        while (ll4 != null) {
            int i2 = ll4.y;
            if ((i2 & 2) != 0) {
                return null;
            }
            if ((i2 & i) != 0) {
                return ll4;
            }
            ll4 = ll4.B;
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:56:0x01df  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x01e8  */
    public static final mr o(vw3 vw3) {
        Object obj;
        k28 k28;
        oo7 oo7;
        vw3.getClass();
        if (vw3.n0() instanceof zg2) {
            mr o = o(mp7.f0(vw3));
            mr o2 = o(mp7.n0(vw3));
            return new mr(ub5.m(kl8.n(mp7.f0((vw3) o.a), mp7.n0((vw3) o2.a)), vw3), ub5.m(kl8.n(mp7.f0((vw3) o.b), mp7.n0((vw3) o2.b)), vw3));
        }
        wo7 L = vw3.L();
        boolean z2 = true;
        if (vw3.L() instanceof jl0) {
            L.getClass();
            xp7 C = ((jl0) L).C();
            vw3 b = C.b();
            b.getClass();
            vw3 h = iq7.h(b, vw3.Q());
            int ordinal = C.a().ordinal();
            if (ordinal == 1) {
                return new mr(h, jb5.k(vw3).p());
            }
            if (ordinal == 2) {
                return new mr(iq7.h(jb5.k(vw3).o(), vw3.Q()), h);
            }
            rf2.z("Only nontrivial projections should have been captured, not: ", C);
            return null;
        } else if (vw3.G().isEmpty() || vw3.G().size() != L.getParameters().size()) {
            return new mr(vw3, vw3);
        } else {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            List G = vw3.G();
            List parameters = L.getParameters();
            parameters.getClass();
            Iterator it = dt0.i1(G, parameters).iterator();
            while (it.hasNext()) {
                yb5 yb5 = (yb5) it.next();
                xp7 xp7 = (xp7) yb5.w;
                qp7 qp7 = (qp7) yb5.x;
                qp7.getClass();
                k28 I = qp7.I();
                if (I == null) {
                    dq7.a(35);
                    throw null;
                } else if (xp7 != null) {
                    dq7 dq7 = dq7.b;
                    if (xp7.c()) {
                        k28 = k28.A;
                    } else {
                        k28 = dq7.b(I, xp7.a());
                    }
                    int ordinal2 = k28.ordinal();
                    if (ordinal2 == 0) {
                        vw3 b2 = xp7.b();
                        b2.getClass();
                        vw3 b3 = xp7.b();
                        b3.getClass();
                        oo7 = new oo7(qp7, b2, b3);
                    } else if (ordinal2 == 1) {
                        vw3 b4 = xp7.b();
                        b4.getClass();
                        fu6 p = ts1.e(qp7).p();
                        p.getClass();
                        oo7 = new oo7(qp7, b4, p);
                    } else if (ordinal2 == 2) {
                        fu6 o3 = ts1.e(qp7).o();
                        vw3 b5 = xp7.b();
                        b5.getClass();
                        oo7 = new oo7(qp7, o3, b5);
                    } else {
                        h.c();
                        return null;
                    }
                    if (xp7.c()) {
                        arrayList.add(oo7);
                        arrayList2.add(oo7);
                    } else {
                        mr o4 = o(oo7.b);
                        mr o5 = o(oo7.c);
                        qp7 qp72 = oo7.a;
                        oo7 oo72 = new oo7(qp72, (vw3) o4.b, (vw3) o5.a);
                        oo7 oo73 = new oo7(qp72, (vw3) o4.a, (vw3) o5.b);
                        arrayList.add(oo72);
                        arrayList2.add(oo73);
                    }
                } else {
                    dq7.a(36);
                    throw null;
                }
            }
            if (!arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    oo7 oo74 = (oo7) it2.next();
                    oo74.getClass();
                    if (!xw3.a.b(oo74.b, oo74.c)) {
                        break;
                    }
                }
                if (!z2) {
                    obj = jb5.k(vw3).o();
                } else {
                    obj = M(vw3, arrayList);
                }
                return new mr(obj, M(vw3, arrayList2));
            }
            z2 = false;
            if (!z2) {
            }
            return new mr(obj, M(vw3, arrayList2));
        }
    }

    public static final p60 p(fw0 fw0, yt2 yt2, int i) {
        boolean z2;
        if ((((i & 14) ^ 6) <= 4 || !yt2.g(fw0)) && (i & 6) != 4) {
            z2 = false;
        } else {
            z2 = true;
        }
        Object Q = yt2.Q();
        d63 d63 = ay0.a;
        if (z2 || Q == d63) {
            Q = new p60(fw0);
            yt2.o0(Q);
        }
        p60 p60 = (p60) Q;
        boolean g = yt2.g(p60);
        Object Q2 = yt2.Q();
        if (g || Q2 == d63) {
            Q2 = new gg0(8, (Object) p60);
            yt2.o0(Q2);
        }
        t49.e(p60, (vr2) Q2, yt2);
        return p60;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [h61] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0020  */
    public static final Object q(yl1 yl1, Charset charset, h61 h61) {
        j63 j63;
        Object obj;
        int i;
        CharsetDecoder charsetDecoder;
        q51 q51;
        Charset charset2;
        as3 as3;
        if (h61 instanceof j63) {
            j63 j632 = (j63) h61;
            int i2 = j632.B;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                j632.B = i2 - Integer.MIN_VALUE;
                j63 = j632;
                obj = j63.A;
                i = j63.B;
                if (i != 0) {
                    o85.q(obj);
                    yl1.getClass();
                    String x2 = yl1.a().x("Content-Type");
                    if (x2 != null) {
                        q51 q512 = q51.e;
                        q51 = kw5.m(x2);
                    } else {
                        q51 = null;
                    }
                    if (q51 != null) {
                        charset2 = t51.a(q51);
                    } else {
                        charset2 = null;
                    }
                    if (charset2 != null) {
                        charset = charset2;
                    }
                    CharsetDecoder newDecoder = charset.newDecoder();
                    l43 V = yl1.V();
                    Class<py6> cls = py6.class;
                    gq3 b = b26.a.b(cls);
                    try {
                        as3 = b26.b(cls);
                    } catch (Throwable unused) {
                        as3 = null;
                    }
                    fp7 fp7 = new fp7(b, as3);
                    j63.z = newDecoder;
                    j63.B = 1;
                    obj = V.a(fp7, j63);
                    p81 p81 = p81.w;
                    if (obj == p81) {
                        return p81;
                    }
                    charsetDecoder = newDecoder;
                } else if (i == 1) {
                    charsetDecoder = j63.z;
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                if (obj == null) {
                    charsetDecoder.getClass();
                    return b96.n(charsetDecoder, (py6) obj);
                }
                ku4.j("null cannot be cast to non-null type kotlinx.io.Source");
                return null;
            }
        }
        j63 = new h61(h61);
        obj = j63.A;
        i = j63.B;
        if (i != 0) {
        }
        if (obj == null) {
        }
    }

    public static ml4 t(ml4 ml4, ap4 ap4, o86 o86, boolean z2, s86 s86, sr2 sr2, int i) {
        ml4 ml42;
        if ((i & 4) != 0) {
            z2 = true;
        }
        boolean z3 = z2;
        if ((i & 16) != 0) {
            s86 = null;
        }
        s86 s862 = s86;
        if (o86 != null) {
            ml42 = new lr0(ap4, o86, false, z3, (String) null, s862, sr2);
        } else {
            ap4 ap42 = ap4;
            o86 o862 = o86;
            sr2 sr22 = sr2;
            if (o862 == null) {
                ml42 = new lr0(ap42, (oa3) null, false, z3, (String) null, s862, sr22);
            } else {
                jl4 jl4 = jl4.w;
                if (ap42 != null) {
                    ml42 = la3.a(jl4, ap42, o862).d(new lr0(ap42, (oa3) null, false, z3, (String) null, s862, sr22));
                } else {
                    ml42 = gw8.p(jl4, new nr0(o862, z3, s862, sr22));
                }
            }
        }
        return ml4.d(ml42);
    }

    public static ml4 u(ml4 ml4, boolean z2, String str, sr2 sr2, int i) {
        if ((i & 1) != 0) {
            z2 = true;
        }
        boolean z3 = z2;
        if ((i & 2) != 0) {
            str = null;
        }
        return ml4.d(new lr0((ap4) null, (oa3) null, true, z3, str, (s86) null, sr2));
    }

    public static ml4 v(ml4 ml4, ap4 ap4, sr2 sr2) {
        return ml4.d(new gu0(sr2, ap4));
    }

    public static final Object w(ry0 ry0, hu5 hu5) {
        if (!((ll4) ry0).w.J) {
            yb3.b("Cannot read CompositionLocal because the Modifier node is not currently attached.");
        }
        vf5 vf5 = (vf5) rc9.O0(ry0).W;
        vf5.getClass();
        return rc9.G0(vf5, hu5);
    }

    public static xz2 x(rv0 rv0, w58 w58) {
        pd1 pd1 = (pd1) ((io1) ag8.q(rv0, io1.class));
        pz3 a = pd1.a();
        jz0 jz0 = new jz0(9, pd1.a, pd1.b);
        w58.getClass();
        return new xz2(a, w58, jz0);
    }

    public static int y(Context context, int i, int i2) {
        Integer num;
        int i3;
        TypedValue I = gw8.I(context, i);
        if (I != null) {
            int i4 = I.resourceId;
            if (i4 != 0) {
                i3 = context.getColor(i4);
            } else {
                i3 = I.data;
            }
            num = Integer.valueOf(i3);
        } else {
            num = null;
        }
        if (num != null) {
            return num.intValue();
        }
        return i2;
    }

    public static int z(View view, int i) {
        Context context = view.getContext();
        TypedValue K = gw8.K(view.getContext(), view.getClass().getCanonicalName(), i);
        int i2 = K.resourceId;
        if (i2 != 0) {
            return context.getColor(i2);
        }
        return K.data;
    }

    public abstract void A(dr6 dr6, float f, float f2);

    public abstract int H(int i);

    public abstract int J(int i);

    public int a(int i) {
        int H = H(i);
        if (H == -1 || H(H) == -1) {
            return -1;
        }
        return H;
    }

    public int b(int i) {
        int J = J(i);
        if (J == -1 || J(J) == -1) {
            return -1;
        }
        return J;
    }

    public int e(int i) {
        return J(i);
    }

    public int f(int i) {
        return H(i);
    }

    public iw2 r(Context context, Looper looper, kd6 kd6, Object obj, nw2 nw2, ow2 ow2) {
        return s(context, looper, kd6, obj, (ng8) nw2, (ng8) ow2);
    }

    public iw2 s(Context context, Looper looper, kd6 kd6, Object obj, ng8 ng8, ng8 ng82) {
        throw new UnsupportedOperationException("buildClient must be implemented");
    }
}
