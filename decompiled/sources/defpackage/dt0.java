package defpackage;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.Set;

/* renamed from: dt0  reason: default package */
public abstract class dt0 extends it0 {
    public static int A0(Iterable iterable, Object obj) {
        iterable.getClass();
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(obj);
        }
        int i = 0;
        for (Object next : iterable) {
            if (i < 0) {
                sg3.Z();
                throw null;
            } else if (sg3.e(obj, next)) {
                return i;
            } else {
                i++;
            }
        }
        return -1;
    }

    public static LinkedHashSet B0(Iterable iterable, Iterable iterable2) {
        Collection collection;
        iterable.getClass();
        iterable2.getClass();
        if (iterable2 instanceof Collection) {
            collection = (Collection) iterable2;
        } else {
            collection = b1(iterable2);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object next : iterable) {
            if (collection.contains(next)) {
                linkedHashSet.add(next);
            }
        }
        return linkedHashSet;
    }

    public static final void C0(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, vr2 vr2) {
        iterable.getClass();
        appendable.getClass();
        charSequence.getClass();
        charSequence2.getClass();
        charSequence3.getClass();
        appendable.append(charSequence2);
        int i = 0;
        for (Object next : iterable) {
            i++;
            if (i > 1) {
                appendable.append(charSequence);
            }
            g75.f(appendable, next, vr2);
        }
        appendable.append(charSequence3);
    }

    public static /* synthetic */ void D0(Iterable iterable, Appendable appendable, String str, String str2, String str3, vr2 vr2, int i) {
        String str4;
        String str5;
        if ((i & 2) != 0) {
            str = ", ";
        }
        String str6 = str;
        if ((i & 4) != 0) {
            str4 = "";
        } else {
            str4 = str2;
        }
        if ((i & 8) != 0) {
            str5 = "";
        } else {
            str5 = str3;
        }
        if ((i & 64) != 0) {
            vr2 = null;
        }
        C0(iterable, appendable, str6, str4, str5, "...", vr2);
    }

    public static String E0(Iterable iterable, String str, String str2, String str3, vr2 vr2, int i) {
        String str4;
        String str5;
        if ((i & 1) != 0) {
            str = ", ";
        }
        String str6 = str;
        if ((i & 2) != 0) {
            str4 = "";
        } else {
            str4 = str2;
        }
        if ((i & 4) != 0) {
            str5 = "";
        } else {
            str5 = str3;
        }
        if ((i & 32) != 0) {
            vr2 = null;
        }
        iterable.getClass();
        StringBuilder sb = new StringBuilder();
        C0(iterable, sb, str6, str4, str5, "...", vr2);
        return sb.toString();
    }

    public static Object F0(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof List) {
            return G0((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            while (it.hasNext()) {
                next = it.next();
            }
            return next;
        }
        kj6.i("Collection is empty.");
        return null;
    }

    public static Object G0(List list) {
        list.getClass();
        if (!list.isEmpty()) {
            return list.get(list.size() - 1);
        }
        kj6.i("List is empty.");
        return null;
    }

    public static Object H0(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static Comparable I0(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) < 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static ArrayList J0(List list, Object obj) {
        list.getClass();
        ArrayList arrayList = new ArrayList(et0.e0(list, 10));
        boolean z = false;
        for (Object next : list) {
            boolean z2 = true;
            if (!z && sg3.e(next, obj)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public static ArrayList K0(Iterable iterable, Iterable iterable2) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return M0((Collection) iterable, iterable2);
        }
        ArrayList arrayList = new ArrayList();
        it0.h0(arrayList, iterable);
        it0.h0(arrayList, iterable2);
        return arrayList;
    }

    public static ArrayList L0(Iterable iterable, Object obj) {
        if (iterable instanceof Collection) {
            return N0((Collection) iterable, obj);
        }
        ArrayList arrayList = new ArrayList();
        it0.h0(arrayList, iterable);
        arrayList.add(obj);
        return arrayList;
    }

    public static ArrayList M0(Collection collection, Iterable iterable) {
        collection.getClass();
        iterable.getClass();
        if (iterable instanceof Collection) {
            Collection collection2 = (Collection) iterable;
            ArrayList arrayList = new ArrayList(collection2.size() + collection.size());
            arrayList.addAll(collection);
            arrayList.addAll(collection2);
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(collection);
        it0.h0(arrayList2, iterable);
        return arrayList2;
    }

    public static ArrayList N0(Collection collection, Object obj) {
        collection.getClass();
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    public static List O0(Iterable iterable) {
        iterable.getClass();
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return b1(iterable);
        }
        List e1 = e1(iterable);
        Collections.reverse(e1);
        return e1;
    }

    public static Object P0(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof List) {
            return Q0((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (!it.hasNext()) {
                return next;
            }
            h.q("Collection has more than one element.");
            return null;
        }
        kj6.i("Collection is empty.");
        return null;
    }

    public static Object Q0(List list) {
        list.getClass();
        int size = list.size();
        if (size == 0) {
            kj6.i("List is empty.");
            return null;
        } else if (size == 1) {
            return list.get(0);
        } else {
            h.q("List has more than one element.");
            return null;
        }
    }

    public static Object R0(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.size() == 1) {
                return list.get(0);
            }
            return null;
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        if (it.hasNext()) {
            return null;
        }
        return next;
    }

    public static Object S0(List list) {
        list.getClass();
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    public static List T0(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= 1) {
                return b1(iterable);
            }
            Object[] array = collection.toArray(new Comparable[0]);
            Comparable[] comparableArr = (Comparable[]) array;
            comparableArr.getClass();
            if (comparableArr.length > 1) {
                Arrays.sort(comparableArr);
            }
            array.getClass();
            List asList = Arrays.asList(array);
            asList.getClass();
            return asList;
        }
        List e1 = e1(iterable);
        ht0.f0(e1);
        return e1;
    }

    public static List U0(Iterable iterable, Comparator comparator) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= 1) {
                return b1(iterable);
            }
            Object[] array = collection.toArray(new Object[0]);
            array.getClass();
            if (array.length > 1) {
                Arrays.sort(array, comparator);
            }
            List asList = Arrays.asList(array);
            asList.getClass();
            return asList;
        }
        List e1 = e1(iterable);
        ht0.g0(e1, comparator);
        return e1;
    }

    public static List V0(int i, List list) {
        list.getClass();
        if (i < 0) {
            h.j(pb4.i(i, "Requested element count ", " is less than zero."));
            return null;
        } else if (i == 0) {
            return a42.w;
        } else {
            if (i >= list.size()) {
                return b1(list);
            }
            if (i == 1) {
                return sg3.D(v0(list));
            }
            ArrayList arrayList = new ArrayList(i);
            int i2 = 0;
            for (Object add : list) {
                arrayList.add(add);
                i2++;
                if (i2 == i) {
                    break;
                }
            }
            return sg3.M(arrayList);
        }
    }

    public static List W0(int i, List list) {
        list.getClass();
        if (i < 0) {
            h.j(pb4.i(i, "Requested element count ", " is less than zero."));
            return null;
        } else if (i == 0) {
            return a42.w;
        } else {
            int size = list.size();
            if (i >= size) {
                return b1(list);
            }
            if (i == 1) {
                return sg3.D(G0(list));
            }
            ArrayList arrayList = new ArrayList(i);
            if (list instanceof RandomAccess) {
                for (int i2 = size - i; i2 < size; i2++) {
                    arrayList.add(list.get(i2));
                }
            } else {
                ListIterator listIterator = list.listIterator(size - i);
                while (listIterator.hasNext()) {
                    arrayList.add(listIterator.next());
                }
            }
            return arrayList;
        }
    }

    public static boolean[] X0(List list) {
        list.getClass();
        boolean[] zArr = new boolean[list.size()];
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            zArr[i] = ((Boolean) it.next()).booleanValue();
            i++;
        }
        return zArr;
    }

    public static final void Y0(Iterable iterable, AbstractCollection abstractCollection) {
        iterable.getClass();
        for (Object add : iterable) {
            abstractCollection.add(add);
        }
    }

    public static float[] Z0(Collection collection) {
        collection.getClass();
        float[] fArr = new float[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            fArr[i] = ((Number) it.next()).floatValue();
            i++;
        }
        return fArr;
    }

    public static int[] a1(List list) {
        list.getClass();
        int[] iArr = new int[list.size()];
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = ((Number) it.next()).intValue();
            i++;
        }
        return iArr;
    }

    public static List b1(Iterable iterable) {
        Object obj;
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            return sg3.M(e1(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return a42.w;
        }
        if (size != 1) {
            return new ArrayList(collection);
        }
        if (iterable instanceof List) {
            obj = ((List) iterable).get(0);
        } else {
            obj = collection.iterator().next();
        }
        return sg3.D(obj);
    }

    public static long[] c1(List list) {
        list.getClass();
        long[] jArr = new long[list.size()];
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            jArr[i] = ((Number) it.next()).longValue();
            i++;
        }
        return jArr;
    }

    public static ArrayList d1(Collection collection) {
        collection.getClass();
        return new ArrayList(collection);
    }

    public static final List e1(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return new ArrayList((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        Y0(iterable, arrayList);
        return arrayList;
    }

    public static Set f1(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Y0(iterable, linkedHashSet);
        return linkedHashSet;
    }

    public static Set g1(Iterable iterable) {
        Object obj;
        iterable.getClass();
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet(tf4.F(collection.size()));
                    Y0(iterable, linkedHashSet);
                    return linkedHashSet;
                }
                if (iterable instanceof List) {
                    obj = ((List) iterable).get(0);
                } else {
                    obj = collection.iterator().next();
                }
                return wn6.w(obj);
            }
        } else {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            Y0(iterable, linkedHashSet2);
            int size2 = linkedHashSet2.size();
            if (size2 != 0) {
                if (size2 != 1) {
                    return linkedHashSet2;
                }
                return wn6.w(linkedHashSet2.iterator().next());
            }
        }
        return g42.w;
    }

    public static ss h1(Iterable iterable) {
        iterable.getClass();
        return new ss(1, new zh(7, (Object) iterable));
    }

    public static ArrayList i1(List list, List list2) {
        list.getClass();
        list2.getClass();
        Iterator it = list.iterator();
        Iterator it2 = list2.iterator();
        ArrayList arrayList = new ArrayList(Math.min(et0.e0(list, 10), et0.e0(list2, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(new yb5(it.next(), it2.next()));
        }
        return arrayList;
    }

    public static final int m0(int i, List list) {
        if (i >= 0 && i <= list.size() - 1) {
            return (list.size() - 1) - i;
        }
        StringBuilder o = pb4.o(i, "Element index ", " must be in range [");
        o.append(new pe3(0, list.size() - 1, 1));
        o.append("].");
        throw new IndexOutOfBoundsException(o.toString());
    }

    public static final int n0(int i, List list) {
        if (i >= 0 && i <= list.size()) {
            return list.size() - i;
        }
        StringBuilder o = pb4.o(i, "Position index ", " must be in range [");
        o.append(new pe3(0, list.size(), 1));
        o.append("].");
        throw new IndexOutOfBoundsException(o.toString());
    }

    public static ts o0(Iterable iterable) {
        iterable.getClass();
        return new ts(1, iterable);
    }

    public static ArrayList p0(int i, List list) {
        Iterator it;
        int i2;
        list.getClass();
        if (i <= 0 || i <= 0) {
            h.j(pb4.i(i, "size ", " must be greater than zero."));
            return null;
        } else if (list instanceof RandomAccess) {
            int size = list.size();
            int i3 = size / i;
            if (size % i == 0) {
                i2 = 0;
            } else {
                i2 = 1;
            }
            ArrayList arrayList = new ArrayList(i3 + i2);
            int i4 = 0;
            while (i4 >= 0 && i4 < size) {
                int i5 = size - i4;
                if (i <= i5) {
                    i5 = i;
                }
                ArrayList arrayList2 = new ArrayList(i5);
                for (int i6 = 0; i6 < i5; i6++) {
                    arrayList2.add(list.get(i6 + i4));
                }
                arrayList.add(arrayList2);
                i4 += i;
            }
            return arrayList;
        } else {
            ArrayList arrayList3 = new ArrayList();
            Iterator it2 = list.iterator();
            it2.getClass();
            if (!it2.hasNext()) {
                it = z32.w;
            } else {
                it = t75.y(new ev6(i, i, it2, (f61) null));
            }
            while (it.hasNext()) {
                arrayList3.add((List) it.next());
            }
            return arrayList3;
        }
    }

    public static boolean q0(Iterable iterable, Object obj) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(obj);
        }
        if (A0(iterable, obj) >= 0) {
            return true;
        }
        return false;
    }

    public static List r0(Iterable iterable) {
        iterable.getClass();
        return b1(f1(iterable));
    }

    public static List s0(int i, List list) {
        list.getClass();
        if (i < 0) {
            h.j(pb4.i(i, "Requested element count ", " is less than zero."));
            return null;
        } else if (i == 0) {
            return b1(list);
        } else {
            int size = list.size() - i;
            if (size <= 0) {
                return a42.w;
            }
            if (size == 1) {
                return sg3.D(F0(list));
            }
            ArrayList arrayList = new ArrayList(size);
            if (list instanceof RandomAccess) {
                int size2 = list.size();
                while (i < size2) {
                    arrayList.add(list.get(i));
                    i++;
                }
            } else {
                ListIterator listIterator = list.listIterator(i);
                while (listIterator.hasNext()) {
                    arrayList.add(listIterator.next());
                }
            }
            return arrayList;
        }
    }

    public static List t0(int i, List list) {
        list.getClass();
        if (i >= 0) {
            int size = list.size() - i;
            if (size < 0) {
                size = 0;
            }
            return V0(size, list);
        }
        h.j(pb4.i(i, "Requested element count ", " is less than zero."));
        return null;
    }

    public static ArrayList u0(Collection collection) {
        collection.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object next : collection) {
            if (next != null) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public static Object v0(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof List) {
            return w0((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        kj6.i("Collection is empty.");
        return null;
    }

    public static Object w0(List list) {
        list.getClass();
        if (!list.isEmpty()) {
            return list.get(0);
        }
        kj6.i("List is empty.");
        return null;
    }

    public static Object x0(Iterable iterable) {
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return list.get(0);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        return it.next();
    }

    public static Object y0(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static Object z0(int i, List list) {
        list.getClass();
        if (i < 0 || i >= list.size()) {
            return null;
        }
        return list.get(i);
    }
}
