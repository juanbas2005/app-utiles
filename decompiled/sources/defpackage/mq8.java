package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: mq8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class mq8 implements Iterable, bq8 {
    public final String w;

    public mq8(String str) {
        if (str != null) {
            this.w = str;
        } else {
            h.q("StringValue cannot be null.");
            throw null;
        }
    }

    public final Iterator d() {
        return new hq8(0, this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mq8)) {
            return false;
        }
        return this.w.equals(((mq8) obj).w);
    }

    public final Boolean f() {
        return Boolean.valueOf(!this.w.isEmpty());
    }

    public final String g() {
        return this.w;
    }

    public final int hashCode() {
        return this.w.hashCode();
    }

    public final Iterator iterator() {
        return new hq8(1, this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:193:0x053f, code lost:
        return r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x05fa, code lost:
        defpackage.h.q("Command not supported");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x05ff, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x02e2, code lost:
        if (r4[r1].isEmpty() == false) goto L_0x02e4;
     */
    public final bq8 k(String str, no7 no7, ArrayList arrayList) {
        String str2;
        String str3;
        int i;
        double d;
        double d2;
        String str4;
        double d3;
        double d4;
        double d5;
        double d6;
        long j;
        int i2;
        int i3;
        int i4;
        no7 no72;
        double d7;
        String str5 = str;
        String str6 = "charAt";
        String str7 = "trim";
        if ("charAt".equals(str5) || "concat".equals(str5) || "hasOwnProperty".equals(str5) || "indexOf".equals(str5) || "lastIndexOf".equals(str5) || "match".equals(str5) || "replace".equals(str5) || "search".equals(str5) || "slice".equals(str5) || "split".equals(str5) || "substring".equals(str5) || "toLowerCase".equals(str5) || "toLocaleLowerCase".equals(str5) || "toString".equals(str5) || "toUpperCase".equals(str5) || "toLocaleUpperCase".equals(str5)) {
            str2 = "hasOwnProperty";
            str3 = str7;
        } else {
            str2 = "hasOwnProperty";
            str3 = str7;
            if (!str3.equals(str5)) {
                h.q(str5.concat(" is not a String function"));
                return null;
            }
        }
        int hashCode = str5.hashCode();
        String str8 = "undefined";
        String str9 = "toString";
        String str10 = "toLocaleLowerCase";
        String str11 = this.w;
        Object obj = "concat";
        int i5 = 0;
        switch (hashCode) {
            case -1789698943:
                no7 no73 = no7;
                ArrayList arrayList2 = arrayList;
                String str12 = str2;
                if (str5.equals(str12)) {
                    ya5.x(str12, 1, arrayList2);
                    bq8 r = ((k68) no73.y).r(no73, (bq8) arrayList2.get(0));
                    boolean equals = "length".equals(r.g());
                    km8 km8 = bq8.t;
                    if (equals) {
                        return km8;
                    }
                    double doubleValue = r.p().doubleValue();
                    if (doubleValue != Math.floor(doubleValue) || (i = (int) doubleValue) < 0 || i >= str11.length()) {
                        return bq8.u;
                    }
                    return km8;
                }
                break;
            case -1776922004:
                ArrayList arrayList3 = arrayList;
                String str13 = str9;
                if (str5.equals(str13)) {
                    ya5.x(str13, 0, arrayList3);
                    return this;
                }
                break;
            case -1464939364:
                ArrayList arrayList4 = arrayList;
                String str14 = str10;
                if (str5.equals(str14)) {
                    ya5.x(str14, 0, arrayList4);
                    return new mq8(str11.toLowerCase());
                }
                break;
            case -1361633751:
                no7 no74 = no7;
                ArrayList arrayList5 = arrayList;
                String str15 = str6;
                if (str5.equals(str15)) {
                    ya5.z(str15, 1, arrayList5);
                    if (!arrayList5.isEmpty()) {
                        i5 = (int) ya5.E(((k68) no74.y).r(no74, (bq8) arrayList5.get(0)).p().doubleValue());
                    }
                    if (i5 < 0 || i5 >= str11.length()) {
                        return bq8.v;
                    }
                    return new mq8(String.valueOf(str11.charAt(i5)));
                }
                break;
            case -1354795244:
                no7 no75 = no7;
                ArrayList arrayList6 = arrayList;
                if (str5.equals(obj)) {
                    if (!arrayList6.isEmpty()) {
                        StringBuilder sb = new StringBuilder(str11);
                        while (i5 < arrayList6.size()) {
                            sb.append(((k68) no75.y).r(no75, (bq8) arrayList6.get(i5)).g());
                            i5++;
                        }
                        return new mq8(sb.toString());
                    }
                }
                break;
            case -1137582698:
                ArrayList arrayList7 = arrayList;
                if (str5.equals("toLowerCase")) {
                    ya5.x("toLowerCase", 0, arrayList7);
                    return new mq8(str11.toLowerCase(Locale.ENGLISH));
                }
                break;
            case -906336856:
                no7 no76 = no7;
                ArrayList arrayList8 = arrayList;
                if (str5.equals("search")) {
                    ya5.z("search", 1, arrayList8);
                    if (!arrayList8.isEmpty()) {
                        str8 = ((k68) no76.y).r(no76, (bq8) arrayList8.get(0)).g();
                    }
                    Matcher matcher = Pattern.compile(str8).matcher(str11);
                    if (matcher.find()) {
                        return new wn8(Double.valueOf((double) matcher.start()));
                    }
                    return new wn8(Double.valueOf(-1.0d));
                }
                break;
            case -726908483:
                ArrayList arrayList9 = arrayList;
                if (str5.equals("toLocaleUpperCase")) {
                    ya5.x("toLocaleUpperCase", 0, arrayList9);
                    return new mq8(str11.toUpperCase());
                }
                break;
            case -467511597:
                no7 no77 = no7;
                ArrayList arrayList10 = arrayList;
                if (str5.equals("lastIndexOf")) {
                    ya5.z("lastIndexOf", 2, arrayList10);
                    if (arrayList10.size() > 0) {
                        str8 = ((k68) no77.y).r(no77, (bq8) arrayList10.get(0)).g();
                    }
                    String str16 = str8;
                    if (arrayList10.size() < 2) {
                        d = Double.NaN;
                    } else {
                        d = ((k68) no77.y).r(no77, (bq8) arrayList10.get(1)).p().doubleValue();
                    }
                    if (Double.isNaN(d)) {
                        d2 = Double.POSITIVE_INFINITY;
                    } else {
                        d2 = ya5.E(d);
                    }
                    return new wn8(Double.valueOf((double) str11.lastIndexOf(str16, (int) d2)));
                }
                break;
            case -399551817:
                ArrayList arrayList11 = arrayList;
                if (str5.equals("toUpperCase")) {
                    ya5.x("toUpperCase", 0, arrayList11);
                    return new mq8(str11.toUpperCase(Locale.ENGLISH));
                }
                break;
            case 3568674:
                ArrayList arrayList12 = arrayList;
                if (str5.equals(str3)) {
                    ya5.x("toUpperCase", 0, arrayList12);
                    return new mq8(str11.trim());
                }
                break;
            case 103668165:
                no7 no78 = no7;
                ArrayList arrayList13 = arrayList;
                if (str5.equals("match")) {
                    ya5.z("match", 1, arrayList13);
                    if (arrayList13.size() <= 0) {
                        str4 = "";
                    } else {
                        str4 = ((k68) no78.y).r(no78, (bq8) arrayList13.get(0)).g();
                    }
                    Matcher matcher2 = Pattern.compile(str4).matcher(str11);
                    if (!matcher2.find()) {
                        return bq8.p;
                    }
                    return new rl8(Arrays.asList(new bq8[]{new mq8(matcher2.group())}));
                }
                break;
            case 109526418:
                no7 no79 = no7;
                ArrayList arrayList14 = arrayList;
                if (str5.equals("slice")) {
                    ya5.z("slice", 2, arrayList14);
                    if (!arrayList14.isEmpty()) {
                        d3 = ((k68) no79.y).r(no79, (bq8) arrayList14.get(0)).p().doubleValue();
                    } else {
                        d3 = 0.0d;
                    }
                    double E = ya5.E(d3);
                    if (E < 0.0d) {
                        d4 = Math.max(((double) str11.length()) + E, 0.0d);
                    } else {
                        d4 = Math.min(E, (double) str11.length());
                    }
                    if (arrayList14.size() > 1) {
                        d5 = ((k68) no79.y).r(no79, (bq8) arrayList14.get(1)).p().doubleValue();
                    } else {
                        d5 = (double) str11.length();
                    }
                    double E2 = ya5.E(d5);
                    if (E2 < 0.0d) {
                        d6 = Math.max(((double) str11.length()) + E2, 0.0d);
                    } else {
                        d6 = Math.min(E2, (double) str11.length());
                    }
                    int i6 = (int) d4;
                    return new mq8(str11.substring(i6, Math.max(0, ((int) d6) - i6) + i6));
                }
                break;
            case 109648666:
                no7 no710 = no7;
                ArrayList arrayList15 = arrayList;
                if (str5.equals("split")) {
                    ya5.z("split", 2, arrayList15);
                    if (str11.length() == 0) {
                        return new rl8(Arrays.asList(new bq8[]{this}));
                    }
                    ArrayList arrayList16 = new ArrayList();
                    if (arrayList15.isEmpty()) {
                        arrayList16.add(this);
                    } else {
                        String g = ((k68) no710.y).r(no710, (bq8) arrayList15.get(0)).g();
                        if (arrayList15.size() > 1) {
                            j = ((long) ya5.D(((k68) no710.y).r(no710, (bq8) arrayList15.get(1)).p().doubleValue())) & 4294967295L;
                        } else {
                            j = 2147483647L;
                        }
                        if (j == 0) {
                            return new rl8();
                        }
                        String[] split = str11.split(Pattern.quote(g), ((int) j) + 1);
                        int length = split.length;
                        if (g.isEmpty() && length > 0) {
                            i5 = split[0].isEmpty();
                            i2 = length - 1;
                            break;
                        }
                        i2 = length;
                        if (((long) length) > j) {
                            i2--;
                        }
                        while (i5 < i2) {
                            arrayList16.add(new mq8(split[i5]));
                            i5++;
                        }
                    }
                    return new rl8(arrayList16);
                }
                break;
            case 530542161:
                no7 no711 = no7;
                ArrayList arrayList17 = arrayList;
                if (str5.equals("substring")) {
                    ya5.z("substring", 2, arrayList17);
                    if (!arrayList17.isEmpty()) {
                        i3 = (int) ya5.E(((k68) no711.y).r(no711, (bq8) arrayList17.get(0)).p().doubleValue());
                    } else {
                        i3 = 0;
                    }
                    if (arrayList17.size() > 1) {
                        i4 = (int) ya5.E(((k68) no711.y).r(no711, (bq8) arrayList17.get(1)).p().doubleValue());
                    } else {
                        i4 = str11.length();
                    }
                    int min = Math.min(Math.max(i3, 0), str11.length());
                    int min2 = Math.min(Math.max(i4, 0), str11.length());
                    return new mq8(str11.substring(Math.min(min, min2), Math.max(min, min2)));
                }
                break;
            case 1094496948:
                no7 no712 = no7;
                ArrayList arrayList18 = arrayList;
                if (str5.equals("replace")) {
                    ya5.z("replace", 2, arrayList18);
                    boolean isEmpty = arrayList18.isEmpty();
                    bq8 bq8 = bq8.o;
                    if (!isEmpty) {
                        str8 = ((k68) no712.y).r(no712, (bq8) arrayList18.get(0)).g();
                        if (arrayList18.size() > 1) {
                            bq8 = ((k68) no712.y).r(no712, (bq8) arrayList18.get(1));
                        }
                    }
                    String str17 = str8;
                    int indexOf = str11.indexOf(str17);
                    if (indexOf >= 0) {
                        if (bq8 instanceof ro8) {
                            bq8 = ((ro8) bq8).a(no712, Arrays.asList(new bq8[]{new mq8(str17), new wn8(Double.valueOf((double) indexOf)), this}));
                        }
                        String substring = str11.substring(0, indexOf);
                        String g2 = bq8.g();
                        String substring2 = str11.substring(str17.length() + indexOf);
                        return new mq8(f21.m(new StringBuilder(substring.length() + String.valueOf(g2).length() + substring2.length()), substring, g2, substring2));
                    }
                }
                break;
            case 1943291465:
                if (str5.equals("indexOf")) {
                    ArrayList arrayList19 = arrayList;
                    ya5.z("indexOf", 2, arrayList19);
                    if (arrayList19.size() <= 0) {
                        no72 = no7;
                    } else {
                        no72 = no7;
                        str8 = ((k68) no72.y).r(no72, (bq8) arrayList19.get(0)).g();
                    }
                    String str18 = str8;
                    if (arrayList19.size() < 2) {
                        d7 = 0.0d;
                    } else {
                        d7 = ((k68) no72.y).r(no72, (bq8) arrayList19.get(1)).p().doubleValue();
                    }
                    return new wn8(Double.valueOf((double) str11.indexOf(str18, (int) ya5.E(d7))));
                }
                break;
        }
    }

    public final Double p() {
        String str = this.w;
        if (str.isEmpty()) {
            return Double.valueOf(0.0d);
        }
        try {
            return Double.valueOf(str);
        } catch (NumberFormatException unused) {
            return Double.valueOf(Double.NaN);
        }
    }

    public final String toString() {
        String str = this.w;
        return f21.m(new StringBuilder(str.length() + 2), "\"", str, "\"");
    }

    public final bq8 v() {
        return new mq8(this.w);
    }
}
