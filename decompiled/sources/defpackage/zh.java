package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputMethodManager;
import cu.lestebang.utiletecsa.feature.nauta.service.NautaOverlayService;
import java.io.File;
import java.io.IOException;
import java.util.Set;

/* renamed from: zh  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class zh implements sr2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ Object x;

    public /* synthetic */ zh(m92 m92, gy6 gy6) {
        this.w = 14;
        this.x = m92;
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [sp2, n90, oy6] */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0258, code lost:
        if (defpackage.v82.a.contains(r12) != false) goto L_0x025a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0289  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x028b  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0293 A[SYNTHETIC, Splitter:B:115:0x0293] */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x029e  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x02a0  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x02a2  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x02a5  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x02b5  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x0395  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x03ad  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x03b9  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x03cc  */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x03ce  */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x03d5  */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x0411  */
    /* JADX WARNING: Removed duplicated region for block: B:251:0x04cf  */
    /* JADX WARNING: Removed duplicated region for block: B:259:0x04d8  */
    public final Object b() {
        i82 i82;
        Exception exc;
        BitmapFactory.Options options;
        boolean z;
        boolean z2;
        Throwable th;
        Exception exc2;
        Bitmap bitmap;
        int i;
        boolean z3;
        BitmapFactory.Options options2;
        int i2;
        int i3;
        int i4;
        int i5;
        int ordinal;
        double d;
        boolean z4;
        ColorSpace colorSpace;
        int i6;
        boolean z5;
        l82 c;
        int i7;
        int i8;
        mr2 mr2;
        nv3 nv3;
        boolean z6 = true;
        switch (this.w) {
            case b85.b:
                rc9.e0((ai) this.x);
                return vs7.a;
            case 1:
                return ((zc7) this.x).Q();
            case 2:
                Object[] objArr = (Object[]) this.x;
                objArr.getClass();
                return new e2(objArr);
            case 3:
                return (s83) ((qt) this.x).N.getValue();
            case 4:
                return (vl) this.x;
            case 5:
                q90 q90 = (q90) this.x;
                BitmapFactory.Options options3 = new BitmapFactory.Options();
                v75 v75 = q90.b;
                u83 u83 = q90.a;
                ? sp2 = new sp2(u83.k());
                zw5 zw5 = new zw5(sp2);
                options3.inJustDecodeBounds = true;
                BitmapFactory.decodeStream(new aa0(3, (Object) zw5.a()), (Rect) null, options3);
                Exception exc3 = sp2.x;
                if (exc3 == null) {
                    options3.inJustDecodeBounds = false;
                    Paint paint = u82.a;
                    String str = options3.outMimeType;
                    t82 t82 = q90.d;
                    Set set = v82.a;
                    int ordinal2 = t82.ordinal();
                    if (ordinal2 != 0) {
                        if (ordinal2 == 1) {
                            if (str != null) {
                                break;
                            }
                        } else if (ordinal2 != 2) {
                            h.c();
                            return null;
                        }
                        p82 p82 = new p82(new q82(new aa0(3, (Object) zw5.a())));
                        l82 c2 = p82.c("Orientation");
                        if (c2 != null) {
                            try {
                                i6 = c2.e(p82.e);
                            } catch (NumberFormatException unused) {
                            }
                            if (i6 == 2 || i6 == 7 || i6 == 4 || i6 == 5) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            c = p82.c("Orientation");
                            if (c != null) {
                                try {
                                    i7 = c.e(p82.e);
                                } catch (NumberFormatException unused2) {
                                }
                                switch (i7) {
                                    case 3:
                                    case 4:
                                        i8 = 180;
                                        break;
                                    case 5:
                                    case 8:
                                        i8 = 270;
                                        break;
                                    case 6:
                                    case 7:
                                        i8 = 90;
                                        break;
                                    default:
                                        i8 = 0;
                                        break;
                                }
                                i82 = new i82(z5, i8);
                                int i9 = i82.b;
                                boolean z7 = i82.a;
                                exc = sp2.x;
                                if (exc != null) {
                                    options3.inMutable = false;
                                    int i10 = Build.VERSION.SDK_INT;
                                    if (i10 >= 26 && (colorSpace = v75.c) != null) {
                                        options3.inPreferredColorSpace = colorSpace;
                                    }
                                    boolean z8 = v75.h;
                                    Context context = v75.a;
                                    uu6 uu6 = v75.d;
                                    options3.inPremultiplied = z8;
                                    Bitmap.Config config = v75.b;
                                    if ((z7 || i9 > 0) && (config == null || kl8.A(config))) {
                                        config = Bitmap.Config.ARGB_8888;
                                    }
                                    if (v75.g && config == Bitmap.Config.ARGB_8888 && sg3.e(options3.outMimeType, "image/jpeg")) {
                                        config = Bitmap.Config.RGB_565;
                                    }
                                    if (i10 >= 26 && options3.outConfig == Bitmap.Config.RGBA_F16 && config != Bitmap.Config.HARDWARE) {
                                        config = Bitmap.Config.RGBA_F16;
                                    }
                                    options3.inPreferredConfig = config;
                                    ie1 a = u83.a();
                                    if (!(a instanceof u56) || !sg3.e(uu6, uu6.c)) {
                                        int i11 = options3.outWidth;
                                        if (i11 > 0) {
                                            int i12 = options3.outHeight;
                                            if (i12 <= 0) {
                                                z3 = z7;
                                                i = 1;
                                                options2 = options3;
                                            } else {
                                                if (i9 == 90 || i9 == 270) {
                                                    i2 = i12;
                                                } else {
                                                    i2 = i11;
                                                }
                                                if (!(i9 == 90 || i9 == 270)) {
                                                    i11 = i12;
                                                }
                                                wf6 wf6 = v75.e;
                                                uu6 uu62 = uu6.c;
                                                if (sg3.e(uu6, uu62)) {
                                                    i3 = i2;
                                                } else {
                                                    i3 = i.d(uu6.a, wf6);
                                                }
                                                if (sg3.e(uu6, uu62)) {
                                                    i4 = i11;
                                                } else {
                                                    i4 = i.d(uu6.b, wf6);
                                                }
                                                int highestOneBit = Integer.highestOneBit(i2 / i3);
                                                int highestOneBit2 = Integer.highestOneBit(i11 / i4);
                                                int ordinal3 = wf6.ordinal();
                                                if (ordinal3 == 0) {
                                                    i5 = Math.min(highestOneBit, highestOneBit2);
                                                    if (i5 < 1) {
                                                    }
                                                    options3.inSampleSize = i5;
                                                    double d2 = (double) i5;
                                                    double d3 = ((double) i2) / d2;
                                                    options = options3;
                                                    double d4 = ((double) i11) / d2;
                                                    double d5 = (double) i3;
                                                    z = z7;
                                                    double d6 = d5 / d3;
                                                    double d7 = ((double) i4) / d4;
                                                    ordinal = wf6.ordinal();
                                                    if (ordinal != 0) {
                                                    }
                                                    d = 1.0d;
                                                    if (d != 1.0d) {
                                                    }
                                                    options.inScaled = !z4;
                                                    if (!z4) {
                                                    }
                                                } else if (ordinal3 == 1) {
                                                    i5 = Math.max(highestOneBit, highestOneBit2);
                                                    if (i5 < 1) {
                                                        i5 = 1;
                                                    }
                                                    options3.inSampleSize = i5;
                                                    double d22 = (double) i5;
                                                    double d32 = ((double) i2) / d22;
                                                    options = options3;
                                                    double d42 = ((double) i11) / d22;
                                                    double d52 = (double) i3;
                                                    z = z7;
                                                    double d62 = d52 / d32;
                                                    double d72 = ((double) i4) / d42;
                                                    ordinal = wf6.ordinal();
                                                    if (ordinal != 0) {
                                                        d = Math.max(d62, d72);
                                                    } else if (ordinal == 1) {
                                                        d = Math.min(d62, d72);
                                                    } else {
                                                        h.c();
                                                    }
                                                    if (v75.f && d > 1.0d) {
                                                        d = 1.0d;
                                                    }
                                                    if (d != 1.0d) {
                                                        z4 = true;
                                                    } else {
                                                        z4 = false;
                                                    }
                                                    options.inScaled = !z4;
                                                    if (!z4) {
                                                        if (d > 1.0d) {
                                                            options.inDensity = dh4.B(2.147483647E9d / d);
                                                            options.inTargetDensity = Integer.MAX_VALUE;
                                                        } else {
                                                            options.inDensity = Integer.MAX_VALUE;
                                                            options.inTargetDensity = dh4.B(2.147483647E9d * d);
                                                        }
                                                    }
                                                } else {
                                                    h.c();
                                                }
                                                return null;
                                            }
                                        } else {
                                            z3 = z7;
                                            options2 = options3;
                                            i = 1;
                                        }
                                        options.inSampleSize = i;
                                        z2 = false;
                                        options.inScaled = false;
                                        Bitmap decodeStream = BitmapFactory.decodeStream(new aa0(3, (Object) zw5), (Rect) null, options);
                                        zw5.close();
                                        exc2 = sp2.x;
                                        if (exc2 == null) {
                                            throw exc2;
                                        } else if (decodeStream != null) {
                                            decodeStream.setDensity(context.getResources().getDisplayMetrics().densityDpi);
                                            if (z || i9 > 0) {
                                                Matrix matrix = new Matrix();
                                                float width = ((float) decodeStream.getWidth()) / 2.0f;
                                                float height = ((float) decodeStream.getHeight()) / 2.0f;
                                                if (z) {
                                                    matrix.postScale(-1.0f, 1.0f, width, height);
                                                }
                                                if (i9 > 0) {
                                                    matrix.postRotate((float) i9, width, height);
                                                }
                                                RectF rectF = new RectF(0.0f, 0.0f, (float) decodeStream.getWidth(), (float) decodeStream.getHeight());
                                                matrix.mapRect(rectF);
                                                float f = rectF.left;
                                                if (!(f == 0.0f && rectF.top == 0.0f)) {
                                                    matrix.postTranslate(-f, -rectF.top);
                                                }
                                                if (i9 == 90 || i9 == 270) {
                                                    int height2 = decodeStream.getHeight();
                                                    int width2 = decodeStream.getWidth();
                                                    Bitmap.Config config2 = decodeStream.getConfig();
                                                    if (config2 == null) {
                                                        config2 = Bitmap.Config.ARGB_8888;
                                                    }
                                                    bitmap = Bitmap.createBitmap(height2, width2, config2);
                                                } else {
                                                    int width3 = decodeStream.getWidth();
                                                    int height3 = decodeStream.getHeight();
                                                    Bitmap.Config config3 = decodeStream.getConfig();
                                                    if (config3 == null) {
                                                        config3 = Bitmap.Config.ARGB_8888;
                                                    }
                                                    bitmap = Bitmap.createBitmap(width3, height3, config3);
                                                }
                                                new Canvas(bitmap).drawBitmap(decodeStream, matrix, u82.a);
                                                decodeStream.recycle();
                                                decodeStream = bitmap;
                                            }
                                            BitmapDrawable bitmapDrawable = new BitmapDrawable(context.getResources(), decodeStream);
                                            if (options.inSampleSize > 1 || options.inScaled) {
                                                z2 = true;
                                            }
                                            return new gk1(bitmapDrawable, z2);
                                        } else {
                                            h.s("BitmapFactory returned a null bitmap. Often this means BitmapFactory could not decode the image data read from the input source (e.g. network, disk, or memory) as it's not encoded as a valid image format.");
                                            return null;
                                        }
                                    } else {
                                        options3.inSampleSize = 1;
                                        options3.inScaled = true;
                                        options3.inDensity = ((u56) a).i0;
                                        options3.inTargetDensity = context.getResources().getDisplayMetrics().densityDpi;
                                        z = z7;
                                        options = options3;
                                    }
                                    z2 = false;
                                    try {
                                        Bitmap decodeStream2 = BitmapFactory.decodeStream(new aa0(3, (Object) zw5), (Rect) null, options);
                                        zw5.close();
                                        exc2 = sp2.x;
                                        if (exc2 == null) {
                                        }
                                    } catch (Throwable th2) {
                                        ed1.i(zw5, th);
                                        throw th2;
                                    }
                                } else {
                                    throw exc;
                                }
                            }
                            i7 = 1;
                            switch (i7) {
                                case 3:
                                case 4:
                                    break;
                                case 5:
                                case 8:
                                    break;
                                case 6:
                                case 7:
                                    break;
                            }
                            i82 = new i82(z5, i8);
                            int i92 = i82.b;
                            boolean z72 = i82.a;
                            exc = sp2.x;
                            if (exc != null) {
                            }
                        }
                        i6 = 1;
                        if (i6 == 2 || i6 == 7 || i6 == 4 || i6 == 5) {
                        }
                        c = p82.c("Orientation");
                        if (c != null) {
                        }
                        i7 = 1;
                        switch (i7) {
                            case 3:
                            case 4:
                                break;
                            case 5:
                            case 8:
                                break;
                            case 6:
                            case 7:
                                break;
                        }
                        i82 = new i82(z5, i8);
                        int i922 = i82.b;
                        boolean z722 = i82.a;
                        exc = sp2.x;
                        if (exc != null) {
                        }
                    }
                    i82 = i82.c;
                    int i9222 = i82.b;
                    boolean z7222 = i82.a;
                    exc = sp2.x;
                    if (exc != null) {
                    }
                } else {
                    throw exc3;
                }
                break;
            case 6:
                return (ly5) this.x;
            case 7:
                return ((Iterable) this.x).iterator();
            case 8:
                return ((qc3) this.x).n(":memory:");
            case 9:
                return ((u44) this.x).d();
            case 10:
                return new se7((z75) this.x, 0.0f);
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER:
                ((md7) this.x).close();
                return vs7.a;
            case 12:
                xz1 xz1 = (xz1) this.x;
                tp1 tp1 = (tp1) xz1.c.getValue();
                if (tp1 != null) {
                    jo7 jo7 = pv4.a;
                    return Float.valueOf(tp1.e0(400.0f));
                }
                ku4.w(xz1, ") was not set. Did you use DrawerState with the ModalNavigationDrawer or DismissibleNavigationDrawer composables?", "The density on DrawerState (");
                return null;
            case ry4.PERF_SESSIONS_FIELD_NUMBER:
                return new ql7(((ql7) ((p92) this.x).A.getValue()).a);
            case 14:
                ((m92) this.x).b();
                return Boolean.TRUE;
            case h75.g:
                File file = (File) this.x;
                synchronized (gd2.e) {
                    gd2.d.remove(file.getAbsolutePath());
                }
                return vs7.a;
            case 16:
                ((xf2) this.x).a.await();
                return vs7.a;
            case 17:
                nr2 nr2 = (nr2) this.x;
                String str2 = nr2.x;
                if (str2 == null || !nr2.z) {
                    mr2 = new mr2(nr2.w, nr2.x, new ji8(24), nr2.y, nr2.A);
                } else {
                    Context context2 = nr2.w;
                    context2.getClass();
                    File noBackupFilesDir = context2.getNoBackupFilesDir();
                    noBackupFilesDir.getClass();
                    mr2 = new mr2(nr2.w, new File(noBackupFilesDir, str2).getAbsolutePath(), new ji8(24), nr2.y, nr2.A);
                }
                mr2.setWriteAheadLoggingEnabled(nr2.C);
                return mr2;
            case 18:
                ((yd) this.x).b();
                return vs7.a;
            case 19:
                ((yd) this.x).b();
                return vs7.a;
            case 20:
                p33 p33 = (p33) this.x;
                p33.getClass();
                try {
                    p33.S.v(2, 0, false);
                } catch (IOException e) {
                    k62 k62 = k62.z;
                    p33.a(k62, k62, e);
                }
                return vs7.a;
            case 21:
                return Float.valueOf(i95.p(((o81) this.x).k()));
            case 22:
                Object systemService = ((View) ((qc3) this.x).x).getContext().getSystemService("input_method");
                systemService.getClass();
                return (InputMethodManager) systemService;
            case 23:
                a96 a96 = ((eh3) this.x).a;
                if (a96.k() && !a96.n()) {
                    z6 = false;
                }
                return Boolean.valueOf(z6);
            case 24:
                Object obj = ((cs3) this.x).w;
                if (obj instanceof nv3) {
                    nv3 = (nv3) obj;
                } else {
                    nv3 = null;
                }
                if (nv3 != null) {
                    return nv3.s();
                }
                return null;
            case 25:
                return new BaseInputConnection(((v44) this.x).a, false);
            case 26:
                ((mw1) this.x).b();
                return vs7.a;
            case 27:
                d37 d37 = ((NautaOverlayService) this.x).J;
                Boolean bool = Boolean.TRUE;
                d37.getClass();
                d37.l((Object) null, bool);
                return vs7.a;
            case 28:
                bt4 bt4 = ((zs4) this.x).D;
                if (!bt4.i) {
                    h.s("You cannot access the NavBackStackEntry's SavedStateHandle until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
                    return null;
                } else if (bt4.j.E != k54.w) {
                    zs4 zs4 = bt4.a;
                    w58 w58 = (w58) bt4.m.getValue();
                    ib1 k = o85.k(zs4);
                    w58.getClass();
                    k.getClass();
                    no7 no7 = new no7(zs4.g(), w58, k);
                    gq3 b = b26.a.b(at4.class);
                    String l = b.l();
                    if (l != null) {
                        return ((at4) no7.b(b, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(l))).b;
                    }
                    h.q("Local and anonymous classes can not be ViewModels");
                    return null;
                } else {
                    h.s("You cannot access the NavBackStackEntry's SavedStateHandle after the NavBackStackEntry is destroyed.");
                    return null;
                }
            default:
                return new nt4((String) this.x);
        }
    }

    public /* synthetic */ zh(int i, Object obj) {
        this.w = i;
        this.x = obj;
    }
}
