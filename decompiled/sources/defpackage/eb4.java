package defpackage;

/* renamed from: eb4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class eb4 extends hb4 implements t05 {
    public final /* synthetic */ b0 A;
    public volatile kg5 z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public eb4(kb4 kb4, k3 k3Var, b0 b0Var) {
        super(kb4, k3Var);
        this.A = b0Var;
        if (kb4 != null) {
            this.z = null;
            return;
        }
        k(0);
        throw null;
    }

    public static /* synthetic */ void a(int i) {
        String str;
        int i2;
        Throwable th;
        if (i != 2) {
            str = "@NotNull method %s.%s must not return null";
        } else {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        }
        if (i != 2) {
            i2 = 2;
        } else {
            i2 = 3;
        }
        Object[] objArr = new Object[i2];
        if (i != 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
        } else {
            objArr[0] = "value";
        }
        if (i != 2) {
            objArr[1] = "recursionDetected";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
        }
        if (i == 2) {
            objArr[2] = "doPostCompute";
        }
        String format = String.format(str, objArr);
        if (i != 2) {
            th = new IllegalStateException(format);
        } else {
            th = new IllegalArgumentException(format);
        }
        throw th;
    }

    public static /* synthetic */ void k(int i) {
        String str;
        int i2;
        Throwable th;
        if (i != 2) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i != 2) {
            i2 = 3;
        } else {
            i2 = 2;
        }
        Object[] objArr = new Object[i2];
        if (i == 1) {
            objArr[0] = "computable";
        } else if (i != 2) {
            objArr[0] = "storageManager";
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
        }
        if (i != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
        } else {
            objArr[1] = "invoke";
        }
        if (i != 2) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i != 2) {
            th = new IllegalArgumentException(format);
        } else {
            th = new IllegalStateException(format);
        }
        throw th;
    }

    public final Object b() {
        Object obj;
        kg5 kg5 = this.z;
        if (kg5 == null || ((Thread) kg5.y) != Thread.currentThread()) {
            obj = super.b();
        } else if (((Thread) kg5.y) == Thread.currentThread()) {
            obj = kg5.x;
        } else {
            h.s("No value in this thread (hasValue should be checked before)");
            obj = null;
        }
        if (obj != null) {
            return obj;
        }
        k(2);
        throw null;
    }

    public final void e(Object obj) {
        this.z = new kg5(obj);
        if (obj != null) {
            try {
                this.A.y(obj);
            } finally {
                this.z = null;
            }
        } else {
            a(2);
            throw null;
        }
    }

    public final v70 f(boolean z2) {
        return new v70(6, new m3(sg3.D(z62.d)), false);
    }
}
