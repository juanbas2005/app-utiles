.class public final Lkt5;
.super Lru2;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lyj4;


# instance fields
.field public A:Llt5;

.field public B:I

.field public C:I

.field public D:Lmt5;

.field public x:I

.field public y:I

.field public z:I


# direct methods
.method public static g()Lkt5;
    .locals 2

    .line 1
    new-instance v0, Lkt5;

    .line 2
    .line 3
    invoke-direct {v0}, Lru2;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Llt5;->y:Llt5;

    .line 7
    .line 8
    iput-object v1, v0, Lkt5;->A:Llt5;

    .line 9
    .line 10
    sget-object v1, Lmt5;->x:Lmt5;

    .line 11
    .line 12
    iput-object v1, v0, Lkt5;->D:Lmt5;

    .line 13
    .line 14
    return-object v0
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method


# virtual methods
.method public final c()Lk2;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lkt5;->f()Lnt5;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lnt5;->a()Z

    .line 6
    .line 7
    .line 8
    return-object p0
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

.method public final clone()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-static {}, Lkt5;->g()Lkt5;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Lkt5;->f()Lnt5;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {v0, p0}, Lkt5;->h(Lnt5;)V

    .line 10
    .line 11
    .line 12
    return-object v0
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

.method public final d(Lts0;Ly92;)Lru2;
    .locals 1

    .line 1
    const/4 p2, 0x0

    .line 2
    :try_start_0
    sget-object v0, Lnt5;->H:Lfp3;

    .line 3
    .line 4
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    new-instance v0, Lnt5;

    .line 8
    .line 9
    invoke-direct {v0, p1}, Lnt5;-><init>(Lts0;)V
    :try_end_0
    .catch Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lkt5;->h(Lnt5;)V

    .line 13
    .line 14
    .line 15
    return-object p0

    .line 16
    :catchall_0
    move-exception p1

    .line 17
    goto :goto_0

    .line 18
    :catch_0
    move-exception p1

    .line 19
    :try_start_1
    iget-object v0, p1, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;->w:Lk2;

    .line 20
    .line 21
    check-cast v0, Lnt5;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 22
    .line 23
    :try_start_2
    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 24
    :catchall_1
    move-exception p1

    .line 25
    move-object p2, v0

    .line 26
    :goto_0
    if-eqz p2, :cond_0

    .line 27
    .line 28
    invoke-virtual {p0, p2}, Lkt5;->h(Lnt5;)V

    .line 29
    .line 30
    .line 31
    :cond_0
    throw p1
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

.method public final bridge synthetic e(Lzu2;)Lru2;
    .locals 0

    .line 1
    check-cast p1, Lnt5;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lkt5;->h(Lnt5;)V

    .line 4
    .line 5
    .line 6
    return-object p0
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

.method public final f()Lnt5;
    .locals 5

    .line 1
    new-instance v0, Lnt5;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lnt5;-><init>(Lkt5;)V

    .line 4
    .line 5
    .line 6
    iget v1, p0, Lkt5;->x:I

    .line 7
    .line 8
    and-int/lit8 v2, v1, 0x1

    .line 9
    .line 10
    const/4 v3, 0x1

    .line 11
    if-ne v2, v3, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v3, 0x0

    .line 15
    :goto_0
    iget v2, p0, Lkt5;->y:I

    .line 16
    .line 17
    iput v2, v0, Lnt5;->y:I

    .line 18
    .line 19
    and-int/lit8 v2, v1, 0x2

    .line 20
    .line 21
    const/4 v4, 0x2

    .line 22
    if-ne v2, v4, :cond_1

    .line 23
    .line 24
    or-int/lit8 v3, v3, 0x2

    .line 25
    .line 26
    :cond_1
    iget v2, p0, Lkt5;->z:I

    .line 27
    .line 28
    iput v2, v0, Lnt5;->z:I

    .line 29
    .line 30
    and-int/lit8 v2, v1, 0x4

    .line 31
    .line 32
    const/4 v4, 0x4

    .line 33
    if-ne v2, v4, :cond_2

    .line 34
    .line 35
    or-int/lit8 v3, v3, 0x4

    .line 36
    .line 37
    :cond_2
    iget-object v2, p0, Lkt5;->A:Llt5;

    .line 38
    .line 39
    iput-object v2, v0, Lnt5;->A:Llt5;

    .line 40
    .line 41
    and-int/lit8 v2, v1, 0x8

    .line 42
    .line 43
    const/16 v4, 0x8

    .line 44
    .line 45
    if-ne v2, v4, :cond_3

    .line 46
    .line 47
    or-int/lit8 v3, v3, 0x8

    .line 48
    .line 49
    :cond_3
    iget v2, p0, Lkt5;->B:I

    .line 50
    .line 51
    iput v2, v0, Lnt5;->B:I

    .line 52
    .line 53
    and-int/lit8 v2, v1, 0x10

    .line 54
    .line 55
    const/16 v4, 0x10

    .line 56
    .line 57
    if-ne v2, v4, :cond_4

    .line 58
    .line 59
    or-int/lit8 v3, v3, 0x10

    .line 60
    .line 61
    :cond_4
    iget v2, p0, Lkt5;->C:I

    .line 62
    .line 63
    iput v2, v0, Lnt5;->C:I

    .line 64
    .line 65
    const/16 v2, 0x20

    .line 66
    .line 67
    and-int/2addr v1, v2

    .line 68
    if-ne v1, v2, :cond_5

    .line 69
    .line 70
    or-int/lit8 v3, v3, 0x20

    .line 71
    .line 72
    :cond_5
    iget-object p0, p0, Lkt5;->D:Lmt5;

    .line 73
    .line 74
    iput-object p0, v0, Lnt5;->D:Lmt5;

    .line 75
    .line 76
    iput v3, v0, Lnt5;->x:I

    .line 77
    .line 78
    return-object v0
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

