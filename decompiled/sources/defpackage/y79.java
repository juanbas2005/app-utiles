package defpackage;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import sun.misc.Unsafe;

/* renamed from: y79  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract /* synthetic */ class y79 {
    public static final /* synthetic */ Unsafe a = a();

    public static /* synthetic */ Unsafe a() {
        Field field;
        Field field2;
        try {
            field = Unsafe.class.getDeclaredField("theUnsafe");
        } catch (NoSuchFieldException e) {
            Field[] declaredFields = Unsafe.class.getDeclaredFields();
            int length = declaredFields.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    field2 = null;
                    break;
                }
                field2 = declaredFields[i];
                if (Modifier.isStatic(field2.getModifiers()) && Unsafe.class.isAssignableFrom(field2.getType())) {
                    break;
                }
                i++;
            }
            if (field2 == null) {
                field = field2;
            } else {
                throw new UnsupportedOperationException("Couldn't find the Unsafe", e);
            }
        }
        field.setAccessible(true);
        try {
            return (Unsafe) field.get((Object) null);
        } catch (Exception e2) {
            rf2.o(e2);
            return null;
        }
    }
}
