package defpackage;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;

/* renamed from: o32  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class o32 implements TextWatcher {
    public final EditText w;
    public n32 x;
    public boolean y = true;

    public o32(EditText editText) {
        this.w = editText;
    }

    public static void a(EditText editText, int i) {
        int i2;
        if (i == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            w22 a = w22.a();
            if (editableText == null) {
                i2 = 0;
            } else {
                a.getClass();
                i2 = editableText.length();
            }
            a.g(0, i2, 0, editableText);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        EditText editText = this.w;
        if (!editText.isInEditMode() && this.y && w22.d() && i2 <= i3 && (charSequence instanceof Spannable)) {
            int c = w22.a().c();
            if (c != 0) {
                if (c == 1) {
                    w22.a().g(i, i3 + i, 0, (Spannable) charSequence);
                    return;
                } else if (c != 3) {
                    return;
                }
            }
            w22 a = w22.a();
            if (this.x == null) {
                this.x = new n32(editText);
            }
            a.h(this.x);
        }
    }

    public final void afterTextChanged(Editable editable) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
