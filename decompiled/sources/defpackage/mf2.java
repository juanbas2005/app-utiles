package defpackage;

import android.util.Log;
import com.google.firebase.abt.AbtException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import java.util.Set;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: mf2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class mf2 implements e77, g61 {
    public final /* synthetic */ nf2 w;

    public /* synthetic */ mf2(nf2 nf2) {
        this.w = nf2;
    }

    public Object c(yb9 yb9) {
        nf2 nf2 = this.w;
        nf2.getClass();
        boolean z = false;
        if (yb9.k()) {
            qz0 qz0 = nf2.c;
            synchronized (qz0) {
                qz0.c = b35.l((Object) null);
            }
            e01 e01 = qz0.b;
            synchronized (e01) {
                e01.a.deleteFile(e01.b);
            }
            sz0 sz0 = (sz0) yb9.i();
            if (sz0 != null) {
                JSONArray jSONArray = sz0.d;
                ke2 ke2 = nf2.a;
                if (ke2 != null) {
                    try {
                        ke2.c(nf2.d(jSONArray));
                    } catch (JSONException e) {
                        Log.e("FirebaseRemoteConfig", "Could not parse ABT experiments from the JSON response.", e);
                    } catch (AbtException e2) {
                        Log.w("FirebaseRemoteConfig", "Could not update ABT experiments.", e2);
                    }
                }
                am6 am6 = nf2.i;
                try {
                    l10 s = ((kg5) am6.y).s(sz0);
                    for (r91 w86 : (Set) am6.A) {
                        ((Executor) am6.z).execute(new w86(w86, s, 0));
                    }
                } catch (FirebaseRemoteConfigException e3) {
                    Log.w("FirebaseRemoteConfig", "Exception publishing RolloutsState to subscribers. Continuing to listen for changes.", e3);
                }
            } else {
                Log.e("FirebaseRemoteConfig", "Activated configs written to disk are null.");
            }
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public yb9 q(Object obj) {
        Void voidR = (Void) obj;
        nf2 nf2 = this.w;
        yb9 b = nf2.c.b();
        yb9 b2 = nf2.d.b();
        return b35.B(b, b2).g(nf2.b, new yz0(nf2, b, b2, 3));
    }
}
