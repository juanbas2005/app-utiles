package defpackage;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import cu.lestebang.utiletecsa.feature.settings.service.UssdAutoUpdaterService;

/* renamed from: sy7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class sy7 extends ContentObserver {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public sy7(ad0 ad0, Handler handler) {
        super(handler);
        this.b = ad0;
    }

    public final void onChange(boolean z, Uri uri) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case b85.b:
                UssdAutoUpdaterService ussdAutoUpdaterService = (UssdAutoUpdaterService) obj;
                d37 d37 = UssdAutoUpdaterService.T;
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - ussdAutoUpdaterService.L >= 10000) {
                    ig0 ig0 = ussdAutoUpdaterService.C;
                    if (ig0 != null) {
                        ar7.H(ig0, (e81) null, (r81) null, new qh6(currentTimeMillis, (f61) null, ussdAutoUpdaterService), 3);
                        return;
                    } else {
                        sg3.a0("scope");
                        throw null;
                    }
                } else {
                    return;
                }
            default:
                ((ad0) obj).c(vs7.a);
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public sy7(Handler handler, UssdAutoUpdaterService ussdAutoUpdaterService) {
        super(handler);
        this.b = ussdAutoUpdaterService;
    }
}
