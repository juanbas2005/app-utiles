.class public final Lyd3;
.super Ljava/io/InputStream;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public A:J

.field public B:J

.field public final w:Ljava/io/InputStream;

.field public final x:Lsy4;

.field public final y:Lui7;

.field public z:J


# direct methods
.method public constructor <init>(Ljava/io/InputStream;Lsy4;Lui7;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    .line 2
    .line 3
    .line 4
    const-wide/16 v0, -0x1

    .line 5
    .line 6
    iput-wide v0, p0, Lyd3;->z:J

    .line 7
    .line 8
    iput-wide v0, p0, Lyd3;->B:J

    .line 9
    .line 10
    iput-object p3, p0, Lyd3;->y:Lui7;

    .line 11
    .line 12
    iput-object p1, p0, Lyd3;->w:Ljava/io/InputStream;

    .line 13
    .line 14
    iput-object p2, p0, Lyd3;->x:Lsy4;

    .line 15
    .line 16
    iget-object p1, p2, Lsy4;->z:Lpy4;

    .line 17
    .line 18
    iget-object p1, p1, Lqu2;->x:Lcom/google/protobuf/b;

    .line 19
    .line 20
    check-cast p1, Lry4;

    .line 21
    .line 22
    invoke-virtual {p1}, Lry4;->O()J

    .line 23
    .line 24
    .line 25
    move-result-wide p1

    .line 26
    iput-wide p1, p0, Lyd3;->A:J

    .line 27
    .line 28
    return-void
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
.method public final a(J)V
    .locals 4

    .line 1
    iget-wide v0, p0, Lyd3;->z:J

    .line 2
    .line 3
    const-wide/16 v2, -0x1

    .line 4
    .line 5
    cmp-long v2, v0, v2

    .line 6
    .line 7
    if-nez v2, :cond_0

    .line 8
    .line 9
    iput-wide p1, p0, Lyd3;->z:J

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    add-long/2addr v0, p1

    .line 13
    iput-wide v0, p0, Lyd3;->z:J

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

.method public final available()I
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Lyd3;->w:Ljava/io/InputStream;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/io/InputStream;->available()I

    .line 4
    .line 5
    .line 6
    move-result p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    return p0

    .line 8
    :catch_0
    move-exception v0

    .line 9
    iget-object v1, p0, Lyd3;->y:Lui7;

    .line 10
    .line 11
    iget-object p0, p0, Lyd3;->x:Lsy4;

    .line 12
    .line 13
    invoke-static {v1, p0, p0}, Lf21;->t(Lui7;Lsy4;Lsy4;)V

    .line 14
    .line 15
    .line 16
    throw v0
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final close()V
    .locals 8

    .line 1
    iget-object v0, p0, Lyd3;->x:Lsy4;

    .line 2
    .line 3
    iget-object v1, p0, Lyd3;->y:Lui7;

    .line 4
    .line 5
    invoke-virtual {v1}, Lui7;->b()J

    .line 6
    .line 7
    .line 8
    move-result-wide v2

    .line 9
    iget-wide v4, p0, Lyd3;->B:J

    .line 10
    .line 11
    const-wide/16 v6, -0x1

    .line 12
    .line 13
    cmp-long v4, v4, v6

    .line 14
    .line 15
    if-nez v4, :cond_0

    .line 16
    .line 17
    iput-wide v2, p0, Lyd3;->B:J

    .line 18
    .line 19
    :cond_0
    :try_start_0
    iget-object v2, p0, Lyd3;->w:Ljava/io/InputStream;

    .line 20
    .line 21
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V

    .line 22
    .line 23
    .line 24
    iget-wide v2, p0, Lyd3;->z:J

    .line 25
    .line 26
    cmp-long v4, v2, v6

    .line 27
    .line 28
    if-eqz v4, :cond_1

    .line 29
    .line 30
    invoke-virtual {v0, v2, v3}, Lsy4;->h(J)V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :catch_0
    move-exception p0

    .line 35
    goto :goto_1

    .line 36
    :cond_1
    :goto_0
    iget-wide v2, p0, Lyd3;->A:J

    .line 37
    .line 38
    cmp-long v4, v2, v6

    .line 39
    .line 40
    if-eqz v4, :cond_2

    .line 41
    .line 42
    iget-object v4, v0, Lsy4;->z:Lpy4;

    .line 43
    .line 44
    invoke-virtual {v4}, Lqu2;->h()V

    .line 45
    .line 46
    .line 47
    iget-object v4, v4, Lqu2;->x:Lcom/google/protobuf/b;

    .line 48
    .line 49
    check-cast v4, Lry4;

    .line 50
    .line 51
    invoke-static {v4, v2, v3}, Lry4;->z(Lry4;J)V

    .line 52
    .line 53
    .line 54
    :cond_2
    iget-wide v2, p0, Lyd3;->B:J

    .line 55
    .line 56
    invoke-virtual {v0, v2, v3}, Lsy4;->i(J)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0}, Lsy4;->b()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 60
    .line 61
    .line 62
    return-void

    .line 63
    :goto_1
    invoke-static {v1, v0, v0}, Lf21;->t(Lui7;Lsy4;Lsy4;)V

    .line 64
    .line 65
    .line 66
    throw p0
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

