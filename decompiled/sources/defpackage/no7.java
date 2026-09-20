package defpackage;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: no7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class no7 implements p38, ct {
    public Object A;
    public final /* synthetic */ int w;
    public final Object x;
    public Object y;
    public Object z;

    public no7() {
        this.w = 4;
        k68 k68 = new k68(11);
        this.x = k68;
        no7 no7 = new no7((no7) null, k68);
        this.z = no7;
        this.y = no7.k();
        ay4 ay4 = new ay4(20);
        this.A = ay4;
        no7.m("require", new xb9(ay4));
        ((HashMap) ay4.x).put("internal.platform", fw8.b);
        no7.m("runtime.counter", new wn8(Double.valueOf(0.0d)));
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:17|18) */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:19|20) */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r5 = r2.b(defpackage.kl8.u(r5), r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r5 = r2.a(defpackage.kl8.u(r5));
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0057 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0060 */
    public r58 b(gq3 gq3, String str) {
        r58 r58;
        gq3.getClass();
        synchronized (((hr2) this.A)) {
            try {
                r58 = (r58) ((z58) this.x).a.get(str);
                if (gq3.L(r58)) {
                    w58 w58 = (w58) this.y;
                    if (w58 instanceof jf6) {
                        jf6 jf6 = (jf6) w58;
                        r58.getClass();
                        in8 in8 = jf6.d;
                        if (in8 != null) {
                            kg5 kg5 = jf6.e;
                            kg5.getClass();
                            pv8.n(r58, kg5, in8);
                        }
                    }
                    r58.getClass();
                } else {
                    to4 to4 = new to4((ib1) this.z);
                    to4.a.put(y58.a, str);
                    w58 w582 = (w58) this.y;
                    w582.getClass();
                    r58 a = w582.c(gq3, to4);
                    r58 = a;
                    z58 z58 = (z58) this.x;
                    z58.getClass();
                    r58.getClass();
                    r58 r582 = (r58) z58.a.put(str, r58);
                    if (r582 != null) {
                        r582.b();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return r58;
    }

    public boolean c(ut1 ut1) {
        boolean z2;
        if (((ut1) this.y).equals(ut1)) {
            return true;
        }
        no7 no7 = (no7) this.x;
        if (no7 != null) {
            z2 = no7.c(ut1);
        } else {
            z2 = false;
        }
        if (z2) {
            return true;
        }
        return false;
    }

    public ListenableFuture call() {
        int i = this.w;
        fv1 fv1 = fv1.w;
        Object obj = this.x;
        switch (i) {
            case 7:
                o00 o00 = (o00) obj;
                h3 g = pt2.g((ListenableFuture) this.y, new gb9(o00, 0), fv1);
                h3 g2 = pt2.g(g, (l99) this.z, (Executor) this.A);
                hb9 hb9 = new hb9(o00, g, g2, 0);
                int i2 = mc9.a;
                return pt2.g(g2, new l99(4, vb9.a(), hb9), fv1);
            default:
                hb9 hb92 = new hb9((eb9) obj, (l99) this.z, (Executor) this.A, 1);
                int i3 = mc9.a;
                return pt2.g((x1) this.y, new l99(4, vb9.a(), hb92), fv1);
        }
    }

    public long d(ol olVar, ol olVar2, ol olVar3) {
        int b = olVar.b();
        long j = 0;
        for (int i = 0; i < b; i++) {
            j = Math.max(j, ((pl) this.x).get(i).c(olVar.a(i), olVar2.a(i), olVar3.a(i)));
        }
        return j;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:40|41|51|52|63|53) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x010b */
    public Bundle e() {
        q09 q09 = (q09) this.A;
        if (((Bundle) this.z) == null) {
            SharedPreferences g1 = q09.g1();
            y19 y19 = (y19) q09.w;
            String string = g1.getString((String) this.x, (String) null);
            if (string != null) {
                try {
                    Bundle bundle = new Bundle();
                    JSONArray jSONArray = new JSONArray(string);
                    for (int i = 0; i < jSONArray.length(); i++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i);
                        String string2 = jSONObject.getString("n");
                        String string3 = jSONObject.getString("t");
                        int hashCode = string3.hashCode();
                        if (hashCode != 100) {
                            if (hashCode != 108) {
                                if (hashCode != 115) {
                                    if (hashCode != 3352) {
                                        if (hashCode == 3445 && string3.equals("la")) {
                                            wo8.a();
                                            if (y19.z.n1((String) null, by8.P0)) {
                                                JSONArray jSONArray2 = new JSONArray(jSONObject.getString("v"));
                                                int length = jSONArray2.length();
                                                long[] jArr = new long[length];
                                                for (int i2 = 0; i2 < length; i2++) {
                                                    jArr[i2] = jSONArray2.optLong(i2);
                                                }
                                                bundle.putLongArray(string2, jArr);
                                            }
                                        }
                                    } else if (string3.equals("ia")) {
                                        wo8.a();
                                        if (y19.z.n1((String) null, by8.P0)) {
                                            JSONArray jSONArray3 = new JSONArray(jSONObject.getString("v"));
                                            int length2 = jSONArray3.length();
                                            int[] iArr = new int[length2];
                                            for (int i3 = 0; i3 < length2; i3++) {
                                                iArr[i3] = jSONArray3.optInt(i3);
                                            }
                                            bundle.putIntArray(string2, iArr);
                                        }
                                    }
                                } else if (string3.equals("s")) {
                                    bundle.putString(string2, jSONObject.getString("v"));
                                    pz8 pz8 = y19.B;
                                    y19.g(pz8);
                                    pz8.B.a("Error reading value from SharedPreferences. Value dropped");
                                }
                            } else if (string3.equals("l")) {
                                bundle.putLong(string2, Long.parseLong(jSONObject.getString("v")));
                                pz8 pz82 = y19.B;
                                y19.g(pz82);
                                pz82.B.a("Error reading value from SharedPreferences. Value dropped");
                            }
                        } else if (string3.equals("d")) {
                            bundle.putDouble(string2, Double.parseDouble(jSONObject.getString("v")));
                        }
                        pz8 pz83 = y19.B;
                        y19.g(pz83);
                        pz83.B.b("Unrecognized persisted bundle type. Type", string3);
                    }
                    this.z = bundle;
                } catch (JSONException unused) {
                    pz8 pz84 = y19.B;
                    y19.g(pz84);
                    pz84.B.a("Error loading bundle from SharedPreferences. Values will be lost");
                }
            }
            if (((Bundle) this.z) == null) {
                this.z = (Bundle) this.y;
            }
        }
        Bundle bundle2 = (Bundle) this.z;
        z65.k(bundle2);
        return new Bundle(bundle2);
    }

    public bq8 f(no7 no7, x29... x29Arr) {
        bq8 bq8 = bq8.o;
        for (x29 x2 : x29Arr) {
            bq8 = ub5.x(x2);
            ya5.H((no7) this.z);
            if ((bq8 instanceof gq8) || (bq8 instanceof aq8)) {
                bq8 = ((k68) this.x).r(no7, bq8);
            }
        }
        return bq8;
    }

    public bq8 g(bq8 bq8) {
        return ((k68) this.y).r(this, bq8);
    }

    public bq8 h(rl8 rl8) {
        bq8 bq8 = bq8.o;
        Iterator x2 = rl8.x();
        while (x2.hasNext()) {
            bq8 = ((k68) this.y).r(this, rl8.z(((Integer) x2.next()).intValue()));
            if (bq8 instanceof cn8) {
                break;
            }
        }
        return bq8;
    }

    public void i(Bundle bundle) {
        Bundle bundle2;
        q09 q09 = (q09) this.A;
        if (bundle == null) {
            bundle2 = new Bundle();
        } else {
            bundle2 = new Bundle(bundle);
        }
        SharedPreferences g1 = q09.g1();
        y19 y19 = (y19) q09.w;
        SharedPreferences.Editor edit = g1.edit();
        int size = bundle2.size();
        String str = (String) this.x;
        if (size == 0) {
            edit.remove(str);
        } else {
            JSONArray jSONArray = new JSONArray();
            for (String next : bundle2.keySet()) {
                Object obj = bundle2.get(next);
                if (obj != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("n", next);
                        wo8.a();
                        if (!y19.z.n1((String) null, by8.P0)) {
                            jSONObject.put("v", obj.toString());
                            if (obj instanceof String) {
                                jSONObject.put("t", "s");
                            } else if (obj instanceof Long) {
                                jSONObject.put("t", "l");
                            } else if (obj instanceof Double) {
                                jSONObject.put("t", "d");
                            } else {
                                pz8 pz8 = y19.B;
                                y19.g(pz8);
                                pz8.B.b("Cannot serialize bundle value to SharedPreferences. Type", obj.getClass());
                            }
                        } else if (obj instanceof String) {
                            jSONObject.put("v", obj.toString());
                            jSONObject.put("t", "s");
                        } else if (obj instanceof Long) {
                            jSONObject.put("v", obj.toString());
                            jSONObject.put("t", "l");
                        } else if (obj instanceof int[]) {
                            jSONObject.put("v", Arrays.toString((int[]) obj));
                            jSONObject.put("t", "ia");
                        } else if (obj instanceof long[]) {
                            jSONObject.put("v", Arrays.toString((long[]) obj));
                            jSONObject.put("t", "la");
                        } else if (obj instanceof Double) {
                            jSONObject.put("v", obj.toString());
                            jSONObject.put("t", "d");
                        } else {
                            pz8 pz82 = y19.B;
                            y19.g(pz82);
                            pz82.B.b("Cannot serialize bundle value to SharedPreferences. Type", obj.getClass());
                        }
                        jSONArray.put(jSONObject);
                    } catch (JSONException e) {
                        pz8 pz83 = y19.B;
                        y19.g(pz83);
                        pz83.B.b("Cannot serialize bundle value to SharedPreferences", e);
                    }
                }
            }
            edit.putString(str, jSONArray.toString());
        }
        edit.apply();
        this.z = bundle2;
    }

    public ol j(long j, ol olVar, ol olVar2, ol olVar3) {
        if (((ol) this.z) == null) {
            this.z = olVar3.c();
        }
        ol olVar4 = (ol) this.z;
        if (olVar4 != null) {
            int b = olVar4.b();
            int i = 0;
            while (true) {
                ol olVar5 = (ol) this.z;
                if (i < b) {
                    if (olVar5 != null) {
                        olVar5.e(i, ((pl) this.x).get(i).b(j, olVar.a(i), olVar2.a(i), olVar3.a(i)));
                        i++;
                    } else {
                        sg3.a0("velocityVector");
                        throw null;
                    }
                } else if (olVar5 != null) {
                    return olVar5;
                } else {
                    sg3.a0("velocityVector");
                    throw null;
                }
            }
        } else {
            sg3.a0("velocityVector");
            throw null;
        }
    }

    public no7 k() {
        return new no7(this, (k68) this.y);
    }

    public boolean l(String str) {
        if (((HashMap) this.z).containsKey(str)) {
            return true;
        }
        no7 no7 = (no7) this.x;
        if (no7 != null) {
            return no7.l(str);
        }
        return false;
    }

    public void m(String str, bq8 bq8) {
        no7 no7;
        HashMap hashMap = (HashMap) this.z;
        if (!hashMap.containsKey(str) && (no7 = (no7) this.x) != null && no7.l(str)) {
            no7.m(str, bq8);
        } else if (!((HashMap) this.A).containsKey(str)) {
            if (bq8 == null) {
                hashMap.remove(str);
            } else {
                hashMap.put(str, bq8);
            }
        }
    }

    public void o(String str, bq8 bq8) {
        if (!((HashMap) this.A).containsKey(str)) {
            HashMap hashMap = (HashMap) this.z;
            if (bq8 == null) {
                hashMap.remove(str);
            } else {
                hashMap.put(str, bq8);
            }
        }
    }

    public bq8 p(String str) {
        HashMap hashMap = (HashMap) this.z;
        if (hashMap.containsKey(str)) {
            return (bq8) hashMap.get(str);
        }
        no7 no7 = (no7) this.x;
        if (no7 != null) {
            return no7.p(str);
        }
        h.q(b81.n(str, " is not defined"));
        return null;
    }

    public ol t(long j, ol olVar, ol olVar2, ol olVar3) {
        if (((ol) this.y) == null) {
            this.y = olVar.c();
        }
        ol olVar4 = (ol) this.y;
        if (olVar4 != null) {
            int b = olVar4.b();
            int i = 0;
            while (true) {
                ol olVar5 = (ol) this.y;
                if (i < b) {
                    if (olVar5 != null) {
                        olVar5.e(i, ((pl) this.x).get(i).e(j, olVar.a(i), olVar2.a(i), olVar3.a(i)));
                        i++;
                    } else {
                        sg3.a0("valueVector");
                        throw null;
                    }
                } else if (olVar5 != null) {
                    return olVar5;
                } else {
                    sg3.a0("valueVector");
                    throw null;
                }
            }
        } else {
            sg3.a0("valueVector");
            throw null;
        }
    }

    public ol u(ol olVar, ol olVar2, ol olVar3) {
        if (((ol) this.A) == null) {
            this.A = olVar3.c();
        }
        ol olVar4 = (ol) this.A;
        if (olVar4 != null) {
            int b = olVar4.b();
            int i = 0;
            while (true) {
                ol olVar5 = (ol) this.A;
                if (i < b) {
                    if (olVar5 != null) {
                        olVar5.e(i, ((pl) this.x).get(i).d(olVar.a(i), olVar2.a(i), olVar3.a(i)));
                        i++;
                    } else {
                        sg3.a0("endVelocityVector");
                        throw null;
                    }
                } else if (olVar5 != null) {
                    return olVar5;
                } else {
                    sg3.a0("endVelocityVector");
                    throw null;
                }
            }
        } else {
            sg3.a0("endVelocityVector");
            throw null;
        }
    }

    public /* synthetic */ no7(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.w = i;
        this.x = obj;
        this.y = obj2;
        this.z = obj3;
        this.A = obj4;
    }

    public no7(no7 no7, k68 k68) {
        this.w = 5;
        this.z = new HashMap();
        this.A = new HashMap();
        this.x = no7;
        this.y = k68;
    }

    public no7(q09 q09, String str) {
        this.w = 6;
        this.A = q09;
        z65.h(str);
        this.x = str;
        this.y = new Bundle();
    }

    public no7(z58 z58, w58 w58, ib1 ib1) {
        this.w = 2;
        z58.getClass();
        w58.getClass();
        ib1.getClass();
        this.x = z58;
        this.y = w58;
        this.z = ib1;
        this.A = new hr2(11);
    }

    public no7(pl plVar) {
        this.w = 1;
        this.x = plVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public no7(ih2 ih2) {
        this((pl) new ay4(14, ih2));
        this.w = 1;
    }
}
