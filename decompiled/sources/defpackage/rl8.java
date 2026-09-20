package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: rl8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class rl8 implements Iterable, bq8, qp8 {
    public final TreeMap w;
    public final TreeMap x;

    public rl8(List list) {
        this();
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                A(i, (bq8) list.get(i));
            }
        }
    }

    public final void A(int i, bq8 bq8) {
        if (i > 32468) {
            h.s("Array too large");
        } else if (i >= 0) {
            TreeMap treeMap = this.w;
            if (bq8 == null) {
                treeMap.remove(Integer.valueOf(i));
            } else {
                treeMap.put(Integer.valueOf(i), bq8);
            }
        } else {
            h.l(hl6.p(new StringBuilder(String.valueOf(i).length() + 21), "Out of bounds index: ", i));
        }
    }

    public final boolean B(int i) {
        if (i >= 0) {
            TreeMap treeMap = this.w;
            if (i <= ((Integer) treeMap.lastKey()).intValue()) {
                return treeMap.containsKey(Integer.valueOf(i));
            }
        }
        h.l(hl6.p(new StringBuilder(String.valueOf(i).length() + 21), "Out of bounds index: ", i));
        return false;
    }

    public final void C(int i) {
        TreeMap treeMap = this.w;
        int intValue = ((Integer) treeMap.lastKey()).intValue();
        if (i <= intValue && i >= 0) {
            treeMap.remove(Integer.valueOf(i));
            if (i == intValue) {
                int i2 = i - 1;
                Integer valueOf = Integer.valueOf(i2);
                if (!treeMap.containsKey(valueOf) && i2 >= 0) {
                    treeMap.put(valueOf, bq8.o);
                    return;
                }
                return;
            }
            while (true) {
                i++;
                if (i <= ((Integer) treeMap.lastKey()).intValue()) {
                    Integer valueOf2 = Integer.valueOf(i);
                    bq8 bq8 = (bq8) treeMap.get(valueOf2);
                    if (bq8 != null) {
                        treeMap.put(Integer.valueOf(i - 1), bq8);
                        treeMap.remove(valueOf2);
                    }
                } else {
                    return;
                }
            }
        }
    }

    public final String D(String str) {
        String str2;
        StringBuilder sb = new StringBuilder();
        if (!this.w.isEmpty()) {
            int i = 0;
            while (true) {
                if (str == null) {
                    str2 = "";
                } else {
                    str2 = str;
                }
                if (i >= y()) {
                    break;
                }
                bq8 z = z(i);
                sb.append(str2);
                if (!(z instanceof qq8) && !(z instanceof yp8)) {
                    sb.append(z.g());
                }
                i++;
            }
            sb.delete(0, str2.length());
        }
        return sb.toString();
    }

    public final Iterator d() {
        return new ok8(this, this.w.keySet().iterator(), this.x.keySet().iterator());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof rl8)) {
            return false;
        }
        rl8 rl8 = (rl8) obj;
        if (y() != rl8.y()) {
            return false;
        }
        TreeMap treeMap = this.w;
        if (treeMap.isEmpty()) {
            return rl8.w.isEmpty();
        }
        for (int intValue = ((Integer) treeMap.firstKey()).intValue(); intValue <= ((Integer) treeMap.lastKey()).intValue(); intValue++) {
            if (!z(intValue).equals(rl8.z(intValue))) {
                return false;
            }
        }
        return true;
    }

    public final Boolean f() {
        return Boolean.TRUE;
    }

    public final String g() {
        return D(",");
    }

    public final int hashCode() {
        return this.w.hashCode() * 31;
    }

    public final Iterator iterator() {
        return new hq8(2, this);
    }

    /* JADX WARNING: type inference failed for: r1v91, types: [bq8] */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x02dc, code lost:
        if (defpackage.j45.A(r7, r2, (defpackage.aq8) r0, java.lang.Boolean.FALSE, java.lang.Boolean.TRUE).y() == r7.y()) goto L_0x03b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0344, code lost:
        return r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x03b6, code lost:
        return defpackage.bq8.t;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x03b9, code lost:
        return defpackage.bq8.u;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x05f7, code lost:
        return r32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:359:0x081f, code lost:
        defpackage.h.q("Command not supported");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:406:?, code lost:
        return null;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x028b  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x02a5  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x02e6  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x0345  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x03bf  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x03fa  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x0441  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x045f  */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x0497  */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x052c  */
    /* JADX WARNING: Removed duplicated region for block: B:261:0x05d2  */
    /* JADX WARNING: Removed duplicated region for block: B:272:0x0604  */
    /* JADX WARNING: Removed duplicated region for block: B:319:0x072b  */
    /* JADX WARNING: Removed duplicated region for block: B:323:0x0739  */
    /* JADX WARNING: Removed duplicated region for block: B:337:0x07a0  */
    /* JADX WARNING: Removed duplicated region for block: B:355:0x0807  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01b9  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01f2  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x01fe  */
    /* JADX WARNING: Unknown variable types count: 1 */
    public final bq8 k(String str, no7 no7, ArrayList arrayList) {
        String str2;
        String str3;
        Object obj;
        String str4;
        String str5;
        ArrayList arrayList2;
        String str6;
        rl8 rl8;
        no7 no72;
        int hashCode;
        TreeMap treeMap;
        double d;
        String str7;
        ro8 ro8;
        double d2;
        String str8;
        String str9 = str;
        Object obj2 = "concat";
        String str10 = "unshift";
        String str11 = "toString";
        String str12 = "splice";
        String str13 = "sort";
        if (!"concat".equals(str9) && !"every".equals(str9) && !"filter".equals(str9) && !"forEach".equals(str9) && !"indexOf".equals(str9) && !"join".equals(str9) && !"lastIndexOf".equals(str9) && !"map".equals(str9) && !"pop".equals(str9) && !"push".equals(str9) && !"reduce".equals(str9) && !"reduceRight".equals(str9) && !"reverse".equals(str9) && !"shift".equals(str9) && !"slice".equals(str9) && !"some".equals(str9)) {
            str5 = "filter";
            str6 = str13;
            if (!str6.equals(str9)) {
                obj = "reduce";
                String str14 = str12;
                if (!str14.equals(str9)) {
                    str12 = str14;
                    String str15 = str11;
                    if (!str15.equals(str9)) {
                        str11 = str15;
                        String str16 = str10;
                        if (str16.equals(str9)) {
                            str8 = "lastIndexOf";
                            str4 = "forEach";
                            str2 = str16;
                            rl8 = this;
                            no72 = no7;
                        } else {
                            return qp8.n(this, new mq8(str9), no7, arrayList);
                        }
                    } else {
                        str3 = "lastIndexOf";
                        str11 = str15;
                    }
                } else {
                    str3 = "lastIndexOf";
                    str12 = str14;
                }
            } else {
                str3 = "lastIndexOf";
                obj = "reduce";
            }
            str2 = str10;
            no72 = no7;
            arrayList2 = arrayList;
            str4 = "forEach";
            rl8 = this;
            String str17 = "map";
            Double valueOf = Double.valueOf(-1.0d);
            hashCode = str9.hashCode();
            String str18 = "pop";
            String str19 = ",";
            TreeMap treeMap2 = rl8.w;
            bq8 bq8 = bq8.o;
            String str20 = "join";
            TreeMap treeMap3 = treeMap2;
            double d3 = 0.0d;
            switch (hashCode) {
                case -1776922004:
                    String str21 = str11;
                    if (str9.equals(str21)) {
                        ya5.x(str21, 0, arrayList2);
                        return new mq8(rl8.D(str19));
                    }
                    break;
                case -1354795244:
                    if (str9.equals(obj2)) {
                        rl8 rl82 = (rl8) rl8.v();
                        if (!arrayList2.isEmpty()) {
                            Iterator it = arrayList2.iterator();
                            while (it.hasNext()) {
                                bq8 r = ((k68) no72.y).r(no72, (bq8) it.next());
                                if (!(r instanceof cn8)) {
                                    int y = rl82.y();
                                    if (r instanceof rl8) {
                                        rl8 rl83 = (rl8) r;
                                        Iterator x2 = rl83.x();
                                        while (x2.hasNext()) {
                                            Integer num = (Integer) x2.next();
                                            rl82.A(num.intValue() + y, rl83.z(num.intValue()));
                                        }
                                    } else {
                                        rl82.A(y, r);
                                    }
                                } else {
                                    h.s("Failed evaluation of arguments");
                                    return null;
                                }
                            }
                        }
                        return rl82;
                    }
                    break;
                case -1274492040:
                    String str22 = str5;
                    TreeMap treeMap4 = treeMap3;
                    if (str9.equals(str22)) {
                        ya5.x(str22, 1, arrayList2);
                        bq8 r2 = ((k68) no72.y).r(no72, (bq8) arrayList2.get(0));
                        if (!(r2 instanceof aq8)) {
                            h.q("Callback should be a method");
                            return null;
                        } else if (treeMap4.size() == 0) {
                            return new rl8();
                        } else {
                            rl8 rl84 = (rl8) rl8.v();
                            rl8 A = j45.A(rl8, no72, (aq8) r2, (Boolean) null, Boolean.TRUE);
                            rl8 rl85 = new rl8();
                            Iterator x3 = A.x();
                            while (x3.hasNext()) {
                                rl85.A(rl85.y(), rl84.z(((Integer) x3.next()).intValue()));
                            }
                            return rl85;
                        }
                    }
                    break;
                case -934873754:
                    if (str9.equals(obj)) {
                        return j45.z(rl8, no72, arrayList2, true);
                    }
                    break;
                case -895859076:
                    if (str9.equals(str12)) {
                        if (arrayList2.isEmpty()) {
                            return new rl8();
                        }
                        k68 k68 = (k68) no72.y;
                        k68 k682 = (k68) no72.y;
                        int E = (int) ya5.E(k68.r(no72, (bq8) arrayList2.get(0)).p().doubleValue());
                        if (E < 0) {
                            E = Math.max(0, rl8.y() + E);
                        } else if (E > rl8.y()) {
                            E = rl8.y();
                        }
                        int y2 = rl8.y();
                        rl8 rl86 = new rl8();
                        if (arrayList2.size() > 1) {
                            int max = Math.max(0, (int) ya5.E(k682.r(no72, (bq8) arrayList2.get(1)).p().doubleValue()));
                            if (max > 0) {
                                for (int i = E; i < Math.min(y2, E + max); i++) {
                                    rl86.A(rl86.y(), rl8.z(E));
                                    rl8.C(E);
                                }
                            }
                            int i2 = 2;
                            if (arrayList2.size() > 2) {
                                while (i2 < arrayList2.size()) {
                                    bq8 r3 = k682.r(no72, (bq8) arrayList2.get(i2));
                                    if (!(r3 instanceof cn8)) {
                                        int i3 = (E + i2) - 2;
                                        if (i3 >= 0) {
                                            if (i3 >= rl8.y()) {
                                                rl8.A(i3, r3);
                                                treeMap = treeMap3;
                                            } else {
                                                int intValue = ((Integer) treeMap3.lastKey()).intValue();
                                                while (intValue >= i3) {
                                                    Integer valueOf2 = Integer.valueOf(intValue);
                                                    TreeMap treeMap5 = treeMap3;
                                                    bq8 bq82 = (bq8) treeMap5.get(valueOf2);
                                                    if (bq82 != null) {
                                                        rl8.A(intValue + 1, bq82);
                                                        treeMap5.remove(valueOf2);
                                                    }
                                                    intValue--;
                                                    treeMap3 = treeMap5;
                                                }
                                                treeMap = treeMap3;
                                                rl8.A(i3, r3);
                                            }
                                            i2++;
                                            treeMap3 = treeMap;
                                        } else {
                                            h.q(hl6.p(new StringBuilder(String.valueOf(i3).length() + 21), "Invalid value index: ", i3));
                                            return null;
                                        }
                                    } else {
                                        h.q("Failed to parse elements to add");
                                        return null;
                                    }
                                }
                            }
                        } else {
                            while (E < y2) {
                                rl86.A(rl86.y(), rl8.z(E));
                                rl8.A(E, (bq8) null);
                                E++;
                            }
                        }
                        return rl86;
                    }
                    break;
                case -678635926:
                    String str23 = str4;
                    if (str9.equals(str23)) {
                        ya5.x(str23, 1, arrayList2);
                        bq8 r4 = ((k68) no72.y).r(no72, (bq8) arrayList2.get(0));
                        if (!(r4 instanceof aq8)) {
                            h.q("Callback should be a method");
                            return null;
                        } else if (treeMap3.size() != 0) {
                            j45.A(rl8, no72, (aq8) r4, (Boolean) null, (Boolean) null);
                            return bq8;
                        }
                    }
                    break;
                case -467511597:
                    String str24 = str3;
                    if (str9.equals(str24)) {
                        ya5.z(str24, 2, arrayList2);
                        if (!arrayList2.isEmpty()) {
                            bq8 = ((k68) no72.y).r(no72, (bq8) arrayList2.get(0));
                        }
                        bq8 bq83 = bq8;
                        int y3 = rl8.y() - 1;
                        if (arrayList2.size() > 1) {
                            bq8 r5 = ((k68) no72.y).r(no72, (bq8) arrayList2.get(1));
                            if (Double.isNaN(r5.p().doubleValue())) {
                                d = (double) (rl8.y() - 1);
                            } else {
                                d = ya5.E(r5.p().doubleValue());
                            }
                            if (d < 0.0d) {
                                d += (double) rl8.y();
                            }
                        } else {
                            d = (double) y3;
                        }
                        if (d < 0.0d) {
                            return new wn8(valueOf);
                        }
                        for (int min = (int) Math.min((double) rl8.y(), d); min >= 0; min--) {
                            if (rl8.B(min) && ya5.C(rl8.z(min), bq83)) {
                                return new wn8(Double.valueOf((double) min));
                            }
                        }
                        return new wn8(valueOf);
                    }
                    break;
                case -277637751:
                    if (str9.equals(str2)) {
                        if (!arrayList2.isEmpty()) {
                            rl8 rl87 = new rl8();
                            Iterator it2 = arrayList2.iterator();
                            while (it2.hasNext()) {
                                bq8 r6 = ((k68) no72.y).r(no72, (bq8) it2.next());
                                if (!(r6 instanceof cn8)) {
                                    rl87.A(rl87.y(), r6);
                                } else {
                                    h.s("Argument evaluation failed");
                                    return null;
                                }
                            }
                            int y4 = rl87.y();
                            Iterator x4 = rl8.x();
                            while (x4.hasNext()) {
                                Integer num2 = (Integer) x4.next();
                                rl87.A(num2.intValue() + y4, rl8.z(num2.intValue()));
                            }
                            treeMap3.clear();
                            Iterator x5 = rl87.x();
                            while (x5.hasNext()) {
                                Integer num3 = (Integer) x5.next();
                                rl8.A(num3.intValue(), rl87.z(num3.intValue()));
                            }
                        }
                        return new wn8(Double.valueOf((double) rl8.y()));
                    }
                    break;
                case 107868:
                    String str25 = str17;
                    if (str9.equals(str25)) {
                        ya5.x(str25, 1, arrayList2);
                        bq8 r7 = ((k68) no72.y).r(no72, (bq8) arrayList2.get(0));
                        if (!(r7 instanceof aq8)) {
                            h.q("Callback should be a method");
                            return null;
                        } else if (rl8.y() == 0) {
                            return new rl8();
                        } else {
                            return j45.A(rl8, no72, (aq8) r7, (Boolean) null, (Boolean) null);
                        }
                    }
                    break;
                case 111185:
                    String str26 = str18;
                    if (str9.equals(str26)) {
                        ya5.x(str26, 0, arrayList2);
                        int y5 = rl8.y();
                        if (y5 != 0) {
                            int i4 = y5 - 1;
                            bq8 z = rl8.z(i4);
                            rl8.C(i4);
                            return z;
                        }
                    }
                    break;
                case 3267882:
                    String str27 = str20;
                    if (str9.equals(str27)) {
                        ya5.z(str27, 1, arrayList2);
                        if (rl8.y() == 0) {
                            return bq8.v;
                        }
                        if (!arrayList2.isEmpty()) {
                            bq8 r8 = ((k68) no72.y).r(no72, (bq8) arrayList2.get(0));
                            if ((r8 instanceof yp8) || (r8 instanceof qq8)) {
                                str7 = "";
                            } else {
                                str7 = r8.g();
                            }
                        } else {
                            str7 = str19;
                        }
                        return new mq8(rl8.D(str7));
                    }
                    break;
                case 3452698:
                    if (str9.equals("push")) {
                        if (!arrayList2.isEmpty()) {
                            Iterator it3 = arrayList2.iterator();
                            while (it3.hasNext()) {
                                rl8.A(rl8.y(), ((k68) no72.y).r(no72, (bq8) it3.next()));
                            }
                        }
                        return new wn8(Double.valueOf((double) rl8.y()));
                    }
                    break;
                case 3536116:
                    if (str9.equals("some")) {
                        ya5.x("some", 1, arrayList2);
                        bq8 r9 = ((k68) no72.y).r(no72, (bq8) arrayList2.get(0));
                        if (r9 instanceof ro8) {
                            if (rl8.y() != 0) {
                                ro8 ro82 = (ro8) r9;
                                Iterator x6 = rl8.x();
                                while (x6.hasNext()) {
                                    int intValue2 = ((Integer) x6.next()).intValue();
                                    if (rl8.B(intValue2)) {
                                        if (ro82.a(no72, Arrays.asList(new bq8[]{rl8.z(intValue2), new wn8(Double.valueOf((double) intValue2)), rl8})).f().booleanValue()) {
                                            break;
                                        }
                                    }
                                }
                                break;
                            }
                        } else {
                            h.q("Callback should be a method");
                            return null;
                        }
                    }
                    break;
                case 3536286:
                    if (str9.equals(str6)) {
                        ya5.z(str6, 1, arrayList2);
                        if (rl8.y() >= 2) {
                            List w2 = rl8.w();
                            if (!arrayList2.isEmpty()) {
                                ? r10 = ((k68) no72.y).r(no72, (bq8) arrayList2.get(0));
                                if (r10 instanceof ro8) {
                                    ro8 = r10;
                                } else {
                                    h.q("Comparator should be a method");
                                    return null;
                                }
                            } else {
                                ro8 = null;
                            }
                            Collections.sort(w2, new ho5(ro8, no72));
                            treeMap3.clear();
                            Iterator it4 = ((ArrayList) w2).iterator();
                            int i5 = 0;
                            while (it4.hasNext()) {
                                rl8.A(i5, (bq8) it4.next());
                                i5++;
                            }
                            break;
                        }
                    }
                    break;
                case 96891675:
                    if (str9.equals("every")) {
                        ya5.x("every", 1, arrayList2);
                        bq8 r11 = ((k68) no72.y).r(no72, (bq8) arrayList2.get(0));
                        if (r11 instanceof aq8) {
                            if (rl8.y() != 0) {
                                break;
                            }
                        } else {
                            h.q("Callback should be a method");
                            return null;
                        }
                    }
                    break;
                case 109407362:
                    if (str9.equals("shift")) {
                        ya5.x("shift", 0, arrayList2);
                        if (rl8.y() != 0) {
                            bq8 z2 = rl8.z(0);
                            rl8.C(0);
                            return z2;
                        }
                    }
                    break;
                case 109526418:
                    if (str9.equals("slice")) {
                        ya5.z("slice", 2, arrayList2);
                        if (arrayList2.isEmpty()) {
                            return rl8.v();
                        }
                        double y6 = (double) rl8.y();
                        double E2 = ya5.E(((k68) no72.y).r(no72, (bq8) arrayList2.get(0)).p().doubleValue());
                        if (E2 < 0.0d) {
                            d2 = Math.max(E2 + y6, 0.0d);
                        } else {
                            d2 = Math.min(E2, y6);
                        }
                        if (arrayList2.size() == 2) {
                            double E3 = ya5.E(((k68) no72.y).r(no72, (bq8) arrayList2.get(1)).p().doubleValue());
                            if (E3 < 0.0d) {
                                y6 = Math.max(y6 + E3, 0.0d);
                            } else {
                                y6 = Math.min(y6, E3);
                            }
                        }
                        rl8 rl88 = new rl8();
                        for (int i6 = (int) d2; ((double) i6) < y6; i6++) {
                            rl88.A(rl88.y(), rl8.z(i6));
                        }
                        return rl88;
                    }
                    break;
                case 965561430:
                    if (str9.equals("reduceRight")) {
                        return j45.z(rl8, no72, arrayList2, false);
                    }
                    break;
                case 1099846370:
                    if (str9.equals("reverse")) {
                        ya5.x("reverse", 0, arrayList2);
                        int y7 = rl8.y();
                        if (y7 != 0) {
                            for (int i7 = 0; i7 < y7 / 2; i7++) {
                                if (rl8.B(i7)) {
                                    bq8 z3 = rl8.z(i7);
                                    rl8.A(i7, (bq8) null);
                                    int i8 = (y7 - 1) - i7;
                                    if (rl8.B(i8)) {
                                        rl8.A(i7, rl8.z(i8));
                                    }
                                    rl8.A(i8, z3);
                                }
                            }
                            break;
                        }
                    }
                    break;
                case 1943291465:
                    if (str9.equals("indexOf")) {
                        ya5.z("indexOf", 2, arrayList2);
                        if (!arrayList2.isEmpty()) {
                            bq8 = ((k68) no72.y).r(no72, (bq8) arrayList2.get(0));
                        }
                        bq8 bq84 = bq8;
                        if (arrayList2.size() > 1) {
                            double E4 = ya5.E(((k68) no72.y).r(no72, (bq8) arrayList2.get(1)).p().doubleValue());
                            if (E4 >= ((double) rl8.y())) {
                                return new wn8(valueOf);
                            }
                            if (E4 < 0.0d) {
                                d3 = ((double) rl8.y()) + E4;
                            } else {
                                d3 = E4;
                            }
                        }
                        Iterator x7 = rl8.x();
                        while (x7.hasNext()) {
                            int intValue3 = ((Integer) x7.next()).intValue();
                            double d4 = (double) intValue3;
                            if (d4 >= d3 && ya5.C(rl8.z(intValue3), bq84)) {
                                return new wn8(Double.valueOf(d4));
                            }
                        }
                        return new wn8(valueOf);
                    }
                    break;
            }
        } else {
            str8 = "lastIndexOf";
            str5 = "filter";
            str2 = str10;
            str6 = str13;
            no72 = no7;
            str4 = "forEach";
            obj = "reduce";
            rl8 = this;
        }
        arrayList2 = arrayList;
        String str172 = "map";
        Double valueOf3 = Double.valueOf(-1.0d);
        hashCode = str9.hashCode();
        String str182 = "pop";
        String str192 = ",";
        TreeMap treeMap22 = rl8.w;
        bq8 bq85 = bq8.o;
        String str202 = "join";
        TreeMap treeMap32 = treeMap22;
        double d32 = 0.0d;
        switch (hashCode) {
            case -1776922004:
                break;
            case -1354795244:
                break;
            case -1274492040:
                break;
            case -934873754:
                break;
            case -895859076:
                break;
            case -678635926:
                break;
            case -467511597:
                break;
            case -277637751:
                break;
            case 107868:
                break;
            case 111185:
                break;
            case 3267882:
                break;
            case 3452698:
                break;
            case 3536116:
                break;
            case 3536286:
                break;
            case 96891675:
                break;
            case 109407362:
                break;
            case 109526418:
                break;
            case 965561430:
                break;
            case 1099846370:
                break;
            case 1943291465:
                break;
        }
    }

    public final bq8 l(String str) {
        bq8 bq8;
        if ("length".equals(str)) {
            return new wn8(Double.valueOf((double) y()));
        }
        if (!s(str) || (bq8 = (bq8) this.x.get(str)) == null) {
            return bq8.o;
        }
        return bq8;
    }

    public final void o(String str, bq8 bq8) {
        TreeMap treeMap = this.x;
        if (bq8 == null) {
            treeMap.remove(str);
        } else {
            treeMap.put(str, bq8);
        }
    }

    public final Double p() {
        TreeMap treeMap = this.w;
        if (treeMap.size() == 1) {
            return z(0).p();
        }
        if (treeMap.size() <= 0) {
            return Double.valueOf(0.0d);
        }
        return Double.valueOf(Double.NaN);
    }

    public final boolean s(String str) {
        if ("length".equals(str) || this.x.containsKey(str)) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return D(",");
    }

    public final bq8 v() {
        rl8 rl8 = new rl8();
        for (Map.Entry entry : this.w.entrySet()) {
            boolean z = entry.getValue() instanceof qp8;
            TreeMap treeMap = rl8.w;
            if (z) {
                treeMap.put((Integer) entry.getKey(), (bq8) entry.getValue());
            } else {
                treeMap.put((Integer) entry.getKey(), ((bq8) entry.getValue()).v());
            }
        }
        return rl8;
    }

    public final List w() {
        ArrayList arrayList = new ArrayList(y());
        for (int i = 0; i < y(); i++) {
            arrayList.add(z(i));
        }
        return arrayList;
    }

    public final Iterator x() {
        return this.w.keySet().iterator();
    }

    public final int y() {
        TreeMap treeMap = this.w;
        if (treeMap.isEmpty()) {
            return 0;
        }
        return ((Integer) treeMap.lastKey()).intValue() + 1;
    }

    public final bq8 z(int i) {
        bq8 bq8;
        if (i >= y()) {
            h.l("Attempting to get element outside of current array");
            return null;
        } else if (!B(i) || (bq8 = (bq8) this.w.get(Integer.valueOf(i))) == null) {
            return bq8.o;
        } else {
            return bq8;
        }
    }

    public rl8() {
        this.w = new TreeMap();
        this.x = new TreeMap();
    }
}