.method public final mark(I)V
    .locals 0

    .line 1
    iget-object p0, p0, Lyd3;->w:Ljava/io/InputStream;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ljava/io/InputStream;->mark(I)V

    .line 4
    .line 5
    .line 6
    return-void
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

.method public final markSupported()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lyd3;->w:Ljava/io/InputStream;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/io/InputStream;->markSupported()Z

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

.method public final read()I
    .locals 9

    .line 1
    iget-object v0, p0, Lyd3;->y:Lui7;

    .line 2
    .line 3
    iget-object v1, p0, Lyd3;->x:Lsy4;

    .line 4
    .line 5
    :try_start_0
    iget-object v2, p0, Lyd3;->w:Ljava/io/InputStream;

    .line 6
    .line 7
    invoke-virtual {v2}, Ljava/io/InputStream;->read()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    invoke-virtual {v0}, Lui7;->b()J

    .line 12
    .line 13
    .line 14
    move-result-wide v3

    .line 15
    iget-wide v5, p0, Lyd3;->A:J

    .line 16
    .line 17
    const-wide/16 v7, -0x1

    .line 18
    .line 19
    cmp-long v5, v5, v7

    .line 20
    .line 21
    if-nez v5, :cond_0

    .line 22
    .line 23
    iput-wide v3, p0, Lyd3;->A:J

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :catch_0
    move-exception p0

    .line 27
    goto :goto_1

    .line 28
    :cond_0
    :goto_0
    const/4 v5, -0x1

    .line 29
    if-ne v2, v5, :cond_1

    .line 30
    .line 31
    iget-wide v5, p0, Lyd3;->B:J

    .line 32
    .line 33
    cmp-long v5, v5, v7

    .line 34
    .line 35
    if-nez v5, :cond_1

    .line 36
    .line 37
    iput-wide v3, p0, Lyd3;->B:J

    .line 38
    .line 39
    invoke-virtual {v1, v3, v4}, Lsy4;->i(J)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1}, Lsy4;->b()V

    .line 43
    .line 44
    .line 45
    return v2

    .line 46
    :cond_1
    const-wide/16 v3, 0x1

    .line 47
    .line 48
    invoke-virtual {p0, v3, v4}, Lyd3;->a(J)V

    .line 49
    .line 50
    .line 51
    iget-wide v3, p0, Lyd3;->z:J

    .line 52
    .line 53
    invoke-virtual {v1, v3, v4}, Lsy4;->h(J)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 54
    .line 55
    .line 56
    return v2

    .line 57
    :goto_1
    invoke-static {v0, v1, v1}, Lf21;->t(Lui7;Lsy4;Lsy4;)V

    .line 58
    .line 59
    .line 60
    throw p0
    .line 61
    .line 62
    .line 63
.end method

