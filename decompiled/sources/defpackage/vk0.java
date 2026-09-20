package defpackage;

import cu.lestebang.utiletecsa.R;

/* renamed from: vk0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class vk0 implements gs2 {
    public final /* synthetic */ int w = 1;
    public final /* synthetic */ int x;
    public final /* synthetic */ vr2 y;
    public final /* synthetic */ ml4 z;

    public /* synthetic */ vk0(int i, vr2 vr2, ml4 ml4) {
        this.x = i;
        this.y = vr2;
        this.z = ml4;
    }

    public final Object H(Object obj, Object obj2) {
        boolean z2;
        int i = this.w;
        vs7 vs7 = vs7.a;
        vr2 vr2 = this.y;
        int i2 = this.x;
        switch (i) {
            case b85.b:
                ((Integer) obj2).getClass();
                tf4.c(this.z, vr2, (yt2) obj, b85.v(i2 | 1));
                return vs7;
            default:
                yt2 yt2 = (yt2) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (yt2.V(intValue & 1, z2)) {
                    ml4 ml4 = this.z;
                    Object obj3 = ay0.a;
                    if (i2 == 0) {
                        yt2.e0(-101251783);
                        x83 x83 = su0.p;
                        if (x83 == null) {
                            w83 w83 = new w83("Filled.Edit", 24.0f, 24.0f, 24.0f, 24.0f, 0, 0, false, 224);
                            int i3 = e38.a;
                            ky6 ky6 = new ky6(jt0.b);
                            be5 be5 = new be5();
                            be5.j(3.0f, 17.25f);
                            be5.m(21.0f);
                            be5.g(3.75f);
                            be5.h(17.81f, 9.94f);
                            be5.i(-3.75f, -3.75f);
                            be5.h(3.0f, 17.25f);
                            be5.c();
                            be5.j(20.71f, 7.04f);
                            be5 be52 = be5;
                            be52.e(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
                            be5.i(-2.34f, -2.34f);
                            be52.e(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
                            be5.i(-1.83f, 1.83f);
                            be5.i(3.75f, 3.75f);
                            be5.i(1.83f, -1.83f);
                            be5.c();
                            w83.a(w83, be5.a, ky6, 14336);
                            x83 = w83.b();
                            su0.p = x83;
                        }
                        x83 x832 = x83;
                        String i4 = h75.i(R.string.m3c_date_picker_switch_to_input_mode, yt2);
                        boolean g = yt2.g(vr2);
                        Object Q = yt2.Q();
                        if (g || Q == obj3) {
                            Q = new zg1(0, vr2);
                            yt2.o0(Q);
                        }
                        gi1.h((sr2) Q, x832, i4, ml4, false, yt2, 0, 16);
                        yt2.r(false);
                    } else {
                        yt2.e0(-100953904);
                        x83 x833 = su0.q;
                        if (x833 == null) {
                            w83 w832 = new w83("Filled.DateRange", 24.0f, 24.0f, 24.0f, 24.0f, 0, 0, false, 224);
                            int i5 = e38.a;
                            ky6 ky62 = new ky6(jt0.b);
                            be5 be53 = new be5();
                            be53.j(9.0f, 11.0f);
                            be53.h(7.0f, 11.0f);
                            be53.n(2.0f);
                            be53.g(2.0f);
                            be53.n(-2.0f);
                            be53.c();
                            be53.j(13.0f, 11.0f);
                            be53.g(-2.0f);
                            be53.n(2.0f);
                            be53.g(2.0f);
                            be53.n(-2.0f);
                            be53.c();
                            be53.j(17.0f, 11.0f);
                            be53.g(-2.0f);
                            be53.n(2.0f);
                            be53.g(2.0f);
                            be53.n(-2.0f);
                            be53.c();
                            be53.j(19.0f, 4.0f);
                            be53.g(-1.0f);
                            be53.h(18.0f, 2.0f);
                            be53.g(-2.0f);
                            be53.n(2.0f);
                            be53.h(8.0f, 4.0f);
                            be53.h(8.0f, 2.0f);
                            be53.h(6.0f, 2.0f);
                            be53.n(2.0f);
                            be53.h(5.0f, 4.0f);
                            be5 be54 = be53;
                            be54.e(-1.11f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f);
                            be5 be55 = be54;
                            be55.h(3.0f, 20.0f);
                            be54.e(0.0f, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f);
                            be55.g(14.0f);
                            be54.e(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
                            be55.h(21.0f, 6.0f);
                            be54.e(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
                            b81.v(be55, 19.0f, 20.0f, 5.0f, 20.0f);
                            be55.h(5.0f, 9.0f);
                            be55.g(14.0f);
                            be55.n(11.0f);
                            be55.c();
                            w83.a(w832, be55.a, ky62, 14336);
                            x833 = w832.b();
                            su0.q = x833;
                        }
                        x83 x834 = x833;
                        String i6 = h75.i(R.string.m3c_date_picker_switch_to_calendar_mode, yt2);
                        boolean g2 = yt2.g(vr2);
                        Object Q2 = yt2.Q();
                        if (g2 || Q2 == obj3) {
                            Q2 = new zg1(1, vr2);
                            yt2.o0(Q2);
                        }
                        gi1.h((sr2) Q2, x834, i6, ml4, false, yt2, 0, 16);
                        yt2.r(false);
                    }
                } else {
                    yt2.Y();
                }
                return vs7;
        }
    }

    public /* synthetic */ vk0(ml4 ml4, vr2 vr2, int i) {
        this.z = ml4;
        this.y = vr2;
        this.x = i;
    }
}
