package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.wireguard.config.ParseException;
import com.wireguard.crypto.KeyFormatException;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

/* renamed from: v78  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class v78 {
    public final Context a;
    public final h81 b;
    public final z97 c = new z97(new fd7(7, (Object) this));
    public kz0 d;
    public final d37 e;
    public final xw5 f;
    public final d37 g;
    public final xw5 h;
    public final ay4 i;
    public final z97 j;

    public v78(Context context, h81 h81) {
        this.a = context;
        this.b = h81;
        d37 a2 = e37.a(Boolean.FALSE);
        this.e = a2;
        this.f = gr8.t(a2);
        d37 a3 = e37.a((Object) null);
        this.g = a3;
        this.h = gr8.t(a3);
        this.i = new ay4(15, this);
        this.j = new z97(new wi7(24));
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    public static final String a(v78 v78, Uri uri) {
        Object obj;
        Uri uri2;
        String str;
        Throwable th;
        Object obj2 = null;
        try {
            uri2 = uri;
            try {
                Cursor query = v78.a.getContentResolver().query(uri2, new String[]{"_display_name"}, (String) null, (String[]) null, (String) null);
                if (query != null) {
                    try {
                        if (query.moveToFirst()) {
                            obj = query.getString(0);
                        } else {
                            obj = null;
                        }
                        query.close();
                    } catch (Throwable th2) {
                        ed1.i(query, th);
                        throw th2;
                    }
                } else {
                    obj = null;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
            uri2 = uri;
            obj = new m66(th);
            if (!(obj instanceof m66)) {
            }
            str = (String) obj2;
            if (str != null) {
            }
        }
        if (!(obj instanceof m66)) {
            obj2 = obj;
        }
        str = (String) obj2;
        if (str != null) {
            return uri2.getLastPathSegment();
        }
        return str;
    }

    public static final void b(v78 v78) {
        Context context = v78.a;
        if (v78.d == null) {
            try {
                File file = new File(context.getFilesDir(), "wg_utiles.conf");
                if (file.exists()) {
                    File file2 = new File(context.getFilesDir(), "wg_utiles.name");
                    String str = null;
                    if (!file2.exists()) {
                        file2 = null;
                    }
                    if (file2 != null) {
                        String L = qd2.L(file2);
                        if (!d57.I0(L)) {
                            str = L;
                        }
                        if (str != null) {
                            v78.g(qd2.L(file), str, false);
                        }
                    }
                    str = "config guardada";
                    v78.g(qd2.L(file), str, false);
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0020  */
    public final Object c(h61 h61) {
        p78 p78;
        int i2;
        if (h61 instanceof p78) {
            p78 = (p78) h61;
            int i3 = p78.B;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                p78.B = i3 - Integer.MIN_VALUE;
                Object obj = p78.z;
                i2 = p78.B;
                if (i2 != 0) {
                    o85.q(obj);
                    q78 q78 = new q78(this, (f61) null, 0);
                    p78.B = 1;
                    obj = ar7.e0(this.b, q78, p78);
                    p81 p81 = p81.w;
                    if (obj == p81) {
                        return p81;
                    }
                } else if (i2 == 1) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return ((o66) obj).w;
            }
        }
        p78 = new p78(this, h61);
        Object obj2 = p78.z;
        i2 = p78.B;
        if (i2 != 0) {
        }
        return ((o66) obj2).w;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0020  */
    public final Object d(h61 h61) {
        r78 r78;
        int i2;
        if (h61 instanceof r78) {
            r78 = (r78) h61;
            int i3 = r78.B;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                r78.B = i3 - Integer.MIN_VALUE;
                Object obj = r78.z;
                i2 = r78.B;
                if (i2 != 0) {
                    o85.q(obj);
                    q78 q78 = new q78(this, (f61) null, 1);
                    r78.B = 1;
                    obj = ar7.e0(this.b, q78, r78);
                    p81 p81 = p81.w;
                    if (obj == p81) {
                        return p81;
                    }
                } else if (i2 == 1) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return ((o66) obj).w;
            }
        }
        r78 = new r78(this, h61);
        Object obj2 = r78.z;
        i2 = r78.B;
        if (i2 != 0) {
        }
        return ((o66) obj2).w;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0020  */
    public final Object e(h61 h61) {
        s78 s78;
        int i2;
        if (h61 instanceof s78) {
            s78 = (s78) h61;
            int i3 = s78.B;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                s78.B = i3 - Integer.MIN_VALUE;
                Object obj = s78.z;
                i2 = s78.B;
                if (i2 != 0) {
                    o85.q(obj);
                    q78 q78 = new q78(this, (f61) null, 2);
                    s78.B = 1;
                    obj = ar7.e0(this.b, q78, s78);
                    p81 p81 = p81.w;
                    if (obj == p81) {
                        return p81;
                    }
                } else if (i2 == 1) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return ((o66) obj).w;
            }
        }
        s78 = new s78(this, h61);
        Object obj2 = s78.z;
        i2 = s78.B;
        if (i2 != 0) {
        }
        return ((o66) obj2).w;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0020  */
    public final Object f(Uri uri, h61 h61) {
        t78 t78;
        int i2;
        if (h61 instanceof t78) {
            t78 = (t78) h61;
            int i3 = t78.B;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                t78.B = i3 - Integer.MIN_VALUE;
                Object obj = t78.z;
                i2 = t78.B;
                if (i2 != 0) {
                    o85.q(obj);
                    tc1 tc1 = new tc1(this, uri, (f61) null, 21);
                    t78.B = 1;
                    obj = ar7.e0(this.b, tc1, t78);
                    p81 p81 = p81.w;
                    if (obj == p81) {
                        return p81;
                    }
                } else if (i2 == 1) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return ((o66) obj).w;
            }
        }
        t78 = new t78(this, h61);
        Object obj2 = t78.z;
        i2 = t78.B;
        if (i2 != 0) {
        }
        return ((o66) obj2).w;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    public final o78 g(String str, String str2, boolean z) {
        Optional optional;
        Optional map;
        String str3;
        int i2;
        String str4;
        Optional optional2;
        Optional optional3;
        String str5 = str;
        Context context = this.a;
        byte[] bytes = str5.getBytes(mo0.a);
        bytes.getClass();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(bytes)));
        int i3 = 0;
        jz0 jz0 = new jz0(0);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        while (true) {
            String readLine = bufferedReader.readLine();
            int i4 = -1;
            if (readLine != null) {
                int indexOf = readLine.indexOf(35);
                if (indexOf != -1) {
                    readLine = readLine.substring(0, indexOf);
                }
                String trim = readLine.trim();
                if (!trim.isEmpty()) {
                    if (trim.startsWith("[")) {
                        if (z2) {
                            jz0.S(arrayList2);
                            arrayList2.clear();
                        }
                        if ("[Interface]".equalsIgnoreCase(trim)) {
                            z2 = false;
                            z3 = true;
                            z4 = true;
                        } else if ("[Peer]".equalsIgnoreCase(trim)) {
                            z4 = false;
                            z2 = true;
                        } else {
                            throw new Exception((Throwable) null);
                        }
                    } else if (z4) {
                        arrayList.add(trim);
                    } else if (z2) {
                        arrayList2.add(trim);
                    } else {
                        throw new Exception((Throwable) null);
                    }
                }
            } else {
                if (z2) {
                    jz0.S(arrayList2);
                }
                if (z3) {
                    int i5 = 2;
                    wz0 wz0 = new wz0(2);
                    LinkedHashSet linkedHashSet = (LinkedHashSet) wz0.d;
                    LinkedHashSet linkedHashSet2 = (LinkedHashSet) wz0.e;
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        zt ztVar = (zt) zt.a((CharSequence) it.next()).orElseThrow(new jf3(i3));
                        String str6 = ztVar.a;
                        String str7 = ztVar.b;
                        String lowerCase = str6.toLowerCase(Locale.ENGLISH);
                        lowerCase.getClass();
                        switch (lowerCase.hashCode()) {
                            case -2018040851:
                                if (lowerCase.equals("excludedapplications")) {
                                    i2 = i3;
                                    break;
                                }
                            case -1876040196:
                                if (lowerCase.equals("privatekey")) {
                                    i2 = 1;
                                    break;
                                }
                            case -1147692044:
                                if (lowerCase.equals("address")) {
                                    i2 = i5;
                                    break;
                                }
                            case 99625:
                                if (lowerCase.equals("dns")) {
                                    i2 = 3;
                                    break;
                                }
                            case 108462:
                                if (lowerCase.equals("mtu")) {
                                    i2 = 4;
                                    break;
                                }
                            case 496413663:
                                if (lowerCase.equals("includedapplications")) {
                                    i2 = 5;
                                    break;
                                }
                            case 874736328:
                                if (lowerCase.equals("listenport")) {
                                    i2 = 6;
                                    break;
                                }
                            default:
                                i2 = i4;
                                break;
                        }
                        switch (i2) {
                            case b85.b:
                                String[] split = zt.d.split(str7);
                                ArrayList arrayList3 = new ArrayList(split.length);
                                for (String str8 : split) {
                                    Objects.requireNonNull(str8);
                                    arrayList3.add(str8);
                                }
                                linkedHashSet.addAll(Collections.unmodifiableList(arrayList3));
                                break;
                            case 1:
                                try {
                                    wz0.f = new hv2(ns3.c(str7));
                                    break;
                                } catch (KeyFormatException e2) {
                                    throw new Exception(e2);
                                }
                            case 2:
                                try {
                                    for (String a2 : zt.d.split(str7)) {
                                        ((LinkedHashSet) wz0.a).add(hb3.a(a2));
                                    }
                                    break;
                                } catch (ParseException e3) {
                                    throw new Exception(e3);
                                }
                            case 3:
                                try {
                                    String[] split2 = zt.d.split(str7);
                                    int length = split2.length;
                                    for (int i6 = 0; i6 < length; i6++) {
                                        str4 = split2[i6];
                                        ((LinkedHashSet) wz0.b).add(eb3.a(str4));
                                    }
                                    continue;
                                } catch (ParseException e4) {
                                    if (e4.w != InetAddress.class || !eb3.c.matcher(str4).matches()) {
                                        throw e4;
                                    }
                                    ((LinkedHashSet) wz0.c).add(str4);
                                } catch (ParseException e5) {
                                    throw new Exception(e5);
                                }
                                break;
                            case 4:
                                try {
                                    int parseInt = Integer.parseInt(str7);
                                    if (parseInt >= 0) {
                                        if (parseInt == 0) {
                                            optional2 = Optional.empty();
                                        } else {
                                            optional2 = Optional.of(Integer.valueOf(parseInt));
                                        }
                                        wz0.h = optional2;
                                        break;
                                    } else {
                                        String.valueOf(parseInt);
                                        throw new Exception((Throwable) null);
                                    }
                                } catch (NumberFormatException e6) {
                                    throw new Exception(e6);
                                }
                            case 5:
                                String[] split3 = zt.d.split(str7);
                                ArrayList arrayList4 = new ArrayList(split3.length);
                                int length2 = split3.length;
                                while (i3 < length2) {
                                    String str9 = split3[i3];
                                    Objects.requireNonNull(str9);
                                    arrayList4.add(str9);
                                    i3++;
                                }
                                linkedHashSet2.addAll(Collections.unmodifiableList(arrayList4));
                                break;
                            case 6:
                                try {
                                    int parseInt2 = Integer.parseInt(str7);
                                    if (parseInt2 >= 0 && parseInt2 <= 65535) {
                                        if (parseInt2 == 0) {
                                            optional3 = Optional.empty();
                                        } else {
                                            optional3 = Optional.of(Integer.valueOf(parseInt2));
                                        }
                                        wz0.g = optional3;
                                        break;
                                    } else {
                                        String.valueOf(parseInt2);
                                        throw new Exception((Throwable) null);
                                    }
                                } catch (NumberFormatException e7) {
                                    throw new Exception(e7);
                                }
                                break;
                            default:
                                throw new Exception((Throwable) null);
                        }
                        i3 = 0;
                        i5 = 2;
                        i4 = -1;
                    }
                    if (((hv2) wz0.f) == null) {
                        throw new Exception((Throwable) null);
                    } else if (linkedHashSet2.isEmpty() || linkedHashSet.isEmpty()) {
                        jz0.y = new lf3(wz0);
                        kz0 kz0 = new kz0(jz0);
                        this.d = kz0;
                        String S0 = d57.S0(str2, ".conf");
                        List list = kz0.b;
                        list.getClass();
                        gf5 gf5 = (gf5) dt0.y0(list);
                        String str10 = "";
                        if (!(gf5 == null || (optional = gf5.b) == null || (map = optional.map(new ff5(new f08(24)))) == null || (str3 = (String) map.orElse(str10)) == null)) {
                            str10 = str3;
                        }
                        Set set = kz0.a.a;
                        set.getClass();
                        o78 o78 = new o78(S0, str10, dt0.E0(set, (String) null, (String) null, (String) null, new f08(25), 31));
                        d37 d37 = this.g;
                        d37.getClass();
                        d37.l((Object) null, o78);
                        if (z) {
                            try {
                                qd2.N(new File(context.getFilesDir(), "wg_utiles.conf"), str5);
                                qd2.N(new File(context.getFilesDir(), "wg_utiles.name"), S0);
                            } catch (Throwable unused) {
                            }
                        }
                        return o78;
                    } else {
                        throw new Exception((Throwable) null);
                    }
                } else {
                    throw new Exception((Throwable) null);
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0020  */
    public final Object h(h61 h61) {
        u78 u78;
        int i2;
        if (h61 instanceof u78) {
            u78 = (u78) h61;
            int i3 = u78.B;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                u78.B = i3 - Integer.MIN_VALUE;
                Object obj = u78.z;
                i2 = u78.B;
                if (i2 != 0) {
                    o85.q(obj);
                    q78 q78 = new q78(this, (f61) null, 3);
                    u78.B = 1;
                    obj = ar7.e0(this.b, q78, u78);
                    p81 p81 = p81.w;
                    if (obj == p81) {
                        return p81;
                    }
                } else if (i2 == 1) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return ((o66) obj).w;
            }
        }
        u78 = new u78(this, h61);
        Object obj2 = u78.z;
        i2 = u78.B;
        if (i2 != 0) {
        }
        return ((o66) obj2).w;
    }
}
