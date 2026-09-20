package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.io.File;
import java.nio.ByteBuffer;

/* renamed from: zs  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class zs implements ic2 {
    public final /* synthetic */ int a;

    public /* synthetic */ zs(int i) {
        this.a = i;
    }

    public final jc2 a(Object obj, v75 v75) {
        switch (this.a) {
            case b85.b:
                Uri uri = (Uri) obj;
                if (!i.c(uri)) {
                    return null;
                }
                return new at(uri, v75, 0);
            case 1:
                return new r90((Bitmap) obj, v75, 0);
            case 2:
                return new r90((ByteBuffer) obj, v75, 1);
            case 3:
                Uri uri2 = (Uri) obj;
                if (!sg3.e(uri2.getScheme(), "content")) {
                    return null;
                }
                return new at(uri2, v75, 1);
            case 4:
                return new r90((Drawable) obj, v75, 2);
            case 5:
                return new vc2((File) obj);
            default:
                Uri uri3 = (Uri) obj;
                if (!sg3.e(uri3.getScheme(), "android.resource")) {
                    return null;
                }
                return new at(uri3, v75, 2);
        }
    }
}
