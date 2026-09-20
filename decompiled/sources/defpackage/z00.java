package defpackage;

import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* renamed from: z00  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class z00 {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;

    public z00(ws1 ws1, vq4 vq4, vj1 vj1, wv1 wv1, i48 i48, n80 n80, it1 it1, bk7 bk7, List list) {
        String str;
        vq4.getClass();
        vj1.getClass();
        i48.getClass();
        n80.getClass();
        list.getClass();
        this.a = ws1;
        this.b = vq4;
        this.c = vj1;
        this.d = wv1;
        this.e = i48;
        this.f = n80;
        this.g = it1;
        String str2 = "Deserializer for \"" + vj1.getName() + '\"';
        if (it1 != null) {
            str = it1.D();
        } else {
            str = "[container not found]";
        }
        this.h = new bk7(this, bk7, list, str2, str);
        this.i = new ei4(this);
    }

    public static void f(JSONObject jSONObject, String str) {
        StringBuilder o = b81.o(str);
        o.append(jSONObject.toString());
        String sb = o.toString();
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", sb, (Throwable) null);
        }
    }

    public z00 a(vj1 vj1, List list, vq4 vq4, wv1 wv1, i48 i48, n80 n80) {
        n80 n802 = n80;
        list.getClass();
        vq4.getClass();
        i48.getClass();
        n802.getClass();
        ws1 ws1 = (ws1) this.a;
        int i2 = n802.b;
        if ((i2 != 1 || n802.c < 4) && i2 <= 1) {
            i48 = (i48) this.e;
        }
        return new z00(ws1, vq4, vj1, wv1, i48, n802, (it1) this.g, (bk7) this.h, list);
    }

    public bo6 c(int i2) {
        bo6 bo6 = null;
        try {
            if (!b81.c(2, i2)) {
                JSONObject z = ((ji8) this.e).z();
                if (z != null) {
                    bo6 j = ((uy5) this.c).j(z);
                    f(z, "Loaded cached settings: ");
                    ((n63) this.d).getClass();
                    long currentTimeMillis = System.currentTimeMillis();
                    if (b81.c(3, i2) || j.c >= currentTimeMillis) {
                        try {
                            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                                Log.v("FirebaseCrashlytics", "Returning cached settings.", (Throwable) null);
                            }
                            return j;
                        } catch (Exception e2) {
                            e = e2;
                            bo6 = j;
                            Log.e("FirebaseCrashlytics", "Failed to get cached settings", e);
                            return bo6;
                        }
                    } else if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", "Cached settings have expired.", (Throwable) null);
                        return null;
                    }
                } else if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "No cached settings data found.", (Throwable) null);
                }
            }
            return null;
        } catch (Exception e3) {
            e = e3;
            Log.e("FirebaseCrashlytics", "Failed to get cached settings", e);
            return bo6;
        }
    }

    public bo6 d() {
        return (bo6) ((AtomicReference) this.h).get();
    }

    /* JADX WARNING: type inference failed for: r2v51, types: [java.lang.Object, z00] */
    /* JADX WARNING: type inference failed for: r3v21, types: [java.lang.Object, z00] */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x03ae A[Catch:{ IOException -> 0x03db }] */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x03c2 A[Catch:{ IOException -> 0x03db }] */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x03d0 A[Catch:{ IOException -> 0x03db }] */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x03dd  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0435  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x041b A[SYNTHETIC] */
    public void e(u10 u10, int i2) {
        long j;
        byte[] bArr;
        xy xyVar;
        int i3;
        int i4;
        String str;
        wr0 wr0;
        c9 c9Var;
        int i5;
        gm0 a2;
        URL url;
        int i6;
        xy xyVar2;
        String str2;
        Integer num;
        z00 z00;
        long j2;
        String str3;
        byte[] bArr2;
        z00 z002 = this;
        u10 u102 = u10;
        byte[] bArr3 = u102.b;
        za6 za6 = (za6) z002.f;
        bn7 a3 = ((hk4) z002.b).a(u102.a);
        long j3 = 0;
        while (((Boolean) za6.v(new ou7(z002, u102, 0))).booleanValue()) {
            Iterable<e10> iterable = (Iterable) za6.v(new ou7(z002, u102, 1));
            if (iterable.iterator().hasNext()) {
                if (a3 == null) {
                    dh4.i("Uploader", "Unknown backend for %s, deleting event batch for it...", u102);
                    xyVar = new xy(-1, 3);
                    bArr = bArr3;
                    j = j3;
                } else {
                    ArrayList arrayList = new ArrayList();
                    for (e10 e10 : iterable) {
                        arrayList.add(e10.c);
                    }
                    if (bArr3 != null) {
                        za6 za62 = (za6) z002.i;
                        Objects.requireNonNull(za62);
                        ur0 ur0 = (ur0) za6.v(new mu7(za62, 0));
                        o00 o00 = new o00();
                        o00.i = new HashMap();
                        o00.g = Long.valueOf(((es0) z002.g).b());
                        o00.h = Long.valueOf(((es0) z002.h).b());
                        o00.b = "GDT_CLIENT_METRICS";
                        m42 m42 = new m42("proto");
                        ur0.getClass();
                        cf4 cf4 = ut5.a;
                        cf4.getClass();
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        try {
                            cf4.e(ur0, byteArrayOutputStream);
                        } catch (IOException unused) {
                        }
                        o00.f = new i42(m42, byteArrayOutputStream.toByteArray());
                        arrayList.add(((hm0) a3).a(o00.c()));
                    }
                    hm0 hm0 = (hm0) a3;
                    HashMap hashMap = new HashMap();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        p00 p00 = (p00) it.next();
                        String str4 = p00.a;
                        if (!hashMap.containsKey(str4)) {
                            ArrayList arrayList2 = new ArrayList();
                            arrayList2.add(p00);
                            hashMap.put(str4, arrayList2);
                        } else {
                            ((List) hashMap.get(str4)).add(p00);
                        }
                    }
                    ArrayList arrayList3 = new ArrayList();
                    for (Map.Entry entry : hashMap.entrySet()) {
                        p00 p002 = (p00) ((List) entry.getValue()).get(0);
                        yu5 yu5 = yu5.w;
                        long b2 = hm0.f.b();
                        long b3 = hm0.e.b();
                        zy zyVar = new zy(new wy(Integer.valueOf(p002.b("sdk-version")), p002.a("model"), p002.a("hardware"), p002.a("device"), p002.a("product"), p002.a("os-uild"), p002.a("manufacturer"), p002.a("fingerprint"), p002.a("locale"), p002.a("country"), p002.a("mcc_mnc"), p002.a("application_build")));
                        try {
                            num = Integer.valueOf(Integer.parseInt((String) entry.getKey()));
                            str2 = null;
                        } catch (NumberFormatException unused2) {
                            str2 = (String) entry.getKey();
                            num = null;
                        }
                        ArrayList arrayList4 = new ArrayList();
                        for (p00 p003 : (List) entry.getValue()) {
                            byte[] bArr4 = bArr3;
                            i42 i42 = p003.c;
                            byte[] bArr5 = p003.j;
                            m42 m422 = i42.a;
                            byte[] bArr6 = i42.b;
                            long j4 = j3;
                            if (m422.equals(new m42("proto"))) {
                                ? obj = new Object();
                                obj.f = bArr6;
                                z00 = obj;
                            } else if (m422.equals(new m42("json"))) {
                                String str5 = new String(bArr6, Charset.forName("UTF-8"));
                                ? obj2 = new Object();
                                obj2.g = str5;
                                z00 = obj2;
                            } else {
                                String r = dh4.r("CctTransportBackend");
                                if (Log.isLoggable(r, 5)) {
                                    Log.w(r, "Received event of unsupported encoding " + m422 + ". Skipping...");
                                }
                                u10 u103 = u10;
                                bArr3 = bArr4;
                                j3 = j4;
                            }
                            z00.a = Long.valueOf(p003.d);
                            z00.b = Long.valueOf(p003.e);
                            String str6 = (String) p003.f.get("tz-offset");
                            if (str6 == null) {
                                j2 = 0;
                            } else {
                                j2 = Long.valueOf(str6).longValue();
                            }
                            z00.c = Long.valueOf(j2);
                            z00.h = new d10((hy4) hy4.w.get(p003.b("net-type")), (gy4) gy4.w.get(p003.b("mobile-subtype")));
                            Integer num2 = p003.b;
                            if (num2 != null) {
                                z00.d = num2;
                            }
                            Integer num3 = p003.g;
                            if (num3 != null) {
                                t00 t00 = new t00(new s00(num3));
                                bv0 bv0 = bv0.w;
                                z00.e = new az(t00);
                            }
                            byte[] bArr7 = p003.i;
                            if (!(bArr7 == null && bArr5 == null)) {
                                if (bArr7 == null) {
                                    bArr7 = null;
                                }
                                if (bArr5 != null) {
                                    bArr2 = bArr5;
                                } else {
                                    bArr2 = null;
                                }
                                z00.i = new r00(bArr7, bArr2);
                            }
                            if (((Long) z00.a) == null) {
                                str3 = " eventTimeMs";
                            } else {
                                str3 = "";
                            }
                            if (((Long) z00.b) == null) {
                                str3 = str3.concat(" eventUptimeMs");
                            }
                            if (((Long) z00.c) == null) {
                                str3 = str3.concat(" timezoneOffsetSeconds");
                            }
                            if (str3.isEmpty()) {
                                arrayList4.add(new a10(((Long) z00.a).longValue(), (Integer) z00.d, (az) z00.e, ((Long) z00.b).longValue(), (byte[]) z00.f, (String) z00.g, ((Long) z00.c).longValue(), (d10) z00.h, (r00) z00.i));
                                u10 u1032 = u10;
                                bArr3 = bArr4;
                                j3 = j4;
                            } else {
                                h.s("Missing required properties:".concat(str3));
                                return;
                            }
                        }
                        byte[] bArr8 = bArr3;
                        long j5 = j3;
                        arrayList3.add(new b10(b2, b3, zyVar, num, str2, arrayList4));
                        u10 u104 = u10;
                    }
                    bArr = bArr3;
                    j = j3;
                    yy yyVar = new yy(arrayList3);
                    URL url2 = hm0.d;
                    if (bArr != null) {
                        try {
                            hg0 a4 = hg0.a(bArr);
                            str = a4.b;
                            if (str == null) {
                                str = null;
                            }
                            String str7 = a4.a;
                            if (str7 != null) {
                                url2 = hm0.b(str7);
                            }
                            try {
                                wr0 = new wr0((Object) url2, (Object) yyVar, (Object) str, 13);
                                c9Var = new c9(1, hm0);
                                i5 = 5;
                                do {
                                    a2 = c9Var.a(wr0);
                                    url = (URL) a2.c;
                                    if (url != null) {
                                        dh4.i("CctTransportBackend", "Following redirect to: %s", url);
                                        wr0 = new wr0((Object) url, (Object) (yy) wr0.y, (Object) (String) wr0.z, 13);
                                    } else {
                                        wr0 = null;
                                    }
                                    if (wr0 == null || i5 - 1 >= 1) {
                                        i6 = a2.b;
                                    }
                                    a2 = c9Var.a(wr0);
                                    url = (URL) a2.c;
                                    if (url != null) {
                                    }
                                    break;
                                } while (i5 - 1 >= 1);
                                i6 = a2.b;
                                if (i6 != 200) {
                                    xyVar = new xy(a2.a, 1);
                                } else if (i6 >= 500 || i6 == 404) {
                                    xyVar2 = new xy(-1, 2);
                                } else if (i6 == 400) {
                                    try {
                                        xyVar2 = new xy(-1, 4);
                                    } catch (IOException e2) {
                                        e = e2;
                                        dh4.l("CctTransportBackend", "Could not make request to the backend", e);
                                        i3 = 2;
                                        xyVar = new xy(-1, 2);
                                        i4 = xyVar.a;
                                        if (i4 == i3) {
                                        }
                                    }
                                } else {
                                    xyVar2 = new xy(-1, 3);
                                }
                            } catch (IOException e3) {
                                e = e3;
                                dh4.l("CctTransportBackend", "Could not make request to the backend", e);
                                i3 = 2;
                                xyVar = new xy(-1, 2);
                                i4 = xyVar.a;
                                if (i4 == i3) {
                                }
                            }
                        } catch (IllegalArgumentException unused3) {
                            xyVar2 = new xy(-1, 3);
                        }
                    } else {
                        str = null;
                        wr0 = new wr0((Object) url2, (Object) yyVar, (Object) str, 13);
                        c9Var = new c9(1, hm0);
                        i5 = 5;
                        do {
                            a2 = c9Var.a(wr0);
                            url = (URL) a2.c;
                            if (url != null) {
                            }
                            break;
                            break;
                        } while (i5 - 1 >= 1);
                        i6 = a2.b;
                        if (i6 != 200) {
                        }
                    }
                    xyVar = xyVar2;
                }
                i3 = 2;
                i4 = xyVar.a;
                if (i4 == i3) {
                    u10 u105 = u10;
                    za6.v(new yo1(this, iterable, u105, j));
                    ((wr0) this.d).Z(u105, i2 + 1, true);
                    return;
                }
                z002 = this;
                u102 = u10;
                Iterable<e10> iterable2 = iterable;
                j3 = j;
                za6.v(new yv0(16, (Object) z002, (Object) iterable2));
                if (i4 == 1) {
                    j3 = Math.max(j3, xyVar.b);
                    if (bArr != null) {
                        za6.v(new c9(18, z002));
                    }
                } else if (i4 == 4) {
                    HashMap hashMap2 = new HashMap();
                    for (e10 e102 : iterable2) {
                        String str8 = e102.c.a;
                        if (!hashMap2.containsKey(str8)) {
                            hashMap2.put(str8, 1);
                        } else {
                            hashMap2.put(str8, Integer.valueOf(((Integer) hashMap2.get(str8)).intValue() + 1));
                        }
                    }
                    za6.v(new yv0(17, (Object) z002, (Object) hashMap2));
                }
                bArr3 = bArr;
            } else {
                return;
            }
        }
        za6.v(new tz0((Object) z002, (Object) u102, j3));
    }
}
