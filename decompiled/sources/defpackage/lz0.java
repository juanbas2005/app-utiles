package defpackage;

import android.util.Log;
import com.google.firebase.FirebaseException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: lz0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class lz0 implements g61 {
    public final /* synthetic */ int A;
    public final /* synthetic */ nz0 w;
    public final /* synthetic */ yb9 x;
    public final /* synthetic */ yb9 y;
    public final /* synthetic */ long z;

    public /* synthetic */ lz0(nz0 nz0, yb9 yb9, yb9 yb92, long j, int i) {
        this.w = nz0;
        this.x = yb9;
        this.y = yb92;
        this.z = j;
        this.A = i;
    }

    public final Object c(yb9 yb9) {
        Boolean bool;
        nz0 nz0 = this.w;
        yb9 yb92 = this.x;
        yb9 yb93 = this.y;
        long j = this.z;
        int i = this.A;
        if (!yb92.k()) {
            return b35.k(new FirebaseException("Failed to auto-fetch config update.", yb92.h()));
        }
        if (!yb93.k()) {
            return b35.k(new FirebaseException("Failed to get activated config for auto-fetch", yb93.h()));
        }
        vz0 vz0 = (vz0) yb92.i();
        sz0 sz0 = (sz0) yb93.i();
        sz0 sz02 = vz0.b;
        boolean z2 = false;
        if (sz02 != null) {
            if (sz02.f >= j) {
                z2 = true;
            }
            bool = Boolean.valueOf(z2);
        } else {
            if (vz0.a == 1) {
                z2 = true;
            }
            bool = Boolean.valueOf(z2);
        }
        if (!bool.booleanValue()) {
            Log.d("FirebaseRemoteConfig", "Fetched template version is the same as SDK's current version. Retrying fetch.");
            nz0.a(j, i);
            return b35.l((Object) null);
        } else if (vz0.b == null) {
            Log.d("FirebaseRemoteConfig", "The fetch succeeded, but the backend had no updates.");
            return b35.l((Object) null);
        } else {
            if (sz0 == null) {
                rz0 d = sz0.d();
                sz0 = new sz0(d.a, d.b, d.c, d.d, d.e, d.f);
            }
            sz0 sz03 = vz0.b;
            JSONObject jSONObject = sz0.e;
            JSONObject jSONObject2 = sz03.a;
            JSONObject jSONObject3 = sz03.b;
            JSONObject jSONObject4 = sz03.e;
            JSONObject jSONObject5 = sz0.a(new JSONObject(jSONObject2.toString())).b;
            HashMap c = sz0.c();
            HashMap c2 = sz03.c();
            HashMap b = sz0.b();
            HashMap b2 = sz03.b();
            HashSet hashSet = new HashSet();
            JSONObject jSONObject6 = sz0.b;
            Iterator<String> keys = jSONObject6.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (!jSONObject3.has(next)) {
                    hashSet.add(next);
                } else if (!jSONObject6.get(next).equals(jSONObject3.get(next))) {
                    hashSet.add(next);
                } else if ((jSONObject.has(next) && !jSONObject4.has(next)) || (!jSONObject.has(next) && jSONObject4.has(next))) {
                    hashSet.add(next);
                } else if (jSONObject.has(next) && jSONObject4.has(next) && !jSONObject.getJSONObject(next).toString().equals(jSONObject4.getJSONObject(next).toString())) {
                    hashSet.add(next);
                } else if (c.containsKey(next) != c2.containsKey(next)) {
                    hashSet.add(next);
                } else if (c.containsKey(next) && c2.containsKey(next) && !((Map) c.get(next)).equals(c2.get(next))) {
                    hashSet.add(next);
                } else if (b.containsKey(next) != b2.containsKey(next)) {
                    hashSet.add(next);
                } else if (!b2.containsKey(next) || !b.containsKey(next) || ((JSONObject) b2.get(next)).toString().equals(((JSONObject) b.get(next)).toString())) {
                    jSONObject5.remove(next);
                } else {
                    hashSet.add(next);
                }
            }
            Iterator<String> keys2 = jSONObject5.keys();
            while (keys2.hasNext()) {
                hashSet.add(keys2.next());
            }
            if (hashSet.isEmpty()) {
                Log.d("FirebaseRemoteConfig", "Config was fetched, but no params changed.");
                return b35.l((Object) null);
            }
            synchronized (nz0) {
                try {
                    for (zz0 zz0 : (LinkedHashSet) nz0.b) {
                        zz0.getClass();
                    }
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
            return b35.l((Object) null);
        }
    }
}
