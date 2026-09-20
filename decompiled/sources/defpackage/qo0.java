package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.NavigationMenuItemView;
import cu.lestebang.utiletecsa.R;

/* renamed from: qo0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class qo0 extends k4 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ int z;

    public /* synthetic */ qo0(int i, Object obj) {
        this.z = i;
        this.A = obj;
    }

    public void c(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.z) {
            case b85.b:
                super.c(view, accessibilityEvent);
                accessibilityEvent.setChecked(((CheckableImageButton) this.A).z);
                return;
            default:
                super.c(view, accessibilityEvent);
                return;
        }
    }

    public final void d(View view, c5 c5Var) {
        int i;
        String str;
        int i2 = this.z;
        Object obj = this.A;
        View.AccessibilityDelegate accessibilityDelegate = this.w;
        switch (i2) {
            case b85.b:
                AccessibilityNodeInfo accessibilityNodeInfo = c5Var.a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                CheckableImageButton checkableImageButton = (CheckableImageButton) obj;
                accessibilityNodeInfo.setCheckable(checkableImageButton.A);
                accessibilityNodeInfo.setChecked(checkableImageButton.z);
                return;
            case 1:
                AccessibilityNodeInfo accessibilityNodeInfo2 = c5Var.a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) obj;
                int i3 = MaterialButtonToggleGroup.M;
                if (view instanceof MaterialButton) {
                    int i4 = 0;
                    int i5 = 0;
                    while (true) {
                        if (i4 < materialButtonToggleGroup.getChildCount()) {
                            if (materialButtonToggleGroup.getChildAt(i4) == view) {
                                i = i5;
                            } else {
                                if ((materialButtonToggleGroup.getChildAt(i4) instanceof MaterialButton) && materialButtonToggleGroup.getChildAt(i4).getVisibility() != 8) {
                                    i5++;
                                }
                                i4++;
                            }
                        }
                    }
                    accessibilityNodeInfo2.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(0, 1, i, 1, false, ((MaterialButton) view).K));
                    return;
                }
                i = -1;
                accessibilityNodeInfo2.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(0, 1, i, 1, false, ((MaterialButton) view).K));
                return;
            case 2:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, c5Var.a);
                kg4 kg4 = (kg4) obj;
                if (kg4.E0.getVisibility() == 0) {
                    str = kg4.q(R.string.mtrl_picker_toggle_to_year_selection);
                } else {
                    str = kg4.q(R.string.mtrl_picker_toggle_to_day_selection);
                }
                c5Var.b(new w4(16, str));
                return;
            default:
                AccessibilityNodeInfo accessibilityNodeInfo3 = c5Var.a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo3);
                accessibilityNodeInfo3.setCheckable(((NavigationMenuItemView) obj).T);
                return;
        }
    }
}
