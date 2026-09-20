package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Looper;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.Log;
import android.view.ActionMode;
import android.view.Choreographer;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AbsSeekBar;
import android.widget.EditText;
import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import cu.lestebang.utiletecsa.R;
import java.lang.ref.SoftReference;
import java.lang.reflect.Array;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: qc3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class qc3 implements zl, im, va6, ul6, zx5 {
    public static final Object A = new Object();
    public static ad8 B;
    public static final tz2 C = new tz2(3);
    public static final int[] D = {1, 1, 2};
    public static final tz2 E = new tz2(22);
    public static final n63 F = new n63(22);
    public static final int[] z = {16843067, 16843068};
    public final /* synthetic */ int w;
    public Object x;
    public Object y;

    public qc3(Context context, int i) {
        this.w = i;
        switch (i) {
            case 22:
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(gw8.K(context, kg4.class.getCanonicalName(), R.attr.materialCalendarStyle).data, ov5.m);
                hz2.G0(context, obtainStyledAttributes.getResourceId(4, 0));
                hz2.G0(context, obtainStyledAttributes.getResourceId(2, 0));
                hz2.G0(context, obtainStyledAttributes.getResourceId(3, 0));
                hz2.G0(context, obtainStyledAttributes.getResourceId(5, 0));
                ColorStateList L = t49.L(context, obtainStyledAttributes, 7);
                this.x = hz2.G0(context, obtainStyledAttributes.getResourceId(9, 0));
                hz2.G0(context, obtainStyledAttributes.getResourceId(8, 0));
                this.y = hz2.G0(context, obtainStyledAttributes.getResourceId(10, 0));
                new Paint().setColor(L.getDefaultColor());
                obtainStyledAttributes.recycle();
                return;
            default:
                this.x = context;
                this.y = new or(1);
                return;
        }
    }

    public static yb9 q(Context context, Intent intent, boolean z2) {
        ad8 ad8;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        synchronized (A) {
            try {
                if (B == null) {
                    B = new ad8(context);
                }
                ad8 = B;
            } finally {
                while (true) {
                }
            }
        }
        if (!z2) {
            return ad8.b(intent).f(new or(1), new ta1(19));
        }
        if (am6.H().K(context)) {
            synchronized (bb0.V) {
                try {
                    bb0.T(context);
                    boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                    if (!booleanExtra) {
                        bb0.W.a();
                    }
                    ad8.b(intent).b(new c9(21, intent));
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else {
            ad8.b(intent);
        }
        return b35.l(-1);
    }

    public InputMethodManager A() {
        return (InputMethodManager) ((nz3) this.y).getValue();
    }

    public KeyListener B(KeyListener keyListener) {
        if (keyListener instanceof NumberKeyListener) {
            return keyListener;
        }
        ((jz0) ((ns8) this.y).x).getClass();
        if (keyListener instanceof g32) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        if (keyListener instanceof NumberKeyListener) {
            return keyListener;
        }
        return new g32(keyListener);
    }

    public boolean C(yr3 yr3, Object obj) {
        yr3.getClass();
        sg2 sg2 = (sg2) this.y;
        if (((((Number) ((qp4) this.x).get(obj)).intValue() >>> sg2.a) & ((1 << sg2.b) - 1)) == sg2.c) {
            return true;
        }
        return false;
    }

    public ArrayList D(List<qr5> list, List list2, vq4 vq4) {
        if (list.isEmpty()) {
            if (list2 == null) {
                list = a42.w;
            } else {
                list = list2;
            }
        }
        ArrayList arrayList = new ArrayList(et0.e0(list, 10));
        for (qr5 qr5 : list) {
            qr5.getClass();
            vq4.getClass();
            arrayList.add(((qc3) this.y).v(qr5, vq4));
        }
        return arrayList;
    }

    /* JADX INFO: finally extract failed */
    public void E(AttributeSet attributeSet, int i) {
        boolean z2 = true;
        switch (this.w) {
            case 1:
                AbsSeekBar absSeekBar = (AbsSeekBar) this.x;
                cf4 w2 = cf4.w(absSeekBar.getContext(), attributeSet, z, i);
                Drawable j = w2.j(0);
                if (j != null) {
                    if (j instanceof AnimationDrawable) {
                        AnimationDrawable animationDrawable = (AnimationDrawable) j;
                        int numberOfFrames = animationDrawable.getNumberOfFrames();
                        AnimationDrawable animationDrawable2 = new AnimationDrawable();
                        animationDrawable2.setOneShot(animationDrawable.isOneShot());
                        for (int i2 = 0; i2 < numberOfFrames; i2++) {
                            Drawable M = M(animationDrawable.getFrame(i2), true);
                            M.setLevel(10000);
                            animationDrawable2.addFrame(M, animationDrawable.getDuration(i2));
                        }
                        animationDrawable2.setLevel(10000);
                        j = animationDrawable2;
                    }
                    absSeekBar.setIndeterminateDrawable(j);
                }
                Drawable j2 = w2.j(1);
                if (j2 != null) {
                    absSeekBar.setProgressDrawable(M(j2, false));
                }
                w2.A();
                return;
            default:
                TypedArray obtainStyledAttributes = ((EditText) this.x).getContext().obtainStyledAttributes(attributeSet, qv5.i, i, 0);
                try {
                    if (obtainStyledAttributes.hasValue(14)) {
                        z2 = obtainStyledAttributes.getBoolean(14, true);
                    }
                    obtainStyledAttributes.recycle();
                    L(z2);
                    return;
                } catch (Throwable th) {
                    obtainStyledAttributes.recycle();
                    throw th;
                }
        }
    }

    public d32 F(InputConnection inputConnection, EditorInfo editorInfo) {
        InputConnection inputConnection2;
        ns8 ns8 = (ns8) this.y;
        if (inputConnection == null) {
            ns8.getClass();
            inputConnection2 = null;
        } else {
            jz0 jz0 = (jz0) ns8.x;
            jz0.getClass();
            if (!(inputConnection instanceof d32)) {
                inputConnection = new d32(editorInfo, inputConnection, (EditText) jz0.x);
            }
            inputConnection2 = inputConnection;
        }
        return (d32) inputConnection2;
    }

    public void G(h8 h8Var) {
        am6 am6 = (am6) this.x;
        ((ActionMode.Callback) am6.x).onDestroyActionMode(am6.B(h8Var));
        wo woVar = (wo) this.y;
        if (woVar.R != null) {
            woVar.H.getDecorView().removeCallbacks(woVar.S);
        }
        if (woVar.Q != null) {
            c68 c68 = woVar.T;
            if (c68 != null) {
                c68.b();
            }
            c68 a = e58.a(woVar.Q);
            a.a(0.0f);
            woVar.T = a;
            a.d(new mo(2, this));
        }
        woVar.P = null;
        ViewGroup viewGroup = woVar.W;
        WeakHashMap weakHashMap = e58.a;
        viewGroup.requestApplyInsets();
        woVar.K();
    }

    public boolean H(h8 h8Var, Menu menu) {
        ViewGroup viewGroup = ((wo) this.y).W;
        WeakHashMap weakHashMap = e58.a;
        viewGroup.requestApplyInsets();
        am6 am6 = (am6) this.x;
        ActionMode.Callback callback = (ActionMode.Callback) am6.x;
        b87 B2 = am6.B(h8Var);
        zt6 zt6 = (zt6) am6.A;
        Menu menu2 = (Menu) zt6.get(menu);
        if (menu2 == null) {
            menu2 = new uj4((Context) am6.y, (ti4) menu);
            zt6.put(menu, menu2);
        }
        return callback.onPrepareActionMode(B2, menu2);
    }

    public void I(pl2 pl2) {
        w80 w80 = (w80) this.y;
        br4 br4 = (br4) this.x;
        int i = pl2.b;
        if (i == 0) {
            w80.execute(new nt2(5, (Object) br4, (Object) pl2.a));
        } else {
            w80.execute(new cj0(i, 0, (Object) br4));
        }
    }

    public yb9 J(Intent intent) {
        boolean z2;
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        boolean z3 = false;
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        Context context = (Context) this.x;
        or orVar = (or) this.y;
        if (!za5.w() || context.getApplicationInfo().targetSdkVersion < 26) {
            z2 = false;
        } else {
            z2 = true;
        }
        if ((intent.getFlags() & 268435456) != 0) {
            z3 = true;
        }
        if (!z2 || z3) {
            return b35.d(orVar, new pz0(1, context, intent)).g(orVar, new yb2(context, intent, z3));
        }
        return q(context, intent, z3);
    }

    public e21 K(vw3 vw3, nr5 nr5, vq4 vq4) {
        int i;
        boolean z2;
        nr5.getClass();
        vq4.getClass();
        boolean booleanValue = wg2.S.e(nr5.I).booleanValue();
        mr5 mr5 = nr5.y;
        if (mr5 == null) {
            i = -1;
        } else {
            i = hm.a[mr5.ordinal()];
        }
        switch (i) {
            case 1:
                byte b = (byte) ((int) nr5.z);
                if (booleanValue) {
                    return new kr7(b);
                }
                return new eg0(b);
            case 2:
                return new e21(Character.valueOf((char) ((int) nr5.z)));
            case 3:
                short s = (short) ((int) nr5.z);
                if (booleanValue) {
                    return new kr7(s);
                }
                return new os6(s);
            case 4:
                int i2 = (int) nr5.z;
                if (booleanValue) {
                    return new kr7(i2);
                }
                return new ye3(i2);
            case 5:
                long j = nr5.z;
                if (booleanValue) {
                    return new kr7(j);
                }
                return new wc4(j);
            case 6:
                return new ka0(nr5.A);
            case 7:
                return new ka0(nr5.B);
            case 8:
                if (nr5.z != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                return new ka0((Object) Boolean.valueOf(z2));
            case 9:
                return new e21(vq4.getString(nr5.C));
            case 10:
                return new sq3(t49.J(vq4, nr5.D), nr5.H);
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                return new b62(t49.J(vq4, nr5.D), uq4.d(vq4.getString(nr5.E)));
            case 12:
                qr5 qr5 = nr5.F;
                qr5.getClass();
                return new e21(v(qr5, vq4));
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                List<nr5> list = nr5.G;
                list.getClass();
                ArrayList arrayList = new ArrayList(et0.e0(list, 10));
                for (nr5 nr52 : list) {
                    fu6 e = ((sl4) this.x).g().e();
                    nr52.getClass();
                    arrayList.add(K(e, nr52, vq4));
                }
                return new lq7(arrayList, vw3);
            default:
                mr5 mr52 = nr5.y;
                throw new IllegalStateException(("Unsupported annotation argument type: " + mr52 + " (expected " + vw3 + ')').toString());
        }
    }

    public void L(boolean z2) {
        o32 o32 = (o32) ((jz0) ((ns8) this.y).x).y;
        if (o32.y != z2) {
            if (o32.x != null) {
                w22 a = w22.a();
                n32 n32 = o32.x;
                a.getClass();
                k75.i("initCallback cannot be null", n32);
                ReentrantReadWriteLock reentrantReadWriteLock = a.a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    a.b.remove(n32);
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            o32.y = z2;
            if (z2) {
                o32.a(o32.w, w22.a().c());
            }
        }
    }

    public Drawable M(Drawable drawable, boolean z2) {
        boolean z3;
        if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            Drawable[] drawableArr = new Drawable[numberOfLayers];
            for (int i = 0; i < numberOfLayers; i++) {
                int id = layerDrawable.getId(i);
                Drawable drawable2 = layerDrawable.getDrawable(i);
                if (id == 16908301 || id == 16908303) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                drawableArr[i] = M(drawable2, z3);
            }
            LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
            for (int i2 = 0; i2 < numberOfLayers; i2++) {
                layerDrawable2.setId(i2, layerDrawable.getId(i2));
                layerDrawable2.setLayerGravity(i2, layerDrawable.getLayerGravity(i2));
                layerDrawable2.setLayerWidth(i2, layerDrawable.getLayerWidth(i2));
                layerDrawable2.setLayerHeight(i2, layerDrawable.getLayerHeight(i2));
                layerDrawable2.setLayerInsetLeft(i2, layerDrawable.getLayerInsetLeft(i2));
                layerDrawable2.setLayerInsetRight(i2, layerDrawable.getLayerInsetRight(i2));
                layerDrawable2.setLayerInsetTop(i2, layerDrawable.getLayerInsetTop(i2));
                layerDrawable2.setLayerInsetBottom(i2, layerDrawable.getLayerInsetBottom(i2));
                layerDrawable2.setLayerInsetStart(i2, layerDrawable.getLayerInsetStart(i2));
                layerDrawable2.setLayerInsetEnd(i2, layerDrawable.getLayerInsetEnd(i2));
            }
            return layerDrawable2;
        } else if (!(drawable instanceof BitmapDrawable)) {
            return drawable;
        } else {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (((Bitmap) this.y) == null) {
                this.y = bitmap;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, (RectF) null, (float[]) null));
            shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            if (z2) {
                return new ClipDrawable(shapeDrawable, 3, 1);
            }
            return shapeDrawable;
        }
    }

    public void N() {
        synchronized (this) {
            ((AtomicInteger) this.x).decrementAndGet();
            if (((AtomicInteger) this.x).get() < 0) {
                throw new IllegalStateException("Unbalanced call to unblock() detected.");
            }
        }
    }

    public zr3 a(gq3 gq3) {
        Object q = ((pq0) this.y).get(kl8.u(gq3));
        q.getClass();
        zp4 zp4 = (zp4) q;
        Object obj = zp4.a.get();
        if (obj == null) {
            synchronized (zp4) {
                obj = zp4.a.get();
                if (obj == null) {
                    obj = new dh0((zr3) ((vr2) this.x).y(gq3));
                    zp4.a = new SoftReference(obj);
                }
            }
        }
        return ((dh0) obj).a;
    }

    public List b(st5 st5, k2 k2Var, int i) {
        md0 md0 = (md0) this.x;
        vq4 vq4 = (vq4) st5.b;
        k2Var.getClass();
        if (i == 0) {
            throw null;
        } else if (k2Var instanceof wr5) {
            wr5 wr5 = (wr5) k2Var;
            List list = wr5.D;
            list.getClass();
            return D(list, (List) wr5.k(md0.b), vq4);
        } else if (k2Var instanceof js5) {
            js5 js5 = (js5) k2Var;
            List list2 = js5.Q;
            list2.getClass();
            return D(list2, (List) js5.k(md0.d), vq4);
        } else if (k2Var instanceof qs5) {
            int B2 = b81.B(i);
            if (B2 == 1) {
                qs5 qs5 = (qs5) k2Var;
                List list3 = qs5.Q;
                list3.getClass();
                return D(list3, (List) qs5.k(md0.e), vq4);
            } else if (B2 == 2) {
                qs5 qs52 = (qs5) k2Var;
                List list4 = qs52.R;
                list4.getClass();
                return D(list4, (List) qs52.k(md0.f), vq4);
            } else if (B2 == 3) {
                qs5 qs53 = (qs5) k2Var;
                List list5 = qs53.S;
                list5.getClass();
                return D(list5, (List) qs53.k(md0.g), vq4);
            } else {
                h.s("Unsupported callable kind with property proto");
                return null;
            }
        } else {
            ta1.l("Unknown message: ", k2Var);
            return null;
        }
    }

    public Object c(st5 st5, qs5 qs5, vw3 vw3) {
        qs5.getClass();
        return null;
    }

    public List e(st5 st5, k2 k2Var, int i, int i2, jt5 jt5) {
        k2Var.getClass();
        List list = null;
        if (i != 0) {
            if (jt5 != null) {
                list = i(st5, k2Var, i, i2, jt5);
            }
            if (list == null) {
                return a42.w;
            }
            return list;
        }
        throw null;
    }

    public List f(st5 st5, qs5 qs5) {
        qs5.getClass();
        List list = qs5.V;
        list.getClass();
        ((md0) this.x).getClass();
        return D(list, (List) null, (vq4) st5.b);
    }

    public List g(st5 st5, k2 k2Var, int i) {
        String str;
        md0 md0 = (md0) this.x;
        vq4 vq4 = (vq4) st5.b;
        k2Var.getClass();
        if (i == 0) {
            throw null;
        } else if (k2Var instanceof js5) {
            List list = ((js5) k2Var).R;
            list.getClass();
            md0.getClass();
            return D(list, (List) null, vq4);
        } else if (k2Var instanceof qs5) {
            int B2 = b81.B(i);
            if (B2 == 1 || B2 == 2 || B2 == 3) {
                List list2 = ((qs5) k2Var).T;
                list2.getClass();
                md0.getClass();
                return D(list2, (List) null, vq4);
            }
            if (i == 1) {
                str = "FUNCTION";
            } else if (i == 2) {
                str = "PROPERTY";
            } else if (i == 3) {
                str = "PROPERTY_GETTER";
            } else if (i != 4) {
                str = "null";
            } else {
                str = "PROPERTY_SETTER";
            }
            throw new IllegalStateException("Unsupported callable kind with property proto for receiver annotations: ".concat(str).toString());
        } else {
            ta1.l("Unknown message: ", k2Var);
            return null;
        }
    }

    public List i(st5 st5, k2 k2Var, int i, int i2, jt5 jt5) {
        k2Var.getClass();
        if (i != 0) {
            jt5.getClass();
            List list = jt5.F;
            list.getClass();
            return D(list, (List) jt5.k(((md0) this.x).j), (vq4) st5.b);
        }
        throw null;
    }

    public ArrayList j(bt5 bt5, vq4 vq4) {
        bt5.getClass();
        vq4.getClass();
        List list = bt5.N;
        list.getClass();
        return D(list, (List) bt5.k(((md0) this.x).k), vq4);
    }

    public Object k(st5 st5, qs5 qs5, vw3 vw3) {
        qs5.getClass();
        nr5 nr5 = (nr5) jb5.n(qs5, ((md0) this.x).i);
        if (nr5 == null) {
            return null;
        }
        return ((qc3) this.y).K(vw3, nr5, (vq4) st5.b);
    }

    public ArrayList l(gt5 gt5, vq4 vq4) {
        gt5.getClass();
        vq4.getClass();
        List list = gt5.G;
        list.getClass();
        return D(list, (List) gt5.k(((md0) this.x).l), vq4);
    }

    public List m(st5 st5, es5 es5) {
        st5.getClass();
        List list = es5.A;
        list.getClass();
        return D(list, (List) es5.k(((md0) this.x).h), (vq4) st5.b);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0094, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0095, code lost:
        r2.y = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0097, code lost:
        throw r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00b4, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00b5, code lost:
        r2.y = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00b7, code lost:
        throw r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00b9, code lost:
        r7 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00ba, code lost:
        if (r4 != false) goto L_0x00bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:?, code lost:
        throw r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00bd, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x00d7, code lost:
        throw new java.lang.IllegalStateException("Unable to open database '" + r8 + "'. Was a proper path / name used in Room's database builder?", r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x00d8, code lost:
        r1.unlock();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x00db, code lost:
        throw r7;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:36:0x0087, B:39:0x008e, B:57:0x00ae] */
    public ua6 n(String str) {
        boolean z2;
        str.getClass();
        dq1 dq1 = (dq1) this.y;
        if (!str.equals(":memory:")) {
            str = ((mf1) dq1.d).a.getDatabasePath(str).getAbsolutePath();
            str.getClass();
        }
        boolean z3 = true;
        if (dq1.b || dq1.c || str.equals(":memory:")) {
            z2 = false;
        } else {
            z2 = true;
        }
        a82 a82 = new a82(str, z2);
        ReentrantLock reentrantLock = a82.a;
        reentrantLock.lock();
        jz0 jz0 = a82.b;
        if (jz0 != null) {
            try {
                jz0.N();
            } catch (Throwable th) {
                th = th;
                z3 = false;
            }
        }
        try {
            if (!dq1.c) {
                ua6 n = ((va6) this.x).n(str);
                if (!dq1.b) {
                    dq1.c = true;
                    dq1.a(dq1, n);
                    dq1.c = false;
                } else {
                    dq1.f(n);
                    if (((mf1) dq1.d).g == z86.y) {
                        l55.m(n, "PRAGMA synchronous = NORMAL");
                    } else {
                        l55.m(n, "PRAGMA synchronous = FULL");
                    }
                    ((t22) dq1.e).s(n);
                }
                if (jz0 != null) {
                    FileChannel fileChannel = (FileChannel) jz0.y;
                    if (fileChannel != null) {
                        fileChannel.close();
                        jz0.y = null;
                    }
                }
                reentrantLock.unlock();
                return n;
            }
            throw new IllegalStateException("Recursive database initialization detected. Did you try to use the database instance during initialization? Maybe in one of the callbacks?");
        } catch (Throwable th2) {
            if (jz0 != null) {
                FileChannel fileChannel2 = (FileChannel) jz0.y;
                if (fileChannel2 != null) {
                    fileChannel2.close();
                    jz0.y = null;
                }
            }
            throw th2;
        }
    }

    public List o(st5 st5, qs5 qs5) {
        qs5.getClass();
        List list = qs5.U;
        list.getClass();
        ((md0) this.x).getClass();
        return D(list, (List) null, (vq4) st5.b);
    }

    public dh3 p(yx5 yx5, Object obj) {
        dh3 dh3;
        py0 py0 = (py0) this.x;
        if (py0 == null) {
            py0 = null;
        }
        dh3 dh32 = dh3.w;
        if (py0 == null || (dh3 = py0.p(yx5, obj)) == null) {
            dh3 = dh32;
        }
        if (dh3 != dh32) {
            return dh3;
        }
        hn4 hn4 = (hn4) this.y;
        hn4.f = dt0.N0(hn4.f, new yb5(yx5, obj));
        return dh3.x;
    }

    public boolean r() {
        synchronized (this) {
            if (((AtomicBoolean) this.y).get()) {
                return false;
            }
            ((AtomicInteger) this.x).incrementAndGet();
            return true;
        }
    }

    public boolean s() {
        return ((va6) this.x).s();
    }

    public List t(qt5 qt5) {
        qt5.getClass();
        tr5 tr5 = qt5.e;
        List list = tr5.V;
        list.getClass();
        return D(list, (List) tr5.k(((md0) this.x).c), (vq4) qt5.b);
    }

    public String toString() {
        switch (this.w) {
            case 18:
                try {
                    return y().toString();
                } catch (NotFoundException unused) {
                    return "";
                }
            default:
                return super.toString();
        }
    }

    public n66 u(int i, int i2, i90 i90) {
        EnumMap enumMap;
        int[] l = xr7.l(i90, i2, false, D, new int[3]);
        try {
            return ((wr7) this.y).a(i, i90, l);
        } catch (ReaderException unused) {
            wr7 wr7 = (wr7) this.x;
            StringBuilder sb = wr7.b;
            sb.setLength(0);
            int[] iArr = wr7.a;
            iArr[0] = 0;
            iArr[1] = 0;
            iArr[2] = 0;
            iArr[3] = 0;
            int i3 = i90.x;
            int i4 = l[1];
            int i5 = 0;
            for (int i6 = 0; i6 < 2 && i4 < i3; i6++) {
                int h = xr7.h(i90, iArr, i4, xr7.g);
                sb.append((char) ((h % 10) + 48));
                for (int i7 : iArr) {
                    i4 += i7;
                }
                if (h >= 10) {
                    i5 |= 1 << (1 - i6);
                }
                if (i6 != 1) {
                    i4 = i90.c(i90.b(i4));
                }
            }
            if (sb.length() != 2) {
                throw NotFoundException.y;
            } else if (Integer.parseInt(sb.toString()) % 4 == i5) {
                String sb2 = sb.toString();
                if (sb2.length() != 2) {
                    enumMap = null;
                } else {
                    enumMap = new EnumMap(q66.class);
                    enumMap.put(q66.z, Integer.valueOf(sb2));
                }
                float f = (float) i;
                n66 n66 = new n66(sb2, (byte[]) null, new r66[]{new r66(((float) (l[0] + l[1])) / 2.0f, f), new r66((float) i4, f)}, d50.M);
                if (enumMap != null) {
                    n66.a(enumMap);
                }
                return n66;
            } else {
                throw NotFoundException.y;
            }
        }
    }

    public gm v(qr5 qr5, vq4 vq4) {
        Map map;
        qr5.getClass();
        vq4.getClass();
        ql4 B2 = r16.B((sl4) this.x, t49.J(vq4, qr5.y), (am6) this.y);
        if (qr5.z.size() != 0 && !z62.f(B2)) {
            int i = rs1.a;
            if (rs1.l(B2, iq0.A)) {
                Collection l = B2.l();
                l.getClass();
                wp0 wp0 = (wp0) dt0.R0(l);
                if (wp0 != null) {
                    List S = wp0.S();
                    S.getClass();
                    int F2 = tf4.F(et0.e0(S, 10));
                    if (F2 < 16) {
                        F2 = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(F2);
                    for (Object next : S) {
                        linkedHashMap.put(((h28) next).getName(), next);
                    }
                    List<or5> list = qr5.z;
                    list.getClass();
                    ArrayList arrayList = new ArrayList();
                    for (or5 or5 : list) {
                        or5.getClass();
                        h28 h28 = (h28) linkedHashMap.get(uq4.d(vq4.getString(or5.y)));
                        e21 e21 = null;
                        if (h28 != null) {
                            uq4 d = uq4.d(vq4.getString(or5.y));
                            vw3 b = h28.b();
                            b.getClass();
                            nr5 nr5 = or5.z;
                            nr5.getClass();
                            e21 K = K(b, nr5, vq4);
                            if (w(K, b, nr5)) {
                                e21 = K;
                            }
                            if (e21 == null) {
                                e21 = new a72("Unexpected argument value: actual type " + nr5.y + " != expected type " + b);
                            }
                            e21 = new yb5(d, e21);
                        }
                        if (e21 != null) {
                            arrayList.add(e21);
                        }
                    }
                    map = sf4.a0(arrayList);
                    return new gm(B2.g0(), map, sy6.j);
                }
            }
        }
        map = b42.w;
        return new gm(B2.g0(), map, sy6.j);
    }

    public boolean w(e21 e21, vw3 vw3, nr5 nr5) {
        int i;
        ql4 ql4;
        sl4 sl4 = (sl4) this.x;
        mr5 mr5 = nr5.y;
        if (mr5 == null) {
            i = -1;
        } else {
            i = hm.a[mr5.ordinal()];
        }
        if (i == 10) {
            vq0 u = vw3.L().u();
            if (u instanceof ql4) {
                ql4 = (ql4) u;
            } else {
                ql4 = null;
            }
            if (ql4 == null) {
                return true;
            }
            uq4 uq4 = fv3.e;
            if (fv3.b(ql4, m27.Q)) {
                return true;
            }
        } else if (i != 13) {
            return sg3.e(e21.a(sl4), vw3);
        } else {
            if (e21 instanceof ps) {
                Object obj = ((ps) e21).a;
                if (((List) obj).size() == nr5.G.size()) {
                    vw3 g = sl4.g().g(vw3);
                    if (g != null) {
                        re3 v = sg3.v((Collection) obj);
                        if ((v instanceof Collection) && ((Collection) v).isEmpty()) {
                            return true;
                        }
                        Iterator it = v.iterator();
                        while (((qe3) it).y) {
                            int nextInt = ((je3) it).nextInt();
                            nr5 nr52 = (nr5) nr5.G.get(nextInt);
                            nr52.getClass();
                            if (!w((e21) ((List) obj).get(nextInt), g, nr52)) {
                            }
                        }
                        return true;
                    }
                }
            }
            ku4.k("Deserialized ArrayValue should have the same number of elements as the original array value: ", e21);
            return false;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0015, code lost:
        r3 = new defpackage.yc5();
     */
    public Object x(gq3 gq3, ArrayList arrayList) {
        Object obj;
        Object obj2;
        Object putIfAbsent;
        switch (this.w) {
            case 26:
                Object q = ((pq0) this.y).get(kl8.u(gq3));
                q.getClass();
                zp4 zp4 = (zp4) q;
                Object obj3 = zp4.a.get();
                if (obj3 == null) {
                    synchronized (zp4) {
                        obj3 = zp4.a.get();
                        if (obj3 == null) {
                            obj3 = new yc5();
                            zp4.a = new SoftReference(obj3);
                        }
                    }
                }
                yc5 yc5 = (yc5) obj3;
                ArrayList arrayList2 = new ArrayList(et0.e0(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new js3((as3) it.next()));
                }
                ConcurrentHashMap concurrentHashMap = yc5.a;
                Object obj4 = concurrentHashMap.get(arrayList2);
                if (obj4 == null) {
                    try {
                        obj = (zr3) ((gs2) this.x).H(gq3, arrayList);
                    } catch (Throwable th) {
                        obj = new m66(th);
                    }
                    o66 o66 = new o66(obj);
                    Object putIfAbsent2 = concurrentHashMap.putIfAbsent(arrayList2, o66);
                    if (putIfAbsent2 == null) {
                        obj4 = o66;
                    } else {
                        obj4 = putIfAbsent2;
                    }
                }
                return ((o66) obj4).w;
            default:
                ConcurrentHashMap concurrentHashMap2 = (ConcurrentHashMap) this.y;
                Class u = kl8.u(gq3);
                Object obj5 = concurrentHashMap2.get(u);
                if (obj5 == null && (putIfAbsent = concurrentHashMap2.putIfAbsent(u, obj5)) != null) {
                    obj5 = putIfAbsent;
                }
                yc5 yc52 = (yc5) obj5;
                ArrayList arrayList3 = new ArrayList(et0.e0(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(new js3((as3) it2.next()));
                }
                ConcurrentHashMap concurrentHashMap3 = yc52.a;
                Object obj6 = concurrentHashMap3.get(arrayList3);
                if (obj6 == null) {
                    try {
                        obj2 = (zr3) ((gs2) this.x).H(gq3, arrayList);
                    } catch (Throwable th2) {
                        obj2 = new m66(th2);
                    }
                    o66 o662 = new o66(obj2);
                    Object putIfAbsent3 = concurrentHashMap3.putIfAbsent(arrayList3, o662);
                    if (putIfAbsent3 == null) {
                        obj6 = o662;
                    } else {
                        obj6 = putIfAbsent3;
                    }
                }
                return ((o66) obj6).w;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: k90} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v8, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v0, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v2, resolved type: int[][]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v10, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v12, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v9, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v11, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v14, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v23, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v16, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v14, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v15, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v24, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v10, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v19, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v11, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v21, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v12, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v13, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v31, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v14, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v27, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v14, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    public k90 y() {
        int[] iArr;
        int i;
        int i2;
        if (((k90) this.y) == null) {
            am6 am6 = (am6) this.x;
            k90 k90 = (k90) am6.A;
            if (k90 == null) {
                vg2 vg2 = (vg2) am6.x;
                int i3 = vg2.b;
                int i4 = vg2.c;
                boolean z2 = true;
                int i5 = 0;
                if (i3 < 40 || i4 < 40) {
                    k90 k902 = new k90(i3, i4);
                    if (((byte[]) am6.y).length < i3) {
                        am6.y = new byte[i3];
                    }
                    int i6 = 0;
                    while (true) {
                        iArr = (int[]) am6.z;
                        if (i6 >= 32) {
                            break;
                        }
                        iArr[i6] = 0;
                        i6++;
                    }
                    for (int i7 = 1; i7 < 5; i7++) {
                        byte[] h = vg2.h((i4 * i7) / 5, (byte[]) am6.y);
                        int i8 = (i3 << 2) / 5;
                        for (int i9 = i3 / 5; i9 < i8; i9++) {
                            int i10 = (h[i9] & 255) >> 3;
                            iArr[i10] = iArr[i10] + 1;
                        }
                    }
                    int w2 = am6.w(iArr);
                    byte[] g = vg2.g();
                    for (int i11 = 0; i11 < i4; i11++) {
                        int i12 = i11 * i3;
                        for (int i13 = 0; i13 < i3; i13++) {
                            if ((g[i12 + i13] & 255) < w2) {
                                k902.f(i13, i11);
                            }
                        }
                    }
                    am6.A = k902;
                } else {
                    byte[] g2 = vg2.g();
                    int i14 = i3 >> 3;
                    if ((i3 & 7) != 0) {
                        i14++;
                    }
                    int i15 = i4 >> 3;
                    if ((i4 & 7) != 0) {
                        i15++;
                    }
                    int i16 = i4 - 8;
                    int i17 = i3 - 8;
                    int i18 = 2;
                    int[] iArr2 = new int[2];
                    iArr2[1] = i14;
                    iArr2[0] = i15;
                    int[][] iArr3 = (int[][]) Array.newInstance(Integer.TYPE, iArr2);
                    int i19 = 0;
                    while (true) {
                        int i20 = 8;
                        if (i19 >= i15) {
                            break;
                        }
                        boolean z3 = z2;
                        int i21 = i19 << 3;
                        if (i21 > i16) {
                            i21 = i16;
                        }
                        int i22 = i5;
                        while (i5 < i14) {
                            int i23 = i18;
                            int i24 = i5 << 3;
                            if (i24 > i17) {
                                i24 = i17;
                            }
                            int i25 = (i21 * i3) + i24;
                            int i26 = i22;
                            int i27 = i26;
                            int i28 = i27;
                            int i29 = 255;
                            while (i26 < i20) {
                                byte[] bArr = g2;
                                int i30 = i21;
                                int i31 = i22;
                                int i32 = i28;
                                int i33 = i29;
                                while (i31 < i20) {
                                    int i34 = i31;
                                    int i35 = bArr[i25 + i31] & 255;
                                    i27 += i35;
                                    if (i35 < i33) {
                                        i33 = i35;
                                    }
                                    if (i35 > i32) {
                                        i32 = i35;
                                    }
                                    i31 = i34 + 1;
                                    i20 = 8;
                                }
                                if (i32 - i33 > 24) {
                                    while (true) {
                                        i26++;
                                        i25 += i3;
                                        if (i26 >= 8) {
                                            break;
                                        }
                                        int i36 = i22;
                                        for (int i37 = 8; i36 < i37; i37 = 8) {
                                            i27 += bArr[i25 + i36] & 255;
                                            i36++;
                                            i33 = i33;
                                        }
                                        int i38 = i33;
                                    }
                                }
                                i26++;
                                i25 += i3;
                                i29 = i33;
                                g2 = bArr;
                                i21 = i30;
                                i20 = 8;
                                i28 = i32;
                            }
                            byte[] bArr2 = g2;
                            int i39 = i21;
                            int i40 = i27 >> 6;
                            int i41 = i29;
                            if (i28 - i41 <= 24) {
                                i40 = i41 / 2;
                                if (i19 > 0 && i5 > 0) {
                                    int[] iArr4 = iArr3[i19 - 1];
                                    int i42 = i5 - 1;
                                    int i43 = (((iArr3[i19][i42] * 2) + iArr4[i5]) + iArr4[i42]) / 4;
                                    if (i41 < i43) {
                                        i40 = i43;
                                    }
                                }
                            }
                            iArr3[i19][i5] = i40;
                            i5++;
                            i18 = i23;
                            g2 = bArr2;
                            i21 = i39;
                            i20 = 8;
                        }
                        byte[] bArr3 = g2;
                        int i44 = i18;
                        i19++;
                        z2 = z3;
                        i5 = i22;
                    }
                    byte[] bArr4 = g2;
                    int i45 = i5;
                    int i46 = i18;
                    k90 k903 = new k90(i3, i4);
                    int i47 = i45;
                    while (i47 < i15) {
                        int i48 = i47 << 3;
                        if (i48 > i16) {
                            i48 = i16;
                        }
                        int i49 = i15 - 3;
                        if (i47 < i46) {
                            i = 2;
                        } else {
                            i = Math.min(i47, i49);
                        }
                        int i50 = i45;
                        while (i50 < i14) {
                            int i51 = i50 << 3;
                            if (i51 > i17) {
                                i51 = i17;
                            }
                            int i52 = i14 - 3;
                            int i53 = 2;
                            if (i50 < 2) {
                                i2 = 2;
                            } else {
                                i2 = Math.min(i50, i52);
                            }
                            int i54 = i47;
                            int i55 = -2;
                            int i56 = i45;
                            while (i55 <= i53) {
                                int[] iArr5 = iArr3[i + i55];
                                i56 = iArr5[i2 - 2] + iArr5[i2 - 1] + iArr5[i2] + iArr5[i2 + 1] + iArr5[i2 + 2] + i56;
                                i55++;
                                i53 = 2;
                            }
                            int i57 = i53;
                            int i58 = i56 / 25;
                            int i59 = (i48 * i3) + i51;
                            int i60 = i48;
                            int i61 = i45;
                            while (true) {
                                if (i61 >= 8) {
                                    break;
                                }
                                int i62 = i50;
                                int i63 = i45;
                                for (int i64 = 8; i63 < i64; i64 = 8) {
                                    int i65 = i63;
                                    if ((bArr4[i59 + i63] & 255) <= i58) {
                                        k903.f(i51 + i65, i60 + i61);
                                    }
                                    i63 = i65 + 1;
                                }
                                i61++;
                                i59 += i3;
                                i50 = i62;
                            }
                            i50++;
                            i48 = i60;
                            i47 = i54;
                        }
                        i46 = 2;
                        i47++;
                    }
                    am6.A = k903;
                }
                k90 = am6.A;
            }
            this.y = k90;
        }
        return (k90) this.y;
    }

    public i90 z(i90 i90, int i) {
        am6 am6 = (am6) this.x;
        int[] iArr = (int[]) am6.z;
        vg2 vg2 = (vg2) am6.x;
        int i2 = vg2.b;
        if (i90.x < i2) {
            i90 = new i90(i2);
        } else {
            int length = i90.w.length;
            for (int i3 = 0; i3 < length; i3++) {
                i90.w[i3] = 0;
            }
        }
        if (((byte[]) am6.y).length < i2) {
            am6.y = new byte[i2];
        }
        for (int i4 = 0; i4 < 32; i4++) {
            iArr[i4] = 0;
        }
        byte[] h = vg2.h(i, (byte[]) am6.y);
        for (int i5 = 0; i5 < i2; i5++) {
            int i6 = (h[i5] & 255) >> 3;
            iArr[i6] = iArr[i6] + 1;
        }
        int w2 = am6.w(iArr);
        if (i2 < 3) {
            for (int i7 = 0; i7 < i2; i7++) {
                if ((h[i7] & 255) < w2) {
                    i90.f(i7);
                }
            }
        } else {
            byte b = h[1] & 255;
            byte b2 = h[0] & 255;
            byte b3 = b;
            int i8 = 1;
            while (i8 < i2 - 1) {
                int i9 = i8 + 1;
                byte b4 = h[i9] & 255;
                if ((((b3 << 2) - b2) - b4) / 2 < w2) {
                    i90.f(i8);
                }
                b2 = b3;
                i8 = i9;
                b3 = b4;
            }
        }
        return i90;
    }

    public void d() {
    }

    public void h(Object obj) {
    }

    public /* synthetic */ qc3(int i, Object obj, Object obj2) {
        this.w = i;
        this.x = obj;
        this.y = obj2;
    }

    public /* synthetic */ qc3(int i, Object obj, boolean z2) {
        this.w = i;
        this.y = obj;
    }

    public /* synthetic */ qc3(int i, boolean z2) {
        this.w = i;
    }

    public qc3(String str, h49 h49, td0 td0) {
        this.w = 12;
        this.y = str;
        this.x = h49;
    }

    public qc3(sl4 sl4, am6 am6, md0 md0) {
        this.w = 10;
        sl4.getClass();
        md0.getClass();
        this.x = md0;
        this.y = new qc3(sl4, am6);
    }

    public qc3(int i) {
        this.w = i;
        switch (i) {
            case 5:
                this.x = new HashMap();
                this.y = new HashMap();
                return;
            case 9:
                this.x = Choreographer.getInstance();
                this.y = Looper.myLooper();
                return;
            default:
                this.x = new wr7(1);
                this.y = new wr7(0);
                return;
        }
    }

    public qc3(qp4 qp4, sg2 sg2) {
        this.w = 20;
        this.x = qp4;
        this.y = sg2;
        if (sg2.b != 1 || sg2.c != 1) {
            h.j(b81.m("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", sg2, " was passed"));
            throw null;
        }
    }

    public qc3(md2 md2) {
        this.w = 3;
        this.x = md2;
        this.y = C;
    }

    public qc3(sl4 sl4, am6 am6) {
        this.w = 11;
        sl4.getClass();
        am6.getClass();
        this.x = sl4;
        this.y = am6;
    }

    public qc3(xi5 xi5) {
        this.w = 27;
        this.x = new AtomicInteger(0);
        this.y = new AtomicBoolean(false);
    }

    public qc3(vr2 vr2) {
        this.w = 25;
        this.x = vr2;
        this.y = new pq0();
    }

    public qc3(EditText editText) {
        this.w = 14;
        this.x = editText;
        this.y = new ns8(editText);
    }

    public /* synthetic */ qc3(int i, Object obj) {
        this.w = i;
        this.x = obj;
    }

    public qc3(View view) {
        this.w = 0;
        this.x = view;
        this.y = rg3.y(i44.x, new zh(22, (Object) this));
    }

    public qc3(dq1 dq1, va6 va6) {
        this.w = 17;
        va6.getClass();
        this.y = dq1;
        this.x = va6;
    }

    public qc3(kd6 kd6, HashMap hashMap, HashMap hashMap2) {
        this.w = 6;
        this.x = kd6;
        this.y = hashMap;
    }

    public qc3(int i, gs2 gs2) {
        this.w = i;
        switch (i) {
            case 29:
                this.x = gs2;
                this.y = new ConcurrentHashMap();
                return;
            default:
                this.x = gs2;
                this.y = new pq0();
                return;
        }
    }

    public qc3(wo woVar, am6 am6) {
        this.w = 13;
        this.y = woVar;
        this.x = am6;
    }
}
