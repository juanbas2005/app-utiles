package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* renamed from: mv0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class mv0 implements b55 {
    public final /* synthetic */ int a;
    public final /* synthetic */ rv0 b;

    public /* synthetic */ mv0(rv0 rv0, int i) {
        this.a = i;
        this.b = rv0;
    }

    public final void a(rv0 rv0) {
        int i = this.a;
        rv0 rv02 = this.b;
        switch (i) {
            case b85.b:
                rv0.getClass();
                Bundle i2 = ((kg5) rv02.z.y).i("android:support:activity-result");
                if (i2 != null) {
                    pv0 pv0 = rv02.E;
                    LinkedHashMap linkedHashMap = pv0.b;
                    LinkedHashMap linkedHashMap2 = pv0.a;
                    Bundle bundle = pv0.g;
                    ArrayList<Integer> integerArrayList = i2.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
                    ArrayList<String> stringArrayList = i2.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
                    if (stringArrayList != null && integerArrayList != null) {
                        ArrayList<String> stringArrayList2 = i2.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                        if (stringArrayList2 != null) {
                            pv0.d.addAll(stringArrayList2);
                        }
                        Bundle bundle2 = i2.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
                        if (bundle2 != null) {
                            bundle.putAll(bundle2);
                        }
                        int size = stringArrayList.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            String str = stringArrayList.get(i3);
                            if (linkedHashMap.containsKey(str)) {
                                Integer num = (Integer) linkedHashMap.remove(str);
                                if (!bundle.containsKey(str)) {
                                    mp7.O(linkedHashMap2).remove(num);
                                }
                            }
                            Integer num2 = integerArrayList.get(i3);
                            num2.getClass();
                            int intValue = num2.intValue();
                            String str2 = stringArrayList.get(i3);
                            str2.getClass();
                            String str3 = str2;
                            linkedHashMap2.put(Integer.valueOf(intValue), str3);
                            pv0.b.put(str3, Integer.valueOf(intValue));
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                dq2 dq2 = (dq2) ((eq2) rv02).R.x;
                dq2.O.b(dq2, dq2, (bq2) null);
                return;
        }
    }
}
