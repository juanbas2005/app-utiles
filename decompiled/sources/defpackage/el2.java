package defpackage;

/* renamed from: el2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class el2 implements dl2 {
    public final xb4 a;
    public final dg b;
    public final kg5 c;
    public final hl2 d;
    public final br4 e;

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, hl2] */
    public el2(xb4 xb4, dg dgVar) {
        kg5 kg5 = fl2.a;
        ? obj = new Object();
        v81 v81 = hl2.a;
        gy2 gy2 = yv1.a;
        v81.getClass();
        gl0.E(rc9.D0(v81, gy2).X(x32.w).X(new fl3((el3) null)));
        br4 br4 = new br4(4, (byte) 0);
        this.a = xb4;
        this.b = dgVar;
        this.c = kg5;
        this.d = obj;
        this.e = br4;
        new gg0(26, (Object) this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r5.d.getClass();
        r1 = r6.a;
        r5 = (defpackage.fk5) r5.e.x;
        r2 = r6.c;
        r3 = r6.b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0038, code lost:
        if (r1 == null) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003c, code lost:
        if ((r1 instanceof defpackage.sl1) == false) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0041, code lost:
        if ((r1 instanceof defpackage.fv2) == false) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0043, code lost:
        r5 = r5.d((defpackage.fv2) r1, r3, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004a, code lost:
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004c, code lost:
        r5 = r5.b(r3, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0055, code lost:
        r5 = new defpackage.wq7(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0056, code lost:
        if (r5 == null) goto L_0x0079;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0058, code lost:
        r1 = (defpackage.jv2) r0.x;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005c, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0065, code lost:
        if (((defpackage.kd4) r0.y).h(r6) != null) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0069, code lost:
        if (r5.x == false) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x006b, code lost:
        ((defpackage.kd4) r0.y).l(r6, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0075, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0076, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0080, code lost:
        throw new java.lang.IllegalStateException("Could not load font");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0081, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0089, code lost:
        throw new java.lang.IllegalStateException("Could not load font", r5);
     */
    public final wq7 a(vq7 vq7) {
        kg5 kg5 = this.c;
        synchronized (((jv2) kg5.x)) {
            wq7 wq7 = (wq7) ((kd4) kg5.y).h(vq7);
            if (wq7 != null) {
                if (wq7.x) {
                    return wq7;
                }
                wq7 wq72 = (wq7) ((kd4) kg5.y).m(vq7);
            }
        }
    }

    public final wq7 b(ea7 ea7, am2 am2, int i, int i2) {
        am2 am22;
        dg dgVar = this.b;
        dgVar.getClass();
        int i3 = dgVar.w;
        if (i3 == 0 || i3 == Integer.MAX_VALUE) {
            am22 = am2;
        } else {
            am22 = new am2(z65.p(am2.w + i3, 1, 1000));
        }
        this.a.getClass();
        return a(new vq7(ea7, am22, i, i2, (Object) null));
    }
}
