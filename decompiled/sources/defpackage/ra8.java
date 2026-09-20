package defpackage;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* renamed from: ra8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class ra8 extends za8 {
    public static boolean m = false;
    public static Method n;
    public static Class o;
    public static Field p;
    public static Field q;
    public final WindowInsets c;
    public ad3[] d;
    public ad3 e = null;
    public db8 f;
    public ad3 g;
    public int h;
    public int i;
    public int j;
    public Rect[][] k = new Rect[10][];
    public Rect[][] l = new Rect[10][];

    public ra8(db8 db8, WindowInsets windowInsets) {
        super(db8);
        this.c = windowInsets;
    }

    private ew1 B(View view) {
        Display display;
        int i2;
        int i3;
        int i4;
        if (view == null || (display = view.getDisplay()) == null) {
            return null;
        }
        Point point = new Point();
        display.getRealSize(point);
        if (this.a.a.s()) {
            return ew1.a(point.x, point.y, true, 0, 0, 0, 0);
        }
        int i5 = 0;
        n96 x = ag8.x(display, 0);
        n96 x2 = ag8.x(display, 1);
        n96 x3 = ag8.x(display, 2);
        n96 x4 = ag8.x(display, 3);
        int i6 = point.x;
        int i7 = point.y;
        if (x != null) {
            i2 = x.b;
        } else {
            i2 = 0;
        }
        if (x2 != null) {
            i3 = x2.b;
        } else {
            i3 = 0;
        }
        if (x3 != null) {
            i4 = x3.b;
        } else {
            i4 = 0;
        }
        if (x4 != null) {
            i5 = x4.b;
        }
        return ew1.a(i6, i7, false, i2, i3, i4, i5);
    }

    private static List<Rect> C(Rect[][] rectArr, int i2) {
        Rect[] rectArr2;
        Rect[] rectArr3 = null;
        for (int i3 = 1; i3 <= 512; i3 <<= 1) {
            if (!((i2 & i3) == 0 || (rectArr2 = rectArr[z65.F(i3)]) == null)) {
                if (rectArr3 == null) {
                    rectArr3 = rectArr2;
                } else {
                    Rect[] rectArr4 = new Rect[(rectArr3.length + rectArr2.length)];
                    System.arraycopy(rectArr3, 0, rectArr4, 0, rectArr3.length);
                    System.arraycopy(rectArr2, 0, rectArr4, rectArr3.length, rectArr2.length);
                    rectArr3 = rectArr4;
                }
            }
        }
        if (rectArr3 == null) {
            return Collections.EMPTY_LIST;
        }
        return Arrays.asList(rectArr3);
    }

    private Rect[] D(ad3 ad3) {
        ArrayList arrayList = new ArrayList();
        int i2 = ad3.a;
        int i3 = ad3.d;
        int i4 = ad3.c;
        int i5 = ad3.b;
        if (i2 != 0) {
            arrayList.add(new Rect(0, 0, ad3.a, this.i));
        }
        if (i5 != 0) {
            arrayList.add(new Rect(0, 0, this.j, i5));
        }
        if (i4 != 0) {
            int i6 = this.j;
            arrayList.add(new Rect(i6 - i4, 0, i6, this.i));
        }
        if (i3 != 0) {
            int i7 = this.i;
            arrayList.add(new Rect(0, i7 - i3, this.j, i7));
        }
        return (Rect[]) arrayList.toArray(new Rect[arrayList.size()]);
    }

    private ad3 E(int i2, boolean z) {
        ad3 ad3 = ad3.e;
        for (int i3 = 1; i3 <= 512; i3 <<= 1) {
            if ((i2 & i3) != 0) {
                ad3 = ad3.a(ad3, F(i3, z));
            }
        }
        return ad3;
    }

    private ad3 G() {
        db8 db8 = this.f;
        if (db8 != null) {
            return db8.a.k();
        }
        return ad3.e;
    }

    private ad3 H(View view) {
        if (Build.VERSION.SDK_INT < 30) {
            if (!m) {
                J();
            }
            Method method = n;
            if (!(method == null || o == null || p == null)) {
                try {
                    Object invoke = method.invoke(view, (Object[]) null);
                    if (invoke == null) {
                        Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                        return null;
                    }
                    Rect rect = (Rect) p.get(q.get(invoke));
                    if (rect != null) {
                        return ad3.b(rect.left, rect.top, rect.right, rect.bottom);
                    }
                    return null;
                } catch (ReflectiveOperationException e2) {
                    Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e2.getMessage(), e2);
                }
            }
            return null;
        }
        kj6.n("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        return null;
    }

    private static void J() {
        try {
            n = View.class.getDeclaredMethod("getViewRootImpl", (Class[]) null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            o = cls;
            p = cls.getDeclaredField("mVisibleInsets");
            q = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            p.setAccessible(true);
            q.setAccessible(true);
        } catch (ReflectiveOperationException e2) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e2.getMessage(), e2);
        }
        m = true;
    }

    public static boolean L(int i2, int i3) {
        if ((i2 & 6) == (i3 & 6)) {
            return true;
        }
        return false;
    }

    public void A(Rect[][] rectArr) {
        Objects.requireNonNull(rectArr);
        this.l = (Rect[][]) rectArr.clone();
    }

    public ad3 F(int i2, boolean z) {
        int i3;
        bw1 bw1;
        int i4;
        int i5;
        int i6;
        ad3 ad3 = ad3.e;
        int i7 = 0;
        if (i2 != 1) {
            ad3 ad32 = null;
            if (i2 != 2) {
                if (i2 == 8) {
                    ad3[] ad3Arr = this.d;
                    if (ad3Arr != null) {
                        ad32 = ad3Arr[z65.F(8)];
                    }
                    if (ad32 != null) {
                        return ad32;
                    }
                    ad3 m2 = m();
                    ad3 G = G();
                    int i8 = m2.d;
                    if (i8 > G.d) {
                        return ad3.b(0, 0, 0, i8);
                    }
                    ad3 ad33 = this.g;
                    if (ad33 != null && !ad33.equals(ad3) && (i3 = this.g.d) > G.d) {
                        return ad3.b(0, 0, 0, i3);
                    }
                } else if (i2 == 16) {
                    return l();
                } else {
                    if (i2 == 32) {
                        return j();
                    }
                    if (i2 == 64) {
                        return n();
                    }
                    if (i2 == 128) {
                        db8 db8 = this.f;
                        if (db8 != null) {
                            bw1 = db8.a.g();
                        } else {
                            bw1 = g();
                        }
                        if (bw1 != null) {
                            int i9 = Build.VERSION.SDK_INT;
                            if (i9 >= 28) {
                                i4 = bn.l(bw1.a);
                            } else {
                                i4 = 0;
                            }
                            if (i9 >= 28) {
                                i5 = bn.n(bw1.a);
                            } else {
                                i5 = 0;
                            }
                            if (i9 >= 28) {
                                i6 = bn.m(bw1.a);
                            } else {
                                i6 = 0;
                            }
                            if (i9 >= 28) {
                                i7 = bn.k(bw1.a);
                            }
                            return ad3.b(i4, i5, i6, i7);
                        }
                    }
                }
            } else if (z) {
                ad3 G2 = G();
                ad3 k2 = k();
                return ad3.b(Math.max(G2.a, k2.a), 0, Math.max(G2.c, k2.c), Math.max(G2.d, k2.d));
            } else if ((this.h & 2) == 0) {
                ad3 m3 = m();
                db8 db82 = this.f;
                if (db82 != null) {
                    ad32 = db82.a.k();
                }
                int i10 = m3.d;
                if (ad32 != null) {
                    i10 = Math.min(i10, ad32.d);
                }
                return ad3.b(m3.a, 0, m3.c, i10);
            }
        } else if (z) {
            return ad3.b(0, Math.max(G().b, m().b), 0, 0);
        } else {
            if ((this.h & 4) == 0) {
                return ad3.b(0, m().b, 0, 0);
            }
        }
        return ad3;
    }

    public boolean I(int i2) {
        if (!(i2 == 1 || i2 == 2)) {
            if (i2 == 4) {
                return false;
            }
            if (!(i2 == 8 || i2 == 128)) {
                return true;
            }
        }
        return !F(i2, false).equals(ad3.e);
    }

    public void K(ad3 ad3) {
        this.g = ad3;
    }

    public void d(View view) {
        this.j = view.getWidth();
        this.i = view.getHeight();
        ad3 H = H(view);
        if (H == null) {
            H = ad3.e;
        }
        K(H);
    }

    public List<Rect> e(int i2) {
        return C(this.k, i2);
    }

    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        ra8 ra8 = (ra8) obj;
        if (!Objects.equals(this.g, ra8.g) || !L(this.h, ra8.h)) {
            return false;
        }
        return true;
    }

    public List<Rect> f(int i2) {
        return C(this.l, i2);
    }

    public ad3 h(int i2) {
        return E(i2, false);
    }

    public ad3 i(int i2) {
        return E(i2, true);
    }

    public final ad3 m() {
        if (this.e == null) {
            WindowInsets windowInsets = this.c;
            this.e = ad3.b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.e;
    }

    public void o(View view) {
        B(view);
    }

    public void p() {
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            int F = z65.F(i2);
            this.k[F] = D(h(i2));
            if (i2 != 8) {
                this.l[F] = D(i(i2));
            }
        }
    }

    public db8 q(int i2, int i3, int i4, int i5) {
        qa8 qa8;
        db8 g2 = db8.g((View) null, this.c);
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 36) {
            qa8 = new pa8(g2);
        } else if (i6 >= 35) {
            qa8 = new oa8(g2);
        } else if (i6 >= 34) {
            qa8 = new na8(g2);
        } else if (i6 >= 31) {
            qa8 = new ma8(g2);
        } else if (i6 >= 30) {
            qa8 = new la8(g2);
        } else if (i6 >= 29) {
            qa8 = new ka8(g2);
        } else {
            qa8 = new ia8(g2);
        }
        qa8.h(db8.e(m(), i2, i3, i4, i5));
        qa8.f(db8.e(k(), i2, i3, i4, i5));
        return qa8.b();
    }

    public boolean s() {
        return this.c.isRound();
    }

    public boolean t(int i2) {
        for (int i3 = 1; i3 <= 512; i3 <<= 1) {
            if ((i2 & i3) != 0 && !I(i3)) {
                return false;
            }
        }
        return true;
    }

    public void v(ad3[] ad3Arr) {
        this.d = ad3Arr;
    }

    public void w(db8 db8) {
        this.f = db8;
    }

    public void y(int i2) {
        this.h = i2;
    }

    public void z(Rect[][] rectArr) {
        Objects.requireNonNull(rectArr);
        this.k = (Rect[][]) rectArr.clone();
    }

    public void u(ew1 ew1) {
    }
}
