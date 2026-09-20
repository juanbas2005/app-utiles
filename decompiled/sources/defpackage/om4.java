package defpackage;

import android.os.Build;
import android.util.SparseBooleanArray;
import android.util.SparseLongArray;
import android.view.MotionEvent;
import java.util.ArrayList;

/* renamed from: om4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class om4 {
    public long a;
    public final SparseLongArray b = new SparseLongArray();
    public final SparseBooleanArray c = new SparseBooleanArray();
    public final ArrayList d = new ArrayList();
    public final vc4 e = new vc4((Object) null);
    public int f = -1;
    public int g = -1;
    public boolean h;
    public boolean i;
    public l35 j;

    public final void a(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        SparseLongArray sparseLongArray = this.b;
        if (actionMasked == 0 || actionMasked == 5) {
            int actionIndex = motionEvent.getActionIndex();
            int pointerId = motionEvent.getPointerId(actionIndex);
            if (sparseLongArray.indexOfKey(pointerId) < 0) {
                long j2 = this.a;
                this.a = 1 + j2;
                sparseLongArray.put(pointerId, j2);
                if (motionEvent.getToolType(actionIndex) == 3) {
                    this.c.put(pointerId, true);
                }
            }
        } else if (actionMasked == 9) {
            int pointerId2 = motionEvent.getPointerId(0);
            if (sparseLongArray.indexOfKey(pointerId2) < 0) {
                long j3 = this.a;
                this.a = 1 + j3;
                sparseLongArray.put(pointerId2, j3);
            }
        }
    }

    public final void b(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() == 1) {
            int toolType = motionEvent.getToolType(0);
            int source = motionEvent.getSource();
            if (toolType != this.f || source != this.g) {
                this.f = toolType;
                this.g = source;
                this.c.clear();
                this.b.clear();
            }
        }
    }

    public final kg5 c(MotionEvent motionEvent, je jeVar) {
        boolean z;
        boolean z2;
        int i2;
        boolean z3;
        boolean z4;
        boolean z5;
        int actionIndex;
        int actionMasked = motionEvent.getActionMasked();
        SparseBooleanArray sparseBooleanArray = this.c;
        if (actionMasked == 3 || actionMasked == 4) {
            this.b.clear();
            sparseBooleanArray.clear();
            this.h = false;
            this.i = false;
            this.j = null;
            return null;
        }
        b(motionEvent);
        a(motionEvent);
        if (actionMasked == 9 || actionMasked == 7 || actionMasked == 10) {
            z = true;
        } else {
            z = false;
        }
        if (actionMasked == 8) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z) {
            sparseBooleanArray.put(motionEvent.getPointerId(motionEvent.getActionIndex()), true);
        }
        if (actionMasked != 1) {
            if (actionMasked != 6) {
                actionIndex = -1;
            } else {
                actionIndex = motionEvent.getActionIndex();
            }
            i2 = actionIndex;
        } else {
            i2 = 0;
        }
        ArrayList arrayList = this.d;
        arrayList.clear();
        if (motionEvent.getActionMasked() == 0) {
            if (Build.VERSION.SDK_INT < 34 || !(motionEvent.getClassification() == 3 || motionEvent.getClassification() == 5)) {
                z4 = false;
            } else {
                z4 = true;
            }
            if (motionEvent.getButtonState() != 0 || (!motionEvent.isFromSource(8194) && !motionEvent.isFromSource(1048584))) {
                z5 = false;
            } else {
                z5 = true;
            }
            if (z4 || z5) {
                this.h = true;
            }
        }
        if (Build.VERSION.SDK_INT < 34 || motionEvent.getClassification() != 3) {
            this.i = false;
            int pointerCount = motionEvent.getPointerCount();
            for (int i3 = 0; i3 < pointerCount; i3++) {
                if (z || i3 == i2 || (z2 && motionEvent.getButtonState() == 0)) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                arrayList.add(d(jeVar, motionEvent, (l35) null, i3, z3));
            }
        } else {
            this.i = true;
            if (motionEvent.getActionMasked() == 0) {
                float a2 = motionEvent.getRawX(0);
                this.j = new l35((((long) Float.floatToRawIntBits(motionEvent.getRawY(0))) & 4294967295L) | (((long) Float.floatToRawIntBits(a2)) << 32));
            }
            arrayList.add(d(jeVar, motionEvent, this.j, 0, false));
        }
        if (motionEvent.getActionMasked() == 1) {
            this.h = false;
            this.i = false;
            this.j = null;
        }
        e(motionEvent);
        motionEvent.getEventTime();
        return new kg5(2, arrayList, motionEvent);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00b3, code lost:
        if (r1 != 4) goto L_0x00b5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x018a  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x01a9  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01c6  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01ca  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01db  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01fc  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0182 A[EDGE_INSN: B:81:0x0182->B:59:0x0182 ?: BREAK  , SYNTHETIC] */
    public final sk5 d(je jeVar, MotionEvent motionEvent, l35 l35, int i2, boolean z) {
        long j2;
        long j3;
        long j4;
        long j5;
        boolean z2;
        int toolType;
        int i3;
        int historySize;
        int i4;
        Float f2;
        long j6;
        float f3;
        long j7;
        int i5;
        long j8;
        float axisValue;
        int i6;
        long floatToRawIntBits;
        long G;
        je jeVar2 = jeVar;
        MotionEvent motionEvent2 = motionEvent;
        l35 l352 = l35;
        int i7 = i2;
        int pointerId = motionEvent2.getPointerId(i7);
        SparseLongArray sparseLongArray = this.b;
        int indexOfKey = sparseLongArray.indexOfKey(pointerId);
        if (indexOfKey >= 0) {
            j2 = sparseLongArray.valueAt(indexOfKey);
        } else {
            long j9 = this.a;
            this.a = 1 + j9;
            sparseLongArray.put(pointerId, j9);
            j2 = j9;
        }
        float pressure = motionEvent2.getPressure(i7);
        float x = motionEvent2.getX(i7);
        long floatToRawIntBits2 = (((long) Float.floatToRawIntBits(motionEvent2.getY(i7))) & 4294967295L) | (((long) Float.floatToRawIntBits(x)) << 32);
        if (i7 == 0) {
            if (l352 != null) {
                j5 = l352.a;
                z2 = true;
                j4 = 4294967295L;
            } else {
                float rawX = motionEvent2.getRawX();
                float rawY = motionEvent2.getRawY();
                long floatToRawIntBits3 = (long) Float.floatToRawIntBits(rawX);
                int floatToRawIntBits4 = Float.floatToRawIntBits(rawY);
                z2 = true;
                j4 = 4294967295L;
                j5 = (floatToRawIntBits3 << 32) | (((long) floatToRawIntBits4) & 4294967295L);
            }
            G = jeVar2.G(j5);
        } else {
            z2 = true;
            j4 = 4294967295L;
            if (Build.VERSION.SDK_INT >= 29) {
                if (l352 != null) {
                    floatToRawIntBits = l352.a;
                } else {
                    floatToRawIntBits = (((long) Float.floatToRawIntBits(motionEvent2.getRawX(i7))) << 32) | (((long) Float.floatToRawIntBits(motionEvent2.getRawY(i7))) & 4294967295L);
                }
                j5 = floatToRawIntBits;
                G = jeVar2.G(j5);
            } else {
                j5 = jeVar2.q(floatToRawIntBits2);
                j3 = floatToRawIntBits2;
                toolType = motionEvent2.getToolType(i7);
                if (toolType != 0) {
                    int i8 = 2;
                    if (toolType != 1) {
                        if (toolType == 2) {
                            i3 = 3;
                            ArrayList arrayList = new ArrayList(motionEvent2.getHistorySize());
                            historySize = motionEvent2.getHistorySize();
                            boolean z3 = z2;
                            i4 = 0;
                            while (true) {
                                f2 = null;
                                j6 = 0;
                                f3 = 1.0f;
                                if (i4 >= historySize) {
                                    break;
                                }
                                float historicalX = motionEvent2.getHistoricalX(i7, i4);
                                float historicalY = motionEvent2.getHistoricalY(i7, i4);
                                if ((Float.floatToRawIntBits(historicalX) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(historicalY) & Integer.MAX_VALUE) >= 2139095040) {
                                    i6 = historySize;
                                } else {
                                    long floatToRawIntBits5 = (long) Float.floatToRawIntBits(historicalX);
                                    int floatToRawIntBits6 = Float.floatToRawIntBits(historicalY);
                                    i6 = historySize;
                                    long j10 = (floatToRawIntBits5 << z3) | (((long) floatToRawIntBits6) & j4);
                                    long historicalEventTime = motionEvent2.getHistoricalEventTime(i4);
                                    float historicalAxisValue = motionEvent2.getHistoricalAxisValue(52, i7, i4);
                                    Float valueOf = Float.valueOf(historicalAxisValue);
                                    if (historicalAxisValue > 0.0f) {
                                        f2 = valueOf;
                                    }
                                    if (f2 != null) {
                                        f3 = f2.floatValue();
                                    }
                                    float f4 = f3;
                                    if (Build.VERSION.SDK_INT >= 29 && motionEvent2.getClassification() == 3) {
                                        j6 = (((long) Float.floatToRawIntBits(motionEvent2.getHistoricalAxisValue(50, i7, i4))) << z3) | (((long) Float.floatToRawIntBits(motionEvent2.getHistoricalAxisValue(51, i7, i4))) & j4);
                                    }
                                    arrayList.add(new b03(historicalEventTime, j10, f4, j6, j10));
                                }
                                i4++;
                                historySize = i6;
                            }
                            if (motionEvent2.getActionMasked() == 8) {
                                j7 = (((long) Float.floatToRawIntBits(motionEvent2.getAxisValue(10))) << z3) | (((long) Float.floatToRawIntBits((-motionEvent2.getAxisValue(9)) + 0.0f)) & j4);
                            } else {
                                j7 = 0;
                            }
                            i5 = Build.VERSION.SDK_INT;
                            if (i5 >= 29 && motionEvent2.getClassification() == 5) {
                                axisValue = motionEvent2.getAxisValue(52, i7);
                                Float valueOf2 = Float.valueOf(axisValue);
                                if (axisValue > 0.0f) {
                                    f2 = valueOf2;
                                }
                                if (f2 != null) {
                                    f3 = f2.floatValue();
                                }
                            }
                            float f5 = f3;
                            if (i5 < 29 || motionEvent2.getClassification() != 3) {
                                j8 = floatToRawIntBits2;
                            } else {
                                j8 = floatToRawIntBits2;
                                j6 = (((long) Float.floatToRawIntBits(motionEvent2.getAxisValue(50, i7))) << (z3 ? 1 : 0)) | (((long) Float.floatToRawIntBits(motionEvent2.getAxisValue(51, i7))) & j4);
                            }
                            long j11 = j6;
                            return new sk5(j2, motionEvent2.getEventTime(), j5, j3, z, pressure, i3, this.c.get(motionEvent2.getPointerId(i7), false), arrayList, j7, f5, j11, j8);
                        } else if (toolType != 3) {
                            i8 = 4;
                        }
                    } else if ((!motionEvent2.isFromSource(8194) && !motionEvent2.isFromSource(1048584)) || (this.h && !this.i)) {
                        i3 = 1;
                        ArrayList arrayList2 = new ArrayList(motionEvent2.getHistorySize());
                        historySize = motionEvent2.getHistorySize();
                        boolean z32 = z2;
                        i4 = 0;
                        while (true) {
                            f2 = null;
                            j6 = 0;
                            f3 = 1.0f;
                            if (i4 >= historySize) {
                            }
                            i4++;
                            historySize = i6;
                        }
                        if (motionEvent2.getActionMasked() == 8) {
                        }
                        i5 = Build.VERSION.SDK_INT;
                        axisValue = motionEvent2.getAxisValue(52, i7);
                        Float valueOf22 = Float.valueOf(axisValue);
                        if (axisValue > 0.0f) {
                        }
                        if (f2 != null) {
                        }
                        float f52 = f3;
                        if (i5 < 29 || motionEvent2.getClassification() != 3) {
                        }
                        long j112 = j6;
                        return new sk5(j2, motionEvent2.getEventTime(), j5, j3, z, pressure, i3, this.c.get(motionEvent2.getPointerId(i7), false), arrayList2, j7, f52, j112, j8);
                    }
                    i3 = i8;
                    ArrayList arrayList22 = new ArrayList(motionEvent2.getHistorySize());
                    historySize = motionEvent2.getHistorySize();
                    boolean z322 = z2;
                    i4 = 0;
                    while (true) {
                        f2 = null;
                        j6 = 0;
                        f3 = 1.0f;
                        if (i4 >= historySize) {
                        }
                        i4++;
                        historySize = i6;
                    }
                    if (motionEvent2.getActionMasked() == 8) {
                    }
                    i5 = Build.VERSION.SDK_INT;
                    axisValue = motionEvent2.getAxisValue(52, i7);
                    Float valueOf222 = Float.valueOf(axisValue);
                    if (axisValue > 0.0f) {
                    }
                    if (f2 != null) {
                    }
                    float f522 = f3;
                    if (i5 < 29 || motionEvent2.getClassification() != 3) {
                    }
                    long j1122 = j6;
                    return new sk5(j2, motionEvent2.getEventTime(), j5, j3, z, pressure, i3, this.c.get(motionEvent2.getPointerId(i7), false), arrayList22, j7, f522, j1122, j8);
                }
                i3 = 0;
                ArrayList arrayList222 = new ArrayList(motionEvent2.getHistorySize());
                historySize = motionEvent2.getHistorySize();
                boolean z3222 = z2;
                i4 = 0;
                while (true) {
                    f2 = null;
                    j6 = 0;
                    f3 = 1.0f;
                    if (i4 >= historySize) {
                    }
                    i4++;
                    historySize = i6;
                }
                if (motionEvent2.getActionMasked() == 8) {
                }
                i5 = Build.VERSION.SDK_INT;
                axisValue = motionEvent2.getAxisValue(52, i7);
                Float valueOf2222 = Float.valueOf(axisValue);
                if (axisValue > 0.0f) {
                }
                if (f2 != null) {
                }
                float f5222 = f3;
                if (i5 < 29 || motionEvent2.getClassification() != 3) {
                }
                long j11222 = j6;
                return new sk5(j2, motionEvent2.getEventTime(), j5, j3, z, pressure, i3, this.c.get(motionEvent2.getPointerId(i7), false), arrayList222, j7, f5222, j11222, j8);
            }
        }
        j3 = G;
        toolType = motionEvent2.getToolType(i7);
        if (toolType != 0) {
        }
        i3 = 0;
        ArrayList arrayList2222 = new ArrayList(motionEvent2.getHistorySize());
        historySize = motionEvent2.getHistorySize();
        boolean z32222 = z2;
        i4 = 0;
        while (true) {
            f2 = null;
            j6 = 0;
            f3 = 1.0f;
            if (i4 >= historySize) {
            }
            i4++;
            historySize = i6;
        }
        if (motionEvent2.getActionMasked() == 8) {
        }
        i5 = Build.VERSION.SDK_INT;
        axisValue = motionEvent2.getAxisValue(52, i7);
        Float valueOf22222 = Float.valueOf(axisValue);
        if (axisValue > 0.0f) {
        }
        if (f2 != null) {
        }
        float f52222 = f3;
        if (i5 < 29 || motionEvent2.getClassification() != 3) {
        }
        long j112222 = j6;
        return new sk5(j2, motionEvent2.getEventTime(), j5, j3, z, pressure, i3, this.c.get(motionEvent2.getPointerId(i7), false), arrayList2222, j7, f52222, j112222, j8);
    }

    public final void e(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        SparseBooleanArray sparseBooleanArray = this.c;
        SparseLongArray sparseLongArray = this.b;
        if (actionMasked == 1 || actionMasked == 6) {
            int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
            if (!sparseBooleanArray.get(pointerId, false)) {
                sparseLongArray.delete(pointerId);
                sparseBooleanArray.delete(pointerId);
            }
        }
        if (sparseLongArray.size() > motionEvent.getPointerCount()) {
            for (int size = sparseLongArray.size() - 1; -1 < size; size--) {
                int keyAt = sparseLongArray.keyAt(size);
                int pointerCount = motionEvent.getPointerCount();
                int i2 = 0;
                while (true) {
                    if (i2 >= pointerCount) {
                        sparseLongArray.removeAt(size);
                        sparseBooleanArray.delete(keyAt);
                        break;
                    } else if (motionEvent.getPointerId(i2) == keyAt) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
        }
    }
}
