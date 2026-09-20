package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import android.widget.TextView;

/* renamed from: go  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class go {
    public ColorStateList a = null;
    public PorterDuff.Mode b = null;
    public boolean c = false;
    public boolean d = false;
    public boolean e;
    public final TextView f;

    public /* synthetic */ go(TextView textView) {
        this.f = textView;
    }

    public void a() {
        CompoundButton compoundButton = (CompoundButton) this.f;
        Drawable buttonDrawable = compoundButton.getButtonDrawable();
        if (buttonDrawable == null) {
            return;
        }
        if (this.c || this.d) {
            Drawable mutate = buttonDrawable.mutate();
            if (this.c) {
                mutate.setTintList(this.a);
            }
            if (this.d) {
                mutate.setTintMode(this.b);
            }
            if (mutate.isStateful()) {
                mutate.setState(compoundButton.getDrawableState());
            }
            compoundButton.setButtonDrawable(mutate);
        }
    }

    public void b() {
        fo foVar = (fo) this.f;
        Drawable checkMarkDrawable = foVar.getCheckMarkDrawable();
        if (checkMarkDrawable == null) {
            return;
        }
        if (this.c || this.d) {
            Drawable mutate = checkMarkDrawable.mutate();
            if (this.c) {
                mutate.setTintList(this.a);
            }
            if (this.d) {
                mutate.setTintMode(this.b);
            }
            if (mutate.isStateful()) {
                mutate.setState(foVar.getDrawableState());
            }
            foVar.setCheckMarkDrawable(mutate);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(13:0|1|2|(2:6|7)|10|11|(1:15)|16|(1:18)|19|(1:21)|22|23) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x003f */
    public void c(AttributeSet attributeSet, int i) {
        int resourceId;
        int resourceId2;
        CompoundButton compoundButton = (CompoundButton) this.f;
        Context context = compoundButton.getContext();
        int[] iArr = qv5.m;
        cf4 w = cf4.w(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) w.y;
        e58.l(compoundButton, compoundButton.getContext(), iArr, attributeSet, (TypedArray) w.y, i);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                compoundButton.setButtonDrawable(rc9.N(compoundButton.getContext(), resourceId2));
            }
            if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                compoundButton.setButtonDrawable(rc9.N(compoundButton.getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
                compoundButton.setButtonTintList(w.g(2));
            }
            if (typedArray.hasValue(3)) {
                compoundButton.setButtonTintMode(sz1.b(typedArray.getInt(3, -1), (PorterDuff.Mode) null));
            }
            w.A();
        } catch (Throwable th) {
            Throwable th2 = th;
            w.A();
            throw th2;
        }
    }
}
