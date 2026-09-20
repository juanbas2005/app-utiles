package defpackage;

import android.hardware.Camera;
import android.util.Log;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: uj0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class uj0 {
    public static final /* synthetic */ int a = 0;

    static {
        Pattern.compile(";");
    }

    public static String a(String str, List list, String... strArr) {
        StringBuilder q = b81.q("Requesting ", str, " value from among: ");
        q.append(Arrays.toString(strArr));
        Log.i("CameraConfiguration", q.toString());
        Log.i("CameraConfiguration", "Supported " + str + " values: " + list);
        if (list != null) {
            for (String str2 : strArr) {
                if (list.contains(str2)) {
                    Log.i("CameraConfiguration", "Can set " + str + " to: " + str2);
                    return str2;
                }
            }
        }
        Log.i("CameraConfiguration", "No supported values match");
        return null;
    }

    public static void b(Camera.Parameters parameters, boolean z) {
        String str;
        List<String> supportedFlashModes = parameters.getSupportedFlashModes();
        if (z) {
            str = a("flash mode", supportedFlashModes, "torch", "on");
        } else {
            str = a("flash mode", supportedFlashModes, "off");
        }
        if (str == null) {
            return;
        }
        if (str.equals(parameters.getFlashMode())) {
            Log.i("CameraConfiguration", "Flash mode already set to ".concat(str));
            return;
        }
        Log.i("CameraConfiguration", "Setting flash mode to ".concat(str));
        parameters.setFlashMode(str);
    }
}
