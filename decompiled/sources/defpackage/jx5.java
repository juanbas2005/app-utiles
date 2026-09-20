package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: jx5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class jx5 {
    public final Context a;
    public final bn1 b;
    public final z97 c;
    public final p83 d;
    public final kg5 e;
    public final zv0 f;
    public final ArrayList g;

    public jx5(Context context, bn1 bn1, z97 z97, z97 z972, nz3 nz3, zv0 zv0, p83 p83) {
        p83 p832 = p83;
        this.a = context;
        this.b = bn1;
        this.c = z97;
        this.d = p832;
        w77 d2 = b85.d();
        dn1 dn1 = aw1.a;
        gl0.E(rc9.D0(d2, pe4.a.B).X(new v81(this)));
        da7 da7 = new da7(this);
        kg5 kg5 = new kg5(this, da7);
        this.e = kg5;
        o9 o9Var = new o9(zv0);
        o9Var.f(new ke0(2), g73.class);
        o9Var.f(new ke0(5), String.class);
        Class<Uri> cls = Uri.class;
        o9Var.f(new ke0(1), cls);
        o9Var.f(new ke0(4), cls);
        o9Var.f(new ke0(3), Integer.class);
        o9Var.f(new ke0(0), byte[].class);
        Object obj = new Object();
        ArrayList arrayList = (ArrayList) o9Var.x;
        arrayList.add(new yb5(obj, cls));
        Class<File> cls2 = File.class;
        arrayList.add(new yb5(new yc2(p832.a), cls2));
        nz3 nz32 = nz3;
        o9Var.g(new b73(nz32, z972, p832.c), cls);
        o9Var.g(new zs(5), cls2);
        o9Var.g(new zs(0), cls);
        o9Var.g(new zs(3), cls);
        o9Var.g(new zs(6), cls);
        o9Var.g(new zs(4), Drawable.class);
        o9Var.g(new zs(1), Bitmap.class);
        o9Var.g(new zs(2), ByteBuffer.class);
        o90 o90 = new o90(p832.d, p832.e);
        ArrayList arrayList2 = (ArrayList) o9Var.B;
        arrayList2.add(o90);
        List P = tf4.P((ArrayList) o9Var.y);
        List P2 = tf4.P((ArrayList) o9Var.z);
        List P3 = tf4.P(arrayList);
        List list = P;
        List list2 = P2;
        List list3 = P3;
        this.f = new zv0(list, list2, list3, tf4.P((ArrayList) o9Var.A), tf4.P(arrayList2));
        this.g = dt0.N0(list, new x42(this, da7, kg5));
        new AtomicBoolean(false);
    }

    /* JADX WARNING: type inference failed for: r0v9, types: [t83] */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b9, code lost:
        if (defpackage.gw8.i(r0, r2) == r8) goto L_0x0125;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x019d A[Catch:{ all -> 0x019b }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00cc A[Catch:{ all -> 0x00d0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00df A[Catch:{ all -> 0x00d0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x012e A[Catch:{ all -> 0x015a }] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x015c A[Catch:{ all -> 0x015a }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x018c A[Catch:{ all -> 0x019b }] */
    /* JADX WARNING: Unknown variable types count: 1 */
    public static final Object a(jx5 jx5, s83 s83, int i, h61 h61) {
        ix5 ix5;
        Object obj;
        int i2;
        Object obj2;
        g72 g72;
        b60 b60;
        s83 s832;
        s62 s62;
        jx5 jx52;
        g72 g722;
        g72 g723;
        ? r0;
        Bitmap bitmap;
        g72 g724;
        s83 s833;
        b60 b602;
        tb7 tb7;
        jx5 jx53;
        jx5 jx54 = jx5;
        h61 h612 = h61;
        if (h612 instanceof ix5) {
            ix5 = (ix5) h612;
            int i3 = ix5.G;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                ix5.G = i3 - Integer.MIN_VALUE;
                obj = ix5.E;
                i2 = ix5.G;
                obj2 = p81.w;
                if (i2 != 0) {
                    o85.q(obj);
                    kg5 kg5 = jx54.e;
                    e81 e81 = ix5.x;
                    e81.getClass();
                    el3 Q = r16.Q(e81);
                    kg5.getClass();
                    s83 s834 = s83;
                    in8 in8 = s834.v;
                    b60 b603 = new b60(in8, Q);
                    r83 a2 = s83.a(s834);
                    a2.b = jx54.b;
                    a2.r = null;
                    s832 = a2.a();
                    g72 = g72.a;
                    try {
                        if (s832.b != me6.H) {
                            in8.x0(b603);
                            if (i == 0) {
                                in8 in82 = s832.v;
                                ix5.z = jx54;
                                ix5.A = b603;
                                ix5.B = s832;
                                ix5.C = g72;
                                ix5.G = 1;
                            }
                            b602 = b603;
                        } else {
                            throw new RuntimeException("The request's data is null.");
                        }
                    } catch (Throwable th) {
                        th = th;
                        b60 = b603;
                        if (th instanceof CancellationException) {
                        }
                    }
                } else if (i2 == 1) {
                    g72 g725 = ix5.C;
                    s832 = ix5.B;
                    b602 = ix5.A;
                    jx53 = ix5.z;
                    try {
                        o85.q(obj);
                        g72 = g725;
                        jx54 = jx53;
                    } catch (Throwable th2) {
                        th = th2;
                        g72 = g725;
                        b60 = b602;
                        jx54 = jx53;
                        if (th instanceof CancellationException) {
                        }
                    }
                } else if (i2 == 2) {
                    Bitmap bitmap2 = ix5.D;
                    g72 g726 = ix5.C;
                    s83 s835 = ix5.B;
                    b602 = ix5.A;
                    jx53 = ix5.z;
                    try {
                        o85.q(obj);
                        bitmap = bitmap2;
                        g724 = g726;
                        s833 = s835;
                        jx52 = jx53;
                        try {
                            g724.getClass();
                            h81 h81 = s833.r;
                            w6 w6Var = new w6(s833, jx52, (uu6) obj, g724, bitmap, (f61) null, 13);
                            g722 = g724;
                            try {
                                ix5.z = jx52;
                                ix5.A = b602;
                                ix5.B = s833;
                                ix5.C = g722;
                                ix5.D = null;
                                ix5.G = 3;
                                obj = ar7.e0(h81, w6Var, ix5);
                                if (obj != obj2) {
                                    b60 = b602;
                                    s832 = s833;
                                    r0 = (t83) obj;
                                    if (!(r0 instanceof f77)) {
                                    }
                                    return s62;
                                }
                                return obj2;
                            } catch (Throwable th3) {
                                th = th3;
                                g723 = g722;
                                b60 = b602;
                                s832 = s833;
                                jx54 = jx52;
                                if (th instanceof CancellationException) {
                                }
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            g722 = g724;
                            g723 = g722;
                            b60 = b602;
                            s832 = s833;
                            jx54 = jx52;
                            if (th instanceof CancellationException) {
                            }
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        g72 = g726;
                        s832 = s835;
                        b60 = b602;
                        jx54 = jx53;
                        if (th instanceof CancellationException) {
                        }
                    }
                } else if (i2 == 3) {
                    g722 = ix5.C;
                    s832 = ix5.B;
                    b60 = ix5.A;
                    jx5 jx55 = ix5.z;
                    try {
                        o85.q(obj);
                        jx52 = jx55;
                        try {
                            r0 = (t83) obj;
                            if (!(r0 instanceof f77)) {
                                f77 f77 = r0;
                                tb7 tb72 = s832.c;
                                jx52.getClass();
                                s83 s836 = f77.b;
                                if (tb72 instanceof rt) {
                                    lm7 a3 = s836.h.a((rt) tb72, f77);
                                    if (!(a3 instanceof m05)) {
                                        g722.getClass();
                                        a3.a();
                                    }
                                }
                                g722.getClass();
                                s836.getClass();
                                s62 = r0;
                            } else if (r0 instanceof s62) {
                                tb7 tb73 = s832.c;
                                jx52.getClass();
                                b(r0, tb73, g722);
                                s62 = r0;
                            } else {
                                throw new RuntimeException();
                            }
                        } catch (Throwable th6) {
                            th = th6;
                            g723 = g722;
                            jx54 = jx52;
                            try {
                                if (th instanceof CancellationException) {
                                }
                            } finally {
                                b60.w.M0(b60);
                            }
                        }
                    } catch (Throwable th7) {
                        th = th7;
                        g72 = g722;
                        jx54 = jx55;
                        if (th instanceof CancellationException) {
                        }
                    }
                    return s62;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                if (((nx5) jx54.c.getValue()) != null) {
                    s832.getClass();
                }
                s832.A.getClass();
                bn1 bn1 = g.a;
                tb7 = s832.c;
                if (tb7 != null) {
                    tb7.c((Drawable) null);
                }
                g72.getClass();
                av6 av6 = s832.w;
                ix5.z = jx54;
                ix5.A = b602;
                ix5.B = s832;
                ix5.C = g72;
                ix5.D = null;
                ix5.G = 2;
                obj = av6.z(ix5);
                if (obj != obj2) {
                    jx52 = jx54;
                    s833 = s832;
                    bitmap = null;
                    g724 = g72;
                    g724.getClass();
                    h81 h812 = s833.r;
                    w6 w6Var2 = new w6(s833, jx52, (uu6) obj, g724, bitmap, (f61) null, 13);
                    g722 = g724;
                    ix5.z = jx52;
                    ix5.A = b602;
                    ix5.B = s833;
                    ix5.C = g722;
                    ix5.D = null;
                    ix5.G = 3;
                    obj = ar7.e0(h812, w6Var2, ix5);
                    if (obj != obj2) {
                    }
                }
                return obj2;
            }
        }
        ix5 = new ix5(jx54, h612);
        obj = ix5.E;
        i2 = ix5.G;
        obj2 = p81.w;
        if (i2 != 0) {
        }
        try {
            if (((nx5) jx54.c.getValue()) != null) {
            }
            s832.A.getClass();
            bn1 bn12 = g.a;
            tb7 = s832.c;
            if (tb7 != null) {
            }
            g72.getClass();
            av6 av62 = s832.w;
            ix5.z = jx54;
            ix5.A = b602;
            ix5.B = s832;
            ix5.C = g72;
            ix5.D = null;
            ix5.G = 2;
            obj = av62.z(ix5);
            if (obj != obj2) {
            }
            return obj2;
        } catch (Throwable th8) {
            th = th8;
            b60 = b602;
            if (th instanceof CancellationException) {
                jx54.e.getClass();
                s62 n = kg5.n(s832, th);
                b(n, s832.c, g72);
                s62 = n;
                return s62;
            }
            jx54.getClass();
            g72.getClass();
            s832.getClass();
            throw th;
        }
    }

    public static void b(s62 s62, tb7 tb7, g72 g72) {
        s83 s83 = s62.b;
        if (tb7 instanceof rt) {
            lm7 a2 = s83.h.a((rt) tb7, s62);
            if (!(a2 instanceof m05)) {
                g72.getClass();
                a2.a();
            }
        }
        g72.getClass();
        s83.getClass();
    }
}
