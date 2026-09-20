package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.JsonObject;

/* renamed from: tm3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class tm3 implements vr2 {
    public final /* synthetic */ int w;

    public /* synthetic */ tm3(int i, m34 m34) {
        this.w = 8;
    }

    public final Object y(Object obj) {
        s51 s51;
        String str;
        int i = this.w;
        vs7 vs7 = vs7.a;
        switch (i) {
            case b85.b:
                return JsonObject.toString$lambda$0((Map.Entry) obj);
            case 1:
                ul3 ul3 = (ul3) obj;
                ul3.getClass();
                ul3.a = true;
                ul3.c = true;
                ul3.d = true;
                ul3.e = true;
                return vs7;
            case 2:
                z41 z41 = (z41) obj;
                z41.getClass();
                km3 km3 = l18.a;
                int i2 = dn3.a;
                q51 q51 = l51.c;
                km3.getClass();
                q51.getClass();
                jx3 jx3 = new jx3(km3);
                if (q51.a(q51)) {
                    s51 = td0.F;
                } else {
                    s51 = new ji8(13, (Object) q51);
                }
                z41.b.add(new y41(jx3, q51, s51));
                return vs7;
            case 3:
                List list = (List) obj;
                return new n04(((Number) list.get(0)).intValue(), ((Number) list.get(1)).intValue());
            case 4:
                ((Integer) obj).getClass();
                d04 d04 = q04.a;
                return a42.w;
            case 5:
                ((Integer) obj).getClass();
                d04 d042 = q04.a;
                return -1;
            case 6:
                ((Integer) obj).getClass();
                return null;
            case 7:
                List list2 = (List) obj;
                return new s34(((Number) list2.get(0)).intValue(), ((Number) list2.get(1)).intValue());
            case 8:
                tn5 tn5 = (tn5) obj;
                return vs7;
            case 9:
                hf7 hf7 = (hf7) obj;
                return vs7;
            case 10:
                List list3 = (List) obj;
                return vs7;
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER:
                b93 b93 = (b93) obj;
                return vs7;
            case 12:
                j74 j74 = (j74) obj;
                j74.getClass();
                jb5 jb5 = j74.f;
                if (jb5 instanceof j74) {
                    return (j74) jb5;
                }
                return null;
            case ry4.PERF_SESSIONS_FIELD_NUMBER:
                j74 j742 = (j74) obj;
                j742.getClass();
                StringBuilder sb = new StringBuilder();
                sb.append(j742.d);
                sb.append('=');
                sb.append(j742.e);
                return sb.toString();
            case 14:
                qi1 qi1 = (qi1) obj;
                qi1.getClass();
                ar7.l(qi1, 't');
                return vs7;
            case h75.g:
                qi1 qi12 = (qi1) obj;
                qi12.getClass();
                ar7.l(qi12, 'T');
                return vs7;
            case 16:
                ((ri1) obj).getClass();
                return vs7;
            case 17:
                ri1 ri1 = (ri1) obj;
                ri1.getClass();
                ar7.l(ri1, ':');
                ri1.g(ri1);
                ar7.L(ri1, "", new tm3(18));
                return vs7;
            case 18:
                ri1 ri12 = (ri1) obj;
                ri12.getClass();
                ar7.l(ri12, '.');
                ((x3) ri12).b(new k60(new xp2()));
                return vs7;
            case 19:
                ((Long) obj).getClass();
                return vs7;
            case 20:
                jc5 jc5 = (jc5) obj;
                return pb4.k("[", jc5.b, ", ", jc5.c, ")");
            case 21:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                Object value = entry.getValue();
                if (value instanceof byte[]) {
                    str = qs.e1((byte[]) value, ", ", 56);
                } else {
                    str = String.valueOf(entry.getValue());
                }
                return f21.m(new StringBuilder("  "), ((in5) entry.getKey()).a, " = ", str);
            case 22:
                ua6 ua6 = (ua6) obj;
                ua6.getClass();
                ab6 k0 = ua6.k0("SELECT * FROM nauta_accounts ORDER BY lastUsed DESC");
                try {
                    int n = u55.n(k0, "email");
                    int n2 = u55.n(k0, "encryptedPassword");
                    int n3 = u55.n(k0, "lastUsed");
                    ArrayList arrayList = new ArrayList();
                    while (k0.i0()) {
                        arrayList.add(new gr4(k0.getLong(n3), k0.R(n), k0.R(n2)));
                    }
                    return arrayList;
                } finally {
                    k0.close();
                }
            case 23:
                ib1 ib1 = (ib1) obj;
                ib1.getClass();
                return new at4(cf6.a(ib1));
            case 24:
                return new p30(cf6.a((ib1) obj));
            case 25:
                Context context = (Context) obj;
                context.getClass();
                if (context instanceof ContextWrapper) {
                    return ((ContextWrapper) context).getBaseContext();
                }
                return null;
            case 26:
                qt4 qt4 = (qt4) obj;
                qt4.getClass();
                eu4 eu4 = qt4.y;
                if (eu4 == null || eu4.B.w != qt4.x.a) {
                    return null;
                }
                return eu4;
            case 27:
                qt4 qt42 = (qt4) obj;
                qt42.getClass();
                eu4 eu42 = qt42.y;
                if (eu42 == null || eu42.B.w != qt42.x.a) {
                    return null;
                }
                return eu42;
            case 28:
                qt4 qt43 = (qt4) obj;
                qt43.getClass();
                return Integer.valueOf(qt43.x.a);
            default:
                ((ib1) obj).getClass();
                return new it4();
        }
    }

    public /* synthetic */ tm3(int i) {
        this.w = i;
    }
}
