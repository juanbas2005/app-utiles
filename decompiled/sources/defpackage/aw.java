package defpackage;

import java.util.List;

/* renamed from: aw  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class aw extends i77 {
    public final xv d;
    public final vr2 e;
    public final boolean f;

    /* JADX WARNING: Illegal instructions before constructor call */
    public aw(n77 n77, xv xvVar) {
        super(r0.a, r0.b, n77);
        n77.getClass();
        vv vvVar = xvVar.a;
        this.d = xvVar;
        this.e = xvVar.c.a;
        this.f = xvVar.b.a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0053, code lost:
        if (r9 == r5) goto L_0x006b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    public final Object b(String str, vr2 vr2, h61 h61) {
        zv zvVar;
        int i;
        String str2;
        if (h61 instanceof zv) {
            zvVar = (zv) h61;
            int i2 = zvVar.D;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zvVar.D = i2 - Integer.MIN_VALUE;
                Object obj = zvVar.B;
                i = zvVar.D;
                p81 p81 = p81.w;
                if (i != 0) {
                    o85.q(obj);
                    f96 f96 = this.d.b.b;
                    zvVar.z = str;
                    zvVar.A = vr2;
                    zvVar.D = 1;
                    obj = dh4.A((j77) f96.x, !this.f, zvVar);
                } else if (i == 1) {
                    vr2 = zvVar.A;
                    str = zvVar.z;
                    o85.q(obj);
                } else if (i == 2) {
                    o85.q(obj);
                    return obj;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str2 = (String) obj;
                if (str2 == null) {
                    g5 g5Var = new g5((Object) str2, (Object) this, vr2, 1);
                    zvVar.z = null;
                    zvVar.A = null;
                    zvVar.D = 2;
                    Object c = i77.c(this, str, g5Var, zvVar);
                    if (c == p81) {
                        return p81;
                    }
                    return c;
                }
                str.getClass();
                List list = q47.a;
                throw new Exception("You need to be logged in to perform this request\nURL: ".concat(q47.b(j45.e(str).b())));
            }
        }
        zvVar = new zv(this, h61);
        Object obj2 = zvVar.B;
        i = zvVar.D;
        p81 p812 = p81.w;
        if (i != 0) {
        }
        str2 = (String) obj2;
        if (str2 == null) {
        }
    }

    public final aw d(String str) {
        xv xvVar = this.d;
        return new aw(this.c, xv.a(xvVar, new vv(new m0(4, this, str), xvVar.a.b), (wv) null, 6));
    }

    public final aw e(vr2 vr2) {
        xv xvVar = this.d;
        return new aw(this.c, xv.a(xvVar, (vv) null, new wv(new m0(3, this, vr2), xvVar.c.b), 3));
    }
}
