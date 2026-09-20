package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: cb  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class cb implements vr2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ String x;

    public /* synthetic */ cb(kz2 kz2, String str) {
        this.w = 14;
        this.x = str;
    }

    /* JADX INFO: finally extract failed */
    public final Object y(Object obj) {
        int i = this.w;
        Object obj2 = null;
        boolean z = false;
        vs7 vs7 = vs7.a;
        String str = this.x;
        switch (i) {
            case b85.b:
                mk6.e((ok6) obj, str);
                return vs7;
            case 1:
                vm3 vm3 = (vm3) obj;
                vm3.getClass();
                b96.M(vm3, "email", str);
                return vs7;
            case 2:
                ok6 ok6 = (ok6) obj;
                mk6.d(ok6, 1);
                mk6.e(ok6, str);
                return vs7;
            case 3:
                ok6 ok62 = (ok6) obj;
                mk6.d(ok62, 0);
                mk6.c(ok62, str);
                return vs7;
            case 4:
                mk6.e((ok6) obj, str);
                return vs7;
            case 5:
                ok6 ok63 = (ok6) obj;
                mk6.d(ok63, 0);
                mk6.c(ok63, str);
                return vs7;
            case 6:
                ok6 ok64 = (ok6) obj;
                vl vlVar = new vl(str);
                yr3[] yr3Arr = mk6.a;
                ok64.f(jk6.C, sg3.D(vlVar));
                mk6.f(ok64, 0);
                return vs7;
            case 7:
                ok6 ok65 = (ok6) obj;
                vl vlVar2 = new vl(str);
                yr3[] yr3Arr2 = mk6.a;
                ok65.f(jk6.C, sg3.D(vlVar2));
                mk6.f(ok65, 0);
                return vs7;
            case 8:
                ua6 ua6 = (ua6) obj;
                ua6.getClass();
                ab6 k0 = ua6.k0("SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?");
                try {
                    k0.F(1, str);
                    if (k0.i0() && ((int) k0.getLong(0)) != 0) {
                        z = true;
                    }
                    k0.close();
                    return Boolean.valueOf(z);
                } catch (Throwable th) {
                    k0.close();
                    throw th;
                }
            case 9:
                ua6 ua62 = (ua6) obj;
                ua62.getClass();
                ab6 k02 = ua62.k0("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?");
                try {
                    k02.F(1, str);
                    ArrayList arrayList = new ArrayList();
                    while (k02.i0()) {
                        arrayList.add(k02.R(0));
                    }
                    return arrayList;
                } finally {
                    k02.close();
                }
            case 10:
                ua6 ua63 = (ua6) obj;
                ua63.getClass();
                ab6 k03 = ua63.k0("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)");
                try {
                    k03.F(1, str);
                    if (k03.i0() && ((int) k03.getLong(0)) != 0) {
                        z = true;
                    }
                    k03.close();
                    return Boolean.valueOf(z);
                } catch (Throwable th2) {
                    k03.close();
                    throw th2;
                }
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                mo2 mo2 = (mo2) obj;
                List<en2> list = mo2.a;
                ArrayList arrayList2 = new ArrayList(et0.e0(list, 10));
                for (en2 f : list) {
                    arrayList2.add(rg3.f(f, str, 1));
                }
                return mo2.a(mo2, arrayList2, (List) null, (String) null, (String) null, false, false, (hv2) null, (String) null, (List) null, false, (Boolean) null, (Map) null, false, false, 16382);
            case 12:
                mo2 mo22 = (mo2) obj;
                List<en2> list2 = mo22.a;
                ArrayList arrayList3 = new ArrayList(et0.e0(list2, 10));
                for (en2 f2 : list2) {
                    arrayList3.add(rg3.f(f2, str, -1));
                }
                return mo2.a(mo22, arrayList3, (List) null, (String) null, (String) null, false, false, (hv2) null, (String) null, (List) null, false, (Boolean) null, (Map) null, false, false, 16382);
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                mo2 mo23 = (mo2) obj;
                List list3 = mo23.a;
                ArrayList arrayList4 = new ArrayList();
                for (Object next : list3) {
                    if (!sg3.e(((en2) next).a, str)) {
                        arrayList4.add(next);
                    }
                }
                Map map = mo23.l;
                map.getClass();
                LinkedHashMap linkedHashMap = new LinkedHashMap(map);
                linkedHashMap.remove(str);
                return mo2.a(mo23, arrayList4, (List) null, (String) null, (String) null, false, false, (hv2) null, (String) null, a42.w, false, (Boolean) null, sf4.W(linkedHashMap), false, false, 13950);
            case 14:
                pp4 pp4 = (pp4) obj;
                pp4.c(kz2.d, str);
                kz2.d(pp4, str);
                return null;
            case h75.g /*15*/:
                ok6 ok66 = (ok6) obj;
                mk6.c(ok66, str);
                mk6.f(ok66, 5);
                return vs7;
            case 16:
                ok6 ok67 = (ok6) obj;
                mk6.c(ok67, str);
                mk6.f(ok67, 5);
                return vs7;
            case 17:
                ua6 ua64 = (ua6) obj;
                ua64.getClass();
                ab6 k04 = ua64.k0("DELETE FROM nauta_accounts WHERE email = ?");
                try {
                    k04.F(1, str);
                    k04.i0();
                    return vs7;
                } finally {
                    k04.close();
                }
            case 18:
                mk6.e((ok6) obj, str);
                return vs7;
            case 19:
                ua6 ua65 = (ua6) obj;
                ua65.getClass();
                ab6 k05 = ua65.k0("SELECT long_value FROM Preference where `key`=?");
                try {
                    k05.F(1, str);
                    if (k05.i0()) {
                        if (!k05.isNull(0)) {
                            obj2 = Long.valueOf(k05.getLong(0));
                        }
                    }
                    return obj2;
                } finally {
                    k05.close();
                }
            case 20:
                ok6 ok68 = (ok6) obj;
                ok68.getClass();
                mk6.c(ok68, str);
                return vs7;
            case 21:
                String str2 = (String) obj;
                str2.getClass();
                if (!d57.I0(str2)) {
                    return str.concat(str2);
                }
                if (str2.length() < str.length()) {
                    return str;
                }
                return str2;
            case 22:
                re3 re3 = (re3) obj;
                re3.getClass();
                return d57.b1(str, re3);
            case 23:
                ua6 ua66 = (ua6) obj;
                ua66.getClass();
                ab6 k06 = ua66.k0("DELETE FROM SystemIdInfo where work_spec_id=?");
                try {
                    k06.F(1, str);
                    k06.i0();
                    return vs7;
                } finally {
                    k06.close();
                }
            case 24:
                yr3[] yr3Arr3 = mk6.a;
                ((ok6) obj).f(jk6.M, str);
                return vs7;
            case 25:
                ok6 ok69 = (ok6) obj;
                mk6.d(ok69, 1);
                mk6.e(ok69, str);
                return vs7;
            case 26:
                ua6 ua67 = (ua6) obj;
                ua67.getClass();
                ab6 k07 = ua67.k0("SELECT number FROM transfer_recipients WHERE number LIKE ? || '%' ORDER BY lastUsed DESC LIMIT 5");
                try {
                    k07.F(1, str);
                    ArrayList arrayList5 = new ArrayList();
                    while (k07.i0()) {
                        arrayList5.add(k07.R(0));
                    }
                    return arrayList5;
                } finally {
                    k07.close();
                }
            case 27:
                ua6 ua68 = (ua6) obj;
                ua68.getClass();
                ab6 k08 = ua68.k0("SELECT * FROM ussd_codes WHERE name = ? LIMIT 1");
                try {
                    k08.F(1, str);
                    int n = u55.n(k08, "id");
                    int n2 = u55.n(k08, "name");
                    int n3 = u55.n(k08, "code");
                    int n4 = u55.n(k08, "category");
                    int n5 = u55.n(k08, "description");
                    if (k08.i0()) {
                        obj2 = new yy7(k08.R(n), k08.R(n2), k08.R(n3), k08.R(n4), k08.R(n5));
                    }
                    return obj2;
                } finally {
                    k08.close();
                }
            case 28:
                ua6 ua69 = (ua6) obj;
                ua69.getClass();
                ab6 k09 = ua69.k0("SELECT * FROM ussd_codes WHERE category = ? ORDER BY name");
                try {
                    k09.F(1, str);
                    int n6 = u55.n(k09, "id");
                    int n7 = u55.n(k09, "name");
                    int n8 = u55.n(k09, "code");
                    int n9 = u55.n(k09, "category");
                    int n10 = u55.n(k09, "description");
                    ArrayList arrayList6 = new ArrayList();
                    while (k09.i0()) {
                        arrayList6.add(new yy7(k09.R(n6), k09.R(n7), k09.R(n8), k09.R(n9), k09.R(n10)));
                    }
                    return arrayList6;
                } finally {
                    k09.close();
                }
            default:
                ok6 ok610 = (ok6) obj;
                mk6.c(ok610, str);
                mk6.f(ok610, 5);
                return vs7;
        }
    }

    public /* synthetic */ cb(String str, int i) {
        this.w = i;
        this.x = str;
    }
}
