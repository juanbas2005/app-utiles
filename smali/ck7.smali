.class public final Lck7;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lsl5;


# instance fields
.field public final w:I

.field public final x:J


# direct methods
.method public constructor <init>(JI)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p3, p0, Lck7;->w:I

    .line 5
    .line 6
    iput-wide p1, p0, Lck7;->x:J

    .line 7
    .line 8
    return-void
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
.end method


# virtual methods
.method public final y(Lse3;JLey3;J)J
    .locals 4

    .line 1
    iget p2, p1, Lse3;->a:I

    .line 2
    .line 3
    invoke-virtual {p1}, Lse3;->d()I

    .line 4
    .line 5
    .line 6
    move-result p3

    .line 7
    const/16 p4, 0x20

    .line 8
    .line 9
    shr-long v0, p5, p4

    .line 10
    .line 11
    long-to-int v0, v0

    .line 12
    sub-int/2addr p3, v0

    .line 13
    div-int/lit8 p3, p3, 0x2

    .line 14
    .line 15
    add-int/2addr p3, p2

    .line 16
    iget-wide v1, p0, Lck7;->x:J

    .line 17
    .line 18
    const/4 p2, 0x0

    .line 19
    if-gez p3, :cond_1

    .line 20
    .line 21
    iget p3, p1, Lse3;->a:I

    .line 22
    .line 23
    add-int/2addr v0, p3

    .line 24
    shr-long/2addr v1, p4

    .line 25
    long-to-int v1, v1

    .line 26
    sub-int/2addr v0, v1

    .line 27
    if-gez v0, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    move p2, v0

    .line 31
    :goto_0
    sub-int/2addr p3, p2

    .line 32
    goto :goto_1

    .line 33
    :cond_1
    add-int v3, p3, v0

    .line 34
    .line 35
    shr-long/2addr v1, p4

    .line 36
    long-to-int v1, v1

    .line 37
    if-le v3, v1, :cond_2

    .line 38
    .line 39
    iget p3, p1, Lse3;->c:I

    .line 40
    .line 41
    sub-int/2addr p3, v0

    .line 42
    if-gez p3, :cond_2

    .line 43
    .line 44
    move p3, p2

    .line 45
    :cond_2
    :goto_1
    iget p2, p1, Lse3;->b:I

    .line 46
    .line 47
    const-wide v0, 0xffffffffL

    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    and-long/2addr p5, v0

    .line 53
    long-to-int p5, p5

    .line 54
    sub-int/2addr p2, p5

    .line 55
    iget p0, p0, Lck7;->w:I

    .line 56
    .line 57
    sub-int/2addr p2, p0

    .line 58
    if-gez p2, :cond_3

    .line 59
    .line 60
    iget p1, p1, Lse3;->d:I

    .line 61
    .line 62
    add-int p2, p1, p0

    .line 63
    .line 64
    :cond_3
    int-to-long p0, p3

    .line 65
    shl-long/2addr p0, p4

    .line 66
    int-to-long p2, p2

    .line 67
    and-long/2addr p2, v0

    .line 68
    or-long/2addr p0, p2

    .line 69
    return-wide p0
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
