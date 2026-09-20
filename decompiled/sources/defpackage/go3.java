package defpackage;

import java.io.Closeable;
import java.io.RandomAccessFile;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: go3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class go3 implements Closeable {
    public boolean w;
    public int x;
    public final ReentrantLock y = new ReentrantLock();
    public final RandomAccessFile z;

    public go3(RandomAccessFile randomAccessFile) {
        this.z = randomAccessFile;
    }

    /* JADX INFO: finally extract failed */
    public final wc2 a(long j) {
        ReentrantLock reentrantLock = this.y;
        reentrantLock.lock();
        try {
            if (!this.w) {
                this.x++;
                reentrantLock.unlock();
                return new wc2(this, j);
            }
            throw new IllegalStateException("closed");
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void close() {
        ReentrantLock reentrantLock = this.y;
        reentrantLock.lock();
        try {
            if (!this.w) {
                this.w = true;
                if (this.x != 0) {
                    reentrantLock.unlock();
                    return;
                }
                reentrantLock.unlock();
                synchronized (this) {
                    this.z.close();
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final long size() {
        long length;
        ReentrantLock reentrantLock = this.y;
        reentrantLock.lock();
        try {
            if (!this.w) {
                synchronized (this) {
                    length = this.z.length();
                }
                return length;
            }
            throw new IllegalStateException("closed");
        } finally {
            reentrantLock.unlock();
        }
    }
}
