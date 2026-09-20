package defpackage;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.datastore.core.CorruptionException;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.MissingFormatArgumentException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: br4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class br4 implements bt, s61, ov3, w81, x72, lh2, ri4, p38, w50, y36 {
    public final /* synthetic */ int w;
    public Object x;

    public br4(int i, byte b) {
        Object obj;
        this.w = i;
        switch (i) {
            case 10:
                this.x = new LinkedHashSet();
                return;
            case 25:
                this.x = new yb9();
                return;
            case 27:
                this.x = new ArrayDeque(16);
                return;
            default:
                if (Build.VERSION.SDK_INT >= 28) {
                    obj = new or2(6);
                } else {
                    obj = new ts2(6);
                }
                this.x = obj;
                return;
        }
    }

    public static boolean L(Bundle bundle) {
        if ("1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString("gcm.n.e".replace("gcm.n.", "gcm.notification.")))) {
            return true;
        }
        return false;
    }

    public static String T(String str) {
        if (str.startsWith("gcm.n.")) {
            return str.substring(6);
        }
        return str;
    }

    public lz5 A(int i) {
        RecyclerView recyclerView = (RecyclerView) this.x;
        int N = recyclerView.A.N();
        int i2 = 0;
        lz5 lz5 = null;
        while (true) {
            if (i2 >= N) {
                break;
            }
            lz5 I = RecyclerView.I(recyclerView.A.M(i2));
            if (I != null && !I.h() && I.c == i) {
                if (!((ArrayList) recyclerView.A.z).contains(I.a)) {
                    lz5 = I;
                    break;
                }
                lz5 = I;
            }
            i2++;
        }
        if (lz5 != null) {
            if (((ArrayList) recyclerView.A.z).contains(lz5.a)) {
                return null;
            }
            return lz5;
        }
        return null;
    }

    public boolean B(String str) {
        String J = J(str);
        if ("1".equals(J) || Boolean.parseBoolean(J)) {
            return true;
        }
        return false;
    }

    public Integer C(String str) {
        String J = J(str);
        if (TextUtils.isEmpty(J)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(J));
        } catch (NumberFormatException unused) {
            Log.w("NotificationParams", "Couldn't parse value of " + T(str) + "(" + J + ") into an int");
            return null;
        }
    }

    public JSONArray D(String str) {
        String J = J(str);
        if (TextUtils.isEmpty(J)) {
            return null;
        }
        try {
            return new JSONArray(J);
        } catch (JSONException unused) {
            Log.w("NotificationParams", "Malformed JSON for key " + T(str) + ": " + J + ", falling back to default");
            return null;
        }
    }

    public int[] E() {
        JSONArray D = D("gcm.n.light_settings");
        if (D == null) {
            return null;
        }
        int[] iArr = new int[3];
        try {
            if (D.length() == 3) {
                int parseColor = Color.parseColor(D.optString(0));
                if (parseColor != -16777216) {
                    iArr[0] = parseColor;
                    iArr[1] = D.optInt(1);
                    iArr[2] = D.optInt(2);
                    return iArr;
                }
                throw new IllegalArgumentException("Transparent color is invalid");
            }
            throw new JSONException("lightSettings don't have all three fields");
        } catch (JSONException unused) {
            Log.w("NotificationParams", "LightSettings is invalid: " + D + ". Skipping setting LightSettings");
            return null;
        } catch (IllegalArgumentException e) {
            Log.w("NotificationParams", "LightSettings is invalid: " + D + ". " + e.getMessage() + ". Skipping setting LightSettings");
            return null;
        }
    }

    public Object[] F(String str) {
        JSONArray D = D(str.concat("_loc_args"));
        if (D == null) {
            return null;
        }
        int length = D.length();
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = D.optString(i);
        }
        return strArr;
    }

    public String G(String str) {
        return J(str.concat("_loc_key"));
    }

    public Long H() {
        String J = J("gcm.n.event_time");
        if (TextUtils.isEmpty(J)) {
            return null;
        }
        try {
            return Long.valueOf(Long.parseLong(J));
        } catch (NumberFormatException unused) {
            Log.w("NotificationParams", "Couldn't parse value of " + T("gcm.n.event_time") + "(" + J + ") into a long");
            return null;
        }
    }

    public String I(Resources resources, String str, String str2) {
        String J = J(str2);
        if (!TextUtils.isEmpty(J)) {
            return J;
        }
        String G = G(str2);
        if (TextUtils.isEmpty(G)) {
            return null;
        }
        int identifier = resources.getIdentifier(G, "string", str);
        if (identifier == 0) {
            Log.w("NotificationParams", T(str2.concat("_loc_key")) + " resource not found: " + str2 + " Default value will be used.");
            return null;
        }
        Object[] F = F(str2);
        if (F == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, F);
        } catch (MissingFormatArgumentException e) {
            Log.w("NotificationParams", "Missing format argument for " + T(str2) + ": " + Arrays.toString(F) + " Default value will be used.", e);
            return null;
        }
    }

    public String J(String str) {
        String str2;
        Bundle bundle = (Bundle) this.x;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            if (!str.startsWith("gcm.n.")) {
                str2 = str;
            } else {
                str2 = str.replace("gcm.n.", "gcm.notification.");
            }
            if (bundle.containsKey(str2)) {
                str = str2;
            }
        }
        return bundle.getString(str);
    }

    public long[] K() {
        JSONArray D = D("gcm.n.vibrate_timings");
        if (D == null) {
            return null;
        }
        try {
            if (D.length() > 1) {
                int length = D.length();
                long[] jArr = new long[length];
                for (int i = 0; i < length; i++) {
                    jArr[i] = D.optLong(i);
                }
                return jArr;
            }
            throw new JSONException("vibrateTimings have invalid length");
        } catch (NumberFormatException | JSONException unused) {
            Log.w("NotificationParams", "User defined vibrateTimings is invalid: " + D + ". Skipping setting vibrateTimings.");
            return null;
        }
    }

    public void M(int i, int i2) {
        int i3;
        int i4;
        RecyclerView recyclerView = (RecyclerView) this.x;
        int N = recyclerView.A.N();
        int i5 = i2 + i;
        for (int i6 = 0; i6 < N; i6++) {
            View M = recyclerView.A.M(i6);
            lz5 I = RecyclerView.I(M);
            if (I != null && !I.o() && (i4 = I.c) >= i && i4 < i5) {
                I.a(2);
                I.a(1024);
                ((yy5) M.getLayoutParams()).c = true;
            }
        }
        dz5 dz5 = recyclerView.x;
        ArrayList arrayList = dz5.c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            lz5 lz5 = (lz5) arrayList.get(size);
            if (lz5 != null && (i3 = lz5.c) >= i && i3 < i5) {
                lz5.a(2);
                dz5.f(size);
            }
        }
        recyclerView.D0 = true;
    }

    public float N(float f, long j) {
        float f2;
        long j2 = j / 1000000;
        fh2 a = ((pj) this.x).a(f);
        long j3 = a.c;
        if (j3 > 0) {
            f2 = ((float) j2) / ((float) j3);
        } else {
            f2 = 1.0f;
        }
        return (((Math.signum(a.a) * cg.a(f2).b) * a.b) / ((float) j3)) * 1000.0f;
    }

    public void O(int i, int i2) {
        RecyclerView recyclerView = (RecyclerView) this.x;
        int N = recyclerView.A.N();
        for (int i3 = 0; i3 < N; i3++) {
            lz5 I = RecyclerView.I(recyclerView.A.M(i3));
            if (I != null && !I.o() && I.c >= i) {
                I.l(i2, false);
                recyclerView.z0.f = true;
            }
        }
        ArrayList arrayList = recyclerView.x.c;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            lz5 lz5 = (lz5) arrayList.get(i4);
            if (lz5 != null && lz5.c >= i) {
                lz5.l(i2, false);
            }
        }
        recyclerView.requestLayout();
        recyclerView.C0 = true;
    }

    public void P(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        RecyclerView recyclerView = (RecyclerView) this.x;
        int N = recyclerView.A.N();
        int i10 = -1;
        if (i < i2) {
            i5 = i;
            i4 = i2;
            i3 = -1;
        } else {
            i4 = i;
            i5 = i2;
            i3 = 1;
        }
        for (int i11 = 0; i11 < N; i11++) {
            lz5 I = RecyclerView.I(recyclerView.A.M(i11));
            if (I != null && (i9 = I.c) >= i5 && i9 <= i4) {
                if (i9 == i) {
                    I.l(i2 - i, false);
                } else {
                    I.l(i3, false);
                }
                recyclerView.z0.f = true;
            }
        }
        ArrayList arrayList = recyclerView.x.c;
        if (i < i2) {
            i7 = i;
            i6 = i2;
        } else {
            i6 = i;
            i7 = i2;
            i10 = 1;
        }
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            lz5 lz5 = (lz5) arrayList.get(i12);
            if (lz5 != null && (i8 = lz5.c) >= i7 && i8 <= i6) {
                if (i8 == i) {
                    lz5.l(i2 - i, false);
                } else {
                    lz5.l(i10, false);
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.C0 = true;
    }

    public float Q(float f, float f2, long j) {
        float f3;
        long j2 = j / 1000000;
        fh2 a = ((pj) this.x).a(f2);
        long j3 = a.c;
        if (j3 > 0) {
            f3 = ((float) j2) / ((float) j3);
        } else {
            f3 = 1.0f;
        }
        return (Math.signum(a.a) * a.b * cg.a(f3).a) + f;
    }

    public Bundle R() {
        Bundle bundle = (Bundle) this.x;
        Bundle bundle2 = new Bundle(bundle);
        for (String next : bundle.keySet()) {
            if (!next.startsWith("google.c.a.") && !next.equals("from")) {
                bundle2.remove(next);
            }
        }
        return bundle2;
    }

    public Object S(en0 en0, sr2 sr2) {
        ix6 j;
        qu6 qu6;
        xk6 xk6;
        int i;
        en0 en02 = en0;
        if (((in8) this.x) == null) {
            vm5.b("Called runAndWatch on a manager that has been disposed of");
        }
        in8 in8 = (in8) this.x;
        if ((in8 instanceof qu6) && (xk6 = qu6.B) != null && !xk6.equals(en02)) {
            bo4 bo4 = new bo4();
            xk6 xk62 = (qu6 = (qu6) in8).B;
            if (xk62 == null) {
                vm5.b("promote must only be called when a manager is managing subscriptions for one channel and needs to start managing them for a second");
            }
            up4 up4 = qu6.z;
            ArrayList arrayList = bo4.y;
            if (up4 == null) {
                Object obj = qu6.x;
                obj.getClass();
                arrayList.add(new yn4(obj, xk62));
            } else {
                Object[] objArr = up4.b;
                long[] jArr = up4.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    while (true) {
                        long j2 = jArr[i2];
                        if ((((~j2) << 7) & j2 & -9187201950435737472L) != -9187201950435737472L) {
                            int i3 = 8;
                            int i4 = 8 - ((~(i2 - length)) >>> 31);
                            int i5 = 0;
                            while (i5 < i4) {
                                if ((j2 & 255) < 128) {
                                    i = i3;
                                    arrayList.add(new yn4(objArr[(i2 << 3) + i5], xk62));
                                } else {
                                    i = i3;
                                }
                                j2 >>= i;
                                i5++;
                                i3 = i;
                            }
                            if (i4 != i3) {
                                break;
                            }
                        }
                        if (i2 == length) {
                            break;
                        }
                        i2++;
                    }
                }
            }
            bo4.B0();
            qu6.C0();
            this.x = bo4;
        }
        in8 in82 = (in8) this.x;
        in82.getClass();
        ix6 u = nx6.j().u(in82.L0(en02));
        in82.A0(en02);
        try {
            j = u.j();
            Object b = sr2.b();
            ix6.q(j);
            u.c();
            in82.B0();
            return b;
        } catch (Throwable th) {
            u.c();
            throw th;
        }
    }

    public boolean U() {
        pz8 pz8 = ((y19) this.x).B;
        y19.g(pz8);
        return Log.isLoggable(pz8.m1(), 3);
    }

    public void V() {
        ArrayDeque arrayDeque = (ArrayDeque) this.x;
        if (!arrayDeque.isEmpty()) {
            int size = arrayDeque.size();
            long X = X();
            throw new IOException("data item not completed, stackSize: " + size + " scope: " + X);
        }
    }

    public void W(long j) {
        long X = X();
        if (X != j) {
            if (X != -1) {
                if (X == -2) {
                    X = -2;
                } else {
                    return;
                }
            }
            StringBuilder q = hl6.q(j, "expected non-string scope or scope ", " but found ");
            q.append(X);
            throw new IOException(q.toString());
        }
    }

    public long X() {
        ArrayDeque arrayDeque = (ArrayDeque) this.x;
        if (arrayDeque.isEmpty()) {
            return 0;
        }
        return ((Long) arrayDeque.peek()).longValue();
    }

    public void Y(int i, Object obj, wm8 wm8) {
        fl8 fl8 = (fl8) this.x;
        pk8 pk8 = (pk8) obj;
        fl8.d(i, 2);
        fl8.r(pk8.c(wm8));
        wm8.h(pk8, this);
    }

    public boolean a() {
        ((no7) this.x).getClass();
        return false;
    }

    public void accept(Object obj, Object obj2) {
        switch (this.w) {
            case 23:
                uh8 uh8 = new uh8((xb7) obj2);
                ni8 ni8 = (ni8) ((xh8) obj).l();
                Parcel a = ni8.a();
                int i = bi8.a;
                a.writeStrongBinder(uh8);
                bi8.c(a, (b80) this.x);
                ni8.b(a, 1);
                return;
            default:
                int i2 = b49.l;
                t39 t39 = new t39((xb7) obj2);
                d49 d49 = (d49) ((f49) obj).l();
                byte[] a2 = ((r59) this.x).a();
                Parcel I = d49.I();
                ds8.c(I, t39);
                I.writeByteArray(a2);
                d49.J(I, 31);
                return;
        }
    }

    public void b(m11 m11) {
        ((ow2) this.x).b(m11);
    }

    public long d(ol olVar, ol olVar2, ol olVar3) {
        return ((no7) this.x).d(olVar, olVar2, olVar3);
    }

    public Object e(CorruptionException corruptionException) {
        return ((vr2) this.x).y(corruptionException);
    }

    public ex5 f() {
        boolean z;
        IOException iOException = null;
        while (!((px5) this.x).k.N) {
            try {
                y96 b = ((px5) this.x).b();
                if (!b.c()) {
                    x96 d = b.d();
                    if (d.b == null && d.c == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        d = b.g();
                    }
                    y96 y96 = d.b;
                    Throwable th = d.c;
                    if (th != null) {
                        throw th;
                    } else if (y96 != null) {
                        ((px5) this.x).p.addFirst(y96);
                    }
                }
                return b.b();
            } catch (IOException e) {
                if (iOException == null) {
                    iOException = e;
                } else {
                    su0.b(iOException, e);
                }
                if (!((px5) this.x).a((ex5) null)) {
                    throw iOException;
                }
            }
        }
        rf2.i("Canceled");
        return null;
    }

    public long f0(float f) {
        return ((long) (Math.exp(((pj) this.x).b(f) / (((double) gh2.a) - 1.0d)) * 1000.0d)) * 1000000;
    }

    public boolean g(ti4 ti4, MenuItem menuItem) {
        return false;
    }

    public px5 h() {
        return (px5) this.x;
    }

    public void i(uq4 uq4, Object obj) {
        String str;
        ow5 ow5 = (ow5) this.x;
        String b = uq4.b();
        if ("version".equals(b)) {
            if (obj instanceof int[]) {
                ow5.w = (int[]) obj;
            }
        } else if ("multifileClassName".equals(b)) {
            if (obj instanceof String) {
                str = (String) obj;
            } else {
                str = null;
            }
            ow5.x = str;
        }
    }

    public ol j(long j, ol olVar, ol olVar2, ol olVar3) {
        return ((no7) this.x).j(j, olVar, olVar2, olVar3);
    }

    public void k(g73 g73, List list) {
        g73.getClass();
        dc5 dc5 = (dc5) this.x;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            q61 q61 = (q61) it.next();
            dc5.b.put(q61.a, q61.b);
        }
    }

    public float k0(float f, float f2) {
        pj pjVar = (pj) this.x;
        double b = pjVar.b(f2);
        double d = (double) gh2.a;
        double exp = Math.exp((d / (d - 1.0d)) * b);
        return (Math.signum(f2) * ((float) (exp * ((double) (pjVar.w * pjVar.x))))) + f;
    }

    public pv3 m(uq4 uq4) {
        String b = uq4.b();
        if ("data".equals(b) || "filePartClassNames".equals(b)) {
            return new nw5(this, 0);
        }
        if ("strings".equals(b)) {
            return new nw5(this, 1);
        }
        return null;
    }

    public ov3 p(gq0 gq0, uq4 uq4) {
        return null;
    }

    public List q(g73 g73) {
        g73.getClass();
        ConcurrentHashMap concurrentHashMap = ((dc5) this.x).b;
        ArrayList arrayList = new ArrayList(concurrentHashMap.size());
        for (Map.Entry entry : concurrentHashMap.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            str.getClass();
            if (sg3.e(d57.k1(str).toString(), str)) {
                str2.getClass();
                if (sg3.e(d57.k1(str2).toString(), str2)) {
                    String str3 = g73.d;
                    str3.getClass();
                    String b = bg8.b(str3);
                    if (b != null) {
                        arrayList.add(new q61(str, str2, 253402300799999L, b, "/", false, false, false, false, (String) null));
                    } else {
                        h.q("unexpected domain: ".concat(str3));
                        return null;
                    }
                } else {
                    h.q("value is not trimmed");
                    return null;
                }
            } else {
                h.q("name is not trimmed");
                return null;
            }
        }
        return arrayList;
    }

    public void s(ti4 ti4) {
        Toolbar toolbar = (Toolbar) this.x;
        d8 d8Var = toolbar.w.P;
        if (d8Var == null || !d8Var.j()) {
            Iterator it = ((CopyOnWriteArrayList) toolbar.f0.y).iterator();
            while (it.hasNext()) {
                ((kq2) it.next()).a.t();
            }
        }
    }

    public ol t(long j, ol olVar, ol olVar2, ol olVar3) {
        return ((no7) this.x).t(j, olVar, olVar2, olVar3);
    }

    public ol u(ol olVar, ol olVar2, ol olVar3) {
        return ((no7) this.x).u(olVar, olVar2, olVar3);
    }

    public Object v(Object obj, Object obj2) {
        String str = (String) obj2;
        str.getClass();
        cr4 cr4 = (cr4) this.x;
        vt7 vt7 = cr4.a;
        zq5 zq5 = vt7.a;
        List list = cr4.b;
        Integer num = (Integer) zq5.v(obj, Integer.valueOf(list.indexOf(str) + vt7.b));
        if (num != null) {
            return (String) list.get(num.intValue() - vt7.b);
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
    public void w(nn0 nn0, h61 h61) {
        f35 f35;
        int i;
        if (h61 instanceof f35) {
            f35 = (f35) h61;
            int i2 = f35.B;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                f35.B = i2 - Integer.MIN_VALUE;
                Object obj = f35.z;
                i = f35.B;
                if (i != 0) {
                    o85.q(obj);
                    f35.B = 1;
                    ((d37) this.x).a(nn0, f35);
                    return;
                } else if (i != 1) {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return;
                } else {
                    o85.q(obj);
                    ta1.e();
                    return;
                }
            }
        }
        f35 = new f35(this, h61);
        Object obj2 = f35.z;
        i = f35.B;
        if (i != 0) {
        }
    }

    public void x(int[] iArr, int i) {
        int[] iArr2;
        int[] iArr3;
        int i2;
        hv2 hv2;
        hv2 hv22;
        int i3;
        hv2 hv23;
        int i4;
        int i5;
        int[] iArr4 = iArr;
        int i6 = i;
        gv2 gv2 = (gv2) this.x;
        if (iArr4.length != 0) {
            int length = iArr4.length;
            int i7 = 0;
            int i8 = 1;
            if (length <= 1 || iArr4[0] != 0) {
                iArr2 = iArr4;
            } else {
                int i9 = 1;
                while (i9 < length && iArr4[i9] == 0) {
                    i9++;
                }
                if (i9 == length) {
                    iArr2 = new int[]{0};
                } else {
                    int i10 = length - i9;
                    int[] iArr5 = new int[i10];
                    System.arraycopy(iArr4, i9, iArr5, 0, i10);
                    iArr2 = iArr5;
                }
            }
            int[] iArr6 = new int[i6];
            boolean z = true;
            for (int i11 = 0; i11 < i6; i11++) {
                int i12 = gv2.a[gv2.g + i11];
                if (i12 == 0) {
                    i4 = iArr2[iArr2.length - 1];
                } else {
                    if (i12 == 1) {
                        i5 = 0;
                        for (int i13 : iArr2) {
                            gv2 gv22 = gv2.h;
                            i5 ^= i13;
                        }
                    } else {
                        int i14 = iArr2[0];
                        int length2 = iArr2.length;
                        for (int i15 = 1; i15 < length2; i15++) {
                            i14 = gv2.b(i12, i5) ^ iArr2[i15];
                        }
                    }
                    i4 = i5;
                }
                iArr6[(i6 - 1) - i11] = i4;
                if (i4 != 0) {
                    z = false;
                }
            }
            if (!z) {
                hv2 hv24 = new hv2(gv2, iArr6);
                gv2.getClass();
                hv2 hv25 = gv2.c;
                if (i6 >= 0) {
                    int[] iArr7 = new int[(i6 + 1)];
                    iArr7[0] = 1;
                    hv2 hv26 = new hv2(gv2, iArr7);
                    if (hv26.M0() >= hv24.M0()) {
                        hv2 hv27 = hv26;
                        hv26 = hv24;
                        hv24 = hv27;
                    }
                    hv2 hv28 = hv24;
                    hv2 hv29 = hv26;
                    hv2 hv210 = gv2.d;
                    hv2 hv211 = hv25;
                    while (hv29.M0() >= i6 / 2) {
                        if (!hv29.T0()) {
                            int a = gv2.a(hv29.J0(hv29.M0()));
                            hv2 hv212 = hv25;
                            while (hv28.M0() >= hv29.M0() && !hv28.T0()) {
                                int M0 = hv28.M0() - hv29.M0();
                                int b = gv2.b(hv28.J0(hv28.M0()), a);
                                if (M0 >= 0) {
                                    if (b == 0) {
                                        hv22 = hv25;
                                    } else {
                                        int[] iArr8 = new int[(M0 + 1)];
                                        iArr8[i7] = b;
                                        hv22 = new hv2(gv2, iArr8);
                                    }
                                    hv212 = hv212.m0(hv22);
                                    int[] iArr9 = (int[]) hv29.x;
                                    gv2 gv23 = (gv2) hv29.y;
                                    if (M0 >= 0) {
                                        if (b == 0) {
                                            hv23 = gv23.c;
                                            i3 = i8;
                                        } else {
                                            i3 = i8;
                                            int length3 = iArr9.length;
                                            int[] iArr10 = new int[(M0 + length3)];
                                            while (i7 < length3) {
                                                iArr10[i7] = gv23.b(iArr9[i7], b);
                                                i7++;
                                                int i16 = i;
                                            }
                                            hv23 = new hv2(gv23, iArr10);
                                        }
                                        hv28 = hv28.m0(hv23);
                                        i7 = 0;
                                        i8 = i3;
                                        int i17 = i;
                                    } else {
                                        ku4.v();
                                        return;
                                    }
                                } else {
                                    ku4.v();
                                    return;
                                }
                            }
                            int i18 = i8;
                            gv2 gv24 = (gv2) hv212.y;
                            if (gv24.equals((gv2) hv210.y)) {
                                if (hv212.T0() || hv210.T0()) {
                                    hv2 = gv24.c;
                                } else {
                                    int[] iArr11 = (int[]) hv212.x;
                                    int length4 = iArr11.length;
                                    int[] iArr12 = (int[]) hv210.x;
                                    int length5 = iArr12.length;
                                    int[] iArr13 = new int[((length4 + length5) - 1)];
                                    for (int i19 = 0; i19 < length4; i19++) {
                                        int i20 = iArr11[i19];
                                        int i21 = 0;
                                        while (i21 < length5) {
                                            int i22 = i19 + i21;
                                            iArr13[i22] = iArr13[i22] ^ gv24.b(i20, iArr12[i21]);
                                            i21++;
                                            iArr11 = iArr11;
                                        }
                                        int[] iArr14 = iArr11;
                                    }
                                    hv2 = new hv2(gv24, iArr13);
                                }
                                hv2 m0 = hv2.m0(hv211);
                                if (hv28.M0() < hv29.M0()) {
                                    hv2 hv213 = hv28;
                                    hv28 = hv29;
                                    hv29 = hv213;
                                    i7 = 0;
                                    i8 = i18;
                                    hv211 = hv210;
                                    hv210 = m0;
                                    i6 = i;
                                } else {
                                    h.s("Division algorithm failed to reduce polynomial?");
                                    return;
                                }
                            } else {
                                h.q("GenericGFPolys do not have same GenericGF field");
                                return;
                            }
                        } else {
                            throw new Exception("r_{i-1} was zero");
                        }
                    }
                    int i23 = i7;
                    int i24 = i8;
                    int J0 = hv210.J0(i23);
                    if (J0 != 0) {
                        int a2 = gv2.a(J0);
                        hv2[] hv2Arr = {hv210.U0(a2), hv29.U0(a2)};
                        hv2 hv214 = hv2Arr[i23];
                        hv2 hv215 = hv2Arr[i24];
                        int M02 = hv214.M0();
                        int i25 = i24;
                        if (M02 == i25) {
                            iArr3 = new int[]{hv214.J0(i25)};
                        } else {
                            int[] iArr15 = new int[M02];
                            int i26 = i23;
                            for (int i27 = 1; i27 < gv2.e && i26 < M02; i27++) {
                                if (hv214.G0(i27) == 0) {
                                    iArr15[i26] = gv2.a(i27);
                                    i26++;
                                }
                            }
                            if (i26 == M02) {
                                iArr3 = iArr15;
                            } else {
                                throw new Exception("Error locator degree does not match number of roots");
                            }
                        }
                        int length6 = iArr3.length;
                        int[] iArr16 = new int[length6];
                        for (int i28 = i23; i28 < length6; i28++) {
                            int a3 = gv2.a(iArr3[i28]);
                            int i29 = 1;
                            for (int i30 = i23; i30 < length6; i30++) {
                                if (i28 != i30) {
                                    int b2 = gv2.b(iArr3[i30], a3);
                                    if ((b2 & 1) == 0) {
                                        i2 = b2 | 1;
                                    } else {
                                        i2 = b2 & -2;
                                    }
                                    i29 = gv2.b(i29, i2);
                                }
                            }
                            int b3 = gv2.b(hv215.G0(a3), gv2.a(i29));
                            iArr16[i28] = b3;
                            if (gv2.g != 0) {
                                iArr16[i28] = gv2.b(b3, a3);
                            }
                        }
                        while (i23 < iArr3.length) {
                            int length7 = iArr4.length - 1;
                            int i31 = iArr3[i23];
                            if (i31 != 0) {
                                int i32 = length7 - gv2.b[i31];
                                if (i32 >= 0) {
                                    iArr4[i32] = iArr4[i32] ^ iArr16[i23];
                                    i23++;
                                } else {
                                    throw new Exception("Bad error location");
                                }
                            } else {
                                ku4.v();
                                return;
                            }
                        }
                        return;
                    }
                    throw new Exception("sigmaTilde(0) was zero");
                }
                ku4.v();
                return;
            }
            return;
        }
        ku4.v();
    }

    public void y(n9 n9Var) {
        RecyclerView recyclerView = (RecyclerView) this.x;
        int i = n9Var.a;
        if (i == 1) {
            recyclerView.H.X(n9Var.b, n9Var.c);
        } else if (i == 2) {
            recyclerView.H.a0(n9Var.b, n9Var.c);
        } else if (i == 4) {
            recyclerView.H.b0(n9Var.b, n9Var.c);
        } else if (i == 8) {
            recyclerView.H.Z(n9Var.b, n9Var.c);
        }
    }

    public float z() {
        return 0.0f;
    }

    public void c() {
    }

    public void l(uq4 uq4, jq0 jq0) {
    }

    public /* synthetic */ br4(int i, Object obj) {
        this.w = i;
        this.x = obj;
    }

    public /* synthetic */ br4(int i, Object obj, Object obj2) {
        this.w = i;
        this.x = obj2;
    }

    public br4(AppMeasurementSdk appMeasurementSdk, jz0 jz0) {
        this.w = 26;
        this.x = jz0;
        appMeasurementSdk.a(new yu8(1, this));
    }

    public br4(fl8 fl8) {
        this.w = 24;
        this.x = fl8;
        fl8.a = this;
    }

    public br4(t54 t54) {
        this.w = 21;
        t54.getClass();
        this.x = new WeakReference(t54);
    }

    public /* synthetic */ br4(char c, int i) {
        this.w = i;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, pj] */
    public br4(tp1 tp1) {
        this.w = 14;
        float f = j07.a;
        ? obj = new Object();
        obj.w = f;
        float b = tp1.b();
        float f2 = gh2.a;
        obj.x = b * 386.0878f * 160.0f * 0.84f;
        this.x = obj;
    }

    public br4(Bundle bundle) {
        this.w = 1;
        if (bundle != null) {
            this.x = new Bundle(bundle);
        } else {
            ku4.j("data");
            throw null;
        }
    }

    public br4(eg8 eg8) {
        this.w = 17;
        this.x = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), eg8);
    }

    public br4(int i) {
        this.w = 2;
        this.x = e37.a(new int[i]);
    }

    public br4(float f, float f2, ol olVar) {
        pl plVar;
        this.w = 20;
        int[] iArr = n38.a;
        if (olVar != null) {
            plVar = new uy5(f, f2, olVar);
        } else {
            plVar = new rg4(f, f2);
        }
        this.x = new no7(plVar);
    }

    public void o(uq4 uq4, gq0 gq0, uq4 uq42) {
    }
}