.method public final h(Lnt5;)V
    .locals 4

    .line 1
    sget-object v0, Lnt5;->G:Lnt5;

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget v0, p1, Lnt5;->x:I

    .line 7
    .line 8
    and-int/lit8 v1, v0, 0x1

    .line 9
    .line 10
    const/4 v2, 0x1

    .line 11
    if-ne v1, v2, :cond_1

    .line 12
    .line 13
    iget v1, p1, Lnt5;->y:I

    .line 14
    .line 15
    iget v3, p0, Lkt5;->x:I

    .line 16
    .line 17
    or-int/2addr v2, v3

    .line 18
    iput v2, p0, Lkt5;->x:I

    .line 19
    .line 20
    iput v1, p0, Lkt5;->y:I

    .line 21
    .line 22
    :cond_1
    and-int/lit8 v1, v0, 0x2

    .line 23
    .line 24
    const/4 v2, 0x2

    .line 25
    if-ne v1, v2, :cond_2

    .line 26
    .line 27
    iget v1, p1, Lnt5;->z:I

    .line 28
    .line 29
    iget v3, p0, Lkt5;->x:I

    .line 30
    .line 31
    or-int/2addr v2, v3

    .line 32
    iput v2, p0, Lkt5;->x:I

    .line 33
    .line 34
    iput v1, p0, Lkt5;->z:I

    .line 35
    .line 36
    :cond_2
    const/4 v1, 0x4

    .line 37
    and-int/2addr v0, v1

    .line 38
    if-ne v0, v1, :cond_3

    .line 39
    .line 40
    iget-object v0, p1, Lnt5;->A:Llt5;

    .line 41
    .line 42
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    iget v2, p0, Lkt5;->x:I

    .line 46
    .line 47
    or-int/2addr v1, v2

    .line 48
    iput v1, p0, Lkt5;->x:I

    .line 49
    .line 50
    iput-object v0, p0, Lkt5;->A:Llt5;

    .line 51
    .line 52
    :cond_3
    iget v0, p1, Lnt5;->x:I

    .line 53
    .line 54
    and-int/lit8 v1, v0, 0x8

    .line 55
    .line 56
    const/16 v2, 0x8

    .line 57
    .line 58
    if-ne v1, v2, :cond_4

    .line 59
    .line 60
    iget v1, p1, Lnt5;->B:I

    .line 61
    .line 62
    iget v3, p0, Lkt5;->x:I

    .line 63
    .line 64
    or-int/2addr v2, v3

    .line 65
    iput v2, p0, Lkt5;->x:I

    .line 66
    .line 67
    iput v1, p0, Lkt5;->B:I

    .line 68
    .line 69
    :cond_4
    and-int/lit8 v1, v0, 0x10

    .line 70
    .line 71
    const/16 v2, 0x10

    .line 72
    .line 73
    if-ne v1, v2, :cond_5

    .line 74
    .line 75
    iget v1, p1, Lnt5;->C:I

    .line 76
    .line 77
    iget v3, p0, Lkt5;->x:I

    .line 78
    .line 79
    or-int/2addr v2, v3

    .line 80
    iput v2, p0, Lkt5;->x:I

    .line 81
    .line 82
    iput v1, p0, Lkt5;->C:I

    .line 83
    .line 84
    :cond_5
    const/16 v1, 0x20

    .line 85
    .line 86
    and-int/2addr v0, v1

    .line 87
    if-ne v0, v1, :cond_6

    .line 88
    .line 89
    iget-object v0, p1, Lnt5;->D:Lmt5;

    .line 90
    .line 91
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    iget v2, p0, Lkt5;->x:I

    .line 95
    .line 96
    or-int/2addr v1, v2

    .line 97
    iput v1, p0, Lkt5;->x:I

    .line 98
    .line 99
    iput-object v0, p0, Lkt5;->D:Lmt5;

    .line 100
    .line 101
    :cond_6
    iget-object v0, p0, Lru2;->w:Lbg0;

    .line 102
    .line 103
    iget-object p1, p1, Lnt5;->w:Lbg0;

    .line 104
    .line 105
    invoke-virtual {v0, p1}, Lbg0;->f(Lbg0;)Lbg0;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    iput-object p1, p0, Lru2;->w:Lbg0;

    .line 110
    .line 111
    return-void
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
