.class public final Li90;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Ljava/lang/Cloneable;


# instance fields
.field public w:[I

.field public x:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Li90;->x:I

    .line 5
    .line 6
    add-int/lit8 p1, p1, 0x1f

    .line 7
    .line 8
    div-int/lit8 p1, p1, 0x20

    .line 9
    .line 10
    new-array p1, p1, [I

    .line 11
    .line 12
    iput-object p1, p0, Li90;->w:[I

    .line 13
    .line 14
    return-void
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
.method public final a(I)Z
    .locals 1

    .line 1
    iget-object p0, p0, Li90;->w:[I

    .line 2
    .line 3
    div-int/lit8 v0, p1, 0x20

    .line 4
    .line 5
    aget p0, p0, v0

    .line 6
    .line 7
    and-int/lit8 p1, p1, 0x1f

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    shl-int p1, v0, p1

    .line 11
    .line 12
    and-int/2addr p0, p1

    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    return v0

    .line 16
    :cond_0
    const/4 p0, 0x0

    .line 17
    return p0
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

.method public final b(I)I
    .locals 4

    .line 1
    iget v0, p0, Li90;->x:I

    .line 2
    .line 3
    if-lt p1, v0, :cond_0

    .line 4
    .line 5
    return v0

    .line 6
    :cond_0
    div-int/lit8 v1, p1, 0x20

    .line 7
    .line 8
    iget-object v2, p0, Li90;->w:[I

    .line 9
    .line 10
    aget v2, v2, v1

    .line 11
    .line 12
    and-int/lit8 p1, p1, 0x1f

    .line 13
    .line 14
    const/4 v3, 0x1

    .line 15
    shl-int p1, v3, p1

    .line 16
    .line 17
    neg-int p1, p1

    .line 18
    and-int/2addr p1, v2

    .line 19
    :goto_0
    if-nez p1, :cond_2

    .line 20
    .line 21
    add-int/lit8 v1, v1, 0x1

    .line 22
    .line 23
    iget-object p1, p0, Li90;->w:[I

    .line 24
    .line 25
    array-length v2, p1

    .line 26
    if-ne v1, v2, :cond_1

    .line 27
    .line 28
    return v0

    .line 29
    :cond_1
    aget p1, p1, v1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_2
    shl-int/lit8 p0, v1, 0x5

    .line 33
    .line 34
    invoke-static {p1}, Ljava/lang/Integer;->numberOfTrailingZeros(I)I

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    add-int/2addr p1, p0

    .line 39
    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    .line 40
    .line 41
    .line 42
    move-result p0

    .line 43
    return p0
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
.end method

.method public final c(I)I
    .locals 4

    .line 1
    iget v0, p0, Li90;->x:I

    .line 2
    .line 3
    if-lt p1, v0, :cond_0

    .line 4
    .line 5
    return v0

    .line 6
    :cond_0
    div-int/lit8 v1, p1, 0x20

    .line 7
    .line 8
    iget-object v2, p0, Li90;->w:[I

    .line 9
    .line 10
    aget v2, v2, v1

    .line 11
    .line 12
    not-int v2, v2

    .line 13
    and-int/lit8 p1, p1, 0x1f

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    shl-int p1, v3, p1

    .line 17
    .line 18
    neg-int p1, p1

    .line 19
    and-int/2addr p1, v2

    .line 20
    :goto_0
    if-nez p1, :cond_2

    .line 21
    .line 22
    add-int/lit8 v1, v1, 0x1

    .line 23
    .line 24
    iget-object p1, p0, Li90;->w:[I

    .line 25
    .line 26
    array-length v2, p1

    .line 27
    if-ne v1, v2, :cond_1

    .line 28
    .line 29
    return v0

    .line 30
    :cond_1
    aget p1, p1, v1

    .line 31
    .line 32
    not-int p1, p1

    .line 33
    goto :goto_0

    .line 34
    :cond_2
    shl-int/lit8 p0, v1, 0x5

    .line 35
    .line 36
    invoke-static {p1}, Ljava/lang/Integer;->numberOfTrailingZeros(I)I

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    add-int/2addr p1, p0

    .line 41
    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    .line 42
    .line 43
    .line 44
    move-result p0

    .line 45
    return p0
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
.end method

.method public final clone()Ljava/lang/Object;
    .locals 2

    .line 1
    new-instance v0, Li90;

    .line 2
    .line 3
    iget-object v1, p0, Li90;->w:[I

    .line 4
    .line 5
    invoke-virtual {v1}, [I->clone()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    check-cast v1, [I

    .line 10
    .line 11
    iget p0, p0, Li90;->x:I

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v1, v0, Li90;->w:[I

    .line 17
    .line 18
    iput p0, v0, Li90;->x:I

    .line 19
    .line 20
    return-object v0
    .line 21
.end method

.method public final d(II)Z
    .locals 8

    .line 1
    if-lt p2, p1, :cond_5

    .line 2
    .line 3
    if-ltz p1, :cond_5

    .line 4
    .line 5
    iget v0, p0, Li90;->x:I

    .line 6
    .line 7
    if-gt p2, v0, :cond_5

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    if-ne p2, p1, :cond_0

    .line 11
    .line 12
    goto :goto_3

    .line 13
    :cond_0
    add-int/lit8 p2, p2, -0x1

    .line 14
    .line 15
    div-int/lit8 v1, p1, 0x20

    .line 16
    .line 17
    div-int/lit8 v2, p2, 0x20

    .line 18
    .line 19
    move v3, v1

    .line 20
    :goto_0
    if-gt v3, v2, :cond_4

    .line 21
    .line 22
    const/16 v4, 0x1f

    .line 23
    .line 24
    const/4 v5, 0x0

    .line 25
    if-le v3, v1, :cond_1

    .line 26
    .line 27
    move v6, v5

    .line 28
    goto :goto_1

    .line 29
    :cond_1
    and-int/lit8 v6, p1, 0x1f

    .line 30
    .line 31
    :goto_1
    if-ge v3, v2, :cond_2

    .line 32
    .line 33
    goto :goto_2

    .line 34
    :cond_2
    and-int/2addr v4, p2

    .line 35
    :goto_2
    const/4 v7, 0x2

    .line 36
    shl-int v4, v7, v4

    .line 37
    .line 38
    shl-int v6, v0, v6

    .line 39
    .line 40
    sub-int/2addr v4, v6

    .line 41
    iget-object v6, p0, Li90;->w:[I

    .line 42
    .line 43
    aget v6, v6, v3

    .line 44
    .line 45
    and-int/2addr v4, v6

    .line 46
    if-eqz v4, :cond_3

    .line 47
    .line 48
    return v5

    .line 49
    :cond_3
    add-int/lit8 v3, v3, 0x1

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_4
    :goto_3
    return v0

    .line 53
    :cond_5
    invoke-static {}, Lku4;->v()V

    .line 54
    .line 55
    .line 56
    const/4 p0, 0x0

    .line 57
    return p0
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
.end method

.method public final e()V
    .locals 13

    .line 1
    iget-object v0, p0, Li90;->w:[I

    .line 2
    .line 3
    array-length v0, v0

    .line 4
    new-array v0, v0, [I

    .line 5
    .line 6
    iget v1, p0, Li90;->x:I

    .line 7
    .line 8
    add-int/lit8 v2, v1, -0x1

    .line 9
    .line 10
    div-int/lit8 v2, v2, 0x20

    .line 11
    .line 12
    add-int/lit8 v3, v2, 0x1

    .line 13
    .line 14
    const/4 v4, 0x0

    .line 15
    move v5, v4

    .line 16
    :goto_0
    const/4 v6, 0x1

    .line 17
    if-ge v5, v3, :cond_0

    .line 18
    .line 19
    iget-object v7, p0, Li90;->w:[I

    .line 20
    .line 21
    aget v7, v7, v5

    .line 22
    .line 23
    int-to-long v7, v7

    .line 24
    shr-long v9, v7, v6

    .line 25
    .line 26
    const-wide/32 v11, 0x55555555

    .line 27
    .line 28
    .line 29
    and-long/2addr v9, v11

    .line 30
    and-long/2addr v7, v11

    .line 31
    shl-long v6, v7, v6

    .line 32
    .line 33
    or-long/2addr v6, v9

    .line 34
    const/4 v8, 0x2

    .line 35
    shr-long v9, v6, v8

    .line 36
    .line 37
    const-wide/32 v11, 0x33333333

    .line 38
    .line 39
    .line 40
    and-long/2addr v9, v11

    .line 41
    and-long/2addr v6, v11

    .line 42
    shl-long/2addr v6, v8

    .line 43
    or-long/2addr v6, v9

    .line 44
    const/4 v8, 0x4

    .line 45
    shr-long v9, v6, v8

    .line 46
    .line 47
    const-wide/32 v11, 0xf0f0f0f

    .line 48
    .line 49
    .line 50
    and-long/2addr v9, v11

    .line 51
    and-long/2addr v6, v11

    .line 52
    shl-long/2addr v6, v8

    .line 53
    or-long/2addr v6, v9

    .line 54
    const/16 v8, 0x8

    .line 55
    .line 56
    shr-long v9, v6, v8

    .line 57
    .line 58
    const-wide/32 v11, 0xff00ff

    .line 59
    .line 60
    .line 61
    and-long/2addr v9, v11

    .line 62
    and-long/2addr v6, v11

    .line 63
    shl-long/2addr v6, v8

    .line 64
    or-long/2addr v6, v9

    .line 65
    const/16 v8, 0x10

    .line 66
    .line 67
    shr-long v9, v6, v8

    .line 68
    .line 69
    const-wide/32 v11, 0xffff

    .line 70
    .line 71
    .line 72
    and-long/2addr v9, v11

    .line 73
    and-long/2addr v6, v11

    .line 74
    shl-long/2addr v6, v8

    .line 75
    or-long/2addr v6, v9

    .line 76
    sub-int v8, v2, v5

    .line 77
    .line 78
    long-to-int v6, v6

    .line 79
    aput v6, v0, v8

    .line 80
    .line 81
    add-int/lit8 v5, v5, 0x1

    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_0
    shl-int/lit8 v5, v3, 0x5

    .line 85
    .line 86
    if-eq v1, v5, :cond_2

    .line 87
    .line 88
    sub-int/2addr v5, v1

    .line 89
    aget v1, v0, v4

    .line 90
    .line 91
    ushr-int/2addr v1, v5

    .line 92
    :goto_1
    if-ge v6, v3, :cond_1

    .line 93
    .line 94
    aget v4, v0, v6

    .line 95
    .line 96
    rsub-int/lit8 v7, v5, 0x20

    .line 97
    .line 98
    shl-int v7, v4, v7

    .line 99
    .line 100
    or-int/2addr v1, v7

    .line 101
    add-int/lit8 v7, v6, -0x1

    .line 102
    .line 103
    aput v1, v0, v7

    .line 104
    .line 105
    ushr-int v1, v4, v5

    .line 106
    .line 107
    add-int/lit8 v6, v6, 0x1

    .line 108
    .line 109
    goto :goto_1

    .line 110
    :cond_1
    aput v1, v0, v2

    .line 111
    .line 112
    :cond_2
    iput-object v0, p0, Li90;->w:[I

    .line 113
    .line 114
    return-void
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

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    instance-of v0, p1, Li90;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    check-cast p1, Li90;

    .line 8
    .line 9
    iget v0, p0, Li90;->x:I

    .line 10
    .line 11
    iget v2, p1, Li90;->x:I

    .line 12
    .line 13
    if-ne v0, v2, :cond_1

    .line 14
    .line 15
    iget-object p0, p0, Li90;->w:[I

    .line 16
    .line 17
    iget-object p1, p1, Li90;->w:[I

    .line 18
    .line 19
    invoke-static {p0, p1}, Ljava/util/Arrays;->equals([I[I)Z

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    if-eqz p0, :cond_1

    .line 24
    .line 25
    const/4 p0, 0x1

    .line 26
    return p0

    .line 27
    :cond_1
    return v1
    .line 28
    .line 29
.end method

.method public final f(I)V
    .locals 3

    .line 1
    iget-object p0, p0, Li90;->w:[I

    .line 2
    .line 3
    div-int/lit8 v0, p1, 0x20

    .line 4
    .line 5
    aget v1, p0, v0

    .line 6
    .line 7
    and-int/lit8 p1, p1, 0x1f

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    shl-int p1, v2, p1

    .line 11
    .line 12
    or-int/2addr p1, v1

    .line 13
    aput p1, p0, v0

    .line 14
    .line 15
    return-void
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

.method public final hashCode()I
    .locals 1

    .line 1
    iget v0, p0, Li90;->x:I

    .line 2
    .line 3
    mul-int/lit8 v0, v0, 0x1f

    .line 4
    .line 5
    iget-object p0, p0, Li90;->w:[I

    .line 6
    .line 7
    invoke-static {p0}, Ljava/util/Arrays;->hashCode([I)I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    add-int/2addr p0, v0

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

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    iget v1, p0, Li90;->x:I

    .line 4
    .line 5
    div-int/lit8 v2, v1, 0x8

    .line 6
    .line 7
    add-int/2addr v2, v1

    .line 8
    add-int/lit8 v2, v2, 0x1

    .line 9
    .line 10
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 11
    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    :goto_0
    if-ge v2, v1, :cond_2

    .line 15
    .line 16
    and-int/lit8 v3, v2, 0x7

    .line 17
    .line 18
    if-nez v3, :cond_0

    .line 19
    .line 20
    const/16 v3, 0x20

    .line 21
    .line 22
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    :cond_0
    invoke-virtual {p0, v2}, Li90;->a(I)Z

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    if-eqz v3, :cond_1

    .line 30
    .line 31
    const/16 v3, 0x58

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_1
    const/16 v3, 0x2e

    .line 35
    .line 36
    :goto_1
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    add-int/lit8 v2, v2, 0x1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_2
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    return-object p0
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
