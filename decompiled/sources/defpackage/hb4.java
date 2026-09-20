package defpackage;

/* renamed from: hb4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class hb4 implements sr2 {
    public final kb4 w;
    public final sr2 x;
    public volatile Object y;

    public hb4(kb4 kb4, sr2 sr2) {
        if (kb4 != null) {
            this.y = jb4.w;
            this.w = kb4;
            this.x = sr2;
            return;
        }
        a(0);
        throw null;
    }

    public static /* synthetic */ void a(int i) {
        String str;
        int i2;
        Throwable th;
        if (i == 2 || i == 3) {
            str = "@NotNull method %s.%s must not return null";
        } else {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        }
        if (i == 2 || i == 3) {
            i2 = 2;
        } else {
            i2 = 3;
        }
        Object[] objArr = new Object[i2];
        if (i == 1) {
            objArr[0] = "computable";
        } else if (i == 2 || i == 3) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
        } else {
            objArr[0] = "storageManager";
        }
        if (i == 2) {
            objArr[1] = "recursionDetected";
        } else if (i != 3) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
        } else {
            objArr[1] = "renderDebugInformation";
        }
        if (!(i == 2 || i == 3)) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i == 2 || i == 3) {
            th = new IllegalStateException(format);
        } else {
            th = new IllegalArgumentException(format);
        }
        throw th;
    }

    public Object b() {
        Object b;
        jb4 jb4 = jb4.y;
        jb4 jb42 = jb4.x;
        Object obj = this.y;
        if (!(obj instanceof jb4)) {
            ye8.a(obj);
            return obj;
        }
        this.w.a.lock();
        try {
            Object obj2 = this.y;
            if (!(obj2 instanceof jb4)) {
                ye8.a(obj2);
                this.w.a.unlock();
                return obj2;
            }
            if (obj2 == jb42) {
                this.y = jb4;
                v70 f = f(true);
                if (!f.x) {
                    b = f.y;
                    this.w.a.unlock();
                    return b;
                }
            }
            if (obj2 == jb4) {
                v70 f2 = f(false);
                if (!f2.x) {
                    b = f2.y;
                    this.w.a.unlock();
                    return b;
                }
            }
            this.y = jb42;
            b = this.x.b();
            e(b);
            this.y = b;
            this.w.a.unlock();
            return b;
        } catch (Throwable th) {
            this.w.a.unlock();
            throw th;
        }
    }

    public v70 f(boolean z) {
        v70 d = this.w.d("in a lazy value", (Object) null);
        if (d != null) {
            return d;
        }
        a(2);
        throw null;
    }

    public void e(Object obj) {
    }
}
