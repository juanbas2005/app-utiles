package defpackage;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Matrix;
import android.os.Build;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import androidx.datastore.core.CorruptionException;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;

/* renamed from: sg3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class sg3 {
    public static final rr a = new rr(0);
    public static final rr b = new rr(1);
    public static final fw0 c = new fw0(-698681925, new sw0(4), false);
    public static final char[] d = {'*', '*', '*', ' ', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
    public static final char[] e;
    public static final char[] f = {'*', '*', '*', ' ', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    public static final char[] g;
    public static final char[] h = {'`', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '{', '|', '}', '~', 127};
    public static final int[] i = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000};
    public static final StackTraceElement[] j = new StackTraceElement[0];
    public static final Object k = new Object();
    public static volatile bn8 l;
    public static x83 m;
    public static Boolean n;
    public static Boolean o;
    public static Boolean p;
    public static Boolean q;
    public static final /* synthetic */ int r = 0;
    public static x83 s;
    public static x83 t;
    public static x83 u;

    static {
        char[] cArr = {'!', '\"', '#', '$', '%', '&', '\'', '(', ')', '*', '+', ',', '-', '.', '/', ':', ';', '<', '=', '>', '?', '@', '[', '\\', ']', '^', '_'};
        e = cArr;
        g = cArr;
    }

    public static final boolean A(Context context, String str) {
        context.getClass();
        str.getClass();
        if (ag8.k(context, str) == 0) {
            return true;
        }
        return false;
    }

    public static final boolean B(Context context) {
        TelephonyManager telephonyManager;
        int i2;
        context.getClass();
        Object systemService = context.getSystemService("phone");
        if (systemService instanceof TelephonyManager) {
            telephonyManager = (TelephonyManager) systemService;
        } else {
            telephonyManager = null;
        }
        if (telephonyManager == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            i2 = telephonyManager.getActiveModemCount();
        } else {
            i2 = telephonyManager.getPhoneCount();
        }
        if (i2 > 1) {
            return true;
        }
        return false;
    }

    public static boolean C(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (n == null) {
            n = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        n.booleanValue();
        if (o == null) {
            o = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        if (!o.booleanValue()) {
            return false;
        }
        if (!za5.w() || Build.VERSION.SDK_INT >= 30) {
            return true;
        }
        return false;
    }

    public static List D(Object obj) {
        List singletonList = Collections.singletonList(obj);
        singletonList.getClass();
        return singletonList;
    }

    public static List E(Object... objArr) {
        objArr.getClass();
        if (objArr.length <= 0) {
            return a42.w;
        }
        List asList = Arrays.asList(objArr);
        asList.getClass();
        return asList;
    }

    public static List F(Object obj) {
        if (obj != null) {
            return D(obj);
        }
        return a42.w;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: ck4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: ck4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v17, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: ck4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: ck4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v19, resolved type: ck4} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x018b A[SYNTHETIC, Splitter:B:103:0x018b] */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0195  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x01b8  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x01ba  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0088 A[SYNTHETIC, Splitter:B:34:0x0088] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0149  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0155 A[SYNTHETIC, Splitter:B:91:0x0155] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0171 A[SYNTHETIC, Splitter:B:97:0x0171] */
    public static void G(Intent intent) {
        boolean z;
        int i2;
        String string;
        ak4 ak4;
        String string2;
        boolean z2;
        String string3;
        String str;
        String string4;
        String str2;
        String string5;
        String str3;
        String string6;
        String str4;
        String string7;
        String str5;
        long j2;
        long j3;
        String str6;
        String str7;
        int parseInt;
        Intent intent2 = intent;
        if (V(intent2)) {
            H("_nr", intent2.getExtras());
        }
        int i3 = 0;
        if (intent2 == null || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent2.getAction())) {
            z = false;
        } else {
            z = q();
        }
        if (z) {
            cn7 cn7 = (cn7) FirebaseMessaging.m.get();
            if (cn7 == null) {
                Log.e("FirebaseMessaging", "TransportFactory is null. Skip exporting message delivery metrics to Big Query");
                return;
            }
            ck4 ck4 = null;
            if (intent2 != null) {
                Bundle extras = intent2.getExtras();
                if (extras == null) {
                    extras = Bundle.EMPTY;
                }
                Object obj = extras.get("google.ttl");
                if (obj instanceof Integer) {
                    parseInt = ((Integer) obj).intValue();
                } else {
                    if (obj instanceof String) {
                        try {
                            parseInt = Integer.parseInt((String) obj);
                        } catch (NumberFormatException unused) {
                            Log.w("FirebaseMessaging", "Invalid TTL: " + obj);
                        }
                    }
                    i2 = 0;
                    string = extras.getString("google.to");
                    if (TextUtils.isEmpty(string)) {
                        try {
                            oe2 c2 = oe2.c();
                            try {
                                Object obj2 = ve2.m;
                                string = (String) b35.b(((ve2) c2.b(we2.class)).c());
                            } catch (InterruptedException e2) {
                                e = e2;
                                rf2.o(e);
                                return;
                            }
                        } catch (InterruptedException | ExecutionException e3) {
                            e = e3;
                        }
                    }
                    String str8 = string;
                    oe2 c3 = oe2.c();
                    c3.a();
                    String packageName = c3.a.getPackageName();
                    if (!br4.L(extras)) {
                        ak4 = ak4.y;
                    } else {
                        ak4 = ak4.x;
                    }
                    ak4 ak42 = ak4;
                    string2 = extras.getString("google.delivered_priority");
                    if (string2 == null) {
                        if (!"1".equals(extras.getString("google.priority_reduced"))) {
                            string2 = extras.getString("google.priority");
                        }
                        z2 = true;
                        if (z2) {
                            i3 = 5;
                        } else if (z2) {
                            i3 = 10;
                        }
                        int i4 = i3;
                        string3 = extras.getString("google.message_id");
                        if (string3 == null) {
                            string3 = extras.getString("message_id");
                        }
                        if (string3 != null) {
                            str = string3;
                        } else {
                            str = "";
                        }
                        string4 = extras.getString("from");
                        if (string4 != 0 && string4.startsWith("/topics/")) {
                            ck4 = string4;
                        }
                        if (ck4 != null) {
                            str2 = ck4;
                        } else {
                            str2 = "";
                        }
                        string5 = extras.getString("collapse_key");
                        if (string5 != null) {
                            str3 = string5;
                        } else {
                            str3 = "";
                        }
                        string6 = extras.getString("google.c.a.m_l");
                        if (string6 != null) {
                            str4 = string6;
                        } else {
                            str4 = "";
                        }
                        string7 = extras.getString("google.c.a.c_l");
                        if (string7 != null) {
                            str5 = string7;
                        } else {
                            str5 = "";
                        }
                        if (extras.containsKey("google.c.sender.id")) {
                            try {
                                j2 = Long.parseLong(extras.getString("google.c.sender.id"));
                            } catch (NumberFormatException e4) {
                                Log.w("FirebaseMessaging", "error parsing project number", e4);
                            }
                            if (j2 <= 0) {
                                j3 = j2;
                            } else {
                                j3 = 0;
                            }
                            ck4 = new ck4(j3, str, str8, ak42, packageName, str3, i4, i2, str2, str4, str5);
                        }
                        oe2 c4 = oe2.c();
                        cf2 cf2 = c4.c;
                        c4.a();
                        str6 = cf2.e;
                        if (str6 != null) {
                            try {
                                j2 = Long.parseLong(str6);
                            } catch (NumberFormatException e5) {
                                Log.w("FirebaseMessaging", "error parsing sender ID", e5);
                            }
                            if (j2 <= 0) {
                            }
                            ck4 = new ck4(j3, str, str8, ak42, packageName, str3, i4, i2, str2, str4, str5);
                        }
                        c4.a();
                        str7 = cf2.b;
                        if (!str7.startsWith("1:")) {
                            try {
                                j2 = Long.parseLong(str7);
                            } catch (NumberFormatException e6) {
                                Log.w("FirebaseMessaging", "error parsing app ID", e6);
                            }
                            if (j2 <= 0) {
                            }
                            ck4 = new ck4(j3, str, str8, ak42, packageName, str3, i4, i2, str2, str4, str5);
                        } else {
                            String[] split = str7.split(":");
                            if (split.length >= 2) {
                                String str9 = split[1];
                                if (!str9.isEmpty()) {
                                    try {
                                        j2 = Long.parseLong(str9);
                                    } catch (NumberFormatException e7) {
                                        Log.w("FirebaseMessaging", "error parsing app ID", e7);
                                    }
                                    if (j2 <= 0) {
                                    }
                                    ck4 = new ck4(j3, str, str8, ak42, packageName, str3, i4, i2, str2, str4, str5);
                                }
                            }
                            j2 = 0;
                            if (j2 <= 0) {
                            }
                            ck4 = new ck4(j3, str, str8, ak42, packageName, str3, i4, i2, str2, str4, str5);
                        }
                    }
                    if (!"high".equals(string2)) {
                        z2 = true;
                    } else {
                        if (!"normal".equals(string2)) {
                            z2 = false;
                        }
                        z2 = true;
                    }
                    if (z2) {
                    }
                    int i42 = i3;
                    string3 = extras.getString("google.message_id");
                    if (string3 == null) {
                    }
                    if (string3 != null) {
                    }
                    string4 = extras.getString("from");
                    ck4 = string4;
                    if (ck4 != null) {
                    }
                    string5 = extras.getString("collapse_key");
                    if (string5 != null) {
                    }
                    string6 = extras.getString("google.c.a.m_l");
                    if (string6 != null) {
                    }
                    string7 = extras.getString("google.c.a.c_l");
                    if (string7 != null) {
                    }
                    if (extras.containsKey("google.c.sender.id")) {
                    }
                    oe2 c42 = oe2.c();
                    cf2 cf22 = c42.c;
                    c42.a();
                    str6 = cf22.e;
                    if (str6 != null) {
                    }
                    c42.a();
                    str7 = cf22.b;
                    if (!str7.startsWith("1:")) {
                    }
                    j2 = 0;
                    if (j2 <= 0) {
                    }
                    ck4 = new ck4(j3, str, str8, ak42, packageName, str3, i42, i2, str2, str4, str5);
                }
                i2 = parseInt;
                string = extras.getString("google.to");
                if (TextUtils.isEmpty(string)) {
                }
                String str82 = string;
                oe2 c32 = oe2.c();
                c32.a();
                String packageName2 = c32.a.getPackageName();
                if (!br4.L(extras)) {
                }
                ak4 ak422 = ak4;
                string2 = extras.getString("google.delivered_priority");
                if (string2 == null) {
                }
                if (!"high".equals(string2)) {
                }
                if (z2) {
                }
                int i422 = i3;
                string3 = extras.getString("google.message_id");
                if (string3 == null) {
                }
                if (string3 != null) {
                }
                string4 = extras.getString("from");
                ck4 = string4;
                if (ck4 != null) {
                }
                string5 = extras.getString("collapse_key");
                if (string5 != null) {
                }
                string6 = extras.getString("google.c.a.m_l");
                if (string6 != null) {
                }
                string7 = extras.getString("google.c.a.c_l");
                if (string7 != null) {
                }
                if (extras.containsKey("google.c.sender.id")) {
                }
                oe2 c422 = oe2.c();
                cf2 cf222 = c422.c;
                c422.a();
                str6 = cf222.e;
                if (str6 != null) {
                }
                c422.a();
                str7 = cf222.b;
                if (!str7.startsWith("1:")) {
                }
            }
            if (ck4 != null) {
                try {
                    ((dn7) cn7).a("FCM_CLIENT_EVENT_LOGGING", new m42("proto"), new rf2(26)).K(new n00(new dk4(ck4), to5.w, new h10(Integer.valueOf(intent2.getIntExtra("google.product_id", 111881503)))), new kj6(16));
                } catch (RuntimeException e8) {
                    Log.w("FirebaseMessaging", "Failed to send big query analytics payload.", e8);
                }
            }
        }
    }

    public static void H(String str, Bundle bundle) {
        String str2;
        try {
            oe2.c();
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = new Bundle();
            String string = bundle.getString("google.c.a.c_id");
            if (string != null) {
                bundle2.putString("_nmid", string);
            }
            String string2 = bundle.getString("google.c.a.c_l");
            if (string2 != null) {
                bundle2.putString("_nmn", string2);
            }
            String string3 = bundle.getString("google.c.a.m_l");
            if (!TextUtils.isEmpty(string3)) {
                bundle2.putString("label", string3);
            }
            String string4 = bundle.getString("google.c.a.m_c");
            if (!TextUtils.isEmpty(string4)) {
                bundle2.putString("message_channel", string4);
            }
            String string5 = bundle.getString("from");
            String str3 = null;
            if (string5 == null || !string5.startsWith("/topics/")) {
                string5 = null;
            }
            if (string5 != null) {
                bundle2.putString("_nt", string5);
            }
            String string6 = bundle.getString("google.c.a.ts");
            if (string6 != null) {
                try {
                    bundle2.putInt("_nmt", Integer.parseInt(string6));
                } catch (NumberFormatException e2) {
                    Log.w("FirebaseMessaging", "Error while parsing timestamp in GCM event", e2);
                }
            }
            if (bundle.containsKey("google.c.a.udt")) {
                str3 = bundle.getString("google.c.a.udt");
            }
            if (str3 != null) {
                try {
                    bundle2.putInt("_ndt", Integer.parseInt(str3));
                } catch (NumberFormatException e3) {
                    Log.w("FirebaseMessaging", "Error while parsing use_device_time in GCM event", e3);
                }
            }
            if (br4.L(bundle)) {
                str2 = "display";
            } else {
                str2 = "data";
            }
            if ("_nr".equals(str) || "_nf".equals(str)) {
                bundle2.putString("_nmc", str2);
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Logging to scion event=" + str + " scionPayload=" + bundle2);
            }
            ac acVar = (ac) oe2.c().b(ac.class);
            if (acVar != null) {
                ((bc) acVar).a("fcm", str, bundle2);
            } else {
                Log.w("FirebaseMessaging", "Unable to log event: analytics library is missing");
            }
        } catch (IllegalStateException unused) {
            Log.e("FirebaseMessaging", "Default FirebaseApp has not been initialized. Skip logging event to GA.");
        }
    }

    public static ArrayList I(Object... objArr) {
        if (objArr.length == 0) {
            return new ArrayList();
        }
        return new ArrayList(new xr(objArr, true));
    }

    public static final ml4 K(ml4 ml4, vr2 vr2) {
        return ml4.d(new zj2(vr2));
    }

    public static final List M(List list) {
        int size = list.size();
        if (size == 0) {
            return a42.w;
        }
        if (size != 1) {
            return list;
        }
        return D(list.get(0));
    }

    public static void N(int i2, int i3, int[] iArr) {
        int i4 = ((i2 << 8) + i3) - 1;
        int i5 = i4 / 1600;
        iArr[0] = i5;
        int i6 = i4 - (i5 * 1600);
        int i7 = i6 / 40;
        iArr[1] = i7;
        iArr[2] = i6 - (i7 * 40);
    }

    public static final Object O(a96 a96, boolean z, boolean z2, vr2 vr2) {
        il7 il7;
        a96.getClass();
        ThreadLocal threadLocal = a96.i;
        a96.a();
        if (a96.k() && !a96.l()) {
            e81 e81 = (e81) threadLocal.get();
            if (e81 != null) {
                il7 = (il7) e81.a0(il7.x);
            } else {
                il7 = null;
            }
            if (il7 != null) {
                h.s("Cannot access database on a different coroutine context inherited from a suspending transaction.");
                return null;
            }
        }
        e81 e812 = (e81) threadLocal.get();
        if (e812 == null) {
            e812 = x32.w;
        }
        return j45.n(new ld1(e812, a96, z2, z, vr2, (f61) null));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: h61} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: md1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: h61} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: md1} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00af A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b0 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0028  */
    public static final Object P(f61 f61, a96 a96, boolean z, boolean z2, vr2 vr2) {
        md1 md1;
        int i2;
        Object obj;
        vr2 vr22;
        boolean z3;
        boolean z4;
        a96 a962;
        Object e0;
        f61 f612 = f61;
        if (f612 instanceof md1) {
            md1 md12 = (md1) f612;
            int i3 = md12.E;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                md12.E = i3 - Integer.MIN_VALUE;
                md1 = md12;
                md1 md13 = md1;
                Object obj2 = md13.D;
                i2 = md13.E;
                obj = p81.w;
                if (i2 != 0) {
                    o85.q(obj2);
                    if (!a96.k() || !a96.n() || !a96.l()) {
                        a96 a963 = a96;
                        boolean z5 = z;
                        boolean z6 = z2;
                        md13.z = a963;
                        vr2 vr23 = vr2;
                        md13.A = vr23;
                        md13.B = z5;
                        md13.C = z6;
                        md13.E = 2;
                        Object u2 = u(a963, z6, md13);
                        if (u2 != obj) {
                            a962 = a963;
                            z4 = z5;
                            obj2 = u2;
                            z3 = z6;
                            vr22 = vr23;
                        }
                        return obj;
                    }
                    a96 a964 = a96;
                    boolean z7 = z;
                    md13.E = 1;
                    Object q2 = a964.q(z7, new jd1(z2, z7, a964, (f61) null, vr2, 1), md13);
                    if (q2 == obj) {
                        return obj;
                    }
                    return q2;
                } else if (i2 == 1) {
                    o85.q(obj2);
                    return obj2;
                } else if (i2 == 2) {
                    boolean z8 = md13.C;
                    boolean z9 = md13.B;
                    vr2 vr24 = md13.A;
                    a96 a965 = md13.z;
                    o85.q(obj2);
                    z3 = z8;
                    z4 = z9;
                    vr22 = vr24;
                    a962 = a965;
                } else if (i2 == 3) {
                    o85.q(obj2);
                    return obj2;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kd1 kd1 = new kd1((f61) null, a962, z4, z3, vr22);
                md13.z = null;
                md13.A = null;
                md13.E = 3;
                e0 = ar7.e0((e81) obj2, kd1, md13);
                if (e0 == obj) {
                    return e0;
                }
            }
        }
        md1 = new h61(f612);
        md1 md132 = md1;
        Object obj22 = md132.D;
        i2 = md132.E;
        obj = p81.w;
        if (i2 != 0) {
        }
        kd1 kd12 = new kd1((f61) null, a962, z4, z3, vr22);
        md132.z = null;
        md132.A = null;
        md132.E = 3;
        e0 = ar7.e0((e81) obj22, kd12, md132);
        if (e0 == obj) {
        }
    }

    public static final void R(int i2, int i3) {
        if (i3 < 0) {
            h.q(pb4.i(i3, "fromIndex (0) is greater than toIndex (", ")."));
        } else if (i3 > i2) {
            h.l(pb4.k("toIndex (", i3, ") is greater than size (", i2, ")."));
        }
    }

    public static void S(RuntimeException runtimeException, String str) {
        StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int i2 = -1;
        for (int i3 = 0; i3 < length; i3++) {
            if (str.equals(stackTrace[i3].getClassName())) {
                i2 = i3;
            }
        }
        runtimeException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i2 + 1, length));
    }

    public static final void T(Matrix matrix, float[] fArr) {
        float f2 = fArr[0];
        float f3 = fArr[1];
        float f4 = fArr[2];
        float f5 = fArr[3];
        float f6 = fArr[4];
        float f7 = fArr[5];
        float f8 = fArr[6];
        float f9 = fArr[7];
        float f10 = fArr[8];
        float f11 = fArr[12];
        float f12 = fArr[13];
        float f13 = fArr[15];
        fArr[0] = f2;
        fArr[1] = f6;
        fArr[2] = f11;
        fArr[3] = f3;
        fArr[4] = f7;
        fArr[5] = f12;
        fArr[6] = f5;
        fArr[7] = f9;
        fArr[8] = f13;
        matrix.setValues(fArr);
        fArr[0] = f2;
        fArr[1] = f3;
        fArr[2] = f4;
        fArr[3] = f5;
        fArr[4] = f6;
        fArr[5] = f7;
        fArr[6] = f8;
        fArr[7] = f9;
        fArr[8] = f10;
    }

    public static final void U(Matrix matrix, float[] fArr) {
        matrix.getValues(fArr);
        float f2 = fArr[0];
        float f3 = fArr[1];
        float f4 = fArr[2];
        float f5 = fArr[3];
        float f6 = fArr[4];
        float f7 = fArr[5];
        float f8 = fArr[6];
        float f9 = fArr[7];
        float f10 = fArr[8];
        fArr[0] = f2;
        fArr[1] = f5;
        fArr[2] = 0.0f;
        fArr[3] = f8;
        fArr[4] = f3;
        fArr[5] = f6;
        fArr[6] = 0.0f;
        fArr[7] = f9;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = f4;
        fArr[13] = f7;
        fArr[14] = 0.0f;
        fArr[15] = f10;
    }

    public static boolean V(Intent intent) {
        Bundle extras;
        if (intent == null || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction()) || (extras = intent.getExtras()) == null) {
            return false;
        }
        return "1".equals(extras.getString("google.c.a.e"));
    }

    public static final void W(Context context, int i2, Notification notification) {
        context.getClass();
        notification.getClass();
        if (A(context, "android.permission.POST_NOTIFICATIONS")) {
            l15 l15 = new l15(context);
            Bundle bundle = notification.extras;
            if (bundle == null || !bundle.getBoolean("android.support.useSideChannel")) {
                l15.a.notify((String) null, i2, notification);
                return;
            }
            h15 h15 = new h15(context.getPackageName(), i2, notification);
            synchronized (l15.e) {
                try {
                    if (l15.f == null) {
                        l15.f = new k15(context.getApplicationContext());
                    }
                    l15.f.x.obtainMessage(0, h15).sendToTarget();
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
            l15.a.cancel((String) null, i2);
        }
    }

    public static final long X(float f2, long j2) {
        return (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (j2 >> 32)) - f2))) << 32) | (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (j2 & 4294967295L)) - f2))) & 4294967295L);
    }

    public static void Y() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    public static void Z() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    public static final void a(iu4 iu4, gq3 gq3, jb jbVar, Map map, vr2 vr2, vr2 vr22, vr2 vr23, vr2 vr24, vr2 vr25, yt2 yt2, int i2) {
        int i3;
        vr2 vr26;
        vr2 vr27;
        vr2 vr28;
        vr2 vr29;
        Map map2;
        jb jbVar2;
        int i4;
        int i5;
        b42 b42;
        vr2 vr210;
        jb jbVar3;
        vr2 vr211;
        vr2 vr212;
        vr2 vr213;
        boolean z;
        int i6;
        int i7;
        int i8;
        iu4 iu42 = iu4;
        gq3 gq32 = gq3;
        vr2 vr214 = vr25;
        yt2 yt22 = yt2;
        int i9 = i2;
        yt22.g0(750467758);
        if ((i9 & 6) == 0) {
            if (yt22.i(iu42)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i3 = i8 | i9;
        } else {
            i3 = i9;
        }
        char c2 = 16;
        if ((i9 & 48) == 0) {
            if (yt22.i(gq32)) {
                i7 = 32;
            } else {
                i7 = 16;
            }
            i3 |= i7;
        }
        int i10 = i9 & 384;
        jl4 jl4 = jl4.w;
        if (i10 == 0) {
            if (yt22.g(jl4)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i3 |= i6;
        }
        int i11 = 14380032 | i3;
        if ((i9 & 100663296) == 0) {
            i11 = 47934464 | i3;
        }
        if ((805306368 & i9) == 0) {
            i11 |= 268435456;
        }
        if (yt22.i(vr214)) {
            c2 = ' ';
        }
        char c3 = c2 | 6;
        if ((306783379 & i11) == 306783378 && (c3 & 19) == 18 && yt22.F()) {
            yt22.Y();
            jbVar2 = jbVar;
            map2 = map;
            vr29 = vr2;
            vr28 = vr22;
            vr27 = vr23;
            vr26 = vr24;
        } else {
            yt22.a0();
            int i12 = i9 & 1;
            Object obj = ay0.a;
            if (i12 == 0 || yt22.C()) {
                jbVar3 = xb4.y;
                Object Q = yt22.Q();
                if (Q == obj) {
                    Q = new ot4(7);
                    yt22.o0(Q);
                }
                vr2 vr215 = (vr2) Q;
                Object Q2 = yt22.Q();
                if (Q2 == obj) {
                    Q2 = new ot4(8);
                    yt22.o0(Q2);
                }
                i5 = i11 & -2113929217;
                i4 = 100663296;
                vr211 = vr215;
                vr212 = (vr2) Q2;
                b42 = b42.w;
                vr210 = vr212;
                vr213 = vr211;
            } else {
                yt22.Y();
                jbVar3 = jbVar;
                b42 = map;
                vr210 = vr24;
                i5 = i11 & -2113929217;
                i4 = 100663296;
                vr213 = vr2;
                vr212 = vr22;
                vr211 = vr23;
            }
            yt22.s();
            boolean g2 = yt22.g((Object) null) | yt22.g(gq32);
            vr2 vr216 = vr213;
            if ((c3 & 'p') == ' ') {
                z = true;
            } else {
                z = false;
            }
            boolean z2 = z | g2;
            Object Q3 = yt22.Q();
            if (z2 || Q3 == obj) {
                fu4 fu4 = new fu4(iu42.b.s, gq32, b42);
                vr214.y(fu4);
                Q3 = fu4.a();
                yt22.o0(Q3);
            }
            int i13 = i5 >> 6;
            vr2 vr217 = vr210;
            int i14 = (i5 & 8078) | (57344 & i13) | (i13 & 458752) | i4;
            jbVar2 = jbVar3;
            vr2 vr218 = vr217;
            vr2 vr219 = vr216;
            b(iu42, (eu4) Q3, jl4, jbVar2, vr219, vr212, vr211, vr218, yt22, i14);
            vr26 = vr218;
            vr27 = vr211;
            vr28 = vr212;
            vr29 = vr219;
            map2 = b42;
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new pu4(iu4, gq32, jbVar2, map2, vr29, vr28, vr27, vr26, vr214, i9);
        }
    }

    public static void a0(String str) {
        RuntimeException runtimeException = new RuntimeException(f21.h("lateinit property ", str, " has not been initialized"));
        S(runtimeException, sg3.class.getName());
        throw runtimeException;
    }

    /* JADX WARNING: Removed duplicated region for block: B:226:0x0472  */
    /* JADX WARNING: Removed duplicated region for block: B:246:0x04c9  */
    /* JADX WARNING: Removed duplicated region for block: B:247:0x04e4  */
    /* JADX WARNING: Removed duplicated region for block: B:333:0x070a  */
    /* JADX WARNING: Removed duplicated region for block: B:334:0x070f  */
    /* JADX WARNING: Removed duplicated region for block: B:336:0x0712  */
    /* JADX WARNING: Removed duplicated region for block: B:340:0x0732  */
    /* JADX WARNING: Removed duplicated region for block: B:489:0x04c6 A[SYNTHETIC] */
    public static final void b(iu4 iu4, eu4 eu4, ml4 ml4, jb jbVar, vr2 vr2, vr2 vr22, vr2 vr23, vr2 vr24, yt2 yt2, int i2) {
        int i3;
        yt2 yt22;
        ox4 ox4;
        t54 t54;
        int i4;
        hx0 hx0;
        eu4 eu42;
        hx0 hx02;
        aq4 aq4;
        boolean z;
        hx0 hx03;
        ox4 ox42;
        boolean z2;
        ox4 ox43;
        int i5;
        gp4 gp4;
        zs4 zs4;
        hx0 hx04;
        vr2 vr25;
        mm7 mm7;
        oi6 oi6;
        a37 a37;
        gp4 gp42;
        hx0 hx05;
        Object obj;
        oi6 oi62;
        int[] iArr;
        ArrayList arrayList;
        int[] iArr2;
        int length;
        int i6;
        String str;
        qt4 qt4;
        eu4 eu43;
        int i7;
        Bundle bundle;
        qt4 qt42;
        eu4 eu44;
        int[] iArr3;
        iu4 iu42 = iu4;
        eu4 eu45 = eu4;
        vr2 vr26 = vr23;
        vr2 vr27 = vr24;
        yt2 yt23 = yt2;
        int i8 = i2;
        yt23.g0(-1964664536);
        if ((i8 & 6) == 0) {
            i3 = (yt23.i(iu42) ? 4 : 2) | i8;
        } else {
            i3 = i8;
        }
        if ((i8 & 48) == 0) {
            i3 |= yt23.i(eu45) ? 32 : 16;
        }
        if ((i8 & 384) == 0) {
            i3 |= yt23.g(ml4) ? 256 : 128;
        } else {
            ml4 ml42 = ml4;
        }
        if ((i8 & 3072) == 0) {
            i3 |= yt23.g(jbVar) ? 2048 : 1024;
        } else {
            jb jbVar2 = jbVar;
        }
        if ((i8 & 24576) == 0) {
            i3 |= yt23.i(vr2) ? 16384 : 8192;
        } else {
            vr2 vr28 = vr2;
        }
        if ((196608 & i8) == 0) {
            i3 |= yt23.i(vr22) ? 131072 : 65536;
        } else {
            vr2 vr29 = vr22;
        }
        if ((i8 & 1572864) == 0) {
            i3 |= yt23.i(vr26) ? 1048576 : 524288;
        }
        if ((i8 & 12582912) == 0) {
            i3 |= yt23.i(vr27) ? 8388608 : 4194304;
        }
        if ((i8 & 100663296) == 0) {
            i3 |= yt23.i((Object) null) ? 67108864 : 33554432;
        }
        int i9 = i3;
        if ((38347923 & i9) != 38347922 || !yt23.F()) {
            yt23.a0();
            if ((i8 & 1) != 0 && !yt23.C()) {
                yt23.Y();
            }
            yt23.s();
            t54 t542 = (t54) yt23.k(ha4.a);
            a68 a2 = va4.a(yt23);
            if (a2 != null) {
                z58 g2 = a2.g();
                iu42.getClass();
                ht4 ht4 = iu42.b;
                g2.getClass();
                ht4.getClass();
                ox4 ox44 = ht4.s;
                if (!e(ht4.o, fd1.M(g2))) {
                    if (ht4.f.isEmpty()) {
                        ht4.o = fd1.M(g2);
                    } else {
                        h.s("ViewModelStore should be set before setGraph call");
                        return;
                    }
                }
                eu45.getClass();
                ht4.getClass();
                LinkedHashMap linkedHashMap = ht4.t;
                r14 r14 = eu45.B;
                as asVar = ht4.f;
                if (asVar.isEmpty() || ht4.h() != k54.w) {
                    boolean z3 = false;
                    if (!e(ht4.c, eu45)) {
                        eu4 eu46 = ht4.c;
                        if (eu46 != null) {
                            Iterator it = new ArrayList(ht4.l.keySet()).iterator();
                            while (it.hasNext()) {
                                Integer num = (Integer) it.next();
                                num.getClass();
                                int intValue = num.intValue();
                                for (ft4 ft4 : linkedHashMap.values()) {
                                    ft4.d = true;
                                    vr2 vr210 = vr23;
                                    it = it;
                                }
                                Iterator it2 = it;
                                boolean q2 = ht4.q(intValue, (Bundle) null, new wu4(z3, true, -1, z3, z3, -1, -1));
                                for (Iterator it3 = linkedHashMap.values().iterator(); it3.hasNext(); it3 = it3) {
                                    ((ft4) it3.next()).d = false;
                                    q2 = q2;
                                }
                                if (q2) {
                                    boolean m2 = ht4.m(intValue, true, false);
                                }
                                vr2 vr211 = vr23;
                                it = it2;
                                z3 = false;
                            }
                            ht4.m(eu46.x.a, true, false);
                        }
                        ht4.c = eu45;
                        ox4 ox45 = ht4.s;
                        iu4 iu43 = ht4.a;
                        tb1 tb1 = iu43.c;
                        Bundle bundle2 = ht4.d;
                        if (bundle2 != null && bundle2.containsKey("android-support-nav:controller:navigatorState:names")) {
                            ArrayList<String> stringArrayList = bundle2.getStringArrayList("android-support-nav:controller:navigatorState:names");
                            if (stringArrayList != null) {
                                Iterator<String> it4 = stringArrayList.iterator();
                                while (it4.hasNext()) {
                                    Iterator<String> it5 = it4;
                                    String next = it4.next();
                                    ox45.b(next);
                                    if (bundle2.containsKey(next)) {
                                        z85.l(next, bundle2);
                                    }
                                    it4 = it5;
                                }
                            } else {
                                i95.x("android-support-nav:controller:navigatorState:names");
                                throw null;
                            }
                        }
                        Bundle[] bundleArr = ht4.e;
                        if (bundleArr != null) {
                            int length2 = bundleArr.length;
                            Bundle[] bundleArr2 = bundleArr;
                            int i10 = 0;
                            while (i10 < length2) {
                                int i11 = i10;
                                Bundle bundle3 = bundleArr2[i11];
                                bundle3.getClass();
                                int i12 = length2;
                                bundle3.setClassLoader(ct4.class.getClassLoader());
                                String o2 = z85.o("nav-entry-state:id", bundle3);
                                int j2 = z85.j("nav-entry-state:destination-id", bundle3);
                                Bundle bundle4 = bundle3.getBundle("nav-entry-state:args");
                                if (bundle4 != null) {
                                    Bundle bundle5 = bundle3.getBundle("nav-entry-state:saved-state");
                                    if (bundle5 != null) {
                                        qt4 c2 = ht4.c(j2, (qt4) null);
                                        if (c2 != null) {
                                            k54 h2 = ht4.h();
                                            it4 it42 = ht4.o;
                                            tb1.getClass();
                                            h2.getClass();
                                            Context context = tb1.a;
                                            bundle4.setClassLoader(context != null ? context.getClassLoader() : null);
                                            zs4 zs42 = new zs4(tb1, c2, bundle4, h2, it42, o2, bundle5);
                                            nx4 b2 = ox45.b(c2.w);
                                            Object obj2 = linkedHashMap.get(b2);
                                            if (obj2 == null) {
                                                obj2 = new ft4(iu43, b2);
                                                linkedHashMap.put(b2, obj2);
                                            }
                                            asVar.addLast(zs42);
                                            ((ft4) obj2).a(zs42);
                                            eu4 eu47 = zs42.x.y;
                                            if (eu47 != null) {
                                                ht4.j(zs42, ht4.e(eu47.x.a));
                                            }
                                            i10 = i11 + 1;
                                            vr2 vr212 = vr2;
                                            vr2 vr213 = vr22;
                                            length2 = i12;
                                        } else {
                                            int i13 = qt4.A;
                                            rf2.m(b81.q("Restoring the Navigation back stack failed: destination ", ie1.H(tb1, j2), " cannot be found from the current destination "), ht4.f());
                                            return;
                                        }
                                    } else {
                                        i95.x("nav-entry-state:saved-state");
                                        throw null;
                                    }
                                } else {
                                    i95.x("nav-entry-state:args");
                                    throw null;
                                }
                            }
                            ht4.b.b();
                            ht4.e = null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        for (Object next2 : sf4.b0(ox45.a).values()) {
                            if (!((nx4) next2).b) {
                                arrayList2.add(next2);
                            }
                        }
                        Iterator it6 = arrayList2.iterator();
                        while (it6.hasNext()) {
                            nx4 nx4 = (nx4) it6.next();
                            Object obj3 = linkedHashMap.get(nx4);
                            if (obj3 == null) {
                                nx4.getClass();
                                obj3 = new ft4(iu43, nx4);
                                linkedHashMap.put(nx4, obj3);
                            }
                            nx4.getClass();
                            nx4.a = (ft4) obj3;
                            nx4.b = true;
                        }
                        if (ht4.c == null || !asVar.isEmpty()) {
                            ox4 = ox44;
                            t54 = t542;
                            i4 = i9;
                            hx0 = null;
                            ht4.b();
                        } else {
                            Activity activity = iu43.d;
                            if (!iu43.e && activity != null) {
                                Intent intent = activity.getIntent();
                                ht4 ht42 = iu43.b;
                                if (intent != null) {
                                    Bundle extras = intent.getExtras();
                                    if (extras != null) {
                                        try {
                                            iArr = extras.getIntArray("android-support-nav:controller:deepLinkIds");
                                        } catch (Exception e2) {
                                            i4 = i9;
                                            Log.e("NavController", "handleDeepLink() could not extract deepLink from " + intent, e2);
                                            iArr = null;
                                        }
                                    } else {
                                        iArr = null;
                                    }
                                    i4 = i9;
                                    ArrayList parcelableArrayList = extras != null ? extras.getParcelableArrayList("android-support-nav:controller:deepLinkArgs") : null;
                                    Bundle j3 = tf4.j((yb5[]) Arrays.copyOf(new yb5[0], 0));
                                    Bundle bundle6 = extras != null ? extras.getBundle("android-support-nav:controller:deepLinkExtras") : null;
                                    if (bundle6 != null) {
                                        j3.putAll(bundle6);
                                    }
                                    if (iArr == null || iArr.length == 0) {
                                        eu4 i14 = ht42.i();
                                        iArr3 = iArr;
                                        t54 = t542;
                                        ox4 = ox44;
                                        pt4 l2 = i14.l(new cf4(intent.getData(), intent.getAction(), intent.getType(), 4), i14);
                                        if (l2 != null) {
                                            qt4 qt43 = l2.w;
                                            as asVar2 = new as();
                                            eu4 eu48 = qt43;
                                            while (true) {
                                                ao aoVar = eu48.x;
                                                eu4 eu49 = eu48.y;
                                                if (eu49 == null || eu49.B.w != aoVar.a) {
                                                    asVar2.addFirst(eu48);
                                                }
                                                if (!e(eu49, (Object) null) && eu49 != null) {
                                                    eu4 eu410 = eu4;
                                                    eu48 = eu49;
                                                }
                                            }
                                            List<qt4> b1 = dt0.b1(asVar2);
                                            ArrayList arrayList3 = new ArrayList(et0.e0(b1, 10));
                                            for (qt4 qt44 : b1) {
                                                arrayList3.add(Integer.valueOf(qt44.x.a));
                                            }
                                            int[] a1 = dt0.a1(arrayList3);
                                            Bundle f2 = qt43.f(l2.x);
                                            if (f2 != null) {
                                                j3.putAll(f2);
                                            }
                                            iArr2 = a1;
                                            arrayList = null;
                                            if (!(iArr2 == null || iArr2.length == 0)) {
                                                ht42.getClass();
                                                eu4 eu411 = ht42.c;
                                                length = iArr2.length;
                                                i6 = 0;
                                                while (true) {
                                                    if (i6 < length) {
                                                        str = null;
                                                        break;
                                                    }
                                                    int i15 = iArr2[i6];
                                                    if (i6 == 0) {
                                                        eu4 eu412 = ht42.c;
                                                        eu412.getClass();
                                                        qt42 = eu412.x.a == i15 ? ht42.c : null;
                                                    } else {
                                                        eu411.getClass();
                                                        qt42 = eu411.B.a(i15);
                                                    }
                                                    if (qt42 == null) {
                                                        int i16 = qt4.A;
                                                        str = ie1.H(ht42.a.c, i15);
                                                        break;
                                                    }
                                                    if (i6 != iArr2.length - 1 && (qt42 instanceof eu4)) {
                                                        while (true) {
                                                            eu44 = (eu4) qt42;
                                                            eu44.getClass();
                                                            r14 r142 = eu44.B;
                                                            if (!(r142.a(r142.w) instanceof eu4)) {
                                                                break;
                                                            }
                                                            qt42 = r142.a(r142.w);
                                                        }
                                                        eu411 = eu44;
                                                    }
                                                    i6++;
                                                }
                                                if (str == null) {
                                                    Log.i("NavController", "Could not find destination " + str + " in the navigation graph, ignoring the deep link from " + intent);
                                                } else {
                                                    j3.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
                                                    int length3 = iArr2.length;
                                                    Bundle[] bundleArr3 = new Bundle[length3];
                                                    for (int i17 = 0; i17 < length3; i17++) {
                                                        Bundle j4 = tf4.j((yb5[]) Arrays.copyOf(new yb5[0], 0));
                                                        j4.putAll(j3);
                                                        if (!(arrayList == null || (bundle = (Bundle) arrayList.get(i17)) == null)) {
                                                            j4.putAll(bundle);
                                                        }
                                                        bundleArr3[i17] = j4;
                                                    }
                                                    int flags = intent.getFlags();
                                                    int i18 = 268435456 & flags;
                                                    if (i18 == 0 || (flags & 32768) != 0) {
                                                        if (i18 != 0) {
                                                            if (!ht42.f.isEmpty()) {
                                                                eu4 eu413 = ht42.c;
                                                                eu413.getClass();
                                                                i7 = 0;
                                                                ht42.m(eu413.x.a, true, false);
                                                            } else {
                                                                i7 = 0;
                                                            }
                                                            while (i7 < iArr2.length) {
                                                                int i19 = iArr2[i7];
                                                                int i20 = i7 + 1;
                                                                Bundle bundle7 = bundleArr3[i7];
                                                                qt4 c3 = ht42.c(i19, (qt4) null);
                                                                if (c3 != null) {
                                                                    ht42.k(c3, bundle7, uq3.G(new w34(6, c3, iu43)));
                                                                    i7 = i20;
                                                                } else {
                                                                    int i21 = qt4.A;
                                                                    rf2.m(b81.q("Deep Linking failed: destination ", ie1.H(tb1, i19), " cannot be found from the current destination "), ht42.f());
                                                                    return;
                                                                }
                                                            }
                                                            iu43.e = true;
                                                        } else {
                                                            int i22 = 0;
                                                            eu4 eu414 = ht42.c;
                                                            int length4 = iArr2.length;
                                                            while (i22 < length4) {
                                                                int i23 = iArr2[i22];
                                                                Bundle bundle8 = bundleArr3[i22];
                                                                if (i22 == 0) {
                                                                    qt4 = ht42.c;
                                                                } else {
                                                                    eu414.getClass();
                                                                    qt4 = eu414.B.a(i23);
                                                                }
                                                                if (qt4 != null) {
                                                                    if (i22 == iArr2.length - 1) {
                                                                        eu4 eu415 = ht42.c;
                                                                        eu415.getClass();
                                                                        ht42.k(qt4, bundle8, new wu4(false, false, eu415.x.a, true, false, 0, 0));
                                                                    } else if (qt4 instanceof eu4) {
                                                                        while (true) {
                                                                            eu43 = (eu4) qt4;
                                                                            eu43.getClass();
                                                                            r14 r143 = eu43.B;
                                                                            if (!(r143.a(r143.w) instanceof eu4)) {
                                                                                break;
                                                                            }
                                                                            qt4 = r143.a(r143.w);
                                                                        }
                                                                        eu414 = eu43;
                                                                    }
                                                                    i22++;
                                                                } else {
                                                                    int i24 = qt4.A;
                                                                    ku4.l("Deep Linking failed: destination ", ie1.H(tb1, i23), " cannot be found in graph ", eu414);
                                                                    return;
                                                                }
                                                            }
                                                            iu43.e = true;
                                                        }
                                                    } else {
                                                        intent.addFlags(32768);
                                                        l07 l07 = new l07(iu43.a);
                                                        ComponentName component = intent.getComponent();
                                                        if (component == null) {
                                                            component = intent.resolveActivity(((Context) l07.y).getPackageManager());
                                                        }
                                                        if (component != null) {
                                                            l07.d(component);
                                                        }
                                                        ((ArrayList) l07.x).add(intent);
                                                        l07.f();
                                                        activity.finish();
                                                        activity.overridePendingTransition(0, 0);
                                                    }
                                                    eu42 = eu4;
                                                    hx0 = null;
                                                    ox4 ox46 = ox4;
                                                    nx4 b3 = ox46.b("composable");
                                                    hx02 = !(b3 instanceof hx0) ? (hx0) b3 : hx0;
                                                    if (hx02 != null) {
                                                        yx5 v = yt2.v();
                                                        if (v != null) {
                                                            v.d = new qu4(iu4, eu42, ml4, jbVar, vr2, vr22, vr23, vr24, i2, 2);
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    iu4 iu44 = iu4;
                                                    vr2 vr214 = vr23;
                                                    vr2 vr215 = vr24;
                                                    yt2 yt24 = yt2;
                                                    aq4 f3 = u55.f(hx02.b().e, yt24);
                                                    Object Q = yt24.Q();
                                                    Object obj4 = ay0.a;
                                                    if (Q == obj4) {
                                                        Q = new ad5(0.0f);
                                                        yt24.o0(Q);
                                                    }
                                                    ad5 ad5 = (ad5) Q;
                                                    Object Q2 = yt24.Q();
                                                    if (Q2 == obj4) {
                                                        Q2 = u55.p(Boolean.FALSE);
                                                        yt24.o0(Q2);
                                                    }
                                                    aq4 aq42 = (aq4) Q2;
                                                    boolean z4 = ((List) f3.getValue()).size() > 1;
                                                    boolean g3 = yt24.g(f3) | yt24.i(hx02);
                                                    Object Q3 = yt24.Q();
                                                    if (g3 || Q3 == obj4) {
                                                        aq4 aq43 = f3;
                                                        Q3 = new w6((Object) hx02, (Object) aq43, (Object) ad5, (Object) aq42, (f61) null, 11);
                                                        aq4 = aq43;
                                                        yt24.o0(Q3);
                                                    } else {
                                                        aq4 = f3;
                                                    }
                                                    ed1.e(z4, (gs2) Q3, yt24, 0);
                                                    t54 t543 = t54;
                                                    boolean i25 = yt24.i(iu44) | yt24.i(t543);
                                                    Object Q4 = yt24.Q();
                                                    if (i25 || Q4 == obj4) {
                                                        Q4 = new w34(8, iu44, t543);
                                                        yt24.o0(Q4);
                                                    }
                                                    t49.e(t543, (vr2) Q4, yt24);
                                                    pe6 q3 = b85.q(yt24);
                                                    aq4 f4 = u55.f(ht4.i, yt24);
                                                    Object Q5 = yt24.Q();
                                                    if (Q5 == obj4) {
                                                        z = false;
                                                        Q5 = u55.i(new mu4(0, f4));
                                                        yt24.o0(Q5);
                                                    } else {
                                                        z = false;
                                                    }
                                                    a37 a372 = (a37) Q5;
                                                    zs4 zs43 = (zs4) dt0.H0((List) a372.getValue());
                                                    Object Q6 = yt24.Q();
                                                    if (Q6 == obj4) {
                                                        int i26 = s25.a;
                                                        Q6 = new gp4(6);
                                                        yt24.o0(Q6);
                                                    }
                                                    gp4 gp43 = (gp4) Q6;
                                                    if (zs43 != null) {
                                                        yt24.e0(-1797563167);
                                                        boolean i27 = yt24.i(hx02) | (((((i4 & 3670016) ^ 1572864) <= 1048576 || !yt24.g(vr214)) && (i4 & 1572864) != 1048576) ? z : true) | ((i4 & 57344) == 16384 ? true : z);
                                                        Object Q7 = yt24.Q();
                                                        if (i27 || Q7 == obj4) {
                                                            ox43 = ox46;
                                                            hx04 = hx02;
                                                            gp4 = gp43;
                                                            zs4 = zs43;
                                                            i5 = 6;
                                                            z2 = true;
                                                            nu4 nu4 = new nu4(hx04, vr214, vr2, aq42, 0);
                                                            yt24.o0(nu4);
                                                            Q7 = nu4;
                                                        } else {
                                                            ox43 = ox46;
                                                            hx04 = hx02;
                                                            gp4 = gp43;
                                                            zs4 = zs43;
                                                            i5 = 6;
                                                            z2 = true;
                                                        }
                                                        vr2 vr216 = (vr2) Q7;
                                                        boolean i28 = yt24.i(hx04) | (((((i4 & 29360128) ^ 12582912) <= 8388608 || !yt24.g(vr215)) && (i4 & 12582912) != 8388608) ? false : z2) | ((i4 & 458752) == 131072 ? z2 : false);
                                                        Object Q8 = yt24.Q();
                                                        if (i28 || Q8 == obj4) {
                                                            vr2 vr217 = vr215;
                                                            vr25 = vr216;
                                                            nu4 nu42 = new nu4(hx04, vr217, vr22, aq42, 1);
                                                            yt24.o0(nu42);
                                                            Q8 = nu42;
                                                        } else {
                                                            vr25 = vr216;
                                                        }
                                                        vr2 vr218 = (vr2) Q8;
                                                        if ((i4 & 234881024) != 67108864) {
                                                            z2 = false;
                                                        }
                                                        Object Q9 = yt24.Q();
                                                        if (z2 || Q9 == obj4) {
                                                            Q9 = new ot4(i5);
                                                            yt24.o0(Q9);
                                                        }
                                                        vr2 vr219 = (vr2) Q9;
                                                        Boolean bool = Boolean.TRUE;
                                                        boolean i29 = yt24.i(hx04);
                                                        Object Q10 = yt24.Q();
                                                        if (i29 || Q10 == obj4) {
                                                            Q10 = new w34(7, a372, hx04);
                                                            yt24.o0(Q10);
                                                        }
                                                        t49.e(bool, (vr2) Q10, yt24);
                                                        Object Q11 = yt24.Q();
                                                        if (Q11 == obj4) {
                                                            Q11 = new oi6(zs4);
                                                            yt24.o0(Q11);
                                                        }
                                                        oi6 oi63 = (oi6) Q11;
                                                        mm7 K0 = rc9.K0(oi63, "entry", yt24, 56);
                                                        if (((Boolean) aq42.getValue()).booleanValue()) {
                                                            yt24.e0(-1795329152);
                                                            Float valueOf = Float.valueOf(ad5.d());
                                                            boolean g4 = yt24.g(aq4) | yt24.i(oi63);
                                                            oi6 oi64 = oi63;
                                                            Object Q12 = yt24.Q();
                                                            if (g4 || Q12 == obj4) {
                                                                hx03 = null;
                                                                Q12 = new ii3((Object) oi64, (Object) aq4, (Object) ad5, (f61) null, 8);
                                                                oi62 = oi64;
                                                                yt24.o0(Q12);
                                                            } else {
                                                                oi62 = oi64;
                                                                hx03 = null;
                                                            }
                                                            t49.h((gs2) Q12, yt24, valueOf);
                                                            yt24.r(false);
                                                            mm7 = K0;
                                                            oi6 = oi62;
                                                        } else {
                                                            oi6 oi65 = oi63;
                                                            hx03 = null;
                                                            yt24.e0(-1794910745);
                                                            boolean i30 = yt24.i(oi65) | yt24.i(zs4) | yt24.g(K0);
                                                            Object Q13 = yt24.Q();
                                                            if (i30 || Q13 == obj4) {
                                                                mm7 = K0;
                                                                oi6 = oi65;
                                                                Q13 = new ng((Object) oi6, (Object) zs4, (Object) mm7, (f61) null, 12);
                                                                yt24.o0(Q13);
                                                            } else {
                                                                mm7 = K0;
                                                                oi6 = oi65;
                                                            }
                                                            t49.h((gs2) Q13, yt24, zs4);
                                                            yt24.r(false);
                                                        }
                                                        boolean i31 = yt24.i(gp4) | yt24.i(hx04) | yt24.g(vr25) | yt24.g(vr218) | yt24.g(vr219);
                                                        Object Q14 = yt24.Q();
                                                        if (i31 || Q14 == obj4) {
                                                            hx0 hx06 = hx04;
                                                            gp4 gp44 = gp4;
                                                            a37 = a372;
                                                            Q14 = new zf1(gp44, hx06, vr25, vr218, vr219, a37, aq42);
                                                            gp42 = gp44;
                                                            hx05 = hx06;
                                                            yt24.o0(Q14);
                                                        } else {
                                                            hx05 = hx04;
                                                            gp42 = gp4;
                                                            a37 = a372;
                                                        }
                                                        vr2 vr220 = (vr2) Q14;
                                                        Object Q15 = yt24.Q();
                                                        if (Q15 == obj4) {
                                                            Q15 = new ot4(9);
                                                            yt24.o0(Q15);
                                                        }
                                                        pe6 pe6 = q3;
                                                        a37 a373 = a37;
                                                        zs4 zs44 = zs4;
                                                        zs4 zs45 = zs44;
                                                        a37 a374 = a373;
                                                        vr2 vr221 = (vr2) Q15;
                                                        yt2 yt25 = yt24;
                                                        mm7 mm72 = mm7;
                                                        ox42 = ox43;
                                                        fd1.c(mm72, ml4, vr220, jbVar, vr221, su0.J(820763100, new tu4(oi6, zs44, pe6, aq42, a373), yt24), yt25, ((i4 >> 3) & 112) | 221184 | (i4 & 7168));
                                                        yt22 = yt25;
                                                        Object H0 = mm72.a.H0();
                                                        Object value = mm72.d.getValue();
                                                        boolean g5 = yt22.g(mm72) | yt22.i(iu44) | yt22.i(zs45) | yt22.i(hx05) | yt22.i(gp42);
                                                        Object Q16 = yt22.Q();
                                                        if (g5 || Q16 == obj4) {
                                                            obj = value;
                                                            m94 m94 = new m94(mm72, iu44, zs45, gp42, a374, hx05, (f61) null);
                                                            yt22.o0(m94);
                                                            Q16 = m94;
                                                        } else {
                                                            obj = value;
                                                        }
                                                        t49.j(H0, obj, (gs2) Q16, yt22);
                                                        yt22.r(false);
                                                    } else {
                                                        hx03 = hx0;
                                                        yt22 = yt24;
                                                        ox42 = ox46;
                                                        yt22.e0(-1789758886);
                                                        yt22.r(z);
                                                    }
                                                    nx4 b4 = ox42.b("dialog");
                                                    vu1 vu1 = b4 instanceof vu1 ? (vu1) b4 : hx03;
                                                    if (vu1 == null) {
                                                        yx5 v2 = yt22.v();
                                                        if (v2 != null) {
                                                            v2.d = new qu4(iu4, eu4, ml4, jbVar, vr2, vr22, vr23, vr24, i2, 0);
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    r16.g(vu1, yt22, 0);
                                                }
                                            }
                                            eu4 eu416 = ht4.c;
                                            eu416.getClass();
                                            hx0 = null;
                                            ht4.k(eu416, (Bundle) null, (wu4) null);
                                        }
                                    } else {
                                        iArr3 = iArr;
                                        ox4 = ox44;
                                        t54 = t542;
                                    }
                                    arrayList = parcelableArrayList;
                                    iArr2 = iArr3;
                                    ht42.getClass();
                                    eu4 eu4112 = ht42.c;
                                    length = iArr2.length;
                                    i6 = 0;
                                    while (true) {
                                        if (i6 < length) {
                                        }
                                        i6++;
                                    }
                                    if (str == null) {
                                    }
                                }
                            }
                            ox4 = ox44;
                            t54 = t542;
                            i4 = i9;
                            eu4 eu4162 = ht4.c;
                            eu4162.getClass();
                            hx0 = null;
                            ht4.k(eu4162, (Bundle) null, (wu4) null);
                        }
                    } else {
                        ox4 = ox44;
                        t54 = t542;
                        i4 = i9;
                        hx0 = null;
                        int f5 = ((cz6) r14.y).f();
                        for (int i32 = 0; i32 < f5; i32++) {
                            qt4 qt45 = (qt4) ((cz6) r14.y).g(i32);
                            eu4 eu417 = ht4.c;
                            eu417.getClass();
                            int d2 = ((cz6) eu417.B.y).d(i32);
                            eu4 eu418 = ht4.c;
                            eu418.getClass();
                            cz6 cz6 = (cz6) eu418.B.y;
                            if (cz6.w) {
                                rg3.e(cz6);
                            }
                            int q4 = ie1.q(cz6.z, d2, cz6.x);
                            if (q4 >= 0) {
                                Object[] objArr = cz6.y;
                                Object obj5 = objArr[q4];
                                objArr[q4] = qt45;
                            }
                        }
                        Iterator it7 = asVar.iterator();
                        while (it7.hasNext()) {
                            zs4 zs46 = (zs4) it7.next();
                            int i33 = qt4.A;
                            vf4 vf4 = new vf4(cl6.V(ie1.I(zs46.x)));
                            qt4 qt46 = ht4.c;
                            qt46.getClass();
                            Iterator it8 = vf4.iterator();
                            while (true) {
                                ListIterator listIterator = (ListIterator) ((n76) it8).x;
                                if (!listIterator.hasPrevious()) {
                                    break;
                                }
                                qt4 qt47 = (qt4) listIterator.previous();
                                if (!e(qt47, ht4.c)) {
                                    eu4 eu419 = eu4;
                                } else if (qt46.equals(eu4)) {
                                }
                                if (qt46 instanceof eu4) {
                                    qt46 = ((eu4) qt46).B.a(qt47.x.a);
                                    qt46.getClass();
                                }
                            }
                            eu4 eu420 = eu4;
                            zs46.x = qt46;
                        }
                    }
                    eu42 = eu4;
                    ox4 ox462 = ox4;
                    nx4 b32 = ox462.b("composable");
                    if (!(b32 instanceof hx0)) {
                    }
                    if (hx02 != null) {
                    }
                } else {
                    h.s("You cannot set a new graph on a NavController with entries on the back stack after the NavController has been destroyed. Please ensure that your NavHost has the same lifetime as your NavController.");
                    return;
                }
            } else {
                h.s("NavHost requires a ViewModelStoreOwner to be provided via LocalViewModelStoreOwner");
                return;
            }
        } else {
            yt23.Y();
            yt22 = yt23;
        }
        yx5 v3 = yt22.v();
        if (v3 != null) {
            v3.d = new qu4(iu4, eu4, ml4, jbVar, vr2, vr22, vr23, vr24, i2, 1);
        }
    }

    public static wj3 b0(fq7 fq7, boolean z, q14 q14, int i2) {
        boolean z2;
        boolean z3 = false;
        if ((i2 & 1) != 0) {
            z2 = false;
        } else {
            z2 = z;
        }
        if ((i2 & 2) == 0) {
            z3 = true;
        }
        boolean z4 = z3;
        int i3 = i2 & 4;
        Set set = null;
        if (i3 != 0) {
            q14 = null;
        }
        if (q14 != null) {
            set = wn6.w(q14);
        }
        return new wj3(fq7, z4, z2, set, 34);
    }

    public static final void c(is7 is7, is2 is2, fw0 fw0, yt2 yt2, int i2) {
        int i3;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i4;
        boolean z5;
        int i5;
        int i6;
        is7 is72 = is7;
        is2 is22 = is2;
        fw0 fw02 = fw0;
        yt2 yt22 = yt2;
        int i7 = i2;
        is72.getClass();
        is22.getClass();
        yt22.g0(2009843954);
        if ((i7 & 6) == 0) {
            if (yt22.i(is72)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i3 = i6 | i7;
        } else {
            i3 = i7;
        }
        if ((i7 & 48) == 0) {
            if ((i7 & 64) == 0) {
                z5 = yt22.g(is22);
            } else {
                z5 = yt22.i(is22);
            }
            if (z5) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i7 & 384) == 0) {
            if (yt22.i(fw02)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i3 |= i4;
        }
        if ((i3 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (yt22.V(i3 & 1, z)) {
            fw02.u(is72.a, yt22, Integer.valueOf((i3 >> 3) & 112));
            if (is72.b) {
                yt22.e0(-877609745);
                sd2 sd2 = yu6.c;
                lh4 d2 = mb0.d(xb4.y, false);
                int hashCode = Long.hashCode(yt22.T);
                vf5 m2 = yt22.m();
                ml4 E = gw8.E(yt22, sd2);
                ux0.d.getClass();
                vy0 vy0 = tx0.b;
                yt22.i0();
                if (yt22.S) {
                    yt22.l(vy0);
                } else {
                    yt22.r0();
                }
                g75.Q(tx0.f, yt22, d2);
                g75.Q(tx0.e, yt22, m2);
                g75.Q(tx0.g, yt22, Integer.valueOf(hashCode));
                g75.O(yt22, tx0.h);
                g75.Q(tx0.d, yt22, E);
                z3 = true;
                z2 = false;
                rj1.d(qb0.a.a(yu6.l(jl4.w, 56.0f), xb4.C), 0, 0, (pq6) null, (List) null, yt22, 0);
                yt22.r(true);
                yt22.r(false);
            } else {
                z3 = true;
                z2 = false;
                yt22.e0(-877362768);
                yt22.r(false);
            }
            Throwable th = (Throwable) is72.c.K0();
            if (th == null) {
                yt22.e0(-877314347);
                yt22.r(z2);
            } else {
                yt22.e0(-877314346);
                if ((i3 & 112) == 32 || ((i3 & 64) != 0 && yt22.i(is22))) {
                    z4 = z3;
                } else {
                    z4 = z2;
                }
                boolean i8 = yt22.i(th) | z4;
                Object Q = yt22.Q();
                if (i8 || Q == ay0.a) {
                    Q = new k05(is22, th, (f61) null, 22);
                    yt22.o0(Q);
                }
                t49.h((gs2) Q, yt22, is22);
                yt22.r(z2);
            }
        } else {
            yt22.Y();
        }
        yx5 v = yt22.v();
        if (v != null) {
            v.d = new bi(i7, 19, (Object) is72, (Object) is22, (Object) fw02);
        }
    }

    public static final char[] c0(String str) {
        int length = str.length();
        char[] cArr = new char[length];
        for (int i2 = 0; i2 < length; i2++) {
            cArr[i2] = str.charAt(i2);
        }
        return cArr;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [h61] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
    public static final Object d(File file, vr2 vr2, h61 h61) {
        kd2 kd2;
        int i2;
        IOException iOException;
        if (h61 instanceof kd2) {
            kd2 kd22 = (kd2) h61;
            int i3 = kd22.B;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                kd22.B = i3 - Integer.MIN_VALUE;
                kd2 = kd22;
                Object obj = kd2.A;
                i2 = kd2.B;
                if (i2 != 0) {
                    o85.q(obj);
                    kd2.z = file;
                    kd2.B = 1;
                    Object y = vr2.y(kd2);
                    p81 p81 = p81.w;
                    if (y == p81) {
                        return p81;
                    }
                    return y;
                } else if (i2 == 1) {
                    file = kd2.z;
                    try {
                        o85.q(obj);
                        return obj;
                    } catch (IOException e2) {
                        if (!(e2 instanceof CorruptionException)) {
                            file.getClass();
                            if (!file.exists()) {
                                iOException = rg3.j(file, e2);
                            } else if (file.isFile()) {
                                if (file.canRead()) {
                                    if (file.canWrite()) {
                                        iOException = rg3.j(file, e2);
                                    } else {
                                        iOException = rg3.j(file, e2);
                                    }
                                } else if (file.canWrite()) {
                                    iOException = rg3.j(file, e2);
                                } else {
                                    iOException = rg3.j(file, e2);
                                }
                            } else if (file.canRead()) {
                                if (file.canWrite()) {
                                    iOException = rg3.j(file, e2);
                                } else {
                                    iOException = rg3.j(file, e2);
                                }
                            } else if (file.canWrite()) {
                                iOException = rg3.j(file, e2);
                            } else {
                                iOException = rg3.j(file, e2);
                            }
                            throw iOException;
                        }
                        throw e2;
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            }
        }
        kd2 = new h61(h61);
        Object obj2 = kd2.A;
        i2 = kd2.B;
        if (i2 != 0) {
        }
    }

    public static int d0(int i2, int i3) {
        int i4 = i2 - (((i3 * 149) % 255) + 1);
        if (i4 >= 0) {
            return i4;
        }
        return i4 + 256;
    }

    public static boolean e(Object obj, Object obj2) {
        if (obj != null) {
            return obj.equals(obj2);
        }
        if (obj2 == null) {
            return true;
        }
        return false;
    }

    public static ArrayList f(Object... objArr) {
        if (objArr.length == 0) {
            return new ArrayList();
        }
        return new ArrayList(new xr(objArr, true));
    }

    public static aw g(j77 j77, qe4 qe4, ay5 ay5, Integer num, int i2) {
        ay5 ay52;
        boolean z;
        j77 j772 = j77;
        Integer num2 = null;
        if ((i2 & 2) != 0) {
            ay52 = null;
        } else {
            ay52 = ay5;
        }
        if ((i2 & 4) != 0) {
            z = ((xu) qe4.d()).a();
        } else {
            z = false;
        }
        if ((i2 & 8) == 0) {
            num2 = num;
        }
        j772.getClass();
        o0 o0Var = new o0(1, qe4, qe4.class, "resolveUrl", "resolveUrl(Ljava/lang/String;)Ljava/lang/String;", 0, 0, 1);
        yv yvVar = new yv(2, qe4, qe4.class, "parseErrorResponse", "parseErrorResponse(Lio/ktor/client/statement/HttpResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 0, 0);
        tx3 tx3 = ((m77) j772).h;
        uu.a.getClass();
        ((hj8) qe4.d()).getClass();
        return new aw(tx3, new xv(new vv(o0Var, yvVar), new uv(z, new f96(7, (Object) j772)), new wv(ay52, num2)));
    }

    public static int h(ArrayList arrayList, Comparable comparable) {
        int size = arrayList.size();
        arrayList.getClass();
        R(arrayList.size(), size);
        int i2 = size - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            int k2 = pd8.k((Comparable) arrayList.get(i4), comparable);
            if (k2 < 0) {
                i3 = i4 + 1;
            } else if (k2 <= 0) {
                return i4;
            } else {
                i2 = i4 - 1;
            }
        }
        return -(i3 + 1);
    }

    public static n74 i(n74 n74) {
        n74.o();
        n74.y = true;
        if (n74.x > 0) {
            return n74;
        }
        return n74.z;
    }

    public static final xo4 j(h24 h24, q24 q24, ji8 ji8) {
        boolean z;
        int i2;
        yx6 yx6 = q24.w;
        yx6.getClass();
        o2 o2Var = rj1.w(yx6).c;
        eq4 eq4 = (eq4) ji8.x;
        int i3 = 1;
        if (eq4.y != 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z && o2Var.isEmpty()) {
            return ke3.a;
        }
        xo4 xo4 = new xo4();
        if (((eq4) ji8.x).y != 0) {
            int i4 = eq4.y;
            if (i4 != 0) {
                Object[] objArr = eq4.w;
                int i5 = ((x14) objArr[0]).a;
                for (int i6 = 0; i6 < i4; i6++) {
                    int i7 = ((x14) objArr[i6]).a;
                    if (i7 < i5) {
                        i5 = i7;
                    }
                }
                if (i5 < 0) {
                    bc3.a("negative minIndex");
                }
                int i8 = eq4.y;
                if (i8 != 0) {
                    Object[] objArr2 = eq4.w;
                    int i9 = ((x14) objArr2[0]).b;
                    for (int i10 = 0; i10 < i8; i10++) {
                        int i11 = ((x14) objArr2[i10]).b;
                        if (i11 > i9) {
                            i9 = i11;
                        }
                    }
                    i2 = Math.min(i9, h24.a() - 1);
                    i3 = i5;
                } else {
                    kj6.i("MutableVector is empty.");
                    return null;
                }
            } else {
                kj6.i("MutableVector is empty.");
                return null;
            }
        } else {
            i2 = 0;
        }
        int f2 = o2Var.f();
        for (int i12 = 0; i12 < f2; i12++) {
            o24 o24 = (o24) o2Var.get(i12);
            int A = r16.A(h24, o24.a, o24.c);
            if ((i3 > A || A > i2) && A >= 0 && A < h24.a()) {
                xo4.a(A);
            }
        }
        if (i3 <= i2) {
            while (true) {
                xo4.a(i3);
                if (i3 == i2) {
                    break;
                }
                i3++;
            }
        }
        int i13 = xo4.b;
        if (i13 == 0) {
            return xo4;
        }
        int[] iArr = xo4.a;
        iArr.getClass();
        Arrays.sort(iArr, 0, i13);
        return xo4;
    }

    public static int k(int i2, int i3) {
        if (i2 < i3) {
            return -1;
        }
        if (i2 == i3) {
            return 0;
        }
        return 1;
    }

    public static int l(long j2, long j3) {
        int i2 = (j2 > j3 ? 1 : (j2 == j3 ? 0 : -1));
        if (i2 < 0) {
            return -1;
        }
        if (i2 == 0) {
            return 0;
        }
        return 1;
    }

    public static n74 m() {
        return new n74(10);
    }

    public static final Notification n(Context context, String str, int i2, int i3, int i4, PendingIntent pendingIntent) {
        context.getClass();
        d15 d15 = new d15(context, str);
        d15.y.icon = i4;
        d15.e = d15.b(context.getString(i2));
        d15.f = d15.b(context.getString(i3));
        d15.k = 0;
        d15.c(8, true);
        d15.g = pendingIntent;
        Notification a2 = d15.a();
        a2.getClass();
        return a2;
    }

    public static final Notification o(Context context, String str, String str2, String str3, int i2, PendingIntent pendingIntent) {
        context.getClass();
        d15 d15 = new d15(context, str);
        d15.y.icon = i2;
        d15.e = d15.b(str2);
        d15.f = d15.b(str3);
        d15.k = 0;
        d15.c(8, true);
        d15.g = pendingIntent;
        Notification a2 = d15.a();
        a2.getClass();
        return a2;
    }

    public static final void p(Context context, String str, int i2, int i3, int i4) {
        NotificationManager notificationManager;
        context.getClass();
        if (Build.VERSION.SDK_INT >= 26) {
            rk0.r();
            NotificationChannel d2 = rk0.d(i4, str, context.getString(i2));
            d2.setDescription(context.getString(i3));
            Object systemService = context.getSystemService("notification");
            if (systemService instanceof NotificationManager) {
                notificationManager = (NotificationManager) systemService;
            } else {
                notificationManager = null;
            }
            if (notificationManager != null) {
                notificationManager.createNotificationChannel(d2);
            }
        }
    }

    public static boolean q() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            oe2.c();
            oe2 c2 = oe2.c();
            c2.a();
            Context context = c2.a;
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("export_to_big_query")) {
                return sharedPreferences.getBoolean("export_to_big_query", false);
            }
            try {
                PackageManager packageManager = context.getPackageManager();
                if (!(packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("delivery_metrics_exported_to_big_query_enabled"))) {
                    return applicationInfo.metaData.getBoolean("delivery_metrics_exported_to_big_query_enabled", false);
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            return false;
        } catch (IllegalStateException unused2) {
            Log.i("FirebaseMessaging", "FirebaseApp has not being initialized. Device might be in direct boot mode. Skip exporting delivery metrics to Big Query");
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004e, code lost:
        defpackage.dh4.f(r1, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0051, code lost:
        throw r0;
     */
    public static final void r(ua6 ua6) {
        ua6.getClass();
        n74 m2 = m();
        ab6 k0 = ua6.k0("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (k0.i0()) {
            m2.add(k0.R(0));
        }
        dh4.f(k0, (Throwable) null);
        ListIterator listIterator = i(m2).listIterator(0);
        while (true) {
            d03 d03 = (d03) listIterator;
            if (d03.hasNext()) {
                String str = (String) d03.next();
                if (k57.u0(str, "room_fts_content_sync_", false)) {
                    l55.m(ua6, "DROP TRIGGER IF EXISTS ".concat(str));
                }
            } else {
                return;
            }
        }
    }

    public static final rv0 s(Context context) {
        context.getClass();
        if (context instanceof rv0) {
            return (rv0) context;
        }
        if (!(context instanceof ContextWrapper)) {
            return null;
        }
        Context baseContext = ((ContextWrapper) context).getBaseContext();
        baseContext.getClass();
        return s(baseContext);
    }

    public static final x83 t() {
        x83 x83 = m;
        if (x83 != null) {
            return x83;
        }
        w83 w83 = new w83("Rounded.CalendarMonth", 24.0f, 24.0f, 24.0f, 24.0f, 0, 0, false, 96);
        int i2 = e38.a;
        ky6 ky6 = new ky6(jt0.b);
        be5 e2 = pb4.e(17.0f, 2.0f);
        e2.e(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        e2.n(1.0f);
        e2.f(8.0f);
        e2.m(3.0f);
        e2.e(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        e2.k(6.0f, 2.45f, 6.0f, 3.0f);
        e2.n(1.0f);
        e2.f(5.0f);
        e2.d(3.89f, 4.0f, 3.01f, 4.9f, 3.01f, 6.0f);
        e2.h(3.0f, 20.0f);
        e2.e(0.0f, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f);
        e2.g(14.0f);
        e2.e(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        e2.m(6.0f);
        e2.e(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        e2.g(-1.0f);
        e2.m(3.0f);
        e2.d(18.0f, 2.45f, 17.55f, 2.0f, 17.0f, 2.0f);
        e2.c();
        e2.j(19.0f, 20.0f);
        e2.f(5.0f);
        e2.m(10.0f);
        e2.g(14.0f);
        e2.m(20.0f);
        e2.c();
        e2.j(11.0f, 13.0f);
        e2.e(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        e2.l(1.0f, 0.45f, 1.0f, 1.0f);
        e2.l(-0.45f, 1.0f, -1.0f, 1.0f);
        e2.k(11.0f, 13.55f, 11.0f, 13.0f);
        e2.c();
        e2.j(7.0f, 13.0f);
        e2.e(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        e2.l(1.0f, 0.45f, 1.0f, 1.0f);
        e2.l(-0.45f, 1.0f, -1.0f, 1.0f);
        e2.k(7.0f, 13.55f, 7.0f, 13.0f);
        e2.c();
        e2.j(15.0f, 13.0f);
        e2.e(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        e2.l(1.0f, 0.45f, 1.0f, 1.0f);
        e2.l(-0.45f, 1.0f, -1.0f, 1.0f);
        e2.k(15.0f, 13.55f, 15.0f, 13.0f);
        e2.c();
        e2.j(11.0f, 17.0f);
        e2.e(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        e2.l(1.0f, 0.45f, 1.0f, 1.0f);
        e2.l(-0.45f, 1.0f, -1.0f, 1.0f);
        e2.k(11.0f, 17.55f, 11.0f, 17.0f);
        e2.c();
        e2.j(7.0f, 17.0f);
        e2.e(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        e2.l(1.0f, 0.45f, 1.0f, 1.0f);
        e2.l(-0.45f, 1.0f, -1.0f, 1.0f);
        e2.k(7.0f, 17.55f, 7.0f, 17.0f);
        e2.c();
        e2.j(15.0f, 17.0f);
        e2.e(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        e2.l(1.0f, 0.45f, 1.0f, 1.0f);
        e2.l(-0.45f, 1.0f, -1.0f, 1.0f);
        e2.k(15.0f, 17.55f, 15.0f, 17.0f);
        e2.c();
        w83.a(w83, e2.a, ky6, 14336);
        x83 b2 = w83.b();
        m = b2;
        return b2;
    }

    public static final e81 u(a96 a96, boolean z, h61 h61) {
        e81 e81;
        il7 il7 = (il7) h61.r().a0(il7.x);
        if (il7 != null) {
            e81 = il7.w;
        } else {
            e81 = null;
        }
        if (!a96.k()) {
            ig0 ig0 = a96.a;
            if (ig0 != null) {
                e81 e812 = ig0.x;
                if (e81 == null) {
                    e81 = x32.w;
                }
                return e812.X(e81);
            }
            a0("coroutineScope");
            throw null;
        } else if (e81 != null) {
            ig0 ig02 = a96.a;
            if (ig02 != null) {
                return ig02.x.X(e81);
            }
            a0("coroutineScope");
            throw null;
        } else if (z) {
            e81 e813 = a96.b;
            if (e813 != null) {
                return e813;
            }
            a0("transactionContext");
            throw null;
        } else {
            ig0 ig03 = a96.a;
            if (ig03 != null) {
                return ig03.x;
            }
            a0("coroutineScope");
            throw null;
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [re3, pe3] */
    public static re3 v(Collection collection) {
        collection.getClass();
        return new pe3(0, collection.size() - 1, 1);
    }

    public static final x83 w() {
        x83 x83 = t;
        if (x83 != null) {
            return x83;
        }
        w83 w83 = new w83("Rounded.Info", 24.0f, 24.0f, 24.0f, 24.0f, 0, 0, false, 96);
        int i2 = e38.a;
        ky6 ky6 = new ky6(jt0.b);
        be5 e2 = pb4.e(12.0f, 2.0f);
        e2.d(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        e2.l(4.48f, 10.0f, 10.0f, 10.0f);
        e2.l(10.0f, -4.48f, 10.0f, -10.0f);
        e2.k(17.52f, 2.0f, 12.0f, 2.0f);
        e2.c();
        e2.j(12.0f, 17.0f);
        e2.e(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        e2.n(-4.0f);
        e2.e(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        e2.l(1.0f, 0.45f, 1.0f, 1.0f);
        e2.n(4.0f);
        e2.e(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        e2.c();
        e2.j(13.0f, 9.0f);
        e2.g(-2.0f);
        e2.h(11.0f, 7.0f);
        e2.g(2.0f);
        e2.n(2.0f);
        e2.c();
        w83.a(w83, e2.a, ky6, 14336);
        x83 b2 = w83.b();
        t = b2;
        return b2;
    }

    public static int x(List list) {
        list.getClass();
        return list.size() - 1;
    }

    public static final int y(KeyEvent keyEvent) {
        char c2;
        char c3;
        boolean isAltPressed = keyEvent.isAltPressed();
        boolean isCtrlPressed = keyEvent.isCtrlPressed();
        boolean isMetaPressed = keyEvent.isMetaPressed();
        boolean isShiftPressed = keyEvent.isShiftPressed();
        char c4 = 0;
        if (isCtrlPressed) {
            c2 = 2;
        } else {
            c2 = 0;
        }
        boolean z = isAltPressed | c2;
        if (isMetaPressed) {
            c3 = 4;
        } else {
            c3 = 0;
        }
        boolean z2 = z | c3;
        if (isShiftPressed) {
            c4 = 8;
        }
        return z2 | c4 ? 1 : 0;
    }

    public static final int z(qc4 qc4) {
        qc4.getClass();
        if (qc4.isEmpty()) {
            return 0;
        }
        try {
            long addExact = (Math.addExact(qc4.x, -qc4.w) / qc4.y) + 1;
            if (addExact > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (addExact < -2147483648L) {
                return Integer.MIN_VALUE;
            }
            return (int) addExact;
        } catch (ArithmeticException unused) {
            return Integer.MAX_VALUE;
        }
    }

    public abstract void J(Throwable th);

    public abstract void L(am6 am6);

    public abstract zw3 Q(zw3 zw3);
}
