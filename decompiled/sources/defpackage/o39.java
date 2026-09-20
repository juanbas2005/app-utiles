package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;

/* renamed from: o39  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class o39 implements Runnable {
    public final /* synthetic */ int w;
    public final /* synthetic */ v49 x;

    public /* synthetic */ o39(v49 v49, int i) {
        this.w = i;
        this.x = v49;
    }

    public final void run() {
        String str;
        int i = this.w;
        v49 v49 = this.x;
        switch (i) {
            case b85.b:
                v49.z1();
                return;
            case 1:
                v09 v09 = v49.M;
                y19 y19 = v09.w;
                r19 r19 = y19.C;
                v49 v492 = y19.I;
                q09 q09 = y19.A;
                y19.g(r19);
                r19.b1();
                if (v09.e()) {
                    if (v09.d()) {
                        y19.e(q09);
                        q09.S.k((String) null);
                        Bundle bundle = new Bundle();
                        bundle.putString("source", "(not set)");
                        bundle.putString("medium", "(not set)");
                        bundle.putString("_cis", "intent");
                        bundle.putLong("_cc", 1);
                        y19.f(v492);
                        v492.j1("auto", "_cmpx", bundle);
                    } else {
                        y19.e(q09);
                        l90 l90 = q09.S;
                        String j = l90.j();
                        if (TextUtils.isEmpty(j)) {
                            pz8 pz8 = y19.B;
                            y19.g(pz8);
                            pz8.C.a("Cache still valid but referrer not found");
                        } else {
                            long j2 = 3600000;
                            long a = q09.T.a() / 3600000;
                            Uri parse = Uri.parse(j);
                            Bundle bundle2 = new Bundle();
                            Pair pair = new Pair(parse.getPath(), bundle2);
                            for (String next : parse.getQueryParameterNames()) {
                                bundle2.putString(next, parse.getQueryParameter(next));
                                j2 = j2;
                            }
                            Bundle bundle3 = (Bundle) pair.second;
                            bundle3.putLong("_cc", (a - 1) * j2);
                            Object obj = pair.first;
                            if (obj == null) {
                                str = "app";
                            } else {
                                str = (String) obj;
                            }
                            y19.f(v492);
                            v492.j1(str, "_cmp", (Bundle) pair.second);
                        }
                        l90.k((String) null);
                    }
                    y19.e(q09);
                    q09.T.b(0);
                    return;
                }
                return;
            case 2:
                v49.b1();
                y19 y192 = (y19) v49.w;
                q09 q092 = y192.A;
                pz8 pz82 = y192.B;
                y19.e(q092);
                h09 h09 = q092.P;
                if (!h09.a()) {
                    l09 l09 = q092.Q;
                    long a2 = l09.a();
                    l09.b(1 + a2);
                    if (a2 >= 5) {
                        y19.g(pz82);
                        pz82.E.a("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
                        h09.b(true);
                        return;
                    }
                    if (v49.O == null) {
                        v49.O = new p39(v49, y192, 3);
                    }
                    v49.O.b(0);
                    return;
                }
                y19.g(pz82);
                pz82.I.a("Deferred Deep Link already retrieved. Not fetching again.");
                return;
            default:
                v49.z1();
                return;
        }
    }
}
