package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class ConstraintLayout extends ViewGroup {
    public static gs6 N;
    public int A = 0;
    public int B = Integer.MAX_VALUE;
    public int C = Integer.MAX_VALUE;
    public boolean D = true;
    public int E = 257;
    public w21 F = null;
    public jz0 G = null;
    public int H = -1;
    public HashMap I = new HashMap();
    public final SparseArray J = new SparseArray();
    public final n21 K = new n21(this, this);
    public int L = 0;
    public int M = 0;
    public final SparseArray w = new SparseArray();
    public final ArrayList x = new ArrayList(4);
    public final h31 y = new h31();
    public int z = 0;

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        i(attributeSet, 0);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [android.view.ViewGroup$MarginLayoutParams, m21] */
    public static m21 g() {
        ? marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.a = -1;
        marginLayoutParams.b = -1;
        marginLayoutParams.c = -1.0f;
        marginLayoutParams.d = -1;
        marginLayoutParams.e = -1;
        marginLayoutParams.f = -1;
        marginLayoutParams.g = -1;
        marginLayoutParams.h = -1;
        marginLayoutParams.i = -1;
        marginLayoutParams.j = -1;
        marginLayoutParams.k = -1;
        marginLayoutParams.l = -1;
        marginLayoutParams.m = -1;
        marginLayoutParams.n = -1;
        marginLayoutParams.o = -1;
        marginLayoutParams.p = 0;
        marginLayoutParams.q = 0.0f;
        marginLayoutParams.r = -1;
        marginLayoutParams.s = -1;
        marginLayoutParams.t = -1;
        marginLayoutParams.u = -1;
        marginLayoutParams.v = Integer.MIN_VALUE;
        marginLayoutParams.w = Integer.MIN_VALUE;
        marginLayoutParams.x = Integer.MIN_VALUE;
        marginLayoutParams.y = Integer.MIN_VALUE;
        marginLayoutParams.z = Integer.MIN_VALUE;
        marginLayoutParams.A = Integer.MIN_VALUE;
        marginLayoutParams.B = Integer.MIN_VALUE;
        marginLayoutParams.C = 0;
        marginLayoutParams.D = 0.5f;
        marginLayoutParams.E = 0.5f;
        marginLayoutParams.F = null;
        marginLayoutParams.G = -1.0f;
        marginLayoutParams.H = -1.0f;
        marginLayoutParams.I = 0;
        marginLayoutParams.J = 0;
        marginLayoutParams.K = 0;
        marginLayoutParams.L = 0;
        marginLayoutParams.M = 0;
        marginLayoutParams.N = 0;
        marginLayoutParams.O = 0;
        marginLayoutParams.P = 0;
        marginLayoutParams.Q = 1.0f;
        marginLayoutParams.R = 1.0f;
        marginLayoutParams.S = -1;
        marginLayoutParams.T = -1;
        marginLayoutParams.U = -1;
        marginLayoutParams.V = false;
        marginLayoutParams.W = false;
        marginLayoutParams.X = null;
        marginLayoutParams.Y = 0;
        marginLayoutParams.Z = true;
        marginLayoutParams.a0 = true;
        marginLayoutParams.b0 = false;
        marginLayoutParams.c0 = false;
        marginLayoutParams.d0 = false;
        marginLayoutParams.e0 = -1;
        marginLayoutParams.f0 = -1;
        marginLayoutParams.g0 = -1;
        marginLayoutParams.h0 = -1;
        marginLayoutParams.i0 = Integer.MIN_VALUE;
        marginLayoutParams.j0 = Integer.MIN_VALUE;
        marginLayoutParams.k0 = 0.5f;
        marginLayoutParams.o0 = new g31();
        return marginLayoutParams;
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int max2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        if (max2 > 0) {
            return max2;
        }
        return max;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Object, gs6] */
    public static gs6 getSharedValues() {
        if (N == null) {
            ? obj = new Object();
            new SparseIntArray();
            new HashMap();
            N = obj;
        }
        return N;
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof m21;
    }

    public final void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.x;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                ((k21) arrayList.get(i)).getClass();
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = (float) getWidth();
            float height = (float) getHeight();
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (!(childAt.getVisibility() == 8 || (tag = childAt.getTag()) == null || !(tag instanceof String))) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i3 = (int) ((((float) parseInt) / 1080.0f) * width);
                        int i4 = (int) ((((float) parseInt2) / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f = (float) i3;
                        float f2 = (float) i4;
                        float f3 = (float) (i3 + ((int) ((((float) parseInt3) / 1080.0f) * width)));
                        Canvas canvas2 = canvas;
                        canvas2.drawLine(f, f2, f3, f2, paint);
                        float f4 = f;
                        float parseInt4 = (float) (i4 + ((int) ((((float) Integer.parseInt(split[3])) / 1920.0f) * height)));
                        float f5 = f3;
                        canvas2.drawLine(f5, f2, f3, parseInt4, paint);
                        float f6 = f2;
                        float f7 = parseInt4;
                        float f8 = f4;
                        canvas2.drawLine(f5, f7, f8, parseInt4, paint);
                        float f9 = f5;
                        float f10 = f8;
                        float f11 = f6;
                        canvas2.drawLine(f10, f7, f8, f11, paint);
                        float f12 = f11;
                        float f13 = f7;
                        float f14 = f12;
                        paint.setColor(-16711936);
                        float f15 = f9;
                        canvas2.drawLine(f10, f14, f15, f13, paint);
                        canvas2.drawLine(f10, f13, f15, f14, paint);
                    }
                }
            }
        }
    }

    public final void forceLayout() {
        this.D = true;
        super.forceLayout();
    }

    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return g();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [android.view.ViewGroup$LayoutParams, android.view.ViewGroup$MarginLayoutParams, java.lang.Object, m21] */
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        ? marginLayoutParams = new ViewGroup.MarginLayoutParams(context, attributeSet);
        marginLayoutParams.a = -1;
        marginLayoutParams.b = -1;
        marginLayoutParams.c = -1.0f;
        marginLayoutParams.d = -1;
        marginLayoutParams.e = -1;
        marginLayoutParams.f = -1;
        marginLayoutParams.g = -1;
        marginLayoutParams.h = -1;
        marginLayoutParams.i = -1;
        marginLayoutParams.j = -1;
        marginLayoutParams.k = -1;
        marginLayoutParams.l = -1;
        marginLayoutParams.m = -1;
        marginLayoutParams.n = -1;
        marginLayoutParams.o = -1;
        marginLayoutParams.p = 0;
        marginLayoutParams.q = 0.0f;
        marginLayoutParams.r = -1;
        marginLayoutParams.s = -1;
        marginLayoutParams.t = -1;
        marginLayoutParams.u = -1;
        marginLayoutParams.v = Integer.MIN_VALUE;
        marginLayoutParams.w = Integer.MIN_VALUE;
        marginLayoutParams.x = Integer.MIN_VALUE;
        marginLayoutParams.y = Integer.MIN_VALUE;
        marginLayoutParams.z = Integer.MIN_VALUE;
        marginLayoutParams.A = Integer.MIN_VALUE;
        marginLayoutParams.B = Integer.MIN_VALUE;
        marginLayoutParams.C = 0;
        marginLayoutParams.D = 0.5f;
        marginLayoutParams.E = 0.5f;
        marginLayoutParams.F = null;
        marginLayoutParams.G = -1.0f;
        marginLayoutParams.H = -1.0f;
        marginLayoutParams.I = 0;
        marginLayoutParams.J = 0;
        marginLayoutParams.K = 0;
        marginLayoutParams.L = 0;
        marginLayoutParams.M = 0;
        marginLayoutParams.N = 0;
        marginLayoutParams.O = 0;
        marginLayoutParams.P = 0;
        marginLayoutParams.Q = 1.0f;
        marginLayoutParams.R = 1.0f;
        marginLayoutParams.S = -1;
        marginLayoutParams.T = -1;
        marginLayoutParams.U = -1;
        marginLayoutParams.V = false;
        marginLayoutParams.W = false;
        marginLayoutParams.X = null;
        marginLayoutParams.Y = 0;
        marginLayoutParams.Z = true;
        marginLayoutParams.a0 = true;
        marginLayoutParams.b0 = false;
        marginLayoutParams.c0 = false;
        marginLayoutParams.d0 = false;
        marginLayoutParams.e0 = -1;
        marginLayoutParams.f0 = -1;
        marginLayoutParams.g0 = -1;
        marginLayoutParams.h0 = -1;
        marginLayoutParams.i0 = Integer.MIN_VALUE;
        marginLayoutParams.j0 = Integer.MIN_VALUE;
        marginLayoutParams.k0 = 0.5f;
        marginLayoutParams.o0 = new g31();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, jv5.b);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            int i2 = l21.a.get(index);
            switch (i2) {
                case 1:
                    marginLayoutParams.U = obtainStyledAttributes.getInt(index, marginLayoutParams.U);
                    break;
                case 2:
                    int resourceId = obtainStyledAttributes.getResourceId(index, marginLayoutParams.o);
                    marginLayoutParams.o = resourceId;
                    if (resourceId != -1) {
                        break;
                    } else {
                        marginLayoutParams.o = obtainStyledAttributes.getInt(index, -1);
                        break;
                    }
                case 3:
                    marginLayoutParams.p = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.p);
                    break;
                case 4:
                    float f = obtainStyledAttributes.getFloat(index, marginLayoutParams.q) % 360.0f;
                    marginLayoutParams.q = f;
                    if (f >= 0.0f) {
                        break;
                    } else {
                        marginLayoutParams.q = (360.0f - f) % 360.0f;
                        break;
                    }
                case 5:
                    marginLayoutParams.a = obtainStyledAttributes.getDimensionPixelOffset(index, marginLayoutParams.a);
                    break;
                case 6:
                    marginLayoutParams.b = obtainStyledAttributes.getDimensionPixelOffset(index, marginLayoutParams.b);
                    break;
                case 7:
                    marginLayoutParams.c = obtainStyledAttributes.getFloat(index, marginLayoutParams.c);
                    break;
                case 8:
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.d);
                    marginLayoutParams.d = resourceId2;
                    if (resourceId2 != -1) {
                        break;
                    } else {
                        marginLayoutParams.d = obtainStyledAttributes.getInt(index, -1);
                        break;
                    }
                case 9:
                    int resourceId3 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.e);
                    marginLayoutParams.e = resourceId3;
                    if (resourceId3 != -1) {
                        break;
                    } else {
                        marginLayoutParams.e = obtainStyledAttributes.getInt(index, -1);
                        break;
                    }
                case 10:
                    int resourceId4 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f);
                    marginLayoutParams.f = resourceId4;
                    if (resourceId4 != -1) {
                        break;
                    } else {
                        marginLayoutParams.f = obtainStyledAttributes.getInt(index, -1);
                        break;
                    }
                case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                    int resourceId5 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.g);
                    marginLayoutParams.g = resourceId5;
                    if (resourceId5 != -1) {
                        break;
                    } else {
                        marginLayoutParams.g = obtainStyledAttributes.getInt(index, -1);
                        break;
                    }
                case 12:
                    int resourceId6 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.h);
                    marginLayoutParams.h = resourceId6;
                    if (resourceId6 != -1) {
                        break;
                    } else {
                        marginLayoutParams.h = obtainStyledAttributes.getInt(index, -1);
                        break;
                    }
                case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                    int resourceId7 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.i);
                    marginLayoutParams.i = resourceId7;
                    if (resourceId7 != -1) {
                        break;
                    } else {
                        marginLayoutParams.i = obtainStyledAttributes.getInt(index, -1);
                        break;
                    }
                case 14:
                    int resourceId8 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.j);
                    marginLayoutParams.j = resourceId8;
                    if (resourceId8 != -1) {
                        break;
                    } else {
                        marginLayoutParams.j = obtainStyledAttributes.getInt(index, -1);
                        break;
                    }
                case h75.g /*15*/:
                    int resourceId9 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.k);
                    marginLayoutParams.k = resourceId9;
                    if (resourceId9 != -1) {
                        break;
                    } else {
                        marginLayoutParams.k = obtainStyledAttributes.getInt(index, -1);
                        break;
                    }
                case 16:
                    int resourceId10 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.l);
                    marginLayoutParams.l = resourceId10;
                    if (resourceId10 != -1) {
                        break;
                    } else {
                        marginLayoutParams.l = obtainStyledAttributes.getInt(index, -1);
                        break;
                    }
                case 17:
                    int resourceId11 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.r);
                    marginLayoutParams.r = resourceId11;
                    if (resourceId11 != -1) {
                        break;
                    } else {
                        marginLayoutParams.r = obtainStyledAttributes.getInt(index, -1);
                        break;
                    }
                case 18:
                    int resourceId12 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.s);
                    marginLayoutParams.s = resourceId12;
                    if (resourceId12 != -1) {
                        break;
                    } else {
                        marginLayoutParams.s = obtainStyledAttributes.getInt(index, -1);
                        break;
                    }
                case 19:
                    int resourceId13 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.t);
                    marginLayoutParams.t = resourceId13;
                    if (resourceId13 != -1) {
                        break;
                    } else {
                        marginLayoutParams.t = obtainStyledAttributes.getInt(index, -1);
                        break;
                    }
                case 20:
                    int resourceId14 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.u);
                    marginLayoutParams.u = resourceId14;
                    if (resourceId14 != -1) {
                        break;
                    } else {
                        marginLayoutParams.u = obtainStyledAttributes.getInt(index, -1);
                        break;
                    }
                case 21:
                    marginLayoutParams.v = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.v);
                    break;
                case 22:
                    marginLayoutParams.w = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.w);
                    break;
                case 23:
                    marginLayoutParams.x = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.x);
                    break;
                case 24:
                    marginLayoutParams.y = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.y);
                    break;
                case 25:
                    marginLayoutParams.z = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.z);
                    break;
                case 26:
                    marginLayoutParams.A = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.A);
                    break;
                case 27:
                    marginLayoutParams.V = obtainStyledAttributes.getBoolean(index, marginLayoutParams.V);
                    break;
                case 28:
                    marginLayoutParams.W = obtainStyledAttributes.getBoolean(index, marginLayoutParams.W);
                    break;
                case 29:
                    marginLayoutParams.D = obtainStyledAttributes.getFloat(index, marginLayoutParams.D);
                    break;
                case 30:
                    marginLayoutParams.E = obtainStyledAttributes.getFloat(index, marginLayoutParams.E);
                    break;
                case 31:
                    int i3 = obtainStyledAttributes.getInt(index, 0);
                    marginLayoutParams.K = i3;
                    if (i3 != 1) {
                        break;
                    } else {
                        Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                        break;
                    }
                case 32:
                    int i4 = obtainStyledAttributes.getInt(index, 0);
                    marginLayoutParams.L = i4;
                    if (i4 != 1) {
                        break;
                    } else {
                        Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                        break;
                    }
                case 33:
                    try {
                        marginLayoutParams.M = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.M);
                        break;
                    } catch (Exception unused) {
                        if (obtainStyledAttributes.getInt(index, marginLayoutParams.M) != -2) {
                            break;
                        } else {
                            marginLayoutParams.M = -2;
                            break;
                        }
                    }
                case 34:
                    try {
                        marginLayoutParams.O = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.O);
                        break;
                    } catch (Exception unused2) {
                        if (obtainStyledAttributes.getInt(index, marginLayoutParams.O) != -2) {
                            break;
                        } else {
                            marginLayoutParams.O = -2;
                            break;
                        }
                    }
                case 35:
                    marginLayoutParams.Q = Math.max(0.0f, obtainStyledAttributes.getFloat(index, marginLayoutParams.Q));
                    marginLayoutParams.K = 2;
                    break;
                case 36:
                    try {
                        marginLayoutParams.N = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.N);
                        break;
                    } catch (Exception unused3) {
                        if (obtainStyledAttributes.getInt(index, marginLayoutParams.N) != -2) {
                            break;
                        } else {
                            marginLayoutParams.N = -2;
                            break;
                        }
                    }
                case 37:
                    try {
                        marginLayoutParams.P = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.P);
                        break;
                    } catch (Exception unused4) {
                        if (obtainStyledAttributes.getInt(index, marginLayoutParams.P) != -2) {
                            break;
                        } else {
                            marginLayoutParams.P = -2;
                            break;
                        }
                    }
                case 38:
                    marginLayoutParams.R = Math.max(0.0f, obtainStyledAttributes.getFloat(index, marginLayoutParams.R));
                    marginLayoutParams.L = 2;
                    break;
                default:
                    switch (i2) {
                        case 44:
                            w21.h(marginLayoutParams, obtainStyledAttributes.getString(index));
                            break;
                        case 45:
                            marginLayoutParams.G = obtainStyledAttributes.getFloat(index, marginLayoutParams.G);
                            break;
                        case 46:
                            marginLayoutParams.H = obtainStyledAttributes.getFloat(index, marginLayoutParams.H);
                            break;
                        case 47:
                            marginLayoutParams.I = obtainStyledAttributes.getInt(index, 0);
                            break;
                        case h75.h /*48*/:
                            marginLayoutParams.J = obtainStyledAttributes.getInt(index, 0);
                            break;
                        case 49:
                            marginLayoutParams.S = obtainStyledAttributes.getDimensionPixelOffset(index, marginLayoutParams.S);
                            break;
                        case 50:
                            marginLayoutParams.T = obtainStyledAttributes.getDimensionPixelOffset(index, marginLayoutParams.T);
                            break;
                        case 51:
                            marginLayoutParams.X = obtainStyledAttributes.getString(index);
                            break;
                        case 52:
                            int resourceId15 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.m);
                            marginLayoutParams.m = resourceId15;
                            if (resourceId15 != -1) {
                                break;
                            } else {
                                marginLayoutParams.m = obtainStyledAttributes.getInt(index, -1);
                                break;
                            }
                        case 53:
                            int resourceId16 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.n);
                            marginLayoutParams.n = resourceId16;
                            if (resourceId16 != -1) {
                                break;
                            } else {
                                marginLayoutParams.n = obtainStyledAttributes.getInt(index, -1);
                                break;
                            }
                        case 54:
                            marginLayoutParams.C = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.C);
                            break;
                        case 55:
                            marginLayoutParams.B = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.B);
                            break;
                        default:
                            switch (i2) {
                                case 64:
                                    w21.g(marginLayoutParams, obtainStyledAttributes, index, 0);
                                    break;
                                case 65:
                                    w21.g(marginLayoutParams, obtainStyledAttributes, index, 1);
                                    break;
                                case 66:
                                    marginLayoutParams.Y = obtainStyledAttributes.getInt(index, marginLayoutParams.Y);
                                    break;
                            }
                    }
            }
        }
        obtainStyledAttributes.recycle();
        marginLayoutParams.a();
        return marginLayoutParams;
    }

    public int getMaxHeight() {
        return this.C;
    }

    public int getMaxWidth() {
        return this.B;
    }

    public int getMinHeight() {
        return this.A;
    }

    public int getMinWidth() {
        return this.z;
    }

    public int getOptimizationLevel() {
        return this.y.C0;
    }

    public final g31 h(View view) {
        if (view == this) {
            return this.y;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof m21) {
            return ((m21) view.getLayoutParams()).o0;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof m21) {
            return ((m21) view.getLayoutParams()).o0;
        }
        return null;
    }

    public final void i(AttributeSet attributeSet, int i) {
        h31 h31 = this.y;
        h31.e0 = this;
        n21 n21 = this.K;
        h31.t0 = n21;
        h31.r0.h = n21;
        this.w.put(getId(), this);
        this.F = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, jv5.b, i, 0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == 16) {
                    this.z = obtainStyledAttributes.getDimensionPixelOffset(index, this.z);
                } else if (index == 17) {
                    this.A = obtainStyledAttributes.getDimensionPixelOffset(index, this.A);
                } else if (index == 14) {
                    this.B = obtainStyledAttributes.getDimensionPixelOffset(index, this.B);
                } else if (index == 15) {
                    this.C = obtainStyledAttributes.getDimensionPixelOffset(index, this.C);
                } else if (index == 112) {
                    this.E = obtainStyledAttributes.getInt(index, this.E);
                } else if (index == 55) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            j(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.G = null;
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        w21 w21 = new w21();
                        this.F = w21;
                        w21.e(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.F = null;
                    }
                    this.H = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        h31.C0 = this.E;
        x64.p = h31.R(512);
    }

    public final void j(int i) {
        String str;
        Context context = getContext();
        jz0 jz0 = new jz0(2, false);
        jz0.x = new SparseArray();
        jz0.y = new SparseArray();
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            o21 o21 = null;
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                jz0.R(context, xml);
                                break;
                            } else {
                                continue;
                            }
                        case 80204913:
                            if (name.equals("State")) {
                                o21 = new o21(context, xml);
                                ((SparseArray) jz0.x).put(o21.w, o21);
                                break;
                            } else {
                                continue;
                            }
                        case 1382829617:
                            str = "StateSet";
                            break;
                        case 1657696882:
                            str = "layoutDescription";
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                p21 p21 = new p21(context, xml);
                                if (o21 == null) {
                                    break;
                                } else {
                                    ((ArrayList) o21.y).add(p21);
                                    break;
                                }
                            } else {
                                continue;
                            }
                        default:
                            continue;
                    }
                    boolean equals = name.equals(str);
                }
            }
        } catch (XmlPullParserException e) {
            e.printStackTrace();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
        this.G = jz0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x01e5  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x030c  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x030e  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x0351  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x036e  */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x0445  */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x0451 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x0452  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:386:0x039d A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0166  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x016b  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01da A[ADDED_TO_REGION] */
    public final void k(h31 h31, int i, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int n;
        int i7;
        char c;
        int i8;
        int i9;
        boolean I2;
        boolean z2;
        int i10;
        boolean z3;
        int i11;
        boolean z4;
        boolean z5;
        n21 n21;
        boolean z6;
        boolean z7;
        int i12;
        boolean z8;
        boolean z9;
        n21 n212;
        int i13;
        int i14;
        boolean z10;
        boolean z11;
        boolean z12;
        n21 n213;
        boolean z13;
        int i15;
        boolean z14;
        n23 n23;
        p48 p48;
        int i16;
        boolean z15;
        boolean z16;
        int i17;
        boolean z17;
        int i18;
        int i19;
        int i20;
        int i21;
        boolean z18;
        Iterator it;
        Iterator it2;
        boolean z19;
        boolean z20;
        boolean z21;
        int i22;
        int max;
        int max2;
        h31 h312 = h31;
        int i23 = i;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        int max3 = Math.max(0, getPaddingTop());
        int max4 = Math.max(0, getPaddingBottom());
        int i24 = max3 + max4;
        int paddingWidth = getPaddingWidth();
        n21 n214 = this.K;
        n214.b = max3;
        n214.c = max4;
        n214.d = paddingWidth;
        n214.e = i24;
        n214.f = i2;
        n214.g = i3;
        int max5 = Math.max(0, getPaddingStart());
        int max6 = Math.max(0, getPaddingEnd());
        int i25 = 1;
        if (max5 <= 0 && max6 <= 0) {
            max5 = Math.max(0, getPaddingLeft());
        } else if ((getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection()) {
            max5 = max6;
        }
        int i26 = size - paddingWidth;
        int i27 = size2 - i24;
        int i28 = n214.e;
        int i29 = n214.d;
        int childCount = getChildCount();
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode != 1073741824) {
                    i4 = 0;
                } else {
                    i4 = Math.min(this.B - i29, i26);
                    i25 = 1;
                }
                if (mode2 == Integer.MIN_VALUE) {
                    if (mode2 != 0) {
                        if (mode2 != 1073741824) {
                            i5 = 0;
                        } else {
                            i5 = Math.min(this.C - i28, i27);
                        }
                        i6 = 1;
                        n = h312.n();
                        dq1 dq1 = h312.r0;
                        int i30 = i28;
                        int[] iArr = h312.B;
                        i7 = i4;
                        if (i7 == n && i5 == h312.k()) {
                            c = 1;
                        } else {
                            dq1.c = true;
                            c = 1;
                        }
                        h312.X = 0;
                        h312.Y = 0;
                        iArr[0] = this.B - i29;
                        iArr[c] = this.C - i30;
                        h312.a0 = 0;
                        h312.b0 = 0;
                        h312.H(i25);
                        h312.J(i7);
                        h312.I(i6);
                        h312.G(i5);
                        i8 = this.z - i29;
                        if (i8 < 0) {
                            h312.a0 = 0;
                        } else {
                            h312.a0 = i8;
                        }
                        i9 = this.A - i30;
                        if (i9 < 0) {
                            h312.b0 = 0;
                        } else {
                            h312.b0 = i9;
                        }
                        h312.w0 = max5;
                        h312.x0 = max3;
                        wr0 wr0 = h312.q0;
                        h31 h313 = (h31) wr0.z;
                        ArrayList arrayList = (ArrayList) wr0.x;
                        n21 n215 = h312.t0;
                        int size3 = h312.p0.size();
                        int n2 = h312.n();
                        int k = h312.k();
                        I2 = rc9.I(i23, 128);
                        if (I2 || rc9.I(i23, 64)) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z2) {
                            int i31 = 0;
                            while (true) {
                                if (i31 >= size3) {
                                    break;
                                }
                                boolean z22 = z2;
                                g31 g31 = (g31) h312.p0.get(i31);
                                i10 = size3;
                                int[] iArr2 = g31.o0;
                                int i32 = i31;
                                if (iArr2[0] == 3) {
                                    z19 = true;
                                } else {
                                    z19 = false;
                                }
                                if (iArr2[1] == 3) {
                                    z20 = true;
                                } else {
                                    z20 = false;
                                }
                                if (!z19 || !z20 || g31.V <= 0.0f) {
                                    z21 = false;
                                } else {
                                    z21 = true;
                                }
                                if ((!g31.u() || !z21) && ((!g31.v() || !z21) && !(g31 instanceof ei2) && !g31.u() && !g31.v())) {
                                    i31 = i32 + 1;
                                    z2 = z22;
                                    size3 = i10;
                                }
                            }
                            i11 = 1073741824;
                            z3 = false;
                            if ((mode == i11 || mode2 != i11) && !I2) {
                                z4 = false;
                            } else {
                                z4 = true;
                            }
                            z5 = z3 & z4;
                            if (!z5) {
                                int min = Math.min(iArr[0], i26);
                                int min2 = Math.min(iArr[1], i27);
                                int i33 = 1073741824;
                                if (mode == 1073741824) {
                                    if (h312.n() != min) {
                                        h312.J(min);
                                        dq1.b = true;
                                    }
                                    i33 = 1073741824;
                                }
                                if (mode2 == i33 && h312.k() != min2) {
                                    h312.G(min2);
                                    dq1.b = true;
                                }
                                if (mode == i33 && mode2 == i33) {
                                    ArrayList arrayList2 = (ArrayList) dq1.f;
                                    h31 h314 = (h31) dq1.d;
                                    if (dq1.b || dq1.c) {
                                        Iterator it3 = h314.p0.iterator();
                                        while (it3.hasNext()) {
                                            g31 g312 = (g31) it3.next();
                                            g312.h();
                                            g312.a = false;
                                            g312.d.n();
                                            g312.e.m();
                                            z5 = z5;
                                        }
                                        z6 = z5;
                                        h314.h();
                                        i18 = 0;
                                        h314.a = false;
                                        h314.d.n();
                                        h314.e.m();
                                        dq1.c = false;
                                    } else {
                                        z6 = z5;
                                        i18 = 0;
                                    }
                                    dq1.c((h31) dq1.e);
                                    h314.X = i18;
                                    int[] iArr3 = h314.o0;
                                    h314.Y = i18;
                                    int j = h314.j(i18);
                                    int[] iArr4 = iArr3;
                                    int j2 = h314.j(1);
                                    if (dq1.b) {
                                        dq1.d();
                                    }
                                    int o = h314.o();
                                    ArrayList arrayList3 = arrayList2;
                                    int p = h314.p();
                                    n21 = n215;
                                    h314.d.h.d(o);
                                    h314.e.h.d(p);
                                    dq1.i();
                                    if (j == 2 || j2 == 2) {
                                        if (I2) {
                                            Iterator it4 = arrayList3.iterator();
                                            while (true) {
                                                if (it4.hasNext()) {
                                                    if (!((h98) it4.next()).k()) {
                                                        I2 = false;
                                                        break;
                                                    }
                                                } else {
                                                    break;
                                                }
                                            }
                                        }
                                        if (!I2 || j != 2) {
                                            i19 = p;
                                        } else {
                                            h314.H(1);
                                            i19 = p;
                                            h314.J(dq1.e(h314, 0));
                                            h314.d.e.d(h314.n());
                                        }
                                        if (I2 && j2 == 2) {
                                            i20 = 1;
                                            h314.I(1);
                                            h314.G(dq1.e(h314, 1));
                                            h314.e.e.d(h314.k());
                                            i21 = iArr4[0];
                                            if (i21 == i20 || i21 == 4) {
                                                int n3 = h314.n() + o;
                                                h314.d.i.d(n3);
                                                h314.d.e.d(n3 - o);
                                                dq1.i();
                                                int i34 = iArr4[1];
                                                if (i34 == 1 || i34 == 4) {
                                                    int k2 = h314.k() + i19;
                                                    h314.e.i.d(k2);
                                                    h314.e.e.d(k2 - i19);
                                                }
                                                dq1.i();
                                                z18 = true;
                                            } else {
                                                z18 = false;
                                            }
                                            it = arrayList3.iterator();
                                            while (it.hasNext()) {
                                                h98 h98 = (h98) it.next();
                                                if (h98.b != h314 || h98.g) {
                                                    h98.e();
                                                }
                                            }
                                            it2 = arrayList3.iterator();
                                            while (true) {
                                                if (it2.hasNext()) {
                                                    z7 = true;
                                                    break;
                                                }
                                                h98 h982 = (h98) it2.next();
                                                if ((z18 || h982.b != h314) && (!h982.h.j || ((!h982.i.j && !(h982 instanceof ay2)) || (!h982.e.j && !(h982 instanceof um0) && !(h982 instanceof ay2))))) {
                                                    z7 = false;
                                                }
                                            }
                                            z7 = false;
                                            h314.H(j);
                                            h314.I(j2);
                                            i12 = 2;
                                            i16 = 1073741824;
                                        }
                                    } else {
                                        i19 = p;
                                    }
                                    i20 = 1;
                                    i21 = iArr4[0];
                                    if (i21 == i20 || i21 == 4) {
                                    }
                                    it = arrayList3.iterator();
                                    while (it.hasNext()) {
                                    }
                                    it2 = arrayList3.iterator();
                                    while (true) {
                                        if (it2.hasNext()) {
                                        }
                                    }
                                    z7 = false;
                                    h314.H(j);
                                    h314.I(j2);
                                    i12 = 2;
                                    i16 = 1073741824;
                                } else {
                                    z6 = z5;
                                    n21 = n215;
                                    h31 h315 = (h31) dq1.d;
                                    if (dq1.b) {
                                        Iterator it5 = h315.p0.iterator();
                                        while (it5.hasNext()) {
                                            g31 g313 = (g31) it5.next();
                                            g313.h();
                                            g313.a = false;
                                            n23 n232 = g313.d;
                                            n232.e.j = false;
                                            n232.g = false;
                                            n232.n();
                                            p48 p482 = g313.e;
                                            p482.e.j = false;
                                            p482.g = false;
                                            p482.m();
                                        }
                                        i17 = 0;
                                        h315.h();
                                        h315.a = false;
                                        n23 n233 = h315.d;
                                        n233.e.j = false;
                                        n233.g = false;
                                        n233.n();
                                        p48 p483 = h315.e;
                                        p483.e.j = false;
                                        p483.g = false;
                                        p483.m();
                                        dq1.d();
                                    } else {
                                        i17 = 0;
                                    }
                                    dq1.c((h31) dq1.e);
                                    h315.X = i17;
                                    h315.Y = i17;
                                    h315.d.h.d(i17);
                                    h315.e.h.d(i17);
                                    i16 = 1073741824;
                                    if (mode == 1073741824) {
                                        z17 = h312.O(i17, I2);
                                        i12 = 1;
                                    } else {
                                        i12 = 0;
                                        z17 = true;
                                    }
                                    if (mode2 == 1073741824) {
                                        z7 &= h312.O(1, I2);
                                        i12++;
                                    }
                                }
                                if (z7) {
                                    if (mode == i16) {
                                        z15 = true;
                                    } else {
                                        z15 = false;
                                    }
                                    if (mode2 == i16) {
                                        z16 = true;
                                    } else {
                                        z16 = false;
                                    }
                                    h312.K(z15, z16);
                                }
                            } else {
                                z6 = z5;
                                n21 = n215;
                                i12 = 0;
                                z7 = false;
                            }
                            if (!z7 || i12 != 2) {
                                int i35 = h312.C0;
                                if (i10 > 0) {
                                    int size4 = h312.p0.size();
                                    boolean R = h312.R(64);
                                    n21 n216 = h312.t0;
                                    int i36 = 0;
                                    while (i36 < size4) {
                                        g31 g314 = (g31) h312.p0.get(i36);
                                        if (!(g314 instanceof zx2) && !(g314 instanceof j50) && !g314.E && (!R || (n23 = g314.d) == null || (p48 = g314.e) == null || !n23.e.j || !p48.e.j)) {
                                            int j3 = g314.j(0);
                                            int j4 = g314.j(1);
                                            i15 = size4;
                                            if (j3 != 3 || g314.q == 1 || j4 != 3 || g314.r == 1) {
                                                z14 = false;
                                            } else {
                                                z14 = true;
                                            }
                                            if (!z14 && h312.R(1) && !(g314 instanceof ei2)) {
                                                if (j3 == 3 && g314.q == 0 && j4 != 3 && !g314.u()) {
                                                    z14 = true;
                                                }
                                                if (j4 == 3 && g314.r == 0 && j3 != 3 && !g314.u()) {
                                                    z14 = true;
                                                }
                                                if ((j3 == 3 || j4 == 3) && g314.V > 0.0f) {
                                                    z14 = true;
                                                }
                                            }
                                            if (!z14) {
                                                wr0.U(0, n216, g314);
                                            }
                                        } else {
                                            i15 = size4;
                                        }
                                        i36++;
                                        size4 = i15;
                                    }
                                    ConstraintLayout constraintLayout = n216.a;
                                    int childCount2 = constraintLayout.getChildCount();
                                    ArrayList arrayList4 = constraintLayout.x;
                                    for (int i37 = 0; i37 < childCount2; i37++) {
                                        constraintLayout.getChildAt(i37);
                                    }
                                    int size5 = arrayList4.size();
                                    if (size5 > 0) {
                                        for (int i38 = 0; i38 < size5; i38++) {
                                            ((k21) arrayList4.get(i38)).getClass();
                                        }
                                    }
                                }
                                wr0.j0(h312);
                                int size6 = arrayList.size();
                                if (i10 > 0) {
                                    wr0.f0(h312, 0, n2, k);
                                }
                                if (size6 > 0) {
                                    int[] iArr5 = h312.o0;
                                    if (iArr5[0] == 2) {
                                        z8 = true;
                                    } else {
                                        z8 = false;
                                    }
                                    if (iArr5[1] == 2) {
                                        z9 = true;
                                    } else {
                                        z9 = false;
                                    }
                                    int max7 = Math.max(h312.n(), h313.a0);
                                    int max8 = Math.max(h312.k(), h313.b0);
                                    int i39 = 0;
                                    boolean z23 = false;
                                    while (i39 < size6) {
                                        g31 g315 = (g31) arrayList.get(i39);
                                        if (!(g315 instanceof ei2)) {
                                            z11 = z9;
                                            z12 = z8;
                                            n213 = n21;
                                        } else {
                                            int n4 = g315.n();
                                            int k3 = g315.k();
                                            z11 = z9;
                                            z12 = z8;
                                            n213 = n21;
                                            boolean U = z23 | wr0.U(1, n213, g315);
                                            int n5 = g315.n();
                                            boolean z24 = U;
                                            int k4 = g315.k();
                                            if (n5 != n4) {
                                                g315.J(n5);
                                                if (z12 && g315.o() + g315.T > max7) {
                                                    max7 = Math.max(max7, g315.i(4).e() + g315.o() + g315.T);
                                                }
                                                z13 = true;
                                            } else {
                                                z13 = z24;
                                            }
                                            if (k4 != k3) {
                                                g315.G(k4);
                                                if (z11 && g315.p() + g315.U > max8) {
                                                    max8 = Math.max(max8, g315.i(5).e() + g315.p() + g315.U);
                                                }
                                                z13 = true;
                                            }
                                            z23 = ((ei2) g315).x0 | z13;
                                        }
                                        i39++;
                                        n21 = n213;
                                        z8 = z12;
                                        z9 = z11;
                                    }
                                    boolean z25 = z9;
                                    boolean z26 = z8;
                                    int i40 = 0;
                                    while (true) {
                                        n21 n217 = n21;
                                        if (i40 >= 2) {
                                            break;
                                        }
                                        int i41 = 0;
                                        while (i41 < size6) {
                                            g31 g316 = (g31) arrayList.get(i41);
                                            if ((!(g316 instanceof pz2) || (g316 instanceof ei2)) && !(g316 instanceof zx2) && g316.f0 != 8 && ((!z6 || !g316.d.e.j || !g316.e.e.j) && !(g316 instanceof ei2))) {
                                                int n6 = g316.n();
                                                int k5 = g316.k();
                                                i14 = size6;
                                                int i42 = g316.Z;
                                                i13 = i41;
                                                int i43 = 1;
                                                if (i40 == 1) {
                                                    i43 = 2;
                                                }
                                                z10 = wr0.U(i43, n217, g316) | z23;
                                                int n7 = g316.n();
                                                n212 = n217;
                                                int k6 = g316.k();
                                                if (n7 != n6) {
                                                    g316.J(n7);
                                                    if (z26 && g316.o() + g316.T > max7) {
                                                        max7 = Math.max(max7, g316.i(4).e() + g316.o() + g316.T);
                                                    }
                                                    z10 = true;
                                                }
                                                if (k6 != k5) {
                                                    g316.G(k6);
                                                    if (z25 && g316.p() + g316.U > max8) {
                                                        max8 = Math.max(max8, g316.i(5).e() + g316.p() + g316.U);
                                                    }
                                                    z10 = true;
                                                }
                                                if (g316.D && i42 != g316.Z) {
                                                    z10 = true;
                                                }
                                            } else {
                                                i14 = size6;
                                                n212 = n217;
                                                i13 = i41;
                                                z10 = z23;
                                            }
                                            z23 = z10;
                                            n217 = n212;
                                            i41 = i13 + 1;
                                            size6 = i14;
                                        }
                                        int i44 = size6;
                                        n21 = n217;
                                        if (!z23) {
                                            break;
                                        }
                                        i40++;
                                        wr0.f0(h312, i40, n2, k);
                                        size6 = i44;
                                        z23 = false;
                                    }
                                }
                                h312.C0 = i35;
                                x64.p = h312.R(512);
                                return;
                            }
                            return;
                        }
                        z3 = z2;
                        i10 = size3;
                        i11 = 1073741824;
                        if (mode == i11) {
                        }
                        z4 = false;
                        z5 = z3 & z4;
                        if (!z5) {
                        }
                        if (!z7 || i12 != 2) {
                        }
                    } else if (childCount == 0) {
                        max = Math.max(0, this.A);
                    } else {
                        i22 = 0;
                        i6 = 2;
                        n = h312.n();
                        dq1 dq12 = h312.r0;
                        int i302 = i28;
                        int[] iArr6 = h312.B;
                        i7 = i4;
                        if (i7 == n || i5 == h312.k()) {
                        }
                        h312.X = 0;
                        h312.Y = 0;
                        iArr6[0] = this.B - i29;
                        iArr6[c] = this.C - i302;
                        h312.a0 = 0;
                        h312.b0 = 0;
                        h312.H(i25);
                        h312.J(i7);
                        h312.I(i6);
                        h312.G(i5);
                        i8 = this.z - i29;
                        if (i8 < 0) {
                        }
                        i9 = this.A - i302;
                        if (i9 < 0) {
                        }
                        h312.w0 = max5;
                        h312.x0 = max3;
                        wr0 wr02 = h312.q0;
                        h31 h3132 = (h31) wr02.z;
                        ArrayList arrayList5 = (ArrayList) wr02.x;
                        n21 n2152 = h312.t0;
                        int size32 = h312.p0.size();
                        int n22 = h312.n();
                        int k7 = h312.k();
                        I2 = rc9.I(i23, 128);
                        if (I2 || rc9.I(i23, 64)) {
                        }
                        if (z2) {
                        }
                        z3 = z2;
                        i10 = size32;
                        i11 = 1073741824;
                        if (mode == i11) {
                        }
                        z4 = false;
                        z5 = z3 & z4;
                        if (!z5) {
                        }
                        if (!z7 || i12 != 2) {
                        }
                    }
                } else if (childCount == 0) {
                    max = Math.max(0, this.A);
                } else {
                    i22 = i27;
                    i6 = 2;
                    n = h312.n();
                    dq1 dq122 = h312.r0;
                    int i3022 = i28;
                    int[] iArr62 = h312.B;
                    i7 = i4;
                    if (i7 == n || i5 == h312.k()) {
                    }
                    h312.X = 0;
                    h312.Y = 0;
                    iArr62[0] = this.B - i29;
                    iArr62[c] = this.C - i3022;
                    h312.a0 = 0;
                    h312.b0 = 0;
                    h312.H(i25);
                    h312.J(i7);
                    h312.I(i6);
                    h312.G(i5);
                    i8 = this.z - i29;
                    if (i8 < 0) {
                    }
                    i9 = this.A - i3022;
                    if (i9 < 0) {
                    }
                    h312.w0 = max5;
                    h312.x0 = max3;
                    wr0 wr022 = h312.q0;
                    h31 h31322 = (h31) wr022.z;
                    ArrayList arrayList52 = (ArrayList) wr022.x;
                    n21 n21522 = h312.t0;
                    int size322 = h312.p0.size();
                    int n222 = h312.n();
                    int k72 = h312.k();
                    I2 = rc9.I(i23, 128);
                    if (I2 || rc9.I(i23, 64)) {
                    }
                    if (z2) {
                    }
                    z3 = z2;
                    i10 = size322;
                    i11 = 1073741824;
                    if (mode == i11) {
                    }
                    z4 = false;
                    z5 = z3 & z4;
                    if (!z5) {
                    }
                    if (!z7 || i12 != 2) {
                    }
                }
                i22 = max;
                i6 = 2;
                n = h312.n();
                dq1 dq1222 = h312.r0;
                int i30222 = i28;
                int[] iArr622 = h312.B;
                i7 = i4;
                if (i7 == n || i5 == h312.k()) {
                }
                h312.X = 0;
                h312.Y = 0;
                iArr622[0] = this.B - i29;
                iArr622[c] = this.C - i30222;
                h312.a0 = 0;
                h312.b0 = 0;
                h312.H(i25);
                h312.J(i7);
                h312.I(i6);
                h312.G(i5);
                i8 = this.z - i29;
                if (i8 < 0) {
                }
                i9 = this.A - i30222;
                if (i9 < 0) {
                }
                h312.w0 = max5;
                h312.x0 = max3;
                wr0 wr0222 = h312.q0;
                h31 h313222 = (h31) wr0222.z;
                ArrayList arrayList522 = (ArrayList) wr0222.x;
                n21 n215222 = h312.t0;
                int size3222 = h312.p0.size();
                int n2222 = h312.n();
                int k722 = h312.k();
                I2 = rc9.I(i23, 128);
                if (I2 || rc9.I(i23, 64)) {
                }
                if (z2) {
                }
                z3 = z2;
                i10 = size3222;
                i11 = 1073741824;
                if (mode == i11) {
                }
                z4 = false;
                z5 = z3 & z4;
                if (!z5) {
                }
                if (!z7 || i12 != 2) {
                }
            } else if (childCount == 0) {
                max2 = Math.max(0, this.z);
            } else {
                i4 = 0;
                i25 = 2;
                if (mode2 == Integer.MIN_VALUE) {
                }
                i22 = max;
                i6 = 2;
                n = h312.n();
                dq1 dq12222 = h312.r0;
                int i302222 = i28;
                int[] iArr6222 = h312.B;
                i7 = i4;
                if (i7 == n || i5 == h312.k()) {
                }
                h312.X = 0;
                h312.Y = 0;
                iArr6222[0] = this.B - i29;
                iArr6222[c] = this.C - i302222;
                h312.a0 = 0;
                h312.b0 = 0;
                h312.H(i25);
                h312.J(i7);
                h312.I(i6);
                h312.G(i5);
                i8 = this.z - i29;
                if (i8 < 0) {
                }
                i9 = this.A - i302222;
                if (i9 < 0) {
                }
                h312.w0 = max5;
                h312.x0 = max3;
                wr0 wr02222 = h312.q0;
                h31 h3132222 = (h31) wr02222.z;
                ArrayList arrayList5222 = (ArrayList) wr02222.x;
                n21 n2152222 = h312.t0;
                int size32222 = h312.p0.size();
                int n22222 = h312.n();
                int k7222 = h312.k();
                I2 = rc9.I(i23, 128);
                if (I2 || rc9.I(i23, 64)) {
                }
                if (z2) {
                }
                z3 = z2;
                i10 = size32222;
                i11 = 1073741824;
                if (mode == i11) {
                }
                z4 = false;
                z5 = z3 & z4;
                if (!z5) {
                }
                if (!z7 || i12 != 2) {
                }
            }
        } else if (childCount == 0) {
            max2 = Math.max(0, this.z);
        } else {
            i4 = i26;
            i25 = 2;
            if (mode2 == Integer.MIN_VALUE) {
            }
            i22 = max;
            i6 = 2;
            n = h312.n();
            dq1 dq122222 = h312.r0;
            int i3022222 = i28;
            int[] iArr62222 = h312.B;
            i7 = i4;
            if (i7 == n || i5 == h312.k()) {
            }
            h312.X = 0;
            h312.Y = 0;
            iArr62222[0] = this.B - i29;
            iArr62222[c] = this.C - i3022222;
            h312.a0 = 0;
            h312.b0 = 0;
            h312.H(i25);
            h312.J(i7);
            h312.I(i6);
            h312.G(i5);
            i8 = this.z - i29;
            if (i8 < 0) {
            }
            i9 = this.A - i3022222;
            if (i9 < 0) {
            }
            h312.w0 = max5;
            h312.x0 = max3;
            wr0 wr022222 = h312.q0;
            h31 h31322222 = (h31) wr022222.z;
            ArrayList arrayList52222 = (ArrayList) wr022222.x;
            n21 n21522222 = h312.t0;
            int size322222 = h312.p0.size();
            int n222222 = h312.n();
            int k72222 = h312.k();
            I2 = rc9.I(i23, 128);
            if (I2 || rc9.I(i23, 64)) {
            }
            if (z2) {
            }
            z3 = z2;
            i10 = size322222;
            i11 = 1073741824;
            if (mode == i11) {
            }
            z4 = false;
            z5 = z3 & z4;
            if (!z5) {
            }
            if (!z7 || i12 != 2) {
            }
        }
        i4 = max2;
        i25 = 2;
        if (mode2 == Integer.MIN_VALUE) {
        }
        i22 = max;
        i6 = 2;
        n = h312.n();
        dq1 dq1222222 = h312.r0;
        int i30222222 = i28;
        int[] iArr622222 = h312.B;
        i7 = i4;
        if (i7 == n || i5 == h312.k()) {
        }
        h312.X = 0;
        h312.Y = 0;
        iArr622222[0] = this.B - i29;
        iArr622222[c] = this.C - i30222222;
        h312.a0 = 0;
        h312.b0 = 0;
        h312.H(i25);
        h312.J(i7);
        h312.I(i6);
        h312.G(i5);
        i8 = this.z - i29;
        if (i8 < 0) {
        }
        i9 = this.A - i30222222;
        if (i9 < 0) {
        }
        h312.w0 = max5;
        h312.x0 = max3;
        wr0 wr0222222 = h312.q0;
        h31 h313222222 = (h31) wr0222222.z;
        ArrayList arrayList522222 = (ArrayList) wr0222222.x;
        n21 n215222222 = h312.t0;
        int size3222222 = h312.p0.size();
        int n2222222 = h312.n();
        int k722222 = h312.k();
        I2 = rc9.I(i23, 128);
        if (I2 || rc9.I(i23, 64)) {
        }
        if (z2) {
        }
        z3 = z2;
        i10 = size3222222;
        i11 = 1073741824;
        if (mode == i11) {
        }
        z4 = false;
        z5 = z3 & z4;
        if (!z5) {
        }
        if (!z7 || i12 != 2) {
        }
    }

    public final void l(g31 g31, m21 m21, SparseArray sparseArray, int i, int i2) {
        View view = (View) this.w.get(i);
        g31 g312 = (g31) sparseArray.get(i);
        if (g312 != null && view != null && (view.getLayoutParams() instanceof m21)) {
            m21.b0 = true;
            if (i2 == 6) {
                m21 m212 = (m21) view.getLayoutParams();
                m212.b0 = true;
                m212.o0.D = true;
            }
            g31.i(6).b(g312.i(i2), m21.C, m21.B, true);
            g31.D = true;
            g31.i(3).j();
            g31.i(5).j();
        }
    }

    public void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            m21 m21 = (m21) childAt.getLayoutParams();
            g31 g31 = m21.o0;
            if (childAt.getVisibility() != 8 || m21.c0 || m21.d0 || isInEditMode) {
                int o = g31.o();
                int p = g31.p();
                childAt.layout(o, p, g31.n() + o, g31.k() + p);
            }
        }
        ArrayList arrayList = this.x;
        int size = arrayList.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                ((k21) arrayList.get(i6)).getClass();
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v36, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v9, resolved type: android.view.View} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x033c  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0354  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x0372  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x0394  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x03bf  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x03dc  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x03fe  */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x0409  */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x0427  */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x042f  */
    /* JADX WARNING: Removed duplicated region for block: B:293:0x055a  */
    public void onMeasure(int i, int i2) {
        boolean z2;
        boolean z3;
        boolean z4;
        int i3;
        int i4;
        int i5;
        int i6;
        m21 m21;
        g31 g31;
        int i7;
        int i8;
        int i9;
        float f;
        int i10;
        int i11;
        int i12;
        g31 g312;
        g31 g313;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        g31 g314;
        int i19;
        float f2;
        g31 g315;
        int i20;
        int i21;
        g31 g316;
        char c;
        ArrayList arrayList;
        SparseArray sparseArray;
        ArrayList arrayList2;
        SparseArray sparseArray2;
        String str;
        int f3;
        int i22;
        g31 g317;
        String str2;
        ConstraintLayout constraintLayout = this;
        int i23 = i;
        int i24 = i2;
        if (constraintLayout.L == i23) {
            int i25 = constraintLayout.M;
        }
        int i26 = 1;
        int i27 = 0;
        if (!constraintLayout.D) {
            int childCount = constraintLayout.getChildCount();
            int i28 = 0;
            while (true) {
                if (i28 >= childCount) {
                    break;
                } else if (constraintLayout.getChildAt(i28).isLayoutRequested()) {
                    constraintLayout.D = true;
                    break;
                } else {
                    i28++;
                }
            }
        }
        constraintLayout.L = i23;
        constraintLayout.M = i24;
        if ((constraintLayout.getContext().getApplicationInfo().flags & 4194304) == 0 || 1 != constraintLayout.getLayoutDirection()) {
            z2 = false;
        } else {
            z2 = true;
        }
        h31 h31 = constraintLayout.y;
        h31.u0 = z2;
        if (constraintLayout.D) {
            constraintLayout.D = false;
            int childCount2 = constraintLayout.getChildCount();
            int i29 = 0;
            while (true) {
                if (i29 >= childCount2) {
                    z3 = false;
                    break;
                } else if (constraintLayout.getChildAt(i29).isLayoutRequested()) {
                    z3 = true;
                    break;
                } else {
                    i29++;
                }
            }
            if (z3) {
                boolean isInEditMode = constraintLayout.isInEditMode();
                int childCount3 = constraintLayout.getChildCount();
                for (int i30 = 0; i30 < childCount3; i30++) {
                    g31 h = constraintLayout.h(constraintLayout.getChildAt(i30));
                    if (h != null) {
                        h.z();
                    }
                }
                SparseArray sparseArray3 = constraintLayout.w;
                if (isInEditMode) {
                    int i31 = 0;
                    while (i31 < childCount3) {
                        View childAt = constraintLayout.getChildAt(i31);
                        try {
                            String resourceName = constraintLayout.getResources().getResourceName(childAt.getId());
                            Integer valueOf = Integer.valueOf(childAt.getId());
                            if (resourceName != null) {
                                i22 = i26;
                                try {
                                    if (constraintLayout.I == null) {
                                        constraintLayout.I = new HashMap();
                                    }
                                    int indexOf = resourceName.indexOf("/");
                                    if (indexOf != -1) {
                                        str2 = resourceName.substring(indexOf + 1);
                                    } else {
                                        str2 = resourceName;
                                    }
                                    constraintLayout.I.put(str2, valueOf);
                                } catch (Resources.NotFoundException unused) {
                                }
                            } else {
                                i22 = i26;
                            }
                            int indexOf2 = resourceName.indexOf(47);
                            if (indexOf2 != -1) {
                                resourceName = resourceName.substring(indexOf2 + 1);
                            }
                            int id = childAt.getId();
                            if (id != 0) {
                                View view = (View) sparseArray3.get(id);
                                if (view == null && (view = constraintLayout.findViewById(id)) != null && view != constraintLayout && view.getParent() == constraintLayout) {
                                    constraintLayout.onViewAdded(view);
                                }
                                if (view != constraintLayout) {
                                    if (view == null) {
                                        g317 = null;
                                    } else {
                                        g317 = ((m21) view.getLayoutParams()).o0;
                                    }
                                    g317.g0 = resourceName;
                                    i31++;
                                    i26 = i22;
                                }
                            }
                            g317 = h31;
                            g317.g0 = resourceName;
                        } catch (Resources.NotFoundException unused2) {
                            i22 = i26;
                        }
                        i31++;
                        i26 = i22;
                    }
                }
                int i32 = i26;
                if (constraintLayout.H != -1) {
                    for (int i33 = 0; i33 < childCount3; i33++) {
                        constraintLayout.getChildAt(i33).getId();
                    }
                }
                w21 w21 = constraintLayout.F;
                if (w21 != null) {
                    w21.a(constraintLayout);
                }
                h31.p0.clear();
                ArrayList arrayList3 = constraintLayout.x;
                int size = arrayList3.size();
                if (size > 0) {
                    int i34 = 0;
                    while (i34 < size) {
                        k21 k21 = (k21) arrayList3.get(i34);
                        HashMap hashMap = k21.C;
                        if (k21.isInEditMode()) {
                            k21.setIds(k21.A);
                        }
                        pz2 pz2 = k21.z;
                        if (pz2 == null) {
                            sparseArray = sparseArray3;
                            arrayList = arrayList3;
                        } else {
                            pz2.q0 = i27;
                            Arrays.fill(pz2.p0, (Object) null);
                            int i35 = i27;
                            while (i35 < k21.x) {
                                int i36 = k21.w[i35];
                                View view2 = (View) sparseArray3.get(i36);
                                if (view2 != null || (f3 = k21.f(constraintLayout, str)) == 0) {
                                    arrayList2 = arrayList3;
                                } else {
                                    arrayList2 = arrayList3;
                                    k21.w[i35] = f3;
                                    hashMap.put(Integer.valueOf(f3), (str = (String) hashMap.get(Integer.valueOf(i36))));
                                    view2 = sparseArray3.get(f3);
                                }
                                View view3 = view2;
                                if (view3 != null) {
                                    pz2 pz22 = k21.z;
                                    g31 h2 = constraintLayout.h(view3);
                                    pz22.getClass();
                                    if (!(h2 == pz22 || h2 == null)) {
                                        int i37 = pz22.q0 + 1;
                                        sparseArray2 = sparseArray3;
                                        g31[] g31Arr = pz22.p0;
                                        g31 g318 = h2;
                                        if (i37 > g31Arr.length) {
                                            pz22.p0 = (g31[]) Arrays.copyOf(g31Arr, g31Arr.length * 2);
                                        }
                                        g31[] g31Arr2 = pz22.p0;
                                        int i38 = pz22.q0;
                                        g31Arr2[i38] = g318;
                                        pz22.q0 = i38 + 1;
                                        i35++;
                                        sparseArray3 = sparseArray2;
                                        arrayList3 = arrayList2;
                                    }
                                }
                                sparseArray2 = sparseArray3;
                                i35++;
                                sparseArray3 = sparseArray2;
                                arrayList3 = arrayList2;
                            }
                            sparseArray = sparseArray3;
                            arrayList = arrayList3;
                            k21.z.N();
                        }
                        i34++;
                        sparseArray3 = sparseArray;
                        arrayList3 = arrayList;
                        i27 = 0;
                    }
                }
                int i39 = 2;
                for (int i40 = 0; i40 < childCount3; i40++) {
                    constraintLayout.getChildAt(i40);
                }
                SparseArray sparseArray4 = constraintLayout.J;
                sparseArray4.clear();
                sparseArray4.put(0, h31);
                sparseArray4.put(constraintLayout.getId(), h31);
                for (int i41 = 0; i41 < childCount3; i41++) {
                    View childAt2 = constraintLayout.getChildAt(i41);
                    sparseArray4.put(childAt2.getId(), constraintLayout.h(childAt2));
                }
                int i42 = 0;
                while (i42 < childCount3) {
                    View childAt3 = constraintLayout.getChildAt(i42);
                    g31 h3 = constraintLayout.h(childAt3);
                    if (h3 != null) {
                        m21 m212 = (m21) childAt3.getLayoutParams();
                        h31.p0.add(h3);
                        g31 g319 = h3.S;
                        if (g319 != null) {
                            ((h31) g319).p0.remove(h3);
                            h3.z();
                        }
                        h3.S = h31;
                        m212.a();
                        h3.f0 = childAt3.getVisibility();
                        h3.e0 = childAt3;
                        if (childAt3 instanceof k21) {
                            ((k21) childAt3).h(h3, h31.u0);
                        }
                        if (m212.c0) {
                            zx2 zx2 = (zx2) h3;
                            int i43 = m212.l0;
                            int i44 = m212.m0;
                            float f4 = m212.n0;
                            int i45 = (f4 > -1.0f ? 1 : (f4 == -1.0f ? 0 : -1));
                            if (i45 == 0) {
                                c = 65535;
                                if (i43 != -1) {
                                    if (i43 > -1) {
                                        zx2.p0 = -1.0f;
                                        zx2.q0 = i43;
                                        zx2.r0 = -1;
                                    }
                                } else if (i44 != -1 && i44 > -1) {
                                    zx2.p0 = -1.0f;
                                    zx2.q0 = -1;
                                    zx2.r0 = i44;
                                }
                            } else if (i45 > 0) {
                                zx2.p0 = f4;
                                c = 65535;
                                zx2.q0 = -1;
                                zx2.r0 = -1;
                            }
                            char c2 = c;
                            i3 = i42;
                            z4 = z3;
                            i4 = i39;
                        } else {
                            int i46 = m212.e0;
                            int i47 = m212.f0;
                            int i48 = m212.g0;
                            int i49 = m212.h0;
                            int i50 = m212.i0;
                            int i51 = m212.j0;
                            i3 = i42;
                            float f5 = m212.k0;
                            int i52 = i51;
                            int i53 = m212.o;
                            z4 = z3;
                            if (i53 != -1) {
                                g31 g3110 = (g31) sparseArray4.get(i53);
                                if (g3110 != null) {
                                    float f6 = m212.q;
                                    h3.s(7, 7, m212.p, 0, g3110);
                                    h3.C = f6;
                                }
                                constraintLayout = this;
                                g31 = h3;
                                m21 = m212;
                                i5 = 4;
                                i6 = 2;
                            } else {
                                if (i46 != -1) {
                                    g31 g3111 = (g31) sparseArray4.get(i46);
                                    if (g3111 != null) {
                                        g312 = h3;
                                        i21 = 2;
                                        g312.s(2, 2, m212.leftMargin, i50, g3111);
                                    } else {
                                        g312 = h3;
                                        i21 = 2;
                                    }
                                } else {
                                    g312 = h3;
                                    int i54 = i50;
                                    i21 = 2;
                                    if (!(i47 == -1 || (g316 = (g31) sparseArray4.get(i47)) == null)) {
                                        g312.s(2, 4, m212.leftMargin, i54, g316);
                                        i11 = 2;
                                        i12 = 4;
                                        if (i48 == -1) {
                                            g31 g3112 = (g31) sparseArray4.get(i48);
                                            if (g3112 != null) {
                                                g312.s(i12, i11, m212.rightMargin, i52, g3112);
                                            }
                                            i6 = i11;
                                        } else {
                                            int i55 = i52;
                                            i6 = i11;
                                            if (!(i49 == -1 || (g313 = (g31) sparseArray4.get(i49)) == null)) {
                                                g312.s(i12, i12, m212.rightMargin, i55, g313);
                                            }
                                        }
                                        i5 = i12;
                                        i13 = m212.h;
                                        if (i13 == -1) {
                                            g31 g3113 = (g31) sparseArray4.get(i13);
                                            if (g3113 != null) {
                                                i20 = 3;
                                                g312.s(3, 3, m212.topMargin, m212.w, g3113);
                                            } else {
                                                i20 = 3;
                                            }
                                            i16 = i20;
                                            i14 = 5;
                                            i15 = -1;
                                        } else {
                                            int i56 = m212.i;
                                            i15 = -1;
                                            if (i56 == -1 || (g315 = (g31) sparseArray4.get(i56)) == null) {
                                                i16 = 3;
                                                i14 = 5;
                                            } else {
                                                g312.s(3, 5, m212.topMargin, m212.w, g315);
                                                i16 = 3;
                                                i14 = 5;
                                            }
                                        }
                                        i17 = m212.j;
                                        if (i17 == i15) {
                                            g31 g3114 = (g31) sparseArray4.get(i17);
                                            if (g3114 != null) {
                                                int i57 = i16;
                                                g312.s(i14, i57, m212.bottomMargin, m212.y, g3114);
                                                i18 = i57;
                                            } else {
                                                i18 = i16;
                                            }
                                        } else {
                                            i18 = i16;
                                            int i58 = m212.k;
                                            if (!(i58 == i15 || (g314 = (g31) sparseArray4.get(i58)) == null)) {
                                                g312.s(i14, i14, m212.bottomMargin, m212.y, g314);
                                            }
                                        }
                                        m21 = m212;
                                        i19 = m21.l;
                                        if (i19 == -1) {
                                            constraintLayout = this;
                                            g31 = g312;
                                            constraintLayout.l(g31, m21, sparseArray4, i19, 6);
                                        } else {
                                            int i59 = m21.m;
                                            if (i59 != -1) {
                                                constraintLayout = this;
                                                g31 = g312;
                                                constraintLayout.l(g31, m21, sparseArray4, i59, i18);
                                            } else {
                                                int i60 = m21.n;
                                                constraintLayout = this;
                                                g31 = g312;
                                                int i61 = i14;
                                                if (i60 != -1) {
                                                    constraintLayout.l(g31, m21, sparseArray4, i60, i61);
                                                }
                                                if (f5 >= 0.0f) {
                                                    g31.c0 = f5;
                                                }
                                                f2 = m21.E;
                                                if (f2 >= 0.0f) {
                                                    g31.d0 = f2;
                                                }
                                            }
                                        }
                                        int i62 = i14;
                                        if (f5 >= 0.0f) {
                                        }
                                        f2 = m21.E;
                                        if (f2 >= 0.0f) {
                                        }
                                    }
                                }
                                i11 = i21;
                                i12 = 4;
                                if (i48 == -1) {
                                }
                                i5 = i12;
                                i13 = m212.h;
                                if (i13 == -1) {
                                }
                                i17 = m212.j;
                                if (i17 == i15) {
                                }
                                m21 = m212;
                                i19 = m21.l;
                                if (i19 == -1) {
                                }
                                int i622 = i14;
                                if (f5 >= 0.0f) {
                                }
                                f2 = m21.E;
                                if (f2 >= 0.0f) {
                                }
                            }
                            if (isInEditMode && !((i10 = m21.S) == -1 && m21.T == -1)) {
                                int i63 = m21.T;
                                g31.X = i10;
                                g31.Y = i63;
                            }
                            if (m21.Z) {
                                g31.H(i32);
                                g31.J(m21.width);
                                if (m21.width == -2) {
                                    g31.H(i39);
                                }
                            } else if (m21.width == -1) {
                                if (m21.V) {
                                    g31.H(3);
                                } else {
                                    g31.H(4);
                                }
                                g31.i(i6).g = m21.leftMargin;
                                g31.i(i5).g = m21.rightMargin;
                            } else {
                                g31.H(3);
                                g31.J(0);
                            }
                            if (!m21.a0) {
                                i7 = -1;
                                if (m21.height == -1) {
                                    if (m21.W) {
                                        g31.I(3);
                                    } else {
                                        g31.I(4);
                                    }
                                    g31.i(3).g = m21.topMargin;
                                    g31.i(5).g = m21.bottomMargin;
                                } else {
                                    g31.I(3);
                                    g31.G(0);
                                }
                            } else {
                                i7 = -1;
                                g31.I(1);
                                g31.G(m21.height);
                                if (m21.height == -2) {
                                    g31.I(2);
                                }
                            }
                            String str3 = m21.F;
                            if (str3 == null || str3.length() == 0) {
                                g31.V = 0.0f;
                            } else {
                                int length = str3.length();
                                int indexOf3 = str3.indexOf(44);
                                if (indexOf3 <= 0 || indexOf3 >= length - 1) {
                                    i8 = i7;
                                    i9 = 0;
                                } else {
                                    String substring = str3.substring(0, indexOf3);
                                    if (substring.equalsIgnoreCase("W")) {
                                        i8 = 0;
                                    } else if (substring.equalsIgnoreCase("H")) {
                                        i8 = 1;
                                    } else {
                                        i8 = i7;
                                    }
                                    i9 = indexOf3 + 1;
                                }
                                int indexOf4 = str3.indexOf(58);
                                if (indexOf4 < 0 || indexOf4 >= length - 1) {
                                    String substring2 = str3.substring(i9);
                                    if (substring2.length() > 0) {
                                        f = Float.parseFloat(substring2);
                                        if (f > 0.0f) {
                                            g31.V = f;
                                            g31.W = i8;
                                        }
                                    }
                                } else {
                                    String substring3 = str3.substring(i9, indexOf4);
                                    String substring4 = str3.substring(indexOf4 + 1);
                                    if (substring3.length() > 0 && substring4.length() > 0) {
                                        try {
                                            float parseFloat = Float.parseFloat(substring3);
                                            float parseFloat2 = Float.parseFloat(substring4);
                                            if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                                                if (i8 == 1) {
                                                    f = Math.abs(parseFloat2 / parseFloat);
                                                } else {
                                                    f = Math.abs(parseFloat / parseFloat2);
                                                }
                                                if (f > 0.0f) {
                                                }
                                            }
                                        } catch (NumberFormatException unused3) {
                                        }
                                    }
                                }
                                f = 0.0f;
                                if (f > 0.0f) {
                                }
                            }
                            float f7 = m21.G;
                            float[] fArr = g31.j0;
                            fArr[0] = f7;
                            i32 = 1;
                            fArr[1] = m21.H;
                            g31.h0 = m21.I;
                            g31.i0 = m21.J;
                            int i64 = m21.Y;
                            if (i64 >= 0 && i64 <= 3) {
                                g31.p = i64;
                            }
                            int i65 = m21.K;
                            int i66 = m21.M;
                            int i67 = m21.O;
                            float f8 = m21.Q;
                            g31.q = i65;
                            g31.t = i66;
                            if (i67 == Integer.MAX_VALUE) {
                                i67 = 0;
                            }
                            g31.u = i67;
                            g31.v = f8;
                            if (f8 > 0.0f && f8 < 1.0f && i65 == 0) {
                                g31.q = 2;
                            }
                            int i68 = m21.L;
                            int i69 = m21.N;
                            int i70 = m21.P;
                            float f9 = m21.R;
                            g31.r = i68;
                            g31.w = i69;
                            if (i70 == Integer.MAX_VALUE) {
                                i70 = 0;
                            }
                            g31.x = i70;
                            g31.y = f9;
                            if (f9 <= 0.0f || f9 >= 1.0f || i68 != 0) {
                                i4 = 2;
                            } else {
                                i4 = 2;
                                g31.r = 2;
                            }
                        }
                        i42 = i3 + 1;
                        i39 = i4;
                        z3 = z4;
                    }
                    i3 = i42;
                    z4 = z3;
                    i4 = i39;
                    i42 = i3 + 1;
                    i39 = i4;
                    z3 = z4;
                }
            }
            if (z3) {
                h31.q0.j0(h31);
            }
        }
        constraintLayout.k(h31, constraintLayout.E, i23, i24);
        int n = h31.n();
        int k = h31.k();
        boolean z5 = h31.D0;
        boolean z6 = h31.E0;
        n21 n21 = constraintLayout.K;
        int i71 = n21.e;
        int min = Math.min(constraintLayout.B, View.resolveSizeAndState(n + n21.d, i23, 0) & 16777215);
        int min2 = Math.min(constraintLayout.C, View.resolveSizeAndState(k + i71, i24, 0) & 16777215);
        if (z5) {
            min |= 16777216;
        }
        if (z6) {
            min2 |= 16777216;
        }
        constraintLayout.setMeasuredDimension(min, min2);
    }

    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        g31 h = h(view);
        if ((view instanceof yx2) && !(h instanceof zx2)) {
            m21 m21 = (m21) view.getLayoutParams();
            zx2 zx2 = new zx2();
            m21.o0 = zx2;
            m21.c0 = true;
            zx2.N(m21.U);
        }
        if (view instanceof k21) {
            k21 k21 = (k21) view;
            k21.i();
            ((m21) view.getLayoutParams()).d0 = true;
            ArrayList arrayList = this.x;
            if (!arrayList.contains(k21)) {
                arrayList.add(k21);
            }
        }
        this.w.put(view.getId(), view);
        this.D = true;
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.w.remove(view.getId());
        g31 h = h(view);
        this.y.p0.remove(h);
        h.z();
        this.x.remove(view);
        this.D = true;
    }

    public final void requestLayout() {
        this.D = true;
        super.requestLayout();
    }

    public void setConstraintSet(w21 w21) {
        this.F = w21;
    }

    public void setId(int i) {
        int id = getId();
        SparseArray sparseArray = this.w;
        sparseArray.remove(id);
        super.setId(i);
        sparseArray.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i != this.C) {
            this.C = i;
            requestLayout();
        }
    }

    public void setMaxWidth(int i) {
        if (i != this.B) {
            this.B = i;
            requestLayout();
        }
    }

    public void setMinHeight(int i) {
        if (i != this.A) {
            this.A = i;
            requestLayout();
        }
    }

    public void setMinWidth(int i) {
        if (i != this.z) {
            this.z = i;
            requestLayout();
        }
    }

    public void setOnConstraintsChanged(l31 l31) {
        jz0 jz0 = this.G;
        if (jz0 != null) {
            jz0.getClass();
        }
    }

    public void setOptimizationLevel(int i) {
        this.E = i;
        h31 h31 = this.y;
        h31.C0 = i;
        x64.p = h31.R(512);
    }

    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        i(attributeSet, i);
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [android.view.ViewGroup$LayoutParams, android.view.ViewGroup$MarginLayoutParams, m21] */
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        ? marginLayoutParams = new ViewGroup.MarginLayoutParams(layoutParams);
        marginLayoutParams.a = -1;
        marginLayoutParams.b = -1;
        marginLayoutParams.c = -1.0f;
        marginLayoutParams.d = -1;
        marginLayoutParams.e = -1;
        marginLayoutParams.f = -1;
        marginLayoutParams.g = -1;
        marginLayoutParams.h = -1;
        marginLayoutParams.i = -1;
        marginLayoutParams.j = -1;
        marginLayoutParams.k = -1;
        marginLayoutParams.l = -1;
        marginLayoutParams.m = -1;
        marginLayoutParams.n = -1;
        marginLayoutParams.o = -1;
        marginLayoutParams.p = 0;
        marginLayoutParams.q = 0.0f;
        marginLayoutParams.r = -1;
        marginLayoutParams.s = -1;
        marginLayoutParams.t = -1;
        marginLayoutParams.u = -1;
        marginLayoutParams.v = Integer.MIN_VALUE;
        marginLayoutParams.w = Integer.MIN_VALUE;
        marginLayoutParams.x = Integer.MIN_VALUE;
        marginLayoutParams.y = Integer.MIN_VALUE;
        marginLayoutParams.z = Integer.MIN_VALUE;
        marginLayoutParams.A = Integer.MIN_VALUE;
        marginLayoutParams.B = Integer.MIN_VALUE;
        marginLayoutParams.C = 0;
        marginLayoutParams.D = 0.5f;
        marginLayoutParams.E = 0.5f;
        marginLayoutParams.F = null;
        marginLayoutParams.G = -1.0f;
        marginLayoutParams.H = -1.0f;
        marginLayoutParams.I = 0;
        marginLayoutParams.J = 0;
        marginLayoutParams.K = 0;
        marginLayoutParams.L = 0;
        marginLayoutParams.M = 0;
        marginLayoutParams.N = 0;
        marginLayoutParams.O = 0;
        marginLayoutParams.P = 0;
        marginLayoutParams.Q = 1.0f;
        marginLayoutParams.R = 1.0f;
        marginLayoutParams.S = -1;
        marginLayoutParams.T = -1;
        marginLayoutParams.U = -1;
        marginLayoutParams.V = false;
        marginLayoutParams.W = false;
        marginLayoutParams.X = null;
        marginLayoutParams.Y = 0;
        marginLayoutParams.Z = true;
        marginLayoutParams.a0 = true;
        marginLayoutParams.b0 = false;
        marginLayoutParams.c0 = false;
        marginLayoutParams.d0 = false;
        marginLayoutParams.e0 = -1;
        marginLayoutParams.f0 = -1;
        marginLayoutParams.g0 = -1;
        marginLayoutParams.h0 = -1;
        marginLayoutParams.i0 = Integer.MIN_VALUE;
        marginLayoutParams.j0 = Integer.MIN_VALUE;
        marginLayoutParams.k0 = 0.5f;
        marginLayoutParams.o0 = new g31();
        return marginLayoutParams;
    }
}
