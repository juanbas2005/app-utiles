.class public final Lce9;
.super Lcj8;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public final b:Lb85;

.field public final c:Lb85;

.field public final d:[I

.field public final e:I


# direct methods
.method public constructor <init>(Lb85;Lb85;)V
    .locals 10

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lce9;->b:Lb85;

    .line 5
    .line 6
    iput-object p2, p0, Lce9;->c:Lb85;

    .line 7
    .line 8
    invoke-virtual {p2}, Lb85;->w()I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    const/16 p2, 0x1c

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    const/4 v1, 0x1

    .line 16
    if-gt p1, p2, :cond_0

    .line 17
    .line 18
    move p2, v1

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move p2, v0

    .line 21
    :goto_0
    if-eqz p2, :cond_6

    .line 22
    .line 23
    new-array p2, p1, [I

    .line 24
    .line 25
    iput-object p2, p0, Lce9;->d:[I

    .line 26
    .line 27
    const-wide/16 v2, 0x0

    .line 28
    .line 29
    move v4, v0

    .line 30
    move v5, v4

    .line 31
    :goto_1
    if-ge v4, p1, :cond_5

    .line 32
    .line 33
    invoke-virtual {p0, v4}, Lce9;->d(I)Lid9;

    .line 34
    .line 35
    .line 36
    move-result-object v6

    .line 37
    iget-wide v7, v6, Lid9;->e:J

    .line 38
    .line 39
    or-long/2addr v7, v2

    .line 40
    cmp-long v2, v7, v2

    .line 41
    .line 42
    if-nez v2, :cond_4

    .line 43
    .line 44
    move v2, v0

    .line 45
    :goto_2
    const/4 v3, -0x1

    .line 46
    if-ge v2, v5, :cond_2

    .line 47
    .line 48
    aget v9, p2, v2

    .line 49
    .line 50
    and-int/lit8 v9, v9, 0x1f

    .line 51
    .line 52
    invoke-virtual {p0, v9}, Lce9;->d(I)Lid9;

    .line 53
    .line 54
    .line 55
    move-result-object v9

    .line 56
    invoke-virtual {v6, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v9

    .line 60
    if-eqz v9, :cond_1

    .line 61
    .line 62
    goto :goto_3

    .line 63
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_2
    move v2, v3

    .line 67
    :goto_3
    if-eq v2, v3, :cond_4

    .line 68
    .line 69
    iget-boolean v3, v6, Lid9;->c:Z

    .line 70
    .line 71
    if-eqz v3, :cond_3

    .line 72
    .line 73
    aget v3, p2, v2

    .line 74
    .line 75
    add-int/lit8 v6, v4, 0x4

    .line 76
    .line 77
    shl-int v6, v1, v6

    .line 78
    .line 79
    or-int/2addr v3, v6

    .line 80
    goto :goto_4

    .line 81
    :cond_3
    move v3, v4

    .line 82
    :goto_4
    aput v3, p2, v2

    .line 83
    .line 84
    goto :goto_5

    .line 85
    :cond_4
    add-int/lit8 v2, v5, 0x1

    .line 86
    .line 87
    aput v4, p2, v5

    .line 88
    .line 89
    move v5, v2

    .line 90
    :goto_5
    add-int/lit8 v4, v4, 0x1

    .line 91
    .line 92
    move-wide v2, v7

    .line 93
    goto :goto_1

    .line 94
    :cond_5
    iput v5, p0, Lce9;->e:I

    .line 95
    .line 96
    return-void

    .line 97
    :cond_6
    const-string p0, "metadata size too large"

    .line 98
    .line 99
    invoke-static {p0}, Lh;->q(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    const/4 p0, 0x0

    .line 103
    throw p0
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


# virtual methods
.method public final a(Lzd9;Lud9;)V
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    iget v1, p0, Lce9;->e:I

    .line 3
    .line 4
    if-ge v0, v1, :cond_2

    .line 5
    .line 6
    iget-object v1, p0, Lce9;->d:[I

    .line 7
    .line 8
    aget v1, v1, v0

    .line 9
    .line 10
    and-int/lit8 v2, v1, 0x1f

    .line 11
    .line 12
    invoke-virtual {p0, v2}, Lce9;->d(I)Lid9;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    iget-boolean v3, v2, Lid9;->c:Z

    .line 17
    .line 18
    if-nez v3, :cond_1

    .line 19
    .line 20
    iget-object v3, p0, Lce9;->b:Lb85;

    .line 21
    .line 22
    invoke-virtual {v3}, Lb85;->w()I

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    if-lt v1, v4, :cond_0

    .line 27
    .line 28
    iget-object v3, p0, Lce9;->c:Lb85;

    .line 29
    .line 30
    sub-int/2addr v1, v4

    .line 31
    :cond_0
    invoke-virtual {v3, v1}, Lb85;->z(I)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    iget-object v3, v2, Lid9;->b:Ljava/lang/Class;

    .line 36
    .line 37
    invoke-virtual {v3, v1}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-virtual {p1, v2, v1, p2}, Lzd9;->a(Lid9;Ljava/lang/Object;Lud9;)V

    .line 42
    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_1
    new-instance v3, Lbe9;

    .line 46
    .line 47
    invoke-direct {v3, p0, v2, v1}, Lbe9;-><init>(Lce9;Lid9;I)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p1, v2, v3, p2}, Lzd9;->b(Lid9;Ljava/util/Iterator;Lud9;)V

    .line 51
    .line 52
    .line 53
    :goto_1
    add-int/lit8 v0, v0, 0x1

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_2
    return-void
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
.end method

.method public final b()I
    .locals 0

    .line 1
    iget p0, p0, Lce9;->e:I

    .line 2
    .line 3
    return p0
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

.method public final c()Ljava/util/Set;
    .locals 2

    .line 1
    new-instance v0, Lds;

    .line 2
    .line 3
    const/4 v1, 0x5

    .line 4
    invoke-direct {v0, v1, p0}, Lds;-><init>(ILjava/lang/Object;)V

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

.method public final d(I)Lid9;
    .locals 2

    .line 1
    iget-object v0, p0, Lce9;->b:Lb85;

    .line 2
    .line 3
    invoke-virtual {v0}, Lb85;->w()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-lt p1, v1, :cond_0

    .line 8
    .line 9
    iget-object p0, p0, Lce9;->c:Lb85;

    .line 10
    .line 11
    sub-int/2addr p1, v1

    .line 12
    invoke-virtual {p0, p1}, Lb85;->y(I)Lid9;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0

    .line 17
    :cond_0
    invoke-virtual {v0, p1}, Lb85;->y(I)Lid9;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method
