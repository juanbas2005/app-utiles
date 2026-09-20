package defpackage;

import cu.lestebang.utiletecsa.feature.settings.service.BalanceNotificationService;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: h40  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class h40 extends h61 {
    public Iterator A;
    public int B;
    public int C;
    public int D;
    public int E;
    public /* synthetic */ Object F;
    public final /* synthetic */ BalanceNotificationService G;
    public int H;
    public Collection z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h40(BalanceNotificationService balanceNotificationService, h61 h61) {
        super(h61);
        this.G = balanceNotificationService;
    }

    public final Object s(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        return BalanceNotificationService.b(this.G, (az7) null, 0, this);
    }
}
