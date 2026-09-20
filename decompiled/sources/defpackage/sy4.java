package defpackage;

import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.session.gauges.GaugeManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: sy4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class sy4 extends xq implements hm6 {
    public static final rg D = rg.d();
    public final WeakReference A = new WeakReference(this);
    public String B;
    public boolean C;
    public final List w;
    public final GaugeManager x;
    public final hn7 y;
    public final py4 z = ry4.Y();

    /* JADX WARNING: Illegal instructions before constructor call */
    public sy4(hn7 hn7) {
        super(r0);
        wq a = wq.a();
        GaugeManager instance = GaugeManager.getInstance();
        this.y = hn7;
        this.x = instance;
        this.w = Collections.synchronizedList(new ArrayList());
        registerForAppState();
    }

    public final void a(sf5 sf5) {
        if (sf5 == null) {
            D.f("Unable to add new SessionId to the Network Trace. Continuing without it.");
            return;
        }
        py4 py4 = this.z;
        if (((ry4) py4.x).Q() && !((ry4) py4.x).W()) {
            this.w.add(sf5);
        }
    }

    public final void b() {
        List unmodifiableList;
        SessionManager.getInstance().unregisterForSessionUpdates(this.A);
        unregisterForAppState();
        synchronized (this.w) {
            try {
                ArrayList arrayList = new ArrayList();
                for (sf5 sf5 : this.w) {
                    if (sf5 != null) {
                        arrayList.add(sf5);
                    }
                }
                unmodifiableList = Collections.unmodifiableList(arrayList);
            } finally {
                while (true) {
                }
            }
        }
        rf5[] b = sf5.b(unmodifiableList);
        if (b != null) {
            py4 py4 = this.z;
            List asList = Arrays.asList(b);
            py4.h();
            ry4.B((ry4) py4.x, asList);
        }
        ry4 ry4 = (ry4) this.z.g();
        String str = this.B;
        if (str == null) {
            Pattern pattern = ty4.a;
        } else if (ty4.a.matcher(str).matches()) {
            D.a("Dropping network request from a 'User-Agent' that is not allowed");
            return;
        }
        if (!this.C) {
            hn7 hn7 = this.y;
            hn7.E.execute(new ti(hn7, ry4, getAppState(), 12));
            this.C = true;
        }
    }

    public final void c(String str) {
        if (str != null) {
            String upperCase = str.toUpperCase();
            upperCase.getClass();
            int i = 8;
            char c = 65535;
            switch (upperCase.hashCode()) {
                case -531492226:
                    if (upperCase.equals("OPTIONS")) {
                        c = 0;
                        break;
                    }
                    break;
                case 70454:
                    if (upperCase.equals("GET")) {
                        c = 1;
                        break;
                    }
                    break;
                case 79599:
                    if (upperCase.equals("PUT")) {
                        c = 2;
                        break;
                    }
                    break;
                case 2213344:
                    if (upperCase.equals("HEAD")) {
                        c = 3;
                        break;
                    }
                    break;
                case 2461856:
                    if (upperCase.equals("POST")) {
                        c = 4;
                        break;
                    }
                    break;
                case 75900968:
                    if (upperCase.equals("PATCH")) {
                        c = 5;
                        break;
                    }
                    break;
                case 80083237:
                    if (upperCase.equals("TRACE")) {
                        c = 6;
                        break;
                    }
                    break;
                case 1669334218:
                    if (upperCase.equals("CONNECT")) {
                        c = 7;
                        break;
                    }
                    break;
                case 2012838315:
                    if (upperCase.equals("DELETE")) {
                        c = 8;
                        break;
                    }
                    break;
            }
            switch (c) {
                case b85.b:
                    break;
                case 1:
                    i = 2;
                    break;
                case 2:
                    i = 3;
                    break;
                case 3:
                    i = 6;
                    break;
                case 4:
                    i = 4;
                    break;
                case 5:
                    i = 7;
                    break;
                case 6:
                    i = 9;
                    break;
                case 7:
                    i = 10;
                    break;
                case 8:
                    i = 5;
                    break;
                default:
                    i = 1;
                    break;
            }
            py4 py4 = this.z;
            py4.h();
            ry4.C((ry4) py4.x, i);
        }
    }

    public final void d(int i) {
        py4 py4 = this.z;
        py4.h();
        ry4.u((ry4) py4.x, i);
    }

    public final void e(long j) {
        py4 py4 = this.z;
        py4.h();
        ry4.D((ry4) py4.x, j);
    }

    public final void f(long j) {
        sf5 perfSession = SessionManager.getInstance().perfSession();
        SessionManager.getInstance().registerForSessionUpdates(this.A);
        py4 py4 = this.z;
        py4.h();
        ry4.x((ry4) py4.x, j);
        a(perfSession);
        if (perfSession.y) {
            this.x.collectGaugeMetricOnce(perfSession.x);
        }
    }

    public final void g(String str) {
        py4 py4 = this.z;
        if (str == null) {
            py4.h();
            ry4.w((ry4) py4.x);
            return;
        }
        if (str.length() <= 128) {
            int i = 0;
            while (i < str.length()) {
                char charAt = str.charAt(i);
                if (charAt > 31 && charAt <= 127) {
                    i++;
                }
            }
            py4.h();
            ry4.v((ry4) py4.x, str);
            return;
        }
        D.f("The content type of the response is not a valid content-type:".concat(str));
    }

    public final void h(long j) {
        py4 py4 = this.z;
        py4.h();
        ry4.E((ry4) py4.x, j);
    }

    public final void i(long j) {
        py4 py4 = this.z;
        py4.h();
        ry4.A((ry4) py4.x, j);
        if (SessionManager.getInstance().perfSession().y) {
            this.x.collectGaugeMetricOnce(SessionManager.getInstance().perfSession().x);
        }
    }

    public final void j(String str) {
        g73 g73;
        int lastIndexOf;
        if (str != null) {
            g73 g732 = null;
            try {
                f73 f73 = new f73(0);
                f73.f((g73) null, str);
                g73 = f73.c();
            } catch (IllegalArgumentException unused) {
                g73 = null;
            }
            if (g73 != null) {
                f73 f = g73.f();
                f.d = ie1.v(0, 0, 123, "", " \"':;<=>@[]^`{}|/\\?#");
                f.e = ie1.v(0, 0, 123, "", " \"':;<=>@[]^`{}|/\\?#");
                f.i = null;
                f.g = null;
                str = f.toString();
            }
            if (str.length() > 2000) {
                if (str.charAt(2000) == '/') {
                    str = str.substring(0, 2000);
                } else {
                    try {
                        f73 f732 = new f73(0);
                        f732.f((g73) null, str);
                        g732 = f732.c();
                    } catch (IllegalArgumentException unused2) {
                    }
                    if (g732 == null) {
                        str = str.substring(0, 2000);
                    } else if (g732.b().lastIndexOf(47) < 0 || (lastIndexOf = str.lastIndexOf(47, 1999)) < 0) {
                        str = str.substring(0, 2000);
                    } else {
                        str = str.substring(0, lastIndexOf);
                    }
                }
            }
            py4 py4 = this.z;
            py4.h();
            ry4.s((ry4) py4.x, str);
        }
    }
}
