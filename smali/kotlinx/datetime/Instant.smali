.class public final Lkotlinx/datetime/Instant;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Comparable<",
        "Lkotlinx/datetime/Instant;",
        ">;"
    }
.end annotation

.annotation runtime Lfq1;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u000f\u0008\u0007\u0018\u0000 )2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001*B\u0011\u0008\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0007\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0018\u0010\r\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\tH\u0087\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0018\u0010\u000f\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\tH\u0087\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000cJ\u0018\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0000H\u0087\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0018\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u0000H\u0097\u0002\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0016H\u0096\u0002\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0013H\u0016\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0017\u00a2\u0006\u0004\u0008\u001d\u0010\u001eR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u001f\u001a\u0004\u0008 \u0010!R\u001a\u0010%\u001a\u00020\u00068FX\u0087\u0004\u00a2\u0006\u000c\u0012\u0004\u0008#\u0010$\u001a\u0004\u0008\"\u0010\u0008R\u001a\u0010(\u001a\u00020\u00138FX\u0087\u0004\u00a2\u0006\u000c\u0012\u0004\u0008\'\u0010$\u001a\u0004\u0008&\u0010\u001b\u00a8\u0006+"
    }
    d2 = {
        "Lkotlinx/datetime/Instant;",
        "",
        "Ljava/time/Instant;",
        "value",
        "<init>",
        "(Ljava/time/Instant;)V",
        "",
        "toEpochMilliseconds",
        "()J",
        "Lu02;",
        "duration",
        "plus-LRDsOJo",
        "(J)Lkotlinx/datetime/Instant;",
        "plus",
        "minus-LRDsOJo",
        "minus",
        "other",
        "minus-5sfh64U",
        "(Lkotlinx/datetime/Instant;)J",
        "",
        "compareTo",
        "(Lkotlinx/datetime/Instant;)I",
        "",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "hashCode",
        "()I",
        "",
        "toString",
        "()Ljava/lang/String;",
        "Ljava/time/Instant;",
        "getValue$kotlinx_datetime",
        "()Ljava/time/Instant;",
        "getEpochSeconds",
        "getEpochSeconds$annotations",
        "()V",
        "epochSeconds",
        "getNanosecondsOfSecond",
        "getNanosecondsOfSecond$annotations",
        "nanosecondsOfSecond",
        "Companion",
        "pd3",
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
    with = Lxd3;
.end annotation


# static fields
.field public static final Companion:Lpd3;

.field private static final DISTANT_FUTURE:Lkotlinx/datetime/Instant;

.field private static final DISTANT_PAST:Lkotlinx/datetime/Instant;

.field private static final MAX:Lkotlinx/datetime/Instant;

.field private static final MIN:Lkotlinx/datetime/Instant;


# instance fields
.field private final value:Ljava/time/Instant;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lpd3;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lkotlinx/datetime/Instant;->Companion:Lpd3;

    .line 7
    .line 8
    new-instance v0, Lkotlinx/datetime/Instant;

    .line 9
    .line 10
    invoke-static {}, Lfb3;->u()Ljava/time/Instant;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-direct {v0, v1}, Lkotlinx/datetime/Instant;-><init>(Ljava/time/Instant;)V

    .line 18
    .line 19
    .line 20
    sput-object v0, Lkotlinx/datetime/Instant;->DISTANT_PAST:Lkotlinx/datetime/Instant;

    .line 21
    .line 22
    new-instance v0, Lkotlinx/datetime/Instant;

    .line 23
    .line 24
    invoke-static {}, Lfb3;->A()Ljava/time/Instant;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    invoke-direct {v0, v1}, Lkotlinx/datetime/Instant;-><init>(Ljava/time/Instant;)V

    .line 32
    .line 33
    .line 34
    sput-object v0, Lkotlinx/datetime/Instant;->DISTANT_FUTURE:Lkotlinx/datetime/Instant;

    .line 35
    .line 36
    new-instance v0, Lkotlinx/datetime/Instant;

    .line 37
    .line 38
    invoke-static {}, Lfb3;->C()Ljava/time/Instant;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    invoke-direct {v0, v1}, Lkotlinx/datetime/Instant;-><init>(Ljava/time/Instant;)V

    .line 46
    .line 47
    .line 48
    sput-object v0, Lkotlinx/datetime/Instant;->MIN:Lkotlinx/datetime/Instant;

    .line 49
    .line 50
    new-instance v0, Lkotlinx/datetime/Instant;

    .line 51
    .line 52
    invoke-static {}, Lfb3;->D()Ljava/time/Instant;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    invoke-direct {v0, v1}, Lkotlinx/datetime/Instant;-><init>(Ljava/time/Instant;)V

    .line 60
    .line 61
    .line 62
    sput-object v0, Lkotlinx/datetime/Instant;->MAX:Lkotlinx/datetime/Instant;

    .line 63
    .line 64
    return-void
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
.end method

.method public constructor <init>(Ljava/time/Instant;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lkotlinx/datetime/Instant;->value:Ljava/time/Instant;

    .line 8
    .line 9
    return-void
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

.method public static final synthetic access$getDISTANT_FUTURE$cp()Lkotlinx/datetime/Instant;
    .locals 1

    .line 1
    sget-object v0, Lkotlinx/datetime/Instant;->DISTANT_FUTURE:Lkotlinx/datetime/Instant;

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

.method public static final synthetic access$getDISTANT_PAST$cp()Lkotlinx/datetime/Instant;
    .locals 1

    .line 1
    sget-object v0, Lkotlinx/datetime/Instant;->DISTANT_PAST:Lkotlinx/datetime/Instant;

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

.method public static final synthetic access$getMAX$cp()Lkotlinx/datetime/Instant;
    .locals 1

    .line 1
    sget-object v0, Lkotlinx/datetime/Instant;->MAX:Lkotlinx/datetime/Instant;

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

.method public static final synthetic access$getMIN$cp()Lkotlinx/datetime/Instant;
    .locals 1

    .line 1
    sget-object v0, Lkotlinx/datetime/Instant;->MIN:Lkotlinx/datetime/Instant;

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

.method public static synthetic getEpochSeconds$annotations()V
    .locals 0
    .annotation runtime Lfq1;
    .end annotation

    .line 1
    return-void
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
.end method

.method public static synthetic getNanosecondsOfSecond$annotations()V
    .locals 0
    .annotation runtime Lfq1;
    .end annotation

    .line 1
    return-void
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
.end method


# virtual methods
.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 13
    check-cast p1, Lkotlinx/datetime/Instant;

    invoke-virtual {p0, p1}, Lkotlinx/datetime/Instant;->compareTo(Lkotlinx/datetime/Instant;)I

    move-result p0

    return p0
.end method

.method public compareTo(Lkotlinx/datetime/Instant;)I
    .locals 0
    .annotation runtime Lfq1;
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lkotlinx/datetime/Instant;->value:Ljava/time/Instant;

    .line 5
    .line 6
    iget-object p1, p1, Lkotlinx/datetime/Instant;->value:Ljava/time/Instant;

    .line 7
    .line 8
    invoke-static {p0, p1}, Lfb3;->b(Ljava/time/Instant;Ljava/time/Instant;)I

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
    instance-of v0, p1, Lkotlinx/datetime/Instant;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object p0, p0, Lkotlinx/datetime/Instant;->value:Ljava/time/Instant;

    .line 8
    .line 9
    check-cast p1, Lkotlinx/datetime/Instant;

    .line 10
    .line 11
    iget-object p1, p1, Lkotlinx/datetime/Instant;->value:Ljava/time/Instant;

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

.method public final getEpochSeconds()J
    .locals 2

    .line 1
    iget-object p0, p0, Lkotlinx/datetime/Instant;->value:Ljava/time/Instant;

    .line 2
    .line 3
    invoke-static {p0}, Lfb3;->e(Ljava/time/Instant;)J

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

.method public final getNanosecondsOfSecond()I
    .locals 0

    .line 1
    iget-object p0, p0, Lkotlinx/datetime/Instant;->value:Ljava/time/Instant;

    .line 2
    .line 3
    invoke-static {p0}, Lfb3;->a(Ljava/time/Instant;)I

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

.method public final getValue$kotlinx_datetime()Ljava/time/Instant;
    .locals 0

    .line 1
    iget-object p0, p0, Lkotlinx/datetime/Instant;->value:Ljava/time/Instant;

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
    iget-object p0, p0, Lkotlinx/datetime/Instant;->value:Ljava/time/Instant;

    .line 2
    .line 3
    invoke-static {p0}, Lfb3;->r(Ljava/time/Instant;)I

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

.method public final minus-5sfh64U(Lkotlinx/datetime/Instant;)J
    .locals 4
    .annotation runtime Lfq1;
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lu02;->x:Lxb4;

    .line 5
    .line 6
    iget-object v0, p0, Lkotlinx/datetime/Instant;->value:Ljava/time/Instant;

    .line 7
    .line 8
    invoke-static {v0}, Lfb3;->e(Ljava/time/Instant;)J

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    iget-object v2, p1, Lkotlinx/datetime/Instant;->value:Ljava/time/Instant;

    .line 13
    .line 14
    invoke-static {v2}, Lfb3;->e(Ljava/time/Instant;)J

    .line 15
    .line 16
    .line 17
    move-result-wide v2

    .line 18
    sub-long/2addr v0, v2

    .line 19
    sget-object v2, Ly02;->z:Ly02;

    .line 20
    .line 21
    invoke-static {v0, v1, v2}, Lgl0;->f0(JLy02;)J

    .line 22
    .line 23
    .line 24
    move-result-wide v0

    .line 25
    iget-object p0, p0, Lkotlinx/datetime/Instant;->value:Ljava/time/Instant;

    .line 26
    .line 27
    invoke-static {p0}, Lfb3;->a(Ljava/time/Instant;)I

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    iget-object p1, p1, Lkotlinx/datetime/Instant;->value:Ljava/time/Instant;

    .line 32
    .line 33
    invoke-static {p1}, Lfb3;->a(Ljava/time/Instant;)I

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    sub-int/2addr p0, p1

    .line 38
    sget-object p1, Ly02;->x:Ly02;

    .line 39
    .line 40
    invoke-static {p0, p1}, Lgl0;->e0(ILy02;)J

    .line 41
    .line 42
    .line 43
    move-result-wide p0

    .line 44
    invoke-static {v0, v1, p0, p1}, Lu02;->h(JJ)J

    .line 45
    .line 46
    .line 47
    move-result-wide p0

    .line 48
    return-wide p0
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
.end method

.method public final minus-LRDsOJo(J)Lkotlinx/datetime/Instant;
    .locals 0
    .annotation runtime Lfq1;
    .end annotation

    .line 1
    invoke-static {p1, p2}, Lu02;->l(J)J

    .line 2
    .line 3
    .line 4
    move-result-wide p1

    .line 5
    invoke-virtual {p0, p1, p2}, Lkotlinx/datetime/Instant;->plus-LRDsOJo(J)Lkotlinx/datetime/Instant;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
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

.method public final plus-LRDsOJo(J)Lkotlinx/datetime/Instant;
    .locals 4
    .annotation runtime Lfq1;
    .end annotation

    .line 1
    sget-object v0, Lu02;->x:Lxb4;

    .line 2
    .line 3
    sget-object v0, Ly02;->z:Ly02;

    .line 4
    .line 5
    invoke-static {p1, p2, v0}, Lu02;->j(JLy02;)J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    invoke-static {p1, p2}, Lu02;->f(J)I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    :try_start_0
    new-instance v3, Lkotlinx/datetime/Instant;

    .line 14
    .line 15
    iget-object p0, p0, Lkotlinx/datetime/Instant;->value:Ljava/time/Instant;

    .line 16
    .line 17
    invoke-static {p0, v0, v1}, Lfb3;->v(Ljava/time/Instant;J)Ljava/time/Instant;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    int-to-long v0, v2

    .line 22
    invoke-static {p0, v0, v1}, Lfb3;->l(Ljava/time/Instant;J)Ljava/time/Instant;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    invoke-direct {v3, p0}, Lkotlinx/datetime/Instant;-><init>(Ljava/time/Instant;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 30
    .line 31
    .line 32
    return-object v3

    .line 33
    :catch_0
    move-exception p0

    .line 34
    instance-of v0, p0, Ljava/lang/ArithmeticException;

    .line 35
    .line 36
    if-nez v0, :cond_1

    .line 37
    .line 38
    invoke-static {p0}, Lfb3;->p(Ljava/lang/Exception;)Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-eqz v0, :cond_0

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    throw p0

    .line 46
    :cond_1
    :goto_0
    const-wide/16 v0, 0x0

    .line 47
    .line 48
    cmp-long p0, p1, v0

    .line 49
    .line 50
    if-lez p0, :cond_2

    .line 51
    .line 52
    sget-object p0, Lkotlinx/datetime/Instant;->MAX:Lkotlinx/datetime/Instant;

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_2
    sget-object p0, Lkotlinx/datetime/Instant;->MIN:Lkotlinx/datetime/Instant;

    .line 56
    .line 57
    :goto_1
    return-object p0
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
.end method

.method public final toEpochMilliseconds()J
    .locals 2
    .annotation runtime Lfq1;
    .end annotation

    .line 1
    :try_start_0
    iget-object v0, p0, Lkotlinx/datetime/Instant;->value:Ljava/time/Instant;

    .line 2
    .line 3
    invoke-static {v0}, Lfb3;->t(Ljava/time/Instant;)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0
    :try_end_0
    .catch Ljava/lang/ArithmeticException; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    return-wide v0

    .line 8
    :catch_0
    iget-object p0, p0, Lkotlinx/datetime/Instant;->value:Ljava/time/Instant;

    .line 9
    .line 10
    invoke-static {}, Lrk0;->k()Ljava/time/Instant;

    .line 11
    .line 12
    .line 13
    invoke-static {p0}, Lfb3;->q(Ljava/time/Instant;)Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    if-eqz p0, :cond_0

    .line 18
    .line 19
    const-wide v0, 0x7fffffffffffffffL

    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const-wide/high16 v0, -0x8000000000000000L

    .line 26
    .line 27
    :goto_0
    return-wide v0
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
.end method

.method public toString()Ljava/lang/String;
    .locals 0
    .annotation runtime Lfq1;
    .end annotation

    .line 1
    iget-object p0, p0, Lkotlinx/datetime/Instant;->value:Ljava/time/Instant;

    .line 2
    .line 3
    invoke-static {p0}, Lfb3;->g(Ljava/time/Instant;)Ljava/lang/String;

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
