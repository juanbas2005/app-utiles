package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;

/* renamed from: ma9  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ma9 implements za9 {
    public final Context a;
    public final qa9 b = new Object();
    public final Object c = new Object();
    public String d;

    /* JADX WARNING: type inference failed for: r0v1, types: [qa9, java.lang.Object] */
    public ma9(z49 z49) {
        this.a = z49.x;
    }

    public final sa9 a(Uri uri) {
        if (!i(uri)) {
            File x = f55.x(h(uri));
            return new sa9(new FileInputStream(x), x);
        }
        throw new IOException("Android backend cannot perform remote operations without a remote backend");
    }

    public final boolean b(Uri uri) {
        if (!i(uri)) {
            return f55.x(h(uri)).exists();
        }
        throw new IOException("Android backend cannot perform remote operations without a remote backend");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00f6, code lost:
        r1 = new java.io.File(r10, android.text.TextUtils.join(java.io.File.separator, r2.subList(1, r2.size())));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x010d, code lost:
        if (defpackage.h49.W(r0) != false) goto L_0x0143;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x010f, code lost:
        r10 = r9.c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0111, code lost:
        monitor-enter(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0114, code lost:
        if (r9.d != null) goto L_0x012b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0116, code lost:
        r9.d = defpackage.j45.y(r0.createDeviceProtectedStorageContext()).getParentFile().getAbsolutePath();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0129, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x012b, code lost:
        r9 = r9.d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x012d, code lost:
        monitor-exit(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0136, code lost:
        if (r1.getAbsolutePath().startsWith(r9) == false) goto L_0x0139;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0140, code lost:
        throw new java.io.IOException("Cannot access credential-protected data from direct boot");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0142, code lost:
        throw r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0143, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0153, code lost:
        throw new java.io.IOException(java.lang.String.format("Path must start with a valid logical location: %s", new java.lang.Object[]{r10}));
     */
    public final File c(Uri uri) {
        File file;
        Account account;
        boolean z;
        if (!i(uri)) {
            Context context = this.a;
            if (!uri.getScheme().equals("android")) {
                throw new IOException("Scheme must be 'android'");
            } else if (uri.getPathSegments().isEmpty()) {
                throw new IOException(String.format("Path must start with a valid logical location: %s", new Object[]{uri}));
            } else if (TextUtils.isEmpty(uri.getQuery())) {
                ArrayList arrayList = new ArrayList(uri.getPathSegments());
                String str = (String) arrayList.get(0);
                switch (str.hashCode()) {
                    case -1820761141:
                        if (str.equals("external")) {
                            file = context.getExternalFilesDir((String) null);
                            break;
                        }
                        break;
                    case 94416770:
                        if (str.equals("cache")) {
                            file = context.getCacheDir();
                            break;
                        }
                        break;
                    case 97434231:
                        if (str.equals("files")) {
                            file = j45.y(context);
                            break;
                        }
                        break;
                    case 835260319:
                        if (str.equals("managed")) {
                            File file2 = new File(j45.y(context), "managed");
                            if (arrayList.size() >= 3) {
                                try {
                                    String str2 = (String) arrayList.get(2);
                                    Account account2 = la9.a;
                                    if ("shared".equals(str2)) {
                                        account = la9.a;
                                    } else {
                                        int indexOf = str2.indexOf(58);
                                        if (indexOf >= 0) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        l55.A(z, "Malformed account", new Object[0]);
                                        account = new Account(str2.substring(indexOf + 1), str2.substring(0, indexOf));
                                    }
                                    if (!la9.a.equals(account)) {
                                        throw new IOException("AccountManager cannot be null");
                                    }
                                } catch (IllegalArgumentException e) {
                                    throw new IOException(e);
                                }
                            }
                            file = file2;
                            break;
                        }
                        break;
                    case 988548496:
                        if (str.equals("directboot-cache")) {
                            file = context.createDeviceProtectedStorageContext().getCacheDir();
                            break;
                        }
                        break;
                    case 991565957:
                        if (str.equals("directboot-files")) {
                            file = context.createDeviceProtectedStorageContext().getFilesDir();
                            break;
                        }
                        break;
                }
            } else {
                throw new IOException("Did not expect uri to have query");
            }
        } else {
            rf2.i("operation is not permitted in other authorities.");
            return null;
        }
    }

    public final OutputStream d(Uri uri) {
        return this.b.d(h(uri));
    }

    public final void e(Uri uri) {
        this.b.e(h(uri));
    }

    public final void f(Uri uri, Uri uri2) {
        this.b.f(h(uri), h(uri2));
    }

    public final String g() {
        return "android";
    }

    public final Uri h(Uri uri) {
        if (!i(uri)) {
            File c2 = c(uri);
            Uri.Builder path = new Uri.Builder().scheme("file").authority("").path("/");
            m93 m93 = q93.x;
            ie1.z(4, "initialCapacity");
            path.path(c2.getAbsolutePath());
            return path.encodedFragment(wa9.a(q93.p(0, new Object[4]))).build();
        }
        throw new IOException("Operation across authorities is not allowed.");
    }

    public final boolean i(Uri uri) {
        if (TextUtils.isEmpty(uri.getAuthority()) || this.a.getPackageName().equals(uri.getAuthority())) {
            return false;
        }
        return true;
    }
}
