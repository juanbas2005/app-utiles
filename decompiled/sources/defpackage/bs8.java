package defpackage;

import android.app.Application;

/* renamed from: bs8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class bs8 extends kj {
    public final d37 c;
    public final xw5 d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bs8(Application application) {
        super(application);
        application.getClass();
        d37 a = e37.a(sr8.a);
        this.c = a;
        this.d = gr8.t(a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0020  */
    public final Object e(jb9 jb9, h61 h61) {
        yr8 yr8;
        int i;
        if (h61 instanceof yr8) {
            yr8 = (yr8) h61;
            int i2 = yr8.B;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                yr8.B = i2 - Integer.MIN_VALUE;
                Object obj = yr8.z;
                i = yr8.B;
                if (i != 0) {
                    o85.q(obj);
                    Application application = this.b;
                    application.getClass();
                    e81 e81 = ey8.a;
                    tc1 tc1 = new tc1(application, jb9, (f61) null, 23);
                    yr8.B = 1;
                    obj = ar7.e0(e81, tc1, yr8);
                    p81 p81 = p81.w;
                    if (obj == p81) {
                        return p81;
                    }
                } else if (i == 1) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                obj.getClass();
                return obj;
            }
        }
        yr8 = new yr8(this, h61);
        Object obj2 = yr8.z;
        i = yr8.B;
        if (i != 0) {
        }
        obj2.getClass();
        return obj2;
    }
}
