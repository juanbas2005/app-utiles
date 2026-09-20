package defpackage;

import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.view.View;
import android.widget.EditText;

/* renamed from: fr0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class fr0 implements View.OnClickListener {
    public final /* synthetic */ int w;
    public final /* synthetic */ Object x;

    public /* synthetic */ fr0(int i, Object obj) {
        this.w = i;
        this.x = obj;
    }

    public final void onClick(View view) {
        boolean z;
        int i = this.w;
        Object obj = this.x;
        switch (i) {
            case b85.b:
                jr0 jr0 = (jr0) obj;
                EditText editText = jr0.i;
                if (editText != null) {
                    Editable text = editText.getText();
                    if (text != null) {
                        text.clear();
                    }
                    jr0.p();
                    return;
                }
                return;
            case 1:
                ((n02) obj).t();
                return;
            case 2:
                ((pg4) obj).R();
                throw null;
            default:
                yd5 yd5 = (yd5) obj;
                EditText editText2 = yd5.f;
                if (editText2 != null) {
                    int selectionEnd = editText2.getSelectionEnd();
                    EditText editText3 = yd5.f;
                    if (editText3 == null || !(editText3.getTransformationMethod() instanceof PasswordTransformationMethod)) {
                        z = false;
                    } else {
                        z = true;
                    }
                    EditText editText4 = yd5.f;
                    if (z) {
                        editText4.setTransformationMethod((TransformationMethod) null);
                    } else {
                        editText4.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    }
                    if (selectionEnd >= 0) {
                        yd5.f.setSelection(selectionEnd);
                    }
                    yd5.p();
                    return;
                }
                return;
        }
    }
}
