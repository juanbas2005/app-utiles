package defpackage;

import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.security.MessageDigest;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.zip.GZIPOutputStream;

/* renamed from: y89  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class y89 extends g89 {
    public long A;
    public long z;

    public static boolean G1(String str) {
        if (str == null || !str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") || str.length() > 310) {
            return false;
        }
        return true;
    }

    public static boolean H1(yl8 yl8, int i) {
        if (i >= ((dm8) yl8).y * 64) {
            return false;
        }
        if (((1 << (i % 64)) & ((Long) ((dm8) yl8).get(i / 64)).longValue()) != 0) {
            return true;
        }
        return false;
    }

    public static ArrayList I1(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            long j = 0;
            for (int i2 = 0; i2 < 64; i2++) {
                int i3 = (i * 64) + i2;
                if (i3 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i3)) {
                    j |= 1 << i2;
                }
            }
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    public static ll8 N1(ll8 ll8, byte[] bArr) {
        gl8 a = gl8.a();
        if (a != null) {
            ll8.getClass();
            ll8.f(bArr, bArr.length, a);
            return ll8;
        }
        ll8.getClass();
        int length = bArr.length;
        int i = rk8.a;
        ll8.f(bArr, length, gl8.b);
        return ll8;
    }

    public static int O1(String str, x19 x19) {
        for (int i = 0; i < ((b29) x19.x).a2(); i++) {
            if (str.equals(((b29) x19.x).b2(i).v())) {
                return i;
            }
        }
        return -1;
    }

    public static Bundle[] P1(zl8 zl8) {
        ArrayList arrayList = new ArrayList();
        Iterator it = zl8.iterator();
        while (it.hasNext()) {
            n19 n19 = (n19) it.next();
            if (n19 != null) {
                Bundle bundle = new Bundle();
                for (n19 n192 : n19.D()) {
                    if (n192.v()) {
                        bundle.putString(n192.u(), n192.w());
                    } else if (n192.x()) {
                        bundle.putLong(n192.u(), n192.y());
                    } else if (n192.B()) {
                        bundle.putDouble(n192.u(), n192.C());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    public static HashMap Q1(Bundle bundle, boolean z2) {
        HashMap hashMap = new HashMap();
        for (String next : bundle.keySet()) {
            Object obj = bundle.get(next);
            boolean z3 = obj instanceof Parcelable[];
            if (z3 || (obj instanceof ArrayList) || (obj instanceof Bundle)) {
                if (z2) {
                    ArrayList arrayList = new ArrayList();
                    if (z3) {
                        for (Parcelable parcelable : (Parcelable[]) obj) {
                            if (parcelable instanceof Bundle) {
                                arrayList.add(Q1((Bundle) parcelable, false));
                            }
                        }
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList2 = (ArrayList) obj;
                        int size = arrayList2.size();
                        for (int i = 0; i < size; i++) {
                            Object obj2 = arrayList2.get(i);
                            if (obj2 instanceof Bundle) {
                                arrayList.add(Q1((Bundle) obj2, false));
                            }
                        }
                    } else if (obj instanceof Bundle) {
                        arrayList.add(Q1((Bundle) obj, false));
                    }
                    hashMap.put(next, arrayList);
                }
            } else if (obj != null) {
                hashMap.put(next, obj);
            }
        }
        return hashMap;
    }

    public static zr8 g1(wi8 wi8) {
        String str;
        Object obj;
        Bundle h1 = h1(wi8.c, true);
        if (!h1.containsKey("_o") || (obj = h1.get("_o")) == null) {
            str = "app";
        } else {
            str = obj.toString();
        }
        String str2 = str;
        String G = b35.G(wi8.a, r16.T, r16.Y);
        if (G == null) {
            G = wi8.a;
        }
        return new zr8(G, new ur8(h1), str2, wi8.b, 0);
    }

    public static Bundle h1(Map map, boolean z2) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj == null) {
                bundle.putString(str, (String) null);
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (!(obj instanceof ArrayList)) {
                bundle.putString(str, obj.toString());
            } else if (z2) {
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    arrayList2.add(h1((Map) arrayList.get(i), false));
                }
                bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
            }
        }
        return bundle;
    }

    public static final void k1(f19 f19, String str, Long l) {
        List g = f19.g();
        int i = 0;
        while (true) {
            if (i >= g.size()) {
                i = -1;
                break;
            } else if (str.equals(((n19) g.get(i)).u())) {
                break;
            } else {
                i++;
            }
        }
        l19 F = n19.F();
        F.g(str);
        F.i(l.longValue());
        if (i >= 0) {
            f19.b();
            ((h19) f19.x).K(i, (n19) F.d());
            return;
        }
        f19.k(F);
    }

    public static final Bundle l1(List list) {
        Bundle bundle = new Bundle();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            n19 n19 = (n19) it.next();
            String u = n19.u();
            if (n19.B()) {
                bundle.putDouble(u, n19.C());
            } else if (n19.z()) {
                bundle.putFloat(u, n19.A());
            } else if (n19.v()) {
                bundle.putString(u, n19.w());
            } else if (n19.x()) {
                bundle.putLong(u, n19.y());
            }
        }
        return bundle;
    }

    public static final n19 m1(String str, h19 h19) {
        for (n19 n19 : h19.v()) {
            if (n19.u().equals(str)) {
                return n19;
            }
        }
        return null;
    }

    public static final String n1(String str, Map map) {
        if (map == null) {
            return null;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (str.equalsIgnoreCase((String) entry.getKey())) {
                if (entry.getValue() == null || ((List) entry.getValue()).isEmpty()) {
                    return null;
                }
                return (String) ((List) entry.getValue()).get(0);
            }
        }
        return null;
    }

    public static final Serializable o1(String str, h19 h19) {
        n19 m1 = m1(str, h19);
        if (m1 == null) {
            return null;
        }
        return u1(m1);
    }

    public static final void r1(int i, StringBuilder sb) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
    }

    public static final void s1(Uri.Builder builder, String str, String str2, HashSet hashSet) {
        if (!hashSet.contains(str) && !TextUtils.isEmpty(str2)) {
            builder.appendQueryParameter(str, str2);
        }
    }

    public static final String t1(boolean z2, boolean z3, boolean z4) {
        StringBuilder sb = new StringBuilder();
        if (z2) {
            sb.append("Dynamic ");
        }
        if (z3) {
            sb.append("Sequence ");
        }
        if (z4) {
            sb.append("Session-Scoped ");
        }
        return sb.toString();
    }

    /* JADX WARNING: type inference failed for: r2v3, types: [android.os.Bundle[], java.io.Serializable] */
    public static final Serializable u1(n19 n19) {
        if (n19.v()) {
            return n19.w();
        }
        if (n19.x()) {
            return Long.valueOf(n19.y());
        }
        if (n19.B()) {
            return Double.valueOf(n19.C());
        }
        if (n19.E() > 0) {
            return P1(n19.D());
        }
        return null;
    }

    public static final void v1(Uri.Builder builder, String[] strArr, Bundle bundle, HashSet hashSet) {
        for (String split : strArr) {
            String[] split2 = split.split(",");
            String str = split2[0];
            String str2 = split2[split2.length - 1];
            String string = bundle.getString(str);
            if (string != null) {
                s1(builder, str2, string, hashSet);
            }
        }
    }

    public static final void w1(StringBuilder sb, String str, f29 f29) {
        Integer num;
        Integer num2;
        Long l;
        if (f29 != null) {
            r1(3, sb);
            sb.append(str);
            sb.append(" {\n");
            if (f29.w() != 0) {
                r1(4, sb);
                sb.append("results: ");
                int i = 0;
                for (Long l2 : f29.v()) {
                    int i2 = i + 1;
                    if (i != 0) {
                        sb.append(", ");
                    }
                    sb.append(l2);
                    i = i2;
                }
                sb.append(10);
            }
            if (f29.u() != 0) {
                r1(4, sb);
                sb.append("status: ");
                int i3 = 0;
                for (Long l3 : f29.t()) {
                    int i4 = i3 + 1;
                    if (i3 != 0) {
                        sb.append(", ");
                    }
                    sb.append(l3);
                    i3 = i4;
                }
                sb.append(10);
            }
            if (f29.y() != 0) {
                r1(4, sb);
                sb.append("dynamic_filter_timestamps: {");
                int i5 = 0;
                for (e19 e19 : f29.x()) {
                    int i6 = i5 + 1;
                    if (i5 != 0) {
                        sb.append(", ");
                    }
                    if (e19.t()) {
                        num2 = Integer.valueOf(e19.u());
                    } else {
                        num2 = null;
                    }
                    sb.append(num2);
                    sb.append(":");
                    if (e19.v()) {
                        l = Long.valueOf(e19.w());
                    } else {
                        l = null;
                    }
                    sb.append(l);
                    i5 = i6;
                }
                sb.append("}\n");
            }
            if (f29.A() != 0) {
                r1(4, sb);
                sb.append("sequence_filter_timestamps: {");
                int i7 = 0;
                for (i29 i29 : f29.z()) {
                    int i8 = i7 + 1;
                    if (i7 != 0) {
                        sb.append(", ");
                    }
                    if (i29.t()) {
                        num = Integer.valueOf(i29.u());
                    } else {
                        num = null;
                    }
                    sb.append(num);
                    sb.append(": [");
                    int i9 = 0;
                    for (Long longValue : i29.v()) {
                        long longValue2 = longValue.longValue();
                        int i10 = i9 + 1;
                        if (i9 != 0) {
                            sb.append(", ");
                        }
                        sb.append(longValue2);
                        i9 = i10;
                    }
                    sb.append("]");
                    i7 = i8;
                }
                sb.append("}\n");
            }
            r1(3, sb);
            sb.append("}\n");
        }
    }

    public static final void x1(StringBuilder sb, int i, String str, Object obj) {
        if (obj != null) {
            r1(i + 1, sb);
            sb.append(str);
            sb.append(": ");
            sb.append(obj);
            sb.append(10);
        }
    }

    public static final void y1(StringBuilder sb, int i, String str, ux8 ux8) {
        String str2;
        if (ux8 != null) {
            r1(i, sb);
            sb.append(str);
            sb.append(" {\n");
            if (ux8.t()) {
                int D = ux8.D();
                if (D == 1) {
                    str2 = "UNKNOWN_COMPARISON_TYPE";
                } else if (D == 2) {
                    str2 = "LESS_THAN";
                } else if (D == 3) {
                    str2 = "GREATER_THAN";
                } else if (D != 4) {
                    str2 = "BETWEEN";
                } else {
                    str2 = "EQUAL";
                }
                x1(sb, i, "comparison_type", str2);
            }
            if (ux8.u()) {
                x1(sb, i, "match_as_float", Boolean.valueOf(ux8.v()));
            }
            if (ux8.w()) {
                x1(sb, i, "comparison_value", ux8.x());
            }
            if (ux8.y()) {
                x1(sb, i, "min_comparison_value", ux8.z());
            }
            if (ux8.A()) {
                x1(sb, i, "max_comparison_value", ux8.B());
            }
            r1(i, sb);
            sb.append("}\n");
        }
    }

    public final void A1(l19 l19, Object obj) {
        l19.b();
        ((n19) l19.x).I();
        l19.b();
        ((n19) l19.x).K();
        l19.b();
        ((n19) l19.x).M();
        l19.b();
        ((n19) l19.x).P();
        if (obj instanceof String) {
            l19.h((String) obj);
        } else if (obj instanceof Long) {
            l19.i(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            l19.b();
            ((n19) l19.x).L(doubleValue);
        } else if (obj instanceof Bundle[]) {
            ArrayList arrayList = new ArrayList();
            for (Bundle bundle : (Bundle[]) obj) {
                if (bundle != null) {
                    l19 F = n19.F();
                    for (String next : bundle.keySet()) {
                        l19 F2 = n19.F();
                        F2.g(next);
                        Object obj2 = bundle.get(next);
                        if (obj2 instanceof Long) {
                            F2.i(((Long) obj2).longValue());
                        } else if (obj2 instanceof String) {
                            F2.h((String) obj2);
                        } else if (obj2 instanceof Double) {
                            double doubleValue2 = ((Double) obj2).doubleValue();
                            F2.b();
                            ((n19) F2.x).L(doubleValue2);
                        }
                        F.b();
                        ((n19) F.x).N((n19) F2.d());
                    }
                    if (((n19) F.x).E() > 0) {
                        arrayList.add((n19) F.d());
                    }
                }
            }
            l19.b();
            ((n19) l19.x).O(arrayList);
        } else {
            pz8 pz8 = ((y19) this.w).B;
            y19.g(pz8);
            pz8.B.b("Ignoring invalid (type) event param value", obj);
        }
    }

    public final u79 B1(String str, x19 x19, f19 f19, String str2) {
        int indexOf;
        String str3 = str;
        x19 x192 = x19;
        wo8.a();
        y19 y19 = (y19) this.w;
        tp8 tp8 = y19.z;
        if (!tp8.n1(str3, by8.O0)) {
            return null;
        }
        y19.G.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        HashSet hashSet = new HashSet(Arrays.asList(tp8.j1(str3, by8.t0).split(",")));
        v89 v89 = this.x;
        k89 k89 = v89.F;
        j19 j19 = v89.w;
        j19 j192 = k89.x.w;
        v89.R(j192);
        String p1 = j192.p1(str3);
        Uri.Builder builder = new Uri.Builder();
        tp8 tp82 = ((y19) k89.w).z;
        builder.scheme(tp82.j1(str3, by8.m0));
        if (!TextUtils.isEmpty(p1)) {
            String j1 = tp82.j1(str3, by8.n0);
            StringBuilder sb = new StringBuilder(String.valueOf(p1).length() + 1 + String.valueOf(j1).length());
            sb.append(p1);
            sb.append(".");
            sb.append(j1);
            builder.authority(sb.toString());
        } else {
            builder.authority(tp82.j1(str3, by8.n0));
        }
        builder.path(tp82.j1(str3, by8.o0));
        s1(builder, "gmp_app_id", ((b29) x192.x).I(), hashSet);
        tp8.i1();
        s1(builder, "gmp_version", String.valueOf(161000), hashSet);
        String C = ((b29) x192.x).C();
        ay8 ay8 = by8.R0;
        if (tp8.n1(str3, ay8)) {
            v89.R(j19);
            if (j19.w1(str3)) {
                C = "";
            }
        }
        s1(builder, "app_instance_id", C, hashSet);
        s1(builder, "rdid", ((b29) x192.x).z(), hashSet);
        s1(builder, "bundle_id", x192.n(), hashSet);
        String m = f19.m();
        String G = b35.G(m, r16.Y, r16.T);
        if (true != TextUtils.isEmpty(G)) {
            m = G;
        }
        s1(builder, "app_event_name", m, hashSet);
        s1(builder, "app_version", String.valueOf(((b29) x192.x).O()), hashSet);
        String n2 = ((b29) x192.x).n2();
        if (tp8.n1(str3, ay8)) {
            v89.R(j19);
            if (j19.v1(str3) && !TextUtils.isEmpty(n2) && (indexOf = n2.indexOf(".")) != -1) {
                n2 = n2.substring(0, indexOf);
            }
        }
        s1(builder, "os_version", n2, hashSet);
        s1(builder, "timestamp", String.valueOf(f19.o()), hashSet);
        String str4 = "1";
        if (((b29) x192.x).B()) {
            s1(builder, "lat", str4, hashSet);
        }
        s1(builder, "privacy_sandbox_version", String.valueOf(((b29) x192.x).K0()), hashSet);
        s1(builder, "trigger_uri_source", str4, hashSet);
        s1(builder, "trigger_uri_timestamp", String.valueOf(currentTimeMillis), hashSet);
        s1(builder, "request_uuid", str2, hashSet);
        List<n19> g = f19.g();
        Bundle bundle = new Bundle();
        for (n19 n19 : g) {
            String u = n19.u();
            if (n19.B()) {
                bundle.putString(u, String.valueOf(n19.C()));
            } else if (n19.z()) {
                bundle.putString(u, String.valueOf(n19.A()));
            } else if (n19.v()) {
                bundle.putString(u, n19.w());
            } else if (n19.x()) {
                bundle.putString(u, String.valueOf(n19.y()));
            }
        }
        v1(builder, tp8.j1(str3, by8.s0).split("\\|"), bundle, hashSet);
        List<m29> unmodifiableList = Collections.unmodifiableList(((b29) x192.x).Z1());
        Bundle bundle2 = new Bundle();
        for (m29 m29 : unmodifiableList) {
            String v = m29.v();
            if (m29.C()) {
                bundle2.putString(v, String.valueOf(m29.D()));
            } else if (m29.A()) {
                bundle2.putString(v, String.valueOf(m29.B()));
            } else if (m29.w()) {
                bundle2.putString(v, m29.x());
            } else if (m29.y()) {
                bundle2.putString(v, String.valueOf(m29.z()));
            }
        }
        v1(builder, tp8.j1(str3, by8.r0).split("\\|"), bundle2, hashSet);
        if (true != ((b29) x192.x).H0()) {
            str4 = "0";
        }
        s1(builder, "dma", str4, hashSet);
        if (!((b29) x192.x).J0().isEmpty()) {
            s1(builder, "dma_cps", ((b29) x192.x).J0(), hashSet);
        }
        if (((b29) x192.x).P0()) {
            e09 Q0 = ((b29) x192.x).Q0();
            if (!Q0.H().isEmpty()) {
                s1(builder, "dl_gclid", Q0.H(), hashSet);
            }
            if (!Q0.J().isEmpty()) {
                s1(builder, "dl_gbraid", Q0.J(), hashSet);
            }
            if (!Q0.L().isEmpty()) {
                s1(builder, "dl_gs", Q0.L(), hashSet);
            }
            if (Q0.N() > 0) {
                s1(builder, "dl_ss_ts", String.valueOf(Q0.N()), hashSet);
            }
            if (!Q0.P().isEmpty()) {
                s1(builder, "mr_gclid", Q0.P(), hashSet);
            }
            if (!Q0.R().isEmpty()) {
                s1(builder, "mr_gbraid", Q0.R(), hashSet);
            }
            if (!Q0.T().isEmpty()) {
                s1(builder, "mr_gs", Q0.T(), hashSet);
            }
            if (Q0.V() > 0) {
                s1(builder, "mr_click_ts", String.valueOf(Q0.V()), hashSet);
            }
        }
        return new u79(1, currentTimeMillis, builder.build().toString());
    }

    public final h19 C1(or8 or8) {
        f19 J = h19.J();
        long j = or8.f;
        J.b();
        ((h19) J.x).R(j);
        long j2 = or8.e;
        J.b();
        ((h19) J.x).t(j2);
        ur8 ur8 = or8.g;
        Objects.requireNonNull(ur8);
        Bundle bundle = ur8.w;
        for (String next : bundle.keySet()) {
            l19 F = n19.F();
            F.g(next);
            Object obj = bundle.get(next);
            z65.k(obj);
            A1(F, obj);
            J.k(F);
        }
        String str = or8.c;
        if (!TextUtils.isEmpty(str) && bundle.get("_o") == null) {
            l19 F2 = n19.F();
            F2.g("_o");
            F2.h(str);
            J.j((n19) F2.d());
        }
        return (h19) J.d();
    }

    public final String D1(w19 w19) {
        Long l;
        Long l2;
        Double d;
        String str;
        String str2;
        String str3;
        String str4;
        k09 M0;
        StringBuilder o = b81.o("\nbatch {\n");
        if (w19.y()) {
            x1(o, 0, "upload_subdomain", w19.z());
        }
        if (w19.w()) {
            x1(o, 0, "sgtm_join_id", w19.x());
        }
        for (b29 b29 : w19.t()) {
            if (b29 != null) {
                r1(1, o);
                o.append("bundle {\n");
                if (b29.T()) {
                    x1(o, 1, "protocol_version", Integer.valueOf(b29.T0()));
                }
                fp8 fp8 = (fp8) ep8.x.w.w;
                y19 y19 = (y19) this.w;
                tp8 tp8 = y19.z;
                fz8 fz8 = y19.F;
                if (tp8.n1(b29.t(), by8.M0) && b29.z0()) {
                    x1(o, 1, "session_stitching_token", b29.A0());
                }
                x1(o, 1, "platform", b29.m2());
                if (b29.v()) {
                    x1(o, 1, "gmp_version", Long.valueOf(b29.w()));
                }
                if (b29.x()) {
                    x1(o, 1, "uploading_gmp_version", Long.valueOf(b29.y()));
                }
                if (b29.v0()) {
                    x1(o, 1, "dynamite_version", Long.valueOf(b29.w0()));
                }
                if (b29.P()) {
                    x1(o, 1, "config_version", Long.valueOf(b29.Q()));
                }
                x1(o, 1, "gmp_app_id", b29.I());
                x1(o, 1, "app_id", b29.t());
                x1(o, 1, "app_version", b29.u());
                if (b29.N()) {
                    x1(o, 1, "app_version_major", Integer.valueOf(b29.O()));
                }
                x1(o, 1, "firebase_instance_id", b29.M());
                if (b29.D()) {
                    x1(o, 1, "dev_cert_hash", Long.valueOf(b29.E()));
                }
                x1(o, 1, "app_store", b29.s2());
                if (b29.c2()) {
                    x1(o, 1, "upload_timestamp_millis", Long.valueOf(b29.d2()));
                }
                if (b29.e2()) {
                    x1(o, 1, "start_timestamp_millis", Long.valueOf(b29.f2()));
                }
                if (b29.g2()) {
                    x1(o, 1, "end_timestamp_millis", Long.valueOf(b29.h2()));
                }
                if (b29.i2()) {
                    x1(o, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(b29.j2()));
                }
                if (b29.k2()) {
                    x1(o, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(b29.l2()));
                }
                x1(o, 1, "app_instance_id", b29.C());
                x1(o, 1, "resettable_device_id", b29.z());
                x1(o, 1, "ds_id", b29.S());
                if (b29.A()) {
                    x1(o, 1, "limited_ad_tracking", Boolean.valueOf(b29.B()));
                }
                x1(o, 1, "os_version", b29.n2());
                x1(o, 1, "device_model", b29.o2());
                x1(o, 1, "user_default_language", b29.p2());
                if (b29.q2()) {
                    x1(o, 1, "time_zone_offset_minutes", Integer.valueOf(b29.r2()));
                }
                if (b29.F()) {
                    x1(o, 1, "bundle_sequential_index", Integer.valueOf(b29.G()));
                }
                if (b29.N0()) {
                    x1(o, 1, "delivery_index", Integer.valueOf(b29.O0()));
                }
                if (b29.J()) {
                    x1(o, 1, "service_upload", Boolean.valueOf(b29.K()));
                }
                x1(o, 1, "health_monitor", b29.H());
                if (b29.t0()) {
                    x1(o, 1, "retry_counter", Integer.valueOf(b29.u0()));
                }
                if (b29.x0()) {
                    x1(o, 1, "consent_signals", b29.y0());
                }
                if (b29.G0()) {
                    x1(o, 1, "is_dma_region", Boolean.valueOf(b29.H0()));
                }
                if (b29.I0()) {
                    x1(o, 1, "core_platform_services", b29.J0());
                }
                if (b29.E0()) {
                    x1(o, 1, "consent_diagnostics", b29.F0());
                }
                if (b29.B0()) {
                    x1(o, 1, "target_os_version", Long.valueOf(b29.C0()));
                }
                wo8.a();
                if (tp8.n1(b29.t(), by8.O0)) {
                    x1(o, 1, "ad_services_version", Integer.valueOf(b29.K0()));
                    if (b29.L0() && (M0 = b29.M0()) != null) {
                        r1(2, o);
                        o.append("attribution_eligibility_status {\n");
                        x1(o, 2, "eligible", Boolean.valueOf(M0.t()));
                        x1(o, 2, "no_access_adservices_attribution_permission", Boolean.valueOf(M0.u()));
                        x1(o, 2, "pre_r", Boolean.valueOf(M0.v()));
                        x1(o, 2, "r_extensions_too_old", Boolean.valueOf(M0.w()));
                        x1(o, 2, "adservices_extension_too_old", Boolean.valueOf(M0.x()));
                        x1(o, 2, "ad_storage_not_allowed", Boolean.valueOf(M0.y()));
                        x1(o, 2, "measurement_manager_disabled", Boolean.valueOf(M0.z()));
                        r1(2, o);
                        o.append("}\n");
                    }
                }
                if (b29.P0()) {
                    e09 Q0 = b29.Q0();
                    r1(2, o);
                    o.append("ad_campaign_info {\n");
                    if (Q0.G()) {
                        x1(o, 2, "deep_link_gclid", Q0.H());
                    }
                    if (Q0.I()) {
                        x1(o, 2, "deep_link_gbraid", Q0.J());
                    }
                    if (Q0.K()) {
                        x1(o, 2, "deep_link_gad_source", Q0.L());
                    }
                    if (Q0.W()) {
                        x1(o, 2, "deep_link_url", Q0.X());
                    }
                    if (Q0.M()) {
                        x1(o, 2, "deep_link_session_millis", Long.valueOf(Q0.N()));
                    }
                    if (Q0.O()) {
                        x1(o, 2, "market_referrer_gclid", Q0.P());
                    }
                    if (Q0.Q()) {
                        x1(o, 2, "market_referrer_gbraid", Q0.R());
                    }
                    if (Q0.S()) {
                        x1(o, 2, "market_referrer_gad_source", Q0.T());
                    }
                    if (Q0.U()) {
                        x1(o, 2, "market_referrer_click_millis", Long.valueOf(Q0.V()));
                    }
                    r1(2, o);
                    o.append("}\n");
                }
                if (b29.U()) {
                    x1(o, 1, "batching_timestamp_millis", Long.valueOf(b29.V()));
                }
                if (b29.R0()) {
                    k29 S0 = b29.S0();
                    r1(2, o);
                    o.append("sgtm_diagnostics {\n");
                    int x = S0.x();
                    if (x == 1) {
                        str3 = "UPLOAD_TYPE_UNKNOWN";
                    } else if (x == 2) {
                        str3 = "GA_UPLOAD";
                    } else if (x == 3) {
                        str3 = "SDK_CLIENT_UPLOAD";
                    } else if (x != 4) {
                        str3 = "SDK_SERVICE_UPLOAD";
                    } else {
                        str3 = "PACKAGE_SERVICE_UPLOAD";
                    }
                    x1(o, 2, "upload_type", str3);
                    x1(o, 2, "client_upload_eligibility", hl6.u(S0.t()));
                    int y = S0.y();
                    if (y == 1) {
                        str4 = "SERVICE_UPLOAD_ELIGIBILITY_UNKNOWN";
                    } else if (y == 2) {
                        str4 = "SERVICE_UPLOAD_ELIGIBLE";
                    } else if (y == 3) {
                        str4 = "NOT_IN_ROLLOUT";
                    } else if (y == 4) {
                        str4 = "MISSING_SGTM_SETTINGS";
                    } else if (y != 5) {
                        str4 = "NON_PLAY_MISSING_SGTM_SERVER_URL";
                    } else {
                        str4 = "MISSING_SGTM_PROXY_INFO";
                    }
                    x1(o, 2, "service_upload_eligibility", str4);
                    r1(2, o);
                    o.append("}\n");
                }
                if (b29.W()) {
                    a19 X = b29.X();
                    r1(2, o);
                    o.append("consent_info_extra {\n");
                    for (x09 x09 : X.t()) {
                        r1(3, o);
                        o.append("limited_data_modes {\n");
                        int u = x09.u();
                        if (u == 1) {
                            str = "CONSENT_TYPE_UNSPECIFIED";
                        } else if (u == 2) {
                            str = "AD_STORAGE";
                        } else if (u == 3) {
                            str = "ANALYTICS_STORAGE";
                        } else if (u != 4) {
                            str = "AD_PERSONALIZATION";
                        } else {
                            str = "AD_USER_DATA";
                        }
                        x1(o, 3, "type", str);
                        int v = x09.v();
                        if (v == 1) {
                            str2 = "NOT_LIMITED";
                        } else if (v != 2) {
                            str2 = "NO_DATA_MODE";
                        } else {
                            str2 = "LIMITED_MODE";
                        }
                        x1(o, 3, "mode", str2);
                        r1(3, o);
                        o.append("}\n");
                    }
                    r1(2, o);
                    o.append("}\n");
                }
                zl8<m29> Z1 = b29.Z1();
                if (Z1 != null) {
                    for (m29 m29 : Z1) {
                        if (m29 != null) {
                            r1(2, o);
                            o.append("user_property {\n");
                            if (m29.t()) {
                                l = Long.valueOf(m29.u());
                            } else {
                                l = null;
                            }
                            x1(o, 2, "set_timestamp_millis", l);
                            x1(o, 2, "name", fz8.c(m29.v()));
                            x1(o, 2, "string_value", m29.x());
                            if (m29.y()) {
                                l2 = Long.valueOf(m29.z());
                            } else {
                                l2 = null;
                            }
                            x1(o, 2, "int_value", l2);
                            if (m29.C()) {
                                d = Double.valueOf(m29.D());
                            } else {
                                d = null;
                            }
                            x1(o, 2, "double_value", d);
                            r1(2, o);
                            o.append("}\n");
                        }
                    }
                }
                zl8<n09> L = b29.L();
                if (L != null) {
                    for (n09 n09 : L) {
                        if (n09 != null) {
                            r1(2, o);
                            o.append("audience_membership {\n");
                            if (n09.t()) {
                                x1(o, 2, "audience_id", Integer.valueOf(n09.u()));
                            }
                            if (n09.y()) {
                                x1(o, 2, "new_audience", Boolean.valueOf(n09.z()));
                            }
                            w1(o, "current_data", n09.v());
                            if (n09.w()) {
                                w1(o, "previous_data", n09.x());
                            }
                            r1(2, o);
                            o.append("}\n");
                        }
                    }
                }
                List<h19> T1 = b29.T1();
                if (T1 != null) {
                    for (h19 h19 : T1) {
                        if (h19 != null) {
                            r1(2, o);
                            o.append("event {\n");
                            x1(o, 2, "name", fz8.a(h19.y()));
                            if (h19.z()) {
                                x1(o, 2, "timestamp_millis", Long.valueOf(h19.A()));
                            }
                            if (tp8.n1((String) null, by8.e1) && h19.F()) {
                                x1(o, 2, "corrected_timestamp_millis", Long.valueOf(h19.G()));
                            }
                            if (h19.B()) {
                                x1(o, 2, "previous_timestamp_millis", Long.valueOf(h19.C()));
                            }
                            if (h19.D()) {
                                x1(o, 2, "count", Integer.valueOf(h19.E()));
                            }
                            if (h19.w() != 0) {
                                p1(o, 2, (zl8) h19.v());
                            }
                            r1(2, o);
                            o.append("}\n");
                        }
                    }
                }
                r1(1, o);
                o.append("}\n");
            }
        }
        o.append("} // End-of-batch\n");
        return o.toString();
    }

    public final String E1(wx8 wx8) {
        StringBuilder o = b81.o("\nproperty_filter {\n");
        if (wx8.t()) {
            x1(o, 0, "filter_id", Integer.valueOf(wx8.u()));
        }
        x1(o, 0, "property_name", ((y19) this.w).F.c(wx8.v()));
        String t1 = t1(wx8.x(), wx8.y(), wx8.A());
        if (!t1.isEmpty()) {
            x1(o, 0, "filter_type", t1);
        }
        q1(o, 1, wx8.w());
        o.append("}\n");
        return o.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002e, code lost:
        r1.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0031, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0018, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        r4 = ((defpackage.y19) r4.w).B;
        defpackage.y19.g(r4);
        r4.B.a("Failed to load parcelable from buffer");
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x001a */
    public final Parcelable F1(byte[] bArr, Parcelable.Creator creator) {
        Parcelable parcelable = null;
        if (bArr == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        parcelable = (Parcelable) creator.createFromParcel(obtain);
        obtain.recycle();
        return parcelable;
    }

    public final List J1(yl8 yl8, List list) {
        int i;
        y19 y19 = (y19) this.w;
        ArrayList arrayList = new ArrayList(yl8);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num.intValue() < 0) {
                pz8 pz8 = y19.B;
                y19.g(pz8);
                pz8.E.b("Ignoring negative bit index to be cleared", num);
            } else {
                int intValue = num.intValue() / 64;
                if (intValue >= arrayList.size()) {
                    pz8 pz82 = y19.B;
                    y19.g(pz82);
                    pz82.E.c(num, Integer.valueOf(arrayList.size()), "Ignoring bit index greater than bitSet size");
                } else {
                    arrayList.set(intValue, Long.valueOf(((Long) arrayList.get(intValue)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i2 = size2;
            i = size;
            size = i2;
            if (size >= 0 && ((Long) arrayList.get(size)).longValue() == 0) {
                size2 = size - 1;
            }
        }
        return arrayList.subList(0, i);
    }

    public final boolean K1(long j, long j2) {
        if (j == 0 || j2 <= 0) {
            return true;
        }
        ((y19) this.w).G.getClass();
        if (Math.abs(System.currentTimeMillis() - j) > j2) {
            return true;
        }
        return false;
    }

    public final long L1(byte[] bArr) {
        z65.k(bArr);
        y19 y19 = (y19) this.w;
        d99 d99 = y19.E;
        y19.e(d99);
        d99.b1();
        MessageDigest v1 = d99.v1();
        if (v1 != null) {
            return d99.w1(v1.digest(bArr));
        }
        pz8 pz8 = y19.B;
        y19.g(pz8);
        pz8.B.a("Failed to get MD5");
        return 0;
    }

    public final byte[] M1(byte[] bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            pz8 pz8 = ((y19) this.w).B;
            y19.g(pz8);
            pz8.B.b("Failed to gzip content", e);
            throw e;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    public final void i1(Map map) {
        long j;
        y19 y19 = (y19) this.w;
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            String n1 = n1("Date", map);
            if (!TextUtils.isEmpty(n1)) {
                if (i >= 26) {
                    try {
                        j = ZonedDateTime.parse(n1, DateTimeFormatter.RFC_1123_DATE_TIME).toInstant().toEpochMilli();
                    } catch (DateTimeParseException unused) {
                        pz8 pz8 = y19.B;
                        y19.g(pz8);
                        pz8.E.b("Unable to parse header time, time", n1);
                    }
                    if (j <= 0) {
                        y19.G.getClass();
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        b1();
                        if (this.A == 0) {
                            this.z = elapsedRealtime;
                            this.A = j;
                            return;
                        }
                        return;
                    }
                    return;
                }
                j = 0;
                if (j <= 0) {
                }
            }
        }
    }

    public final long j1(long j) {
        b1();
        long j2 = this.A;
        if (j2 == 0 || j == 0) {
            return 0;
        }
        return (j2 - this.z) + j;
    }

    public final void p1(StringBuilder sb, int i, zl8 zl8) {
        String str;
        String str2;
        Long l;
        if (zl8 != null) {
            int i2 = i + 1;
            Iterator it = zl8.iterator();
            while (it.hasNext()) {
                n19 n19 = (n19) it.next();
                if (n19 != null) {
                    r1(i2, sb);
                    sb.append("param {\n");
                    Double d = null;
                    if (n19.t()) {
                        str = ((y19) this.w).F.b(n19.u());
                    } else {
                        str = null;
                    }
                    x1(sb, i2, "name", str);
                    if (n19.v()) {
                        str2 = n19.w();
                    } else {
                        str2 = null;
                    }
                    x1(sb, i2, "string_value", str2);
                    if (n19.x()) {
                        l = Long.valueOf(n19.y());
                    } else {
                        l = null;
                    }
                    x1(sb, i2, "int_value", l);
                    if (n19.B()) {
                        d = Double.valueOf(n19.C());
                    }
                    x1(sb, i2, "double_value", d);
                    if (n19.E() > 0) {
                        p1(sb, i2, n19.D());
                    }
                    r1(i2, sb);
                    sb.append("}\n");
                }
            }
        }
    }

    public final void q1(StringBuilder sb, int i, sx8 sx8) {
        String str;
        if (sx8 != null) {
            r1(i, sb);
            sb.append("filter {\n");
            if (sx8.x()) {
                x1(sb, i, "complement", Boolean.valueOf(sx8.y()));
            }
            if (sx8.z()) {
                x1(sb, i, "param_name", ((y19) this.w).F.b(sx8.A()));
            }
            if (sx8.t()) {
                int i2 = i + 1;
                xx8 u = sx8.u();
                if (u != null) {
                    r1(i2, sb);
                    sb.append("string_filter {\n");
                    if (u.t()) {
                        switch (u.B()) {
                            case 1:
                                str = "UNKNOWN_MATCH_TYPE";
                                break;
                            case 2:
                                str = "REGEXP";
                                break;
                            case 3:
                                str = "BEGINS_WITH";
                                break;
                            case 4:
                                str = "ENDS_WITH";
                                break;
                            case 5:
                                str = "PARTIAL";
                                break;
                            case 6:
                                str = "EXACT";
                                break;
                            default:
                                str = "IN_LIST";
                                break;
                        }
                        x1(sb, i2, "match_type", str);
                    }
                    if (u.u()) {
                        x1(sb, i2, "expression", u.v());
                    }
                    if (u.w()) {
                        x1(sb, i2, "case_sensitive", Boolean.valueOf(u.x()));
                    }
                    if (u.z() > 0) {
                        r1(i + 2, sb);
                        sb.append("expression_list {\n");
                        for (String append : u.y()) {
                            r1(i + 3, sb);
                            sb.append(append);
                            sb.append("\n");
                        }
                        sb.append("}\n");
                    }
                    r1(i2, sb);
                    sb.append("}\n");
                }
            }
            if (sx8.v()) {
                y1(sb, i + 1, "number_filter", sx8.w());
            }
            r1(i, sb);
            sb.append("}\n");
        }
    }

    public final void z1(l29 l29, Object obj) {
        z65.k(obj);
        l29.b();
        ((m29) l29.x).I();
        l29.b();
        ((m29) l29.x).K();
        l29.b();
        ((m29) l29.x).M();
        if (obj instanceof String) {
            l29.b();
            ((m29) l29.x).H((String) obj);
        } else if (obj instanceof Long) {
            long longValue = ((Long) obj).longValue();
            l29.b();
            ((m29) l29.x).J(longValue);
        } else if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            l29.b();
            ((m29) l29.x).L(doubleValue);
        } else {
            pz8 pz8 = ((y19) this.w).B;
            y19.g(pz8);
            pz8.B.b("Ignoring invalid (type) user attribute value", obj);
        }
    }

    public final void f1() {
    }
}
