package defpackage;

import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.util.Objects;

/* renamed from: sq7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class sq7 extends rq7 {
    public final Font t(dm2 dm2) {
        String str;
        Font d;
        Uri uri = dm2.a;
        boolean equals = Objects.equals(uri.getScheme(), "systemfont");
        String str2 = dm2.e;
        if (equals) {
            str = uri.getAuthority();
        } else {
            str = null;
        }
        if (str != null) {
            Typeface create = Typeface.create(str, 0);
            Typeface create2 = Typeface.create(Typeface.DEFAULT, 0);
            if (create == null || create.equals(create2)) {
                create = null;
            }
            if (!(create == null || (d = mq7.d(create)) == null)) {
                if (TextUtils.isEmpty(str2)) {
                    return d;
                }
                try {
                    return new Font.Builder(d).setFontVariationSettings(str2).build();
                } catch (IOException unused) {
                    Log.e("TypefaceCompatApi31Impl", "Failed to clone Font instance. Fall back to provider font.");
                    return null;
                }
            }
        }
        return null;
    }
}
