package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Paint;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Build;
import android.os.Trace;
import android.provider.ContactsContract;
import android.text.InputFilter;
import android.util.Log;
import android.view.KeyEvent;
import io.github.jan.supabase.auth.a;
import io.github.jan.supabase.auth.user.UserInfo;
import io.github.jan.supabase.auth.user.UserSession;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* renamed from: dh4  reason: default package */
public abstract class dh4 {
    public static final cc2[] A;
    public static x83 B;
    public static final /* synthetic */ int C = 0;
    public static x83 D;
    public static final /* synthetic */ int E = 0;
    public static final rt a = new Object();
    public static final fw0 b = new fw0(-376295828, new tw0(3), false);
    public static final fw0 c = new fw0(1141066840, new tw0(4), false);
    public static final fw0 d = new fw0(1060322758, new tw0(5), false);
    public static final fw0 e = new fw0(673906607, new tw0(6), false);
    public static final fw0 f = new fw0(782730146, new tw0(7), false);
    public static final fw0 g = new fw0(-1029678227, new tw0(8), false);
    public static final fw0 h = new fw0(1990625442, new sw0(5), false);
    public static final fw0 i = new fw0(-447399447, new sw0(6), false);
    public static final fw0 j = new fw0(-1077495243, new sw0(7), false);
    public static final fw0 k = new fw0(1533631124, new sw0(8), false);
    public static final fw0 l = new fw0(-1302508721, new sw0(9), false);
    public static final fw0 m = new fw0(-1253207794, new tw0(9), false);
    public static final fw0 n = new fw0(1964486173, new tw0(10), false);
    public static final fw0 o = new fw0(1743838825, new sw0(10), false);
    public static final fw0 p = new fw0(-44030997, new sw0(11), false);
    public static final fw0 q = new fw0(-2079842768, new tw0(11), false);
    public static final fw0 r = new fw0(-612029679, new sw0(12), false);
    public static final fw0 s = new fw0(1895067795, new sw0(13), false);
    public static final fw0 t = new fw0(-140743976, new tw0(12), false);
    public static final a91 u = new a91(12);
    public static final cf4 v = new cf4((Object) null, (Object) null, (Object) null, 2);
    public static cf4 w;
    public static final zr3[] x = new zr3[0];
    public static final StackTraceElement[] y = new StackTraceElement[0];
    public static final cc2 z;

