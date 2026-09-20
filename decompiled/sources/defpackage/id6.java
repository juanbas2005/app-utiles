package defpackage;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.util.Log;

/* renamed from: id6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class id6 {
    public final dc6 a;
    public boolean b;
    public boolean c;
    public final Paint d;
    public final Paint e;
    public sp4 f;
    public sp4 g;
    public boolean h;

    public id6(id6 id6) {
        this.b = id6.b;
        this.c = id6.c;
        this.d = new Paint(id6.d);
        this.e = new Paint(id6.e);
        sp4 sp4 = id6.f;
        if (sp4 != null) {
            this.f = new sp4(sp4);
        }
        sp4 sp42 = id6.g;
        if (sp42 != null) {
            this.g = new sp4(sp42);
        }
        this.h = id6.h;
        try {
            this.a = (dc6) id6.a.clone();
        } catch (CloneNotSupportedException e2) {
            Log.e("SVGAndroidRenderer", "Unexpected clone error", e2);
            this.a = dc6.a();
        }
    }

    public id6() {
        Paint paint = new Paint();
        this.d = paint;
        paint.setFlags(193);
        paint.setHinting(0);
        paint.setStyle(Paint.Style.FILL);
        Typeface typeface = Typeface.DEFAULT;
        paint.setTypeface(typeface);
        Paint paint2 = new Paint();
        this.e = paint2;
        paint2.setFlags(193);
        paint2.setHinting(0);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setTypeface(typeface);
        this.a = dc6.a();
    }
}
