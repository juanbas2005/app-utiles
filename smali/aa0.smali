.class public final Laa0;
.super Ljava/io/InputStream;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 10
    iput p1, p0, Laa0;->w:I

    iput-object p2, p0, Laa0;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    return-void
.end method

.method public constructor <init>(Lgx5;Lyk8;)V
    .locals 0

    .line 1
    const/4 p1, 0x5

    .line 2
    iput p1, p0, Laa0;->w:I

    .line 3
    .line 4
    iput-object p2, p0, Laa0;->x:Ljava/lang/Object;

    .line 5
    .line 6
    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    .line 7
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

.method private final a()V
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


# virtual methods
.method public available()I
    .locals 5

    .line 1
    iget v0, p0, Laa0;->w:I

    .line 2
    .line 3
    const-wide/32 v1, 0x7fffffff

    .line 4
    .line 5
    .line 6
    iget-object v3, p0, Laa0;->x:Ljava/lang/Object;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    invoke-super {p0}, Ljava/io/InputStream;->available()I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0

    .line 16
    :pswitch_0
    check-cast v3, Lzw5;

    .line 17
    .line 18
    iget-boolean p0, v3, Lzw5;->y:Z

    .line 19
    .line 20
    if-nez p0, :cond_0

    .line 21
    .line 22
    iget-object p0, v3, Lzw5;->x:Lsc0;

    .line 23
    .line 24
    iget-wide v3, p0, Lsc0;->x:J

    .line 25
    .line 26
    invoke-static {v3, v4, v1, v2}, Ljava/lang/Math;->min(JJ)J

    .line 27
    .line 28
    .line 29
    move-result-wide v0

    .line 30
    long-to-int p0, v0

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    const-string p0, "closed"

    .line 33
    .line 34
    invoke-static {p0}, Lrf2;->i(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    const/4 p0, 0x0

    .line 38
    :goto_0
    return p0

    .line 39
    :pswitch_1
    check-cast v3, Laa0;

    .line 40
    .line 41
    invoke-virtual {v3}, Ljava/io/InputStream;->available()I

    .line 42
    .line 43
    .line 44
    move-result p0

    .line 45
    return p0

    .line 46
    :pswitch_2
    check-cast v3, Lsc0;

    .line 47
    .line 48
    iget-wide v3, v3, Lsc0;->x:J

    .line 49
    .line 50
    invoke-static {v3, v4, v1, v2}, Ljava/lang/Math;->min(JJ)J

    .line 51
    .line 52
    .line 53
    move-result-wide v0

    .line 54
    long-to-int p0, v0

    .line 55
    return p0

    .line 56
    nop

    .line 57
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
.end method

.method public close()V
    .locals 2

    .line 1
    iget v0, p0, Laa0;->w:I

    .line 2
    .line 3
    iget-object v1, p0, Laa0;->x:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-super {p0}, Ljava/io/InputStream;->close()V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :pswitch_0
    check-cast v1, Lzw5;

    .line 13
    .line 14
    invoke-virtual {v1}, Lzw5;->close()V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :pswitch_1
    invoke-super {p0}, Ljava/io/InputStream;->close()V

    .line 19
    .line 20
    .line 21
    check-cast v1, Laa0;

    .line 22
    .line 23
    invoke-virtual {v1}, Laa0;->close()V

    .line 24
    .line 25
    .line 26
    :pswitch_2
    return-void

    .line 27
    :pswitch_3
    check-cast v1, Lhf0;

    .line 28
    .line 29
    invoke-static {v1}, Lt49;->w(Lhf0;)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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

.method public final read()I
    .locals 7

    iget v0, p0, Laa0;->w:I

    const-wide/16 v1, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, -0x1

    iget-object v6, p0, Laa0;->x:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    .line 253
    check-cast v6, Lyk8;

    new-array p0, v3, [B

    invoke-virtual {v6, p0, v4, v3}, Lyk8;->f([BII)I

    move-result v0

    if-ne v0, v5, :cond_0

    goto :goto_0

    :cond_0
    aget-byte v5, p0, v4

    :goto_0
    return v5

    .line 254
    :pswitch_0
    new-array v0, v3, [B

    invoke-virtual {p0, v0, v4, v3}, Laa0;->read([BII)I

    move-result p0

    if-ne p0, v5, :cond_1

    goto :goto_1

    :cond_1
    aget-byte v5, v0, v4

    :goto_1
    return v5

    .line 255
    :pswitch_1
    check-cast v6, Lzw5;

    iget-object p0, v6, Lzw5;->x:Lsc0;

    iget-boolean v0, v6, Lzw5;->y:Z

    if-nez v0, :cond_3

    .line 256
    iget-wide v3, p0, Lsc0;->x:J

    cmp-long v0, v3, v1

    if-nez v0, :cond_2

    .line 257
    iget-object v0, v6, Lzw5;->w:Loy6;

    const-wide/16 v1, 0x2000

    invoke-interface {v0, v1, v2, p0}, Loy6;->Y(JLsc0;)J

    move-result-wide v0

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-nez v0, :cond_2

    move v4, v5

    goto :goto_2

    .line 258
    :cond_2
    invoke-virtual {p0}, Lsc0;->readByte()B

    move-result p0

    and-int/lit16 v4, p0, 0xff

    goto :goto_2

    .line 259
    :cond_3
    const-string p0, "closed"

    invoke-static {p0}, Lrf2;->i(Ljava/lang/String;)V

    :goto_2
    return v4

    .line 260
    :pswitch_2
    check-cast v6, Laa0;

    invoke-virtual {v6}, Laa0;->read()I

    move-result p0

    return p0

    .line 261
    :pswitch_3
    check-cast v6, Lsc0;

    .line 262
    iget-wide v3, v6, Lsc0;->x:J

    cmp-long p0, v3, v1

    if-lez p0, :cond_4

    .line 263
    invoke-virtual {v6}, Lsc0;->readByte()B

    move-result p0

    and-int/lit16 v5, p0, 0xff

    :cond_4
    return v5

    .line 264
    :pswitch_4
    check-cast v6, Lhf0;

    invoke-interface {v6}, Lhf0;->h()Z

    move-result p0

    if-eqz p0, :cond_5

    goto :goto_3

    .line 265
    :cond_5
    invoke-interface {v6}, Lhf0;->g()Ltc0;

    move-result-object p0

    invoke-virtual {p0}, Ltc0;->x()Z

    move-result p0

    if-eqz p0, :cond_6

    .line 266
    new-instance p0, Lot;

    const/4 v0, 0x3

    const/4 v1, 0x0

    invoke-direct {p0, v6, v1, v0}, Lot;-><init>(Ljava/lang/Object;Lf61;I)V

    invoke-static {p0}, Lar7;->T(Lgs2;)Ljava/lang/Object;

    .line 267
    :cond_6
    invoke-interface {v6}, Lhf0;->h()Z

    move-result p0

    if-eqz p0, :cond_7

    goto :goto_3

    .line 268
    :cond_7
    invoke-interface {v6}, Lhf0;->g()Ltc0;

    move-result-object p0

    invoke-virtual {p0}, Ltc0;->readByte()B

    move-result p0

    and-int/lit16 v5, p0, 0xff

    :goto_3
    return v5

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final read([BII)I
    .locals 9

    .line 1
    iget v0, p0, Laa0;->w:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, -0x1

    .line 5
    iget-object p0, p0, Laa0;->x:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p0, Lyk8;

    .line 11
    .line 12
    invoke-virtual {p0, p1, p2, p3}, Lyk8;->f([BII)I

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    return p0

    .line 17
    :pswitch_0
    check-cast p0, Lgx5;

    .line 18
    .line 19
    :try_start_0
    iget-object v0, p0, Lgx5;->x:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, Ljava/util/zip/Inflater;

    .line 22
    .line 23
    invoke-virtual {v0, p1, p2, p3}, Ljava/util/zip/Inflater;->inflate([BII)I

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    if-lez p1, :cond_0

    .line 28
    .line 29
    move v1, p1

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    if-eqz p3, :cond_2

    .line 32
    .line 33
    iget-object p1, p0, Lgx5;->x:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast p1, Ljava/util/zip/Inflater;

    .line 36
    .line 37
    invoke-virtual {p1}, Ljava/util/zip/Inflater;->getRemaining()I

    .line 38
    .line 39
    .line 40
    move-result p1
    :try_end_0
    .catch Ljava/util/zip/DataFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 41
    if-nez p1, :cond_1

    .line 42
    .line 43
    move v1, v2

    .line 44
    goto :goto_0

    .line 45
    :cond_1
    iget-object p0, p0, Lgx5;->x:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast p0, Ljava/util/zip/Inflater;

    .line 48
    .line 49
    new-instance p1, Ljava/io/IOException;

    .line 50
    .line 51
    invoke-virtual {p0}, Ljava/util/zip/Inflater;->getRemaining()I

    .line 52
    .line 53
    .line 54
    move-result p0

    .line 55
    invoke-static {p3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p2

    .line 59
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 60
    .line 61
    .line 62
    move-result p2

    .line 63
    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    add-int/lit8 p2, p2, 0x46

    .line 68
    .line 69
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    add-int/2addr p2, v0

    .line 74
    new-instance v0, Ljava/lang/StringBuilder;

    .line 75
    .line 76
    invoke-direct {v0, p2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 77
    .line 78
    .line 79
    const-string p2, "Read no bytes (requested up to "

    .line 80
    .line 81
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    const-string p2, ") but did not reach end of stream, had "

    .line 88
    .line 89
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    invoke-direct {p1, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    throw p1

    .line 103
    :cond_2
    :goto_0
    return v1

    .line 104
    :catch_0
    move-exception v0

    .line 105
    move-object p0, v0

    .line 106
    new-instance p1, Ljava/io/IOException;

    .line 107
    .line 108
    invoke-direct {p1, p0}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    .line 109
    .line 110
    .line 111
    throw p1

    .line 112
    :pswitch_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    check-cast p0, Lzw5;

    .line 116
    .line 117
    iget-object v0, p0, Lzw5;->x:Lsc0;

    .line 118
    .line 119
    iget-boolean v3, p0, Lzw5;->y:Z

    .line 120
    .line 121
    if-nez v3, :cond_4

    .line 122
    .line 123
    array-length v1, p1

    .line 124
    int-to-long v3, v1

    .line 125
    int-to-long v5, p2

    .line 126
    int-to-long v7, p3

    .line 127
    invoke-static/range {v3 .. v8}, Lt49;->x(JJJ)V

    .line 128
    .line 129
    .line 130
    iget-wide v3, v0, Lsc0;->x:J

    .line 131
    .line 132
    const-wide/16 v5, 0x0

    .line 133
    .line 134
    cmp-long v1, v3, v5

    .line 135
    .line 136
    if-nez v1, :cond_3

    .line 137
    .line 138
    iget-object p0, p0, Lzw5;->w:Loy6;

    .line 139
    .line 140
    const-wide/16 v3, 0x2000

    .line 141
    .line 142
    invoke-interface {p0, v3, v4, v0}, Loy6;->Y(JLsc0;)J

    .line 143
    .line 144
    .line 145
    move-result-wide v3

    .line 146
    const-wide/16 v5, -0x1

    .line 147
    .line 148
    cmp-long p0, v3, v5

    .line 149
    .line 150
    if-nez p0, :cond_3

    .line 151
    .line 152
    move v1, v2

    .line 153
    goto :goto_1

    .line 154
    :cond_3
    invoke-virtual {v0, p1, p2, p3}, Lsc0;->read([BII)I

    .line 155
    .line 156
    .line 157
    move-result v1

    .line 158
    goto :goto_1

    .line 159
    :cond_4
    const-string p0, "closed"

    .line 160
    .line 161
    invoke-static {p0}, Lrf2;->i(Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    :goto_1
    return v1

    .line 165
    :pswitch_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 166
    .line 167
    .line 168
    check-cast p0, Laa0;

    .line 169
    .line 170
    invoke-virtual {p0, p1, p2, p3}, Laa0;->read([BII)I

    .line 171
    .line 172
    .line 173
    move-result p0

    .line 174
    return p0

    .line 175
    :pswitch_3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 176
    .line 177
    .line 178
    check-cast p0, Lsc0;

    .line 179
    .line 180
    invoke-virtual {p0, p1, p2, p3}, Lsc0;->read([BII)I

    .line 181
    .line 182
    .line 183
    move-result p0

    .line 184
    return p0

    .line 185
    :pswitch_4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 186
    .line 187
    .line 188
    check-cast p0, Lhf0;

    .line 189
    .line 190
    invoke-interface {p0}, Lhf0;->h()Z

    .line 191
    .line 192
    .line 193
    move-result v0

    .line 194
    if-eqz v0, :cond_5

    .line 195
    .line 196
    goto :goto_2

    .line 197
    :cond_5
    invoke-interface {p0}, Lhf0;->g()Ltc0;

    .line 198
    .line 199
    .line 200
    move-result-object v0

    .line 201
    invoke-virtual {v0}, Ltc0;->x()Z

    .line 202
    .line 203
    .line 204
    move-result v0

    .line 205
    if-eqz v0, :cond_6

    .line 206
    .line 207
    new-instance v0, Lot;

    .line 208
    .line 209
    const/4 v3, 0x3

    .line 210
    const/4 v4, 0x0

    .line 211
    invoke-direct {v0, p0, v4, v3}, Lot;-><init>(Ljava/lang/Object;Lf61;I)V

    .line 212
    .line 213
    .line 214
    invoke-static {v0}, Lar7;->T(Lgs2;)Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    :cond_6
    invoke-interface {p0}, Lhf0;->g()Ltc0;

    .line 218
    .line 219
    .line 220
    move-result-object v0

    .line 221
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 222
    .line 223
    .line 224
    iget-wide v3, v0, Ltc0;->y:J

    .line 225
    .line 226
    long-to-int v0, v3

    .line 227
    invoke-static {v0, p3}, Ljava/lang/Math;->min(II)I

    .line 228
    .line 229
    .line 230
    move-result p3

    .line 231
    invoke-interface {p0}, Lhf0;->g()Ltc0;

    .line 232
    .line 233
    .line 234
    move-result-object v0

    .line 235
    add-int/2addr p3, p2

    .line 236
    invoke-virtual {v0, p1, p2, p3}, Ltc0;->k([BII)I

    .line 237
    .line 238
    .line 239
    move-result p1

    .line 240
    if-ltz p1, :cond_7

    .line 241
    .line 242
    move v1, p1

    .line 243
    goto :goto_3

    .line 244
    :cond_7
    invoke-interface {p0}, Lhf0;->h()Z

    .line 245
    .line 246
    .line 247
    move-result p0

    .line 248
    if-eqz p0, :cond_8

    .line 249
    .line 250
    :goto_2
    move v1, v2

    .line 251
    :cond_8
    :goto_3
    return v1

    .line 252
    nop

    .line 253
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
.end method

.method public skip(J)J
    .locals 3

    .line 1
    iget v0, p0, Laa0;->w:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2}, Ljava/io/InputStream;->skip(J)J

    .line 7
    .line 8
    .line 9
    move-result-wide p0

    .line 10
    return-wide p0

    .line 11
    :pswitch_0
    const-wide/16 v0, 0x0

    .line 12
    .line 13
    cmp-long v2, p1, v0

    .line 14
    .line 15
    if-gtz v2, :cond_0

    .line 16
    .line 17
    goto :goto_1

    .line 18
    :cond_0
    const-wide/32 v0, 0x7fffffff

    .line 19
    .line 20
    .line 21
    cmp-long v0, p1, v0

    .line 22
    .line 23
    if-lez v0, :cond_1

    .line 24
    .line 25
    const p1, 0x7fffffff

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    long-to-int p1, p1

    .line 30
    :goto_0
    iget-object p0, p0, Laa0;->x:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast p0, Lyk8;

    .line 33
    .line 34
    invoke-virtual {p0, p1}, Lyk8;->g(I)V

    .line 35
    .line 36
    .line 37
    int-to-long v0, p1

    .line 38
    :goto_1
    return-wide v0

    .line 39
    :pswitch_data_0
    .packed-switch 0x5
        :pswitch_0
    .end packed-switch
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

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    iget v0, p0, Laa0;->w:I

    .line 2
    .line 3
    const-string v1, ".inputStream()"

    .line 4
    .line 5
    iget-object v2, p0, Laa0;->x:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    :pswitch_0
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0

    .line 15
    :pswitch_1
    new-instance p0, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 18
    .line 19
    .line 20
    check-cast v2, Lzw5;

    .line 21
    .line 22
    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    return-object p0

    .line 33
    :pswitch_2
    new-instance p0, Ljava/lang/StringBuilder;

    .line 34
    .line 35
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 36
    .line 37
    .line 38
    check-cast v2, Lsc0;

    .line 39
    .line 40
    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    return-object p0

    .line 51
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
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

.method public transferTo(Ljava/io/OutputStream;)J
    .locals 14

    .line 1
    iget v0, p0, Laa0;->w:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Ljava/io/InputStream;->transferTo(Ljava/io/OutputStream;)J

    .line 7
    .line 8
    .line 9
    move-result-wide p0

    .line 10
    return-wide p0

    .line 11
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    iget-object p0, p0, Laa0;->x:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p0, Lzw5;

    .line 17
    .line 18
    iget-object v0, p0, Lzw5;->x:Lsc0;

    .line 19
    .line 20
    iget-boolean v1, p0, Lzw5;->y:Z

    .line 21
    .line 22
    const-wide/16 v2, 0x0

    .line 23
    .line 24
    if-nez v1, :cond_4

    .line 25
    .line 26
    move-wide v4, v2

    .line 27
    :cond_0
    iget-wide v6, v0, Lsc0;->x:J

    .line 28
    .line 29
    cmp-long v1, v6, v2

    .line 30
    .line 31
    if-nez v1, :cond_2

    .line 32
    .line 33
    iget-object v1, p0, Lzw5;->w:Loy6;

    .line 34
    .line 35
    const-wide/16 v6, 0x2000

    .line 36
    .line 37
    invoke-interface {v1, v6, v7, v0}, Loy6;->Y(JLsc0;)J

    .line 38
    .line 39
    .line 40
    move-result-wide v6

    .line 41
    const-wide/16 v8, -0x1

    .line 42
    .line 43
    cmp-long v1, v6, v8

    .line 44
    .line 45
    if-eqz v1, :cond_1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    move-wide v2, v4

    .line 49
    goto :goto_2

    .line 50
    :cond_2
    :goto_0
    iget-wide v6, v0, Lsc0;->x:J

    .line 51
    .line 52
    add-long/2addr v4, v6

    .line 53
    const-wide/16 v8, 0x0

    .line 54
    .line 55
    move-wide v10, v6

    .line 56
    invoke-static/range {v6 .. v11}, Lt49;->x(JJJ)V

    .line 57
    .line 58
    .line 59
    iget-object v1, v0, Lsc0;->w:Lqi6;

    .line 60
    .line 61
    :cond_3
    :goto_1
    cmp-long v8, v6, v2

    .line 62
    .line 63
    if-lez v8, :cond_0

    .line 64
    .line 65
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    iget v8, v1, Lqi6;->c:I

    .line 69
    .line 70
    iget v9, v1, Lqi6;->b:I

    .line 71
    .line 72
    sub-int/2addr v8, v9

    .line 73
    int-to-long v8, v8

    .line 74
    invoke-static {v6, v7, v8, v9}, Ljava/lang/Math;->min(JJ)J

    .line 75
    .line 76
    .line 77
    move-result-wide v8

    .line 78
    long-to-int v8, v8

    .line 79
    iget-object v9, v1, Lqi6;->a:[B

    .line 80
    .line 81
    iget v10, v1, Lqi6;->b:I

    .line 82
    .line 83
    invoke-virtual {p1, v9, v10, v8}, Ljava/io/OutputStream;->write([BII)V

    .line 84
    .line 85
    .line 86
    iget v9, v1, Lqi6;->b:I

    .line 87
    .line 88
    add-int/2addr v9, v8

    .line 89
    iput v9, v1, Lqi6;->b:I

    .line 90
    .line 91
    iget-wide v10, v0, Lsc0;->x:J

    .line 92
    .line 93
    int-to-long v12, v8

    .line 94
    sub-long/2addr v10, v12

    .line 95
    iput-wide v10, v0, Lsc0;->x:J

    .line 96
    .line 97
    sub-long/2addr v6, v12

    .line 98
    iget v8, v1, Lqi6;->c:I

    .line 99
    .line 100
    if-ne v9, v8, :cond_3

    .line 101
    .line 102
    invoke-virtual {v1}, Lqi6;->a()Lqi6;

    .line 103
    .line 104
    .line 105
    move-result-object v8

    .line 106
    iput-object v8, v0, Lsc0;->w:Lqi6;

    .line 107
    .line 108
    invoke-static {v1}, Lti6;->a(Lqi6;)V

    .line 109
    .line 110
    .line 111
    move-object v1, v8

    .line 112
    goto :goto_1

    .line 113
    :cond_4
    const-string p0, "closed"

    .line 114
    .line 115
    invoke-static {p0}, Lrf2;->i(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    :goto_2
    return-wide v2

    .line 119
    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_0
    .end packed-switch
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