    /* JADX WARNING: type inference failed for: r0v0, types: [rt, java.lang.Object] */
    static {
        cc2 cc2 = new cc2("register", -1, 1, true);
        z = cc2;
        A = new cc2[]{cc2, new cc2("unregister", -1, 1, true)};
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [h61] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a0 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00a1 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00a2 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0020  */
    public static final Object A(j77 j77, boolean z2, h61 h61) {
        g4 g4Var;
        int i2;
        String str;
        boolean z3;
        String str2;
        String str3;
        String str4;
        if (h61 instanceof g4) {
            g4 g4Var2 = (g4) h61;
            int i3 = g4Var2.E;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                g4Var2.E = i3 - Integer.MIN_VALUE;
                g4Var = g4Var2;
                Object obj = g4Var.D;
                i2 = g4Var.E;
                String str5 = null;
                if (i2 != 0) {
                    o85.q(obj);
                    if (z2) {
                        ((m77) j77).getClass();
                        str4 = "sb_publishable_oATzKs8xbTBq2ESlgAQr0g_rl5XnZF9";
                    } else {
                        str4 = null;
                    }
                    ((m77) j77).getClass();
                    String str6 = str4;
                    z3 = z2;
                    str = str6;
                    str2 = null;
                } else if (i2 == 1) {
                    boolean z4 = g4Var.C;
                    String str7 = g4Var.A;
                    j77 j772 = g4Var.z;
                    o85.q(obj);
                    boolean z5 = z4;
                    str = str7;
                    j77 = j772;
                    str2 = (String) obj;
                    z3 = z5;
                } else if (i2 == 2) {
                    String str8 = g4Var.B;
                    str = g4Var.A;
                    o85.q(obj);
                    str5 = str8;
                    if (str5 != null) {
                        return str;
                    }
                    return str5;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                if (str2 == null) {
                    return str2;
                }
                be1 be1 = ((m77) j77).i;
                tu tuVar = uu.a;
                LinkedHashMap linkedHashMap = be1.a;
                tuVar.getClass();
                Object obj2 = linkedHashMap.get(tu.x);
                if (!(obj2 instanceof uu)) {
                    obj2 = null;
                }
                uu uuVar = (uu) obj2;
                if (uuVar != null) {
                    UserSession i4 = uuVar.i();
                    if (i4 != null) {
                        str3 = i4.getAccessToken();
                    } else {
                        str3 = null;
                    }
                    if (str3 != null) {
                        g4Var.z = null;
                        g4Var.A = str;
                        g4Var.B = str3;
                        g4Var.C = z3;
                        g4Var.E = 2;
                        Object e2 = e(j77, str3, g4Var);
                        p81 p81 = p81.w;
                        if (e2 == p81) {
                            return p81;
                        }
                        str5 = str3;
                    }
                }
                if (str5 != null) {
                }
            }
        }
        g4Var = new h61(h61);
        Object obj3 = g4Var.D;
        i2 = g4Var.E;
        String str52 = null;
        if (i2 != 0) {
        }
        if (str2 == null) {
        }
    }

    public static int B(double d2) {
        if (Double.isNaN(d2)) {
            h.q("Cannot round NaN value.");
            return 0;
        } else if (d2 > 2.147483647E9d) {
            return Integer.MAX_VALUE;
        } else {
            if (d2 < -2.147483648E9d) {
                return Integer.MIN_VALUE;
            }
            return (int) Math.round(d2);
        }
    }

    public static int C(float f2) {
        if (!Float.isNaN(f2)) {
            return Math.round(f2);
        }
        h.q("Cannot round NaN value.");
        return 0;
    }

    public static long D(double d2) {
        if (!Double.isNaN(d2)) {
            return Math.round(d2);
        }
        h.q("Cannot round NaN value.");
        return 0;
    }

    public static final ag3 G(ll6 ll6) {
        String s0 = k57.s0(ll6.a(), "?", "");
        if (sg3.e(ll6.u(), ql6.l)) {
            if (ll6.c()) {
                return ag3.Q;
            }
            return ag3.P;
        } else if (s0.equals("kotlin.Int")) {
            if (ll6.c()) {
                return ag3.x;
            }
            return ag3.w;
        } else if (s0.equals("kotlin.Boolean")) {
            if (ll6.c()) {
                return ag3.z;
            }
            return ag3.y;
        } else if (s0.equals("kotlin.Double")) {
            if (ll6.c()) {
                return ag3.B;
            }
            return ag3.A;
        } else if (s0.equals("kotlin.Float")) {
            if (ll6.c()) {
                return ag3.D;
            }
            return ag3.C;
        } else if (s0.equals("kotlin.Long")) {
            if (ll6.c()) {
                return ag3.F;
            }
            return ag3.E;
        } else if (s0.equals("kotlin.String")) {
            if (ll6.c()) {
                return ag3.H;
            }
            return ag3.G;
        } else if (s0.equals("kotlin.IntArray")) {
            return ag3.I;
        } else {
            if (s0.equals("kotlin.DoubleArray")) {
                return ag3.K;
            }
            if (s0.equals("kotlin.BooleanArray")) {
                return ag3.J;
            }
            if (s0.equals("kotlin.FloatArray")) {
                return ag3.L;
            }
            if (s0.equals("kotlin.LongArray")) {
                return ag3.M;
            }
            if (s0.equals("kotlin.Array")) {
                return ag3.N;
            }
            if (k57.u0(s0, "kotlin.collections.ArrayList", false)) {
                return ag3.O;
            }
            return ag3.R;
        }
    }

    public static String H(long j2) {
        if (m(j2, 12884901888L)) {
            return "Rgb";
        }
        if (m(j2, 12884901889L)) {
            return "Xyz";
        }
        if (m(j2, 12884901890L)) {
            return "Lab";
        }
        if (m(j2, 17179869187L)) {
            return "Cmyk";
        }
        return "Unknown";
    }

    public static up2 I(uq4 uq4) {
        uq4.getClass();
        String b2 = uq4.b();
        b2.getClass();
        return new up2(new vp2(b2, up2.c.a, uq4));
    }

    public static void J(String str) {
        String h2 = f21.h("If you wish to display this ", str, ", use androidx.compose.foundation.Image.");
        throw new IllegalArgumentException("Unsupported type: " + str + ". " + h2);
    }

    public static final void K(s83 s83) {
        Object obj = s83.b;
        if (obj instanceof r83) {
            h.q("Unsupported type: ImageRequest.Builder. Did you forget to call ImageRequest.Builder.build()?");
        } else if (obj instanceof hg) {
            J("ImageBitmap");
            throw null;
        } else if (obj instanceof x83) {
            J("ImageVector");
            throw null;
        } else if (obj instanceof vb5) {
            J("Painter");
            throw null;
        } else if (s83.c != null) {
            h.q("request.target must be null.");
        }
    }

    public static final void a(ml4 ml4, jb jbVar, boolean z2, fw0 fw0, yt2 yt2, int i2) {
        int i3;
        boolean z3;
        int i4;
        int i5;
        int i6;
        int i7;
        yt2.g0(380139498);
        if ((i2 & 6) == 0) {
            if (yt2.g(ml4)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i3 = i7 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (yt2.g(jbVar)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i3 |= i6;
        }
        if ((i2 & 384) == 0) {
            if (yt2.h(z2)) {
                i5 = 256;
            } else {
                i5 = 128;
            }
            i3 |= i5;
        }
        if ((i2 & 3072) == 0) {
            if (yt2.i(fw0)) {
                i4 = 2048;
            } else {
                i4 = 1024;
            }
            i3 |= i4;
        }
        boolean z4 = true;
        if ((i3 & 1171) != 1170) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (yt2.V(i3 & 1, z3)) {
            lh4 d2 = mb0.d(jbVar, z2);
            if ((i3 & 7168) != 2048) {
                z4 = false;
            }
            boolean g2 = yt2.g(d2) | z4;
            Object Q = yt2.Q();
            if (g2 || Q == ay0.a) {
                Q = new p13(6, (Object) d2, (Object) fw0);
                yt2.o0(Q);
            }
            m67.a(ml4, (gs2) Q, yt2, i3 & 14, 0);
        } else {
            yt2.Y();
        }
        yx5 v2 = yt2.v();
        if (v2 != null) {
            v2.d = new rb0(ml4, jbVar, z2, fw0, i2);
        }
    }

    public static final kb9 b() {
        return new kb9(new Paint(7));
    }

    public static final void c(h24 h24, Object obj, int i2, Object obj2, yt2 yt2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z2;
        yt2.g0(1439843069);
        if (yt2.g(h24)) {
            i4 = 4;
        } else {
            i4 = 2;
        }
        int i8 = i4 | i3;
        if (yt2.g(obj)) {
            i5 = 32;
        } else {
            i5 = 16;
        }
        int i9 = i8 | i5;
        if (yt2.e(i2)) {
            i6 = 256;
        } else {
            i6 = 128;
        }
        int i10 = i9 | i6;
        if (yt2.g(obj2)) {
            i7 = 2048;
        } else {
            i7 = 1024;
        }
        int i11 = i10 | i7;
        if ((i11 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (yt2.V(i11 & 1, z2)) {
            ((oe6) obj).b(obj2, su0.J(980966366, new dj7((Object) h24, i2, obj2, 9), yt2), yt2, 48);
        } else {
            yt2.Y();
        }
        yx5 v2 = yt2.v();
        if (v2 != null) {
            v2.d = new bi(h24, obj, i2, obj2, i3);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0022  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0026 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0027  */
    public static final int d(int i2, int i3, int i4, boolean z2) {
        if (i3 < i4) {
            if (z2) {
                if (z2) {
                    if (!z2) {
                    }
                } else if (!z2) {
                }
                if (z2) {
                }
                return i2;
            } else if (z2 ? i4 - i3 > i2 : i3 <= i2) {
                if (z2) {
                    return i2 - i3;
                }
                return i2;
            } else if (!z2) {
                return 0;
            } else {
                return i4 - i3;
            }
            if (!z2) {
                return i2 - i3;
            }
            return i2;
        } else if (z2) {
            return 0;
        } else {
            return i4 - i3;
        }
    }

    /* JADX WARNING: type inference failed for: r1v11, types: [h61] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0168  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    public static final Object e(j77 j77, String str, h61 h61) {
        f4 f4Var;
        int i2;
        uu uuVar;
        ms3 ms3;
        ub4 ub4;
        String str2;
        boolean z2;
        a aVar;
        vs7 vs7;
        String str3;
        String str4;
        h61 h612 = h61;
        if (h612 instanceof f4) {
            f4 f4Var2 = (f4) h612;
            int i3 = f4Var2.B;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                f4Var2.B = i3 - Integer.MIN_VALUE;
                f4Var = f4Var2;
                Object obj = f4Var.A;
                i2 = f4Var.B;
                vs7 vs72 = vs7.a;
                if (i2 != 0) {
                    o85.q(obj);
                    be1 be1 = ((m77) j77).i;
                    tu tuVar = uu.a;
                    LinkedHashMap linkedHashMap = be1.a;
                    tuVar.getClass();
                    Object obj2 = linkedHashMap.get(tu.x);
                    if (!(obj2 instanceof uu)) {
                        obj2 = null;
                    }
                    uu uuVar2 = (uu) obj2;
                    if (uuVar2 != null) {
                        UserSession i4 = uuVar2.i();
                        qd3 c2 = td3.a.c();
                        if (i4 != null) {
                            str2 = i4.getAccessToken();
                        } else {
                            str2 = null;
                        }
                        boolean z3 = false;
                        if (!sg3.e(str, str2) || i4.getExpiresAt().compareTo(c2) >= 0) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        a aVar2 = (a) uuVar2;
                        boolean z4 = aVar2.c.v;
                        if (z2 && z4) {
                            h27 h27 = aVar2.n;
                            if (h27 != null && h27.l()) {
                                z3 = true;
                            }
                            cf4 cf4 = aVar2.d;
                            ms3 ms32 = (ms3) cf4.z;
                            String str5 = (String) cf4.y;
                            ub4 ub42 = ub4.z;
                            if (ms32.a(ub42)) {
                                StringBuilder sb = new StringBuilder("\n                Authenticated request attempted with expired access token. This should not happen. Please report this issue. Trying to refresh session before...\n                Auto refresh running: ");
                                sb.append(z3);
                                sb.append("\n                Auto-refresher information: ");
                                sb.append(aVar2.o);
                                sb.append("\n                OS: ");
                                sb.append((m25) m25.a.getValue());
                                sb.append("\n                Session: ");
                                List list = q47.a;
                                i4.getClass();
                                String a2 = q47.a(i4.getAccessToken());
                                String a3 = q47.a(i4.getRefreshToken());
                                String providerRefreshToken = i4.getProviderRefreshToken();
                                if (providerRefreshToken != null) {
                                    str3 = q47.a(providerRefreshToken);
                                } else {
                                    str3 = null;
                                }
                                String providerToken = i4.getProviderToken();
                                if (providerToken != null) {
                                    str4 = q47.a(providerToken);
                                } else {
                                    str4 = null;
                                }
                                vs7 = vs72;
                                StringBuilder sb2 = sb;
                                aVar = aVar2;
                                sb2.append(UserSession.copy$default(i4, a2, a3, str3, str4, 0, (String) null, (UserInfo) null, (String) null, (qd3) null, 496, (Object) null));
                                sb2.append("\n            ");
                                ms32.b(ub42, str5, (Throwable) null, e57.f0(sb2.toString()));
                            } else {
                                vs7 = vs72;
                                aVar = aVar2;
                            }
                            try {
                                f4Var.z = uuVar2;
                                f4Var.B = 1;
                                Object s2 = aVar.s(f4Var);
                                p81 p81 = p81.w;
                                if (s2 == p81) {
                                    return p81;
                                }
                                return vs7;
                            } catch (Exception e2) {
                                e = e2;
                                uuVar = uuVar2;
                                cf4 cf42 = ((a) uuVar).d;
                                ms3 = (ms3) cf42.z;
                                String str6 = (String) cf42.y;
                                ub4 = ub4.w;
                                if (ms3.a(ub4)) {
                                    ms3.b(ub4, str6, e, "Failed to force-refresh session before making a request with an expired access token");
                                }
                                throw new Exception("The token has expired and a force-refresh was unsuccessful");
                            }
                        }
                    }
                    return vs72;
                } else if (i2 == 1) {
                    uuVar = f4Var.z;
                    try {
                        o85.q(obj);
                        return vs72;
                    } catch (Exception e3) {
                        e = e3;
                        cf4 cf422 = ((a) uuVar).d;
                        ms3 = (ms3) cf422.z;
                        String str62 = (String) cf422.y;
                        ub4 = ub4.w;
                        if (ms3.a(ub4)) {
                        }
                        throw new Exception("The token has expired and a force-refresh was unsuccessful");
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            }
        }
        f4Var = new h61(h612);
        Object obj3 = f4Var.A;
        i2 = f4Var.B;
        vs7 vs722 = vs7.a;
        if (i2 != 0) {
        }
    }

    public static final void f(ab6 ab6, Throwable th) {
        boolean isTerminated;
        if (ab6 == null) {
            return;
        }
        if (th != null) {
            try {
                b81.w(ab6);
            } catch (Throwable th2) {
                su0.b(th, th2);
            }
        } else if (ab6 instanceof AutoCloseable) {
            ab6.close();
        } else if (ab6 instanceof ExecutorService) {
            ExecutorService executorService = (ExecutorService) ab6;
            if (executorService != ForkJoinPool.commonPool() && !(isTerminated = executorService.isTerminated())) {
                executorService.shutdown();
                boolean z2 = false;
                while (!isTerminated) {
                    try {
                        isTerminated = executorService.awaitTermination(1, TimeUnit.DAYS);
                    } catch (InterruptedException unused) {
                        if (!z2) {
                            executorService.shutdownNow();
                            z2 = true;
                        }
                    }
                }
                if (z2) {
                    Thread.currentThread().interrupt();
                }
            }
        } else if (ab6 instanceof TypedArray) {
            ((TypedArray) ab6).recycle();
        } else if (ab6 instanceof MediaMetadataRetriever) {
            ((MediaMetadataRetriever) ab6).release();
        } else if (ab6 instanceof MediaDrm) {
            ((MediaDrm) ab6).release();
        } else {
            ku4.v();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a2, code lost:
        if ((r5 instanceof defpackage.fr5) == false) goto L_0x00a4;
     */
    public static String g(xs2 xs2, int i2) {
        boolean z2;
        String str;
        iw0 iw0 = iw0.A;
        boolean z3 = false;
        if ((i2 & 1) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((i2 & 2) != 0) {
            z3 = true;
        }
        xs2.getClass();
        StringBuilder sb = new StringBuilder();
        if (z3) {
            if (xs2 instanceof s31) {
                str = "<init>";
            } else {
                str = ((wj1) xs2).getName().b();
                str.getClass();
            }
            sb.append(str);
        }
        sb.append("(");
        qz3 b0 = xs2.b0();
        if (b0 != null) {
            vw3 b2 = b0.b();
            b2.getClass();
            sb.append((wp3) ed1.u(b2, op7.i, iw0));
        }
        for (h28 b3 : xs2.S()) {
            vw3 b4 = b3.b();
            b4.getClass();
            sb.append((wp3) ed1.u(b4, op7.i, iw0));
        }
        sb.append(")");
        if (z2) {
            if (!(xs2 instanceof s31)) {
                vw3 k2 = xs2.k();
                k2.getClass();
                uq4 uq4 = fv3.e;
                if (fv3.E(k2, m27.d)) {
                    vw3 k3 = xs2.k();
                    k3.getClass();
                    if (!iq7.e(k3)) {
                    }
                }
                vw3 k4 = xs2.k();
                k4.getClass();
                sb.append((wp3) ed1.u(k4, op7.i, iw0));
            }
            sb.append("V");
        }
        return sb.toString();
    }

    public static final String h(pi0 pi0) {
        ql4 ql4;
        au6 au6;
        String str;
        pi0.getClass();
        if (!rs1.m(pi0)) {
            vj1 r2 = pi0.r();
            if (r2 instanceof ql4) {
                ql4 = (ql4) r2;
            } else {
                ql4 = null;
            }
            if (ql4 != null && !ql4.getName().x) {
                pi0 a2 = pi0.a();
                if (a2 instanceof au6) {
                    au6 = (au6) a2;
                } else {
                    au6 = null;
                }
                if (au6 != null) {
                    String g2 = g(au6, 3);
                    String str2 = tj3.a;
                    gq0 h2 = tj3.h(ts1.g(ql4).a);
                    if (h2 != null) {
                        str = co3.c(h2);
                    } else {
                        str = ed1.j(ql4, hz2.N);
                    }
                    return str + '.' + g2;
                }
            }
        }
        return null;
    }

    public static void i(String str, String str2, Object obj) {
        String r2 = r(str);
        if (Log.isLoggable(r2, 3)) {
            Log.d(r2, String.format(str2, new Object[]{obj}));
        }
    }

    public static Object j(List list, od1 od1, uq3 uq3) {
        ns8 ns8 = new ns8(14);
        for (Object k2 : list) {
            k(k2, od1, ns8, uq3);
        }
        return uq3.K();
    }

    public static void k(Object obj, od1 od1, ns8 ns8, uq3 uq3) {
        if (obj == null) {
            Object[] objArr = new Object[3];
            switch (22) {
                case 1:
                case 5:
                case 8:
                case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                case h75.g /*15*/:
                case 18:
                case 21:
                case 23:
                    objArr[0] = "neighbors";
                    break;
                case 2:
                case 12:
                case 16:
                case 19:
                case 24:
                    objArr[0] = "visited";
                    break;
                case 3:
                case 6:
                case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                case 25:
                    objArr[0] = "handler";
                    break;
                case 9:
                    objArr[0] = "predicate";
                    break;
                case 10:
                case 14:
                    objArr[0] = "node";
                    break;
                case 22:
                    objArr[0] = "current";
                    break;
                default:
                    objArr[0] = "nodes";
                    break;
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/DFS";
            switch (22) {
                case 7:
                case 8:
                case 9:
                    objArr[2] = "ifAny";
                    break;
                case 10:
                case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                case 12:
                case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                case 14:
                case h75.g /*15*/:
                case 16:
                    objArr[2] = "dfsFromNode";
                    break;
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                    objArr[2] = "topologicalOrder";
                    break;
                case 22:
                case 23:
                case 24:
                case 25:
                    objArr[2] = "doDfs";
                    break;
                default:
                    objArr[2] = "dfs";
                    break;
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        } else if (((HashSet) ns8.x).add(obj) && uq3.j(obj)) {
            for (Object k2 : od1.n(obj)) {
                k(k2, od1, ns8, uq3);
            }
            uq3.h(obj);
        }
    }

    public static void l(String str, String str2, Exception exc) {
        String r2 = r(str);
        if (Log.isLoggable(r2, 6)) {
            Log.e(r2, str2, exc);
        }
    }

    public static final boolean m(long j2, long j3) {
        if (j2 == j3) {
            return true;
        }
        return false;
    }

    public static final ml4 n(ml4 ml4, boolean z2, ap4 ap4) {
        ml4 ml42;
        if (z2) {
            ml42 = new wk2(ap4);
        } else {
            ml42 = jl4.w;
        }
        return ml4.d(ml42);
    }

    public static final x83 o() {
        x83 x83 = B;
        if (x83 != null) {
            return x83;
        }
        w83 w83 = new w83("Rounded.ChatBubbleOutline", 24.0f, 24.0f, 24.0f, 24.0f, 0, 0, false, 96);
        int i2 = e38.a;
        ky6 ky6 = new ky6(jt0.b);
        be5 be5 = new be5();
        be5.j(20.0f, 4.0f);
        be5.n(12.0f);
        be5.f(5.17f);
        be5.h(4.0f, 17.17f);
        be5.m(4.0f);
        be5.f(20.0f);
        be5.j(20.0f, 2.0f);
        be5.f(4.0f);
        be5.d(2.9f, 2.0f, 2.0f, 2.9f, 2.0f, 4.0f);
        be5.n(15.59f);
        be5.e(0.0f, 0.89f, 1.08f, 1.34f, 1.71f, 0.71f);
        be5.h(6.0f, 18.0f);
        be5.g(14.0f);
        be5.e(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        be5.m(4.0f);
        be5.d(22.0f, 2.9f, 21.1f, 2.0f, 20.0f, 2.0f);
        be5.h(20.0f, 2.0f);
        be5.c();
        w83.a(w83, be5.a, ky6, 14336);
        x83 b2 = w83.b();
        B = b2;
        return b2;
    }

    public static final Paint q(kb9 kb9) {
        if (kb9 == null) {
            String l2 = b26.a.b(kb9.getClass()).l();
            xb3.a("Extracting native reference is only supported from androidx.compose.ui.graphics.AndroidPaint instances but received " + l2);
        }
        return (Paint) kb9.y;
    }

    public static String r(String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            return "TRuntime.".concat(str);
        }
        String concat = "TRuntime.".concat(str);
        if (concat.length() > 23) {
            return concat.substring(0, 23);
        }
        return concat;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [boolean[], java.io.Serializable] */
    public static Boolean s(List list, od1 od1, vr2 vr2) {
        return (Boolean) j(list, od1, new nd1(vr2, new boolean[1], 0));
    }

    public static final boolean t(String str) {
        if (str.length() == 10 && k57.u0(str, "53", false)) {
            str = str.substring(2);
        }
        if (str.length() != 8 || k57.u0(str, "5", false)) {
            return false;
        }
        return true;
    }

    public static final boolean u(Context context, String str) {
        Object obj;
        Throwable th;
        context.getClass();
        boolean z2 = false;
        if (d57.I0(str)) {
            return false;
        }
        try {
            Cursor query = context.getContentResolver().query(Uri.withAppendedPath(ContactsContract.PhoneLookup.CONTENT_FILTER_URI, Uri.encode(str)), new String[]{"_id"}, (String) null, (String[]) null, (String) null);
            if (query != null) {
                try {
                    if (query.getCount() > 0) {
                        z2 = true;
                    }
                    query.close();
                } catch (Throwable th2) {
                    ed1.i(query, th);
                    throw th2;
                }
            }
            obj = Boolean.valueOf(z2);
        } catch (Throwable th3) {
            obj = new m66(th3);
        }
        Object obj2 = Boolean.FALSE;
        if (obj instanceof m66) {
            obj = obj2;
        }
        return ((Boolean) obj).booleanValue();
    }

    public static final boolean v(KeyEvent keyEvent) {
        if (!keyEvent.isShiftPressed() || rd3.A(keyEvent) != 2) {
            return false;
        }
        long f2 = uq3.f(keyEvent.getKeyCode());
        int i2 = os3.O;
        if (os3.a(f2, os3.p)) {
            return true;
        }
        return false;
    }

    public static final boolean w(KeyEvent keyEvent) {
        if (keyEvent.isShiftPressed() || rd3.A(keyEvent) != 2) {
            return false;
        }
        long f2 = uq3.f(keyEvent.getKeyCode());
        int i2 = os3.O;
        if (os3.a(f2, os3.p)) {
            return true;
        }
        return false;
    }

    public static long x(yt2 yt2) {
        return jt0.b(0.55f, ((zg4) yt2.k(ch4.b)).a.s);
    }

    public static long y() {
        if (d18.b()) {
            return jt0.c;
        }
        return uq3.d(4279381056L);
    }

    /* JADX INFO: finally extract failed */
    public static final qt z(s83 s83, jx5 jx5, vr2 vr2, vr2 vr22, j51 j51, yt2 yt2, int i2) {
        yt2.f0(1645646697);
        yt2.f0(952940650);
        Trace.beginSection("rememberAsyncImagePainter");
        try {
            s83 a2 = k18.a(s83, yt2);
            K(a2);
            yt2.f0(1094691773);
            Object Q = yt2.Q();
            if (Q == ay0.a) {
                Q = new qt(a2, jx5);
                yt2.o0(Q);
            }
            qt qtVar = (qt) Q;
            yt2.r(false);
            qtVar.H = vr2;
            qtVar.I = vr22;
            qtVar.J = j51;
            qtVar.K = 1;
            qtVar.L = ((Boolean) yt2.k(kd3.a)).booleanValue();
            qtVar.O.setValue(jx5);
            qtVar.N.setValue(a2);
            qtVar.c();
            yt2.r(false);
            Trace.endSection();
            yt2.r(false);
            return qtVar;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public abstract void E(boolean z2);

    public abstract void F(boolean z2);

    public abstract InputFilter[] p(InputFilter[] inputFilterArr);
}
