package defpackage;

import android.content.Context;
import cu.lestebang.utiletecsa.R;
import cu.lestebang.utiletecsa.sync.worker.PlanExpiryWorker;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: nh5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class nh5 extends a97 implements gs2 {
    public long A;
    public Object B;
    public Object C;
    public Serializable D;
    public Object E;
    public PlanExpiryWorker F;
    public int G;
    public int H;
    public int I;
    public final /* synthetic */ PlanExpiryWorker J;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public nh5(PlanExpiryWorker planExpiryWorker, f61 f61) {
        super(2, f61);
        this.J = planExpiryWorker;
    }

    public final Object H(Object obj, Object obj2) {
        return ((nh5) o((f61) obj2, (o81) obj)).s(vs7.a);
    }

    public final f61 o(f61 f61, Object obj) {
        return new nh5(this.J, f61);
    }

    /* JADX WARNING: type inference failed for: r6v6, types: [java.util.List] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x013a, code lost:
        if (r5 == r9) goto L_0x04be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x018c, code lost:
        r17[r11] = new defpackage.lh5(r8, cu.lestebang.utiletecsa.sync.worker.PlanExpiryWorker.f(r12, (java.lang.String) r5, r13), r15);
        r5 = (defpackage.c50) r4;
        r5.getClass();
        r5 = r5.b(defpackage.xz7.a, "datosDias", "--");
        r0.B = r7;
        r0.C = r7;
        r8 = "datos";
        r0.D = r8;
        r0.E = null;
        r0.A = r13;
        r0.G = 1;
        r11 = cu.lestebang.utiletecsa.R.string.plan_expiry_datos;
        r0.H = cu.lestebang.utiletecsa.R.string.plan_expiry_datos;
        r0.I = 3;
        r5 = defpackage.gr8.H(r5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x01c3, code lost:
        if (r5 != r9) goto L_0x01c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x01c7, code lost:
        r12 = r7;
        r15 = r12;
        r7 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x01ca, code lost:
        r17 = r2;
        r15[r7] = new defpackage.lh5(r11, defpackage.k57.v0(defpackage.d57.k1((java.lang.String) r5).toString()), r8);
        r2 = (defpackage.c50) r4;
        r2.getClass();
        r2 = r2.b(defpackage.xz7.a, "paquetesDias", "--");
        r0.B = r12;
        r0.C = r12;
        r0.D = "paquetes";
        r0.A = r13;
        r0.G = 2;
        r0.H = cu.lestebang.utiletecsa.R.string.plan_expiry_paquetes;
        r0.I = 4;
        r2 = defpackage.gr8.H(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0208, code lost:
        if (r2 != r9) goto L_0x020c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x020c, code lost:
        r15 = r12;
        r11 = r13;
        r13 = "paquetes";
        r5 = cu.lestebang.utiletecsa.R.string.plan_expiry_paquetes;
        r8 = 2;
        r7 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0212, code lost:
        r15[r8] = new defpackage.lh5(r5, defpackage.k57.v0(defpackage.d57.k1((java.lang.String) r2).toString()), r13);
        r2 = (defpackage.c50) r4;
        r2.getClass();
        r2 = r2.b(defpackage.uz7.a, "vozDias", "--");
        r0.B = r7;
        r0.C = r7;
        r13 = "voz";
        r0.D = r13;
        r0.A = r11;
        r0.G = 3;
        r5 = cu.lestebang.utiletecsa.R.string.plan_expiry_voz;
        r0.H = cu.lestebang.utiletecsa.R.string.plan_expiry_voz;
        r0.I = 5;
        r2 = defpackage.gr8.H(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x024e, code lost:
        if (r2 != r9) goto L_0x0252;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0252, code lost:
        r15 = r7;
        r8 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0254, code lost:
        r15[r8] = new defpackage.lh5(r5, defpackage.k57.v0(defpackage.d57.k1((java.lang.String) r2).toString()), r13);
        r2 = (defpackage.c50) r4;
        r2.getClass();
        r2 = r2.b(defpackage.tz7.a, "smsDias", "--");
        r0.B = r7;
        r0.C = r7;
        r8 = "sms";
        r0.D = r8;
        r0.A = r11;
        r0.G = 4;
        r0.H = cu.lestebang.utiletecsa.R.string.plan_expiry_sms;
        r0.I = 6;
        r2 = defpackage.gr8.H(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0290, code lost:
        if (r2 != r9) goto L_0x0294;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0294, code lost:
        r15 = r7;
        r7 = 4;
        r5 = cu.lestebang.utiletecsa.R.string.plan_expiry_sms;
        r13 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0298, code lost:
        r13[r7] = new defpackage.lh5(r5, defpackage.k57.v0(defpackage.d57.k1((java.lang.String) r2).toString()), r8);
        r5 = defpackage.sg3.E(r15);
        r2 = (defpackage.dy7) r17;
        r2 = defpackage.gr8.L(new defpackage.c6(r2.a.b(), 21), r2.b);
        r0.B = r5;
        r0.C = null;
        r0.D = null;
        r0.A = r11;
        r0.I = 7;
        r2 = defpackage.gr8.H(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x02d8, code lost:
        if (r2 != r9) goto L_0x02dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x02dc, code lost:
        r7 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x02dd, code lost:
        r2 = (java.util.List) r2;
        r11 = new java.util.ArrayList();
        r12 = new java.util.ArrayList();
        r5 = r5.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x02f1, code lost:
        if (r5.hasNext() == false) goto L_0x036b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x02f3, code lost:
        r13 = (defpackage.lh5) r5.next();
        r14 = r13.c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x02fb, code lost:
        if (r14 == null) goto L_0x02ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x02fd, code lost:
        r14 = r14.intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0302, code lost:
        if (1 > r14) goto L_0x0365;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0305, code lost:
        if (r14 >= 3) goto L_0x0365;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0307, code lost:
        r15 = r13.a;
        r16 = r4;
        r31 = r5;
        r18 = r10;
        r10 = new java.lang.StringBuilder();
        r10.append(r15);
        r15 = r18;
        r10.append(r15);
        r10.append(((long) r14) + r7);
        r10.append(r15);
        r10.append(r14);
        r4 = r10.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x032f, code lost:
        if (r2.contains(r4) != false) goto L_0x035f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0331, code lost:
        r5 = r3.getString(r13.b);
        r5.getClass();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x033b, code lost:
        if (r14 != 1) goto L_0x0349;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x033d, code lost:
        r5 = r3.getString(cu.lestebang.utiletecsa.R.string.plan_expiry_tomorrow, new java.lang.Object[]{r5});
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0349, code lost:
        r5 = r3.getString(cu.lestebang.utiletecsa.R.string.plan_expiry_in_days, new java.lang.Object[]{r5, new java.lang.Integer(r14)});
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0359, code lost:
        r11.add(r5);
        r12.add(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x035f, code lost:
        r5 = r31;
        r10 = r15;
        r4 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0365, code lost:
        r16 = r4;
        r31 = r5;
        r15 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x036b, code lost:
        r15 = r10;
        r4 = (defpackage.c50) r4;
        r4.getClass();
        r4 = r4.b(defpackage.wz7.a, "fechaNacional", "--");
        r0.B = null;
        r0.C = r2;
        r0.D = r11;
        r0.E = r12;
        r0.F = r1;
        r0.A = r7;
        r0.I = 8;
        r4 = defpackage.gr8.H(r4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0392, code lost:
        if (r4 != r9) goto L_0x0396;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0396, code lost:
        r26 = r7;
        r7 = r11;
        r10 = r26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x039b, code lost:
        r1 = cu.lestebang.utiletecsa.sync.worker.PlanExpiryWorker.f(r1, (java.lang.String) r4, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x03a1, code lost:
        if (r1 == null) goto L_0x03b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x03a3, code lost:
        r4 = new java.lang.Integer(r1.intValue() + 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x03b1, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x03b2, code lost:
        if (r4 == null) goto L_0x0407;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x03b4, code lost:
        r1 = r4.intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x03b8, code lost:
        if (r1 < 0) goto L_0x0407;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x03bb, code lost:
        if (r1 >= 3) goto L_0x0407;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x03bd, code lost:
        r1 = "saldoNacional:::" + (((long) r4.intValue()) + r10) + r15 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x03db, code lost:
        if (r2.contains(r1) != false) goto L_0x0407;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x03dd, code lost:
        r5 = r4.intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x03e1, code lost:
        if (r5 == 0) goto L_0x03fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x03e4, code lost:
        if (r5 == 1) goto L_0x03f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x03e6, code lost:
        r4 = r3.getString(cu.lestebang.utiletecsa.R.string.plan_expiry_nacional_in_days, new java.lang.Object[]{r4});
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x03f2, code lost:
        r4 = r3.getString(cu.lestebang.utiletecsa.R.string.plan_expiry_nacional_tomorrow);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x03fa, code lost:
        r4 = r3.getString(cu.lestebang.utiletecsa.R.string.plan_expiry_nacional_today);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0401, code lost:
        r7.add(r4);
        r12.add(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x040b, code lost:
        if (r7.isEmpty() != false) goto L_0x04bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x040d, code lost:
        defpackage.sg3.p(r3, "PlanExpiryChannel", cu.lestebang.utiletecsa.R.string.plan_expiry_channel_name, cu.lestebang.utiletecsa.R.string.plan_expiry_channel_description, 3);
        r1 = r3.getPackageManager().getLaunchIntentForPackage(r3.getPackageName());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0425, code lost:
        if (r1 == null) goto L_0x0430;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0427, code lost:
        r8 = android.app.PendingIntent.getActivity(r3, 0, r1, 201326592);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0430, code lost:
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0431, code lost:
        r5 = r3.getString(cu.lestebang.utiletecsa.R.string.plan_expiry_notification_title);
        r5.getClass();
        defpackage.sg3.W(r3, 202609, defpackage.sg3.o(r3, "PlanExpiryChannel", r5, defpackage.dt0.E0(r7, "\n", (java.lang.String) null, (java.lang.String) null, (defpackage.vr2) null, 62), r3.getApplicationInfo().icon, r8));
        r1 = defpackage.dt0.M0(r2, r12);
        r2 = new java.util.ArrayList();
        r1 = r1.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x046e, code lost:
        if (r1.hasNext() == false) goto L_0x049b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0470, code lost:
        r3 = r1.next();
        r4 = (java.lang.String) defpackage.dt0.z0(1, defpackage.d57.W0((java.lang.String) r3, new java.lang.String[]{r15}, 6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0487, code lost:
        if (r4 == null) goto L_0x046a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0489, code lost:
        r4 = defpackage.k57.w0(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x048d, code lost:
        if (r4 == null) goto L_0x046a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0495, code lost:
        if (r4.longValue() < r10) goto L_0x046a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0497, code lost:
        r2.add(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x049b, code lost:
        r1 = defpackage.dt0.b1(defpackage.dt0.f1(r2));
        r0.B = null;
        r0.C = null;
        r0.D = null;
        r0.E = null;
        r0.F = null;
        r0.A = r10;
        r0.I = 9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x04bc, code lost:
        if (((defpackage.dy7) r17).B(r1, r0) != r9) goto L_0x04bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x04be, code lost:
        return r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x04c4, code lost:
        return new defpackage.r84();
     */
    /* JADX WARNING: Multi-variable type inference failed */
    public final Object s(Object obj) {
        dv7 dv7;
        String str;
        long j;
        lh5[] lh5Arr;
        long j2;
        lh5[] lh5Arr2;
        String str2;
        PlanExpiryWorker planExpiryWorker;
        int i;
        int i2;
        lh5[] lh5Arr3;
        Object obj2;
        Object obj3;
        PlanExpiryWorker planExpiryWorker2 = this.J;
        dv7 dv72 = planExpiryWorker2.j;
        Context context = planExpiryWorker2.g;
        k40 k40 = planExpiryWorker2.i;
        int i3 = this.I;
        Object obj4 = p81.w;
        switch (i3) {
            case b85.b:
                str = ":::";
                o85.q(obj);
                dy7 dy7 = (dy7) dv72;
                di2 L = gr8.L(new c6(dy7.a.b(), 22), dy7.b);
                this.I = 1;
                obj3 = gr8.H(L, this);
                break;
            case 1:
                str = ":::";
                o85.q(obj);
                obj3 = obj;
                if (((Boolean) obj3).booleanValue()) {
                    long currentTimeMillis = System.currentTimeMillis() / 86400000;
                    lh5[] lh5Arr4 = new lh5[5];
                    c50 c50 = (c50) k40;
                    c50.getClass();
                    di2 b = c50.b(vz7.a, "fechaVence", "--");
                    this.B = lh5Arr4;
                    this.C = lh5Arr4;
                    this.D = "saldo";
                    this.E = planExpiryWorker2;
                    this.A = currentTimeMillis;
                    this.G = 0;
                    i2 = R.string.plan_expiry_saldo;
                    this.H = R.string.plan_expiry_saldo;
                    this.I = 2;
                    obj2 = gr8.H(b, this);
                    if (obj2 != obj4) {
                        lh5Arr3 = lh5Arr4;
                        lh5Arr2 = lh5Arr3;
                        str2 = "saldo";
                        j2 = currentTimeMillis;
                        i = 0;
                        planExpiryWorker = planExpiryWorker2;
                        break;
                    }
                } else {
                    return new r84();
                }
                break;
            case 2:
                str = ":::";
                int i4 = this.H;
                int i5 = this.G;
                long j3 = this.A;
                o85.q(obj);
                lh5Arr2 = (lh5[]) this.C;
                str2 = (String) this.D;
                int i6 = i4;
                obj2 = obj;
                i2 = i6;
                long j4 = j3;
                i = i5;
                planExpiryWorker = (PlanExpiryWorker) this.E;
                lh5Arr3 = (lh5[]) this.B;
                j2 = j4;
                break;
            case 3:
                str = ":::";
                int i7 = this.H;
                int i8 = this.G;
                long j5 = this.A;
                lh5[] lh5Arr5 = (lh5[]) this.C;
                o85.q(obj);
                lh5[] lh5Arr6 = (lh5[]) this.B;
                String str3 = (String) this.D;
                j2 = j5;
                int i9 = i7;
                Object obj5 = obj;
                break;
            case 4:
                int i10 = this.H;
                int i11 = this.G;
                str = ":::";
                j = this.A;
                String str4 = (String) this.D;
                lh5[] lh5Arr7 = (lh5[]) this.C;
                lh5Arr = (lh5[]) this.B;
                o85.q(obj);
                dv7 = dv72;
                Object obj6 = obj;
                break;
            case 5:
                int i12 = this.H;
                int i13 = this.G;
                long j6 = this.A;
                String str5 = (String) this.D;
                lh5[] lh5Arr8 = (lh5[]) this.C;
                lh5Arr = (lh5[]) this.B;
                o85.q(obj);
                long j7 = j6;
                str = ":::";
                j = j7;
                dv7 = dv72;
                Object obj7 = obj;
                break;
            case 6:
                int i14 = this.H;
                int i15 = this.G;
                long j8 = this.A;
                String str6 = (String) this.D;
                lh5[] lh5Arr9 = (lh5[]) this.C;
                lh5[] lh5Arr10 = (lh5[]) this.B;
                o85.q(obj);
                long j9 = j8;
                str = ":::";
                j = j9;
                dv7 = dv72;
                Object obj8 = obj;
                break;
            case 7:
                long j10 = this.A;
                List list = (List) this.B;
                o85.q(obj);
                dv7 = dv72;
                str = ":::";
                Object obj9 = obj;
                break;
            case 8:
                long j11 = this.A;
                planExpiryWorker2 = this.F;
                List list2 = (List) this.D;
                List list3 = (List) this.B;
                o85.q(obj);
                dv7 = dv72;
                long j12 = j11;
                List list4 = (List) this.C;
                String str7 = ":::";
                Object obj10 = obj;
                ArrayList arrayList = (List) this.E;
                break;
            case 9:
                Integer num = (Integer) this.F;
                List list5 = (List) this.E;
                List list6 = (List) this.D;
                List list7 = (List) this.C;
                List list8 = (List) this.B;
                o85.q(obj);
                break;
            default:
                h.s("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
