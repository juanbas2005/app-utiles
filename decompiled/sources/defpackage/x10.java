package defpackage;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.ServiceLoader;
import java.util.Set;

/* renamed from: x10  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class x10 implements sr2 {
    public static final x10 A = new x10(3);
    public static final x10 B = new x10(4);
    public static final x10 C = new x10(5);
    public static final x10 D = new x10(6);
    public static final x10 E = new x10(7);
    public static final x10 F = new x10(8);
    public static final x10 G = new x10(9);
    public static final x10 H = new x10(10);
    public static final x10 I = new x10(11);
    public static final x10 J = new x10(12);
    public static final x10 K = new x10(13);
    public static final /* synthetic */ x10 L = new x10(15);
    public static final /* synthetic */ x10 M = new x10(16);
    public static final /* synthetic */ x10 N = new x10(17);
    public static final /* synthetic */ x10 O = new x10(18);
    public static final x10 x = new x10(0);
    public static final x10 y = new x10(1);
    public static final x10 z = new x10(2);
    public final /* synthetic */ int w;

    public x10(ze3 ze3) {
        this.w = 14;
    }

    public final Object b() {
        is1 is1;
        hs1 hs1;
        hs1 hs12;
        int i = this.w;
        int i2 = 0;
        Class<is1> cls = is1.class;
        Class cls2 = Void.TYPE;
        switch (i) {
            case b85.b:
                return new jt0(uq3.c(1308617531));
            case 1:
                od0 od0 = od0.a;
                Class<pd0> cls3 = pd0.class;
                ServiceLoader<S> load = ServiceLoader.load(cls3, cls3.getClassLoader());
                load.getClass();
                pd0 pd0 = (pd0) dt0.x0(load);
                if (pd0 != null) {
                    return pd0;
                }
                h.s("No BuiltInsLoader implementation was found. Please ensure that the META-INF/services/ is not stripped from your application and that the Java virtual machine is not running under a security manager");
                return null;
            case 2:
                return new jt0(jt0.b);
            case 3:
                fv3 fv3 = new fv3(new kb4("DefaultBuiltIns"));
                fv3.c();
                return fv3;
            case 4:
                yr3[] yr3Arr = or1.E;
                cls2.getClass();
                return cls2;
            case 5:
                d63 d63 = is1.c;
                Field[] fields = cls.getFields();
                fields.getClass();
                ArrayList arrayList = new ArrayList();
                int length = fields.length;
                while (i2 < length) {
                    Field field = fields[i2];
                    if (Modifier.isStatic(field.getModifiers())) {
                        arrayList.add(field);
                    }
                    i2++;
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Field field2 = (Field) it.next();
                    Object obj = field2.get((Object) null);
                    if (obj instanceof is1) {
                        is1 = (is1) obj;
                    } else {
                        is1 = null;
                    }
                    if (is1 != null) {
                        int i3 = is1.b;
                        String name = field2.getName();
                        name.getClass();
                        hs1 = new hs1(i3, name);
                    } else {
                        hs1 = null;
                    }
                    if (hs1 != null) {
                        arrayList2.add(hs1);
                    }
                }
                return arrayList2;
            case 6:
                d63 d632 = is1.c;
                Field[] fields2 = cls.getFields();
                fields2.getClass();
                ArrayList arrayList3 = new ArrayList();
                int length2 = fields2.length;
                while (i2 < length2) {
                    Field field3 = fields2[i2];
                    if (Modifier.isStatic(field3.getModifiers())) {
                        arrayList3.add(field3);
                    }
                    i2++;
                }
                ArrayList arrayList4 = new ArrayList();
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    Object next = it2.next();
                    if (sg3.e(((Field) next).getType(), Integer.TYPE)) {
                        arrayList4.add(next);
                    }
                }
                ArrayList arrayList5 = new ArrayList();
                Iterator it3 = arrayList4.iterator();
                while (it3.hasNext()) {
                    Field field4 = (Field) it3.next();
                    Object obj2 = field4.get((Object) null);
                    obj2.getClass();
                    int intValue = ((Integer) obj2).intValue();
                    if (intValue == ((-intValue) & intValue)) {
                        String name2 = field4.getName();
                        name2.getClass();
                        hs12 = new hs1(intValue, name2);
                    } else {
                        hs12 = null;
                    }
                    if (hs12 != null) {
                        arrayList5.add(hs12);
                    }
                }
                return arrayList5;
            case 7:
                Set set = kt1.b;
                return a42.w;
            case 8:
                p62 p62 = p62.w;
                return (gl1) gl1.f.getValue();
            case 9:
                return null;
            case 10:
                yr3[] yr3Arr2 = mi3.g;
                Map singletonMap = Collections.singletonMap(bi3.a, new e21("Deprecated in Java"));
                singletonMap.getClass();
                return singletonMap;
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER:
                mk4 mk4 = mk4.a;
                Class<nk4> cls4 = nk4.class;
                ServiceLoader<S> load2 = ServiceLoader.load(cls4, cls4.getClassLoader());
                load2.getClass();
                List b1 = dt0.b1(load2);
                if (!b1.isEmpty()) {
                    return b1;
                }
                h.s("No MetadataExtensions instances found in the classpath. Please ensure that the META-INF/services/ is not stripped from your application and that the Java virtual machine is not running under a security manager");
                return null;
            case 12:
                return "There is more input to consume";
            case ry4.PERF_SESSIONS_FIELD_NUMBER:
                as3 as3 = k27.a;
                cls2.getClass();
                return cls2;
            case 14:
                throw null;
            case h75.g:
                t37 t37 = lr8.a;
                throw new IllegalStateException("No ColorScheme provided! Ensure your content is wrapped in OssLicensesTheme.");
            case 16:
                t37 t372 = lr8.a;
                throw new IllegalStateException("No Typography provided!");
            case 17:
                e81 e81 = ey8.a;
                return n85.q((h81) t29.a.getValue());
            default:
                z97 z97 = t29.a;
                return za5.F(3);
        }
    }

    public /* synthetic */ x10(int i) {
        this.w = i;
    }
}
