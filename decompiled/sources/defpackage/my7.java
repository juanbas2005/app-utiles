package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import cu.lestebang.utiletecsa.feature.settings.service.UssdAutoUpdaterService;

/* renamed from: my7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class my7 {
    public final Context a;
    public final dv7 b;
    public final ig0 c;

    public my7(Context context, dv7 dv7, h81 h81) {
        dv7.getClass();
        this.a = context;
        this.b = dv7;
        ig0 E = gl0.E(rc9.D0(b85.d(), h81));
        this.c = E;
        gr8.Q(new qi2(gr8.F(new c6(((dy7) dv7).d(), 25)), new h70(this, (f61) null, 3), 2), E);
    }

    public final void a() {
        yh7.a.getClass();
        hr2.m(new Object[0]);
        Context context = this.a;
        Intent intent = new Intent(context, UssdAutoUpdaterService.class);
        if (Build.VERSION.SDK_INT >= 26) {
            ag8.H(context, intent);
        } else {
            context.startService(intent);
        }
    }

    public final void b() {
        yh7.a.getClass();
        hr2.m(new Object[0]);
        Context context = this.a;
        context.stopService(new Intent(context, UssdAutoUpdaterService.class));
    }
}
