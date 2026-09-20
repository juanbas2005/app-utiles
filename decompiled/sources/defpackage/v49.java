package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: v49  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class v49 extends fy8 {
    public final CopyOnWriteArraySet A = new CopyOnWriteArraySet();
    public boolean B;
    public final AtomicReference C = new AtomicReference();
    public final Object D = new Object();
    public boolean E = false;
    public int F = 1;
    public p39 G;
    public p39 H;
    public PriorityQueue I;
    public h39 J = h39.c;
    public final AtomicLong K = new AtomicLong(0);
    public long L = -1;
    public final v09 M;
    public boolean N = true;
    public p39 O;
    public r49 P;
    public p39 Q;
    public final rg4 R = new rg4(22, (Object) this);
    public zb2 y;
    public k68 z;

    public v49(y19 y19) {
        super(y19);
        this.M = new v09(y19);
    }

    public final PriorityQueue A1() {
        if (this.I == null) {
            this.I = new PriorityQueue(Comparator.comparing(o49.a, zf8.y));
        }
        return this.I;
    }

    public final void B1() {
        u79 u79;
        b1();
        if (!A1().isEmpty() && !this.E && (u79 = (u79) A1().poll()) != null) {
            y19 y19 = (y19) this.w;
            d99 d99 = y19.E;
            y19.e(d99);
            uh4 y1 = d99.y1();
            if (y1 != null) {
                this.E = true;
                pz8 pz8 = y19.B;
                y19.g(pz8);
                mz8 mz8 = pz8.J;
                String str = u79.w;
                mz8.b("Registering trigger URI", str);
                ListenableFuture e = y1.e(Uri.parse(str));
                if (e == null) {
                    this.E = false;
                    A1().add(u79);
                    return;
                }
                e.a(new nt2(0, (Object) e, (Object) new k68(this, false, u79, 16)), new iy2(3, this));
            }
        }
    }

    public final void C1(h39 h39) {
        boolean z2;
        Boolean bool;
        b1();
        if ((!h39.i(f39.ANALYTICS_STORAGE) || !h39.i(f39.AD_STORAGE)) && !((y19) this.w).j().l1()) {
            z2 = false;
        } else {
            z2 = true;
        }
        y19 y19 = (y19) this.w;
        r19 r19 = y19.C;
        y19.g(r19);
        r19.b1();
        if (z2 != y19.V) {
            r19 r192 = y19.C;
            y19.g(r192);
            r192.b1();
            y19.V = z2;
            q09 q09 = ((y19) this.w).A;
            y19.e(q09);
            q09.b1();
            if (q09.g1().contains("measurement_enabled_from_api")) {
                bool = Boolean.valueOf(q09.g1().getBoolean("measurement_enabled_from_api", true));
            } else {
                bool = null;
            }
            if (!z2 || bool == null || bool.booleanValue()) {
                t1(Boolean.valueOf(z2), false);
            }
        }
    }

    public final boolean f1() {
        return false;
    }

    public final void g1(String str, String str2, Bundle bundle) {
        long j;
        y19 y19 = (y19) this.w;
        y19.G.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        if (y19.z.n1((String) null, by8.e1)) {
            y19.G.getClass();
            j = SystemClock.elapsedRealtime();
        } else {
            j = 0;
        }
        h1(str, str2, bundle, true, true, currentTimeMillis, j);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006c, code lost:
        if (r3 > 500) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a3, code lost:
        if (r5 > 500) goto L_0x00a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00fd, code lost:
        r1 = (defpackage.y19) r2.w;
        r3 = r1.B;
        defpackage.y19.g(r3);
        r3 = r3.J;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0108, code lost:
        if (r10 != null) goto L_0x010d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x010a, code lost:
        r4 = "null";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x010d, code lost:
        r4 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x010e, code lost:
        r3.c(r4, r11, "Logging screen view with name, class");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0115, code lost:
        if (r2.y != null) goto L_0x011a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0117, code lost:
        r3 = r2.z;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x011a, code lost:
        r3 = r2.y;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x011c, code lost:
        r4 = r1.E;
        defpackage.y19.e(r4);
        r9 = new defpackage.f59(r10, r11, r4.a2(), true, r25, r17);
        r2.y = r9;
        r2.z = r3;
        r2.E = r9;
        r1.G.getClass();
        r4 = android.os.SystemClock.elapsedRealtime();
        r1 = r1.C;
        defpackage.y19.g(r1);
        r1.l1(new defpackage.rk7(r2, r0, r9, r3, r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0157, code lost:
        return;
     */
    public final void h1(String str, String str2, Bundle bundle, boolean z2, boolean z3, long j, long j2) {
        Bundle bundle2;
        boolean z4;
        String str3;
        long j3;
        long j4;
        if (bundle == null) {
            bundle2 = new Bundle();
        } else {
            bundle2 = bundle;
        }
        String str4 = str2;
        if (Objects.equals(str4, "screen_view")) {
            y19 y19 = (y19) this.w;
            l59 l59 = y19.H;
            y19.f(l59);
            if (true != y19.z.n1((String) null, by8.e1)) {
                j4 = 0;
            } else {
                j4 = j2;
            }
            synchronized (l59.H) {
                try {
                    if (!l59.G) {
                        pz8 pz8 = ((y19) l59.w).B;
                        y19.g(pz8);
                        pz8.G.a("Cannot log screen view event when the app is in the background.");
                        return;
                    }
                    String string = bundle2.getString("screen_name");
                    if (string != null) {
                        if (string.length() > 0) {
                            int length = string.length();
                            ((y19) l59.w).z.getClass();
                        }
                        pz8 pz82 = ((y19) l59.w).B;
                        y19.g(pz82);
                        pz82.G.b("Invalid screen name length for screen view. Length", Integer.valueOf(string.length()));
                        return;
                    }
                    String string2 = bundle2.getString("screen_class");
                    if (string2 != null) {
                        if (string2.length() > 0) {
                            int length2 = string2.length();
                            ((y19) l59.w).z.getClass();
                        }
                        pz8 pz83 = ((y19) l59.w).B;
                        y19.g(pz83);
                        pz83.G.b("Invalid screen class length for screen view. Length", Integer.valueOf(string2.length()));
                        return;
                    }
                    if (string2 == null) {
                        jv8 jv8 = l59.C;
                        if (jv8 != null) {
                            string2 = l59.h1(jv8.x);
                        } else {
                            string2 = "Activity";
                        }
                    }
                    String str5 = string2;
                    f59 f59 = l59.y;
                    if (l59.D && f59 != null) {
                        l59.D = false;
                        boolean equals = Objects.equals(f59.b, str5);
                        boolean equals2 = Objects.equals(f59.a, string);
                        if (equals && equals2) {
                            pz8 pz84 = ((y19) l59.w).B;
                            y19.g(pz84);
                            pz84.G.a("Ignoring call to log screen view event with duplicate parameters.");
                        }
                    }
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
        } else {
            if (!z3 || this.z == null || d99.G1(str4)) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (str == null) {
                str3 = "app";
            } else {
                str3 = str;
            }
            if (true != ((y19) this.w).z.n1((String) null, by8.e1)) {
                j3 = 0;
            } else {
                j3 = j2;
            }
            Bundle bundle3 = new Bundle(bundle2);
            for (String next : bundle3.keySet()) {
                Object obj = bundle3.get(next);
                if (obj instanceof Bundle) {
                    bundle3.putBundle(next, new Bundle((Bundle) obj));
                } else if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    for (int i = 0; i < parcelableArr.length; i++) {
                        Parcelable parcelable = parcelableArr[i];
                        if (parcelable instanceof Bundle) {
                            parcelableArr[i] = new Bundle((Bundle) parcelable);
                        }
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    for (int i2 = 0; i2 < list.size(); i2++) {
                        Object obj2 = list.get(i2);
                        if (obj2 instanceof Bundle) {
                            list.set(i2, new Bundle((Bundle) obj2));
                        }
                    }
                }
            }
            r19 r19 = ((y19) this.w).C;
            y19.g(r19);
            r19.l1(new y39(this, str3, str4, j, j3, bundle3, z3, z4, z2));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r39v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r40v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v2, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v2, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v2, resolved type: boolean} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x03c5  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x03cc  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x0414  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x04ec  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x04fe  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x0529  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x0538  */
    /* JADX WARNING: Removed duplicated region for block: B:206:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01b6  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01c2  */
    public final void i1() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        y19 y19;
        su6 su6;
        jk8 jk8;
        int i6;
        int i7;
        jk8 jk82;
        int i8;
        p79 p79;
        Object obj;
        Object obj2;
        Object obj3;
        String str;
        p79 p792;
        n36 n36;
        String string;
        int i9;
        p79 p793;
        String string2;
        String a;
        v49 v49;
        String str2;
        String str3;
        int i10;
        int c;
        boolean equals;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        int i11;
        int i12;
        int i13;
        int i14;
        String str9;
        String str10;
        String str11;
        String str12;
        b1();
        y19 y192 = (y19) this.w;
        pz8 pz8 = y192.B;
        pz8 pz82 = y192.B;
        y19.g(pz8);
        pz8.I.a("Handle tcf update.");
        q09 q09 = y192.A;
        y19.e(q09);
        SharedPreferences h1 = q09.h1();
        i36 i36 = s79.a;
        ik8 ik8 = ik8.x;
        r79 r79 = r79.w;
        ik8 ik82 = ik8.y;
        r79 r792 = r79.x;
        ik8 ik83 = ik8.z;
        ik8 ik84 = ik8.A;
        ik8 ik85 = ik8.B;
        ik8 ik86 = ik84;
        Object[] objArr = {ik8, r79, ik82, r792, ik83, r79, ik86, r79, ik85, r792, ik8.C, r792, ik8.D, r792};
        ik8 ik87 = ik83;
        ik8 ik88 = ik86;
        ik8 ik89 = ik85;
        n36 a2 = n36.a(7, objArr, (ig) null);
        int i15 = s93.y;
        su6 su62 = new su6("CH");
        char[] cArr = new char[5];
        boolean contains = h1.contains("IABTCF_TCString");
        try {
            i = h1.getInt("IABTCF_CmpSdkID", -1);
        } catch (ClassCastException unused) {
            i = -1;
        }
        try {
            i2 = h1.getInt("IABTCF_PolicyVersion", -1);
        } catch (ClassCastException unused2) {
            i2 = -1;
        }
        q09 q092 = q09;
        try {
            i3 = h1.getInt("IABTCF_gdprApplies", -1);
        } catch (ClassCastException unused3) {
            i3 = -1;
        }
        char[] cArr2 = cArr;
        try {
            i4 = h1.getInt("IABTCF_PurposeOneTreatment", -1);
        } catch (ClassCastException unused4) {
            i4 = -1;
        }
        int i16 = i2;
        try {
            i5 = h1.getInt("IABTCF_EnableAdvertiserConsentMode", -1);
        } catch (ClassCastException unused5) {
            i5 = -1;
        }
        String a3 = s79.a(h1, "IABTCF_PublisherCC");
        boolean z2 = contains;
        int i17 = i;
        ig igVar = new ig(4);
        l36 l36 = (l36) a2.B;
        int i18 = 0;
        if (l36 == null) {
            su6 = su62;
            y19 = y192;
            l36 l362 = new l36(a2, new m36(a2.y, 0, a2.z));
            a2.B = l362;
            l36 = l362;
        } else {
            y19 = y192;
            su6 = su62;
        }
        at7 o = l36.o();
        while (true) {
            boolean hasNext = o.hasNext();
            jk8 = jk8.A;
            i6 = i18;
            if (!hasNext) {
                break;
            }
            ik8 ik810 = (ik8) o.next();
            int a4 = ik810.a();
            at7 at7 = o;
            n36 n362 = a2;
            StringBuilder sb = new StringBuilder(String.valueOf(a4).length() + 28);
            sb.append("IABTCF_PublisherRestrictions");
            sb.append(a4);
            String a5 = s79.a(h1, sb.toString());
            if (!TextUtils.isEmpty(a5) && a5.length() >= 755) {
                int digit = Character.digit(a5.charAt(754), 10);
                jk8 jk83 = jk8.x;
                if (digit < 0 || digit > jk8.values().length || digit == 0) {
                    jk8 = jk83;
                } else if (digit == 1) {
                    jk8 = jk8.y;
                } else if (digit == 2) {
                    jk8 = jk8.z;
                }
            }
            igVar.k(ik810, jk8);
            i18 = i6;
            o = at7;
            a2 = n362;
        }
        n36 n363 = a2;
        n36 c2 = igVar.c(true);
        String a6 = s79.a(h1, "IABTCF_PurposeConsents");
        String a7 = s79.a(h1, "IABTCF_VendorConsents");
        if (TextUtils.isEmpty(a7) || a7.length() < 755 || a7.charAt(754) != '1') {
            i7 = i6;
        } else {
            i7 = 1;
        }
        String a8 = s79.a(h1, "IABTCF_PurposeLegitimateInterests");
        String a9 = s79.a(h1, "IABTCF_VendorLegitimateInterests");
        if (!TextUtils.isEmpty(a9)) {
            jk82 = jk8;
            if (a9.length() >= 755 && a9.charAt(754) == '1') {
                i8 = 1;
                cArr2[i6] = '2';
                pz8 pz83 = pz82;
                p79 p794 = p79;
                String str13 = a6;
                String str14 = a8;
                String str15 = "0";
                if (z2) {
                    n36 = n36.D;
                    obj2 = "EnableAdvertiserConsentMode";
                    str = "1";
                    obj = "gdprApplies";
                    obj3 = "CmpSdkID";
                    p792 = p794;
                } else {
                    jk8 jk84 = (jk8) c2.get(ik8);
                    jk8 jk85 = (jk8) c2.get(ik87);
                    jk8 jk86 = (jk8) c2.get(ik88);
                    jk8 jk87 = (jk8) c2.get(ik89);
                    String str16 = "1";
                    n36 n364 = c2;
                    ig igVar2 = new ig(4);
                    igVar2.k("Version", "2");
                    if (1 != i7) {
                        str4 = str15;
                    } else {
                        str4 = str16;
                    }
                    int i19 = i7;
                    igVar2.k("VendorConsent", str4);
                    if (1 != i8) {
                        str5 = str15;
                    } else {
                        str5 = str16;
                    }
                    int i20 = i8;
                    igVar2.k("VendorLegitimateInterest", str5);
                    if (i3 != 1) {
                        str6 = str15;
                    } else {
                        str6 = str16;
                    }
                    igVar2.k("gdprApplies", str6);
                    if (i5 != 1) {
                        str7 = str15;
                    } else {
                        str7 = str16;
                    }
                    igVar2.k("EnableAdvertiserConsentMode", str7);
                    igVar2.k("PolicyVersion", String.valueOf(i16));
                    igVar2.k("CmpSdkID", String.valueOf(i17));
                    if (i4 != 1) {
                        str8 = str15;
                    } else {
                        str8 = str16;
                    }
                    igVar2.k("PurposeOneTreatment", str8);
                    igVar2.k("PublisherCC", a3);
                    if (jk84 != null) {
                        i11 = jk84.a();
                    } else {
                        i11 = jk82.a();
                    }
                    igVar2.k("PublisherRestrictions1", String.valueOf(i11));
                    if (jk85 != null) {
                        i12 = jk85.a();
                    } else {
                        i12 = jk82.a();
                    }
                    igVar2.k("PublisherRestrictions3", String.valueOf(i12));
                    if (jk86 != null) {
                        i13 = jk86.a();
                    } else {
                        i13 = jk82.a();
                    }
                    igVar2.k("PublisherRestrictions4", String.valueOf(i13));
                    if (jk87 != null) {
                        i14 = jk87.a();
                    } else {
                        i14 = jk82.a();
                    }
                    igVar2.k("PublisherRestrictions7", String.valueOf(i14));
                    String str17 = str13;
                    String str18 = str14;
                    igVar2.l(n36.a(4, new Object[]{"Purpose1", s79.d(ik8, str17, str18), "Purpose3", s79.d(ik87, str17, str18), "Purpose4", s79.d(ik88, str17, str18), "Purpose7", s79.d(ik89, str17, str18)}, (ig) null));
                    String str19 = str18;
                    ig igVar3 = igVar2;
                    int i21 = i3;
                    obj2 = "EnableAdvertiserConsentMode";
                    ik8 ik811 = ik87;
                    int i22 = i4;
                    char[] cArr3 = cArr2;
                    p792 = p794;
                    n36 n365 = n363;
                    str = str16;
                    boolean z3 = i19;
                    ik8 ik812 = ik88;
                    obj = "gdprApplies";
                    n36 n366 = n364;
                    String str20 = a3;
                    obj3 = "CmpSdkID";
                    String str21 = str13;
                    ik8 ik813 = ik89;
                    su6 su63 = su6;
                    boolean b = s79.b(ik8, n365, n366, su63, cArr3, i5, i21, i22, str20, str21, str19, z3, i20);
                    String str22 = str20;
                    String str23 = str21;
                    String str24 = str19;
                    boolean z4 = z3;
                    su6 su64 = su63;
                    char[] cArr4 = cArr3;
                    int i23 = i21;
                    int i24 = i22;
                    if (true != b) {
                        str9 = str15;
                    } else {
                        str9 = str;
                    }
                    n36 n367 = n366;
                    su6 su65 = su64;
                    char[] cArr5 = cArr4;
                    int i25 = i23;
                    int i26 = i24;
                    ik8 ik814 = ik811;
                    String str25 = str22;
                    String str26 = str23;
                    boolean z5 = z4;
                    String str27 = str24;
                    boolean z6 = i20;
                    int i27 = i5;
                    n36 n368 = n365;
                    boolean b2 = s79.b(ik814, n368, n367, su65, cArr5, i27, i25, i26, str25, str26, str27, z5, z6);
                    n36 n369 = n368;
                    n36 n3610 = n367;
                    int i28 = i27;
                    String str28 = str27;
                    boolean z7 = z6;
                    su6 su66 = su65;
                    String str29 = str25;
                    boolean z8 = z5;
                    int i29 = i26;
                    String str30 = str26;
                    int i30 = i25;
                    char[] cArr6 = cArr5;
                    if (true != b2) {
                        str10 = str15;
                    } else {
                        str10 = str;
                    }
                    n36 n3611 = n369;
                    n36 n3612 = n3610;
                    su6 su67 = su66;
                    char[] cArr7 = cArr6;
                    String str31 = str29;
                    String str32 = str30;
                    String str33 = str28;
                    int i31 = i28;
                    ik8 ik815 = ik812;
                    boolean z9 = z7;
                    boolean b3 = s79.b(ik815, n3611, n3612, su67, cArr7, i31, i30, i29, str31, str32, str33, z8, z9);
                    n36 n3613 = n3611;
                    n36 n3614 = n3612;
                    int i32 = i31;
                    String str34 = str33;
                    boolean z10 = z9;
                    char[] cArr8 = cArr7;
                    String str35 = str32;
                    su6 su68 = su67;
                    String str36 = str31;
                    if (true != b3) {
                        str11 = str15;
                    } else {
                        str11 = str;
                    }
                    boolean b4 = s79.b(ik813, n3613, n3614, su68, cArr8, i32, i30, i29, str36, str35, str34, z8, z10);
                    char[] cArr9 = cArr8;
                    if (true != b4) {
                        str12 = str15;
                    } else {
                        str12 = str;
                    }
                    igVar3.l(n36.a(5, new Object[]{"AuthorizePurpose1", str9, "AuthorizePurpose3", str10, "AuthorizePurpose4", str11, "AuthorizePurpose7", str12, "PurposeDiagnostics", new String(cArr9)}, (ig) null));
                    n36 = igVar3.c(true);
                }
                p792 = new p79(n36);
                y19.g(pz83);
                pz8 pz84 = pz83;
                pz84.J.b("Tcf preferences read", p792);
                q092.b1();
                string = q092.g1().getString("stored_tcf_param", "");
                HashMap hashMap = new HashMap();
                if (!TextUtils.isEmpty(string)) {
                    p793 = new p79(hashMap);
                    i9 = 2;
                } else {
                    String[] split = string.split(";");
                    int length = split.length;
                    for (int i33 = i6; i33 < length; i33++) {
                        String[] split2 = split[i33].split("=");
                        if (split2.length >= 2 && s79.a.contains(split2[i6])) {
                            hashMap.put(split2[i6], split2[1]);
                        }
                    }
                    i9 = 2;
                    p793 = new p79(hashMap);
                }
                q092.b1();
                string2 = q092.g1().getString("stored_tcf_param", "");
                a = p792.a();
                if (a.equals(string2)) {
                    SharedPreferences.Editor edit = q092.g1().edit();
                    edit.putString("stored_tcf_param", a);
                    edit.apply();
                    Bundle b5 = p792.b();
                    y19.g(pz84);
                    pz84.J.b("Consent generated from Tcf", b5);
                    if (b5 != Bundle.EMPTY) {
                        y19.G.getClass();
                        v49 = this;
                        v49.w1(b5, -30, System.currentTimeMillis());
                    } else {
                        v49 = this;
                    }
                    Bundle bundle = new Bundle();
                    HashMap hashMap2 = p793.a;
                    if (hashMap2.isEmpty() || ((String) hashMap2.get("Version")) != null) {
                        str2 = str15;
                    } else {
                        str2 = str;
                    }
                    Bundle b6 = p792.b();
                    Bundle b7 = p793.b();
                    if (b6.size() == b7.size() && Objects.equals(b6.getString("ad_storage"), b7.getString("ad_storage")) && Objects.equals(b6.getString("ad_personalization"), b7.getString("ad_personalization")) && Objects.equals(b6.getString("ad_user_data"), b7.getString("ad_user_data"))) {
                        str3 = str15;
                    } else {
                        str3 = str;
                    }
                    bundle.putString("_tcfm", str2.concat(str3));
                    HashMap hashMap3 = p792.a;
                    String str37 = (String) hashMap3.get("PurposeDiagnostics");
                    if (TextUtils.isEmpty(str37)) {
                        str37 = "200000";
                    }
                    bundle.putString("_tcfd2", str37);
                    StringBuilder sb2 = new StringBuilder(str);
                    try {
                        String str38 = (String) hashMap3.get(obj3);
                        if (!TextUtils.isEmpty(str38)) {
                            i10 = Integer.parseInt(str38);
                            if (i10 < 0 || i10 > 4095) {
                                sb2.append("00");
                            } else {
                                sb2.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i10 >> 6));
                                sb2.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i10 & 63));
                            }
                            c = p792.c();
                            if (c >= 0 || c > 63) {
                                sb2.append(str15);
                            } else {
                                sb2.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(c));
                            }
                            if (true == str.equals(hashMap3.get(obj))) {
                                i6 = i9;
                            }
                            equals = str.equals(hashMap3.get(obj2));
                            int i34 = i6 | 4;
                            if (equals) {
                                i34 = i6 | 12;
                            }
                            sb2.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i34));
                            bundle.putString("_tcfd", sb2.toString());
                            v49.j1("auto", "_tcf", bundle);
                            return;
                        }
                    } catch (NumberFormatException unused6) {
                    }
                    i10 = -1;
                    if (i10 < 0 || i10 > 4095) {
                    }
                    c = p792.c();
                    if (c >= 0) {
                    }
                    sb2.append(str15);
                    if (true == str.equals(hashMap3.get(obj))) {
                    }
                    equals = str.equals(hashMap3.get(obj2));
                    int i342 = i6 | 4;
                    if (equals) {
                    }
                    sb2.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i342));
                    bundle.putString("_tcfd", sb2.toString());
                    v49.j1("auto", "_tcf", bundle);
                    return;
                }
                return;
            }
        } else {
            jk82 = jk8;
        }
        i8 = i6;
        cArr2[i6] = '2';
        pz8 pz832 = pz82;
        p79 p7942 = p79;
        String str132 = a6;
        String str142 = a8;
        String str152 = "0";
        if (z2) {
        }
        p792 = new p79(n36);
        y19.g(pz832);
        pz8 pz842 = pz832;
        pz842.J.b("Tcf preferences read", p792);
        q092.b1();
        string = q092.g1().getString("stored_tcf_param", "");
        HashMap hashMap4 = new HashMap();
        if (!TextUtils.isEmpty(string)) {
        }
        q092.b1();
        string2 = q092.g1().getString("stored_tcf_param", "");
        a = p792.a();
        if (a.equals(string2)) {
        }
    }

    public final void j1(String str, String str2, Bundle bundle) {
        long j;
        b1();
        y19 y19 = (y19) this.w;
        y19.G.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        if (y19.z.n1((String) null, by8.e1)) {
            y19.G.getClass();
            j = SystemClock.elapsedRealtime();
        } else {
            j = 0;
        }
        k1(currentTimeMillis, j, bundle, str, str2);
    }

    public final void k1(long j, long j2, Bundle bundle, String str, String str2) {
        b1();
        boolean z2 = true;
        if (this.z != null && !d99.G1(str2)) {
            z2 = false;
        }
        boolean z3 = z2;
        l1(str, str2, j, j2, bundle, true, z3, true);
    }

    /* JADX WARNING: Removed duplicated region for block: B:59:0x013a  */
    public final void l1(String str, String str2, long j, long j2, Bundle bundle, boolean z2, boolean z3, boolean z4) {
        tp8 tp8;
        xb4 xb4;
        q09 q09;
        String str3;
        q09 q092;
        rg4 rg4;
        boolean z5;
        boolean z6;
        long j3;
        l59 l59;
        boolean z7;
        l59 l592;
        boolean z8;
        o79 o79;
        int i;
        int i2;
        long j4;
        long j5;
        o79 o792;
        String str4;
        boolean j1;
        ArrayList arrayList;
        Bundle[] bundleArr;
        int i3;
        int i4;
        int i5;
        String[] strArr;
        Class<?> cls;
        String str5 = str;
        String str6 = str2;
        Bundle bundle2 = bundle;
        boolean z9 = z4;
        z65.h(str5);
        z65.k(bundle2);
        b1();
        d1();
        y19 y19 = (y19) this.w;
        boolean a = y19.a();
        o79 o793 = y19.D;
        tp8 tp82 = y19.z;
        Context context = y19.w;
        d99 d99 = y19.E;
        pz8 pz8 = y19.B;
        if (a) {
            List list = y19.l().G;
            if (list == null || list.contains(str6)) {
                if (!this.B) {
                    this.B = true;
                    try {
                        if (!y19.x) {
                            cls = Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, context.getClassLoader());
                        } else {
                            cls = Class.forName("com.google.android.gms.tagmanager.TagManagerService");
                        }
                        try {
                            cls.getDeclaredMethod("initialize", new Class[]{Context.class}).invoke((Object) null, new Object[]{context});
                        } catch (Exception e) {
                            y19.g(pz8);
                            pz8.E.b("Failed to invoke Tag Manager's initialize() method", e);
                        }
                    } catch (ClassNotFoundException unused) {
                        y19.g(pz8);
                        pz8.H.a("Tag Manager is not found and thus will not be used");
                    }
                }
                fz8 fz8 = y19.F;
                q09 q093 = y19.A;
                xb4 xb42 = y19.G;
                if (tp82.n1((String) null, by8.Z0) || !"_cmp".equals(str6) || !bundle2.containsKey("gclid")) {
                    q09 = q093;
                    xb4 = xb42;
                    tp8 = tp82;
                    str3 = null;
                } else {
                    String string = bundle2.getString("gclid");
                    xb42.getClass();
                    q09 = q093;
                    xb4 = xb42;
                    tp8 = tp82;
                    str3 = null;
                    n1(System.currentTimeMillis(), string, "auto", "_lgclid");
                }
                if (!z2 || d99.F[0].equals(str6)) {
                    q092 = q09;
                } else {
                    y19.e(d99);
                    y19.e(q09);
                    q092 = q09;
                    d99.p1(bundle2, q092.U.e());
                }
                rg4 rg42 = this.R;
                if (z9 || "_iap".equals(str6)) {
                    rg4 = rg42;
                } else {
                    y19.e(d99);
                    int i6 = 2;
                    if (!d99.f2("event", str6)) {
                        rg4 = rg42;
                    } else {
                        String[] strArr2 = r16.T;
                        rg4 = rg42;
                        if (((y19) d99.w).z.n1(str3, by8.f1)) {
                            strArr = r16.V;
                        } else {
                            strArr = r16.U;
                        }
                        if (!d99.h2("event", strArr2, strArr, str6)) {
                            i6 = 13;
                        } else {
                            i4 = 40;
                            if (d99.i2(40, "event", str6)) {
                                i6 = 0;
                            }
                            if (i6 != 0) {
                                y19.g(pz8);
                                pz8.D.b("Invalid public event name. Event will not be logged (FE)", fz8.a(str6));
                                y19.e(d99);
                                String j12 = d99.j1(i4, str6, true);
                                if (str6 != null) {
                                    i5 = str6.length();
                                } else {
                                    i5 = 0;
                                }
                                rg4 rg43 = rg4;
                                d99.u1(rg43, (String) null, i6, "_ev", j12, i5);
                                return;
                            }
                        }
                    }
                    i4 = 40;
                    if (i6 != 0) {
                    }
                }
                l59 l593 = y19.H;
                y19.f(l593);
                f59 g1 = l593.g1(false);
                if (g1 != null && !bundle2.containsKey("_sc")) {
                    g1.d = true;
                }
                if (!z2 || z9) {
                    z5 = false;
                } else {
                    z5 = true;
                }
                d99.Y1(g1, bundle2, z5);
                boolean equals = "am".equals(str5);
                boolean G1 = d99.G1(str6);
                if (!z2 || this.z == null || G1) {
                    z6 = equals;
                } else if (equals) {
                    z6 = true;
                } else {
                    y19.g(pz8);
                    pz8.I.c(fz8.a(str6), fz8.e(bundle2), "Passing event to registered event handler (FE)");
                    z65.k(this.z);
                    k68 k68 = this.z;
                    k68.getClass();
                    try {
                        ((tu8) k68.x).g(str5, str6, bundle2, j);
                        return;
                    } catch (RemoteException e2) {
                        y19 y192 = ((AppMeasurementDynamiteService) k68.y).d;
                        if (y192 != null) {
                            pz8 pz82 = y192.B;
                            y19.g(pz82);
                            pz82.E.b("Event interceptor threw exception", e2);
                            return;
                        }
                        return;
                    }
                }
                if (y19.c()) {
                    y19.e(d99);
                    y19 y193 = (y19) d99.w;
                    int j22 = d99.j2(str6);
                    if (j22 != 0) {
                        y19.g(pz8);
                        pz8.D.b("Invalid event name. Event will not be logged (FE)", fz8.a(str6));
                        String j13 = d99.j1(40, str6, true);
                        if (str6 != null) {
                            i3 = str6.length();
                        } else {
                            i3 = 0;
                        }
                        y19.e(d99);
                        rg4 rg44 = rg4;
                        d99.u1(rg44, (String) null, j22, "_ev", j13, i3);
                        return;
                    }
                    y19 y194 = y19;
                    Bundle m1 = d99.m1(str6, bundle2, h03.q("_o", "_sn", "_sc", "_si"), z9);
                    z65.k(m1);
                    y19.f(l593);
                    String str7 = "_o";
                    if (l593.g1(false) == null || !"_ae".equals(str6)) {
                        l59 = l593;
                        j3 = 0;
                    } else {
                        y19.f(o793);
                        r38 r38 = o793.B;
                        ((y19) ((o79) r38.z).w).G.getClass();
                        j3 = 0;
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        l59 = l593;
                        long j6 = elapsedRealtime - r38.x;
                        r38.x = elapsedRealtime;
                        if (j6 > 0) {
                            d99.O1(m1, j6);
                        }
                    }
                    if (!"auto".equals(str5) && "_ssr".equals(str6)) {
                        String string2 = m1.getString("_ffr");
                        int i7 = c57.a;
                        if (string2 == null || string2.trim().isEmpty()) {
                            string2 = null;
                        } else if (string2 != null) {
                            string2 = string2.trim();
                        }
                        q09 q094 = y193.A;
                        y19.e(q094);
                        if (!Objects.equals(string2, q094.R.j())) {
                            q09 q095 = y193.A;
                            y19.e(q095);
                            q095.R.k(string2);
                        } else {
                            pz8 pz83 = y193.B;
                            y19.g(pz83);
                            pz83.I.a("Not logging duplicate session_start_with_rollout event");
                            return;
                        }
                    } else if ("_ae".equals(str6)) {
                        q09 q096 = y193.A;
                        y19.e(q096);
                        String j7 = q096.R.j();
                        if (!TextUtils.isEmpty(j7)) {
                            m1.putString("_ffr", j7);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(m1);
                    if (tp8.n1((String) null, by8.S0)) {
                        y19.f(o793);
                        o793.b1();
                        z7 = o793.z;
                    } else {
                        y19.e(q092);
                        z7 = q092.O.a();
                    }
                    y19.e(q092);
                    if (q092.L.a() > j3) {
                        o79 = o793;
                        j4 = j;
                        if (!q092.l1(j4) || !z7) {
                            z8 = z6;
                            i2 = 1;
                            l592 = l59;
                            j5 = j3;
                            i = 0;
                        } else {
                            y19.g(pz8);
                            pz8.J.a("Current session is expired, remove the session number, ID, and engagement time");
                            xb4.getClass();
                            l592 = l59;
                            z8 = z6;
                            i2 = 1;
                            i = 0;
                            n1(System.currentTimeMillis(), (Object) null, "auto", "_sid");
                            n1(System.currentTimeMillis(), (Object) null, "auto", "_sno");
                            n1(System.currentTimeMillis(), (Object) null, "auto", "_se");
                            j5 = j3;
                            q092.M.b(j5);
                        }
                    } else {
                        z8 = z6;
                        i2 = 1;
                        l592 = l59;
                        o79 = o793;
                        j5 = j3;
                        i = 0;
                        j4 = j;
                    }
                    if (m1.getLong("extend_session", j5) == 1) {
                        y19.g(pz8);
                        pz8.J.a("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                        y19.f(o79);
                        o792 = o79;
                        o792.A.l(j4, j2);
                    } else {
                        long j8 = j2;
                        o792 = o79;
                    }
                    ArrayList arrayList3 = new ArrayList(m1.keySet());
                    Collections.sort(arrayList3);
                    int size = arrayList3.size();
                    int i8 = i;
                    while (i8 < size) {
                        String str8 = (String) arrayList3.get(i8);
                        if (str8 != null) {
                            y19.e(d99);
                            Object obj = m1.get(str8);
                            arrayList = arrayList3;
                            if (obj instanceof Bundle) {
                                bundleArr = new Bundle[i2];
                                bundleArr[i] = (Bundle) obj;
                            } else if (obj instanceof Parcelable[]) {
                                Parcelable[] parcelableArr = (Parcelable[]) obj;
                                bundleArr = (Bundle[]) Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
                            } else if (obj instanceof ArrayList) {
                                ArrayList arrayList4 = (ArrayList) obj;
                                bundleArr = (Bundle[]) arrayList4.toArray(new Bundle[arrayList4.size()]);
                            } else {
                                bundleArr = null;
                            }
                            if (bundleArr != null) {
                                m1.putParcelableArray(str8, bundleArr);
                            }
                        } else {
                            arrayList = arrayList3;
                        }
                        i8++;
                        arrayList3 = arrayList;
                        i2 = 1;
                    }
                    int i9 = i;
                    while (i9 < arrayList2.size()) {
                        Bundle bundle3 = (Bundle) arrayList2.get(i9);
                        if (i9 != 0) {
                            str4 = "_ep";
                        } else {
                            str4 = str2;
                        }
                        String str9 = str7;
                        bundle3.putString(str9, str5);
                        if (z3) {
                            bundle3 = d99.I1(bundle3);
                        }
                        long j9 = j4;
                        Bundle bundle4 = bundle3;
                        zr8 zr8 = new zr8(str4, new ur8(bundle3), str5, j9, j2);
                        r69 j10 = y194.j();
                        j10.getClass();
                        j10.b1();
                        j10.d1();
                        j10.o1();
                        cz8 i10 = ((y19) j10.w).i();
                        i10.getClass();
                        Parcel obtain = Parcel.obtain();
                        ki8.a(zr8, obtain, i);
                        byte[] marshall = obtain.marshall();
                        obtain.recycle();
                        if (marshall.length > 131072) {
                            pz8 pz84 = ((y19) i10.w).B;
                            y19.g(pz84);
                            pz84.C.a("Event is too long for local database. Sending event directly to service");
                            j1 = false;
                        } else {
                            j1 = i10.j1(0, marshall);
                        }
                        j10.q1(new hy8(j10, j10.s1(true), j1, (a3) zr8, 2));
                        if (!z8) {
                            Iterator it = this.A.iterator();
                            while (it.hasNext()) {
                                ((k39) it.next()).a(str, str2, new Bundle(bundle4), j);
                            }
                        }
                        String str10 = str2;
                        i9++;
                        str5 = str;
                        j4 = j;
                        long j11 = j2;
                        str7 = str9;
                        i = 0;
                    }
                    String str11 = str2;
                    y19.f(l592);
                    if (l592.g1(false) != null && "_ae".equals(str11)) {
                        y19.f(o792);
                        xb4.getClass();
                        o792.B.e(true, true, SystemClock.elapsedRealtime());
                        return;
                    }
                    return;
                }
                return;
            }
            y19.g(pz8);
            pz8.I.c(str6, str5, "Dropping non-safelisted event. event name, origin");
            return;
        }
        y19.g(pz8);
        pz8.I.a("Event not sent since app measurement is disabled");
    }

    public final void m1(String str, String str2, Object obj, boolean z2, long j) {
        int i;
        String str3;
        y19 y19 = (y19) this.w;
        int i2 = 0;
        if (z2) {
            d99 d99 = y19.E;
            y19.e(d99);
            i = d99.l2(str2);
        } else {
            d99 d992 = y19.E;
            y19.e(d992);
            if (d992.f2("user property", str2)) {
                if (!d992.h2("user property", ar7.y0, (String[]) null, str2)) {
                    i = 15;
                } else {
                    ((y19) d992.w).getClass();
                    if (d992.i2(24, "user property", str2)) {
                        i = 0;
                    }
                }
            }
            i = 6;
        }
        rg4 rg4 = this.R;
        if (i != 0) {
            y19.e(y19.E);
            String j1 = d99.j1(24, str2, true);
            if (str2 != null) {
                i2 = str2.length();
            }
            y19.e(y19.E);
            rg4 rg42 = rg4;
            d99.u1(rg42, (String) null, i, "_ev", j1, i2);
            return;
        }
        rg4 rg43 = rg4;
        if (str == null) {
            str3 = "app";
        } else {
            str3 = str;
        }
        if (obj != null) {
            d99 d993 = y19.E;
            d99 d994 = y19.E;
            y19.e(d993);
            int r1 = d993.r1(str2, obj);
            if (r1 != 0) {
                y19.e(d994);
                String j12 = d99.j1(24, str2, true);
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    i2 = obj.toString().length();
                }
                y19.e(d994);
                d99.u1(rg43, (String) null, r1, "_ev", j12, i2);
                return;
            }
            y19.e(d994);
            Object s1 = d994.s1(str2, obj);
            if (s1 != null) {
                r19 r19 = y19.C;
                y19.g(r19);
                r19.l1(new rk7(this, str3, str2, s1, j, 2));
                return;
            }
            return;
        }
        r19 r192 = y19.C;
        y19.g(r192);
        r192.l1(new rk7(this, str3, str2, (Object) null, j, 2));
    }

    public final void n1(long j, Object obj, String str, String str2) {
        String str3;
        boolean z2;
        long j2;
        Object obj2 = obj;
        y19 y19 = (y19) this.w;
        z65.h(str);
        z65.h(str2);
        b1();
        d1();
        String str4 = str2;
        if ("allow_personalized_ads".equals(str4)) {
            String str5 = "_npa";
            if (obj2 instanceof String) {
                String str6 = (String) obj2;
                if (!TextUtils.isEmpty(str6)) {
                    String lowerCase = str6.toLowerCase(Locale.ENGLISH);
                    String str7 = "false";
                    if (true != str7.equals(lowerCase)) {
                        j2 = 0;
                    } else {
                        j2 = 1;
                    }
                    obj2 = Long.valueOf(j2);
                    q09 q09 = y19.A;
                    y19.e(q09);
                    l90 l90 = q09.I;
                    if (j2 == 1) {
                        str7 = "true";
                    }
                    l90.k(str7);
                    pz8 pz8 = y19.B;
                    y19.g(pz8);
                    pz8.J.c("non_personalized_ads(_npa)", obj2, "Setting user property(FE)");
                    str3 = str5;
                }
            }
            if (obj2 == null) {
                q09 q092 = y19.A;
                y19.e(q092);
                q092.I.k("unset");
            } else {
                str5 = str4;
            }
            pz8 pz82 = y19.B;
            y19.g(pz82);
            pz82.J.c("non_personalized_ads(_npa)", obj2, "Setting user property(FE)");
            str3 = str5;
        } else {
            str3 = str4;
        }
        Object obj3 = obj2;
        if (!y19.a()) {
            pz8 pz83 = y19.B;
            y19.g(pz83);
            pz83.J.a("User property not set since app measurement is disabled");
        } else if (y19.c()) {
            z89 z89 = new z89(j, obj3, str3, str);
            r69 j3 = y19.j();
            j3.b1();
            j3.d1();
            j3.o1();
            cz8 i = ((y19) j3.w).i();
            i.getClass();
            Parcel obtain = Parcel.obtain();
            g39.b(z89, obtain);
            byte[] marshall = obtain.marshall();
            obtain.recycle();
            if (marshall.length > 131072) {
                pz8 pz84 = ((y19) i.w).B;
                y19.g(pz84);
                pz84.C.a("User property too long for local database. Sending directly to service");
                z2 = false;
            } else {
                z2 = i.j1(1, marshall);
            }
            j3.q1(new hy8(j3, j3.s1(true), z2, (a3) z89, 1));
        }
    }

    public final void o1() {
        b1();
        d1();
        y19 y19 = (y19) this.w;
        if (y19.c()) {
            tp8 tp8 = y19.z;
            ((y19) tp8.w).getClass();
            Boolean p1 = tp8.p1("google_analytics_deferred_deep_link_enabled");
            if (p1 != null && p1.booleanValue()) {
                pz8 pz8 = y19.B;
                y19.g(pz8);
                pz8.I.a("Deferred Deep Link feature enabled.");
                r19 r19 = y19.C;
                y19.g(r19);
                r19.l1(new o39(this, 2));
            }
            r69 j = y19.j();
            j.b1();
            j.d1();
            z99 s1 = j.s1(true);
            j.o1();
            y19 y192 = (y19) j.w;
            y192.z.n1((String) null, by8.W0);
            y192.i().j1(3, new byte[0]);
            j.q1(new v59(j, s1, 1));
            this.N = false;
            q09 q09 = y19.A;
            y19.e(q09);
            q09.b1();
            String string = q09.g1().getString("previous_os_version", (String) null);
            ((y19) q09.w).k().e1();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor edit = q09.g1().edit();
                edit.putString("previous_os_version", str);
                edit.apply();
            }
            if (!TextUtils.isEmpty(string)) {
                y19.k().e1();
                if (!string.equals(str)) {
                    Bundle bundle = new Bundle();
                    bundle.putString("_po", string);
                    j1("auto", "_ou", bundle);
                }
            }
        }
    }

    public final void p1(Bundle bundle, long j) {
        y19 y19 = (y19) this.w;
        z65.k(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            pz8 pz8 = y19.B;
            y19.g(pz8);
            pz8.E.a("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        Class<String> cls = String.class;
        p25.I(bundle2, "app_id", cls, (Object) null);
        p25.I(bundle2, "origin", cls, (Object) null);
        p25.I(bundle2, "name", cls, (Object) null);
        p25.I(bundle2, "value", Object.class, (Object) null);
        p25.I(bundle2, "trigger_event_name", cls, (Object) null);
        Class<Long> cls2 = Long.class;
        p25.I(bundle2, "trigger_timeout", cls2, 0L);
        p25.I(bundle2, "timed_out_event_name", cls, (Object) null);
        Class<Bundle> cls3 = Bundle.class;
        p25.I(bundle2, "timed_out_event_params", cls3, (Object) null);
        p25.I(bundle2, "triggered_event_name", cls, (Object) null);
        p25.I(bundle2, "triggered_event_params", cls3, (Object) null);
        p25.I(bundle2, "time_to_live", cls2, 0L);
        p25.I(bundle2, "expired_event_name", cls, (Object) null);
        p25.I(bundle2, "expired_event_params", cls3, (Object) null);
        z65.h(bundle2.getString("name"));
        z65.h(bundle2.getString("origin"));
        z65.k(bundle2.get("value"));
        bundle2.putLong("creation_timestamp", j);
        String string = bundle2.getString("name");
        Object obj = bundle2.get("value");
        d99 d99 = y19.E;
        fz8 fz8 = y19.F;
        pz8 pz82 = y19.B;
        y19.e(d99);
        if (d99.l2(string) == 0) {
            y19.e(d99);
            if (d99.r1(string, obj) == 0) {
                Object s1 = d99.s1(string, obj);
                if (s1 == null) {
                    y19.g(pz82);
                    pz82.B.c(fz8.c(string), obj, "Unable to normalize conditional user property value");
                    return;
                }
                p25.H(bundle2, s1);
                long j2 = bundle2.getLong("trigger_timeout");
                if (TextUtils.isEmpty(bundle2.getString("trigger_event_name")) || (j2 <= 15552000000L && j2 >= 1)) {
                    long j3 = bundle2.getLong("time_to_live");
                    if (j3 > 15552000000L || j3 < 1) {
                        y19.g(pz82);
                        pz82.B.c(fz8.c(string), Long.valueOf(j3), "Invalid conditional user property time to live");
                        return;
                    }
                    r19 r19 = y19.C;
                    y19.g(r19);
                    r19.l1(new a49(this, bundle2, 0));
                    return;
                }
                y19.g(pz82);
                pz82.B.c(fz8.c(string), Long.valueOf(j2), "Invalid conditional user property timeout");
                return;
            }
            y19.g(pz82);
            pz82.B.c(fz8.c(string), obj, "Invalid conditional user property value");
            return;
        }
        y19.g(pz82);
        pz82.B.b("Invalid conditional user property name", fz8.c(string));
    }

    public final void q1(String str, String str2, Bundle bundle) {
        y19 y19 = (y19) this.w;
        y19.G.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        z65.h(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong("creation_timestamp", currentTimeMillis);
        if (str2 != null) {
            bundle2.putString("expired_event_name", str2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        r19 r19 = y19.C;
        y19.g(r19);
        r19.l1(new a49(this, bundle2, 1));
    }

    public final String r1() {
        y19 y19 = (y19) this.w;
        try {
            return b35.F(y19.w, y19.L);
        } catch (IllegalStateException e) {
            pz8 pz8 = y19.B;
            y19.g(pz8);
            pz8.B.b("getGoogleAppId failed with exception", e);
            return null;
        }
    }

    public final void s1(h39 h39, long j, boolean z2) {
        int i = h39.b;
        b1();
        d1();
        y19 y19 = (y19) this.w;
        q09 q09 = y19.A;
        pz8 pz8 = y19.B;
        y19.e(q09);
        h39 j1 = q09.j1();
        if (j > this.L || !h39.l(j1.b, i)) {
            q09 q092 = y19.A;
            y19.e(q092);
            q092.b1();
            if (h39.l(i, q092.g1().getInt("consent_source", 100))) {
                SharedPreferences.Editor edit = q092.g1().edit();
                edit.putString("consent_settings", h39.g());
                edit.putInt("consent_source", i);
                edit.apply();
                y19.g(pz8);
                pz8.J.b("Setting storage consent(FE)", h39);
                this.L = j;
                if (y19.j().m1()) {
                    r69 j2 = y19.j();
                    j2.b1();
                    j2.d1();
                    j2.q1(new k69(j2, 2));
                } else {
                    r69 j3 = y19.j();
                    j3.b1();
                    j3.d1();
                    if (j3.l1()) {
                        j3.q1(new v59(j3, j3.s1(false)));
                    }
                }
                if (z2) {
                    y19.j().g1(new AtomicReference());
                    return;
                }
                return;
            }
            y19.g(pz8);
            pz8.H.b("Lower precedence consent source ignored, proposed source", Integer.valueOf(i));
            return;
        }
        y19.g(pz8);
        pz8.H.b("Dropped out-of-date consent setting, proposed settings", h39);
    }

    public final void t1(Boolean bool, boolean z2) {
        b1();
        d1();
        y19 y19 = (y19) this.w;
        pz8 pz8 = y19.B;
        y19.g(pz8);
        pz8.I.b("Setting app measurement enabled (FE)", bool);
        q09 q09 = y19.A;
        y19.e(q09);
        q09.b1();
        SharedPreferences.Editor edit = q09.g1().edit();
        if (bool != null) {
            edit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            edit.remove("measurement_enabled");
        }
        edit.apply();
        if (z2) {
            q09.b1();
            SharedPreferences.Editor edit2 = q09.g1().edit();
            if (bool != null) {
                edit2.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                edit2.remove("measurement_enabled_from_api");
            }
            edit2.apply();
        }
        r19 r19 = y19.C;
        y19.g(r19);
        r19.b1();
        if (y19.V || (bool != null && !bool.booleanValue())) {
            u1();
        }
    }

    public final void u1() {
        long j;
        b1();
        y19 y19 = (y19) this.w;
        q09 q09 = y19.A;
        pz8 pz8 = y19.B;
        xb4 xb4 = y19.G;
        y19.e(q09);
        String j2 = q09.I.j();
        if (j2 != null) {
            if ("unset".equals(j2)) {
                xb4.getClass();
                n1(System.currentTimeMillis(), (Object) null, "app", "_npa");
            } else {
                if (true != "true".equals(j2)) {
                    j = 0;
                } else {
                    j = 1;
                }
                Long valueOf = Long.valueOf(j);
                xb4.getClass();
                n1(System.currentTimeMillis(), valueOf, "app", "_npa");
            }
        }
        if (!y19.a() || !this.N) {
            y19.g(pz8);
            pz8.I.a("Updating Scion state (FE)");
            r69 j3 = y19.j();
            j3.b1();
            j3.d1();
            j3.q1(new v59(j3, j3.s1(true), 3));
            return;
        }
        y19.g(pz8);
        pz8.I.a("Recording app launch after enabling measurement for the first time (FE)");
        o1();
        o79 o79 = y19.D;
        y19.f(o79);
        o79.A.k();
        r19 r19 = y19.C;
        y19.g(r19);
        r19.l1(new o39(this, 1));
    }

    public final void v1() {
        y19 y19 = (y19) this.w;
        if ((y19.w.getApplicationContext() instanceof Application) && this.y != null) {
            ((Application) y19.w.getApplicationContext()).unregisterActivityLifecycleCallbacks(this.y);
        }
    }

    public final void w1(Bundle bundle, int i, long j) {
        Boolean bool;
        String str;
        c39 c39;
        String str2;
        Boolean bool2;
        y19 y19 = (y19) this.w;
        d1();
        h39 h39 = h39.c;
        f39[] f39Arr = d39.STORAGE.w;
        int length = f39Arr.length;
        int i2 = 0;
        while (true) {
            bool = null;
            if (i2 >= length) {
                str = null;
                break;
            }
            String str3 = f39Arr[i2].w;
            if (bundle.containsKey(str3) && (str = bundle.getString(str3)) != null) {
                if (str.equals("granted")) {
                    bool2 = Boolean.TRUE;
                } else if (str.equals("denied")) {
                    bool2 = Boolean.FALSE;
                } else {
                    bool2 = null;
                }
                if (bool2 == null) {
                    break;
                }
            }
            i2++;
        }
        if (str != null) {
            pz8 pz8 = y19.B;
            y19.g(pz8);
            pz8.G.b("Ignoring invalid consent setting", str);
            pz8 pz82 = y19.B;
            y19.g(pz82);
            pz82.G.a("Valid consent values are 'granted', 'denied'");
        }
        r19 r19 = y19.C;
        y19.g(r19);
        boolean i1 = r19.i1();
        h39 b = h39.b(i, bundle);
        Iterator it = b.a.values().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            c39 = c39.UNINITIALIZED;
            if (hasNext) {
                if (((c39) it.next()) != c39) {
                    y1(b, i1);
                    break;
                }
            } else {
                break;
            }
        }
        ir8 c = ir8.c(i, bundle);
        Iterator it2 = c.e.values().iterator();
        while (true) {
            if (it2.hasNext()) {
                if (((c39) it2.next()) != c39) {
                    x1(c, i1);
                    break;
                }
            } else {
                break;
            }
        }
        if (bundle != null) {
            int ordinal = h39.d(bundle.getString("ad_personalization")).ordinal();
            if (ordinal == 2) {
                bool = Boolean.FALSE;
            } else if (ordinal == 3) {
                bool = Boolean.TRUE;
            }
        }
        if (bool != null) {
            if (i == -30) {
                str2 = "tcf";
            } else {
                str2 = "app";
            }
            if (i1) {
                n1(j, bool.toString(), str2, "allow_personalized_ads");
                return;
            }
            m1(str2, "allow_personalized_ads", bool.toString(), false, j);
        }
    }

    public final void x1(ir8 ir8, boolean z2) {
        c49 c49 = new c49(0, (Object) this, (Object) ir8);
        if (z2) {
            b1();
            c49.run();
            return;
        }
        r19 r19 = ((y19) this.w).C;
        y19.g(r19);
        r19.l1(c49);
    }

    public final void y1(h39 h39, boolean z2) {
        boolean z3;
        boolean z4;
        boolean z5;
        h39 h392;
        d1();
        int i = h39.b;
        if (i != -10) {
            c39 c39 = (c39) h39.a.get(f39.AD_STORAGE);
            if (c39 == null) {
                c39 = c39.UNINITIALIZED;
            }
            c39 c392 = c39.UNINITIALIZED;
            if (c39 == c392) {
                c39 c393 = (c39) h39.a.get(f39.ANALYTICS_STORAGE);
                if (c393 == null) {
                    c393 = c392;
                }
                if (c393 == c392) {
                    pz8 pz8 = ((y19) this.w).B;
                    y19.g(pz8);
                    pz8.G.a("Ignoring empty consent settings");
                    return;
                }
            }
        }
        synchronized (this.D) {
            try {
                z3 = false;
                if (h39.l(i, this.J.b)) {
                    h39 h393 = this.J;
                    EnumMap enumMap = h39.a;
                    f39[] f39Arr = (f39[]) enumMap.keySet().toArray(new f39[0]);
                    int length = f39Arr.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            z4 = false;
                            break;
                        }
                        f39 f39 = f39Arr[i2];
                        c39 c394 = (c39) enumMap.get(f39);
                        c39 c395 = (c39) h393.a.get(f39);
                        c39 c396 = c39.DENIED;
                        if (c394 == c396 && c395 != c396) {
                            z4 = true;
                            break;
                        }
                        i2++;
                    }
                    f39 f392 = f39.ANALYTICS_STORAGE;
                    if (h39.i(f392) && !this.J.i(f392)) {
                        z3 = true;
                    }
                    h39 = h39.k(this.J);
                    this.J = h39;
                    z5 = z3;
                    z3 = true;
                } else {
                    z4 = false;
                    z5 = false;
                }
                h392 = h39;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        if (!z3) {
            pz8 pz82 = ((y19) this.w).B;
            y19.g(pz82);
            pz82.H.b("Ignoring lower-priority consent settings, proposed settings", h392);
            return;
        }
        long andIncrement = this.K.getAndIncrement();
        if (z4) {
            this.C.set((Object) null);
            e49 e49 = new e49(this, h392, andIncrement, z5, 0);
            if (z2) {
                b1();
                e49.run();
                return;
            }
            r19 r19 = ((y19) this.w).C;
            y19.g(r19);
            r19.n1(e49);
            return;
        }
        e49 e492 = new e49(this, h392, andIncrement, z5, 1);
        if (z2) {
            b1();
            e492.run();
        } else if (i == 30 || i == -10) {
            r19 r192 = ((y19) this.w).C;
            y19.g(r192);
            r192.n1(e492);
        } else {
            r19 r193 = ((y19) this.w).C;
            y19.g(r193);
            r193.l1(e492);
        }
    }

    public final void z1() {
        wo8.a();
        y19 y19 = (y19) this.w;
        tp8 tp8 = y19.z;
        r19 r19 = y19.C;
        pz8 pz8 = y19.B;
        if (tp8.n1((String) null, by8.P0)) {
            y19.g(r19);
            if (r19.i1()) {
                y19.g(pz8);
                pz8.B.a("Cannot get trigger URIs from analytics worker thread");
            } else if (!ts2.o()) {
                d1();
                y19.g(pz8);
                pz8.J.a("Getting trigger URIs (FE)");
                AtomicReference atomicReference = new AtomicReference();
                y19.g(r19);
                r19.m1(atomicReference, 10000, "get trigger URIs", new z39(this, atomicReference, 5, false));
                List list = (List) atomicReference.get();
                if (list == null) {
                    y19.g(pz8);
                    pz8.D.a("Timed out waiting for get trigger URIs");
                    return;
                }
                y19.g(r19);
                r19.l1(new c49(2, (Object) this, (Object) list));
            } else {
                y19.g(pz8);
                pz8.B.a("Cannot get trigger URIs from main thread");
            }
        }
    }
}
