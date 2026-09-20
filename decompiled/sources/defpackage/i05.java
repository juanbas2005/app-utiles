package defpackage;

import java.util.List;

/* renamed from: i05  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class i05 {
    public final zh6 a;
    public final gs2 b;
    public tp1 c;
    public boolean d;
    public final jz0 e = new jz0(17);

    public i05(zh6 zh6, gs2 gs2, tp1 tp1) {
        this.a = zh6;
        this.b = gs2;
        this.c = tp1;
    }

    public static void a(kk5 kk5) {
        List list = kk5.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((qk5) list.get(i)).a();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0020  */
    public final Object b(gs2 gs2, h61 h61) {
        h05 h05;
        int i;
        if (h61 instanceof h05) {
            h05 = (h05) h61;
            int i2 = h05.B;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                h05.B = i2 - Integer.MIN_VALUE;
                Object obj = h05.z;
                i = h05.B;
                if (i != 0) {
                    o85.q(obj);
                    this.d = true;
                    ju1 ju1 = new ju1(this, gs2, (f61) null, 29);
                    h05.B = 1;
                    e81 e81 = h05.x;
                    e81.getClass();
                    sg6 sg6 = new sg6(h05, e81);
                    Object t = o55.t(sg6, true, sg6, ju1);
                    p81 p81 = p81.w;
                    if (t == p81) {
                        return p81;
                    }
                } else if (i == 1) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                this.d = false;
                return vs7.a;
            }
        }
        h05 = new h05(this, h61);
        Object obj2 = h05.z;
        i = h05.B;
        if (i != 0) {
        }
        this.d = false;
        return vs7.a;
    }
}
