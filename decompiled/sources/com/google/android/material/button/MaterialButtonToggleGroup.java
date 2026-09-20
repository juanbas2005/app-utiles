package com.google.android.material.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.RadioButton;
import android.widget.ToggleButton;
import com.google.android.material.timepicker.e;
import cu.lestebang.utiletecsa.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class MaterialButtonToggleGroup extends dg4 {
    public static final /* synthetic */ int M = 0;
    public final LinkedHashSet G = new LinkedHashSet();
    public boolean H = false;
    public boolean I;
    public boolean J;
    public final int K;
    public HashSet L = new HashSet();

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        super(rg3.F(context, attributeSet, R.attr.materialButtonToggleGroupStyle, 2131887255), attributeSet);
        AttributeSet attributeSet2 = attributeSet;
        TypedArray F = gw8.F(getContext(), attributeSet2, ov5.l, R.attr.materialButtonToggleGroupStyle, 2131887255, new int[0]);
        setSingleSelection(F.getBoolean(7, false));
        this.K = F.getResourceId(2, -1);
        this.J = F.getBoolean(4, false);
        if (this.B == null) {
            this.B = g37.b(new a0(0.0f));
        }
        setEnabled(F.getBoolean(0, true));
        F.recycle();
        setImportantForAccessibility(1);
    }

    private String getChildrenA11yClassName() {
        Class cls;
        if (this.I) {
            cls = RadioButton.class;
        } else {
            cls = ToggleButton.class;
        }
        return cls.getName();
    }

    private int getVisibleButtonCount() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if ((getChildAt(i2) instanceof MaterialButton) && getChildAt(i2).getVisibility() != 8) {
                i++;
            }
        }
        return i;
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setA11yClassName(getChildrenA11yClassName());
    }

    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonToggleGroup", "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setupButtonChild(materialButton);
        f(materialButton.getId(), materialButton.K);
        e58.m(materialButton, new qo0(1, this));
    }

    public final void f(int i, boolean z) {
        if (i == -1) {
            Log.e("MButtonToggleGroup", "Button ID is not valid: " + i);
            return;
        }
        HashSet hashSet = new HashSet(this.L);
        if (z && !hashSet.contains(Integer.valueOf(i))) {
            if (this.I && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i));
        } else if (!z && hashSet.contains(Integer.valueOf(i))) {
            if (!this.J || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i));
            }
        } else {
            return;
        }
        g(hashSet);
    }

    public final void g(Set set) {
        HashSet hashSet = this.L;
        this.L = new HashSet(set);
        for (int i = 0; i < getChildCount(); i++) {
            int id = ((MaterialButton) getChildAt(i)).getId();
            boolean contains = set.contains(Integer.valueOf(id));
            View findViewById = findViewById(id);
            if (findViewById instanceof MaterialButton) {
                this.H = true;
                ((MaterialButton) findViewById).setChecked(contains);
                this.H = false;
            }
            if (hashSet.contains(Integer.valueOf(id)) != set.contains(Integer.valueOf(id))) {
                set.contains(Integer.valueOf(id));
                Iterator it = this.G.iterator();
                while (it.hasNext()) {
                    ((e) it.next()).a();
                }
            }
        }
        invalidate();
    }

    public int getCheckedButtonId() {
        if (!this.I || this.L.isEmpty()) {
            return -1;
        }
        return ((Integer) this.L.iterator().next()).intValue();
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            int id = ((MaterialButton) getChildAt(i)).getId();
            if (this.L.contains(Integer.valueOf(id))) {
                arrayList.add(Integer.valueOf(id));
            }
        }
        return arrayList;
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        int i = this.K;
        if (i != -1) {
            g(Collections.singleton(Integer.valueOf(i)));
        }
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        int visibleButtonCount = getVisibleButtonCount();
        if (this.I) {
            i = 1;
        } else {
            i = 2;
        }
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, visibleButtonCount, false, i));
    }

    public void setSelectionRequired(boolean z) {
        this.J = z;
    }

    public void setSingleSelection(boolean z) {
        if (this.I != z) {
            this.I = z;
            g(new HashSet());
        }
        String childrenA11yClassName = getChildrenA11yClassName();
        for (int i = 0; i < getChildCount(); i++) {
            ((MaterialButton) getChildAt(i)).setA11yClassName(childrenA11yClassName);
        }
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }
}
