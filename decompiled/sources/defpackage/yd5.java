package defpackage;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import cu.lestebang.utiletecsa.R;

/* renamed from: yd5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class yd5 extends q42 {
    public final int e = R.drawable.design_password_eye;
    public EditText f;
    public final fr0 g = new fr0(3, this);

    public yd5(p42 p42, int i) {
        super(p42);
        if (i != 0) {
            this.e = i;
        }
    }

    public final void b() {
        p();
    }

    public final int c() {
        return R.string.password_toggle_content_description;
    }

    public final int d() {
        return this.e;
    }

    public final View.OnClickListener f() {
        return this.g;
    }

    public final boolean j() {
        return true;
    }

    public final boolean k() {
        boolean z;
        EditText editText = this.f;
        if (editText == null || !(editText.getTransformationMethod() instanceof PasswordTransformationMethod)) {
            z = false;
        } else {
            z = true;
        }
        return !z;
    }

    public final void l(EditText editText) {
        this.f = editText;
        p();
    }

    public final void q() {
        EditText editText = this.f;
        if (editText == null) {
            return;
        }
        if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
            this.f.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    public final void r() {
        EditText editText = this.f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
