package defpackage;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* renamed from: l32  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class l32 extends dh4 {
    public final TextView F;
    public final f32 G;
    public boolean H = true;

    public l32(TextView textView) {
        this.F = textView;
        this.G = new f32(textView);
    }

    public final void E(boolean z) {
        if (z) {
            L();
        }
    }

    public final void F(boolean z) {
        this.H = z;
        L();
        TextView textView = this.F;
        textView.setFilters(p(textView.getFilters()));
    }

    public final void L() {
        TextView textView = this.F;
        TransformationMethod transformationMethod = textView.getTransformationMethod();
        if (this.H) {
            if (!(transformationMethod instanceof p32) && !(transformationMethod instanceof PasswordTransformationMethod)) {
                transformationMethod = new p32(transformationMethod);
            }
        } else if (transformationMethod instanceof p32) {
            transformationMethod = ((p32) transformationMethod).w;
        }
        textView.setTransformationMethod(transformationMethod);
    }

    public final InputFilter[] p(InputFilter[] inputFilterArr) {
        if (!this.H) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i = 0; i < inputFilterArr.length; i++) {
                InputFilter inputFilter = inputFilterArr[i];
                if (inputFilter instanceof f32) {
                    sparseArray.put(i, inputFilter);
                }
            }
            if (sparseArray.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[(inputFilterArr.length - sparseArray.size())];
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                if (sparseArray.indexOfKey(i3) < 0) {
                    inputFilterArr2[i2] = inputFilterArr[i3];
                    i2++;
                }
            }
            return inputFilterArr2;
        }
        int length2 = inputFilterArr.length;
        int i4 = 0;
        while (true) {
            f32 f32 = this.G;
            if (i4 >= length2) {
                InputFilter[] inputFilterArr3 = new InputFilter[(inputFilterArr.length + 1)];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = f32;
                return inputFilterArr3;
            } else if (inputFilterArr[i4] == f32) {
                return inputFilterArr;
            } else {
                i4++;
            }
        }
    }
}
