package defpackage;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;

/* renamed from: p58  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class p58 extends View {
    public static final xu1 I = new xu1(2);
    public Outline A;
    public boolean B = true;
    public tp1 C = tf4.b;
    public ey3 D = ey3.w;
    public vr2 E;
    public cx2 F;
    public float G;
    public float H;
    public final ez1 w;
    public final uk0 x;
    public final tk0 y;
    public boolean z;

    public p58(ez1 ez1, uk0 uk0, tk0 tk0) {
        super(ez1.getContext());
        this.w = ez1;
        this.x = uk0;
        this.y = tk0;
        setOutlineProvider(I);
        ex2.a.getClass();
        this.E = ce.b0;
        setWillNotDraw(false);
        setClipBounds((Rect) null);
    }

    /* JADX INFO: finally extract failed */
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2 = canvas;
        int i = (this.G > 0.0f ? 1 : (this.G == 0.0f ? 0 : -1));
        tk0 tk0 = this.y;
        uk0 uk0 = this.x;
        if (i > 0 || this.H > 0.0f) {
            int save = canvas2.save();
            canvas2.translate(this.G, this.H);
            od odVar = uk0.a;
            Canvas canvas3 = odVar.a;
            odVar.a = canvas2;
            tp1 tp1 = this.C;
            ey3 ey3 = this.D;
            long floatToRawIntBits = (long) Float.floatToRawIntBits((float) getWidth());
            long floatToRawIntBits2 = (4294967295L & ((long) Float.floatToRawIntBits((float) getHeight()))) | (floatToRawIntBits << 32);
            cx2 cx2 = this.F;
            vr2 vr2 = this.E;
            tp1 H2 = tk0.j0().H();
            ey3 J = tk0.j0().J();
            qk0 D2 = tk0.j0().D();
            long L = tk0.j0().L();
            int i2 = save;
            Canvas canvas4 = canvas3;
            cx2 cx22 = (cx2) tk0.j0().y;
            wr0 j0 = tk0.j0();
            j0.c0(tp1);
            j0.d0(ey3);
            j0.b0(odVar);
            j0.e0(floatToRawIntBits2);
            j0.y = cx2;
            odVar.h();
            try {
                vr2.y(tk0);
                odVar.p();
                wr0 j02 = tk0.j0();
                j02.c0(H2);
                j02.d0(J);
                j02.b0(D2);
                j02.e0(L);
                j02.y = cx22;
                uk0.a.a = canvas4;
                canvas.restoreToCount(i2);
            } catch (Throwable th) {
                odVar.p();
                wr0 j03 = tk0.j0();
                j03.c0(H2);
                j03.d0(J);
                j03.b0(D2);
                j03.e0(L);
                j03.y = cx22;
                throw th;
            }
        } else {
            od odVar2 = uk0.a;
            Canvas canvas5 = odVar2.a;
            odVar2.a = canvas2;
            tp1 tp12 = this.C;
            ey3 ey32 = this.D;
            long floatToRawIntBits3 = (long) Float.floatToRawIntBits((float) getWidth());
            long floatToRawIntBits4 = (4294967295L & ((long) Float.floatToRawIntBits((float) getHeight()))) | (floatToRawIntBits3 << 32);
            cx2 cx23 = this.F;
            vr2 vr22 = this.E;
            tp1 H3 = tk0.j0().H();
            ey3 J2 = tk0.j0().J();
            qk0 D3 = tk0.j0().D();
            long L2 = tk0.j0().L();
            Canvas canvas6 = canvas5;
            cx2 cx24 = (cx2) tk0.j0().y;
            wr0 j04 = tk0.j0();
            j04.c0(tp12);
            j04.d0(ey32);
            j04.b0(odVar2);
            j04.e0(floatToRawIntBits4);
            j04.y = cx23;
            odVar2.h();
            try {
                vr22.y(tk0);
                odVar2.p();
                wr0 j05 = tk0.j0();
                j05.c0(H3);
                j05.d0(J2);
                j05.b0(D3);
                j05.e0(L2);
                j05.y = cx24;
                uk0.a.a = canvas6;
            } catch (Throwable th2) {
                odVar2.p();
                wr0 j06 = tk0.j0();
                j06.c0(H3);
                j06.d0(J2);
                j06.b0(D3);
                j06.e0(L2);
                j06.y = cx24;
                throw th2;
            }
        }
        this.z = false;
    }

    public final boolean getCanUseCompositingLayer$ui_graphics() {
        return this.B;
    }

    public final uk0 getCanvasHolder() {
        return this.x;
    }

    public final View getOwnerView() {
        return this.w;
    }

    public final boolean hasOverlappingRendering() {
        return this.B;
    }

    public final void invalidate() {
        if (!this.z) {
            this.z = true;
            super.invalidate();
        }
    }

    public final void setCanUseCompositingLayer$ui_graphics(boolean z2) {
        if (this.B != z2) {
            this.B = z2;
            invalidate();
        }
    }

    public final void setInvalidated(boolean z2) {
        this.z = z2;
    }

    public final void forceLayout() {
    }

    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
    }
}
