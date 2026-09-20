package defpackage;

import android.graphics.Bitmap;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.datastore.core.CorruptionException;
import com.google.firebase.sessions.SessionData;
import com.google.firebase.sessions.SessionDetails;
import com.google.firebase.sessions.Time;
import cu.lestebang.utiletecsa.feature.settings.service.CallAlertActivity;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlinx.serialization.json.JsonElement;

/* renamed from: gg0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class gg0 implements vr2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ Object x;

    public /* synthetic */ gg0(h22 h22, jz0 jz0) {
        this.w = 22;
        this.x = h22;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v1, resolved type: l57} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v2, resolved type: rd2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v17, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v0, resolved type: h06} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v6, resolved type: java.util.LinkedHashMap} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x04fb  */
    public final Object y(Object obj) {
        String str;
        float f;
        boolean z;
        rd2 rd2;
        u90 u90;
        int i;
        l83 l83;
        long j;
        od odVar;
        hg hgVar;
        tk0 tk0;
        wr0 wr0;
        float f2;
        float f3;
        long L;
        l83 l832;
        ll6 descriptor;
        String str2;
        String str3;
        int length;
        int i2;
        String str4;
        q52 q52;
        Object value;
        is7 is7;
        mo2 mo2;
        Map map;
        Object obj2 = obj;
        int i3 = this.w;
        int i4 = 0;
        List list = null;
        boolean z2 = true;
        Object obj3 = this.x;
        switch (i3) {
            case b85.b:
                af0 af0 = (af0) obj3;
                Throwable th = (Throwable) obj2;
                if (th != null && af0._closedCause == null) {
                    af0.a(th);
                }
                return vs7.a;
            case 1:
                if (obj2 == ((w0) obj3)) {
                    return "(this Collection)";
                }
                return String.valueOf(obj2);
            case 2:
                an3 an3 = (an3) obj3;
                JsonElement jsonElement = (JsonElement) obj2;
                jsonElement.getClass();
                an3.L((String) dt0.G0(an3.a), jsonElement);
                return vs7.a;
            case 3:
                Object obj4 = (wf5) obj3;
                Map.Entry entry = (Map.Entry) obj2;
                entry.getClass();
                StringBuilder sb = new StringBuilder();
                Object key = entry.getKey();
                String str5 = "(this Map)";
                if (key == obj4) {
                    str = str5;
                } else {
                    str = String.valueOf(key);
                }
                sb.append(str);
                sb.append('=');
                Object value2 = entry.getValue();
                if (value2 != obj4) {
                    str5 = String.valueOf(value2);
                }
                sb.append(str5);
                return sb.toString();
            case 4:
                r9 r9Var = (r9) obj3;
                r9Var.M.H((wc7) obj2, h49.w(r9Var, ye.b));
                return vs7.a;
            case 5:
                ((ok6) obj2).f(vj6.a, new uj6(cy2.w, ((x35) obj3).a(), tj6.x, true));
                return vs7.a;
            case 6:
                LinkedHashMap linkedHashMap = (LinkedHashMap) obj3;
                h34 h34 = (h34) obj2;
                h34.getClass();
                Iterator it = uy7.I.iterator();
                while (it.hasNext()) {
                    uy7 uy7 = (uy7) it.next();
                    List list2 = (List) linkedHashMap.get(uy7);
                    if (list2 == null) {
                        list2 = a42.w;
                    }
                    if (!list2.isEmpty()) {
                        h34.O(h34, uy7.name(), new fw0(1073448769, new xa7(1, (Object) uy7), true));
                        h34.P(list2.size(), new e3(2, (Object) new j5(12), (Object) list2), new y20(0, list2), new fw0(802480018, new z20(0, list2), true));
                    }
                }
                return vs7.a;
            case 7:
                return Boolean.valueOf(sg3.e(((cu4) obj2).b, ((cu4) obj3).b));
            case 8:
                kw1 kw1 = (kw1) obj2;
                return new d9(4, (p60) obj3);
            case 9:
                kw1 kw12 = (kw1) obj2;
                return new d9(5, (ek7) obj3);
            case 10:
                sa0 sa0 = (sa0) obj3;
                ch0 ch0 = (ch0) obj2;
                if (ch0.b() * sa0.N < 0.0f || wu6.c(ch0.w.e()) <= 0.0f) {
                    return ch0.a(new j5(16));
                }
                if (lx1.b(sa0.N, 0.0f)) {
                    f = 1.0f;
                } else {
                    f = (float) Math.ceil((double) (ch0.b() * sa0.N));
                }
                float min = Math.min(f, (float) Math.ceil((double) (wu6.c(ch0.w.e()) / 2.0f)));
                float f4 = min / 2.0f;
                long floatToRawIntBits = (((long) Float.floatToRawIntBits(f4)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L);
                long floatToRawIntBits2 = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (ch0.w.e() >> 32)) - min)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (ch0.w.e() & 4294967295L)) - min)) & 4294967295L);
                float f5 = min * 2.0f;
                if (f5 > wu6.c(ch0.w.e())) {
                    z = true;
                } else {
                    z = false;
                }
                n85 a = sa0.P.a(ch0.w.e(), ch0.w.getLayoutDirection(), ch0);
                if (a instanceof k85) {
                    ky6 ky6 = sa0.O;
                    k85 k85 = (k85) a;
                    eh ehVar = k85.l;
                    if (z) {
                        return ch0.a(new m0(11, k85, ky6));
                    }
                    if (ky6 != null) {
                        u90 = new u90(jt0.b(1.0f, ky6.a), 5);
                        i = 1;
                    } else {
                        i = 0;
                        u90 = null;
                    }
                    ly5 d = ehVar.d();
                    float f6 = d.b;
                    float f7 = d.a;
                    if (sa0.M == null) {
                        sa0.M = new la0();
                    }
                    la0 la0 = sa0.M;
                    la0.getClass();
                    eh ehVar2 = la0.d;
                    if (ehVar2 == null) {
                        ehVar2 = gh.a();
                        la0.d = ehVar2;
                    }
                    ehVar2.g();
                    eh.b(ehVar2, d);
                    ehVar2.f(ehVar2, ehVar, 0);
                    Object obj5 = new Object();
                    u90 u902 = u90;
                    eh ehVar3 = ehVar2;
                    long ceil = (((long) ((int) ((float) Math.ceil((double) (d.c - f7))))) << 32) | (((long) ((int) ((float) Math.ceil((double) (d.d - f6))))) & 4294967295L);
                    la0 la02 = sa0.M;
                    la02.getClass();
                    hg hgVar2 = la02.a;
                    od odVar2 = la02.b;
                    if (hgVar2 != null) {
                        l83 = new l83(hgVar2.a());
                    } else {
                        l83 = null;
                    }
                    if (l83 == null || l83.a != 0) {
                        if (hgVar2 != null) {
                            l832 = new l83(hgVar2.a());
                        } else {
                            l832 = null;
                        }
                        if (l832 == null || i != l832.a) {
                            z2 = false;
                        }
                    }
                    if (hgVar2 == null || odVar2 == null) {
                        j = 4294967295L;
                    } else {
                        float intBitsToFloat = Float.intBitsToFloat((int) (ch0.w.e() >> 32));
                        Bitmap bitmap = hgVar2.a;
                        j = 4294967295L;
                        if (intBitsToFloat <= ((float) bitmap.getWidth())) {
                            hg hgVar3 = hgVar2;
                            od odVar3 = odVar2;
                            if (Float.intBitsToFloat((int) (ch0.w.e() & 4294967295L)) <= ((float) bitmap.getHeight()) && z2) {
                                hgVar = hgVar3;
                                odVar = odVar3;
                                tk0 = la02.c;
                                if (tk0 == null) {
                                    tk0 = new tk0();
                                    la02.c = tk0;
                                }
                                wr0 = tk0.x;
                                sk0 sk0 = tk0.w;
                                long O = pv8.O(ceil);
                                ey3 layoutDirection = ch0.w.getLayoutDirection();
                                ky6 ky62 = ky6;
                                tp1 tp1 = sk0.a;
                                tk0 tk02 = tk0;
                                ey3 ey3 = sk0.b;
                                eh ehVar4 = ehVar3;
                                qk0 qk0 = sk0.c;
                                h06 h06 = obj5;
                                hg hgVar4 = hgVar;
                                long j2 = sk0.d;
                                sk0.a = ch0;
                                sk0.b = layoutDirection;
                                sk0.c = odVar;
                                sk0.d = O;
                                odVar.h();
                                hz1.f0(tk02, jt0.b, 0, O, 0.0f, 58);
                                f2 = -f7;
                                f3 = -f6;
                                ((ji8) wr0.x).F(f2, f3);
                                ky6 ky63 = ky62;
                                hz1.U(tk02, k85.l, ky63, 0.0f, new l57(f5, 0.0f, 0, 0, 30), (lt0) null, 52);
                                float intBitsToFloat2 = (Float.intBitsToFloat((int) (tk02.e() >> 32)) + 1.0f) / Float.intBitsToFloat((int) (tk02.e() >> 32));
                                float intBitsToFloat3 = (Float.intBitsToFloat((int) (tk02.e() & j)) + 1.0f) / Float.intBitsToFloat((int) (tk02.e() & j));
                                long v0 = tk02.v0();
                                long j3 = j2;
                                L = wr0.L();
                                wr0.D().h();
                                od odVar4 = odVar;
                                ((ji8) wr0.x).E(intBitsToFloat2, intBitsToFloat3, v0);
                                hz1.U(tk02, ehVar4, ky63, 0.0f, (l57) null, (lt0) null, 28);
                                wr0.D().p();
                                wr0.e0(L);
                                ((ji8) wr0.x).F(-f2, -f3);
                                odVar4.p();
                                sk0.a = tp1;
                                sk0.b = ey3;
                                sk0.c = qk0;
                                sk0.d = j3;
                                hg hgVar5 = hgVar4;
                                hgVar5.a.prepareToDraw();
                                h06.w = hgVar5;
                                return ch0.a(new ra0(d, h06, ceil, u902));
                            }
                        }
                    }
                    hgVar = gl0.G((int) (ceil >> 32), (int) (ceil & j), i);
                    la02.a = hgVar;
                    odVar = gr8.d(hgVar);
                    la02.b = odVar;
                    tk0 = la02.c;
                    if (tk0 == null) {
                    }
                    wr0 = tk0.x;
                    sk0 sk02 = tk0.w;
                    long O2 = pv8.O(ceil);
                    ey3 layoutDirection2 = ch0.w.getLayoutDirection();
                    ky6 ky622 = ky6;
                    tp1 tp12 = sk02.a;
                    tk0 tk022 = tk0;
                    ey3 ey32 = sk02.b;
                    eh ehVar42 = ehVar3;
                    qk0 qk02 = sk02.c;
                    h06 h062 = obj5;
                    hg hgVar42 = hgVar;
                    long j22 = sk02.d;
                    sk02.a = ch0;
                    sk02.b = layoutDirection2;
                    sk02.c = odVar;
                    sk02.d = O2;
                    odVar.h();
                    hz1.f0(tk022, jt0.b, 0, O2, 0.0f, 58);
                    f2 = -f7;
                    f3 = -f6;
                    ((ji8) wr0.x).F(f2, f3);
                    try {
                        ky6 ky632 = ky622;
                        hz1.U(tk022, k85.l, ky632, 0.0f, new l57(f5, 0.0f, 0, 0, 30), (lt0) null, 52);
                        float intBitsToFloat22 = (Float.intBitsToFloat((int) (tk022.e() >> 32)) + 1.0f) / Float.intBitsToFloat((int) (tk022.e() >> 32));
                        float intBitsToFloat32 = (Float.intBitsToFloat((int) (tk022.e() & j)) + 1.0f) / Float.intBitsToFloat((int) (tk022.e() & j));
                        long v02 = tk022.v0();
                        long j32 = j22;
                        L = wr0.L();
                        wr0.D().h();
                        od odVar42 = odVar;
                        ((ji8) wr0.x).E(intBitsToFloat22, intBitsToFloat32, v02);
                        hz1.U(tk022, ehVar42, ky632, 0.0f, (l57) null, (lt0) null, 28);
                        wr0.D().p();
                        wr0.e0(L);
                        ((ji8) wr0.x).F(-f2, -f3);
                        odVar42.p();
                        sk02.a = tp12;
                        sk02.b = ey32;
                        sk02.c = qk02;
                        sk02.d = j32;
                        hg hgVar52 = hgVar42;
                        hgVar52.a.prepareToDraw();
                        h062.w = hgVar52;
                        return ch0.a(new ra0(d, h062, ceil, u902));
                    } catch (Throwable th2) {
                        ((ji8) wr0.x).F(-f2, -f3);
                        throw th2;
                    }
                } else if (a instanceof m85) {
                    ky6 ky64 = sa0.O;
                    l96 l96 = ((m85) a).l;
                    if (p25.t(l96)) {
                        return ch0.a(new qa0(z, ky64, l96.e, f4, min, floatToRawIntBits, floatToRawIntBits2, new l57(min, 0.0f, 0, 0, 30)));
                    }
                    ky6 ky65 = ky64;
                    boolean z3 = z;
                    if (sa0.M == null) {
                        sa0.M = new la0();
                    }
                    la0 la03 = sa0.M;
                    la03.getClass();
                    eh ehVar5 = la03.d;
                    if (ehVar5 == null) {
                        ehVar5 = gh.a();
                        la03.d = ehVar5;
                    }
                    ehVar5.g();
                    eh.c(ehVar5, l96);
                    if (!z3) {
                        eh a2 = gh.a();
                        eh.c(a2, new l96(min, min, l96.b() - min, l96.a() - min, rg3.A(min, l96.e), rg3.A(min, l96.f), rg3.A(min, l96.g), rg3.A(min, l96.h)));
                        ehVar5.f(ehVar5, a2, 0);
                    }
                    return ch0.a(new m0(10, ehVar5, ky65));
                } else {
                    boolean z4 = z;
                    if (a instanceof l85) {
                        ky6 ky66 = sa0.O;
                        if (z4) {
                            floatToRawIntBits = 0;
                        }
                        long j4 = floatToRawIntBits;
                        if (z4) {
                            floatToRawIntBits2 = ch0.w.e();
                        }
                        long j5 = floatToRawIntBits2;
                        if (z4) {
                            rd2 = rd2.a;
                        } else {
                            rd2 = new l57(min, 0.0f, 0, 0, 30);
                        }
                        return ch0.a(new ma0(ky66, j4, j5, rd2));
                    }
                    h.c();
                    return null;
                }
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                y53 y53 = (y53) obj2;
                y53.getClass();
                y53.c.y0((y32) ((am6) obj3).z);
                return vs7.a;
            case 12:
                CallAlertActivity callAlertActivity = (CallAlertActivity) obj3;
                float floatValue = ((Float) obj2).floatValue();
                WeakReference weakReference = CallAlertActivity.R;
                Window window = callAlertActivity.getWindow();
                WindowManager.LayoutParams attributes = callAlertActivity.getWindow().getAttributes();
                int i5 = attributes.y - ((int) floatValue);
                if (i5 >= 0) {
                    i4 = i5;
                }
                attributes.y = i4;
                window.setAttributes(attributes);
                return vs7.a;
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                StringBuilder sb2 = (StringBuilder) obj3;
                Byte b = (Byte) obj2;
                byte byteValue = b.byteValue();
                if (byteValue == 32) {
                    sb2.append("%20");
                } else if (ss0.a.contains(b) || ss0.c.contains(b)) {
                    sb2.append((char) byteValue);
                } else {
                    sb2.append(ss0.g(byteValue));
                }
                return vs7.a;
            case 14:
                i68 i68 = (i68) obj3;
                View view = ((j68) ((qy0) obj2).g0(o23.a)).a;
                while (view != null) {
                    Object tag = view.getTag(i68.e());
                    if (tag != null) {
                        return tag;
                    }
                    ViewParent k = z85.k(view);
                    if (k instanceof View) {
                        view = (View) k;
                    } else {
                        view = null;
                    }
                }
                return null;
            case h75.g /*15*/:
                nq0 nq0 = (nq0) obj2;
                nq0.getClass();
                zr3 zr3 = ((e61) obj3).b;
                if (!(zr3 == null || (descriptor = zr3.getDescriptor()) == null)) {
                    list = descriptor.getAnnotations();
                }
                if (list == null) {
                    list = a42.w;
                }
                nq0.b = list;
                return vs7.a;
            case 16:
                rb1 rb1 = (rb1) obj3;
                GetCredentialException getCredentialException = (GetCredentialException) obj2;
                getCredentialException.getClass();
                rb1.d().execute(new pb1(rb1, getCredentialException, 1));
                return vs7.a;
            case 17:
                jf1 jf1 = (jf1) obj3;
                z97 z97 = jf1.j;
                Throwable th3 = (Throwable) obj2;
                if (th3 != null) {
                    jf1.h.G(new be2(th3));
                }
                if (z97.a()) {
                    ((jd2) z97.getValue()).close();
                }
                return vs7.a;
            case 18:
                mk6.c((ok6) obj2, (String) ((yb5) obj3).w);
                return vs7.a;
            case 19:
                Throwable th4 = (Throwable) obj2;
                ((fl3) obj3).v0();
                return vs7.a;
            case 20:
                IOException iOException = (IOException) obj2;
                ((rv1) obj3).G = true;
                return vs7.a;
            case 21:
                ny1 ny1 = (ny1) obj3;
                iv2 iv2 = (iv2) obj2;
                if (iv2 instanceof yy1) {
                    z2 = ((Boolean) ny1.y(iv2)).booleanValue();
                }
                return Boolean.valueOf(z2);
            case 22:
                h22 h22 = (h22) obj2;
                if (((h22) obj3) == h22) {
                    str2 = " > ";
                } else {
                    str2 = "   ";
                }
                if (h22 instanceof ou0) {
                    ou0 ou0 = (ou0) h22;
                    length = ou0.a.x.length();
                    i2 = ou0.b;
                    str4 = "CommitTextCommand(text.length=";
                } else if (h22 instanceof un6) {
                    un6 un6 = (un6) h22;
                    length = un6.a.x.length();
                    i2 = un6.b;
                    str4 = "SetComposingTextCommand(text.length=";
                } else {
                    if (h22 instanceof tn6) {
                        str3 = ((tn6) h22).toString();
                    } else if (h22 instanceof np1) {
                        str3 = ((np1) h22).toString();
                    } else if (h22 instanceof op1) {
                        str3 = ((op1) h22).toString();
                    } else if (h22 instanceof vn6) {
                        str3 = ((vn6) h22).toString();
                    } else if (h22 instanceof ie2) {
                        str3 = "FinishComposingTextCommand()";
                    } else if (h22 instanceof lp1) {
                        str3 = "DeleteAllCommand()";
                    } else {
                        String A = b26.a.b(h22.getClass()).A();
                        if (A == null) {
                            A = "{anonymous EditCommand}";
                        }
                        str3 = "Unknown EditCommand: ".concat(A);
                    }
                    return str2.concat(str3);
                }
                str3 = pb4.k(str4, length, ", newCursorPosition=", i2, ")");
                return str2.concat(str3);
            case 23:
                r52 r52 = (r52) obj3;
                Object obj6 = r52.a.get(b26.a.b(obj2.getClass()));
                if (obj6 instanceof q52) {
                    q52 = (q52) obj6;
                } else {
                    q52 = null;
                }
                r52.b.get(obj2);
                if (q52 != null) {
                    return new cu4(obj2, q52.b.y(obj2), (Map) q52.c.y(obj2), q52.d);
                }
                Objects.toString(obj2);
                h.s("Unknown screen ".concat(String.valueOf(obj2)));
                return null;
            case 24:
                CorruptionException corruptionException = (CorruptionException) obj2;
                corruptionException.getClass();
                Log.w("FirebaseSessions", "CorruptionException in session data DataStore", corruptionException);
                return new SessionData(((nm6) obj3).w.a((SessionDetails) null), (Time) null, (Map) null, 6, (hl1) null);
            case 25:
                eq4 eq4 = (eq4) obj3;
                dh5 dh5 = (dh5) obj2;
                Object[] objArr = eq4.w;
                int i6 = eq4.y;
                while (i4 < i6) {
                    ((mh4) objArr[i4]).b();
                    i4++;
                }
                return vs7.a;
            case 26:
                vq7 vq7 = (vq7) obj2;
                return ((el2) obj3).a(new vq7((ea7) null, vq7.b, vq7.c, vq7.d, vq7.e)).w;
            case 27:
                np2 np2 = (np2) obj3;
                String str6 = (String) obj2;
                str6.getClass();
                d37 d37 = np2.e;
                am5 am5 = (am5) ((mo2) ((is7) d37.getValue()).a).l.get(str6);
                if (am5 == null || (am5 instanceof xl5)) {
                    do {
                        value = d37.getValue();
                        is7 = (is7) value;
                        mo2 = (mo2) is7.a;
                        mo2.getClass();
                        Map map2 = mo2.l;
                        zl5 zl5 = zl5.a;
                        map2.getClass();
                        if (map2.isEmpty()) {
                            Map singletonMap = Collections.singletonMap(str6, zl5);
                            singletonMap.getClass();
                            map = singletonMap;
                        } else {
                            LinkedHashMap linkedHashMap2 = new LinkedHashMap(map2);
                            linkedHashMap2.put(str6, zl5);
                            map = linkedHashMap2;
                        }
                    } while (!d37.i(value, is7.a(is7, mo2.a(mo2, (ArrayList) null, (List) null, (String) null, (String) null, false, false, (hv2) null, (String) null, (List) null, false, (Boolean) null, map, false, false, 14335), false, (hv2) null, 6)));
                    ar7.H(u58.a(np2), (e81) null, (r81) null, new lp2(np2, str6, (f61) null, 0), 3);
                }
                return vs7.a;
            case 28:
                pn2 pn2 = (pn2) obj3;
                mo2 mo22 = (mo2) obj2;
                ArrayList M0 = dt0.M0(mo22.a, pn2.a);
                HashSet hashSet = new HashSet();
                ArrayList arrayList = new ArrayList();
                Iterator it2 = M0.iterator();
                while (it2.hasNext()) {
                    Object next = it2.next();
                    if (hashSet.add(((en2) next).a)) {
                        arrayList.add(next);
                    }
                }
                return mo2.a(mo22, arrayList, (List) null, (String) null, (String) null, false, false, (hv2) null, (String) null, (List) null, false, (Boolean) null, (Map) null, false, !pn2.b, 4094);
            default:
                c23 c23 = (c23) obj3;
                if (((Boolean) obj2).booleanValue()) {
                    c23.h();
                }
                return vs7.a;
        }
    }

    public /* synthetic */ gg0(int i, Object obj) {
        this.w = i;
        this.x = obj;
    }
}
