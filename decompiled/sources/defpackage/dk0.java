package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.journeyapps.barcodescanner.BarcodeView;
import java.util.ArrayList;

/* renamed from: dk0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class dk0 extends ViewGroup {
    public static final /* synthetic */ int V = 0;
    public SurfaceView A;
    public TextureView B;
    public boolean C = false;
    public final kb9 D;
    public int E = -1;
    public final ArrayList F = new ArrayList();
    public ig G;
    public ek0 H = new ek0();
    public vu6 I;
    public vu6 J;
    public Rect K;
    public vu6 L;
    public Rect M = null;
    public Rect N = null;
    public vu6 O = null;
    public double P = 0.1d;
    public io5 Q = null;
    public boolean R = false;
    public final bk0 S;
    public final ns8 T;
    public final ck0 U;
    public xj0 w;
    public final WindowManager x;
    public final Handler y;
    public boolean z = false;

    public dk0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        BarcodeView barcodeView = (BarcodeView) this;
        this.S = new bk0(barcodeView);
        h50 h50 = new h50(barcodeView, 1);
        this.T = new ns8(8, (Object) barcodeView);
        this.U = new ck0(0, barcodeView);
        if (getBackground() == null) {
            setBackgroundColor(-16777216);
        }
        b(attributeSet);
        this.x = (WindowManager) context.getSystemService("window");
        this.y = new Handler(h50);
        this.D = new kb9(8, false);
    }

    public static void a(BarcodeView barcodeView) {
        if (barcodeView.w != null && barcodeView.getDisplayRotation() != barcodeView.E) {
            barcodeView.g();
            barcodeView.c();
        }
    }

    private int getDisplayRotation() {
        return this.x.getDefaultDisplay().getRotation();
    }

    public final void b(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, pv5.a);
        int dimension = (int) obtainStyledAttributes.getDimension(1, -1.0f);
        int dimension2 = (int) obtainStyledAttributes.getDimension(0, -1.0f);
        if (dimension > 0 && dimension2 > 0) {
            this.O = new vu6(dimension, dimension2);
        }
        this.z = obtainStyledAttributes.getBoolean(3, true);
        int integer = obtainStyledAttributes.getInteger(2, -1);
        if (integer == 1) {
            this.Q = new rm0(0);
        } else if (integer == 2) {
            this.Q = new rm0(1);
        } else if (integer == 3) {
            this.Q = new rm0(2);
        }
        obtainStyledAttributes.recycle();
    }

    /* JADX WARNING: type inference failed for: r0v12, types: [java.lang.Object, xj0] */
    public final void c() {
        w95.l();
        Log.d("dk0", "resume()");
        if (this.w != null) {
            Log.w("dk0", "initCamera called twice");
        } else {
            Context context = getContext();
            ? obj = new Object();
            obj.f = false;
            obj.g = true;
            obj.i = new ek0();
            wj0 wj0 = new wj0(obj, 0);
            obj.j = new wj0(obj, 1);
            obj.k = new wj0(obj, 2);
            obj.l = new wj0(obj, 3);
            w95.l();
            if (kb9.C == null) {
                kb9.C = new kb9(2);
            }
            kb9 kb9 = kb9.C;
            obj.a = kb9;
            zj0 zj0 = new zj0(context);
            obj.c = zj0;
            zj0.g = obj.i;
            obj.h = new Handler();
            ek0 ek0 = this.H;
            if (!obj.f) {
                obj.i = ek0;
                zj0.g = ek0;
            }
            this.w = obj;
            obj.d = this.y;
            w95.l();
            obj.f = true;
            obj.g = false;
            synchronized (kb9.A) {
                kb9.x++;
                kb9.c(wj0);
            }
            this.E = getDisplayRotation();
        }
        if (this.L != null) {
            e();
        } else {
            SurfaceView surfaceView = this.A;
            if (surfaceView != null) {
                surfaceView.getHolder().addCallback(this.S);
            } else {
                TextureView textureView = this.B;
                if (textureView != null) {
                    if (textureView.isAvailable()) {
                        this.B.getSurfaceTexture();
                        this.L = new vu6(this.B.getWidth(), this.B.getHeight());
                        e();
                    } else {
                        this.B.setSurfaceTextureListener(new ak0(this));
                    }
                }
            }
        }
        requestLayout();
        kb9 kb92 = this.D;
        Context context2 = getContext();
        ns8 ns8 = this.T;
        k96 k96 = (k96) kb92.z;
        if (k96 != null) {
            k96.disable();
        }
        kb92.z = null;
        kb92.y = null;
        kb92.A = null;
        Context applicationContext = context2.getApplicationContext();
        kb92.A = ns8;
        kb92.y = (WindowManager) applicationContext.getSystemService("window");
        k96 k962 = new k96(kb92, applicationContext);
        kb92.z = k962;
        k962.enable();
        kb92.x = ((WindowManager) kb92.y).getDefaultDisplay().getRotation();
    }

    public final void d(qc3 qc3) {
        if (!this.C && this.w != null) {
            Log.i("dk0", "Starting preview");
            xj0 xj0 = this.w;
            xj0.b = qc3;
            w95.l();
            if (xj0.f) {
                xj0.a.c(xj0.k);
                this.C = true;
                ((BarcodeView) this).h();
                this.U.g();
                return;
            }
            h.s("CameraInstance is not open");
        }
    }

    public final void e() {
        Rect rect;
        float f;
        vu6 vu6 = this.L;
        if (vu6 != null && this.J != null && (rect = this.K) != null) {
            if (this.A == null || !vu6.equals(new vu6(rect.width(), this.K.height()))) {
                TextureView textureView = this.B;
                if (textureView != null && textureView.getSurfaceTexture() != null) {
                    if (this.J != null) {
                        int width = this.B.getWidth();
                        int height = this.B.getHeight();
                        vu6 vu62 = this.J;
                        float f2 = (float) height;
                        float f3 = ((float) width) / f2;
                        float f4 = ((float) vu62.w) / ((float) vu62.x);
                        float f5 = 1.0f;
                        if (f3 < f4) {
                            float f6 = f4 / f3;
                            f = 1.0f;
                            f5 = f6;
                        } else {
                            f = f3 / f4;
                        }
                        Matrix matrix = new Matrix();
                        matrix.setScale(f5, f);
                        float f7 = (float) width;
                        matrix.postTranslate((f7 - (f5 * f7)) / 2.0f, (f2 - (f * f2)) / 2.0f);
                        this.B.setTransform(matrix);
                    }
                    SurfaceTexture surfaceTexture = this.B.getSurfaceTexture();
                    qc3 qc3 = new qc3(24, false);
                    if (surfaceTexture != null) {
                        qc3.y = surfaceTexture;
                        d(qc3);
                        return;
                    }
                    h.q("surfaceTexture may not be null");
                    return;
                }
                return;
            }
            SurfaceHolder holder = this.A.getHolder();
            qc3 qc32 = new qc3(24, false);
            if (holder != null) {
                qc32.x = holder;
                d(qc32);
                return;
            }
            h.q("surfaceHolder may not be null");
        }
    }

    public xj0 getCameraInstance() {
        return this.w;
    }

    public ek0 getCameraSettings() {
        return this.H;
    }

    public Rect getFramingRect() {
        return this.M;
    }

    public vu6 getFramingRectSize() {
        return this.O;
    }

    public double getMarginFraction() {
        return this.P;
    }

    public Rect getPreviewFramingRect() {
        return this.N;
    }

    public io5 getPreviewScalingStrategy() {
        io5 io5 = this.Q;
        if (io5 != null) {
            return io5;
        }
        if (this.B != null) {
            return new rm0(0);
        }
        return new rm0(1);
    }

    public vu6 getPreviewSize() {
        return this.J;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.z) {
            TextureView textureView = new TextureView(getContext());
            this.B = textureView;
            textureView.setSurfaceTextureListener(new ak0(this));
            addView(this.B);
            return;
        }
        SurfaceView surfaceView = new SurfaceView(getContext());
        this.A = surfaceView;
        surfaceView.getHolder().addCallback(this.S);
        addView(this.A);
    }

    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        vu6 vu6 = new vu6(i3 - i, i4 - i2);
        this.I = vu6;
        xj0 xj0 = this.w;
        if (xj0 != null && xj0.e == null) {
            int displayRotation = getDisplayRotation();
            ig igVar = new ig(4, (byte) 0);
            igVar.d = new rm0(1);
            igVar.b = displayRotation;
            igVar.c = vu6;
            this.G = igVar;
            igVar.d = getPreviewScalingStrategy();
            xj0 xj02 = this.w;
            ig igVar2 = this.G;
            xj02.e = igVar2;
            xj02.c.h = igVar2;
            w95.l();
            if (xj02.f) {
                xj02.a.c(xj02.j);
                boolean z3 = this.R;
                if (z3) {
                    xj0 xj03 = this.w;
                    xj03.getClass();
                    w95.l();
                    if (xj03.f) {
                        xj03.a.c(new vb(1, xj03, z3));
                    }
                }
            } else {
                h.s("CameraInstance is not open");
                return;
            }
        }
        SurfaceView surfaceView = this.A;
        if (surfaceView != null) {
            Rect rect = this.K;
            if (rect == null) {
                surfaceView.layout(0, 0, getWidth(), getHeight());
            } else {
                surfaceView.layout(rect.left, rect.top, rect.right, rect.bottom);
            }
        } else {
            TextureView textureView = this.B;
            if (textureView != null) {
                textureView.layout(0, 0, getWidth(), getHeight());
            }
        }
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        super.onRestoreInstanceState(bundle.getParcelable("super"));
        setTorch(bundle.getBoolean("torch"));
    }

    public final Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        Bundle bundle = new Bundle();
        bundle.putParcelable("super", onSaveInstanceState);
        bundle.putBoolean("torch", this.R);
        return bundle;
    }

    public void setCameraSettings(ek0 ek0) {
        this.H = ek0;
    }

    public void setFramingRectSize(vu6 vu6) {
        this.O = vu6;
    }

    public void setMarginFraction(double d) {
        if (d < 0.5d) {
            this.P = d;
        } else {
            h.q("The margin fraction must be less than 0.5");
        }
    }

    public void setPreviewScalingStrategy(io5 io5) {
        this.Q = io5;
    }

    public void setTorch(boolean z2) {
        this.R = z2;
        xj0 xj0 = this.w;
        if (xj0 != null) {
            w95.l();
            if (xj0.f) {
                xj0.a.c(new vb(1, xj0, z2));
            }
        }
    }

    public void setUseTextureView(boolean z2) {
        this.z = z2;
    }
}
