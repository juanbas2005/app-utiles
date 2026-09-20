package com.google.common.util.concurrent;

import java.util.Objects;

/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class CycleDetectingLockFactory$PotentialDeadlockException extends IllegalStateException {
    static {
        s93.s(3, fd1.class.getName(), "com.google.common.util.concurrent.CycleDetectingLockFactory$PotentialDeadlockException", ed1.class.getName());
    }

    public final String getMessage() {
        String message = super.getMessage();
        Objects.requireNonNull(message);
        StringBuilder sb = new StringBuilder(message);
        for (Throwable th = null; th != null; th = th.getCause()) {
            sb.append(", ");
            sb.append(th.getMessage());
        }
        return sb.toString();
    }
}
