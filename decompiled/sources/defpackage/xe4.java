package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* renamed from: xe4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class xe4 implements Map.Entry, dr3 {
    public final ze4 w;
    public final int x;
    public final int y;

    public xe4(ze4 ze4, int i) {
        ze4.getClass();
        this.w = ze4;
        this.x = i;
        this.y = ze4.D;
    }

    public final void a() {
        if (this.w.D != this.y) {
            throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (!sg3.e(entry.getKey(), getKey()) || !sg3.e(entry.getValue(), getValue())) {
            return false;
        }
        return true;
    }

    public final Object getKey() {
        a();
        return this.w.w[this.x];
    }

    public final Object getValue() {
        a();
        Object[] objArr = this.w.x;
        objArr.getClass();
        return objArr[this.x];
    }

    public final int hashCode() {
        int i;
        Object key = getKey();
        int i2 = 0;
        if (key != null) {
            i = key.hashCode();
        } else {
            i = 0;
        }
        Object value = getValue();
        if (value != null) {
            i2 = value.hashCode();
        }
        return i ^ i2;
    }

    public final Object setValue(Object obj) {
        a();
        ze4 ze4 = this.w;
        ze4.c();
        Object[] objArr = ze4.x;
        if (objArr == null) {
            int length = ze4.w.length;
            if (length >= 0) {
                objArr = new Object[length];
                ze4.x = objArr;
            } else {
                h.q("capacity must be non-negative.");
                return null;
            }
        }
        int i = this.x;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getKey());
        sb.append('=');
        sb.append(getValue());
        return sb.toString();
    }
}
