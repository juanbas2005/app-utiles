package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: sq8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class sq8 {
    public final ArrayList a = new ArrayList();
    public final /* synthetic */ int b;

    public sq8(int i) {
        this.b = i;
    }

    public static aq8 c(no7 no7, List list) {
        as8 as8 = as8.x;
        ya5.y("FN", 2, list);
        bq8 r = ((k68) no7.y).r(no7, (bq8) list.get(0));
        bq8 r2 = ((k68) no7.y).r(no7, (bq8) list.get(1));
        if (r2 instanceof rl8) {
            List w = ((rl8) r2).w();
            List arrayList = new ArrayList();
            if (list.size() > 2) {
                arrayList = list.subList(2, list.size());
            }
            return new aq8(r.g(), (ArrayList) w, arrayList, no7);
        }
        h.q(b81.y("FN requires an ArrayValue of parameter names found ", r2.getClass().getCanonicalName()));
        return null;
    }

    public static boolean d(bq8 bq8, bq8 bq82) {
        int i;
        if (bq8 instanceof qp8) {
            bq8 = new mq8(bq8.g());
        }
        if (bq82 instanceof qp8) {
            bq82 = new mq8(bq82.g());
        }
        if (!(bq8 instanceof mq8) || !(bq82 instanceof mq8)) {
            double doubleValue = bq8.p().doubleValue();
            double doubleValue2 = bq82.p().doubleValue();
            if (Double.isNaN(doubleValue) || Double.isNaN(doubleValue2) || ((doubleValue == 0.0d && doubleValue2 == 0.0d) || ((i == 0 && doubleValue2 == 0.0d) || Double.compare(doubleValue, doubleValue2) >= 0))) {
                return false;
            }
            return true;
        } else if (((mq8) bq8).w.compareTo(((mq8) bq82).w) < 0) {
            return true;
        } else {
            return false;
        }
    }

    public static bq8 e(mr8 mr8, bq8 bq8, bq8 bq82) {
        if (bq8 instanceof Iterable) {
            return g(mr8, ((Iterable) bq8).iterator(), bq82);
        }
        h.q("Non-iterable type in for...of loop.");
        return null;
    }

    public static boolean f(bq8 bq8, bq8 bq82) {
        if (bq8.getClass().equals(bq82.getClass())) {
            if ((bq8 instanceof qq8) || (bq8 instanceof yp8)) {
                return true;
            }
            if (bq8 instanceof wn8) {
                if (Double.isNaN(bq8.p().doubleValue()) || Double.isNaN(bq82.p().doubleValue()) || bq8.p().doubleValue() != bq82.p().doubleValue()) {
                    return false;
                }
                return true;
            } else if (bq8 instanceof mq8) {
                return bq8.g().equals(bq82.g());
            } else {
                if (bq8 instanceof km8) {
                    return bq8.f().equals(bq82.f());
                }
                if (bq8 == bq82) {
                    return true;
                }
                return false;
            }
        } else if (((bq8 instanceof qq8) || (bq8 instanceof yp8)) && ((bq82 instanceof qq8) || (bq82 instanceof yp8))) {
            return true;
        } else {
            boolean z = bq8 instanceof wn8;
            if (z && (bq82 instanceof mq8)) {
                return f(bq8, new wn8(bq82.p()));
            }
            boolean z2 = bq8 instanceof mq8;
            if (z2 && (bq82 instanceof wn8)) {
                return f(new wn8(bq8.p()), bq82);
            }
            if (bq8 instanceof km8) {
                return f(new wn8(bq8.p()), bq82);
            }
            if (bq82 instanceof km8) {
                return f(bq8, new wn8(bq82.p()));
            }
            if ((z2 || z) && (bq82 instanceof qp8)) {
                return f(bq8, new mq8(bq82.g()));
            }
            if (!(bq8 instanceof qp8) || (!(bq82 instanceof mq8) && !(bq82 instanceof wn8))) {
                return false;
            }
            return f(new mq8(bq8.g()), bq82);
        }
    }

    public static bq8 g(mr8 mr8, Iterator it, bq8 bq8) {
        no7 no7;
        if (it != null) {
            while (it.hasNext()) {
                bq8 bq82 = (bq8) it.next();
                switch (mr8.a) {
                    case b85.b:
                        no7 = mr8.b.k();
                        String str = mr8.c;
                        no7.o(str, bq82);
                        ((HashMap) no7.A).put(str, Boolean.TRUE);
                        break;
                    case 1:
                        no7 = mr8.b.k();
                        no7.o(mr8.c, bq82);
                        break;
                    default:
                        no7 = mr8.b;
                        no7.o(mr8.c, bq82);
                        break;
                }
                bq8 h = no7.h((rl8) bq8);
                if (h instanceof cn8) {
                    cn8 cn8 = (cn8) h;
                    String str2 = cn8.x;
                    if ("break".equals(str2)) {
                        return bq8.o;
                    }
                    if ("return".equals(str2)) {
                        return cn8;
                    }
                }
            }
        }
        return bq8.o;
    }

    public static boolean h(bq8 bq8, bq8 bq82) {
        if (bq8 instanceof qp8) {
            bq8 = new mq8(bq8.g());
        }
        if (bq82 instanceof qp8) {
            bq82 = new mq8(bq82.g());
        }
        if (((!(bq8 instanceof mq8) || !(bq82 instanceof mq8)) && (Double.isNaN(bq8.p().doubleValue()) || Double.isNaN(bq82.p().doubleValue()))) || d(bq82, bq8)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:514:?, code lost:
        return r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:515:?, code lost:
        return r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:386:0x0bb7  */
    /* JADX WARNING: Removed duplicated region for block: B:550:? A[RETURN, SYNTHETIC] */
    public final bq8 a(String str, no7 no7, ArrayList arrayList) {
        boolean z;
        boolean f;
        bq8 bq8;
        bq8 h;
        qq8 qq8;
        cn8 cn8;
        bq8 mq8;
        vp8 vp8;
        String str2;
        int i = 0;
        bq8 bq82 = null;
        switch (this.b) {
            case b85.b:
                as8 as8 = as8.x;
                switch (ya5.B(str).ordinal()) {
                    case 4:
                        ya5.x("BITWISE_AND", 2, arrayList);
                        return new wn8(Double.valueOf((double) (ya5.D(((k68) no7.y).r(no7, (bq8) arrayList.get(0)).p().doubleValue()) & ya5.D(((k68) no7.y).r(no7, (bq8) arrayList.get(1)).p().doubleValue()))));
                    case 5:
                        ya5.x("BITWISE_LEFT_SHIFT", 2, arrayList);
                        return new wn8(Double.valueOf((double) (ya5.D(((k68) no7.y).r(no7, (bq8) arrayList.get(0)).p().doubleValue()) << ((int) (((long) ya5.D(((k68) no7.y).r(no7, (bq8) arrayList.get(1)).p().doubleValue())) & 31)))));
                    case 6:
                        ya5.x("BITWISE_NOT", 1, arrayList);
                        return new wn8(Double.valueOf((double) (~ya5.D(((k68) no7.y).r(no7, (bq8) arrayList.get(0)).p().doubleValue()))));
                    case 7:
                        ya5.x("BITWISE_OR", 2, arrayList);
                        return new wn8(Double.valueOf((double) (ya5.D(((k68) no7.y).r(no7, (bq8) arrayList.get(0)).p().doubleValue()) | ya5.D(((k68) no7.y).r(no7, (bq8) arrayList.get(1)).p().doubleValue()))));
                    case 8:
                        ya5.x("BITWISE_RIGHT_SHIFT", 2, arrayList);
                        return new wn8(Double.valueOf((double) (ya5.D(((k68) no7.y).r(no7, (bq8) arrayList.get(0)).p().doubleValue()) >> ((int) (((long) ya5.D(((k68) no7.y).r(no7, (bq8) arrayList.get(1)).p().doubleValue())) & 31)))));
                    case 9:
                        ya5.x("BITWISE_UNSIGNED_RIGHT_SHIFT", 2, arrayList);
                        return new wn8(Double.valueOf((double) ((((long) ya5.D(((k68) no7.y).r(no7, (bq8) arrayList.get(0)).p().doubleValue())) & 4294967295L) >>> ((int) (((long) ya5.D(((k68) no7.y).r(no7, (bq8) arrayList.get(1)).p().doubleValue())) & 31)))));
                    case 10:
                        ya5.x("BITWISE_XOR", 2, arrayList);
                        return new wn8(Double.valueOf((double) (ya5.D(((k68) no7.y).r(no7, (bq8) arrayList.get(0)).p().doubleValue()) ^ ya5.D(((k68) no7.y).r(no7, (bq8) arrayList.get(1)).p().doubleValue()))));
                    default:
                        b(str);
                        throw null;
                }
            case 1:
                ya5.x(ya5.B(str).name(), 2, arrayList);
                bq8 r = ((k68) no7.y).r(no7, (bq8) arrayList.get(0));
                bq8 r2 = ((k68) no7.y).r(no7, (bq8) arrayList.get(1));
                int ordinal = ya5.B(str).ordinal();
                if (ordinal != 23) {
                    if (ordinal == 48) {
                        f = f(r, r2);
                    } else if (ordinal == 42) {
                        z = d(r, r2);
                    } else if (ordinal != 43) {
                        switch (ordinal) {
                            case 37:
                                z = d(r2, r);
                                break;
                            case 38:
                                z = h(r2, r);
                                break;
                            case 39:
                                z = ya5.C(r, r2);
                                break;
                            case 40:
                                f = ya5.C(r, r2);
                                break;
                            default:
                                b(str);
                                throw null;
                        }
                    } else {
                        z = h(r, r2);
                    }
                    z = !f;
                } else {
                    z = f(r, r2);
                }
                if (z) {
                    return bq8.t;
                }
                return bq8.u;
            case 2:
                as8 as82 = as8.x;
                int ordinal2 = ya5.B(str).ordinal();
                if (ordinal2 == 2) {
                    ya5.x("APPLY", 3, arrayList);
                    k68 k68 = (k68) no7.y;
                    k68 k682 = (k68) no7.y;
                    bq8 r3 = k68.r(no7, (bq8) arrayList.get(0));
                    String g = k682.r(no7, (bq8) arrayList.get(1)).g();
                    bq8 r4 = k682.r(no7, (bq8) arrayList.get(2));
                    if (!(r4 instanceof rl8)) {
                        h.q(b81.y("Function arguments for Apply are not a list found ", r4.getClass().getCanonicalName()));
                        return null;
                    } else if (!g.isEmpty()) {
                        return r3.k(g, no7, (ArrayList) ((rl8) r4).w());
                    } else {
                        h.q("Function name for apply is undefined");
                        return null;
                    }
                } else if (ordinal2 == 15) {
                    ya5.x("BREAK", 0, arrayList);
                    return bq8.q;
                } else if (ordinal2 == 25) {
                    return c(no7, arrayList);
                } else {
                    if (ordinal2 == 41) {
                        ya5.y("IF", 2, arrayList);
                        k68 k683 = (k68) no7.y;
                        k68 k684 = (k68) no7.y;
                        bq8 r5 = k683.r(no7, (bq8) arrayList.get(0));
                        bq8 r6 = k684.r(no7, (bq8) arrayList.get(1));
                        if (arrayList.size() > 2) {
                            bq82 = k684.r(no7, (bq8) arrayList.get(2));
                        }
                        bq8 bq83 = bq8.o;
                        if (r5.f().booleanValue()) {
                            h = no7.h((rl8) r6);
                        } else if (bq82 != null) {
                            h = no7.h((rl8) bq82);
                        } else {
                            bq8 = bq83;
                            if (true == (bq8 instanceof cn8)) {
                                return bq83;
                            }
                            return bq8;
                        }
                        bq8 = h;
                        if (true == (bq8 instanceof cn8)) {
                        }
                    } else if (ordinal2 == 54) {
                        return new rl8(arrayList);
                    } else {
                        if (ordinal2 != 57) {
                            if (ordinal2 != 19) {
                                if (ordinal2 == 20) {
                                    ya5.y("DEFINE_FUNCTION", 2, arrayList);
                                    aq8 c = c(no7, arrayList);
                                    String str3 = c.w;
                                    if (str3 == null) {
                                        no7.m("", c);
                                        return c;
                                    }
                                    no7.m(str3, c);
                                    return c;
                                } else if (ordinal2 == 60) {
                                    ya5.x("SWITCH", 3, arrayList);
                                    k68 k685 = (k68) no7.y;
                                    k68 k686 = (k68) no7.y;
                                    bq8 r7 = k685.r(no7, (bq8) arrayList.get(0));
                                    bq8 r8 = k686.r(no7, (bq8) arrayList.get(1));
                                    bq8 r9 = k686.r(no7, (bq8) arrayList.get(2));
                                    if (!(r8 instanceof rl8)) {
                                        h.q("Malformed SWITCH statement, cases are not a list");
                                        return null;
                                    } else if (r9 instanceof rl8) {
                                        rl8 rl8 = (rl8) r8;
                                        rl8 rl82 = (rl8) r9;
                                        boolean z2 = false;
                                        for (int i2 = 0; i2 < rl8.y(); i2++) {
                                            if (z2 || r7.equals(k686.r(no7, rl8.z(i2)))) {
                                                bq8 r10 = k686.r(no7, rl82.z(i2));
                                                if (!(r10 instanceof cn8)) {
                                                    z2 = true;
                                                } else if (((cn8) r10).x.equals("break")) {
                                                    return bq8.o;
                                                } else {
                                                    return r10;
                                                }
                                            } else {
                                                z2 = false;
                                            }
                                        }
                                        if (rl8.y() + 1 == rl82.y()) {
                                            bq8 r11 = k686.r(no7, rl82.z(rl8.y()));
                                            if (r11 instanceof cn8) {
                                                String str4 = ((cn8) r11).x;
                                                if (str4.equals("return") || str4.equals("continue")) {
                                                    return r11;
                                                }
                                            }
                                        }
                                        return bq8.o;
                                    } else {
                                        h.q("Malformed SWITCH statement, case statements are not a list");
                                        return null;
                                    }
                                } else if (ordinal2 != 61) {
                                    switch (ordinal2) {
                                        case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER:
                                            return no7.k().h(new rl8(arrayList));
                                        case 12:
                                            ya5.x("BREAK", 0, arrayList);
                                            return bq8.r;
                                        case ry4.PERF_SESSIONS_FIELD_NUMBER:
                                            break;
                                        default:
                                            b(str);
                                            throw null;
                                    }
                                } else {
                                    ya5.x("TERNARY", 3, arrayList);
                                    k68 k687 = (k68) no7.y;
                                    k68 k688 = (k68) no7.y;
                                    if (k687.r(no7, (bq8) arrayList.get(0)).f().booleanValue()) {
                                        return k688.r(no7, (bq8) arrayList.get(1));
                                    }
                                    return k688.r(no7, (bq8) arrayList.get(2));
                                }
                            }
                            if (arrayList.isEmpty()) {
                                return bq8.o;
                            }
                            bq8 r12 = ((k68) no7.y).r(no7, (bq8) arrayList.get(0));
                            if (r12 instanceof rl8) {
                                return no7.h((rl8) r12);
                            }
                            return bq8.o;
                        } else if (arrayList.isEmpty()) {
                            return bq8.s;
                        } else {
                            ya5.x("RETURN", 1, arrayList);
                            return new cn8("return", ((k68) no7.y).r(no7, (bq8) arrayList.get(0)));
                        }
                    }
                }
                break;
            case 3:
                as8 as83 = as8.x;
                int ordinal3 = ya5.B(str).ordinal();
                if (ordinal3 == 1) {
                    ya5.x("AND", 2, arrayList);
                    bq8 r13 = ((k68) no7.y).r(no7, (bq8) arrayList.get(0));
                    if (!r13.f().booleanValue()) {
                        return r13;
                    }
                    return ((k68) no7.y).r(no7, (bq8) arrayList.get(1));
                } else if (ordinal3 == 47) {
                    ya5.x("NOT", 1, arrayList);
                    return new km8(Boolean.valueOf(!((k68) no7.y).r(no7, (bq8) arrayList.get(0)).f().booleanValue()));
                } else if (ordinal3 == 50) {
                    ya5.x("OR", 2, arrayList);
                    bq8 r14 = ((k68) no7.y).r(no7, (bq8) arrayList.get(0));
                    if (r14.f().booleanValue()) {
                        return r14;
                    }
                    return ((k68) no7.y).r(no7, (bq8) arrayList.get(1));
                } else {
                    b(str);
                    throw null;
                }
            case 4:
                as8 as84 = as8.x;
                int ordinal4 = ya5.B(str).ordinal();
                if (ordinal4 != 65) {
                    switch (ordinal4) {
                        case 26:
                            ya5.x("FOR_IN", 3, arrayList);
                            if (arrayList.get(0) instanceof mq8) {
                                String g2 = ((bq8) arrayList.get(0)).g();
                                bq8 r15 = ((k68) no7.y).r(no7, (bq8) arrayList.get(1));
                                bq8 r16 = ((k68) no7.y).r(no7, (bq8) arrayList.get(2));
                                Iterator d = r15.d();
                                if (d != null) {
                                    while (true) {
                                        if (d.hasNext()) {
                                            no7.o(g2, (bq8) d.next());
                                            bq8 h2 = no7.h((rl8) r16);
                                            if (h2 instanceof cn8) {
                                                cn8 = (cn8) h2;
                                                String str5 = cn8.x;
                                                if ("break".equals(str5)) {
                                                    qq8 = bq8.o;
                                                    break;
                                                } else if ("return".equals(str5)) {
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                }
                                qq8 = bq8.o;
                                break;
                            } else {
                                h.q("Variable name in FOR_IN must be a string");
                                return null;
                            }
                        case 27:
                            ya5.x("FOR_IN_CONST", 3, arrayList);
                            if (arrayList.get(0) instanceof mq8) {
                                return g(new mr8(no7, ((bq8) arrayList.get(0)).g(), 0), ((k68) no7.y).r(no7, (bq8) arrayList.get(1)).d(), ((k68) no7.y).r(no7, (bq8) arrayList.get(2)));
                            }
                            h.q("Variable name in FOR_IN_CONST must be a string");
                            return null;
                        case 28:
                            ya5.x("FOR_IN_LET", 3, arrayList);
                            if (arrayList.get(0) instanceof mq8) {
                                String g3 = ((bq8) arrayList.get(0)).g();
                                bq8 r17 = ((k68) no7.y).r(no7, (bq8) arrayList.get(1));
                                bq8 r18 = ((k68) no7.y).r(no7, (bq8) arrayList.get(2));
                                Iterator d2 = r17.d();
                                if (d2 != null) {
                                    while (true) {
                                        if (d2.hasNext()) {
                                            no7 k = no7.k();
                                            k.o(g3, (bq8) d2.next());
                                            bq8 h3 = k.h((rl8) r18);
                                            if (h3 instanceof cn8) {
                                                cn8 = (cn8) h3;
                                                String str6 = cn8.x;
                                                if ("break".equals(str6)) {
                                                    qq8 = bq8.o;
                                                    break;
                                                } else if ("return".equals(str6)) {
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                }
                                qq8 = bq8.o;
                                break;
                            } else {
                                h.q("Variable name in FOR_IN_LET must be a string");
                                return null;
                            }
                        case 29:
                            ya5.x("FOR_LET", 4, arrayList);
                            k68 k689 = (k68) no7.y;
                            k68 k6810 = (k68) no7.y;
                            bq8 r19 = k689.r(no7, (bq8) arrayList.get(0));
                            if (r19 instanceof rl8) {
                                rl8 rl83 = (rl8) r19;
                                bq8 bq84 = (bq8) arrayList.get(1);
                                bq8 bq85 = (bq8) arrayList.get(2);
                                bq8 r20 = k6810.r(no7, (bq8) arrayList.get(3));
                                no7 k2 = no7.k();
                                for (int i3 = 0; i3 < rl83.y(); i3++) {
                                    String g4 = rl83.z(i3).g();
                                    k2.m(g4, no7.p(g4));
                                }
                                while (k6810.r(no7, bq84).f().booleanValue()) {
                                    bq8 h4 = no7.h((rl8) r20);
                                    if (h4 instanceof cn8) {
                                        cn8 cn82 = (cn8) h4;
                                        String str7 = cn82.x;
                                        if ("break".equals(str7)) {
                                            return bq8.o;
                                        }
                                        if ("return".equals(str7)) {
                                            return cn82;
                                        }
                                    }
                                    no7 k3 = no7.k();
                                    for (int i4 = 0; i4 < rl83.y(); i4++) {
                                        String g5 = rl83.z(i4).g();
                                        k3.m(g5, k2.p(g5));
                                    }
                                    k3.g(bq85);
                                    k2 = k3;
                                }
                                return bq8.o;
                            }
                            h.q("Initializer variables in FOR_LET must be an ArrayList");
                            return null;
                        case 30:
                            ya5.x("FOR_OF", 3, arrayList);
                            if (arrayList.get(0) instanceof mq8) {
                                return e(new mr8(no7, ((bq8) arrayList.get(0)).g(), 2), ((k68) no7.y).r(no7, (bq8) arrayList.get(1)), ((k68) no7.y).r(no7, (bq8) arrayList.get(2)));
                            }
                            h.q("Variable name in FOR_OF must be a string");
                            return null;
                        case 31:
                            ya5.x("FOR_OF_CONST", 3, arrayList);
                            if (arrayList.get(0) instanceof mq8) {
                                return e(new mr8(no7, ((bq8) arrayList.get(0)).g(), 0), ((k68) no7.y).r(no7, (bq8) arrayList.get(1)), ((k68) no7.y).r(no7, (bq8) arrayList.get(2)));
                            }
                            h.q("Variable name in FOR_OF_CONST must be a string");
                            return null;
                        case 32:
                            ya5.x("FOR_OF_LET", 3, arrayList);
                            if (arrayList.get(0) instanceof mq8) {
                                return e(new mr8(no7, ((bq8) arrayList.get(0)).g(), 1), ((k68) no7.y).r(no7, (bq8) arrayList.get(1)), ((k68) no7.y).r(no7, (bq8) arrayList.get(2)));
                            }
                            h.q("Variable name in FOR_OF_LET must be a string");
                            return null;
                        default:
                            b(str);
                            throw null;
                    }
                } else {
                    ya5.x("WHILE", 4, arrayList);
                    bq8 bq86 = (bq8) arrayList.get(0);
                    bq8 bq87 = (bq8) arrayList.get(1);
                    k68 k6811 = (k68) no7.y;
                    k68 k6812 = (k68) no7.y;
                    bq8 r21 = k6811.r(no7, (bq8) arrayList.get(3));
                    if (k6812.r(no7, (bq8) arrayList.get(2)).f().booleanValue()) {
                        bq8 h5 = no7.h((rl8) r21);
                        if (h5 instanceof cn8) {
                            cn8 cn83 = (cn8) h5;
                            String str8 = cn83.x;
                            if ("break".equals(str8)) {
                                return bq8.o;
                            }
                            if ("return".equals(str8)) {
                                return cn83;
                            }
                        }
                    }
                    while (k6812.r(no7, bq86).f().booleanValue()) {
                        bq8 h6 = no7.h((rl8) r21);
                        if (h6 instanceof cn8) {
                            cn8 cn84 = (cn8) h6;
                            String str9 = cn84.x;
                            if ("break".equals(str9)) {
                                return bq8.o;
                            }
                            if ("return".equals(str9)) {
                                return cn84;
                            }
                        }
                        no7.g(bq87);
                    }
                    return bq8.o;
                }
            case 5:
                as8 as85 = as8.x;
                int ordinal5 = ya5.B(str).ordinal();
                if (ordinal5 == 0) {
                    ya5.x("ADD", 2, arrayList);
                    bq8 r22 = ((k68) no7.y).r(no7, (bq8) arrayList.get(0));
                    bq8 r23 = ((k68) no7.y).r(no7, (bq8) arrayList.get(1));
                    if ((r22 instanceof qp8) || (r22 instanceof mq8) || (r23 instanceof qp8) || (r23 instanceof mq8)) {
                        mq8 = new mq8(String.valueOf(r22.g()).concat(String.valueOf(r23.g())));
                    } else {
                        mq8 = new wn8(Double.valueOf(r23.p().doubleValue() + r22.p().doubleValue()));
                    }
                } else if (ordinal5 == 21) {
                    ya5.x("DIVIDE", 2, arrayList);
                    mq8 = new wn8(Double.valueOf(((k68) no7.y).r(no7, (bq8) arrayList.get(0)).p().doubleValue() / ((k68) no7.y).r(no7, (bq8) arrayList.get(1)).p().doubleValue()));
                } else if (ordinal5 == 59) {
                    ya5.x("SUBTRACT", 2, arrayList);
                    return new wn8(Double.valueOf(((k68) no7.y).r(no7, (bq8) arrayList.get(0)).p().doubleValue() + (-((k68) no7.y).r(no7, (bq8) arrayList.get(1)).p().doubleValue())));
                } else if (ordinal5 == 52 || ordinal5 == 53) {
                    ya5.x(str, 2, arrayList);
                    bq8 r24 = ((k68) no7.y).r(no7, (bq8) arrayList.get(0));
                    no7.g((bq8) arrayList.get(1));
                    return r24;
                } else if (ordinal5 == 55 || ordinal5 == 56) {
                    ya5.x(str, 1, arrayList);
                    return ((k68) no7.y).r(no7, (bq8) arrayList.get(0));
                } else {
                    switch (ordinal5) {
                        case 44:
                            ya5.x("MODULUS", 2, arrayList);
                            mq8 = new wn8(Double.valueOf(((k68) no7.y).r(no7, (bq8) arrayList.get(0)).p().doubleValue() % ((k68) no7.y).r(no7, (bq8) arrayList.get(1)).p().doubleValue()));
                            break;
                        case 45:
                            ya5.x("MULTIPLY", 2, arrayList);
                            return new wn8(Double.valueOf(((k68) no7.y).r(no7, (bq8) arrayList.get(1)).p().doubleValue() * ((k68) no7.y).r(no7, (bq8) arrayList.get(0)).p().doubleValue()));
                        case 46:
                            ya5.x("NEGATE", 1, arrayList);
                            return new wn8(Double.valueOf(-((k68) no7.y).r(no7, (bq8) arrayList.get(0)).p().doubleValue()));
                        default:
                            b(str);
                            throw null;
                    }
                }
                return mq8;
            case 6:
                if (str == null || str.isEmpty() || !no7.l(str)) {
                    h.q(b81.y("Command not found: ", str));
                    return null;
                }
                bq8 p = no7.p(str);
                if (p instanceof ro8) {
                    return ((ro8) p).a(no7, arrayList);
                }
                h.q(f21.h("Function ", str, " is not defined"));
                return null;
            default:
                as8 as86 = as8.x;
                int ordinal6 = ya5.B(str).ordinal();
                if (ordinal6 == 3) {
                    ya5.x("ASSIGN", 2, arrayList);
                    bq8 r25 = ((k68) no7.y).r(no7, (bq8) arrayList.get(0));
                    if (r25 instanceof mq8) {
                        String str10 = ((mq8) r25).w;
                        if (no7.l(str10)) {
                            bq8 r26 = ((k68) no7.y).r(no7, (bq8) arrayList.get(1));
                            no7.m(str10, r26);
                            return r26;
                        }
                        h.q(b81.y("Attempting to assign undefined value ", str10));
                        return null;
                    }
                    h.q(b81.y("Expected string for assign var. got ", r25.getClass().getCanonicalName()));
                    return null;
                } else if (ordinal6 != 14) {
                    if (ordinal6 == 24) {
                        ya5.y("EXPRESSION_LIST", 1, arrayList);
                        bq8 bq88 = bq8.o;
                        while (i < arrayList.size()) {
                            bq8 r27 = ((k68) no7.y).r(no7, (bq8) arrayList.get(i));
                            if (!(r27 instanceof cn8)) {
                                i++;
                                bq88 = r27;
                            } else {
                                h.s("ControlValue cannot be in an expression list");
                                return null;
                            }
                        }
                        vp8 = bq88;
                    } else if (ordinal6 == 33) {
                        ya5.x("GET", 1, arrayList);
                        bq8 r28 = ((k68) no7.y).r(no7, (bq8) arrayList.get(0));
                        if (r28 instanceof mq8) {
                            return no7.p(((mq8) r28).w);
                        }
                        h.q(b81.y("Expected string for get var. got ", r28.getClass().getCanonicalName()));
                        return null;
                    } else if (ordinal6 == 49) {
                        ya5.x("NULL", 0, arrayList);
                        return bq8.p;
                    } else if (ordinal6 == 58) {
                        ya5.x("SET_PROPERTY", 3, arrayList);
                        k68 k6813 = (k68) no7.y;
                        k68 k6814 = (k68) no7.y;
                        bq8 r29 = k6813.r(no7, (bq8) arrayList.get(0));
                        bq8 r30 = k6814.r(no7, (bq8) arrayList.get(1));
                        bq8 r31 = k6814.r(no7, (bq8) arrayList.get(2));
                        if (r29 == bq8.o || r29 == bq8.p) {
                            ku4.A("Can't set property ", r30.g(), " of ", r29.g());
                            return null;
                        }
                        if ((r29 instanceof rl8) && (r30 instanceof wn8)) {
                            ((rl8) r29).A(((wn8) r30).w.intValue(), r31);
                        } else if (r29 instanceof qp8) {
                            ((qp8) r29).o(r30.g(), r31);
                        }
                        return r31;
                    } else if (ordinal6 != 17) {
                        if (ordinal6 != 18) {
                            if (ordinal6 == 35 || ordinal6 == 36) {
                                ya5.x("GET_PROPERTY", 2, arrayList);
                                bq8 r32 = ((k68) no7.y).r(no7, (bq8) arrayList.get(0));
                                bq8 r33 = ((k68) no7.y).r(no7, (bq8) arrayList.get(1));
                                if ((r32 instanceof rl8) && ya5.A(r33)) {
                                    return ((rl8) r32).z(r33.p().intValue());
                                }
                                if (r32 instanceof qp8) {
                                    return ((qp8) r32).l(r33.g());
                                }
                                if (r32 instanceof mq8) {
                                    if ("length".equals(r33.g())) {
                                        return new wn8(Double.valueOf((double) ((mq8) r32).w.length()));
                                    }
                                    if (ya5.A(r33)) {
                                        double doubleValue = r33.p().doubleValue();
                                        String str11 = ((mq8) r32).w;
                                        if (doubleValue < ((double) str11.length())) {
                                            return new mq8(String.valueOf(str11.charAt(r33.p().intValue())));
                                        }
                                    }
                                }
                                return bq8.o;
                            }
                            switch (ordinal6) {
                                case 62:
                                    ya5.x("TYPEOF", 1, arrayList);
                                    bq8 r34 = ((k68) no7.y).r(no7, (bq8) arrayList.get(0));
                                    if (r34 instanceof qq8) {
                                        str2 = "undefined";
                                    } else if (r34 instanceof km8) {
                                        str2 = "boolean";
                                    } else if (r34 instanceof wn8) {
                                        str2 = "number";
                                    } else if (r34 instanceof mq8) {
                                        str2 = "string";
                                    } else if (r34 instanceof aq8) {
                                        str2 = "function";
                                    } else if ((r34 instanceof gq8) || (r34 instanceof cn8)) {
                                        throw new IllegalArgumentException(String.format("Unsupported value type %s in typeof", new Object[]{r34}));
                                    } else {
                                        str2 = "object";
                                    }
                                    return new mq8(str2);
                                case 63:
                                    ya5.x("UNDEFINED", 0, arrayList);
                                    return bq8.o;
                                case 64:
                                    ya5.y("VAR", 1, arrayList);
                                    Iterator it = arrayList.iterator();
                                    while (it.hasNext()) {
                                        bq8 r35 = ((k68) no7.y).r(no7, (bq8) it.next());
                                        if (r35 instanceof mq8) {
                                            no7.o(((mq8) r35).w, bq8.o);
                                        } else {
                                            h.q(b81.y("Expected string for var name. got ", r35.getClass().getCanonicalName()));
                                            return null;
                                        }
                                    }
                                    return bq8.o;
                                default:
                                    b(str);
                                    throw null;
                            }
                        } else if (arrayList.isEmpty()) {
                            return new vp8();
                        } else {
                            if (arrayList.size() % 2 == 0) {
                                vp8 vp82 = new vp8();
                                while (i < arrayList.size() - 1) {
                                    bq8 r36 = ((k68) no7.y).r(no7, (bq8) arrayList.get(i));
                                    bq8 r37 = ((k68) no7.y).r(no7, (bq8) arrayList.get(i + 1));
                                    if ((r36 instanceof cn8) || (r37 instanceof cn8)) {
                                        h.s("Failed to evaluate map entry");
                                        return null;
                                    }
                                    vp82.o(r36.g(), r37);
                                    i += 2;
                                }
                                vp8 = vp82;
                            } else {
                                h.q(hl6.k(arrayList.size(), "CREATE_OBJECT requires an even number of arguments, found "));
                                return null;
                            }
                        }
                    } else if (arrayList.isEmpty()) {
                        return new rl8();
                    } else {
                        rl8 rl84 = new rl8();
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            bq8 r38 = ((k68) no7.y).r(no7, (bq8) it2.next());
                            if (!(r38 instanceof cn8)) {
                                rl84.A(i, r38);
                                i++;
                            } else {
                                h.s("Failed to evaluate array element");
                                return null;
                            }
                        }
                        vp8 = rl84;
                    }
                    return vp8;
                } else {
                    ya5.y("CONST", 2, arrayList);
                    if (arrayList.size() % 2 == 0) {
                        while (i < arrayList.size() - 1) {
                            bq8 r39 = ((k68) no7.y).r(no7, (bq8) arrayList.get(i));
                            if (r39 instanceof mq8) {
                                String str12 = ((mq8) r39).w;
                                no7.o(str12, ((k68) no7.y).r(no7, (bq8) arrayList.get(i + 1)));
                                ((HashMap) no7.A).put(str12, Boolean.TRUE);
                                i += 2;
                            } else {
                                h.q(b81.y("Expected string for const name. got ", r39.getClass().getCanonicalName()));
                                return null;
                            }
                        }
                        return bq8.o;
                    }
                    h.q(hl6.k(arrayList.size(), "CONST requires an even number of arguments, found "));
                    return null;
                }
        }
    }

    public final void b(String str) {
        if (this.a.contains(ya5.B(str))) {
            throw new UnsupportedOperationException("Command not implemented: ".concat(String.valueOf(str)));
        }
        throw new IllegalArgumentException("Command not supported");
    }
}
