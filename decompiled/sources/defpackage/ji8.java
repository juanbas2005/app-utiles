package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.datastore.preferences.protobuf.a;
import androidx.work.impl.WorkDatabase;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.ReaderException;
import com.google.zxing.common.reedsolomon.ReedSolomonException;
import cu.lestebang.utiletecsa.R;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.TreeSet;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ji8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class ji8 implements ri4, l45, dq, tb7, x50, s51, e77, g35, m57, r8 {
    public static final String[] A = {"CTRL_PS", " ", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "CTRL_US", "CTRL_ML", "CTRL_DL", "CTRL_BS"};
    public static final String[] B = {"CTRL_PS", " ", "\u0001", "\u0002", "\u0003", "\u0004", "\u0005", "\u0006", "\u0007", "\b", "\t", "\n", "\u000b", "\f", "\r", "\u001b", "\u001c", "\u001d", "\u001e", "\u001f", "@", "\\", "^", "_", "`", "|", "~", "", "CTRL_LL", "CTRL_UL", "CTRL_PL", "CTRL_BS"};
    public static final String[] C = {"", "\r", "\r\n", ". ", ", ", ": ", "!", "\"", "#", "$", "%", "&", "'", "(", ")", "*", "+", ",", "-", ".", "/", ":", ";", "<", "=", ">", "?", "[", "]", "{", "}", "CTRL_UL"};
    public static final String[] D = {"CTRL_PS", " ", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", ",", ".", "CTRL_UL", "CTRL_US"};
    public static final vc9 E = new Object();
    public static ji8 y;
    public static final String[] z = {"CTRL_PS", " ", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "CTRL_LL", "CTRL_ML", "CTRL_DL", "CTRL_BS"};
    public final /* synthetic */ int w;
    public Object x;

    public ji8(int i) {
        this.w = i;
        switch (i) {
            case 12:
                TimeUnit.MINUTES.getClass();
                bc7 bc7 = bc7.l;
                bc7.getClass();
                this.x = new m22(bc7);
                return;
            case h75.g:
                this.x = e37.a(ks7.b);
                return;
            case 16:
                this.x = new br4(8, (Object) gv2.m);
                return;
            case 19:
                this.x = new TreeSet(dh4.u);
                return;
            case 22:
                this.x = vl4.e;
                return;
            case 24:
                this.x = null;
                return;
            case 29:
                this.x = new eq4(new x14[16]);
                return;
            default:
                this.x = new AtomicReference((Object) null);
                return;
        }
    }

    public static int A(boolean[] zArr, int i, int i2) {
        int i3 = 0;
        for (int i4 = i; i4 < i + i2; i4++) {
            i3 <<= 1;
            if (zArr[i4]) {
                i3 |= 1;
            }
        }
        return i3;
    }

    public static synchronized ji8 I(Context context) {
        ji8 ji8;
        synchronized (ji8.class) {
            Context applicationContext = context.getApplicationContext();
            synchronized (ji8.class) {
                ji8 = y;
                if (ji8 == null) {
                    ji8 = new ji8(applicationContext);
                    y = ji8;
                }
            }
        }
        return ji8;
    }

    public static void K(String str, uc9 uc9) {
        StringBuilder sb = new StringBuilder();
        sb.append(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ").format(new Date(uc9.b / 1000000)));
        sb.append(": logging error [");
        fd9 fd9 = uc9.d;
        if (fd9 != null) {
            t75.N(1, fd9, sb);
            sb.append("]: ");
            sb.append(str);
            System.err.println(sb);
            System.err.flush();
            return;
        }
        h.s("cannot request log site information prior to postProcess()");
    }

    public void B(df3 df3) {
        Object obj = this.x;
        if (sg3.e(obj, df3)) {
            this.x = null;
        } else if (obj instanceof up4) {
            up4 up4 = (up4) obj;
            up4.l(df3);
            int i = up4.d;
            if (i == 0) {
                this.x = null;
            } else if (i == 1) {
                Object[] objArr = up4.b;
                long[] jArr = up4.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    while (true) {
                        long j = jArr[i2];
                        if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                            int i3 = 8 - ((~(i2 - length)) >>> 31);
                            int i4 = 0;
                            while (i4 < i3) {
                                if ((255 & j) < 128) {
                                    this.x = objArr[(i2 << 3) + i4];
                                    return;
                                } else {
                                    j >>= 8;
                                    i4++;
                                }
                            }
                            if (i3 != 8) {
                                break;
                            }
                        }
                        if (i2 == length) {
                            break;
                        }
                        i2++;
                    }
                }
                kj6.i("The ScatterSet is empty");
            }
        }
    }

    public boolean C(uy3 uy3) {
        if (!uy3.J()) {
            yb3.b("DepthSortedSet.remove called on an unattached node");
        }
        return ((my6) this.x).remove(uy3);
    }

    public void D(float f, long j) {
        qk0 D2 = ((wr0) this.x).D();
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        D2.o(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
        D2.d(f);
        D2.o(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
    }

    public void E(float f, float f2, long j) {
        qk0 D2 = ((wr0) this.x).D();
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        D2.o(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
        D2.b(f, f2);
        D2.o(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
    }

    public void F(float f, float f2) {
        ((wr0) this.x).D().o(f, f2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: y27} */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0026, code lost:
        if (r5.a > ((defpackage.de1) r1).a) goto L_0x003c;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    public void G(y27 y27) {
        Object value;
        y27 y272;
        y27.getClass();
        d37 d37 = (d37) this.x;
        do {
            value = d37.getValue();
            y272 = value;
            if (!(y272 instanceof lw5) && !sg3.e(y272, ks7.b)) {
                if (!(y272 instanceof de1)) {
                    if (!(y272 instanceof be2)) {
                        if (y272 instanceof qz4) {
                            h.s("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                            return;
                        } else {
                            h.c();
                            return;
                        }
                    }
                }
            }
            y272 = y27;
        } while (!d37.i(value, y272));
    }

    public void H(int i, Object obj, pg6 pg6) {
        ws0 ws0 = (ws0) this.x;
        ws0.B(i, 3);
        pg6.g((a) obj, ws0.a);
        ws0.B(i, 4);
    }

    public synchronized void J() {
        d47 d47 = (d47) this.x;
        ReentrantLock reentrantLock = d47.a;
        reentrantLock.lock();
        try {
            d47.b.edit().clear().apply();
        } finally {
            reentrantLock.unlock();
        }
    }

    public boolean a(q51 q51) {
        q51.getClass();
        return q51.a((q51) this.x);
    }

    public void b(Object obj) {
        int i;
        Map map = (Map) obj;
        rq2 rq2 = (rq2) this.x;
        String[] strArr = (String[]) map.keySet().toArray(new String[0]);
        ArrayList arrayList = new ArrayList(map.values());
        int[] iArr = new int[arrayList.size()];
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            if (((Boolean) arrayList.get(i2)).booleanValue()) {
                i = 0;
            } else {
                i = -1;
            }
            iArr[i2] = i;
        }
        nq2 nq2 = (nq2) rq2.F.pollFirst();
        if (nq2 == null) {
            Log.w("FragmentManager", "No permissions were requested for " + this);
            return;
        }
        String str = nq2.w;
        if (rq2.c.A(str) == null) {
            Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
        }
    }

    public void c(Drawable drawable) {
        vb5 vb5;
        qt qtVar = (qt) this.x;
        if (drawable != null) {
            vb5 = qtVar.k(drawable);
        } else {
            vb5 = null;
        }
        qtVar.l(new kt(vb5));
    }

    public void d(mi4 mi4, Bitmap bitmap, Map map) {
        ((qa) this.x).m(mi4, bitmap, map, kl8.o(bitmap));
    }

    public void f(m11 m11) {
        boolean z2;
        if (m11.x == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        y50 y50 = (y50) this.x;
        if (z2) {
            y50.j((j73) null, y50.k());
            return;
        }
        w50 w50 = y50.p;
        if (w50 != null) {
            w50.b(m11);
        }
    }

    public boolean g(ti4 ti4, MenuItem menuItem) {
        g8 g8Var = ((ActionMenuView) this.x).V;
        if (g8Var == null) {
            return false;
        }
        Iterator it = ((CopyOnWriteArrayList) ((Toolbar) ((ay4) g8Var).x).f0.y).iterator();
        while (it.hasNext()) {
            if (((kq2) it.next()).a.p()) {
                return true;
            }
        }
        return false;
    }

    public ni4 h(mi4 mi4) {
        return null;
    }

    public db8 i(View view, db8 db8) {
        int i;
        int i2;
        boolean z2;
        db8 db82;
        qa8 qa8;
        int i3;
        int i4;
        boolean z3;
        int i5;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i6;
        View view2 = view;
        db8 db83 = db8;
        int d = db83.d();
        wo woVar = (wo) this.x;
        Context context = woVar.G;
        int d2 = db83.d();
        ActionBarContextView actionBarContextView = woVar.Q;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            i2 = 0;
            i = 8;
            z2 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) woVar.Q.getLayoutParams();
            boolean z4 = true;
            if (woVar.Q.isShown()) {
                if (woVar.y0 == null) {
                    woVar.y0 = new Rect();
                    woVar.z0 = new Rect();
                }
                Rect rect = woVar.y0;
                Rect rect2 = woVar.z0;
                rect.set(db83.b(), db83.d(), db83.c(), db83.a());
                ViewGroup viewGroup = woVar.W;
                Class<Rect> cls = Rect.class;
                if (Build.VERSION.SDK_INT >= 29) {
                    boolean z5 = o68.a;
                    m68.a(viewGroup, rect, rect2);
                } else {
                    if (!o68.a) {
                        o68.a = true;
                        try {
                            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", new Class[]{cls, cls});
                            o68.b = declaredMethod;
                            if (!declaredMethod.isAccessible()) {
                                o68.b.setAccessible(true);
                            }
                        } catch (NoSuchMethodException unused) {
                            Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
                        }
                    }
                    Method method = o68.b;
                    if (method != null) {
                        try {
                            method.invoke(viewGroup, new Object[]{rect, rect2});
                        } catch (Exception e) {
                            Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e);
                        }
                    }
                }
                int i7 = rect.top;
                int i8 = rect.left;
                int i9 = rect.right;
                ViewGroup viewGroup2 = woVar.W;
                WeakHashMap weakHashMap = e58.a;
                db8 a = x48.a(viewGroup2);
                if (a == null) {
                    i3 = 0;
                } else {
                    i3 = a.b();
                }
                if (a == null) {
                    i4 = 0;
                } else {
                    i4 = a.c();
                }
                if (marginLayoutParams2.topMargin == i7 && marginLayoutParams2.leftMargin == i8 && marginLayoutParams2.rightMargin == i9) {
                    z3 = false;
                } else {
                    marginLayoutParams2.topMargin = i7;
                    marginLayoutParams2.leftMargin = i8;
                    marginLayoutParams2.rightMargin = i9;
                    z3 = true;
                }
                if (i7 <= 0 || woVar.Y != null) {
                    i = 8;
                    View view3 = woVar.Y;
                    if (!(view3 == null || ((marginLayoutParams = (ViewGroup.MarginLayoutParams) view3.getLayoutParams()).height == (i6 = marginLayoutParams2.topMargin) && marginLayoutParams.leftMargin == i3 && marginLayoutParams.rightMargin == i4))) {
                        marginLayoutParams.height = i6;
                        marginLayoutParams.leftMargin = i3;
                        marginLayoutParams.rightMargin = i4;
                        woVar.Y.setLayoutParams(marginLayoutParams);
                    }
                } else {
                    View view4 = new View(context);
                    woVar.Y = view4;
                    i = 8;
                    view4.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams2.topMargin, 51);
                    layoutParams.leftMargin = i3;
                    layoutParams.rightMargin = i4;
                    woVar.W.addView(woVar.Y, -1, layoutParams);
                }
                View view5 = woVar.Y;
                if (view5 == null) {
                    z4 = false;
                }
                if (z4 && view5.getVisibility() != 0) {
                    View view6 = woVar.Y;
                    if ((view6.getWindowSystemUiVisibility() & 8192) != 0) {
                        i5 = context.getColor(R.color.abc_decor_view_status_guard_light);
                    } else {
                        i5 = context.getColor(R.color.abc_decor_view_status_guard);
                    }
                    view6.setBackgroundColor(i5);
                }
                if (!woVar.d0 && z4) {
                    d2 = 0;
                }
                i2 = 0;
                z2 = z4;
                z4 = z3;
            } else {
                i = 8;
                i2 = 0;
                if (marginLayoutParams2.topMargin != 0) {
                    marginLayoutParams2.topMargin = 0;
                    z2 = false;
                } else {
                    z2 = false;
                    z4 = false;
                }
            }
            if (z4) {
                woVar.Q.setLayoutParams(marginLayoutParams2);
            }
        }
        View view7 = woVar.Y;
        if (view7 != null) {
            if (z2) {
                i = i2;
            }
            view7.setVisibility(i);
        }
        if (d != d2) {
            int b = db83.b();
            int c = db83.c();
            int a2 = db83.a();
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 36) {
                qa8 = new pa8(db83);
            } else if (i10 >= 35) {
                qa8 = new oa8(db83);
            } else if (i10 >= 34) {
                qa8 = new na8(db83);
            } else if (i10 >= 31) {
                qa8 = new ma8(db83);
            } else if (i10 >= 30) {
                qa8 = new la8(db83);
            } else if (i10 >= 29) {
                qa8 = new ka8(db83);
            } else {
                qa8 = new ia8(db83);
            }
            qa8.h(ad3.b(b, d2, c, a2));
            db82 = qa8.b();
        } else {
            db82 = db83;
        }
        WeakHashMap weakHashMap2 = e58.a;
        WindowInsets f = db82.f();
        if (f == null) {
            return db82;
        }
        WindowInsets onApplyWindowInsets = view2.onApplyWindowInsets(f);
        if (!onApplyWindowInsets.equals(f)) {
            return db8.g(view2, onApplyWindowInsets);
        }
        return db82;
    }

    public void m(Object obj) {
        t54 t54 = (t54) obj;
        ou1 ou1 = (ou1) this.x;
        if (t54 != null && ou1.A0) {
            View M = ou1.M();
            if (M.getParent() != null) {
                h.s("DialogFragment can not be attached to a container view");
            } else if (ou1.E0 != null) {
                if (rq2.L(3)) {
                    Log.d("FragmentManager", "DialogFragment " + this + " setting the content view on " + ou1.E0);
                }
                ou1.E0.setContentView(M);
            }
        }
    }

    public void n(df3 df3) {
        Object obj = this.x;
        if (obj == null) {
            this.x = df3;
        } else if (obj instanceof up4) {
            ((up4) obj).a(df3);
        } else if (!obj.equals(df3)) {
            up4 up4 = cg6.a;
            up4 up42 = new up4(2);
            up42.k((df3) obj);
            up42.k(df3);
            this.x = up42;
        }
    }

    public void o(uy3 uy3) {
        if (!uy3.J()) {
            yb3.b("DepthSortedSet.add called on an unattached node");
        }
        ((my6) this.x).add(uy3);
    }

    public void p(float f, float f2, float f3, float f4, int i) {
        ((wr0) this.x).D().n(f, f2, f3, f4, i);
    }

    public yb9 q(Object obj) {
        bo6 bo6 = (bo6) obj;
        k91 k91 = ((i91) this.x).e;
        if (bo6 != null) {
            return b35.A(Arrays.asList(new yb9[]{k91.a(k91), k91.m.B0((String) null, (ya1) k91.e.x)}));
        }
        Log.w("FirebaseCrashlytics", "Received null app settings, cannot send reports at crash time.", (Throwable) null);
        return b35.l((Object) null);
    }

    public fv0 r(d30 d30) {
        int i;
        int i2;
        int i3;
        gv2 gv2;
        Throwable th;
        int i4;
        String str;
        int i5;
        int A2;
        boolean z2;
        boolean z3;
        d30 d302 = d30;
        this.x = d302;
        k90 k90 = d302.a;
        boolean z4 = d302.c;
        int i6 = d302.e;
        if (z4) {
            i = 11;
        } else {
            i = 14;
        }
        int i7 = i + (i6 << 2);
        int[] iArr = new int[i7];
        if (z4) {
            i2 = 88;
        } else {
            i2 = 112;
        }
        int i8 = (i2 + (i6 << 4)) * i6;
        boolean[] zArr = new boolean[i8];
        char c = 2;
        int i9 = 1;
        if (z4) {
            for (int i10 = 0; i10 < i7; i10++) {
                iArr[i10] = i10;
            }
        } else {
            int i11 = i7 / 2;
            int i12 = ((((i11 - 1) / 15) * 2) + (i7 + 1)) / 2;
            for (int i13 = 0; i13 < i11; i13++) {
                int i14 = (i13 / 15) + i13;
                iArr[(i11 - i13) - 1] = (i12 - i14) - 1;
                iArr[i11 + i13] = i14 + i12 + 1;
            }
        }
        int i15 = 0;
        int i16 = 0;
        while (true) {
            i3 = 12;
            if (i15 >= i6) {
                break;
            }
            int i17 = (i6 - i15) << c;
            if (z4) {
                i3 = 9;
            }
            int i18 = i17 + i3;
            int i19 = i15 << 1;
            int i20 = (i7 - 1) - i19;
            int i21 = 0;
            while (i21 < i18) {
                int i22 = i21 << 1;
                int i23 = 0;
                while (i23 < c) {
                    int i24 = i19 + i23;
                    int i25 = i9;
                    int i26 = i19 + i21;
                    zArr[i16 + i22 + i23] = k90.b(iArr[i24], iArr[i26]);
                    int i27 = i20 - i23;
                    zArr[(i18 * 2) + i16 + i22 + i23] = k90.b(iArr[i26], iArr[i27]);
                    int i28 = i20 - i21;
                    zArr[(i18 * 4) + i16 + i22 + i23] = k90.b(iArr[i27], iArr[i28]);
                    zArr[(i18 * 6) + i16 + i22 + i23] = k90.b(iArr[i28], iArr[i24]);
                    i23++;
                    i9 = i25;
                    i6 = i6;
                    c = 2;
                }
                int i29 = i6;
                int i30 = i9;
                i21++;
                c = 2;
            }
            int i31 = i9;
            i16 += i18 << 3;
            i15++;
            i6 = i6;
            c = 2;
        }
        int i32 = i9;
        d30 d303 = (d30) this.x;
        int i33 = d303.e;
        int i34 = 8;
        if (i33 <= 2) {
            gv2 = gv2.j;
            i3 = 6;
        } else if (i33 <= 8) {
            gv2 = gv2.n;
            i3 = 8;
        } else if (i33 <= 22) {
            gv2 = gv2.i;
            i3 = 10;
        } else {
            gv2 = gv2.h;
        }
        int i35 = d303.d;
        int i36 = i8 / i3;
        if (i36 >= i35) {
            int i37 = i8 % i3;
            int[] iArr2 = new int[i36];
            int i38 = 0;
            while (i38 < i36) {
                iArr2[i38] = A(zArr, i37, i3);
                i38++;
                i37 += i3;
            }
            try {
                new br4(8, (Object) gv2).x(iArr2, i36 - i35);
                int i39 = i32 << i3;
                int i40 = i39 - 1;
                int i41 = 0;
                int i42 = 0;
                while (i41 < i35) {
                    int i43 = iArr2[i41];
                    if (i43 == 0 || i43 == i40) {
                        throw FormatException.a();
                    }
                    if (i43 == i32 || i43 == i39 - 2) {
                        i42++;
                    }
                    i41++;
                    i32 = 1;
                }
                int i44 = (i35 * i3) - i42;
                boolean[] zArr2 = new boolean[i44];
                int i45 = 0;
                for (int i46 = 0; i46 < i35; i46++) {
                    int i47 = iArr2[i46];
                    int i48 = 1;
                    if (i47 == 1 || i47 == i39 - 2) {
                        int i49 = (i45 + i3) - 1;
                        if (i47 > 1) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        Arrays.fill(zArr2, i45, i49, z2);
                        i45 = (i3 - 1) + i45;
                    } else {
                        int i50 = i3 - 1;
                        while (i50 >= 0) {
                            int i51 = i45 + 1;
                            if ((i47 & (i48 << i50)) != 0) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            zArr2[i45] = z3;
                            i50--;
                            i45 = i51;
                            i48 = 1;
                        }
                    }
                }
                int i52 = (i44 + 7) / 8;
                byte[] bArr = new byte[i52];
                for (int i53 = 0; i53 < i52; i53++) {
                    int i54 = i53 << 3;
                    int i55 = i44 - i54;
                    if (i55 >= 8) {
                        A2 = A(zArr2, i54, 8);
                    } else {
                        A2 = A(zArr2, i54, i55) << (8 - i55);
                    }
                    bArr[i53] = (byte) A2;
                }
                StringBuilder sb = new StringBuilder(20);
                int i56 = 1;
                int i57 = 0;
                int i58 = 1;
                while (i57 < i44) {
                    if (i58 == 6) {
                        if (i44 - i57 < 5) {
                            break;
                        }
                        int A3 = A(zArr2, i57, 5);
                        int i59 = i57 + 5;
                        if (A3 == 0) {
                            if (i44 - i59 < 11) {
                                break;
                            }
                            A3 = A(zArr2, i59, 11) + 31;
                            i59 = i57 + 16;
                        }
                        int i60 = 0;
                        while (true) {
                            if (i60 >= A3) {
                                i57 = i59;
                                break;
                            } else if (i44 - i59 < i34) {
                                i57 = i44;
                                break;
                            } else {
                                sb.append((char) A(zArr2, i59, i34));
                                i59 += 8;
                                i60++;
                            }
                        }
                        i58 = i56;
                    } else {
                        if (i58 == 4) {
                            i4 = 4;
                        } else {
                            i4 = 5;
                        }
                        if (i44 - i57 < i4) {
                            break;
                        }
                        int A4 = A(zArr2, i57, i4);
                        i57 += i4;
                        int B2 = b81.B(i58);
                        if (B2 == 0) {
                            i5 = 2;
                            str = z[A4];
                        } else if (B2 != 1) {
                            i5 = 2;
                            if (B2 == 2) {
                                str = B[A4];
                            } else if (B2 == 3) {
                                str = D[A4];
                            } else if (B2 == 4) {
                                str = C[A4];
                            } else {
                                h.s("Bad table");
                                return null;
                            }
                        } else {
                            i5 = 2;
                            str = A[A4];
                        }
                        if (str.startsWith("CTRL_")) {
                            char charAt = str.charAt(5);
                            if (charAt == 'B') {
                                i56 = 6;
                            } else if (charAt == 'D') {
                                i56 = 4;
                            } else if (charAt == 'P') {
                                i56 = 5;
                            } else if (charAt == 'L') {
                                i56 = i5;
                            } else if (charAt != 'M') {
                                i56 = 1;
                            } else {
                                i56 = 3;
                            }
                            if (str.charAt(6) != 'L') {
                                int i61 = i58;
                                i58 = i56;
                                i56 = i61;
                                i34 = 8;
                            }
                        } else {
                            sb.append(str);
                        }
                        i58 = i56;
                        i34 = 8;
                    }
                }
                return new fv0(bArr, sb.toString(), (ArrayList) null, (String) null);
            } catch (ReedSolomonException e) {
                FormatException formatException = FormatException.y;
                if (ReaderException.w) {
                    th = new Exception(e);
                } else {
                    th = FormatException.y;
                }
                throw th;
            }
        } else {
            throw FormatException.a();
        }
    }

    public void s(ti4 ti4) {
        br4 br4 = ((ActionMenuView) this.x).Q;
        if (br4 != null) {
            br4.s(ti4);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v1, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v2, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v3, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v4, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v5, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v41, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v42, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v43, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v6, resolved type: java.util.ArrayList} */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x03cb, code lost:
        r7 = r8;
        r20 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:432:0x067d, code lost:
        if (r4.length() <= 0) goto L_0x0682;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:433:0x067f, code lost:
        r3.append(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:434:0x0682, code lost:
        r2 = r3.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:435:0x068c, code lost:
        if (r6.isEmpty() == false) goto L_0x0692;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:436:0x068e, code lost:
        r6 = r20;
        r7 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:437:0x0692, code lost:
        r7 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:439:0x0697, code lost:
        return new defpackage.fv0(r0, r2, r6, r7);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    public fv0 t(k90 k90) {
        byte[] bArr;
        boolean z2;
        int i;
        int i2;
        ArrayList arrayList;
        int i3;
        int b;
        int b2;
        int b3;
        int i4;
        int i5;
        int i6;
        wr0 wr0 = new wr0(k90);
        e48 e48 = (e48) wr0.z;
        k90 k902 = (k90) wr0.y;
        int i7 = e48.g;
        byte[] bArr2 = new byte[i7];
        k90 k903 = (k90) wr0.x;
        int i8 = k903.x;
        int i9 = k903.w;
        int i10 = 0;
        int i11 = 0;
        boolean z3 = false;
        int i12 = 0;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        int i13 = 4;
        while (true) {
            if (i13 == i8 && i11 == 0 && !z3) {
                int i14 = i12 + 1;
                int i15 = i8 - 1;
                int X = wr0.X(i15, i10, i8, i9) << 1;
                if (wr0.X(i15, 1, i8, i9)) {
                    X |= 1;
                }
                int i16 = X << 1;
                if (wr0.X(i15, 2, i8, i9)) {
                    i16 |= 1;
                }
                int i17 = i16 << 1;
                bArr = bArr2;
                if (wr0.X(0, i9 - 2, i8, i9)) {
                    i17 |= 1;
                }
                int i18 = i17 << 1;
                int i19 = i9 - 1;
                if (wr0.X(0, i19, i8, i9)) {
                    i18 |= 1;
                }
                int i20 = i18 << 1;
                if (wr0.X(1, i19, i8, i9)) {
                    i20 |= 1;
                }
                int i21 = i20 << 1;
                if (wr0.X(2, i19, i8, i9)) {
                    i21 |= 1;
                }
                int i22 = i21 << 1;
                if (wr0.X(3, i19, i8, i9)) {
                    i22 |= 1;
                }
                bArr[i12] = (byte) i22;
                i13 -= 2;
                i11 += 2;
                i12 = i14;
                z3 = true;
            } else {
                bArr = bArr2;
                int i23 = i8 - 2;
                if (i13 == i23 && i11 == 0 && (i9 & 3) != 0 && !z4) {
                    int i24 = i12 + 1;
                    int X2 = wr0.X(i8 - 3, 0, i8, i9) << 1;
                    if (wr0.X(i23, 0, i8, i9)) {
                        X2 |= 1;
                    }
                    int i25 = X2 << 1;
                    if (wr0.X(i8 - 1, 0, i8, i9)) {
                        i25 |= 1;
                    }
                    int i26 = i25 << 1;
                    if (wr0.X(0, i9 - 4, i8, i9)) {
                        i26 |= 1;
                    }
                    int i27 = i26 << 1;
                    if (wr0.X(0, i9 - 3, i8, i9)) {
                        i27 |= 1;
                    }
                    int i28 = i27 << 1;
                    if (wr0.X(0, i9 - 2, i8, i9)) {
                        i28 |= 1;
                    }
                    int i29 = i28 << 1;
                    int i30 = i9 - 1;
                    if (wr0.X(0, i30, i8, i9)) {
                        i29 |= 1;
                    }
                    int i31 = i29 << 1;
                    if (wr0.X(1, i30, i8, i9)) {
                        i31 |= 1;
                    }
                    bArr[i12] = (byte) i31;
                    i13 -= 2;
                    i11 += 2;
                    i12 = i24;
                    z4 = true;
                } else if (i13 == i8 + 4 && i11 == 2 && (i9 & 7) == 0 && !z5) {
                    int i32 = i12 + 1;
                    int i33 = i8 - 1;
                    int X3 = wr0.X(i33, 0, i8, i9) << 1;
                    int i34 = i9 - 1;
                    if (wr0.X(i33, i34, i8, i9)) {
                        X3 |= 1;
                    }
                    int i35 = X3 << 1;
                    int i36 = i9 - 3;
                    int i37 = i32;
                    if (wr0.X(0, i36, i8, i9)) {
                        i35 |= 1;
                    }
                    int i38 = i35 << 1;
                    int i39 = i9 - 2;
                    if (wr0.X(0, i39, i8, i9)) {
                        i38 |= 1;
                    }
                    int i40 = i38 << 1;
                    if (wr0.X(0, i34, i8, i9)) {
                        i40 |= 1;
                    }
                    int i41 = i40 << 1;
                    if (wr0.X(1, i36, i8, i9)) {
                        i6 = i41 | 1;
                    } else {
                        i6 = i41;
                    }
                    int i42 = i6 << 1;
                    if (wr0.X(1, i39, i8, i9)) {
                        i42 |= 1;
                    }
                    int i43 = i42 << 1;
                    if (wr0.X(1, i34, i8, i9)) {
                        i43 |= 1;
                    }
                    bArr[i12] = (byte) i43;
                    i13 -= 2;
                    i11 += 2;
                    i12 = i37;
                    z5 = true;
                } else if (i13 == i23 && i11 == 0 && (i9 & 7) == 4 && !z6) {
                    int i44 = i12 + 1;
                    int X4 = wr0.X(i8 - 3, 0, i8, i9) << 1;
                    if (wr0.X(i23, 0, i8, i9)) {
                        X4 |= 1;
                    }
                    int i45 = X4 << 1;
                    if (wr0.X(i8 - 1, 0, i8, i9)) {
                        i45 |= 1;
                    }
                    int i46 = i45 << 1;
                    if (wr0.X(0, i9 - 2, i8, i9)) {
                        i46 |= 1;
                    }
                    int i47 = i46 << 1;
                    int i48 = i9 - 1;
                    if (wr0.X(0, i48, i8, i9)) {
                        i47 |= 1;
                    }
                    int i49 = i47 << 1;
                    if (wr0.X(1, i48, i8, i9)) {
                        i49 |= 1;
                    }
                    int i50 = i49 << 1;
                    if (wr0.X(2, i48, i8, i9)) {
                        i50 |= 1;
                    }
                    int i51 = i50 << 1;
                    if (wr0.X(3, i48, i8, i9)) {
                        i51 |= 1;
                    }
                    bArr[i12] = (byte) i51;
                    i13 -= 2;
                    i11 += 2;
                    i12 = i44;
                    z6 = true;
                } else {
                    while (true) {
                        if (i13 < i8 && i11 >= 0 && !k902.b(i11, i13)) {
                            bArr[i12] = (byte) wr0.Y(i13, i11, i8, i9);
                            i12++;
                        }
                        int i52 = i13 - 2;
                        int i53 = i11 + 2;
                        if (i52 < 0 || i53 >= i9) {
                            int i54 = i13 - 1;
                            int i55 = i11 + 5;
                        } else {
                            i13 = i52;
                            i11 = i53;
                        }
                    }
                    int i542 = i13 - 1;
                    int i552 = i11 + 5;
                    while (true) {
                        if (i542 >= 0 && i552 < i9 && !k902.b(i552, i542)) {
                            bArr[i12] = (byte) wr0.Y(i542, i552, i8, i9);
                            i12++;
                        }
                        int i56 = i542 + 2;
                        int i57 = i552 - 2;
                        if (i56 >= i8 || i57 < 0) {
                            i13 = i542 + 5;
                            i11 = i552 - 1;
                        } else {
                            i542 = i56;
                            i552 = i57;
                        }
                    }
                    i13 = i542 + 5;
                    i11 = i552 - 1;
                }
            }
            if (i13 >= i8 && i11 >= i9) {
                break;
            }
            i10 = 0;
            bArr2 = bArr;
        }
        if (i12 == e48.g) {
            qa qaVar = e48.f;
            dv5[] dv5Arr = (dv5[]) qaVar.y;
            int i58 = qaVar.x;
            int i59 = 0;
            for (dv5 dv5 : dv5Arr) {
                i59 += dv5.b;
            }
            ee1[] ee1Arr = new ee1[i59];
            int i60 = 0;
            for (dv5 dv52 : dv5Arr) {
                int i61 = 0;
                while (i61 < dv52.b) {
                    int i62 = dv52.c;
                    ee1Arr[i60] = new ee1(i62, new byte[(i58 + i62)]);
                    i61++;
                    i60++;
                }
            }
            int length = ee1Arr[0].b.length - i58;
            int i63 = length - 1;
            int i64 = 0;
            for (int i65 = 0; i65 < i63; i65++) {
                int i66 = 0;
                while (i66 < i60) {
                    ee1Arr[i66].b[i65] = bArr[i64];
                    i66++;
                    i64++;
                }
            }
            if (e48.a == 24) {
                z2 = true;
            } else {
                z2 = false;
            }
            int i67 = 8;
            if (z2) {
                i = 8;
            } else {
                i = i60;
            }
            int i68 = 0;
            while (i68 < i) {
                ee1Arr[i68].b[i63] = bArr[i64];
                i68++;
                i64++;
            }
            int length2 = ee1Arr[0].b.length;
            while (true) {
                i2 = 7;
                if (length >= length2) {
                    break;
                }
                int i69 = 0;
                while (i69 < i60) {
                    if (z2) {
                        i4 = (i69 + 8) % i60;
                    } else {
                        i4 = i69;
                    }
                    if (!z2 || i4 <= 7) {
                        i5 = length;
                    } else {
                        i5 = length - 1;
                    }
                    ee1Arr[i4].b[i5] = bArr[i64];
                    i69++;
                    i64++;
                }
                length++;
            }
            if (i64 == i7) {
                int i70 = 0;
                for (int i71 = 0; i71 < i59; i71++) {
                    i70 += ee1Arr[i71].a;
                }
                byte[] bArr3 = new byte[i70];
                int i72 = 0;
                while (i72 < i59) {
                    ee1 ee1 = ee1Arr[i72];
                    byte[] bArr4 = ee1.b;
                    int i73 = ee1.a;
                    int length3 = bArr4.length;
                    int[] iArr = new int[length3];
                    for (int i74 = 0; i74 < length3; i74++) {
                        iArr[i74] = bArr4[i74] & 255;
                    }
                    try {
                        ((br4) this.x).x(iArr, bArr4.length - i73);
                        for (int i75 = 0; i75 < i73; i75++) {
                            bArr4[i75] = (byte) iArr[i75];
                        }
                        for (int i76 = 0; i76 < i73; i76++) {
                            bArr3[(i76 * i59) + i72] = bArr4[i76];
                        }
                        i72++;
                    } catch (ReedSolomonException unused) {
                        throw ChecksumException.a();
                    }
                }
                m90 m90 = new m90(bArr3);
                StringBuilder sb = new StringBuilder(100);
                StringBuilder sb2 = new StringBuilder(0);
                ArrayList arrayList2 = new ArrayList(1);
                int i77 = 2;
                while (true) {
                    int i78 = 6;
                    int i79 = 254;
                    if (i77 == 2) {
                        boolean z7 = false;
                        while (true) {
                            int b4 = m90.b(i67);
                            if (b4 == 0) {
                                throw FormatException.a();
                            } else if (b4 <= 128) {
                                if (z7) {
                                    b4 += 128;
                                }
                                sb.append((char) (b4 - 1));
                                i78 = 2;
                            } else if (b4 == 129) {
                                i78 = 1;
                            } else {
                                if (b4 > 229) {
                                    switch (b4) {
                                        case 230:
                                            i78 = 3;
                                            break;
                                        case 231:
                                            i78 = i2;
                                            break;
                                        case 232:
                                            sb.append(29);
                                            break;
                                        case 233:
                                        case 234:
                                        case 241:
                                            break;
                                        case 235:
                                            z7 = true;
                                            break;
                                        case 236:
                                            sb.append("[)>\u001e05\u001d");
                                            sb2.insert(0, "\u001e\u0004");
                                            break;
                                        case 237:
                                            sb.append("[)>\u001e06\u001d");
                                            sb2.insert(0, "\u001e\u0004");
                                            break;
                                        case 238:
                                            i78 = 5;
                                            break;
                                        case 239:
                                            i78 = 4;
                                            break;
                                        case 240:
                                            break;
                                        default:
                                            if (!(b4 == 254 && m90.a() == 0)) {
                                                break;
                                            }
                                    }
                                } else {
                                    int i80 = b4 - 130;
                                    if (i80 < 10) {
                                        sb.append('0');
                                    }
                                    sb.append(i80);
                                }
                                if (m90.a() <= 0) {
                                    i78 = 2;
                                }
                            }
                        }
                    } else {
                        int B2 = b81.B(i77);
                        if (B2 != 2) {
                            int i81 = 3;
                            arrayList = null;
                            if (B2 == 3) {
                                int[] iArr2 = new int[3];
                                boolean z8 = false;
                                int i82 = 0;
                                while (m90.a() != i67 && (b2 = m90.b(i67)) != i79) {
                                    sg3.N(b2, m90.b(i67), iArr2);
                                    int i83 = i82;
                                    int i84 = 0;
                                    while (i84 < i81) {
                                        int i85 = iArr2[i84];
                                        if (i83 != 0) {
                                            if (i83 != 1) {
                                                if (i83 == 2) {
                                                    char[] cArr = sg3.g;
                                                    if (i85 < 27) {
                                                        char c = cArr[i85];
                                                        if (z8) {
                                                            sb.append((char) (c + 128));
                                                        } else {
                                                            sb.append(c);
                                                        }
                                                    } else if (i85 == 27) {
                                                        sb.append(29);
                                                    } else if (i85 == 30) {
                                                        z8 = true;
                                                    } else {
                                                        throw FormatException.a();
                                                    }
                                                    i83 = 0;
                                                } else if (i83 == i81) {
                                                    char[] cArr2 = sg3.h;
                                                    if (i85 < 32) {
                                                        char c2 = cArr2[i85];
                                                        if (z8) {
                                                            sb.append((char) (c2 + 128));
                                                        } else {
                                                            sb.append(c2);
                                                            i83 = 0;
                                                        }
                                                    } else {
                                                        throw FormatException.a();
                                                    }
                                                } else {
                                                    throw FormatException.a();
                                                }
                                            } else if (z8) {
                                                sb.append((char) (i85 + 128));
                                            } else {
                                                sb.append((char) i85);
                                                i83 = 0;
                                            }
                                            z8 = false;
                                            i83 = 0;
                                        } else if (i85 < i81) {
                                            i83 = i85 + 1;
                                        } else {
                                            char[] cArr3 = sg3.f;
                                            if (i85 < 40) {
                                                char c3 = cArr3[i85];
                                                if (z8) {
                                                    sb.append((char) (c3 + 128));
                                                    z8 = false;
                                                } else {
                                                    sb.append(c3);
                                                }
                                            } else {
                                                throw FormatException.a();
                                            }
                                        }
                                        i84++;
                                        i81 = 3;
                                    }
                                    if (m90.a() > 0) {
                                        i82 = i83;
                                        i81 = 3;
                                        i67 = 8;
                                        i79 = 254;
                                    }
                                }
                            } else if (B2 == 4) {
                                int i86 = 3;
                                int[] iArr3 = new int[3];
                                while (m90.a() != i67 && (b3 = m90.b(i67)) != 254) {
                                    sg3.N(b3, m90.b(i67), iArr3);
                                    int i87 = 0;
                                    while (i87 < i86) {
                                        int i88 = iArr3[i87];
                                        if (i88 == 0) {
                                            sb.append(13);
                                        } else if (i88 == 1) {
                                            sb.append('*');
                                        } else if (i88 == 2) {
                                            sb.append('>');
                                        } else if (i88 == i86) {
                                            sb.append(' ');
                                        } else if (i88 < 14) {
                                            sb.append((char) (i88 + 44));
                                        } else if (i88 < 40) {
                                            sb.append((char) (i88 + 51));
                                        } else {
                                            throw FormatException.a();
                                        }
                                        i87++;
                                        i86 = 3;
                                    }
                                    if (m90.a() > 0) {
                                        i86 = 3;
                                    }
                                }
                            } else if (B2 == 5) {
                                while (true) {
                                    if (m90.a() > 16) {
                                        int i89 = 0;
                                        while (true) {
                                            if (i89 < 4) {
                                                int b5 = m90.b(6);
                                                if (b5 == 31) {
                                                    int i90 = 8 - m90.c;
                                                    if (i90 != i67) {
                                                        m90.b(i90);
                                                    }
                                                } else {
                                                    if ((b5 & 32) == 0) {
                                                        b5 |= 64;
                                                    }
                                                    sb.append((char) b5);
                                                    i89++;
                                                }
                                            } else if (m90.a() <= 0) {
                                            }
                                        }
                                    }
                                }
                            } else if (B2 == 6) {
                                int i91 = m90.b;
                                int i92 = i91 + 2;
                                int d0 = sg3.d0(m90.b(i67), i91 + 1);
                                if (d0 == 0) {
                                    d0 = m90.a() / 8;
                                } else if (d0 >= 250) {
                                    d0 = ((d0 - 249) * 250) + sg3.d0(m90.b(i67), i92);
                                    i92 = i91 + 3;
                                }
                                if (d0 >= 0) {
                                    byte[] bArr5 = new byte[d0];
                                    int i93 = 0;
                                    while (i93 < d0) {
                                        if (m90.a() >= i67) {
                                            bArr5[i93] = (byte) sg3.d0(m90.b(i67), i92);
                                            i93++;
                                            i92++;
                                        } else {
                                            throw FormatException.a();
                                        }
                                    }
                                    arrayList2.add(bArr5);
                                    try {
                                        sb.append(new String(bArr5, "ISO8859_1"));
                                    } catch (UnsupportedEncodingException e) {
                                        h.s("Platform does not support required encoding: ".concat(String.valueOf(e)));
                                        return null;
                                    }
                                } else {
                                    throw FormatException.a();
                                }
                            } else {
                                throw FormatException.a();
                            }
                        } else {
                            int i94 = 3;
                            arrayList = null;
                            int[] iArr4 = new int[3];
                            boolean z9 = false;
                            int i95 = 0;
                            while (true) {
                                if (!(m90.a() == 8 || (b = m90.b(8)) == 254)) {
                                    sg3.N(b, m90.b(8), iArr4);
                                    int i96 = i95;
                                    boolean z10 = z9;
                                    int i97 = 0;
                                    while (i97 < i94) {
                                        int i98 = iArr4[i97];
                                        if (i96 != 0) {
                                            if (i96 != 1) {
                                                if (i96 == 2) {
                                                    char[] cArr4 = sg3.e;
                                                    if (i98 < 27) {
                                                        char c4 = cArr4[i98];
                                                        if (z10) {
                                                            sb.append((char) (c4 + 128));
                                                        } else {
                                                            sb.append(c4);
                                                        }
                                                    } else if (i98 == 27) {
                                                        sb.append(29);
                                                    } else if (i98 == 30) {
                                                        z10 = true;
                                                    } else {
                                                        throw FormatException.a();
                                                    }
                                                    i96 = 0;
                                                } else if (i96 != i94) {
                                                    throw FormatException.a();
                                                } else if (z10) {
                                                    sb.append((char) (i98 + 224));
                                                } else {
                                                    sb.append((char) (i98 + 96));
                                                    i96 = 0;
                                                }
                                            } else if (z10) {
                                                sb.append((char) (i98 + 128));
                                            } else {
                                                sb.append((char) i98);
                                                i96 = 0;
                                            }
                                            z10 = false;
                                            i96 = 0;
                                        } else if (i98 < i94) {
                                            i96 = i98 + 1;
                                        } else {
                                            char[] cArr5 = sg3.d;
                                            if (i98 < 40) {
                                                char c5 = cArr5[i98];
                                                if (z10) {
                                                    sb.append((char) (c5 + 128));
                                                    z10 = false;
                                                } else {
                                                    sb.append(c5);
                                                }
                                            } else {
                                                throw FormatException.a();
                                            }
                                        }
                                        i97++;
                                        i94 = 3;
                                    }
                                    i3 = 2;
                                    if (m90.a() > 0) {
                                        z9 = z10;
                                        i95 = i96;
                                        i94 = 3;
                                    }
                                }
                            }
                            i77 = i3;
                        }
                        i3 = 2;
                        i77 = i3;
                    }
                    if (i77 != 1 && m90.a() > 0) {
                        i67 = 8;
                        i2 = 7;
                    }
                }
                throw FormatException.a();
            }
            ku4.v();
            return null;
        }
        throw FormatException.a();
    }

    public String toString() {
        switch (this.w) {
            case 19:
                return ((my6) this.x).toString();
            default:
                return super.toString();
        }
    }

    public String u(Object obj) {
        StringWriter stringWriter = new StringWriter();
        try {
            am3 am3 = (am3) this.x;
            kn3 kn3 = new kn3(stringWriter, am3.a, am3.b, am3.c, am3.d);
            kn3.h(obj);
            kn3.j();
            kn3.b.flush();
        } catch (IOException unused) {
        }
        return stringWriter.toString();
    }

    public void v() {
        Socket socket;
        m22 m22 = (m22) this.x;
        Iterator it = ((ConcurrentLinkedQueue) m22.z).iterator();
        it.getClass();
        while (it.hasNext()) {
            ex5 ex5 = (ex5) it.next();
            ex5.getClass();
            synchronized (ex5) {
                if (ex5.p.isEmpty()) {
                    it.remove();
                    ex5.j = true;
                    socket = ex5.e;
                } else {
                    socket = null;
                }
            }
            if (socket != null) {
                fg8.c(socket);
            }
        }
        if (((ConcurrentLinkedQueue) m22.z).isEmpty()) {
            ((ac7) m22.x).a();
        }
    }

    public y27 w() {
        return (y27) ((d37) this.x).getValue();
    }

    public a37 x() {
        w22 a = w22.a();
        if (a.c() == 1) {
            return new g93(true);
        }
        ed5 p = u55.p(Boolean.FALSE);
        a.h(new am1(p, this));
        return p;
    }

    public void y(float f, float f2, float f3, float f4) {
        wr0 wr0 = (wr0) this.x;
        qk0 D2 = wr0.D();
        float intBitsToFloat = Float.intBitsToFloat((int) (wr0.L() >> 32)) - (f3 + f);
        long floatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (wr0.L() & 4294967295L)) - (f4 + f2))) & 4294967295L) | (((long) Float.floatToRawIntBits(intBitsToFloat)) << 32);
        if (Float.intBitsToFloat((int) (floatToRawIntBits >> 32)) < 0.0f || Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L)) < 0.0f) {
            xb3.a("Width and height must be greater than or equal to zero");
        }
        wr0.e0(floatToRawIntBits);
        D2.o(f, f2);
    }

    public JSONObject z() {
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        FileInputStream fileInputStream2 = null;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Checking for cached settings...", (Throwable) null);
        }
        try {
            File file = (File) this.x;
            if (file.exists()) {
                fileInputStream = new FileInputStream(file);
                try {
                    jSONObject = new JSONObject(su0.P(fileInputStream));
                    fileInputStream2 = fileInputStream;
                } catch (Exception e) {
                    e = e;
                    try {
                        Log.e("FirebaseCrashlytics", "Failed to fetch cached settings", e);
                        su0.h(fileInputStream, "Error while closing settings cache file.");
                        return null;
                    } catch (Throwable th) {
                        th = th;
                        fileInputStream2 = fileInputStream;
                        su0.h(fileInputStream2, "Error while closing settings cache file.");
                        throw th;
                    }
                }
            } else {
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Settings file does not exist.", (Throwable) null);
                }
                jSONObject = null;
            }
            su0.h(fileInputStream2, "Error while closing settings cache file.");
            return jSONObject;
        } catch (Exception e2) {
            e = e2;
            fileInputStream = null;
            Log.e("FirebaseCrashlytics", "Failed to fetch cached settings", e);
            su0.h(fileInputStream, "Error while closing settings cache file.");
            return null;
        } catch (Throwable th2) {
            th = th2;
            su0.h(fileInputStream2, "Error while closing settings cache file.");
            throw th;
        }
    }

    public void e(int i) {
    }

    public void j(int i) {
    }

    public void k(int i) {
    }

    public void l(int i, float f) {
    }

    public /* synthetic */ ji8(int i, boolean z2) {
        this.w = i;
    }

    public ji8(y50 y50) {
        this.w = 8;
        Objects.requireNonNull(y50);
        this.x = y50;
    }

    public ji8(Context context) {
        String e;
        this.w = 0;
        d47 a = d47.a(context);
        this.x = a;
        a.b();
        String e2 = a.e("defaultGoogleSignInAccount");
        if (!TextUtils.isEmpty(e2) && (e = a.e(d47.f("googleSignInOptions", e2))) != null) {
            try {
                GoogleSignInOptions.f(e);
            } catch (JSONException unused) {
            }
        }
    }

    public /* synthetic */ ji8(int i, Object obj) {
        this.w = i;
        this.x = obj;
    }

    public ji8(ws0 ws0) {
        this.w = 11;
        tf3.a("output", ws0);
        this.x = ws0;
        ws0.a = this;
    }

    public ji8(WorkDatabase workDatabase) {
        this.w = 25;
        workDatabase.getClass();
        this.x = workDatabase;
    }

    public ji8(md2 md2) {
        this.w = 9;
        this.x = new File((File) md2.d, "com.crashlytics.settings.json");
    }

    public ji8(i91 i91, String str) {
        this.w = 14;
        this.x = i91;
    }
}
