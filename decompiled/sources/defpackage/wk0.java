package defpackage;

import android.graphics.SweepGradient;
import android.graphics.drawable.ColorStateListDrawable;
import android.graphics.drawable.Drawable;
import android.telephony.CellIdentityNr;
import android.telephony.CellInfo;
import android.telephony.CellInfoNr;
import android.telephony.CellSignalStrength;
import android.telephony.CellSignalStrengthNr;
import android.view.contentcapture.ContentCaptureSession;

/* renamed from: wk0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract /* synthetic */ class wk0 {
    public static /* synthetic */ SweepGradient f(float f, float f2, long[] jArr, float[] fArr) {
        return new SweepGradient(f, f2, jArr, fArr);
    }

    public static /* bridge */ /* synthetic */ ColorStateListDrawable g(Drawable drawable) {
        return (ColorStateListDrawable) drawable;
    }

    public static /* bridge */ /* synthetic */ CellIdentityNr i(Object obj) {
        return (CellIdentityNr) obj;
    }

    public static /* bridge */ /* synthetic */ CellInfoNr j(CellInfo cellInfo) {
        return (CellInfoNr) cellInfo;
    }

    public static /* bridge */ /* synthetic */ CellSignalStrengthNr l(CellSignalStrength cellSignalStrength) {
        return (CellSignalStrengthNr) cellSignalStrength;
    }

    public static /* bridge */ /* synthetic */ ContentCaptureSession m(Object obj) {
        return (ContentCaptureSession) obj;
    }

    public static /* bridge */ /* synthetic */ boolean u(Drawable drawable) {
        return drawable instanceof ColorStateListDrawable;
    }

    public static /* bridge */ /* synthetic */ boolean v(CellInfo cellInfo) {
        return cellInfo instanceof CellInfoNr;
    }

    public static /* bridge */ /* synthetic */ boolean w(CellSignalStrength cellSignalStrength) {
        return cellSignalStrength instanceof CellSignalStrengthNr;
    }

    public static /* bridge */ /* synthetic */ boolean x(Object obj) {
        return obj instanceof CellIdentityNr;
    }
}
