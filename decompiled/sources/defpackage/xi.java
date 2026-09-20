package defpackage;

import java.util.List;

/* renamed from: xi  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class xi implements vr2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ aq4 x;

    public /* synthetic */ xi(aq4 aq4, int i) {
        this.w = i;
        this.x = aq4;
    }

    public final Object y(Object obj) {
        vl vlVar;
        int i = this.w;
        int i2 = 0;
        vs7 vs7 = vs7.a;
        aq4 aq4 = this.x;
        switch (i) {
            case b85.b:
                aq4.setValue((dy3) obj);
                return vs7;
            case 1:
                String str = (String) obj;
                str.getClass();
                aq4.setValue(str);
                return vs7;
            case 2:
                aq4.setValue((dy3) obj);
                return vs7;
            case 3:
                mc7 mc7 = (mc7) obj;
                if (mc7.c) {
                    vlVar = mc7.b;
                } else {
                    vlVar = mc7.a;
                }
                aq4.setValue(vlVar);
                return vs7;
            case 4:
                List list = (List) obj;
                if (aq4 != null) {
                    aq4.setValue(list);
                }
                return vs7;
            case 5:
                ok6 ok6 = (ok6) obj;
                if (!d57.I0((CharSequence) aq4.getValue())) {
                    yr3[] yr3Arr = mk6.a;
                    ok6.f(jk6.M, (String) aq4.getValue());
                }
                return vs7;
            case 6:
                String str2 = (String) obj;
                str2.getClass();
                aq4.setValue(d57.i1(50, str2));
                return vs7;
            case 7:
                String str3 = (String) obj;
                str3.getClass();
                aq4.setValue(d57.i1(200, str3));
                return vs7;
            case 8:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                aq4.setValue(bool);
                return vs7;
            case 9:
                String str4 = (String) obj;
                str4.getClass();
                aq4.setValue(d57.i1(200, str4));
                return vs7;
            case 10:
                String str5 = (String) obj;
                str5.getClass();
                StringBuilder sb = new StringBuilder();
                int length = str5.length();
                while (i2 < length) {
                    char charAt = str5.charAt(i2);
                    if (Character.isDigit(charAt)) {
                        sb.append(charAt);
                    }
                    i2++;
                }
                aq4.setValue(d57.i1(4, sb.toString()));
                return vs7;
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER:
                String str6 = (String) obj;
                str6.getClass();
                StringBuilder sb2 = new StringBuilder();
                int length2 = str6.length();
                while (i2 < length2) {
                    char charAt2 = str6.charAt(i2);
                    if (Character.isDigit(charAt2) || charAt2 == '.') {
                        sb2.append(charAt2);
                    }
                    i2++;
                }
                aq4.setValue(sb2.toString());
                return vs7;
            case 12:
                String str7 = (String) obj;
                str7.getClass();
                aq4.setValue(str7);
                return vs7;
            case ry4.PERF_SESSIONS_FIELD_NUMBER:
                String str8 = (String) obj;
                str8.getClass();
                StringBuilder sb3 = new StringBuilder();
                int length3 = str8.length();
                while (i2 < length3) {
                    char charAt3 = str8.charAt(i2);
                    if (Character.isDigit(charAt3)) {
                        sb3.append(charAt3);
                    }
                    i2++;
                }
                aq4.setValue(d57.i1(4, sb3.toString()));
                return vs7;
            case 14:
                String str9 = (String) obj;
                str9.getClass();
                StringBuilder sb4 = new StringBuilder();
                int length4 = str9.length();
                while (i2 < length4) {
                    char charAt4 = str9.charAt(i2);
                    if (Character.isDigit(charAt4)) {
                        sb4.append(charAt4);
                    }
                    i2++;
                }
                aq4.setValue(d57.i1(4, sb4.toString()));
                return vs7;
            case h75.g:
                String str10 = ((zf6) obj).a;
                if (str10 != null) {
                    StringBuilder sb5 = new StringBuilder();
                    int length5 = str10.length();
                    while (i2 < length5) {
                        char charAt5 = str10.charAt(i2);
                        if (Character.isDigit(charAt5)) {
                            sb5.append(charAt5);
                        }
                        i2++;
                    }
                    String i1 = d57.i1(16, sb5.toString());
                    vr2 vr2 = (vr2) aq4.getValue();
                    if (vr2 != null) {
                        vr2.y(i1);
                    }
                }
                aq4.setValue((Object) null);
                return vs7;
            case 16:
                aq4.setValue(new we3(((we3) obj).a));
                return vs7;
            case 17:
                ((tp1) obj).getClass();
                int C = dh4.C(Float.intBitsToFloat((int) (((l35) aq4.getValue()).a >> 32)));
                return new oe3((((long) dh4.C(Float.intBitsToFloat((int) (((l35) aq4.getValue()).a & 4294967295L)))) & 4294967295L) | (((long) C) << 32));
            case 18:
                aq4.setValue(new we3(((we3) obj).a));
                return vs7;
            case 19:
                String str11 = (String) obj;
                str11.getClass();
                StringBuilder sb6 = new StringBuilder();
                int length6 = str11.length();
                while (i2 < length6) {
                    char charAt6 = str11.charAt(i2);
                    if (Character.isDigit(charAt6)) {
                        sb6.append(charAt6);
                    }
                    i2++;
                }
                aq4.setValue(d57.i1(16, sb6.toString()));
                return vs7;
            case 20:
                String str12 = (String) obj;
                str12.getClass();
                vr2 vr22 = (vr2) aq4.getValue();
                if (vr22 != null) {
                    vr22.y(str12);
                }
                return vs7;
            case 21:
                String str13 = (String) obj;
                str13.getClass();
                aq4.setValue(str13);
                return vs7;
            case 22:
                String str14 = (String) obj;
                str14.getClass();
                aq4.setValue(str14);
                return vs7;
            case 23:
                String str15 = (String) obj;
                str15.getClass();
                aq4.setValue(str15);
                return vs7;
            case 24:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                aq4.setValue(bool2);
                return vs7;
            case 25:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                aq4.setValue(bool3);
                return vs7;
            case 26:
                String str16 = (String) obj;
                str16.getClass();
                StringBuilder sb7 = new StringBuilder();
                int length7 = str16.length();
                while (i2 < length7) {
                    char charAt7 = str16.charAt(i2);
                    if (Character.isDigit(charAt7)) {
                        sb7.append(charAt7);
                    }
                    i2++;
                }
                aq4.setValue(d57.i1(4, sb7.toString()));
                return vs7;
            case 27:
                String str17 = (String) obj;
                str17.getClass();
                aq4.setValue(str17);
                return vs7;
            case 28:
                aq4.setValue((dy3) obj);
                return vs7;
            default:
                cf5 cf5 = (cf5) obj;
                cf5.getClass();
                aq4.setValue(cf5);
                return vs7;
        }
    }
}
