package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import cu.lestebang.utiletecsa.R;
import io.ktor.utils.io.charsets.MalformedInputException;
import java.io.EOFException;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlinx.datetime.LocalDateTime;
import kotlinx.datetime.UtcOffset;

/* renamed from: rc9  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class rc9 {
    public static final Object[] a = new Object[0];
    public static final fw0 b = new fw0(1944576026, new ww0(19), false);
    public static final fw0 c = new fw0(-496881764, new ww0(20), false);
    public static final fw0 d = new fw0(1367622369, new xw0(14), false);
    public static final fw0 e = new fw0(1150259948, new xw0(15), false);
    public static final fw0 f = new fw0(-1903077985, new xw0(16), false);
    public static final fw0 g = new fw0(-1577355935, new ww0(21), false);
    public static final fw0 h = new fw0(2132839711, new ww0(22), false);
    public static final fw0 i = new fw0(-2146546694, new xw0(17), false);
    public static final fw0 j = new fw0(-924852407, new xw0(10), false);
    public static final fw0 k = new fw0(-458811022, new xw0(11), false);
    public static final fw0 l = new fw0(1251839825, new xw0(12), false);
    public static final fw0 m = new fw0(-1332476624, new xw0(13), false);
    public static final g93 n = new g93(false);
    public static final boolean[] o = new boolean[3];
    public static final ha7 p = new ha7(15);
    public static x83 q;
    public static x83 r;
    public static x83 s;
    public static x83 t;
    public static x83 u;

    /* JADX WARNING: type inference failed for: r1v15, types: [h61] */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0095, code lost:
        if (r1.d(r6, r13) == r8) goto L_0x0104;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00cb, code lost:
        if (r2.c(r1) != r8) goto L_0x0050;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x007d A[Catch:{ all -> 0x0099 }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    public static final Object A(hf0 hf0, fg0 fg0, long j2, h61 h61) {
        if0 if0;
        int i2;
        Object obj;
        Throwable th;
        hf0 hf02;
        long j3;
        long j4;
        fg0 fg02;
        if0 if02;
        long j5;
        long j6;
        if0 if03;
        hf0 hf03;
        h61 h612 = h61;
        if (h612 instanceof if0) {
            if0 if04 = (if0) h612;
            int i3 = if04.F;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                if04.F = i3 - Integer.MIN_VALUE;
                if0 = if04;
                Object obj2 = if0.E;
                i2 = if0.F;
                int i4 = 1;
                obj = p81.w;
                if (i2 != 0) {
                    o85.q(obj2);
                    fg02 = fg0;
                    j4 = j2;
                    j3 = j4;
                    if03 = if0;
                    hf03 = hf0;
                    if (hf03.h() || j4 <= 0) {
                        if03.z = null;
                        if03.A = null;
                        if03.C = j3;
                        if03.D = j4;
                        if03.F = 3;
                        if (fg02.c(if03) != obj) {
                            j6 = j4;
                            j5 = j3;
                            return new Long(j5 - j6);
                        }
                        return obj;
                    }
                    if (hf03.g().x()) {
                        if03.z = hf03;
                        if03.A = fg02;
                        if03.C = j3;
                        if03.D = j4;
                        if03.F = i4;
                    }
                    if0 if05 = if03;
                    hf02 = hf03;
                    if02 = if05;
                    long min = Math.min(j4, su0.u(hf02.g()));
                    hf02.g().l(fg02.e(), min);
                    j4 -= min;
                    if02.z = hf02;
                    if02.A = fg02;
                    if02.C = j3;
                    if02.D = j4;
                    if02.F = 2;
                } else if (i2 == 1) {
                    j4 = if0.D;
                    j3 = if0.C;
                    fg02 = if0.A;
                    hf02 = if0.z;
                    if02 = if0;
                    o85.q(obj2);
                    if02 = if0;
                    if02 = if0;
                    long min2 = Math.min(j4, su0.u(hf02.g()));
                    hf02.g().l(fg02.e(), min2);
                    j4 -= min2;
                    if02.z = hf02;
                    if02.A = fg02;
                    if02.C = j3;
                    if02.D = j4;
                    if02.F = 2;
                } else if (i2 == 2) {
                    j4 = if0.D;
                    j3 = if0.C;
                    fg02 = if0.A;
                    hf02 = if0.z;
                    try {
                        if02 = if0;
                        o85.q(obj2);
                        if02 = if0;
                        if02 = if0;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } else if (i2 == 3) {
                    j6 = if0.D;
                    j5 = if0.C;
                    o85.q(obj2);
                    return new Long(j5 - j6);
                } else if (i2 != 4) {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                } else {
                    th = if0.B;
                    o85.q(obj2);
                    throw th;
                }
                hf0 hf04 = hf02;
                if03 = if02;
                hf03 = hf04;
                i4 = 1;
                if (hf03.h() || j4 <= 0) {
                }
            }
        }
        if0 = new h61(h612);
        Object obj22 = if0.E;
        i2 = if0.F;
        int i42 = 1;
        obj = p81.w;
        if (i2 != 0) {
        }
        try {
            hf0 hf042 = hf02;
            if03 = if02;
            hf03 = hf042;
            if (hf03.h() || j4 <= 0) {
            }
        } catch (Throwable th3) {
            th = th3;
            if0 if06 = if03;
            hf02 = hf03;
            if02 = if06;
            try {
                hf02.a(th);
                gr8.z(fg02, th);
                throw th;
            } catch (Throwable th4) {
                if02.z = null;
                if02.A = null;
                if02.B = th4;
                if02.C = j3;
                if02.D = j4;
                if02.F = 4;
                if (fg02.c(if02) != obj) {
                    th = th4;
                }
            }
        }
        i42 = 1;
    }

    public static e81 A0(c81 c81, d81 d81) {
        d81.getClass();
        if (sg3.e(c81.getKey(), d81)) {
            return x32.w;
        }
        return c81;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Object, h49] */
    /* JADX WARNING: type inference failed for: r1v2, types: [java.lang.Object, h49] */
    /* JADX WARNING: type inference failed for: r1v3, types: [java.lang.Object, h49] */
    public static h49 B(int i2) {
        if (i2 == 0) {
            return new Object();
        }
        if (i2 != 1) {
            return new Object();
        }
        return new Object();
    }

    public static int B0(xo7 xo7) {
        if (xo7 instanceof wo7) {
            return ((wo7) xo7).getParameters().size();
        }
        StringBuilder p2 = b81.p("ClassicTypeSystemContext couldn't handle: ", xo7, ", ");
        h.j(hl6.m(b26.a, xo7.getClass(), p2));
        return 0;
    }

    public static f61 C(f61 f61, f61 f612, gs2 gs2) {
        gs2.getClass();
        if (gs2 instanceof q50) {
            return ((q50) gs2).o(f612, f61);
        }
        e81 r2 = f612.r();
        if (r2 == x32.w) {
            return new ug3(f612, f61, gs2);
        }
        return new vg3(f612, r2, gs2, f61);
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [h61] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0020  */
    public static final Comparable C0(hf0 hf0, int i2, h61 h61) {
        mf0 mf0;
        Object obj;
        int i3;
        if (h61 instanceof mf0) {
            mf0 mf02 = (mf0) h61;
            int i4 = mf02.C;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                mf02.C = i4 - Integer.MIN_VALUE;
                mf0 = mf02;
                obj = mf0.B;
                i3 = mf0.C;
                if (i3 != 0) {
                    o85.q(obj);
                    if (!hf0.h()) {
                        mf0.z = hf0;
                        mf0.A = i2;
                        mf0.C = 1;
                        obj = hf0.d(i2, mf0);
                        p81 p81 = p81.w;
                        if (obj == p81) {
                            return p81;
                        }
                    }
                    return null;
                } else if (i3 == 1) {
                    i2 = mf0.A;
                    hf0 = mf0.z;
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                if (((Boolean) obj).booleanValue()) {
                    tc0 g2 = hf0.g();
                    g2.getClass();
                    return new cg0(i75.i(new rx5(new ef5(g2)), i2));
                }
                return null;
            }
        }
        mf0 = new h61(h61);
        obj = mf0.B;
        i3 = mf0.C;
        if (i3 != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
        return null;
    }

    public static final bm7 D(mm7 mm7, lo7 lo7, String str, yt2 yt2, int i2, int i3) {
        am7 am7;
        if ((i3 & 2) != 0) {
            str = "DeferredAnimation";
        }
        boolean g2 = yt2.g(mm7);
        Object Q = yt2.Q();
        d63 d63 = ay0.a;
        if (g2 || Q == d63) {
            Q = new bm7(mm7, lo7, str);
            yt2.o0(Q);
        }
        bm7 bm7 = (bm7) Q;
        boolean g3 = yt2.g(mm7) | yt2.i(bm7);
        Object Q2 = yt2.Q();
        if (g3 || Q2 == d63) {
            Q2 = new k77(13, (Object) mm7, (Object) bm7);
            yt2.o0(Q2);
        }
        t49.e(bm7, (vr2) Q2, yt2);
        if (mm7.h() && (am7 = (am7) bm7.b.getValue()) != null) {
            mm7 mm72 = bm7.c;
            am7.w.f(am7.y.y(mm72.f().b()), am7.y.y(mm72.f().d()), (je2) am7.x.y(mm72.f()));
        }
        return bm7;
    }

    public static e81 D0(c81 c81, e81 e81) {
        e81.getClass();
        if (e81 == x32.w) {
            return c81;
        }
        return (e81) e81.G(new xw0(24), c81);
    }

    public static du7 E(uq0 uq0, v76 v76, v76 v762) {
        v76.getClass();
        v762.getClass();
        if (!(v76 instanceof fu6)) {
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(uq0);
            sb.append(", ");
            h.j(hl6.m(b26.a, uq0.getClass(), sb));
            return null;
        } else if (v762 instanceof fu6) {
            return kl8.n((fu6) v76, (fu6) v762);
        } else {
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(uq0);
            sb2.append(", ");
            h.j(hl6.m(b26.a, uq0.getClass(), sb2));
            return null;
        }
    }

    public static Collection E0(uq0 uq0, v76 v76) {
        xo7 F = uq0.F(v76);
        if (F instanceof ze3) {
            return ((ze3) F).w;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(v76);
        sb.append(", ");
        h.j(hl6.m(b26.a, v76.getClass(), sb));
        return null;
    }

    /* JADX INFO: finally extract failed */
    public static final im7 F(mm7 mm7, Object obj, Object obj2, je2 je2, lo7 lo7, yt2 yt2, int i2) {
        boolean z;
        Object obj3;
        Object obj4;
        vr2 vr2;
        mm7 mm72 = mm7;
        lo7 lo72 = lo7;
        yt2 yt22 = yt2;
        int i3 = i2 & 14;
        int i4 = i3 ^ 6;
        boolean z2 = true;
        if ((i4 <= 4 || !yt22.g(mm72)) && (i2 & 6) != 4) {
            z = false;
        } else {
            z = true;
        }
        Object Q = yt22.Q();
        d63 d63 = ay0.a;
        if (z || Q == d63) {
            ix6 h2 = j45.h();
            if (h2 != null) {
                vr2 = h2.e();
            } else {
                vr2 = null;
            }
            ix6 j2 = j45.j(h2);
            try {
                obj4 = obj2;
                ol olVar = (ol) lo72.a.y(obj4);
                olVar.d();
                obj3 = obj;
                im7 im7 = new im7(mm72, obj3, olVar, lo72);
                j45.m(h2, j2, vr2);
                yt22.o0(im7);
                Q = im7;
            } catch (Throwable th) {
                j45.m(h2, j2, vr2);
                throw th;
            }
        } else {
            obj3 = obj;
            obj4 = obj2;
        }
        im7 im72 = (im7) Q;
        int i5 = (i2 >> 3) & 8;
        int i6 = i2 << 3;
        int i7 = i3 | (i5 << 6) | (i6 & 896) | (i5 << 9) | (i6 & 7168) | (57344 & i6);
        f(mm72, im72, obj3, obj4, je2, yt22, i7);
        if ((i4 <= 4 || !yt22.g(mm72)) && (i2 & 6) != 4) {
            z2 = false;
        }
        boolean g2 = yt22.g(im72) | z2;
        Object Q2 = yt22.Q();
        if (g2 || Q2 == d63) {
            Q2 = new k77(10, (Object) mm72, (Object) im72);
            yt22.o0(Q2);
        }
        t49.e(im72, (vr2) Q2, yt22);
        return im72;
    }

    public static xp7 F0(ml0 ml0) {
        if (ml0 instanceof cz4) {
            return ((cz4) ml0).w;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(ml0);
        sb.append(", ");
        h.j(hl6.m(b26.a, ml0.getClass(), sb));
        return null;
    }

    public static r58 G(Class cls) {
        try {
            Constructor declaredConstructor = cls.getDeclaredConstructor((Class[]) null);
            if (Modifier.isPublic(declaredConstructor.getModifiers())) {
                try {
                    Object newInstance = declaredConstructor.newInstance((Object[]) null);
                    newInstance.getClass();
                    return (r58) newInstance;
                } catch (InstantiationException e2) {
                    ku4.n("Cannot create an instance of ", cls, e2);
                    return null;
                } catch (IllegalAccessException e3) {
                    ku4.n("Cannot create an instance of ", cls, e3);
                    return null;
                }
            } else {
                throw new RuntimeException("Cannot create an instance of " + cls);
            }
        } catch (NoSuchMethodException e4) {
            ku4.n("Cannot create an instance of ", cls, e4);
            return null;
        }
    }

    public static final Object G0(vf5 vf5, hu5 hu5) {
        hu5.getClass();
        Object obj = vf5.get(hu5);
        if (obj == null) {
            obj = hu5.b();
        }
        return ((c28) obj).a(vf5);
    }

    /* JADX WARNING: type inference failed for: r0v9, types: [h61] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
    public static final Object H(hf0 hf0, long j2, h61 h61) {
        jf0 jf0;
        int i2;
        jf0 jf02;
        long j3;
        hf0 hf02;
        long j4;
        long j5;
        jf0 jf03;
        if (h61 instanceof jf0) {
            jf0 jf04 = (jf0) h61;
            int i3 = jf04.D;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                jf04.D = i3 - Integer.MIN_VALUE;
                jf0 = jf04;
                Object obj = jf0.C;
                i2 = jf0.D;
                if (i2 != 0) {
                    o85.q(obj);
                    jf02 = jf0;
                    j3 = j2;
                } else if (i2 == 1) {
                    j4 = jf0.B;
                    j5 = jf0.A;
                    hf02 = jf0.z;
                    o85.q(obj);
                    jf03 = jf0;
                    long j6 = j4;
                    hf0 = hf02;
                    j2 = j6;
                    jf02 = jf03;
                    j3 = j5;
                    long min = Math.min(j2, su0.u(hf0.g()));
                    su0.m(hf0.g(), min);
                    j2 -= min;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                if (j2 <= 0 || hf0.h()) {
                    return new Long(j3 - j2);
                }
                tc0 g2 = hf0.g();
                g2.getClass();
                if (((int) g2.y) == 0) {
                    jf02.z = hf0;
                    jf02.A = j3;
                    jf02.B = j2;
                    jf02.D = 1;
                    Object d2 = hf0.d(1, jf02);
                    p81 p81 = p81.w;
                    if (d2 == p81) {
                        return p81;
                    }
                    hf02 = hf0;
                    j4 = j2;
                    j5 = j3;
                    jf03 = jf02;
                    long j62 = j4;
                    hf0 = hf02;
                    j2 = j62;
                    jf02 = jf03;
                    j3 = j5;
                    return p81;
                }
                long min2 = Math.min(j2, su0.u(hf0.g()));
                su0.m(hf0.g(), min2);
                j2 -= min2;
                if (j2 <= 0 || hf0.h()) {
                }
            }
        }
        jf0 = new h61(h61);
        Object obj2 = jf0.C;
        i2 = jf0.D;
        if (i2 != 0) {
        }
        if (j2 <= 0 || hf0.h()) {
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: tc0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: tc0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: tc0} */
    /* JADX WARNING: type inference failed for: r0v2, types: [h61] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
    public static final Object H0(hf0 hf0, h61 h61) {
        nf0 nf0;
        int i2;
        tc0 tc0;
        Throwable b2;
        if (h61 instanceof nf0) {
            nf0 nf02 = (nf0) h61;
            int i3 = nf02.C;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                nf02.C = i3 - Integer.MIN_VALUE;
                nf0 = nf02;
                Object obj = nf0.B;
                i2 = nf0.C;
                if (i2 != 0) {
                    o85.q(obj);
                    tc0 = new Object();
                } else if (i2 == 1) {
                    tc0 tc02 = nf0.A;
                    hf0 hf02 = nf0.z;
                    o85.q(obj);
                    tc0 = tc02;
                    hf0 = hf02;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                while (!hf0.h()) {
                    tc0.u(hf0.g());
                    nf0.z = hf0;
                    nf0.A = tc0;
                    nf0.C = 1;
                    Object d2 = hf0.d(1, nf0);
                    p81 p81 = p81.w;
                    if (d2 == p81) {
                        return p81;
                    }
                }
                b2 = hf0.b();
                if (b2 != null) {
                    return tc0;
                }
                throw b2;
            }
        }
        nf0 = new h61(h61);
        Object obj2 = nf0.B;
        i2 = nf0.C;
        if (i2 != 0) {
        }
        while (!hf0.h()) {
        }
        b2 = hf0.b();
        if (b2 != null) {
        }
    }

    public static final boolean I(int i2, int i3) {
        if ((i2 & i3) == i3) {
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: tc0} */
    /* JADX WARNING: type inference failed for: r0v5, types: [h61] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=y81, code=hf0, for r10v0, types: [y81] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x009a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
    public static final Object I0(hf0 hf0, int i2, h61 h61) {
        of0 of0;
        int i3;
        int i4;
        tc0 tc0;
        int i5;
        hf0 hf02;
        if (h61 instanceof of0) {
            of0 of02 = (of0) h61;
            int i6 = of02.D;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                of02.D = i6 - Integer.MIN_VALUE;
                of0 = of02;
                Object obj = of0.C;
                i3 = of0.D;
                if (i3 != 0) {
                    o85.q(obj);
                    i4 = i2;
                    tc0 = new Object();
                } else if (i3 == 1) {
                    i5 = of0.B;
                    tc0 = of0.A;
                    hf02 = of0.z;
                    o85.q(obj);
                    i4 = i5;
                    hf0 = hf02;
                    if (!hf0.h()) {
                        long j2 = (long) i4;
                        if (su0.u(hf0.g()) > j2 - tc0.y) {
                            hf0.g().l(tc0, j2 - tc0.y);
                        } else {
                            new Long(hf0.g().v(tc0));
                        }
                    }
                    if (tc0.y >= ((long) i4)) {
                        return tc0;
                    }
                    throw new EOFException(f21.k(pb4.o(i4, "Not enough data available, required ", " bytes but only "), tc0.y, " available"));
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                if (tc0.y < ((long) i4)) {
                    if (hf0.g().x()) {
                        of0.z = hf0;
                        of0.A = tc0;
                        of0.B = i4;
                        of0.D = 1;
                        Object d2 = hf0.d(1, of0);
                        p81 p81 = p81.w;
                        if (d2 == p81) {
                            return p81;
                        }
                        hf02 = hf0;
                        i5 = i4;
                        i4 = i5;
                        hf0 = hf02;
                        return p81;
                    }
                    if (!hf0.h()) {
                    }
                }
                if (tc0.y >= ((long) i4)) {
                }
            }
        }
        of0 = new h61(h61);
        Object obj2 = of0.C;
        i3 = of0.D;
        if (i3 != 0) {
        }
        if (tc0.y < ((long) i4)) {
        }
        if (tc0.y >= ((long) i4)) {
        }
    }

    public static c81 J(c81 c81, d81 d81) {
        d81.getClass();
        if (sg3.e(c81.getKey(), d81)) {
            return c81;
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: tc0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: tc0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: tc0} */
    /* JADX WARNING: type inference failed for: r0v2, types: [h61] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
    public static final Object J0(hf0 hf0, h61 h61) {
        pf0 pf0;
        int i2;
        tc0 tc0;
        Throwable b2;
        if (h61 instanceof pf0) {
            pf0 pf02 = (pf0) h61;
            int i3 = pf02.C;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                pf02.C = i3 - Integer.MIN_VALUE;
                pf0 = pf02;
                Object obj = pf0.B;
                i2 = pf0.C;
                if (i2 != 0) {
                    o85.q(obj);
                    tc0 = new Object();
                } else if (i2 == 1) {
                    tc0 tc02 = pf0.A;
                    hf0 hf02 = pf0.z;
                    o85.q(obj);
                    tc0 = tc02;
                    hf0 = hf02;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                while (!hf0.h()) {
                    tc0.u(hf0.g());
                    pf0.z = hf0;
                    pf0.A = tc0;
                    pf0.C = 1;
                    Object d2 = hf0.d(1, pf0);
                    p81 p81 = p81.w;
                    if (d2 == p81) {
                        return p81;
                    }
                }
                b2 = hf0.b();
                if (b2 != null) {
                    tc0.c();
                    return tc0;
                }
                throw b2;
            }
        }
        pf0 = new h61(h61);
        Object obj2 = pf0.B;
        i2 = pf0.C;
        if (i2 != 0) {
        }
        while (!hf0.h()) {
        }
        b2 = hf0.b();
        if (b2 != null) {
        }
    }

    public static qo7 K(zw3 zw3, int i2) {
        zw3.getClass();
        if (zw3 instanceof vw3) {
            return (qo7) ((vw3) zw3).G().get(i2);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(zw3);
        sb.append(", ");
        h.j(hl6.m(b26.a, zw3.getClass(), sb));
        return null;
    }

    /* JADX INFO: finally extract failed */
    public static final mm7 K0(in8 in8, String str, yt2 yt2, int i2) {
        boolean z;
        boolean z2;
        boolean z3;
        vr2 vr2;
        int i3 = (i2 & 14) ^ 6;
        if ((i3 <= 4 || !yt2.g(in8)) && (i2 & 6) != 4) {
            z = false;
        } else {
            z = true;
        }
        Object Q = yt2.Q();
        d63 d63 = ay0.a;
        if (z || Q == d63) {
            ix6 h2 = j45.h();
            if (h2 != null) {
                vr2 = h2.e();
            } else {
                vr2 = null;
            }
            ix6 j2 = j45.j(h2);
            try {
                mm7 mm7 = new mm7(in8, (mm7) null, str);
                j45.m(h2, j2, vr2);
                yt2.o0(mm7);
                Q = mm7;
            } catch (Throwable th) {
                j45.m(h2, j2, vr2);
                throw th;
            }
        }
        mm7 mm72 = (mm7) Q;
        if (in8 instanceof oi6) {
            yt2.e0(-1357341561);
            Object Q2 = yt2.Q();
            if (Q2 == d63) {
                Q2 = t49.D(yt2);
                yt2.o0(Q2);
            }
            o81 o81 = (o81) Q2;
            boolean i4 = yt2.i(o81);
            if ((i3 <= 4 || !yt2.g(in8)) && (i2 & 6) != 4) {
                z2 = false;
            } else {
                z2 = true;
            }
            boolean z4 = i4 | z2;
            Object Q3 = yt2.Q();
            if (z4 || Q3 == d63) {
                Q3 = new k77(11, (Object) in8, (Object) o81);
                yt2.o0(Q3);
            }
            t49.e(o81, (vr2) Q3, yt2);
            oi6 oi6 = (oi6) in8;
            Object value = oi6.y.getValue();
            Object value2 = oi6.x.getValue();
            if ((i3 <= 4 || !yt2.g(in8)) && (i2 & 6) != 4) {
                z3 = false;
            } else {
                z3 = true;
            }
            Object Q4 = yt2.Q();
            if (z3 || Q4 == d63) {
                Q4 = new pd7((Object) in8, (f61) null, 1);
                yt2.o0(Q4);
            }
            t49.j(value, value2, (gs2) Q4, yt2);
            yt2.r(false);
        } else {
            yt2.e0(-1356348972);
            mm72.a(in8.J0(), yt2, 0);
            yt2.r(false);
        }
        boolean g2 = yt2.g(mm72);
        Object Q5 = yt2.Q();
        if (g2 || Q5 == d63) {
            Q5 = new om7(mm72, 1);
            yt2.o0(Q5);
        }
        t49.e(mm72, (vr2) Q5, yt2);
        return mm72;
    }

    public static List L(zw3 zw3) {
        zw3.getClass();
        if (zw3 instanceof vw3) {
            return ((vw3) zw3).G();
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(zw3);
        sb.append(", ");
        h.j(hl6.m(b26.a, zw3.getClass(), sb));
        return null;
    }

    public static final void L0(vo1 vo1) {
        md autofillManager;
        uy3 O0 = O0(vo1);
        if (!O0.O) {
            je jeVar = (je) xy3.a(O0);
            if (je.d() && (autofillManager = jeVar.getAutofillManager()) != null) {
                Rect rect = autofillManager.B;
                ny5 ny5 = autofillManager.z;
                uy3 uy3 = (uy3) ny5.a.b(O0.x);
                if (uy3 != null && uy3.C != -4) {
                    ig igVar = ny5.c;
                    int e2 = ny5.e(uy3);
                    long[] jArr = (long[]) igVar.c;
                    long j2 = jArr[e2];
                    long j3 = jArr[e2 + 1];
                    rect.set((int) (j2 >> 32), (int) j2, (int) (j3 >> 32), (int) j3);
                    kg5 kg5 = autofillManager.w;
                    kg5.w().requestAutofill(autofillManager.y, O0.x, rect);
                }
            }
        }
    }

    public static pl0 M(qt0 qt0) {
        pl0 pl0 = qt0.Z;
        if (pl0 != null) {
            return pl0;
        }
        rt0 rt0 = rj1.w;
        pl0 pl02 = new pl0(st0.d(qt0, rt0), st0.a(qt0, st0.d(qt0, rt0)), uq3.n(jt0.b(rj1.z, st0.d(qt0, rj1.y)), st0.d(qt0, rt0)), jt0.b(0.38f, st0.a(qt0, st0.d(qt0, rt0))));
        qt0.Z = pl02;
        return pl02;
    }

    public static final xz4 M0(vo1 vo1, int i2) {
        xz4 xz4 = ((ll4) vo1).w.D;
        xz4.getClass();
        if (xz4.c1() != vo1 || !yz4.g(i2)) {
            return xz4;
        }
        xz4 xz42 = xz4.P;
        xz42.getClass();
        return xz42;
    }

    public static Drawable N(Context context, int i2) {
        return t56.b().c(context, i2);
    }

    public static final xz4 N0(vo1 vo1) {
        if (!((ll4) vo1).w.J) {
            yb3.b("Cannot get LayoutCoordinates, Modifier.Node is not attached.");
        }
        xz4 M0 = M0(vo1, 2);
        if (!M0.c1().J) {
            yb3.b("LayoutCoordinates is not attached.");
        }
        return M0;
    }

    public static final x83 O() {
        x83 x83 = r;
        if (x83 != null) {
            return x83;
        }
        w83 w83 = new w83("Rounded.Group", 24.0f, 24.0f, 24.0f, 24.0f, 0, 0, false, 96);
        int i2 = e38.a;
        ky6 ky6 = new ky6(jt0.b);
        be5 e2 = pb4.e(16.0f, 11.0f);
        e2.e(1.66f, 0.0f, 2.99f, -1.34f, 2.99f, -3.0f);
        e2.k(17.66f, 5.0f, 16.0f, 5.0f);
        e2.l(-3.0f, 1.34f, -3.0f, 3.0f);
        e2.l(1.34f, 3.0f, 3.0f, 3.0f);
        e2.c();
        e2.j(8.0f, 11.0f);
        e2.e(1.66f, 0.0f, 2.99f, -1.34f, 2.99f, -3.0f);
        e2.k(9.66f, 5.0f, 8.0f, 5.0f);
        e2.k(5.0f, 6.34f, 5.0f, 8.0f);
        e2.l(1.34f, 3.0f, 3.0f, 3.0f);
        e2.c();
        e2.j(8.0f, 13.0f);
        e2.e(-2.33f, 0.0f, -7.0f, 1.17f, -7.0f, 3.5f);
        e2.h(1.0f, 18.0f);
        e2.e(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        e2.g(12.0f);
        e2.e(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        e2.n(-1.5f);
        e2.e(0.0f, -2.33f, -4.67f, -3.5f, -7.0f, -3.5f);
        e2.c();
        e2.j(16.0f, 13.0f);
        e2.e(-0.29f, 0.0f, -0.62f, 0.02f, -0.97f, 0.05f);
        e2.e(0.02f, 0.01f, 0.03f, 0.03f, 0.04f, 0.04f);
        e2.e(1.14f, 0.83f, 1.93f, 1.94f, 1.93f, 3.41f);
        e2.h(17.0f, 18.0f);
        e2.e(0.0f, 0.35f, -0.07f, 0.69f, -0.18f, 1.0f);
        e2.h(22.0f, 19.0f);
        e2.e(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        e2.n(-1.5f);
        e2.e(0.0f, -2.33f, -4.67f, -3.5f, -7.0f, -3.5f);
        e2.c();
        w83.a(w83, e2.a, ky6, 14336);
        x83 b2 = w83.b();
        r = b2;
        return b2;
    }

    public static final uy3 O0(vo1 vo1) {
        xz4 xz4 = ((ll4) vo1).w.D;
        if (xz4 != null) {
            return xz4.O;
        }
        throw b81.t("Cannot obtain node coordinator. Is the Modifier.Node attached?");
    }

    public static final Object P(gh4 gh4) {
        iy3 iy3;
        Object B = gh4.B();
        if (B instanceof iy3) {
            iy3 = (iy3) B;
        } else {
            iy3 = null;
        }
        if (iy3 != null) {
            return iy3.K;
        }
        return null;
    }

    public static final p95 P0(vo1 vo1) {
        p95 p95 = O0(vo1).J;
        if (p95 != null) {
            return p95;
        }
        throw b81.t("This node does not have an owner.");
    }

    public static sp7 Q(xo7 xo7, int i2) {
        if (xo7 instanceof wo7) {
            Object obj = ((wo7) xo7).getParameters().get(i2);
            obj.getClass();
            return (sp7) obj;
        }
        StringBuilder p2 = b81.p("ClassicTypeSystemContext couldn't handle: ", xo7, ", ");
        h.j(hl6.m(b26.a, xo7.getClass(), p2));
        return null;
    }

    public static vw3 Q0(dq7 dq7, zw3 zw3) {
        dq7.getClass();
        zw3.getClass();
        if (zw3 instanceof du7) {
            return dq7.f((vw3) zw3, k28.y);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(zw3);
        sb.append(", ");
        h.j(hl6.m(b26.a, zw3.getClass(), sb));
        return null;
    }

    public static List R(xo7 xo7) {
        xo7.getClass();
        if (xo7 instanceof wo7) {
            List parameters = ((wo7) xo7).getParameters();
            parameters.getClass();
            return parameters;
        }
        StringBuilder p2 = b81.p("ClassicTypeSystemContext couldn't handle: ", xo7, ", ");
        h.j(hl6.m(b26.a, xo7.getClass(), p2));
        return null;
    }

    public static final ml4 R0(ml4 ml4, uh6 uh6, z75 z75, xf xfVar, boolean z, eh2 eh2, ap4 ap4, ta5 ta5) {
        ml4 ml42;
        z75 z752 = z75.w;
        jl4 jl4 = jl4.w;
        if (z75 == z752) {
            ml42 = we.f(jl4, m23.c);
        } else {
            ml42 = we.f(jl4, m23.b);
        }
        return ml4.d(ml42).d(new hh6(xfVar, ta5, eh2, ap4, z75, uh6, z, false));
    }

    public static vw3 S(sp7 sp7) {
        sp7.getClass();
        if (sp7 instanceof qp7) {
            return jb5.p((qp7) sp7);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(sp7);
        sb.append(", ");
        h.j(hl6.m(b26.a, sp7.getClass(), sb));
        return null;
    }

    public static void S0(View view, ug4 ug4) {
        o22 o22 = ug4.x.c;
        if (o22 != null && o22.a) {
            float f2 = 0.0f;
            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                f2 += ((View) parent).getElevation();
            }
            sg4 sg4 = ug4.x;
            if (sg4.m != f2) {
                sg4.m = f2;
                ug4.s();
            }
        }
    }

    public static du7 T(uq0 uq0, qo7 qo7) {
        qo7.getClass();
        if (uq0.f(qo7)) {
            return null;
        }
        if (qo7 instanceof xp7) {
            return ((xp7) qo7).b().n0();
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(qo7);
        sb.append(", ");
        h.j(hl6.m(b26.a, qo7.getClass(), sb));
        return null;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [h61] */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0049, code lost:
        if (r8 == r5) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0060, code lost:
        if (H(r6, (long) r7.w.length, r0) == r5) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0062, code lost:
        return r5;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    public static final Object T0(hf0 hf0, cg0 cg0, h61 h61) {
        qf0 qf0;
        Object obj;
        int i2;
        if (h61 instanceof qf0) {
            qf0 qf02 = (qf0) h61;
            int i3 = qf02.C;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                qf02.C = i3 - Integer.MIN_VALUE;
                qf0 = qf02;
                obj = qf0.B;
                i2 = qf0.C;
                Object obj2 = p81.w;
                if (i2 != 0) {
                    o85.q(obj);
                    int length = cg0.w.length;
                    qf0.z = hf0;
                    qf0.A = cg0;
                    qf0.C = 1;
                    obj = C0(hf0, length, qf0);
                } else if (i2 == 1) {
                    cg0 = qf0.A;
                    hf0 = qf0.z;
                    o85.q(obj);
                } else if (i2 == 2) {
                    o85.q(obj);
                    return Boolean.TRUE;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                if (sg3.e(obj, cg0)) {
                    return Boolean.FALSE;
                }
                qf0.z = null;
                qf0.A = null;
                qf0.C = 2;
            }
        }
        qf0 = new h61(h61);
        obj = qf0.B;
        i2 = qf0.C;
        Object obj22 = p81.w;
        if (i2 != 0) {
        }
        if (sg3.e(obj, cg0)) {
        }
    }

    public static qp7 U(xo7 xo7) {
        xo7.getClass();
        if (xo7 instanceof wo7) {
            vq0 u2 = ((wo7) xo7).u();
            if (u2 instanceof qp7) {
                return (qp7) u2;
            }
            return null;
        }
        StringBuilder p2 = b81.p("ClassicTypeSystemContext couldn't handle: ", xo7, ", ");
        h.j(hl6.m(b26.a, xo7.getClass(), p2));
        return null;
    }

    public static tq0 U0(uq0 uq0, v76 v76) {
        if (v76 instanceof fu6) {
            vw3 vw3 = (vw3) v76;
            return new tq0(uq0, new dq7(yo7.b.f(vw3.L(), vw3.G())));
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(v76);
        sb.append(", ");
        h.j(hl6.m(b26.a, v76.getClass(), sb));
        return null;
    }

    public static jq7 V(qo7 qo7) {
        qo7.getClass();
        if (qo7 instanceof xp7) {
            k28 a2 = ((xp7) qo7).a();
            a2.getClass();
            return fb5.e(a2);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(qo7);
        sb.append(", ");
        h.j(hl6.m(b26.a, qo7.getClass(), sb));
        return null;
    }

    public static Collection V0(xo7 xo7) {
        xo7.getClass();
        if (xo7 instanceof wo7) {
            Collection e2 = ((wo7) xo7).e();
            e2.getClass();
            return e2;
        }
        StringBuilder p2 = b81.p("ClassicTypeSystemContext couldn't handle: ", xo7, ", ");
        h.j(hl6.m(b26.a, xo7.getClass(), p2));
        return null;
    }

    public static jq7 W(sp7 sp7) {
        if (sp7 instanceof qp7) {
            k28 I = ((qp7) sp7).I();
            I.getClass();
            return fb5.e(I);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(sp7);
        sb.append(", ");
        h.j(hl6.m(b26.a, sp7.getClass(), sb));
        return null;
    }

    public static final Object[] W0(Collection collection) {
        collection.getClass();
        int size = collection.size();
        Object[] objArr = a;
        if (size == 0) {
            return objArr;
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            return objArr;
        }
        Object[] objArr2 = new Object[size];
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            objArr2[i2] = it.next();
            if (i3 >= objArr2.length) {
                if (!it.hasNext()) {
                    return objArr2;
                }
                int i4 = ((i3 * 3) + 1) >>> 1;
                if (i4 <= i3) {
                    i4 = 2147483645;
                    if (i3 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                objArr2 = Arrays.copyOf(objArr2, i4);
            } else if (!it.hasNext()) {
                return Arrays.copyOf(objArr2, i3);
            }
            i2 = i3;
        }
    }

    public static boolean X(zw3 zw3, up2 up2) {
        zw3.getClass();
        up2.getClass();
        if (zw3 instanceof vw3) {
            return ((vw3) zw3).getAnnotations().i(up2);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(zw3);
        sb.append(", ");
        h.j(hl6.m(b26.a, zw3.getClass(), sb));
        return false;
    }

    public static final Object[] X0(Collection collection, Object[] objArr) {
        Object[] objArr2;
        collection.getClass();
        objArr.getClass();
        int size = collection.size();
        int i2 = 0;
        if (size != 0) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                if (size <= objArr.length) {
                    objArr2 = objArr;
                } else {
                    Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
                    newInstance.getClass();
                    objArr2 = (Object[]) newInstance;
                }
                while (true) {
                    int i3 = i2 + 1;
                    objArr2[i2] = it.next();
                    if (i3 >= objArr2.length) {
                        if (!it.hasNext()) {
                            return objArr2;
                        }
                        int i4 = ((i3 * 3) + 1) >>> 1;
                        if (i4 <= i3) {
                            i4 = 2147483645;
                            if (i3 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArr2 = Arrays.copyOf(objArr2, i4);
                    } else if (!it.hasNext()) {
                        if (objArr2 != objArr) {
                            return Arrays.copyOf(objArr2, i3);
                        }
                        objArr[i3] = null;
                        return objArr;
                    }
                    i2 = i3;
                }
            } else if (objArr.length > 0) {
                objArr[0] = null;
            }
        } else if (objArr.length > 0) {
            objArr[0] = null;
            return objArr;
        }
        return objArr;
    }

    public static boolean Y(sp7 sp7, xo7 xo7) {
        boolean z;
        if (sp7 instanceof qp7) {
            if (xo7 == null) {
                z = true;
            } else {
                z = xo7 instanceof wo7;
            }
            qp7 qp7 = (qp7) sp7;
            if (z) {
                return jb5.t(qp7, (wo7) xo7, (Set) null);
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(qp7);
            sb.append(", ");
            h.j(hl6.m(b26.a, qp7.getClass(), sb));
            return false;
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(sp7);
        sb2.append(", ");
        h.j(hl6.m(b26.a, sp7.getClass(), sb2));
        return false;
    }

    /* JADX WARNING: type inference failed for: r4v2, types: [byte[], java.io.Serializable] */
    /* JADX WARNING: type inference failed for: r0v3, types: [h61] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
    public static final Serializable Y0(hf0 hf0, h61 h61) {
        rf0 rf0;
        int i2;
        if (h61 instanceof rf0) {
            rf0 rf02 = (rf0) h61;
            int i3 = rf02.A;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                rf02.A = i3 - Integer.MIN_VALUE;
                rf0 = rf02;
                Object obj = rf0.z;
                i2 = rf0.A;
                if (i2 != 0) {
                    o85.q(obj);
                    rf0.A = 1;
                    obj = H0(hf0, rf0);
                    p81 p81 = p81.w;
                    if (obj == p81) {
                        return p81;
                    }
                } else if (i2 == 1) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                tc0 tc0 = (tc0) obj;
                return i75.i(tc0, (int) tc0.y);
            }
        }
        rf0 = new h61(h61);
        Object obj2 = rf0.z;
        i2 = rf0.A;
        if (i2 != 0) {
        }
        tc0 tc02 = (tc0) obj2;
        return i75.i(tc02, (int) tc02.y);
    }

    public static boolean Z(v76 v76, v76 v762) {
        v76.getClass();
        v762.getClass();
        if (!(v76 instanceof fu6)) {
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(v76);
            sb.append(", ");
            h.j(hl6.m(b26.a, v76.getClass(), sb));
            return false;
        } else if (!(v762 instanceof fu6)) {
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(v762);
            sb2.append(", ");
            h.j(hl6.m(b26.a, v762.getClass(), sb2));
            return false;
        } else if (((fu6) v76).G() == ((fu6) v762).G()) {
            return true;
        } else {
            return false;
        }
    }

    public static final float Z0(mp7 mp7, wf6 wf6) {
        if (mp7 instanceof bv1) {
            return (float) ((bv1) mp7).L;
        }
        int ordinal = wf6.ordinal();
        if (ordinal == 0) {
            return Float.MIN_VALUE;
        }
        if (ordinal == 1) {
            return Float.MAX_VALUE;
        }
        h.c();
        return 0.0f;
    }

    public static final void a(sl5 sl5, fw0 fw0, ek7 ek7, fw0 fw02, yt2 yt2, int i2) {
        int i3;
        sl5 sl52;
        boolean z;
        aq4 aq4;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z2;
        int i10;
        int i11;
        int i12;
        ek7 ek72 = ek7;
        fw0 fw03 = fw02;
        yt2 yt22 = yt2;
        int i13 = i2;
        yt22.g0(-1221877520);
        if ((i13 & 6) == 0) {
            sl52 = sl5;
            if (yt22.g(sl52)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i3 = i12 | i13;
        } else {
            sl52 = sl5;
            i3 = i13;
        }
        fw0 fw04 = fw0;
        if ((i13 & 48) == 0) {
            if (yt22.i(fw04)) {
                i11 = 32;
            } else {
                i11 = 16;
            }
            i3 |= i11;
        }
        if ((i13 & 384) == 0) {
            if ((i13 & 512) == 0) {
                z2 = yt22.g(ek72);
            } else {
                z2 = yt22.i(ek72);
            }
            if (z2) {
                i10 = 256;
            } else {
                i10 = 128;
            }
            i3 |= i10;
        }
        int i14 = i13 & 3072;
        jl4 jl4 = jl4.w;
        if (i14 == 0) {
            if (yt22.g(jl4)) {
                i9 = 2048;
            } else {
                i9 = 1024;
            }
            i3 |= i9;
        }
        if ((i13 & 24576) == 0) {
            if (yt22.i((Object) null)) {
                i8 = 16384;
            } else {
                i8 = 8192;
            }
            i3 |= i8;
        }
        boolean z3 = false;
        if ((i13 & 196608) == 0) {
            if (yt22.h(false)) {
                i7 = 131072;
            } else {
                i7 = 65536;
            }
            i3 |= i7;
        }
        if ((1572864 & i13) == 0) {
            if (yt22.h(true)) {
                i6 = 1048576;
            } else {
                i6 = 524288;
            }
            i3 |= i6;
        }
        if ((12582912 & i13) == 0) {
            if (yt22.h(false)) {
                i5 = 8388608;
            } else {
                i5 = 4194304;
            }
            i3 |= i5;
        }
        if ((100663296 & i13) == 0) {
            if (yt22.i(fw03)) {
                i4 = 67108864;
            } else {
                i4 = 33554432;
            }
            i3 |= i4;
        }
        int i15 = i3;
        if ((38347923 & i15) != 38347922) {
            z = true;
        } else {
            z = false;
        }
        if (yt22.V(i15 & 1, z)) {
            Object Q = yt22.Q();
            d63 d63 = ay0.a;
            if (Q == d63) {
                Q = t49.D(yt22);
                yt22.o0(Q);
            }
            o81 o81 = (o81) Q;
            Object Q2 = yt22.Q();
            if (Q2 == d63) {
                Q2 = u55.p(Boolean.FALSE);
                yt22.o0(Q2);
            }
            aq4 aq42 = (aq4) Q2;
            yt22.e0(-1104742522);
            yt22.r(false);
            lh4 d2 = mb0.d(xb4.y, false);
            int i16 = i15;
            int hashCode = Long.hashCode(yt22.T);
            vf5 m2 = yt22.m();
            ml4 E = gw8.E(yt22, jl4);
            ux0.d.getClass();
            vy0 vy0 = tx0.b;
            yt22.i0();
            if (yt22.S) {
                yt22.l(vy0);
            } else {
                yt22.r0();
            }
            g75.Q(tx0.f, yt22, d2);
            g75.Q(tx0.e, yt22, m2);
            g75.Q(tx0.g, yt22, Integer.valueOf(hashCode));
            g75.O(yt22, tx0.h);
            g75.Q(tx0.d, yt22, E);
            if (ek72.b()) {
                yt22.e0(-1891243071);
                aq4 = aq42;
                e(sl52, ek72, o81, false, aq4, fw04, yt22, (i16 & 14) | 196608 | ((i16 >> 3) & 112) | ((i16 >> 6) & 896) | ((i16 << 15) & 3670016));
                yt22.r(false);
            } else {
                aq4 = aq42;
                yt22.e0(-1890863476);
                yt22.r(false);
            }
            g(ek72, aq4, fw03, yt22, ((i16 >> 18) & 14) | 384 | ((i16 >> 3) & 112) | ((i16 >> 12) & 7168) | (57344 & (i16 << 3)) | ((i16 >> 9) & 458752));
            yt22.r(true);
            int i17 = i16;
            if ((i17 & 896) == 256 || ((i17 & 512) != 0 && yt22.i(ek72))) {
                z3 = true;
            }
            Object Q3 = yt22.Q();
            if (z3 || Q3 == d63) {
                Q3 = new gg0(9, (Object) ek72);
                yt22.o0(Q3);
            }
            t49.e(ek72, (vr2) Q3, yt22);
        } else {
            yt22.Y();
        }
        yx5 v = yt22.v();
        if (v != null) {
            v.d = new m13(sl5, fw0, ek72, fw03, i13);
        }
    }

    public static f61 a0(f61 f61) {
        h61 h61;
        f61 f612;
        f61.getClass();
        if (f61 instanceof h61) {
            h61 = (h61) f61;
        } else {
            h61 = null;
        }
        if (h61 == null || (f61 = h61.y) != null) {
            return f61;
        }
        h81 h81 = (h81) h61.r().a0(hz2.z);
        if (h81 != null) {
            f612 = new sv1(h81, h61);
        } else {
            f612 = h61;
        }
        h61.y = f612;
        return f612;
    }

    public static cz4 a1(nl0 nl0) {
        if (nl0 instanceof bz4) {
            return ((bz4) nl0).y;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(nl0);
        sb.append(", ");
        h.j(hl6.m(b26.a, nl0.getClass(), sb));
        return null;
    }

    public static final CancellationException b(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v1, resolved type: g06} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v21, resolved type: tc0} */
    /* JADX WARNING: type inference failed for: r2v29, types: [h61] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x032c  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0333  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0355  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0362  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0389  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0391  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0246  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0283  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x02b5  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x02ca  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x02ce  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x02e7  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x02ef  */
    public static final Object b0(hf0 hf0, wn0 wn0, long j2, boolean z, boolean z2, h61 h61) {
        kf0 kf0;
        int i2;
        long j3;
        long j4;
        g06 g06;
        hf0 hf02;
        py6 py6;
        g06 g062;
        boolean z3;
        kf0 kf02;
        p81 p81;
        boolean z4;
        byte a2;
        String str;
        String str2;
        Object obj;
        boolean z5;
        hf0 hf03;
        Appendable appendable;
        py6 py62;
        long j5;
        g06 g063;
        p81 p812;
        boolean z6;
        boolean z7;
        String str3;
        long j6;
        long j7;
        long j8;
        long j9;
        long j10;
        long j11;
        long j12;
        long j13;
        boolean z8;
        Object obj2;
        kf0 kf03;
        boolean z9;
        g06 g064;
        py6 py63;
        long j14;
        p81 p813;
        long j15;
        long j16;
        long j17;
        py6 py64;
        boolean z10;
        boolean z11;
        boolean z12;
        Appendable appendable2;
        hf0 hf04 = hf0;
        h61 h612 = h61;
        if (h612 instanceof kf0) {
            kf0 kf04 = (kf0) h612;
            int i3 = kf04.L;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                kf04.L = i3 - Integer.MIN_VALUE;
                kf0 = kf04;
                Object obj3 = kf0.K;
                i2 = kf0.L;
                String str4 = "Unexpected end of stream after reading ";
                String str5 = " characters";
                long j18 = 1;
                p81 p814 = p81.w;
                if (i2 != 0) {
                    p81 p815 = p814;
                    str3 = str5;
                    o85.q(obj3);
                    tc0 g2 = hf04.g();
                    if (g2.x()) {
                        kf0.z = hf04;
                        appendable2 = wn0;
                        kf0.A = appendable2;
                        kf0.B = g2;
                        j5 = j2;
                        kf0.D = j5;
                        z12 = z;
                        kf0.I = z12;
                        z11 = z2;
                        kf0.J = z11;
                        kf0.L = 1;
                        p812 = p815;
                        if (hf04.d(1, kf0) == p812) {
                            return p812;
                        }
                    } else {
                        appendable2 = wn0;
                        j5 = j2;
                        z12 = z;
                        z11 = z2;
                        p812 = p815;
                    }
                    boolean z13 = z11;
                    hf03 = hf04;
                    z10 = z12;
                    appendable = appendable2;
                    z6 = z13;
                    py64 = g2;
                } else if (i2 == 1) {
                    p81 p816 = p814;
                    str3 = str5;
                    boolean z14 = kf0.J;
                    boolean z15 = kf0.I;
                    j5 = kf0.D;
                    py6 py65 = kf0.B;
                    appendable = kf0.A;
                    hf03 = kf0.z;
                    o85.q(obj3);
                    z6 = z14;
                    z10 = z15;
                    p812 = p816;
                    py64 = py65;
                } else if (i2 == 2) {
                    long j19 = kf0.H;
                    long j20 = kf0.G;
                    long j21 = kf0.F;
                    long j22 = kf0.E;
                    boolean z16 = kf0.J;
                    boolean z17 = kf0.I;
                    long j23 = kf0.D;
                    boolean z18 = z16;
                    g06 g065 = kf0.C;
                    py6 py66 = kf0.B;
                    Appendable appendable3 = kf0.A;
                    hf0 hf05 = kf0.z;
                    o85.q(obj3);
                    str = str5;
                    j11 = j21;
                    j10 = j22;
                    z9 = z18;
                    j12 = j20;
                    appendable = appendable3;
                    hf03 = hf05;
                    py63 = py66;
                    kf0 kf05 = kf0;
                    g064 = g065;
                    long j24 = j23;
                    obj2 = obj3;
                    p81 = p814;
                    str2 = str4;
                    kf03 = kf05;
                    z8 = z17;
                    j5 = j24;
                    j13 = j19;
                    if (((Boolean) obj2).booleanValue()) {
                    }
                    return new Long(g064.w);
                } else if (i2 == 3) {
                    boolean z19 = kf0.J;
                    boolean z20 = kf0.I;
                    long j25 = kf0.D;
                    g06 g066 = kf0.C;
                    py6 py67 = kf0.B;
                    Appendable appendable4 = kf0.A;
                    hf03 = kf0.z;
                    o85.q(obj3);
                    Appendable appendable5 = appendable4;
                    Object obj4 = obj3;
                    p81 = p814;
                    j5 = j25;
                    py62 = py67;
                    appendable = appendable5;
                    boolean z21 = z20;
                    str2 = str4;
                    str = str5;
                    kf0 kf06 = kf0;
                    boolean z22 = z19;
                    g063 = g066;
                    if (!((Boolean) obj4).booleanValue()) {
                        hf0 hf06 = hf03;
                        g062 = g063;
                        z4 = z22;
                        kf02 = kf06;
                        z5 = z21;
                        hf02 = hf06;
                        py6 = py62;
                        j3 = j5;
                        if (g062.w == 0 && hf02.h()) {
                            return new Long(-1);
                        }
                        long j26 = g062.w;
                        int i4 = (j26 > j3 ? 1 : (j26 == j3 ? 0 : -1));
                        if (i4 > 0) {
                            throw new IllegalStateException(("Consumed bytes exceed the limit: " + g062.w + " > " + j3 + ". It's an implementation bug, please report it.").toString());
                        } else if (i4 != 0) {
                            String str6 = str2;
                            String str7 = str;
                            if (!z4) {
                                return new Long(j26);
                            }
                            throw new EOFException(f21.g(j26, str6, str7));
                        } else if (j3 == Long.MAX_VALUE) {
                            throw new MalformedInputException("Max line length exceeded");
                        } else if (su0.u(py6) == 0) {
                            kf02.z = hf02;
                            kf02.A = null;
                            kf02.B = py6;
                            kf02.C = g062;
                            kf02.D = j3;
                            kf02.I = z5;
                            kf02.J = z4;
                            kf02.L = 4;
                            gf0 gf0 = hf0.a;
                            obj = hf02.d(1, kf02);
                            if (obj == p81) {
                                return p81;
                            }
                            if (!((Boolean) obj).booleanValue()) {
                            }
                        } else {
                            str5 = str;
                            z3 = z5;
                            kf0 kf07 = kf02;
                            boolean z23 = z4;
                            g06 = g062;
                            a2 = py6.c().a(0);
                            if (a2 != 10) {
                            }
                        }
                    }
                    p812 = p81;
                    z6 = z22;
                    kf02 = kf06;
                    z7 = z21;
                    str4 = str2;
                    str3 = str;
                    j18 = 1;
                    if (g063.w >= j5 || hf03.h()) {
                        boolean z24 = z6;
                        str = str3;
                        str2 = str4;
                        p81 = p812;
                        hf02 = hf03;
                        z5 = z7;
                        g062 = g063;
                        z4 = z24;
                        py6 = py62;
                        j3 = j5;
                        if (g062.w == 0 || hf02.h()) {
                        }
                    } else {
                        long j27 = j5 - g063.w;
                        str = str3;
                        str2 = str4;
                        long g3 = i75.g(py62, (byte) 10, j27, 2);
                        if (z7) {
                            if (g3 == -1) {
                                p813 = p812;
                                j17 = Math.min(j27, py62.c().y - j18);
                            } else {
                                p813 = p812;
                                if (g3 == 0) {
                                    j14 = g3;
                                    j17 = 0;
                                    j15 = i75.g(py62, (byte) 13, j17, 2);
                                }
                                j17 = g3 - j18;
                            }
                            j14 = g3;
                            j15 = i75.g(py62, (byte) 13, j17, 2);
                        } else {
                            j14 = g3;
                            p813 = p812;
                            j15 = -1;
                        }
                        if (j15 >= 0) {
                            d0(py62, appendable, g063, j15);
                            su0.m(py62, j18);
                        } else {
                            long j28 = j18;
                            int i5 = (j14 > 0 ? 1 : (j14 == 0 ? 0 : -1));
                            if (i5 != 0) {
                                if (i5 <= 0) {
                                    long min = Math.min(j27, py62.c().y);
                                    long j29 = min - j28;
                                    long j30 = j15;
                                    if (py62.c().a(j29) == 13) {
                                        d0(py62, appendable, g063, j29);
                                        kf02.z = hf03;
                                        kf02.A = appendable;
                                        kf02.B = py62;
                                        kf02.C = g063;
                                        kf02.D = j5;
                                        kf02.I = z7;
                                        kf02.J = z6;
                                        kf02.E = j27;
                                        kf02.F = j14;
                                        long j31 = j30;
                                        kf02.G = j31;
                                        long j32 = min;
                                        kf02.H = j32;
                                        kf02.L = 2;
                                        obj2 = c0(py62, hf03, z7, kf02);
                                        boolean z25 = z6;
                                        p81 = p813;
                                        if (obj2 == p81) {
                                            return p81;
                                        }
                                        j11 = j14;
                                        j10 = j27;
                                        j12 = j31;
                                        long j33 = j32;
                                        z9 = z25;
                                        kf03 = kf02;
                                        g064 = g063;
                                        py63 = py62;
                                        z8 = z7;
                                        j13 = j33;
                                        if (((Boolean) obj2).booleanValue()) {
                                            boolean z26 = z9;
                                            d0(py63, appendable, g064, 1);
                                            kf06 = kf03;
                                            j9 = j11;
                                            j7 = j13;
                                            j8 = j10;
                                            j6 = j12;
                                            z21 = z8;
                                            py62 = py63;
                                            g063 = g064;
                                            z22 = z26;
                                            if (g063.w >= j5 || su0.u(py62) != 0) {
                                                p812 = p81;
                                                z6 = z22;
                                                kf02 = kf06;
                                                z7 = z21;
                                                str4 = str2;
                                                str3 = str;
                                                j18 = 1;
                                                if (g063.w >= j5 || hf03.h()) {
                                                }
                                            } else {
                                                kf06.z = hf03;
                                                kf06.A = appendable;
                                                kf06.B = py62;
                                                kf06.C = g063;
                                                kf06.D = j5;
                                                kf06.I = z21;
                                                kf06.J = z22;
                                                kf06.E = j8;
                                                kf06.F = j9;
                                                kf06.G = j6;
                                                kf06.H = j7;
                                                kf06.L = 3;
                                                gf0 gf02 = hf0.a;
                                                obj4 = hf03.d(1, kf06);
                                                if (obj4 == p81) {
                                                    return p81;
                                                }
                                                if (!((Boolean) obj4).booleanValue()) {
                                                }
                                                p812 = p81;
                                                z6 = z22;
                                                kf02 = kf06;
                                                z7 = z21;
                                                str4 = str2;
                                                str3 = str;
                                                j18 = 1;
                                                if (g063.w >= j5 || hf03.h()) {
                                                }
                                            }
                                            p812 = p81;
                                            z6 = z22;
                                            kf02 = kf06;
                                            z7 = z21;
                                            str4 = str2;
                                            str3 = str;
                                            j18 = 1;
                                            if (g063.w >= j5 || hf03.h()) {
                                            }
                                        }
                                        return new Long(g064.w);
                                        return p81;
                                    }
                                    long j34 = min;
                                    boolean z27 = z6;
                                    p81 = p813;
                                    d0(py62, appendable, g063, j34);
                                    j7 = j34;
                                    j6 = j30;
                                    j9 = j14;
                                    kf06 = kf02;
                                    z21 = z7;
                                    j8 = j27;
                                    z22 = z27;
                                    if (g063.w >= j5 || su0.u(py62) != 0) {
                                    }
                                    p812 = p81;
                                    z6 = z22;
                                    kf02 = kf06;
                                    z7 = z21;
                                    str4 = str2;
                                    str3 = str;
                                    j18 = 1;
                                    if (g063.w >= j5 || hf03.h()) {
                                    }
                                }
                                if (py62.c().a(j14 - j28) == 13) {
                                    j16 = j28;
                                } else {
                                    j16 = 0;
                                }
                                d0(py62, appendable, g063, j14 - j16);
                                su0.m(py62, j16 + j28);
                                return new Long(g063.w);
                            }
                            su0.m(py62, j28);
                            return new Long(g063.w);
                        }
                        d0(py62, appendable, g063, j15);
                        su0.m(py62, j18);
                        return new Long(g063.w);
                    }
                } else if (i2 == 4) {
                    z4 = kf0.J;
                    z5 = kf0.I;
                    j3 = kf0.D;
                    g062 = kf0.C;
                    py6 = kf0.B;
                    hf02 = kf0.z;
                    o85.q(obj3);
                    str2 = str4;
                    str = str5;
                    obj = obj3;
                    p81 = p814;
                    kf02 = kf0;
                    if (!((Boolean) obj).booleanValue()) {
                        z3 = z5;
                        str5 = str;
                        kf0 kf072 = kf02;
                        boolean z232 = z4;
                        g06 = g062;
                        a2 = py6.c().a(0);
                        if (a2 != 10) {
                            su0.m(py6, 1);
                            return new Long(g06.w);
                        }
                        if (a2 == 13) {
                            kf072.z = null;
                            kf072.A = null;
                            kf072.B = null;
                            kf072.C = g06;
                            kf072.D = j3;
                            kf072.I = z3;
                            kf072.J = z232;
                            kf072.L = 5;
                            Object c0 = c0(py6, hf02, z3, kf072);
                            if (c0 == p81) {
                                return p81;
                            }
                            obj3 = c0;
                            j4 = j3;
                            if (!((Boolean) obj3).booleanValue()) {
                            }
                        }
                        throw new MalformedInputException(f21.g(j3, "Line exceeds limit of ", str5));
                    }
                    throw new EOFException(f21.g(g062.w, str2, str));
                } else if (i2 == 5) {
                    j4 = kf0.D;
                    g06 = kf0.C;
                    o85.q(obj3);
                    if (!((Boolean) obj3).booleanValue()) {
                        return new Long(g06.w);
                    }
                    j3 = j4;
                    throw new MalformedInputException(f21.g(j3, "Line exceeds limit of ", str5));
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                if (!hf03.h()) {
                    return new Long(-1);
                }
                z7 = z10;
                g063 = new Object();
                kf02 = kf0;
                py62 = py64;
                if (g063.w >= j5 || hf03.h()) {
                }
            }
        }
        kf0 = new h61(h612);
        Object obj32 = kf0.K;
        i2 = kf0.L;
        String str42 = "Unexpected end of stream after reading ";
        String str52 = " characters";
        long j182 = 1;
        p81 p8142 = p81.w;
        if (i2 != 0) {
        }
        if (!hf03.h()) {
        }
    }

    public static wo7 b1(v76 v76) {
        v76.getClass();
        if (v76 instanceof fu6) {
            return ((fu6) v76).L();
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(v76);
        sb.append(", ");
        h.j(hl6.m(b26.a, v76.getClass(), sb));
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    public static final void c(String str, long j2, long j3, am2 am2, ea7 ea7, yt2 yt2, int i2, int i3) {
        int i4;
        am2 am22;
        int i5;
        ea7 ea72;
        int i6;
        int i7;
        boolean z;
        am2 am23;
        yx5 v;
        yt2 yt22 = yt2;
        int i8 = i2;
        yt22.g0(1219578016);
        if (yt22.g(str)) {
            i4 = 4;
        } else {
            i4 = 2;
        }
        int i9 = i4 | i8;
        int i10 = i3 & 8;
        if (i10 != 0) {
            i9 |= 3072;
        } else if ((i8 & 3072) == 0) {
            am22 = am2;
            if (yt22.g(am22)) {
                i5 = 2048;
            } else {
                i5 = 1024;
            }
            i9 |= i5;
            ea72 = ea7;
            if (!yt22.g(ea72)) {
                i6 = 16384;
            } else {
                i6 = 8192;
            }
            i7 = i9 | i6;
            if ((i7 & 9363) == 9362) {
                z = true;
            } else {
                z = false;
            }
            if (!yt22.V(i7 & 1, z)) {
                if (i10 != 0) {
                    am23 = null;
                } else {
                    am23 = am22;
                }
                lh4 d2 = mb0.d(xb4.C, false);
                int hashCode = Long.hashCode(yt22.T);
                vf5 m2 = yt22.m();
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
                g75.Q(tx0.e, yt22, m2);
                g75.Q(tx0.g, yt22, Integer.valueOf(hashCode));
                g75.O(yt22, tx0.h);
                g75.Q(tx0.d, yt22, E);
                int i11 = i7;
                int i12 = i11 & 14;
                int i13 = i11 << 9;
                int i14 = i13 & 3670016;
                int i15 = i13 & 29360128;
                yt2 yt23 = yt22;
                long j4 = j3;
                yf7.b(str, (ml4) null, jt0.b, j4, am23, ea72, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, new tg7(0, 0, (am2) null, 0, new l57(1.0f, 0.0f, 0, 1, 22), 0, 0, (dk5) null, (m64) null, 16760831), yt23, i12 | 24960 | i14 | i15, 0, 130858);
                yt2 yt24 = yt2;
                yf7.b(str, (ml4) null, j2, j4, am23, ea7, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt24, i12 | 24960 | i14 | i15, 0, 261930);
                yt22 = yt24;
                yt22.r(true);
            } else {
                yt22.Y();
                am23 = am22;
            }
            v = yt22.v();
            if (v == null) {
                v.d = new qr4(str, j2, j3, am23, ea7, i2, i3);
                return;
            }
            return;
        }
        am22 = am2;
        ea72 = ea7;
        if (!yt22.g(ea72)) {
        }
        i7 = i9 | i6;
        if ((i7 & 9363) == 9362) {
        }
        if (!yt22.V(i7 & 1, z)) {
        }
        v = yt22.v();
        if (v == null) {
        }
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [h61] */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0055, code lost:
        if (((java.lang.Boolean) r12).booleanValue() == false) goto L_0x0069;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    public static final Object c0(py6 py6, hf0 hf0, boolean z, h61 h61) {
        lf0 lf0;
        int i2;
        if (h61 instanceof lf0) {
            lf0 lf02 = (lf0) h61;
            int i3 = lf02.C;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                lf02.C = i3 - Integer.MIN_VALUE;
                lf0 = lf02;
                Object obj = lf0.B;
                i2 = lf0.C;
                if (i2 != 0) {
                    o85.q(obj);
                    if (su0.u(py6) < 2) {
                        lf0.z = py6;
                        lf0.A = z;
                        lf0.C = 1;
                        obj = hf0.d(2, lf0);
                        p81 p81 = p81.w;
                        if (obj == p81) {
                            return p81;
                        }
                    }
                    if (py6.c().a(1) == 10) {
                        su0.m(py6, 2);
                        return Boolean.TRUE;
                    }
                    if (!z) {
                        return Boolean.FALSE;
                    }
                    su0.m(py6, 1);
                    return Boolean.TRUE;
                } else if (i2 == 1) {
                    z = lf0.A;
                    py6 = lf0.z;
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            }
        }
        lf0 = new h61(h61);
        Object obj2 = lf0.B;
        i2 = lf0.C;
        if (i2 != 0) {
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [uf5, yf5] */
    public static final vf5 c1(ju5[] ju5Arr, vf5 vf5, vf5 vf52) {
        vf5 vf53 = vf5.z;
        ? yf5 = new yf5(vf53);
        yf5.C = vf53;
        for (ju5 ju5 : ju5Arr) {
            hu5 hu5 = ju5.a;
            if (ju5.g || !vf5.containsKey(hu5)) {
                yf5.put(hu5, hu5.d(ju5, (c28) vf52.get(hu5)));
            }
        }
        return yf5.b();
    }

    public static final void d(long j2, long j3, sr2 sr2, gs2 gs2, sr2 sr22, sr2 sr23, yt2 yt2, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z;
        yt2 yt22;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        String str;
        long j4 = j3;
        sr2 sr24 = sr2;
        gs2 gs22 = gs2;
        sr2 sr25 = sr22;
        sr2 sr26 = sr23;
        yt2 yt23 = yt2;
        yt23.g0(1505858222);
        if (yt23.f(j2)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i9 = i2 | i3;
        if (yt23.f(j4)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i10 = i9 | i4;
        if (yt23.i(sr24)) {
            i5 = 256;
        } else {
            i5 = 128;
        }
        int i11 = i10 | i5;
        if (yt23.i(gs22)) {
            i6 = 2048;
        } else {
            i6 = 1024;
        }
        int i12 = i11 | i6;
        if (yt23.i(sr25)) {
            i7 = 16384;
        } else {
            i7 = 8192;
        }
        int i13 = i12 | i7;
        if (yt23.i(sr26)) {
            i8 = 131072;
        } else {
            i8 = 65536;
        }
        int i14 = i13 | i8;
        if ((74899 & i14) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (yt23.V(i14 & 1, z)) {
            o96 a2 = q96.a(6.0f);
            jl4 jl4 = jl4.w;
            ml4 h2 = b96.h(we.f(jl4, a2), jt0.b(0.3f, uq3.d(4060086272L)), gr8.h);
            if ((i14 & 896) == 256) {
                z2 = true;
            } else {
                z2 = false;
            }
            if ((i14 & 7168) == 2048) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean z6 = z2 | z3;
            if ((458752 & i14) == 131072) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean z7 = z6 | z4;
            if ((i14 & 57344) == 16384) {
                z5 = true;
            } else {
                z5 = false;
            }
            boolean z8 = z5 | z7;
            Object Q = yt23.Q();
            if (z8 || Q == ay0.a) {
                Q = new sr4(sr24, gs22, sr26, sr25);
                yt23.o0(Q);
            }
            ml4 L = x91.L(d97.a(h2, vs7.a, (PointerInputEventHandler) Q), 4.0f, 2.0f);
            au0 a3 = zt0.a(wr.c, xb4.K, yt23, 0);
            int hashCode = Long.hashCode(yt23.T);
            vf5 m2 = yt23.m();
            ml4 E = gw8.E(yt23, L);
            ux0.d.getClass();
            vy0 vy0 = tx0.b;
            yt23.i0();
            if (yt23.S) {
                yt23.l(vy0);
            } else {
                yt23.r0();
            }
            ck ckVar = tx0.f;
            g75.Q(ckVar, yt23, a3);
            ck ckVar2 = tx0.e;
            g75.Q(ckVar2, yt23, m2);
            Integer valueOf = Integer.valueOf(hashCode);
            ck ckVar3 = tx0.g;
            g75.Q(ckVar3, yt23, valueOf);
            ce ceVar = tx0.h;
            g75.O(yt23, ceVar);
            ck ckVar4 = tx0.d;
            g75.Q(ckVar4, yt23, E);
            h80 h80 = xb4.I;
            rr rrVar = wr.a;
            ea6 a4 = ca6.a(rrVar, h80, yt23, 48);
            int hashCode2 = Long.hashCode(yt23.T);
            vf5 m3 = yt23.m();
            ml4 E2 = gw8.E(yt23, jl4);
            yt23.i0();
            if (yt23.S) {
                yt23.l(vy0);
            } else {
                yt23.r0();
            }
            g75.Q(ckVar, yt23, a4);
            g75.Q(ckVar2, yt23, m3);
            f21.s(hashCode2, yt23, ckVar3, yt23, ceVar);
            g75.Q(ckVar4, yt23, E2);
            String format = String.format("%02d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j2 / 3600), Long.valueOf((j2 % 3600) / 60), Long.valueOf(j2 % 60)}, 3));
            ck ckVar5 = ckVar2;
            long j5 = jt0.c;
            ck ckVar6 = ckVar3;
            long k2 = ya5.k(11);
            ck ckVar7 = ckVar;
            am2 am2 = am2.B;
            jl4 jl42 = jl4;
            fv2 fv2 = ea7.c;
            yt2 yt24 = yt23;
            vy0 vy02 = vy0;
            ce ceVar2 = ceVar;
            ck ckVar8 = ckVar6;
            ck ckVar9 = ckVar4;
            rr rrVar2 = rrVar;
            String str2 = format;
            ck ckVar10 = ckVar7;
            c(str2, j5, k2, am2, fv2, yt24, 3504, 0);
            yt2 yt25 = yt24;
            yt25.r(true);
            ea6 a5 = ca6.a(rrVar2, h80, yt25, 48);
            int hashCode3 = Long.hashCode(yt25.T);
            vf5 m4 = yt25.m();
            ml4 E3 = gw8.E(yt25, jl42);
            yt25.i0();
            if (yt25.S) {
                yt25.l(vy02);
            } else {
                yt25.r0();
            }
            g75.Q(ckVar10, yt25, a5);
            g75.Q(ckVar5, yt25, m4);
            f21.s(hashCode3, yt25, ckVar8, yt25, ceVar2);
            g75.Q(ckVar9, yt25, E3);
            if (j3 >= 1048576) {
                str = String.format("%.2f MB/s", Arrays.copyOf(new Object[]{Double.valueOf(((double) j3) / 1048576.0d)}, 1));
            } else {
                str = String.format("%.0f KB/s", Arrays.copyOf(new Object[]{Double.valueOf(((double) j3) / 1024.0d)}, 1));
            }
            yt2 yt26 = yt25;
            c(str, jt0.b(0.85f, j5), ya5.k(11), (am2) null, fv2, yt26, 432, 8);
            yt22 = yt26;
            yt22.r(true);
            yt22.r(true);
        } else {
            yt22 = yt23;
            long j6 = j4;
            yt22.Y();
        }
        yx5 v = yt22.v();
        if (v != null) {
            v.d = new pr4(j2, j3, sr2, gs2, sr22, sr23, i2);
        }
    }

    public static final void d0(py6 py6, Appendable appendable, g06 g06, long j2) {
        if (j2 > 0) {
            py6.getClass();
            py6.p(j2);
            String k2 = i95.k(py6.c(), j2);
            appendable.append(k2);
            g06.w += (long) k2.length();
        }
    }

    public static final mm7 d1(Object obj, String str, yt2 yt2, int i2, int i3) {
        if ((i3 & 2) != 0) {
            str = null;
        }
        Object Q = yt2.Q();
        d63 d63 = ay0.a;
        if (Q == d63) {
            Q = new mm7(new dq4(obj), (mm7) null, str);
            yt2.o0(Q);
        }
        mm7 mm7 = (mm7) Q;
        mm7.a(obj, yt2, (i2 & 8) | 48 | (i2 & 14));
        Object Q2 = yt2.Q();
        if (Q2 == d63) {
            Q2 = new om7(mm7, 0);
            yt2.o0(Q2);
        }
        t49.e(mm7, (vr2) Q2, yt2);
        return mm7;
    }

    public static final void e(sl5 sl5, ek7 ek7, o81 o81, boolean z, aq4 aq4, fw0 fw0, yt2 yt2, int i2) {
        int i3;
        sl5 sl52;
        boolean z2;
        boolean z3;
        boolean z4;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z5;
        int i9;
        int i10;
        ek7 ek72 = ek7;
        o81 o812 = o81;
        boolean z6 = z;
        aq4 aq42 = aq4;
        fw0 fw02 = fw0;
        yt2 yt22 = yt2;
        int i11 = i2;
        yt22.g0(-1413720282);
        if ((i11 & 6) == 0) {
            sl52 = sl5;
            if (yt22.g(sl52)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            i3 = i10 | i11;
        } else {
            sl52 = sl5;
            i3 = i11;
        }
        if ((i11 & 48) == 0) {
            if ((i11 & 64) == 0) {
                z5 = yt22.g(ek72);
            } else {
                z5 = yt22.i(ek72);
            }
            if (z5) {
                i9 = 32;
            } else {
                i9 = 16;
            }
            i3 |= i9;
        }
        if ((i11 & 384) == 0) {
            if (yt22.i((Object) null)) {
                i8 = 256;
            } else {
                i8 = 128;
            }
            i3 |= i8;
        }
        if ((i11 & 3072) == 0) {
            if (yt22.i(o812)) {
                i7 = 2048;
            } else {
                i7 = 1024;
            }
            i3 |= i7;
        }
        if ((i11 & 24576) == 0) {
            if (yt22.h(z6)) {
                i6 = 16384;
            } else {
                i6 = 8192;
            }
            i3 |= i6;
        }
        if ((196608 & i11) == 0) {
            if (yt22.g(aq42)) {
                i5 = 131072;
            } else {
                i5 = 65536;
            }
            i3 |= i5;
        }
        if ((1572864 & i11) == 0) {
            if (yt22.i(fw02)) {
                i4 = 1048576;
            } else {
                i4 = 524288;
            }
            i3 |= i4;
        }
        boolean z7 = false;
        if ((599187 & i3) != 599186) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (yt22.V(i3 & 1, z2)) {
            String u2 = l55.u(R.string.tooltip_description, yt22);
            if ((i3 & 896) == 256) {
                z3 = true;
            } else {
                z3 = false;
            }
            if ((i3 & 112) == 32 || ((i3 & 64) != 0 && yt22.i(ek72))) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean i12 = z4 | z3 | yt22.i(o812);
            if ((458752 & i3) == 131072) {
                z7 = true;
            }
            boolean z8 = i12 | z7;
            Object Q = yt22.Q();
            if (z8 || Q == ay0.a) {
                Q = new g20(ek72, o812, aq42, 1);
                yt22.o0(Q);
            }
            int i13 = (i3 & 14) | 3072;
            sr2 sr2 = (sr2) Q;
            vh.a(sl52, sr2, new tl5(z6, 22), su0.J(-1287705660, new d70(u2, fw02), yt22), yt22, i13, 0);
        } else {
            yt2.Y();
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new e70(sl5, ek72, o812, z6, aq42, fw02, i2);
        }
    }

    public static final void e0(gz1 gz1) {
        if (((ll4) gz1).w.J) {
            M0(gz1, 1).j1();
        }
    }

    public static fu6 e1(bh2 bh2) {
        if (bh2 instanceof zg2) {
            return ((zg2) bh2).y;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(bh2);
        sb.append(", ");
        h.j(hl6.m(b26.a, bh2.getClass(), sb));
        return null;
    }

    public static final void f(mm7 mm7, im7 im7, Object obj, Object obj2, je2 je2, yt2 yt2, int i2) {
        int i3;
        boolean z;
        boolean z2;
        int i4;
        boolean z3;
        int i5;
        boolean z4;
        int i6;
        int i7;
        int i8;
        yt2.g0(867041821);
        if ((i2 & 6) == 0) {
            if (yt2.g(mm7)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i3 = i8 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (yt2.g(im7)) {
                i7 = 32;
            } else {
                i7 = 16;
            }
            i3 |= i7;
        }
        if ((i2 & 384) == 0) {
            if ((i2 & 512) == 0) {
                z4 = yt2.g(obj);
            } else {
                z4 = yt2.i(obj);
            }
            if (z4) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i3 |= i6;
        }
        if ((i2 & 3072) == 0) {
            if ((i2 & 4096) == 0) {
                z3 = yt2.g(obj2);
            } else {
                z3 = yt2.i(obj2);
            }
            if (z3) {
                i5 = 2048;
            } else {
                i5 = 1024;
            }
            i3 |= i5;
        }
        if ((i2 & 24576) == 0) {
            if ((32768 & i2) == 0) {
                z2 = yt2.g(je2);
            } else {
                z2 = yt2.i(je2);
            }
            if (z2) {
                i4 = 16384;
            } else {
                i4 = 8192;
            }
            i3 |= i4;
        }
        if ((i3 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (!yt2.V(i3 & 1, z)) {
            yt2.Y();
        } else if (mm7.h()) {
            im7.f(obj, obj2, je2);
        } else {
            im7.g(obj2, je2, (Object) null, (ol) null);
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new ft(mm7, im7, obj, obj2, je2, i2, 5);
        }
    }

    public static boolean f0(xo7 xo7) {
        if (xo7 instanceof wo7) {
            return fv3.I((wo7) xo7, m27.a);
        }
        StringBuilder p2 = b81.p("ClassicTypeSystemContext couldn't handle: ", xo7, ", ");
        h.j(hl6.m(b26.a, xo7.getClass(), p2));
        return false;
    }

    public static zw3 f1(uq0 uq0, zw3 zw3) {
        if (zw3 instanceof v76) {
            return uq0.h((v76) zw3);
        }
        if (zw3 instanceof bh2) {
            bh2 bh2 = (bh2) zw3;
            return uq0.B0(uq0.h(uq0.j(bh2)), uq0.h(uq0.i(bh2)));
        }
        h.s("sealed");
        return null;
    }

    public static final void g(ek7 ek7, aq4 aq4, fw0 fw0, yt2 yt2, int i2) {
        int i3;
        boolean z;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z2;
        int i8;
        int i9;
        yt2.g0(1873232064);
        if ((i2 & 6) == 0) {
            if (yt2.h(true)) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            i3 = i9 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if ((i2 & 64) == 0) {
                z2 = yt2.g(ek7);
            } else {
                z2 = yt2.i(ek7);
            }
            if (z2) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i3 |= i8;
        }
        if ((i2 & 384) == 0) {
            if (yt2.g(aq4)) {
                i7 = 256;
            } else {
                i7 = 128;
            }
            i3 |= i7;
        }
        if ((i2 & 3072) == 0) {
            if (yt2.h(false)) {
                i6 = 2048;
            } else {
                i6 = 1024;
            }
            i3 |= i6;
        }
        int i10 = i2 & 24576;
        jl4 jl4 = jl4.w;
        if (i10 == 0) {
            if (yt2.g(jl4)) {
                i5 = 16384;
            } else {
                i5 = 8192;
            }
            i3 |= i5;
        }
        if ((196608 & i2) == 0) {
            if (yt2.i(fw0)) {
                i4 = 131072;
            } else {
                i4 = 65536;
            }
            i3 |= i4;
        }
        if ((74899 & i3) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (yt2.V(i3 & 1, z)) {
            Object Q = yt2.Q();
            d63 d63 = ay0.a;
            if (Q == d63) {
                Q = t49.D(yt2);
                yt2.o0(Q);
            }
            o81 o81 = (o81) Q;
            String u2 = l55.u(R.string.tooltip_label, yt2);
            Object Q2 = yt2.Q();
            if (Q2 == d63) {
                Q2 = u55.p(Boolean.FALSE);
                yt2.o0(Q2);
            }
            aq4 aq42 = (aq4) Q2;
            ml4 V = t49.V(sg3.K(d97.a(d97.a(jl4, ek7, new k70(ek7, 0)), ek7, new k70(ek7, 1)).d(new id5(new g5((Object) u2, (Object) o81, (Object) ek7, 5))), new g5((Object) o81, (Object) aq42, (Object) ek7, 4)), new m70(ek7, aq4, aq42, 0));
            lh4 d2 = mb0.d(xb4.y, false);
            int hashCode = Long.hashCode(yt2.T);
            vf5 m2 = yt2.m();
            ml4 E = gw8.E(yt2, V);
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
            f21.r((i3 >> 15) & 14, fw0, yt2, true);
        } else {
            yt2.Y();
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new bi(ek7, aq4, fw0, i2);
        }
    }

    public static boolean g0(xo7 xo7) {
        xo7.getClass();
        if (xo7 instanceof wo7) {
            return ((wo7) xo7).u() instanceof ql4;
        }
        StringBuilder p2 = b81.p("ClassicTypeSystemContext couldn't handle: ", xo7, ", ");
        h.j(hl6.m(b26.a, xo7.getClass(), p2));
        return false;
    }

    public static fu6 g1(v76 v76, boolean z) {
        v76.getClass();
        if (v76 instanceof fu6) {
            return ((fu6) v76).o0(z);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(v76);
        sb.append(", ");
        h.j(hl6.m(b26.a, v76.getClass(), sb));
        return null;
    }

    public static final void h(eq4 eq4, ll4 ll4) {
        eq4 z = O0(ll4).z();
        int i2 = z.y - 1;
        Object[] objArr = z.w;
        if (i2 < objArr.length) {
            while (i2 >= 0) {
                eq4.b((ll4) ((uy3) objArr[i2]).a0.g);
                i2--;
            }
        }
    }

    public static boolean h0(xo7 xo7) {
        ql4 ql4;
        if (xo7 instanceof wo7) {
            vq0 u2 = ((wo7) xo7).u();
            if (u2 instanceof ql4) {
                ql4 = (ql4) u2;
            } else {
                ql4 = null;
            }
            if (ql4 == null || ql4.o() != fl4.x || ql4.v() == iq0.y || ql4.v() == iq0.z || ql4.v() == iq0.A) {
                return false;
            }
            return true;
        }
        StringBuilder p2 = b81.p("ClassicTypeSystemContext couldn't handle: ", xo7, ", ");
        h.j(hl6.m(b26.a, xo7.getClass(), p2));
        return false;
    }

    public static Object h1(gs2 gs2, Object obj, f61 f61) {
        Object obj2;
        gs2.getClass();
        e81 r2 = f61.r();
        if (r2 == x32.w) {
            obj2 = new k66(f61);
        } else {
            obj2 = new h61(f61, r2);
        }
        mp7.Q(2, gs2);
        return gs2.H(obj, obj2);
    }

    public static final int i(dd4 dd4, kb kbVar) {
        long L0;
        dd4 x0 = dd4.x0();
        if (x0 == null) {
            yb3.b("Child of " + dd4 + " cannot be null when calculating alignment line");
        }
        if (dd4.J0().a().containsKey(kbVar)) {
            Integer num = (Integer) dd4.J0().a().get(kbVar);
            if (num != null) {
                return num.intValue();
            }
        } else {
            int X = x0.X(kbVar);
            if (X != Integer.MIN_VALUE) {
                boolean z = dd4.J;
                boolean z2 = dd4.K;
                x0.J = true;
                dd4.K = true;
                dd4.P0();
                x0.J = z;
                dd4.K = z2;
                if (kbVar instanceof h23) {
                    L0 = x0.L0() & 4294967295L;
                } else {
                    L0 = x0.L0() >> 32;
                }
                return X + ((int) L0);
            }
        }
        return Integer.MIN_VALUE;
    }

    public static boolean i0(xo7 xo7) {
        if (xo7 instanceof wo7) {
            return ((wo7) xo7).y();
        }
        StringBuilder p2 = b81.p("ClassicTypeSystemContext couldn't handle: ", xo7, ", ");
        h.j(hl6.m(b26.a, xo7.getClass(), p2));
        return false;
    }

    public static final ll4 j(eq4 eq4) {
        int i2;
        if (eq4 == null || (i2 = eq4.y) == 0) {
            return null;
        }
        return (ll4) eq4.l(i2 - 1);
    }

    public static boolean j0(zw3 zw3) {
        zw3.getClass();
        if (zw3 instanceof vw3) {
            return gr8.N((vw3) zw3);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(zw3);
        sb.append(", ");
        h.j(hl6.m(b26.a, zw3.getClass(), sb));
        return false;
    }

    public static boolean k(xo7 xo7, xo7 xo72) {
        xo7.getClass();
        xo72.getClass();
        if (!(xo7 instanceof wo7)) {
            StringBuilder p2 = b81.p("ClassicTypeSystemContext couldn't handle: ", xo7, ", ");
            h.j(hl6.m(b26.a, xo7.getClass(), p2));
            return false;
        } else if (xo72 instanceof wo7) {
            return xo7.equals(xo72);
        } else {
            StringBuilder p3 = b81.p("ClassicTypeSystemContext couldn't handle: ", xo72, ", ");
            h.j(hl6.m(b26.a, xo72.getClass(), p3));
            return false;
        }
    }

    public static boolean k0(xo7 xo7) {
        ql4 ql4;
        xo7.getClass();
        if (xo7 instanceof wo7) {
            vq0 u2 = ((wo7) xo7).u();
            y18 y18 = null;
            if (u2 instanceof ql4) {
                ql4 = (ql4) u2;
            } else {
                ql4 = null;
            }
            if (ql4 != null) {
                y18 = ql4.v0();
            }
            return y18 instanceof cc3;
        }
        h.j(hl6.m(b26.a, xo7.getClass(), b81.p("ClassicTypeSystemContext couldn't handle: ", xo7, ", ")));
        return false;
    }

    public static int l(zw3 zw3) {
        zw3.getClass();
        if (zw3 instanceof vw3) {
            return ((vw3) zw3).G().size();
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(zw3);
        sb.append(", ");
        h.j(hl6.m(b26.a, zw3.getClass(), sb));
        return 0;
    }

    public static boolean l0(xo7 xo7) {
        xo7.getClass();
        if (xo7 instanceof wo7) {
            return xo7 instanceof ze3;
        }
        StringBuilder p2 = b81.p("ClassicTypeSystemContext couldn't handle: ", xo7, ", ");
        h.j(hl6.m(b26.a, xo7.getClass(), p2));
        return false;
    }

    public static po7 m(v76 v76) {
        v76.getClass();
        if (v76 instanceof fu6) {
            return (po7) v76;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(v76);
        sb.append(", ");
        h.j(hl6.m(b26.a, v76.getClass(), sb));
        return null;
    }

    public static boolean m0(xo7 xo7) {
        if (xo7 instanceof wo7) {
            return xo7 instanceof gg3;
        }
        StringBuilder p2 = b81.p("ClassicTypeSystemContext couldn't handle: ", xo7, ", ");
        h.j(hl6.m(b26.a, xo7.getClass(), p2));
        return false;
    }

    public static nl0 n(uq0 uq0, hu6 hu6) {
        hu6.getClass();
        if (!(hu6 instanceof fu6)) {
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(hu6);
            sb.append(", ");
            h.j(hl6.m(b26.a, hu6.getClass(), sb));
            return null;
        } else if (hu6 instanceof ju6) {
            return uq0.W(((ju6) hu6).x);
        } else {
            if (hu6 instanceof bz4) {
                return (bz4) hu6;
            }
            return null;
        }
    }

    public static boolean n0(zw3 zw3) {
        zw3.getClass();
        if (!(zw3 instanceof fu6) || !((fu6) zw3).Q()) {
            return false;
        }
        return true;
    }

    public static qo1 o(v76 v76) {
        v76.getClass();
        if (!(v76 instanceof fu6)) {
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(v76);
            sb.append(", ");
            h.j(hl6.m(b26.a, v76.getClass(), sb));
            return null;
        } else if (v76 instanceof qo1) {
            return (qo1) v76;
        } else {
            return null;
        }
    }

    public static boolean o0(xo7 xo7) {
        xo7.getClass();
        if (xo7 instanceof wo7) {
            return fv3.I((wo7) xo7, m27.b);
        }
        StringBuilder p2 = b81.p("ClassicTypeSystemContext couldn't handle: ", xo7, ", ");
        h.j(hl6.m(b26.a, xo7.getClass(), p2));
        return false;
    }

    public static zg2 p(zw3 zw3) {
        zw3.getClass();
        if (zw3 instanceof vw3) {
            du7 n0 = ((vw3) zw3).n0();
            if (n0 instanceof zg2) {
                return (zg2) n0;
            }
            return null;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(zw3);
        sb.append(", ");
        h.j(hl6.m(b26.a, zw3.getClass(), sb));
        return null;
    }

    public static boolean p0(zw3 zw3) {
        zw3.getClass();
        if (zw3 instanceof vw3) {
            return iq7.e((vw3) zw3);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(zw3);
        sb.append(", ");
        h.j(hl6.m(b26.a, zw3.getClass(), sb));
        return false;
    }

    public static final String q(long j2) {
        pi7 pi7;
        String str;
        boolean z;
        qd3 qd3 = qd3.y;
        qd3 h2 = tz2.h(j2);
        int i2 = pi7.b;
        ZoneId o2 = ZoneId.systemDefault();
        o2.getClass();
        if (pc7.A(o2)) {
            UtcOffset utcOffset = new UtcOffset(pc7.q(o2));
            pi7 = new hg2(utcOffset, rk0.o(utcOffset.getZoneOffset$kotlinx_datetime()));
        } else {
            try {
                z = o2.getRules().isFixedOffset();
            } catch (ArrayIndexOutOfBoundsException unused) {
                z = false;
            }
            if (z) {
                ZoneId p2 = o2.normalized();
                p2.getClass();
                new UtcOffset(pc7.q(p2));
                pi7 = new pi7(o2);
            } else {
                pi7 = new pi7(o2);
            }
        }
        LocalDateTime x = an.x(h2, pi7);
        int i3 = 12;
        if (x.getHour() < 12) {
            str = "AM";
        } else {
            str = "PM";
        }
        if (x.getHour() % 12 != 0) {
            i3 = x.getHour() % 12;
        }
        String name = x.getMonth().name();
        int day = x.getDay();
        int year = x.getYear();
        String O0 = d57.O0(2, String.valueOf(x.getMinute()));
        StringBuilder sb = new StringBuilder();
        sb.append(name);
        sb.append(" ");
        sb.append(day);
        sb.append(", ");
        sb.append(year);
        sb.append(" at ");
        sb.append(i3);
        sb.append(":");
        sb.append(O0);
        return f21.l(sb, " ", str);
    }

    public static boolean q0(hu6 hu6) {
        if (hu6 instanceof vw3) {
            return fv3.G((vw3) hu6);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(hu6);
        sb.append(", ");
        h.j(hl6.m(b26.a, hu6.getClass(), sb));
        return false;
    }

    public static final my3 r(ll4 ll4) {
        if ((ll4.y & 2) != 0) {
            if (ll4 instanceof my3) {
                return (my3) ll4;
            }
            if (ll4 instanceof wo1) {
                ll4 ll42 = ((wo1) ll4).L;
                while (ll42 != null) {
                    if (ll42 instanceof my3) {
                        return (my3) ll42;
                    }
                    if (!(ll42 instanceof wo1) || (ll42.y & 2) == 0) {
                        ll42 = ll42.B;
                    } else {
                        ll42 = ((wo1) ll42).L;
                    }
                }
            }
        }
        return null;
    }

    public static boolean r0(nl0 nl0) {
        if (nl0 instanceof bz4) {
            return ((bz4) nl0).C;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(nl0);
        sb.append(", ");
        h.j(hl6.m(b26.a, nl0.getClass(), sb));
        return false;
    }

    public static fu6 s(zw3 zw3) {
        zw3.getClass();
        if (zw3 instanceof vw3) {
            du7 n0 = ((vw3) zw3).n0();
            if (n0 instanceof fu6) {
                return (fu6) n0;
            }
            return null;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(zw3);
        sb.append(", ");
        h.j(hl6.m(b26.a, zw3.getClass(), sb));
        return null;
    }

    public static boolean s0(zw3 zw3) {
        zw3.getClass();
        if (zw3 instanceof vw3) {
            return zw3 instanceof jw5;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(zw3);
        sb.append(", ");
        h.j(hl6.m(b26.a, zw3.getClass(), sb));
        return false;
    }

    public static p27 t(zw3 zw3) {
        if (zw3 instanceof vw3) {
            return new p27((vw3) zw3);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(zw3);
        sb.append(", ");
        h.j(hl6.m(b26.a, zw3.getClass(), sb));
        return null;
    }

    public static boolean t0(qo7 qo7) {
        qo7.getClass();
        if (qo7 instanceof xp7) {
            return ((xp7) qo7).c();
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(qo7);
        sb.append(", ");
        h.j(hl6.m(b26.a, qo7.getClass(), sb));
        return false;
    }

    public static fu6 u(v76 v76) {
        ArrayList arrayList;
        List G;
        du7 du7;
        v76 v762 = v76;
        if (v762 instanceof fu6) {
            fu6 fu6 = (fu6) v762;
            s3 s3Var = s3.x;
            if (fu6.G().size() == fu6.L().getParameters().size() && ((G = fu6.G()) == null || !G.isEmpty())) {
                Iterator it = G.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    k28 a2 = ((xp7) it.next()).a();
                    k28 k28 = k28.y;
                    if (a2 != k28) {
                        List parameters = fu6.L().getParameters();
                        parameters.getClass();
                        ArrayList i1 = dt0.i1(G, parameters);
                        arrayList = new ArrayList(et0.e0(i1, 10));
                        Iterator it2 = i1.iterator();
                        while (it2.hasNext()) {
                            yb5 yb5 = (yb5) it2.next();
                            xp7 xp7 = (xp7) yb5.w;
                            qp7 qp7 = (qp7) yb5.x;
                            if (xp7.a() != k28) {
                                if (xp7.c() || xp7.a() != k28.z) {
                                    du7 = null;
                                } else {
                                    du7 = xp7.b().n0();
                                }
                                qp7.getClass();
                                xp7 = new p27((vw3) new bz4(cl0.w, new cz4(xp7, (bt1) null, qp7, 6), du7, (ro7) null, false, 56));
                            }
                            arrayList.add(xp7);
                        }
                        dq7 dq7 = new dq7(yo7.b.f(fu6.L(), arrayList));
                        int size = G.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            xp7 xp72 = (xp7) G.get(i2);
                            xp7 xp73 = (xp7) arrayList.get(i2);
                            if (xp72.a() != k28) {
                                List<vw3> upperBounds = ((qp7) fu6.L().getParameters().get(i2)).getUpperBounds();
                                upperBounds.getClass();
                                ArrayList arrayList2 = new ArrayList();
                                for (vw3 f2 : upperBounds) {
                                    arrayList2.add(s3Var.e0(dq7.f(f2, k28).n0()));
                                }
                                if (!xp72.c() && xp72.a() == k28.A) {
                                    arrayList2.add(s3Var.e0(xp72.b().n0()));
                                }
                                vw3 b2 = xp73.b();
                                b2.getClass();
                                cz4 cz4 = ((bz4) b2).y;
                                cz4.getClass();
                                cz4.x = new bt1(2, arrayList2);
                            }
                        }
                    }
                }
            }
            arrayList = null;
            if (arrayList != null) {
                return kl8.I(fu6.J(), fu6.L(), arrayList, fu6.Q());
            }
            return null;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(v762);
        sb.append(", ");
        h.j(hl6.m(b26.a, v762.getClass(), sb));
        return null;
    }

    public static void u0(v76 v76) {
        v76.getClass();
        if (!(v76 instanceof fu6)) {
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(v76);
            sb.append(", ");
            h.j(hl6.m(b26.a, v76.getClass(), sb));
        }
    }

    public static cl0 v(nl0 nl0) {
        if (nl0 instanceof bz4) {
            return ((bz4) nl0).x;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(nl0);
        sb.append(", ");
        h.j(hl6.m(b26.a, nl0.getClass(), sb));
        return null;
    }

    public static void v0(v76 v76) {
        if (!(v76 instanceof fu6)) {
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(v76);
            sb.append(", ");
            h.j(hl6.m(b26.a, v76.getClass(), sb));
        }
    }

    public static pl0 w(long j2, yt2 yt2, int i2) {
        long j3;
        long b2 = st0.b(j2, yt2);
        long j4 = jt0.g;
        long b3 = jt0.b(0.38f, b2);
        pl0 M = M(((zg4) yt2.k(ch4.b)).a);
        if (j2 != 16) {
            j3 = j2;
        } else {
            j3 = M.a;
        }
        if (b2 == 16) {
            b2 = M.b;
        }
        long j5 = b2;
        if (j4 == 16) {
            j4 = M.c;
        }
        long j6 = j4;
        if (b3 == 16) {
            b3 = M.d;
        }
        return new pl0(j3, j5, j6, b3);
    }

    public static final ml4 w0(ml4 ml4, String str) {
        return ml4.d(new hy3(str));
    }

    public static ql0 x(int i2, float f2) {
        if ((i2 & 1) != 0) {
            f2 = 0.0f;
        }
        return new ql0(f2, rj1.B, rj1.A);
    }

    public static fu6 x0(bh2 bh2) {
        if (bh2 instanceof zg2) {
            return ((zg2) bh2).x;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(bh2);
        sb.append(", ");
        h.j(hl6.m(b26.a, bh2.getClass(), sb));
        return null;
    }

    public static void y(h31 h31, x64 x64, g31 g31) {
        g31.n = -1;
        h21 h21 = g31.L;
        int[] iArr = g31.o0;
        h21 h212 = g31.K;
        h21 h213 = g31.I;
        h21 h214 = g31.J;
        h21 h215 = g31.H;
        g31.o = -1;
        int[] iArr2 = h31.o0;
        if (iArr2[0] != 2 && iArr[0] == 4) {
            int i2 = h215.g;
            int n2 = h31.n() - h214.g;
            h215.i = x64.k(h215);
            h214.i = x64.k(h214);
            x64.d(h215.i, i2);
            x64.d(h214.i, n2);
            g31.n = 2;
            g31.X = i2;
            int i3 = n2 - i2;
            g31.T = i3;
            int i4 = g31.a0;
            if (i3 < i4) {
                g31.T = i4;
            }
        }
        if (iArr2[1] != 2 && iArr[1] == 4) {
            int i5 = h213.g;
            int k2 = h31.k() - h212.g;
            h213.i = x64.k(h213);
            h212.i = x64.k(h212);
            x64.d(h213.i, i5);
            x64.d(h212.i, k2);
            if (g31.Z > 0 || g31.f0 == 8) {
                ly6 k3 = x64.k(h21);
                h21.i = k3;
                x64.d(k3, g31.Z + i5);
            }
            g31.o = 2;
            g31.Y = i5;
            int i6 = k2 - i5;
            g31.U = i6;
            int i7 = g31.b0;
            if (i6 < i7) {
                g31.U = i7;
            }
        }
    }

    public static du7 y0(nl0 nl0) {
        if (nl0 instanceof bz4) {
            return ((bz4) nl0).z;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(nl0);
        sb.append(", ");
        h.j(hl6.m(b26.a, nl0.getClass(), sb));
        return null;
    }

    public static final aq4 z(ef3 ef3, yt2 yt2, int i2) {
        boolean z;
        Object Q = yt2.Q();
        d63 d63 = ay0.a;
        if (Q == d63) {
            Q = u55.p(Boolean.FALSE);
            yt2.o0(Q);
        }
        aq4 aq4 = (aq4) Q;
        if ((((i2 & 14) ^ 6) <= 4 || !yt2.g(ef3)) && (i2 & 6) != 4) {
            z = false;
        } else {
            z = true;
        }
        Object Q2 = yt2.Q();
        if (z || Q2 == d63) {
            Q2 = new ju1(ef3, aq4, (f61) null, 4);
            yt2.o0(Q2);
        }
        t49.h((gs2) Q2, yt2, ef3);
        return aq4;
    }

    public static du7 z0(zw3 zw3) {
        if (zw3 instanceof du7) {
            return o85.m((du7) zw3, false);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(zw3);
        sb.append(", ");
        h.j(hl6.m(b26.a, zw3.getClass(), sb));
        return null;
    }
}
