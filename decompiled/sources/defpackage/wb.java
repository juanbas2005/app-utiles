package defpackage;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.os.Handler;

/* renamed from: wb  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class wb implements SensorEventListener {
    public zj0 a;
    public Handler b;

    public final void onSensorChanged(SensorEvent sensorEvent) {
        Handler handler = this.b;
        float f = sensorEvent.values[0];
        if (f <= 45.0f) {
            handler.post(new vb(0, this, true));
        } else if (f >= 450.0f) {
            handler.post(new vb(0, this, false));
        }
    }

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }
}
