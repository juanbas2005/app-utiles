package com.google.firebase.perf.metrics;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.session.gauges.GaugeManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class Trace extends xq implements Parcelable, hm6 {
    public static final Parcelable.Creator<Trace> CREATOR = new zc5(14);
    public static final rg I = rg.d();
    public final ConcurrentHashMap A;
    public final ConcurrentHashMap B;
    public final List C;
    public final ArrayList D;
    public final hn7 E;
    public final g22 F;
    public ui7 G;
    public ui7 H;
    public final WeakReference w;
    public final Trace x;
    public final GaugeManager y;
    public final String z;

    static {
        new ConcurrentHashMap();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    public Trace(Parcel parcel, boolean z2) {
        super(r1);
        wq wqVar;
        if (z2) {
            wqVar = null;
        } else {
            wqVar = wq.a();
        }
        this.w = new WeakReference(this);
        Class<Trace> cls = Trace.class;
        this.x = (Trace) parcel.readParcelable(cls.getClassLoader());
        this.z = parcel.readString();
        ArrayList arrayList = new ArrayList();
        this.D = arrayList;
        parcel.readList(arrayList, cls.getClassLoader());
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.A = concurrentHashMap;
        this.B = new ConcurrentHashMap();
        parcel.readMap(concurrentHashMap, z81.class.getClassLoader());
        Class<ui7> cls2 = ui7.class;
        this.G = (ui7) parcel.readParcelable(cls2.getClassLoader());
        this.H = (ui7) parcel.readParcelable(cls2.getClassLoader());
        List synchronizedList = Collections.synchronizedList(new ArrayList());
        this.C = synchronizedList;
        parcel.readList(synchronizedList, sf5.class.getClassLoader());
        if (z2) {
            this.E = null;
            this.F = null;
            this.y = null;
            return;
        }
        this.E = hn7.O;
        this.F = new g22(23);
        this.y = GaugeManager.getInstance();
    }

    public final void a(sf5 sf5) {
        if (sf5 == null) {
            I.f("Unable to add new SessionId to the Trace. Continuing without it.");
        } else if (this.G != null && !b()) {
            this.C.add(sf5);
        }
    }

    public final boolean b() {
        if (this.H != null) {
            return true;
        }
        return false;
    }

    public int describeContents() {
        return 0;
    }

    public final void finalize() {
        boolean z2;
        try {
            if (this.G != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2 && !b()) {
                I.g("Trace '%s' is started but not stopped when it is destructed!", this.z);
                incrementTsnsCount(1);
            }
        } finally {
            super.finalize();
        }
    }

    public String getAttribute(String str) {
        return (String) this.B.get(str);
    }

    public Map<String, String> getAttributes() {
        return new HashMap(this.B);
    }

    public long getLongMetric(String str) {
        z81 z81;
        if (str != null) {
            z81 = (z81) this.A.get(str.trim());
        } else {
            z81 = null;
        }
        if (z81 == null) {
            return 0;
        }
        return z81.x.get();
    }

    public void incrementMetric(String str, long j) {
        String c = pf5.c(str);
        rg rgVar = I;
        if (c != null) {
            rgVar.c("Cannot increment metric '%s'. Metric name is invalid.(%s)", str, c);
            return;
        }
        ui7 ui7 = this.G;
        String str2 = this.z;
        if (ui7 == null) {
            rgVar.g("Cannot increment metric '%s' for trace '%s' because it's not started", str, str2);
        } else if (b()) {
            rgVar.g("Cannot increment metric '%s' for trace '%s' because it's been stopped", str, str2);
        } else {
            String trim = str.trim();
            ConcurrentHashMap concurrentHashMap = this.A;
            z81 z81 = (z81) concurrentHashMap.get(trim);
            if (z81 == null) {
                z81 = new z81(trim);
                concurrentHashMap.put(trim, z81);
            }
            AtomicLong atomicLong = z81.x;
            atomicLong.addAndGet(j);
            rgVar.b("Incrementing metric '%s' to %d on trace '%s'", str, Long.valueOf(atomicLong.get()), str2);
        }
    }

    public void putAttribute(String str, String str2) {
        boolean z2;
        ConcurrentHashMap concurrentHashMap = this.B;
        rg rgVar = I;
        try {
            str = str.trim();
            str2 = str2.trim();
            boolean b = b();
            String str3 = this.z;
            if (!b) {
                if (!concurrentHashMap.containsKey(str)) {
                    if (concurrentHashMap.size() >= 5) {
                        Locale locale = Locale.ENGLISH;
                        h.q("Exceeds max limit of number of attributes - 5");
                    }
                }
                pf5.b(str, str2);
            } else {
                Locale locale2 = Locale.ENGLISH;
                h.q(f21.h("Trace '", str3, "' has been stopped"));
            }
            rgVar.b("Setting attribute '%s' to '%s' on trace '%s'", str, str2, str3);
            z2 = true;
        } catch (Exception e) {
            rgVar.c("Can not set attribute '%s' with value '%s' (%s)", str, str2, e.getMessage());
            z2 = false;
        }
        if (z2) {
            concurrentHashMap.put(str, str2);
        }
    }

    public void putMetric(String str, long j) {
        String c = pf5.c(str);
        rg rgVar = I;
        if (c != null) {
            rgVar.c("Cannot set value for metric '%s'. Metric name is invalid.(%s)", str, c);
            return;
        }
        ui7 ui7 = this.G;
        String str2 = this.z;
        if (ui7 == null) {
            rgVar.g("Cannot set value for metric '%s' for trace '%s' because it's not started", str, str2);
        } else if (b()) {
            rgVar.g("Cannot set value for metric '%s' for trace '%s' because it's been stopped", str, str2);
        } else {
            String trim = str.trim();
            ConcurrentHashMap concurrentHashMap = this.A;
            z81 z81 = (z81) concurrentHashMap.get(trim);
            if (z81 == null) {
                z81 = new z81(trim);
                concurrentHashMap.put(trim, z81);
            }
            z81.x.set(j);
            rgVar.b("Setting metric '%s' to '%s' on trace '%s'", str, Long.valueOf(j), str2);
        }
    }

    public void removeAttribute(String str) {
        if (b()) {
            rg rgVar = I;
            if (rgVar.b) {
                rgVar.a.getClass();
                Log.e("FirebasePerformance", "Can't remove a attribute from a Trace that's stopped.");
                return;
            }
            return;
        }
        this.B.remove(str);
    }

    public void start() {
        String str;
        String str2;
        boolean n = b01.e().n();
        rg rgVar = I;
        if (!n) {
            rgVar.a("Trace feature is disabled.");
            return;
        }
        Pattern pattern = pf5.a;
        String str3 = this.z;
        if (str3 == null) {
            str = "Trace name must not be null";
        } else if (str3.length() > 100) {
            Locale locale = Locale.US;
            str = "Trace name must not exceed 100 characters";
        } else {
            if (str3.startsWith("_")) {
                int[] F2 = b81.F(6);
                int length = F2.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        switch (F2[i]) {
                            case 1:
                                str2 = "_as";
                                break;
                            case 2:
                                str2 = "_astui";
                                break;
                            case 3:
                                str2 = "_astfd";
                                break;
                            case 4:
                                str2 = "_asti";
                                break;
                            case 5:
                                str2 = "_fs";
                                break;
                            case 6:
                                str2 = "_bs";
                                break;
                            default:
                                throw null;
                        }
                        if (!str2.equals(str3)) {
                            i++;
                        }
                    } else if (!str3.startsWith("_st_")) {
                        str = "Trace name must not start with '_'";
                    }
                }
            }
            str = null;
        }
        if (str != null) {
            rgVar.c("Cannot start trace '%s'. Trace name is invalid.(%s)", str3, str);
        } else if (this.G != null) {
            rgVar.c("Trace '%s' has already started, should not start again!", str3);
        } else {
            this.F.getClass();
            this.G = new ui7();
            registerForAppState();
            sf5 perfSession = SessionManager.getInstance().perfSession();
            SessionManager.getInstance().registerForSessionUpdates(this.w);
            a(perfSession);
            if (perfSession.y) {
                this.y.collectGaugeMetricOnce(perfSession.x);
            }
        }
    }

    public void stop() {
        ui7 ui7 = this.G;
        String str = this.z;
        rg rgVar = I;
        if (ui7 == null) {
            rgVar.c("Trace '%s' has not been started so unable to stop!", str);
        } else if (b()) {
            rgVar.c("Trace '%s' has already stopped, should not stop again!", str);
        } else {
            SessionManager.getInstance().unregisterForSessionUpdates(this.w);
            unregisterForAppState();
            this.F.getClass();
            ui7 ui72 = new ui7();
            this.H = ui72;
            if (this.x == null) {
                ArrayList arrayList = this.D;
                if (!arrayList.isEmpty()) {
                    Trace trace = (Trace) b81.k(1, arrayList);
                    if (trace.H == null) {
                        trace.H = ui72;
                    }
                }
                if (!str.isEmpty()) {
                    this.E.c(new uy5(7, (Object) this).b(), getAppState());
                    if (SessionManager.getInstance().perfSession().y) {
                        this.y.collectGaugeMetricOnce(SessionManager.getInstance().perfSession().x);
                    }
                } else if (rgVar.b) {
                    rgVar.a.getClass();
                    Log.e("FirebasePerformance", "Trace name is empty, no log is sent to server");
                }
            }
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.x, 0);
        parcel.writeString(this.z);
        parcel.writeList(this.D);
        parcel.writeMap(this.A);
        parcel.writeParcelable(this.G, 0);
        parcel.writeParcelable(this.H, 0);
        synchronized (this.C) {
            parcel.writeList(this.C);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Trace(String str, hn7 hn7, g22 g22, wq wqVar) {
        super(wqVar);
        GaugeManager instance = GaugeManager.getInstance();
        this.w = new WeakReference(this);
        this.x = null;
        this.z = str.trim();
        this.D = new ArrayList();
        this.A = new ConcurrentHashMap();
        this.B = new ConcurrentHashMap();
        this.F = g22;
        this.E = hn7;
        this.C = Collections.synchronizedList(new ArrayList());
        this.y = instance;
    }
}
