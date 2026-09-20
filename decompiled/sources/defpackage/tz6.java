package defpackage;

import android.net.TrafficStats;
import cu.lestebang.utiletecsa.feature.settings.service.SpeedOverlayService;

/* renamed from: tz6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class tz6 extends a97 implements gs2 {
    public long A;
    public long B;
    public int C;
    public /* synthetic */ Object D;
    public final /* synthetic */ SpeedOverlayService E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tz6(SpeedOverlayService speedOverlayService, f61 f61) {
        super(2, f61);
        this.E = speedOverlayService;
    }

    public final Object H(Object obj, Object obj2) {
        return ((tz6) o((f61) obj2, (o81) obj)).s(vs7.a);
    }

    public final f61 o(f61 f61, Object obj) {
        tz6 tz6 = new tz6(this.E, f61);
        tz6.D = obj;
        return tz6;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0032  */
    public final Object s(Object obj) {
        long j;
        long j2;
        int i;
        long j3;
        long j4;
        o81 o81 = (o81) this.D;
        int i2 = this.C;
        int i3 = 1;
        if (i2 == 0) {
            o85.q(obj);
            j = TrafficStats.getTotalRxBytes();
            j2 = TrafficStats.getTotalTxBytes();
        } else if (i2 == 1) {
            j2 = this.B;
            j = this.A;
            o85.q(obj);
            long totalRxBytes = TrafficStats.getTotalRxBytes();
            long totalTxBytes = TrafficStats.getTotalTxBytes();
            i = (totalRxBytes > -1 ? 1 : (totalRxBytes == -1 ? 0 : -1));
            SpeedOverlayService speedOverlayService = this.E;
            long j5 = 0;
            if (i == 0 || j < 0) {
                j3 = 0;
                if (totalTxBytes != -1 && j2 >= 0) {
                    j4 = totalTxBytes - j2;
                    if (j4 < 0) {
                        j4 = 0;
                    }
                    d37 d37 = speedOverlayService.H;
                    Long l = new Long(j4);
                    d37.getClass();
                    d37.l((Object) null, l);
                    j5 = j4;
                }
                d37 d372 = speedOverlayService.I;
                d372.l((Object) null, new Long(j3 + j5 + ((Number) d372.getValue()).longValue()));
                j = totalRxBytes;
                j2 = totalTxBytes;
                i3 = 1;
            } else {
                j3 = totalRxBytes - j;
                if (j3 < 0) {
                    j3 = 0;
                }
                d37 d373 = speedOverlayService.G;
                Long l2 = new Long(j3);
                d373.getClass();
                d373.l((Object) null, l2);
                j4 = totalTxBytes - j2;
                if (j4 < 0) {
                }
                d37 d374 = speedOverlayService.H;
                Long l3 = new Long(j4);
                d374.getClass();
                d374.l((Object) null, l3);
                j5 = j4;
                d37 d3722 = speedOverlayService.I;
                d3722.l((Object) null, new Long(j3 + j5 + ((Number) d3722.getValue()).longValue()));
                j = totalRxBytes;
                j2 = totalTxBytes;
                i3 = 1;
            }
            j3 = 0;
            j4 = totalTxBytes - j2;
            if (j4 < 0) {
            }
            d37 d3742 = speedOverlayService.H;
            Long l32 = new Long(j4);
            d3742.getClass();
            d3742.l((Object) null, l32);
            j5 = j4;
            d37 d37222 = speedOverlayService.I;
            d37222.l((Object) null, new Long(j3 + j5 + ((Number) d37222.getValue()).longValue()));
            j = totalRxBytes;
            j2 = totalTxBytes;
            i3 = 1;
        } else {
            h.s("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        if (!gl0.X(o81)) {
            this.D = o81;
            this.A = j;
            this.B = j2;
            this.C = i3;
            Object G = t49.G(1000, this);
            p81 p81 = p81.w;
            if (G == p81) {
                return p81;
            }
            long totalRxBytes2 = TrafficStats.getTotalRxBytes();
            long totalTxBytes2 = TrafficStats.getTotalTxBytes();
            i = (totalRxBytes2 > -1 ? 1 : (totalRxBytes2 == -1 ? 0 : -1));
            SpeedOverlayService speedOverlayService2 = this.E;
            long j52 = 0;
            if (i == 0 || j < 0) {
            }
            j3 = 0;
            j4 = totalTxBytes2 - j2;
            if (j4 < 0) {
            }
            d37 d37422 = speedOverlayService2.H;
            Long l322 = new Long(j4);
            d37422.getClass();
            d37422.l((Object) null, l322);
            j52 = j4;
            d37 d372222 = speedOverlayService2.I;
            d372222.l((Object) null, new Long(j3 + j52 + ((Number) d372222.getValue()).longValue()));
            j = totalRxBytes2;
            j2 = totalTxBytes2;
            i3 = 1;
            if (!gl0.X(o81)) {
            }
        }
        return vs7.a;
    }
}
