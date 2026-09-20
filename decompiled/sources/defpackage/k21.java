package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: k21  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class k21 extends View {
    public String A;
    public String B;
    public HashMap C;
    public int[] w;
    public int x;
    public Context y;
    public pz2 z;

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x008c  */
    public final void a(String str) {
        ConstraintLayout constraintLayout;
        int i;
        Object obj;
        HashMap hashMap;
        Context context = this.y;
        if (str.length() != 0 && context != null) {
            String trim = str.trim();
            if (getParent() instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout2 = (ConstraintLayout) getParent();
            }
            if (getParent() instanceof ConstraintLayout) {
                constraintLayout = (ConstraintLayout) getParent();
            } else {
                constraintLayout = null;
            }
            if (isInEditMode() && constraintLayout != null) {
                if (trim == null || (hashMap = constraintLayout.I) == null || !hashMap.containsKey(trim)) {
                    obj = null;
                } else {
                    obj = constraintLayout.I.get(trim);
                }
                if (obj instanceof Integer) {
                    i = ((Integer) obj).intValue();
                    if (i == 0 && constraintLayout != null) {
                        i = f(constraintLayout, trim);
                    }
                    if (i == 0) {
                        try {
                            i = iv5.class.getField(trim).getInt((Object) null);
                        } catch (Exception unused) {
                        }
                    }
                    if (i == 0) {
                        i = context.getResources().getIdentifier(trim, "id", context.getPackageName());
                    }
                    if (i == 0) {
                        this.C.put(Integer.valueOf(i), trim);
                        b(i);
                        return;
                    }
                    Log.w("ConstraintHelper", "Could not find id of \"" + trim + "\"");
                    return;
                }
            }
            i = 0;
            i = f(constraintLayout, trim);
            if (i == 0) {
            }
            if (i == 0) {
            }
            if (i == 0) {
            }
        }
    }

    public final void b(int i) {
        if (i != getId()) {
            int i2 = this.x + 1;
            int[] iArr = this.w;
            if (i2 > iArr.length) {
                this.w = Arrays.copyOf(iArr, iArr.length * 2);
            }
            int[] iArr2 = this.w;
            int i3 = this.x;
            iArr2[i3] = i;
            this.x = i3 + 1;
        }
    }

    public final void c(String str) {
        ConstraintLayout constraintLayout;
        if (str.length() != 0 && this.y != null) {
            String trim = str.trim();
            if (getParent() instanceof ConstraintLayout) {
                constraintLayout = (ConstraintLayout) getParent();
            } else {
                constraintLayout = null;
            }
            if (constraintLayout == null) {
                Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
                return;
            }
            int childCount = constraintLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = constraintLayout.getChildAt(i);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if ((layoutParams instanceof m21) && trim.equals(((m21) layoutParams).X)) {
                    if (childAt.getId() == -1) {
                        Log.w("ConstraintHelper", "to use ConstraintTag view " + childAt.getClass().getSimpleName() + " must have an ID");
                    } else {
                        b(childAt.getId());
                    }
                }
            }
        }
    }

    public final void d(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i = 0; i < this.x; i++) {
            View view = (View) constraintLayout.w.get(this.w[i]);
            if (view != null) {
                view.setVisibility(visibility);
                if (elevation > 0.0f) {
                    view.setTranslationZ(view.getTranslationZ() + elevation);
                }
            }
        }
    }

    public final int f(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String str2;
        if (!(str == null || (resources = this.y.getResources()) == null)) {
            int childCount = constraintLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = constraintLayout.getChildAt(i);
                if (childAt.getId() != -1) {
                    try {
                        str2 = resources.getResourceEntryName(childAt.getId());
                    } catch (Resources.NotFoundException unused) {
                        str2 = null;
                    }
                    if (str.equals(str2)) {
                        return childAt.getId();
                    }
                }
            }
        }
        return 0;
    }

    public void g(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, jv5.b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 35) {
                    String string = obtainStyledAttributes.getString(index);
                    this.A = string;
                    setIds(string);
                } else if (index == 36) {
                    String string2 = obtainStyledAttributes.getString(index);
                    this.B = string2;
                    setReferenceTags(string2);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.w, this.x);
    }

    public abstract void h(g31 g31, boolean z2);

    public final void i() {
        if (this.z != null) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams instanceof m21) {
                ((m21) layoutParams).o0 = this.z;
            }
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.A;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.B;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setIds(String str) {
        this.A = str;
        if (str != null) {
            int i = 0;
            this.x = 0;
            while (true) {
                int indexOf = str.indexOf(44, i);
                if (indexOf == -1) {
                    a(str.substring(i));
                    return;
                } else {
                    a(str.substring(i, indexOf));
                    i = indexOf + 1;
                }
            }
        }
    }

    public void setReferenceTags(String str) {
        this.B = str;
        if (str != null) {
            int i = 0;
            this.x = 0;
            while (true) {
                int indexOf = str.indexOf(44, i);
                if (indexOf == -1) {
                    c(str.substring(i));
                    return;
                } else {
                    c(str.substring(i, indexOf));
                    i = indexOf + 1;
                }
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.A = null;
        this.x = 0;
        for (int b : iArr) {
            b(b);
        }
    }

    public final void setTag(int i, Object obj) {
        super.setTag(i, obj);
        if (obj == null && this.A == null) {
            b(i);
        }
    }

    public void e(ConstraintLayout constraintLayout) {
    }

    public final void onDraw(Canvas canvas) {
    }
}
