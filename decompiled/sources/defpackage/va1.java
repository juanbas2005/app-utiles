package defpackage;

import android.util.Base64;
import android.util.JsonReader;
import java.io.IOException;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: va1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class va1 {
    public static final ji8 a;

    static {
        am3 am3 = new am3();
        bx bxVar = bx.a;
        am3.a(ra1.class, bxVar);
        am3.a(cz.class, bxVar);
        hx hxVar = hx.a;
        am3.a(qa1.class, hxVar);
        am3.a(lz.class, hxVar);
        ex exVar = ex.a;
        am3.a(y91.class, exVar);
        am3.a(mz.class, exVar);
        fx fxVar = fx.a;
        am3.a(x91.class, fxVar);
        am3.a(nz.class, fxVar);
        xx xxVar = xx.a;
        am3.a(pa1.class, xxVar);
        am3.a(l00.class, xxVar);
        wx wxVar = wx.a;
        am3.a(oa1.class, wxVar);
        am3.a(k00.class, wxVar);
        gx gxVar = gx.a;
        am3.a(z91.class, gxVar);
        am3.a(pz.class, gxVar);
        rx rxVar = rx.a;
        am3.a(na1.class, rxVar);
        am3.a(rz.class, rxVar);
        ix ixVar = ix.a;
        am3.a(ha1.class, ixVar);
        am3.a(sz.class, ixVar);
        kx kxVar = kx.a;
        am3.a(fa1.class, kxVar);
        am3.a(tz.class, kxVar);
        nx nxVar = nx.a;
        am3.a(ea1.class, nxVar);
        am3.a(xz.class, nxVar);
        ox oxVar = ox.a;
        am3.a(da1.class, oxVar);
        am3.a(zz.class, oxVar);
        lx lxVar = lx.a;
        am3.a(ba1.class, lxVar);
        am3.a(vz.class, lxVar);
        zw zwVar = zw.a;
        am3.a(t91.class, zwVar);
        am3.a(fz.class, zwVar);
        yw ywVar = yw.a;
        am3.a(s91.class, ywVar);
        am3.a(gz.class, ywVar);
        mx mxVar = mx.a;
        am3.a(ca1.class, mxVar);
        am3.a(wz.class, mxVar);
        jx jxVar = jx.a;
        am3.a(aa1.class, jxVar);
        am3.a(uz.class, jxVar);
        ax axVar = ax.a;
        am3.a(u91.class, axVar);
        am3.a(hz.class, axVar);
        px pxVar = px.a;
        am3.a(ga1.class, pxVar);
        am3.a(b00.class, pxVar);
        qx qxVar = qx.a;
        am3.a(ia1.class, qxVar);
        am3.a(d00.class, qxVar);
        sx sxVar = sx.a;
        am3.a(ja1.class, sxVar);
        am3.a(e00.class, sxVar);
        vx vxVar = vx.a;
        am3.a(ma1.class, vxVar);
        am3.a(i00.class, vxVar);
        tx txVar = tx.a;
        am3.a(la1.class, txVar);
        am3.a(g00.class, txVar);
        ux uxVar = ux.a;
        am3.a(ka1.class, uxVar);
        am3.a(h00.class, uxVar);
        cx cxVar = cx.a;
        am3.a(w91.class, cxVar);
        am3.a(iz.class, cxVar);
        dx dxVar = dx.a;
        am3.a(v91.class, dxVar);
        am3.a(jz.class, dxVar);
        am3.d = true;
        a = new ji8(27, (Object) am3);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [yz, java.lang.Object] */
    public static zz a(JsonReader jsonReader) {
        ? obj = new Object();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1019779949:
                    if (nextName.equals("offset")) {
                        c = 0;
                        break;
                    }
                    break;
                case -887523944:
                    if (nextName.equals("symbol")) {
                        c = 1;
                        break;
                    }
                    break;
                case 3571:
                    if (nextName.equals("pc")) {
                        c = 2;
                        break;
                    }
                    break;
                case 3143036:
                    if (nextName.equals("file")) {
                        c = 3;
                        break;
                    }
                    break;
                case 2125650548:
                    if (nextName.equals("importance")) {
                        c = 4;
                        break;
                    }
                    break;
            }
            switch (c) {
                case b85.b:
                    obj.d = jsonReader.nextLong();
                    obj.f = (byte) (obj.f | 2);
                    break;
                case 1:
                    String nextString = jsonReader.nextString();
                    if (nextString != null) {
                        obj.b = nextString;
                        break;
                    } else {
                        ku4.j("Null symbol");
                        return null;
                    }
                case 2:
                    obj.a = jsonReader.nextLong();
                    obj.f = (byte) (obj.f | 1);
                    break;
                case 3:
                    obj.c = jsonReader.nextString();
                    break;
                case 4:
                    obj.e = jsonReader.nextInt();
                    obj.f = (byte) (obj.f | 4);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return obj.a();
    }

    public static hz b(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            if (nextName.equals("key")) {
                str = jsonReader.nextString();
                if (str == null) {
                    ku4.j("Null key");
                    return null;
                }
            } else if (!nextName.equals("value")) {
                jsonReader.skipValue();
            } else {
                str2 = jsonReader.nextString();
                if (str2 == null) {
                    ku4.j("Null value");
                    return null;
                }
            }
        }
        jsonReader.endObject();
        if (str != null && str2 != null) {
            return new hz(str, str2);
        }
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            sb.append(" key");
        }
        if (str2 == null) {
            sb.append(" value");
        }
        h.s(f21.i("Missing required properties:", sb));
        return null;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [ez, java.lang.Object] */
    public static fz c(JsonReader jsonReader) {
        ? obj = new Object();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1516200806:
                    if (nextName.equals("buildIdMappingForArch")) {
                        c = 0;
                        break;
                    }
                    break;
                case 110987:
                    if (nextName.equals("pid")) {
                        c = 1;
                        break;
                    }
                    break;
                case 111312:
                    if (nextName.equals("pss")) {
                        c = 2;
                        break;
                    }
                    break;
                case 113234:
                    if (nextName.equals("rss")) {
                        c = 3;
                        break;
                    }
                    break;
                case 55126294:
                    if (nextName.equals("timestamp")) {
                        c = 4;
                        break;
                    }
                    break;
                case 202325402:
                    if (nextName.equals("processName")) {
                        c = 5;
                        break;
                    }
                    break;
                case 722137681:
                    if (nextName.equals("reasonCode")) {
                        c = 6;
                        break;
                    }
                    break;
                case 723857505:
                    if (nextName.equals("traceFile")) {
                        c = 7;
                        break;
                    }
                    break;
                case 2125650548:
                    if (nextName.equals("importance")) {
                        c = 8;
                        break;
                    }
                    break;
            }
            switch (c) {
                case b85.b:
                    obj.i = d(jsonReader, new h(25));
                    break;
                case 1:
                    obj.a = jsonReader.nextInt();
                    obj.j = (byte) (obj.j | 1);
                    break;
                case 2:
                    obj.e = jsonReader.nextLong();
                    obj.j = (byte) (obj.j | 8);
                    break;
                case 3:
                    obj.f = jsonReader.nextLong();
                    obj.j = (byte) (obj.j | 16);
                    break;
                case 4:
                    obj.g = jsonReader.nextLong();
                    obj.j = (byte) (obj.j | 32);
                    break;
                case 5:
                    String nextString = jsonReader.nextString();
                    if (nextString != null) {
                        obj.b = nextString;
                        break;
                    } else {
                        ku4.j("Null processName");
                        return null;
                    }
                case 6:
                    obj.c = jsonReader.nextInt();
                    obj.j = (byte) (obj.j | 2);
                    break;
                case 7:
                    obj.h = jsonReader.nextString();
                    break;
                case 8:
                    obj.d = jsonReader.nextInt();
                    obj.j = (byte) (obj.j | 4);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return obj.a();
    }

    public static List d(JsonReader jsonReader, ua1 ua1) {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(ua1.a(jsonReader));
        }
        jsonReader.endArray();
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v0, resolved type: rz} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v0, resolved type: vz} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v0, resolved type: t91} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v0, resolved type: wz} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v1, resolved type: wz} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v1, resolved type: vz} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v2, resolved type: wz} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v2, resolved type: vz} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: rz} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v3, resolved type: wz} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v3, resolved type: vz} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v4, resolved type: vz} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v10, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v8, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v10, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r1v0, types: [qz, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v3, types: [c00, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r26v0 */
    /* JADX WARNING: type inference failed for: r26v1, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r22v1, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r22v4 */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x024e, code lost:
        r7 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0295, code lost:
        if (r5 != 0) goto L_0x029c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0297, code lost:
        r0.append(" name");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x029c, code lost:
        if (r6 != null) goto L_0x02a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x029e, code lost:
        r0.append(" code");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x02a5, code lost:
        if ((r4 & 1) != 0) goto L_0x02ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x02a7, code lost:
        r0.append(" address");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x02ac, code lost:
        defpackage.h.s(defpackage.f21.i("Missing required properties:", r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x02b3, code lost:
        return r19;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    public static rz e(JsonReader jsonReader) {
        char c;
        char c2;
        rz rzVar;
        char c3;
        wz wzVar;
        List list;
        char c4;
        List list2;
        t91 t91;
        List list3;
        char c5;
        String str;
        List list4;
        JsonReader jsonReader2 = jsonReader;
        ? obj = new Object();
        jsonReader2.beginObject();
        while (jsonReader2.hasNext()) {
            String nextName = jsonReader2.nextName();
            nextName.getClass();
            switch (nextName.hashCode()) {
                case -1335157162:
                    if (nextName.equals("device")) {
                        c = 0;
                        break;
                    }
                case -259312414:
                    if (nextName.equals("rollouts")) {
                        c = 1;
                        break;
                    }
                case 96801:
                    if (nextName.equals("app")) {
                        c = 2;
                        break;
                    }
                case 107332:
                    if (nextName.equals("log")) {
                        c = 3;
                        break;
                    }
                case 3575610:
                    if (nextName.equals("type")) {
                        c = 4;
                        break;
                    }
                case 55126294:
                    if (nextName.equals("timestamp")) {
                        c = 5;
                        break;
                    }
                default:
                    c = 65535;
                    break;
            }
            rz rzVar2 = null;
            switch (c) {
                case b85.b:
                    ? obj2 = new Object();
                    jsonReader2.beginObject();
                    while (jsonReader2.hasNext()) {
                        String nextName2 = jsonReader2.nextName();
                        nextName2.getClass();
                        switch (nextName2.hashCode()) {
                            case -1708606089:
                                if (nextName2.equals("batteryLevel")) {
                                    c2 = 0;
                                    break;
                                }
                            case -1455558134:
                                if (nextName2.equals("batteryVelocity")) {
                                    c2 = 1;
                                    break;
                                }
                            case -1439500848:
                                if (nextName2.equals("orientation")) {
                                    c2 = 2;
                                    break;
                                }
                            case 279795450:
                                if (nextName2.equals("diskUsed")) {
                                    c2 = 3;
                                    break;
                                }
                            case 976541947:
                                if (nextName2.equals("ramUsed")) {
                                    c2 = 4;
                                    break;
                                }
                            case 1516795582:
                                if (nextName2.equals("proximityOn")) {
                                    c2 = 5;
                                    break;
                                }
                            default:
                                c2 = 65535;
                                break;
                        }
                        switch (c2) {
                            case b85.b:
                                obj2.a = Double.valueOf(jsonReader2.nextDouble());
                                break;
                            case 1:
                                obj2.b = jsonReader2.nextInt();
                                obj2.g = (byte) (obj2.g | 1);
                                break;
                            case 2:
                                obj2.d = jsonReader2.nextInt();
                                obj2.g = (byte) (obj2.g | 4);
                                break;
                            case 3:
                                obj2.f = jsonReader2.nextLong();
                                obj2.g = (byte) (obj2.g | 16);
                                break;
                            case 4:
                                obj2.e = jsonReader2.nextLong();
                                obj2.g = (byte) (obj2.g | 8);
                                break;
                            case 5:
                                obj2.c = jsonReader2.nextBoolean();
                                obj2.g = (byte) (obj2.g | 2);
                                break;
                            default:
                                jsonReader2.skipValue();
                                break;
                        }
                    }
                    jsonReader2.endObject();
                    obj.d = obj2.a();
                    break;
                case 1:
                    jsonReader2.beginObject();
                    List list5 = null;
                    while (jsonReader2.hasNext()) {
                        String nextName3 = jsonReader2.nextName();
                        nextName3.getClass();
                        if (!nextName3.equals("assignments")) {
                            jsonReader2.skipValue();
                        } else {
                            list5 = d(jsonReader2, new h(27));
                            if (list5 == null) {
                                ku4.j("Null rolloutAssignments");
                                return null;
                            }
                        }
                    }
                    jsonReader2.endObject();
                    if (list5 != null) {
                        obj.f = new i00(list5);
                        break;
                    } else {
                        h.s("Missing required properties: rolloutAssignments");
                        return null;
                    }
                case 2:
                    jsonReader2.beginObject();
                    tz tzVar = null;
                    List list6 = null;
                    List list7 = null;
                    Boolean bool = null;
                    b00 b00 = null;
                    List list8 = null;
                    boolean z = false;
                    int i = 0;
                    while (true) {
                        rzVar = rzVar2;
                        if (!jsonReader2.hasNext()) {
                            jsonReader2.endObject();
                            if (z && tzVar != null) {
                                obj.c = new sz(tzVar, list6, list7, bool, b00, list8, i);
                                break;
                            } else {
                                StringBuilder sb = new StringBuilder();
                                if (tzVar == null) {
                                    sb.append(" execution");
                                }
                                if (!z) {
                                    sb.append(" uiOrientation");
                                }
                                h.s(f21.i("Missing required properties:", sb));
                                return rzVar;
                            }
                        } else {
                            String nextName4 = jsonReader2.nextName();
                            nextName4.getClass();
                            switch (nextName4.hashCode()) {
                                case -1405314732:
                                    if (nextName4.equals("appProcessDetails")) {
                                        c3 = 0;
                                        break;
                                    }
                                case -1332194002:
                                    if (nextName4.equals("background")) {
                                        c3 = 1;
                                        break;
                                    }
                                case -1090974952:
                                    if (nextName4.equals("execution")) {
                                        c3 = 2;
                                        break;
                                    }
                                case -80231855:
                                    if (nextName4.equals("internalKeys")) {
                                        c3 = 3;
                                        break;
                                    }
                                case 555169704:
                                    if (nextName4.equals("customAttributes")) {
                                        c3 = 4;
                                        break;
                                    }
                                case 928737948:
                                    if (nextName4.equals("uiOrientation")) {
                                        c3 = 5;
                                        break;
                                    }
                                case 1847730860:
                                    if (nextName4.equals("currentProcessDetails")) {
                                        c3 = 6;
                                        break;
                                    }
                                default:
                                    c3 = 65535;
                                    break;
                            }
                            switch (c3) {
                                case b85.b:
                                    ArrayList arrayList = new ArrayList();
                                    jsonReader2.beginArray();
                                    while (jsonReader2.hasNext()) {
                                        arrayList.add(g(jsonReader2));
                                    }
                                    jsonReader2.endArray();
                                    list8 = Collections.unmodifiableList(arrayList);
                                    break;
                                case 1:
                                    bool = Boolean.valueOf(jsonReader2.nextBoolean());
                                    break;
                                case 2:
                                    jsonReader2.beginObject();
                                    rz rzVar3 = rzVar;
                                    vz vzVar = rzVar3;
                                    t91 t912 = vzVar;
                                    wzVar = t912;
                                    list = wzVar;
                                    List list9 = rzVar3;
                                    t91 t913 = t912;
                                    while (jsonReader2.hasNext()) {
                                        String nextName5 = jsonReader2.nextName();
                                        nextName5.getClass();
                                        switch (nextName5.hashCode()) {
                                            case -1375141843:
                                                if (nextName5.equals("appExitInfo")) {
                                                    c4 = 0;
                                                    break;
                                                }
                                            case -1337936983:
                                                if (nextName5.equals("threads")) {
                                                    c4 = 1;
                                                    break;
                                                }
                                            case -902467928:
                                                if (nextName5.equals("signal")) {
                                                    c4 = 2;
                                                    break;
                                                }
                                            case 937615455:
                                                if (nextName5.equals("binaries")) {
                                                    c4 = 3;
                                                    break;
                                                }
                                            case 1481625679:
                                                if (nextName5.equals("exception")) {
                                                    c4 = 4;
                                                    break;
                                                }
                                            default:
                                                c4 = 65535;
                                                break;
                                        }
                                        switch (c4) {
                                            case b85.b:
                                                list2 = list;
                                                list3 = list9;
                                                t91 = c(jsonReader2);
                                                break;
                                            case 1:
                                                list2 = list;
                                                t91 = t913;
                                                list3 = d(jsonReader2, new h(28));
                                                break;
                                            case 2:
                                                jsonReader2.beginObject();
                                                long j = 0;
                                                byte b = 0;
                                                rz rzVar4 = rzVar;
                                                String str2 = rzVar4;
                                                String str3 = rzVar4;
                                                while (jsonReader2.hasNext()) {
                                                    String nextName6 = jsonReader2.nextName();
                                                    nextName6.getClass();
                                                    switch (nextName6.hashCode()) {
                                                        case -1147692044:
                                                            if (nextName6.equals("address")) {
                                                                c5 = 0;
                                                                break;
                                                            }
                                                        case 3059181:
                                                            if (nextName6.equals("code")) {
                                                                c5 = 1;
                                                                break;
                                                            }
                                                        case 3373707:
                                                            if (nextName6.equals("name")) {
                                                                c5 = 2;
                                                                break;
                                                            }
                                                        default:
                                                            c5 = 65535;
                                                            break;
                                                    }
                                                    switch (c5) {
                                                        case b85.b:
                                                            b = (byte) (b | 1);
                                                            j = jsonReader2.nextLong();
                                                            str = str3;
                                                            break;
                                                        case 1:
                                                            str2 = jsonReader2.nextString();
                                                            if (str2 != null) {
                                                                str = str3;
                                                                break;
                                                            } else {
                                                                ku4.j("Null code");
                                                                return rzVar;
                                                            }
                                                        case 2:
                                                            String nextString = jsonReader2.nextString();
                                                            if (nextString != null) {
                                                                str = nextString;
                                                                break;
                                                            } else {
                                                                ku4.j("Null name");
                                                                return rzVar;
                                                            }
                                                        default:
                                                            jsonReader2.skipValue();
                                                            str = str3;
                                                            break;
                                                    }
                                                    str3 = str;
                                                }
                                                jsonReader2.endObject();
                                                if (b == 1 && str3 != 0 && str2 != null) {
                                                    wzVar = new wz(j, str3, str2);
                                                    list2 = list;
                                                    t91 = t913;
                                                    list3 = list9;
                                                    break;
                                                } else {
                                                    StringBuilder sb2 = new StringBuilder();
                                                    break;
                                                }
                                                break;
                                            case 3:
                                                List d = d(jsonReader2, new h(29));
                                                list4 = d;
                                                if (d == null) {
                                                    ku4.j("Null binaries");
                                                    return rzVar;
                                                }
                                                break;
                                            case 4:
                                                vzVar = f(jsonReader2);
                                                list4 = list;
                                                break;
                                            default:
                                                jsonReader2.skipValue();
                                                list4 = list;
                                                break;
                                        }
                                        t91 = t913;
                                        list3 = list9;
                                        list2 = list4;
                                        list = list2;
                                        t913 = t91;
                                        list9 = list3;
                                    }
                                    jsonReader2.endObject();
                                    if (wzVar != null && list != 0) {
                                        tzVar = new tz(list9, vzVar, t913, wzVar, list);
                                        break;
                                    } else {
                                        StringBuilder sb3 = new StringBuilder();
                                        break;
                                    }
                                    break;
                                case 3:
                                    ArrayList arrayList2 = new ArrayList();
                                    jsonReader2.beginArray();
                                    while (jsonReader2.hasNext()) {
                                        arrayList2.add(b(jsonReader2));
                                    }
                                    jsonReader2.endArray();
                                    list7 = Collections.unmodifiableList(arrayList2);
                                    break;
                                case 4:
                                    ArrayList arrayList3 = new ArrayList();
                                    jsonReader2.beginArray();
                                    while (jsonReader2.hasNext()) {
                                        arrayList3.add(b(jsonReader2));
                                    }
                                    jsonReader2.endArray();
                                    list6 = Collections.unmodifiableList(arrayList3);
                                    break;
                                case 5:
                                    i = jsonReader2.nextInt();
                                    z = true;
                                    break;
                                case 6:
                                    b00 = g(jsonReader2);
                                    break;
                                default:
                                    jsonReader2.skipValue();
                                    break;
                            }
                            rzVar2 = rzVar;
                        }
                    }
                    StringBuilder sb32 = new StringBuilder();
                    if (wzVar == null) {
                        sb32.append(" signal");
                    }
                    if (list == 0) {
                        sb32.append(" binaries");
                    }
                    h.s(f21.i("Missing required properties:", sb32));
                    return rzVar;
                case 3:
                    jsonReader2.beginObject();
                    String str4 = null;
                    while (jsonReader2.hasNext()) {
                        if (jsonReader2.nextName().equals("content")) {
                            str4 = jsonReader2.nextString();
                            if (str4 == null) {
                                ku4.j("Null content");
                                return null;
                            }
                        } else {
                            jsonReader2.skipValue();
                        }
                    }
                    jsonReader2.endObject();
                    if (str4 != null) {
                        obj.e = new e00(str4);
                        break;
                    } else {
                        h.s("Missing required properties: content");
                        return null;
                    }
                case 4:
                    String nextString2 = jsonReader2.nextString();
                    if (nextString2 != null) {
                        obj.b = nextString2;
                        break;
                    } else {
                        ku4.j("Null type");
                        return null;
                    }
                case 5:
                    obj.a = jsonReader2.nextLong();
                    obj.g = (byte) (obj.g | 1);
                    break;
                default:
                    jsonReader2.skipValue();
                    break;
            }
        }
        jsonReader2.endObject();
        return obj.a();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004a, code lost:
        if (r3.equals("reason") == false) goto L_0x0021;
     */
    public static vz f(JsonReader jsonReader) {
        jsonReader.beginObject();
        byte b = 0;
        int i = 0;
        String str = null;
        String str2 = null;
        List list = null;
        vz vzVar = null;
        while (true) {
            char c = 1;
            if (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                nextName.getClass();
                switch (nextName.hashCode()) {
                    case -1266514778:
                        if (nextName.equals("frames")) {
                            c = 0;
                            break;
                        }
                    case -934964668:
                        break;
                    case 3575610:
                        if (nextName.equals("type")) {
                            c = 2;
                            break;
                        }
                    case 91997906:
                        if (nextName.equals("causedBy")) {
                            c = 3;
                            break;
                        }
                    case 581754413:
                        if (nextName.equals("overflowCount")) {
                            c = 4;
                            break;
                        }
                    default:
                        c = 65535;
                        break;
                }
                switch (c) {
                    case b85.b:
                        list = d(jsonReader, new ta1(0));
                        if (list != null) {
                            break;
                        } else {
                            ku4.j("Null frames");
                            return null;
                        }
                    case 1:
                        str2 = jsonReader.nextString();
                        break;
                    case 2:
                        str = jsonReader.nextString();
                        if (str != null) {
                            break;
                        } else {
                            ku4.j("Null type");
                            return null;
                        }
                    case 3:
                        vzVar = f(jsonReader);
                        break;
                    case 4:
                        i = jsonReader.nextInt();
                        b = (byte) (b | 1);
                        break;
                    default:
                        jsonReader.skipValue();
                        break;
                }
            } else {
                jsonReader.endObject();
                if (b == 1 && str != null && list != null) {
                    return new vz(str, str2, list, vzVar, i);
                }
                StringBuilder sb = new StringBuilder();
                if (str == null) {
                    sb.append(" type");
                }
                if (list == null) {
                    sb.append(" frames");
                }
                if ((b & 1) == 0) {
                    sb.append(" overflowCount");
                }
                h.s(f21.i("Missing required properties:", sb));
                return null;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [a00, java.lang.Object] */
    public static b00 g(JsonReader jsonReader) {
        ? obj = new Object();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c = 65535;
            switch (nextName.hashCode()) {
                case 110987:
                    if (nextName.equals("pid")) {
                        c = 0;
                        break;
                    }
                    break;
                case 202325402:
                    if (nextName.equals("processName")) {
                        c = 1;
                        break;
                    }
                    break;
                case 1694598382:
                    if (nextName.equals("defaultProcess")) {
                        c = 2;
                        break;
                    }
                    break;
                case 2125650548:
                    if (nextName.equals("importance")) {
                        c = 3;
                        break;
                    }
                    break;
            }
            switch (c) {
                case b85.b:
                    obj.b = jsonReader.nextInt();
                    obj.e = (byte) (obj.e | 1);
                    break;
                case 1:
                    String nextString = jsonReader.nextString();
                    if (nextString != null) {
                        obj.a = nextString;
                        break;
                    } else {
                        ku4.j("Null processName");
                        return null;
                    }
                case 2:
                    obj.d = jsonReader.nextBoolean();
                    obj.e = (byte) (obj.e | 4);
                    break;
                case 3:
                    obj.c = jsonReader.nextInt();
                    obj.e = (byte) (obj.e | 2);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return obj.a();
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [bz, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v21, types: [java.lang.Object, kz] */
    /* JADX WARNING: type inference failed for: r3v22, types: [java.lang.Object, oz] */
    /* JADX WARNING: type inference failed for: r3v26, types: [java.lang.Object, j00] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0256, code lost:
        r12 = true;
     */
    public static cz h(JsonReader jsonReader) {
        char c;
        char c2;
        char c3;
        boolean z;
        boolean z2;
        Charset charset = ra1.a;
        ? obj = new Object();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            switch (nextName.hashCode()) {
                case -2118372775:
                    if (nextName.equals("ndkPayload")) {
                        c = 0;
                        break;
                    }
                case -1962630338:
                    if (nextName.equals("sdkVersion")) {
                        c = 1;
                        break;
                    }
                case -1907185581:
                    if (nextName.equals("appQualitySessionId")) {
                        c = 2;
                        break;
                    }
                case -1375141843:
                    if (nextName.equals("appExitInfo")) {
                        c = 3;
                        break;
                    }
                case -911706486:
                    if (nextName.equals("buildVersion")) {
                        c = 4;
                        break;
                    }
                case -401988390:
                    if (nextName.equals("firebaseAuthenticationToken")) {
                        c = 5;
                        break;
                    }
                case 344431858:
                    if (nextName.equals("gmpAppId")) {
                        c = 6;
                        break;
                    }
                case 719853845:
                    if (nextName.equals("installationUuid")) {
                        c = 7;
                        break;
                    }
                case 1047652060:
                    if (nextName.equals("firebaseInstallationId")) {
                        c = 8;
                        break;
                    }
                case 1874684019:
                    if (nextName.equals("platform")) {
                        c = 9;
                        break;
                    }
                case 1975623094:
                    if (nextName.equals("displayVersion")) {
                        c = 10;
                        break;
                    }
                case 1984987798:
                    if (nextName.equals("session")) {
                        c = 11;
                        break;
                    }
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case b85.b:
                    jsonReader.beginObject();
                    List list = null;
                    String str = null;
                    while (jsonReader.hasNext()) {
                        String nextName2 = jsonReader.nextName();
                        nextName2.getClass();
                        if (!nextName2.equals("files")) {
                            if (!nextName2.equals("orgId")) {
                                jsonReader.skipValue();
                            } else {
                                str = jsonReader.nextString();
                            }
                            JsonReader jsonReader2 = jsonReader;
                        } else {
                            list = d(jsonReader, new h(26));
                            if (list == null) {
                                ku4.j("Null files");
                                return null;
                            }
                        }
                    }
                    jsonReader.endObject();
                    if (list != null) {
                        obj.k = new iz(list, str);
                        continue;
                    } else {
                        h.s("Missing required properties: files");
                        return null;
                    }
                case 1:
                    String nextString = jsonReader.nextString();
                    if (nextString != null) {
                        obj.a = nextString;
                        break;
                    } else {
                        ku4.j("Null sdkVersion");
                        return null;
                    }
                case 2:
                    obj.g = jsonReader.nextString();
                    break;
                case 3:
                    obj.l = c(jsonReader);
                    break;
                case 4:
                    String nextString2 = jsonReader.nextString();
                    if (nextString2 != null) {
                        obj.h = nextString2;
                        break;
                    } else {
                        ku4.j("Null buildVersion");
                        return null;
                    }
                case 5:
                    obj.f = jsonReader.nextString();
                    break;
                case 6:
                    String nextString3 = jsonReader.nextString();
                    if (nextString3 != null) {
                        obj.b = nextString3;
                        break;
                    } else {
                        ku4.j("Null gmpAppId");
                        return null;
                    }
                case 7:
                    String nextString4 = jsonReader.nextString();
                    if (nextString4 != null) {
                        obj.d = nextString4;
                        break;
                    } else {
                        ku4.j("Null installationUuid");
                        return null;
                    }
                case 8:
                    obj.e = jsonReader.nextString();
                    break;
                case 9:
                    obj.c = jsonReader.nextInt();
                    obj.m = (byte) (obj.m | 1);
                    break;
                case 10:
                    String nextString5 = jsonReader.nextString();
                    if (nextString5 != null) {
                        obj.i = nextString5;
                        break;
                    } else {
                        ku4.j("Null displayVersion");
                        return null;
                    }
                case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER:
                    ? obj2 = new Object();
                    obj2.f = false;
                    obj2.m = (byte) (obj2.m | 2);
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String nextName3 = jsonReader.nextName();
                        nextName3.getClass();
                        switch (nextName3.hashCode()) {
                            case -2128794476:
                                if (nextName3.equals("startedAt")) {
                                    c2 = 0;
                                    break;
                                }
                            case -1907185581:
                                if (nextName3.equals("appQualitySessionId")) {
                                    c2 = 1;
                                    break;
                                }
                            case -1618432855:
                                if (nextName3.equals("identifier")) {
                                    c2 = 2;
                                    break;
                                }
                            case -1606742899:
                                if (nextName3.equals("endedAt")) {
                                    c2 = 3;
                                    break;
                                }
                            case -1335157162:
                                if (nextName3.equals("device")) {
                                    c2 = 4;
                                    break;
                                }
                            case -1291329255:
                                if (nextName3.equals("events")) {
                                    c2 = 5;
                                    break;
                                }
                            case 3556:
                                if (nextName3.equals("os")) {
                                    c2 = 6;
                                    break;
                                }
                            case 96801:
                                if (nextName3.equals("app")) {
                                    c2 = 7;
                                    break;
                                }
                            case 3599307:
                                if (nextName3.equals("user")) {
                                    c2 = 8;
                                    break;
                                }
                            case 286956243:
                                if (nextName3.equals("generator")) {
                                    c2 = 9;
                                    break;
                                }
                            case 1025385094:
                                if (nextName3.equals("crashed")) {
                                    c2 = 10;
                                    break;
                                }
                            case 2047016109:
                                if (nextName3.equals("generatorType")) {
                                    c2 = 11;
                                    break;
                                }
                            default:
                                c2 = 65535;
                                break;
                        }
                        switch (c2) {
                            case b85.b:
                                obj2.d = jsonReader.nextLong();
                                obj2.m = (byte) (obj2.m | 1);
                                break;
                            case 1:
                                obj2.c = jsonReader.nextString();
                                break;
                            case 2:
                                obj2.b = new String(Base64.decode(jsonReader.nextString(), 2), ra1.a);
                                break;
                            case 3:
                                obj2.e = Long.valueOf(jsonReader.nextLong());
                                break;
                            case 4:
                                ? obj3 = new Object();
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String nextName4 = jsonReader.nextName();
                                    nextName4.getClass();
                                    switch (nextName4.hashCode()) {
                                        case -1981332476:
                                            if (nextName4.equals("simulator")) {
                                                c3 = 0;
                                                break;
                                            }
                                        case -1969347631:
                                            if (nextName4.equals("manufacturer")) {
                                                c3 = 1;
                                                break;
                                            }
                                        case 112670:
                                            if (nextName4.equals("ram")) {
                                                c3 = 2;
                                                break;
                                            }
                                        case 3002454:
                                            if (nextName4.equals("arch")) {
                                                c3 = 3;
                                                break;
                                            }
                                        case 81784169:
                                            if (nextName4.equals("diskSpace")) {
                                                c3 = 4;
                                                break;
                                            }
                                        case 94848180:
                                            if (nextName4.equals("cores")) {
                                                c3 = 5;
                                                break;
                                            }
                                        case 104069929:
                                            if (nextName4.equals("model")) {
                                                c3 = 6;
                                                break;
                                            }
                                        case 109757585:
                                            if (nextName4.equals("state")) {
                                                c3 = 7;
                                                break;
                                            }
                                        case 2078953423:
                                            if (nextName4.equals("modelClass")) {
                                                c3 = 8;
                                                break;
                                            }
                                        default:
                                            c3 = 65535;
                                            break;
                                    }
                                    switch (c3) {
                                        case b85.b:
                                            obj3.f = jsonReader.nextBoolean();
                                            obj3.j = (byte) (obj3.j | 16);
                                            break;
                                        case 1:
                                            String nextString6 = jsonReader.nextString();
                                            if (nextString6 != null) {
                                                obj3.h = nextString6;
                                                break;
                                            } else {
                                                ku4.j("Null manufacturer");
                                                return null;
                                            }
                                        case 2:
                                            obj3.d = jsonReader.nextLong();
                                            obj3.j = (byte) (obj3.j | 4);
                                            break;
                                        case 3:
                                            obj3.a = jsonReader.nextInt();
                                            obj3.j = (byte) (obj3.j | 1);
                                            break;
                                        case 4:
                                            obj3.e = jsonReader.nextLong();
                                            obj3.j = (byte) (obj3.j | 8);
                                            break;
                                        case 5:
                                            obj3.c = jsonReader.nextInt();
                                            obj3.j = (byte) (obj3.j | 2);
                                            break;
                                        case 6:
                                            String nextString7 = jsonReader.nextString();
                                            if (nextString7 != null) {
                                                obj3.b = nextString7;
                                                break;
                                            } else {
                                                ku4.j("Null model");
                                                return null;
                                            }
                                        case 7:
                                            obj3.g = jsonReader.nextInt();
                                            obj3.j = (byte) (obj3.j | 32);
                                            break;
                                        case 8:
                                            String nextString8 = jsonReader.nextString();
                                            if (nextString8 != null) {
                                                obj3.i = nextString8;
                                                break;
                                            } else {
                                                ku4.j("Null modelClass");
                                                return null;
                                            }
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                obj2.j = obj3.a();
                                break;
                            case 5:
                                ArrayList arrayList = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList.add(e(jsonReader));
                                }
                                jsonReader.endArray();
                                obj2.k = Collections.unmodifiableList(arrayList);
                                break;
                            case 6:
                                ? obj4 = new Object();
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String nextName5 = jsonReader.nextName();
                                    nextName5.getClass();
                                    switch (nextName5.hashCode()) {
                                        case -911706486:
                                            if (nextName5.equals("buildVersion")) {
                                                z = false;
                                                break;
                                            }
                                        case -293026577:
                                            if (nextName5.equals("jailbroken")) {
                                                z = true;
                                                break;
                                            }
                                        case 351608024:
                                            if (nextName5.equals("version")) {
                                                z = true;
                                                break;
                                            }
                                        case 1874684019:
                                            if (nextName5.equals("platform")) {
                                                z = true;
                                                break;
                                            }
                                        default:
                                            z = true;
                                            break;
                                    }
                                    switch (z) {
                                        case b85.b:
                                            String nextString9 = jsonReader.nextString();
                                            if (nextString9 != null) {
                                                obj4.c = nextString9;
                                                break;
                                            } else {
                                                ku4.j("Null buildVersion");
                                                return null;
                                            }
                                        case true:
                                            obj4.d = jsonReader.nextBoolean();
                                            obj4.e = (byte) (obj4.e | 2);
                                            break;
                                        case true:
                                            String nextString10 = jsonReader.nextString();
                                            if (nextString10 != null) {
                                                obj4.b = nextString10;
                                                break;
                                            } else {
                                                ku4.j("Null version");
                                                return null;
                                            }
                                        case true:
                                            obj4.a = jsonReader.nextInt();
                                            obj4.e = (byte) (obj4.e | 1);
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                obj2.i = obj4.a();
                                break;
                            case 7:
                                jsonReader.beginObject();
                                String str2 = null;
                                String str3 = null;
                                String str4 = null;
                                String str5 = null;
                                String str6 = null;
                                String str7 = "Null identifier";
                                String str8 = null;
                                while (jsonReader.hasNext()) {
                                    String nextName6 = jsonReader.nextName();
                                    nextName6.getClass();
                                    switch (nextName6.hashCode()) {
                                        case -1618432855:
                                            if (nextName6.equals("identifier")) {
                                                z2 = false;
                                                break;
                                            }
                                        case -519438642:
                                            if (nextName6.equals("developmentPlatform")) {
                                                z2 = true;
                                                break;
                                            }
                                        case 213652010:
                                            if (nextName6.equals("developmentPlatformVersion")) {
                                                z2 = true;
                                                break;
                                            }
                                        case 351608024:
                                            if (nextName6.equals("version")) {
                                                z2 = true;
                                                break;
                                            }
                                        case 719853845:
                                            if (nextName6.equals("installationUuid")) {
                                                z2 = true;
                                                break;
                                            }
                                        case 1975623094:
                                            if (nextName6.equals("displayVersion")) {
                                                z2 = true;
                                                break;
                                            }
                                        default:
                                            z2 = true;
                                            break;
                                    }
                                    switch (z2) {
                                        case b85.b:
                                            str8 = jsonReader.nextString();
                                            if (str8 != null) {
                                                break;
                                            } else {
                                                ku4.j(str7);
                                                return null;
                                            }
                                        case true:
                                            str5 = jsonReader.nextString();
                                            break;
                                        case true:
                                            str6 = jsonReader.nextString();
                                            break;
                                        case true:
                                            str2 = jsonReader.nextString();
                                            if (str2 != null) {
                                                break;
                                            } else {
                                                ku4.j("Null version");
                                                return null;
                                            }
                                        case true:
                                            str4 = jsonReader.nextString();
                                            break;
                                        case true:
                                            str3 = jsonReader.nextString();
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                if (str8 != null && str2 != null) {
                                    obj2.g = new mz(str8, str2, str3, str4, str5, str6);
                                    break;
                                } else {
                                    StringBuilder sb = new StringBuilder();
                                    if (str8 == null) {
                                        sb.append(" identifier");
                                    }
                                    if (str2 == null) {
                                        sb.append(" version");
                                    }
                                    h.s(f21.i("Missing required properties:", sb));
                                    return null;
                                }
                                break;
                            case 8:
                                jsonReader.beginObject();
                                String str9 = null;
                                while (jsonReader.hasNext()) {
                                    if (jsonReader.nextName().equals("identifier")) {
                                        str9 = jsonReader.nextString();
                                        if (str9 == null) {
                                            ku4.j("Null identifier");
                                            return null;
                                        }
                                    } else {
                                        jsonReader.skipValue();
                                    }
                                }
                                jsonReader.endObject();
                                if (str9 != null) {
                                    obj2.h = new l00(str9);
                                    break;
                                } else {
                                    h.s("Missing required properties: identifier");
                                    return null;
                                }
                            case 9:
                                String nextString11 = jsonReader.nextString();
                                if (nextString11 != null) {
                                    obj2.a = nextString11;
                                    break;
                                } else {
                                    ku4.j("Null generator");
                                    return null;
                                }
                            case 10:
                                obj2.f = jsonReader.nextBoolean();
                                obj2.m = (byte) (obj2.m | 2);
                                break;
                            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER:
                                obj2.l = jsonReader.nextInt();
                                obj2.m = (byte) (obj2.m | 4);
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    obj.j = obj2.a();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
            JsonReader jsonReader3 = jsonReader;
        }
        jsonReader.endObject();
        return obj.a();
    }

    public static cz i(String str) {
        JsonReader jsonReader;
        try {
            jsonReader = new JsonReader(new StringReader(str));
            cz h = h(jsonReader);
            jsonReader.close();
            return h;
        } catch (IllegalStateException e) {
            throw new IOException(e);
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }
}
