package defpackage;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.os.Binder;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.Process;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Log;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.Display;
import android.view.RoundedCorner;
import android.window.BackEvent;
import androidx.work.impl.WorkDatabase;
import java.io.InputStream;
import java.io.Serializable;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* renamed from: ag8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class ag8 {
    public static final fw0 a = new fw0(-216614306, new ww0(5), false);
    public static final fw0 b = new fw0(-1460786863, new ww0(6), false);
    public static final fw0 c = new fw0(2048182543, new ww0(7), false);
    public static final Class[] d = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};
    public static final rt0 e = rt0.C;
    public static final rt0 f = rt0.L;
    public static final rt0 g = rt0.K;
    public static final rt0 h;
    public static final rt0 i;
    public static final rt0 j = rt0.H;
    public static final Object k = new Object();
    public static Thread l;
    public static volatile Handler m;
    public static final /* synthetic */ int n = 0;
    public static x83 o;
    public static final /* synthetic */ int p = 0;

    static {
        rt0 rt0 = rt0.E;
        h = rt0;
        i = rt0;
    }

    public static final boolean A(vw3 vw3) {
        ht2 ht2;
        vw3.getClass();
        vq0 u = vw3.L().u();
        if (u == null) {
            return false;
        }
        if ((u instanceof ql4) && fv3.J(u)) {
            int i2 = ts1.a;
            vp2 f2 = rs1.f(u);
            f2.getClass();
            ht2 = t(f2);
        } else {
            ht2 = null;
        }
        if (sg3.e(ht2, dt2.d) || sg3.e(ht2, gt2.d)) {
            return true;
        }
        return false;
    }

    public static final boolean B(vw3 vw3) {
        vw3.getClass();
        vq0 u = vw3.L().u();
        ht2 ht2 = null;
        if (u != null && (u instanceof ql4) && fv3.J(u)) {
            int i2 = ts1.a;
            vp2 f2 = rs1.f(u);
            f2.getClass();
            ht2 = t(f2);
        }
        return sg3.e(ht2, gt2.d);
    }

    public static final void C(vm3 vm3, String str) {
        str.getClass();
        b96.M(vm3, "code_challenge", str);
        b96.M(vm3, "code_challenge_method", "s256");
    }

    public static Intent D(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 33) {
            return an.k(context, broadcastReceiver, intentFilter);
        }
        if (i2 >= 26) {
            return an.j(context, broadcastReceiver, intentFilter);
        }
        return context.registerReceiver(broadcastReceiver, intentFilter, (String) null, (Handler) null);
    }

    public static Executor E(Executor executor, xj2 xj2) {
        executor.getClass();
        if (executor == fv1.w) {
            return executor;
        }
        return new gm4(executor, xj2);
    }

    public static void F(Activity activity, String[] strArr, int i2) {
        String[] strArr2;
        HashSet hashSet = new HashSet();
        int i3 = 0;
        while (i3 < strArr.length) {
            if (!TextUtils.isEmpty(strArr[i3])) {
                if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(strArr[i3], "android.permission.POST_NOTIFICATIONS")) {
                    hashSet.add(Integer.valueOf(i3));
                }
                i3++;
            } else {
                h.q(f21.l(new StringBuilder("Permission request for permissions "), Arrays.toString(strArr), " must not contain null or empty values"));
                return;
            }
        }
        int size = hashSet.size();
        if (size > 0) {
            strArr2 = new String[(strArr.length - size)];
        } else {
            strArr2 = strArr;
        }
        if (size > 0) {
            if (size != strArr.length) {
                int i4 = 0;
                for (int i5 = 0; i5 < strArr.length; i5++) {
                    if (!hashSet.contains(Integer.valueOf(i5))) {
                        strArr2[i4] = strArr[i5];
                        i4++;
                    }
                }
            } else {
                return;
            }
        }
        activity.requestPermissions(strArr, i2);
    }

    public static final ml4 G(te7 te7) {
        return new bd7(te7);
    }

    public static void H(Context context, Intent intent) {
        if (Build.VERSION.SDK_INT >= 26) {
            an.w(context, intent);
        } else {
            context.startService(intent);
        }
    }

    public static final void I(int i2) {
        throw new IllegalArgumentException(hl6.k(i2, "An unknown field for index "));
    }

    public static final yl4 J(Month month) {
        return (yl4) yl4.x.get(month.getValue() - 1);
    }

    public static final qv4 K(BackEvent backEvent) {
        long j2;
        float a2 = backEvent.getTouchX();
        float z = backEvent.getTouchY();
        float D = backEvent.getProgress();
        int c2 = backEvent.getSwipeEdge();
        if (Build.VERSION.SDK_INT >= 36) {
            j2 = backEvent.getFrameTimeMillis();
        } else {
            j2 = 0;
        }
        return new qv4(c2, D, a2, z, j2);
    }

    public static final void L(long j2, String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            Trace.setCounter(str, j2);
        }
    }

    public static boolean M(Thread thread) {
        if (l == null) {
            l = Looper.getMainLooper().getThread();
        }
        if (thread == l) {
            return true;
        }
        return false;
    }

    public static Handler N() {
        if (m == null) {
            synchronized (k) {
                try {
                    if (m == null) {
                        m = new Handler(Looper.getMainLooper());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return m;
    }

    public static final void a(boolean z, sr2 sr2, yt2 yt2, int i2) {
        int i3;
        boolean z2;
        int i4;
        int i5;
        yt2.g0(-1339183247);
        if ((i2 & 6) == 0) {
            if (yt2.h(z)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i3 = i5 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (yt2.i(sr2)) {
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
            pd8.a(z, sr2, yt2, i3 & 126);
        } else {
            yt2.Y();
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new k30(z, sr2, i2, 1);
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [ll3, xu0] */
    public static xu0 b() {
        ? ll3 = new ll3(true);
        ll3.W((el3) null);
        return ll3;
    }

    public static final void c(sr2 sr2, ml4 ml4, pq6 pq6, long j2, long j3, sh2 sh2, fw0 fw0, yt2 yt2, int i2, int i3) {
        int i4;
        sr2 sr22;
        pq6 pq62;
        long j4;
        long j5;
        sh2 sh22;
        boolean z;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        yt2 yt22 = yt2;
        int i13 = i2;
        yt22.g0(748201188);
        if ((i13 & 6) == 0) {
            sr22 = sr2;
            if (yt22.i(sr22)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i4 = i12 | i13;
        } else {
            sr22 = sr2;
            i4 = i13;
        }
        if ((i13 & 48) == 0) {
            if (yt22.g(ml4)) {
                i11 = 32;
            } else {
                i11 = 16;
            }
            i4 |= i11;
        } else {
            ml4 ml42 = ml4;
        }
        if ((i13 & 384) == 0) {
            if ((i3 & 4) == 0) {
                pq62 = pq6;
                if (yt22.g(pq62)) {
                    i10 = 256;
                    i4 |= i10;
                }
            } else {
                pq62 = pq6;
            }
            i10 = 128;
            i4 |= i10;
        } else {
            pq62 = pq6;
        }
        if ((i13 & 3072) == 0) {
            j4 = j2;
            if (yt22.f(j4)) {
                i9 = 2048;
            } else {
                i9 = 1024;
            }
            i4 |= i9;
        } else {
            j4 = j2;
        }
        if ((i13 & 24576) == 0) {
            j5 = j3;
            if (yt22.f(j5)) {
                i8 = 16384;
            } else {
                i8 = 8192;
            }
            i4 |= i8;
        } else {
            j5 = j3;
        }
        if ((196608 & i13) == 0) {
            if ((i3 & 32) == 0) {
                sh22 = sh2;
                if (yt22.g(sh22)) {
                    i7 = 131072;
                    i4 |= i7;
                }
            } else {
                sh22 = sh2;
            }
            i7 = 65536;
            i4 |= i7;
        } else {
            sh22 = sh2;
        }
        if ((i3 & 64) != 0) {
            i4 |= 1572864;
        } else if ((i13 & 1572864) == 0) {
            if (yt22.g((Object) null)) {
                i6 = 1048576;
            } else {
                i6 = 524288;
            }
            i4 |= i6;
        }
        if ((12582912 & i13) == 0) {
            if (yt22.i(fw0)) {
                i5 = 8388608;
            } else {
                i5 = 4194304;
            }
            i4 |= i5;
        } else {
            fw0 fw02 = fw0;
        }
        if ((4793491 & i4) != 4793490) {
            z = true;
        } else {
            z = false;
        }
        if (yt22.V(i4 & 1, z)) {
            yt22.a0();
            if ((i13 & 1) == 0 || yt22.C()) {
                if ((i3 & 4) != 0) {
                    pq62 = hr6.a(bb0.p, yt22);
                    i4 &= -897;
                }
                if ((i3 & 32) != 0) {
                    i4 &= -458753;
                    sh22 = new sh2(gl0.m, gl0.p, gl0.n, gl0.o);
                }
            } else {
                yt22.Y();
                if ((i3 & 4) != 0) {
                    i4 &= -897;
                }
                if ((i3 & 32) != 0) {
                    i4 &= -458753;
                }
            }
            sh2 sh23 = sh22;
            yt22.s();
            int i14 = i4 << 9;
            int i15 = (i14 & 1879048192) | (i4 & 14) | 3456 | (57344 & i14) | (458752 & i14) | (3670016 & i14) | (29360128 & i14) | (234881024 & i14);
            int i16 = (i4 >> 21) & 14;
            long j6 = j4;
            pq6 pq63 = pq62;
            ml4 ml43 = ml4;
            d(sr22, dr7.a(we.i, yt22), bb0.q, ml43, pq63, j6, j5, sh23, fw0, yt22, i15, i16);
            pq62 = pq63;
            sh22 = sh23;
        } else {
            yt2.Y();
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new wh2(sr2, ml4, pq62, j2, j3, sh22, fw0, i13, i3);
        }
    }

    public static final void d(sr2 sr2, tg7 tg7, float f2, ml4 ml4, pq6 pq6, long j2, long j3, sh2 sh2, fw0 fw0, yt2 yt2, int i2, int i3) {
        int i4;
        int i5;
        fw0 fw02;
        boolean z;
        ml4 ml42;
        int i6;
        boolean z2;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        ml4 ml43 = ml4;
        sh2 sh22 = sh2;
        yt2 yt22 = yt2;
        int i18 = i2;
        yt22.g0(121669932);
        sr2 sr22 = sr2;
        if ((i18 & 6) == 0) {
            if (yt22.i(sr22)) {
                i17 = 4;
            } else {
                i17 = 2;
            }
            i4 = i17 | i18;
        } else {
            i4 = i18;
        }
        tg7 tg72 = tg7;
        if ((i18 & 48) == 0) {
            if (yt22.g(tg72)) {
                i16 = 32;
            } else {
                i16 = 16;
            }
            i4 |= i16;
        }
        if ((i18 & 384) == 0) {
            if (yt22.d(f2)) {
                i15 = 256;
            } else {
                i15 = 128;
            }
            i4 |= i15;
        } else {
            float f3 = f2;
        }
        if ((i18 & 3072) == 0) {
            if (yt22.d(56.0f)) {
                i14 = 2048;
            } else {
                i14 = 1024;
            }
            i4 |= i14;
        }
        if ((i18 & 24576) == 0) {
            if (yt22.g(ml43)) {
                i13 = 16384;
            } else {
                i13 = 8192;
            }
            i4 |= i13;
        }
        if ((196608 & i18) == 0) {
            if (yt22.g(pq6)) {
                i12 = 131072;
            } else {
                i12 = 65536;
            }
            i4 |= i12;
        } else {
            pq6 pq62 = pq6;
        }
        long j4 = j2;
        if ((1572864 & i18) == 0) {
            if (yt22.f(j4)) {
                i11 = 1048576;
            } else {
                i11 = 524288;
            }
            i4 |= i11;
        }
        long j5 = j3;
        if ((12582912 & i18) == 0) {
            if (yt22.f(j5)) {
                i10 = 8388608;
            } else {
                i10 = 4194304;
            }
            i4 |= i10;
        }
        if ((100663296 & i18) == 0) {
            if (yt22.g(sh22)) {
                i9 = 67108864;
            } else {
                i9 = 33554432;
            }
            i4 |= i9;
        }
        if ((805306368 & i18) == 0) {
            if (yt22.g((Object) null)) {
                i8 = 536870912;
            } else {
                i8 = 268435456;
            }
            i4 |= i8;
        }
        if ((i3 & 6) == 0) {
            fw02 = fw0;
            if (yt22.i(fw02)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i5 = i3 | i7;
        } else {
            fw02 = fw0;
            i5 = i3;
        }
        if ((i4 & 306783379) == 306783378 && (i5 & 3) == 2) {
            z = false;
        } else {
            z = true;
        }
        if (yt22.V(i4 & 1, z)) {
            yt22.a0();
            if ((i18 & 1) != 0 && !yt22.C()) {
                yt22.Y();
            }
            yt22.s();
            yt22.e0(-282853233);
            Object Q = yt22.Q();
            d63 d63 = ay0.a;
            if (Q == d63) {
                Q = b81.e(yt22);
            }
            ap4 ap4 = (ap4) Q;
            yt22.r(false);
            Object Q2 = yt22.Q();
            if (Q2 == d63) {
                Q2 = new vd2(2);
                yt22.o0(Q2);
            }
            ml4 a2 = ck6.a(ml43, false, (vr2) Q2);
            float f4 = sh22.a;
            int i19 = i4 >> 21;
            int i20 = i19 & 112;
            boolean g2 = yt22.g(ap4);
            float f5 = f4;
            Object Q3 = yt22.Q();
            if (g2 || Q3 == d63) {
                i6 = i4;
                ml42 = a2;
                Q3 = new vh2(sh22.a, sh22.b, sh22.d, sh22.c);
                yt22.o0(Q3);
            } else {
                i6 = i4;
                ml42 = a2;
            }
            vh2 vh2 = (vh2) Q3;
            boolean i21 = yt22.i(vh2);
            if (((i20 ^ 48) <= 32 || !yt22.g(sh22)) && (i19 & 48) != 32) {
                z2 = false;
            } else {
                z2 = true;
            }
            boolean z3 = i21 | z2;
            Object Q4 = yt22.Q();
            if (z3 || Q4 == d63) {
                Q4 = new ju1(vh2, sh22, (f61) null, 2);
                yt22.o0(Q4);
            }
            t49.h((gs2) Q4, yt22, sh22);
            boolean g3 = yt22.g(ap4) | yt22.i(vh2);
            Object Q5 = yt22.Q();
            if (g3 || Q5 == d63) {
                Q5 = new p0((Object) ap4, (Object) vh2, (f61) null, 19);
                yt22.o0(Q5);
            }
            t49.h((gs2) Q5, yt22, ap4);
            int i22 = i6 >> 6;
            float f6 = f5;
            ml4 ml44 = ml42;
            s87.c(sr22, ml44, false, pq6, j2, j3, f6, ((lx1) vh2.e.c.x.getValue()).w, (ua0) null, ap4, su0.J(-1779603465, new xh2(j5, tg72, f2, fw02), yt22), yt22, (i6 & 14) | (i22 & 7168) | (57344 & i22) | (i22 & 458752), 260);
        } else {
            yt2.Y();
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new yh2(sr2, tg7, f2, ml4, pq6, j2, j3, sh22, fw0, i2, i3);
        }
    }

    public static final void e(sr2 sr2, ml4 ml4, pq6 pq6, long j2, long j3, sh2 sh2, fw0 fw0, yt2 yt2, int i2) {
        int i3;
        int i4;
        int i5;
        boolean z;
        sh2 sh22;
        pq6 pq62;
        ml4 ml42;
        jl4 jl4;
        sh2 sh23;
        pq6 pq63;
        int i6;
        yt2 yt22 = yt2;
        yt22.g0(26608441);
        sr2 sr22 = sr2;
        if (yt22.i(sr22)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i7 = i2 | i3 | 176;
        long j4 = j2;
        if (yt22.f(j4)) {
            i4 = 2048;
        } else {
            i4 = 1024;
        }
        int i8 = i7 | i4;
        if (yt22.f(j3)) {
            i5 = 16384;
        } else {
            i5 = 8192;
        }
        int i9 = i8 | i5 | 1638400;
        if ((4793491 & i9) != 4793490) {
            z = true;
        } else {
            z = false;
        }
        if (yt22.V(i9 & 1, z)) {
            yt22.a0();
            if ((i2 & 1) == 0 || yt22.C()) {
                pq63 = hr6.a(x91.h, yt22);
                sh2 sh24 = new sh2(gl0.m, gl0.p, gl0.n, gl0.o);
                i6 = i9 & -459649;
                jl4 = jl4.w;
                sh23 = sh24;
            } else {
                yt22.Y();
                i6 = i9 & -459649;
                jl4 = ml4;
                pq63 = pq6;
                sh23 = sh2;
            }
            yt22.s();
            int i10 = i6 & 33554318;
            c(sr22, yu6.o(jl4, x91.i, 40.0f, 0.0f, 0.0f, 12), pq63, j4, j3, sh23, fw0, yt22, i10, 0);
            pq62 = pq63;
            sh22 = sh23;
            ml42 = jl4;
        } else {
            yt2.Y();
            ml42 = ml4;
            pq62 = pq6;
            sh22 = sh2;
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new ai2(sr2, ml42, pq62, j2, j3, sh22, fw0, i2);
        }
    }

    public static final List f(z53 z53, int i2, int i3, ArrayList arrayList, xo4 xo4, int i4, int i5, int i6, boolean z, vr2 vr2) {
        int i7;
        xo4 xo42;
        k24 k24;
        int i8;
        int i9;
        Object obj;
        int i10;
        int i11;
        long j2;
        long j3;
        int i12 = i2;
        ArrayList arrayList2 = arrayList;
        xo4 xo43 = xo4;
        int i13 = i4;
        boolean z2 = z;
        if (z53 == null || arrayList2.isEmpty() || (i7 = xo43.b) == 0) {
            return a42.w;
        }
        int i14 = -1;
        int i15 = 0;
        if (i3 - i12 < 0 || i7 == 0) {
            xo42 = ke3.a;
        } else {
            re3 V = z65.V(0, i7);
            int i16 = V.w;
            int i17 = V.x;
            int i18 = -1;
            if (i16 <= i17) {
                while (xo43.c(i16) <= i12) {
                    i18 = xo43.c(i16);
                    if (i16 == i17) {
                        break;
                    }
                    i16++;
                }
            }
            if (i18 == -1) {
                xo42 = ke3.a;
            } else {
                xo4 xo44 = ke3.a;
                xo42 = new xo4(1);
                xo42.a(i18);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList(arrayList2.size());
        int size = arrayList2.size();
        int i19 = 0;
        while (i19 < size) {
            Object obj2 = arrayList2.get(i19);
            int index = ((k24) obj2).getIndex();
            int[] iArr = xo43.a;
            int i20 = xo43.b;
            int i21 = i15;
            while (true) {
                if (i21 >= i20) {
                    break;
                } else if (iArr[i21] == index) {
                    arrayList4.add(obj2);
                    break;
                } else {
                    i21++;
                }
            }
            i19++;
            i15 = 0;
        }
        int[] iArr2 = xo42.a;
        int i22 = xo42.b;
        int i23 = 0;
        while (i23 < i22) {
            int i24 = iArr2[i23];
            Iterator it = arrayList2.iterator();
            int i25 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i25 = i14;
                    break;
                } else if (((k24) it.next()).getIndex() == i24) {
                    break;
                } else {
                    i25++;
                }
            }
            if (i25 == i14) {
                k24 = (k24) vr2.y(Integer.valueOf(i24));
            } else {
                vr2 vr22 = vr2;
                k24 = (k24) arrayList2.remove(i25);
            }
            int F = x91.F(k24, z2);
            if (i25 == i14) {
                i8 = i23;
                i9 = Integer.MIN_VALUE;
            } else {
                long g2 = k24.g(0);
                if (z2) {
                    i8 = i23;
                    j3 = g2 & 4294967295L;
                } else {
                    i8 = i23;
                    j3 = g2 >> 32;
                }
                i9 = (int) j3;
            }
            int size2 = arrayList4.size();
            int i26 = 0;
            while (true) {
                if (i26 >= size2) {
                    obj = null;
                    break;
                }
                obj = arrayList4.get(i26);
                if (((k24) obj).getIndex() != i24) {
                    break;
                }
                i26++;
            }
            k24 k242 = (k24) obj;
            if (k242 != null) {
                long g3 = k242.g(0);
                if (z2) {
                    j2 = g3 & 4294967295L;
                } else {
                    j2 = g3 >> 32;
                }
                i10 = (int) j2;
            } else {
                i10 = Integer.MIN_VALUE;
            }
            if (i9 == Integer.MIN_VALUE) {
                i11 = -i13;
            } else {
                i11 = Math.max(-i13, i9);
            }
            if (i10 != Integer.MIN_VALUE) {
                i11 = Math.min(i11, i10 - F);
            }
            k24.j();
            k24.f(i11, i5, i6);
            arrayList3.add(k24);
            i23 = i8 + 1;
            i14 = -1;
        }
        return arrayList3;
    }

    public static final ml4 g(ml4 ml4, yb0 yb0) {
        return ml4.d(new wb0(yb0));
    }

    public static final boolean h(Object obj) {
        if (obj instanceof sx6) {
            sx6 sx6 = (sx6) obj;
            if (sx6.a() == d63.G || sx6.a() == g22.K || sx6.a() == pe2.L) {
                Object value = sx6.getValue();
                if (value == null) {
                    return true;
                }
                return h(value);
            }
        } else if (!(obj instanceof ds2) || !(obj instanceof Serializable)) {
            for (int i2 = 0; i2 < 7; i2++) {
                if (d[i2].isInstance(obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final void i(nd8 nd8, String str) {
        re8 b2;
        WorkDatabase workDatabase = nd8.c;
        workDatabase.getClass();
        fe8 w = workDatabase.w();
        cq1 r = workDatabase.r();
        ArrayList I = sg3.I(str);
        while (!I.isEmpty()) {
            String str2 = (String) it0.k0(I);
            kd8 d2 = w.d(str2);
            if (!(d2 == kd8.y || d2 == kd8.z)) {
                ((Number) sg3.O(w.a, false, true, new sd8(str2, 5))).intValue();
            }
            I.addAll(r.a(str2));
        }
        lp5 lp5 = nd8.f;
        lp5.getClass();
        synchronized (lp5.k) {
            bc4 k2 = bc4.k();
            String str3 = lp5.l;
            k2.e(str3, "Processor cancelling " + str);
            lp5.i.add(str);
            b2 = lp5.b(str);
        }
        lp5.d(str, b2, 1);
        for (jg6 d3 : nd8.e) {
            d3.d(str);
        }
    }

    public static final void j(long j2, z75 z75) {
        if (z75 == z75.w) {
            if (k31.g(j2) == Integer.MAX_VALUE) {
                bc3.c("Vertically scrollable component was measured with an infinity maximum height constraints, which is disallowed. One of the common reasons is nesting layouts like LazyColumn and Column(Modifier.verticalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyColumn scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
            }
        } else if (k31.h(j2) == Integer.MAX_VALUE) {
            bc3.c("Horizontally scrollable component was measured with an infinity maximum width constraints, which is disallowed. One of the common reasons is nesting layouts like LazyRow and Row(Modifier.horizontalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyRow scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        }
    }

    public static int k(Context context, String str) {
        if (str == null) {
            ku4.j("permission must be non-null");
            return 0;
        } else if (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        } else {
            if (new l15(context).a.areNotificationsEnabled()) {
                return 0;
            }
            return -1;
        }
    }

    public static final n74 l(sv3 sv3, List list, uu3 uu3, List list2, vp7 vp7, boolean z) {
        sv3.getClass();
        list.getClass();
        list2.getClass();
        vp7.getClass();
        n74 m2 = sg3.m();
        if (z) {
            yq3 B = sv3.B();
            if (B instanceof oq3) {
                if (r16.a0(sv3)) {
                    if (((oq3) B).p()) {
                        Class<?> declaringClass = kl8.u((gq3) B).getDeclaringClass();
                        declaringClass.getClass();
                        m2.add(new od3(sv3, b26.a.b(declaringClass)));
                    }
                } else if (!(sv3 instanceof qw3) || !jb5.v((u16) sv3)) {
                    StringBuilder sb = new StringBuilder("Only top-level callables are supported for now: ");
                    sb.append(B);
                    String name = sv3.getName();
                    sb.append('/');
                    sb.append(name);
                    throw new IllegalArgumentException(sb.toString().toString());
                }
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                m2.add(new ew3(sv3, (yu3) it.next(), m2.f(), qr3.x, vp7));
            }
            if (uu3 != null) {
                String b2 = oz6.d.b();
                b2.getClass();
                yu3 yu3 = new yu3(0, b2);
                yu3.c = uu3;
                m2.add(new ew3(sv3, yu3, m2.f(), qr3.y, vp7));
            }
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            m2.add(new ew3(sv3, (yu3) it2.next(), m2.f(), qr3.z, vp7));
        }
        return sg3.i(m2);
    }

    public static final int m(vw3 vw3) {
        vw3.getClass();
        fm m2 = vw3.getAnnotations().m(m27.q);
        if (m2 == null) {
            return 0;
        }
        e21 e21 = (e21) sf4.U(n27.e, m2.g());
        e21.getClass();
        return ((Number) ((ye3) e21).a).intValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0022, code lost:
        if (r1 <= r2) goto L_0x0024;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0071  */
    public static rd0 n(up2 up2, kb4 kb4, sl4 sl4, InputStream inputStream) {
        os5 os5;
        os5 os52;
        k2 k2Var;
        up2.getClass();
        sl4.getClass();
        try {
            nd0 nd0 = nd0.f;
            nd0 z = pd8.z(inputStream);
            nd0 nd02 = nd0.f;
            int i2 = z.c;
            nd02.getClass();
            int i3 = nd02.c;
            int i4 = z.b;
            int i5 = nd02.b;
            if (i4 == 0) {
                if (i5 == 0 && i2 == i3) {
                }
                os5 = null;
                os52 = os5;
                inputStream.close();
                if (os52 != null) {
                    return new rd0(up2, kb4, sl4, os52, z);
                }
                throw new UnsupportedOperationException("Kotlin built-in definition format version is not supported: expected " + nd02 + ", actual " + z + ". Please update Kotlin");
            }
            if (i4 == i5) {
            }
            os5 = null;
            os52 = os5;
            inputStream.close();
            if (os52 != null) {
            }
            y92 d2 = h03.d(pw5.D);
            fp3 fp3 = os5.H;
            fp3.getClass();
            ts0 ts0 = new ts0(inputStream);
            k2Var = (k2) fp3.b(ts0, d2);
            ts0.a(0);
            if (k2Var.a()) {
                os5 = (os5) k2Var;
                os52 = os5;
                inputStream.close();
                if (os52 != null) {
                }
            } else {
                InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(new UninitializedMessageException().getMessage());
                invalidProtocolBufferException.w = k2Var;
                throw invalidProtocolBufferException;
            }
        } catch (InvalidProtocolBufferException e2) {
            InvalidProtocolBufferException invalidProtocolBufferException2 = e2;
            invalidProtocolBufferException2.w = k2Var;
            throw invalidProtocolBufferException2;
        } catch (Throwable th) {
            Throwable th2 = th;
            try {
                throw th2;
            } catch (Throwable th3) {
                Throwable th4 = th3;
                ed1.i(inputStream, th2);
                throw th4;
            }
        }
    }

    public static final fu6 o(fv3 fv3, rm rmVar, vw3 vw3, List list, ArrayList arrayList, vw3 vw32, boolean z) {
        int i2;
        p27 p27;
        ql4 ql4;
        rm rmVar2 = me6.x;
        int size = list.size() + arrayList.size();
        int i3 = 1;
        if (vw3 != null) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        ArrayList arrayList2 = new ArrayList(size + i2 + 1);
        ArrayList arrayList3 = new ArrayList(et0.e0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            vw3 vw33 = (vw3) it.next();
            vw33.getClass();
            arrayList3.add(new p27(vw33));
        }
        arrayList2.addAll(arrayList3);
        if (vw3 != null) {
            p27 = new p27(vw3);
        } else {
            p27 = null;
        }
        if (p27 != null) {
            arrayList2.add(p27);
        }
        Iterator it2 = arrayList.iterator();
        int i4 = 0;
        while (it2.hasNext()) {
            Object next = it2.next();
            int i5 = i4 + 1;
            if (i4 >= 0) {
                vw3 vw34 = (vw3) next;
                vw34.getClass();
                arrayList2.add(new p27(vw34));
                i4 = i5;
            } else {
                sg3.Z();
                throw null;
            }
        }
        arrayList2.add(new p27(vw32));
        int size2 = list.size() + arrayList.size();
        if (vw3 == null) {
            i3 = 0;
        }
        int i6 = size2 + i3;
        if (z) {
            ql4 = fv3.w(i6);
        } else {
            uq4 uq4 = n27.a;
            ql4 = fv3.k("Function" + i6);
        }
        if (vw3 != null) {
            up2 up2 = m27.p;
            if (!rmVar.i(up2)) {
                ArrayList L0 = dt0.L0(rmVar, new jd0(fv3, up2, b42.w));
                if (L0.isEmpty()) {
                    rmVar = rmVar2;
                } else {
                    rmVar = new tm(0, L0);
                }
            }
        }
        if (!list.isEmpty()) {
            int size3 = list.size();
            up2 up22 = m27.q;
            if (!rmVar.i(up22)) {
                Map singletonMap = Collections.singletonMap(n27.e, new ye3(size3));
                singletonMap.getClass();
                ArrayList L02 = dt0.L0(rmVar, new jd0(fv3, up22, singletonMap));
                if (!L02.isEmpty()) {
                    rmVar2 = new tm(0, L02);
                }
                rmVar = rmVar2;
            }
        }
        return kl8.H(b85.u(rmVar), ql4, arrayList2);
    }

    public static final uq4 p(vw3 vw3) {
        x47 x47;
        String str;
        fm m2 = vw3.getAnnotations().m(m27.r);
        if (m2 != null) {
            Object R0 = dt0.R0(m2.g().values());
            if (R0 instanceof x47) {
                x47 = (x47) R0;
            } else {
                x47 = null;
            }
            if (!(x47 == null || (str = (String) x47.a) == null)) {
                if (!uq4.f(str)) {
                    str = null;
                }
                if (str != null) {
                    return uq4.e(str);
                }
            }
        }
        return null;
    }

    public static Object q(Object obj, Class cls) {
        if (obj instanceof mu2) {
            return cls.cast(obj);
        }
        if (obj instanceof nu2) {
            return q(((nu2) obj).a(), cls);
        }
        Class<?> cls2 = obj.getClass();
        throw new IllegalStateException("Given component holder " + cls2 + " does not implement " + mu2.class + " or " + nu2.class);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0047, code lost:
        if (r5.c == r8.hashCode()) goto L_0x0049;
     */
    public static ColorStateList r(Context context, int i2) {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        v56 v56;
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        w56 w56 = new w56(resources, theme);
        synchronized (x56.c) {
            try {
                SparseArray sparseArray = (SparseArray) x56.b.get(w56);
                colorStateList = null;
                if (!(sparseArray == null || sparseArray.size() <= 0 || (v56 = (v56) sparseArray.get(i2)) == null)) {
                    if (v56.b.equals(resources.getConfiguration())) {
                        if (theme == null) {
                            if (v56.c != 0) {
                            }
                            colorStateList2 = v56.a;
                        }
                        if (theme != null) {
                        }
                    }
                    sparseArray.remove(i2);
                }
                colorStateList2 = null;
            } finally {
                while (true) {
                }
            }
        }
        if (colorStateList2 != null) {
            return colorStateList2;
        }
        ThreadLocal threadLocal = x56.a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        resources.getValue(i2, typedValue, true);
        int i3 = typedValue.type;
        if (i3 < 28 || i3 > 31) {
            try {
                colorStateList = wt0.a(resources, resources.getXml(i2), theme);
            } catch (Exception e2) {
                Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e2);
            }
        }
        if (colorStateList == null) {
            return resources.getColorStateList(i2, theme);
        }
        synchronized (x56.c) {
            try {
                WeakHashMap weakHashMap = x56.b;
                SparseArray sparseArray2 = (SparseArray) weakHashMap.get(w56);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray();
                    weakHashMap.put(w56, sparseArray2);
                }
                sparseArray2.append(i2, new v56(colorStateList, w56.a.getConfiguration(), theme));
            } catch (Throwable th) {
                throw th;
            }
        }
        return colorStateList;
    }

    public static final List s(vw3 vw3) {
        vw3.getClass();
        A(vw3);
        int m2 = m(vw3);
        if (m2 == 0) {
            return a42.w;
        }
        List<xp7> subList = vw3.G().subList(0, m2);
        ArrayList arrayList = new ArrayList(et0.e0(subList, 10));
        for (xp7 b2 : subList) {
            arrayList.add(b2.b());
        }
        return arrayList;
    }

    public static final ht2 t(vp2 vp2) {
        if (!vp2.d() || vp2.c()) {
            return null;
        }
        jt2 jt2 = jt2.b;
        up2 b2 = vp2.i().b();
        String b3 = vp2.g().b();
        b3.getClass();
        jt2.getClass();
        it2 a2 = jt2.a(b2, b3);
        if (a2 != null) {
            return a2.a;
        }
        return null;
    }

    public static final x83 u() {
        x83 x83 = o;
        if (x83 != null) {
            return x83;
        }
        w83 w83 = new w83("Rounded.Insights", 24.0f, 24.0f, 24.0f, 24.0f, 0, 0, false, 96);
        int i2 = e38.a;
        long j2 = jt0.b;
        ky6 ky6 = new ky6(j2);
        be5 e2 = pb4.e(21.0f, 8.0f);
        e2.e(-1.45f, 0.0f, -2.26f, 1.44f, -1.93f, 2.51f);
        e2.i(-3.55f, 3.56f);
        e2.e(-0.3f, -0.09f, -0.74f, -0.09f, -1.04f, 0.0f);
        e2.i(-2.55f, -2.55f);
        e2.d(12.27f, 10.45f, 11.46f, 9.0f, 10.0f, 9.0f);
        e2.e(-1.45f, 0.0f, -2.27f, 1.44f, -1.93f, 2.52f);
        e2.i(-4.56f, 4.55f);
        e2.d(2.44f, 15.74f, 1.0f, 16.55f, 1.0f, 18.0f);
        e2.e(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        e2.e(1.45f, 0.0f, 2.26f, -1.44f, 1.93f, -2.51f);
        e2.i(4.55f, -4.56f);
        e2.e(0.3f, 0.09f, 0.74f, 0.09f, 1.04f, 0.0f);
        e2.i(2.55f, 2.55f);
        e2.d(12.73f, 16.55f, 13.54f, 18.0f, 15.0f, 18.0f);
        e2.e(1.45f, 0.0f, 2.27f, -1.44f, 1.93f, -2.52f);
        e2.i(3.56f, -3.55f);
        e2.d(21.56f, 12.26f, 23.0f, 11.45f, 23.0f, 10.0f);
        e2.d(23.0f, 8.9f, 22.1f, 8.0f, 21.0f, 8.0f);
        e2.c();
        w83.a(w83, e2.a, ky6, 14336);
        ky6 ky62 = new ky6(j2);
        be5 f2 = pb4.f(15.0f, 9.0f, 0.94f, -2.07f);
        f2.i(2.06f, -0.93f);
        f2.i(-2.06f, -0.93f);
        f2.i(-0.94f, -2.07f);
        f2.i(-0.92f, 2.07f);
        f2.i(-2.08f, 0.93f);
        f2.i(2.08f, 0.93f);
        f2.c();
        w83.a(w83, f2.a, ky62, 14336);
        ky6 ky63 = new ky6(j2);
        be5 f3 = pb4.f(3.5f, 11.0f, 0.5f, -2.0f);
        f3.i(2.0f, -0.5f);
        f3.i(-2.0f, -0.5f);
        f3.i(-0.5f, -2.0f);
        f3.i(-0.5f, 2.0f);
        f3.i(-2.0f, 0.5f);
        f3.i(2.0f, 0.5f);
        f3.c();
        w83.a(w83, f3.a, ky63, 14336);
        x83 b2 = w83.b();
        o = b2;
        return b2;
    }

    public static Executor v(ContextWrapper contextWrapper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return bn.f(contextWrapper);
        }
        return new w80(new Handler(contextWrapper.getMainLooper()), 2);
    }

    public static final vw3 w(vw3 vw3) {
        vw3.getClass();
        A(vw3);
        if (vw3.getAnnotations().m(m27.p) == null) {
            return null;
        }
        return ((xp7) vw3.G().get(m(vw3))).b();
    }

    public static n96 x(Display display, int i2) {
        RoundedCorner n2;
        int i3;
        if (Build.VERSION.SDK_INT < 31 || (n2 = display.getRoundedCorner(i2)) == null) {
            return null;
        }
        int d2 = n2.getPosition();
        if (d2 != 0) {
            i3 = 1;
            if (d2 != 1) {
                i3 = 2;
                if (d2 != 2) {
                    i3 = 3;
                    if (d2 != 3) {
                        h.q(hl6.k(d2, "Invalid position: "));
                        return null;
                    }
                }
            }
        } else {
            i3 = 0;
        }
        return new n96(i3, n2.getRadius(), n2.getCenter());
    }

    public static final List y(vw3 vw3) {
        int i2;
        vw3.getClass();
        A(vw3);
        List G = vw3.G();
        int m2 = m(vw3);
        if (!A(vw3) || vw3.getAnnotations().m(m27.p) == null) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        return G.subList(i2 + m2, G.size() - 1);
    }

    public static ml4 z(ml4 ml4, ap4 ap4) {
        return ml4.d(new t23(ap4));
    }
}
