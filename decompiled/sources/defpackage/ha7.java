package defpackage;

import cu.lestebang.utiletecsa.core.preferences.model.UserDataPreferences;
import cu.lestebang.utiletecsa.feature.settings.service.UssdAutoUpdaterService;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ha7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class ha7 implements vr2 {
    public final /* synthetic */ int w;

    public /* synthetic */ ha7(yp7 yp7) {
        this.w = 17;
    }

    /* JADX WARNING: Removed duplicated region for block: B:156:0x03aa  */
    /* JADX WARNING: Removed duplicated region for block: B:194:? A[RETURN, SYNTHETIC] */
    public final Object y(Object obj) {
        int i;
        z75 z75;
        vl vlVar;
        lg7 lg7;
        gg7 a;
        yy6 yy6;
        yp7 yp7;
        String str;
        Object obj2;
        int i2 = this.w;
        vs7 vs7 = vs7.a;
        switch (i2) {
            case b85.b:
                ua6 ua6 = (ua6) obj;
                ua6.getClass();
                ab6 k0 = ua6.k0("SELECT DISTINCT work_spec_id FROM SystemIdInfo");
                try {
                    ArrayList arrayList = new ArrayList();
                    while (k0.i0()) {
                        arrayList.add(k0.R(0));
                    }
                    return arrayList;
                } finally {
                    k0.close();
                }
            case 1:
                ((Float) obj).getClass();
                return vs7;
            case 2:
                ((Integer) obj).intValue();
                return zd7.a;
            case 3:
                oe7 oe7 = (oe7) obj;
                String str2 = oe7.g.x;
                long j = oe7.f;
                int i3 = lg7.c;
                int i4 = (int) (j & 4294967295L);
                if (i4 > 0) {
                    w22 s = t35.s();
                    if (s != null) {
                        int b = s.b(i4 - 1, str2);
                        if (b >= 0) {
                            i = b;
                        } else if (i4 > 0) {
                            i = Character.offsetByCodePoints(str2, i4, -1);
                        }
                        if (i == -1) {
                        }
                    } else if (i4 > 0) {
                        i = Character.offsetByCodePoints(str2, i4, -1);
                        if (i == -1) {
                            return null;
                        }
                        return new np1(((int) (oe7.f & 4294967295L)) - i, 0);
                    }
                }
                i = -1;
                if (i == -1) {
                }
            case 4:
                oe7 oe72 = (oe7) obj;
                String str3 = oe72.g.x;
                long j2 = oe72.f;
                int i5 = lg7.c;
                int p = t35.p((int) (j2 & 4294967295L), str3);
                if (p != -1) {
                    return new np1(0, p - ((int) (oe72.f & 4294967295L)));
                }
                return null;
            case 5:
                oe7 oe73 = (oe7) obj;
                Integer e = oe73.e();
                if (e == null) {
                    return null;
                }
                int intValue = e.intValue();
                long j3 = oe73.f;
                int i6 = lg7.c;
                return new np1(((int) (j3 & 4294967295L)) - intValue, 0);
            case 6:
                oe7 oe74 = (oe7) obj;
                Integer d = oe74.d();
                if (d == null) {
                    return null;
                }
                int intValue2 = d.intValue();
                long j4 = oe74.f;
                int i7 = lg7.c;
                return new np1(0, intValue2 - ((int) (j4 & 4294967295L)));
            case 7:
                oe7 oe75 = (oe7) obj;
                Integer c = oe75.c();
                if (c == null) {
                    return null;
                }
                int intValue3 = c.intValue();
                long j5 = oe75.f;
                int i8 = lg7.c;
                return new np1(((int) (j5 & 4294967295L)) - intValue3, 0);
            case 8:
                oe7 oe76 = (oe7) obj;
                Integer b2 = oe76.b();
                if (b2 == null) {
                    return null;
                }
                int intValue4 = b2.intValue();
                long j6 = oe76.f;
                int i9 = lg7.c;
                return new np1(0, intValue4 - ((int) (j6 & 4294967295L)));
            case 9:
                List list = (List) obj;
                Object obj3 = list.get(1);
                obj3.getClass();
                if (((Boolean) obj3).booleanValue()) {
                    z75 = z75.w;
                } else {
                    z75 = z75.x;
                }
                Object obj4 = list.get(0);
                obj4.getClass();
                return new se7(z75, ((Float) obj4).floatValue());
            case 10:
                obj.getClass();
                List list2 = (List) obj;
                Object obj5 = list2.get(0);
                kg5 kg5 = qf6.a;
                Boolean bool = Boolean.FALSE;
                if (!sg3.e(obj5, bool) && obj5 != null) {
                    vlVar = (vl) ((vr2) kg5.y).y(obj5);
                } else {
                    vlVar = null;
                }
                vlVar.getClass();
                Object obj6 = list2.get(1);
                int i10 = lg7.c;
                kg5 kg52 = qf6.p;
                if (!sg3.e(obj6, bool) && obj6 != null) {
                    lg7 = (lg7) ((vr2) kg52.y).y(obj6);
                } else {
                    lg7 = null;
                }
                lg7.getClass();
                return new hf7(vlVar, lg7.a, (lg7) null);
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                bg7 bg7 = (bg7) obj;
                yy0 yy0 = yf7.a;
                return vs7;
            case 12:
                ul ulVar = (ul) obj;
                Object obj7 = ulVar.a;
                if (!(obj7 instanceof b74) || (a = ((b74) obj7).a()) == null || (a.a == null && a.b == null && a.c == null && a.d == null)) {
                    return sg3.f(ulVar);
                }
                Object obj8 = ulVar.a;
                obj8.getClass();
                gg7 a2 = ((b74) obj8).a();
                if (a2 == null || (yy6 = a2.a) == null) {
                    yy6 = new yy6(0, 0, (am2) null, (yl2) null, (zl2) null, (ea7) null, (String) null, 0, (h60) null, (lf7) null, (ya4) null, 0, (rd7) null, (lq6) null, 65535);
                }
                return sg3.f(ulVar, new ul(ulVar.b, ulVar.c, yy6));
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                ((ok6) obj).f(jk6.B, vs7);
                return vs7;
            case 14:
                ab6 ab6 = (ab6) obj;
                ab6.getClass();
                return Boolean.valueOf(ab6.i0());
            case h75.g:
                oi6 oi6 = (oi6) obj;
                long j7 = oi6.B;
                cy6 cy6 = oi6.D;
                if (cy6 != null) {
                    cy6.e(oi6, rc9.p, oi6.C);
                }
                long j8 = oi6.B;
                if (j7 != j8) {
                    hi6 hi6 = oi6.K;
                    if (hi6 != null) {
                        if (hi6.a > j8) {
                            oi6.j1();
                        } else {
                            hi6.g = j8;
                            if (hi6.b == null) {
                                hi6.h = dh4.D((1.0d - ((double) hi6.e.a(0))) * ((double) oi6.B));
                            }
                        }
                    } else if (j8 != 0) {
                        oi6.m1();
                    }
                }
                return vs7;
            case 16:
                ab6 ab62 = (ab6) obj;
                ab62.getClass();
                sn6 sn6 = new sn6();
                while (ab62.i0()) {
                    sn6.add(Integer.valueOf((int) ab62.getLong(0)));
                }
                return wn6.d(sn6);
            case 17:
                gs3 gs3 = (gs3) obj;
                gs3.getClass();
                ks3 ks3 = gs3.a;
                if (ks3 == null) {
                    return "*";
                }
                as3 as3 = gs3.b;
                if (as3 instanceof yp7) {
                    yp7 = (yp7) as3;
                } else {
                    yp7 = null;
                }
                if (yp7 != null) {
                    str = yp7.b(true);
                } else {
                    str = String.valueOf(as3);
                }
                int ordinal = ks3.ordinal();
                if (ordinal == 0) {
                    return str;
                }
                if (ordinal == 1) {
                    return "in ".concat(str);
                }
                if (ordinal == 2) {
                    return "out ".concat(str);
                }
                h.c();
                return null;
            case 18:
                yb5 yb5 = (yb5) obj;
                yb5.getClass();
                String str4 = (String) yb5.w;
                Object obj9 = yb5.x;
                if (obj9 == null) {
                    return str4;
                }
                return str4 + '=' + String.valueOf(obj9);
            case 19:
                ul3 ul3 = (ul3) obj;
                ul3.getClass();
                ul3.b = true;
                return vs7;
            case 20:
                UserDataPreferences userDataPreferences = (UserDataPreferences) obj;
                d37 d37 = UssdAutoUpdaterService.T;
                userDataPreferences.getClass();
                return userDataPreferences.getUssdAutoVoiceCode();
            case 21:
                return ((UserDataPreferences) obj).getUssdAutoSmsCode();
            case 22:
                UserDataPreferences userDataPreferences2 = (UserDataPreferences) obj;
                userDataPreferences2.getClass();
                return userDataPreferences2.getUssdAutoDataCode();
            case 23:
                String ussdAutoPeriodicQuery = ((UserDataPreferences) obj).getUssdAutoPeriodicQuery();
                jy7.x.getClass();
                ussdAutoPeriodicQuery.getClass();
                try {
                    obj2 = jy7.valueOf(ussdAutoPeriodicQuery);
                } catch (Throwable th) {
                    obj2 = new m66(th);
                }
                if (obj2 instanceof m66) {
                    obj2 = jy7.SALDO;
                }
                return ((jy7) obj2).w;
            case 24:
                UserDataPreferences userDataPreferences3 = (UserDataPreferences) obj;
                userDataPreferences3.getClass();
                return userDataPreferences3.getUssdAutoSmsCode();
            case 25:
                ua6 ua62 = (ua6) obj;
                ua62.getClass();
                ab6 k02 = ua62.k0("SELECT * FROM ussd_codes ORDER BY category, name");
                try {
                    int n = u55.n(k02, "id");
                    int n2 = u55.n(k02, "name");
                    int n3 = u55.n(k02, "code");
                    int n4 = u55.n(k02, "category");
                    int n5 = u55.n(k02, "description");
                    ArrayList arrayList2 = new ArrayList();
                    while (k02.i0()) {
                        arrayList2.add(new yy7(k02.R(n), k02.R(n2), k02.R(n3), k02.R(n4), k02.R(n5)));
                    }
                    return arrayList2;
                } finally {
                    k02.close();
                }
            case 26:
                si1 si1 = (si1) obj;
                si1.getClass();
                ar7.l(si1, ':');
                si1.n(si1);
                return vs7;
            case 27:
                si1 si12 = (si1) obj;
                si12.getClass();
                si1.n(si12);
                return vs7;
            case 28:
                si1 si13 = (si1) obj;
                si13.getClass();
                si13.a("z");
                return vs7;
            default:
                si1 si14 = (si1) obj;
                si14.getClass();
                ar7.L(si14, "Z", new f08(2));
                return vs7;
        }
    }

    public /* synthetic */ ha7(int i) {
        this.w = i;
    }
}
