package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.util.SparseLongArray;
import android.view.FocusFinder;
import android.view.GestureDetector;
import android.view.InputDevice;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.ScrollCaptureTarget;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.translation.TranslationRequestValue;
import android.view.translation.ViewTranslationRequest;
import cu.lestebang.utiletecsa.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;

/* renamed from: je  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class je extends ViewGroup implements p95, d96, fh4, nm1, f85, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnTouchModeChangeListener, hk2 {
    public static final d63 b1 = new d63(19);
    public static Class c1;
    public static Method d1;
    public static Method e1;
    public static final lp4 f1 = new lp4();
    public static ka g1;
    public static Method h1;
    public static Method i1;
    public x54 A;
    public ip1 A0;
    public y54 B;
    public final aq4 B0;
    public a76 C = xb4.S;
    public final ed5 C0;
    public final as D = new as();
    public uc3 D0;
    public final ud E = new ud(this, 0);
    public final nl4 E0;
    public final ed5 F;
    public aj F0;
    public final View G;
    public MotionEvent G0;
    public final lk2 H;
    public long H0;
    public e81 I;
    public final k68 I0;
    public final tf J;
    public final lp4 J0;
    public final ed5 K;
    public float K0;
    public final oq1 L;
    public float L0;
    public final ob8 M;
    public float M0;
    public final uy3 N;
    public float N0;
    public final yo4 O;
    public final ge O0;
    public final ny5 P;
    public final ud P0;
    public final ik6 Q;
    public boolean Q0;
    public final oe R;
    public gs2 R0;
    public final bf S;
    public final za0 S0;
    public final gg T;
    public final zd T0;
    public final c20 U;
    public final zd U0;
    public final lp4 V;
    public boolean V0;
    public lp4 W;
    public boolean W0;
    public boolean X0;
    public final rg4 Y0;
    public View Z0;
    public boolean a0;
    public final ee a1;
    public final om4 b0;
    public final ge2 c0;
    public final ed5 d0;
    public final oq1 e0;
    public final ld f0;
    public final md g0;
    public boolean h0;
    public final r95 i0;
    public boolean j0;
    public k31 k0;
    public boolean l0;
    public final ih4 m0;
    public long n0;
    public final int[] o0;
    public final float[] p0;
    public final Matrix q0;
    public final float[] r0;
    public final float[] s0;
    public long t0;
    public boolean u0;
    public long v0;
    public yx0 w;
    public vr2 w0;
    public long x = 9205357640488583168L;
    public uf7 x0;
    public final boolean y = true;
    public rf7 y0;
    public sa3 z;
    public final AtomicReference z0;

    /* JADX WARNING: type inference failed for: r3v6, types: [e42, ll4] */
    /* JADX WARNING: type inference failed for: r0v24, types: [ge2, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v50, types: [nl4, java.lang.Object] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public je(Context context, yx0 yx0) {
        super(context);
        ld ldVar;
        md mdVar;
        ey3 ey3;
        Context context2 = context;
        yx0 yx02 = yx0;
        this.w = yx02;
        this.F = new ed5(rj1.f(context2), pe2.L);
        this.H = new lk2(this, this);
        yx02.f();
        ky0 ky0 = yx02.c;
        ky0.getClass();
        this.I = ky0.k();
        this.J = new tf();
        this.K = u55.p(Boolean.FALSE);
        this.L = u55.i(new zd(this, 0));
        this.M = new ob8();
        uy3 uy3 = new uy3(3);
        uy3.g0(e96.c);
        uy3.d0(getDensity());
        uy3.i0(getViewConfiguration());
        uy3.h0(new he(this).d(((lk2) getFocusOwner()).e).d(getDragAndDropManager().c));
        this.N = uy3;
        yo4 yo4 = ne3.a;
        this.O = new yo4();
        this.P = new ny5(getLayoutNodes(), this);
        this.Q = new ik6(getRoot(), new ll4(), getLayoutNodes());
        oe oeVar = new oe(this);
        this.R = oeVar;
        bf bfVar = new bf(this, new yd(0, this, we.class, "getContentCaptureSessionCompat", "getContentCaptureSessionCompat(Landroid/view/View;)Landroidx/compose/ui/contentcapture/ContentCaptureSessionWrapper;", 1, 0, 0));
        this.S = bfVar;
        this.T = new gg(this);
        this.U = new c20();
        this.V = new lp4();
        this.b0 = new om4();
        uy3 root = getRoot();
        ? obj = new Object();
        obj.b = root;
        obj.c = new c03((hc3) root.a0.d);
        obj.d = new rg4(1);
        obj.e = new f03();
        this.c0 = obj;
        this.d0 = u55.p(new Configuration(context2.getResources().getConfiguration()));
        this.e0 = u55.i(new zd(this, 2));
        rg4 rg4 = null;
        if (d()) {
            ldVar = new ld(this, getAutofillTree());
        } else {
            ldVar = null;
        }
        this.f0 = ldVar;
        if (d()) {
            mdVar = new md(new kg5(1, (Object) context2), getSemanticsOwner(), this, getRectManager(), context2.getPackageName());
        } else {
            mdVar = null;
        }
        this.g0 = mdVar;
        this.i0 = new r95(new de(this, 1));
        this.m0 = new ih4(getRoot());
        this.n0 = 9223372034707292159L;
        this.o0 = new int[]{0, 0};
        this.p0 = eh4.a();
        this.q0 = new Matrix();
        this.r0 = eh4.a();
        this.s0 = eh4.a();
        this.t0 = -1;
        this.v0 = 9187343241974906880L;
        this.z0 = new AtomicReference((Object) null);
        this.B0 = yx02.p;
        int layoutDirection = context2.getResources().getConfiguration().getLayoutDirection();
        int[] iArr = fk2.a;
        ey3 ey32 = ey3.w;
        if (layoutDirection == 0) {
            ey3 = ey32;
        } else if (layoutDirection != 1) {
            ey3 = null;
        } else {
            ey3 = ey3.x;
        }
        this.C0 = u55.p(ey3 != null ? ey3 : ey32);
        ? obj2 = new Object();
        new eq4(new e40[16]);
        new eq4(new ar7[16]);
        new eq4(new uy3[16]);
        new eq4(new ar7[16]);
        this.E0 = obj2;
        this.I0 = new k68(1);
        this.J0 = new lp4();
        this.K0 = Float.NaN;
        this.L0 = Float.NaN;
        this.M0 = Float.NaN;
        this.N0 = Float.NaN;
        this.O0 = new ge(0, (Object) this);
        this.P0 = new ud(this, 1);
        this.R0 = new zi8(1, this);
        this.S0 = new za0(context2, new de(this, 0));
        this.T0 = new zd(this, 4);
        this.U0 = new zd(this, 1);
        addOnAttachStateChangeListener(bfVar);
        setWillNotDraw(false);
        setFocusable(true);
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            ve.a.a(this, 1, false);
        }
        setFocusableInTouchMode(true);
        setClipChildren(false);
        e58.m(this, oeVar);
        setOnDragListener(getDragAndDropManager());
        if (i >= 29) {
            qe.a.a(this);
        }
        if (j()) {
            View view = new View(context2);
            view.setLayoutParams(new ViewGroup.LayoutParams(1, 1));
            view.setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
            this.G = view;
            addView(view, -1);
        }
        this.Y0 = i >= 31 ? new rg4(6) : rg4;
        this.a1 = new ee(this);
    }

    public static boolean d() {
        if (Build.VERSION.SDK_INT >= 26) {
            return true;
        }
        return false;
    }

    public static long e(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            return (long) size;
        }
        if (mode == 0) {
            return 2147483647L;
        }
        if (mode == 1073741824) {
            long j = (long) size;
            return j | (j << 32);
        }
        throw new IllegalStateException();
    }

    private final uk0 getCanvasHolder() {
        return this.w.u;
    }

    private final boolean getDerivedIsAttached() {
        return ((Boolean) this.L.getValue()).booleanValue();
    }

    private final uf7 getLegacyTextInputServiceAndroid() {
        uf7 uf7 = this.x0;
        if (uf7 != null) {
            return uf7;
        }
        uf7 uf72 = new uf7(getView(), this);
        this.x0 = uf72;
        return uf72;
    }

    public static void h(uy3 uy3) {
        uy3.E();
        eq4 z2 = uy3.z();
        Object[] objArr = z2.w;
        int i = z2.y;
        for (int i2 = 0; i2 < i; i2++) {
            h((uy3) objArr[i2]);
        }
    }

    public static boolean j() {
        if (Build.VERSION.SDK_INT >= 35) {
            return true;
        }
        return false;
    }

    public static boolean k(MotionEvent motionEvent) {
        boolean z2;
        boolean z3;
        if ((Float.floatToRawIntBits(motionEvent.getX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawY()) & Integer.MAX_VALUE) >= 2139095040) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i = 1; i < pointerCount; i++) {
                if ((Float.floatToRawIntBits(motionEvent.getX(i)) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY(i)) & Integer.MAX_VALUE) >= 2139095040 || (Build.VERSION.SDK_INT >= 29 && !pm4.a.a(motionEvent, i))) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z2) {
                    break;
                }
            }
        }
        return z2;
    }

    private final void setAttached(boolean z2) {
        this.K.setValue(Boolean.valueOf(z2));
    }

    private void setDensity(tp1 tp1) {
        this.F.setValue(tp1);
    }

    private void setLayoutDirection(ey3 ey3) {
        this.C0.setValue(ey3);
    }

    public final void A() {
        if (!this.u0) {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            if (currentAnimationTimeMillis != this.t0) {
                this.t0 = currentAnimationTimeMillis;
                C();
                ViewParent parent = getParent();
                View view = this;
                while (parent instanceof ViewGroup) {
                    view = (View) parent;
                    parent = ((ViewGroup) view).getParent();
                }
                int[] iArr = this.o0;
                view.getLocationOnScreen(iArr);
                view.getLocationInWindow(iArr);
                this.v0 = (((long) Float.floatToRawIntBits(((float) iArr[0]) - ((float) iArr[0]))) << 32) | (((long) Float.floatToRawIntBits(((float) iArr[1]) - ((float) iArr[1]))) & 4294967295L);
            }
        }
    }

    public final void B(MotionEvent motionEvent) {
        this.t0 = AnimationUtils.currentAnimationTimeMillis();
        C();
        float x2 = motionEvent.getX();
        float y2 = motionEvent.getY();
        long floatToRawIntBits = (long) Float.floatToRawIntBits(x2);
        long b = eh4.b((((long) Float.floatToRawIntBits(y2)) & 4294967295L) | (floatToRawIntBits << 32), this.r0);
        this.v0 = (((long) Float.floatToRawIntBits(motionEvent.getRawX() - Float.intBitsToFloat((int) (b >> 32)))) << 32) | (((long) Float.floatToRawIntBits(motionEvent.getRawY() - Float.intBitsToFloat((int) (b & 4294967295L)))) & 4294967295L);
    }

    public final void C() {
        int i = Build.VERSION.SDK_INT;
        float[] fArr = this.r0;
        int[] iArr = this.o0;
        if (i >= 29) {
            qh0.a.a(this, fArr, this.q0, iArr);
        } else {
            eh4.d(fArr);
            rj1.M(this, fArr, this.p0, iArr);
        }
        su0.C(fArr, this.s0);
    }

    public final boolean D() {
        if (isFocused()) {
            return true;
        }
        return super.requestFocus(130, (Rect) null);
    }

    public final void E(sr2 sr2) {
        as asVar = this.D;
        boolean isEmpty = asVar.isEmpty();
        asVar.addLast(sr2);
        if (isEmpty) {
            Handler handler = getHandler();
            if (handler != null) {
                handler.postAtFrontOfQueue(this.E);
            } else {
                h.q("schedule is called when outOfFrameExecutor is not available (view is detached)");
            }
        }
    }

    public final void F(uy3 uy3) {
        if (!isLayoutRequested() && isAttachedToWindow()) {
            if (uy3 != null) {
                while (uy3 != null && uy3.s() == sy3.w) {
                    if (!this.l0) {
                        uy3 v = uy3.v();
                        if (v == null) {
                            break;
                        }
                        long j = ((hc3) v.a0.d).z;
                        if (k31.f(j) && k31.e(j)) {
                            break;
                        }
                    }
                    uy3 = uy3.v();
                }
                if (uy3 == getRoot()) {
                    requestLayout();
                    return;
                }
            }
            if (getWidth() == 0 || getHeight() == 0) {
                requestLayout();
            } else {
                invalidate();
            }
        }
    }

    public final long G(long j) {
        A();
        return eh4.b((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (this.v0 & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (this.v0 >> 32)))) << 32), this.s0);
    }

    public final int H(MotionEvent motionEvent) {
        Object obj;
        if (this.V0) {
            this.V0 = false;
            k44 k44 = this.w.t;
            int metaState = motionEvent.getMetaState();
            k44.getClass();
            x98.a.setValue(new vk5(metaState));
        }
        om4 om4 = this.b0;
        kg5 c = om4.c(motionEvent, this);
        int actionMasked = motionEvent.getActionMasked();
        ge2 ge2 = this.c0;
        if (c != null) {
            List list = (List) c.x;
            int size = list.size() - 1;
            if (size >= 0) {
                while (true) {
                    int i = size - 1;
                    obj = list.get(size);
                    if (((sk5) obj).e && (actionMasked == 0 || actionMasked == 5)) {
                        break;
                    } else if (i < 0) {
                        break;
                    } else {
                        size = i;
                    }
                }
            }
            obj = null;
            sk5 sk5 = (sk5) obj;
            if (sk5 != null) {
                this.x = sk5.d;
            }
            int e = ge2.e(c, this, m(motionEvent));
            c.y = null;
            if ((actionMasked != 0 && actionMasked != 5) || (e & 1) != 0) {
                return e;
            }
            int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
            om4.c.delete(pointerId);
            om4.b.delete(pointerId);
            return e;
        }
        if (!ge2.a) {
            ((vc4) ((rg4) ge2.d).x).a();
            ((c03) ge2.c).c();
        }
        return 0;
    }

    public final void I(MotionEvent motionEvent, int i, long j, boolean z2) {
        int i2;
        int i3;
        long j2;
        int i4;
        MotionEvent motionEvent2 = motionEvent;
        int i5 = i;
        int actionMasked = motionEvent2.getActionMasked();
        int i6 = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                i6 = motionEvent2.getActionIndex();
            }
        } else if (!(i5 == 9 || i5 == 10)) {
            i6 = 0;
        }
        int pointerCount = motionEvent2.getPointerCount();
        if (i6 >= 0) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        int i7 = pointerCount - i2;
        if (i7 != 0) {
            MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[i7];
            for (int i8 = 0; i8 < i7; i8++) {
                pointerPropertiesArr[i8] = new MotionEvent.PointerProperties();
            }
            MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[i7];
            for (int i9 = 0; i9 < i7; i9++) {
                pointerCoordsArr[i9] = new MotionEvent.PointerCoords();
            }
            int i10 = 0;
            while (i10 < i7) {
                if (i6 < 0 || i6 > i10) {
                    i4 = 0;
                } else {
                    i4 = 1;
                }
                int i11 = i4 + i10;
                motionEvent2.getPointerProperties(i11, pointerPropertiesArr[i10]);
                MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i10];
                motionEvent2.getPointerCoords(i11, pointerCoords);
                float f = pointerCoords.x;
                long q = q((((long) Float.floatToRawIntBits(pointerCoords.y)) & 4294967295L) | (((long) Float.floatToRawIntBits(f)) << 32));
                pointerCoords.x = Float.intBitsToFloat((int) (q >> 32));
                pointerCoords.y = Float.intBitsToFloat((int) (q & 4294967295L));
                i10++;
                int i12 = i;
            }
            if (z2) {
                i3 = 0;
            } else {
                i3 = motionEvent2.getButtonState();
            }
            if (motionEvent2.getDownTime() == motionEvent2.getEventTime()) {
                j2 = j;
            } else {
                j2 = motionEvent2.getDownTime();
            }
            MotionEvent obtain = MotionEvent.obtain(j2, j, i, i7, pointerPropertiesArr, pointerCoordsArr, motionEvent2.getMetaState(), i3, motionEvent2.getXPrecision(), motionEvent2.getYPrecision(), motionEvent2.getDeviceId(), motionEvent2.getEdgeFlags(), motionEvent2.getSource(), motionEvent2.getFlags());
            kg5 c = this.b0.c(obtain, this);
            c.getClass();
            this.c0.e(c, this, true);
            obtain.recycle();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
    public final void J(gs2 gs2, h61 h61) {
        ie ieVar;
        int i;
        if (h61 instanceof ie) {
            ieVar = (ie) h61;
            int i2 = ieVar.B;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ieVar.B = i2 - Integer.MIN_VALUE;
                Object obj = ieVar.z;
                i = ieVar.B;
                if (i != 0) {
                    o85.q(obj);
                    de deVar = new de(this, 2);
                    ieVar.B = 1;
                    if (gl0.L(new ng((Object) deVar, (Object) this.z0, (Object) gs2, (f61) null, 18), ieVar) == p81.w) {
                        return;
                    }
                } else if (i != 1) {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return;
                } else {
                    o85.q(obj);
                }
                ta1.e();
            }
        }
        ieVar = new ie(this, h61);
        Object obj2 = ieVar.z;
        i = ieVar.B;
        if (i != 0) {
        }
        ta1.e();
    }

    public final void K(Configuration configuration) {
        Configuration configuration2 = getConfiguration();
        if (!sg3.e(configuration2, configuration)) {
            setConfiguration(new Configuration(configuration));
            if (configuration2.fontScale != configuration.fontScale || configuration2.densityDpi != configuration.densityDpi) {
                setDensity(rj1.f(getContext()));
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0123  */
    public final void L() {
        boolean z2;
        View view;
        float[] fArr;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int[] iArr = this.o0;
        getLocationOnScreen(iArr);
        long j = this.n0;
        int i15 = (int) (j >> 32);
        int i16 = (int) (j & 4294967295L);
        boolean z3 = false;
        int i17 = iArr[0];
        if (!(i15 == i17 && i16 == iArr[1] && this.t0 >= 0)) {
            this.n0 = (4294967295L & ((long) iArr[1])) | (((long) i17) << 32);
            if (!(i15 == Integer.MAX_VALUE || i16 == Integer.MAX_VALUE)) {
                eq4 z4 = getRoot().z();
                Object[] objArr = z4.w;
                int i18 = z4.y;
                for (int i19 = 0; i19 < i18; i19++) {
                    ((uy3) objArr[i19]).b0.p.G0();
                }
                z2 = true;
                A();
                view = this.Z0;
                if (view == null) {
                    view = getRootView();
                    this.Z0 = view;
                }
                ny5 rectManager = getRectManager();
                long j2 = this.n0;
                long V2 = gr8.V(this.v0);
                int width = view.getWidth();
                int height = view.getHeight();
                rectManager.getClass();
                fArr = this.r0;
                if (fArr.length >= 16) {
                    i = 0;
                } else {
                    if (fArr[0] == 1.0f) {
                        i2 = 1;
                    } else {
                        i2 = 0;
                    }
                    if (fArr[1] == 0.0f) {
                        i3 = 1;
                    } else {
                        i3 = 0;
                    }
                    int i20 = i2 & i3;
                    if (fArr[2] == 0.0f) {
                        i4 = 1;
                    } else {
                        i4 = 0;
                    }
                    int i21 = i20 & i4;
                    if (fArr[4] == 0.0f) {
                        i5 = 1;
                    } else {
                        i5 = 0;
                    }
                    int i22 = i21 & i5;
                    if (fArr[5] == 1.0f) {
                        i6 = 1;
                    } else {
                        i6 = 0;
                    }
                    int i23 = i22 & i6;
                    if (fArr[6] == 0.0f) {
                        i7 = 1;
                    } else {
                        i7 = 0;
                    }
                    int i24 = i23 & i7;
                    if (fArr[8] == 0.0f) {
                        i8 = 1;
                    } else {
                        i8 = 0;
                    }
                    int i25 = i24 & i8;
                    if (fArr[9] == 0.0f) {
                        i9 = 1;
                    } else {
                        i9 = 0;
                    }
                    int i26 = i25 & i9;
                    if (fArr[10] == 1.0f) {
                        i10 = 1;
                    } else {
                        i10 = 0;
                    }
                    int i27 = i26 & i10;
                    if (fArr[12] == 0.0f) {
                        i11 = 1;
                    } else {
                        i11 = 0;
                    }
                    if (fArr[13] == 0.0f) {
                        i12 = 1;
                    } else {
                        i12 = 0;
                    }
                    int i28 = i11 & i12;
                    if (fArr[14] == 0.0f) {
                        i13 = 1;
                    } else {
                        i13 = 0;
                    }
                    int i29 = i28 & i13;
                    if (fArr[15] == 1.0f) {
                        i14 = 1;
                    } else {
                        i14 = 0;
                    }
                    i = (i27 << 1) | (i14 & i29);
                }
                qh7 qh7 = rectManager.d;
                if ((i & 2) != 0) {
                    fArr = null;
                }
                if (qh7.c(j2, V2, fArr, width, height) || rectManager.g) {
                    z3 = true;
                }
                rectManager.g = z3;
                this.m0.b(z2);
                getRectManager().a();
            }
        }
        z2 = false;
        A();
        view = this.Z0;
        if (view == null) {
        }
        ny5 rectManager2 = getRectManager();
        long j22 = this.n0;
        long V22 = gr8.V(this.v0);
        int width2 = view.getWidth();
        int height2 = view.getHeight();
        rectManager2.getClass();
        fArr = this.r0;
        if (fArr.length >= 16) {
        }
        qh7 qh72 = rectManager2.d;
        if ((i & 2) != 0) {
        }
        z3 = true;
        rectManager2.g = z3;
        this.m0.b(z2);
        getRectManager().a();
    }

    public final void M(float f) {
        if (!j()) {
            return;
        }
        if (f > 0.0f) {
            if (Float.isNaN(this.K0) || f > this.K0) {
                this.K0 = f;
            }
        } else if (f >= 0.0f) {
        } else {
            if (Float.isNaN(this.L0) || f < this.L0) {
                this.L0 = f;
            }
        }
    }

    public final void a(t54 t54) {
        y54 y54 = this.B;
        if (y54 != null) {
            te4 te4 = (te4) y54.a.x;
            if (te4.w && !te4.y) {
                mk0 mk0 = y54.d;
                if (mk0 != null) {
                    mk0.cancel();
                }
                y54.d = null;
            } else if (!te4.x) {
                if (!te4.y) {
                    wm5.a("ManagedValuesStore tried to leave composition twice. Is the store installed in multiple places?");
                }
                if (!te4.z.i()) {
                    wm5.a("Attempted to start retaining exited values with pending exited values");
                }
                te4.y = false;
            }
        }
    }

    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        vk2 vk2 = ((lk2) getFocusOwner()).c;
        if (vk2.J) {
            if (!vk2.w.J) {
                yb3.b("visitSubtreeIf called on an unattached node");
            }
            eq4 eq4 = new eq4(new ll4[16]);
            ll4 ll4 = vk2.w;
            ll4 ll42 = ll4.B;
            if (ll42 == null) {
                rc9.h(eq4, ll4);
            } else {
                eq4.b(ll42);
            }
            while (true) {
                int i3 = eq4.y;
                if (i3 != 0) {
                    ll4 ll43 = (ll4) eq4.l(i3 - 1);
                    if ((ll43.z & 1024) != 0) {
                        ll4 ll44 = ll43;
                        while (ll44 != null && ll44.J) {
                            if ((ll44.y & 1024) != 0) {
                                ll4 ll45 = ll44;
                                eq4 eq42 = null;
                                while (ll45 != null) {
                                    int i4 = 0;
                                    if (ll45 instanceof vk2) {
                                        vk2 vk22 = (vk2) ll45;
                                        if (vk22.J && vk22.X0().a) {
                                            super.addFocusables(arrayList, i, i2);
                                            vk2 vk23 = ((lk2) getFocusOwner()).c;
                                            if (vk23.J) {
                                                if (!vk23.w.J) {
                                                    yb3.b("visitSubtreeIf called on an unattached node");
                                                }
                                                eq4 eq43 = new eq4(new ll4[16]);
                                                ll4 ll46 = vk23.w;
                                                ll4 ll47 = ll46.B;
                                                if (ll47 == null) {
                                                    rc9.h(eq43, ll46);
                                                } else {
                                                    eq43.b(ll47);
                                                }
                                                while (true) {
                                                    int i5 = eq43.y;
                                                    if (i5 == 0) {
                                                        break;
                                                    }
                                                    ll4 ll48 = (ll4) eq43.l(i5 - 1);
                                                    if ((ll48.z & 1024) != 0) {
                                                        ll4 ll49 = ll48;
                                                        while (ll49 != null && ll49.J) {
                                                            if ((ll49.y & 1024) != 0) {
                                                                ll4 ll410 = ll49;
                                                                eq4 eq44 = null;
                                                                while (ll410 != null) {
                                                                    if (ll410 instanceof vk2) {
                                                                        vk2 vk24 = (vk2) ll410;
                                                                        if (vk24.J) {
                                                                            mk2 X02 = vk24.X0();
                                                                            if (vk24.J && X02.a) {
                                                                                return;
                                                                            }
                                                                        }
                                                                    } else if ((ll410.y & 1024) != 0 && (ll410 instanceof wo1)) {
                                                                        int i6 = 0;
                                                                        for (ll4 ll411 = ((wo1) ll410).L; ll411 != null; ll411 = ll411.B) {
                                                                            if ((ll411.y & 1024) != 0) {
                                                                                i6++;
                                                                                if (i6 == 1) {
                                                                                    ll410 = ll411;
                                                                                } else {
                                                                                    if (eq44 == null) {
                                                                                        eq44 = new eq4(new ll4[16]);
                                                                                    }
                                                                                    if (ll410 != null) {
                                                                                        eq44.b(ll410);
                                                                                        ll410 = null;
                                                                                    }
                                                                                    eq44.b(ll411);
                                                                                }
                                                                            }
                                                                        }
                                                                        if (i6 == 1) {
                                                                        }
                                                                    }
                                                                    ll410 = rc9.j(eq44);
                                                                }
                                                                continue;
                                                            }
                                                            ll49 = ll49.B;
                                                        }
                                                    }
                                                    rc9.h(eq43, ll48);
                                                }
                                            }
                                            if (arrayList != null) {
                                                arrayList.remove(this);
                                                return;
                                            }
                                            return;
                                        }
                                    } else if ((ll45.y & 1024) != 0 && (ll45 instanceof wo1)) {
                                        for (ll4 ll412 = ((wo1) ll45).L; ll412 != null; ll412 = ll412.B) {
                                            if ((ll412.y & 1024) != 0) {
                                                i4++;
                                                if (i4 == 1) {
                                                    ll45 = ll412;
                                                } else {
                                                    if (eq42 == null) {
                                                        eq42 = new eq4(new ll4[16]);
                                                    }
                                                    if (ll45 != null) {
                                                        eq42.b(ll45);
                                                        ll45 = null;
                                                    }
                                                    eq42.b(ll412);
                                                }
                                            }
                                        }
                                        if (i4 == 1) {
                                        }
                                    }
                                    ll45 = rc9.j(eq42);
                                }
                                continue;
                            }
                            ll44 = ll44.B;
                        }
                    }
                    rc9.h(eq4, ll43);
                } else {
                    return;
                }
            }
        }
    }

    public final void addView(View view, int i) {
        view.getClass();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = generateDefaultLayoutParams();
        }
        addViewInLayout(view, i, layoutParams, true);
    }

    public final void autofill(SparseArray sparseArray) {
        ak6 x2;
        vr2 vr2;
        vr2 vr22;
        if (d()) {
            md autofillManager = getAutofillManager();
            if (autofillManager != null) {
                int size = sparseArray.size();
                for (int i = 0; i < size; i++) {
                    int keyAt = sparseArray.keyAt(i);
                    AutofillValue g = r4.g(sparseArray.get(keyAt));
                    uy3 uy3 = (uy3) autofillManager.x.c.b(keyAt);
                    if (!(uy3 == null || (x2 = uy3.x()) == null)) {
                        tp4 tp4 = x2.w;
                        Object g2 = tp4.g(zj6.g);
                        h4 h4Var = null;
                        if (g2 == null) {
                            g2 = null;
                        }
                        h4 h4Var2 = (h4) g2;
                        if (!(h4Var2 == null || (vr22 = (vr2) h4Var2.b) == null)) {
                            Boolean bool = (Boolean) vr22.y(new vl(g.getTextValue().toString()));
                        }
                        Object g3 = tp4.g(zj6.h);
                        if (g3 != null) {
                            h4Var = g3;
                        }
                        h4 h4Var3 = h4Var;
                        if (!(h4Var3 == null || (vr2 = (vr2) h4Var3.b) == null)) {
                            Boolean bool2 = (Boolean) vr2.y(new ag(g));
                        }
                    }
                }
            }
            ld autofill = getAutofill();
            if (autofill != null) {
                c20 c20 = autofill.b;
                if (!c20.a.isEmpty()) {
                    int size2 = sparseArray.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        int keyAt2 = sparseArray.keyAt(i2);
                        AutofillValue g4 = r4.g(sparseArray.get(keyAt2));
                        if (g4.isText()) {
                            g4.getTextValue().toString();
                            if (c20.a.get(Integer.valueOf(keyAt2)) != null) {
                                ku4.a();
                                return;
                            }
                        } else if (g4.isDate()) {
                            throw new Error("An operation is not implemented: b/138604541: Add onFill() callback for date");
                        } else if (g4.isList()) {
                            throw new Error("An operation is not implemented: b/138604541: Add onFill() callback for list");
                        } else if (g4.isToggle()) {
                            throw new Error("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                        }
                    }
                }
            }
        }
    }

    public final void b(vk2 vk2, vk2 vk22) {
        boolean z2;
        o00 o00;
        boolean z3;
        o00 o002;
        boolean z4;
        if (vk2 != null) {
            ll4 ll4 = vk2;
            if (!ll4.w.J) {
                yb3.b("visitAncestors called on an unattached node");
            }
            ll4 ll42 = ll4.w;
            uy3 O02 = rc9.O0(vk2);
            up4 up4 = null;
            ArrayList arrayList = null;
            while (O02 != null) {
                if ((((ll4) O02.a0.g).z & 2097152) != 0) {
                    while (ll42 != null) {
                        if ((ll42.y & 2097152) != 0) {
                            ll4 ll43 = ll42;
                            eq4 eq4 = null;
                            while (ll43 != null) {
                                if (ll43 instanceof bb3) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(ll43);
                                    z4 = false;
                                } else {
                                    z4 = true;
                                }
                                if (z4 && (ll43.y & 2097152) != 0 && (ll43 instanceof wo1)) {
                                    int i = 0;
                                    for (ll4 ll44 = ((wo1) ll43).L; ll44 != null; ll44 = ll44.B) {
                                        if ((ll44.y & 2097152) != 0) {
                                            i++;
                                            if (i == 1) {
                                                ll43 = ll44;
                                            } else {
                                                if (eq4 == null) {
                                                    eq4 = new eq4(new ll4[16]);
                                                }
                                                if (ll43 != null) {
                                                    eq4.b(ll43);
                                                    ll43 = null;
                                                }
                                                eq4.b(ll44);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                                ll43 = rc9.j(eq4);
                            }
                        }
                        ll42 = ll42.A;
                    }
                }
                O02 = O02.v();
                if (O02 == null || (o002 = O02.a0) == null) {
                    ll42 = null;
                } else {
                    ll42 = (ib7) o002.f;
                }
            }
            if (arrayList != null) {
                if (vk22 != null) {
                    if (!vk22.w.J) {
                        yb3.b("visitAncestors called on an unattached node");
                    }
                    ll4 ll45 = vk22.w;
                    uy3 O03 = rc9.O0(vk22);
                    up4 up42 = null;
                    while (O03 != null) {
                        if ((((ll4) O03.a0.g).z & 2097152) != 0) {
                            while (ll45 != null) {
                                if ((ll45.y & 2097152) != 0) {
                                    ll4 ll46 = ll45;
                                    eq4 eq42 = null;
                                    while (ll46 != null) {
                                        if (ll46 instanceof bb3) {
                                            if (up42 == null) {
                                                up4 up43 = cg6.a;
                                                new up4
                                                /*  JADX ERROR: Method code generation error
                                                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00ce: CONSTRUCTOR  (r14v12 ? I:up4) =  call: up4.<init>():void type: CONSTRUCTOR in method: je.b(vk2, vk2):void, dex: classes.dex
                                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:256)
                                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                                                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                                    	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:250)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                                    	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:250)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                                    	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:250)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                                                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                                                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                                                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                                                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                                                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
                                                    	at java.base/java.util.ArrayList.forEach(Unknown Source)
                                                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
                                                    	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
                                                    	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
                                                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
                                                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
                                                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
                                                    	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
                                                    	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
                                                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                                                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                                                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                                                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                                                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                                                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                                                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                                                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                                                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                                                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r14v12 ?
                                                    	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:189)
                                                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:620)
                                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                                                    	... 83 more
                                                    */
                                                /*
                                                    this = this;
                                                    if (r13 == 0) goto L_0x0144
                                                    r12 = r13
                                                    ll4 r12 = (defpackage.ll4) r12
                                                    ll4 r0 = r12.w
                                                    boolean r0 = r0.J
                                                    java.lang.String r1 = "visitAncestors called on an unattached node"
                                                    if (r0 != 0) goto L_0x0010
                                                    defpackage.yb3.b(r1)
                                                L_0x0010:
                                                    ll4 r12 = r12.w
                                                    uy3 r13 = defpackage.rc9.O0(r13)
                                                    r0 = 0
                                                    r2 = r0
                                                L_0x0018:
                                                    r3 = 16
                                                    r4 = 2097152(0x200000, float:2.938736E-39)
                                                    r5 = 0
                                                    r6 = 1
                                                    if (r13 == 0) goto L_0x0096
                                                    o00 r7 = r13.a0
                                                    java.lang.Object r7 = r7.g
                                                    ll4 r7 = (defpackage.ll4) r7
                                                    int r7 = r7.z
                                                    r7 = r7 & r4
                                                    if (r7 == 0) goto L_0x0085
                                                L_0x002b:
                                                    if (r12 == 0) goto L_0x0085
                                                    int r7 = r12.y
                                                    r7 = r7 & r4
                                                    if (r7 == 0) goto L_0x0082
                                                    r7 = r12
                                                    r8 = r0
                                                L_0x0034:
                                                    if (r7 == 0) goto L_0x0082
                                                    boolean r9 = r7 instanceof defpackage.bb3
                                                    if (r9 == 0) goto L_0x0046
                                                    if (r2 != 0) goto L_0x0041
                                                    java.util.ArrayList r2 = new java.util.ArrayList
                                                    r2.<init>()
                                                L_0x0041:
                                                    r2.add(r7)
                                                    r9 = r5
                                                    goto L_0x0047
                                                L_0x0046:
                                                    r9 = r6
                                                L_0x0047:
                                                    if (r9 == 0) goto L_0x007d
                                                    int r9 = r7.y
                                                    r9 = r9 & r4
                                                    if (r9 == 0) goto L_0x007d
                                                    boolean r9 = r7 instanceof defpackage.wo1
                                                    if (r9 == 0) goto L_0x007d
                                                    r9 = r7
                                                    wo1 r9 = (defpackage.wo1) r9
                                                    ll4 r9 = r9.L
                                                    r10 = r5
                                                L_0x0058:
                                                    if (r9 == 0) goto L_0x007a
                                                    int r11 = r9.y
                                                    r11 = r11 & r4
                                                    if (r11 == 0) goto L_0x0077
                                                    int r10 = r10 + 1
                                                    if (r10 != r6) goto L_0x0065
                                                    r7 = r9
                                                    goto L_0x0077
                                                L_0x0065:
                                                    if (r8 != 0) goto L_0x006e
                                                    eq4 r8 = new eq4
                                                    ll4[] r11 = new defpackage.ll4[r3]
                                                    r8.<init>(r11)
                                                L_0x006e:
                                                    if (r7 == 0) goto L_0x0074
                                                    r8.b(r7)
                                                    r7 = r0
                                                L_0x0074:
                                                    r8.b(r9)
                                                L_0x0077:
                                                    ll4 r9 = r9.B
                                                    goto L_0x0058
                                                L_0x007a:
                                                    if (r10 != r6) goto L_0x007d
                                                    goto L_0x0034
                                                L_0x007d:
                                                    ll4 r7 = defpackage.rc9.j(r8)
                                                    goto L_0x0034
                                                L_0x0082:
                                                    ll4 r12 = r12.A
                                                    goto L_0x002b
                                                L_0x0085:
                                                    uy3 r13 = r13.v()
                                                    if (r13 == 0) goto L_0x0094
                                                    o00 r12 = r13.a0
                                                    if (r12 == 0) goto L_0x0094
                                                    java.lang.Object r12 = r12.f
                                                    ib7 r12 = (defpackage.ib7) r12
                                                    goto L_0x0018
                                                L_0x0094:
                                                    r12 = r0
                                                    goto L_0x0018
                                                L_0x0096:
                                                    if (r2 != 0) goto L_0x009a
                                                    goto L_0x0144
                                                L_0x009a:
                                                    if (r14 == 0) goto L_0x0127
                                                    ll4 r12 = r14.w
                                                    boolean r12 = r12.J
                                                    if (r12 != 0) goto L_0x00a5
                                                    defpackage.yb3.b(r1)
                                                L_0x00a5:
                                                    ll4 r12 = r14.w
                                                    uy3 r13 = defpackage.rc9.O0(r14)
                                                    r14 = r0
                                                L_0x00ac:
                                                    if (r13 == 0) goto L_0x0126
                                                    o00 r1 = r13.a0
                                                    java.lang.Object r1 = r1.g
                                                    ll4 r1 = (defpackage.ll4) r1
                                                    int r1 = r1.z
                                                    r1 = r1 & r4
                                                    if (r1 == 0) goto L_0x0115
                                                L_0x00b9:
                                                    if (r12 == 0) goto L_0x0115
                                                    int r1 = r12.y
                                                    r1 = r1 & r4
                                                    if (r1 == 0) goto L_0x0112
                                                    r1 = r12
                                                    r7 = r0
                                                L_0x00c2:
                                                    if (r1 == 0) goto L_0x0112
                                                    boolean r8 = r1 instanceof defpackage.bb3
                                                    if (r8 == 0) goto L_0x00d6
                                                    if (r14 != 0) goto L_0x00d1
                                                    up4 r14 = defpackage.cg6.a
                                                    up4 r14 = new up4
                                                    r14.<init>()
                                                L_0x00d1:
                                                    r14.a(r1)
                                                    r8 = r5
                                                    goto L_0x00d7
                                                L_0x00d6:
                                                    r8 = r6
                                                L_0x00d7:
                                                    if (r8 == 0) goto L_0x010d
                                                    int r8 = r1.y
                                                    r8 = r8 & r4
                                                    if (r8 == 0) goto L_0x010d
                                                    boolean r8 = r1 instanceof defpackage.wo1
                                                    if (r8 == 0) goto L_0x010d
                                                    r8 = r1
                                                    wo1 r8 = (defpackage.wo1) r8
                                                    ll4 r8 = r8.L
                                                    r9 = r5
                                                L_0x00e8:
                                                    if (r8 == 0) goto L_0x010a
                                                    int r10 = r8.y
                                                    r10 = r10 & r4
                                                    if (r10 == 0) goto L_0x0107
                                                    int r9 = r9 + 1
                                                    if (r9 != r6) goto L_0x00f5
                                                    r1 = r8
                                                    goto L_0x0107
                                                L_0x00f5:
                                                    if (r7 != 0) goto L_0x00fe
                                                    eq4 r7 = new eq4
                                                    ll4[] r10 = new defpackage.ll4[r3]
                                                    r7.<init>(r10)
                                                L_0x00fe:
                                                    if (r1 == 0) goto L_0x0104
                                                    r7.b(r1)
                                                    r1 = r0
                                                L_0x0104:
                                                    r7.b(r8)
                                                L_0x0107:
                                                    ll4 r8 = r8.B
                                                    goto L_0x00e8
                                                L_0x010a:
                                                    if (r9 != r6) goto L_0x010d
                                                    goto L_0x00c2
                                                L_0x010d:
                                                    ll4 r1 = defpackage.rc9.j(r7)
                                                    goto L_0x00c2
                                                L_0x0112:
                                                    ll4 r12 = r12.A
                                                    goto L_0x00b9
                                                L_0x0115:
                                                    uy3 r13 = r13.v()
                                                    if (r13 == 0) goto L_0x0124
                                                    o00 r12 = r13.a0
                                                    if (r12 == 0) goto L_0x0124
                                                    java.lang.Object r12 = r12.f
                                                    ib7 r12 = (defpackage.ib7) r12
                                                    goto L_0x00ac
                                                L_0x0124:
                                                    r12 = r0
                                                    goto L_0x00ac
                                                L_0x0126:
                                                    r0 = r14
                                                L_0x0127:
                                                    int r12 = r2.size()
                                                    r13 = r5
                                                L_0x012c:
                                                    if (r13 >= r12) goto L_0x0144
                                                    java.lang.Object r14 = r2.get(r13)
                                                    bb3 r14 = (defpackage.bb3) r14
                                                    if (r0 == 0) goto L_0x013b
                                                    boolean r1 = r0.c(r14)
                                                    goto L_0x013c
                                                L_0x013b:
                                                    r1 = r5
                                                L_0x013c:
                                                    if (r1 != 0) goto L_0x0141
                                                    r14.h0()
                                                L_0x0141:
                                                    int r13 = r13 + 1
                                                    goto L_0x012c
                                                L_0x0144:
                                                    return
                                                */
                                                throw new UnsupportedOperationException("Method not decompiled: defpackage.je.b(vk2, vk2):void");
                                            }

                                            public final boolean canScrollHorizontally(int i) {
                                                return this.R.l(false, i, this.x);
                                            }

                                            public final boolean canScrollVertically(int i) {
                                                return this.R.l(true, i, this.x);
                                            }

                                            /* JADX INFO: finally extract failed */
                                            public final void dispatchDraw(Canvas canvas) {
                                                lp4 lp4 = this.V;
                                                if (!isAttachedToWindow()) {
                                                    h(getRoot());
                                                }
                                                r(true);
                                                nx6.j().m();
                                                this.a0 = true;
                                                Trace.beginSection("AndroidOwner:draw");
                                                try {
                                                    uk0 canvasHolder = getCanvasHolder();
                                                    od odVar = canvasHolder.a;
                                                    Canvas canvas2 = odVar.a;
                                                    odVar.a = canvas;
                                                    getRoot().i(odVar, (cx2) null);
                                                    canvasHolder.a.a = canvas2;
                                                    if (lp4.i()) {
                                                        int i = lp4.b;
                                                        for (int i2 = 0; i2 < i; i2++) {
                                                            ((fx2) ((o95) lp4.f(i2))).g();
                                                        }
                                                    }
                                                    int i3 = o58.w;
                                                    lp4.d();
                                                    this.a0 = false;
                                                    Trace.endSection();
                                                    lp4 lp42 = this.W;
                                                    if (lp42 != null) {
                                                        lp4.b(lp42);
                                                        lp42.d();
                                                    }
                                                    if (j()) {
                                                        if (Float.compare(this.K0, this.M0) != 0) {
                                                            float f = this.K0;
                                                            this.M0 = f;
                                                            kn.a(this, f);
                                                        }
                                                        View view = this.G;
                                                        if (view != null) {
                                                            if (Float.compare(this.L0, this.N0) != 0) {
                                                                float f2 = this.L0;
                                                                this.N0 = f2;
                                                                kn.a(view, f2);
                                                            }
                                                            if (!Float.isNaN(this.L0)) {
                                                                view.invalidate();
                                                                drawChild(canvas, view, getDrawingTime());
                                                            }
                                                        }
                                                        this.K0 = Float.NaN;
                                                        this.L0 = Float.NaN;
                                                    }
                                                } catch (Throwable th) {
                                                    Trace.endSection();
                                                    throw th;
                                                }
                                            }

                                            /* JADX WARNING: Code restructure failed: missing block: B:258:0x0448, code lost:
                                                if ((r2 / r3) >= 5.0f) goto L_0x041b;
                                             */
                                            public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
                                                String str;
                                                int i;
                                                ig igVar;
                                                bb3 bb3;
                                                o00 o00;
                                                boolean z2;
                                                ll4 ll4;
                                                o00 o002;
                                                boolean z3;
                                                boolean z4;
                                                bb3 bb32;
                                                int i2;
                                                int i3;
                                                o00 o003;
                                                boolean z5;
                                                ll4 ll42;
                                                o00 o004;
                                                boolean z6;
                                                int i4;
                                                sa3 sa3;
                                                String str2;
                                                long j;
                                                boolean z7;
                                                long j2;
                                                boolean z8;
                                                int i5;
                                                long j3;
                                                long eventTime;
                                                int i6;
                                                long j4;
                                                boolean z9;
                                                boolean z10;
                                                xd xdVar;
                                                int i7;
                                                o00 o005;
                                                boolean z11;
                                                xd xdVar2;
                                                o00 o006;
                                                MotionEvent motionEvent2 = motionEvent;
                                                if (this.Q0) {
                                                    ud udVar = this.P0;
                                                    removeCallbacks(udVar);
                                                    if (motionEvent2.getActionMasked() == 8) {
                                                        this.Q0 = false;
                                                    } else {
                                                        udVar.run();
                                                    }
                                                }
                                                if (k(motionEvent2) || !isAttachedToWindow()) {
                                                    return super.dispatchGenericMotionEvent(motionEvent);
                                                }
                                                String str3 = "visitAncestors called on an unattached node";
                                                int i8 = -1;
                                                boolean z12 = true;
                                                if (motionEvent2.getActionMasked() == 8) {
                                                    if (motionEvent2.isFromSource(4194304)) {
                                                        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
                                                        motionEvent2.getAxisValue(26);
                                                        Context context = getContext();
                                                        int i9 = Build.VERSION.SDK_INT;
                                                        if (i9 >= 26) {
                                                            Method method = h58.a;
                                                            an.g(viewConfiguration);
                                                        } else {
                                                            h58.a(viewConfiguration, context);
                                                        }
                                                        Context context2 = getContext();
                                                        if (i9 >= 26) {
                                                            an.f(viewConfiguration);
                                                        } else {
                                                            h58.a(viewConfiguration, context2);
                                                        }
                                                        motionEvent2.getEventTime();
                                                        motionEvent2.getDeviceId();
                                                        lk2 lk2 = (lk2) getFocusOwner();
                                                        if (lk2.d.e) {
                                                            System.out.println("FocusRelatedWarning: Dispatching rotary event while the focus system is invalidated.");
                                                            return false;
                                                        }
                                                        vk2 i02 = bb0.i0(lk2.c);
                                                        if (i02 != null) {
                                                            if (!i02.w.J) {
                                                                yb3.b(str3);
                                                            }
                                                            ll4 ll43 = i02.w;
                                                            uy3 O02 = rc9.O0(i02);
                                                            loop0:
                                                            while (true) {
                                                                if (O02 == null) {
                                                                    xdVar2 = null;
                                                                    break;
                                                                }
                                                                if ((((ll4) O02.a0.g).z & 16384) != 0) {
                                                                    while (ll43 != null) {
                                                                        if ((ll43.y & 16384) != 0) {
                                                                            xdVar2 = ll43;
                                                                            eq4 eq4 = null;
                                                                            while (xdVar2 != null) {
                                                                                if (xdVar2 instanceof xd) {
                                                                                    break loop0;
                                                                                }
                                                                                if ((xdVar2.y & 16384) != 0 && (xdVar2 instanceof wo1)) {
                                                                                    int i10 = 0;
                                                                                    for (ll4 ll44 = ((wo1) xdVar2).L; ll44 != null; ll44 = ll44.B) {
                                                                                        if ((ll44.y & 16384) != 0) {
                                                                                            i10++;
                                                                                            if (i10 == 1) {
                                                                                                xdVar2 = ll44;
                                                                                            } else {
                                                                                                if (eq4 == null) {
                                                                                                    eq4 = new eq4(new ll4[16]);
                                                                                                }
                                                                                                if (xdVar2 != null) {
                                                                                                    eq4.b(xdVar2);
                                                                                                    xdVar2 = null;
                                                                                                }
                                                                                                eq4.b(ll44);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    if (i10 == 1) {
                                                                                    }
                                                                                }
                                                                                xdVar2 = rc9.j(eq4);
                                                                            }
                                                                            continue;
                                                                        }
                                                                        ll43 = ll43.A;
                                                                    }
                                                                }
                                                                O02 = O02.v();
                                                                if (O02 == null || (o006 = O02.a0) == null) {
                                                                    ll43 = null;
                                                                } else {
                                                                    ll43 = (ib7) o006.f;
                                                                }
                                                            }
                                                            xdVar = xdVar2;
                                                        } else {
                                                            xdVar = null;
                                                        }
                                                        if (xdVar != null) {
                                                            if (!xdVar.w.J) {
                                                                yb3.b(str3);
                                                            }
                                                            ll4 ll45 = xdVar.w.A;
                                                            uy3 O03 = rc9.O0(xdVar);
                                                            ArrayList arrayList = null;
                                                            while (O03 != null) {
                                                                if ((((ll4) O03.a0.g).z & 16384) != 0) {
                                                                    while (ll45 != null) {
                                                                        if ((ll45.y & 16384) != 0) {
                                                                            ll4 ll46 = ll45;
                                                                            eq4 eq42 = null;
                                                                            while (ll46 != null) {
                                                                                if (ll46 instanceof xd) {
                                                                                    if (arrayList == null) {
                                                                                        arrayList = new ArrayList();
                                                                                    }
                                                                                    arrayList.add(ll46);
                                                                                    z11 = false;
                                                                                } else {
                                                                                    z11 = true;
                                                                                }
                                                                                if (z11 && (ll46.y & 16384) != 0 && (ll46 instanceof wo1)) {
                                                                                    int i11 = 0;
                                                                                    for (ll4 ll47 = ((wo1) ll46).L; ll47 != null; ll47 = ll47.B) {
                                                                                        if ((ll47.y & 16384) != 0) {
                                                                                            i11++;
                                                                                            if (i11 == 1) {
                                                                                                ll46 = ll47;
                                                                                            } else {
                                                                                                if (eq42 == null) {
                                                                                                    eq42 = new eq4(new ll4[16]);
                                                                                                }
                                                                                                if (ll46 != null) {
                                                                                                    eq42.b(ll46);
                                                                                                    ll46 = null;
                                                                                                }
                                                                                                eq42.b(ll47);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    if (i11 == 1) {
                                                                                    }
                                                                                }
                                                                                ll46 = rc9.j(eq42);
                                                                            }
                                                                        }
                                                                        ll45 = ll45.A;
                                                                    }
                                                                }
                                                                O03 = O03.v();
                                                                if (O03 == null || (o005 = O03.a0) == null) {
                                                                    ll45 = null;
                                                                } else {
                                                                    ll45 = (ib7) o005.f;
                                                                }
                                                            }
                                                            if (arrayList != null && arrayList.size() - 1 >= 0) {
                                                                while (true) {
                                                                    int i12 = i7 - 1;
                                                                    ((xd) arrayList.get(i7)).getClass();
                                                                    if (i12 < 0) {
                                                                        break;
                                                                    }
                                                                    i7 = i12;
                                                                }
                                                            }
                                                            ll4 ll48 = xdVar.w;
                                                            eq4 eq43 = null;
                                                            while (ll48 != null) {
                                                                if (!(ll48 instanceof xd) && (ll48.y & 16384) != 0 && (ll48 instanceof wo1)) {
                                                                    int i13 = 0;
                                                                    for (ll4 ll49 = ((wo1) ll48).L; ll49 != null; ll49 = ll49.B) {
                                                                        if ((ll49.y & 16384) != 0) {
                                                                            i13++;
                                                                            if (i13 == 1) {
                                                                                ll48 = ll49;
                                                                            } else {
                                                                                if (eq43 == null) {
                                                                                    eq43 = new eq4(new ll4[16]);
                                                                                }
                                                                                if (ll48 != null) {
                                                                                    eq43.b(ll48);
                                                                                    ll48 = null;
                                                                                }
                                                                                eq43.b(ll49);
                                                                            }
                                                                        }
                                                                    }
                                                                    if (i13 == 1) {
                                                                    }
                                                                }
                                                                ll48 = rc9.j(eq43);
                                                            }
                                                            if (!super.dispatchGenericMotionEvent(motionEvent)) {
                                                                ll4 ll410 = xdVar.w;
                                                                eq4 eq44 = null;
                                                                while (ll410 != null) {
                                                                    if (!(ll410 instanceof xd) && (ll410.y & 16384) != 0 && (ll410 instanceof wo1)) {
                                                                        int i14 = 0;
                                                                        for (ll4 ll411 = ((wo1) ll410).L; ll411 != null; ll411 = ll411.B) {
                                                                            if ((ll411.y & 16384) != 0) {
                                                                                i14++;
                                                                                if (i14 == 1) {
                                                                                    ll410 = ll411;
                                                                                } else {
                                                                                    if (eq44 == null) {
                                                                                        eq44 = new eq4(new ll4[16]);
                                                                                    }
                                                                                    if (ll410 != null) {
                                                                                        eq44.b(ll410);
                                                                                        ll410 = null;
                                                                                    }
                                                                                    eq44.b(ll411);
                                                                                }
                                                                            }
                                                                        }
                                                                        if (i14 == 1) {
                                                                        }
                                                                    }
                                                                    ll410 = rc9.j(eq44);
                                                                }
                                                                if (arrayList != null) {
                                                                    int size = arrayList.size();
                                                                    for (int i15 = 0; i15 < size; i15++) {
                                                                        ((xd) arrayList.get(i15)).getClass();
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        return false;
                                                    } else if ((g(motionEvent) & 4) != 0) {
                                                        return true;
                                                    } else {
                                                        return false;
                                                    }
                                                    return true;
                                                } else if (!motionEvent2.isFromSource(2097152)) {
                                                    return super.dispatchGenericMotionEvent(motionEvent);
                                                } else {
                                                    sa3 sa32 = this.z;
                                                    om4 om4 = this.b0;
                                                    vc4 vc4 = om4.e;
                                                    SparseLongArray sparseLongArray = om4.b;
                                                    int actionMasked = motionEvent2.getActionMasked();
                                                    om4.b(motionEvent2);
                                                    if (actionMasked == 3) {
                                                        sparseLongArray.clear();
                                                        om4.c.clear();
                                                        str = str3;
                                                        i = 16;
                                                        igVar = null;
                                                    } else {
                                                        om4.a(motionEvent2);
                                                        if (actionMasked == 1) {
                                                            i8 = 0;
                                                        } else if (actionMasked == 6) {
                                                            i8 = motionEvent2.getActionIndex();
                                                        }
                                                        if (actionMasked == 0 || actionMasked == 2 || actionMasked == 5) {
                                                            z6 = true;
                                                        } else {
                                                            z6 = false;
                                                        }
                                                        i = 16;
                                                        int pointerCount = motionEvent2.getPointerCount();
                                                        ArrayList arrayList2 = new ArrayList(pointerCount);
                                                        int i16 = 0;
                                                        while (i16 < pointerCount) {
                                                            int pointerId = motionEvent2.getPointerId(i16);
                                                            boolean z13 = z12;
                                                            int indexOfKey = sparseLongArray.indexOfKey(pointerId);
                                                            if (indexOfKey >= 0) {
                                                                str2 = str3;
                                                                j = sparseLongArray.valueAt(indexOfKey);
                                                                sa3 = sa32;
                                                            } else {
                                                                str2 = str3;
                                                                j = om4.a;
                                                                sa3 = sa32;
                                                                om4.a = j + 1;
                                                                sparseLongArray.put(pointerId, j);
                                                            }
                                                            om4 om42 = om4;
                                                            long floatToRawIntBits = (((long) Float.floatToRawIntBits(motionEvent2.getX(i16))) << 32) | (((long) Float.floatToRawIntBits(motionEvent2.getY(i16))) & 4294967295L);
                                                            if (i16 != i8) {
                                                                z7 = z13;
                                                            } else {
                                                                z7 = false;
                                                            }
                                                            nm4 nm4 = (nm4) vc4.b(j);
                                                            if (i16 == i8) {
                                                                vc4.f(j);
                                                                j3 = j;
                                                                j2 = 2147483647L;
                                                                z8 = true;
                                                                i5 = 65535;
                                                            } else {
                                                                if (z6) {
                                                                    j2 = 2147483647L;
                                                                    i5 = 65535;
                                                                    j3 = j;
                                                                    vc4.e(j3, new nm4(1 | ((motionEvent2.getEventTime() & 2147483647L) << z13) | (((long) ((((short) ((int) Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L)))) & 65535) | (((short) ((int) Float.intBitsToFloat((int) (floatToRawIntBits >> 32)))) << 16))) << 32)));
                                                                } else {
                                                                    j3 = j;
                                                                    j2 = 2147483647L;
                                                                    i5 = 65535;
                                                                }
                                                                z8 = true;
                                                            }
                                                            long eventTime2 = motionEvent2.getEventTime();
                                                            long j5 = j2;
                                                            float pressure = motionEvent2.getPressure(i16);
                                                            int i17 = i5;
                                                            int i18 = i8;
                                                            if (nm4 != null) {
                                                                eventTime = (nm4.a >> (z13 ? 1 : 0)) & j5;
                                                            } else {
                                                                eventTime = motionEvent2.getEventTime();
                                                            }
                                                            long j6 = eventTime;
                                                            if (nm4 != null) {
                                                                int i19 = (int) (nm4.a >>> (z8 ? 1 : 0));
                                                                i6 = i18;
                                                                j4 = (((long) Float.floatToRawIntBits((float) ((short) (i19 & i17)))) & 4294967295L) | (((long) Float.floatToRawIntBits((float) ((short) (i19 >>> 16)))) << (z8 ? 1 : 0));
                                                            } else {
                                                                i6 = i18;
                                                                j4 = floatToRawIntBits;
                                                            }
                                                            if (nm4 != null) {
                                                                if ((nm4.a & 1) != 0) {
                                                                    z10 = z13;
                                                                } else {
                                                                    z10 = false;
                                                                }
                                                                z9 = z10;
                                                            } else {
                                                                z9 = false;
                                                            }
                                                            arrayList2.add(new ta3(j3, eventTime2, floatToRawIntBits, z7, pressure, j6, j4, z9));
                                                            i16++;
                                                            om4 = om42;
                                                            z12 = z13;
                                                            str3 = str2;
                                                            sa32 = sa3;
                                                            i8 = i6;
                                                        }
                                                        sa3 sa33 = sa32;
                                                        str = str3;
                                                        boolean z14 = z12;
                                                        om4.e(motionEvent2);
                                                        if (sa33 != null) {
                                                            i4 = sa33.a;
                                                        } else if (motionEvent2.isFromSource(2097152)) {
                                                            InputDevice device = motionEvent2.getDevice();
                                                            if (device != null) {
                                                                InputDevice.MotionRange motionRange = device.getMotionRange(0);
                                                                InputDevice.MotionRange motionRange2 = device.getMotionRange(z14 ? 1 : 0);
                                                                if (motionRange == null || motionRange2 != null) {
                                                                    if (motionRange2 == null || motionRange != null) {
                                                                        if (!(motionRange == null || motionRange2 == null)) {
                                                                            float range = motionRange.getRange();
                                                                            float range2 = motionRange2.getRange();
                                                                            if (range <= range2 || (range2 != 0.0f && range / range2 < 5.0f)) {
                                                                                if (range2 > range) {
                                                                                    if (range != 0.0f) {
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    i4 = 2;
                                                                }
                                                                i4 = 1;
                                                            }
                                                            i4 = 0;
                                                        } else {
                                                            h.q("MotionEvent must be a touch navigation source");
                                                            return false;
                                                        }
                                                        if (!(actionMasked == 0 || actionMasked == 1 || actionMasked == 2 || actionMasked == 5)) {
                                                        }
                                                        igVar = new ig(arrayList2, i4, motionEvent2);
                                                    }
                                                    za0 za0 = this.S0;
                                                    if (igVar != null) {
                                                        lk2 lk22 = (lk2) getFocusOwner();
                                                        if (!lk22.d.e) {
                                                            vk2 g = lk22.g();
                                                            if (g != null) {
                                                                if (!g.w.J) {
                                                                    yb3.b(str);
                                                                }
                                                                ll4 ll412 = g.w;
                                                                uy3 O04 = rc9.O0(g);
                                                                loop15:
                                                                while (true) {
                                                                    if (O04 == null) {
                                                                        ll42 = null;
                                                                        break;
                                                                    }
                                                                    int i20 = 2097152;
                                                                    if ((((ll4) O04.a0.g).z & 2097152) != 0) {
                                                                        while (ll412 != null) {
                                                                            if ((ll412.y & i20) != 0) {
                                                                                ll42 = ll412;
                                                                                eq4 eq45 = null;
                                                                                while (ll42 != null) {
                                                                                    if (ll42 instanceof bb3) {
                                                                                        break loop15;
                                                                                    }
                                                                                    if ((ll42.y & i20) != 0 && (ll42 instanceof wo1)) {
                                                                                        ll4 ll413 = ((wo1) ll42).L;
                                                                                        int i21 = 0;
                                                                                        while (ll413 != null) {
                                                                                            if ((ll413.y & i20) != 0) {
                                                                                                i21++;
                                                                                                if (i21 == 1) {
                                                                                                    ll42 = ll413;
                                                                                                } else {
                                                                                                    if (eq45 == null) {
                                                                                                        eq45 = new eq4(new ll4[i]);
                                                                                                    }
                                                                                                    if (ll42 != null) {
                                                                                                        eq45.b(ll42);
                                                                                                        ll42 = null;
                                                                                                    }
                                                                                                    eq45.b(ll413);
                                                                                                }
                                                                                            }
                                                                                            ll413 = ll413.B;
                                                                                            i = 16;
                                                                                            i20 = 2097152;
                                                                                        }
                                                                                        if (i21 == 1) {
                                                                                            i = 16;
                                                                                            i20 = 2097152;
                                                                                        }
                                                                                    }
                                                                                    ll42 = rc9.j(eq45);
                                                                                    i = 16;
                                                                                    i20 = 2097152;
                                                                                }
                                                                                continue;
                                                                            }
                                                                            ll412 = ll412.A;
                                                                            i = 16;
                                                                            i20 = 2097152;
                                                                        }
                                                                    }
                                                                    O04 = O04.v();
                                                                    if (O04 == null || (o004 = O04.a0) == null) {
                                                                        ll412 = null;
                                                                    } else {
                                                                        ll412 = (ib7) o004.f;
                                                                    }
                                                                    i = 16;
                                                                }
                                                                bb32 = (bb3) ll42;
                                                            } else {
                                                                bb32 = null;
                                                            }
                                                            if (bb32 != null) {
                                                                ll4 ll414 = (ll4) bb32;
                                                                if (!ll414.w.J) {
                                                                    yb3.b(str);
                                                                }
                                                                ll4 ll415 = ll414.w.A;
                                                                uy3 O05 = rc9.O0(bb32);
                                                                ArrayList arrayList3 = null;
                                                                while (O05 != null) {
                                                                    int i22 = 2097152;
                                                                    if ((((ll4) O05.a0.g).z & 2097152) != 0) {
                                                                        while (ll415 != null) {
                                                                            if ((ll415.y & i22) != 0) {
                                                                                ll4 ll416 = ll415;
                                                                                eq4 eq46 = null;
                                                                                while (ll416 != null) {
                                                                                    if (ll416 instanceof bb3) {
                                                                                        if (arrayList3 == null) {
                                                                                            arrayList3 = new ArrayList();
                                                                                        }
                                                                                        arrayList3.add(ll416);
                                                                                        z5 = false;
                                                                                    } else {
                                                                                        z5 = true;
                                                                                    }
                                                                                    if (z5) {
                                                                                        int i23 = 2097152;
                                                                                        if ((ll416.y & 2097152) != 0 && (ll416 instanceof wo1)) {
                                                                                            ll4 ll417 = ((wo1) ll416).L;
                                                                                            int i24 = 0;
                                                                                            while (ll417 != null) {
                                                                                                if ((ll417.y & i23) != 0) {
                                                                                                    i24++;
                                                                                                    if (i24 == 1) {
                                                                                                        ll416 = ll417;
                                                                                                    } else {
                                                                                                        if (eq46 == null) {
                                                                                                            eq46 = new eq4(new ll4[16]);
                                                                                                        }
                                                                                                        if (ll416 != null) {
                                                                                                            eq46.b(ll416);
                                                                                                            ll416 = null;
                                                                                                        }
                                                                                                        eq46.b(ll417);
                                                                                                    }
                                                                                                }
                                                                                                ll417 = ll417.B;
                                                                                                i23 = 2097152;
                                                                                            }
                                                                                            if (i24 == 1) {
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    ll416 = rc9.j(eq46);
                                                                                }
                                                                            }
                                                                            ll415 = ll415.A;
                                                                            i22 = 2097152;
                                                                        }
                                                                    }
                                                                    O05 = O05.v();
                                                                    if (O05 == null || (o003 = O05.a0) == null) {
                                                                        ll415 = null;
                                                                    } else {
                                                                        ll415 = (ib7) o003.f;
                                                                    }
                                                                }
                                                                lk5 lk5 = lk5.w;
                                                                if (arrayList3 != null && arrayList3.size() - 1 >= 0) {
                                                                    while (true) {
                                                                        int i25 = i3 - 1;
                                                                        ((bb3) arrayList3.get(i3)).w(igVar, lk5);
                                                                        if (i25 < 0) {
                                                                            break;
                                                                        }
                                                                        i3 = i25;
                                                                    }
                                                                }
                                                                bb32.w(igVar, lk5);
                                                                lk5 lk52 = lk5.x;
                                                                bb32.w(igVar, lk52);
                                                                if (arrayList3 != null) {
                                                                    int size2 = arrayList3.size();
                                                                    for (int i26 = 0; i26 < size2; i26++) {
                                                                        ((bb3) arrayList3.get(i26)).w(igVar, lk52);
                                                                    }
                                                                }
                                                                lk5 lk53 = lk5.y;
                                                                if (arrayList3 != null && arrayList3.size() - 1 >= 0) {
                                                                    while (true) {
                                                                        int i27 = i2 - 1;
                                                                        ((bb3) arrayList3.get(i2)).w(igVar, lk53);
                                                                        if (i27 < 0) {
                                                                            break;
                                                                        }
                                                                        i2 = i27;
                                                                    }
                                                                }
                                                                bb32.w(igVar, lk53);
                                                            }
                                                            ArrayList arrayList4 = (ArrayList) igVar.c;
                                                            int size3 = arrayList4.size();
                                                            int i28 = 0;
                                                            while (true) {
                                                                if (i28 >= size3) {
                                                                    break;
                                                                } else if (((ta3) arrayList4.get(i28)).i) {
                                                                    z3 = true;
                                                                    break;
                                                                } else {
                                                                    i28++;
                                                                }
                                                            }
                                                        } else {
                                                            System.out.println("FocusRelatedWarning: Dispatching indirect pointer event while the focus system is invalidated.");
                                                        }
                                                        z3 = false;
                                                        za0.getClass();
                                                        MotionEvent motionEvent3 = (MotionEvent) igVar.d;
                                                        int action = motionEvent3.getAction();
                                                        if (action != 0) {
                                                            z4 = true;
                                                            if ((action == 1 || action == 2) && z3) {
                                                                za0.b = 0;
                                                                za0.c = true;
                                                            }
                                                        } else {
                                                            z4 = true;
                                                            za0.b = igVar.b;
                                                            za0.c = false;
                                                        }
                                                        ((GestureDetector) za0.e).onTouchEvent(motionEvent3);
                                                        return z4;
                                                    }
                                                    vk2 g2 = ((lk2) getFocusOwner()).g();
                                                    if (g2 != null) {
                                                        if (!g2.w.J) {
                                                            yb3.b(str);
                                                        }
                                                        ll4 ll418 = g2.w;
                                                        uy3 O06 = rc9.O0(g2);
                                                        loop27:
                                                        while (true) {
                                                            if (O06 == null) {
                                                                ll4 = null;
                                                                break;
                                                            }
                                                            int i29 = 2097152;
                                                            if ((((ll4) O06.a0.g).z & 2097152) != 0) {
                                                                while (ll418 != null) {
                                                                    if ((ll418.y & i29) != 0) {
                                                                        ll4 = ll418;
                                                                        eq4 eq47 = null;
                                                                        while (ll4 != null) {
                                                                            if (ll4 instanceof bb3) {
                                                                                break loop27;
                                                                            }
                                                                            if ((ll4.y & i29) != 0 && (ll4 instanceof wo1)) {
                                                                                ll4 ll419 = ((wo1) ll4).L;
                                                                                int i30 = 0;
                                                                                while (ll419 != null) {
                                                                                    if ((ll419.y & i29) != 0) {
                                                                                        i30++;
                                                                                        if (i30 == 1) {
                                                                                            ll4 = ll419;
                                                                                        } else {
                                                                                            if (eq47 == null) {
                                                                                                eq47 = new eq4(new ll4[16]);
                                                                                            }
                                                                                            if (ll4 != null) {
                                                                                                eq47.b(ll4);
                                                                                                ll4 = null;
                                                                                            }
                                                                                            eq47.b(ll419);
                                                                                        }
                                                                                    }
                                                                                    ll419 = ll419.B;
                                                                                    i29 = 2097152;
                                                                                }
                                                                                if (i30 == 1) {
                                                                                    i29 = 2097152;
                                                                                }
                                                                            }
                                                                            ll4 = rc9.j(eq47);
                                                                            i29 = 2097152;
                                                                        }
                                                                        continue;
                                                                    }
                                                                    ll418 = ll418.A;
                                                                    i29 = 2097152;
                                                                }
                                                            }
                                                            O06 = O06.v();
                                                            if (O06 == null || (o002 = O06.a0) == null) {
                                                                ll418 = null;
                                                            } else {
                                                                ll418 = (ib7) o002.f;
                                                            }
                                                        }
                                                        bb3 = (bb3) ll4;
                                                    } else {
                                                        bb3 = null;
                                                    }
                                                    if (bb3 != null) {
                                                        ll4 ll420 = (ll4) bb3;
                                                        if (!ll420.w.J) {
                                                            yb3.b(str);
                                                        }
                                                        ll4 ll421 = ll420.w.A;
                                                        uy3 O07 = rc9.O0(bb3);
                                                        ArrayList arrayList5 = null;
                                                        while (O07 != null) {
                                                            int i31 = 2097152;
                                                            if ((((ll4) O07.a0.g).z & 2097152) != 0) {
                                                                while (ll421 != null) {
                                                                    if ((ll421.y & i31) != 0) {
                                                                        ll4 ll422 = ll421;
                                                                        eq4 eq48 = null;
                                                                        while (ll422 != null) {
                                                                            if (ll422 instanceof bb3) {
                                                                                if (arrayList5 == null) {
                                                                                    arrayList5 = new ArrayList();
                                                                                }
                                                                                arrayList5.add(ll422);
                                                                                z2 = false;
                                                                            } else {
                                                                                z2 = true;
                                                                            }
                                                                            if (z2) {
                                                                                if ((ll422.y & 2097152) != 0 && (ll422 instanceof wo1)) {
                                                                                    int i32 = 0;
                                                                                    for (ll4 ll423 = ((wo1) ll422).L; ll423 != null; ll423 = ll423.B) {
                                                                                        if ((ll423.y & 2097152) != 0) {
                                                                                            i32++;
                                                                                            if (i32 == 1) {
                                                                                                ll422 = ll423;
                                                                                            } else {
                                                                                                if (eq48 == null) {
                                                                                                    eq48 = new eq4(new ll4[16]);
                                                                                                }
                                                                                                if (ll422 != null) {
                                                                                                    eq48.b(ll422);
                                                                                                    ll422 = null;
                                                                                                }
                                                                                                eq48.b(ll423);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    if (i32 == 1) {
                                                                                    }
                                                                                }
                                                                            }
                                                                            ll422 = rc9.j(eq48);
                                                                        }
                                                                    }
                                                                    i31 = 2097152;
                                                                    ll421 = ll421.A;
                                                                }
                                                            }
                                                            O07 = O07.v();
                                                            if (O07 == null || (o00 = O07.a0) == null) {
                                                                ll421 = null;
                                                            } else {
                                                                ll421 = (ib7) o00.f;
                                                            }
                                                        }
                                                        bb3.h0();
                                                        if (arrayList5 != null) {
                                                            int size4 = arrayList5.size();
                                                            for (int i33 = 0; i33 < size4; i33++) {
                                                                ((bb3) arrayList5.get(i33)).h0();
                                                            }
                                                        }
                                                    }
                                                    za0.b = 0;
                                                    za0.c = true;
                                                    return true;
                                                }
                                            }

                                            /* JADX WARNING: Code restructure failed: missing block: B:36:0x0100, code lost:
                                                if (r13 == Integer.MIN_VALUE) goto L_0x0105;
                                             */
                                            /* JADX WARNING: Code restructure failed: missing block: B:56:0x0145, code lost:
                                                if (n(r23) == false) goto L_0x0147;
                                             */
                                            /* JADX WARNING: Removed duplicated region for block: B:41:0x010d  */
                                            /* JADX WARNING: Removed duplicated region for block: B:55:0x013f  */
                                            public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
                                                boolean z2;
                                                int actionMasked;
                                                int i;
                                                boolean z3 = this.Q0;
                                                ud udVar = this.P0;
                                                if (z3) {
                                                    removeCallbacks(udVar);
                                                    udVar.run();
                                                }
                                                if (!k(motionEvent) && isAttachedToWindow()) {
                                                    oe oeVar = this.R;
                                                    je jeVar = oeVar.z;
                                                    AccessibilityManager accessibilityManager = oeVar.C;
                                                    if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
                                                        int action = motionEvent.getAction();
                                                        if (action == 7 || action == 9) {
                                                            float x2 = motionEvent.getX();
                                                            float y2 = motionEvent.getY();
                                                            jeVar.r(true);
                                                            f03 f03 = new f03();
                                                            uy3 root = jeVar.getRoot();
                                                            long floatToRawIntBits = (((long) Float.floatToRawIntBits(x2)) << 32) | (((long) Float.floatToRawIntBits(y2)) & 4294967295L);
                                                            o00 o00 = root.a0;
                                                            l76 l76 = xz4.m0;
                                                            ((xz4) o00.e).h1(xz4.q0, ((xz4) o00.e).Z0(floatToRawIntBits), f03, 1, true);
                                                            lp4 lp4 = f03.w;
                                                            int i2 = lp4.b - 1;
                                                            while (true) {
                                                                if (-1 >= i2) {
                                                                    i = Integer.MIN_VALUE;
                                                                    break;
                                                                }
                                                                Object f = lp4.f(i2);
                                                                f.getClass();
                                                                uy3 O02 = rc9.O0((ll4) f);
                                                                jeVar.getAndroidViewsHandler();
                                                                if (O02.a0.f(8)) {
                                                                    i = oeVar.z(O02.x);
                                                                    fk6 b = h75.b(O02, false);
                                                                    if (we.A(b)) {
                                                                        if (!b.k().w.c(jk6.B)) {
                                                                            break;
                                                                        }
                                                                    } else {
                                                                        continue;
                                                                    }
                                                                }
                                                                i2--;
                                                            }
                                                            jeVar.getAndroidViewsHandler();
                                                            int i3 = oeVar.A;
                                                            if (i3 != i) {
                                                                oeVar.A = i;
                                                                oe.D(oeVar, i, 128, (Integer) null, 12);
                                                                oe.D(oeVar, i3, 256, (Integer) null, 12);
                                                            }
                                                        } else if (action == 10) {
                                                            int i4 = oeVar.A;
                                                            if (i4 == Integer.MIN_VALUE) {
                                                                jeVar.getAndroidViewsHandler();
                                                            } else if (i4 != Integer.MIN_VALUE) {
                                                                oeVar.A = Integer.MIN_VALUE;
                                                                oe.D(oeVar, Integer.MIN_VALUE, 128, (Integer) null, 12);
                                                                oe.D(oeVar, i4, 256, (Integer) null, 12);
                                                            }
                                                        }
                                                        z2 = true;
                                                        actionMasked = motionEvent.getActionMasked();
                                                        if (actionMasked != 7) {
                                                            MotionEvent motionEvent2 = motionEvent;
                                                        } else if (actionMasked == 10 && m(motionEvent)) {
                                                            MotionEvent motionEvent3 = motionEvent;
                                                            if (motionEvent3.getToolType(0) != 3 || motionEvent3.getButtonState() == 0) {
                                                                MotionEvent motionEvent4 = this.G0;
                                                                if (motionEvent4 != null) {
                                                                    motionEvent4.recycle();
                                                                }
                                                                this.G0 = MotionEvent.obtainNoHistory(motionEvent3);
                                                                this.Q0 = true;
                                                                postDelayed(udVar, 8);
                                                                return z2;
                                                            }
                                                        } else {
                                                            MotionEvent motionEvent5 = motionEvent;
                                                            if ((g(motionEvent) & 1) == 0 && !z2) {
                                                                return false;
                                                            }
                                                            return true;
                                                        }
                                                        return z2;
                                                    }
                                                    z2 = false;
                                                    actionMasked = motionEvent.getActionMasked();
                                                    if (actionMasked != 7) {
                                                    }
                                                    return z2;
                                                }
                                                return false;
                                            }

                                            public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
                                                if (isFocused()) {
                                                    k44 k44 = this.w.t;
                                                    int metaState = keyEvent.getMetaState();
                                                    k44.getClass();
                                                    x98.a.setValue(new vk5(metaState));
                                                    if (((lk2) getFocusOwner()).e(keyEvent, vy0.G) || super.dispatchKeyEvent(keyEvent)) {
                                                        return true;
                                                    }
                                                    return false;
                                                }
                                                return ((lk2) getFocusOwner()).e(keyEvent, new ae(0, this, keyEvent));
                                            }

                                            public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
                                                o00 o00;
                                                if (isFocused()) {
                                                    lk2 lk2 = (lk2) getFocusOwner();
                                                    if (lk2.d.e) {
                                                        System.out.println("FocusRelatedWarning: Dispatching intercepted soft keyboard event while the focus system is invalidated.");
                                                    } else {
                                                        vk2 i02 = bb0.i0(lk2.c);
                                                        if (i02 != null) {
                                                            if (!i02.w.J) {
                                                                yb3.b("visitAncestors called on an unattached node");
                                                            }
                                                            ll4 ll4 = i02.w;
                                                            uy3 O02 = rc9.O0(i02);
                                                            while (O02 != null) {
                                                                if ((((ll4) O02.a0.g).z & 131072) != 0) {
                                                                    while (ll4 != null) {
                                                                        if ((ll4.y & 131072) != 0) {
                                                                            ll4 ll42 = ll4;
                                                                            eq4 eq4 = null;
                                                                            while (ll42 != null) {
                                                                                if ((ll42.y & 131072) != 0 && (ll42 instanceof wo1)) {
                                                                                    int i = 0;
                                                                                    for (ll4 ll43 = ((wo1) ll42).L; ll43 != null; ll43 = ll43.B) {
                                                                                        if ((ll43.y & 131072) != 0) {
                                                                                            i++;
                                                                                            if (i == 1) {
                                                                                                ll42 = ll43;
                                                                                            } else {
                                                                                                if (eq4 == null) {
                                                                                                    eq4 = new eq4(new ll4[16]);
                                                                                                }
                                                                                                if (ll42 != null) {
                                                                                                    eq4.b(ll42);
                                                                                                    ll42 = null;
                                                                                                }
                                                                                                eq4.b(ll43);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    if (i == 1) {
                                                                                    }
                                                                                }
                                                                                ll42 = rc9.j(eq4);
                                                                            }
                                                                        }
                                                                        ll4 = ll4.A;
                                                                    }
                                                                }
                                                                O02 = O02.v();
                                                                if (O02 == null || (o00 = O02.a0) == null) {
                                                                    ll4 = null;
                                                                } else {
                                                                    ll4 = (ib7) o00.f;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                if (super.dispatchKeyEventPreIme(keyEvent)) {
                                                    return true;
                                                }
                                                return false;
                                            }

                                            /* JADX INFO: finally extract failed */
                                            public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
                                                if (d()) {
                                                    this.X0 = true;
                                                    try {
                                                        super.dispatchProvideAutofillStructure(viewStructure, i);
                                                        this.X0 = false;
                                                        z(viewStructure);
                                                    } catch (Throwable th) {
                                                        this.X0 = false;
                                                        throw th;
                                                    }
                                                }
                                            }

                                            public final void dispatchProvideStructure(ViewStructure viewStructure) {
                                                if (Build.VERSION.SDK_INT < 28) {
                                                    pe.a.a(viewStructure, getView());
                                                } else {
                                                    super.dispatchProvideStructure(viewStructure);
                                                }
                                            }

                                            public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
                                                boolean z2;
                                                boolean z3;
                                                View view;
                                                Object obj;
                                                vk2 g;
                                                if (this.Q0) {
                                                    ud udVar = this.P0;
                                                    removeCallbacks(udVar);
                                                    MotionEvent motionEvent2 = this.G0;
                                                    motionEvent2.getClass();
                                                    if (motionEvent.getActionMasked() == 0 && motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) {
                                                        this.Q0 = false;
                                                    } else {
                                                        udVar.run();
                                                    }
                                                }
                                                if (!k(motionEvent) && isAttachedToWindow() && (motionEvent.getActionMasked() != 2 || n(motionEvent))) {
                                                    int g2 = g(motionEvent);
                                                    if ((g2 & 2) != 0) {
                                                        getParent().requestDisallowInterceptTouchEvent(true);
                                                    }
                                                    if (motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5) {
                                                        z2 = true;
                                                    } else {
                                                        z2 = false;
                                                    }
                                                    if (motionEvent.isFromSource(8194) || motionEvent.isFromSource(1048584)) {
                                                        z3 = true;
                                                    } else {
                                                        z3 = false;
                                                    }
                                                    if (z2 && z3) {
                                                        ViewParent parent = getParent();
                                                        if (parent instanceof View) {
                                                            view = (View) parent;
                                                        } else {
                                                            view = null;
                                                        }
                                                        if (view == null || (obj = view.getTag(R.id.auto_clear_focus_behavior_tag)) == null) {
                                                            obj = new ww(1);
                                                        }
                                                        if (obj.equals(new ww(1)) && (g = ((lk2) getFocusOwner()).g()) != null) {
                                                            xz4 N02 = rc9.N0(g);
                                                            if (!t49.I(N02).Q(N02, true).a((((long) Float.floatToRawIntBits(motionEvent.getX())) << 32) | (((long) Float.floatToRawIntBits(motionEvent.getY())) & 4294967295L))) {
                                                                ik2.a(getFocusOwner());
                                                            }
                                                        }
                                                    }
                                                    if ((g2 & 1) != 0) {
                                                        return true;
                                                    }
                                                }
                                                return false;
                                            }

                                            public final void f(uy3 uy3, boolean z2) {
                                                this.m0.g(uy3, z2);
                                            }

                                            public final View findViewByAccessibilityIdTraversal(int i) {
                                                d63 d63 = b1;
                                                try {
                                                    if (Build.VERSION.SDK_INT < 29) {
                                                        return d63.n(this, i);
                                                    }
                                                    Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", new Class[]{Integer.TYPE});
                                                    declaredMethod.setAccessible(true);
                                                    Object invoke = declaredMethod.invoke(d63, new Object[]{Integer.valueOf(i)});
                                                    if (invoke instanceof View) {
                                                        return (View) invoke;
                                                    }
                                                    return null;
                                                } catch (NoSuchMethodException unused) {
                                                    return null;
                                                }
                                            }

                                            /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Object, h06] */
                                            /* JADX WARNING: Removed duplicated region for block: B:13:0x0036  */
                                            /* JADX WARNING: Removed duplicated region for block: B:18:0x004f  */
                                            /* JADX WARNING: Removed duplicated region for block: B:21:0x0059  */
                                            /* JADX WARNING: Removed duplicated region for block: B:22:0x005c  */
                                            /* JADX WARNING: Removed duplicated region for block: B:25:0x0074 A[RETURN] */
                                            /* JADX WARNING: Removed duplicated region for block: B:26:0x0075  */
                                            public final View focusSearch(View view, int i) {
                                                bk2 c;
                                                int i2;
                                                ? obj;
                                                if (view == null || this.m0.c) {
                                                    return super.focusSearch(view, i);
                                                }
                                                View rootView = getRootView();
                                                rootView.getClass();
                                                View findNextFocus = FocusFinder.getInstance().findNextFocus((ViewGroup) rootView, view, i);
                                                ly5 ly5 = null;
                                                if (findNextFocus != null && !findNextFocus.equals(this)) {
                                                    ViewParent parent = findNextFocus.getParent();
                                                    while (true) {
                                                        if (parent == null) {
                                                            break;
                                                        } else if (parent == this) {
                                                            break;
                                                        } else {
                                                            parent = parent.getParent();
                                                        }
                                                    }
                                                    if (view != this) {
                                                        vk2 i02 = bb0.i0(((lk2) getFocusOwner()).c);
                                                        if (i02 != null) {
                                                            ly5 = bb0.j0(i02);
                                                        }
                                                        if (ly5 == null) {
                                                            ly5 = fk2.a(view, this);
                                                        }
                                                    } else {
                                                        ly5 = fk2.a(view, this);
                                                    }
                                                    c = fk2.c(i);
                                                    if (c == null) {
                                                        i2 = c.a;
                                                    } else {
                                                        i2 = 6;
                                                    }
                                                    obj = new Object();
                                                    if (((lk2) getFocusOwner()).f(i2, ly5, new be(0, obj)) != null) {
                                                        return view;
                                                    }
                                                    Object obj2 = obj.w;
                                                    if (obj2 == null) {
                                                        if (findNextFocus == null) {
                                                            return super.focusSearch(view, i);
                                                        }
                                                    } else if (findNextFocus == null || i2 == 1 || i2 == 2 || t75.v(bb0.j0((vk2) obj2), fk2.a(findNextFocus, this), ly5, i2)) {
                                                        return this;
                                                    } else {
                                                        return findNextFocus;
                                                    }
                                                    return findNextFocus;
                                                }
                                                findNextFocus = null;
                                                if (view != this) {
                                                }
                                                c = fk2.c(i);
                                                if (c == null) {
                                                }
                                                obj = new Object();
                                                if (((lk2) getFocusOwner()).f(i2, ly5, new be(0, obj)) != null) {
                                                }
                                            }

                                            /* JADX WARNING: Removed duplicated region for block: B:102:0x013d A[Catch:{ all -> 0x002b }] */
                                            /* JADX WARNING: Removed duplicated region for block: B:103:0x013f A[Catch:{ all -> 0x002b }] */
                                            /* JADX WARNING: Removed duplicated region for block: B:106:0x0144 A[Catch:{ all -> 0x002b }] */
                                            /* JADX WARNING: Removed duplicated region for block: B:107:0x0149 A[Catch:{ all -> 0x002b }] */
                                            /* JADX WARNING: Removed duplicated region for block: B:110:0x0153 A[Catch:{ all -> 0x002b }] */
                                            /* JADX WARNING: Removed duplicated region for block: B:111:0x0155 A[Catch:{ all -> 0x002b }] */
                                            /* JADX WARNING: Removed duplicated region for block: B:115:0x015c A[Catch:{ all -> 0x002b }] */
                                            /* JADX WARNING: Removed duplicated region for block: B:118:0x016e A[Catch:{ all -> 0x002b }] */
                                            /* JADX WARNING: Removed duplicated region for block: B:119:0x0171 A[Catch:{ all -> 0x002b }] */
                                            /* JADX WARNING: Removed duplicated region for block: B:122:0x0180 A[SYNTHETIC, Splitter:B:122:0x0180] */
                                            /* JADX WARNING: Removed duplicated region for block: B:129:0x019a A[ADDED_TO_REGION, Catch:{ all -> 0x01bf }] */
                                            /* JADX WARNING: Removed duplicated region for block: B:132:0x01a4 A[Catch:{ all -> 0x01bf }] */
                                            /* JADX WARNING: Removed duplicated region for block: B:133:0x01a7 A[Catch:{ all -> 0x01bf }] */
                                            /* JADX WARNING: Removed duplicated region for block: B:22:0x004e A[Catch:{ all -> 0x0076 }] */
                                            /* JADX WARNING: Removed duplicated region for block: B:43:0x0099 A[Catch:{ all -> 0x0076 }] */
                                            /* JADX WARNING: Removed duplicated region for block: B:44:0x009b A[Catch:{ all -> 0x0076 }] */
                                            /* JADX WARNING: Removed duplicated region for block: B:47:0x00a0 A[ADDED_TO_REGION, Catch:{ all -> 0x0076 }] */
                                            /* JADX WARNING: Removed duplicated region for block: B:59:0x00c2 A[Catch:{ all -> 0x002b }] */
                                            /* JADX WARNING: Removed duplicated region for block: B:60:0x00c4 A[Catch:{ all -> 0x002b }] */
                                            /* JADX WARNING: Removed duplicated region for block: B:63:0x00c9 A[ADDED_TO_REGION, Catch:{ all -> 0x002b }] */
                                            /* JADX WARNING: Removed duplicated region for block: B:70:0x00da A[Catch:{ all -> 0x002b }] */
                                            /* JADX WARNING: Removed duplicated region for block: B:77:0x00eb A[Catch:{ all -> 0x002b }] */
                                            /* JADX WARNING: Removed duplicated region for block: B:78:0x00f0 A[Catch:{ all -> 0x002b }] */
                                            /* JADX WARNING: Removed duplicated region for block: B:82:0x00f9 A[SYNTHETIC, Splitter:B:82:0x00f9] */
                                            /* JADX WARNING: Removed duplicated region for block: B:93:0x011f A[Catch:{ all -> 0x002b }] */
                                            /* JADX WARNING: Removed duplicated region for block: B:94:0x0124 A[Catch:{ all -> 0x002b }] */
                                            /* JADX WARNING: Removed duplicated region for block: B:97:0x0129 A[Catch:{ all -> 0x002b }] */
                                            public final int g(MotionEvent motionEvent) {
                                                boolean z2;
                                                MotionEvent motionEvent2;
                                                boolean z3;
                                                boolean z4;
                                                boolean z5;
                                                int H2;
                                                c03 c03;
                                                MotionEvent motionEvent3;
                                                int i;
                                                int action;
                                                MotionEvent motionEvent4;
                                                float f;
                                                float f2;
                                                MotionEvent motionEvent5;
                                                float x2;
                                                float y2;
                                                boolean z6;
                                                MotionEvent motionEvent6;
                                                long j;
                                                boolean z7;
                                                c03 c032;
                                                boolean z8;
                                                int actionMasked;
                                                je jeVar = this;
                                                MotionEvent motionEvent7 = motionEvent;
                                                jeVar.removeCallbacks(jeVar.O0);
                                                try {
                                                    B(motionEvent);
                                                    jeVar.u0 = true;
                                                    jeVar.r(false);
                                                    Trace.beginSection("AndroidOwner:onTouch");
                                                    try {
                                                        int actionMasked2 = motionEvent7.getActionMasked();
                                                        MotionEvent motionEvent8 = jeVar.G0;
                                                        if (motionEvent8 == null || motionEvent8.getToolType(0) != 3) {
                                                            z2 = false;
                                                        } else {
                                                            z2 = true;
                                                        }
                                                        ge2 ge2 = jeVar.c0;
                                                        if (motionEvent8 != null) {
                                                            try {
                                                                if (motionEvent8.getSource() == motionEvent7.getSource()) {
                                                                    if (motionEvent8.getToolType(0) == motionEvent7.getToolType(0)) {
                                                                        z8 = false;
                                                                        if (z8) {
                                                                            if (motionEvent8.getButtonState() != 0 || (actionMasked = motionEvent8.getActionMasked()) == 0 || actionMasked == 2 || actionMasked == 6) {
                                                                                motionEvent2 = motionEvent8;
                                                                                if (!ge2.a) {
                                                                                    ((vc4) ((rg4) ge2.d).x).a();
                                                                                    ((c03) ge2.c).c();
                                                                                }
                                                                                if (motionEvent7.getToolType(0) == 3) {
                                                                                }
                                                                                if (!z2) {
                                                                                }
                                                                                jeVar = this;
                                                                                if (motionEvent.getButtonState() != 0) {
                                                                                }
                                                                                if (actionMasked2 == 8) {
                                                                                }
                                                                                z5 = false;
                                                                                if (motionEvent2 != null) {
                                                                                }
                                                                                MotionEvent motionEvent9 = jeVar.G0;
                                                                                motionEvent3 = jeVar.G0;
                                                                                if (motionEvent3 != null) {
                                                                                }
                                                                                action = motionEvent.getAction();
                                                                                om4 om4 = jeVar.b0;
                                                                                if (action == 9) {
                                                                                }
                                                                                motionEvent4 = jeVar.G0;
                                                                                f = Float.NaN;
                                                                                if (motionEvent4 != null) {
                                                                                }
                                                                                motionEvent5 = jeVar.G0;
                                                                                if (motionEvent5 != null) {
                                                                                }
                                                                                x2 = motionEvent.getX();
                                                                                y2 = motionEvent.getY();
                                                                                if (f2 == x2 && f == y2) {
                                                                                }
                                                                                motionEvent6 = jeVar.G0;
                                                                                if (motionEvent6 != null) {
                                                                                }
                                                                                if (j != motionEvent.getEventTime()) {
                                                                                }
                                                                                if (i >= 0) {
                                                                                }
                                                                                c032 = (c03) ge2.c;
                                                                                if (c032.d) {
                                                                                }
                                                                                jeVar.G0 = MotionEvent.obtainNoHistory(motionEvent);
                                                                                if (z5) {
                                                                                }
                                                                                H2 = H(motionEvent);
                                                                                Trace.endSection();
                                                                                if ((H2 & 4) == 0) {
                                                                                    c03 = (c03) ge2.c;
                                                                                    if (!c03.d) {
                                                                                    }
                                                                                    jeVar = this;
                                                                                    jeVar.I(motionEvent, 9, motionEvent.getEventTime(), true);
                                                                                    jeVar.u0 = false;
                                                                                    return H2;
                                                                                }
                                                                                jeVar = this;
                                                                                jeVar.u0 = false;
                                                                                return H2;
                                                                            } else if (motionEvent8.getActionMasked() != 10 && z2) {
                                                                                jeVar.I(motionEvent8, 10, motionEvent8.getEventTime(), true);
                                                                                motionEvent2 = motionEvent8;
                                                                                if (motionEvent7.getToolType(0) == 3) {
                                                                                    z3 = true;
                                                                                } else {
                                                                                    z3 = false;
                                                                                }
                                                                                if (!z2 || !z3 || actionMasked2 == 3 || actionMasked2 == 9 || !m(motionEvent)) {
                                                                                    jeVar = this;
                                                                                } else {
                                                                                    jeVar = this;
                                                                                    jeVar.I(motionEvent7, 9, motionEvent7.getEventTime(), true);
                                                                                }
                                                                                if (motionEvent.getButtonState() != 0) {
                                                                                    z4 = true;
                                                                                } else {
                                                                                    z4 = false;
                                                                                }
                                                                                if (actionMasked2 == 8 || z4 || motionEvent2 == null || motionEvent2.isFromSource(4098)) {
                                                                                    z5 = false;
                                                                                } else {
                                                                                    z5 = true;
                                                                                }
                                                                                if (motionEvent2 != null) {
                                                                                    motionEvent2.recycle();
                                                                                }
                                                                                MotionEvent motionEvent92 = jeVar.G0;
                                                                                if (motionEvent92 != null && motionEvent92.getAction() == 10) {
                                                                                    motionEvent3 = jeVar.G0;
                                                                                    if (motionEvent3 != null) {
                                                                                        i = motionEvent3.getPointerId(0);
                                                                                    } else {
                                                                                        i = -1;
                                                                                    }
                                                                                    action = motionEvent.getAction();
                                                                                    om4 om42 = jeVar.b0;
                                                                                    if (action == 9) {
                                                                                        if (motionEvent.getHistorySize() == 0) {
                                                                                            if (i >= 0) {
                                                                                                om42.c.delete(i);
                                                                                                om42.b.delete(i);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    if (motionEvent.getAction() == 0 && motionEvent.getHistorySize() == 0) {
                                                                                        motionEvent4 = jeVar.G0;
                                                                                        f = Float.NaN;
                                                                                        if (motionEvent4 != null) {
                                                                                            f2 = motionEvent4.getX();
                                                                                        } else {
                                                                                            f2 = Float.NaN;
                                                                                        }
                                                                                        motionEvent5 = jeVar.G0;
                                                                                        if (motionEvent5 != null) {
                                                                                            f = motionEvent5.getY();
                                                                                        }
                                                                                        x2 = motionEvent.getX();
                                                                                        y2 = motionEvent.getY();
                                                                                        if (f2 == x2 || f == y2) {
                                                                                            z6 = true;
                                                                                        } else {
                                                                                            z6 = false;
                                                                                        }
                                                                                        motionEvent6 = jeVar.G0;
                                                                                        if (motionEvent6 != null) {
                                                                                            j = motionEvent6.getEventTime();
                                                                                        } else {
                                                                                            j = -1;
                                                                                        }
                                                                                        if (j != motionEvent.getEventTime()) {
                                                                                            z7 = true;
                                                                                        } else {
                                                                                            z7 = false;
                                                                                        }
                                                                                        if (z6 || z7) {
                                                                                            if (i >= 0) {
                                                                                                om42.c.delete(i);
                                                                                                om42.b.delete(i);
                                                                                            }
                                                                                            c032 = (c03) ge2.c;
                                                                                            if (c032.d) {
                                                                                                c032.d = true;
                                                                                            } else {
                                                                                                c032.g.a.g();
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                                jeVar.G0 = MotionEvent.obtainNoHistory(motionEvent);
                                                                                if (z5) {
                                                                                    jeVar.I(motionEvent, 10, motionEvent.getEventTime(), true);
                                                                                }
                                                                                H2 = H(motionEvent);
                                                                                Trace.endSection();
                                                                                if ((H2 & 4) == 0 && z5) {
                                                                                    c03 = (c03) ge2.c;
                                                                                    if (!c03.d) {
                                                                                        c03.d = true;
                                                                                    } else {
                                                                                        c03.g.a.g();
                                                                                    }
                                                                                    jeVar = this;
                                                                                    jeVar.I(motionEvent, 9, motionEvent.getEventTime(), true);
                                                                                } else {
                                                                                    jeVar = this;
                                                                                }
                                                                                jeVar.u0 = false;
                                                                                return H2;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                z8 = true;
                                                                if (z8) {
                                                                }
                                                            } catch (Throwable th) {
                                                                th = th;
                                                                jeVar = this;
                                                                Trace.endSection();
                                                                throw th;
                                                            }
                                                        }
                                                        motionEvent2 = motionEvent8;
                                                        if (motionEvent7.getToolType(0) == 3) {
                                                        }
                                                        if (!z2) {
                                                        }
                                                        jeVar = this;
                                                        if (motionEvent.getButtonState() != 0) {
                                                        }
                                                        if (actionMasked2 == 8) {
                                                        }
                                                        z5 = false;
                                                        if (motionEvent2 != null) {
                                                        }
                                                        MotionEvent motionEvent922 = jeVar.G0;
                                                        motionEvent3 = jeVar.G0;
                                                        if (motionEvent3 != null) {
                                                        }
                                                        action = motionEvent.getAction();
                                                        om4 om422 = jeVar.b0;
                                                        if (action == 9) {
                                                        }
                                                        motionEvent4 = jeVar.G0;
                                                        f = Float.NaN;
                                                        if (motionEvent4 != null) {
                                                        }
                                                        motionEvent5 = jeVar.G0;
                                                        if (motionEvent5 != null) {
                                                        }
                                                        x2 = motionEvent.getX();
                                                        y2 = motionEvent.getY();
                                                        if (f2 == x2 || f == y2) {
                                                        }
                                                        motionEvent6 = jeVar.G0;
                                                        if (motionEvent6 != null) {
                                                        }
                                                        if (j != motionEvent.getEventTime()) {
                                                        }
                                                        if (i >= 0) {
                                                        }
                                                        c032 = (c03) ge2.c;
                                                        if (c032.d) {
                                                        }
                                                        jeVar.G0 = MotionEvent.obtainNoHistory(motionEvent);
                                                        if (z5) {
                                                        }
                                                        H2 = H(motionEvent);
                                                        try {
                                                            Trace.endSection();
                                                            if ((H2 & 4) == 0) {
                                                            }
                                                            jeVar = this;
                                                            jeVar.u0 = false;
                                                            return H2;
                                                        } catch (Throwable th2) {
                                                            th = th2;
                                                            jeVar = this;
                                                            jeVar.u0 = false;
                                                            throw th;
                                                        }
                                                    } catch (Throwable th3) {
                                                        th = th3;
                                                        Trace.endSection();
                                                        throw th;
                                                    }
                                                } catch (Throwable th4) {
                                                    th = th4;
                                                }
                                            }

                                            public p4 getAccessibilityManager() {
                                                return this.w.k;
                                            }

                                            public final lj getAndroidViewsHandler() {
                                                return null;
                                            }

                                            public c20 getAutofillTree() {
                                                return this.U;
                                            }

                                            public bs0 getClipboard() {
                                                return this.w.n;
                                            }

                                            public cs0 getClipboardManager() {
                                                return this.w.m;
                                            }

                                            public final yx0 getComposeViewContext() {
                                                return this.w;
                                            }

                                            public final boolean getComposeViewContextIncrementedDuringInit$ui() {
                                                return this.W0;
                                            }

                                            public final Configuration getConfiguration() {
                                                return (Configuration) this.d0.getValue();
                                            }

                                            public final bf getContentCaptureManager$ui() {
                                                return this.S;
                                            }

                                            public e81 getCoroutineContext() {
                                                return this.I;
                                            }

                                            public tp1 getDensity() {
                                                return (tp1) this.F.getValue();
                                            }

                                            public ly5 getEmbeddedViewFocusRect() {
                                                if (isFocused()) {
                                                    vk2 i02 = bb0.i0(((lk2) getFocusOwner()).c);
                                                    if (i02 != null) {
                                                        return bb0.j0(i02);
                                                    }
                                                    return null;
                                                }
                                                View findFocus = findFocus();
                                                if (findFocus != null) {
                                                    return fk2.a(findFocus, this);
                                                }
                                                return null;
                                            }

                                            public ik2 getFocusOwner() {
                                                return this.H;
                                            }

                                            public final void getFocusedRect(Rect rect) {
                                                ly5 embeddedViewFocusRect = getEmbeddedViewFocusRect();
                                                if (embeddedViewFocusRect != null) {
                                                    rect.left = Math.round(embeddedViewFocusRect.a);
                                                    rect.top = Math.round(embeddedViewFocusRect.b);
                                                    rect.right = Math.round(embeddedViewFocusRect.c);
                                                    rect.bottom = Math.round(embeddedViewFocusRect.d);
                                                    return;
                                                }
                                                if (!sg3.e(((lk2) getFocusOwner()).f(6, (ly5) null, ce.y), Boolean.TRUE)) {
                                                    rect.set(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
                                                } else {
                                                    super.getFocusedRect(rect);
                                                }
                                            }

                                            public dl2 getFontFamilyResolver() {
                                                return (dl2) this.B0.getValue();
                                            }

                                            public cl2 getFontLoader() {
                                                return this.w.o;
                                            }

                                            public final x54 getFrameEndScheduler$ui() {
                                                return this.A;
                                            }

                                            public bx2 getGraphicsContext() {
                                                return this.T;
                                            }

                                            public my2 getHapticFeedBack() {
                                                return this.w.q;
                                            }

                                            public boolean getHasPendingMeasureOrLayout() {
                                                if (this.m0.b.T() || !this.D.isEmpty()) {
                                                    return true;
                                                }
                                                return false;
                                            }

                                            public int getImportantForAutofill() {
                                                return 1;
                                            }

                                            public uc3 getInputModeManager() {
                                                int i;
                                                uc3 uc3 = this.D0;
                                                if (uc3 == null) {
                                                    if (isInTouchMode()) {
                                                        i = 1;
                                                    } else {
                                                        i = 2;
                                                    }
                                                    uc3 = new uc3(i);
                                                    this.D0 = uc3;
                                                }
                                                return uc3;
                                            }

                                            public final ob8 getInsetsWatcher() {
                                                return this.M;
                                            }

                                            public final long getLastMatrixRecalculationAnimationTime$ui() {
                                                return this.t0;
                                            }

                                            public ey3 getLayoutDirection() {
                                                return (ey3) this.C0.getValue();
                                            }

                                            public ya4 getLocaleList() {
                                                return (ya4) this.e0.getValue();
                                            }

                                            public long getMeasureIteration() {
                                                ih4 ih4 = this.m0;
                                                if (!ih4.c) {
                                                    yb3.a("measureIteration should be only used during the measure/layout pass");
                                                }
                                                return ih4.g;
                                            }

                                            public nl4 getModifierLocalManager() {
                                                return this.E0;
                                            }

                                            public je getOutOfFrameExecutor() {
                                                if (isAttachedToWindow()) {
                                                    return this;
                                                }
                                                return null;
                                            }

                                            public dh5 getPlacementScope() {
                                                int i = fh5.b;
                                                return new ed4(1, this);
                                            }

                                            public final gs2 getPlayNavigationSoundEffect$ui() {
                                                return this.R0;
                                            }

                                            public pk5 getPointerIconService() {
                                                return this.a1;
                                            }

                                            /* renamed from: getPrimaryDirectionalMotionAxisOverride-dqNNBbU$ui  reason: not valid java name */
                                            public final sa3 m49getPrimaryDirectionalMotionAxisOverridedqNNBbU$ui() {
                                                return this.z;
                                            }

                                            public ny5 getRectManager() {
                                                return this.P;
                                            }

                                            public a76 getRetainedValuesStore() {
                                                return this.C;
                                            }

                                            public uy3 getRoot() {
                                                return this.N;
                                            }

                                            public final boolean getScrollCaptureInProgress$ui() {
                                                rg4 rg4;
                                                if (Build.VERSION.SDK_INT < 31 || (rg4 = this.Y0) == null) {
                                                    return false;
                                                }
                                                return ((Boolean) ((ed5) rg4.x).getValue()).booleanValue();
                                            }

                                            public ik6 getSemanticsOwner() {
                                                return this.Q;
                                            }

                                            public wy3 getSharedDrawScope() {
                                                return this.w.s;
                                            }

                                            public boolean getShowLayoutBounds() {
                                                if (Build.VERSION.SDK_INT >= 30) {
                                                    return fn.a.a(this);
                                                }
                                                return this.j0;
                                            }

                                            public r95 getSnapshotObserver() {
                                                return this.i0;
                                            }

                                            public gy6 getSoftwareKeyboardController() {
                                                ip1 ip1 = this.A0;
                                                if (ip1 != null) {
                                                    return ip1;
                                                }
                                                ip1 ip12 = new ip1(getTextInputService());
                                                this.A0 = ip12;
                                                return ip12;
                                            }

                                            public rf7 getTextInputService() {
                                                rf7 rf7 = this.y0;
                                                if (rf7 != null) {
                                                    return rf7;
                                                }
                                                rf7 rf72 = new rf7(getLegacyTextInputServiceAndroid());
                                                this.y0 = rf72;
                                                return rf72;
                                            }

                                            /* JADX WARNING: type inference failed for: r0v1, types: [ug7, aj, java.lang.Object] */
                                            public ug7 getTextToolbar() {
                                                aj ajVar = this.F0;
                                                if (ajVar != null) {
                                                    return ajVar;
                                                }
                                                ? obj = new Object();
                                                new s63(new kh(1, obj));
                                                this.F0 = obj;
                                                return obj;
                                            }

                                            public final c96 getUncaughtExceptionHandler$ui() {
                                                return null;
                                            }

                                            public g58 getViewConfiguration() {
                                                return this.w.r;
                                            }

                                            public w98 getWindowInfo() {
                                                return this.w.t;
                                            }

                                            public final void i(uy3 uy3) {
                                                this.m0.r(uy3, false);
                                                eq4 z2 = uy3.z();
                                                Object[] objArr = z2.w;
                                                int i = z2.y;
                                                for (int i2 = 0; i2 < i; i2++) {
                                                    i((uy3) objArr[i2]);
                                                }
                                            }

                                            public final boolean m(MotionEvent motionEvent) {
                                                float x2 = motionEvent.getX();
                                                float y2 = motionEvent.getY();
                                                if (0.0f > x2 || x2 > ((float) getWidth()) || 0.0f > y2 || y2 > ((float) getHeight())) {
                                                    return false;
                                                }
                                                return true;
                                            }

                                            public final boolean n(MotionEvent motionEvent) {
                                                MotionEvent motionEvent2;
                                                if (motionEvent.getPointerCount() == 1 && (motionEvent2 = this.G0) != null && motionEvent2.getPointerCount() == motionEvent.getPointerCount() && motionEvent.getRawX() == motionEvent2.getRawX() && motionEvent.getRawY() == motionEvent2.getRawY()) {
                                                    return false;
                                                }
                                                return true;
                                            }

                                            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: y54} */
                                            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: y54} */
                                            /* JADX WARNING: type inference failed for: r3v2, types: [java.lang.Object, w58] */
                                            /* JADX WARNING: Multi-variable type inference failed */
                                            public final void onAttachedToWindow() {
                                                a76 a76;
                                                Object obj;
                                                super.onAttachedToWindow();
                                                if (!getRoot().J()) {
                                                    getRoot().d(this);
                                                }
                                                int i = 1;
                                                setAttached(true);
                                                if (Build.VERSION.SDK_INT < 30) {
                                                    setShowLayoutBounds(d63.q());
                                                }
                                                this.M.onViewAttachedToWindow(this);
                                                if (!this.W0) {
                                                    this.w.d();
                                                }
                                                int i2 = 0;
                                                this.W0 = false;
                                                i(getRoot());
                                                h(getRoot());
                                                getSnapshotObserver().a.f();
                                                je outOfFrameExecutor = getOutOfFrameExecutor();
                                                if (outOfFrameExecutor != null) {
                                                    outOfFrameExecutor.E(new zd(this, 3));
                                                    this.w.c();
                                                    yx0 yx0 = this.w;
                                                    yx0.f();
                                                    a68 a68 = yx0.f;
                                                    x54 x54 = this.A;
                                                    if (a68 == null || x54 == null) {
                                                        a76 = null;
                                                    } else {
                                                        z58 g = a68.g();
                                                        ? obj2 = new Object();
                                                        gb1 gb1 = gb1.b;
                                                        g.getClass();
                                                        gb1.getClass();
                                                        no7 no7 = new no7(g, obj2, gb1);
                                                        gq3 b = b26.a.b(z54.class);
                                                        String l = b.l();
                                                        if (l != null) {
                                                            ViewParent parent = getParent();
                                                            parent.getClass();
                                                            int id = ((View) parent).getId();
                                                            yo4 yo4 = ((z54) no7.b(b, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(l))).b;
                                                            Object b2 = yo4.b(id);
                                                            if (b2 == null) {
                                                                b2 = new lp4(1);
                                                                yo4.i(id, b2);
                                                            }
                                                            lp4 lp4 = (lp4) b2;
                                                            Object[] objArr = lp4.a;
                                                            int i3 = lp4.b;
                                                            while (true) {
                                                                if (i2 >= i3) {
                                                                    obj = null;
                                                                    break;
                                                                }
                                                                obj = objArr[i2];
                                                                if (!((y54) obj).c) {
                                                                    break;
                                                                }
                                                                i2++;
                                                            }
                                                            y54 y54 = (y54) obj;
                                                            if (y54 == null) {
                                                                y54 = new y54();
                                                                lp4.a(y54);
                                                            }
                                                            y54.c = true;
                                                            this.B = y54;
                                                            a76 = y54.b;
                                                        } else {
                                                            h.q("Local and anonymous classes can not be ViewModels");
                                                            return;
                                                        }
                                                    }
                                                    if (a76 == null) {
                                                        a76 = xb4.S;
                                                    }
                                                    this.C = a76;
                                                    vr2 vr2 = this.w0;
                                                    if (vr2 != null) {
                                                        vr2.y(this.w);
                                                        this.w0 = null;
                                                    }
                                                    in8 k = this.w.c().k();
                                                    k.x0(this);
                                                    k.x0(this.S);
                                                    uc3 inputModeManager = getInputModeManager();
                                                    if (!isInTouchMode()) {
                                                        i = 2;
                                                    }
                                                    inputModeManager.a.setValue(new sc3(i));
                                                    getViewTreeObserver().addOnGlobalLayoutListener(this);
                                                    getViewTreeObserver().addOnScrollChangedListener(this);
                                                    getViewTreeObserver().addOnTouchModeChangeListener(this);
                                                    if (Build.VERSION.SDK_INT >= 31) {
                                                        te.a.b(this);
                                                    }
                                                    md autofillManager = getAutofillManager();
                                                    if (autofillManager != null) {
                                                        ((lk2) getFocusOwner()).g.a(autofillManager);
                                                        getSemanticsOwner().d.a(autofillManager);
                                                    }
                                                    ((lk2) getFocusOwner()).g.a(this);
                                                    return;
                                                }
                                                h.s("Expected the view to be attached to window.");
                                            }

                                            public final boolean onCheckIsTextEditor() {
                                                Object obj;
                                                zm6 zm6 = (zm6) this.z0.get();
                                                Object obj2 = null;
                                                if (zm6 != null) {
                                                    obj = zm6.b;
                                                } else {
                                                    obj = null;
                                                }
                                                mh mhVar = (mh) obj;
                                                if (mhVar == null) {
                                                    return getLegacyTextInputServiceAndroid().d;
                                                }
                                                zm6 zm62 = (zm6) mhVar.z.get();
                                                if (zm62 != null) {
                                                    obj2 = zm62.b;
                                                }
                                                rc3 rc3 = (rc3) obj2;
                                                if (rc3 == null || !(!rc3.e)) {
                                                    return false;
                                                }
                                                return true;
                                            }

                                            public final void onConfigurationChanged(Configuration configuration) {
                                                super.onConfigurationChanged(configuration);
                                                K(configuration);
                                            }

                                            /* JADX WARNING: Removed duplicated region for block: B:102:0x014d  */
                                            /* JADX WARNING: Removed duplicated region for block: B:114:0x0198  */
                                            /* JADX WARNING: Removed duplicated region for block: B:30:0x0061  */
                                            /* JADX WARNING: Removed duplicated region for block: B:31:0x0065  */
                                            /* JADX WARNING: Removed duplicated region for block: B:95:0x0133  */
                                            public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
                                                Object obj;
                                                Object obj2;
                                                t15 t15;
                                                int i;
                                                int i2;
                                                int i3;
                                                EditorInfo editorInfo2 = editorInfo;
                                                zm6 zm6 = (zm6) this.z0.get();
                                                if (zm6 != null) {
                                                    obj = zm6.b;
                                                } else {
                                                    obj = null;
                                                }
                                                mh mhVar = (mh) obj;
                                                if (mhVar == null) {
                                                    uf7 legacyTextInputServiceAndroid = getLegacyTextInputServiceAndroid();
                                                    if (!legacyTextInputServiceAndroid.d) {
                                                        return null;
                                                    }
                                                    c93 c93 = legacyTextInputServiceAndroid.h;
                                                    hf7 hf7 = legacyTextInputServiceAndroid.g;
                                                    int i4 = c93.e;
                                                    boolean z2 = c93.a;
                                                    if (i4 != 1) {
                                                        if (i4 == 0) {
                                                            i = 1;
                                                        } else if (i4 == 2) {
                                                            i = 2;
                                                        } else if (i4 == 6) {
                                                            i = 5;
                                                        } else if (i4 == 5) {
                                                            i = 7;
                                                        } else if (i4 == 3) {
                                                            i = 3;
                                                        } else if (i4 == 4) {
                                                            i = 4;
                                                        } else if (i4 != 7) {
                                                            h.s("invalid ImeAction");
                                                            return null;
                                                        }
                                                        editorInfo2.imeOptions = i;
                                                        i2 = c93.d;
                                                        if (i2 == 1) {
                                                        }
                                                        if (!z2) {
                                                        }
                                                        i3 = editorInfo2.inputType;
                                                        if ((i3 & 15) == 1) {
                                                        }
                                                        long j = hf7.b;
                                                        int i5 = lg7.c;
                                                        editorInfo2.initialSelStart = (int) (j >> 32);
                                                        editorInfo2.initialSelEnd = (int) (j & 4294967295L);
                                                        h49.P(editorInfo2, hf7.a.x);
                                                        editorInfo2.imeOptions |= 33554432;
                                                        if (w22.d()) {
                                                        }
                                                        iy5 iy5 = new iy5(legacyTextInputServiceAndroid.g, new rg4(10, (Object) legacyTextInputServiceAndroid), legacyTextInputServiceAndroid.h.c);
                                                        legacyTextInputServiceAndroid.i.add(new WeakReference(iy5));
                                                        return iy5;
                                                    } else if (!z2) {
                                                        i = 0;
                                                        editorInfo2.imeOptions = i;
                                                        i2 = c93.d;
                                                        if (i2 == 1) {
                                                            editorInfo2.inputType = 1;
                                                        } else if (i2 == 2) {
                                                            editorInfo2.inputType = 1;
                                                            editorInfo2.imeOptions = i | Integer.MIN_VALUE;
                                                        } else if (i2 == 3) {
                                                            editorInfo2.inputType = 2;
                                                        } else if (i2 == 4) {
                                                            editorInfo2.inputType = 3;
                                                        } else if (i2 == 5) {
                                                            editorInfo2.inputType = 17;
                                                        } else if (i2 == 6) {
                                                            editorInfo2.inputType = 33;
                                                        } else if (i2 == 7) {
                                                            editorInfo2.inputType = 129;
                                                        } else if (i2 == 8) {
                                                            editorInfo2.inputType = 18;
                                                        } else if (i2 == 9) {
                                                            editorInfo2.inputType = 8194;
                                                        } else if (i2 == 10) {
                                                            editorInfo2.inputType = 145;
                                                        } else if (i2 == 11) {
                                                            editorInfo2.inputType = 113;
                                                        } else if (i2 == 12) {
                                                            editorInfo2.inputType = 97;
                                                        } else if (i2 == 13) {
                                                            editorInfo2.inputType = 49;
                                                        } else if (i2 == 14) {
                                                            editorInfo2.inputType = 65;
                                                        } else if (i2 == 15) {
                                                            editorInfo2.inputType = 81;
                                                        } else if (i2 == 16) {
                                                            editorInfo2.inputType = 177;
                                                        } else if (i2 == 17) {
                                                            editorInfo2.inputType = 193;
                                                        } else if (i2 == 18) {
                                                            editorInfo2.inputType = 4;
                                                        } else if (i2 == 19) {
                                                            editorInfo2.inputType = 20;
                                                        } else if (i2 == 20) {
                                                            editorInfo2.inputType = 36;
                                                        } else if (i2 == 21) {
                                                            editorInfo2.inputType = 4098;
                                                        } else if (i2 == 22) {
                                                            editorInfo2.inputType = 12290;
                                                        } else if (i2 == 23) {
                                                            editorInfo2.inputType = 8210;
                                                        } else if (i2 == 24) {
                                                            editorInfo2.inputType = 4114;
                                                        } else if (i2 == 25) {
                                                            editorInfo2.inputType = 12306;
                                                        } else {
                                                            h.s("Invalid Keyboard Type");
                                                            return null;
                                                        }
                                                        if (!z2) {
                                                            int i6 = editorInfo2.inputType;
                                                            if ((i6 & 15) == 1) {
                                                                editorInfo2.inputType = i6 | 131072;
                                                                if (i4 == 1) {
                                                                    editorInfo2.imeOptions |= 1073741824;
                                                                }
                                                            }
                                                        }
                                                        i3 = editorInfo2.inputType;
                                                        if ((i3 & 15) == 1) {
                                                            int i7 = c93.b;
                                                            if (i7 == 1) {
                                                                editorInfo2.inputType = i3 | 4096;
                                                            } else if (i7 == 2) {
                                                                editorInfo2.inputType = i3 | 8192;
                                                            } else if (i7 == 3) {
                                                                editorInfo2.inputType = i3 | 16384;
                                                            }
                                                            if (c93.c) {
                                                                editorInfo2.inputType |= 32768;
                                                            }
                                                        }
                                                        long j2 = hf7.b;
                                                        int i52 = lg7.c;
                                                        editorInfo2.initialSelStart = (int) (j2 >> 32);
                                                        editorInfo2.initialSelEnd = (int) (j2 & 4294967295L);
                                                        h49.P(editorInfo2, hf7.a.x);
                                                        editorInfo2.imeOptions |= 33554432;
                                                        if (w22.d()) {
                                                            w22.a().i(editorInfo2);
                                                        }
                                                        iy5 iy52 = new iy5(legacyTextInputServiceAndroid.g, new rg4(10, (Object) legacyTextInputServiceAndroid), legacyTextInputServiceAndroid.h.c);
                                                        legacyTextInputServiceAndroid.i.add(new WeakReference(iy52));
                                                        return iy52;
                                                    }
                                                    i = 6;
                                                    editorInfo2.imeOptions = i;
                                                    i2 = c93.d;
                                                    if (i2 == 1) {
                                                    }
                                                    if (!z2) {
                                                    }
                                                    i3 = editorInfo2.inputType;
                                                    if ((i3 & 15) == 1) {
                                                    }
                                                    long j22 = hf7.b;
                                                    int i522 = lg7.c;
                                                    editorInfo2.initialSelStart = (int) (j22 >> 32);
                                                    editorInfo2.initialSelEnd = (int) (j22 & 4294967295L);
                                                    h49.P(editorInfo2, hf7.a.x);
                                                    editorInfo2.imeOptions |= 33554432;
                                                    if (w22.d()) {
                                                    }
                                                    iy5 iy522 = new iy5(legacyTextInputServiceAndroid.g, new rg4(10, (Object) legacyTextInputServiceAndroid), legacyTextInputServiceAndroid.h.c);
                                                    legacyTextInputServiceAndroid.i.add(new WeakReference(iy522));
                                                    return iy522;
                                                }
                                                zm6 zm62 = (zm6) mhVar.z.get();
                                                if (zm62 != null) {
                                                    obj2 = zm62.b;
                                                } else {
                                                    obj2 = null;
                                                }
                                                rc3 rc3 = (rc3) obj2;
                                                if (rc3 == null) {
                                                    return null;
                                                }
                                                synchronized (rc3.c) {
                                                    if (rc3.e) {
                                                        return null;
                                                    }
                                                    jy5 a = rc3.a.a(editorInfo2);
                                                    pb pbVar = new pb(15, rc3);
                                                    int i8 = Build.VERSION.SDK_INT;
                                                    if (i8 >= 34) {
                                                        t15 = new t15(a, pbVar);
                                                    } else if (i8 >= 25) {
                                                        t15 = new t15(a, pbVar);
                                                    } else {
                                                        t15 = new t15(a, pbVar);
                                                    }
                                                    rc3.d.b(new WeakReference(t15));
                                                    return t15;
                                                }
                                            }

                                            public final void onCreateVirtualViewTranslationRequests(long[] jArr, int[] iArr, Consumer consumer) {
                                                fk6 fk6;
                                                bf bfVar = this.S;
                                                bfVar.getClass();
                                                for (long j : jArr) {
                                                    hk6 hk6 = (hk6) bfVar.c().b((int) j);
                                                    if (!(hk6 == null || (fk6 = hk6.a) == null)) {
                                                        se.q();
                                                        ViewTranslationRequest.Builder l = se.l(bfVar.w.getAutofillId(), (long) fk6.f);
                                                        Object g = fk6.d.w.g(jk6.C);
                                                        if (g == null) {
                                                            g = null;
                                                        }
                                                        List list = (List) g;
                                                        if (list != null) {
                                                            l.setValue("android:text", TranslationRequestValue.forText(new vl(i84.a(list, "\n", (tm3) null, 62))));
                                                            consumer.accept(l.build());
                                                        }
                                                    }
                                                }
                                            }

                                            public final void onDetachedFromWindow() {
                                                super.onDetachedFromWindow();
                                                setAttached(false);
                                                this.M.onViewDetachedFromWindow(this);
                                                View view = this.G;
                                                if (j() && view != null) {
                                                    removeView(view);
                                                }
                                                int i = Build.VERSION.SDK_INT;
                                                if (i > 28) {
                                                    lp4 lp4 = f1;
                                                    synchronized (lp4) {
                                                        try {
                                                            lp4.j(this);
                                                        } catch (Throwable th) {
                                                            throw th;
                                                        }
                                                    }
                                                }
                                                this.w.b();
                                                cy6 cy6 = getSnapshotObserver().a;
                                                c9 c9Var = (c9) cy6.i;
                                                if (c9Var != null) {
                                                    c9Var.h();
                                                }
                                                cy6.a();
                                                in8 k = this.w.c().k();
                                                k.M0(this.S);
                                                k.M0(this);
                                                getViewTreeObserver().removeOnGlobalLayoutListener(this);
                                                getViewTreeObserver().removeOnScrollChangedListener(this);
                                                getViewTreeObserver().removeOnTouchModeChangeListener(this);
                                                y54 y54 = this.B;
                                                if (y54 != null) {
                                                    y54.c = false;
                                                }
                                                this.B = null;
                                                if (i >= 31) {
                                                    te.a.a(this);
                                                }
                                                md autofillManager = getAutofillManager();
                                                if (autofillManager != null) {
                                                    getSemanticsOwner().d.j(autofillManager);
                                                    ((lk2) getFocusOwner()).g.j(autofillManager);
                                                }
                                                ny5 rectManager = getRectManager();
                                                rectManager.g = rectManager.d.c(0, 0, (float[]) null, 0, 0);
                                                getRectManager().a();
                                                ny5 rectManager2 = getRectManager();
                                                vd vdVar = rectManager2.i;
                                                if (vdVar != null) {
                                                    rectManager2.b.removeCallbacks(vdVar);
                                                    rectManager2.i = null;
                                                }
                                                ((lk2) getFocusOwner()).g.j(this);
                                            }

                                            public final void onFocusChanged(boolean z2, int i, Rect rect) {
                                                super.onFocusChanged(z2, i, rect);
                                                if (!z2 && !hasFocus()) {
                                                    lk2 lk2 = (lk2) getFocusOwner();
                                                    we.K(lk2.c, true);
                                                    if (lk2.g() != null) {
                                                        vk2 g = lk2.g();
                                                        lk2.j((vk2) null);
                                                        if (g != null) {
                                                            g.W0(sk2.w, sk2.y);
                                                        }
                                                    }
                                                }
                                            }

                                            public final void onGlobalLayout() {
                                                this.t0 = 0;
                                                L();
                                                int i = Build.VERSION.SDK_INT;
                                                if (32 <= i && i < 34) {
                                                    K(getResources().getConfiguration());
                                                }
                                            }

                                            public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
                                                Trace.beginSection("AndroidOwner:onLayout");
                                                try {
                                                    this.t0 = 0;
                                                    this.m0.l(this.T0);
                                                    this.k0 = null;
                                                    L();
                                                } finally {
                                                    Trace.endSection();
                                                }
                                            }

                                            public final void onMeasure(int i, int i2) {
                                                ih4 ih4 = this.m0;
                                                Trace.beginSection("AndroidOwner:onMeasure");
                                                try {
                                                    if (!getRoot().J()) {
                                                        getRoot().d(this);
                                                    }
                                                    if (!isAttachedToWindow()) {
                                                        i(getRoot());
                                                    }
                                                    long e = e(i);
                                                    long e2 = e(i2);
                                                    long w2 = x91.w((int) (e >>> 32), (int) (e & 4294967295L), (int) (e2 >>> 32), (int) (4294967295L & e2));
                                                    k31 k31 = this.k0;
                                                    if (k31 == null) {
                                                        this.k0 = new k31(w2);
                                                        this.l0 = false;
                                                    } else if (!k31.b(k31.a, w2)) {
                                                        this.l0 = true;
                                                    }
                                                    ih4.s(w2);
                                                    ih4.n();
                                                    setMeasuredDimension(getRoot().b0.p.w, getRoot().b0.p.x);
                                                } finally {
                                                    Trace.endSection();
                                                }
                                            }

                                            public final void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i) {
                                                if (d() && viewStructure != null && !this.X0) {
                                                    z(viewStructure);
                                                }
                                            }

                                            public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
                                                ok5 ok5;
                                                int toolType = motionEvent.getToolType(i);
                                                if (motionEvent.isFromSource(8194) || !motionEvent.isFromSource(16386) || ((toolType != 2 && toolType != 4) || (ok5 = ((ee) getPointerIconService()).a) == null)) {
                                                    return super.onResolvePointerIcon(motionEvent, i);
                                                }
                                                Context context = getContext();
                                                if (ok5 instanceof nh) {
                                                    return PointerIcon.getSystemIcon(context, ((nh) ok5).b);
                                                }
                                                return PointerIcon.getSystemIcon(context, 1000);
                                            }

                                            public final void onRtlPropertiesChanged(int i) {
                                                ey3 ey3;
                                                if (this.y) {
                                                    int[] iArr = fk2.a;
                                                    ey3 ey32 = ey3.w;
                                                    if (i == 0) {
                                                        ey3 = ey32;
                                                    } else if (i != 1) {
                                                        ey3 = null;
                                                    } else {
                                                        ey3 = ey3.x;
                                                    }
                                                    if (ey3 != null) {
                                                        ey32 = ey3;
                                                    }
                                                    setLayoutDirection(ey32);
                                                }
                                            }

                                            public final void onScrollCaptureSearch(Rect rect, Point point, Consumer consumer) {
                                                rg4 rg4;
                                                Object obj;
                                                if (Build.VERSION.SDK_INT >= 31 && (rg4 = this.Y0) != null) {
                                                    ik6 semanticsOwner = getSemanticsOwner();
                                                    e81 coroutineContext = getCoroutineContext();
                                                    eq4 eq4 = new eq4(new xg6[16]);
                                                    ub5.s(semanticsOwner.a(), 0, new wg6(1, eq4, eq4.class, "add", "add(Ljava/lang/Object;)Z", 8, 0));
                                                    Arrays.sort(eq4.w, 0, eq4.y, new wu0(0, new vr2[]{xc4.N, xc4.O}));
                                                    int i = eq4.y;
                                                    if (i == 0) {
                                                        obj = null;
                                                    } else {
                                                        obj = eq4.w[i - 1];
                                                    }
                                                    xg6 xg6 = (xg6) obj;
                                                    if (xg6 != null) {
                                                        se3 se3 = xg6.c;
                                                        ox0 ox0 = new ox0(xg6.a, se3, gl0.E(coroutineContext), rg4, this);
                                                        xz4 xz4 = xg6.d;
                                                        ly5 Q2 = t49.I(xz4).Q(xz4, true);
                                                        long c = se3.c();
                                                        ScrollCaptureTarget o = v41.o(this, o85.r(tf4.O(Q2)), new Point((int) (c >> 32), (int) (c & 4294967295L)), ox0);
                                                        o.setScrollBounds(o85.r(se3));
                                                        consumer.accept(o);
                                                    }
                                                }
                                            }

                                            public final void onScrollChanged() {
                                                L();
                                            }

                                            public final void onTouchModeChanged(boolean z2) {
                                                int i;
                                                uc3 inputModeManager = getInputModeManager();
                                                if (z2) {
                                                    i = 1;
                                                } else {
                                                    i = 2;
                                                }
                                                inputModeManager.a.setValue(new sc3(i));
                                            }

                                            public final void onVirtualViewTranslationResponses(LongSparseArray longSparseArray) {
                                                bf bfVar = this.S;
                                                bfVar.getClass();
                                                if (Build.VERSION.SDK_INT >= 31) {
                                                    if (sg3.e(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                                                        ie1.F(bfVar, longSparseArray);
                                                    } else {
                                                        bfVar.w.post(new ga(2, (Object) bfVar, (Object) longSparseArray));
                                                    }
                                                }
                                            }

                                            public final void onWindowFocusChanged(boolean z2) {
                                                boolean q;
                                                this.V0 = true;
                                                super.onWindowFocusChanged(z2);
                                                if (z2 && Build.VERSION.SDK_INT < 30 && getShowLayoutBounds() != (q = d63.q())) {
                                                    setShowLayoutBounds(q);
                                                    h(getRoot());
                                                }
                                            }

                                            public final void p(float[] fArr) {
                                                A();
                                                eh4.g(fArr, this.r0);
                                                we.d(fArr, Float.intBitsToFloat((int) (this.v0 >> 32)), Float.intBitsToFloat((int) (this.v0 & 4294967295L)), this.p0);
                                            }

                                            public final long q(long j) {
                                                A();
                                                long b = eh4.b(j, this.r0);
                                                return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (this.v0 >> 32)) + Float.intBitsToFloat((int) (b >> 32)))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (this.v0 & 4294967295L)) + Float.intBitsToFloat((int) (b & 4294967295L)))) & 4294967295L);
                                            }

                                            public final void r(boolean z2) {
                                                zd zdVar;
                                                ih4 ih4 = this.m0;
                                                if (ih4.b.T() || ((eq4) ih4.e.y).y != 0) {
                                                    Trace.beginSection("AndroidOwner:measureAndLayout");
                                                    if (z2) {
                                                        try {
                                                            zdVar = this.T0;
                                                        } catch (Throwable th) {
                                                            Trace.endSection();
                                                            throw th;
                                                        }
                                                    } else {
                                                        zdVar = this.U0;
                                                    }
                                                    if (ih4.l(zdVar)) {
                                                        requestLayout();
                                                    }
                                                    ih4.b(false);
                                                    getRectManager().a();
                                                    Trace.endSection();
                                                }
                                            }

                                            public final boolean requestFocus(int i, Rect rect) {
                                                int i2;
                                                ly5 ly5;
                                                if (!isFocused()) {
                                                    bk2 c = fk2.c(i);
                                                    if (c != null) {
                                                        i2 = c.a;
                                                    } else {
                                                        i2 = 7;
                                                    }
                                                    ik2 focusOwner = getFocusOwner();
                                                    if (rect != null) {
                                                        ly5 = o85.t(rect);
                                                    } else {
                                                        ly5 = null;
                                                    }
                                                    Boolean f = ((lk2) focusOwner).f(i2, ly5, new fe(i2, 0));
                                                    Boolean bool = Boolean.TRUE;
                                                    if (!sg3.e(f, bool)) {
                                                        if (!sg3.e(((lk2) getFocusOwner()).f(i2, (ly5) null, new fe(i2, 1)), bool)) {
                                                            if (!hasFocus() || (i2 != 1 && i2 != 2)) {
                                                                return false;
                                                            }
                                                            return ((lk2) getFocusOwner()).i(i2);
                                                        }
                                                    }
                                                }
                                                return true;
                                            }

                                            public final void s(uy3 uy3, long j) {
                                                ih4 ih4 = this.m0;
                                                Trace.beginSection("AndroidOwner:measureAndLayout");
                                                try {
                                                    ih4.m(uy3, j);
                                                    if (!ih4.b.T()) {
                                                        ih4.b(false);
                                                        getRectManager().a();
                                                        this.U0.b();
                                                    }
                                                } finally {
                                                    Trace.endSection();
                                                }
                                            }

                                            public void setAccessibilityEventBatchIntervalMillis(long j) {
                                                this.R.D = j;
                                            }

                                            public final void setComposeViewContext(yx0 yx0) {
                                                yx0 yx02 = this.w;
                                                if (yx0 != yx02) {
                                                    if (isAttachedToWindow()) {
                                                        yx02.b();
                                                        yx0.d();
                                                    }
                                                    this.w = yx0;
                                                }
                                            }

                                            public final void setComposeViewContextIncrementedDuringInit$ui(boolean z2) {
                                                this.W0 = z2;
                                            }

                                            public final void setConfiguration(Configuration configuration) {
                                                this.d0.setValue(configuration);
                                            }

                                            public void setCoroutineContext(e81 e81) {
                                                this.I = e81;
                                            }

                                            public final void setFrameEndScheduler$ui(x54 x54) {
                                                this.A = x54;
                                            }

                                            public final void setLastMatrixRecalculationAnimationTime$ui(long j) {
                                                this.t0 = j;
                                            }

                                            public final void setOnReadyForComposition(vr2 vr2) {
                                                getDerivedIsAttached();
                                                if (isAttachedToWindow() || this.W0) {
                                                    vr2.y(this.w);
                                                } else {
                                                    this.w0 = vr2;
                                                }
                                            }

                                            public final void setPlayNavigationSoundEffect$ui(gs2 gs2) {
                                                this.R0 = gs2;
                                            }

                                            /* renamed from: setPrimaryDirectionalMotionAxisOverride-r2epLt8$ui  reason: not valid java name */
                                            public final void m50setPrimaryDirectionalMotionAxisOverrider2epLt8$ui(sa3 sa3) {
                                                this.z = sa3;
                                            }

                                            public void setShowLayoutBounds(boolean z2) {
                                                this.j0 = z2;
                                            }

                                            public void setUncaughtExceptionHandler(c96 c96) {
                                                this.m0.getClass();
                                            }

                                            public final boolean shouldDelayChildPressedState() {
                                                return false;
                                            }

                                            public final void t(uy3 uy3) {
                                                oe oeVar = this.R;
                                                oeVar.U = true;
                                                if (oeVar.u()) {
                                                    oeVar.v(uy3);
                                                }
                                                bf bfVar = this.S;
                                                bfVar.C = true;
                                                bfVar.e();
                                            }

                                            public final void v(t54 t54) {
                                                mk0 mk0;
                                                if (Build.VERSION.SDK_INT < 30) {
                                                    setShowLayoutBounds(d63.q());
                                                }
                                                y54 y54 = this.B;
                                                if (y54 != null) {
                                                    x54 x54 = this.A;
                                                    x54.getClass();
                                                    wv2 wv2 = y54.a;
                                                    te4 te4 = (te4) wv2.x;
                                                    if (te4.w && !te4.y) {
                                                        try {
                                                            mk0 = ((af8) x54).w.v(new kh(10, y54));
                                                        } catch (CancellationException unused) {
                                                            te4 te42 = (te4) wv2.x;
                                                            if (!te42.x) {
                                                                if (te42.y) {
                                                                    wm5.a("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                                                                }
                                                                te42.a();
                                                                te42.y = true;
                                                            }
                                                            mk0 = null;
                                                        }
                                                        mk0 mk02 = y54.d;
                                                        if (mk02 != null) {
                                                            mk02.cancel();
                                                        }
                                                        y54.d = mk0;
                                                    }
                                                }
                                            }

                                            public final void w(uy3 uy3, boolean z2, boolean z3, boolean z4) {
                                                uy3 v;
                                                uy3 v2;
                                                ih4 ih4 = this.m0;
                                                if (z2) {
                                                    wr0 wr0 = ih4.b;
                                                    uy3 uy32 = uy3.D;
                                                    yy3 yy3 = uy3.b0;
                                                    if (uy32 == null) {
                                                        yb3.b("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope");
                                                    }
                                                    int ordinal = yy3.d.ordinal();
                                                    if (ordinal != 0) {
                                                        if (ordinal == 1) {
                                                            return;
                                                        }
                                                        if (!(ordinal == 2 || ordinal == 3)) {
                                                            if (ordinal != 4) {
                                                                h.c();
                                                                return;
                                                            } else if (!yy3.e || z3) {
                                                                yy3.e = true;
                                                                yy3.p.Q = true;
                                                                if (!uy3.j0) {
                                                                    if ((sg3.e(uy3.L(), Boolean.TRUE) || ih4.i(uy3)) && ((v2 = uy3.v()) == null || !v2.b0.e)) {
                                                                        wr0.k(uy3, bh3.w);
                                                                    } else if ((uy3.K() || ih4.j(uy3)) && ((v = uy3.v()) == null || !v.q())) {
                                                                        wr0.k(uy3, bh3.y);
                                                                    }
                                                                    if (!ih4.d && z4) {
                                                                        F(uy3);
                                                                        return;
                                                                    }
                                                                    return;
                                                                }
                                                                return;
                                                            } else {
                                                                return;
                                                            }
                                                        }
                                                    }
                                                    ih4.h.b(new hh4(uy3, true, z3));
                                                } else if (ih4.r(uy3, z3) && z4) {
                                                    F(uy3);
                                                }
                                            }

                                            public final void x(uy3 uy3, boolean z2, boolean z3) {
                                                boolean z4;
                                                yy3 yy3 = uy3.b0;
                                                bh3 bh3 = bh3.z;
                                                ih4 ih4 = this.m0;
                                                if (z2) {
                                                    wr0 wr0 = ih4.b;
                                                    int ordinal = yy3.d.ordinal();
                                                    if (ordinal != 0) {
                                                        if (ordinal == 1) {
                                                            return;
                                                        }
                                                        if (ordinal != 2) {
                                                            if (ordinal == 3) {
                                                                return;
                                                            }
                                                            if (ordinal != 4) {
                                                                h.c();
                                                                return;
                                                            }
                                                        }
                                                    }
                                                    if ((!yy3.e && !yy3.f) || z3) {
                                                        yy3.f = true;
                                                        yy3.g = true;
                                                        kh4 kh4 = yy3.p;
                                                        kh4.R = true;
                                                        kh4.S = true;
                                                        if (!uy3.j0) {
                                                            uy3 v = uy3.v();
                                                            if (sg3.e(uy3.L(), Boolean.TRUE) && ((v == null || !v.b0.e) && (v == null || !v.b0.f))) {
                                                                wr0.k(uy3, bh3.x);
                                                            } else if (uy3.K() && ((v == null || !v.p()) && (v == null || !v.q()))) {
                                                                wr0.k(uy3, bh3);
                                                            }
                                                            if (!ih4.d) {
                                                                F((uy3) null);
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    return;
                                                }
                                                ih4.getClass();
                                                int ordinal2 = yy3.d.ordinal();
                                                if (ordinal2 != 0 && ordinal2 != 1 && ordinal2 != 2 && ordinal2 != 3) {
                                                    if (ordinal2 == 4) {
                                                        uy3 v2 = uy3.v();
                                                        if (v2 == null || v2.K()) {
                                                            z4 = true;
                                                        } else {
                                                            z4 = false;
                                                        }
                                                        if (!z3) {
                                                            if (uy3.q()) {
                                                                return;
                                                            }
                                                            if (uy3.p() && uy3.K() == z4 && uy3.K() == yy3.p.P) {
                                                                return;
                                                            }
                                                        }
                                                        kh4 kh42 = yy3.p;
                                                        kh42.R = true;
                                                        kh42.S = true;
                                                        if (!uy3.j0 && kh42.P && z4) {
                                                            if ((v2 == null || !v2.p()) && (v2 == null || !v2.q())) {
                                                                ih4.b.k(uy3, bh3);
                                                            }
                                                            if (!ih4.d) {
                                                                F((uy3) null);
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    h.c();
                                                }
                                            }

                                            public final void y() {
                                                oe oeVar = this.R;
                                                oeVar.U = true;
                                                Handler handler = oeVar.z.getHandler();
                                                if (handler != null && oeVar.u() && !oeVar.f0) {
                                                    oeVar.f0 = true;
                                                    handler.post(oeVar.i0);
                                                }
                                                bf bfVar = this.S;
                                                bfVar.C = true;
                                                bfVar.e();
                                            }

                                            public final void z(ViewStructure viewStructure) {
                                                md autofillManager = getAutofillManager();
                                                if (autofillManager != null) {
                                                    uy3 uy3 = autofillManager.x.a;
                                                    AutofillId autofillId = autofillManager.C;
                                                    String str = autofillManager.A;
                                                    ny5 ny5 = autofillManager.z;
                                                    t35.A(viewStructure, uy3, autofillId, str, ny5);
                                                    Object[] objArr = w25.a;
                                                    lp4 lp4 = new lp4(2);
                                                    lp4.a(uy3);
                                                    lp4.a(viewStructure);
                                                    while (lp4.i()) {
                                                        Object k = lp4.k(lp4.b - 1);
                                                        k.getClass();
                                                        ViewStructure viewStructure2 = (ViewStructure) k;
                                                        Object k2 = lp4.k(lp4.b - 1);
                                                        k2.getClass();
                                                        jp4 jp4 = (jp4) ((uy3) k2).n();
                                                        int i = ((eq4) jp4.x).y;
                                                        for (int i2 = 0; i2 < i; i2++) {
                                                            uy3 uy32 = (uy3) jp4.get(i2);
                                                            if (!uy32.j0 && uy32.J() && uy32.K()) {
                                                                ak6 x2 = uy32.x();
                                                                if (x2 != null) {
                                                                    tp4 tp4 = x2.w;
                                                                    if (tp4.b(zj6.g) || tp4.b(zj6.h) || tp4.b(jk6.r) || tp4.b(jk6.s) || (Build.VERSION.SDK_INT >= 34 && tp4.b(kk6.c))) {
                                                                        ViewStructure newChild = viewStructure2.newChild(viewStructure2.addChildCount(1));
                                                                        t35.A(newChild, uy32, autofillManager.C, str, ny5);
                                                                        lp4.a(uy32);
                                                                        lp4.a(newChild);
                                                                    }
                                                                }
                                                                lp4.a(uy32);
                                                                lp4.a(viewStructure2);
                                                            }
                                                        }
                                                    }
                                                }
                                                ld autofill = getAutofill();
                                                if (autofill != null) {
                                                    c20 c20 = autofill.b;
                                                    LinkedHashMap linkedHashMap = c20.a;
                                                    LinkedHashMap linkedHashMap2 = c20.a;
                                                    if (!linkedHashMap.isEmpty()) {
                                                        int addChildCount = viewStructure.addChildCount(linkedHashMap2.size());
                                                        Iterator it = linkedHashMap2.entrySet().iterator();
                                                        if (it.hasNext()) {
                                                            Map.Entry entry = (Map.Entry) it.next();
                                                            int intValue = ((Number) entry.getKey()).intValue();
                                                            if (entry.getValue() != null) {
                                                                ku4.a();
                                                                return;
                                                            }
                                                            ViewStructure newChild2 = viewStructure.newChild(addChildCount);
                                                            newChild2.setAutofillId(autofill.c, intValue);
                                                            newChild2.setId(intValue, autofill.a.getContext().getPackageName(), (String) null, (String) null);
                                                            newChild2.setAutofillType(1);
                                                            throw null;
                                                        }
                                                    }
                                                }
                                            }

                                            public ld getAutofill() {
                                                return this.f0;
                                            }

                                            public md getAutofillManager() {
                                                return this.g0;
                                            }

                                            public tf getDragAndDropManager() {
                                                return this.J;
                                            }

                                            public yo4 getLayoutNodes() {
                                                return this.O;
                                            }

                                            public final void addView(View view) {
                                                addView(view, -1);
                                            }

                                            public final void addView(View view, int i, int i2) {
                                                ViewGroup.LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
                                                generateDefaultLayoutParams.width = i;
                                                generateDefaultLayoutParams.height = i2;
                                                addViewInLayout(view, -1, generateDefaultLayoutParams, true);
                                            }

                                            @fq1
                                            public static /* synthetic */ void getFontLoader$annotations() {
                                            }

                                            public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui$annotations() {
                                            }

                                            public static /* synthetic */ void getPlayNavigationSoundEffect$ui$annotations() {
                                            }

                                            /* renamed from: getPrimaryDirectionalMotionAxisOverride-dqNNBbU$ui$annotations  reason: not valid java name */
                                            public static /* synthetic */ void m48getPrimaryDirectionalMotionAxisOverridedqNNBbU$ui$annotations() {
                                            }

                                            public static /* synthetic */ void getRoot$annotations() {
                                            }

                                            @fq1
                                            public static /* synthetic */ void getTextInputService$annotations() {
                                            }

                                            public static /* synthetic */ void getWindowInfo$annotations() {
                                            }

                                            public d96 getRootForTest() {
                                                return this;
                                            }

                                            public View getView() {
                                                return this;
                                            }

                                            public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
                                                addViewInLayout(view, i, layoutParams, true);
                                            }

                                            public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
                                                addViewInLayout(view, -1, layoutParams, true);
                                            }

                                            public final void onDraw(Canvas canvas) {
                                            }

                                            public final void setAndroidViewsHandler(lj ljVar) {
                                            }

                                            public final void setUncaughtExceptionHandler$ui(c96 c96) {
                                            }
                                        }
