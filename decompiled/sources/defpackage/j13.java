package defpackage;

import android.content.Context;

/* renamed from: j13  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class j13 implements hs2 {
    public final /* synthetic */ yd A;
    public final /* synthetic */ yd B;
    public final /* synthetic */ aq4 C;
    public final /* synthetic */ se4 D;
    public final /* synthetic */ se4 E;
    public final /* synthetic */ se4 F;
    public final /* synthetic */ aq4 G;
    public final /* synthetic */ o81 H;
    public final /* synthetic */ is2 I;
    public final /* synthetic */ String J;
    public final /* synthetic */ sr2 K;
    public final /* synthetic */ aq4 L;
    public final /* synthetic */ aq4 M;
    public final /* synthetic */ aq4 N;
    public final /* synthetic */ c23 w;
    public final /* synthetic */ Context x;
    public final /* synthetic */ se4 y;
    public final /* synthetic */ yg z;

    public /* synthetic */ j13(c23 c23, Context context, se4 se4, yg ygVar, yd ydVar, yd ydVar2, aq4 aq4, se4 se42, se4 se43, se4 se44, aq4 aq42, o81 o81, is2 is2, String str, sr2 sr2, aq4 aq43, aq4 aq44, aq4 aq45) {
        this.w = c23;
        this.x = context;
        this.y = se4;
        this.z = ygVar;
        this.A = ydVar;
        this.B = ydVar2;
        this.C = aq4;
        this.D = se42;
        this.E = se43;
        this.F = se44;
        this.G = aq42;
        this.H = o81;
        this.I = is2;
        this.J = str;
        this.K = sr2;
        this.L = aq43;
        this.M = aq44;
        this.N = aq45;
    }

    public final Object u(Object obj, Object obj2, Object obj3) {
        boolean z2;
        boolean z3;
        d63 d63;
        boolean z4;
        int i;
        int i2;
        o03 o03 = (o03) obj;
        yt2 yt2 = (yt2) obj2;
        int intValue = ((Integer) obj3).intValue();
        o03.getClass();
        if ((intValue & 6) == 0) {
            if (yt2.g(o03)) {
                i2 = 4;
            } else {
                i2 = 2;
            }
            intValue |= i2;
        }
        if ((intValue & 19) != 18) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (yt2.V(intValue & 1, z2)) {
            c23 c23 = this.w;
            boolean i3 = yt2.i(c23);
            Object Q = yt2.Q();
            d63 d632 = ay0.a;
            if (i3 || Q == d632) {
                o0 o0Var = new o0(1, c23, c23.class, "recargar", "recargar(Ljava/lang/String;)V", 0, 0, 12);
                yt2.o0(o0Var);
                Q = o0Var;
            }
            zq3 zq3 = (zq3) Q;
            boolean i4 = yt2.i(c23);
            Object Q2 = yt2.Q();
            if (i4 || Q2 == d632) {
                xc0 xc0 = new xc0(3, c23, c23.class, "transferir", "transferir(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", 0, 0, 2);
                yt2.o0(xc0);
                Q2 = xc0;
            }
            zq3 zq32 = (zq3) Q2;
            boolean i5 = yt2.i(c23);
            Object Q3 = yt2.Q();
            if (i5 || Q3 == d632) {
                o0 o0Var2 = new o0(1, c23, c23.class, "onTransferDestChange", "onTransferDestChange(Ljava/lang/String;)V", 0, 0, 16);
                yt2.o0(o0Var2);
                Q3 = o0Var2;
            }
            zq3 zq33 = (zq3) Q3;
            boolean i6 = yt2.i(c23);
            Object Q4 = yt2.Q();
            if (i6 || Q4 == d632) {
                yv yvVar = new yv(2, c23, c23.class, "cambiarPin", "cambiarPin(Ljava/lang/String;Ljava/lang/String;)V", 0, 0, 7);
                yt2.o0(yvVar);
                Q4 = yvVar;
            }
            zq3 zq34 = (zq3) Q4;
            boolean i7 = yt2.i(c23);
            Object Q5 = yt2.Q();
            if (i7 || Q5 == d632) {
                o0 o0Var3 = new o0(1, c23, c23.class, "saveTransferPin", "saveTransferPin(Ljava/lang/String;)V", 0, 0, 17);
                yt2.o0(o0Var3);
                Q5 = o0Var3;
            }
            zq3 zq35 = (zq3) Q5;
            boolean i8 = yt2.i(c23);
            Object Q6 = yt2.Q();
            if (i8 || Q6 == d632) {
                yd ydVar = new yd(0, c23, c23.class, "adelantarSaldo", "adelantarSaldo()V", 0, 0, 15);
                yt2.o0(ydVar);
                Q6 = ydVar;
            }
            zq3 zq36 = (zq3) Q6;
            boolean i9 = yt2.i(c23);
            Object Q7 = yt2.Q();
            if (i9 || Q7 == d632) {
                yd ydVar2 = new yd(0, c23, c23.class, "consultarAdelanto", "consultarAdelanto()V", 0, 0, 16);
                yt2.o0(ydVar2);
                Q7 = ydVar2;
            }
            zq3 zq37 = (zq3) Q7;
            boolean i10 = yt2.i(c23);
            Object Q8 = yt2.Q();
            if (i10 || Q8 == d632) {
                o0 o0Var4 = new o0(1, c23, c23.class, "callAsterisco99FromHistory", "callAsterisco99FromHistory(Ljava/lang/String;)V", 0, 0, 18);
                yt2.o0(o0Var4);
                Q8 = o0Var4;
            }
            zq3 zq38 = (zq3) Q8;
            boolean i11 = yt2.i(c23);
            Object Q9 = yt2.Q();
            if (i11 || Q9 == d632) {
                o0 o0Var5 = new o0(1, c23, c23.class, "setUssdRefreshMode", "setUssdRefreshMode(Z)V", 0, 0, 19);
                yt2.o0(o0Var5);
                Q9 = o0Var5;
            }
            zq3 zq39 = (zq3) Q9;
            boolean i12 = yt2.i(c23);
            Object Q10 = yt2.Q();
            if (i12 || Q10 == d632) {
                o0 o0Var6 = new o0(1, c23, c23.class, "setBalanceSecondaryInfo", "setBalanceSecondaryInfo(Lcu/lestebang/utiletecsa/data/model/settings/BalanceInfo;)V", 0, 0, 13);
                yt2.o0(o0Var6);
                Q10 = o0Var6;
            }
            zq3 zq310 = (zq3) Q10;
            boolean i13 = yt2.i(c23);
            Object Q11 = yt2.Q();
            if (i13 || Q11 == d632) {
                yd ydVar3 = new yd(0, c23, c23.class, "refreshSaldo", "refreshSaldo()V", 0, 0, 14);
                yt2.o0(ydVar3);
                Q11 = ydVar3;
            }
            zq3 zq311 = (zq3) Q11;
            boolean i14 = yt2.i(c23);
            Object Q12 = yt2.Q();
            if (i14 || Q12 == d632) {
                o0 o0Var7 = new o0(1, c23, c23.class, "refreshPlan", "refreshPlan(Lcu/lestebang/utiletecsa/data/model/ussd/UssdName;)V", 0, 0, 14);
                yt2.o0(o0Var7);
                Q12 = o0Var7;
            }
            zq3 zq312 = (zq3) Q12;
            boolean i15 = yt2.i(c23);
            Object Q13 = yt2.Q();
            if (i15 || Q13 == d632) {
                o0 o0Var8 = new o0(1, c23, c23.class, "toggleSection", "toggleSection(Ljava/lang/String;)V", 0, 0, 15);
                yt2.o0(o0Var8);
                Q13 = o0Var8;
            }
            zq3 zq313 = (zq3) Q13;
            int i16 = intValue & 14;
            if (i16 == 4) {
                z3 = true;
            } else {
                z3 = false;
            }
            Context context = this.x;
            boolean i17 = z3 | yt2.i(c23) | yt2.i(context);
            se4 se4 = this.y;
            boolean i18 = i17 | yt2.i(se4);
            Object Q14 = yt2.Q();
            if (i18 || Q14 == d632) {
                d63 = d632;
                qj qjVar = new qj((Object) o03, (Object) c23, (Object) context, (Object) se4, 6);
                yt2.o0(qjVar);
                Q14 = qjVar;
            } else {
                d63 = d632;
            }
            vr2 vr2 = (vr2) Q14;
            aq4 aq4 = this.C;
            boolean g = yt2.g(aq4);
            se4 se42 = this.D;
            boolean i19 = g | yt2.i(se42);
            Object Q15 = yt2.Q();
            if (i19 || Q15 == d63) {
                Q15 = new w03(se42, aq4, 0);
                yt2.o0(Q15);
            }
            vr2 vr22 = (vr2) Q15;
            vr2 vr23 = (vr2) zq3;
            se4 se43 = this.E;
            boolean i20 = yt2.i(se43);
            Object Q16 = yt2.Q();
            if (i20 || Q16 == d63) {
                Q16 = new w03(se43, this.L, 1);
                yt2.o0(Q16);
            }
            vr2 vr24 = (vr2) Q16;
            se4 se44 = this.F;
            boolean i21 = yt2.i(se44);
            Object Q17 = yt2.Q();
            if (i21 || Q17 == d63) {
                Q17 = new w03(se44, this.M, 2);
                yt2.o0(Q17);
            }
            vr2 vr25 = (vr2) Q17;
            hs2 hs2 = (hs2) zq32;
            gs2 gs2 = (gs2) zq34;
            vr2 vr26 = (vr2) zq35;
            sr2 sr2 = (sr2) zq36;
            sr2 sr22 = (sr2) zq37;
            if (i16 == 4) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean i22 = z4 | yt2.i(context) | yt2.i(c23);
            Object Q18 = yt2.Q();
            if (i22 || Q18 == d63) {
                Q18 = new g5((Object) o03, (Object) context, (Object) c23, 17);
                yt2.o0(Q18);
            }
            vr2 vr27 = (vr2) Q18;
            vr2 vr28 = (vr2) zq38;
            vr2 vr29 = (vr2) zq33;
            vr2 vr210 = (vr2) zq39;
            vr2 vr211 = (vr2) zq310;
            sr2 sr23 = (sr2) zq311;
            vr2 vr212 = (vr2) zq312;
            aq4 aq42 = this.G;
            boolean g2 = yt2.g(aq42) | yt2.i(c23);
            o81 o81 = this.H;
            vr2 vr213 = vr2;
            is2 is2 = this.I;
            is2 is22 = is2;
            String str = this.J;
            boolean i23 = g2 | yt2.i(o81) | yt2.i(is2) | yt2.g(str);
            String str2 = str;
            Object Q19 = yt2.Q();
            if (i23 || Q19 == d63) {
                i = i16;
                zo2 zo2 = new zo2(c23, aq42, this.N, o81, is22, str2);
                yt2.o0(zo2);
                Q19 = zo2;
            } else {
                i = i16;
            }
            vr2 vr214 = vr27;
            hs2 hs22 = hs2;
            sr2 sr24 = sr2;
            sr2 sr25 = sr22;
            vr2 vr215 = vr28;
            sr2 sr26 = this.K;
            o03 o032 = o03;
            vr2 vr216 = (vr2) zq313;
            vr2 vr217 = vr213;
            t13.p(o032, vr217, this.z, this.A, this.B, vr22, vr23, vr24, vr25, hs22, gs2, vr26, sr24, sr25, vr214, vr215, vr29, vr210, vr211, sr23, vr212, (sr2) Q19, sr26, vr216, yt2, i);
        } else {
            yt2.Y();
        }
        return vs7.a;
    }
}
