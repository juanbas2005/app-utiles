package defpackage;

/* renamed from: qw6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class qw6 {
    public final qq4 a = new qq4();
    public final ed5 b = u55.p((Object) null);

    public static Object b(qw6 qw6, String str, String str2, a97 a97, int i) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        int i2 = i & 8;
        kw6 kw6 = kw6.w;
        if (!(i2 == 0 || str2 == null)) {
            kw6 = kw6.x;
        }
        qw6.getClass();
        return qw6.a(new ow6(str, str2, kw6), a97);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004e, code lost:
        if (r9 == r6) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006f, code lost:
        if (r9 != r6) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0071, code lost:
        return r6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    public final Object a(ow6 ow6, h61 h61) {
        pw6 pw6;
        int i;
        oq4 oq4;
        oq4 oq42;
        qq4 qq4;
        oq4 oq43;
        if (h61 instanceof pw6) {
            pw6 = (pw6) h61;
            int i2 = pw6.D;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pw6.D = i2 - Integer.MIN_VALUE;
                Object obj = pw6.B;
                i = pw6.D;
                ed5 ed5 = this.b;
                p81 p81 = p81.w;
                if (i != 0) {
                    o85.q(obj);
                    pw6.z = ow6;
                    qq4 qq42 = this.a;
                    pw6.A = qq42;
                    pw6.D = 1;
                    Object a2 = qq42.a(pw6);
                    qq4 = qq42;
                } else if (i == 1) {
                    oq4 oq44 = pw6.A;
                    ow6 = pw6.z;
                    o85.q(obj);
                    qq4 = oq44;
                } else if (i == 2) {
                    oq4 oq45 = pw6.A;
                    try {
                        oq43 = oq45;
                        o85.q(obj);
                        oq43 = oq45;
                        oq42 = oq45;
                        oq4 = oq42;
                        ed5.setValue((Object) null);
                        oq4 = oq42;
                        oq42.k((Object) null);
                        return obj;
                    } catch (Throwable th) {
                        oq4.k((Object) null);
                        throw th;
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oq43 = qq4;
                pw6.z = ow6;
                pw6.A = qq4;
                pw6.D = 2;
                kk0 kk0 = new kk0(1, rc9.a0(pw6));
                kk0.v();
                ed5.setValue(new nw6(ow6, kk0));
                obj = kk0.t();
                oq42 = qq4;
            }
        }
        pw6 = new pw6(this, h61);
        Object obj2 = pw6.B;
        i = pw6.D;
        ed5 ed52 = this.b;
        p81 p812 = p81.w;
        if (i != 0) {
        }
        oq43 = qq4;
        pw6.z = ow6;
        pw6.A = qq4;
        pw6.D = 2;
        kk0 kk02 = new kk0(1, rc9.a0(pw6));
        kk02.v();
        ed52.setValue(new nw6(ow6, kk02));
        obj2 = kk02.t();
        oq42 = qq4;
    }
}
