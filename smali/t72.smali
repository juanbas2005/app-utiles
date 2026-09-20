.class public final Lt72;
.super Lsp2;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public A:Z

.field public B:Z

.field public C:Z

.field public final synthetic D:Lu72;

.field public final x:J

.field public final y:Z

.field public z:J


# direct methods
.method public constructor <init>(Lu72;Loy6;JZ)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lt72;->D:Lu72;

    .line 5
    .line 6
    invoke-direct {p0, p2}, Lsp2;-><init>(Loy6;)V

    .line 7
    .line 8
    .line 9
    iput-wide p3, p0, Lt72;->x:J

    .line 10
    .line 11
    iput-boolean p5, p0, Lt72;->y:Z

    .line 12
    .line 13
    const/4 p1, 0x1

    .line 14
    iput-boolean p1, p0, Lt72;->A:Z

    .line 15
    .line 16
    const-wide/16 p1, 0x0

    .line 17
    .line 18
    cmp-long p1, p3, p1

    .line 19
    .line 20
    if-nez p1, :cond_0

    .line 21
    .line 22
    const/4 p1, 0x0

    .line 23
    invoke-virtual {p0, p1}, Lt72;->a(Ljava/io/IOException;)Ljava/io/IOException;

    .line 24
    .line 25
    .line 26
    :cond_0
    return-void
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


# virtual methods
.method public final Y(JLsc0;)J
    .locals 8

    .line 1
    const-string v0, "expected "

    .line 2
    .line 3
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-boolean v1, p0, Lt72;->C:Z

    .line 7
    .line 8
    if-nez v1, :cond_5

    .line 9
    .line 10
    :try_start_0
    iget-object v1, p0, Lsp2;->w:Loy6;

    .line 11
    .line 12
    invoke-interface {v1, p1, p2, p3}, Loy6;->Y(JLsc0;)J

    .line 13
    .line 14
    .line 15
    move-result-wide p1

    .line 16
    iget-boolean p3, p0, Lt72;->A:Z

    .line 17
    .line 18
    if-eqz p3, :cond_0

    .line 19
    .line 20
    const/4 p3, 0x0

    .line 21
    iput-boolean p3, p0, Lt72;->A:Z

    .line 22
    .line 23
    iget-object p3, p0, Lt72;->D:Lu72;

    .line 24
    .line 25
    iget-object p3, p3, Lu72;->c:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast p3, Ldx5;

    .line 28
    .line 29
    iget-object p3, p3, Ldx5;->A:Lh72;

    .line 30
    .line 31
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :catch_0
    move-exception p1

    .line 36
    goto :goto_2

    .line 37
    :cond_0
    :goto_0
    const-wide/16 v1, -0x1

    .line 38
    .line 39
    cmp-long p3, p1, v1

    .line 40
    .line 41
    const/4 v3, 0x0

    .line 42
    if-nez p3, :cond_1

    .line 43
    .line 44
    invoke-virtual {p0, v3}, Lt72;->a(Ljava/io/IOException;)Ljava/io/IOException;

    .line 45
    .line 46
    .line 47
    return-wide v1

    .line 48
    :cond_1
    iget-wide v4, p0, Lt72;->z:J

    .line 49
    .line 50
    add-long/2addr v4, p1

    .line 51
    iget-wide v6, p0, Lt72;->x:J

    .line 52
    .line 53
    cmp-long p3, v6, v1

    .line 54
    .line 55
    if-eqz p3, :cond_3

    .line 56
    .line 57
    cmp-long p3, v4, v6

    .line 58
    .line 59
    if-gtz p3, :cond_2

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_2
    new-instance p1, Ljava/net/ProtocolException;

    .line 63
    .line 64
    new-instance p2, Ljava/lang/StringBuilder;

    .line 65
    .line 66
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    iget-wide v0, p0, Lt72;->x:J

    .line 70
    .line 71
    invoke-virtual {p2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    const-string p3, " bytes but received "

    .line 75
    .line 76
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {p2, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object p2

    .line 86
    invoke-direct {p1, p2}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    throw p1

    .line 90
    :cond_3
    :goto_1
    iput-wide v4, p0, Lt72;->z:J

    .line 91
    .line 92
    iget-object p3, p0, Lt72;->D:Lu72;

    .line 93
    .line 94
    iget-object p3, p3, Lu72;->e:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast p3, Lw72;

    .line 97
    .line 98
    invoke-interface {p3}, Lw72;->c()Z

    .line 99
    .line 100
    .line 101
    move-result p3

    .line 102
    if-eqz p3, :cond_4

    .line 103
    .line 104
    invoke-virtual {p0, v3}, Lt72;->a(Ljava/io/IOException;)Ljava/io/IOException;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 105
    .line 106
    .line 107
    :cond_4
    return-wide p1

    .line 108
    :goto_2
    invoke-virtual {p0, p1}, Lt72;->a(Ljava/io/IOException;)Ljava/io/IOException;

    .line 109
    .line 110
    .line 111
    move-result-object p0

    .line 112
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    throw p0

    .line 116
    :cond_5
    const-string p0, "closed"

    .line 117
    .line 118
    invoke-static {p0}, Lh;->s(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    const-wide/16 p0, 0x0

    .line 122
    .line 123
    return-wide p0
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

.method public final a(Ljava/io/IOException;)Ljava/io/IOException;
    .locals 2

    .line 1
    iget-boolean v0, p0, Lt72;->B:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object p1

    .line 6
    :cond_0
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Lt72;->B:Z

    .line 8
    .line 9
    if-nez p1, :cond_1

    .line 10
    .line 11
    iget-boolean v0, p0, Lt72;->A:Z

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    iput-boolean v0, p0, Lt72;->A:Z

    .line 17
    .line 18
    iget-object v0, p0, Lt72;->D:Lu72;

    .line 19
    .line 20
    iget-object v0, v0, Lu72;->c:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, Ldx5;

    .line 23
    .line 24
    iget-object v0, v0, Ldx5;->A:Lh72;

    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    :cond_1
    iget-object v0, p0, Lt72;->D:Lu72;

    .line 30
    .line 31
    iget-boolean p0, p0, Lt72;->y:Z

    .line 32
    .line 33
    const/16 v1, 0x8

    .line 34
    .line 35
    invoke-static {v0, p0, p1, v1}, Lu72;->a(Lu72;ZLjava/io/IOException;I)Ljava/io/IOException;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0
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
.end method

.method public final close()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lt72;->C:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Lt72;->C:Z

    .line 8
    .line 9
    :try_start_0
    invoke-super {p0}, Lsp2;->close()V

    .line 10
    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-virtual {p0, v0}, Lt72;->a(Ljava/io/IOException;)Ljava/io/IOException;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :catch_0
    move-exception v0

    .line 18
    invoke-virtual {p0, v0}, Lt72;->a(Ljava/io/IOException;)Ljava/io/IOException;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    throw p0
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
.end method
