package defpackage;

import android.content.Context;
import android.os.Process;
import com.google.firebase.sessions.ProcessData;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: dp5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class dp5 {
    public final Context a;
    public final z97 b = new z97(new cp5(this, 0));
    public final int c = Process.myPid();
    public final z97 d;
    public final z97 e;
    public boolean f;

    public dp5(Context context, q18 q18) {
        context.getClass();
        q18.getClass();
        this.a = context;
        this.d = new z97(new hx4(9, q18));
        this.e = new z97(new cp5(this, 1));
    }

    public final String a() {
        return (String) this.b.getValue();
    }

    public final Map b(Map map) {
        z97 z97 = this.d;
        if (map != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(map);
            linkedHashMap.put(a(), new ProcessData(Process.myPid(), (String) z97.getValue()));
            return sf4.b0(linkedHashMap);
        }
        Map singletonMap = Collections.singletonMap(a(), new ProcessData(Process.myPid(), (String) z97.getValue()));
        singletonMap.getClass();
        return singletonMap;
    }
}
