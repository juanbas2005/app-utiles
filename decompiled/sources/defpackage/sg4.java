package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: sg4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class sg4 extends Drawable.ConstantState {
    public rq6 a;
    public h37 b;
    public o22 c;
    public ColorStateList d = null;
    public ColorStateList e = null;
    public ColorStateList f = null;
    public PorterDuff.Mode g = PorterDuff.Mode.SRC_IN;
    public Rect h = null;
    public final float i = 1.0f;
    public float j = 1.0f;
    public float k;
    public int l = 255;
    public float m = 0.0f;
    public float n = 0.0f;
    public int o = 0;
    public int p = 0;
    public final Paint.Style q = Paint.Style.FILL_AND_STROKE;

    public sg4(sg4 sg4) {
        this.a = sg4.a;
        this.b = sg4.b;
        this.c = sg4.c;
        this.k = sg4.k;
        this.d = sg4.d;
        this.e = sg4.e;
        this.g = sg4.g;
        this.f = sg4.f;
        this.l = sg4.l;
        this.i = sg4.i;
        this.p = sg4.p;
        this.j = sg4.j;
        this.m = sg4.m;
        this.n = sg4.n;
        this.o = sg4.o;
        this.q = sg4.q;
        if (sg4.h != null) {
            this.h = new Rect(sg4.h);
        }
    }

    public final int getChangingConfigurations() {
        return 0;
    }

    public Drawable newDrawable() {
        ug4 ug4 = new ug4(this);
        ug4.B = true;
        ug4.C = true;
        return ug4;
    }

    public sg4(rq6 rq6) {
        this.a = rq6;
        this.c = null;
    }
}
