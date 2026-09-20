package defpackage;

import android.os.ParcelFileDescriptor;
import androidx.datastore.core.NativeSharedCounter;
import java.io.File;

/* renamed from: sn4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class sn4 implements sr2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ xn4 x;

    public /* synthetic */ sn4(xn4 xn4, int i) {
        this.w = i;
        this.x = xn4;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0070  */
    public final Object b() {
        ParcelFileDescriptor parcelFileDescriptor;
        Throwable th;
        int i = this.w;
        xn4 xn4 = this.x;
        switch (i) {
            case b85.b:
                File file = new File(xn4.b.getAbsolutePath() + xn4.d);
                xn4.f(file);
                return file;
            default:
                kr6.a.getClass();
                File file2 = new File(xn4.b.getAbsolutePath() + xn4.e);
                xn4.f(file2);
                jr6 jr6 = null;
                try {
                    parcelFileDescriptor = ParcelFileDescriptor.open(file2, 939524096);
                    try {
                        parcelFileDescriptor.getClass();
                        NativeSharedCounter nativeSharedCounter = ir6.b;
                        if (nativeSharedCounter != null) {
                            int fd = parcelFileDescriptor.getFd();
                            if (nativeSharedCounter.nativeTruncateFile(fd) == 0) {
                                long nativeCreateSharedCounter = nativeSharedCounter.nativeCreateSharedCounter(fd);
                                if (nativeCreateSharedCounter >= 0) {
                                    jr6 = new jr6(nativeSharedCounter, nativeCreateSharedCounter);
                                } else {
                                    rf2.i("Failed to mmap counter file");
                                }
                            } else {
                                rf2.i("Failed to truncate counter file");
                            }
                        } else {
                            h.s("DataStore failed to load the native library to create SharedCounter.");
                        }
                        parcelFileDescriptor.close();
                        return jr6;
                    } catch (Throwable th2) {
                        th = th2;
                        if (parcelFileDescriptor != null) {
                            parcelFileDescriptor.close();
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    parcelFileDescriptor = null;
                    if (parcelFileDescriptor != null) {
                    }
                    throw th;
                }
        }
    }
}
