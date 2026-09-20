package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: t46  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class t46 implements vr2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ aq4 x;

    public /* synthetic */ t46(aq4 aq4, int i) {
        this.w = i;
        this.x = aq4;
    }

    public final Object y(Object obj) {
        sr2 sr2;
        int i = this.w;
        vs7 vs7 = vs7.a;
        aq4 aq4 = this.x;
        switch (i) {
            case b85.b:
                String str = (String) obj;
                str.getClass();
                aq4.setValue(str);
                return vs7;
            case 1:
                Float f = (Float) obj;
                f.getClass();
                return Float.valueOf(((Number) ((vr2) aq4.getValue()).y(f)).floatValue());
            case 2:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                aq4.setValue(bool);
                return vs7;
            case 3:
                Map map = (Map) obj;
                map.getClass();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : map.entrySet()) {
                    if (!sg3.e((String) entry.getKey(), "android.permission.READ_CONTACTS")) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                Iterable values = linkedHashMap.values();
                if (!(values instanceof Collection) || !((Collection) values).isEmpty()) {
                    Iterator it = values.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (!((Boolean) it.next()).booleanValue()) {
                            }
                        }
                    }
                }
                sr2 sr22 = (sr2) aq4.getValue();
                if (sr22 != null) {
                    sr22.b();
                }
                aq4.setValue((Object) null);
                return vs7;
            case 4:
                q8 q8Var = (q8) obj;
                q8Var.getClass();
                if (q8Var.w == -1 && (sr2 = (sr2) aq4.getValue()) != null) {
                    sr2.b();
                }
                aq4.setValue((Object) null);
                return vs7;
            case 5:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                sr2 sr23 = (sr2) aq4.getValue();
                aq4.setValue((Object) null);
                if (booleanValue && sr23 != null) {
                    sr23.b();
                }
                return vs7;
            case 6:
                Map map2 = (Map) obj;
                map2.getClass();
                Iterable values2 = map2.values();
                if (!(values2 instanceof Collection) || !((Collection) values2).isEmpty()) {
                    Iterator it2 = values2.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (!((Boolean) it2.next()).booleanValue()) {
                            }
                        }
                    }
                }
                sr2 sr24 = (sr2) aq4.getValue();
                if (sr24 != null) {
                    sr24.b();
                }
                aq4.setValue((Object) null);
                return vs7;
            case 7:
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                sr2 sr25 = (sr2) aq4.getValue();
                aq4.setValue((Object) null);
                if (booleanValue2 && sr25 != null) {
                    sr25.b();
                }
                return vs7;
            case 8:
                String str2 = (String) obj;
                str2.getClass();
                if (str2.length() <= 8) {
                    aq4.setValue(str2);
                }
                return vs7;
            case 9:
                String str3 = (String) obj;
                str3.getClass();
                aq4.setValue(d57.i1(40, str3));
                return vs7;
            case 10:
                String str4 = (String) obj;
                str4.getClass();
                aq4.setValue(d57.i1(200, str4));
                return vs7;
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER:
                String str5 = (String) obj;
                str5.getClass();
                aq4.setValue(d57.i1(40, str5));
                return vs7;
            case 12:
                String str6 = (String) obj;
                str6.getClass();
                aq4.setValue(d57.i1(300, str6));
                return vs7;
            case ry4.PERF_SESSIONS_FIELD_NUMBER:
                String str7 = (String) obj;
                str7.getClass();
                aq4.setValue(str7);
                return vs7;
            case 14:
                ((vr2) aq4.getValue()).y((l35) obj);
                return vs7;
            case h75.g:
                aq4.setValue((dy3) obj);
                return vs7;
            default:
                aq4.setValue(new l35(((dy3) obj).w(0)));
                return vs7;
        }
    }
}
