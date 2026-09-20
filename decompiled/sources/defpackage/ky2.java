package defpackage;

import android.adservices.measurement.MeasurementManager;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.SelectRangeGesture;

/* renamed from: ky2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract /* synthetic */ class ky2 {
    public static /* bridge */ /* synthetic */ boolean C(Object obj) {
        return obj instanceof DeleteRangeGesture;
    }

    public static /* bridge */ /* synthetic */ MeasurementManager e(Object obj) {
        return (MeasurementManager) obj;
    }

    public static /* bridge */ /* synthetic */ DeleteGesture n(Object obj) {
        return (DeleteGesture) obj;
    }

    public static /* bridge */ /* synthetic */ DeleteRangeGesture o(Object obj) {
        return (DeleteRangeGesture) obj;
    }

    public static /* bridge */ /* synthetic */ SelectRangeGesture p(Object obj) {
        return (SelectRangeGesture) obj;
    }

    public static /* bridge */ /* synthetic */ Class q() {
        return MeasurementManager.class;
    }

    public static /* bridge */ /* synthetic */ boolean y(Object obj) {
        return obj instanceof SelectRangeGesture;
    }
}
