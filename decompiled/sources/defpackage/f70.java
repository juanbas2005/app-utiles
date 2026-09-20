package defpackage;

import android.app.Application;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.ConnectivityManager;
import android.net.DhcpInfo;
import android.net.LinkAddress;
import android.net.LinkProperties;
import android.net.RouteInfo;
import android.net.Uri;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.provider.CallLog;
import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import com.google.firebase.sessions.settings.SessionConfigs;
import cu.lestebang.utiletecsa.MainActivity;
import io.github.jan.supabase.auth.a;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.net.HttpURLConnection;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.URL;
import java.net.URLConnection;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: f70  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class f70 extends a97 implements gs2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f70(Object obj, f61 f61, int i) {
        super(2, f61);
        this.A = i;
        this.B = obj;
    }

    public final Object H(Object obj, Object obj2) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        switch (i) {
            case b85.b:
                ((f70) o((f61) obj2, (o81) obj)).s(vs7);
                return vs7;
            case 1:
                ((f70) o((f61) obj2, (r31) obj)).s(vs7);
                return vs7;
            case 2:
                ((f70) o((f61) obj2, (o81) obj)).s(vs7);
                return vs7;
            case 3:
                ((f70) o((f61) obj2, (o81) obj)).s(vs7);
                return vs7;
            case 4:
                return ((f70) o((f61) obj2, (o81) obj)).s(vs7);
            case 5:
                ((f70) o((f61) obj2, (o81) obj)).s(vs7);
                return vs7;
            case 6:
                ((f70) o((f61) obj2, (fi2) obj)).s(vs7);
                return vs7;
            case 7:
                ((f70) o((f61) obj2, (o81) obj)).s(vs7);
                return vs7;
            case 8:
                ((f70) o((f61) obj2, (o81) obj)).s(vs7);
                return vs7;
            case 9:
                return ((f70) o((f61) obj2, (o81) obj)).s(vs7);
            case 10:
                ((f70) o((f61) obj2, (fi2) obj)).s(vs7);
                return vs7;
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                return ((f70) o((f61) obj2, (o81) obj)).s(vs7);
            case 12:
                return ((f70) o((f61) obj2, (o81) obj)).s(vs7);
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                return ((f70) o((f61) obj2, (SessionConfigs) obj)).s(vs7);
            case 14:
                ((f70) o((f61) obj2, (fi2) obj)).s(vs7);
                return vs7;
            case h75.g /*15*/:
                ((f70) o((f61) obj2, (o81) obj)).s(vs7);
                return vs7;
            case 16:
                ((f70) o((f61) obj2, (o81) obj)).s(vs7);
                return vs7;
            case 17:
                ((f70) o((f61) obj2, (o81) obj)).s(vs7);
                return vs7;
            default:
                return ((f70) o((f61) obj2, (o81) obj)).s(vs7);
        }
    }

    public final f61 o(f61 f61, Object obj) {
        int i = this.A;
        Object obj2 = this.B;
        switch (i) {
            case b85.b:
                return new f70((ek7) obj2, f61, 0);
            case 1:
                return new f70((be8) obj2, f61, 1);
            case 2:
                return new f70((e41) obj2, f61, 2);
            case 3:
                return new f70((ok2) obj2, f61, 3);
            case 4:
                return new f70((rv1) obj2, f61, 4);
            case 5:
                return new f70((aq4) obj2, f61, 5);
            case 6:
                return new f70((rh3) obj2, f61, 6);
            case 7:
                return new f70((MainActivity) obj2, f61, 7);
            case 8:
                return new f70((vs4) obj2, f61, 8);
            case 9:
                return new f70((wj5) obj2, f61, 9);
            case 10:
                return new f70((lq5) obj2, f61, 10);
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                return new f70((yq5) obj2, f61, 11);
            case 12:
                return new f70((g36) obj2, f61, 12);
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                return new f70((SessionConfigs) obj2, f61, 13);
            case 14:
                return new f70((fq6) obj2, f61, 14);
            case h75.g /*15*/:
                return new f70((uu) obj2, f61, 15);
            case 16:
                return new f70((sr2) obj2, f61, 16);
            case 17:
                return new f70((bs8) obj2, f61, 17);
            default:
                return new f70((Application) obj2, f61, 18);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: b41} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: b41} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v8, resolved type: b41} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v17, resolved type: java.lang.Object} */
    /* JADX WARNING: type inference failed for: r0v64, types: [tu6, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v22, types: [m66] */
    /* JADX WARNING: type inference failed for: r6v15, types: [m66] */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:343|344) */
    /* JADX WARNING: Can't wrap try/catch for region: R(8:332|333|335|336|337|338|(1:340)|(1:342)) */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x03ff, code lost:
        if (r3.equals("<unknown ssid>") == false) goto L_0x0403;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x044c, code lost:
        if (r8 != null) goto L_0x0469;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:344:?, code lost:
        r1.K = true;
        r1.F = new defpackage.yw5(new java.lang.Object());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:394:0x07fa, code lost:
        if (r0 != null) goto L_0x0812;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00fd, code lost:
        if (r13 == null) goto L_0x00ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:447:0x08f3, code lost:
        if (r0 != null) goto L_0x0906;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x018f, code lost:
        if (r0 != null) goto L_0x01a2;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:335:0x06f9 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:343:0x0708 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x047b  */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x04db  */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x04f1  */
    /* JADX WARNING: Removed duplicated region for block: B:234:0x04f3  */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x04f6  */
    /* JADX WARNING: Removed duplicated region for block: B:239:0x0505  */
    /* JADX WARNING: Removed duplicated region for block: B:240:0x0507  */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x050a  */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x050c  */
    /* JADX WARNING: Removed duplicated region for block: B:245:0x050f  */
    /* JADX WARNING: Removed duplicated region for block: B:252:0x0539  */
    /* JADX WARNING: Removed duplicated region for block: B:259:0x0561  */
    /* JADX WARNING: Removed duplicated region for block: B:266:0x0589  */
    /* JADX WARNING: Removed duplicated region for block: B:267:0x058b  */
    /* JADX WARNING: Removed duplicated region for block: B:269:0x058e  */
    /* JADX WARNING: Removed duplicated region for block: B:270:0x0591  */
    /* JADX WARNING: Removed duplicated region for block: B:272:0x0595  */
    /* JADX WARNING: Removed duplicated region for block: B:273:0x0598  */
    /* JADX WARNING: Removed duplicated region for block: B:286:0x05ff  */
    /* JADX WARNING: Removed duplicated region for block: B:305:0x061f  */
    /* JADX WARNING: Removed duplicated region for block: B:308:0x0625 A[LOOP:7: B:308:0x0625->B:313:0x0664, LOOP_START] */
    /* JADX WARNING: Removed duplicated region for block: B:314:0x0666  */
    /* JADX WARNING: Removed duplicated region for block: B:409:0x0817  */
    /* JADX WARNING: Removed duplicated region for block: B:413:0x082b A[LOOP:8: B:356:0x074a->B:413:0x082b, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:481:0x0493 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:489:0x091a A[SYNTHETIC] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:335:0x06f9=Splitter:B:335:0x06f9, B:347:0x071a=Splitter:B:347:0x071a, B:337:0x06fb=Splitter:B:337:0x06fb} */
    public final Object s(Object obj) {
        Object value;
        b41 b41;
        List list;
        List list2;
        Throwable th;
        oi0 oi0;
        b41 b412;
        List list3;
        Object obj2;
        Throwable th2;
        ew6 ew6;
        WifiManager wifiManager;
        WifiInfo wifiInfo;
        ConnectivityManager connectivityManager;
        Object obj3;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        i98 i98;
        Object value2;
        String str14;
        String str15;
        Object value3;
        hs4 hs4;
        i98 i982;
        HttpURLConnection httpURLConnection;
        BufferedReader bufferedReader;
        Throwable th3;
        List<InetAddress> dnsServers;
        ArrayList arrayList;
        ArrayList arrayList2;
        DhcpInfo dhcpInfo;
        List<RouteInfo> routes;
        Iterator<T> it;
        RouteInfo routeInfo;
        InetAddress gateway;
        String hostAddress;
        List<LinkAddress> linkAddresses;
        LinkAddress linkAddress;
        String ssid;
        String str16;
        Throwable th4;
        List list4;
        Serializable serializable;
        Throwable th5;
        oi0 oi02;
        long j;
        int i = 4;
        int i2 = 3;
        String str17 = null;
        int i3 = 0;
        int i4 = 2;
        int i5 = 1;
        switch (this.A) {
            case b85.b:
                o85.q(obj);
                ((ek7) this.B).a();
                return vs7.a;
            case 1:
                o85.q(obj);
                String str18 = f31.a;
                bc4.k().e(str18, "Constraints changed for " + ((be8) this.B));
                return vs7.a;
            case 2:
                Object obj4 = a42.w;
                o85.q(obj);
                e41 e41 = (e41) this.B;
                String str19 = e41.f;
                Context context = e41.b;
                boolean z = e41.g;
                d37 d37 = e41.h;
                int i6 = 200;
                if (z) {
                    while (true) {
                        Object value4 = d37.getValue();
                        Object obj5 = (b41) value4;
                        if (sg3.A(context, "android.permission.READ_SMS")) {
                            String q = fd1.q(str19);
                            if (q.length() != 0) {
                                try {
                                    ContentResolver contentResolver = context.getContentResolver();
                                    Uri parse = Uri.parse("content://sms");
                                    parse.getClass();
                                    Cursor query = contentResolver.query(parse, new String[]{"address", "body", "date", "type"}, (String) null, (String[]) null, "date DESC");
                                    if (query != null) {
                                        try {
                                            n74 m = sg3.m();
                                            while (query.moveToNext() && m.f() < i6) {
                                                String string = query.getString(i3);
                                                if (string != null) {
                                                    if (fd1.q(string).equals(q)) {
                                                        this = obj5;
                                                        String format = new SimpleDateFormat("d/M/yyyy h:mm a", Locale.getDefault()).format(new Date(query.getLong(i4)));
                                                        format.getClass();
                                                        if (query.getInt(3) == 1) {
                                                            ew6 = ew6.x;
                                                        } else {
                                                            ew6 = ew6.w;
                                                        }
                                                        String string2 = query.getString(1);
                                                        if (string2 == null) {
                                                            string2 = "";
                                                        }
                                                        m.add(new g41(format, ew6, string2));
                                                        obj5 = this;
                                                        i3 = 0;
                                                        i4 = 2;
                                                        i6 = 200;
                                                    }
                                                }
                                            }
                                            this = obj5;
                                            obj2 = sg3.i(m);
                                            try {
                                                query.close();
                                                break;
                                            } catch (Throwable th6) {
                                                th = th6;
                                                obj2 = new m66(th);
                                                if (obj2 instanceof m66) {
                                                }
                                                list3 = (List) obj2;
                                                b412 = this;
                                                i5 = 1;
                                                if (d37.i(value4, b41.a(b412, (List) null, list3, i5))) {
                                                }
                                            }
                                        } catch (Throwable th7) {
                                            th = th7;
                                            th2 = th;
                                            throw th2;
                                        }
                                    } else {
                                        this = obj5;
                                    }
                                    obj2 = obj4;
                                } catch (Throwable th8) {
                                    th = th8;
                                    this = obj5;
                                    obj2 = new m66(th);
                                    if (obj2 instanceof m66) {
                                    }
                                    list3 = (List) obj2;
                                    b412 = this;
                                    i5 = 1;
                                    if (d37.i(value4, b41.a(b412, (List) null, list3, i5))) {
                                    }
                                }
                                if (obj2 instanceof m66) {
                                    obj2 = obj4;
                                }
                                list3 = (List) obj2;
                                b412 = this;
                                i5 = 1;
                                if (d37.i(value4, b41.a(b412, (List) null, list3, i5))) {
                                    i3 = 0;
                                    i4 = 2;
                                    i5 = 1;
                                    i6 = 200;
                                }
                            }
                        }
                        list3 = obj4;
                        b412 = obj5;
                        if (d37.i(value4, b41.a(b412, (List) null, list3, i5))) {
                        }
                    }
                } else {
                    do {
                        value = d37.getValue();
                        b41 = (b41) value;
                        if (sg3.A(context, "android.permission.READ_CALL_LOG")) {
                            String q2 = fd1.q(str19);
                            if (q2.length() != 0) {
                                try {
                                    Cursor query2 = context.getContentResolver().query(CallLog.Calls.CONTENT_URI, new String[]{"number", "date", "duration", "type"}, (String) null, (String[]) null, "date DESC");
                                    if (query2 != null) {
                                        try {
                                            n74 m2 = sg3.m();
                                            while (query2.moveToNext() && m2.f() < 200) {
                                                String string3 = query2.getString(0);
                                                if (string3 != null) {
                                                    if (fd1.q(string3).equals(q2)) {
                                                        String str20 = q2;
                                                        String format2 = new SimpleDateFormat("d/M/yyyy h:mm a", Locale.getDefault()).format(new Date(query2.getLong(1)));
                                                        format2.getClass();
                                                        long j2 = query2.getLong(2);
                                                        String format3 = String.format("%02dm:%02ds", Arrays.copyOf(new Object[]{Long.valueOf(j2 / 60), Long.valueOf(j2 % 60)}, 2));
                                                        int i7 = query2.getInt(3);
                                                        if (i7 == 1) {
                                                            oi0 = oi0.x;
                                                        } else if (i7 != 2) {
                                                            oi0 = oi0.y;
                                                        } else {
                                                            oi0 = oi0.w;
                                                        }
                                                        m2.add(new y31(format2, format3, oi0));
                                                        q2 = str20;
                                                    }
                                                }
                                            }
                                            list2 = sg3.i(m2);
                                            query2.close();
                                            break;
                                        } catch (Throwable th9) {
                                            ed1.i(query2, th);
                                            throw th9;
                                        }
                                    }
                                    list2 = obj4;
                                } catch (Throwable th10) {
                                    list2 = new m66(th10);
                                }
                                if (list2 instanceof m66) {
                                    list2 = obj4;
                                }
                                list = (List) list2;
                            }
                        }
                        list = obj4;
                    } while (!d37.i(value, b41.a(b41, list, (List) null, 2)));
                }
                return vs7.a;
            case 3:
                o85.q(obj);
                ok2.a((ok2) this.B);
                return vs7.a;
            case 4:
                o85.q(obj);
                rv1 rv1 = (rv1) this.B;
                synchronized (rv1) {
                    if (rv1.H && !rv1.I) {
                        rv1.I();
                        rv1.J = true;
                        if (rv1.E >= 2000) {
                            i3 = 1;
                        }
                        if (i3 != 0) {
                            rv1.M();
                            break;
                        }
                        break;
                    } else {
                        vs7 vs7 = vs7.a;
                        return vs7;
                    }
                }
                break;
            case 5:
                o85.q(obj);
                ((sr2) ((aq4) this.B).getValue()).b();
                return vs7.a;
            case 6:
                o85.q(obj);
                rh3 rh3 = (rh3) this.B;
                String str21 = rh3.c;
                if (str21 != null) {
                    n03 n03 = (n03) rh3.b;
                    n03.getClass();
                    p94 p94 = n03.a;
                    p94.getClass();
                    xk3 xk3 = p94.a;
                    xk3.getClass();
                    gr8.Q(new oi2(new qi2(new c6(gr8.L(t49.E(xk3.a, false, new String[]{"jetpacks"}, new uk3(str21, xk3, 1)), p94.b), 6), new tc1(rh3, (f61) null, 6), 2), new qh3(3, (f61) null, 0), 1), u58.a(rh3));
                }
                return vs7.a;
            case 7:
                o85.q(obj);
                MainActivity.t((MainActivity) this.B);
                return vs7.a;
            case 8:
                o85.q(obj);
                vs4 vs4 = (vs4) this.B;
                d37 d372 = vs4.f;
                Context context2 = vs4.d;
                Object systemService = context2.getApplicationContext().getSystemService("wifi");
                if (systemService instanceof WifiManager) {
                    wifiManager = (WifiManager) systemService;
                } else {
                    wifiManager = null;
                }
                if (wifiManager != null) {
                    try {
                        wifiInfo = wifiManager.getConnectionInfo();
                    } catch (Throwable th11) {
                        wifiInfo = new m66(th11);
                    }
                } else {
                    wifiInfo = null;
                }
                if (wifiInfo instanceof m66) {
                    wifiInfo = null;
                }
                WifiInfo wifiInfo2 = wifiInfo;
                Object systemService2 = context2.getSystemService("connectivity");
                if (systemService2 instanceof ConnectivityManager) {
                    connectivityManager = (ConnectivityManager) systemService2;
                } else {
                    connectivityManager = null;
                }
                if (connectivityManager != null) {
                    try {
                        obj3 = connectivityManager.getLinkProperties(connectivityManager.getActiveNetwork());
                    } catch (Throwable th12) {
                        obj3 = new m66(th12);
                    }
                } else {
                    obj3 = null;
                }
                if (obj3 instanceof m66) {
                    obj3 = null;
                }
                LinkProperties linkProperties = (LinkProperties) obj3;
                if (!(wifiInfo2 == null || (ssid = wifiInfo2.getSSID()) == null)) {
                    str = d57.T0(ssid);
                    if (!d57.I0(str)) {
                        break;
                    }
                }
                str = null;
                if (wifiInfo2 == null || (str2 = wifiInfo2.getBSSID()) == null || d57.I0(str2) || str2.equals("02:00:00:00:00:00")) {
                    str2 = null;
                }
                if (!(linkProperties == null || (linkAddresses = linkProperties.getLinkAddresses()) == null)) {
                    Iterator<T> it2 = linkAddresses.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            linkAddress = it2.next();
                            if (linkAddress.getAddress() instanceof Inet4Address) {
                            }
                        } else {
                            linkAddress = null;
                        }
                    }
                    LinkAddress linkAddress2 = (LinkAddress) linkAddress;
                    if (linkAddress2 != null) {
                        InetAddress address = linkAddress2.getAddress();
                        if (address != null) {
                            str3 = address.getHostAddress();
                            break;
                        }
                    }
                }
                if (wifiInfo2 != null) {
                    int ipAddress = wifiInfo2.getIpAddress();
                    Integer valueOf = Integer.valueOf(ipAddress);
                    if (ipAddress == 0) {
                        valueOf = null;
                    }
                    if (valueOf != null) {
                        str3 = vs4.e(valueOf.intValue());
                        if (!(linkProperties == null || (routes = linkProperties.getRoutes()) == null)) {
                            it = routes.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    routeInfo = it.next();
                                    InetAddress gateway2 = routeInfo.getGateway();
                                    if (!(gateway2 instanceof Inet4Address) || ((Inet4Address) gateway2).isAnyLocalAddress()) {
                                    }
                                } else {
                                    routeInfo = null;
                                }
                            }
                            RouteInfo routeInfo2 = (RouteInfo) routeInfo;
                            if (!(routeInfo2 == null || (gateway = routeInfo2.getGateway()) == null || (hostAddress = gateway.getHostAddress()) == null)) {
                                str4 = hostAddress;
                                if (!(linkProperties == null || (dnsServers = linkProperties.getDnsServers()) == null)) {
                                    arrayList = new ArrayList();
                                    for (InetAddress hostAddress2 : dnsServers) {
                                        String hostAddress3 = hostAddress2.getHostAddress();
                                        if (hostAddress3 != null) {
                                            arrayList.add(hostAddress3);
                                        }
                                    }
                                    if (arrayList.isEmpty()) {
                                        arrayList2 = arrayList;
                                    } else {
                                        arrayList2 = null;
                                    }
                                    if (arrayList2 != null) {
                                        str5 = dt0.E0(arrayList2, "\n", (String) null, (String) null, (vr2) null, 62);
                                        if (str == null) {
                                            str6 = "--";
                                        } else {
                                            str6 = str;
                                        }
                                        if (str2 == null) {
                                            str7 = "--";
                                        } else {
                                            str7 = str2;
                                        }
                                        if (wifiInfo2 != null) {
                                            int rssi = wifiInfo2.getRssi();
                                            Integer valueOf2 = Integer.valueOf(rssi);
                                            if (rssi == -127) {
                                                valueOf2 = null;
                                            }
                                            if (valueOf2 != null) {
                                                str8 = valueOf2.intValue() + " dBm";
                                                if (wifiInfo2 != null) {
                                                    int linkSpeed = wifiInfo2.getLinkSpeed();
                                                    Integer valueOf3 = Integer.valueOf(linkSpeed);
                                                    if (linkSpeed <= 0) {
                                                        valueOf3 = null;
                                                    }
                                                    if (valueOf3 != null) {
                                                        str9 = valueOf3.intValue() + " Mbps";
                                                        if (wifiInfo2 != null) {
                                                            int frequency = wifiInfo2.getFrequency();
                                                            Integer valueOf4 = Integer.valueOf(frequency);
                                                            if (frequency <= 0) {
                                                                valueOf4 = null;
                                                            }
                                                            if (valueOf4 != null) {
                                                                str10 = valueOf4.intValue() + " MHz";
                                                                if (str3 != null) {
                                                                    str11 = "--";
                                                                } else {
                                                                    str11 = str3;
                                                                }
                                                                if (str4 != null) {
                                                                    str12 = "--";
                                                                } else {
                                                                    str12 = str4;
                                                                }
                                                                if (str5 != null) {
                                                                    str13 = "--";
                                                                } else {
                                                                    str13 = str5;
                                                                }
                                                                i98 = new i98(str6, str7, str8, str9, str10, str11, str12, str13, 256);
                                                                do {
                                                                    value2 = d372.getValue();
                                                                } while (!d372.i(value2, new is7(6, hs4.a((hs4) ((is7) value2).a, i98))));
                                                                URLConnection openConnection = new URL("https://api.ipify.org").openConnection();
                                                                openConnection.getClass();
                                                                httpURLConnection = (HttpURLConnection) openConnection;
                                                                httpURLConnection.setConnectTimeout(5000);
                                                                httpURLConnection.setReadTimeout(5000);
                                                                InputStream inputStream = httpURLConnection.getInputStream();
                                                                inputStream.getClass();
                                                                bufferedReader = new BufferedReader(new InputStreamReader(inputStream, mo0.a), 8192);
                                                                str14 = d57.k1(w95.j(bufferedReader)).toString();
                                                                bufferedReader.close();
                                                                if (str14.length() <= 0) {
                                                                    str14 = null;
                                                                }
                                                                httpURLConnection.disconnect();
                                                                if (str14 instanceof m66) {
                                                                    str14 = null;
                                                                }
                                                                str15 = str14;
                                                                if (str15 == null) {
                                                                    do {
                                                                        value3 = d372.getValue();
                                                                        hs4 = (hs4) ((is7) value3).a;
                                                                        i98 i983 = hs4.f;
                                                                        if (i983 != null) {
                                                                            String str22 = i983.a;
                                                                            String str23 = i983.b;
                                                                            String str24 = i983.c;
                                                                            String str25 = i983.d;
                                                                            String str26 = i983.e;
                                                                            String str27 = i983.f;
                                                                            String str28 = i983.g;
                                                                            String str29 = i983.h;
                                                                            hl6.t(str22, str23, str24, str25, str26);
                                                                            str27.getClass();
                                                                            str28.getClass();
                                                                            str29.getClass();
                                                                            i982 = new i98(str22, str23, str24, str25, str26, str27, str28, str29, str15);
                                                                        } else {
                                                                            i982 = null;
                                                                        }
                                                                    } while (!d372.i(value3, new is7(6, hs4.a(hs4, i982))));
                                                                }
                                                                return vs7.a;
                                                            }
                                                        }
                                                        str10 = "--";
                                                        if (str3 != null) {
                                                        }
                                                        if (str4 != null) {
                                                        }
                                                        if (str5 != null) {
                                                        }
                                                        i98 = new i98(str6, str7, str8, str9, str10, str11, str12, str13, 256);
                                                        do {
                                                            value2 = d372.getValue();
                                                        } while (!d372.i(value2, new is7(6, hs4.a((hs4) ((is7) value2).a, i98))));
                                                        URLConnection openConnection2 = new URL("https://api.ipify.org").openConnection();
                                                        openConnection2.getClass();
                                                        httpURLConnection = (HttpURLConnection) openConnection2;
                                                        httpURLConnection.setConnectTimeout(5000);
                                                        httpURLConnection.setReadTimeout(5000);
                                                        InputStream inputStream2 = httpURLConnection.getInputStream();
                                                        inputStream2.getClass();
                                                        bufferedReader = new BufferedReader(new InputStreamReader(inputStream2, mo0.a), 8192);
                                                        str14 = d57.k1(w95.j(bufferedReader)).toString();
                                                        bufferedReader.close();
                                                        if (str14.length() <= 0) {
                                                        }
                                                        httpURLConnection.disconnect();
                                                        if (str14 instanceof m66) {
                                                        }
                                                        str15 = str14;
                                                        if (str15 == null) {
                                                        }
                                                        return vs7.a;
                                                    }
                                                }
                                                str9 = "--";
                                                if (wifiInfo2 != null) {
                                                }
                                                str10 = "--";
                                                if (str3 != null) {
                                                }
                                                if (str4 != null) {
                                                }
                                                if (str5 != null) {
                                                }
                                                i98 = new i98(str6, str7, str8, str9, str10, str11, str12, str13, 256);
                                                do {
                                                    value2 = d372.getValue();
                                                } while (!d372.i(value2, new is7(6, hs4.a((hs4) ((is7) value2).a, i98))));
                                                URLConnection openConnection22 = new URL("https://api.ipify.org").openConnection();
                                                openConnection22.getClass();
                                                httpURLConnection = (HttpURLConnection) openConnection22;
                                                httpURLConnection.setConnectTimeout(5000);
                                                httpURLConnection.setReadTimeout(5000);
                                                InputStream inputStream22 = httpURLConnection.getInputStream();
                                                inputStream22.getClass();
                                                bufferedReader = new BufferedReader(new InputStreamReader(inputStream22, mo0.a), 8192);
                                                str14 = d57.k1(w95.j(bufferedReader)).toString();
                                                bufferedReader.close();
                                                if (str14.length() <= 0) {
                                                }
                                                httpURLConnection.disconnect();
                                                if (str14 instanceof m66) {
                                                }
                                                str15 = str14;
                                                if (str15 == null) {
                                                }
                                                return vs7.a;
                                            }
                                        }
                                        str8 = "--";
                                        if (wifiInfo2 != null) {
                                        }
                                        str9 = "--";
                                        if (wifiInfo2 != null) {
                                        }
                                        str10 = "--";
                                        if (str3 != null) {
                                        }
                                        if (str4 != null) {
                                        }
                                        if (str5 != null) {
                                        }
                                        i98 = new i98(str6, str7, str8, str9, str10, str11, str12, str13, 256);
                                        do {
                                            value2 = d372.getValue();
                                        } while (!d372.i(value2, new is7(6, hs4.a((hs4) ((is7) value2).a, i98))));
                                        URLConnection openConnection222 = new URL("https://api.ipify.org").openConnection();
                                        openConnection222.getClass();
                                        httpURLConnection = (HttpURLConnection) openConnection222;
                                        httpURLConnection.setConnectTimeout(5000);
                                        httpURLConnection.setReadTimeout(5000);
                                        InputStream inputStream222 = httpURLConnection.getInputStream();
                                        inputStream222.getClass();
                                        bufferedReader = new BufferedReader(new InputStreamReader(inputStream222, mo0.a), 8192);
                                        str14 = d57.k1(w95.j(bufferedReader)).toString();
                                        bufferedReader.close();
                                        if (str14.length() <= 0) {
                                        }
                                        httpURLConnection.disconnect();
                                        if (str14 instanceof m66) {
                                        }
                                        str15 = str14;
                                        if (str15 == null) {
                                        }
                                        return vs7.a;
                                    }
                                }
                                str5 = null;
                                if (str == null) {
                                }
                                if (str2 == null) {
                                }
                                if (wifiInfo2 != null) {
                                }
                                str8 = "--";
                                if (wifiInfo2 != null) {
                                }
                                str9 = "--";
                                if (wifiInfo2 != null) {
                                }
                                str10 = "--";
                                if (str3 != null) {
                                }
                                if (str4 != null) {
                                }
                                if (str5 != null) {
                                }
                                i98 = new i98(str6, str7, str8, str9, str10, str11, str12, str13, 256);
                                do {
                                    value2 = d372.getValue();
                                } while (!d372.i(value2, new is7(6, hs4.a((hs4) ((is7) value2).a, i98))));
                                URLConnection openConnection2222 = new URL("https://api.ipify.org").openConnection();
                                openConnection2222.getClass();
                                httpURLConnection = (HttpURLConnection) openConnection2222;
                                httpURLConnection.setConnectTimeout(5000);
                                httpURLConnection.setReadTimeout(5000);
                                InputStream inputStream2222 = httpURLConnection.getInputStream();
                                inputStream2222.getClass();
                                bufferedReader = new BufferedReader(new InputStreamReader(inputStream2222, mo0.a), 8192);
                                str14 = d57.k1(w95.j(bufferedReader)).toString();
                                bufferedReader.close();
                                if (str14.length() <= 0) {
                                }
                                httpURLConnection.disconnect();
                                if (str14 instanceof m66) {
                                }
                                str15 = str14;
                                if (str15 == null) {
                                }
                                return vs7.a;
                            }
                        }
                        if (!(wifiManager == null || (dhcpInfo = wifiManager.getDhcpInfo()) == null)) {
                            int i8 = dhcpInfo.gateway;
                            Integer valueOf5 = Integer.valueOf(i8);
                            if (i8 == 0) {
                                valueOf5 = null;
                            }
                            if (valueOf5 != null) {
                                str4 = vs4.e(valueOf5.intValue());
                                arrayList = new ArrayList();
                                while (r0.hasNext()) {
                                }
                                if (arrayList.isEmpty()) {
                                }
                                if (arrayList2 != null) {
                                }
                                str5 = null;
                                if (str == null) {
                                }
                                if (str2 == null) {
                                }
                                if (wifiInfo2 != null) {
                                }
                                str8 = "--";
                                if (wifiInfo2 != null) {
                                }
                                str9 = "--";
                                if (wifiInfo2 != null) {
                                }
                                str10 = "--";
                                if (str3 != null) {
                                }
                                if (str4 != null) {
                                }
                                if (str5 != null) {
                                }
                                i98 = new i98(str6, str7, str8, str9, str10, str11, str12, str13, 256);
                                do {
                                    value2 = d372.getValue();
                                } while (!d372.i(value2, new is7(6, hs4.a((hs4) ((is7) value2).a, i98))));
                                URLConnection openConnection22222 = new URL("https://api.ipify.org").openConnection();
                                openConnection22222.getClass();
                                httpURLConnection = (HttpURLConnection) openConnection22222;
                                httpURLConnection.setConnectTimeout(5000);
                                httpURLConnection.setReadTimeout(5000);
                                InputStream inputStream22222 = httpURLConnection.getInputStream();
                                inputStream22222.getClass();
                                bufferedReader = new BufferedReader(new InputStreamReader(inputStream22222, mo0.a), 8192);
                                str14 = d57.k1(w95.j(bufferedReader)).toString();
                                bufferedReader.close();
                                if (str14.length() <= 0) {
                                }
                                httpURLConnection.disconnect();
                                if (str14 instanceof m66) {
                                }
                                str15 = str14;
                                if (str15 == null) {
                                }
                                return vs7.a;
                            }
                        }
                        str4 = null;
                        arrayList = new ArrayList();
                        while (r0.hasNext()) {
                        }
                        if (arrayList.isEmpty()) {
                        }
                        if (arrayList2 != null) {
                        }
                        str5 = null;
                        if (str == null) {
                        }
                        if (str2 == null) {
                        }
                        if (wifiInfo2 != null) {
                        }
                        str8 = "--";
                        if (wifiInfo2 != null) {
                        }
                        str9 = "--";
                        if (wifiInfo2 != null) {
                        }
                        str10 = "--";
                        if (str3 != null) {
                        }
                        if (str4 != null) {
                        }
                        if (str5 != null) {
                        }
                        i98 = new i98(str6, str7, str8, str9, str10, str11, str12, str13, 256);
                        do {
                            value2 = d372.getValue();
                        } while (!d372.i(value2, new is7(6, hs4.a((hs4) ((is7) value2).a, i98))));
                        URLConnection openConnection222222 = new URL("https://api.ipify.org").openConnection();
                        openConnection222222.getClass();
                        httpURLConnection = (HttpURLConnection) openConnection222222;
                        httpURLConnection.setConnectTimeout(5000);
                        httpURLConnection.setReadTimeout(5000);
                        InputStream inputStream222222 = httpURLConnection.getInputStream();
                        inputStream222222.getClass();
                        bufferedReader = new BufferedReader(new InputStreamReader(inputStream222222, mo0.a), 8192);
                        str14 = d57.k1(w95.j(bufferedReader)).toString();
                        bufferedReader.close();
                        if (str14.length() <= 0) {
                        }
                        httpURLConnection.disconnect();
                        if (str14 instanceof m66) {
                        }
                        str15 = str14;
                        if (str15 == null) {
                        }
                        return vs7.a;
                    }
                }
                str3 = null;
                it = routes.iterator();
                while (true) {
                    if (!it.hasNext()) {
                    }
                }
                RouteInfo routeInfo22 = (RouteInfo) routeInfo;
                str4 = hostAddress;
                arrayList = new ArrayList();
                while (r0.hasNext()) {
                }
                if (arrayList.isEmpty()) {
                }
                if (arrayList2 != null) {
                }
                str5 = null;
                if (str == null) {
                }
                if (str2 == null) {
                }
                if (wifiInfo2 != null) {
                }
                str8 = "--";
                if (wifiInfo2 != null) {
                }
                str9 = "--";
                if (wifiInfo2 != null) {
                }
                str10 = "--";
                if (str3 != null) {
                }
                if (str4 != null) {
                }
                if (str5 != null) {
                }
                i98 = new i98(str6, str7, str8, str9, str10, str11, str12, str13, 256);
                do {
                    value2 = d372.getValue();
                } while (!d372.i(value2, new is7(6, hs4.a((hs4) ((is7) value2).a, i98))));
                try {
                    URLConnection openConnection2222222 = new URL("https://api.ipify.org").openConnection();
                    openConnection2222222.getClass();
                    httpURLConnection = (HttpURLConnection) openConnection2222222;
                    httpURLConnection.setConnectTimeout(5000);
                    httpURLConnection.setReadTimeout(5000);
                    InputStream inputStream2222222 = httpURLConnection.getInputStream();
                    inputStream2222222.getClass();
                    bufferedReader = new BufferedReader(new InputStreamReader(inputStream2222222, mo0.a), 8192);
                    try {
                        str14 = d57.k1(w95.j(bufferedReader)).toString();
                        bufferedReader.close();
                        if (str14.length() <= 0) {
                        }
                        httpURLConnection.disconnect();
                        if (str14 instanceof m66) {
                        }
                        str15 = str14;
                        if (str15 == null) {
                        }
                        return vs7.a;
                    } catch (Throwable th13) {
                        ed1.i(bufferedReader, th3);
                        throw th13;
                    }
                } catch (Throwable th14) {
                    str14 = new m66(th14);
                }
                break;
            case 9:
                o85.q(obj);
                wj5 wj5 = (wj5) this.B;
                Context context3 = wj5.b;
                hj6 hj6 = wj5.c;
                TextClassificationManager h = pc7.h(context3.getSystemService(pc7.k()));
                int ordinal = hj6.ordinal();
                if (ordinal == 0) {
                    str16 = "edittext";
                } else if (ordinal == 1) {
                    str16 = "textview";
                } else {
                    h.c();
                    return null;
                }
                tj5.D();
                TextClassifier k = h.createTextClassificationSession(tj5.i(context3.getPackageName(), str16).build());
                wj5.f = k;
                return k;
            case 10:
                o85.q(obj);
                lq5 lq5 = (lq5) this.B;
                Object obj6 = new Object();
                p7 p7Var = lq5.b;
                gr8.Q(new qi2(new o40(3, new di2[]{new c6(((dy7) p7Var.c).d(), 0), p7Var.d(), new c6(((dy7) p7Var.c).d(), 2)}, new a97(4, (f61) null)), new gv(lq5, obj6, (f61) null, 9), 2), u58.a(lq5));
                return vs7.a;
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                o85.q(obj);
                o9 o9Var = new o9(12);
                o9Var.N("https://www.etecsa.cu/");
                o9Var.D("User-Agent", "Mozilla/5.0 (Linux; Android 13) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0 Mobile Safari/537.36");
                o9Var.x();
                kd6 kd6 = new kd6(o9Var);
                d45 d45 = (d45) ((yq5) this.B).b.getValue();
                d45.getClass();
                a66 f = new dx5(d45, kd6, false).f();
                try {
                    if (f.M) {
                        String o = f.C.o();
                        f.close();
                        uw1 uw1 = new uw1(new vl7(new wl7(new ts(2, new fm2(new ts(2, new fm2(new wl7(k26.b(yq5.d, o), jo3.W), new wq5(o, 0), (f61) null, 3)), new wq5(o, 1), (f61) null, 3)), new xq5((yq5) this.B, 0))), new nf6(17));
                        if (!uw1.hasNext()) {
                            list4 = a42.w;
                        } else {
                            Object next = uw1.next();
                            if (!uw1.hasNext()) {
                                list4 = sg3.D(next);
                            } else {
                                ArrayList arrayList3 = new ArrayList();
                                arrayList3.add(next);
                                while (uw1.hasNext()) {
                                    arrayList3.add(uw1.next());
                                }
                                list4 = arrayList3;
                            }
                        }
                        List V = cl6.V(new wl7(k26.b(yq5.f, o), new xq5((yq5) this.B, 1)));
                        ArrayList arrayList4 = new ArrayList(et0.e0(list4, 10));
                        for (Object next2 : list4) {
                            int i9 = i3 + 1;
                            if (i3 >= 0) {
                                String str30 = (String) next2;
                                Object z0 = dt0.z0(i3, V);
                                String str31 = (String) z0;
                                if (V.size() != list4.size()) {
                                    z0 = null;
                                }
                                arrayList4.add(new uq5(str30, (String) z0));
                                i3 = i9;
                            } else {
                                sg3.Z();
                                throw null;
                            }
                        }
                        ((yq5) this.B).c = arrayList4;
                        return arrayList4;
                    }
                    throw new IllegalStateException(("HTTP " + f.z).toString());
                } catch (Throwable th15) {
                    ed1.i(f, th4);
                    throw th15;
                }
            case 12:
                o85.q(obj);
                g36 g36 = (g36) this.B;
                Serializable serializable2 = a42.w;
                Context context4 = g36.b;
                if (!sg3.A(context4, "android.permission.READ_CALL_LOG")) {
                    return serializable2;
                }
                try {
                    Cursor query3 = context4.getContentResolver().query(CallLog.Calls.CONTENT_URI, new String[]{"number", "name", "date", "duration", "type"}, (String) null, (String[]) null, "date DESC");
                    if (query3 != null) {
                        try {
                            n74 m3 = sg3.m();
                            int i10 = 0;
                            while (query3.moveToNext() && i10 < 300) {
                                String string4 = query3.getString(0);
                                if (string4 == null) {
                                    string4 = "";
                                }
                                String str32 = string4;
                                String string5 = query3.getString(1);
                                f41 l = g36.l(str32);
                                if (string5 != null) {
                                    if (d57.I0(string5)) {
                                        string5 = str17;
                                        break;
                                    } else {
                                        break;
                                    }
                                }
                                string5 = l.a;
                                if (string5 == null) {
                                    if (d57.I0(str32)) {
                                        string5 = "Desconocido";
                                    } else {
                                        string5 = str32;
                                    }
                                }
                                long j3 = query3.getLong(2);
                                long j4 = query3.getLong(i2);
                                int i11 = query3.getInt(i);
                                if (i11 == 1) {
                                    oi02 = oi0.x;
                                } else if (i11 != 2) {
                                    oi02 = oi0.y;
                                } else {
                                    oi02 = oi0.w;
                                }
                                String b = h36.b(j3);
                                String format4 = String.format("%02dm:%02ds", Arrays.copyOf(new Object[]{Long.valueOf(j4 / 60), Long.valueOf(j4 % 60)}, 2));
                                String h2 = g36.h(string5);
                                int ordinal2 = oi02.ordinal();
                                if (ordinal2 == 0) {
                                    j = 4282219166L;
                                } else if (ordinal2 == 1) {
                                    j = 4281298912L;
                                } else if (ordinal2 == 2) {
                                    j = 4279974492L;
                                } else {
                                    throw new RuntimeException();
                                }
                                m3.add(new mi0(string5, str32, b, format4, oi02, h2, j, l.b, g36.i(str32, string5)));
                                i10++;
                                i = 4;
                                i2 = 3;
                                str17 = null;
                            }
                            serializable = sg3.i(m3);
                            query3.close();
                            break;
                        } catch (Throwable th16) {
                            ed1.i(query3, th5);
                            throw th16;
                        }
                    }
                    serializable = serializable2;
                } catch (Throwable th17) {
                    serializable = new m66(th17);
                }
                if (!(serializable instanceof m66)) {
                    serializable2 = serializable;
                }
                return (List) serializable2;
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                o85.q(obj);
                return (SessionConfigs) this.B;
            case 14:
                o85.q(obj);
                fq6 fq6 = (fq6) this.B;
                gr8.Q(new oi2(new qi2(new o40(7, fq6.b.a(), fq6), new tc1(fq6, (f61) null, 16), 2), new qh3(3, (f61) null, 2), 1), u58.a(fq6));
                return vs7.a;
            case h75.g /*15*/:
                o85.q(obj);
                a aVar = (a) ((uu) this.B);
                aVar.w();
                aVar.u(jn6.a);
                return vs7.a;
            case 16:
                o85.q(obj);
                ((sr2) this.B).b();
                return vs7.a;
            case 17:
                o85.q(obj);
                bs8 bs8 = (bs8) this.B;
                if (!(bs8.c.getValue() instanceof rr8)) {
                    ar7.H(u58.a(bs8), (e81) null, (r81) null, new gw6(bs8, (f61) null, 14), 3);
                }
                return vs7.a;
            default:
                o85.q(obj);
                return z65.Y((Application) this.B);
        }
        return vs7.a;
    }
}
