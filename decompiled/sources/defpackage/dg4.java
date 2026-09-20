package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import cu.lestebang.utiletecsa.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.TreeMap;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: dg4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class dg4 extends LinearLayout {
    public Integer[] A;
    public g37 B;
    public h37 C;
    public int D;
    public j37 E;
    public boolean F;
    public final ArrayList w = new ArrayList();
    public final ArrayList x = new ArrayList();
    public final f96 y;
    public final wu0 z;

    /* JADX WARNING: type inference failed for: r0v26, types: [java.lang.Object, j37] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x008d A[Catch:{ all -> 0x009f, all -> 0x00b2, NotFoundException | IOException | XmlPullParserException -> 0x0056 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00a6 A[SYNTHETIC, Splitter:B:24:0x00a6] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x013e A[Catch:{ all -> 0x0150, all -> 0x0163, NotFoundException | IOException | XmlPullParserException -> 0x0168 }] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0157 A[SYNTHETIC, Splitter:B:67:0x0157] */
    public dg4(Context context, AttributeSet attributeSet) {
        super(rg3.F(context, attributeSet, R.attr.materialButtonToggleGroupStyle, 2131887115), attributeSet, R.attr.materialButtonToggleGroupStyle);
        g37 g37;
        XmlResourceParser xml;
        Throwable th;
        int next;
        j37 j37;
        XmlResourceParser xml2;
        Throwable th2;
        int next2;
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) this;
        this.y = new f96(28, (Object) materialButtonToggleGroup);
        this.z = new wu0(1, materialButtonToggleGroup);
        this.F = true;
        Context context2 = getContext();
        TypedArray F2 = gw8.F(context2, attributeSet, ov5.k, R.attr.materialButtonToggleGroupStyle, 2131887115, new int[0]);
        h37 h37 = null;
        if (F2.hasValue(2)) {
            int resourceId = F2.getResourceId(2, 0);
            if (resourceId != 0 && context2.getResources().getResourceTypeName(resourceId).equals("xml")) {
                try {
                    xml2 = context2.getResources().getXml(resourceId);
                    ? obj = new Object();
                    obj.c = new int[10][];
                    obj.d = new br4[10];
                    AttributeSet asAttributeSet = Xml.asAttributeSet(xml2);
                    while (true) {
                        next2 = xml2.next();
                        if (next2 == 2 || next2 == 1) {
                            if (next2 != 2) {
                                if (xml2.getName().equals("selector")) {
                                    obj.a(context2, xml2, asAttributeSet, context2.getTheme());
                                }
                                xml2.close();
                                j37 = obj;
                                this.E = j37;
                            } else {
                                throw new XmlPullParserException("No start tag found");
                            }
                        }
                    }
                    if (next2 != 2) {
                    }
                } catch (Resources.NotFoundException | IOException | XmlPullParserException unused) {
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            j37 = null;
            this.E = j37;
        }
        if (F2.hasValue(4)) {
            h37 b = h37.b(context2, F2, 4);
            this.C = b;
            if (b == null) {
                f73 f73 = new f73(rq6.a(context2, F2.getResourceId(4, 0), F2.getResourceId(5, 0), new a0(0.0f)).a());
                this.C = f73.b != 0 ? new h37(f73) : h37;
            }
        }
        if (F2.hasValue(3)) {
            a0 a0Var = new a0(0.0f);
            int resourceId2 = F2.getResourceId(3, 0);
            if (resourceId2 == 0) {
                g37 = g37.b(rq6.c(F2, 3, a0Var));
            } else if (!context2.getResources().getResourceTypeName(resourceId2).equals("xml")) {
                g37 = g37.b(rq6.c(F2, 3, a0Var));
            } else {
                try {
                    xml = context2.getResources().getXml(resourceId2);
                    g37 = new g37();
                    AttributeSet asAttributeSet2 = Xml.asAttributeSet(xml);
                    while (true) {
                        next = xml.next();
                        if (next == 2 || next == 1) {
                            if (next != 2) {
                                if (xml.getName().equals("selector")) {
                                    g37.d(context2, xml, asAttributeSet2, context2.getTheme());
                                }
                                xml.close();
                            } else {
                                throw new XmlPullParserException("No start tag found");
                            }
                        }
                    }
                    if (next != 2) {
                    }
                } catch (Resources.NotFoundException | IOException | XmlPullParserException unused2) {
                    g37 = g37.b(a0Var);
                } catch (Throwable th4) {
                    th.addSuppressed(th4);
                }
            }
            this.B = g37;
        }
        this.D = F2.getDimensionPixelSize(1, 0);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(F2.getBoolean(0, true));
        F2.recycle();
        return;
        throw th2;
        throw th;
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (c(i)) {
                return i;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (c(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            materialButton.setId(View.generateViewId());
        }
    }

    public final void a() {
        int i;
        LinearLayout.LayoutParams layoutParams;
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex != -1) {
            for (int i2 = firstVisibleChildIndex + 1; i2 < getChildCount(); i2++) {
                MaterialButton materialButton = (MaterialButton) getChildAt(i2);
                MaterialButton materialButton2 = (MaterialButton) getChildAt(i2 - 1);
                if (this.D <= 0) {
                    i = Math.min(materialButton.getStrokeWidth(), materialButton2.getStrokeWidth());
                    materialButton.setShouldDrawSurfaceColorStroke(true);
                    materialButton2.setShouldDrawSurfaceColorStroke(true);
                } else {
                    materialButton.setShouldDrawSurfaceColorStroke(false);
                    materialButton2.setShouldDrawSurfaceColorStroke(false);
                    i = 0;
                }
                ViewGroup.LayoutParams layoutParams2 = materialButton.getLayoutParams();
                if (layoutParams2 instanceof LinearLayout.LayoutParams) {
                    layoutParams = (LinearLayout.LayoutParams) layoutParams2;
                } else {
                    layoutParams = new LinearLayout.LayoutParams(layoutParams2.width, layoutParams2.height);
                }
                if (getOrientation() == 0) {
                    layoutParams.setMarginEnd(0);
                    layoutParams.setMarginStart(this.D - i);
                    layoutParams.topMargin = 0;
                } else {
                    layoutParams.bottomMargin = 0;
                    layoutParams.topMargin = this.D - i;
                    layoutParams.setMarginStart(0);
                }
                materialButton.setLayoutParams(layoutParams);
            }
            if (getChildCount() != 0 && firstVisibleChildIndex != -1) {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) ((MaterialButton) getChildAt(firstVisibleChildIndex)).getLayoutParams();
                if (getOrientation() == 1) {
                    layoutParams3.topMargin = 0;
                    layoutParams3.bottomMargin = 0;
                    return;
                }
                layoutParams3.setMarginEnd(0);
                layoutParams3.setMarginStart(0);
                layoutParams3.leftMargin = 0;
                layoutParams3.rightMargin = 0;
            }
        }
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonGroup", "Child views must be of type MaterialButton.");
            return;
        }
        d();
        this.F = true;
        super.addView(view, i, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        materialButton.setOnPressedChangeListenerInternal(this.y);
        this.w.add(materialButton.getShapeAppearanceModel());
        this.x.add(materialButton.getStateListShapeAppearanceModel());
        materialButton.setEnabled(isEnabled());
    }

    public final void b() {
        int i;
        MaterialButton materialButton;
        MaterialButton materialButton2;
        int i2;
        float max;
        if (this.E != null && getChildCount() != 0) {
            int firstVisibleChildIndex = getFirstVisibleChildIndex();
            int lastVisibleChildIndex = getLastVisibleChildIndex();
            int i3 = Integer.MAX_VALUE;
            for (int i4 = firstVisibleChildIndex; i4 <= lastVisibleChildIndex; i4++) {
                if (c(i4)) {
                    int i5 = 0;
                    if (c(i4) && this.E != null) {
                        j37 j37 = this.E;
                        int width = ((MaterialButton) getChildAt(i4)).getWidth();
                        int i6 = -width;
                        for (int i7 = 0; i7 < j37.a; i7++) {
                            i37 i37 = (i37) j37.d[i7].x;
                            int i8 = i37.a;
                            float f = i37.b;
                            if (i8 == 2) {
                                max = Math.max((float) i6, f);
                            } else if (i8 == 1) {
                                max = Math.max((float) i6, ((float) width) * f);
                            }
                            i6 = (int) max;
                        }
                        int max2 = Math.max(0, i6);
                        int i9 = i4 - 1;
                        while (true) {
                            materialButton = null;
                            if (i9 < 0) {
                                materialButton2 = null;
                                break;
                            } else if (c(i9)) {
                                materialButton2 = (MaterialButton) getChildAt(i9);
                                break;
                            } else {
                                i9--;
                            }
                        }
                        if (materialButton2 == null) {
                            i2 = 0;
                        } else {
                            i2 = materialButton2.getAllowedWidthDecrease();
                        }
                        int childCount = getChildCount();
                        int i10 = i4 + 1;
                        while (true) {
                            if (i10 >= childCount) {
                                break;
                            } else if (c(i10)) {
                                materialButton = (MaterialButton) getChildAt(i10);
                                break;
                            } else {
                                i10++;
                            }
                        }
                        if (materialButton != null) {
                            i5 = materialButton.getAllowedWidthDecrease();
                        }
                        i5 = Math.min(max2, i2 + i5);
                    }
                    if (!(i4 == firstVisibleChildIndex || i4 == lastVisibleChildIndex)) {
                        i5 /= 2;
                    }
                    i3 = Math.min(i3, i5);
                }
            }
            for (int i11 = firstVisibleChildIndex; i11 <= lastVisibleChildIndex; i11++) {
                if (c(i11)) {
                    ((MaterialButton) getChildAt(i11)).setSizeChange(this.E);
                    MaterialButton materialButton3 = (MaterialButton) getChildAt(i11);
                    if (i11 == firstVisibleChildIndex || i11 == lastVisibleChildIndex) {
                        i = i3;
                    } else {
                        i = i3 * 2;
                    }
                    materialButton3.setWidthChangeMax(i);
                }
            }
        }
    }

    public final boolean c(int i) {
        if (getChildAt(i).getVisibility() != 8) {
            return true;
        }
        return false;
    }

    public final void d() {
        for (int i = 0; i < getChildCount(); i++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i);
            LinearLayout.LayoutParams layoutParams = materialButton.R;
            if (layoutParams != null) {
                materialButton.setLayoutParams(layoutParams);
                materialButton.R = null;
                materialButton.O = -1.0f;
            }
        }
    }

    public final void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.z);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            treeMap.put((MaterialButton) getChildAt(i), Integer.valueOf(i));
        }
        this.A = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    /* JADX WARNING: type inference failed for: r14v1, types: [int[][], java.lang.Object, java.io.Serializable] */
    /* JADX WARNING: type inference failed for: r7v26, types: [rq6[], java.io.Serializable] */
    public final void e() {
        boolean z2;
        boolean z3;
        f73 f73;
        boolean z4;
        boolean z5;
        int i;
        h37 h37;
        int i2;
        if (!(this.B == null && this.C == null) && this.F) {
            this.F = false;
            int childCount = getChildCount();
            int firstVisibleChildIndex = getFirstVisibleChildIndex();
            int lastVisibleChildIndex = getLastVisibleChildIndex();
            for (int i3 = 0; i3 < childCount; i3++) {
                MaterialButton materialButton = (MaterialButton) getChildAt(i3);
                if (materialButton.getVisibility() != 8) {
                    if (i3 == firstVisibleChildIndex) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (i3 == lastVisibleChildIndex) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    h37 h372 = this.C;
                    if (h372 == null || (!z2 && !z3)) {
                        h372 = (h37) this.x.get(i3);
                    }
                    if (h372 == null) {
                        f73 = new f73((rq6) this.w.get(i3));
                    } else {
                        f73 f732 = new f73(1);
                        int i4 = h372.a;
                        f732.b = i4;
                        f732.c = h372.b;
                        int[][] iArr = h372.c;
                        ? r14 = new int[iArr.length][];
                        f732.d = r14;
                        rq6[] rq6Arr = h372.d;
                        f732.e = new rq6[rq6Arr.length];
                        System.arraycopy(iArr, 0, r14, 0, i4);
                        System.arraycopy(rq6Arr, 0, (rq6[]) f732.e, 0, f732.b);
                        f732.f = h372.e;
                        f732.g = h372.f;
                        f732.h = h372.g;
                        f732.i = h372.h;
                        f73 = f732;
                    }
                    if (getOrientation() == 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (getLayoutDirection() == 1) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (z4) {
                        if (z2) {
                            i = 5;
                        } else {
                            i = 0;
                        }
                        if (z3) {
                            i |= 10;
                        }
                        if (z5) {
                            i = ((i & 10) >> 1) | ((i & 5) << 1);
                        }
                    } else {
                        if (z2) {
                            i2 = 3;
                        } else {
                            i2 = 0;
                        }
                        if (z3) {
                            i |= 12;
                        }
                    }
                    int i5 = ~i;
                    g37 g37 = this.B;
                    if ((i5 | 1) == i5) {
                        f73.f = g37;
                    }
                    if ((i5 | 2) == i5) {
                        f73.g = g37;
                    }
                    if ((i5 | 4) == i5) {
                        f73.h = g37;
                    }
                    if ((i5 | 8) == i5) {
                        f73.i = g37;
                    }
                    if (f73.b == 0) {
                        h37 = null;
                    } else {
                        h37 = new h37(f73);
                    }
                    if (h37.d()) {
                        materialButton.setStateListShapeAppearanceModel(h37);
                    } else {
                        materialButton.setShapeAppearanceModel(h37.c());
                    }
                }
            }
        }
    }

    public j37 getButtonSizeChange() {
        return this.E;
    }

    public final int getChildDrawingOrder(int i, int i2) {
        Integer[] numArr = this.A;
        if (numArr != null && i2 < numArr.length) {
            return numArr[i2].intValue();
        }
        Log.w("MButtonGroup", "Child order wasn't updated");
        return i2;
    }

    public z71 getInnerCornerSize() {
        return this.B.b;
    }

    public g37 getInnerCornerSizeStateList() {
        return this.B;
    }

    public rq6 getShapeAppearance() {
        h37 h37 = this.C;
        if (h37 == null) {
            return null;
        }
        return h37.c();
    }

    public int getSpacing() {
        return this.D;
    }

    public h37 getStateListShapeAppearance() {
        return this.C;
    }

    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        super.onLayout(z2, i, i2, i3, i4);
        if (z2) {
            d();
            b();
        }
    }

    public final void onMeasure(int i, int i2) {
        e();
        a();
        super.onMeasure(i, i2);
    }

    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal((bg4) null);
        }
        int indexOfChild = indexOfChild(view);
        if (indexOfChild >= 0) {
            this.w.remove(indexOfChild);
            this.x.remove(indexOfChild);
        }
        this.F = true;
        e();
        d();
        a();
    }

    public void setButtonSizeChange(j37 j37) {
        if (this.E != j37) {
            this.E = j37;
            b();
            requestLayout();
            invalidate();
        }
    }

    public void setEnabled(boolean z2) {
        super.setEnabled(z2);
        for (int i = 0; i < getChildCount(); i++) {
            ((MaterialButton) getChildAt(i)).setEnabled(z2);
        }
    }

    public void setInnerCornerSize(z71 z71) {
        this.B = g37.b(z71);
        this.F = true;
        e();
        invalidate();
    }

    public void setInnerCornerSizeStateList(g37 g37) {
        this.B = g37;
        this.F = true;
        e();
        invalidate();
    }

    public void setOrientation(int i) {
        if (getOrientation() != i) {
            this.F = true;
        }
        super.setOrientation(i);
    }

    public void setShapeAppearance(rq6 rq6) {
        h37 h37;
        f73 f73 = new f73(rq6);
        if (f73.b == 0) {
            h37 = null;
        } else {
            h37 = new h37(f73);
        }
        this.C = h37;
        this.F = true;
        e();
        invalidate();
    }

    public void setSpacing(int i) {
        this.D = i;
        invalidate();
        requestLayout();
    }

    public void setStateListShapeAppearance(h37 h37) {
        this.C = h37;
        this.F = true;
        e();
        invalidate();
    }
}
