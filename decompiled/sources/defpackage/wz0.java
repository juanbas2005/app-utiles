package defpackage;

import android.text.format.DateUtils;
import com.google.firebase.FirebaseException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import java.io.Serializable;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Optional;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: wz0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class wz0 {
    public static final int[] i = {2, 4, 8, 16, 32, 64, 128, 256};
    public final Object a;
    public Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public Object f;
    public Object g;
    public Object h;

    public wz0(int i2) {
        switch (i2) {
            case 3:
                long[] jArr = bg6.a;
                this.a = new tp4();
                up4 up4 = cg6.a;
                this.c = new up4();
                this.d = new ArrayList();
                this.e = new ArrayList();
                this.f = new ArrayList();
                this.g = new ArrayList();
                this.h = new ArrayList();
                return;
            case 4:
                Boolean bool = Boolean.FALSE;
                this.a = u55.p(bool);
                this.b = new ad5(1.0f);
                this.c = u55.p(bool);
                this.d = new ad5(1.0f);
                this.e = u55.p(bool);
                this.f = u55.p(new ql7(ql7.b));
                this.g = u55.p(bool);
                this.h = u55.p(new jt0(jt0.f));
                return;
            default:
                this.a = new LinkedHashSet();
                this.b = new LinkedHashSet();
                this.c = new LinkedHashSet();
                this.d = new LinkedHashSet();
                this.e = new LinkedHashSet();
                this.g = Optional.empty();
                this.h = Optional.empty();
                return;
        }
    }

    public static int i(int[] iArr, k24 k24, boolean z) {
        int h2 = k24.h();
        int b2 = k24.b() + h2;
        int i2 = 0;
        while (h2 < b2) {
            int F = x91.F(k24, z) + iArr[h2];
            iArr[h2] = F;
            i2 = Math.max(i2, F);
            h2++;
        }
        return i2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v19, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: java.lang.Long} */
    /* JADX WARNING: Multi-variable type inference failed */
    public vz0 a(String str, String str2, Date date, HashMap hashMap) {
        String str3;
        try {
            HttpURLConnection b2 = ((ConfigFetchHttpClient) this.f).b();
            ConfigFetchHttpClient configFetchHttpClient = (ConfigFetchHttpClient) this.f;
            HashMap f2 = f();
            Long l = null;
            String string = ((d01) this.g).a.getString("last_fetch_etag", (String) null);
            ac acVar = (ac) ((nu5) this.b).get();
            if (acVar != null) {
                l = ((bc) acVar).a.a.a((String) null, (String) null, true).get("_fot");
            }
            Long l2 = l;
            HashMap hashMap2 = hashMap;
            vz0 fetch = configFetchHttpClient.fetch(b2, str, str2, f2, string, hashMap2, l2, date, ((d01) this.g).b());
            sz0 sz0 = fetch.b;
            if (sz0 != null) {
                d01 d01 = (d01) this.g;
                long j = sz0.f;
                synchronized (d01.b) {
                    d01.a.edit().putLong("last_template_version", j).apply();
                }
            }
            String str4 = fetch.c;
            if (str4 != null) {
                d01 d012 = (d01) this.g;
                synchronized (d012.b) {
                    d012.a.edit().putString("last_fetch_etag", str4).apply();
                }
            }
            ((d01) this.g).d(0, d01.f);
            return fetch;
        } catch (FirebaseRemoteConfigServerException e2) {
            FirebaseRemoteConfigServerException firebaseRemoteConfigServerException = e2;
            int i2 = firebaseRemoteConfigServerException.w;
            d01 d013 = (d01) this.g;
            if (i2 == 429 || i2 == 502 || i2 == 503 || i2 == 504) {
                int i3 = d013.a().a + 1;
                long millis = TimeUnit.MINUTES.toMillis((long) i[Math.min(i3, 8) - 1]);
                d013.d(i3, new Date(date.getTime() + (millis / 2) + ((long) ((Random) this.d).nextInt((int) millis))));
            }
            c01 a2 = d013.a();
            int i4 = firebaseRemoteConfigServerException.w;
            if (a2.a > 1 || i4 == 429) {
                a2.b.getTime();
                throw new FirebaseException("Fetch was throttled.");
            }
            if (i4 == 401) {
                str3 = "The request did not have the required credentials. Please make sure your google-services.json is valid.";
            } else if (i4 == 403) {
                str3 = "The user is not authorized to access the project. Please make sure you are using the API key that corresponds to your Firebase project.";
            } else if (i4 == 429) {
                throw new FirebaseException("The throttled response from the server was not handled correctly by the FRC SDK.");
            } else if (i4 != 500) {
                switch (i4) {
                    case 502:
                    case 503:
                    case 504:
                        str3 = "The server is unavailable. Please try again later.";
                        break;
                    default:
                        str3 = "The server returned an unexpected error.";
                        break;
                }
            } else {
                str3 = "There was an internal server error.";
            }
            throw new FirebaseRemoteConfigServerException(firebaseRemoteConfigServerException.w, "Fetch failed: ".concat(str3), firebaseRemoteConfigServerException);
        } catch (Throwable th) {
            throw th;
        }
    }

    public yb9 b(yb9 yb9, long j, HashMap hashMap) {
        yb9 yb92;
        boolean z;
        Executor executor = (Executor) this.c;
        we2 we2 = (we2) this.a;
        d01 d01 = (d01) this.g;
        Date date = new Date(System.currentTimeMillis());
        Date date2 = null;
        if (yb9.k()) {
            Date date3 = new Date(d01.a.getLong("last_fetch_time_in_millis", -1));
            if (date3.equals(d01.e)) {
                z = false;
            } else {
                z = date.before(new Date(TimeUnit.SECONDS.toMillis(j) + date3.getTime()));
            }
            if (z) {
                return b35.l(new vz0(2, (sz0) null, (String) null));
            }
        }
        Date date4 = d01.a().b;
        if (date.before(date4)) {
            date2 = date4;
        }
        if (date2 != null) {
            date2.getTime();
            yb92 = b35.k(new FirebaseException("Fetch is throttled. Please wait before calling fetch again: " + DateUtils.formatElapsedTime((date2.getTime() - date.getTime()) / 1000)));
        } else {
            ve2 ve2 = (ve2) we2;
            yb9 c2 = ve2.c();
            yb9 d2 = ve2.d();
            yb92 = b35.B(c2, d2).g(executor, new uz0(this, c2, d2, date, hashMap));
        }
        return yb92.g(executor, new yv0(2, (Object) this, (Object) date));
    }

    public yb9 c(int i2) {
        HashMap hashMap = new HashMap((Map) this.h);
        hashMap.put("X-Firebase-RC-Fetch-Type", "REALTIME" + "/" + i2);
        return ((qz0) this.e).b().g((Executor) this.c, new yv0(3, (Object) this, (Object) hashMap));
    }

    public void d(int i2, Object obj) {
        f21.u(((tp4) this.a).g(obj));
    }

    public long e() {
        ArrayList arrayList = (ArrayList) this.h;
        if (arrayList.size() <= 0) {
            return 0;
        }
        f21.u(arrayList.get(0));
        throw null;
    }

    public HashMap f() {
        HashMap hashMap = new HashMap();
        ac acVar = (ac) ((nu5) this.b).get();
        if (acVar != null) {
            for (Map.Entry entry : ((bc) acVar).a.a.a((String) null, (String) null, false).entrySet()) {
                hashMap.put((String) entry.getKey(), entry.getValue().toString());
            }
        }
        return hashMap;
    }

    public void g(int i2, int i3, ArrayList arrayList, ig igVar, in8 in8, boolean z, boolean z2, int i4, boolean z3, int i5, int i6) {
        boolean z4;
        ArrayList arrayList2;
        boolean z5;
        ArrayList arrayList3;
        Throwable th;
        ArrayList arrayList4;
        ArrayList arrayList5;
        tp4 tp4;
        ArrayList arrayList6;
        ArrayList arrayList7;
        ArrayList arrayList8;
        ArrayList arrayList9;
        tp4 tp42;
        int i7;
        boolean z6;
        ArrayList arrayList10 = arrayList;
        ig igVar2 = igVar;
        boolean z7 = z;
        int i8 = i4;
        ArrayList arrayList11 = (ArrayList) this.e;
        ArrayList arrayList12 = (ArrayList) this.d;
        up4 up4 = (up4) this.c;
        Object obj = this.a;
        tp4 tp43 = (tp4) obj;
        ArrayList arrayList13 = (ArrayList) this.g;
        ArrayList arrayList14 = (ArrayList) this.f;
        ig igVar3 = (ig) this.b;
        this.b = igVar2;
        int size = arrayList10.size();
        int i9 = 0;
        while (i9 < size) {
            k24 k24 = (k24) arrayList10.get(i9);
            int size2 = k24.d().size();
            int i10 = 0;
            while (i10 < size2) {
                ((eh5) k24.d().get(i10)).B();
                i10++;
                obj = obj;
            }
            Object obj2 = obj;
            i9++;
        }
        Object obj3 = obj;
        if (tp43.i()) {
            h();
            return;
        }
        k24 k242 = (k24) dt0.y0(arrayList10);
        if (z2 || !z3) {
            z4 = true;
        } else {
            z4 = false;
        }
        Object[] objArr = tp43.b;
        long[] jArr = tp43.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            Object[] objArr2 = objArr;
            long[] jArr2 = jArr;
            int i11 = 0;
            while (true) {
                long j = jArr2[i11];
                arrayList2 = arrayList13;
                arrayList3 = arrayList14;
                if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    int i13 = 0;
                    while (i13 < i12) {
                        if ((j & 255) < 128) {
                            z6 = z4;
                            up4.a(objArr2[(i11 << 3) + i13]);
                        } else {
                            z6 = z4;
                        }
                        j >>= 8;
                        i13++;
                        z4 = z6;
                    }
                    z5 = z4;
                    if (i12 != 8) {
                        break;
                    }
                } else {
                    z5 = z4;
                }
                if (i11 == length) {
                    break;
                }
                i11++;
                arrayList13 = arrayList2;
                arrayList14 = arrayList3;
                z4 = z5;
            }
        } else {
            z5 = z4;
            arrayList2 = arrayList13;
            arrayList3 = arrayList14;
        }
        int size3 = arrayList10.size();
        for (int i14 = 0; i14 < size3; i14++) {
            k24 k243 = (k24) arrayList10.get(i14);
            up4.l(k243.getKey());
            int size4 = k243.d().size();
            for (int i15 = 0; i15 < size4; i15++) {
                ((eh5) k243.d().get(i15)).B();
            }
            f21.u(((tp4) obj3).k(k243.getKey()));
        }
        int[] iArr = new int[i8];
        Throwable th2 = null;
        if (z5 && igVar3 != null) {
            if (!arrayList12.isEmpty()) {
                if (arrayList12.size() > 1) {
                    ht0.g0(arrayList12, new e24(igVar3, 2));
                }
                if (arrayList12.size() <= 0) {
                    i7 = 0;
                    Arrays.fill(iArr, 0, i8, 0);
                } else {
                    k24 k244 = (k24) arrayList12.get(0);
                    i(iArr, k244, z7);
                    Object g2 = tp43.g(k244.getKey());
                    g2.getClass();
                    f21.u(g2);
                    k244.g(0);
                    throw null;
                }
            } else {
                i7 = 0;
            }
            if (!arrayList11.isEmpty()) {
                if (arrayList11.size() > 1) {
                    ht0.g0(arrayList11, new e24(igVar3, i7));
                }
                if (arrayList11.size() <= 0) {
                    Arrays.fill(iArr, i7, i8, i7);
                } else {
                    k24 k245 = (k24) arrayList11.get(i7);
                    i(iArr, k245, z7);
                    x91.F(k245, z7);
                    Object g3 = tp43.g(k245.getKey());
                    g3.getClass();
                    f21.u(g3);
                    k245.g(i7);
                    throw null;
                }
            }
        }
        Object[] objArr3 = up4.b;
        long[] jArr3 = up4.a;
        int length2 = jArr3.length - 2;
        if (length2 >= 0) {
            int i16 = 0;
            while (true) {
                long j2 = jArr3[i16];
                th = th2;
                tp4 tp44 = tp43;
                if ((((~j2) << 7) & j2 & -9187201950435737472L) != -9187201950435737472L) {
                    int i17 = 8 - ((~(i16 - length2)) >>> 31);
                    int i18 = 0;
                    while (i18 < i17) {
                        if ((j2 & 255) < 128) {
                            arrayList8 = arrayList11;
                            arrayList9 = arrayList12;
                            tp42 = tp44;
                            f21.u(tp42.g(objArr3[(i16 << 3) + i18]));
                        } else {
                            arrayList8 = arrayList11;
                            arrayList9 = arrayList12;
                            tp42 = tp44;
                        }
                        j2 >>= 8;
                        i18++;
                        tp44 = tp42;
                        arrayList12 = arrayList9;
                        arrayList11 = arrayList8;
                    }
                    arrayList4 = arrayList11;
                    arrayList5 = arrayList12;
                    tp4 = tp44;
                    if (i17 != 8) {
                        break;
                    }
                } else {
                    arrayList4 = arrayList11;
                    arrayList5 = arrayList12;
                    tp4 = tp44;
                }
                if (i16 == length2) {
                    break;
                }
                i16++;
                th2 = th;
                tp43 = tp4;
                arrayList12 = arrayList5;
                arrayList11 = arrayList4;
            }
        } else {
            arrayList4 = arrayList11;
            arrayList5 = arrayList12;
            th = null;
            tp4 = tp43;
        }
        if (!arrayList3.isEmpty()) {
            if (arrayList3.size() > 1) {
                arrayList6 = arrayList3;
                ht0.g0(arrayList6, new e24(igVar2, 3));
            } else {
                arrayList6 = arrayList3;
            }
            if (arrayList6.size() > 0) {
                k24 k246 = (k24) arrayList6.get(0);
                Object g4 = tp4.g(k246.getKey());
                g4.getClass();
                f21.u(g4);
                i(iArr, k246, z7);
                if (z2) {
                    ((k24) dt0.w0(arrayList10)).g(0);
                }
                throw th;
            }
            Arrays.fill(iArr, 0, i8, 0);
        } else {
            arrayList6 = arrayList3;
        }
        if (!arrayList2.isEmpty()) {
            if (arrayList2.size() > 1) {
                arrayList7 = arrayList2;
                ht0.g0(arrayList7, new e24(igVar2, 1));
            } else {
                arrayList7 = arrayList2;
            }
            if (arrayList7.size() > 0) {
                k24 k247 = (k24) arrayList7.get(0);
                Object g5 = tp4.g(k247.getKey());
                g5.getClass();
                f21.u(g5);
                i(iArr, k247, z7);
                x91.F(k247, z7);
                throw th;
            }
        } else {
            arrayList7 = arrayList2;
        }
        Collections.reverse(arrayList6);
        arrayList10.addAll(0, arrayList6);
        arrayList10.addAll(arrayList7);
        arrayList5.clear();
        arrayList4.clear();
        arrayList6.clear();
        arrayList7.clear();
        up4.b();
    }

    public void h() {
        tp4 tp4 = (tp4) this.a;
        if (tp4.j()) {
            Object[] objArr = tp4.c;
            long[] jArr = tp4.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j = jArr[i2];
                    if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                        int i3 = 8 - ((~(i2 - length)) >>> 31);
                        int i4 = 0;
                        while (i4 < i3) {
                            if ((255 & j) >= 128) {
                                j >>= 8;
                                i4++;
                            } else {
                                f21.u(objArr[(i2 << 3) + i4]);
                                throw null;
                            }
                        }
                        if (i3 != 8) {
                            break;
                        }
                    }
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
            tp4.a();
        }
    }

    public /* synthetic */ wz0(Object obj, Object obj2, Object obj3, Serializable serializable, Object obj4, Object obj5, Object obj6, Object obj7) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = serializable;
        this.e = obj4;
        this.f = obj5;
        this.g = obj6;
        this.h = obj7;
    }
}
