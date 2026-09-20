package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.google.android.material.button.MaterialButton;
import cu.lestebang.utiletecsa.R;

/* renamed from: eg4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class eg4 {
    public final MaterialButton a;
    public rq6 b;
    public h37 c;
    public v17 d;
    public c9 e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public PorterDuff.Mode l;
    public ColorStateList m;
    public ColorStateList n;
    public ColorStateList o;
    public ug4 p;
    public boolean q = false;
    public boolean r = false;
    public boolean s = false;
    public boolean t;
    public boolean u = true;
    public RippleDrawable v;
    public int w;

    public eg4(MaterialButton materialButton, rq6 rq6) {
        this.a = materialButton;
        this.b = rq6;
    }

    public final ug4 a(boolean z) {
        RippleDrawable rippleDrawable = this.v;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (ug4) ((LayerDrawable) ((InsetDrawable) this.v.getDrawable(0)).getDrawable()).getDrawable(z ^ true ? 1 : 0);
    }

    public final void b(int i2, int i3) {
        MaterialButton materialButton = this.a;
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = materialButton.getPaddingTop();
        int paddingEnd = materialButton.getPaddingEnd();
        int paddingBottom = materialButton.getPaddingBottom();
        int i4 = this.h;
        int i5 = this.i;
        this.i = i3;
        this.h = i2;
        if (!this.r) {
            c();
        }
        materialButton.setPaddingRelative(paddingStart, (paddingTop + i2) - i4, paddingEnd, (paddingBottom + i3) - i5);
    }

    public final void c() {
        int i2;
        ug4 ug4 = new ug4(this.b);
        h37 h37 = this.c;
        if (h37 != null) {
            ug4.o(h37);
        }
        v17 v17 = this.d;
        if (v17 != null) {
            ug4.l(v17);
        }
        c9 c9Var = this.e;
        if (c9Var != null) {
            ug4.Z = c9Var;
        }
        MaterialButton materialButton = this.a;
        ug4.k(materialButton.getContext());
        ug4.setTintList(this.m);
        PorterDuff.Mode mode = this.l;
        if (mode != null) {
            ug4.setTintMode(mode);
        }
        ColorStateList colorStateList = this.n;
        ug4.x.k = (float) this.k;
        ug4.invalidateSelf();
        sg4 sg4 = ug4.x;
        if (sg4.e != colorStateList) {
            sg4.e = colorStateList;
            ug4.onStateChange(ug4.getState());
        }
        ug4 ug42 = new ug4(this.b);
        h37 h372 = this.c;
        if (h372 != null) {
            ug42.o(h372);
        }
        v17 v172 = this.d;
        if (v172 != null) {
            ug42.l(v172);
        }
        ug42.setTint(0);
        float f2 = (float) this.k;
        if (this.q) {
            i2 = h49.z(materialButton, R.attr.colorSurface);
        } else {
            i2 = 0;
        }
        ug42.x.k = f2;
        ug42.invalidateSelf();
        ColorStateList valueOf = ColorStateList.valueOf(i2);
        sg4 sg42 = ug42.x;
        if (sg42.e != valueOf) {
            sg42.e = valueOf;
            ug42.onStateChange(ug42.getState());
        }
        ug4 ug43 = new ug4(this.b);
        this.p = ug43;
        h37 h373 = this.c;
        if (h373 != null) {
            ug43.o(h373);
        }
        v17 v173 = this.d;
        if (v173 != null) {
            this.p.l(v173);
        }
        this.p.setTint(-1);
        RippleDrawable rippleDrawable = new RippleDrawable(r86.a(this.o), new InsetDrawable(new LayerDrawable(new Drawable[]{ug42, ug4}), this.f, this.h, this.g, this.i), this.p);
        this.v = rippleDrawable;
        materialButton.setInternalBackground(rippleDrawable);
        ug4 a2 = a(false);
        if (a2 != null) {
            a2.m((float) this.w);
            a2.setState(materialButton.getDrawableState());
        }
    }

    public final void d() {
        fr6 fr6;
        ug4 a2 = a(false);
        if (a2 != null) {
            h37 h37 = this.c;
            if (h37 != null) {
                a2.o(h37);
            } else {
                a2.setShapeAppearanceModel(this.b);
            }
            v17 v17 = this.d;
            if (v17 != null) {
                a2.l(v17);
            }
        }
        ug4 a3 = a(true);
        if (a3 != null) {
            h37 h372 = this.c;
            if (h372 != null) {
                a3.o(h372);
            } else {
                a3.setShapeAppearanceModel(this.b);
            }
            v17 v172 = this.d;
            if (v172 != null) {
                a3.l(v172);
            }
        }
        RippleDrawable rippleDrawable = this.v;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 1) {
            fr6 = null;
        } else {
            int numberOfLayers = this.v.getNumberOfLayers();
            RippleDrawable rippleDrawable2 = this.v;
            if (numberOfLayers > 2) {
                fr6 = (fr6) rippleDrawable2.getDrawable(2);
            } else {
                fr6 = (fr6) rippleDrawable2.getDrawable(1);
            }
        }
        if (fr6 != null) {
            fr6.setShapeAppearanceModel(this.b);
            if (fr6 instanceof ug4) {
                ug4 ug4 = (ug4) fr6;
                h37 h373 = this.c;
                if (h373 != null) {
                    ug4.o(h373);
                }
                v17 v173 = this.d;
                if (v173 != null) {
                    ug4.l(v173);
                }
            }
        }
    }

    public final void e() {
        int i2 = 0;
        ug4 a2 = a(false);
        ug4 a3 = a(true);
        if (a2 != null) {
            ColorStateList colorStateList = this.n;
            a2.x.k = (float) this.k;
            a2.invalidateSelf();
            sg4 sg4 = a2.x;
            if (sg4.e != colorStateList) {
                sg4.e = colorStateList;
                a2.onStateChange(a2.getState());
            }
            if (a3 != null) {
                float f2 = (float) this.k;
                if (this.q) {
                    i2 = h49.z(this.a, R.attr.colorSurface);
                }
                a3.x.k = f2;
                a3.invalidateSelf();
                ColorStateList valueOf = ColorStateList.valueOf(i2);
                sg4 sg42 = a3.x;
                if (sg42.e != valueOf) {
                    sg42.e = valueOf;
                    a3.onStateChange(a3.getState());
                }
            }
        }
    }
}
