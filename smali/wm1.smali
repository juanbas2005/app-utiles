.class public abstract Lwm1;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Ly25;


# static fields
.field public static final synthetic A:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;


# instance fields
.field private volatile synthetic top:J

.field public final w:I

.field public final x:I

.field public final y:Ljava/util/concurrent/atomic/AtomicReferenceArray;

.field public final z:[I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-class v0, Lwm1;

    .line 2
    .line 3
    const-string v1, "top"

    .line 4
    .line 5
    invoke-static {v0, v1}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sput-object v0, Lwm1;->A:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 10
    .line 11
    return-void
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public constructor <init>(I)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    if-lez p1, :cond_1

    .line 5
    .line 6
    const v0, 0x1fffffff

    .line 7
    .line 8
    .line 9
    if-gt p1, v0, :cond_0

    .line 10
    .line 11
    const-wide/16 v0, 0x0

    .line 12
    .line 13
    iput-wide v0, p0, Lwm1;->top:J

    .line 14
    .line 15
    mul-int/lit8 p1, p1, 0x4

    .line 16
    .line 17
    add-int/lit8 p1, p1, -0x1

    .line 18
    .line 19
    invoke-static {p1}, Ljava/lang/Integer;->highestOneBit(I)I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    mul-int/lit8 p1, p1, 0x2

    .line 24
    .line 25
    iput p1, p0, Lwm1;->w:I

    .line 26
    .line 27
    invoke-static {p1}, Ljava/lang/Integer;->numberOfLeadingZeros(I)I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    add-int/lit8 v0, v0, 0x1

    .line 32
    .line 33
    iput v0, p0, Lwm1;->x:I

    .line 34
    .line 35
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReferenceArray;

    .line 36
    .line 37
    add-int/lit8 p1, p1, 0x1

    .line 38
    .line 39
    invoke-direct {v0, p1}, Ljava/util/concurrent/atomic/AtomicReferenceArray;-><init>(I)V

    .line 40
    .line 41
    .line 42
    iput-object v0, p0, Lwm1;->y:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    .line 43
    .line 44
    new-array p1, p1, [I

    .line 45
    .line 46
    iput-object p1, p0, Lwm1;->z:[I

    .line 47
    .line 48
    return-void

    .line 49
    :cond_0
    const-string p0, "capacity should be less or equal to 536870911 but it is "

    .line 50
    .line 51
    invoke-static {p1, p0}, Lhl6;->k(ILjava/lang/String;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    invoke-static {p0}, Lh;->j(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    const/4 p0, 0x0

    .line 59
    throw p0

    .line 60
    :cond_1
    const-string p0, "capacity should be positive but it is "

    .line 61
    .line 62
    invoke-static {p1, p0}, Lhl6;->k(ILjava/lang/String;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    invoke-static {p0}, Lh;->j(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    const/4 p0, 0x0

    .line 70
    throw p0
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
.end method


# virtual methods
.method public a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    return-object p1
    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public final b()V
    .locals 1

    .line 1
    :cond_0
    invoke-virtual {p0}, Lwm1;->l()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final e0(Ljava/lang/Object;)V
    .locals 10

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const v1, -0x61c88647

    .line 9
    .line 10
    .line 11
    mul-int/2addr v0, v1

    .line 12
    iget v1, p0, Lwm1;->x:I

    .line 13
    .line 14
    ushr-int/2addr v0, v1

    .line 15
    add-int/lit8 v0, v0, 0x1

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    :goto_0
    const/16 v2, 0x8

    .line 19
    .line 20
    if-ge v1, v2, :cond_5

    .line 21
    .line 22
    iget-object v2, p0, Lwm1;->y:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    .line 23
    .line 24
    :goto_1
    const/4 v3, 0x0

    .line 25
    invoke-virtual {v2, v0, v3, p1}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->compareAndSet(ILjava/lang/Object;Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    if-eqz v3, :cond_2

    .line 30
    .line 31
    if-lez v0, :cond_1

    .line 32
    .line 33
    :goto_2
    iget-wide v6, p0, Lwm1;->top:J

    .line 34
    .line 35
    const/16 p1, 0x20

    .line 36
    .line 37
    shr-long v1, v6, p1

    .line 38
    .line 39
    const-wide v3, 0xffffffffL

    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    and-long/2addr v1, v3

    .line 45
    const-wide/16 v8, 0x1

    .line 46
    .line 47
    add-long/2addr v1, v8

    .line 48
    and-long/2addr v3, v6

    .line 49
    long-to-int v3, v3

    .line 50
    shl-long/2addr v1, p1

    .line 51
    int-to-long v4, v0

    .line 52
    or-long v8, v1, v4

    .line 53
    .line 54
    iget-object p1, p0, Lwm1;->z:[I

    .line 55
    .line 56
    aput v3, p1, v0

    .line 57
    .line 58
    sget-object v4, Lwm1;->A:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 59
    .line 60
    move-object v5, p0

    .line 61
    invoke-virtual/range {v4 .. v9}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    .line 62
    .line 63
    .line 64
    move-result p0

    .line 65
    if-eqz p0, :cond_0

    .line 66
    .line 67
    goto :goto_3

    .line 68
    :cond_0
    move-object p0, v5

    .line 69
    goto :goto_2

    .line 70
    :cond_1
    const-string p0, "index should be positive"

    .line 71
    .line 72
    invoke-static {p0}, Lh;->q(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    return-void

    .line 76
    :cond_2
    move-object v5, p0

    .line 77
    invoke-virtual {v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    if-eqz p0, :cond_4

    .line 82
    .line 83
    add-int/lit8 v0, v0, -0x1

    .line 84
    .line 85
    if-nez v0, :cond_3

    .line 86
    .line 87
    iget p0, v5, Lwm1;->w:I

    .line 88
    .line 89
    move v0, p0

    .line 90
    :cond_3
    add-int/lit8 v1, v1, 0x1

    .line 91
    .line 92
    move-object p0, v5

    .line 93
    goto :goto_0

    .line 94
    :cond_4
    move-object p0, v5

    .line 95
    goto :goto_1

    .line 96
    :cond_5
    :goto_3
    return-void
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
.end method

.method public abstract k()Ljava/lang/Object;
.end method

.method public final l()Ljava/lang/Object;
    .locals 10

    .line 1
    :goto_0
    iget-wide v2, p0, Lwm1;->top:J

    .line 2
    .line 3
    const-wide/16 v0, 0x0

    .line 4
    .line 5
    cmp-long v0, v2, v0

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    :goto_1
    move v6, v1

    .line 11
    move-object v1, p0

    .line 12
    goto :goto_2

    .line 13
    :cond_0
    const/16 v0, 0x20

    .line 14
    .line 15
    shr-long v4, v2, v0

    .line 16
    .line 17
    const-wide v6, 0xffffffffL

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    and-long/2addr v4, v6

    .line 23
    const-wide/16 v8, 0x1

    .line 24
    .line 25
    add-long/2addr v4, v8

    .line 26
    and-long/2addr v6, v2

    .line 27
    long-to-int v6, v6

    .line 28
    if-nez v6, :cond_1

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_1
    iget-object v1, p0, Lwm1;->z:[I

    .line 32
    .line 33
    aget v1, v1, v6

    .line 34
    .line 35
    shl-long/2addr v4, v0

    .line 36
    int-to-long v0, v1

    .line 37
    or-long/2addr v4, v0

    .line 38
    sget-object v0, Lwm1;->A:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 39
    .line 40
    move-object v1, p0

    .line 41
    invoke-virtual/range {v0 .. v5}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    .line 42
    .line 43
    .line 44
    move-result p0

    .line 45
    if-eqz p0, :cond_3

    .line 46
    .line 47
    :goto_2
    const/4 p0, 0x0

    .line 48
    if-nez v6, :cond_2

    .line 49
    .line 50
    return-object p0

    .line 51
    :cond_2
    iget-object v0, v1, Lwm1;->y:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    .line 52
    .line 53
    invoke-virtual {v0, v6, p0}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->getAndSet(ILjava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    return-object p0

    .line 58
    :cond_3
    move-object p0, v1

    .line 59
    goto :goto_0
    .line 60
    .line 61
    .line 62
    .line 63
.end method

.method public final s()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lwm1;->l()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Lwm1;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    invoke-virtual {p0}, Lwm1;->k()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method
