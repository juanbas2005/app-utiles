package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ot4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class ot4 implements vr2 {
    public final /* synthetic */ int w;

    public /* synthetic */ ot4(sr2 sr2) {
        this.w = 11;
    }

    public final Object y(Object obj) {
        int i = this.w;
        Object obj2 = null;
        vs7 vs7 = vs7.a;
        switch (i) {
            case b85.b:
                qt4 qt4 = (qt4) obj;
                qt4.getClass();
                return qt4.y;
            case 1:
                return new pk((eg6) obj);
            case 2:
                gk gkVar = (gk) obj;
                return new k51(i52.e(kl8.O(700, 6, (i12) null), 2), i52.f(kl8.O(700, 6, (i12) null), 2));
            case 3:
                gk gkVar2 = (gk) obj;
                return new k51(i52.e(kl8.O(700, 6, (i12) null), 2), i52.f(kl8.O(700, 6, (i12) null), 2));
            case 4:
                return vs7;
            case 5:
                qt4 qt42 = (qt4) obj;
                qt42.getClass();
                if (!(qt42 instanceof eu4)) {
                    return null;
                }
                r14 r14 = ((eu4) qt42).B;
                return r14.a(r14.w);
            case 6:
                qt4 qt43 = ((zs4) ((gk) obj).d()).x;
                qt43.getClass();
                int i2 = qt4.A;
                for (qt4 qt44 : ie1.I((gx0) qt43)) {
                }
                return null;
            case 7:
                gk gkVar3 = (gk) obj;
                return i52.e(kl8.O(700, 6, (i12) null), 2);
            case 8:
                gk gkVar4 = (gk) obj;
                return i52.f(kl8.O(700, 6, (i12) null), 2);
            case 9:
                return ((zs4) obj).B;
            case 10:
                ok6 ok6 = (ok6) obj;
                float f = hv4.a;
                return vs7;
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                ((l76) obj).c(1.0f);
                return vs7;
            case 12:
                mk6.f((ok6) obj, 4);
                return vs7;
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                yz1 yz1 = (yz1) obj;
                jo7 jo7 = pv4.a;
                return Boolean.TRUE;
            case 14:
                mk6.i((ok6) obj);
                return vs7;
            case h75.g:
                ok6 ok62 = (ok6) obj;
                float f2 = ww4.a;
                return vs7;
            case 16:
                return new ix4((jx4) obj);
            case 17:
                kh khVar = ((mz4) obj).a;
                if (khVar != null) {
                    khVar.b();
                }
                return vs7;
            case 18:
                c45 c45 = (c45) obj;
                c45.getClass();
                c45.i = false;
                c45.j = false;
                c45.f = true;
                return vs7;
            case 19:
                ((d45) obj).getClass();
                return vs7;
            case 20:
                qy0 qy0 = (qy0) obj;
                int i3 = wg.a;
                Context context = (Context) qy0.g0(ye.b);
                tp1 tp1 = (tp1) qy0.g0(xy0.h);
                j95 j95 = (j95) qy0.g0(k95.a);
                if (j95 == null) {
                    return null;
                }
                return new yf(context, tp1, j95.a, j95.b);
            case 21:
                String str = (String) obj;
                str.getClass();
                return ec5.a(str);
            case 22:
                xf4 xf4 = (xf4) obj;
                xf4.getClass();
                Integer v0 = k57.v0((String) ((vf4) xf4.a()).get(1));
                if (v0 != null) {
                    return new String(Character.toChars(v0.intValue()));
                }
                String group = xf4.a.group();
                group.getClass();
                return group;
            case 23:
                xf4 xf42 = (xf4) obj;
                xf42.getClass();
                return (String) ((vf4) xf42.a()).get(1);
            case 24:
                ld5 ld5 = (ld5) obj;
                ld5.getClass();
                StringBuilder sb = new StringBuilder("position ");
                sb.append(ld5.a);
                sb.append(": '");
                return hl6.o(sb, (String) ld5.b.b(), '\'');
            case 25:
                Context context2 = (Context) obj;
                List<ResolveInfo> queryIntentActivities = context2.getPackageManager().queryIntentActivities(new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain"), 0);
                ArrayList arrayList = new ArrayList(queryIntentActivities.size());
                int size = queryIntentActivities.size();
                for (int i4 = 0; i4 < size; i4++) {
                    ResolveInfo resolveInfo = queryIntentActivities.get(i4);
                    ResolveInfo resolveInfo2 = resolveInfo;
                    if (!context2.getPackageName().equals(resolveInfo2.activityInfo.packageName)) {
                        ActivityInfo activityInfo = resolveInfo2.activityInfo;
                        if (activityInfo.exported) {
                            String str2 = activityInfo.permission;
                            if (!(str2 == null || context2.checkSelfPermission(str2) == 0)) {
                            }
                        }
                    }
                    arrayList.add(resolveInfo);
                }
                return arrayList;
            case 26:
                ft3 ft3 = (ft3) obj;
                ft3.a = 6000;
                Float valueOf = Float.valueOf(90.0f);
                ft3.a(valueOf, 300).b = ym4.a;
                ft3.a(valueOf, 1500);
                Float valueOf2 = Float.valueOf(180.0f);
                ft3.a(valueOf2, 1800);
                ft3.a(valueOf2, 3000);
                Float valueOf3 = Float.valueOf(270.0f);
                ft3.a(valueOf3, 3300);
                ft3.a(valueOf3, 4500);
                Float valueOf4 = Float.valueOf(360.0f);
                ft3.a(valueOf4, 4800);
                ft3.a(valueOf4, 6000);
                return vs7;
            case 27:
                mq5 mq5 = mq5.c;
                yr3[] yr3Arr = mk6.a;
                nk6 nk6 = jk6.c;
                yr3 yr3 = mk6.a[1];
                ((ok6) obj).f(nk6, mq5);
                return vs7;
            case 28:
                xu4 xu4 = (xu4) obj;
                xu4.getClass();
                xu4.b = true;
                return vs7;
            default:
                aq4 aq4 = (aq4) obj;
                if (aq4 instanceof sx6) {
                    sx6 sx6 = (sx6) aq4;
                    if (sx6.getValue() != null) {
                        Object value = sx6.getValue();
                        value.getClass();
                        obj2 = ((vr2) hf7.d.y).y(value);
                    }
                    ux6 a = sx6.a();
                    a.getClass();
                    return new ed5(obj2, a);
                }
                h.q("Failed requirement.");
                return null;
        }
    }

    public /* synthetic */ ot4(int i) {
        this.w = i;
    }
}
