package defpackage;

import java.util.concurrent.ConcurrentHashMap;

/* renamed from: fb4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class fb4 extends m70 {
    public final /* synthetic */ int A;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fb4(kb4 kb4, ConcurrentHashMap concurrentHashMap, vr2 vr2, int i) {
        super(kb4, concurrentHashMap, vr2, 3);
        this.A = i;
    }

    public static /* synthetic */ void a(int i) {
        String str;
        int i2;
        Throwable th;
        if (i != 3) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i != 3) {
            i2 = 3;
        } else {
            i2 = 2;
        }
        Object[] objArr = new Object[i2];
        if (i == 1) {
            objArr[0] = "map";
        } else if (i == 2) {
            objArr[0] = "computation";
        } else if (i != 3) {
            objArr[0] = "storageManager";
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
        }
        if (i != 3) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
        } else {
            objArr[1] = "computeIfAbsent";
        }
        if (i == 2) {
            objArr[2] = "computeIfAbsent";
        } else if (i != 3) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i != 3) {
            th = new IllegalArgumentException(format);
        } else {
            th = new IllegalStateException(format);
        }
        throw th;
    }

    public Object y(Object obj) {
        switch (this.A) {
            case 1:
                Object y = super.y(obj);
                if (y != null) {
                    return y;
                }
                throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", new Object[]{"kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunctionToNotNull", "invoke"}));
            default:
                return super.y(obj);
        }
    }
}
