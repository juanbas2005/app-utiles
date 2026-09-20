package defpackage;

import java.util.Map;

/* renamed from: hf2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class hf2 extends pf5 {
    public static final rg c = rg.d();
    public final yk7 b;

    public hf2(yk7 yk7) {
        this.b = yk7;
    }

    public static boolean d(yk7 yk7, int i) {
        if (yk7 == null) {
            return false;
        }
        rg rgVar = c;
        if (i > 1) {
            rgVar.f("Exceed MAX_SUBTRACE_DEEP:1");
            return false;
        }
        for (Map.Entry entry : yk7.D().entrySet()) {
            String str = (String) entry.getKey();
            if (str != null) {
                String trim = str.trim();
                if (trim.isEmpty()) {
                    rgVar.f("counterId is empty");
                } else if (trim.length() > 100) {
                    rgVar.f("counterId exceeded max length 100");
                } else if (((Long) entry.getValue()) == null) {
                    rgVar.f("invalid CounterValue:" + entry.getValue());
                    return false;
                }
            }
            rgVar.f("invalid CounterId:" + ((String) entry.getKey()));
            return false;
        }
        for (yk7 d : yk7.J()) {
            if (!d(d, i + 1)) {
            }
        }
        return true;
        return false;
    }

    public static boolean e(yk7 yk7, int i) {
        Long l;
        rg rgVar = c;
        if (yk7 == null) {
            rgVar.f("TraceMetric is null");
            return false;
        } else if (i > 1) {
            rgVar.f("Exceed MAX_SUBTRACE_DEEP:1");
            return false;
        } else {
            String H = yk7.H();
            if (H != null) {
                String trim = H.trim();
                if (!trim.isEmpty() && trim.length() <= 100) {
                    if (yk7.G() <= 0) {
                        rgVar.f("invalid TraceDuration:" + yk7.G());
                        return false;
                    } else if (!yk7.K()) {
                        rgVar.f("clientStartTimeUs is null.");
                        return false;
                    } else if (!yk7.H().startsWith("_st_") || ((l = (Long) yk7.D().get("_fr_tot")) != null && l.compareTo(0L) > 0)) {
                        for (yk7 e : yk7.J()) {
                            if (!e(e, i + 1)) {
                                return false;
                            }
                        }
                        for (Map.Entry entry : yk7.E().entrySet()) {
                            try {
                                pf5.b((String) entry.getKey(), (String) entry.getValue());
                            } catch (IllegalArgumentException e2) {
                                rgVar.f(e2.getLocalizedMessage());
                                return false;
                            }
                        }
                        return true;
                    } else {
                        rgVar.f("non-positive totalFrames in screen trace " + yk7.H());
                        return false;
                    }
                }
            }
            rgVar.f("invalid TraceId:" + yk7.H());
            return false;
        }
    }

    public final boolean a() {
        yk7 yk7 = this.b;
        boolean e = e(yk7, 0);
        rg rgVar = c;
        if (!e) {
            rgVar.f("Invalid Trace:" + yk7.H());
            return false;
        }
        if (yk7.C() <= 0) {
            for (yk7 C : yk7.J()) {
                if (C.C() > 0) {
                }
            }
            return true;
        }
        if (d(yk7, 0)) {
            return true;
        }
        rgVar.f("Invalid Counters for Trace:" + yk7.H());
        return false;
    }
}
