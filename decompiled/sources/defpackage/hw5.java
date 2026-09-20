package defpackage;

import java.io.IOException;

/* renamed from: hw5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class hw5 implements hf0 {
    public final xc3 b;
    public js0 c;
    public final tc0 d = new Object();
    public final fl3 e;
    public final e81 f;

    /* JADX WARNING: type inference failed for: r2v1, types: [tc0, java.lang.Object] */
    public hw5(xc3 xc3, e81 e81) {
        e81.getClass();
        this.b = xc3;
        fl3 fl3 = new fl3((el3) e81.a0(me6.E));
        this.e = fl3;
        this.f = e81.X(fl3).X(new k81("RawSourceChannel"));
    }

    public final void a(Throwable th) {
        if (this.c == null) {
            String message = th.getMessage();
            String str = "Channel was cancelled";
            if (message == null) {
                message = str;
            }
            this.e.o(rc9.b(message, th));
            this.b.close();
            String message2 = th.getMessage();
            if (message2 != null) {
                str = message2;
            }
            this.c = new js0(new IOException(str, th));
        }
    }

    public final Throwable b() {
        js0 js0 = this.c;
        if (js0 != null) {
            return js0.a(is0.D);
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0020  */
    public final Object d(int i, h61 h61) {
        gw5 gw5;
        int i2;
        if (h61 instanceof gw5) {
            gw5 = (gw5) h61;
            int i3 = gw5.C;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                gw5.C = i3 - Integer.MIN_VALUE;
                Object obj = gw5.A;
                i2 = gw5.C;
                boolean z = true;
                if (i2 != 0) {
                    o85.q(obj);
                    if (this.c != null) {
                        return Boolean.TRUE;
                    }
                    ot otVar = new ot(this, i, (f61) null, 24);
                    gw5.z = i;
                    gw5.C = 1;
                    Object e0 = ar7.e0(this.f, otVar, gw5);
                    p81 p81 = p81.w;
                    if (e0 == p81) {
                        return p81;
                    }
                } else if (i2 == 1) {
                    i = gw5.z;
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                if (this.d.y < ((long) i)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        }
        gw5 = new gw5(this, h61);
        Object obj2 = gw5.A;
        i2 = gw5.C;
        boolean z2 = true;
        if (i2 != 0) {
        }
        if (this.d.y < ((long) i)) {
        }
        return Boolean.valueOf(z2);
    }

    public final tc0 g() {
        return this.d;
    }

    public final boolean h() {
        if (this.c == null || !this.d.x()) {
            return false;
        }
        return true;
    }
}
