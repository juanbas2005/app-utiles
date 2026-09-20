package defpackage;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: lh7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class lh7 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(lh7.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;
    public l72[] a;

    public final void a(l72 l72) {
        l72.d((m72) this);
        l72[] l72Arr = this.a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = b;
        if (l72Arr == null) {
            l72Arr = new l72[4];
            this.a = l72Arr;
        } else if (atomicIntegerFieldUpdater.get(this) >= l72Arr.length) {
            l72Arr = (l72[]) Arrays.copyOf(l72Arr, atomicIntegerFieldUpdater.get(this) * 2);
            this.a = l72Arr;
        }
        int i = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i + 1);
        l72Arr[i] = l72;
        l72.x = i;
        c(i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0060, code lost:
        if (r6.compareTo(r7) < 0) goto L_0x0064;
     */
    public final l72 b(int i) {
        l72[] l72Arr = this.a;
        l72Arr.getClass();
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = b;
        atomicIntegerFieldUpdater.set(this, atomicIntegerFieldUpdater.get(this) - 1);
        if (i < atomicIntegerFieldUpdater.get(this)) {
            d(i, atomicIntegerFieldUpdater.get(this));
            int i2 = (i - 1) / 2;
            if (i > 0) {
                l72 l72 = l72Arr[i];
                l72.getClass();
                l72 l722 = l72Arr[i2];
                l722.getClass();
                if (l72.compareTo(l722) < 0) {
                    d(i, i2);
                    c(i2);
                }
            }
            while (true) {
                int i3 = i * 2;
                int i4 = i3 + 1;
                if (i4 >= atomicIntegerFieldUpdater.get(this)) {
                    break;
                }
                l72[] l72Arr2 = this.a;
                l72Arr2.getClass();
                int i5 = i3 + 2;
                if (i5 < atomicIntegerFieldUpdater.get(this)) {
                    l72 l723 = l72Arr2[i5];
                    l723.getClass();
                    l72 l724 = l72Arr2[i4];
                    l724.getClass();
                }
                i5 = i4;
                l72 l725 = l72Arr2[i];
                l725.getClass();
                l72 l726 = l72Arr2[i5];
                l726.getClass();
                if (l725.compareTo(l726) <= 0) {
                    break;
                }
                d(i, i5);
                i = i5;
            }
        }
        l72 l727 = l72Arr[atomicIntegerFieldUpdater.get(this)];
        l727.getClass();
        l727.d((m72) null);
        l727.x = -1;
        l72Arr[atomicIntegerFieldUpdater.get(this)] = null;
        return l727;
    }

    public final void c(int i) {
        while (i > 0) {
            l72[] l72Arr = this.a;
            l72Arr.getClass();
            int i2 = (i - 1) / 2;
            l72 l72 = l72Arr[i2];
            l72.getClass();
            l72 l722 = l72Arr[i];
            l722.getClass();
            if (l72.compareTo(l722) > 0) {
                d(i, i2);
                i = i2;
            } else {
                return;
            }
        }
    }

    public final void d(int i, int i2) {
        l72[] l72Arr = this.a;
        l72Arr.getClass();
        l72 l72 = l72Arr[i2];
        l72.getClass();
        l72 l722 = l72Arr[i];
        l722.getClass();
        l72Arr[i] = l72;
        l72Arr[i2] = l722;
        l72.x = i;
        l722.x = i2;
    }
}
