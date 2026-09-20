package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: ke0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ke0 {
    public final /* synthetic */ int a;

    public /* synthetic */ ke0(int i) {
        this.a = i;
    }

    public final Object a(Object obj, v75 v75) {
        String authority;
        String str = "";
        switch (this.a) {
            case b85.b:
                return ByteBuffer.wrap((byte[]) obj);
            case 1:
                Uri uri = (Uri) obj;
                if (i.c(uri)) {
                    return null;
                }
                String scheme = uri.getScheme();
                if (scheme != null && !scheme.equals("file")) {
                    return null;
                }
                String path = uri.getPath();
                if (path != null) {
                    str = path;
                }
                if (!d57.a1(str, '/') || ((String) dt0.y0(uri.getPathSegments())) == null) {
                    return null;
                }
                if (!sg3.e(uri.getScheme(), "file")) {
                    return new File(uri.toString());
                }
                String path2 = uri.getPath();
                if (path2 != null) {
                    return new File(path2);
                }
                return null;
            case 2:
                return ((g73) obj).h;
            case 3:
                int intValue = ((Number) obj).intValue();
                Context context = v75.a;
                try {
                    if (context.getResources().getResourceEntryName(intValue) == null) {
                        return null;
                    }
                    return Uri.parse("android.resource://" + context.getPackageName() + '/' + intValue);
                } catch (Resources.NotFoundException unused) {
                    return null;
                }
            case 4:
                Uri uri2 = (Uri) obj;
                if (!sg3.e(uri2.getScheme(), "android.resource") || (authority = uri2.getAuthority()) == null || d57.I0(authority) || uri2.getPathSegments().size() != 2) {
                    return null;
                }
                String authority2 = uri2.getAuthority();
                if (authority2 != null) {
                    str = authority2;
                }
                Resources resourcesForApplication = v75.a.getPackageManager().getResourcesForApplication(str);
                List<String> pathSegments = uri2.getPathSegments();
                int identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), str);
                if (identifier != 0) {
                    return Uri.parse("android.resource://" + str + '/' + identifier);
                }
                ku4.k("Invalid android.resource URI: ", uri2);
                return null;
            default:
                return Uri.parse((String) obj);
        }
    }
}
