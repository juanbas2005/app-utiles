.class public final Lr33;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Loy6;


# instance fields
.field public A:I

.field public final w:Led0;

.field public x:I

.field public y:I

.field public z:I


# direct methods
.method public constructor <init>(Led0;)V
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
    iput-object p1, p0, Lr33;->w:Led0;

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


# virtual methods
.method public final Y(JLsc0;)J
    .locals 8

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    :goto_0
    iget v0, p0, Lr33;->z:I

    .line 5
    .line 6
    iget-object v1, p0, Lr33;->w:Led0;

    .line 7
    .line 8
    const-wide/16 v2, -0x1

    .line 9
    .line 10
    if-nez v0, :cond_4

    .line 11
    .line 12
    iget v0, p0, Lr33;->A:I

    .line 13
    .line 14
    int-to-long v4, v0

    .line 15
    invoke-interface {v1, v4, v5}, Led0;->skip(J)V

    .line 16
    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    iput v0, p0, Lr33;->A:I

    .line 20
    .line 21
    iget v0, p0, Lr33;->x:I

    .line 22
    .line 23
    and-int/lit8 v0, v0, 0x4

    .line 24
    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_0
    iget v0, p0, Lr33;->y:I

    .line 29
    .line 30
    invoke-static {v1}, Ldg8;->m(Led0;)I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    iput v2, p0, Lr33;->z:I

    .line 35
    .line 36
    invoke-interface {v1}, Led0;->readByte()B

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    and-int/lit16 v3, v3, 0xff

    .line 41
    .line 42
    invoke-interface {v1}, Led0;->readByte()B

    .line 43
    .line 44
    .line 45
    move-result v4

    .line 46
    and-int/lit16 v4, v4, 0xff

    .line 47
    .line 48
    iput v4, p0, Lr33;->x:I

    .line 49
    .line 50
    sget-object v4, Ls33;->z:Ljava/util/logging/Logger;

    .line 51
    .line 52
    sget-object v5, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    .line 53
    .line 54
    invoke-virtual {v4, v5}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    .line 55
    .line 56
    .line 57
    move-result v5

    .line 58
    if-eqz v5, :cond_1

    .line 59
    .line 60
    sget-object v5, Li33;->a:Ldg0;

    .line 61
    .line 62
    iget v5, p0, Lr33;->y:I

    .line 63
    .line 64
    iget v6, p0, Lr33;->x:I

    .line 65
    .line 66
    const/4 v7, 0x1

    .line 67
    invoke-static {v7, v5, v2, v3, v6}, Li33;->b(ZIIII)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    invoke-virtual {v4, v2}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    :cond_1
    invoke-interface {v1}, Led0;->readInt()I

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    const v2, 0x7fffffff

    .line 79
    .line 80
    .line 81
    and-int/2addr v1, v2

    .line 82
    iput v1, p0, Lr33;->y:I

    .line 83
    .line 84
    const/16 v2, 0x9

    .line 85
    .line 86
    if-ne v3, v2, :cond_3

    .line 87
    .line 88
    if-ne v1, v0, :cond_2

    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_2
    const-string p0, "TYPE_CONTINUATION streamId changed"

    .line 92
    .line 93
    invoke-static {p0}, Lrf2;->i(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    const-wide/16 p0, 0x0

    .line 97
    .line 98
    return-wide p0

    .line 99
    :cond_3
    new-instance p0, Ljava/io/IOException;

    .line 100
    .line 101
    new-instance p1, Ljava/lang/StringBuilder;

    .line 102
    .line 103
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 104
    .line 105
    .line 106
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    const-string p2, " != TYPE_CONTINUATION"

    .line 110
    .line 111
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    throw p0

    .line 122
    :cond_4
    int-to-long v4, v0

    .line 123
    invoke-static {p1, p2, v4, v5}, Ljava/lang/Math;->min(JJ)J

    .line 124
    .line 125
    .line 126
    move-result-wide p1

    .line 127
    invoke-interface {v1, p1, p2, p3}, Loy6;->Y(JLsc0;)J

    .line 128
    .line 129
    .line 130
    move-result-wide p1

    .line 131
    cmp-long p3, p1, v2

    .line 132
    .line 133
    if-nez p3, :cond_5

    .line 134
    .line 135
    :goto_1
    return-wide v2

    .line 136
    :cond_5
    iget p3, p0, Lr33;->z:I

    .line 137
    .line 138
    long-to-int v0, p1

    .line 139
    sub-int/2addr p3, v0

    .line 140
    iput p3, p0, Lr33;->z:I

    .line 141
    .line 142
    return-wide p1
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
.end method

.method public final close()V
    .locals 0

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

.method public final g()Lri7;
    .locals 0

    .line 1
    iget-object p0, p0, Lr33;->w:Led0;

    .line 2
    .line 3
    invoke-interface {p0}, Loy6;->g()Lri7;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
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
