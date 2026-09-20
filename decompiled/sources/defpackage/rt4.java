package defpackage;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* renamed from: rt4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class rt4 {
    public final String a;
    public final int b;
    public Object c;
    public Serializable d;
    public Serializable e;
    public Serializable f;

    public rt4(nx4 nx4, gq3 gq3, Map map) {
        int i;
        map.getClass();
        if (gq3 != null) {
            i = b35.m(i95.D(gq3));
        } else {
            i = -1;
        }
        String str = null;
        if (gq3 != null) {
            zr3 D = i95.D(gq3);
            if (D instanceof zk5) {
                StringBuilder sb = new StringBuilder("Cannot generate route pattern from polymorphic class ");
                gq3 u = rg3.u(((zk5) D).getDescriptor());
                throw new IllegalArgumentException(f21.l(sb, u != null ? u.A() : str, ". Routes can only be generated from concrete classes or objects."));
            }
            am6 am6 = new am6(D);
            xa7 xa7 = new xa7(14, (Object) am6);
            int e2 = D.getDescriptor().e();
            int i2 = 0;
            while (i2 < e2) {
                String f2 = D.getDescriptor().f(i2);
                bv4 g = b35.g(D.getDescriptor().h(i2), map);
                if (g != null) {
                    xa7.u(Integer.valueOf(i2), f2, g);
                    i2++;
                } else {
                    h.q(b35.z(f2, D.getDescriptor().h(i2).a(), D.getDescriptor().a(), map.toString()));
                    throw null;
                }
            }
            str = ((String) am6.x) + ((String) am6.z) + ((String) am6.A);
        }
        this.c = nx4;
        this.b = i;
        this.a = str;
        this.d = new LinkedHashMap();
        this.f = new ArrayList();
        this.e = new LinkedHashMap();
        if (gq3 != null) {
            Iterator it = b35.n(i95.D(gq3), map).iterator();
            while (it.hasNext()) {
                zq4 zq4 = (zq4) it.next();
                ((LinkedHashMap) this.d).put(zq4.a, zq4.b);
            }
        }
    }

    public static Boolean f(Boolean bool, boolean z) {
        boolean z2;
        if (bool == null) {
            return null;
        }
        if (bool.booleanValue() != z) {
            z2 = true;
        } else {
            z2 = false;
        }
        return Boolean.valueOf(z2);
    }

    public static Boolean g(String str, xx8 xx8, pz8 pz8) {
        String str2;
        List<String> list;
        String str3;
        int i;
        z65.k(xx8);
        if (str != null && xx8.t() && xx8.B() != 1 && (xx8.B() != 7 ? xx8.u() : xx8.z() != 0)) {
            int B = xx8.B();
            boolean x = xx8.x();
            if (x || B == 2 || B == 7) {
                str2 = xx8.v();
            } else {
                str2 = xx8.v().toUpperCase(Locale.ENGLISH);
            }
            if (xx8.z() == 0) {
                list = null;
            } else {
                list = xx8.y();
                if (!x) {
                    ArrayList arrayList = new ArrayList(list.size());
                    for (String upperCase : list) {
                        arrayList.add(upperCase.toUpperCase(Locale.ENGLISH));
                    }
                    list = Collections.unmodifiableList(arrayList);
                }
            }
            if (B == 2) {
                str3 = str2;
            } else {
                str3 = null;
            }
            if (B != 7 ? str2 != null : list != null && !list.isEmpty()) {
                if (!x && B != 2) {
                    str = str.toUpperCase(Locale.ENGLISH);
                }
                switch (B - 1) {
                    case 1:
                        if (str3 != null) {
                            if (true != x) {
                                i = 66;
                            } else {
                                i = 0;
                            }
                            try {
                                return Boolean.valueOf(Pattern.compile(str3, i).matcher(str).matches());
                            } catch (PatternSyntaxException unused) {
                                if (pz8 != null) {
                                    pz8.E.b("Invalid regular expression in REGEXP audience filter. expression", str3);
                                    break;
                                }
                            }
                        }
                        break;
                    case 2:
                        return Boolean.valueOf(str.startsWith(str2));
                    case 3:
                        return Boolean.valueOf(str.endsWith(str2));
                    case 4:
                        return Boolean.valueOf(str.contains(str2));
                    case 5:
                        return Boolean.valueOf(str.equals(str2));
                    case 6:
                        if (list != null) {
                            return Boolean.valueOf(list.contains(str));
                        }
                        break;
                }
            }
        }
        return null;
    }

    public static Boolean h(BigDecimal bigDecimal, ux8 ux8, double d2) {
        BigDecimal bigDecimal2;
        BigDecimal bigDecimal3;
        BigDecimal bigDecimal4;
        z65.k(ux8);
        if (ux8.t()) {
            boolean z = true;
            if (ux8.D() != 1 && (ux8.D() != 5 ? ux8.w() : ux8.y() && ux8.A())) {
                int D = ux8.D();
                if (ux8.D() == 5) {
                    if (y89.G1(ux8.z()) && y89.G1(ux8.B())) {
                        try {
                            BigDecimal bigDecimal5 = new BigDecimal(ux8.z());
                            bigDecimal3 = new BigDecimal(ux8.B());
                            bigDecimal2 = bigDecimal5;
                            bigDecimal4 = null;
                        } catch (NumberFormatException unused) {
                        }
                    }
                } else if (y89.G1(ux8.x())) {
                    bigDecimal4 = new BigDecimal(ux8.x());
                    bigDecimal2 = null;
                    bigDecimal3 = null;
                }
                if (D != 5 ? bigDecimal4 != null : bigDecimal2 != null) {
                    int i = D - 1;
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                if (i == 4 && bigDecimal2 != null) {
                                    if (bigDecimal.compareTo(bigDecimal2) < 0 || bigDecimal.compareTo(bigDecimal3) > 0) {
                                        z = false;
                                    }
                                    return Boolean.valueOf(z);
                                }
                            } else if (bigDecimal4 != null) {
                                if (d2 != 0.0d) {
                                    if (bigDecimal.compareTo(bigDecimal4.subtract(new BigDecimal(d2).multiply(new BigDecimal(2)))) <= 0 || bigDecimal.compareTo(bigDecimal4.add(new BigDecimal(d2).multiply(new BigDecimal(2)))) >= 0) {
                                        z = false;
                                    }
                                    return Boolean.valueOf(z);
                                }
                                if (bigDecimal.compareTo(bigDecimal4) != 0) {
                                    z = false;
                                }
                                return Boolean.valueOf(z);
                            }
                        } else if (bigDecimal4 != null) {
                            if (bigDecimal.compareTo(bigDecimal4) <= 0) {
                                z = false;
                            }
                            return Boolean.valueOf(z);
                        }
                    } else if (bigDecimal4 != null) {
                        if (bigDecimal.compareTo(bigDecimal4) >= 0) {
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    }
                }
            }
        }
        return null;
    }

    public qt4 a() {
        qt4 b2 = b();
        b2.getClass();
        ao aoVar = b2.x;
        for (Map.Entry entry : ((LinkedHashMap) this.d).entrySet()) {
            String str = (String) entry.getKey();
            xs4 xs4 = (xs4) entry.getValue();
            str.getClass();
            xs4.getClass();
            aoVar.getClass();
            ((LinkedHashMap) aoVar.d).put(str, xs4);
        }
        Iterator it = ((ArrayList) this.f).iterator();
        while (it.hasNext()) {
            nt4 nt4 = (nt4) it.next();
            nt4.getClass();
            aoVar.getClass();
            ArrayList a0 = gl0.a0((LinkedHashMap) aoVar.d, new st4(nt4, 0));
            if (a0.isEmpty()) {
                ((ArrayList) aoVar.c).add(nt4);
            } else {
                String str2 = nt4.a;
                throw new IllegalArgumentException(("Deep link " + str2 + " can't be used to open destination " + ((qt4) aoVar.b) + ".\nFollowing required arguments are missing: " + a0).toString());
            }
        }
        Iterator it2 = ((LinkedHashMap) this.e).entrySet().iterator();
        if (!it2.hasNext()) {
            String str3 = this.a;
            if (str3 != null) {
                aoVar.getClass();
                if (!d57.I0(str3)) {
                    String concat = "android-app://androidx.navigation/".concat(str3);
                    ArrayList a02 = gl0.a0((LinkedHashMap) aoVar.d, new st4(new nt4(concat), 1));
                    if (a02.isEmpty()) {
                        aoVar.f = new z97(new zh(29, (Object) concat));
                        aoVar.a = concat.hashCode();
                        aoVar.e = str3;
                    } else {
                        StringBuilder q = b81.q("Cannot set route \"", str3, "\" for destination ");
                        q.append((qt4) aoVar.b);
                        q.append(". Following required arguments are missing: ");
                        q.append(a02);
                        throw new IllegalArgumentException(q.toString().toString());
                    }
                } else {
                    h.q("Cannot have an empty route");
                    return null;
                }
            }
            int i = this.b;
            if (i != -1) {
                aoVar.a = i;
            }
            return b2;
        }
        Map.Entry entry2 = (Map.Entry) it2.next();
        ((Number) entry2.getKey()).intValue();
        entry2.getValue().getClass();
        ku4.a();
        return null;
    }

    public qt4 b() {
        return ((nx4) this.c).a();
    }

    public abstract int c();

    public abstract boolean d();

    public abstract boolean e();

    public rt4(String str, int i) {
        this.a = str;
        this.b = i;
    }
}
