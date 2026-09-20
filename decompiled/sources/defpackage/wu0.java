package defpackage;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import java.util.Comparator;

/* renamed from: wu0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class wu0 implements Comparator {
    public final /* synthetic */ int w;
    public final /* synthetic */ Object x;

    public /* synthetic */ wu0(int i, Object obj) {
        this.w = i;
        this.x = obj;
    }

    public final int compare(Object obj, Object obj2) {
        int i = this.w;
        Object obj3 = this.x;
        switch (i) {
            case b85.b:
                for (vr2 vr2 : (vr2[]) obj3) {
                    int k = pd8.k((Comparable) vr2.y(obj), (Comparable) vr2.y(obj2));
                    if (k != 0) {
                        return k;
                    }
                }
                return 0;
            case 1:
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) obj3;
                MaterialButton materialButton = (MaterialButton) obj;
                MaterialButton materialButton2 = (MaterialButton) obj2;
                int compareTo = Boolean.valueOf(materialButton.K).compareTo(Boolean.valueOf(materialButton2.K));
                if (compareTo != 0) {
                    return compareTo;
                }
                int compareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
                if (compareTo2 != 0) {
                    return compareTo2;
                }
                return Integer.compare(materialButtonToggleGroup.indexOfChild(materialButton), materialButtonToggleGroup.indexOfChild(materialButton2));
            default:
                return ((Number) ((gs2) obj3).H(obj, obj2)).intValue();
        }
    }
}
