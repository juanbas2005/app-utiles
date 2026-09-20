package defpackage;

import com.google.firebase.messaging.FirebaseMessaging;
import cu.lestebang.utiletecsa.core.preferences.model.DarkThemeConfigPreferences;
import cu.lestebang.utiletecsa.core.preferences.model.UserDataPreferences;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lne4;", "Lr58;", "app"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* renamed from: ne4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ne4 extends r58 {
    public final dv7 b;
    public final p7 c;
    public final s77 d;
    public final xw5 e;

    public ne4(dv7 dv7, p7 p7Var, s77 s77) {
        dv7 dv72 = dv7;
        dv72.getClass();
        p7Var.getClass();
        s77.getClass();
        this.b = dv72;
        this.c = p7Var;
        this.d = s77;
        this.e = kl8.N(new oi2(new c6(((dy7) dv72).d(), 8), new qh3(3, (f61) null, 1), 1), new is7(4, new UserDataPreferences((String) null, (String) null, (String) null, (DarkThemeConfigPreferences) null, false, false, 0, false, (List) null, (String) null, false, false, false, false, false, false, false, false, false, false, false, false, (List) null, (String) null, (String) null, (String) null, (List) null, (String) null, false, (String) null, (List) null, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, (String) null, (String) null, 0, 0, 0, 0, 0, (String) null, (String) null, false, false, false, false, false, false, false, false, 0, (String) null, (String) null, (String) null, (String) null, (String) null, -1, -1, (hl1) null)), u58.a(this));
        ar7.H(u58.a(this), (e81) null, (r81) null, new q34((Object) this, (f61) null, 1), 3);
        ar7.H(u58.a(this), (e81) null, (r81) null, new fe4(this, (f61) null, 2), 3);
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0093 A[Catch:{ Exception -> 0x00fa }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00cf A[Catch:{ Exception -> 0x00fa }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00d4 A[Catch:{ Exception -> 0x00fa }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00e7 A[Catch:{ Exception -> 0x00fa }] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    public static final Object e(ne4 ne4, f61 f61) {
        ie4 ie4;
        p81 p81;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        Object obj;
        String str;
        FirebaseMessaging instance;
        if (f61 instanceof ie4) {
            ie4 = (ie4) f61;
            int i8 = ie4.E;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                ie4.E = i8 - Integer.MIN_VALUE;
                Object obj2 = ie4.C;
                p81 = p81.w;
                i = ie4.E;
                if (i != 0) {
                    o85.q(obj2);
                    i2 = 3;
                    i4 = 0;
                } else if (i == 1) {
                    i4 = ie4.B;
                    i3 = ie4.A;
                    i7 = ie4.z;
                    o85.q(obj2);
                    str = (String) obj2;
                    if (!d57.I0(str)) {
                        yh7.a.getClass();
                        hr2.z(new Object[0]);
                        ie4.z = i7;
                        ie4.A = i3;
                        ie4.B = i4;
                        ie4.E = 2;
                        if (t49.G(2000, ie4) == p81) {
                            return p81;
                        }
                        i2 = i7;
                        i4 = i3 + 1;
                    }
                    hr2 hr2 = yh7.a;
                    d57.i1(12, str);
                    hr2.getClass();
                    hr2.m(new Object[0]);
                    s77 s77 = ne4.d;
                    ie4.z = i7;
                    ie4.A = i3;
                    ie4.B = i4;
                    ie4.E = 3;
                    obj = s77.a(str, ie4);
                    if (obj == p81) {
                        return p81;
                    }
                    if (!(obj instanceof m66)) {
                    }
                    if (o66.a(obj) != null) {
                    }
                    return vs7.a;
                } else if (i == 2) {
                    i4 = ie4.B;
                    i3 = ie4.A;
                    i7 = ie4.z;
                    o85.q(obj2);
                    i2 = i7;
                    i4 = i3 + 1;
                } else if (i == 3) {
                    i4 = ie4.B;
                    i3 = ie4.A;
                    i7 = ie4.z;
                    try {
                        o85.q(obj2);
                        obj = ((o66) obj2).w;
                    } catch (Exception unused) {
                    }
                    if (!(obj instanceof m66)) {
                        vs7 vs7 = (vs7) obj;
                        yh7.a.getClass();
                        hr2.m(new Object[0]);
                    }
                    if (o66.a(obj) != null) {
                        yh7.a.getClass();
                        hr2.p(new Object[0]);
                    }
                    return vs7.a;
                } else if (i == 4) {
                    i6 = ie4.A;
                    i5 = ie4.z;
                    o85.q(obj2);
                    i2 = i5;
                    i3 = i6;
                    i4 = i3 + 1;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                if (i4 >= i2) {
                    try {
                        synchronized (FirebaseMessaging.class) {
                            instance = FirebaseMessaging.getInstance(oe2.c());
                        }
                    } catch (Exception unused2) {
                        i7 = i2;
                        i3 = i4;
                    }
                    instance.getClass();
                    ie4.z = i2;
                    ie4.A = i4;
                    ie4.B = i4;
                    ie4.E = 1;
                    Object f = f(instance, ie4);
                    if (f == p81) {
                        return p81;
                    }
                    i7 = i2;
                    obj2 = f;
                    i3 = i4;
                    str = (String) obj2;
                    if (!d57.I0(str)) {
                        hr2 hr22 = yh7.a;
                        d57.i1(12, str);
                        hr22.getClass();
                        hr2.m(new Object[0]);
                        s77 s772 = ne4.d;
                        ie4.z = i7;
                        ie4.A = i3;
                        ie4.B = i4;
                        ie4.E = 3;
                        obj = s772.a(str, ie4);
                    }
                    hr2 hr222 = yh7.a;
                    d57.i1(12, str);
                    hr222.getClass();
                    hr2.m(new Object[0]);
                    s77 s7722 = ne4.d;
                    ie4.z = i7;
                    ie4.A = i3;
                    ie4.B = i4;
                    ie4.E = 3;
                    obj = s7722.a(str, ie4);
                    if (obj == p81) {
                    }
                    if (!(obj instanceof m66)) {
                    }
                    if (o66.a(obj) != null) {
                    }
                    return vs7.a;
                    return p81;
                }
                return vs7.a;
            }
        }
        ie4 = new ie4(ne4, f61);
        Object obj22 = ie4.C;
        p81 = p81.w;
        i = ie4.E;
        if (i != 0) {
        }
        if (i4 >= i2) {
        }
        return vs7.a;
        yh7.a.getClass();
        hr2.p(new Object[0]);
        if (i4 < 2) {
            ie4.z = i7;
            ie4.A = i3;
            ie4.B = i4;
            ie4.E = 4;
            if (t49.G(2000, ie4) == p81) {
                return p81;
            }
            i6 = i3;
            i5 = i7;
            i2 = i5;
            i3 = i6;
            i4 = i3 + 1;
            if (i4 >= i2) {
            }
            return vs7.a;
        }
        i2 = i7;
        i4 = i3 + 1;
        if (i4 >= i2) {
        }
        return vs7.a;
    }

    public static Object f(FirebaseMessaging firebaseMessaging, ie4 ie4) {
        yb9 yb9;
        kk0 kk0 = new kk0(1, rc9.a0(ie4));
        kk0.v();
        if (firebaseMessaging.d.E()) {
            yb9 = b35.k(new IllegalStateException("API disabled. Please use {@link #register()} instead or enable this API by removing {@code <meta-data android:name=\"firebase_messaging_installation_id_enabled\" android:value=\"true\" />} from your app's manifest."));
        } else {
            xb7 xb7 = new xb7();
            firebaseMessaging.g.execute(new ga(23, (Object) firebaseMessaging, (Object) xb7));
            yb9 = xb7.a;
        }
        yb9.b(new ns8(28, (Object) kk0));
        return kk0.t();
    }
}
