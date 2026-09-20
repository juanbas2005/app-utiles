package com.google.firebase.concurrent;

import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class ExecutorsRegistrar implements ComponentRegistrar {
    public static final oz3 a = new oz3(new aw0(1));
    public static final oz3 b = new oz3(new aw0(2));
    public static final oz3 c = new oz3(new aw0(3));
    public static final oz3 d = new oz3(new aw0(4));

    public final List getComponents() {
        Class<t30> cls = t30.class;
        Class<ScheduledExecutorService> cls2 = ScheduledExecutorService.class;
        av5 av5 = new av5(cls, cls2);
        Class<ExecutorService> cls3 = ExecutorService.class;
        Class<Executor> cls4 = Executor.class;
        av5[] av5Arr = {new av5(cls, cls3), new av5(cls, cls4)};
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(av5);
        for (av5 d2 : av5Arr) {
            h75.d("Null interface", d2);
        }
        Collections.addAll(hashSet, av5Arr);
        gv0 gv0 = new gv0((String) null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new ta1(14), hashSet3);
        Class<x90> cls5 = x90.class;
        av5 av52 = new av5(cls5, cls2);
        av5[] av5Arr2 = {new av5(cls5, cls3), new av5(cls5, cls4)};
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        HashSet hashSet6 = new HashSet();
        hashSet4.add(av52);
        for (av5 d3 : av5Arr2) {
            h75.d("Null interface", d3);
        }
        Collections.addAll(hashSet4, av5Arr2);
        gv0 gv02 = new gv0((String) null, new HashSet(hashSet4), new HashSet(hashSet5), 0, 0, new ta1(15), hashSet6);
        Class<d64> cls6 = d64.class;
        av5 av53 = new av5(cls6, cls2);
        av5[] av5Arr3 = {new av5(cls6, cls3), new av5(cls6, cls4)};
        HashSet hashSet7 = new HashSet();
        HashSet hashSet8 = new HashSet();
        HashSet hashSet9 = new HashSet();
        hashSet7.add(av53);
        for (av5 d4 : av5Arr3) {
            h75.d("Null interface", d4);
        }
        Collections.addAll(hashSet7, av5Arr3);
        ta1 ta1 = new ta1(16);
        HashSet hashSet10 = new HashSet(hashSet7);
        HashSet hashSet11 = new HashSet(hashSet8);
        fv0 a2 = gv0.a(new av5(js7.class, cls4));
        a2.g = new ta1(17);
        return Arrays.asList(new gv0[]{gv0, gv02, new gv0((String) null, hashSet10, hashSet11, 0, 0, ta1, hashSet9), a2.b()});
    }
}
