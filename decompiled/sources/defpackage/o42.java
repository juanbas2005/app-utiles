package defpackage;

import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* renamed from: o42  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class o42 {
    public final /* synthetic */ p42 a;

    public o42(p42 p42) {
        this.a = p42;
    }

    public final void a(TextInputLayout textInputLayout) {
        p42 p42 = this.a;
        n42 n42 = p42.R;
        if (p42.O != textInputLayout.getEditText()) {
            EditText editText = p42.O;
            if (editText != null) {
                editText.removeTextChangedListener(n42);
                if (p42.O.getOnFocusChangeListener() == p42.b().e()) {
                    p42.O.setOnFocusChangeListener((View.OnFocusChangeListener) null);
                }
            }
            EditText editText2 = textInputLayout.getEditText();
            p42.O = editText2;
            if (editText2 != null) {
                editText2.addTextChangedListener(n42);
            }
            p42.b().l(p42.O);
            p42.j(p42.b());
        }
    }
}
