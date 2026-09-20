package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.provider.Settings;
import android.view.WindowManager;
import cu.lestebang.utiletecsa.feature.nauta.service.NautaOverlayService;
import cu.lestebang.utiletecsa.feature.settings.service.SpeedOverlayService;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.TimeZone;
import java.util.regex.Matcher;
import kotlinx.serialization.json.JsonException;

/* renamed from: qm3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class qm3 implements sr2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;

    public /* synthetic */ qm3(ft4 ft4, zs4 zs4, boolean z) {
        this.w = 7;
        this.x = ft4;
        this.y = zs4;
    }

    public final Object b() {
        String[] names;
        String str;
        zx5 zx5;
        int i = -1;
        Long l = null;
        switch (this.w) {
            case b85.b:
                ll6 ll6 = (ll6) this.x;
                pl3 pl3 = (pl3) this.y;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                wl3 wl3 = pl3.a;
                rm3.d(pl3, ll6);
                int e = ll6.e();
                for (int i2 = 0; i2 < e; i2++) {
                    List g = ll6.g(i2);
                    ArrayList arrayList = new ArrayList();
                    for (Object next : g) {
                        if (next instanceof pm3) {
                            arrayList.add(next);
                        }
                    }
                    pm3 pm3 = (pm3) dt0.S0(arrayList);
                    if (!(pm3 == null || (names = pm3.names()) == null)) {
                        int length = names.length;
                        int i3 = 0;
                        while (i3 < length) {
                            String str2 = names[i3];
                            if (sg3.e(ll6.u(), ql6.l)) {
                                str = "enum value";
                            } else {
                                str = "property";
                            }
                            if (!linkedHashMap.containsKey(str2)) {
                                linkedHashMap.put(str2, Integer.valueOf(i2));
                                i3++;
                            } else {
                                throw new JsonException(ar7.t(-1, "The suggested name '" + str2 + "' for " + str + ' ' + ll6.f(i2) + " is already one of the names for " + str + ' ' + ll6.f(((Number) sf4.U(str2, linkedHashMap)).intValue()) + " in " + ll6, (String) null, (String) null, (String) null));
                            }
                        }
                        continue;
                    }
                }
                if (linkedHashMap.isEmpty()) {
                    return b42.w;
                }
                return linkedHashMap;
            case 1:
                n04 n04 = (n04) this.y;
                vz3 vz3 = (vz3) ((oq1) this.x).getValue();
                return new wz3(n04, vz3, new ig((re3) n04.d.f.getValue(), (uq3) vz3));
            case 2:
                ob5 ob5 = (ob5) this.y;
                ab5 ab5 = (ab5) ((oq1) this.x).getValue();
                return new bb5(ob5, ab5, new ig((re3) ((l24) ob5.d.B).getValue(), (uq3) ab5));
            case 3:
                return new x34((re6) this.x, b42.w, (oe6) this.y);
            case 4:
                NautaOverlayService nautaOverlayService = (NautaOverlayService) this.x;
                d37 d37 = NautaOverlayService.K;
                if (((float) ((WindowManager.LayoutParams) this.y).y) >= ((float) nautaOverlayService.getResources().getDisplayMetrics().heightPixels) * 0.85f) {
                    nautaOverlayService.stopSelf();
                } else {
                    d37 d372 = nautaOverlayService.J;
                    Boolean bool = Boolean.FALSE;
                    d372.getClass();
                    d372.l((Object) null, bool);
                }
                return vs7.a;
            case 5:
                Context context = (Context) this.x;
                Intent intent = new Intent(context, NautaOverlayService.class);
                if (((Boolean) ((aq4) this.y).getValue()).booleanValue()) {
                    context.stopService(intent);
                } else if (Settings.canDrawOverlays(context)) {
                    ag8.H(context, intent);
                } else {
                    context.startActivity(new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse("package:" + context.getPackageName())).addFlags(268435456));
                }
                return vs7.a;
            case 6:
                ((sr2) this.x).b();
                ((sr2) this.y).b();
                return vs7.a;
            case 7:
                ft4 ft4 = (ft4) this.x;
                zs4 zs4 = (zs4) this.y;
                zs4.getClass();
                synchronized (ft4.a) {
                    try {
                        d37 d373 = ft4.b;
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it = ((Iterable) d373.getValue()).iterator();
                        while (true) {
                            if (it.hasNext()) {
                                Object next2 = it.next();
                                if (!sg3.e((zs4) next2, zs4)) {
                                    arrayList2.add(next2);
                                }
                            }
                        }
                        d373.l((Object) null, arrayList2);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return vs7.a;
            case 8:
                float d = ((ad5) this.y).d();
                return Float.valueOf(z65.o((((xz1) this.x).b.e() - d) / (0.0f - d), 0.0f, 1.0f));
            case 9:
                ((az4) this.x).a.unregisterNetworkCallback((zy4) this.y);
                return vs7.a;
            case 10:
                by5 by5 = (by5) this.y;
                if (((yt) ((cf4) this.x).x).get() == 0) {
                    by5.b();
                }
                return vs7.a;
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                return "Only found " + ((f06) this.x).w + " digits in a row, but need to parse " + ((z15) this.y).b();
            case 12:
                return b85.f((String) this.x, n57.o, new ll6[0], new h43(23, (a62) this.y));
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                return (af0) gr8.b0(cw2.w, (e81) this.x, new k05((Object) (j85) this.y, (f61) null, 1), 2).x;
            case 14:
                ((vr2) this.x).y(Integer.valueOf(((bd5) this.y).d()));
                return vs7.a;
            case h75.g:
                ((mx0) this.x).d = (gs2) this.y;
                return vs7.a;
            case 16:
                return mp7.T((Context) this.x, ((hn5) this.y).a.concat(".preferences_pb"));
            case 17:
                ((vr2) this.x).y((cf5) this.y);
                return vs7.a;
            case 18:
                rv0 rv0 = (rv0) this.x;
                lq5 lq5 = (lq5) this.y;
                if (rv0 != null) {
                    d37 d374 = lq5.c;
                    if (!((is7) d374.getValue()).b) {
                        ar7.H(u58.a(lq5), (e81) null, (r81) null, new ii3(d374, (f61) null, (r58) lq5, (Object) rv0, 14), 3);
                    }
                }
                return vs7.a;
            case 19:
                up4 up4 = (up4) this.x;
                py0 py0 = (py0) this.y;
                Object[] objArr = up4.b;
                long[] jArr = up4.a;
                int length2 = jArr.length - 2;
                if (length2 >= 0) {
                    int i4 = 0;
                    while (true) {
                        long j = jArr[i4];
                        if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                            int i5 = 8 - ((~(i4 - length2)) >>> 31);
                            for (int i6 = 0; i6 < i5; i6++) {
                                if ((255 & j) < 128) {
                                    py0.B(objArr[(i4 << 3) + i6]);
                                }
                                j >>= 8;
                            }
                            if (i5 != 8) {
                            }
                        }
                        if (i4 != length2) {
                            i4++;
                        }
                    }
                }
                return vs7.a;
            case 20:
                k26 k26 = (k26) this.x;
                CharSequence charSequence = (CharSequence) this.y;
                k26.getClass();
                charSequence.getClass();
                Matcher matcher = k26.w.matcher(charSequence);
                matcher.getClass();
                return t35.g(matcher, 0, charSequence);
            case 21:
                vr2 vr2 = (vr2) this.x;
                Long b = ((hi1) this.y).b();
                if (b != null) {
                    long longValue = b.longValue();
                    Calendar instance = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
                    instance.setTimeInMillis(longValue);
                    Calendar instance2 = Calendar.getInstance();
                    instance2.clear();
                    instance2.set(instance.get(1), instance.get(2), instance.get(5));
                    l = Long.valueOf(instance2.getTimeInMillis());
                }
                vr2.y(l);
                return vs7.a;
            case 22:
                return b85.f((String) this.x, yk5.m, new ll6[0], new bi6((ci6) this.y, 0));
            case 23:
                w34 w34 = (w34) this.x;
                ConnectivityManager connectivityManager = (ConnectivityManager) this.y;
                synchronized (ur6.b) {
                    try {
                        LinkedHashMap linkedHashMap2 = ur6.c;
                        linkedHashMap2.remove(w34);
                        if (linkedHashMap2.isEmpty()) {
                            bc4.k().e(bd8.a, "NetworkRequestConstraintController unregister shared callback");
                            connectivityManager.unregisterNetworkCallback(ur6.a);
                            ur6.f = null;
                            ur6.d = null;
                            ur6.e = false;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return vs7.a;
            case 24:
                fq6 fq6 = (fq6) this.x;
                int i7 = ((zn6) ((is7) ((aq4) this.y).getValue()).a).f;
                if (i7 == 0) {
                    i = 1;
                } else if (i7 != 1) {
                    i = 0;
                }
                fq6.e(i);
                return vs7.a;
            case 25:
                ad5 ad5 = (ad5) this.y;
                ad5.e(ad5.d() + 360.0f);
                ((sr2) this.x).b();
                return vs7.a;
            case 26:
                nw6 nw6 = (nw6) this.x;
                ib2 ib2 = (ib2) this.y;
                if (!sg3.e(nw6, ib2.a)) {
                    it0.i0(ib2.b, new ay5(15, (Object) nw6));
                    yx5 yx5 = ib2.c;
                    if (!(yx5 == null || (zx5 = yx5.a) == null)) {
                        zx5.p(yx5, (Object) null);
                    }
                }
                return vs7.a;
            case 27:
                SpeedOverlayService speedOverlayService = (SpeedOverlayService) this.x;
                d37 d375 = SpeedOverlayService.K;
                if (((float) ((WindowManager.LayoutParams) this.y).y) >= ((float) speedOverlayService.getResources().getDisplayMetrics().heightPixels) * 0.85f) {
                    speedOverlayService.stopSelf();
                } else {
                    d37 d376 = speedOverlayService.J;
                    Boolean bool2 = Boolean.FALSE;
                    d376.getClass();
                    d376.l((Object) null, bool2);
                }
                return vs7.a;
            case 28:
                Context context2 = (Context) this.x;
                o11 o11 = (o11) this.y;
                Double d2 = o11.h;
                d2.getClass();
                double doubleValue = d2.doubleValue();
                Double d3 = o11.i;
                d3.getClass();
                double doubleValue2 = d3.doubleValue();
                try {
                    Uri parse = Uri.parse("geo:" + doubleValue + "," + doubleValue2 + "?q=" + doubleValue + "," + doubleValue2);
                    parse.getClass();
                    context2.startActivity(new Intent("android.intent.action.VIEW", parse));
                } catch (Throwable unused) {
                }
                return vs7.a;
            default:
                ((aq4) this.y).setValue((q07) this.x);
                return vs7.a;
        }
    }

    public /* synthetic */ qm3(int i, Object obj, Object obj2) {
        this.w = i;
        this.x = obj;
        this.y = obj2;
    }
}
