package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* renamed from: nf7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class nf7 implements TextWatcher {
    public int w;
    public final /* synthetic */ EditText x;
    public final /* synthetic */ TextInputLayout y;

    public nf7(TextInputLayout textInputLayout, EditText editText) {
        this.y = textInputLayout;
        this.x = editText;
        this.w = editText.getLineCount();
    }

    public final void afterTextChanged(Editable editable) {
        int i;
        TextInputLayout textInputLayout = this.y;
        textInputLayout.w(!textInputLayout.X0, false);
        if (textInputLayout.H) {
            textInputLayout.p(editable);
        }
        if (textInputLayout.P) {
            textInputLayout.x(editable);
        }
        EditText editText = this.x;
        int lineCount = editText.getLineCount();
        int i2 = this.w;
        if (lineCount != i2) {
            if (lineCount < i2 && editText.getMinimumHeight() != (i = textInputLayout.Q0)) {
                editText.setMinimumHeight(i);
            }
            this.w = lineCount;
        }
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
