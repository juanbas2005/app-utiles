package defpackage;

import android.content.Context;
import android.view.WindowManager;

/* renamed from: ei0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class ei0 implements gs2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ int w = 1;
    public final /* synthetic */ boolean x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ ei0(en2 en2, am5 am5, boolean z2, vr2 vr2, sr2 sr2, sr2 sr22, sr2 sr23, int i) {
        this.y = en2;
        this.z = am5;
        this.x = z2;
        this.A = vr2;
        this.B = sr2;
        this.C = sr22;
        this.D = sr23;
    }

    public final Object H(Object obj, Object obj2) {
        boolean z2;
        int i = this.w;
        vs7 vs7 = vs7.a;
        Object obj3 = this.D;
        Object obj4 = this.C;
        Object obj5 = this.B;
        Object obj6 = this.A;
        Object obj7 = this.z;
        Object obj8 = this.y;
        switch (i) {
            case b85.b:
                String str = (String) obj8;
                String str2 = (String) obj7;
                Context context = (Context) obj6;
                WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) obj5;
                vx0 vx0 = (vx0) obj4;
                WindowManager windowManager = (WindowManager) obj3;
                yt2 yt2 = (yt2) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (yt2.V(intValue & 1, z2)) {
                    boolean z3 = !((Boolean) u55.f(fi0.d, yt2).getValue()).booleanValue();
                    boolean i2 = yt2.i(context) | yt2.g(str);
                    Object Q = yt2.Q();
                    Object obj9 = ay0.a;
                    if (i2 || Q == obj9) {
                        Q = new m20(str, context, 1);
                        yt2.o0(Q);
                    }
                    sr2 sr2 = (sr2) Q;
                    boolean i3 = yt2.i(context) | yt2.g(str);
                    Object Q2 = yt2.Q();
                    if (i3 || Q2 == obj9) {
                        Q2 = new m20(str, context, 2);
                        yt2.o0(Q2);
                    }
                    sr2 sr22 = (sr2) Q2;
                    fi0 fi0 = fi0.a;
                    Object Q3 = yt2.Q();
                    if (Q3 == obj9) {
                        yd ydVar = new yd(0, fi0, fi0.class, "hide", "hide()V", 0, 0, 2);
                        yt2.o0(ydVar);
                        Q3 = ydVar;
                    }
                    sr2 sr23 = (sr2) ((zq3) Q3);
                    boolean i4 = yt2.i(context) | yt2.i(layoutParams) | yt2.i(vx0) | yt2.i(windowManager);
                    Object Q4 = yt2.Q();
                    if (i4 || Q4 == obj9) {
                        Q4 = new g5(context, layoutParams, vx0, windowManager);
                        yt2.o0(Q4);
                    }
                    boolean z4 = z3;
                    String str3 = str;
                    tf4.b(z4, str3, str2, this.x, sr2, sr22, sr23, (vr2) Q4, yt2, 0);
                } else {
                    yt2.Y();
                }
                return vs7;
            case 1:
                ((Integer) obj2).getClass();
                r16.n((en2) obj8, (am5) obj7, this.x, (vr2) obj6, (sr2) obj5, (sr2) obj4, (sr2) obj3, (yt2) obj, b85.v(1));
                return vs7;
            default:
                ((Integer) obj2).getClass();
                fx4.d((String) obj8, this.x, (f5) obj7, (fw0) obj6, (gs2) obj5, (ml4) obj4, (cf4) obj3, (yt2) obj, b85.v(805306375));
                return vs7;
        }
    }

    public /* synthetic */ ei0(String str, String str2, boolean z2, Context context, WindowManager.LayoutParams layoutParams, vx0 vx0, WindowManager windowManager) {
        this.y = str;
        this.z = str2;
        this.x = z2;
        this.A = context;
        this.B = layoutParams;
        this.C = vx0;
        this.D = windowManager;
    }

    public /* synthetic */ ei0(String str, boolean z2, f5 f5Var, fw0 fw0, gs2 gs2, ml4 ml4, cf4 cf4, int i) {
        this.y = str;
        this.x = z2;
        this.z = f5Var;
        this.A = fw0;
        this.B = gs2;
        this.C = ml4;
        this.D = cf4;
    }
}
