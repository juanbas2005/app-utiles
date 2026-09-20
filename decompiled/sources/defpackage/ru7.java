package defpackage;

import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.net.Uri;

/* renamed from: ru7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ru7 implements dt3 {
    public final String a(Object obj, v75 v75) {
        Uri uri = (Uri) obj;
        if (!sg3.e(uri.getScheme(), "android.resource")) {
            return uri.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(uri);
        sb.append('-');
        Configuration configuration = v75.a.getResources().getConfiguration();
        Bitmap.Config[] configArr = i.a;
        sb.append(configuration.uiMode & 48);
        return sb.toString();
    }
}
