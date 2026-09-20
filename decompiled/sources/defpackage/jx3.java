package defpackage;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.SerializationException;

/* renamed from: jx3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class jx3 {
    public final pl3 a;
    public final ArrayList b;

    public jx3(pl3 pl3) {
        pl3.getClass();
        this.a = pl3;
        List<kx3> list = ka2.a;
        ArrayList arrayList = new ArrayList();
        for (kx3 kx3 : list) {
            kx3.getClass();
            arrayList.add(new px3(pl3));
        }
        this.b = arrayList;
        if (!(this.a instanceof pl3)) {
            ku4.w(this.a, " is not supported.", "Only binary and string formats are supported, ");
            throw null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00aa A[Catch:{ all -> 0x00d3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b5 A[Catch:{ all -> 0x00d3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002d  */
    public final Object a(Charset charset, fp7 fp7, hf0 hf0, h61 h61) {
        ex3 ex3;
        ex3 ex32;
        int i;
        ArrayList arrayList;
        pl3 pl3;
        p81 p81;
        Charset charset2;
        zr3 zr3;
        fp7 fp72;
        hf0 hf02;
        Object J0;
        h61 h612 = h61;
        if (h612 instanceof ex3) {
            ex3 = (ex3) h612;
            int i2 = ex3.F;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ex3.F = i2 - Integer.MIN_VALUE;
                ex32 = ex3;
                Object obj = ex32.D;
                i = ex32.F;
                arrayList = this.b;
                pl3 = this.a;
                p81 = p81.w;
                if (i != 0) {
                    o85.q(obj);
                    fp72 = fp7;
                    hf0 hf03 = hf0;
                    m41 m41 = new m41(new ze1(1, arrayList), charset, fp72, hf03, 1);
                    o41 o41 = new o41(hf03, (f61) null, 1);
                    ex32.z = charset;
                    ex32.A = fp72;
                    ex32.B = hf03;
                    ex32.F = 1;
                    obj = gr8.K(m41, o41, ex32);
                    if (obj != p81) {
                        charset2 = charset;
                        hf02 = hf03;
                    }
                    return p81;
                } else if (i == 1) {
                    hf02 = ex32.B;
                    fp7 fp73 = ex32.A;
                    Charset charset3 = ex32.z;
                    o85.q(obj);
                    Charset charset4 = charset3;
                    fp72 = fp73;
                    charset2 = charset4;
                } else if (i == 2) {
                    zr3 = ex32.C;
                    charset2 = ex32.z;
                    o85.q(obj);
                    py6 py6 = (py6) obj;
                    try {
                        if (!(pl3 instanceof pl3)) {
                            return pl3.b(zr3, z65.L(py6, charset2, 2));
                        }
                        su0.m(py6, Long.MAX_VALUE);
                        throw new IllegalStateException(("Unsupported format " + pl3).toString());
                    } catch (Throwable th) {
                        Throwable th2 = th;
                        String message = th2.getMessage();
                        throw new Exception("Illegal input: " + message, th2);
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                if (arrayList.isEmpty() && (obj != null || hf02.h())) {
                    return obj;
                }
                zr3 x = z85.x(pl3.b, fp72);
                ex32.z = charset2;
                ex32.A = null;
                ex32.B = null;
                ex32.C = x;
                ex32.F = 2;
                J0 = rc9.J0(hf02, ex32);
                if (J0 != p81) {
                    Object obj2 = J0;
                    zr3 = x;
                    obj = obj2;
                    py6 py62 = (py6) obj;
                    if (!(pl3 instanceof pl3)) {
                    }
                }
                return p81;
            }
        }
        ex3 = new ex3(this, h612);
        ex32 = ex3;
        Object obj3 = ex32.D;
        i = ex32.F;
        arrayList = this.b;
        pl3 = this.a;
        p81 = p81.w;
        if (i != 0) {
        }
        if (arrayList.isEmpty()) {
        }
        zr3 x2 = z85.x(pl3.b, fp72);
        ex32.z = charset2;
        ex32.A = null;
        ex32.B = null;
        ex32.C = x2;
        ex32.F = 2;
        J0 = rc9.J0(hf02, ex32);
        if (J0 != p81) {
        }
        return p81;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x006e A[SYNTHETIC, Splitter:B:19:0x006e] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    public final Object b(q51 q51, Charset charset, fp7 fp7, Object obj, h61 h61) {
        ix3 ix3;
        int i;
        Object obj2;
        fp7 fp72;
        j85 j85;
        zr3 zr3;
        h61 h612 = h61;
        pl3 pl3 = this.a;
        if (h612 instanceof ix3) {
            ix3 = (ix3) h612;
            int i2 = ix3.F;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ix3.F = i2 - Integer.MIN_VALUE;
                Object obj3 = ix3.D;
                i = ix3.F;
                if (i != 0) {
                    o85.q(obj3);
                    Object obj4 = obj;
                    hx3 hx3 = new hx3(new ze1(1, this.b), q51, charset, fp7, obj4);
                    da0 da0 = new da0(2, (f61) null, 2);
                    ix3.z = q51;
                    ix3.A = charset;
                    ix3.B = fp7;
                    ix3.C = obj4;
                    ix3.F = 1;
                    obj3 = gr8.K(hx3, da0, ix3);
                    p81 p81 = p81.w;
                    if (obj3 == p81) {
                        return p81;
                    }
                    fp72 = fp7;
                    obj2 = obj4;
                } else if (i == 1) {
                    obj2 = ix3.C;
                    fp7 fp73 = ix3.B;
                    charset = ix3.A;
                    q51 q512 = ix3.z;
                    o85.q(obj3);
                    fp72 = fp73;
                    q51 = q512;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j85 = (j85) obj3;
                if (j85 == null) {
                    return j85;
                }
                try {
                    zr3 = z85.x(pl3.b, fp72);
                } catch (SerializationException unused) {
                    zr3 = z85.q(obj2, pl3.b);
                }
                if (pl3 instanceof pl3) {
                    return new vc7(pl3.d(zr3, obj2), t51.b(q51, charset));
                }
                ta1.l("Unsupported format ", pl3);
                return null;
            }
        }
        ix3 = new ix3(this, h612);
        Object obj32 = ix3.D;
        i = ix3.F;
        if (i != 0) {
        }
        j85 = (j85) obj32;
        if (j85 == null) {
        }
    }
}
