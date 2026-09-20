package defpackage;

import java.util.concurrent.Callable;

/* renamed from: ke8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class ke8 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ re8 b;

    public /* synthetic */ ke8(re8 re8, int i) {
        this.a = i;
        this.b = re8;
    }

    public final Object call() {
        int i = this.a;
        kd8 kd8 = kd8.w;
        re8 re8 = this.b;
        switch (i) {
            case b85.b:
                be8 be8 = re8.a;
                kd8 kd82 = be8.b;
                String str = be8.c;
                if (kd82 != kd8) {
                    String str2 = se8.a;
                    bc4.k().e(str2, str + " is not in ENQUEUED state. Nothing more to do");
                    return Boolean.TRUE;
                }
                if (be8.c() || (be8.b == kd8 && be8.k > 0)) {
                    re8.f.getClass();
                    if (System.currentTimeMillis() < be8.a()) {
                        bc4.k().e(se8.a, "Delaying execution for " + str + " because it is being executed before schedule.");
                        return Boolean.TRUE;
                    }
                }
                return Boolean.FALSE;
            default:
                fe8 fe8 = re8.i;
                String str3 = re8.c;
                boolean z = false;
                if (fe8.d(str3) == kd8) {
                    fe8.j(kd8.x, str3);
                    ((Number) sg3.O(fe8.a, false, true, new sd8(str3, 9))).intValue();
                    fe8.k(-256, str3);
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}
