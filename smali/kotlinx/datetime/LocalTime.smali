.class public final Lkotlinx/datetime/LocalTime;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Ljava/lang/Comparable;
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Comparable<",
        "Lkotlinx/datetime/LocalTime;",
        ">;",
        "Ljava/io/Serializable;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0005\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u000e\u0008\u0007\u0018\u0000 ,2\u0008\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001-B\u0011\u0008\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006B-\u0008\u0016\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\u000cJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0017\u0010\u0016J\r\u0010\u0019\u001a\u00020\u0018\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u0012H\u0096\u0002\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\u001f\u0010\u0016J\u000f\u0010!\u001a\u00020 H\u0016\u00a2\u0006\u0004\u0008!\u0010\"J\u0018\u0010#\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0000H\u0096\u0002\u00a2\u0006\u0004\u0008#\u0010$R\u001a\u0010\u0004\u001a\u00020\u00038\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010%\u001a\u0004\u0008&\u0010\'R\u0011\u0010\u0008\u001a\u00020\u00078F\u00a2\u0006\u0006\u001a\u0004\u0008(\u0010\u0016R\u0011\u0010\t\u001a\u00020\u00078F\u00a2\u0006\u0006\u001a\u0004\u0008)\u0010\u0016R\u0011\u0010\n\u001a\u00020\u00078F\u00a2\u0006\u0006\u001a\u0004\u0008*\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\u00078F\u00a2\u0006\u0006\u001a\u0004\u0008+\u0010\u0016\u00a8\u0006."
    }
    d2 = {
        "Lkotlinx/datetime/LocalTime;",
        "",
        "Ljava/io/Serializable;",
        "Ljava/time/LocalTime;",
        "value",
        "<init>",
        "(Ljava/time/LocalTime;)V",
        "",
        "hour",
        "minute",
        "second",
        "nanosecond",
        "(IIII)V",
        "Ljava/io/ObjectInputStream;",
        "ois",
        "Lvs7;",
        "readObject",
        "(Ljava/io/ObjectInputStream;)V",
        "",
        "writeReplace",
        "()Ljava/lang/Object;",
        "toSecondOfDay",
        "()I",
        "toMillisecondOfDay",
        "",
        "toNanosecondOfDay",
        "()J",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "hashCode",
        "",
        "toString",
        "()Ljava/lang/String;",
        "compareTo",
        "(Lkotlinx/datetime/LocalTime;)I",
        "Ljava/time/LocalTime;",
        "getValue$kotlinx_datetime",
        "()Ljava/time/LocalTime;",
        "getHour",
        "getMinute",
        "getSecond",
        "getNanosecond",
        "Companion",
        "qa4",
        "kotlinx-datetime"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lkotlinx/serialization/Serializable;
    with = Lua4;
.end annotation


# static fields
.field public static final Companion:Lqa4;

.field private static final MAX:Lkotlinx/datetime/LocalTime;

.field private static final MIN:Lkotlinx/datetime/LocalTime;

.field private static final serialVersionUID:J


# instance fields
.field private final value:Ljava/time/LocalTime;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lqa4;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lkotlinx/datetime/LocalTime;->Companion:Lqa4;

    .line 7
    .line 8
    new-instance v0, Lkotlinx/datetime/LocalTime;

    .line 9
    .line 10
    invoke-static {}, Lpa4;->n()Ljava/time/LocalTime;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-direct {v0, v1}, Lkotlinx/datetime/LocalTime;-><init>(Ljava/time/LocalTime;)V

    .line 18
    .line 19
    .line 20
    sput-object v0, Lkotlinx/datetime/LocalTime;->MIN:Lkotlinx/datetime/LocalTime;

    .line 21
    .line 22
    new-instance v0, Lkotlinx/datetime/LocalTime;

    .line 23
    .line 24
    invoke-static {}, Lpa4;->y()Ljava/time/LocalTime;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    invoke-direct {v0, v1}, Lkotlinx/datetime/LocalTime;-><init>(Ljava/time/LocalTime;)V

    .line 32
    .line 33
    .line 34
    sput-object v0, Lkotlinx/datetime/LocalTime;->MAX:Lkotlinx/datetime/LocalTime;

    .line 35
    .line 36
    return-void
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
.end method

.method public constructor <init>(IIII)V
    .locals 0

    .line 1
    :try_start_0
    invoke-static {p1, p2, p3, p4}, Ljava/time/LocalTime;->of(IIII)Ljava/time/LocalTime;

    .line 2
    .line 3
    .line 4
    move-result-object p1
    :try_end_0
    .catch Ljava/time/DateTimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-direct {p0, p1}, Lkotlinx/datetime/LocalTime;-><init>(Ljava/time/LocalTime;)V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :catch_0
    move-exception p0

    .line 13
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 14
    .line 15
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V

    .line 16
    .line 17
    .line 18
    throw p1
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
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
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
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
.end method

.method public synthetic constructor <init>(IIIIILhl1;)V
    .locals 1

    and-int/lit8 p6, p5, 0x4

    const/4 v0, 0x0

    if-eqz p6, :cond_0

    move p3, v0

    :cond_0
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_1

    move p4, v0

    .line 19
    :cond_1
    invoke-direct {p0, p1, p2, p3, p4}, Lkotlinx/datetime/LocalTime;-><init>(IIII)V

    return-void
.end method

.method public constructor <init>(Ljava/time/LocalTime;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    iput-object p1, p0, Lkotlinx/datetime/LocalTime;->value:Ljava/time/LocalTime;

    return-void
.end method

.method public static final synthetic access$getMAX$cp()Lkotlinx/datetime/LocalTime;
    .locals 1

    .line 1
    sget-object v0, Lkotlinx/datetime/LocalTime;->MAX:Lkotlinx/datetime/LocalTime;

    .line 2
    .line 3
    return-object v0
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
.end method

.method public static final synthetic access$getMIN$cp()Lkotlinx/datetime/LocalTime;
    .locals 1

    .line 1
    sget-object v0, Lkotlinx/datetime/LocalTime;->MIN:Lkotlinx/datetime/LocalTime;

    .line 2
    .line 3
    return-object v0
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
.end method

.method private final readObject(Ljava/io/ObjectInputStream;)V
    .locals 0

    .line 1
    new-instance p0, Ljava/io/InvalidObjectException;

    .line 2
    .line 3
    const-string p1, "kotlinx.datetime.LocalTime must be deserialized via kotlinx.datetime.Ser"

    .line 4
    .line 5
    invoke-direct {p0, p1}, Ljava/io/InvalidObjectException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
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

.method private final writeReplace()Ljava/lang/Object;
    .locals 2

    .line 1
    new-instance v0, Lkl6;

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    invoke-direct {v0, v1, p0}, Lkl6;-><init>(ILjava/io/Serializable;)V

    .line 5
    .line 6
    .line 7
    return-object v0
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


# virtual methods
.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 13
    check-cast p1, Lkotlinx/datetime/LocalTime;

    invoke-virtual {p0, p1}, Lkotlinx/datetime/LocalTime;->compareTo(Lkotlinx/datetime/LocalTime;)I

    move-result p0

    return p0
.end method

.method public compareTo(Lkotlinx/datetime/LocalTime;)I
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lkotlinx/datetime/LocalTime;->value:Ljava/time/LocalTime;

    .line 5
    .line 6
    iget-object p1, p1, Lkotlinx/datetime/LocalTime;->value:Ljava/time/LocalTime;

    .line 7
    .line 8
    invoke-static {p0, p1}, Lpa4;->c(Ljava/time/LocalTime;Ljava/time/LocalTime;)I

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    return p0
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

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    if-eq p0, p1, :cond_1

    .line 2
    .line 3
    instance-of v0, p1, Lkotlinx/datetime/LocalTime;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object p0, p0, Lkotlinx/datetime/LocalTime;->value:Ljava/time/LocalTime;

    .line 8
    .line 9
    check-cast p1, Lkotlinx/datetime/LocalTime;

    .line 10
    .line 11
    iget-object p1, p1, Lkotlinx/datetime/LocalTime;->value:Ljava/time/LocalTime;

    .line 12
    .line 13
    invoke-static {p0, p1}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    if-eqz p0, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 p0, 0x0

    .line 21
    return p0

    .line 22
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 23
    return p0
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public final getHour()I
    .locals 0

    .line 1
    iget-object p0, p0, Lkotlinx/datetime/LocalTime;->value:Ljava/time/LocalTime;

    .line 2
    .line 3
    invoke-static {p0}, Lpa4;->C(Ljava/time/LocalTime;)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
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

.method public final getMinute()I
    .locals 0

    .line 1
    iget-object p0, p0, Lkotlinx/datetime/LocalTime;->value:Ljava/time/LocalTime;

    .line 2
    .line 3
    invoke-static {p0}, Lpa4;->x(Ljava/time/LocalTime;)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
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

.method public final getNanosecond()I
    .locals 0

    .line 1
    iget-object p0, p0, Lkotlinx/datetime/LocalTime;->value:Ljava/time/LocalTime;

    .line 2
    .line 3
    invoke-static {p0}, Lpa4;->B(Ljava/time/LocalTime;)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
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

.method public final getSecond()I
    .locals 0

    .line 1
    iget-object p0, p0, Lkotlinx/datetime/LocalTime;->value:Ljava/time/LocalTime;

    .line 2
    .line 3
    invoke-static {p0}, Lpa4;->b(Ljava/time/LocalTime;)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
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

.method public final getValue$kotlinx_datetime()Ljava/time/LocalTime;
    .locals 0

    .line 1
    iget-object p0, p0, Lkotlinx/datetime/LocalTime;->value:Ljava/time/LocalTime;

    .line 2
    .line 3
    return-object p0
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
.end method

.method public hashCode()I
    .locals 0

    .line 1
    iget-object p0, p0, Lkotlinx/datetime/LocalTime;->value:Ljava/time/LocalTime;

    .line 2
    .line 3
    invoke-static {p0}, Lpa4;->D(Ljava/time/LocalTime;)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
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

.method public final toMillisecondOfDay()I
    .locals 4

    .line 1
    iget-object p0, p0, Lkotlinx/datetime/LocalTime;->value:Ljava/time/LocalTime;

    .line 2
    .line 3
    invoke-static {p0}, Lpa4;->e(Ljava/time/LocalTime;)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    const-wide/32 v2, 0xf4240

    .line 8
    .line 9
    .line 10
    div-long/2addr v0, v2

    .line 11
    long-to-int p0, v0

    .line 12
    return p0
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

.method public final toNanosecondOfDay()J
    .locals 2

    .line 1
    iget-object p0, p0, Lkotlinx/datetime/LocalTime;->value:Ljava/time/LocalTime;

    .line 2
    .line 3
    invoke-static {p0}, Lpa4;->e(Ljava/time/LocalTime;)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
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

.method public final toSecondOfDay()I
    .locals 0

    .line 1
    iget-object p0, p0, Lkotlinx/datetime/LocalTime;->value:Ljava/time/LocalTime;

    .line 2
    .line 3
    invoke-static {p0}, Lq94;->e(Ljava/time/LocalTime;)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
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

.method public toString()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lkotlinx/datetime/LocalTime;->value:Ljava/time/LocalTime;

    .line 2
    .line 3
    invoke-static {p0}, Lq94;->h(Ljava/time/LocalTime;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    return-object p0
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
