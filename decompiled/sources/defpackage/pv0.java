package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* renamed from: pv0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class pv0 {
    public final LinkedHashMap a = new LinkedHashMap();
    public final LinkedHashMap b = new LinkedHashMap();
    public final LinkedHashMap c = new LinkedHashMap();
    public final ArrayList d = new ArrayList();
    public final transient LinkedHashMap e = new LinkedHashMap();
    public final LinkedHashMap f = new LinkedHashMap();
    public final Bundle g = new Bundle();
    public final /* synthetic */ rv0 h;

    public pv0(rv0 rv0) {
        this.h = rv0;
    }

    public final boolean a(int i, int i2, Intent intent) {
        r8 r8Var;
        String str = (String) this.a.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        y8 y8Var = (y8) this.e.get(str);
        if (y8Var != null) {
            r8Var = y8Var.a;
        } else {
            r8Var = null;
        }
        if (r8Var != null) {
            ArrayList arrayList = this.d;
            if (arrayList.contains(str)) {
                y8Var.a.b(y8Var.b.D(intent, i2));
                arrayList.remove(str);
                return true;
            }
        }
        this.f.remove(str);
        this.g.putParcelable(str, new q8(intent, i2));
        return true;
    }

    public final void b(int i, hj8 hj8, Object obj) {
        Bundle bundle;
        int i2;
        rv0 rv0 = this.h;
        ns8 A = hj8.A(rv0, obj);
        if (A != null) {
            new Handler(Looper.getMainLooper()).post(new r80(this, i, A, 1));
            return;
        }
        Intent s = hj8.s(rv0, obj);
        if (s.getExtras() != null) {
            Bundle extras = s.getExtras();
            extras.getClass();
            if (extras.getClassLoader() == null) {
                s.setExtrasClassLoader(rv0.getClassLoader());
            }
        }
        if (s.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            bundle = s.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            s.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
        } else {
            bundle = null;
        }
        Bundle bundle2 = bundle;
        if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(s.getAction())) {
            String[] stringArrayExtra = s.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            if (stringArrayExtra == null) {
                stringArrayExtra = new String[0];
            }
            ag8.F(rv0, stringArrayExtra, i);
        } else if ("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(s.getAction())) {
            bf3 bf3 = (bf3) s.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                bf3.getClass();
                i2 = i;
                try {
                    rv0.startIntentSenderForResult(bf3.w, i2, bf3.x, bf3.y, bf3.z, 0, bundle2);
                } catch (IntentSender.SendIntentException e2) {
                    e = e2;
                    new Handler(Looper.getMainLooper()).post(new r80(this, i2, e, 2));
                }
            } catch (IntentSender.SendIntentException e3) {
                e = e3;
                i2 = i;
                new Handler(Looper.getMainLooper()).post(new r80(this, i2, e, 2));
            }
        } else {
            rv0.startActivityForResult(s, i, bundle2);
        }
    }

    public final a9 c(String str, hj8 hj8, r8 r8Var) {
        str.getClass();
        d(str);
        this.e.put(str, new y8(r8Var, hj8));
        LinkedHashMap linkedHashMap = this.f;
        if (linkedHashMap.containsKey(str)) {
            Object obj = linkedHashMap.get(str);
            linkedHashMap.remove(str);
            r8Var.b(obj);
        }
        Bundle bundle = this.g;
        q8 q8Var = (q8) gr8.M(bundle, str, q8.class);
        if (q8Var != null) {
            bundle.remove(str);
            r8Var.b(hj8.D(q8Var.x, q8Var.w));
        }
        return new a9(this, str, hj8, 1);
    }

    public final void d(String str) {
        LinkedHashMap linkedHashMap = this.b;
        if (((Integer) linkedHashMap.get(str)) == null) {
            Iterator it = ((g21) cl6.R(new o(2))).iterator();
            while (it.hasNext()) {
                Number number = (Number) it.next();
                Integer valueOf = Integer.valueOf(number.intValue());
                LinkedHashMap linkedHashMap2 = this.a;
                if (!linkedHashMap2.containsKey(valueOf)) {
                    int intValue = number.intValue();
                    linkedHashMap2.put(Integer.valueOf(intValue), str);
                    linkedHashMap.put(str, Integer.valueOf(intValue));
                    return;
                }
            }
            kj6.i("Sequence contains no element matching the predicate.");
        }
    }

    public final void e(String str) {
        Integer num;
        str.getClass();
        if (!this.d.contains(str) && (num = (Integer) this.b.remove(str)) != null) {
            this.a.remove(num);
        }
        this.e.remove(str);
        LinkedHashMap linkedHashMap = this.f;
        if (linkedHashMap.containsKey(str)) {
            StringBuilder q = b81.q("Dropping pending result for request ", str, ": ");
            q.append(linkedHashMap.get(str));
            Log.w("ActivityResultRegistry", q.toString());
            linkedHashMap.remove(str);
        }
        Bundle bundle = this.g;
        if (bundle.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + ((q8) gr8.M(bundle, str, q8.class)));
            bundle.remove(str);
        }
        LinkedHashMap linkedHashMap2 = this.c;
        z8 z8Var = (z8) linkedHashMap2.get(str);
        if (z8Var != null) {
            ArrayList arrayList = z8Var.b;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                z8Var.a.M0((q54) it.next());
            }
            arrayList.clear();
            linkedHashMap2.remove(str);
        }
    }
}
