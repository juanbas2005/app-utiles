package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.HandlerThread;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.view.ActionMode;
import android.view.View;
import android.view.ViewGroup;
import androidx.work.impl.WorkDatabase;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.perf.session.SessionManager;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: ti  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class ti implements Runnable {
    public final /* synthetic */ int w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ ti(Object obj, Object obj2, Object obj3, int i) {
        this.w = i;
        this.x = obj;
        this.y = obj2;
        this.z = obj3;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00b4, code lost:
        return;
     */
    private final void a() {
        boolean z2;
        v27 v27 = (v27) this.y;
        lp5 lp5 = (lp5) ((k68) this.x).x;
        lp5.getClass();
        id8 id8 = v27.a;
        String str = id8.a;
        ArrayList arrayList = new ArrayList();
        be8 be8 = (be8) lp5.e.o(new hx4(12, new cp1(lp5, arrayList, str, 1)));
        if (be8 == null) {
            bc4.k().q(lp5.l, "Didn't find WorkSpec for id " + id8);
            lp5.d.d.execute(new ga(27, (Object) lp5, (Object) id8));
            return;
        }
        synchronized (lp5.k) {
            try {
                synchronized (lp5.k) {
                    if (lp5.c(str) != null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                }
                if (z2) {
                    Set set = (Set) lp5.h.get(str);
                    if (((v27) set.iterator().next()).a.b == id8.b) {
                        set.add(v27);
                        bc4.k().e(lp5.l, "Work " + id8 + " is already enqueued for processing");
                    } else {
                        lp5.d.d.execute(new ga(27, (Object) lp5, (Object) id8));
                    }
                } else if (be8.t != id8.b) {
                    lp5.d.d.execute(new ga(27, (Object) lp5, (Object) id8));
                } else {
                    re8 re8 = new re8(new md2(lp5.b, lp5.c, lp5.d, lp5, lp5.e, be8, arrayList));
                    h81 h81 = re8.d.b;
                    fl3 l = r16.l();
                    h81.getClass();
                    bj0 E = x91.E(rc9.D0(h81, l), new pe8(re8, (f61) null, 1));
                    E.x.a(new ti(lp5, E, re8, 8), lp5.d.d);
                    lp5.g.put(str, re8);
                    HashSet hashSet = new HashSet();
                    hashSet.add(v27);
                    lp5.h.put(str, hashSet);
                    bc4.k().e(lp5.l, lp5.class.getSimpleName() + ": processing " + id8);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void run() {
        JSONObject optJSONObject;
        boolean z2 = true;
        switch (this.w) {
            case b85.b:
                ui uiVar = (ui) this.x;
                si siVar = (si) this.z;
                ActionMode startActionMode = uiVar.a.startActionMode(new bi2((ri) this.y), 1);
                sg3.e(uiVar.h, startActionMode);
                if (startActionMode == null) {
                    siVar.close();
                    return;
                }
                return;
            case 1:
                String str = (String) this.y;
                nd8 nd8 = (nd8) this.z;
                fe8 w2 = ((WorkDatabase) this.x).w();
                w2.getClass();
                str.getClass();
                for (String i : (List) sg3.O(w2.a, true, false, new sd8(str, 4))) {
                    ag8.i(nd8, i);
                }
                return;
            case 2:
                HandlerThread handlerThread = (HandlerThread) this.y;
                TelephonyManager telephonyManager = (TelephonyManager) this.z;
                PhoneStateListener phoneStateListener = (PhoneStateListener) ((h06) this.x).w;
                if (phoneStateListener != null) {
                    telephonyManager.listen(phoneStateListener, 0);
                }
                handlerThread.quitSafely();
                return;
            case 3:
                String str2 = (String) this.y;
                sz0 sz0 = (sz0) this.z;
                kg5 kg5 = ((z36) this.x).a;
                ac acVar = (ac) ((nu5) kg5.x).get();
                if (acVar != null) {
                    JSONObject jSONObject = sz0.e;
                    if (jSONObject.length() >= 1) {
                        JSONObject jSONObject2 = sz0.b;
                        if (jSONObject2.length() >= 1 && (optJSONObject = jSONObject.optJSONObject(str2)) != null) {
                            String optString = optJSONObject.optString("choiceId");
                            if (!optString.isEmpty()) {
                                synchronized (((Map) kg5.y)) {
                                    try {
                                        if (!optString.equals(((Map) kg5.y).get(str2))) {
                                            ((Map) kg5.y).put(str2, optString);
                                            Bundle bundle = new Bundle();
                                            bundle.putString("arm_key", str2);
                                            bundle.putString("arm_value", jSONObject2.optString(str2));
                                            bundle.putString("personalization_id", optJSONObject.optString("personalizationId"));
                                            bundle.putInt("arm_index", optJSONObject.optInt("armIndex", -1));
                                            bundle.putString("group", optJSONObject.optString("group"));
                                            bc bcVar = (bc) acVar;
                                            bcVar.a("fp", "personalization_assignment", bundle);
                                            Bundle bundle2 = new Bundle();
                                            bundle2.putString("_fpid", optString);
                                            bcVar.a("fp", "_fpc", bundle2);
                                            return;
                                        }
                                        return;
                                    } catch (Throwable th) {
                                        while (true) {
                                            throw th;
                                            break;
                                        }
                                    }
                                }
                            } else {
                                return;
                            }
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case 4:
                ViewGroup viewGroup = (ViewGroup) this.x;
                nn1 nn1 = (nn1) this.z;
                viewGroup.getClass();
                viewGroup.endViewTransition((View) this.y);
                ((gz6) nn1.c.w).c(nn1);
                return;
            case 5:
                tb1 tb1 = (tb1) this.x;
                sg3 sg3 = (sg3) this.y;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.z;
                try {
                    ml2 r = pv8.r(tb1.a);
                    if (r != null) {
                        ll2 ll2 = (ll2) ((v22) r.b);
                        synchronized (ll2.d) {
                            ll2.f = threadPoolExecutor;
                        }
                        ((v22) r.b).a(new y22(sg3, threadPoolExecutor));
                        return;
                    }
                    throw new RuntimeException("EmojiCompat font provider not available on this device.");
                } catch (Throwable th2) {
                    sg3.J(th2);
                    threadPoolExecutor.shutdown();
                    return;
                }
            case 6:
                FirebaseMessagingService firebaseMessagingService = (FirebaseMessagingService) this.x;
                Intent intent = (Intent) this.y;
                xb7 xb7 = (xb7) this.z;
                try {
                    firebaseMessagingService.c(intent);
                    return;
                } finally {
                    xb7.b((Object) null);
                }
            case 7:
                yi0 yi0 = (yi0) this.y;
                mm0 mm0 = (mm0) this.z;
                if (!((AtomicBoolean) this.x).get()) {
                    try {
                        mm0.b();
                        yi0.a((Object) null);
                        return;
                    } catch (Throwable th3) {
                        yi0.b(th3);
                        return;
                    }
                } else {
                    return;
                }
            case 8:
                lp5 lp5 = (lp5) this.x;
                bj0 bj0 = (bj0) this.y;
                re8 re8 = (re8) this.z;
                lp5.getClass();
                try {
                    z2 = ((Boolean) bj0.x.get()).booleanValue();
                } catch (InterruptedException | ExecutionException unused) {
                }
                synchronized (lp5.k) {
                    try {
                        id8 h = z85.h(re8.a);
                        String str3 = h.a;
                        if (lp5.c(str3) == re8) {
                            lp5.b(str3);
                        }
                        bc4 k = bc4.k();
                        String str4 = lp5.l;
                        k.e(str4, lp5.class.getSimpleName() + " " + str3 + " executed; reschedule = " + z2);
                        Iterator it = lp5.j.iterator();
                        while (it.hasNext()) {
                            ((b82) it.next()).b(h, z2);
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
                return;
            case 9:
                ((SessionManager) this.x).lambda$setApplicationContext$0((Context) this.y, (sf5) this.z);
                return;
            case 10:
                mf5 y2 = nf5.y();
                y2.h();
                nf5.t((nf5) y2.x, (ku2) this.y);
                ((hn7) this.x).d(y2, (jr) this.z);
                return;
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER:
                mf5 y3 = nf5.y();
                y3.h();
                nf5.u((nf5) y3.x, (yk7) this.y);
                ((hn7) this.x).d(y3, (jr) this.z);
                return;
            case 12:
                hn7 hn7 = (hn7) this.x;
                hn7.getClass();
                mf5 y4 = nf5.y();
                y4.h();
                nf5.v((nf5) y4.x, (ry4) this.y);
                hn7.d(y4, (jr) this.z);
                return;
            case ry4.PERF_SESSIONS_FIELD_NUMBER:
                a();
                return;
            default:
                yi0 yi02 = (yi0) this.y;
                sr2 sr2 = (sr2) this.z;
                if (!((AtomicBoolean) this.x).get()) {
                    try {
                        yi02.a(sr2.b());
                        return;
                    } catch (Throwable th5) {
                        yi02.b(th5);
                        return;
                    }
                } else {
                    return;
                }
        }
    }
}
