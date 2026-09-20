.class public final Lm90;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public final a:[B

.field public b:I

.field public c:I


# direct methods
.method public constructor <init>([B)V
    .locals 0

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    iput-object p1, p0, Lm90;->a:[B

    return-void
.end method

.method public constructor <init>([BII)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lm90;->a:[B

    .line 5
    .line 6
    iput p2, p0, Lm90;->b:I

    .line 7
    .line 8
    iput p3, p0, Lm90;->c:I

    .line 9
    .line 10
    return-void
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
.end method


# virtual methods
.method public a()I
    .locals 2

    .line 1
    iget-object v0, p0, Lm90;->a:[B

    .line 2
    .line 3
    array-length v0, v0

    .line 4
    iget v1, p0, Lm90;->b:I

    .line 5
    .line 6
    sub-int/2addr v0, v1

    .line 7
    mul-int/lit8 v0, v0, 0x8

    .line 8
    .line 9
    iget p0, p0, Lm90;->c:I

    .line 10
    .line 11
    sub-int/2addr v0, p0

    .line 12
    return v0
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

.method public b(I)I
    .locals 9

    .line 1
    const/4 v0, 0x0

    .line 2
    if-lez p1, :cond_4

    .line 3
    .line 4
    const/16 v1, 0x20

    .line 5
    .line 6
    if-gt p1, v1, :cond_4

    .line 7
    .line 8
    invoke-virtual {p0}, Lm90;->a()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-gt p1, v1, :cond_4

    .line 13
    .line 14
    iget v1, p0, Lm90;->c:I

    .line 15
    .line 16
    iget-object v2, p0, Lm90;->a:[B

    .line 17
    .line 18
    const/16 v3, 0xff

    .line 19
    .line 20
    const/16 v4, 0x8

    .line 21
    .line 22
    if-lez v1, :cond_1

    .line 23
    .line 24
    rsub-int/lit8 v1, v1, 0x8

    .line 25
    .line 26
    invoke-static {p1, v1}, Ljava/lang/Math;->min(II)I

    .line 27
    .line 28
    .line 29
    move-result v5

    .line 30
    sub-int/2addr v1, v5

    .line 31
    rsub-int/lit8 v6, v5, 0x8

    .line 32
    .line 33
    shr-int v6, v3, v6

    .line 34
    .line 35
    shl-int/2addr v6, v1

    .line 36
    iget v7, p0, Lm90;->b:I

    .line 37
    .line 38
    aget-byte v8, v2, v7

    .line 39
    .line 40
    and-int/2addr v6, v8

    .line 41
    shr-int v1, v6, v1

    .line 42
    .line 43
    sub-int/2addr p1, v5

    .line 44
    iget v6, p0, Lm90;->c:I

    .line 45
    .line 46
    add-int/2addr v6, v5

    .line 47
    iput v6, p0, Lm90;->c:I

    .line 48
    .line 49
    if-ne v6, v4, :cond_0

    .line 50
    .line 51
    iput v0, p0, Lm90;->c:I

    .line 52
    .line 53
    add-int/lit8 v7, v7, 0x1

    .line 54
    .line 55
    iput v7, p0, Lm90;->b:I

    .line 56
    .line 57
    :cond_0
    move v0, v1

    .line 58
    :cond_1
    if-lez p1, :cond_3

    .line 59
    .line 60
    :goto_0
    if-lt p1, v4, :cond_2

    .line 61
    .line 62
    shl-int/lit8 v0, v0, 0x8

    .line 63
    .line 64
    iget v1, p0, Lm90;->b:I

    .line 65
    .line 66
    aget-byte v5, v2, v1

    .line 67
    .line 68
    and-int/2addr v5, v3

    .line 69
    or-int/2addr v0, v5

    .line 70
    add-int/lit8 v1, v1, 0x1

    .line 71
    .line 72
    iput v1, p0, Lm90;->b:I

    .line 73
    .line 74
    add-int/lit8 p1, p1, -0x8

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_2
    if-lez p1, :cond_3

    .line 78
    .line 79
    rsub-int/lit8 v1, p1, 0x8

    .line 80
    .line 81
    shr-int/2addr v3, v1

    .line 82
    shl-int/2addr v3, v1

    .line 83
    shl-int/2addr v0, p1

    .line 84
    iget v4, p0, Lm90;->b:I

    .line 85
    .line 86
    aget-byte v2, v2, v4

    .line 87
    .line 88
    and-int/2addr v2, v3

    .line 89
    shr-int v1, v2, v1

    .line 90
    .line 91
    or-int/2addr v0, v1

    .line 92
    iget v1, p0, Lm90;->c:I

    .line 93
    .line 94
    add-int/2addr v1, p1

    .line 95
    iput v1, p0, Lm90;->c:I

    .line 96
    .line 97
    :cond_3
    return v0

    .line 98
    :cond_4
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    invoke-static {p0}, Lh;->q(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    return v0
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
