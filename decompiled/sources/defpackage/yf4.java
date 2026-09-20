package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/* renamed from: yf4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class yf4 extends ArrayAdapter {
    public ColorStateList a;
    public ColorStateList b;
    public final /* synthetic */ zf4 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yf4(zf4 zf4, Context context, int i, String[] strArr) {
        super(context, i, strArr);
        this.c = zf4;
        a();
    }

    public final void a() {
        ColorStateList colorStateList;
        zf4 zf4 = this.c;
        ColorStateList colorStateList2 = zf4.H;
        ColorStateList colorStateList3 = null;
        if (colorStateList2 != null) {
            int[] iArr = {16842919};
            colorStateList = new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{colorStateList2.getColorForState(iArr, 0), 0});
        } else {
            colorStateList = null;
        }
        this.b = colorStateList;
        if (!(zf4.G == 0 || zf4.H == null)) {
            int[] iArr2 = {16843623, -16842919};
            int[] iArr3 = {16842913, -16842919};
            colorStateList3 = new ColorStateList(new int[][]{iArr3, iArr2, new int[0]}, new int[]{yt0.b(zf4.H.getColorForState(iArr3, 0), zf4.G), yt0.b(zf4.H.getColorForState(iArr2, 0), zf4.G), zf4.G});
        }
        this.a = colorStateList3;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        if (view2 instanceof TextView) {
            TextView textView = (TextView) view2;
            zf4 zf4 = this.c;
            RippleDrawable rippleDrawable = null;
            if (zf4.getText().toString().contentEquals(textView.getText()) && zf4.G != 0) {
                ColorDrawable colorDrawable = new ColorDrawable(zf4.G);
                if (this.b != null) {
                    colorDrawable.setTintList(this.a);
                    rippleDrawable = new RippleDrawable(this.b, colorDrawable, (Drawable) null);
                } else {
                    rippleDrawable = colorDrawable;
                }
            }
            textView.setBackground(rippleDrawable);
        }
        return view2;
    }
}
