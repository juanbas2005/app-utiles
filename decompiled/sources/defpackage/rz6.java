package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* renamed from: rz6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class rz6 {
    public final Context a;
    public final vp6 b;
    public final ig0 c;
    public final ConnectivityManager d;
    public final NetworkRequest e = new NetworkRequest.Builder().addTransportType(1).addTransportType(0).build();
    public final Set f = Collections.synchronizedSet(new LinkedHashSet());
    public final db3 g = new db3(3, this);
    public boolean h;
    public h27 i;

    public rz6(Context context, vp6 vp6, h81 h81) {
        vp6.getClass();
        this.a = context;
        this.b = vp6;
        this.c = gl0.E(rc9.D0(b85.d(), h81));
        this.d = (ConnectivityManager) context.getSystemService(ConnectivityManager.class);
    }

    public final void a() {
        h27 h27 = this.i;
        if (h27 != null) {
            h27.o((CancellationException) null);
        }
        this.i = ar7.H(this.c, (e81) null, (r81) null, new gw6(this, (f61) null, 1), 3);
    }
}
