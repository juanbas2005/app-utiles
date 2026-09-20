package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Debug;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Method;
import java.security.KeyStore;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;

/* renamed from: su0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class su0 {
    public static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final char[] b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final Object c = new Object();
    public static final fw0 d = new fw0(-1132537920, new xw0(18), false);
    public static final c82 e = new c82(0);
    public static final wh f = new wh(6);
    public static final rt0 g;
    public static final float h = 0.38f;
    public static final rt0 i;
    public static final rt0 j = rt0.G;
    public static final Object k = new Object();
    public static x83 l;
    public static x83 m;
    public static x83 n;
    public static x83 o;
    public static x83 p;
    public static x83 q;
    public static x83 r;

    static {
        rt0 rt0 = rt0.E;
        g = rt0;
        i = rt0;
    }

    public static final void A(my3 my3) {
        rc9.M0(my3, 2).j1();
    }

    public static final void B(my3 my3) {
        rc9.O0(my3).G();
    }

    public static final boolean C(float[] fArr, float[] fArr2) {
        boolean z;
        float[] fArr3 = fArr;
        float[] fArr4 = fArr2;
        if (fArr3.length < 16 || fArr4.length < 16) {
            return false;
        }
        float f2 = fArr3[0];
        float f3 = fArr3[1];
        float f4 = fArr3[2];
        float f5 = fArr3[3];
        float f6 = fArr3[4];
        float f7 = fArr3[5];
        float f8 = fArr3[6];
        float f9 = fArr3[7];
        float f10 = fArr3[8];
        float f11 = fArr3[9];
        float f12 = fArr3[10];
        float f13 = fArr3[11];
        float f14 = fArr3[12];
        float f15 = fArr3[13];
        float f16 = fArr3[14];
        float f17 = fArr3[15];
        float f18 = (f2 * f7) - (f3 * f6);
        float f19 = (f2 * f8) - (f4 * f6);
        float f20 = (f2 * f9) - (f5 * f6);
        float f21 = (f3 * f8) - (f4 * f7);
        float f22 = (f3 * f9) - (f5 * f7);
        float f23 = (f4 * f9) - (f5 * f8);
        float f24 = (f10 * f15) - (f11 * f14);
        float f25 = (f10 * f16) - (f12 * f14);
        float f26 = (f10 * f17) - (f13 * f14);
        float f27 = (f11 * f16) - (f12 * f15);
        float f28 = (f11 * f17) - (f13 * f15);
        float f29 = (f12 * f17) - (f13 * f16);
        float f30 = (f23 * f24) + (((f21 * f26) + ((f20 * f27) + ((f18 * f29) - (f19 * f28)))) - (f22 * f25));
        int i2 = (f30 > 0.0f ? 1 : (f30 == 0.0f ? 0 : -1));
        if (i2 != 0) {
            float f31 = 1.0f / f30;
            fArr4[0] = ((f9 * f27) + ((f7 * f29) - (f8 * f28))) * f31;
            fArr4[1] = (((f4 * f28) + ((-f3) * f29)) - (f5 * f27)) * f31;
            fArr4[2] = ((f17 * f21) + ((f15 * f23) - (f16 * f22))) * f31;
            fArr4[3] = (((f12 * f22) + ((-f11) * f23)) - (f13 * f21)) * f31;
            float f32 = -f6;
            fArr4[4] = (((f8 * f26) + (f32 * f29)) - (f9 * f25)) * f31;
            fArr4[5] = ((f5 * f25) + ((f29 * f2) - (f4 * f26))) * f31;
            float f33 = -f14;
            fArr4[6] = (((f16 * f20) + (f33 * f23)) - (f17 * f19)) * f31;
            fArr4[7] = ((f13 * f19) + ((f23 * f10) - (f12 * f20))) * f31;
            fArr4[8] = ((f9 * f24) + ((f6 * f28) - (f7 * f26))) * f31;
            fArr4[9] = (((f26 * f3) + ((-f2) * f28)) - (f5 * f24)) * f31;
            fArr4[10] = ((f17 * f18) + ((f14 * f22) - (f15 * f20))) * f31;
            fArr4[11] = (((f20 * f11) + ((-f10) * f22)) - (f13 * f18)) * f31;
            fArr4[12] = (((f7 * f25) + (f32 * f27)) - (f8 * f24)) * f31;
            fArr4[13] = ((f4 * f24) + ((f2 * f27) - (f3 * f25))) * f31;
            fArr4[14] = (((f15 * f19) + (f33 * f21)) - (f16 * f18)) * f31;
            fArr4[15] = ((f12 * f18) + ((f10 * f21) - (f11 * f19))) * f31;
        }
        if (i2 == 0) {
            z = true;
        } else {
            z = false;
        }
        return !z;
    }

    public static boolean D(int i2, Rect rect, Rect rect2) {
        if (i2 == 17) {
            int i3 = rect.right;
            int i4 = rect2.right;
            if ((i3 > i4 || rect.left >= i4) && rect.left > rect2.left) {
                return true;
            }
        } else if (i2 == 33) {
            int i5 = rect.bottom;
            int i6 = rect2.bottom;
            if ((i5 > i6 || rect.top >= i6) && rect.top > rect2.top) {
                return true;
            }
        } else if (i2 == 66) {
            int i7 = rect.left;
            int i8 = rect2.left;
            if ((i7 < i8 || rect.right <= i8) && rect.right < rect2.right) {
                return true;
            }
        } else if (i2 == 130) {
            int i9 = rect.top;
            int i10 = rect2.top;
            if ((i9 < i10 || rect.bottom <= i10) && rect.bottom < rect2.bottom) {
                return true;
            }
        } else {
            h.q("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            return false;
        }
        return false;
    }

    public static boolean E() {
        if (Build.PRODUCT.contains("sdk")) {
            return true;
        }
        String str = Build.HARDWARE;
        if (str.contains("goldfish") || str.contains("ranchu")) {
            return true;
        }
        return false;
    }

    public static boolean F() {
        boolean E = E();
        String str = Build.TAGS;
        if ((!E && str != null && str.contains("test-keys")) || new File("/system/app/Superuser.apk").exists()) {
            return true;
        }
        File file = new File("/system/xbin/su");
        if (E || !file.exists()) {
            return false;
        }
        return true;
    }

    public static int G(int i2, Rect rect, Rect rect2) {
        int i3;
        int i4;
        if (i2 == 17) {
            i3 = rect.left;
            i4 = rect2.right;
        } else if (i2 == 33) {
            i3 = rect.top;
            i4 = rect2.bottom;
        } else if (i2 == 66) {
            i3 = rect2.left;
            i4 = rect.right;
        } else if (i2 == 130) {
            i3 = rect2.top;
            i4 = rect.bottom;
        } else {
            h.q("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            return 0;
        }
        return Math.max(0, i3 - i4);
    }

    public static int H(int i2, Rect rect, Rect rect2) {
        if (i2 != 17) {
            if (i2 != 33) {
                if (i2 != 66) {
                    if (i2 != 130) {
                        h.q("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        return 0;
                    }
                }
            }
            return Math.abs(((rect.width() / 2) + rect.left) - ((rect2.width() / 2) + rect2.left));
        }
        return Math.abs(((rect.height() / 2) + rect.top) - ((rect2.height() / 2) + rect2.top));
    }

    public static final e81 I(o81 o81, e81 e81) {
        e81 o2 = o(o81.k(), e81, true);
        dn1 dn1 = aw1.a;
        if (o2 == dn1 || o2.a0(hz2.z) != null) {
            return o2;
        }
        return o2.X(dn1);
    }

    public static final fw0 J(int i2, ds2 ds2, yt2 yt2) {
        Object Q = yt2.Q();
        if (Q == ay0.a) {
            Q = new fw0(i2, ds2, true);
            yt2.o0(Q);
        }
        fw0 fw0 = (fw0) Q;
        fw0.p(ds2);
        return fw0;
    }

    public static final View K(vo1 vo1) {
        if (!((ll4) vo1).w.J) {
            yb3.b("Cannot get View because the Modifier node is not currently attached.");
        }
        return (View) xy3.a(rc9.O0(vo1));
    }

    public static final ml4 L(ml4 ml4, boolean z, ap4 ap4, oa3 oa3, boolean z2, s86 s86, sr2 sr2) {
        ml4 ml42;
        if (oa3 != null) {
            ml42 = new ej6(z, ap4, oa3, false, z2, s86, sr2);
        } else {
            boolean z3 = z;
            ap4 ap42 = ap4;
            oa3 oa32 = oa3;
            boolean z4 = z2;
            s86 s862 = s86;
            sr2 sr22 = sr2;
            if (oa32 == null) {
                ml42 = new ej6(z3, ap42, (oa3) null, false, z4, s862, sr22);
            } else {
                jl4 jl4 = jl4.w;
                if (ap42 != null) {
                    ml42 = la3.a(jl4, ap42, oa32).d(new ej6(z3, ap42, (oa3) null, false, z4, s862, sr22));
                } else {
                    ml42 = gw8.p(jl4, new fj6(oa32, z3, z4, s862, sr22));
                }
            }
        }
        return ml4.d(ml42);
    }

    public static ml4 M(ml4 ml4, boolean z, s86 s86, sr2 sr2) {
        return ml4.d(new ej6(z, (ap4) null, (oa3) null, true, true, s86, sr2));
    }

    public static String N(String str) {
        byte[] bytes = str.getBytes();
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-1");
            instance.update(bytes);
            return z(instance.digest());
        } catch (NoSuchAlgorithmException e2) {
            Log.e("FirebaseCrashlytics", "Could not create hashing algorithm: SHA-1, returning empty string.", e2);
            return "";
        }
    }

    public static String O(Throwable th) {
        th.getClass();
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        String stringWriter2 = stringWriter.toString();
        stringWriter2.getClass();
        return stringWriter2;
    }

    public static String P(FileInputStream fileInputStream) {
        String str;
        Scanner useDelimiter = new Scanner(fileInputStream).useDelimiter("\\A");
        try {
            if (useDelimiter.hasNext()) {
                str = useDelimiter.next();
            } else {
                str = "";
            }
            useDelimiter.close();
            return str;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public static final void Q(my3 my3, vr2 vr2) {
        xz4 xz4;
        if (((ll4) my3).w.J && (xz4 = rc9.M0(my3, 2).P) != null) {
            xz4.B1(vr2, true);
        }
    }

    public static final os7 R(f61 f61, e81 e81, Object obj) {
        os7 os7 = null;
        if ((f61 instanceof q81) && e81.a0(pk0.z) != null) {
            q81 q81 = (q81) f61;
            while (true) {
                if (!(q81 instanceof uv1) && (q81 = q81.e()) != null) {
                    if (q81 instanceof os7) {
                        os7 = (os7) q81;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (os7 != null) {
                os7.B0(e81, obj);
            }
        }
        return os7;
    }

    public static boolean S(int i2, int i3, int i4, int i5) {
        boolean z;
        boolean z2;
        if (i4 == 1 || i4 == 2 || (i4 == 4 && i2 != 2)) {
            z = true;
        } else {
            z = false;
        }
        if (i5 == 1 || i5 == 2 || (i5 == 4 && i3 != 2)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z || z2) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x017e  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0196  */
    /* JADX WARNING: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00de  */
    public static final void a(sr2 sr2, fw0 fw0, ml4 ml4, gs2 gs2, gs2 gs22, gs2 gs23, gs2 gs24, pq6 pq6, long j2, long j3, long j4, long j5, wu1 wu1, yt2 yt2, int i2, int i3) {
        int i4;
        gs2 gs25;
        int i5;
        gs2 gs26;
        int i6;
        gs2 gs27;
        long j6;
        wu1 wu12;
        long j7;
        long j8;
        long j9;
        long j10;
        pq6 pq62;
        gs2 gs28;
        gs2 gs29;
        ml4 ml42;
        yx5 v;
        wu1 wu13;
        long j11;
        long j12;
        long j13;
        long j14;
        pq6 pq63;
        gs2 gs210;
        gs2 gs211;
        gs2 gs212;
        int i7;
        ml4 ml43;
        int i8;
        yt2 yt22 = yt2;
        int i9 = i2;
        int i10 = i3;
        yt22.g0(94478519);
        if ((i9 & 6) == 0) {
            i4 = (yt22.i(sr2) ? 4 : 2) | i9;
        } else {
            sr2 sr22 = sr2;
            i4 = i9;
        }
        if ((i9 & 48) == 0) {
            i4 |= yt22.i(fw0) ? 32 : 16;
        } else {
            fw0 fw02 = fw0;
        }
        int i11 = i4 | 384;
        int i12 = i10 & 8;
        if (i12 != 0) {
            i11 = i4 | 3456;
        } else if ((i9 & 3072) == 0) {
            gs25 = gs2;
            i11 |= yt22.i(gs25) ? 2048 : 1024;
            i5 = i10 & 16;
            if (i5 == 0) {
                i11 |= 24576;
            } else if ((i9 & 24576) == 0) {
                gs26 = gs22;
                i11 |= yt22.i(gs26) ? 16384 : 8192;
                i6 = i10 & 32;
                if (i6 != 0) {
                    i11 |= 196608;
                } else if ((196608 & i9) == 0) {
                    gs27 = gs23;
                    i11 |= yt22.i(gs27) ? 131072 : 65536;
                    if ((1572864 & i9) != 0) {
                        i11 |= yt22.i(gs24) ? 1048576 : 524288;
                    } else {
                        gs2 gs213 = gs24;
                    }
                    if ((12582912 & i9) == 0) {
                        i11 |= 4194304;
                    }
                    if ((100663296 & i9) != 0) {
                        if ((i10 & 256) == 0) {
                            j6 = j2;
                            if (yt22.f(j6)) {
                                i8 = 67108864;
                                i11 |= i8;
                            }
                        } else {
                            j6 = j2;
                        }
                        i8 = 33554432;
                        i11 |= i8;
                    } else {
                        j6 = j2;
                    }
                    if ((805306368 & i9) == 0) {
                        i11 |= 268435456;
                    }
                    if (!yt22.V(i11 & 1, (306783379 & i11) == 306783378)) {
                        yt22.a0();
                        if ((i2 & 1) == 0 || yt22.C()) {
                            gs2 gs214 = null;
                            if (i12 != 0) {
                                gs25 = null;
                            }
                            if (i5 != 0) {
                                gs26 = null;
                            }
                            if (i6 == 0) {
                                gs214 = gs27;
                            }
                            pq63 = hr6.a(ar7.i0, yt22);
                            int i13 = i11 & -29360129;
                            if ((i10 & 256) != 0) {
                                i13 = i11 & -264241153;
                                j6 = st0.e(ar7.h0, yt22);
                            }
                            j13 = st0.e(ar7.n0, yt22);
                            int i14 = i13 & -1879048193;
                            long e2 = st0.e(ar7.j0, yt22);
                            long e3 = st0.e(ar7.l0, yt22);
                            wu1 wu14 = new wu1(7);
                            ml43 = jl4.w;
                            gs210 = gs214;
                            gs212 = gs25;
                            i7 = i14;
                            gs211 = gs26;
                            wu13 = wu14;
                            j14 = j6;
                            j12 = e2;
                            j11 = e3;
                        } else {
                            yt22.Y();
                            int i15 = i11 & -29360129;
                            if ((i10 & 256) != 0) {
                                i15 = i11 & -264241153;
                            }
                            i7 = i15 & -1879048193;
                            ml43 = ml4;
                            pq63 = pq6;
                            wu13 = wu1;
                            gs212 = gs25;
                            gs211 = gs26;
                            gs210 = gs27;
                            j14 = j6;
                            j13 = j3;
                            j12 = j4;
                            j11 = j5;
                        }
                        yt2.s();
                        ml4 ml44 = ml43;
                        eb.c(sr2, fw0, ml44, gs212, gs211, gs210, gs24, pq63, j14, j13, j12, j11, wu13, yt2, i7 & 2147483646, 3456);
                        gs28 = gs210;
                        wu12 = wu13;
                        gs29 = gs211;
                        j7 = j11;
                        gs25 = gs212;
                        j8 = j12;
                        ml42 = ml44;
                        j9 = j13;
                        j10 = j14;
                        pq62 = pq63;
                    } else {
                        yt2.Y();
                        ml42 = ml4;
                        pq62 = pq6;
                        j7 = j5;
                        wu12 = wu1;
                        gs29 = gs26;
                        gs28 = gs27;
                        j10 = j6;
                        j9 = j3;
                        j8 = j4;
                    }
                    v = yt2.v();
                    if (v == null) {
                        v.d = new wa(sr2, fw0, ml42, gs25, gs29, gs28, gs24, pq62, j10, j9, j8, j7, wu12, i2, i3, 1);
                        return;
                    }
                    return;
                }
                gs27 = gs23;
                if ((1572864 & i9) != 0) {
                }
                if ((12582912 & i9) == 0) {
                }
                if ((100663296 & i9) != 0) {
                }
                if ((805306368 & i9) == 0) {
                }
                if (!yt22.V(i11 & 1, (306783379 & i11) == 306783378)) {
                }
                v = yt2.v();
                if (v == null) {
                }
            }
            gs26 = gs22;
            i6 = i10 & 32;
            if (i6 != 0) {
            }
            gs27 = gs23;
            if ((1572864 & i9) != 0) {
            }
            if ((12582912 & i9) == 0) {
            }
            if ((100663296 & i9) != 0) {
            }
            if ((805306368 & i9) == 0) {
            }
            if (!yt22.V(i11 & 1, (306783379 & i11) == 306783378)) {
            }
            v = yt2.v();
            if (v == null) {
            }
        }
        gs25 = gs2;
        i5 = i10 & 16;
        if (i5 == 0) {
        }
        gs26 = gs22;
        i6 = i10 & 32;
        if (i6 != 0) {
        }
        gs27 = gs23;
        if ((1572864 & i9) != 0) {
        }
        if ((12582912 & i9) == 0) {
        }
        if ((100663296 & i9) != 0) {
        }
        if ((805306368 & i9) == 0) {
        }
        if (!yt22.V(i11 & 1, (306783379 & i11) == 306783378)) {
        }
        v = yt2.v();
        if (v == null) {
        }
    }

    public static void b(Throwable th, Throwable th2) {
        boolean z;
        th.getClass();
        th2.getClass();
        if (th != th2) {
            Integer num = th3.a;
            if (num == null || num.intValue() >= 19) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                th.addSuppressed(th2);
                return;
            }
            Method method = jj5.a;
            if (method != null) {
                method.invoke(th, new Object[]{th2});
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0031, code lost:
        if (r10.right <= r12.left) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0038, code lost:
        if (r10.top >= r12.bottom) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003f, code lost:
        if (r10.left >= r12.right) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0026, code lost:
        if (r10.bottom <= r12.top) goto L_0x0041;
     */
    public static boolean c(int i2, Rect rect, Rect rect2, Rect rect3) {
        int i3;
        int i4;
        boolean d2 = d(i2, rect, rect2);
        if (!d(i2, rect, rect3) && d2) {
            if (i2 != 17) {
                if (i2 != 33) {
                    if (i2 != 66) {
                        if (i2 != 130) {
                            h.q("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                            return false;
                        }
                    }
                }
            }
            if (!(i2 == 17 || i2 == 66)) {
                int G = G(i2, rect, rect2);
                if (i2 == 17) {
                    i3 = rect.left;
                    i4 = rect3.left;
                } else if (i2 == 33) {
                    i3 = rect.top;
                    i4 = rect3.top;
                } else if (i2 == 66) {
                    i3 = rect3.right;
                    i4 = rect.right;
                } else if (i2 == 130) {
                    i3 = rect3.bottom;
                    i4 = rect.bottom;
                } else {
                    h.q("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    return false;
                }
                if (G < Math.max(1, i3 - i4)) {
                    return true;
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0033 A[RETURN] */
    public static boolean d(int i2, Rect rect, Rect rect2) {
        if (i2 != 17) {
            if (i2 != 33) {
                if (i2 != 66) {
                    if (i2 != 130) {
                        h.q("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        return false;
                    }
                }
            }
            if (rect2.right < rect.left || rect2.left > rect.right) {
                return false;
            }
            return true;
        }
        if (rect2.bottom >= rect.top && rect2.top <= rect.bottom) {
            return true;
        }
    }

    public static final int e(int i2, int i3) {
        return i2 << (((i3 % 10) * 3) + 1);
    }

    public static synchronized long f(Context context) {
        long j2;
        synchronized (su0.class) {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
            j2 = memoryInfo.totalMem;
        }
        return j2;
    }

    public static final void g(int i2) {
        if (i2 < 1) {
            h.j(hl6.k(i2, "Expected positive parallelism level, but got "));
        }
    }

    public static void h(Closeable closeable, String str) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e2) {
                Log.e("FirebaseCrashlytics", str, e2);
            }
        }
    }

    public static final void i(ql4 ql4, LinkedHashSet linkedHashSet, ji4 ji4, boolean z) {
        for (vj1 vj1 : t75.n(ji4, is1.o, 2)) {
            if (vj1 instanceof ql4) {
                ql4 ql42 = (ql4) vj1;
                if (ql42.H()) {
                    uq4 name = ql42.getName();
                    name.getClass();
                    vq0 e2 = ji4.e(name, oz4.z);
                    if (e2 instanceof ql4) {
                        ql42 = (ql4) e2;
                    } else if (e2 instanceof ut1) {
                        ql42 = ((ut1) e2).f1();
                    } else {
                        ql42 = null;
                    }
                }
                if (ql42 != null) {
                    int i2 = rs1.a;
                    Iterator it = ql42.n().e().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (rs1.n((vw3) it.next(), ql4.a())) {
                                linkedHashSet.add(ql42);
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    if (z) {
                        ji4 Y = ql42.Y();
                        Y.getClass();
                        i(ql4, linkedHashSet, Y, z);
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0055, code lost:
        if (defpackage.gr8.C(r9, r1, r3, r2, r8) == 1.0d) goto L_0x0057;
     */
    public static Bitmap j(Drawable drawable, Bitmap.Config config, uu6 uu6, wf6 wf6, boolean z) {
        BitmapDrawable bitmapDrawable;
        int i2;
        int i3;
        int i4;
        int i5;
        Bitmap bitmap;
        Bitmap bitmap2;
        Bitmap.Config config2;
        int i6;
        int i7;
        if (drawable instanceof BitmapDrawable) {
            Bitmap bitmap3 = ((BitmapDrawable) drawable).getBitmap();
            Bitmap.Config config3 = bitmap3.getConfig();
            if (config == null || kl8.A(config)) {
                config2 = Bitmap.Config.ARGB_8888;
            } else {
                config2 = config;
            }
            if (config3 == config2) {
                if (!z) {
                    int width = bitmap3.getWidth();
                    int height = bitmap3.getHeight();
                    uu6 uu62 = uu6.c;
                    if (sg3.e(uu6, uu62)) {
                        i6 = bitmap3.getWidth();
                    } else {
                        i6 = i.d(uu6.a, wf6);
                    }
                    if (sg3.e(uu6, uu62)) {
                        i7 = bitmap3.getHeight();
                    } else {
                        i7 = i.d(uu6.b, wf6);
                    }
                }
                return bitmap3;
            }
        }
        Drawable mutate = drawable.mutate();
        Bitmap.Config[] configArr = i.a;
        boolean z2 = mutate instanceof BitmapDrawable;
        BitmapDrawable bitmapDrawable2 = null;
        if (z2) {
            bitmapDrawable = (BitmapDrawable) mutate;
        } else {
            bitmapDrawable = null;
        }
        if (bitmapDrawable == null || (bitmap2 = bitmapDrawable.getBitmap()) == null) {
            i2 = mutate.getIntrinsicWidth();
        } else {
            i2 = bitmap2.getWidth();
        }
        int i8 = 512;
        if (i2 <= 0) {
            i2 = 512;
        }
        if (z2) {
            bitmapDrawable2 = (BitmapDrawable) mutate;
        }
        if (bitmapDrawable2 == null || (bitmap = bitmapDrawable2.getBitmap()) == null) {
            i3 = mutate.getIntrinsicHeight();
        } else {
            i3 = bitmap.getHeight();
        }
        if (i3 > 0) {
            i8 = i3;
        }
        uu6 uu63 = uu6.c;
        if (sg3.e(uu6, uu63)) {
            i4 = i2;
        } else {
            i4 = i.d(uu6.a, wf6);
        }
        if (sg3.e(uu6, uu63)) {
            i5 = i8;
        } else {
            i5 = i.d(uu6.b, wf6);
        }
        double C = gr8.C(i2, i8, i4, i5, wf6);
        int B = dh4.B(((double) i2) * C);
        int B2 = dh4.B(C * ((double) i8));
        if (config == null || kl8.A(config)) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap createBitmap = Bitmap.createBitmap(B, B2, config);
        Rect bounds = mutate.getBounds();
        int i9 = bounds.left;
        int i10 = bounds.top;
        int i11 = bounds.right;
        int i12 = bounds.bottom;
        mutate.setBounds(0, 0, B, B2);
        mutate.draw(new Canvas(createBitmap));
        mutate.setBounds(i9, i10, i11, i12);
        return createBitmap;
    }

    public static String k(String str) {
        str.getClass();
        List W0 = d57.W0(str, new String[]{":"}, 2);
        byte[] decode = Base64.decode((String) W0.get(0), 2);
        byte[] decode2 = Base64.decode((String) W0.get(1), 2);
        Cipher instance = Cipher.getInstance("AES/GCM/NoPadding");
        instance.init(2, t(), new GCMParameterSpec(128, decode));
        byte[] doFinal = instance.doFinal(decode2);
        doFinal.getClass();
        return new String(doFinal, mo0.a);
    }

    public static boolean l(File file) {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return false;
            }
            boolean z = true;
            for (File l2 : listFiles) {
                if (!l(l2) || !z) {
                    z = false;
                } else {
                    z = true;
                }
            }
            return z;
        }
        file.delete();
        return true;
    }

    public static final long m(py6 py6, long j2) {
        py6.getClass();
        py6.j(j2);
        long min = Math.min(j2, py6.c().y);
        py6.c().skip(min);
        return min;
    }

    /* JADX WARNING: type inference failed for: r10v5, types: [g98, java.lang.Object] */
    /* JADX WARNING: Failed to insert additional move for type inference */
    public static g98 n(g31 g31, int i2, ArrayList arrayList, g98 g98) {
        int i3;
        int i4;
        if (i2 == 0) {
            i3 = g31.m0;
        } else {
            i3 = g31.n0;
        }
        int i5 = 0;
        if (i3 != -1 && (g98 == null || i3 != g98.b)) {
            int i6 = 0;
            while (true) {
                if (i6 >= arrayList.size()) {
                    break;
                }
                g98 g982 = (g98) arrayList.get(i6);
                if (g982.b == i3) {
                    if (g98 != null) {
                        g98.c(i2, g982);
                        arrayList.remove(g98);
                    }
                    g98 = g982;
                } else {
                    i6++;
                }
            }
        } else if (i3 != -1) {
            return g98;
        }
        if (g98 == null) {
            if (g31 instanceof pz2) {
                pz2 pz2 = (pz2) g31;
                int i7 = 0;
                while (true) {
                    if (i7 >= pz2.q0) {
                        i4 = -1;
                        break;
                    }
                    g31 g312 = pz2.p0[i7];
                    if ((i2 == 0 && (i4 = g312.m0) != -1) || (i2 == 1 && (i4 = g312.n0) != -1)) {
                        break;
                    }
                    i7++;
                }
                if (i4 != -1) {
                    int i8 = 0;
                    while (true) {
                        if (i8 >= arrayList.size()) {
                            break;
                        }
                        g98 g983 = (g98) arrayList.get(i8);
                        if (g983.b == i4) {
                            g98 = g983;
                            break;
                        }
                        i8++;
                    }
                }
            }
            if (g98 == null) {
                ? obj = new Object();
                obj.a = new ArrayList();
                obj.d = null;
                obj.e = -1;
                int i9 = g98.f;
                g98.f = i9 + 1;
                obj.b = i9;
                obj.c = i2;
                g98 = obj;
            }
            arrayList.add(g98);
            g98 = g98;
        }
        ArrayList arrayList2 = g98.a;
        if (arrayList2.contains(g31)) {
            return g98;
        }
        arrayList2.add(g31);
        if (g31 instanceof zx2) {
            zx2 zx2 = (zx2) g31;
            h21 h21 = zx2.s0;
            if (zx2.t0 == 0) {
                i5 = 1;
            }
            h21.c(i5, g98, arrayList);
        }
        int i10 = g98.b;
        if (i2 == 0) {
            g31.m0 = i10;
            g31.H.c(i2, g98, arrayList);
            g31.J.c(i2, g98, arrayList);
        } else {
            g31.n0 = i10;
            g31.I.c(i2, g98, arrayList);
            g31.L.c(i2, g98, arrayList);
            g31.K.c(i2, g98, arrayList);
        }
        g31.O.c(i2, g98, arrayList);
        return g98;
    }

    /* JADX WARNING: type inference failed for: r1v4, types: [java.lang.Object, h06] */
    public static final e81 o(e81 e81, e81 e812, boolean z) {
        Boolean bool = Boolean.FALSE;
        boolean booleanValue = ((Boolean) e81.G(new xw0(25), bool)).booleanValue();
        boolean booleanValue2 = ((Boolean) e812.G(new xw0(25), bool)).booleanValue();
        if (!booleanValue && !booleanValue2) {
            return e81.X(e812);
        }
        ? obj = new Object();
        obj.w = e812;
        i71 i71 = new i71(obj, z);
        x32 x32 = x32.w;
        e81 e813 = (e81) e81.G(i71, x32);
        if (booleanValue2) {
            obj.w = ((e81) obj.w).G(new xw0(26), x32);
        }
        return e813.X((e81) obj.w);
    }

    public static final x83 p() {
        x83 x83 = l;
        if (x83 != null) {
            return x83;
        }
        w83 w83 = new w83("Rounded.Apps", 24.0f, 24.0f, 24.0f, 24.0f, 0, 0, false, 96);
        int i2 = e38.a;
        ky6 ky6 = new ky6(jt0.b);
        be5 be5 = new be5();
        be5.j(4.0f, 8.0f);
        be5.g(4.0f);
        be5.h(8.0f, 4.0f);
        be5.h(4.0f, 4.0f);
        be5.n(4.0f);
        be5.c();
        be5.j(10.0f, 20.0f);
        be5.g(4.0f);
        be5.n(-4.0f);
        be5.g(-4.0f);
        be5.n(4.0f);
        be5.c();
        be5.j(4.0f, 20.0f);
        be5.g(4.0f);
        be5.n(-4.0f);
        be5.h(4.0f, 16.0f);
        be5.n(4.0f);
        be5.c();
        be5.j(4.0f, 14.0f);
        be5.g(4.0f);
        be5.n(-4.0f);
        be5.h(4.0f, 10.0f);
        be5.n(4.0f);
        be5.c();
        be5.j(10.0f, 14.0f);
        be5.g(4.0f);
        be5.n(-4.0f);
        be5.g(-4.0f);
        be5.n(4.0f);
        be5.c();
        be5.j(16.0f, 4.0f);
        be5.n(4.0f);
        be5.g(4.0f);
        be5.h(20.0f, 4.0f);
        be5.g(-4.0f);
        be5.c();
        be5.j(10.0f, 8.0f);
        be5.g(4.0f);
        be5.h(14.0f, 4.0f);
        be5.g(-4.0f);
        be5.n(4.0f);
        be5.c();
        be5.j(16.0f, 14.0f);
        be5.g(4.0f);
        be5.n(-4.0f);
        be5.g(-4.0f);
        be5.n(4.0f);
        be5.c();
        be5.j(16.0f, 20.0f);
        be5.g(4.0f);
        be5.n(-4.0f);
        be5.g(-4.0f);
        be5.n(4.0f);
        be5.c();
        w83.a(w83, be5.a, ky6, 14336);
        x83 b2 = w83.b();
        l = b2;
        return b2;
    }

    public static x83 q() {
        x83 x83 = r;
        if (x83 != null) {
            return x83;
        }
        w83 w83 = new w83("Filled.ArrowDropDown", 24.0f, 24.0f, 24.0f, 24.0f, 0, 0, false, 224);
        int i2 = e38.a;
        ky6 ky6 = new ky6(jt0.b);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new ie5(7.0f, 10.0f));
        arrayList.add(new pe5(5.0f, 5.0f));
        arrayList.add(new pe5(5.0f, -5.0f));
        arrayList.add(ee5.c);
        w83.a(w83, arrayList, ky6, 14336);
        x83 b2 = w83.b();
        r = b2;
        return b2;
    }

    public static qt0 r(yt2 yt2) {
        return ((zg4) yt2.k(ch4.b)).a;
    }

    public static int s() {
        boolean E = E();
        if (F()) {
            E |= true;
        }
        return (Debug.isDebuggerConnected() || Debug.waitingForDebugger()) ? E | true ? 1 : 0 : E ? 1 : 0;
    }

    public static SecretKey t() {
        KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
        instance.load((KeyStore.LoadStoreParameter) null);
        if (instance.containsAlias("nauta_account_key")) {
            KeyStore.Entry entry = instance.getEntry("nauta_account_key", (KeyStore.ProtectionParameter) null);
            entry.getClass();
            SecretKey secretKey = ((KeyStore.SecretKeyEntry) entry).getSecretKey();
            secretKey.getClass();
            return secretKey;
        }
        KeyGenerator instance2 = KeyGenerator.getInstance("AES", "AndroidKeyStore");
        instance2.init(new KeyGenParameterSpec.Builder("nauta_account_key", 3).setBlockModes(new String[]{"GCM"}).setEncryptionPaddings(new String[]{"NoPadding"}).build());
        SecretKey generateKey = instance2.generateKey();
        generateKey.getClass();
        return generateKey;
    }

    public static final long u(py6 py6) {
        py6.getClass();
        return py6.c().y;
    }

    public static int v(Context context, String str, String str2) {
        String str3;
        Resources resources = context.getResources();
        int i2 = context.getApplicationContext().getApplicationInfo().icon;
        if (i2 > 0) {
            try {
                str3 = context.getResources().getResourcePackageName(i2);
                if ("android".equals(str3)) {
                    str3 = context.getPackageName();
                }
            } catch (Resources.NotFoundException unused) {
                str3 = context.getPackageName();
            }
        } else {
            str3 = context.getPackageName();
        }
        return resources.getIdentifier(str, str2, str3);
    }

    public static v16 w(st5 st5, boolean z, boolean z2, Boolean bool, boolean z3, rg4 rg4, rk4 rk4) {
        qt5 qt5;
        sr5 sr5;
        rv3 rv3;
        wo3 wo3;
        co3 co3;
        st5.getClass();
        sy6 sy6 = (sy6) st5.d;
        rk4.getClass();
        sr5 sr52 = sr5.y;
        if (z) {
            if (bool != null) {
                if (st5 instanceof qt5) {
                    qt5 qt52 = (qt5) st5;
                    if (qt52.h == sr52) {
                        return b96.q(rg4, qt52.g.d(uq4.e("DefaultImpls")), rk4);
                    }
                }
                if (bool.booleanValue() && (st5 instanceof rt5)) {
                    if (sy6 instanceof wo3) {
                        wo3 = (wo3) sy6;
                    } else {
                        wo3 = null;
                    }
                    if (wo3 != null) {
                        co3 = wo3.x;
                    } else {
                        co3 = null;
                    }
                    if (co3 != null) {
                        String str = co3.a;
                        if (str != null) {
                            String replace = str.replace('/', '.');
                            replace.getClass();
                            up2 up2 = new up2(replace);
                            up2 b2 = up2.b();
                            uq4 g2 = up2.a.g();
                            up2 up22 = up2.c;
                            vp2 vp2 = dh4.I(g2).a;
                            vp2.c();
                            String r0 = k57.r0(vp2.a, '.', '$');
                            if (!b2.a.c()) {
                                r0 = b2 + '.' + r0;
                            }
                            ji8 l2 = rg4.l(r0);
                            if (l2 != null) {
                                return (v16) l2.x;
                            }
                            return null;
                        }
                        co3.a(10);
                        throw null;
                    }
                }
            } else {
                throw new IllegalStateException(("isConst should not be null for property (container=" + st5 + ')').toString());
            }
        }
        if (z2 && (st5 instanceof qt5)) {
            qt5 qt53 = (qt5) st5;
            if (qt53.h == sr5.B && (qt5 = qt53.f) != null && ((sr5 = qt5.h) == sr5.x || sr5 == sr5.z || (z3 && (sr5 == sr52 || sr5 == sr5.A)))) {
                sy6 sy62 = (sy6) qt5.d;
                if (sy62 instanceof rv3) {
                    rv3 = (rv3) sy62;
                } else {
                    rv3 = null;
                }
                if (rv3 != null) {
                    return rv3.w;
                }
                return null;
            }
        }
        if ((st5 instanceof rt5) && (sy6 instanceof wo3)) {
            wo3 wo32 = (wo3) sy6;
            v16 v16 = wo32.y;
            if (v16 == null) {
                return b96.q(rg4, wo32.a(), rk4);
            }
            return v16;
        }
        return null;
    }

    public static br7 x(yt2 yt2) {
        return ((zg4) yt2.k(ch4.b)).b;
    }

    public static final ArrayList y(eq3 eq3) {
        eq3.getClass();
        List parameters = eq3.getParameters();
        ArrayList arrayList = new ArrayList();
        for (Object next : parameters) {
            if (((t16) next).u() == qr3.z) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public static String z(byte[] bArr) {
        char[] cArr = new char[(bArr.length * 2)];
        for (int i2 = 0; i2 < bArr.length; i2++) {
            byte b2 = bArr[i2];
            int i3 = i2 * 2;
            char[] cArr2 = a;
            cArr[i3] = cArr2[(b2 & 255) >>> 4];
            cArr[i3 + 1] = cArr2[b2 & 15];
        }
        return new String(cArr);
    }
}
