package com.google.android.material.timepicker;

import android.text.Editable;
import android.text.TextUtils;
import com.google.android.material.chip.Chip;

/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class a extends ah7 {
    public final /* synthetic */ ChipTextInputComboView w;

    public a(ChipTextInputComboView chipTextInputComboView) {
        this.w = chipTextInputComboView;
    }

    public final void afterTextChanged(Editable editable) {
        boolean isEmpty = TextUtils.isEmpty(editable);
        ChipTextInputComboView chipTextInputComboView = this.w;
        Chip chip = chipTextInputComboView.w;
        if (isEmpty) {
            chip.setText(ChipTextInputComboView.a(chipTextInputComboView, "00"));
            return;
        }
        String a = ChipTextInputComboView.a(chipTextInputComboView, editable);
        if (TextUtils.isEmpty(a)) {
            a = ChipTextInputComboView.a(chipTextInputComboView, "00");
        }
        chip.setText(a);
    }
}
