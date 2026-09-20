package defpackage;

import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.session.SessionManager;

/* renamed from: qd1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class qd1 implements lu5 {
    public final /* synthetic */ int a;

    public /* synthetic */ qd1() {
        this.a = 0;
    }

    public final Object get() {
        switch (this.a) {
            case b85.b:
                return new z66();
            case 1:
                b01 e = b01.e();
                i75.c(e);
                return e;
            case 2:
                RemoteConfigManager instance = RemoteConfigManager.getInstance();
                i75.c(instance);
                return instance;
            default:
                SessionManager instance2 = SessionManager.getInstance();
                i75.c(instance2);
                return instance2;
        }
    }

    public /* synthetic */ qd1(am6 am6, int i) {
        this.a = i;
    }
}
