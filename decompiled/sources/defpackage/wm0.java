package defpackage;

import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;

/* renamed from: wm0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class wm0 extends Property {
    public final /* synthetic */ int a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wm0(int i, Class cls, String str) {
        super(cls, str);
        this.a = i;
    }

    public final Object get(Object obj) {
        switch (this.a) {
            case b85.b:
                zm0 zm0 = (zm0) obj;
                return null;
            case 1:
                zm0 zm02 = (zm0) obj;
                return null;
            case 2:
                View view = (View) obj;
                return null;
            case 3:
                View view2 = (View) obj;
                return null;
            case 4:
                View view3 = (View) obj;
                return null;
            case 5:
                return Float.valueOf(n68.a.s((View) obj));
            default:
                return ((View) obj).getClipBounds();
        }
    }

    public final void set(Object obj, Object obj2) {
        switch (this.a) {
            case b85.b:
                zm0 zm0 = (zm0) obj;
                PointF pointF = (PointF) obj2;
                zm0.getClass();
                zm0.a = Math.round(pointF.x);
                int round = Math.round(pointF.y);
                zm0.b = round;
                int i = zm0.f + 1;
                zm0.f = i;
                if (i == zm0.g) {
                    n68.a(zm0.e, zm0.a, round, zm0.c, zm0.d);
                    zm0.f = 0;
                    zm0.g = 0;
                    return;
                }
                return;
            case 1:
                zm0 zm02 = (zm0) obj;
                PointF pointF2 = (PointF) obj2;
                zm02.getClass();
                zm02.c = Math.round(pointF2.x);
                int round2 = Math.round(pointF2.y);
                zm02.d = round2;
                int i2 = zm02.g + 1;
                zm02.g = i2;
                if (zm02.f == i2) {
                    n68.a(zm02.e, zm02.a, zm02.b, zm02.c, round2);
                    zm02.f = 0;
                    zm02.g = 0;
                    return;
                }
                return;
            case 2:
                View view = (View) obj;
                PointF pointF3 = (PointF) obj2;
                n68.a(view, view.getLeft(), view.getTop(), Math.round(pointF3.x), Math.round(pointF3.y));
                return;
            case 3:
                View view2 = (View) obj;
                PointF pointF4 = (PointF) obj2;
                n68.a(view2, Math.round(pointF4.x), Math.round(pointF4.y), view2.getRight(), view2.getBottom());
                return;
            case 4:
                View view3 = (View) obj;
                PointF pointF5 = (PointF) obj2;
                int round3 = Math.round(pointF5.x);
                int round4 = Math.round(pointF5.y);
                n68.a(view3, round3, round4, view3.getWidth() + round3, view3.getHeight() + round4);
                return;
            case 5:
                float floatValue = ((Float) obj2).floatValue();
                n68.a.C((View) obj, floatValue);
                return;
            default:
                ((View) obj).setClipBounds((Rect) obj2);
                return;
        }
    }
}