.method public final read([B)I
    .locals 8

    .line 73
    iget-object v0, p0, Lyd3;->y:Lui7;

    iget-object v1, p0, Lyd3;->x:Lsy4;

    :try_start_0
    iget-object v2, p0, Lyd3;->w:Ljava/io/InputStream;

    invoke-virtual {v2, p1}, Ljava/io/InputStream;->read([B)I

    move-result p1

    .line 74
    invoke-virtual {v0}, Lui7;->b()J

    move-result-wide v2

    .line 75
    iget-wide v4, p0, Lyd3;->A:J

    const-wide/16 v6, -0x1

    cmp-long v4, v4, v6

    if-nez v4, :cond_0

    .line 76
    iput-wide v2, p0, Lyd3;->A:J

    goto :goto_0

    :catch_0
    move-exception p0

    goto :goto_1

    :cond_0
    :goto_0
    const/4 v4, -0x1

    if-ne p1, v4, :cond_1

    .line 77
    iget-wide v4, p0, Lyd3;->B:J

    cmp-long v4, v4, v6

    if-nez v4, :cond_1

    .line 78
    iput-wide v2, p0, Lyd3;->B:J

    .line 79
    invoke-virtual {v1, v2, v3}, Lsy4;->i(J)V

    .line 80
    invoke-virtual {v1}, Lsy4;->b()V

    return p1

    :cond_1
    int-to-long v2, p1

    .line 81
    invoke-virtual {p0, v2, v3}, Lyd3;->a(J)V

    .line 82
    iget-wide v2, p0, Lyd3;->z:J

    invoke-virtual {v1, v2, v3}, Lsy4;->h(J)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    .line 83
    :goto_1
    invoke-static {v0, v1, v1}, Lf21;->t(Lui7;Lsy4;Lsy4;)V

    .line 84
    throw p0
.end method

.method public final read([BII)I
    .locals 6

    .line 61
    iget-object v0, p0, Lyd3;->y:Lui7;

    iget-object v1, p0, Lyd3;->x:Lsy4;

    :try_start_0
    iget-object v2, p0, Lyd3;->w:Ljava/io/InputStream;

    invoke-virtual {v2, p1, p2, p3}, Ljava/io/InputStream;->read([BII)I

    move-result p1

    .line 62
    invoke-virtual {v0}, Lui7;->b()J

    move-result-wide p2

    .line 63
    iget-wide v2, p0, Lyd3;->A:J

    const-wide/16 v4, -0x1

    cmp-long v2, v2, v4

    if-nez v2, :cond_0

    .line 64
    iput-wide p2, p0, Lyd3;->A:J

    goto :goto_0

    :catch_0
    move-exception p0

    goto :goto_1

    :cond_0
    :goto_0
    const/4 v2, -0x1

    if-ne p1, v2, :cond_1

    .line 65
    iget-wide v2, p0, Lyd3;->B:J

    cmp-long v2, v2, v4

    if-nez v2, :cond_1

    .line 66
    iput-wide p2, p0, Lyd3;->B:J

    .line 67
    invoke-virtual {v1, p2, p3}, Lsy4;->i(J)V

    .line 68
    invoke-virtual {v1}, Lsy4;->b()V

    return p1

    :cond_1
    int-to-long p2, p1

    .line 69
    invoke-virtual {p0, p2, p3}, Lyd3;->a(J)V

    .line 70
    iget-wide p2, p0, Lyd3;->z:J

    invoke-virtual {v1, p2, p3}, Lsy4;->h(J)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    .line 71
    :goto_1
    invoke-static {v0, v1, v1}, Lf21;->t(Lui7;Lsy4;Lsy4;)V

    .line 72
    throw p0
.end method

.method public final reset()V
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Lyd3;->w:Ljava/io/InputStream;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/io/InputStream;->reset()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :catch_0
    move-exception v0

    .line 8
    iget-object v1, p0, Lyd3;->y:Lui7;

    .line 9
    .line 10
    iget-object p0, p0, Lyd3;->x:Lsy4;

    .line 11
    .line 12
    invoke-static {v1, p0, p0}, Lf21;->t(Lui7;Lsy4;Lsy4;)V

    .line 13
    .line 14
    .line 15
    throw v0
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final skip(J)J
    .locals 11

    .line 1
    iget-object v0, p0, Lyd3;->y:Lui7;

    .line 2
    .line 3
    iget-object v1, p0, Lyd3;->x:Lsy4;

    .line 4
    .line 5
    :try_start_0
    iget-object v2, p0, Lyd3;->w:Ljava/io/InputStream;

    .line 6
    .line 7
    invoke-virtual {v2, p1, p2}, Ljava/io/InputStream;->skip(J)J

    .line 8
    .line 9
    .line 10
    move-result-wide v2

    .line 11
    invoke-virtual {v0}, Lui7;->b()J

    .line 12
    .line 13
    .line 14
    move-result-wide v4

    .line 15
    iget-wide v6, p0, Lyd3;->A:J

    .line 16
    .line 17
    const-wide/16 v8, -0x1

    .line 18
    .line 19
    cmp-long v6, v6, v8

    .line 20
    .line 21
    if-nez v6, :cond_0

    .line 22
    .line 23
    iput-wide v4, p0, Lyd3;->A:J

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :catch_0
    move-exception p0

    .line 27
    goto :goto_1

    .line 28
    :cond_0
    :goto_0
    const-wide/16 v6, 0x0

    .line 29
    .line 30
    cmp-long v10, v2, v6

    .line 31
    .line 32
    if-nez v10, :cond_1

    .line 33
    .line 34
    cmp-long p1, p1, v6

    .line 35
    .line 36
    if-eqz p1, :cond_1

    .line 37
    .line 38
    iget-wide p1, p0, Lyd3;->B:J

    .line 39
    .line 40
    cmp-long p1, p1, v8

    .line 41
    .line 42
    if-nez p1, :cond_1

    .line 43
    .line 44
    iput-wide v4, p0, Lyd3;->B:J

    .line 45
    .line 46
    invoke-virtual {v1, v4, v5}, Lsy4;->i(J)V

    .line 47
    .line 48
    .line 49
    return-wide v2

    .line 50
    :cond_1
    invoke-virtual {p0, v2, v3}, Lyd3;->a(J)V

    .line 51
    .line 52
    .line 53
    iget-wide p0, p0, Lyd3;->z:J

    .line 54
    .line 55
    invoke-virtual {v1, p0, p1}, Lsy4;->h(J)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 56
    .line 57
    .line 58
    return-wide v2

    .line 59
    :goto_1
    invoke-static {v0, v1, v1}, Lf21;->t(Lui7;Lsy4;Lsy4;)V

    .line 60
    .line 61
    .line 62
    throw p0
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
