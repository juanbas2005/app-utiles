package defpackage;

import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: hp5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class hp5 {
    public static final HashMap e = new HashMap();
    public final boolean a;
    public final File b;
    public final Lock c;
    public FileChannel d;

    public hp5(String str, File file, boolean z) {
        File file2;
        Lock lock;
        this.a = z;
        if (file != null) {
            file2 = new File(file, str.concat(".lck"));
        } else {
            file2 = null;
        }
        this.b = file2;
        HashMap hashMap = e;
        synchronized (hashMap) {
            try {
                Object obj = hashMap.get(str);
                if (obj == null) {
                    obj = new ReentrantLock();
                    hashMap.put(str, obj);
                }
                lock = (Lock) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.c = lock;
    }

    public final void a(boolean z) {
        this.c.lock();
        if (z) {
            File file = this.b;
            if (file != null) {
                try {
                    File parentFile = file.getParentFile();
                    if (parentFile != null) {
                        parentFile.mkdirs();
                    }
                    FileChannel channel = new FileOutputStream(file).getChannel();
                    channel.lock();
                    this.d = channel;
                } catch (IOException e2) {
                    this.d = null;
                    Log.w("SupportSQLiteLock", "Unable to grab file lock.", e2);
                }
            } else {
                throw new IOException("No lock directory was provided.");
            }
        }
    }

    public final void b() {
        try {
            FileChannel fileChannel = this.d;
            if (fileChannel != null) {
                fileChannel.close();
            }
        } catch (IOException unused) {
        }
        this.c.unlock();
    }
}
