package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.profileinstaller.ProfileInstallReceiver;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import com.google.android.gms.internal.measurement.zzaeh;
import com.google.android.gms.internal.measurement.zzmk;
import com.google.android.gms.internal.measurement.zzsg;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* renamed from: rg4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class rg4 implements sp5, q48, jk5, pl, y36, k55, c99, x77, tz8, ct, g61 {
    public final /* synthetic */ int w;
    public Object x;

    public rg4(int i) {
        this.w = i;
        switch (i) {
            case 6:
                this.x = u55.p(Boolean.FALSE);
                return;
            case 18:
                this.x = new EnumMap(f39.class);
                return;
            default:
                this.x = new vc4((Object) null);
                return;
        }
    }

    public static rg4 v(String str) {
        c39 c39;
        if (TextUtils.isEmpty(str) || str.length() > 1) {
            c39 = c39.UNINITIALIZED;
        } else {
            c39 = h39.e(str.charAt(0));
        }
        return new rg4(19, (Object) c39);
    }

    public z71 a(z71 z71) {
        if (z71 instanceof q36) {
            return z71;
        }
        return new w9(-((ug4) this.x).i(), z71);
    }

    /* JADX INFO: finally extract failed */
    public void accept(Object obj, Object obj2) {
        xb7 xb7 = (xb7) obj2;
        switch (this.w) {
            case 16:
                mh8 mh8 = (mh8) ((rh8) obj).l();
                dc7 dc7 = (dc7) this.x;
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken(mh8.f);
                int i = tg8.a;
                if (dc7 == null) {
                    obtain.writeInt(0);
                } else {
                    obtain.writeInt(1);
                    dc7.writeToParcel(obtain, 0);
                }
                try {
                    mh8.e.transact(1, obtain, (Parcel) null, 1);
                    obtain.recycle();
                    xb7.b((Object) null);
                    return;
                } catch (Throwable th) {
                    obtain.recycle();
                    throw th;
                }
            default:
                xf3 xf3 = new xf3(xb7);
                mn mnVar = new mn(new dv0(-1, -1, 0, true), false);
                mnVar.y = false;
                o73 o73 = (o73) ((q73) ((i83) obj).l());
                Parcel obtain2 = Parcel.obtain();
                obtain2.writeInterfaceToken("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
                int i2 = ft8.a;
                obtain2.writeStrongBinder(xf3);
                ft8.b(obtain2, (GetCredentialRequest) this.x);
                ft8.b(obtain2, mnVar);
                Parcel obtain3 = Parcel.obtain();
                try {
                    o73.d.transact(1, obtain2, obtain3, 0);
                    obtain3.readException();
                    return;
                } finally {
                    obtain2.recycle();
                    obtain3.recycle();
                }
        }
    }

    public int b(View view) {
        return (view.getLeft() - ((yy5) view.getLayoutParams()).b.left) - ((yy5) view.getLayoutParams()).leftMargin;
    }

    public /* bridge */ /* synthetic */ Object c(yb9 yb9) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll((List) this.x);
        return b35.l(arrayList);
    }

    public ListenableFuture call() {
        ListenableFuture listenableFuture;
        o00 o00 = (o00) this.x;
        jl6 jl6 = (jl6) o00.e;
        try {
            return pt2.d(o00.l((Uri) pt2.b((ListenableFuture) o00.c)));
        } catch (IOException e) {
            xn5 xn5 = (xn5) o00.g;
            xn5.getClass();
            if ((e instanceof zzsg) || (e.getCause() instanceof zzsg)) {
                return pt2.c(e);
            }
            lb9 lb9 = (lb9) xn5.w;
            lb9.getClass();
            if (!(e.getCause() instanceof zzaeh)) {
                listenableFuture = pt2.c(e);
            } else {
                f93 d = pt2.d(lb9.a);
                gb9 gb9 = new gb9(o00, 2);
                int i = mc9.a;
                listenableFuture = pt2.a(pt2.g(d, new l99(4, vb9.a(), gb9), jl6), IOException.class, new h89(5, e), fv1.w);
            }
            gb9 gb92 = new gb9(o00, 1);
            int i2 = mc9.a;
            return pt2.g(listenableFuture, new l99(4, vb9.a(), gb92), jl6);
        }
    }

    public void d() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    public void e(int i, Object obj) {
        String str;
        switch (i) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
            default:
                str = "";
                break;
        }
        if (i == 6 || i == 7 || i == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
        ((ProfileInstallReceiver) this.x).setResultCode(i);
    }

    public void f(String str, String str2, Bundle bundle) {
        boolean isEmpty = TextUtils.isEmpty(str);
        v49 v49 = (v49) this.x;
        if (isEmpty) {
            v49.g1("auto", "_err", bundle);
            return;
        }
        v49.getClass();
        h.s("Unexpected call on client side");
    }

    public void g(Object obj) {
        Void voidR = (Void) obj;
        ((xb7) ((uy5) this.x).x).a.p();
    }

    public Object get() {
        switch (this.w) {
            case 23:
                return new xn5(new o99((x77) ((kd6) this.x).y));
            case 24:
                Object obj = x49.j;
                return (q99) ((o75) ((x77) this.x).get()).c();
            default:
                ca9 ca9 = (ca9) this.x;
                jm4 jm4 = (jm4) ca9.c.get();
                jm4.getClass();
                a69 a69 = (a69) ca9.b.get();
                a69.getClass();
                b49 b49 = a69.a;
                za0 b = i93.b();
                b.d = new uy5(17, (Object) b49);
                b.e = new cc2[]{mp7.G};
                b.c = false;
                f0 b2 = a69.b(b49.b(0, b.a()));
                on8 on8 = on8.A;
                int i = h0.H;
                h0 h0Var = new h0(b2, zzmk.class, on8);
                b2.a(h0Var, ag8.E(jm4, h0Var));
                i3 f = pt2.f(h0Var, new n89(2, ca9), jm4);
                f.a(new m89(5, (Object) f), jm4);
                return f;
        }
    }

    public int h() {
        return ((xy5) this.x).E();
    }

    public long i(float f, float f2) {
        long floatToRawIntBits = (long) Float.floatToRawIntBits(f);
        long b = eh4.b((((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (floatToRawIntBits << 32), (float[]) this.x);
        return mh2.a(Float.intBitsToFloat((int) (b >> 32)), Float.intBitsToFloat((int) (b & 4294967295L)));
    }

    public /* synthetic */ void j(String str, int i, Throwable th, byte[] bArr, Map map) {
        ((v89) this.x).w(str, i, th, bArr, map);
    }

    public int k() {
        xy5 xy5 = (xy5) this.x;
        return xy5.n - xy5.F();
    }

    public ji8 l(String str) {
        Class<?> cls;
        v16 e;
        ClassLoader classLoader = (ClassLoader) this.x;
        str.getClass();
        try {
            cls = Class.forName(str, false, classLoader);
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        if (cls == null || (e = ub5.e(cls)) == null) {
            return null;
        }
        return new ji8(28, (Object) e);
    }

    public void m() {
        View view = (View) this.x;
        if (view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    public void n(lz5 lz5, dv5 dv5, dv5 dv52) {
        boolean z;
        RecyclerView recyclerView = (RecyclerView) this.x;
        lz5.n(false);
        jm1 jm1 = (jm1) recyclerView.h0;
        if (dv5 != null) {
            jm1.getClass();
            int i = dv5.b;
            int i2 = dv52.b;
            if (!(i == i2 && dv5.c == dv52.c)) {
                z = jm1.g(lz5, i, dv5.c, i2, dv52.c);
                if (!z) {
                    recyclerView.S();
                    return;
                }
                return;
            }
        }
        lz5 lz52 = lz5;
        jm1.l(lz52);
        lz52.a.setAlpha(0.0f);
        jm1.i.add(lz52);
        z = true;
        if (!z) {
        }
    }

    public void o(lz5 lz5, dv5 dv5, dv5 dv52) {
        int i;
        int i2;
        boolean z;
        RecyclerView recyclerView = (RecyclerView) this.x;
        recyclerView.x.k(lz5);
        recyclerView.f(lz5);
        lz5.n(false);
        jm1 jm1 = (jm1) recyclerView.h0;
        jm1.getClass();
        int i3 = dv5.b;
        int i4 = dv5.c;
        View view = lz5.a;
        if (dv52 == null) {
            i = view.getLeft();
        } else {
            i = dv52.b;
        }
        int i5 = i;
        if (dv52 == null) {
            i2 = view.getTop();
        } else {
            i2 = dv52.c;
        }
        int i6 = i2;
        if (lz5.h() || (i3 == i5 && i4 == i6)) {
            lz5 lz52 = lz5;
            jm1.l(lz52);
            jm1.h.add(lz52);
            z = true;
        } else {
            view.layout(i5, i6, view.getWidth() + i5, view.getHeight() + i6);
            z = jm1.g(lz5, i3, i4, i5, i6);
        }
        if (z) {
            recyclerView.S();
        }
    }

    public hv2 p(kg5 kg5, je jeVar) {
        boolean z;
        long j;
        long j2;
        kg5 kg52 = kg5;
        vc4 vc4 = (vc4) this.x;
        List list = (List) kg52.x;
        vc4 vc42 = new vc4(list.size());
        int size = list.size();
        int i = 0;
        while (i < size) {
            sk5 sk5 = (sk5) list.get(i);
            long j3 = sk5.a;
            rk5 rk5 = (rk5) vc4.b(j3);
            if (rk5 == null) {
                j2 = sk5.b;
                j = sk5.d;
                z = false;
                je jeVar2 = jeVar;
            } else {
                long j4 = rk5.a;
                boolean z2 = rk5.c;
                j2 = j4;
                z = z2;
                j = jeVar.G(rk5.b);
            }
            long j5 = sk5.a;
            long j6 = sk5.b;
            int i2 = i;
            List list2 = list;
            int i3 = size;
            long j7 = j5;
            long j8 = j6;
            long j9 = j7;
            vc42.e(j9, new qk5(j7, j8, sk5.d, sk5.e, sk5.f, j2, j, z, sk5.g, sk5.i, sk5.j, sk5.k, sk5.l, sk5.m));
            boolean z3 = sk5.e;
            if (z3) {
                vc4.e(j3, new rk5(sk5.b, sk5.c, z3));
            } else {
                vc4.f(j3);
            }
            i = i2 + 1;
            list = list2;
            size = i3;
        }
        return new hv2(4, (Object) vc42, (Object) kg52);
    }

    public View q(int i) {
        return ((xy5) this.x).u(i);
    }

    public int r(View view) {
        return view.getRight() + ((yy5) view.getLayoutParams()).b.right + ((yy5) view.getLayoutParams()).rightMargin;
    }

    public void s() {
        View view;
        View view2 = (View) this.x;
        if (view2 != null) {
            if (view2.isInEditMode() || view2.onCheckIsTextEditor()) {
                view2.requestFocus();
                view = view2;
            } else {
                view = view2.getRootView().findFocus();
            }
            if (view == null) {
                view = view2.getRootView().findViewById(16908290);
            }
            if (view != null && view.hasWindowFocus()) {
                view.post(new hy6(view, 0));
            }
        }
    }

    public g79 t(String str, boolean z) {
        return new g79(str, (uw2) this.x, z);
    }

    public String toString() {
        switch (this.w) {
            case 18:
                StringBuilder sb = new StringBuilder("1");
                for (f39 f39 : f39.values()) {
                    xp8 xp8 = (xp8) ((EnumMap) this.x).get(f39);
                    if (xp8 == null) {
                        xp8 = xp8.UNSET;
                    }
                    sb.append(xp8.w);
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public void u(f39 f39, int i) {
        xp8 xp8;
        if (i != -30) {
            if (i != -20) {
                if (i == -10) {
                    xp8 = xp8.MANIFEST;
                } else if (i != 0) {
                    if (i != 30) {
                        xp8 = xp8.UNSET;
                    } else {
                        xp8 = xp8.INITIALIZATION;
                    }
                }
            }
            xp8 = xp8.API;
        } else {
            xp8 = xp8.TCF;
        }
        ((EnumMap) this.x).put(f39, xp8);
    }

    public void w(f39 f39, xp8 xp8) {
        ((EnumMap) this.x).put(f39, xp8);
    }

    public /* synthetic */ rg4(int i, boolean z) {
        this.w = i;
    }

    public rg4(ge2 ge2, x84 x84) {
        this.w = 15;
        this.x = ge2;
    }

    public rg4(br4 br4, uy5 uy5) {
        this.w = 17;
        this.x = uy5;
        Objects.requireNonNull(br4);
    }

    public rg4(EnumMap enumMap) {
        this.w = 18;
        EnumMap enumMap2 = new EnumMap(f39.class);
        this.x = enumMap2;
        enumMap2.putAll(enumMap);
    }

    public /* synthetic */ rg4(int i, Object obj) {
        this.w = i;
        this.x = obj;
    }

    public rg4(float f, float f2) {
        this.w = 12;
        this.x = new qh2(f, f2, 0.01f);
    }

    public ih2 get(int i) {
        return (qh2) this.x;
    }
}
