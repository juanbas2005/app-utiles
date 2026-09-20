package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import java.lang.reflect.Field;

/* renamed from: z25  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class z25 extends lg8 implements y73 {
    public final Object e;

    public z25(Object obj) {
        super("com.google.android.gms.dynamic.IObjectWrapper", 2);
        this.e = obj;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [y73, gg8] */
    public static y73 L(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
        if (queryLocalInterface instanceof y73) {
            return (y73) queryLocalInterface;
        }
        return new gg8(iBinder, "com.google.android.gms.dynamic.IObjectWrapper", 2);
    }

    public static Object M(y73 y73) {
        if (y73 instanceof z25) {
            return ((z25) y73).e;
        }
        IBinder asBinder = y73.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int i = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i++;
                field = field2;
            }
        }
        if (i == 1) {
            z65.k(field);
            if (!field.isAccessible()) {
                field.setAccessible(true);
                try {
                    return field.get(asBinder);
                } catch (NullPointerException e2) {
                    throw new IllegalArgumentException("Binder object is null.", e2);
                } catch (IllegalAccessException e3) {
                    throw new IllegalArgumentException("Could not access the field in remoteBinder.", e3);
                }
            } else {
                h.q("IObjectWrapper declared field not private!");
                return null;
            }
        } else {
            int length = declaredFields.length;
            h.q(hl6.p(new StringBuilder(String.valueOf(length).length() + 53), "Unexpected number of IObjectWrapper declared fields: ", length));
            return null;
        }
    }
}
