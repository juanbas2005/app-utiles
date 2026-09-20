package defpackage;

import android.net.TrafficStats;
import cu.lestebang.utiletecsa.R;
import cu.lestebang.utiletecsa.feature.nauta.service.NautaOverlayService;
import cu.lestebang.utiletecsa.feature.settings.service.UssdAutoUpdaterService;

/* renamed from: o94  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class o94 extends a97 implements gs2 {
    public final /* synthetic */ int A = 2;
    public long B;
    public int C;
    public /* synthetic */ Object D;
    public final /* synthetic */ Object E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o94(p94 p94, String str, long j, f61 f61) {
        super(2, f61);
        this.D = p94;
        this.E = str;
        this.B = j;
    }

    public final Object H(Object obj, Object obj2) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        o81 o81 = (o81) obj;
        f61 f61 = (f61) obj2;
        switch (i) {
            case b85.b:
                return ((o94) o(f61, o81)).s(vs7);
            case 1:
                return ((o94) o(f61, o81)).s(vs7);
            default:
                return ((o94) o(f61, o81)).s(vs7);
        }
    }

    public final f61 o(f61 f61, Object obj) {
        int i = this.A;
        Object obj2 = this.E;
        switch (i) {
            case b85.b:
                return new o94((p94) this.D, (String) obj2, this.B, f61);
            case 1:
                o94 o94 = new o94((NautaOverlayService) obj2, f61);
                o94.D = obj;
                return o94;
            default:
                o94 o942 = new o94(this.B, f61, (UssdAutoUpdaterService) obj2);
                o942.D = obj;
                return o942;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x008e  */
    public final Object s(Object obj) {
        long j;
        long totalRxBytes;
        int i = this.A;
        vs7 vs7 = vs7.a;
        Object obj2 = this.E;
        p81 p81 = p81.w;
        switch (i) {
            case b85.b:
                int i2 = this.C;
                if (i2 == 0) {
                    o85.q(obj);
                    xk3 xk3 = ((p94) this.D).a;
                    long j2 = this.B;
                    this.C = 1;
                    Object P = sg3.P(this, xk3.a, false, true, new tk3(0, j2, (String) obj2));
                    if (P != p81) {
                        P = vs7;
                    }
                    if (P == p81) {
                        return p81;
                    }
                    return vs7;
                } else if (i2 == 1) {
                    o85.q(obj);
                    return vs7;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            case 1:
                o81 o81 = (o81) this.D;
                int i3 = this.C;
                if (i3 == 0) {
                    o85.q(obj);
                    j = TrafficStats.getTotalRxBytes();
                } else if (i3 == 1) {
                    j = this.B;
                    o85.q(obj);
                    totalRxBytes = TrafficStats.getTotalRxBytes();
                    if (totalRxBytes != -1) {
                        long j3 = 0;
                        if (j >= 0) {
                            d37 d37 = ((NautaOverlayService) obj2).I;
                            long j4 = totalRxBytes - j;
                            if (j4 >= 0) {
                                j3 = j4;
                            }
                            Long l = new Long(j3);
                            d37.getClass();
                            d37.l((Object) null, l);
                        }
                    }
                    j = totalRxBytes;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                if (!gl0.X(o81)) {
                    this.D = o81;
                    this.B = j;
                    this.C = 1;
                    if (t49.G(1000, this) == p81) {
                        return p81;
                    }
                    totalRxBytes = TrafficStats.getTotalRxBytes();
                    if (totalRxBytes != -1) {
                    }
                    j = totalRxBytes;
                    if (!gl0.X(o81)) {
                        return vs7;
                    }
                }
                return vs7;
            default:
                o81 o812 = (o81) this.D;
                int i4 = this.C;
                if (i4 == 0) {
                    o85.q(obj);
                } else if (i4 == 1) {
                    o85.q(obj);
                    UssdAutoUpdaterService ussdAutoUpdaterService = (UssdAutoUpdaterService) obj2;
                    String string = ussdAutoUpdaterService.getString(R.string.ussd_auto_trigger_periodic);
                    string.getClass();
                    ussdAutoUpdaterService.i(string, new ha7(23));
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                if (!gl0.X(o812)) {
                    long j5 = this.B;
                    this.D = o812;
                    this.C = 1;
                    if (t49.G(j5, this) == p81) {
                        return p81;
                    }
                    UssdAutoUpdaterService ussdAutoUpdaterService2 = (UssdAutoUpdaterService) obj2;
                    String string2 = ussdAutoUpdaterService2.getString(R.string.ussd_auto_trigger_periodic);
                    string2.getClass();
                    ussdAutoUpdaterService2.i(string2, new ha7(23));
                    if (!gl0.X(o812)) {
                        return vs7;
                    }
                }
                return vs7;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o94(long j, f61 f61, UssdAutoUpdaterService ussdAutoUpdaterService) {
        super(2, f61);
        this.B = j;
        this.E = ussdAutoUpdaterService;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o94(NautaOverlayService nautaOverlayService, f61 f61) {
        super(2, f61);
        this.E = nautaOverlayService;
    }
}
