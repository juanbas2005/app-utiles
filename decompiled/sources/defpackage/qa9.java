package defpackage;

import android.net.Uri;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: qa9  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class qa9 implements za9 {
    public final sa9 a(Uri uri) {
        File x = f55.x(uri);
        return new sa9(new FileInputStream(x), x);
    }

    public final boolean b(Uri uri) {
        return f55.x(uri).exists();
    }

    public final File c(Uri uri) {
        return f55.x(uri);
    }

    public final OutputStream d(Uri uri) {
        File x = f55.x(uri);
        uq3.q(x);
        return new ta9(new FileOutputStream(x), x);
    }

    public final void e(Uri uri) {
        File x = f55.x(uri);
        if (x.isDirectory()) {
            throw new FileNotFoundException(String.format("%s is a directory", new Object[]{uri}));
        } else if (x.delete()) {
        } else {
            if (!x.exists()) {
                throw new FileNotFoundException(String.format("%s does not exist", new Object[]{uri}));
            }
            throw new IOException(String.format("%s could not be deleted", new Object[]{uri}));
        }
    }

    public final void f(Uri uri, Uri uri2) {
        File x = f55.x(uri);
        File x2 = f55.x(uri2);
        uq3.q(x2);
        if (!x.renameTo(x2)) {
            throw new IOException(String.format("%s could not be renamed to %s", new Object[]{uri, uri2}));
        }
    }

    public final String g() {
        return "file";
    }
}
