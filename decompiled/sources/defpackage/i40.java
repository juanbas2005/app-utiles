package defpackage;

import cu.lestebang.utiletecsa.feature.settings.service.BalanceNotificationService;
import java.util.Map;

/* renamed from: i40  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class i40 extends a97 implements ks2 {
    public int A;
    public /* synthetic */ String B;
    public /* synthetic */ String C;
    public /* synthetic */ String D;
    public /* synthetic */ String E;
    public /* synthetic */ zn6 F;
    public final /* synthetic */ BalanceNotificationService G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i40(BalanceNotificationService balanceNotificationService, f61 f61) {
        super(6, f61);
        this.G = balanceNotificationService;
    }

    public final Object F(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        i40 i40 = new i40(this.G, (f61) obj6);
        i40.B = (String) obj;
        i40.C = (String) obj2;
        i40.D = (String) obj3;
        i40.E = (String) obj4;
        i40.F = (zn6) obj5;
        return i40.s(vs7.a);
    }

    public final Object s(Object obj) {
        az7 az7;
        String str = this.B;
        String str2 = this.C;
        String str3 = this.D;
        String str4 = this.E;
        zn6 zn6 = this.F;
        int i = this.A;
        zn6 zn62 = zn6;
        BalanceNotificationService balanceNotificationService = this.G;
        if (i == 0) {
            o85.q(obj);
            int i2 = zn62.f;
            if (i2 == 1) {
                az7 = zn62.t;
            } else {
                az7 = zn62.s;
            }
            this.B = str;
            this.C = str2;
            this.D = str3;
            this.E = str4;
            this.F = null;
            this.A = 1;
            obj = BalanceNotificationService.b(balanceNotificationService, az7, i2, this);
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
        d37 d37 = BalanceNotificationService.E;
        return balanceNotificationService.c(str, str2, str3, str4, (Map) obj);
    }
}
