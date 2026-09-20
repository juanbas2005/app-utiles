package defpackage;

import androidx.work.impl.workers.ConstraintTrackingWorker;
import cu.lestebang.utiletecsa.MainActivity;
import cu.lestebang.utiletecsa.feature.nauta.service.NautaTileService;
import cu.lestebang.utiletecsa.feature.settings.service.BalanceNotificationService;
import cu.lestebang.utiletecsa.sync.worker.NautaLogoutWorker;
import cu.lestebang.utiletecsa.widget.LteOnlyActivity;

/* renamed from: ot  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ot extends a97 implements gs2 {
    public final /* synthetic */ int A;
    public int B;
    public final /* synthetic */ Object C;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ot(Object obj, int i, f61 f61, int i2) {
        super(2, f61);
        this.A = i2;
        this.C = obj;
        this.B = i;
    }

    public final Object H(Object obj, Object obj2) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        switch (i) {
            case b85.b:
                return ((ot) o((f61) obj2, (o81) obj)).s(vs7);
            case 1:
                return ((ot) o((f61) obj2, (o81) obj)).s(vs7);
            case 2:
                return ((ot) o((f61) obj2, (o81) obj)).s(vs7);
            case 3:
                return ((ot) o((f61) obj2, (o81) obj)).s(vs7);
            case 4:
                return ((ot) o((f61) obj2, (o81) obj)).s(vs7);
            case 5:
                return ((ot) o((f61) obj2, (o81) obj)).s(vs7);
            case 6:
                return ((ot) o((f61) obj2, (o81) obj)).s(vs7);
            case 7:
                return ((ot) o((f61) obj2, (o81) obj)).s(vs7);
            case 8:
                return ((ot) o((f61) obj2, (o81) obj)).s(vs7);
            case 9:
                return ((ot) o((f61) obj2, (o81) obj)).s(vs7);
            case 10:
                return ((ot) o((f61) obj2, (o81) obj)).s(vs7);
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                ((ot) o((f61) obj2, (eh6) obj)).s(vs7);
                return vs7;
            case 12:
                return ((ot) o((f61) obj2, (o81) obj)).s(vs7);
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                return ((ot) o((f61) obj2, (o81) obj)).s(vs7);
            case 14:
                return ((ot) o((f61) obj2, (o81) obj)).s(vs7);
            case h75.g:
                ((ot) o((f61) obj2, (o81) obj)).s(vs7);
                return p81.w;
            case 16:
                return ((ot) o((f61) obj2, (o81) obj)).s(vs7);
            case 17:
                return ((ot) o((f61) obj2, (o81) obj)).s(vs7);
            case 18:
                return ((ot) o((f61) obj2, (o81) obj)).s(vs7);
            case 19:
                return ((ot) o((f61) obj2, (o81) obj)).s(vs7);
            case 20:
                return ((ot) o((f61) obj2, (o81) obj)).s(vs7);
            case 21:
                return ((ot) o((f61) obj2, (o81) obj)).s(vs7);
            case 22:
                return ((ot) o((f61) obj2, (o81) obj)).s(vs7);
            case 23:
                return ((ot) o((f61) obj2, (o81) obj)).s(vs7);
            case 24:
                ((ot) o((f61) obj2, (o81) obj)).s(vs7);
                return vs7;
            case 25:
                return ((ot) o((f61) obj2, (o81) obj)).s(vs7);
            case 26:
                return ((ot) o((f61) obj2, (o81) obj)).s(vs7);
            case 27:
                return ((ot) o((f61) obj2, (o81) obj)).s(vs7);
            case 28:
                return ((ot) o((f61) obj2, (o81) obj)).s(vs7);
            default:
                return ((ot) o((f61) obj2, (o81) obj)).s(vs7);
        }
    }

    public final f61 o(f61 f61, Object obj) {
        int i = this.A;
        Object obj2 = this.C;
        switch (i) {
            case b85.b:
                return new ot((qt) obj2, f61, 0);
            case 1:
                return new ot((BalanceNotificationService) obj2, f61, 1);
            case 2:
                return new ot((c50) obj2, f61, 2);
            case 3:
                return new ot((hf0) obj2, f61, 3);
            case 4:
                return new ot((ConstraintTrackingWorker) obj2, f61, 4);
            case 5:
                return new ot((ok2) obj2, f61, 5);
            case 6:
                return new ot((il1) obj2, f61, 6);
            case 7:
                return new ot((di2) obj2, f61, 7);
            case 8:
                return new ot((xk2) obj2, f61, 8);
            case 9:
                return new ot((eh3) obj2, f61, 9);
            case 10:
                return new ot((ji3) obj2, f61, 10);
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                return new ot((n04) obj2, this.B, f61, 11);
            case 12:
                return new ot((hv2) obj2, f61, 12);
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                return new ot((uj) obj2, f61, 13);
            case 14:
                return new ot((LteOnlyActivity) obj2, f61, 14);
            case h75.g:
                return new ot((rd4) obj2, f61, 15);
            case 16:
                return new ot((MainActivity) obj2, f61, 16);
            case 17:
                return new ot((uh4) obj2, f61, 17);
            case 18:
                return new ot((en4) obj2, f61, 18);
            case 19:
                return new ot((NautaLogoutWorker) obj2, f61, 19);
            case 20:
                return new ot((gs4) obj2, f61, 20);
            case 21:
                return new ot((NautaTileService) obj2, f61, 21);
            case 22:
                return new ot((h45) obj2, f61, 22);
            case 23:
                return new ot((dj5) obj2, f61, 23);
            case 24:
                return new ot((hw5) obj2, this.B, f61, 24);
            case 25:
                return new ot((ai) obj2, f61, 25);
            case 26:
                return new ot((xu0) obj2, f61, 26);
            case 27:
                return new ot((oi6) obj2, f61, 27);
            case 28:
                return new ot((gm6) obj2, f61, 28);
            default:
                return new ot((uu) obj2, f61, 29);
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x04fb  */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x0509  */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x052c  */
    public final java.lang.Object s(java.lang.Object r27) {
        /*
            r26 = this;
            r5 = r26
            int r0 = r5.A
            java.lang.String r1 = "sms"
            java.lang.String r3 = "voz"
            r4 = 6
            r6 = 0
            r9 = 3
            r10 = 2
            r11 = 0
            vs7 r12 = defpackage.vs7.a
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            p81 r14 = defpackage.p81.w
            java.lang.Object r15 = r5.C
            r2 = 1
            r7 = 0
            switch(r0) {
                case 0: goto L_0x08f7;
                case 1: goto L_0x085c;
                case 2: goto L_0x07cf;
                case 3: goto L_0x07ab;
                case 4: goto L_0x0789;
                case 5: goto L_0x0762;
                case 6: goto L_0x0726;
                case 7: goto L_0x0701;
                case 8: goto L_0x06e2;
                case 9: goto L_0x06bd;
                case 10: goto L_0x068b;
                case 11: goto L_0x0658;
                case 12: goto L_0x061e;
                case 13: goto L_0x05e4;
                case 14: goto L_0x0532;
                case 15: goto L_0x04da;
                case 16: goto L_0x047d;
                case 17: goto L_0x0459;
                case 18: goto L_0x042f;
                case 19: goto L_0x03e8;
                case 20: goto L_0x0256;
                case 21: goto L_0x0207;
                case 22: goto L_0x0187;
                case 23: goto L_0x014b;
                case 24: goto L_0x0110;
                case 25: goto L_0x00eb;
                case 26: goto L_0x00ca;
                case 27: goto L_0x00ac;
                case 28: goto L_0x0081;
                default: goto L_0x001a;
            }
        L_0x001a:
            uu r15 = (defpackage.uu) r15
            int r0 = r5.B
            if (r0 == 0) goto L_0x002d
            if (r0 != r2) goto L_0x0028
            defpackage.o85.q(r27)
            r0 = r27
            goto L_0x0043
        L_0x0028:
            defpackage.h.s(r13)
            r12 = r7
            goto L_0x0080
        L_0x002d:
            defpackage.o85.q(r27)
            r5.B = r2
            tu r0 = defpackage.uu.a
            r0 = r15
            io.github.jan.supabase.auth.a r0 = (io.github.jan.supabase.auth.a) r0
            wu r1 = r0.c
            boolean r1 = r1.v
            java.lang.Object r0 = r0.p(r1, r11, r5)
            if (r0 != r14) goto L_0x0043
            r12 = r14
            goto L_0x0080
        L_0x0043:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            ub4 r1 = defpackage.ub4.w
            if (r0 != 0) goto L_0x0069
            r0 = r15
            io.github.jan.supabase.auth.a r0 = (io.github.jan.supabase.auth.a) r0
            cf4 r0 = r0.d
            java.lang.Object r2 = r0.z
            ms3 r2 = (defpackage.ms3) r2
            java.lang.Object r0 = r0.y
            java.lang.String r0 = (java.lang.String) r0
            boolean r3 = r2.a(r1)
            if (r3 == 0) goto L_0x0065
            java.lang.String r3 = "No session found, not starting auto refresh"
            r2.b(r1, r0, r7, r3)
        L_0x0065:
            defpackage.p25.s(r15)
            goto L_0x0080
        L_0x0069:
            io.github.jan.supabase.auth.a r15 = (io.github.jan.supabase.auth.a) r15
            cf4 r0 = r15.d
            java.lang.Object r2 = r0.z
            ms3 r2 = (defpackage.ms3) r2
            java.lang.Object r0 = r0.y
            java.lang.String r0 = (java.lang.String) r0
            boolean r3 = r2.a(r1)
            if (r3 == 0) goto L_0x0080
            java.lang.String r3 = "Session found, auto refresh started"
            r2.b(r1, r0, r7, r3)
        L_0x0080:
            return r12
        L_0x0081:
            gm6 r15 = (defpackage.gm6) r15
            int r0 = r5.B
            if (r0 == 0) goto L_0x0092
            if (r0 != r2) goto L_0x008d
            defpackage.o85.q(r27)
            goto L_0x00ab
        L_0x008d:
            defpackage.h.s(r13)
            r12 = r7
            goto L_0x00ab
        L_0x0092:
            defpackage.o85.q(r27)
            nz7 r0 = r15.b
            uy7 r1 = defpackage.uy7.SERVICIOS_UTILES
            c6 r0 = r0.c(r1)
            fm6 r1 = new fm6
            r1.<init>(r15, r2)
            r5.B = r2
            java.lang.Object r0 = r0.a(r1, r5)
            if (r0 != r14) goto L_0x00ab
            r12 = r14
        L_0x00ab:
            return r12
        L_0x00ac:
            int r0 = r5.B
            if (r0 == 0) goto L_0x00bb
            if (r0 != r2) goto L_0x00b6
            defpackage.o85.q(r27)
            goto L_0x00c9
        L_0x00b6:
            defpackage.h.s(r13)
            r12 = r7
            goto L_0x00c9
        L_0x00bb:
            defpackage.o85.q(r27)
            oi6 r15 = (defpackage.oi6) r15
            r5.B = r2
            java.lang.Object r0 = defpackage.oi6.e1(r15, r5)
            if (r0 != r14) goto L_0x00c9
            r12 = r14
        L_0x00c9:
            return r12
        L_0x00ca:
            int r0 = r5.B
            if (r0 == 0) goto L_0x00db
            if (r0 != r2) goto L_0x00d6
            defpackage.o85.q(r27)
            r14 = r27
            goto L_0x00ea
        L_0x00d6:
            defpackage.h.s(r13)
            r14 = r7
            goto L_0x00ea
        L_0x00db:
            defpackage.o85.q(r27)
            xu0 r15 = (defpackage.xu0) r15
            r5.B = r2
            java.lang.Object r0 = r15.h(r5)
            if (r0 != r14) goto L_0x00e9
            goto L_0x00ea
        L_0x00e9:
            r14 = r0
        L_0x00ea:
            return r14
        L_0x00eb:
            int r0 = r5.B
            if (r0 == 0) goto L_0x00fa
            if (r0 != r2) goto L_0x00f5
            defpackage.o85.q(r27)
            goto L_0x010f
        L_0x00f5:
            defpackage.h.s(r13)
            r12 = r7
            goto L_0x010f
        L_0x00fa:
            defpackage.o85.q(r27)
            ai r15 = (defpackage.ai) r15
            uj r0 = r15.W
            java.lang.Float r1 = new java.lang.Float
            r1.<init>(r6)
            r5.B = r2
            java.lang.Object r0 = r0.f(r5, r1)
            if (r0 != r14) goto L_0x010f
            r12 = r14
        L_0x010f:
            return r12
        L_0x0110:
            hw5 r15 = (defpackage.hw5) r15
            xc3 r0 = r15.b
            tc0 r1 = r15.d
            defpackage.o85.q(r27)
            r2 = 0
            r8 = r2
        L_0x011c:
            long r10 = r1.y
            int r4 = r5.B
            long r13 = (long) r4
            int r4 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            r10 = -1
            if (r4 >= 0) goto L_0x0137
            int r4 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r4 < 0) goto L_0x0137
            r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            long r8 = r0.y(r1, r8)     // Catch:{ EOFException -> 0x0135 }
            goto L_0x011c
        L_0x0135:
            r8 = r10
            goto L_0x011c
        L_0x0137:
            int r1 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r1 != 0) goto L_0x014a
            r0.close()
            fl3 r0 = r15.e
            r0.v0()
            js0 r0 = new js0
            r0.<init>(r7)
            r15.c = r0
        L_0x014a:
            return r12
        L_0x014b:
            dj5 r15 = (defpackage.dj5) r15
            int r0 = r5.B
            if (r0 == 0) goto L_0x015c
            if (r0 != r2) goto L_0x0157
            defpackage.o85.q(r27)
            goto L_0x0186
        L_0x0157:
            defpackage.h.s(r13)
            r12 = r7
            goto L_0x0186
        L_0x015c:
            defpackage.o85.q(r27)
            ni5 r0 = r15.b
            dv7 r0 = r0.b
            dy7 r0 = (defpackage.dy7) r0
            qe1 r1 = r0.a
            di2 r1 = r1.b()
            c6 r3 = new c6
            r4 = 23
            r3.<init>(r1, r4)
            h81 r0 = r0.b
            di2 r0 = defpackage.gr8.L(r3, r0)
            zi5 r1 = new zi5
            r1.<init>(r15, r2)
            r5.B = r2
            java.lang.Object r0 = r0.a(r1, r5)
            if (r0 != r14) goto L_0x0186
            r12 = r14
        L_0x0186:
            return r12
        L_0x0187:
            h45 r15 = (defpackage.h45) r15
            java.util.Map r1 = r15.E
            int r0 = r5.B
            if (r0 == 0) goto L_0x019c
            if (r0 != r2) goto L_0x0197
            defpackage.o85.q(r27)     // Catch:{ all -> 0x0195 }
            goto L_0x01af
        L_0x0195:
            r0 = move-exception
            goto L_0x01db
        L_0x0197:
            defpackage.h.s(r13)
            r12 = r7
            goto L_0x01da
        L_0x019c:
            defpackage.o85.q(r27)
            e81 r0 = r15.C     // Catch:{ all -> 0x0195 }
            el3 r0 = defpackage.r16.Q(r0)     // Catch:{ all -> 0x0195 }
            r5.B = r2     // Catch:{ all -> 0x0195 }
            java.lang.Object r0 = r0.j0(r5)     // Catch:{ all -> 0x0195 }
            if (r0 != r14) goto L_0x01af
            r12 = r14
            goto L_0x01da
        L_0x01af:
            java.util.Set r0 = r1.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x01b7:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x01da
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r1 = r1.getValue()
            d45 r1 = (defpackage.d45) r1
            ji8 r2 = r1.D
            r2.v()
            am6 r1 = r1.a
            java.util.concurrent.ExecutorService r1 = r1.x()
            java.util.concurrent.ThreadPoolExecutor r1 = (java.util.concurrent.ThreadPoolExecutor) r1
            r1.shutdown()
            goto L_0x01b7
        L_0x01da:
            return r12
        L_0x01db:
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x01e3:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0206
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r2 = r2.getValue()
            d45 r2 = (defpackage.d45) r2
            ji8 r3 = r2.D
            r3.v()
            am6 r2 = r2.a
            java.util.concurrent.ExecutorService r2 = r2.x()
            java.util.concurrent.ThreadPoolExecutor r2 = (java.util.concurrent.ThreadPoolExecutor) r2
            r2.shutdown()
            goto L_0x01e3
        L_0x0206:
            throw r0
        L_0x0207:
            cu.lestebang.utiletecsa.feature.nauta.service.NautaTileService r15 = (cu.lestebang.utiletecsa.feature.nauta.service.NautaTileService) r15
            int r0 = r5.B
            if (r0 == 0) goto L_0x0218
            if (r0 != r2) goto L_0x0213
            defpackage.o85.q(r27)
            goto L_0x0255
        L_0x0213:
            defpackage.h.s(r13)
            r12 = r7
            goto L_0x0255
        L_0x0218:
            defpackage.o85.q(r27)
            ur4 r0 = r15.c()
            gs4 r0 = (defpackage.gs4) r0
            di2 r0 = r0.h()
            ur4 r1 = r15.c()
            gs4 r1 = (defpackage.gs4) r1
            di2 r1 = r1.g()
            ud4 r3 = new ud4
            r3.<init>(r9, r7, r2)
            lg r4 = new lg
            r6 = 9
            r4.<init>(r6, r15)
            r5.B = r2
            di2[] r6 = new defpackage.di2[r10]
            r6[r11] = r0
            r6[r2] = r1
            x10 r0 = defpackage.x10.G
            yi2 r1 = new yi2
            r1.<init>((java.lang.Object) r3, (defpackage.f61) r7, (int) r9)
            java.lang.Object r0 = defpackage.mp7.S(r5, r4, r0, r1, r6)
            if (r0 != r14) goto L_0x0251
            goto L_0x0252
        L_0x0251:
            r0 = r12
        L_0x0252:
            if (r0 != r14) goto L_0x0255
            r12 = r14
        L_0x0255:
            return r12
        L_0x0256:
            gs4 r15 = (defpackage.gs4) r15
            dv7 r0 = r15.a
            int r1 = r5.B
            if (r1 == 0) goto L_0x0273
            if (r1 == r2) goto L_0x026d
            if (r1 != r10) goto L_0x0267
            defpackage.o85.q(r27)
            goto L_0x03e7
        L_0x0267:
            defpackage.h.s(r13)
        L_0x026a:
            r12 = r7
            goto L_0x03e7
        L_0x026d:
            defpackage.o85.q(r27)
            r1 = r27
            goto L_0x0287
        L_0x0273:
            defpackage.o85.q(r27)
            r1 = r0
            dy7 r1 = (defpackage.dy7) r1
            di2 r1 = r1.d()
            r5.B = r2
            java.lang.Object r1 = defpackage.gr8.H(r1, r5)
            if (r1 != r14) goto L_0x0287
            goto L_0x03de
        L_0x0287:
            cu.lestebang.utiletecsa.core.preferences.model.UserDataPreferences r1 = (cu.lestebang.utiletecsa.core.preferences.model.UserDataPreferences) r1
            r3 = r1
            java.lang.String r1 = r3.getNautaLogoutUrl()
            int r6 = r1.length()
            if (r6 == 0) goto L_0x03e0
            java.util.List r6 = r3.getNautaCookies()
            java.util.Iterator r6 = r6.iterator()
        L_0x029c:
            boolean r7 = r6.hasNext()
            java.lang.String r13 = "="
            if (r7 == 0) goto L_0x02b9
            java.lang.Object r7 = r6.next()
            java.lang.String r7 = (java.lang.String) r7
            java.util.concurrent.ConcurrentHashMap r8 = r15.e
            java.lang.String r9 = defpackage.d57.g1(r7, r13)
            java.lang.String r7 = defpackage.d57.c1(r7, r13, r7)
            r8.put(r9, r7)
            r9 = 3
            goto L_0x029c
        L_0x02b9:
            java.lang.String r6 = "&"
            java.lang.String[] r6 = new java.lang.String[]{r6}
            java.util.List r6 = defpackage.d57.W0(r1, r6, r4)
            int r7 = r6.size()
            java.lang.String r8 = ""
            if (r7 <= 0) goto L_0x02d0
            java.lang.Object r7 = r6.get(r11)
            goto L_0x02d1
        L_0x02d0:
            r7 = r8
        L_0x02d1:
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r7 = defpackage.d57.c1(r7, r13, r7)
            int r9 = r6.size()
            if (r2 >= r9) goto L_0x02e2
            java.lang.Object r9 = r6.get(r2)
            goto L_0x02e3
        L_0x02e2:
            r9 = r8
        L_0x02e3:
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r9 = defpackage.d57.c1(r9, r13, r9)
            int r11 = r6.size()
            if (r10 >= r11) goto L_0x02f4
            java.lang.Object r11 = r6.get(r10)
            goto L_0x02f5
        L_0x02f4:
            r11 = r8
        L_0x02f5:
            java.lang.String r11 = (java.lang.String) r11
            java.lang.String r11 = defpackage.d57.c1(r11, r13, r11)
            int r10 = r6.size()
            r2 = 3
            if (r2 >= r10) goto L_0x0307
            java.lang.Object r2 = r6.get(r2)
            goto L_0x0308
        L_0x0307:
            r2 = r8
        L_0x0308:
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r2 = defpackage.d57.c1(r2, r13, r2)
            int r10 = r6.size()
            r4 = 4
            if (r4 >= r10) goto L_0x031a
            java.lang.Object r4 = r6.get(r4)
            goto L_0x031b
        L_0x031a:
            r4 = r8
        L_0x031b:
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r4 = defpackage.d57.c1(r4, r13, r4)
            int r10 = r6.size()
            r16 = r0
            r0 = 6
            if (r0 >= r10) goto L_0x032f
            java.lang.Object r0 = r6.get(r0)
            goto L_0x0330
        L_0x032f:
            r0 = r8
        L_0x0330:
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = defpackage.d57.c1(r0, r13, r0)
            h12 r6 = new h12
            r10 = 1
            r6.<init>(r10)
            java.lang.String r10 = "op"
            java.lang.String r13 = "getLeftTime"
            r6.a(r10, r13)
            java.lang.String r10 = "ATTRIBUTE_UUID"
            r6.a(r10, r7)
            java.lang.String r7 = "CSRFHW"
            r6.a(r7, r9)
            java.lang.String r7 = "wlanuserip"
            r6.a(r7, r11)
            java.lang.String r7 = "ssid"
            r6.a(r7, r2)
            java.lang.String r2 = "loggerId"
            r6.a(r2, r4)
            java.lang.String r2 = "domain"
            r6.a(r2, r8)
            java.lang.String r2 = "username"
            r6.a(r2, r0)
            java.lang.String r0 = "wlanacname"
            r6.a(r0, r8)
            java.lang.String r0 = "wlanmac"
            r6.a(r0, r8)
            lm2 r0 = new lm2
            java.util.ArrayList r2 = r6.a
            java.util.ArrayList r4 = r6.b
            r0.<init>(r2, r4)
            o9 r2 = new o9
            r4 = 12
            r2.<init>((int) r4)
            java.lang.String r4 = "https://secure.etecsa.net:8443/EtecsaQueryServlet"
            r2.N(r4)
            java.lang.String r4 = "User-Agent"
            java.lang.String r6 = "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_6_8) AppleWebKit/534.30 (KHTML, like Gecko) Chrome/12.0.742.122 Safari/534.30"
            r2.D(r4, r6)
            java.lang.String r4 = "POST"
            r2.G(r4, r0)
            kd6 r0 = new kd6
            r0.<init>((defpackage.o9) r2)
            k26 r2 = defpackage.gs4.i
            d45 r2 = r15.d()
            r2.getClass()
            dx5 r4 = new dx5
            r6 = 0
            r4.<init>(r2, r0, r6)
            a66 r0 = r4.f()
            d66 r2 = r0.C
            java.lang.String r2 = r2.o()
            java.lang.String r2 = defpackage.gs4.b(r15, r2)
            java.lang.CharSequence r2 = defpackage.d57.k1(r2)
            java.lang.String r2 = r2.toString()
            r0.close()
            java.lang.String r0 = "errorop"
            boolean r0 = defpackage.d57.x0(r2, r0, r6)
            if (r0 == 0) goto L_0x03c8
            java.lang.String r2 = "0:0:0"
        L_0x03c8:
            r4 = r2
            java.util.List r2 = r3.getNautaCookies()
            java.lang.String r3 = r3.getNautaSessionUser()
            r0 = 2
            r5.B = r0
            r0 = r16
            dy7 r0 = (defpackage.dy7) r0
            java.lang.Object r0 = r0.j(r1, r2, r3, r4, r5)
            if (r0 != r14) goto L_0x03e7
        L_0x03de:
            r12 = r14
            goto L_0x03e7
        L_0x03e0:
            java.lang.String r0 = "No hay sesión activa"
            defpackage.h.s(r0)
            goto L_0x026a
        L_0x03e7:
            return r12
        L_0x03e8:
            int r0 = r5.B
            r10 = 1
            if (r0 == 0) goto L_0x03fe
            if (r0 != r10) goto L_0x03f9
            defpackage.o85.q(r27)
            r0 = r27
            o66 r0 = (defpackage.o66) r0
            java.lang.Object r0 = r0.w
            goto L_0x0410
        L_0x03f9:
            defpackage.h.s(r13)
            r14 = r7
            goto L_0x042e
        L_0x03fe:
            defpackage.o85.q(r27)
            cu.lestebang.utiletecsa.sync.worker.NautaLogoutWorker r15 = (cu.lestebang.utiletecsa.sync.worker.NautaLogoutWorker) r15
            ur4 r0 = r15.h
            r5.B = r10
            gs4 r0 = (defpackage.gs4) r0
            java.lang.Object r0 = r0.f(r5)
            if (r0 != r14) goto L_0x0410
            goto L_0x042e
        L_0x0410:
            java.lang.Throwable r1 = defpackage.o66.a(r0)
            if (r1 != 0) goto L_0x041e
            vs7 r0 = (defpackage.vs7) r0
            r84 r14 = new r84
            r14.<init>()
            goto L_0x042e
        L_0x041e:
            hr2 r0 = defpackage.yh7.a
            r6 = 0
            java.lang.Object[] r1 = new java.lang.Object[r6]
            r0.getClass()
            defpackage.hr2.p(r1)
            p84 r14 = new p84
            r14.<init>()
        L_0x042e:
            return r14
        L_0x042f:
            int r0 = r5.B
            r10 = 1
            if (r0 == 0) goto L_0x0441
            if (r0 != r10) goto L_0x043c
            defpackage.o85.q(r27)
            r14 = r27
            goto L_0x0458
        L_0x043c:
            defpackage.h.s(r13)
            r14 = r7
            goto L_0x0458
        L_0x0441:
            defpackage.o85.q(r27)
            en4 r15 = (defpackage.en4) r15
            ad0 r0 = r15.g
            r5.B = r10
            k05 r1 = new k05
            r6 = 0
            r1.<init>((java.lang.Object) r0, (defpackage.f61) r7, (int) r6)
            java.lang.Object r0 = defpackage.gl0.L(r1, r5)
            if (r0 != r14) goto L_0x0457
            goto L_0x0458
        L_0x0457:
            r14 = r0
        L_0x0458:
            return r14
        L_0x0459:
            r10 = r2
            int r0 = r5.B
            if (r0 == 0) goto L_0x046b
            if (r0 != r10) goto L_0x0466
            defpackage.o85.q(r27)
            r14 = r27
            goto L_0x047c
        L_0x0466:
            defpackage.h.s(r13)
            r14 = r7
            goto L_0x047c
        L_0x046b:
            defpackage.o85.q(r27)
            uh4 r15 = (defpackage.uh4) r15
            vh4 r0 = r15.a
            r5.B = r10
            java.lang.Object r0 = r0.c(r5)
            if (r0 != r14) goto L_0x047b
            goto L_0x047c
        L_0x047b:
            r14 = r0
        L_0x047c:
            return r14
        L_0x047d:
            r10 = r2
            cu.lestebang.utiletecsa.MainActivity r15 = (cu.lestebang.utiletecsa.MainActivity) r15
            int r0 = r5.B
            if (r0 == 0) goto L_0x0491
            if (r0 != r10) goto L_0x048c
            defpackage.o85.q(r27)
            r0 = r27
            goto L_0x04ac
        L_0x048c:
            defpackage.h.s(r13)
            r12 = r7
            goto L_0x04d9
        L_0x0491:
            defpackage.o85.q(r27)
            int r0 = cu.lestebang.utiletecsa.MainActivity.g0
            ne4 r0 = r15.v()
            xw5 r0 = r0.e
            c6 r1 = new c6
            r2 = 7
            r1.<init>(r0, r2)
            r5.B = r10
            java.lang.Object r0 = defpackage.gr8.H(r1, r5)
            if (r0 != r14) goto L_0x04ac
            r12 = r14
            goto L_0x04d9
        L_0x04ac:
            is7 r0 = (defpackage.is7) r0
            java.lang.Object r0 = r0.a
            cu.lestebang.utiletecsa.core.preferences.model.UserDataPreferences r0 = (cu.lestebang.utiletecsa.core.preferences.model.UserDataPreferences) r0
            boolean r0 = r0.getPermissionsRequestedOnce()
            if (r0 == 0) goto L_0x04b9
            goto L_0x04d9
        L_0x04b9:
            a9 r0 = r15.e0
            java.util.ArrayList r1 = r15.a0
            r6 = 0
            java.lang.String[] r2 = new java.lang.String[r6]
            java.lang.Object[] r1 = r1.toArray(r2)
            r0.d0(r1)
            ne4 r0 = r15.v()
            ls0 r1 = defpackage.u58.a(r0)
            fe4 r2 = new fe4
            r10 = 1
            r2.<init>(r0, r7, r10)
            r0 = 3
            defpackage.ar7.H(r1, r7, r7, r2, r0)
        L_0x04d9:
            return r12
        L_0x04da:
            r10 = r2
            r0 = r15
            rd4 r0 = (defpackage.rd4) r0
            int r1 = r5.B
            if (r1 == 0) goto L_0x04f4
            if (r1 == r10) goto L_0x04f0
            r2 = 2
            if (r1 != r2) goto L_0x04eb
            defpackage.o85.q(r27)
            goto L_0x0528
        L_0x04eb:
            defpackage.h.s(r13)
            r14 = r7
            goto L_0x0527
        L_0x04f0:
            defpackage.o85.q(r27)
            goto L_0x0505
        L_0x04f4:
            defpackage.o85.q(r27)
        L_0x04f7:
            ad0 r1 = r0.U
            if (r1 == 0) goto L_0x0505
            r10 = 1
            r5.B = r10
            java.lang.Object r1 = defpackage.ad0.J(r1, r5)
            if (r1 != r14) goto L_0x0505
            goto L_0x0527
        L_0x0505:
            lj5 r1 = r0.P
            if (r1 == 0) goto L_0x04f7
            tm3 r1 = new tm3
            r2 = 19
            r1.<init>(r2)
            r2 = 2
            r5.B = r2
            e81 r3 = r5.x
            r3.getClass()
            gj r3 = defpackage.pd8.s(r3)
            dw2 r4 = new dw2
            r4.<init>(r2, r1)
            java.lang.Object r1 = r3.a(r4, r5)
            if (r1 != r14) goto L_0x0528
        L_0x0527:
            return r14
        L_0x0528:
            lj5 r1 = r0.P
            if (r1 == 0) goto L_0x04f7
            nj5 r1 = (defpackage.nj5) r1
            r1.d()
            goto L_0x04f7
        L_0x0532:
            cu.lestebang.utiletecsa.widget.LteOnlyActivity r15 = (cu.lestebang.utiletecsa.widget.LteOnlyActivity) r15
            int r0 = r5.B
            r10 = 1
            if (r0 == 0) goto L_0x0547
            if (r0 != r10) goto L_0x0541
            defpackage.o85.q(r27)
            r0 = r27
            goto L_0x055d
        L_0x0541:
            defpackage.h.s(r13)
            r12 = r7
            goto L_0x05dd
        L_0x0547:
            defpackage.o85.q(r27)
            p7 r0 = r15.U
            if (r0 == 0) goto L_0x05de
            c6 r0 = r0.d()
            r5.B = r10
            java.lang.Object r0 = defpackage.gr8.H(r0, r5)
            if (r0 != r14) goto L_0x055d
            r12 = r14
            goto L_0x05dd
        L_0x055d:
            a54 r0 = (defpackage.a54) r0
            boolean r0 = r0.b()
            if (r0 == 0) goto L_0x05cf
            int r0 = cu.lestebang.utiletecsa.widget.LteOnlyActivity.V
            android.content.ComponentName r0 = new android.content.ComponentName
            java.lang.String r1 = "com.android.phone"
            java.lang.String r2 = "com.android.phone.settings.RadioInfo"
            r0.<init>(r1, r2)
            android.content.ComponentName r1 = new android.content.ComponentName
            java.lang.String r2 = "com.android.settings"
            java.lang.String r3 = "com.android.settings.RadioInfo"
            r1.<init>(r2, r3)
            android.content.ComponentName[] r0 = new android.content.ComponentName[]{r0, r1}
            java.util.List r0 = defpackage.sg3.E(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x0585:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x05ac
            java.lang.Object r0 = r1.next()
            android.content.ComponentName r0 = (android.content.ComponentName) r0
            android.content.Intent r2 = new android.content.Intent     // Catch:{ all -> 0x05a1 }
            java.lang.String r3 = "android.intent.action.MAIN"
            r2.<init>(r3)     // Catch:{ all -> 0x05a1 }
            android.content.Intent r0 = r2.setComponent(r0)     // Catch:{ all -> 0x05a1 }
            r15.startActivity(r0)     // Catch:{ all -> 0x05a1 }
            r2 = r12
            goto L_0x05a7
        L_0x05a1:
            r0 = move-exception
            m66 r2 = new m66
            r2.<init>(r0)
        L_0x05a7:
            boolean r0 = r2 instanceof defpackage.m66
            if (r0 != 0) goto L_0x0585
            goto L_0x05da
        L_0x05ac:
            android.content.Intent r0 = new android.content.Intent     // Catch:{ all -> 0x05b8 }
            java.lang.String r1 = "android.settings.DATA_ROAMING_SETTINGS"
            r0.<init>(r1)     // Catch:{ all -> 0x05b8 }
            r15.startActivity(r0)     // Catch:{ all -> 0x05b8 }
            r1 = r12
            goto L_0x05be
        L_0x05b8:
            r0 = move-exception
            m66 r1 = new m66
            r1.<init>(r0)
        L_0x05be:
            java.lang.Throwable r0 = defpackage.o66.a(r1)
            if (r0 == 0) goto L_0x05da
            android.content.Intent r0 = new android.content.Intent     // Catch:{ all -> 0x05da }
            java.lang.String r1 = "android.settings.WIRELESS_SETTINGS"
            r0.<init>(r1)     // Catch:{ all -> 0x05da }
            r15.startActivity(r0)     // Catch:{ all -> 0x05da }
            goto L_0x05da
        L_0x05cf:
            r0 = 2131821665(0x7f110461, float:1.927608E38)
            r6 = 0
            android.widget.Toast r0 = android.widget.Toast.makeText(r15, r0, r6)
            r0.show()
        L_0x05da:
            r15.finish()
        L_0x05dd:
            return r12
        L_0x05de:
            java.lang.String r0 = "accountRepository"
            defpackage.sg3.a0(r0)
            throw r7
        L_0x05e4:
            int r0 = r5.B
            if (r0 == 0) goto L_0x05f4
            r10 = 1
            if (r0 != r10) goto L_0x05ef
            defpackage.o85.q(r27)
            goto L_0x061d
        L_0x05ef:
            defpackage.h.s(r13)
            r12 = r7
            goto L_0x061d
        L_0x05f4:
            defpackage.o85.q(r27)
            r0 = r15
            uj r0 = (defpackage.uj) r0
            java.lang.Float r1 = new java.lang.Float
            r2 = 1135869952(0x43b40000, float:360.0)
            r1.<init>(r2)
            r2 = 4666(0x123a, float:6.538E-42)
            ta1 r3 = defpackage.j12.c
            r4 = 2
            jo7 r2 = defpackage.kl8.O(r2, r4, r3)
            r4 = 4
            ib3 r2 = defpackage.kl8.z(r2, r4)
            r10 = 1
            r5.B = r10
            r3 = 0
            r4 = 0
            r6 = 12
            java.lang.Object r0 = defpackage.uj.c(r0, r1, r2, r3, r4, r5, r6)
            if (r0 != r14) goto L_0x061d
            r12 = r14
        L_0x061d:
            return r12
        L_0x061e:
            int r0 = r5.B
            if (r0 == 0) goto L_0x062e
            r10 = 1
            if (r0 != r10) goto L_0x0629
            defpackage.o85.q(r27)
            goto L_0x0657
        L_0x0629:
            defpackage.h.s(r13)
            r12 = r7
            goto L_0x0657
        L_0x062e:
            defpackage.o85.q(r27)
            hv2 r15 = (defpackage.hv2) r15
            java.lang.Object r0 = r15.x
            il r0 = (defpackage.il) r0
            java.lang.Float r1 = new java.lang.Float
            r1.<init>(r6)
            java.lang.Float r2 = new java.lang.Float
            r3 = 1056964608(0x3f000000, float:0.5)
            r2.<init>(r3)
            r3 = 1137180672(0x43c80000, float:400.0)
            r10 = 1
            x17 r2 = defpackage.kl8.M(r6, r3, r2, r10)
            r5.B = r10
            r3 = 1
            r4 = 0
            r6 = 8
            java.lang.Object r0 = defpackage.i95.h(r0, r1, r2, r3, r4, r5, r6)
            if (r0 != r14) goto L_0x0657
            r12 = r14
        L_0x0657:
            return r12
        L_0x0658:
            defpackage.o85.q(r27)
            n04 r15 = (defpackage.n04) r15
            int r0 = r5.B
            g04 r1 = r15.d
            bd5 r2 = r1.b
            int r2 = r2.d()
            if (r2 != r0) goto L_0x0674
            bd5 r2 = r1.c
            int r2 = r2.d()
            if (r2 == 0) goto L_0x0672
            goto L_0x0674
        L_0x0672:
            r6 = 0
            goto L_0x067e
        L_0x0674:
            wz0 r2 = r15.m
            r2.h()
            r2.b = r7
            lm1 r2 = r15.a
            goto L_0x0672
        L_0x067e:
            r1.a(r0, r6)
            r1.e = r7
            uy3 r0 = r15.j
            if (r0 == 0) goto L_0x068a
            r0.k()
        L_0x068a:
            return r12
        L_0x068b:
            int r0 = r5.B
            r10 = 1
            if (r0 == 0) goto L_0x069d
            if (r0 != r10) goto L_0x0698
            defpackage.o85.q(r27)
            r0 = r27
            goto L_0x06b1
        L_0x0698:
            defpackage.h.s(r13)
            r14 = r7
            goto L_0x06bc
        L_0x069d:
            defpackage.o85.q(r27)
            ji3 r15 = (defpackage.ji3) r15
            qe1 r0 = r15.c
            di2 r0 = r0.b()
            r5.B = r10
            java.lang.Object r0 = defpackage.gr8.J(r0, r5)
            if (r0 != r14) goto L_0x06b1
            goto L_0x06bc
        L_0x06b1:
            pp4 r0 = (defpackage.pp4) r0
            if (r0 == 0) goto L_0x06ba
            java.util.Map r14 = r0.a()
            goto L_0x06bc
        L_0x06ba:
            b42 r14 = defpackage.b42.w
        L_0x06bc:
            return r14
        L_0x06bd:
            int r0 = r5.B
            r10 = 1
            if (r0 == 0) goto L_0x06cd
            if (r0 != r10) goto L_0x06c8
            defpackage.o85.q(r27)
            goto L_0x06e1
        L_0x06c8:
            defpackage.h.s(r13)
            r12 = r7
            goto L_0x06e1
        L_0x06cd:
            defpackage.o85.q(r27)
            eh3 r15 = (defpackage.eh3) r15
            r5.B = r10
            do7 r0 = r15.b
            java.lang.Object r0 = r0.f(r5)
            if (r0 != r14) goto L_0x06dd
            goto L_0x06de
        L_0x06dd:
            r0 = r12
        L_0x06de:
            if (r0 != r14) goto L_0x06e1
            r12 = r14
        L_0x06e1:
            return r12
        L_0x06e2:
            int r0 = r5.B
            r10 = 1
            if (r0 == 0) goto L_0x06f2
            if (r0 != r10) goto L_0x06ed
            defpackage.o85.q(r27)
            goto L_0x0700
        L_0x06ed:
            defpackage.h.s(r13)
            r12 = r7
            goto L_0x0700
        L_0x06f2:
            defpackage.o85.q(r27)
            xk2 r15 = (defpackage.xk2) r15
            r5.B = r10
            java.lang.Object r0 = defpackage.r16.t(r15, r7, r5)
            if (r0 != r14) goto L_0x0700
            r12 = r14
        L_0x0700:
            return r12
        L_0x0701:
            r10 = r2
            int r0 = r5.B
            if (r0 == 0) goto L_0x0711
            if (r0 != r10) goto L_0x070c
            defpackage.o85.q(r27)
            goto L_0x0725
        L_0x070c:
            defpackage.h.s(r13)
            r12 = r7
            goto L_0x0725
        L_0x0711:
            defpackage.o85.q(r27)
            di2 r15 = (defpackage.di2) r15
            r5.B = r10
            n05 r0 = defpackage.n05.w
            java.lang.Object r0 = r15.a(r0, r5)
            if (r0 != r14) goto L_0x0721
            goto L_0x0722
        L_0x0721:
            r0 = r12
        L_0x0722:
            if (r0 != r14) goto L_0x0725
            r12 = r14
        L_0x0725:
            return r12
        L_0x0726:
            r10 = r15
            il1 r10 = (defpackage.il1) r10
            int r0 = r5.B
            if (r0 == 0) goto L_0x0739
            r1 = 1
            if (r0 != r1) goto L_0x0734
            defpackage.o85.q(r27)
            goto L_0x0761
        L_0x0734:
            defpackage.h.s(r13)
            r12 = r7
            goto L_0x0761
        L_0x0739:
            defpackage.o85.q(r27)
            f06 r7 = new f06
            r7.<init>()
            f06 r8 = new f06
            r8.<init>()
            f06 r9 = new f06
            r9.<init>()
            ef3 r0 = r10.K
            di2 r0 = r0.a()
            nn0 r6 = new nn0
            r11 = 3
            r6.<init>(r7, r8, r9, r10, r11)
            r10 = 1
            r5.B = r10
            java.lang.Object r0 = r0.a(r6, r5)
            if (r0 != r14) goto L_0x0761
            r12 = r14
        L_0x0761:
            return r12
        L_0x0762:
            r10 = r2
            ok2 r15 = (defpackage.ok2) r15
            int r0 = r5.B
            if (r0 == 0) goto L_0x0774
            if (r0 != r10) goto L_0x076f
            defpackage.o85.q(r27)
            goto L_0x0785
        L_0x076f:
            defpackage.h.s(r13)
            r12 = r7
            goto L_0x0788
        L_0x0774:
            defpackage.o85.q(r27)
            if (r15 == 0) goto L_0x0788
            r5.B = r10
            r0 = 300(0x12c, double:1.48E-321)
            java.lang.Object r0 = defpackage.t49.G(r0, r5)
            if (r0 != r14) goto L_0x0785
            r12 = r14
            goto L_0x0788
        L_0x0785:
            defpackage.ok2.a(r15)
        L_0x0788:
            return r12
        L_0x0789:
            int r0 = r5.B
            r10 = 1
            if (r0 == 0) goto L_0x079b
            if (r0 != r10) goto L_0x0796
            defpackage.o85.q(r27)
            r14 = r27
            goto L_0x07aa
        L_0x0796:
            defpackage.h.s(r13)
            r14 = r7
            goto L_0x07aa
        L_0x079b:
            defpackage.o85.q(r27)
            androidx.work.impl.workers.ConstraintTrackingWorker r15 = (androidx.work.impl.workers.ConstraintTrackingWorker) r15
            r5.B = r10
            java.lang.Object r0 = androidx.work.impl.workers.ConstraintTrackingWorker.g(r15, r5)
            if (r0 != r14) goto L_0x07a9
            goto L_0x07aa
        L_0x07a9:
            r14 = r0
        L_0x07aa:
            return r14
        L_0x07ab:
            r10 = r2
            int r0 = r5.B
            if (r0 == 0) goto L_0x07bd
            if (r0 != r10) goto L_0x07b8
            defpackage.o85.q(r27)
            r14 = r27
            goto L_0x07ce
        L_0x07b8:
            defpackage.h.s(r13)
            r14 = r7
            goto L_0x07ce
        L_0x07bd:
            defpackage.o85.q(r27)
            hf0 r15 = (defpackage.hf0) r15
            r5.B = r10
            gf0 r0 = defpackage.hf0.a
            java.lang.Object r0 = r15.d(r10, r5)
            if (r0 != r14) goto L_0x07cd
            goto L_0x07ce
        L_0x07cd:
            r14 = r0
        L_0x07ce:
            return r14
        L_0x07cf:
            c50 r15 = (defpackage.c50) r15
            int r0 = r5.B
            switch(r0) {
                case 0: goto L_0x07fa;
                case 1: goto L_0x07f6;
                case 2: goto L_0x07f2;
                case 3: goto L_0x07ee;
                case 4: goto L_0x07ea;
                case 5: goto L_0x07e6;
                case 6: goto L_0x07e1;
                case 7: goto L_0x07dc;
                default: goto L_0x07d6;
            }
        L_0x07d6:
            defpackage.h.s(r13)
            r12 = r7
            goto L_0x085b
        L_0x07dc:
            defpackage.o85.q(r27)
            goto L_0x085b
        L_0x07e1:
            defpackage.o85.q(r27)
            goto L_0x084d
        L_0x07e6:
            defpackage.o85.q(r27)
            goto L_0x0841
        L_0x07ea:
            defpackage.o85.q(r27)
            goto L_0x0835
        L_0x07ee:
            defpackage.o85.q(r27)
            goto L_0x0827
        L_0x07f2:
            defpackage.o85.q(r27)
            goto L_0x0819
        L_0x07f6:
            defpackage.o85.q(r27)
            goto L_0x080b
        L_0x07fa:
            defpackage.o85.q(r27)
            vz7 r0 = defpackage.vz7.a
            r10 = 1
            r5.B = r10
            java.lang.String r2 = "saldo"
            java.lang.Object r0 = defpackage.c50.a(r15, r0, r2, r5)
            if (r0 != r14) goto L_0x080b
            goto L_0x085a
        L_0x080b:
            wz7 r0 = defpackage.wz7.a
            r2 = 2
            r5.B = r2
            java.lang.String r2 = "fechaNacional"
            java.lang.Object r0 = defpackage.c50.a(r15, r0, r2, r5)
            if (r0 != r14) goto L_0x0819
            goto L_0x085a
        L_0x0819:
            rz7 r0 = defpackage.rz7.a
            r2 = 3
            r5.B = r2
            java.lang.String r2 = "bonoDatosCu"
            java.lang.Object r0 = defpackage.c50.a(r15, r0, r2, r5)
            if (r0 != r14) goto L_0x0827
            goto L_0x085a
        L_0x0827:
            xz7 r0 = defpackage.xz7.a
            r4 = 4
            r5.B = r4
            java.lang.String r2 = "datos"
            java.lang.Object r0 = defpackage.c50.a(r15, r0, r2, r5)
            if (r0 != r14) goto L_0x0835
            goto L_0x085a
        L_0x0835:
            uz7 r0 = defpackage.uz7.a
            r2 = 5
            r5.B = r2
            java.lang.Object r0 = defpackage.c50.a(r15, r0, r3, r5)
            if (r0 != r14) goto L_0x0841
            goto L_0x085a
        L_0x0841:
            tz7 r0 = defpackage.tz7.a
            r2 = 6
            r5.B = r2
            java.lang.Object r0 = defpackage.c50.a(r15, r0, r1, r5)
            if (r0 != r14) goto L_0x084d
            goto L_0x085a
        L_0x084d:
            sz7 r0 = defpackage.sz7.a
            r2 = 7
            r5.B = r2
            java.lang.String r1 = "amigoStatus"
            java.lang.Object r0 = defpackage.c50.a(r15, r0, r1, r5)
            if (r0 != r14) goto L_0x085b
        L_0x085a:
            r12 = r14
        L_0x085b:
            return r12
        L_0x085c:
            cu.lestebang.utiletecsa.feature.settings.service.BalanceNotificationService r15 = (cu.lestebang.utiletecsa.feature.settings.service.BalanceNotificationService) r15
            int r0 = r5.B
            if (r0 == 0) goto L_0x0870
            r10 = 1
            if (r0 != r10) goto L_0x086a
            defpackage.o85.q(r27)
            goto L_0x08e0
        L_0x086a:
            defpackage.h.s(r13)
            r12 = r7
            goto L_0x08e0
        L_0x0870:
            defpackage.o85.q(r27)
            k40 r0 = r15.z
            java.lang.String r2 = "balanceRepository"
            if (r0 == 0) goto L_0x08f3
            c50 r0 = (defpackage.c50) r0
            di2 r0 = r0.d()
            k40 r4 = r15.z
            if (r4 == 0) goto L_0x08ef
            c50 r4 = (defpackage.c50) r4
            di2 r4 = r4.c()
            k40 r6 = r15.z
            if (r6 == 0) goto L_0x08eb
            c50 r6 = (defpackage.c50) r6
            tz7 r8 = defpackage.tz7.a
            java.lang.String r9 = "--"
            di2 r1 = r6.b(r8, r1, r9)
            k40 r6 = r15.z
            if (r6 == 0) goto L_0x08e7
            c50 r6 = (defpackage.c50) r6
            vz7 r2 = defpackage.vz7.a
            java.lang.String r8 = "00:00:00"
            di2 r2 = r6.b(r2, r3, r8)
            vp6 r3 = r15.B
            if (r3 == 0) goto L_0x08e1
            c6 r3 = r3.a()
            i40 r6 = new i40
            r6.<init>(r15, r7)
            r8 = 5
            di2[] r8 = new defpackage.di2[r8]
            r19 = 0
            r8[r19] = r0
            r10 = 1
            r8[r10] = r4
            r0 = 2
            r8[r0] = r1
            r18 = 3
            r8[r18] = r2
            r17 = 4
            r8[r17] = r3
            lg r1 = new lg
            r1.<init>(r0, r15)
            r5.B = r10
            x10 r2 = defpackage.x10.G
            yi2 r3 = new yi2
            r3.<init>((defpackage.f61) r7, (defpackage.ds2) r6, (int) r0)
            java.lang.Object r0 = defpackage.mp7.S(r5, r1, r2, r3, r8)
            if (r0 != r14) goto L_0x08dc
            goto L_0x08dd
        L_0x08dc:
            r0 = r12
        L_0x08dd:
            if (r0 != r14) goto L_0x08e0
            r12 = r14
        L_0x08e0:
            return r12
        L_0x08e1:
            java.lang.String r0 = "settingsRepository"
            defpackage.sg3.a0(r0)
            throw r7
        L_0x08e7:
            defpackage.sg3.a0(r2)
            throw r7
        L_0x08eb:
            defpackage.sg3.a0(r2)
            throw r7
        L_0x08ef:
            defpackage.sg3.a0(r2)
            throw r7
        L_0x08f3:
            defpackage.sg3.a0(r2)
            throw r7
        L_0x08f7:
            qt r15 = (defpackage.qt) r15
            int r0 = r5.B
            if (r0 == 0) goto L_0x0909
            r10 = 1
            if (r0 != r10) goto L_0x0904
            defpackage.o85.q(r27)
            goto L_0x0942
        L_0x0904:
            defpackage.h.s(r13)
            r12 = r7
            goto L_0x0942
        L_0x0909:
            defpackage.o85.q(r27)
            zh r0 = new zh
            r2 = 3
            r0.<init>((int) r2, (java.lang.Object) r15)
            ze1 r22 = defpackage.u55.w(r0)
            n0 r0 = new n0
            r2 = 7
            r0.<init>(r15, r7, r2)
            int r1 = defpackage.zi2.a
            yi2 r1 = new yi2
            r6 = 0
            r1.<init>((java.lang.Object) r0, (defpackage.f61) r7, (int) r6)
            on0 r20 = new on0
            r24 = -2
            vc0 r25 = defpackage.vc0.w
            x32 r23 = defpackage.x32.w
            r21 = r1
            r20.<init>(r21, r22, r23, r24, r25)
            r0 = r20
            nt r1 = new nt
            r1.<init>(r6, r15)
            r10 = 1
            r5.B = r10
            java.lang.Object r0 = r0.a(r1, r5)
            if (r0 != r14) goto L_0x0942
            r12 = r14
        L_0x0942:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ot.s(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ot(Object obj, f61 f61, int i) {
        super(2, f61);
        this.A = i;
        this.C = obj;
    }
}
