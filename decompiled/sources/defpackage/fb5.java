package defpackage;

import android.content.Context;
import com.google.android.gms.internal.fido.zzhj;
import cu.lestebang.utiletecsa.core.preferences.model.DarkThemeConfigPreferences;
import cu.lestebang.utiletecsa.core.preferences.model.UserDataPreferences;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.logging.Level;

/* renamed from: fb5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class fb5 {
    public static Thread a;
    public static x83 b;

    public static final long a(float f, float f2) {
        long floatToRawIntBits = (long) Float.floatToRawIntBits(f);
        return (((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (floatToRawIntBits << 32);
    }

    public static final void b(tp4 tp4, Object obj, Object obj2) {
        boolean z;
        Object obj3;
        int f = tp4.f(obj);
        if (f < 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            obj3 = null;
        } else {
            obj3 = tp4.c[f];
        }
        if (obj3 != null) {
            if (obj3 instanceof up4) {
                ((up4) obj3).a(obj2);
            } else if (obj3 != obj2) {
                up4 up4 = new up4();
                up4.a(obj3);
                up4.a(obj2);
                obj2 = up4;
            }
            obj2 = obj3;
        }
        if (z) {
            int i = ~f;
            tp4.b[i] = obj;
            tp4.c[i] = obj2;
            return;
        }
        tp4.c[f] = obj2;
    }

    /* JADX WARNING: type inference failed for: r9v4, types: [m66] */
    /* JADX WARNING: Multi-variable type inference failed */
    public static final zn6 c(UserDataPreferences userDataPreferences) {
        zn6 zn6;
        ae1 ae1;
        g40 g40;
        zn6 zn62;
        Object obj;
        az7 az7;
        Object obj2;
        zn6 zn63;
        Object obj3;
        userDataPreferences.getClass();
        String userName = userDataPreferences.getUserName();
        boolean useDynamicColor = userDataPreferences.getUseDynamicColor();
        DarkThemeConfigPreferences darkThemeConfigPreferences = userDataPreferences.getDarkThemeConfigPreferences();
        darkThemeConfigPreferences.getClass();
        int i = po6.a[darkThemeConfigPreferences.ordinal()];
        if (i == 1) {
            ae1 = ae1.w;
        } else if (i == 2) {
            ae1 = ae1.x;
        } else if (i == 3) {
            ae1 = ae1.y;
        } else if (i == 4) {
            ae1 = ae1.z;
        } else {
            h.c();
            return null;
        }
        ae1 ae12 = ae1;
        boolean ussdRefreshModeEnabled = userDataPreferences.getUssdRefreshModeEnabled();
        int defaultSimSlot = userDataPreferences.getDefaultSimSlot();
        boolean showEtecsaBanner = userDataPreferences.getShowEtecsaBanner();
        Set g1 = dt0.g1(userDataPreferences.getHomeCollapsedSections());
        String balanceSecondaryInfo = userDataPreferences.getBalanceSecondaryInfo();
        g40.w.getClass();
        balanceSecondaryInfo.getClass();
        try {
            g40 = g40.valueOf(balanceSecondaryInfo);
        } catch (Throwable th) {
            g40 = new m66(th);
        }
        if (g40 instanceof m66) {
            g40 = g40.x;
        }
        g40 g402 = g40;
        boolean planExpiryNotifyEnabled = userDataPreferences.getPlanExpiryNotifyEnabled();
        boolean appLockEnabled = userDataPreferences.getAppLockEnabled();
        boolean blockAnonymousCalls = userDataPreferences.getBlockAnonymousCalls();
        boolean blockRevertidaCalls = userDataPreferences.getBlockRevertidaCalls();
        boolean blockFijoCalls = userDataPreferences.getBlockFijoCalls();
        boolean blockUnknownCalls = userDataPreferences.getBlockUnknownCalls();
        boolean blockAllCalls = userDataPreferences.getBlockAllCalls();
        boolean callAlertAllCalls = userDataPreferences.getCallAlertAllCalls();
        boolean callAlertRevertidaCalls = userDataPreferences.getCallAlertRevertidaCalls();
        try {
            obj = az7.valueOf(userDataPreferences.getSaldoUssdSim1());
            zn62 = zn6;
        } catch (Throwable th2) {
            zn62 = zn6;
            obj = new m66(th2);
        }
        boolean z = obj instanceof m66;
        Object obj4 = az7.CONSULTAR_SALDO;
        if (z) {
            obj = obj4;
        }
        az7 az72 = (az7) obj;
        try {
            obj2 = az7.valueOf(userDataPreferences.getSaldoUssdSim2());
            az7 = az72;
        } catch (Throwable th3) {
            az7 = az72;
            obj2 = new m66(th3);
        }
        if (!(obj2 instanceof m66)) {
            obj4 = obj2;
        }
        az7 az73 = (az7) obj4;
        zn6 zn64 = zn62;
        az7 az74 = az7;
        boolean voiceNotificationsUssdEnabled = userDataPreferences.getVoiceNotificationsUssdEnabled();
        boolean voiceNotificationsIncomingEnabled = userDataPreferences.getVoiceNotificationsIncomingEnabled();
        boolean speedOverlayAutoEnabled = userDataPreferences.getSpeedOverlayAutoEnabled();
        boolean ussdAutoEnabled = userDataPreferences.getUssdAutoEnabled();
        boolean ussdAutoAfterCallEnabled = userDataPreferences.getUssdAutoAfterCallEnabled();
        boolean ussdAutoAfterSmsEnabled = userDataPreferences.getUssdAutoAfterSmsEnabled();
        boolean ussdAutoAfterDataOffEnabled = userDataPreferences.getUssdAutoAfterDataOffEnabled();
        boolean ussdAutoPeriodicEnabled = userDataPreferences.getUssdAutoPeriodicEnabled();
        int ussdAutoIntervalMinutes = userDataPreferences.getUssdAutoIntervalMinutes();
        String ussdAutoPeriodicQuery = userDataPreferences.getUssdAutoPeriodicQuery();
        jy7.x.getClass();
        ussdAutoPeriodicQuery.getClass();
        try {
            obj3 = jy7.valueOf(ussdAutoPeriodicQuery);
            zn63 = zn64;
        } catch (Throwable th4) {
            zn63 = zn64;
            obj3 = new m66(th4);
        }
        if (obj3 instanceof m66) {
            obj3 = jy7.SALDO;
        }
        return new zn6(userName, useDynamicColor, ae12, ussdRefreshModeEnabled, defaultSimSlot, showEtecsaBanner, g1, g402, planExpiryNotifyEnabled, appLockEnabled, blockAnonymousCalls, blockRevertidaCalls, blockFijoCalls, blockUnknownCalls, blockAllCalls, callAlertAllCalls, callAlertRevertidaCalls, az74, az73, voiceNotificationsUssdEnabled, voiceNotificationsIncomingEnabled, speedOverlayAutoEnabled, ussdAutoEnabled, ussdAutoAfterCallEnabled, ussdAutoAfterSmsEnabled, ussdAutoAfterDataOffEnabled, ussdAutoPeriodicEnabled, ussdAutoIntervalMinutes, (jy7) obj3, 8);
    }

    public static tp4 d() {
        long[] jArr = bg6.a;
        return new tp4();
    }

    public static final jq7 e(k28 k28) {
        int ordinal = k28.ordinal();
        if (ordinal == 0) {
            return jq7.INV;
        }
        if (ordinal == 1) {
            return jq7.IN;
        }
        if (ordinal == 2) {
            return jq7.OUT;
        }
        h.c();
        return null;
    }

    public static final long f(ob5 ob5) {
        return dh4.D((double) (ob5.l() * ((float) ob5.p()))) + (((long) ob5.k()) * ((long) ob5.p()));
    }

    public static final y86 g(Context context, Class cls, String str) {
        if (d57.I0(str)) {
            h.q("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
            return null;
        } else if (!str.equals(":memory:")) {
            return new y86(context, cls, str);
        } else {
            h.q("Cannot build a database with the special name ':memory:'. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
            return null;
        }
    }

    public static final boolean h(String str, String str2) {
        str.getClass();
        if (str.equals(str2)) {
            return true;
        }
        if (str.length() != 0) {
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i < str.length()) {
                    char charAt = str.charAt(i);
                    int i4 = i3 + 1;
                    if (i3 == 0 && charAt != '(') {
                        break;
                    }
                    if (charAt != '(') {
                        if (charAt == ')' && i2 - 1 == 0 && i3 != str.length() - 1) {
                            break;
                        }
                    } else {
                        i2++;
                    }
                    i++;
                    i3 = i4;
                } else if (i2 == 0) {
                    return sg3.e(d57.k1(str.substring(1, str.length() - 1)).toString(), str2);
                }
            }
        }
        return false;
    }

    public static final Type i(s16 s16) {
        ParameterizedType parameterizedType;
        Type type;
        WildcardType wildcardType;
        Type[] lowerBounds;
        if (s16.i()) {
            Object H0 = dt0.H0(s16.n().a());
            if (H0 instanceof ParameterizedType) {
                parameterizedType = (ParameterizedType) H0;
            } else {
                parameterizedType = null;
            }
            if (parameterizedType != null) {
                type = parameterizedType.getRawType();
            } else {
                type = null;
            }
            if (sg3.e(type, f61.class)) {
                Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                actualTypeArguments.getClass();
                Object j1 = qs.j1(actualTypeArguments);
                if (j1 instanceof WildcardType) {
                    wildcardType = (WildcardType) j1;
                } else {
                    wildcardType = null;
                }
                if (!(wildcardType == null || (lowerBounds = wildcardType.getLowerBounds()) == null)) {
                    return (Type) qs.W0(lowerBounds);
                }
            }
        }
        return null;
    }

    public static final String j(Collection collection) {
        collection.getClass();
        if (!collection.isEmpty()) {
            return e57.e0(dt0.E0(collection, ",\n", "\n", "\n", (vr2) null, 56)).concat("},");
        }
        return " }";
    }

    public static final long k(long j) {
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) / 2.0f)) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32)) / 2.0f)) << 32);
    }

    public static final int l(ll6 ll6, ll6[] ll6Arr) {
        boolean z;
        boolean z2;
        int i;
        ll6Arr.getClass();
        int hashCode = (ll6.a().hashCode() * 31) + Arrays.hashCode(ll6Arr);
        int e = ll6.e();
        int i2 = 1;
        while (true) {
            int i3 = 0;
            if (e > 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                break;
            }
            int i4 = e - 1;
            int i5 = i2 * 31;
            String a2 = ll6.h(ll6.e() - e).a();
            if (a2 != null) {
                i3 = a2.hashCode();
            }
            i2 = i5 + i3;
            e = i4;
        }
        int e2 = ll6.e();
        int i6 = 1;
        while (true) {
            if (e2 > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                return (((hashCode * 31) + i2) * 31) + i6;
            }
            int i7 = e2 - 1;
            int i8 = i6 * 31;
            n85 u = ll6.h(ll6.e() - e2).u();
            if (u != null) {
                i = u.hashCode();
            } else {
                i = 0;
            }
            i6 = i8 + i;
            e2 = i7;
        }
    }

    public static final boolean m(char c) {
        if ('0' > c || c >= ':') {
            return false;
        }
        return true;
    }

    public static final String n(Collection collection) {
        return e57.e0(dt0.E0(collection, ",", (String) null, (String) null, (vr2) null, 62)).concat(e57.e0(" }"));
    }

    public static final String o(Collection collection) {
        return e57.e0(dt0.E0(collection, ",", (String) null, (String) null, (vr2) null, 62)).concat(e57.e0("},"));
    }

    public static final jz0 p(s16 s16, String str) {
        str.getClass();
        bt2 o = g18.o(str);
        ArrayList arrayList = o.c;
        boolean e = sg3.e(dt0.H0(arrayList), "Lkotlin/jvm/internal/DefaultConstructorMarker;");
        int size = su0.y(s16).size() + (e ? 1 : 0);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(dt0.V0(arrayList.size() - size, arrayList));
        Iterator it = dt0.i1(su0.y(s16), dt0.W0(size, arrayList)).iterator();
        while (it.hasNext()) {
            yb5 yb5 = (yb5) it.next();
            t16 t16 = (t16) yb5.w;
            String str2 = (String) yb5.x;
            t16.getClass();
            if (t16.g() && g18.i(t16.y())) {
                Iterator it2 = cl6.P(cl6.S(e18.x, t16.y()), 1).iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (g18.k((as3) it2.next())) {
                            linkedHashSet.add(Integer.valueOf(arrayList2.size()));
                            vq3 J = t16.y().J();
                            J.getClass();
                            StringBuilder sb = new StringBuilder("L");
                            String replace = ((oq3) ((gq3) J)).x.getName().replace('.', '/');
                            replace.getClass();
                            sb.append(replace);
                            sb.append(';');
                            arrayList2.add(sb.toString());
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            arrayList2.add(str2);
        }
        if (e) {
            arrayList2.add("Lkotlin/jvm/internal/DefaultConstructorMarker;");
        }
        if (linkedHashSet.isEmpty()) {
            return new jz0(str, (Set) g42.w);
        }
        return new jz0(dt0.E0(arrayList2, "", "(", ")", (vr2) null, 56).concat(o.b), (Set) linkedHashSet);
    }

    public static uq4 q(uq4 uq4, String str, String str2, int i) {
        boolean z;
        char charAt;
        char charAt2;
        Object obj;
        if ((i & 4) != 0) {
            z = true;
        } else {
            z = false;
        }
        if ((i & 8) != 0) {
            str2 = null;
        }
        if (!uq4.x) {
            String c = uq4.c();
            if (k57.u0(c, str, false) && c.length() != str.length() && ('a' > (charAt = c.charAt(str.length())) || charAt >= '{')) {
                if (str2 != null) {
                    return uq4.e(str2.concat(d57.R0(c, str)));
                }
                if (!z) {
                    return uq4;
                }
                String R0 = d57.R0(c, str);
                if (R0.length() != 0 && gw8.B(0, R0)) {
                    if (R0.length() != 1 && gw8.B(1, R0)) {
                        Iterator it = new pe3(0, R0.length() - 1, 1).iterator();
                        while (true) {
                            if (!((qe3) it).y) {
                                obj = null;
                                break;
                            }
                            obj = ((je3) it).next();
                            if (!gw8.B(((Number) obj).intValue(), R0)) {
                                break;
                            }
                        }
                        Integer num = (Integer) obj;
                        if (num != null) {
                            int intValue = num.intValue() - 1;
                            R0 = gw8.N(R0.substring(0, intValue)).concat(R0.substring(intValue));
                        } else {
                            R0 = gw8.N(R0);
                        }
                    } else if (R0.length() != 0 && 'A' <= (charAt2 = R0.charAt(0)) && charAt2 < '[') {
                        R0 = Character.toLowerCase(charAt2) + R0.substring(1);
                    }
                }
                if (uq4.f(R0)) {
                    return uq4.e(R0);
                }
            }
        }
        return null;
    }

    public static final boolean r(tp4 tp4, Object obj, Object obj2) {
        Object g = tp4.g(obj);
        if (g == null) {
            return false;
        }
        if (g instanceof up4) {
            up4 up4 = (up4) g;
            boolean l = up4.l(obj2);
            if (l && up4.g()) {
                tp4.k(obj);
            }
            return l;
        } else if (!g.equals(obj2)) {
            return false;
        } else {
            tp4.k(obj);
            return true;
        }
    }

    public static final String s(int i, String str) {
        int F0;
        CharSequence charSequence;
        if (str.length() >= i + 12 && d57.y0("+-", str.charAt(0)) && (F0 = d57.F0(str, '-', 1, 4)) >= 12) {
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                if (str.charAt(i3) != '0') {
                    break;
                }
                i2 = i3;
            }
            if (F0 - i2 < 12) {
                int i4 = F0 - 10;
                if (i4 >= 1) {
                    if (i4 == 1) {
                        charSequence = str.subSequence(0, str.length());
                    } else {
                        StringBuilder sb = new StringBuilder(str.length() - (F0 - 11));
                        sb.append(str, 0, 1);
                        sb.append(str, i4, str.length());
                        charSequence = sb;
                    }
                    return charSequence.toString();
                }
                h.l(pb4.i(i4, "End index (", ") is less than start index (1)."));
                return null;
            }
        }
        return str;
    }

    public static final void t(tp4 tp4, Object obj) {
        boolean z;
        long[] jArr = tp4.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            Object obj2 = tp4.b[i4];
                            Object obj3 = tp4.c[i4];
                            if (obj3 instanceof up4) {
                                up4 up4 = (up4) obj3;
                                up4.l(obj);
                                z = up4.g();
                            } else if (obj3 == obj) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z) {
                                tp4.l(i4);
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        return;
                    }
                }
                if (i != length) {
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public static final vw3 u(qp7 qp7) {
        qp7.getClass();
        vj1 r = qp7.r();
        r.getClass();
        boolean z = r instanceof wq0;
        k28 k28 = k28.A;
        if (z) {
            List<qp7> parameters = ((wq0) r).n().getParameters();
            parameters.getClass();
            ArrayList arrayList = new ArrayList(et0.e0(parameters, 10));
            for (qp7 n : parameters) {
                arrayList.add(n.n());
            }
            List upperBounds = qp7.getUpperBounds();
            upperBounds.getClass();
            fv3 e = ts1.e(qp7);
            vw3 h = new dq7(new q27(0, arrayList)).h((vw3) dt0.w0(upperBounds), k28);
            if (h == null) {
                return e.n();
            }
            return h;
        } else if (r instanceof xs2) {
            List<qp7> typeParameters = ((xs2) r).getTypeParameters();
            typeParameters.getClass();
            ArrayList arrayList2 = new ArrayList(et0.e0(typeParameters, 10));
            for (qp7 n2 : typeParameters) {
                arrayList2.add(n2.n());
            }
            List upperBounds2 = qp7.getUpperBounds();
            upperBounds2.getClass();
            fv3 e2 = ts1.e(qp7);
            vw3 h2 = new dq7(new q27(0, arrayList2)).h((vw3) dt0.w0(upperBounds2), k28);
            if (h2 == null) {
                return e2.n();
            }
            return h2;
        } else {
            h.q("Unsupported descriptor type to build star projection type based on type parameters of it");
            return null;
        }
    }

    public static final String v(ll6 ll6) {
        re3 V = z65.V(0, ll6.e());
        return dt0.E0(V, ", ", ll6.a() + '(', ")", new h43(27, ll6), 24);
    }

    public static String w(String str) {
        if (str.length() > 23) {
            int i = -1;
            int length = str.length() - 1;
            while (true) {
                if (length < 0) {
                    break;
                }
                char charAt = str.charAt(length);
                if (charAt == '.' || charAt == '$') {
                    i = length;
                } else {
                    length--;
                }
            }
            str = str.substring(i + 1);
        }
        String concat = "".concat(str);
        return concat.substring(0, Math.min(concat.length(), 23));
    }

    public static int x(Level level) {
        int intValue = level.intValue();
        if (intValue >= Level.SEVERE.intValue()) {
            return 6;
        }
        if (intValue >= Level.WARNING.intValue()) {
            return 5;
        }
        if (intValue >= Level.INFO.intValue()) {
            return 4;
        }
        if (intValue >= Level.FINE.intValue()) {
            return 3;
        }
        return 2;
    }

    public static final d19 y(i19 i19) {
        long j;
        try {
            g19 o = i19.o();
            if (o != null) {
                try {
                    byte b2 = o.b;
                    byte b3 = o.a;
                    int i = 0;
                    if (b3 == Byte.MIN_VALUE) {
                        long a2 = i19.a();
                        if (a2 <= 1000) {
                            z(b2, a2);
                            d19[] d19Arr = new d19[((int) a2)];
                            while (((long) i) < a2) {
                                d19Arr[i] = y(i19);
                                i++;
                            }
                            return new o09(mt8.y(d19Arr));
                        }
                        throw new IOException("Parser being asked to read a large CBOR array");
                    } else if (b3 == -96) {
                        long l = i19.l();
                        if (l <= 1000) {
                            z(b2, l);
                            int i2 = (int) l;
                            k68[] k68Arr = new k68[i2];
                            d19 d19 = null;
                            int i3 = 0;
                            while (((long) i3) < l) {
                                d19 y = y(i19);
                                if (d19 != null) {
                                    if (y.compareTo(d19) <= 0) {
                                        throw new IOException("Keys in CBOR Map not in strictly ascending natural order:\nPrevious key: " + d19.toString() + "\nCurrent key: " + y.toString());
                                    }
                                }
                                k68Arr[i3] = new k68(14, y, y(i19));
                                i3++;
                                d19 = y;
                            }
                            TreeMap treeMap = new TreeMap();
                            while (i < i2) {
                                k68 k68 = k68Arr[i];
                                if (!treeMap.containsKey((d19) k68.x)) {
                                    treeMap.put((d19) k68.x, (d19) k68.y);
                                    i++;
                                } else {
                                    throw new IOException("Attempted to add duplicate key to canonical CBOR Map.");
                                }
                            }
                            return new y09(ut8.b(treeMap));
                        }
                        throw new IOException("Parser being asked to read a large CBOR map");
                    } else if (b3 == -64) {
                        throw new IOException("Tags are currently unsupported");
                    } else if (b3 == -32) {
                        return new r09(i19.u());
                    } else {
                        if (b3 == 0 || b3 == 32) {
                            long k = i19.k();
                            if (k > 0) {
                                j = k;
                            } else {
                                j = ~k;
                            }
                            z(b2, j);
                            return new w09(k);
                        } else if (b3 == 64) {
                            i19.D((byte) 64);
                            byte[] G = i19.G();
                            int length = G.length;
                            z(b2, (long) length);
                            return new s09(qz8.p(length, G));
                        } else if (b3 == 96) {
                            try {
                                i19.D((byte) 96);
                                String str = new String(i19.G(), StandardCharsets.UTF_8);
                                z(b2, (long) str.length());
                                return new z09(str);
                            } catch (RuntimeException e) {
                                e = e;
                                throw new zzhj(e);
                            }
                        } else {
                            throw new IOException("Unidentifiable major type: " + ((b3 >> 5) & 7));
                        }
                    }
                } catch (IOException | RuntimeException e2) {
                    e = e2;
                    throw new zzhj(e);
                }
            } else {
                throw new IOException("Parser being asked to parse an empty input stream");
            }
        } catch (IOException e3) {
            throw new zzhj(e3);
        }
    }

    public static final void z(byte b2, long j) {
        switch (b2) {
            case 24:
                if (j < 24) {
                    throw new IOException(f21.g(j, "Integer value ", " after add info could have been represented in 0 additional bytes, but used 1"));
                }
                return;
            case 25:
                if (j < 256) {
                    throw new IOException(f21.g(j, "Integer value ", " after add info could have been represented in 0-1 additional bytes, but used 2"));
                }
                return;
            case 26:
                if (j < 65536) {
                    throw new IOException(f21.g(j, "Integer value ", " after add info could have been represented in 0-2 additional bytes, but used 4"));
                }
                return;
            case 27:
                if (j < 4294967296L) {
                    throw new IOException(f21.g(j, "Integer value ", " after add info could have been represented in 0-4 additional bytes, but used 8"));
                }
                return;
            default:
                return;
        }
    }
}
