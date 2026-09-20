package defpackage;

import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Path;
import android.net.Uri;
import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import cu.lestebang.utiletecsa.R;
import io.github.jan.supabase.auth.a;
import io.ktor.http.Url;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: j45  reason: default package */
public abstract class j45 {
    public static final /* synthetic */ int a = 0;
    public static x83 b;

    public static rl8 A(rl8 rl8, no7 no7, aq8 aq8, Boolean bool, Boolean bool2) {
        rl8 rl82 = new rl8();
        Iterator x = rl8.x();
        while (x.hasNext()) {
            int intValue = ((Integer) x.next()).intValue();
            if (rl8.B(intValue)) {
                bq8 a2 = aq8.a(no7, Arrays.asList(new bq8[]{rl8.z(intValue), new wn8(Double.valueOf((double) intValue)), rl8}));
                if (a2.f().equals(bool)) {
                    break;
                } else if (bool2 == null || a2.f().equals(bool2)) {
                    rl82.A(intValue, a2);
                }
            }
        }
        return rl82;
    }

    public static final void a(sr2 sr2, ru4 ru4, ml4 ml4, fk7 fk7, yt2 yt2, int i) {
        int i2;
        boolean z;
        ml4 ml42;
        jl4 jl4;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        sr2 sr22 = sr2;
        ru4 ru42 = ru4;
        yt2 yt22 = yt2;
        int i8 = i;
        sr22.getClass();
        yt22.g0(1826507603);
        if ((i8 & 6) == 0) {
            if (yt22.e(R.string.jetpack)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i2 = i7 | i8;
        } else {
            i2 = i8;
        }
        if ((i8 & 48) == 0) {
            if (yt22.e(R.string.save)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i2 |= i6;
        }
        if ((i8 & 384) == 0) {
            if (yt22.i(sr22)) {
                i5 = 256;
            } else {
                i5 = 128;
            }
            i2 |= i5;
        }
        if ((i8 & 3072) == 0) {
            if (yt22.i(ru42)) {
                i4 = 2048;
            } else {
                i4 = 1024;
            }
            i2 |= i4;
        }
        int i9 = i2 | 24576;
        fk7 fk72 = fk7;
        if ((196608 & i8) == 0) {
            if (yt22.g(fk72)) {
                i3 = 131072;
            } else {
                i3 = 65536;
            }
            i9 |= i3;
        }
        if ((74899 & i9) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (yt22.V(i9 & 1, z)) {
            yt22.a0();
            if ((i8 & 1) == 0 || yt22.C()) {
                jl4 = jl4.w;
            } else {
                yt22.Y();
                jl4 = ml4;
            }
            yt22.s();
            vn.c(su0.J(779397903, new of6(17), yt22), jl4, su0.J(-6599987, new ph6(17, ru42), yt22), su0.J(1814260228, new rz5(2, sr22), yt22), 0.0f, (aa8) null, fk72, (la5) null, yt22, ((i9 >> 9) & 112) | 3462 | ((i9 << 3) & 3670016), 432);
            ml42 = jl4;
        } else {
            yt2.Y();
            ml42 = ml4;
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new m13(i8, 7, sr22, ru42, ml42, fk7);
        }
    }

    public static final void b(int i, String str, String str2, String str3, ml4 ml4, fk7 fk7, sr2 sr2, sr2 sr22, fw0 fw0, yt2 yt2, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z;
        ml4 ml42;
        jl4 jl4;
        int i10 = i;
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        sr2 sr23 = sr2;
        sr2 sr24 = sr22;
        yt2 yt22 = yt2;
        yt22.g0(716894615);
        if (yt22.e(i10)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i11 = i2 | i3;
        if (yt22.g(str4)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i12 = i11 | i4;
        if (yt22.g(str5)) {
            i5 = 256;
        } else {
            i5 = 128;
        }
        int i13 = i12 | i5;
        if (yt22.g(str6)) {
            i6 = 2048;
        } else {
            i6 = 1024;
        }
        int i14 = i13 | i6 | 24576;
        fk7 fk72 = fk7;
        if (yt22.g(fk72)) {
            i7 = 131072;
        } else {
            i7 = 65536;
        }
        int i15 = i14 | i7;
        if (yt22.i(sr23)) {
            i8 = 1048576;
        } else {
            i8 = 524288;
        }
        int i16 = i15 | i8;
        if (yt22.i(sr24)) {
            i9 = 8388608;
        } else {
            i9 = 4194304;
        }
        int i17 = i16 | i9;
        if ((38347923 & i17) != 38347922) {
            z = true;
        } else {
            z = false;
        }
        if (yt22.V(i17 & 1, z)) {
            yt22.a0();
            if ((i2 & 1) == 0 || yt22.C()) {
                jl4 = jl4.w;
            } else {
                yt22.Y();
                jl4 = ml4;
            }
            yt22.s();
            fk7 fk73 = fk72;
            vn.a(su0.J(1165047996, new hk7(i10), yt22), jl4, su0.J(-1276409794, new u20(sr23, str6), yt22), su0.J(-946585177, new uo2(fw0, sr24, str4, str5), yt22), 0.0f, (aa8) null, fk73, (la5) null, yt22, 3510 | ((i17 << 3) & 3670016), 432);
            ml42 = jl4;
        } else {
            yt2.Y();
            ml42 = ml4;
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new mg1(i10, str4, str5, str6, ml42, fk7, sr23, sr24, fw0, i2);
        }
    }

    public static final p47 c(pl3 pl3, String str) {
        pl3.getClass();
        str.getClass();
        return new p47(str, pl3.a);
    }

    public static final yr7 d(Url url) {
        url.getClass();
        yr7 yr7 = new yr7();
        yr7.d = url.getProtocolOrNull();
        String host = url.getHost();
        host.getClass();
        yr7.a = host;
        yr7.e(url.getPort());
        t35.B(yr7, url.getEncodedPath());
        yr7.e = url.getEncodedUser();
        yr7.f = url.getEncodedPassword();
        dz2 dz2 = new dz2(1);
        dz2.y0(l(url.getEncodedQuery()));
        yr7.i = dz2;
        yr7.j = new v70((wc5) dz2);
        String encodedFragment = url.getEncodedFragment();
        encodedFragment.getClass();
        yr7.g = encodedFragment;
        yr7.b = url.getTrailingQuery();
        return yr7;
    }

    public static final yr7 e(String str) {
        str.getClass();
        yr7 yr7 = new yr7();
        zr7.b(yr7, str);
        return yr7;
    }

    public static final void f(dz2 dz2, String str, int i, int i2, int i3) {
        if (i2 == -1) {
            int x = x(i, i3, str);
            int w = w(x, i3, str);
            if (w > x) {
                dz2.L(str.substring(x, w), a42.w);
                return;
            }
            return;
        }
        int x2 = x(i, i2, str);
        int w2 = w(x2, i2, str);
        if (w2 > x2) {
            String substring = str.substring(x2, w2);
            int x3 = x(i2 + 1, i3, str);
            dz2.p0(substring, str.substring(x3, w(x3, i3, str)));
        }
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [h61] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
    public static final Object g(yl1 yl1, gm5 gm5, h61 h61) {
        em5 em5;
        int i;
        if (h61 instanceof em5) {
            em5 em52 = (em5) h61;
            int i2 = em52.C;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                em52.C = i2 - Integer.MIN_VALUE;
                em5 = em52;
                Object obj = em5.B;
                i = em5.C;
                if (i != 0) {
                    o85.q(obj);
                    em5.z = yl1;
                    em5.A = gm5;
                    em5.C = 1;
                    obj = h49.q(yl1, mo0.a, em5);
                    p81 p81 = p81.w;
                    if (obj == p81) {
                        return p81;
                    }
                } else if (i == 1) {
                    gm5 = em5.A;
                    yl1 = em5.z;
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return new jm5((String) obj, yl1.a(), gm5);
            }
        }
        em5 = new h61(h61);
        Object obj2 = em5.B;
        i = em5.C;
        if (i != 0) {
        }
        return new jm5((String) obj2, yl1.a(), gm5);
    }

    public static ix6 h() {
        return (ix6) nx6.b.f();
    }

    public static final x83 i() {
        x83 x83 = b;
        if (x83 != null) {
            return x83;
        }
        w83 w83 = new w83("Rounded.Wifi", 24.0f, 24.0f, 24.0f, 24.0f, 0, 0, false, 96);
        int i = e38.a;
        ky6 ky6 = new ky6(jt0.b);
        be5 e = pb4.e(2.06f, 10.06f);
        e.e(0.51f, 0.51f, 1.32f, 0.56f, 1.87f, 0.1f);
        e.e(4.67f, -3.84f, 11.45f, -3.84f, 16.13f, -0.01f);
        e.e(0.56f, 0.46f, 1.38f, 0.42f, 1.89f, -0.09f);
        e.e(0.59f, -0.59f, 0.55f, -1.57f, -0.1f, -2.1f);
        e.e(-5.71f, -4.67f, -13.97f, -4.67f, -19.69f, 0.0f);
        e.e(-0.65f, 0.52f, -0.7f, 1.5f, -0.1f, 2.1f);
        e.c();
        e.j(9.82f, 17.82f);
        e.i(1.47f, 1.47f);
        e.e(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        e.i(1.47f, -1.47f);
        e.e(0.47f, -0.47f, 0.37f, -1.28f, -0.23f, -1.59f);
        e.e(-1.22f, -0.63f, -2.68f, -0.63f, -3.91f, 0.0f);
        e.e(-0.57f, 0.31f, -0.68f, 1.12f, -0.21f, 1.59f);
        e.c();
        e.j(6.09f, 14.09f);
        e.e(0.49f, 0.49f, 1.26f, 0.54f, 1.83f, 0.13f);
        e.e(2.44f, -1.73f, 5.72f, -1.73f, 8.16f, 0.0f);
        e.e(0.57f, 0.4f, 1.34f, 0.36f, 1.83f, -0.13f);
        e.i(0.01f, -0.01f);
        e.e(0.6f, -0.6f, 0.56f, -1.62f, -0.13f, -2.11f);
        e.e(-3.44f, -2.49f, -8.13f, -2.49f, -11.58f, 0.0f);
        e.e(-0.69f, 0.5f, -0.73f, 1.51f, -0.12f, 2.12f);
        e.c();
        w83.a(w83, e.a, ky6, 14336);
        x83 b2 = w83.b();
        b = b2;
        return b2;
    }

    public static ix6 j(ix6 ix6) {
        if (ix6 instanceof ym7) {
            ym7 ym7 = (ym7) ix6;
            if (ym7.t == jb5.f()) {
                ym7.r = null;
                return ix6;
            }
        }
        if (ix6 instanceof zm7) {
            zm7 zm7 = (zm7) ix6;
            if (zm7.i == jb5.f()) {
                zm7.h = null;
                return ix6;
            }
        }
        ix6 g = nx6.g(ix6, (vr2) null, false);
        g.j();
        return g;
    }

    public static Object k(mq1 mq1, sr2 sr2) {
        ix6 ix6;
        ix6 j;
        yp4 yp4;
        ix6 ix62 = (ix6) nx6.b.f();
        if (ix62 instanceof ym7) {
            ym7 ym7 = (ym7) ix62;
            if (ym7.t == jb5.f()) {
                vr2 vr2 = ym7.r;
                vr2 vr22 = ym7.s;
                try {
                    ((ym7) ix62).r = nx6.k(mq1, vr2, true);
                    ((ym7) ix62).s = vr22;
                    Object b2 = sr2.b();
                    ym7.r = vr2;
                    ym7.s = vr22;
                    return b2;
                } catch (Throwable th) {
                    Throwable th2 = th;
                    ym7.r = vr2;
                    ym7.s = vr22;
                    throw th2;
                }
            }
        }
        if (ix62 == null || (ix62 instanceof yp4)) {
            ix6 ix63 = ix62;
            if (ix63 instanceof yp4) {
                yp4 = (yp4) ix63;
            } else {
                yp4 = null;
            }
            ix6 = new ym7(yp4, mq1, (vr2) null, true, false);
        } else {
            ix6 = ix62.u(mq1);
        }
        try {
            j = ix6.j();
            Object b3 = sr2.b();
            ix6.q(j);
            ix6.c();
            return b3;
        } catch (Throwable th3) {
            Throwable th4 = th3;
            ix6.c();
            throw th4;
        }
    }

    /* JADX WARNING: type inference failed for: r11v1, types: [b57, uc5] */
    public static uc5 l(String str) {
        int i;
        str.getClass();
        if (str.length() - 1 < 0) {
            uc5.b.getClass();
            return tc5.b;
        }
        tc5 tc5 = uc5.b;
        dz2 dz2 = new dz2(1);
        int length = str.length() - 1;
        int i2 = 0;
        int i3 = -1;
        if (length >= 0) {
            int i4 = 0;
            i = 0;
            int i5 = -1;
            while (true) {
                if (i2 == 1000) {
                    break;
                }
                char charAt = str.charAt(i4);
                if (charAt == '&') {
                    f(dz2, str, i, i5, i4);
                    i = i4 + 1;
                    i2++;
                    i5 = -1;
                } else if (charAt == '=' && i5 == -1) {
                    i5 = i4;
                }
                if (i4 == length) {
                    i3 = i5;
                    break;
                }
                i4++;
            }
            Map map = (Map) dz2.w;
            map.getClass();
            return new b57(map, true);
        }
        i = 0;
        if (i2 != 1000) {
            f(dz2, str, i, i3, str.length());
        }
        Map map2 = (Map) dz2.w;
        map2.getClass();
        return new b57(map2, true);
    }

    public static void m(ix6 ix6, ix6 ix62, vr2 vr2) {
        if (ix6 != ix62) {
            ix62.getClass();
            ix6.q(ix6);
            ix62.c();
        } else if (ix6 instanceof ym7) {
            ((ym7) ix6).r = vr2;
        } else if (ix6 instanceof zm7) {
            ((zm7) ix6).h = vr2;
        } else {
            ta1.l("Non-transparent snapshot was reused: ", ix6);
        }
    }

    public static final Object n(gs2 gs2) {
        Thread.interrupted();
        return ar7.U(x32.w, new tc1(gs2, (f61) null, 15));
    }

    public static final ml4 o(ml4 ml4) {
        return ck6.a(ml4, false, new nf6(13));
    }

    public static void p(PendingIntent pendingIntent) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            try {
                ActivityOptions makeBasic = ActivityOptions.makeBasic();
                if (i >= 36) {
                    makeBasic.setPendingIntentBackgroundActivityStartMode(4);
                } else {
                    makeBasic.setPendingIntentBackgroundActivityStartMode(1);
                }
                pendingIntent.send(makeBasic.toBundle());
            } catch (PendingIntent.CanceledException e) {
                Log.e("TextClassification", "error sending pendingIntent: " + pendingIntent + " error: " + e);
            }
        } else {
            pendingIntent.send();
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [ri7, java.lang.Object] */
    public static final wc3 q(InputStream inputStream) {
        inputStream.getClass();
        return new wc3(inputStream, new Object());
    }

    public static final qd5 r(Integer num, Integer num2, Integer num3, bt btVar, String str, boolean z) {
        int i;
        int i2;
        int i3;
        a42 a42;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 1;
        }
        int i4 = i + (z ? 1 : 0);
        if (num2 != null) {
            i2 = num2.intValue();
            if (z) {
                i2++;
            }
        } else {
            i2 = Integer.MAX_VALUE;
        }
        if (num3 != null) {
            i3 = num3.intValue();
        } else {
            i3 = 0;
        }
        int min = Math.min(i2, i3);
        if (i4 >= min) {
            return s(z, btVar, str, i4, i2);
        }
        qd5 s = s(z, btVar, str, i4, i4);
        while (true) {
            a42 = a42.w;
            if (i4 >= min) {
                break;
            }
            i4++;
            s = new qd5(a42, sg3.E(s(z, btVar, str, i4, i4), t35.l(sg3.E(new qd5(sg3.D(new ih5(" ")), a42), s))));
        }
        if (i3 > i2) {
            return t35.l(sg3.E(new qd5(sg3.D(new ih5(k57.q0(i3 - i2, " "))), a42), s));
        }
        if (i3 == i2) {
            return s;
        }
        return new qd5(a42, sg3.E(s(z, btVar, str, i3 + 1, i2), s));
    }

    public static final qd5 s(boolean z, bt btVar, String str, int i, int i2) {
        if (i2 >= (z ? 1 : 0) + true) {
            n74 m = sg3.m();
            if (z) {
                m.add(new ih5("-"));
            }
            m.add(new z15(sg3.D(new wt7(Integer.valueOf(i - z), Integer.valueOf(i2 - z), btVar, str, z))));
            return new qd5(sg3.i(m), a42.w);
        }
        h.s("Check failed.");
        return null;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [h61] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    public static final Object t(uu uuVar, String str, s71 s71, f61 f61) {
        o18 o18;
        int i;
        me6 me6;
        j77 j77;
        oa2 oa2;
        if (f61 instanceof o18) {
            o18 o182 = (o18) f61;
            int i2 = o182.C;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                o182.C = i2 - Integer.MIN_VALUE;
                o18 = o182;
                Object obj = o18.B;
                i = o18.C;
                Object obj2 = vs7.a;
                Object obj3 = p81.w;
                if (i != 0) {
                    o85.q(obj);
                    me6 me62 = ((a) uuVar).c.A;
                    j77 = ((a) uuVar).b;
                    o18.z = me62;
                    o18.A = j77;
                    o18.C = 1;
                    Object H = s71.H(str, o18);
                    if (H != obj3) {
                        me6 me63 = me62;
                        obj = H;
                        me6 = me63;
                    }
                    return obj3;
                } else if (i == 1) {
                    j77 = o18.A;
                    me6 = o18.z;
                    o85.q(obj);
                } else if (i == 2) {
                    o85.q(obj);
                    return obj2;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o18.z = null;
                o18.A = null;
                o18.C = 2;
                me6.getClass();
                Uri parse = Uri.parse((String) obj);
                parse.getClass();
                oa2 = ((a) rg3.t(j77)).c.C;
                oa2.getClass();
                if (!oa2.equals(oa2.b)) {
                    Intent intent = new Intent("android.intent.action.VIEW", parse);
                    intent.setFlags(268435456);
                    Context context = b35.c;
                    if (context != null) {
                        context.startActivity(intent);
                        if (obj2 == obj3) {
                            return obj3;
                        }
                        return obj2;
                    }
                    h.s("Application context not initialized");
                    return null;
                }
                h.c();
                return null;
            }
        }
        o18 = new h61(f61);
        Object obj4 = o18.B;
        i = o18.C;
        Object obj22 = vs7.a;
        Object obj32 = p81.w;
        if (i != 0) {
        }
        o18.z = null;
        o18.A = null;
        o18.C = 2;
        me6.getClass();
        Uri parse2 = Uri.parse((String) obj4);
        parse2.getClass();
        oa2 = ((a) rg3.t(j77)).c.C;
        oa2.getClass();
        if (!oa2.equals(oa2.b)) {
        }
    }

    public static final void u(yr7 yr7, yr7 yr72) {
        yr7.getClass();
        yr72.getClass();
        yr7.d = yr72.d;
        String str = yr72.a;
        str.getClass();
        yr7.a = str;
        yr7.e(yr72.c);
        List list = yr72.h;
        list.getClass();
        yr7.h = list;
        yr7.e = yr72.e;
        yr7.f = yr72.f;
        dz2 dz2 = new dz2(1);
        o55.b(dz2, yr72.i);
        yr7.i = dz2;
        yr7.j = new v70((wc5) dz2);
        String str2 = yr72.g;
        str2.getClass();
        yr7.g = str2;
        yr7.b = yr72.b;
    }

    public static eh v(km4 km4, float f, eh ehVar) {
        boolean z;
        eh ehVar2 = ehVar;
        km4.getClass();
        n74 m = sg3.m();
        ArrayList arrayList = km4.a;
        int size = arrayList.size();
        qc1 qc1 = null;
        int i = 0;
        qc1 qc12 = null;
        while (i < size) {
            float[] fArr = new float[8];
            for (int i2 = 0; i2 < 8; i2++) {
                fArr[i2] = j18.c(((qc1) ((yb5) arrayList.get(i)).w).a[i2], ((qc1) ((yb5) arrayList.get(i)).x).a[i2], f);
            }
            float f2 = f;
            qc1 qc13 = new qc1(fArr);
            if (qc12 == null) {
                qc12 = qc13;
            }
            if (qc1 != null) {
                m.add(qc1);
            }
            i++;
            qc1 = qc13;
        }
        if (!(qc1 == null || qc12 == null)) {
            float[] fArr2 = qc1.a;
            float f3 = fArr2[0];
            float f4 = fArr2[1];
            float f5 = fArr2[2];
            float f6 = fArr2[3];
            float f7 = fArr2[4];
            float f8 = fArr2[5];
            float[] fArr3 = qc12.a;
            m.add(h03.b(f3, f4, f5, f6, f7, f8, fArr3[0], fArr3[1]));
        }
        n74 i3 = sg3.i(m);
        ehVar2.h();
        Path path = ehVar2.a;
        int f9 = i3.f();
        boolean z2 = true;
        int i4 = 0;
        while (i4 < f9) {
            qc1 qc14 = (qc1) i3.get(i4);
            if (z2) {
                float[] fArr4 = qc14.a;
                path.moveTo(fArr4[0], fArr4[1]);
                z = false;
            } else {
                z = z2;
            }
            float[] fArr5 = qc14.a;
            float[] fArr6 = fArr5;
            qc1 qc15 = qc14;
            path.cubicTo(fArr5[2], fArr5[3], fArr6[4], fArr6[5], qc15.a(), qc15.b());
            i4++;
            z2 = z;
        }
        path.close();
        return ehVar2;
    }

    public static final int w(int i, int i2, String str) {
        while (i2 > i && rd3.C(str.charAt(i2 - 1))) {
            i2--;
        }
        return i2;
    }

    public static final int x(int i, int i2, String str) {
        while (i < i2 && rd3.C(str.charAt(i))) {
            i++;
        }
        return i;
    }

    public static File y(Context context) {
        File filesDir = context.getFilesDir();
        if (filesDir != null) {
            return filesDir;
        }
        SystemClock.sleep(100);
        File filesDir2 = context.getFilesDir();
        if (filesDir2 != null) {
            return filesDir2;
        }
        h.s("getFilesDir returned null twice.");
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0099 A[RETURN] */
    public static bq8 z(rl8 rl8, no7 no7, ArrayList arrayList, boolean z) {
        bq8 bq8;
        int i;
        int i2;
        ya5.y("reduce", 1, arrayList);
        ya5.z("reduce", 2, arrayList);
        bq8 r = ((k68) no7.y).r(no7, (bq8) arrayList.get(0));
        if (r instanceof ro8) {
            if (arrayList.size() == 2) {
                bq8 = ((k68) no7.y).r(no7, (bq8) arrayList.get(1));
                if (bq8 instanceof cn8) {
                    h.q("Failed to parse initial value");
                    return null;
                }
            } else if (rl8.y() != 0) {
                bq8 = null;
            } else {
                h.s("Empty array with no initial value error");
                return null;
            }
            ro8 ro8 = (ro8) r;
            int y = rl8.y();
            if (z) {
                i = 0;
            } else {
                i = y - 1;
            }
            int i3 = -1;
            if (z) {
                i2 = y - 1;
            } else {
                i2 = 0;
            }
            if (true == z) {
                i3 = 1;
            }
            if (bq8 == null) {
                bq8 = rl8.z(i);
                i += i3;
            }
            if ((i2 - i) * i3 < 0) {
                return bq8;
            }
            if (rl8.B(i)) {
                bq8 = ro8.a(no7, Arrays.asList(new bq8[]{bq8, rl8.z(i), new wn8(Double.valueOf((double) i)), rl8}));
                if (bq8 instanceof cn8) {
                    h.s("Reduce operation failed");
                    return null;
                }
            }
            i += i3;
            if ((i2 - i) * i3 < 0) {
            }
            return bq8;
        }
        h.q("Callback should be a method");
        return null;
    }
}
