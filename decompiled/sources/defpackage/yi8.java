package defpackage;

import android.util.Log;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: yi8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class yi8 extends rt4 {
    public final /* synthetic */ int g;
    public final /* synthetic */ dl8 h;
    public final nl8 i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yi8(dl8 dl8, String str, int i2, nl8 nl8, int i3) {
        super(str, i2);
        this.g = i3;
        this.h = dl8;
        this.i = nl8;
    }

    public final int c() {
        switch (this.g) {
            case b85.b:
                return ((ox8) this.i).u();
            default:
                return ((wx8) this.i).u();
        }
    }

    public final boolean d() {
        switch (this.g) {
            case b85.b:
                return false;
            default:
                return true;
        }
    }

    public final boolean e() {
        switch (this.g) {
            case b85.b:
                return ((ox8) this.i).z();
            default:
                return false;
        }
    }

    /* JADX WARNING: type inference failed for: r16v2, types: [java.lang.Integer] */
    /* JADX WARNING: type inference failed for: r16v12, types: [java.lang.Integer] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x035f  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x03ce  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x03d1  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x03da A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x03dc  */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x03c9 A[EDGE_INSN: B:212:0x03c9->B:162:0x03c9 ?: BREAK  , SYNTHETIC] */
    public boolean i(Long l, Long l2, h19 h19, long j, qr8 qr8, boolean z) {
        long j2;
        boolean z2;
        boolean z3;
        pz8 pz8;
        Object obj;
        boolean z4;
        Boolean bool;
        long j3;
        Boolean bool2;
        Boolean bool3;
        Double d;
        Long l3;
        Boolean bool4;
        Integer num;
        int i2;
        io8.a();
        dl8 dl8 = this.h;
        y19 y19 = (y19) dl8.w;
        tp8 tp8 = y19.z;
        pz8 pz82 = y19.B;
        fz8 fz8 = y19.F;
        ay8 ay8 = by8.F0;
        String str = this.a;
        boolean n1 = tp8.n1(str, ay8);
        ox8 ox8 = (ox8) this.i;
        if (ox8.E()) {
            j2 = qr8.e;
        } else {
            j2 = j;
        }
        y19.g(pz82);
        mz8 mz8 = pz82.J;
        mz8 mz82 = pz82.E;
        boolean isLoggable = Log.isLoggable(pz82.m1(), 2);
        int i3 = this.b;
        Boolean bool5 = null;
        if (isLoggable) {
            y19.g(pz82);
            Integer valueOf = Integer.valueOf(i3);
            if (ox8.t()) {
                num = Integer.valueOf(ox8.u());
            } else {
                num = null;
            }
            mz8.d("Evaluating filter. audience, filter, event", valueOf, num, fz8.a(ox8.v()));
            y19.g(pz82);
            y89 y89 = dl8.x.C;
            v89.R(y89);
            StringBuilder sb = new StringBuilder();
            sb.append("\nevent_filter {\n");
            if (ox8.t()) {
                i2 = 0;
                y89.x1(sb, 0, "filter_id", Integer.valueOf(ox8.u()));
            } else {
                i2 = 0;
            }
            y89.x1(sb, i2, "event_name", ((y19) y89.w).F.a(ox8.v()));
            String t1 = y89.t1(ox8.B(), ox8.C(), ox8.E());
            if (!t1.isEmpty()) {
                y89.x1(sb, 0, "filter_type", t1);
            }
            if (ox8.z()) {
                y89.y1(sb, 1, "event_count_filter", ox8.A());
            }
            if (ox8.x() > 0) {
                sb.append("  filters {\n");
                for (sx8 q1 : ox8.w()) {
                    y89.q1(sb, 2, q1);
                }
            }
            y89.r1(1, sb);
            sb.append("}\n}\n");
            mz8.b("Filter definition", sb.toString());
        }
        if (!ox8.t() || ox8.u() > 256) {
            y19.g(pz82);
            nz8 k1 = pz8.k1(str);
            if (ox8.t()) {
                bool5 = Integer.valueOf(ox8.u());
            }
            mz82.c(k1, String.valueOf(bool5), "Invalid event filter ID. appId, id");
            return false;
        }
        boolean B = ox8.B();
        boolean C = ox8.C();
        boolean E = ox8.E();
        if (B || C || E) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z || z2) {
            String y = h19.y();
            if (ox8.z()) {
                try {
                    bool4 = rt4.h(new BigDecimal(j2), ox8.A(), 0.0d);
                } catch (NumberFormatException unused) {
                    bool4 = null;
                }
                if (bool4 != null) {
                    if (!bool4.booleanValue()) {
                        bool5 = Boolean.FALSE;
                    }
                }
                z3 = n1;
                pz8 = pz82;
                bool5 = bool5;
                y19.g(pz8);
                if (bool5 != null) {
                    obj = "null";
                } else {
                    obj = bool5;
                }
                mz8.b("Event filter result", obj);
                if (bool5 != null) {
                    return false;
                }
                Boolean bool6 = Boolean.TRUE;
                this.c = bool6;
                if (!bool5.booleanValue()) {
                    return true;
                }
                this.d = bool6;
                if (!z2 || !h19.z()) {
                    return true;
                }
                Long valueOf2 = Long.valueOf(h19.A());
                if (ox8.C()) {
                    if (z3 && ox8.z()) {
                        valueOf2 = l;
                    }
                    this.f = valueOf2;
                    return true;
                }
                if (z3 && ox8.z()) {
                    valueOf2 = l2;
                }
                this.e = valueOf2;
                return true;
            }
            HashSet hashSet = new HashSet();
            Iterator it = ox8.w().iterator();
            while (true) {
                if (!it.hasNext()) {
                    zt6 zt6 = new zt6(0);
                    Iterator it2 = h19.v().iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            Iterator it3 = ox8.w().iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    z3 = n1;
                                    pz8 = pz82;
                                    bool5 = Boolean.TRUE;
                                    break;
                                }
                                sx8 sx8 = (sx8) it3.next();
                                if (!sx8.x() || !sx8.y()) {
                                    z4 = false;
                                } else {
                                    z4 = true;
                                }
                                String A = sx8.A();
                                if (A.isEmpty()) {
                                    y19.g(pz82);
                                    mz82.b("Event has empty param name. event", fz8.a(y));
                                    break;
                                }
                                Object obj2 = zt6.get(A);
                                if (obj2 instanceof Long) {
                                    if (sx8.v()) {
                                        try {
                                            bool3 = rt4.h(new BigDecimal(((Long) obj2).longValue()), sx8.w(), 0.0d);
                                        } catch (NumberFormatException unused2) {
                                            bool3 = null;
                                        }
                                        if (bool3 != null) {
                                            if (bool3.booleanValue() == z4) {
                                                bool5 = Boolean.FALSE;
                                                break;
                                            }
                                        } else {
                                            break;
                                        }
                                    } else {
                                        y19.g(pz82);
                                        mz82.c(fz8.a(y), fz8.b(A), "No number filter for long param. event, param");
                                        break;
                                    }
                                } else if (obj2 instanceof Double) {
                                    if (sx8.v()) {
                                        double doubleValue = ((Double) obj2).doubleValue();
                                        try {
                                            bool2 = rt4.h(new BigDecimal(doubleValue), sx8.w(), Math.ulp(doubleValue));
                                        } catch (NumberFormatException unused3) {
                                            bool2 = null;
                                        }
                                        if (bool2 != null) {
                                            if (bool2.booleanValue() == z4) {
                                                bool5 = Boolean.FALSE;
                                                break;
                                            }
                                        } else {
                                            break;
                                        }
                                    } else {
                                        y19.g(pz82);
                                        mz82.c(fz8.a(y), fz8.b(A), "No number filter for double param. event, param");
                                        break;
                                    }
                                } else if (obj2 instanceof String) {
                                    if (!sx8.t()) {
                                        if (!sx8.v()) {
                                            z3 = n1;
                                            pz8 = pz82;
                                            y19.g(pz8);
                                            mz82.c(fz8.a(y), fz8.b(A), "No filter for String param. event, param");
                                            break;
                                        }
                                        String str2 = (String) obj2;
                                        if (!y89.G1(str2)) {
                                            z3 = n1;
                                            pz8 = pz82;
                                            y19.g(pz8);
                                            mz82.c(fz8.a(y), fz8.b(A), "Invalid param value for number filter. event, param");
                                            break;
                                        }
                                        ux8 w = sx8.w();
                                        if (y89.G1(str2)) {
                                            try {
                                                z3 = n1;
                                                pz8 = pz82;
                                                j3 = 0;
                                                try {
                                                    bool = rt4.h(new BigDecimal(str2), w, 0.0d);
                                                } catch (NumberFormatException unused4) {
                                                    bool = null;
                                                    if (bool == null) {
                                                    }
                                                    y19.g(pz8);
                                                    if (bool5 != null) {
                                                    }
                                                    mz8.b("Event filter result", obj);
                                                    if (bool5 != null) {
                                                    }
                                                }
                                            } catch (NumberFormatException unused5) {
                                                z3 = n1;
                                                pz8 = pz82;
                                                j3 = 0;
                                                bool = null;
                                                if (bool == null) {
                                                }
                                                y19.g(pz8);
                                                if (bool5 != null) {
                                                }
                                                mz8.b("Event filter result", obj);
                                                if (bool5 != null) {
                                                }
                                            }
                                            if (bool == null) {
                                                break;
                                            } else if (bool.booleanValue() == z4) {
                                                bool5 = Boolean.FALSE;
                                                break;
                                            } else {
                                                long j4 = j3;
                                                pz82 = pz8;
                                                n1 = z3;
                                            }
                                        } else {
                                            z3 = n1;
                                            pz8 = pz82;
                                            bool = null;
                                        }
                                    } else {
                                        xx8 u = sx8.u();
                                        y19.g(pz82);
                                        bool = rt4.g((String) obj2, u, pz82);
                                        z3 = n1;
                                        pz8 = pz82;
                                    }
                                    j3 = 0;
                                    if (bool == null) {
                                    }
                                } else {
                                    z3 = n1;
                                    pz8 = pz82;
                                    if (obj2 == null) {
                                        y19.g(pz8);
                                        mz8.c(fz8.a(y), fz8.b(A), "Missing param for filter. event, param");
                                        bool5 = Boolean.FALSE;
                                    } else {
                                        y19.g(pz8);
                                        mz82.c(fz8.a(y), fz8.b(A), "Unknown param type. event, param");
                                    }
                                }
                            }
                        } else {
                            n19 n19 = (n19) it2.next();
                            if (hashSet.contains(n19.u())) {
                                if (!n19.x()) {
                                    if (!n19.B()) {
                                        if (!n19.v()) {
                                            y19.g(pz82);
                                            mz82.c(fz8.a(y), fz8.b(n19.u()), "Unknown value for param. event, param");
                                            break;
                                        }
                                        zt6.put(n19.u(), n19.w());
                                    } else {
                                        String u2 = n19.u();
                                        if (n19.B()) {
                                            d = Double.valueOf(n19.C());
                                        } else {
                                            d = null;
                                        }
                                        zt6.put(u2, d);
                                    }
                                } else {
                                    String u3 = n19.u();
                                    if (n19.x()) {
                                        l3 = Long.valueOf(n19.y());
                                    } else {
                                        l3 = null;
                                    }
                                    zt6.put(u3, l3);
                                }
                            }
                        }
                    }
                } else {
                    sx8 sx82 = (sx8) it.next();
                    if (sx82.A().isEmpty()) {
                        y19.g(pz82);
                        mz82.b("null or empty param name in filter. event", fz8.a(y));
                        break;
                    }
                    hashSet.add(sx82.A());
                }
            }
            y19.g(pz8);
            if (bool5 != null) {
            }
            mz8.b("Event filter result", obj);
            if (bool5 != null) {
            }
        } else {
            y19.g(pz82);
            Integer valueOf3 = Integer.valueOf(i3);
            if (ox8.t()) {
                bool5 = Integer.valueOf(ox8.u());
            }
            mz8.c(valueOf3, bool5, "Event filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID");
            return true;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:58:0x016e  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0171  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0179 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x017a  */
    public boolean j(Long l, Long l2, m29 m29, boolean z) {
        boolean z2;
        boolean z3;
        Boolean bool;
        Object obj;
        Boolean bool2;
        Boolean bool3;
        Boolean bool4;
        Integer num;
        io8.a();
        y19 y19 = (y19) this.h.w;
        tp8 tp8 = y19.z;
        fz8 fz8 = y19.F;
        pz8 pz8 = y19.B;
        boolean n1 = tp8.n1(this.a, by8.D0);
        wx8 wx8 = (wx8) this.i;
        boolean x = wx8.x();
        boolean y = wx8.y();
        boolean A = wx8.A();
        if (x || y || A) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z || z2) {
            sx8 w = wx8.w();
            boolean y2 = w.y();
            if (!m29.y()) {
                z3 = A;
                if (m29.C()) {
                    if (!w.v()) {
                        y19.g(pz8);
                        pz8.E.b("No number filter for double property. property", fz8.c(m29.v()));
                    } else {
                        double D = m29.D();
                        try {
                            bool3 = rt4.h(new BigDecimal(D), w.w(), Math.ulp(D));
                        } catch (NumberFormatException unused) {
                            bool3 = null;
                        }
                        bool = rt4.f(bool3, y2);
                        y19.g(pz8);
                        mz8 mz8 = pz8.J;
                        if (bool != null) {
                        }
                        mz8.b("Property filter result", obj);
                        if (bool != null) {
                        }
                    }
                } else if (m29.w()) {
                    if (w.t()) {
                        String x2 = m29.x();
                        xx8 u = w.u();
                        y19.g(pz8);
                        bool = rt4.f(rt4.g(x2, u, pz8), y2);
                    } else if (!w.v()) {
                        y19.g(pz8);
                        pz8.E.b("No string or number filter defined. property", fz8.c(m29.v()));
                    } else if (y89.G1(m29.x())) {
                        String x3 = m29.x();
                        ux8 w2 = w.w();
                        if (y89.G1(x3)) {
                            try {
                                bool2 = rt4.h(new BigDecimal(x3), w2, 0.0d);
                            } catch (NumberFormatException unused2) {
                            }
                            bool = rt4.f(bool2, y2);
                        }
                        bool2 = null;
                        bool = rt4.f(bool2, y2);
                    } else {
                        y19.g(pz8);
                        pz8.E.c(fz8.c(m29.v()), m29.x(), "Invalid user property value for Numeric number filter. property, value");
                    }
                    y19.g(pz8);
                    mz8 mz82 = pz8.J;
                    if (bool != null) {
                    }
                    mz82.b("Property filter result", obj);
                    if (bool != null) {
                    }
                } else {
                    y19.g(pz8);
                    pz8.E.b("User property has no value, property", fz8.c(m29.v()));
                }
            } else if (!w.v()) {
                y19.g(pz8);
                pz8.E.b("No number filter for long property. property", fz8.c(m29.v()));
                z3 = A;
            } else {
                z3 = A;
                try {
                    bool4 = rt4.h(new BigDecimal(m29.z()), w.w(), 0.0d);
                } catch (NumberFormatException unused3) {
                    bool4 = null;
                }
                bool = rt4.f(bool4, y2);
                y19.g(pz8);
                mz8 mz822 = pz8.J;
                if (bool != null) {
                    obj = "null";
                } else {
                    obj = bool;
                }
                mz822.b("Property filter result", obj);
                if (bool != null) {
                    return false;
                }
                this.c = Boolean.TRUE;
                if (!z3 || bool.booleanValue()) {
                    if (!z || wx8.x()) {
                        this.d = bool;
                    }
                    if (bool.booleanValue() && z2 && m29.t()) {
                        long u2 = m29.u();
                        if (l != null) {
                            u2 = l.longValue();
                        }
                        if (n1 && wx8.x() && !wx8.y() && l2 != null) {
                            u2 = l2.longValue();
                        }
                        if (wx8.y()) {
                            this.f = Long.valueOf(u2);
                        } else {
                            this.e = Long.valueOf(u2);
                        }
                    }
                }
                return true;
            }
            bool = null;
            y19.g(pz8);
            mz8 mz8222 = pz8.J;
            if (bool != null) {
            }
            mz8222.b("Property filter result", obj);
            if (bool != null) {
            }
        } else {
            y19.g(pz8);
            mz8 mz83 = pz8.J;
            Integer valueOf = Integer.valueOf(this.b);
            if (wx8.t()) {
                num = Integer.valueOf(wx8.u());
            } else {
                num = null;
            }
            mz83.c(valueOf, num, "Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID");
            return true;
        }
    }
}
