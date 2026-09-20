package defpackage;

import android.os.Bundle;
import android.os.Looper;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import cu.lestebang.utiletecsa.R;
import java.io.Reader;
import java.io.StringWriter;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: w95  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class w95 {
    public static final /* synthetic */ int a = 0;
    public static final /* synthetic */ int b = 0;
    public static x83 c;
    public static x83 d;
    public static x83 e;

    public static final void a(String str, long j, long j2, am2 am2, ea7 ea7, yt2 yt2, int i) {
        int i2;
        int i3;
        boolean z;
        yt2 yt22 = yt2;
        yt22.g0(-595031406);
        if (yt22.g(str)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i | i2;
        ea7 ea72 = ea7;
        if (yt22.g(ea72)) {
            i3 = 16384;
        } else {
            i3 = 8192;
        }
        int i5 = i4 | i3;
        if ((i5 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (yt22.V(i5 & 1, z)) {
            lh4 d2 = mb0.d(xb4.C, false);
            int hashCode = Long.hashCode(yt22.T);
            vf5 m = yt22.m();
            ml4 E = gw8.E(yt22, jl4.w);
            ux0.d.getClass();
            vy0 vy0 = tx0.b;
            yt22.i0();
            if (yt22.S) {
                yt22.l(vy0);
            } else {
                yt22.r0();
            }
            g75.Q(tx0.f, yt22, d2);
            g75.Q(tx0.e, yt22, m);
            g75.Q(tx0.g, yt22, Integer.valueOf(hashCode));
            g75.O(yt22, tx0.h);
            g75.Q(tx0.d, yt22, E);
            int i6 = i5 & 14;
            int i7 = (i5 << 9) & 29360128;
            long j3 = j2;
            am2 am22 = am2;
            yt2 yt23 = yt22;
            yf7.b(str, (ml4) null, jt0.b, j3, am22, ea72, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, new tg7(0, 0, (am2) null, 0, new l57(1.0f, 0.0f, 0, 1, 22), 0, 0, (dk5) null, (m64) null, 16760831), yt23, i6 | 1597824 | i7, 0, 130858);
            yt2 yt24 = yt2;
            yf7.b(str, (ml4) null, j, j3, am22, ea7, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt24, i6 | 1597824 | i7, 0, 261930);
            yt22 = yt24;
            yt22.r(true);
        } else {
            yt22.Y();
        }
        yx5 v = yt22.v();
        if (v != null) {
            v.d = new s03(str, j, j2, am2, ea7, i, 3);
        }
    }

    public static final void b(long j, long j2, long j3, sr2 sr2, gs2 gs2, sr2 sr22, yt2 yt2, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        ck ckVar;
        String str;
        boolean z5;
        String format;
        long j4 = j3;
        sr2 sr23 = sr2;
        gs2 gs22 = gs2;
        sr2 sr24 = sr22;
        yt2 yt22 = yt2;
        yt22.g0(-11078113);
        if (yt22.f(j)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i8 = i | i2;
        if (yt22.f(j2)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i9 = i8 | i3;
        if (yt22.f(j4)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i10 = i9 | i4;
        if (yt22.i(sr23)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i11 = i10 | i5;
        if (yt22.i(gs22)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i12 = i11 | i6;
        if (yt22.i(sr24)) {
            i7 = 131072;
        } else {
            i7 = 65536;
        }
        int i13 = i12 | i7;
        if ((74899 & i13) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (yt22.V(i13 & 1, z)) {
            o96 a2 = q96.a(6.0f);
            jl4 jl4 = jl4.w;
            jl4 jl42 = jl4;
            ml4 h = b96.h(we.f(jl4, a2), jt0.b(0.3f, uq3.d(4060086272L)), gr8.h);
            if ((i13 & 7168) == 2048) {
                z2 = true;
            } else {
                z2 = false;
            }
            if ((57344 & i13) == 16384) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean z6 = z2 | z3;
            if ((i13 & 458752) == 131072) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean z7 = z4 | z6;
            Object Q = yt22.Q();
            if (z7 || Q == ay0.a) {
                Q = new wz6(sr23, gs22, sr24);
                yt22.o0(Q);
            }
            ml4 L = x91.L(d97.a(h, vs7.a, (PointerInputEventHandler) Q), 4.0f, 2.0f);
            au0 a3 = zt0.a(wr.c, xb4.K, yt22, 0);
            int hashCode = Long.hashCode(yt22.T);
            vf5 m = yt22.m();
            ml4 E = gw8.E(yt22, L);
            ux0.d.getClass();
            vy0 vy0 = tx0.b;
            yt22.i0();
            if (yt22.S) {
                yt22.l(vy0);
            } else {
                yt22.r0();
            }
            ck ckVar2 = tx0.f;
            g75.Q(ckVar2, yt22, a3);
            ck ckVar3 = tx0.e;
            g75.Q(ckVar3, yt22, m);
            Integer valueOf = Integer.valueOf(hashCode);
            ck ckVar4 = tx0.g;
            g75.Q(ckVar4, yt22, valueOf);
            ce ceVar = tx0.h;
            g75.O(yt22, ceVar);
            ck ckVar5 = tx0.d;
            g75.Q(ckVar5, yt22, E);
            h80 h80 = xb4.I;
            rr rrVar = wr.a;
            ea6 a4 = ca6.a(rrVar, h80, yt22, 48);
            int hashCode2 = Long.hashCode(yt22.T);
            vf5 m2 = yt22.m();
            jl4 jl43 = jl42;
            ml4 E2 = gw8.E(yt22, jl43);
            yt22.i0();
            if (yt22.S) {
                yt22.l(vy0);
            } else {
                yt22.r0();
            }
            g75.Q(ckVar2, yt22, a4);
            g75.Q(ckVar3, yt22, m2);
            f21.s(hashCode2, yt22, ckVar4, yt22, ceVar);
            g75.Q(ckVar5, yt22, E2);
            x83 x83 = ed1.N;
            ce ceVar2 = ceVar;
            if (x83 != null) {
                ckVar = ckVar3;
            } else {
                w83 w83 = new w83("Rounded.ArrowDownward", 24.0f, 24.0f, 24.0f, 24.0f, 0, 0, false, 96);
                int i14 = e38.a;
                ckVar = ckVar3;
                ky6 ky6 = new ky6(jt0.b);
                be5 be5 = new be5();
                be5.j(11.0f, 5.0f);
                be5.n(11.17f);
                be5.i(-4.88f, -4.88f);
                be5 be52 = be5;
                be52.e(-0.39f, -0.39f, -1.03f, -0.39f, -1.42f, 0.0f);
                be52.e(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
                be5 be53 = be52;
                be53.i(6.59f, 6.59f);
                be52.e(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
                be53.i(6.59f, -6.59f);
                be52.e(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
                be52.e(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
                be53.h(13.0f, 16.17f);
                be53.m(5.0f);
                be52.e(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
                be53.l(-1.0f, 0.45f, -1.0f, 1.0f);
                be53.c();
                w83.a(w83, be53.a, ky6, 14336);
                x83 = w83.b();
                ed1.N = x83;
            }
            x83 x832 = x83;
            long d2 = uq3.d(4285522059L);
            ck ckVar6 = ckVar4;
            ml4 l = yu6.l(jl43, 11.0f);
            ce ceVar3 = ceVar2;
            jl4 jl44 = jl43;
            ck ckVar7 = ckVar;
            long j5 = d2;
            vy0 vy02 = vy0;
            ck ckVar8 = ckVar2;
            d83.a(x832, (String) null, l, j5, yt22, 3504, 0);
            String e2 = e(j);
            long j6 = jt0.c;
            long k = ya5.k(11);
            am2 am2 = am2.B;
            fv2 fv2 = ea7.c;
            yt2 yt23 = yt2;
            a(e2, j6, k, am2, fv2, yt23, 3504);
            long j7 = j6;
            am2 am22 = am2;
            fv2 fv22 = fv2;
            yt2 yt24 = yt23;
            yt24.r(true);
            ea6 a5 = ca6.a(rrVar, h80, yt24, 48);
            int hashCode3 = Long.hashCode(yt24.T);
            vf5 m3 = yt24.m();
            ml4 E3 = gw8.E(yt24, jl44);
            yt24.i0();
            if (yt24.S) {
                yt24.l(vy02);
            } else {
                yt24.r0();
            }
            g75.Q(ckVar8, yt24, a5);
            g75.Q(ckVar7, yt24, m3);
            f21.s(hashCode3, yt24, ckVar6, yt24, ceVar3);
            g75.Q(ckVar5, yt24, E3);
            x83 x833 = fd1.k;
            if (x833 == null) {
                w83 w832 = new w83("Rounded.ArrowUpward", 24.0f, 24.0f, 24.0f, 24.0f, 0, 0, false, 96);
                int i15 = e38.a;
                ky6 ky62 = new ky6(jt0.b);
                be5 be54 = new be5();
                be54.j(13.0f, 19.0f);
                be54.m(7.83f);
                be54.i(4.88f, 4.88f);
                be5 be55 = be54;
                be55.e(0.39f, 0.39f, 1.03f, 0.39f, 1.42f, 0.0f);
                be55.e(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
                be5 be56 = be55;
                be56.i(-6.59f, -6.59f);
                be55.e(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
                be56.i(-6.6f, 6.58f);
                be55.e(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
                be55.e(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
                be56.h(11.0f, 7.83f);
                be56.m(19.0f);
                be55.e(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
                be56.l(1.0f, -0.45f, 1.0f, -1.0f);
                be56.c();
                w83.a(w832, be56.a, ky62, 14336);
                x833 = w832.b();
                fd1.k = x833;
            }
            d83.a(x833, (String) null, yu6.l(jl44, 11.0f), uq3.d(4285511648L), yt24, 3504, 0);
            am2 am23 = am22;
            yt2 yt25 = yt2;
            long j8 = j7;
            a(e(j2), j8, ya5.k(11), am23, fv22, yt25, 3504);
            am2 am24 = am23;
            yt2 yt26 = yt25;
            yt26.r(true);
            ea6 a6 = ca6.a(rrVar, h80, yt26, 48);
            int hashCode4 = Long.hashCode(yt26.T);
            vf5 m4 = yt26.m();
            ml4 E4 = gw8.E(yt26, jl44);
            yt26.i0();
            if (yt26.S) {
                yt26.l(vy02);
            } else {
                yt26.r0();
            }
            g75.Q(ckVar8, yt26, a6);
            g75.Q(ckVar7, yt26, m4);
            f21.s(hashCode4, yt26, ckVar6, yt26, ceVar3);
            g75.Q(ckVar5, yt26, E4);
            long j9 = j8;
            d83.a(aa5.h(), (String) null, yu6.l(jl44, 11.0f), j9, yt26, 3504, 0);
            long j10 = j9;
            if (j3 >= 1073741824) {
                j4 = j3;
                str = String.format("%.2f GB", Arrays.copyOf(new Object[]{Double.valueOf(((double) j4) / 1.073741824E9d)}, 1));
                z5 = true;
            } else {
                j4 = j3;
                if (j4 >= 1048576) {
                    z5 = true;
                    format = String.format("%.2f MB", Arrays.copyOf(new Object[]{Double.valueOf(((double) j4) / 1048576.0d)}, 1));
                } else {
                    z5 = true;
                    format = String.format("%.0f KB", Arrays.copyOf(new Object[]{Double.valueOf(((double) j4) / 1024.0d)}, 1));
                }
                str = format;
            }
            yt2 yt27 = yt2;
            a(str, j10, ya5.k(10), am24, fv22, yt27, 3504);
            yt22 = yt27;
            yt22.r(z5);
            yt22.r(z5);
        } else {
            yt22.Y();
        }
        yx5 v = yt22.v();
        if (v != null) {
            v.d = new uz6(j, j2, j4, sr2, gs2, sr22, i);
        }
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [h61] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0020  */
    public static final Object c(op5 op5, sr2 sr2, h61 h61) {
        mp5 mp5;
        int i;
        if (h61 instanceof mp5) {
            mp5 mp52 = (mp5) h61;
            int i2 = mp52.B;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mp52.B = i2 - Integer.MIN_VALUE;
                mp5 = mp52;
                Object obj = mp5.A;
                i = mp5.B;
                if (i != 0) {
                    o85.q(obj);
                    e81 e81 = mp5.x;
                    e81.getClass();
                    if (e81.a0(me6.E) == op5) {
                        mp5.z = sr2;
                        mp5.B = 1;
                        kk0 kk0 = new kk0(1, rc9.a0(mp5));
                        kk0.v();
                        op5.B.B(new b0(28, kk0));
                        Object t = kk0.t();
                        p81 p81 = p81.w;
                        if (t == p81) {
                            return p81;
                        }
                    } else {
                        h.s("awaitClose() can only be invoked from the producer context");
                        return null;
                    }
                } else if (i == 1) {
                    sr2 = mp5.z;
                    try {
                        o85.q(obj);
                    } catch (Throwable th) {
                        sr2.b();
                        throw th;
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                sr2.b();
                return vs7.a;
            }
        }
        mp5 = new h61(h61);
        Object obj2 = mp5.A;
        i = mp5.B;
        if (i != 0) {
        }
        sr2.b();
        return vs7.a;
    }

    public static final c2 d(as3 as3, as3 as32, boolean z) {
        vw3 vw3;
        as3.getClass();
        as32.getClass();
        if (oa7.a) {
            vw3 vw32 = ((ds1) as3).x;
            vw32.getClass();
            fu6 fu6 = (fu6) vw32;
            vw3 vw33 = ((ds1) as32).x;
            vw33.getClass();
            fu6 fu62 = (fu6) vw33;
            if (z) {
                vw3 = new zg2(fu6, fu62);
                xw3.a.b(fu6, fu62);
            } else {
                vw3 = kl8.n(fu6, fu62);
            }
            return new ds1(vw3, (sr2) null, false);
        }
        c2 c2Var = (c2) as3;
        c2 c2Var2 = (c2) as32;
        if (c2Var.equals(c2Var2)) {
            return c2Var;
        }
        return new yg2(c2Var, c2Var2, z, (sr2) null);
    }

    public static final String e(long j) {
        if (j >= 1048576) {
            return String.format("%.2f MB/s", Arrays.copyOf(new Object[]{Double.valueOf(((double) j) / 1048576.0d)}, 1));
        }
        return String.format("%.0f KB/s", Arrays.copyOf(new Object[]{Double.valueOf(((double) j) / 1024.0d)}, 1));
    }

    public static final String f(String str) {
        str.getClass();
        dg0 dg0 = dg0.z;
        dg0 c2 = td0.E(k57.l0(str)).c("SHA-256");
        m50.f.getClass();
        m50 m50 = m50.h;
        byte[] bArr = c2.w;
        return k57.s0(m50.a(m50, Arrays.copyOf(bArr, bArr.length)), "=", "");
    }

    public static final if6 g(View view) {
        if6 if6;
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_saved_state_registry_owner);
            if (tag instanceof if6) {
                if6 = (if6) tag;
            } else {
                if6 = null;
            }
            if (if6 != null) {
                return if6;
            }
            ViewParent k = z85.k(view);
            if (k instanceof View) {
                view = (View) k;
            } else {
                view = null;
            }
        }
        return null;
    }

    public static final x83 h() {
        x83 x83 = d;
        if (x83 != null) {
            return x83;
        }
        w83 w83 = new w83("Rounded.SwapHoriz", 24.0f, 24.0f, 24.0f, 24.0f, 0, 0, false, 96);
        int i = e38.a;
        ky6 ky6 = new ky6(jt0.b);
        be5 f = pb4.f(6.14f, 11.86f, -2.78f, 2.79f);
        f.e(-0.19f, 0.2f, -0.19f, 0.51f, 0.0f, 0.71f);
        f.i(2.78f, 2.79f);
        f.e(0.31f, 0.32f, 0.85f, 0.09f, 0.85f, -0.35f);
        f.h(6.99f, 16.0f);
        f.h(13.0f, 16.0f);
        f.e(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        f.l(-0.45f, -1.0f, -1.0f, -1.0f);
        f.h(6.99f, 14.0f);
        f.n(-1.79f);
        f.e(0.0f, -0.45f, -0.54f, -0.67f, -0.85f, -0.35f);
        f.c();
        f.j(20.65f, 8.65f);
        f.i(-2.78f, -2.79f);
        f.e(-0.31f, -0.32f, -0.85f, -0.09f, -0.85f, 0.35f);
        f.h(17.02f, 8.0f);
        f.h(11.0f, 8.0f);
        f.e(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        f.l(0.45f, 1.0f, 1.0f, 1.0f);
        f.g(6.01f);
        f.n(1.79f);
        f.e(0.0f, 0.45f, 0.54f, 0.67f, 0.85f, 0.35f);
        f.i(2.78f, -2.79f);
        f.e(0.2f, -0.19f, 0.2f, -0.51f, 0.01f, -0.7f);
        f.c();
        w83.a(w83, f.a, ky6, 14336);
        x83 b2 = w83.b();
        d = b2;
        return b2;
    }

    public static final void i(Bundle bundle, String str, List list) {
        ArrayList arrayList;
        if (list instanceof ArrayList) {
            arrayList = (ArrayList) list;
        } else {
            arrayList = new ArrayList(list);
        }
        bundle.putStringArrayList(str, arrayList);
    }

    public static final String j(Reader reader) {
        StringWriter stringWriter = new StringWriter();
        char[] cArr = new char[8192];
        int read = reader.read(cArr);
        while (read >= 0) {
            stringWriter.write(cArr, 0, read);
            read = reader.read(cArr);
        }
        String stringWriter2 = stringWriter.toString();
        stringWriter2.getClass();
        return stringWriter2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x00c8  */
    public static final zr3 k(z53 z53, as3 as3, boolean z) {
        zr3 zr3;
        zr3 zr32;
        zk5 zk5;
        Object obj;
        gq3 E = uq3.E(as3);
        boolean v = as3.v();
        List<gs3> I = as3.I();
        ArrayList arrayList = new ArrayList(et0.e0(I, 10));
        for (gs3 gs3 : I) {
            gs3.getClass();
            as3 as32 = gs3.b;
            if (as32 != null) {
                arrayList.add(as32);
            } else {
                rf2.j("Star projections in type arguments are not allowed, but had ", as32);
                return null;
            }
        }
        if (arrayList.isEmpty()) {
            if (kl8.u(E).isInterface()) {
                z53.f(z53, E);
            }
            ul6 ul6 = vl6.a;
            if (!v) {
                zr3 = vl6.a.a(E);
                if (zr3 == null) {
                    zr3 = null;
                }
            } else {
                zr3 = vl6.b.a(E);
            }
        } else {
            z53.getClass();
            ul6 ul62 = vl6.a;
            if (!v) {
                obj = vl6.c.x(E, arrayList);
            } else {
                obj = vl6.d.x(E, arrayList);
            }
            if (obj instanceof m66) {
                obj = null;
            }
            zr3 = (zr3) obj;
        }
        if (zr3 != null) {
            return zr3;
        }
        if (arrayList.isEmpty()) {
            zr32 = i95.F(E);
            if (zr32 == null) {
                z53.f(z53, E);
                if (kl8.u(E).isInterface()) {
                    zk5 = new zk5(E);
                }
                zr32 = null;
            }
            if (zr32 != null) {
                if (v) {
                    return hj8.x(zr32);
                }
                return zr32;
            }
            return null;
        }
        ArrayList G = i95.G(z53, arrayList, z);
        if (G != null) {
            zr32 = i95.z(E, G, new hx4(23, arrayList));
            if (zr32 == null) {
                if (kl8.u(E).isInterface()) {
                    zk5 = new zk5(E);
                }
                zr32 = null;
            }
            if (zr32 != null) {
            }
        }
        return null;
        zr32 = zk5;
        if (zr32 != null) {
        }
        return null;
    }

    public static void l() {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            h.s("Must be called from the main thread.");
        }
    }

    public static int m(int i, int i2) {
        RoundingMode roundingMode = RoundingMode.CEILING;
        roundingMode.getClass();
        if (i2 != 0) {
            int i3 = i / i2;
            int i4 = i - (i2 * i3);
            if (i4 == 0) {
                return i3;
            }
            int i5 = ((i ^ i2) >> 31) | 1;
            switch (sy8.a[roundingMode.ordinal()]) {
                case 1:
                    throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
                case 2:
                    return i3;
                case 3:
                    if (i5 >= 0) {
                        return i3;
                    }
                    break;
                case 4:
                    break;
                case 5:
                    if (i5 <= 0) {
                        return i3;
                    }
                    break;
                case 6:
                case 7:
                case 8:
                    int abs = Math.abs(i4);
                    int abs2 = abs - (Math.abs(i2) - abs);
                    if (abs2 == 0) {
                        RoundingMode roundingMode2 = RoundingMode.HALF_UP;
                        RoundingMode roundingMode3 = RoundingMode.HALF_EVEN;
                        return i3;
                    } else if (abs2 <= 0) {
                        return i3;
                    }
                    break;
                default:
                    throw new AssertionError();
            }
            return i3 + i5;
        }
        throw new ArithmeticException("/ by zero");
    }
}
