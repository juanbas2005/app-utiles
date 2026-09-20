package defpackage;

import android.widget.CompoundButton;
import com.google.android.material.chip.Chip;

/* renamed from: gp0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class gp0 implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ Chip a;

    public /* synthetic */ gp0(Chip chip) {
        this.a = chip;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener = this.a.E;
        if (onCheckedChangeListener != null) {
            onCheckedChangeListener.onCheckedChanged(compoundButton, z);
        }
    }
}
