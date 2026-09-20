package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import java.nio.ByteBuffer;

/* renamed from: r90  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class r90 implements jc2 {
    public final /* synthetic */ int a;
    public final v75 b;
    public final Object c;

    public /* synthetic */ r90(Object obj, v75 v75, int i) {
        this.a = i;
        this.c = obj;
        this.b = v75;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: type inference failed for: r8v3, types: [ed0, sc0, java.lang.Object] */
    public final Object a(f61 f61) {
        int i = this.a;
        pe1 pe1 = pe1.x;
        boolean z = false;
        Object obj = this.c;
        v75 v75 = this.b;
        switch (i) {
            case b85.b:
                return new pz1(new BitmapDrawable(v75.a.getResources(), (Bitmap) obj), false, pe1);
            case 1:
                ByteBuffer byteBuffer = (ByteBuffer) obj;
                try {
                    ? obj2 = new Object();
                    obj2.write(byteBuffer);
                    byteBuffer.position(0);
                    Context context = v75.a;
                    return new xy6(new ty6(obj2, (ie1) null), (String) null, pe1);
                } catch (Throwable th) {
                    byteBuffer.position(0);
                    throw th;
                }
            default:
                Drawable drawable = (Drawable) obj;
                Bitmap.Config[] configArr = i.a;
                if ((drawable instanceof VectorDrawable) || (drawable instanceof z28)) {
                    z = true;
                }
                if (z) {
                    drawable = new BitmapDrawable(v75.a.getResources(), su0.j(drawable, v75.b, v75.d, v75.e, v75.f));
                }
                return new pz1(drawable, z, pe1);
        }
    }
}
