package defpackage;

import android.util.Log;
import com.google.firebase.sessions.ProcessData;
import com.google.firebase.sessions.SessionData;
import com.google.firebase.sessions.SessionDetails;
import com.google.firebase.sessions.Time;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: cs6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class cs6 extends a97 implements gs2 {
    public final /* synthetic */ int A;
    public /* synthetic */ Object B;
    public final /* synthetic */ es6 C;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cs6(es6 es6, f61 f61, int i) {
        super(2, f61);
        this.A = i;
        this.C = es6;
    }

    public final Object H(Object obj, Object obj2) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        SessionData sessionData = (SessionData) obj;
        f61 f61 = (f61) obj2;
        switch (i) {
            case b85.b:
                return ((cs6) o(f61, sessionData)).s(vs7);
            default:
                return ((cs6) o(f61, sessionData)).s(vs7);
        }
    }

    public final f61 o(f61 f61, Object obj) {
        int i = this.A;
        es6 es6 = this.C;
        switch (i) {
            case b85.b:
                cs6 cs6 = new cs6(es6, f61, 0);
                cs6.B = obj;
                return cs6;
            default:
                cs6 cs62 = new cs6(es6, f61, 1);
                cs62.B = obj;
                return cs62;
        }
    }

    public final Object s(Object obj) {
        boolean z;
        Map<String, ProcessData> map;
        SessionDetails sessionDetails;
        yb5 yb5;
        int i = this.A;
        es6 es6 = this.C;
        switch (i) {
            case b85.b:
                o85.q(obj);
                es6.d.getClass();
                return SessionData.copy$default((SessionData) this.B, (SessionDetails) null, mi7.a(), (Map) null, 5, (Object) null);
            default:
                o85.q(obj);
                SessionData sessionData = (SessionData) this.B;
                dp5 dp5 = es6.f;
                boolean e = es6.e(sessionData);
                Map<String, ProcessData> processDataMap = sessionData.getProcessDataMap();
                if (processDataMap != null) {
                    dp5.getClass();
                    z = false;
                    if (!dp5.f) {
                        ArrayList g = o85.g(dp5.a);
                        ArrayList arrayList = new ArrayList();
                        Iterator it = g.iterator();
                        while (it.hasNext()) {
                            ep5 ep5 = (ep5) it.next();
                            ProcessData processData = processDataMap.get(ep5.a);
                            if (processData != null) {
                                yb5 = new yb5(ep5, processData);
                            } else {
                                yb5 = null;
                            }
                            if (yb5 != null) {
                                arrayList.add(yb5);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            Iterator it2 = arrayList.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    yb5 yb52 = (yb5) it2.next();
                                    ep5 ep52 = (ep5) yb52.w;
                                    ProcessData processData2 = (ProcessData) yb52.x;
                                    boolean e2 = sg3.e(dp5.a(), ep52.a);
                                    int i2 = ep52.b;
                                    if (e2) {
                                        if (i2 == processData2.getPid() && sg3.e((String) dp5.d.getValue(), processData2.getUuid())) {
                                        }
                                    } else if (i2 != processData2.getPid()) {
                                    }
                                }
                            }
                        }
                        z = true;
                    }
                    if (z) {
                        Log.d("FirebaseSessions", "Cold app start detected");
                    }
                } else {
                    Log.d("FirebaseSessions", "No process data map");
                    z = true;
                }
                boolean d = es6.d(sessionData);
                if (z) {
                    map = dp5.b(b42.w);
                } else if (d) {
                    map = dp5.b(sessionData.getProcessDataMap());
                } else {
                    map = sessionData.getProcessDataMap();
                }
                if (z) {
                    sessionDetails = null;
                } else {
                    sessionDetails = sessionData.getSessionDetails();
                }
                if (e || z) {
                    SessionDetails a = es6.b.a(sessionDetails);
                    vm6 vm6 = es6.c;
                    ar7.H(gl0.E(vm6.e), (e81) null, (r81) null, new tm6(vm6, a, (f61) null), 3);
                    dp5.f = true;
                    return sessionData.copy(a, (Time) null, map);
                } else if (d) {
                    return SessionData.copy$default(sessionData, (SessionDetails) null, (Time) null, dp5.b(map), 3, (Object) null);
                } else {
                    return sessionData;
                }
        }
    }
}
