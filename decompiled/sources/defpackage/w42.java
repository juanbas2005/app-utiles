package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.io.Closeable;
import java.util.List;

/* renamed from: w42  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class w42 extends a97 implements gs2 {
    public final /* synthetic */ int A = 1;
    public int B;
    public int C;
    public int D;
    public /* synthetic */ Object E;
    public Object F;
    public Object G;
    public Object H;
    public Object I;
    public Object J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object M;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public w42(x42 x42, r42 r42, v75 v75, List list, g72 g72, s83 s83, f61 f61) {
        super(2, f61);
        this.J = x42;
        this.K = r42;
        this.I = v75;
        this.G = list;
        this.L = g72;
        this.M = s83;
    }

    public final Object H(Object obj, Object obj2) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        switch (i) {
            case b85.b:
                return ((w42) o((f61) obj2, (o81) obj)).s(vs7);
            default:
                return ((w42) o((f61) obj2, (ff8) obj)).s(vs7);
        }
    }

    public final f61 o(f61 f61, Object obj) {
        int i = this.A;
        Object obj2 = this.M;
        Object obj3 = this.L;
        Object obj4 = this.K;
        switch (i) {
            case b85.b:
                w42 w42 = new w42((x42) this.J, (r42) obj4, (v75) this.I, (List) this.G, (g72) obj3, (s83) obj2, f61);
                w42.E = obj;
                return w42;
            default:
                w42 w422 = new w42((ed0) obj4, (e81) obj3, (md2) obj2, f61);
                w422.E = obj;
                return w422;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: f06} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: f06} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v5, resolved type: f06} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v2, resolved type: ed0} */
    /* JADX WARNING: type inference failed for: r14v0, types: [java.lang.Object, java.nio.channels.Channel] */
    /* JADX WARNING: type inference failed for: r14v1 */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00d1, code lost:
        if (r13.c(r0) != r11) goto L_0x003c;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x008f A[Catch:{ all -> 0x00d5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00f2  */
    public final Object s(Object obj) {
        Bitmap bitmap;
        o81 o81;
        List list;
        v75 v75;
        int i;
        int i2;
        Closeable closeable;
        Throwable th;
        e81 e81;
        md2 md2;
        ed0 ed0;
        f06 f06;
        int i3;
        int i4;
        e81 e812;
        md2 md22;
        ed0 ed02;
        f06 f062;
        Closeable closeable2;
        int i5 = this.A;
        Object obj2 = this.M;
        Object obj3 = this.L;
        Object obj4 = this.K;
        int i6 = 0;
        Throwable th2 = null;
        switch (i5) {
            case b85.b:
                g72 g72 = (g72) obj3;
                v75 v752 = (v75) this.I;
                r42 r42 = (r42) obj4;
                int i7 = this.D;
                if (i7 == 0) {
                    o85.q(obj);
                    o81 = (o81) this.E;
                    Drawable drawable = r42.a;
                    if (drawable instanceof BitmapDrawable) {
                        Bitmap bitmap2 = ((BitmapDrawable) drawable).getBitmap();
                        Bitmap.Config config = bitmap2.getConfig();
                        if (config == null) {
                            config = Bitmap.Config.ARGB_8888;
                        }
                        if (qs.F0(config, i.a)) {
                            bitmap = bitmap2;
                            g72.getClass();
                            list = this.G;
                            v75 = v752;
                            i2 = list.size();
                            i = 0;
                        }
                    }
                    bitmap = su0.j(drawable, v752.b, v752.d, v752.e, v752.f);
                    g72.getClass();
                    list = this.G;
                    v75 = v752;
                    i2 = list.size();
                    i = 0;
                } else if (i7 == 1) {
                    i2 = this.C;
                    int i8 = this.B;
                    v75 = (v75) this.H;
                    list = (List) this.F;
                    o81 = (o81) this.E;
                    o85.q(obj);
                    bitmap = (Bitmap) obj;
                    r16.x(o81.k());
                    i = i8 + 1;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                if (i >= i2) {
                    g72.getClass();
                    return new r42(new BitmapDrawable(((s83) obj2).a.getResources(), bitmap), r42.b, r42.c, r42.d);
                } else if (list.get(i) != null) {
                    ku4.a();
                    return null;
                } else {
                    uu6 uu6 = v75.d;
                    this.E = o81;
                    this.F = list;
                    this.H = v75;
                    this.B = i;
                    this.C = i2;
                    this.D = 1;
                    throw null;
                }
            default:
                ff8 ff8 = (ff8) this.E;
                int i9 = this.D;
                Object obj5 = p81.w;
                if (i9 != 0) {
                    if (i9 == 1) {
                        i4 = this.C;
                        i3 = this.B;
                        f06 = (f06) this.J;
                        ed0 = (ed0) this.I;
                        md2 = (md2) this.H;
                        e81 = (e81) this.G;
                        closeable = (Closeable) this.F;
                        o85.q(obj);
                        fg0 fg0 = ff8.w;
                        this.E = ff8;
                        this.F = closeable;
                        this.G = e81;
                        this.H = md2;
                        this.I = ed0;
                        this.J = f06;
                        this.B = i3;
                        this.C = i4;
                        this.D = 2;
                        break;
                    } else if (i9 == 2) {
                        i4 = this.C;
                        i3 = this.B;
                        f06 = (f06) this.J;
                        ed0 = (ed0) this.I;
                        md2 = (md2) this.H;
                        e81 = (e81) this.G;
                        closeable = (Closeable) this.F;
                        try {
                            o85.q(obj);
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    } else {
                        h.s("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    o85.q(obj);
                    closeable = (ed0) obj4;
                    md22 = (md2) obj2;
                    e812 = (e81) obj3;
                    f062 = new Object();
                    i4 = 0;
                    closeable2 = closeable;
                    ed02 = closeable2;
                    if (!ed02.isOpen() || !r16.X(e812) || f062.w < 0) {
                        if (closeable2 != null) {
                            try {
                                closeable2.close();
                            } catch (Throwable th4) {
                                th2 = th4;
                            }
                        }
                        if (th2 != null) {
                            return vs7.a;
                        }
                        throw th2;
                    }
                    fg0 fg02 = ff8.w;
                    qj qjVar = new qj((Object) f062, (Object) ed02, (Object) md22, (Object) e812, 13);
                    e81 e813 = e812;
                    this.E = ff8;
                    this.F = closeable2;
                    this.G = e813;
                    this.H = md22;
                    this.I = ed02;
                    this.J = f062;
                    this.B = i6;
                    this.C = i4;
                    this.D = 1;
                    if (x91.U(fg02, qjVar, this) != obj5) {
                        closeable = closeable2;
                        e81 = e813;
                        i3 = i6;
                        f06 = f062;
                        ed0 = ed02;
                        md2 = md22;
                        fg0 fg03 = ff8.w;
                        this.E = ff8;
                        this.F = closeable;
                        this.G = e81;
                        this.H = md2;
                        this.I = ed0;
                        this.J = f06;
                        this.B = i3;
                        this.C = i4;
                        this.D = 2;
                    }
                    return obj5;
                }
                f062 = f06;
                ed02 = ed0;
                md22 = md2;
                e812 = e81;
                i6 = i3;
                closeable2 = closeable;
                try {
                    if (!ed02.isOpen() || !r16.X(e812) || f062.w < 0) {
                    }
                } catch (Throwable th5) {
                    th = th5;
                    closeable = closeable2;
                    if (closeable != null) {
                        try {
                            closeable.close();
                        } catch (Throwable th6) {
                            su0.b(th, th6);
                        }
                    }
                    th2 = th;
                    if (th2 != null) {
                    }
                }
                break;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public w42(ed0 ed0, e81 e81, md2 md2, f61 f61) {
        super(2, f61);
        this.K = ed0;
        this.L = e81;
        this.M = md2;
    }
}
