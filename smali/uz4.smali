.class public final Luz4;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lvz4;


# virtual methods
.method public final b(Lll4;)Z
    .locals 6

    .line 1
    const/4 p0, 0x0

    .line 2
    move-object v0, p0

    .line 3
    :goto_0
    const/4 v1, 0x0

    .line 4
    if-eqz p1, :cond_7

    .line 5
    .line 6
    instance-of v2, p1, Ltk5;

    .line 7
    .line 8
    const/4 v3, 0x1

    .line 9
    if-eqz v2, :cond_0

    .line 10
    .line 11
    check-cast p1, Ltk5;

    .line 12
    .line 13
    invoke-interface {p1}, Ltk5;->N()Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-eqz p1, :cond_6

    .line 18
    .line 19
    return v3

    .line 20
    :cond_0
    iget v2, p1, Lll4;->y:I

    .line 21
    .line 22
    const/16 v4, 0x10

    .line 23
    .line 24
    and-int/2addr v2, v4

    .line 25
    if-eqz v2, :cond_6

    .line 26
    .line 27
    instance-of v2, p1, Lwo1;

    .line 28
    .line 29
    if-eqz v2, :cond_6

    .line 30
    .line 31
    move-object v2, p1

    .line 32
    check-cast v2, Lwo1;

    .line 33
    .line 34
    iget-object v2, v2, Lwo1;->L:Lll4;

    .line 35
    .line 36
    :goto_1
    if-eqz v2, :cond_5

    .line 37
    .line 38
    iget v5, v2, Lll4;->y:I

    .line 39
    .line 40
    and-int/2addr v5, v4

    .line 41
    if-eqz v5, :cond_4

    .line 42
    .line 43
    add-int/lit8 v1, v1, 0x1

    .line 44
    .line 45
    if-ne v1, v3, :cond_1

    .line 46
    .line 47
    move-object p1, v2

    .line 48
    goto :goto_2

    .line 49
    :cond_1
    if-nez v0, :cond_2

    .line 50
    .line 51
    new-instance v0, Leq4;

    .line 52
    .line 53
    new-array v5, v4, [Lll4;

    .line 54
    .line 55
    invoke-direct {v0, v5}, Leq4;-><init>([Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    :cond_2
    if-eqz p1, :cond_3

    .line 59
    .line 60
    invoke-virtual {v0, p1}, Leq4;->b(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    move-object p1, p0

    .line 64
    :cond_3
    invoke-virtual {v0, v2}, Leq4;->b(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    :cond_4
    :goto_2
    iget-object v2, v2, Lll4;->B:Lll4;

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_5
    if-ne v1, v3, :cond_6

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_6
    invoke-static {v0}, Lrc9;->j(Leq4;)Lll4;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    goto :goto_0

    .line 78
    :cond_7
    return v1
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
.end method

.method public final c()I
    .locals 0

    .line 1
    const/16 p0, 0x10

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

.method public final e(Luy3;JLf03;IZ)V
    .locals 0

    .line 1
    invoke-virtual/range {p1 .. p6}, Luy3;->A(JLf03;IZ)V

    .line 2
    .line 3
    .line 4
    return-void
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
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
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
.end method

.method public final f(Lf03;Luy3;)Z
    .locals 8

    .line 1
    iget-object p0, p2, Luy3;->a0:Lo00;

    .line 2
    .line 3
    iget-object p0, p0, Lo00;->e:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, Lxz4;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    const/16 p2, 0x10

    .line 11
    .line 12
    invoke-static {p2}, Lyz4;->g(I)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    invoke-virtual {p0, v0}, Lxz4;->e1(Z)Lll4;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    const/4 v0, 0x0

    .line 21
    if-nez p0, :cond_0

    .line 22
    .line 23
    goto/16 :goto_4

    .line 24
    .line 25
    :cond_0
    iget-boolean v1, p0, Lll4;->J:Z

    .line 26
    .line 27
    if-eqz v1, :cond_a

    .line 28
    .line 29
    iget-object v1, p0, Lll4;->w:Lll4;

    .line 30
    .line 31
    iget-boolean v1, v1, Lll4;->J:Z

    .line 32
    .line 33
    if-nez v1, :cond_1

    .line 34
    .line 35
    const-string v1, "visitLocalDescendants called on an unattached node"

    .line 36
    .line 37
    invoke-static {v1}, Lyb3;->b(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    :cond_1
    iget-object p0, p0, Lll4;->w:Lll4;

    .line 41
    .line 42
    iget v1, p0, Lll4;->z:I

    .line 43
    .line 44
    and-int/2addr v1, p2

    .line 45
    if-eqz v1, :cond_a

    .line 46
    .line 47
    :goto_0
    if-eqz p0, :cond_a

    .line 48
    .line 49
    iget v1, p0, Lll4;->y:I

    .line 50
    .line 51
    and-int/2addr v1, p2

    .line 52
    if-eqz v1, :cond_9

    .line 53
    .line 54
    const/4 v1, 0x0

    .line 55
    move-object v2, p0

    .line 56
    move-object v3, v1

    .line 57
    :goto_1
    if-eqz v2, :cond_9

    .line 58
    .line 59
    instance-of v4, v2, Ltk5;

    .line 60
    .line 61
    const/4 v5, 0x1

    .line 62
    if-eqz v4, :cond_2

    .line 63
    .line 64
    check-cast v2, Ltk5;

    .line 65
    .line 66
    invoke-interface {v2}, Ltk5;->x0()Z

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    if-eqz v2, :cond_8

    .line 71
    .line 72
    iget-object p0, p1, Lf03;->w:Llp4;

    .line 73
    .line 74
    iget p0, p0, Llp4;->b:I

    .line 75
    .line 76
    sub-int/2addr p0, v5

    .line 77
    iput p0, p1, Lf03;->y:I

    .line 78
    .line 79
    return v5

    .line 80
    :cond_2
    iget v4, v2, Lll4;->y:I

    .line 81
    .line 82
    and-int/2addr v4, p2

    .line 83
    if-eqz v4, :cond_8

    .line 84
    .line 85
    instance-of v4, v2, Lwo1;

    .line 86
    .line 87
    if-eqz v4, :cond_8

    .line 88
    .line 89
    move-object v4, v2

    .line 90
    check-cast v4, Lwo1;

    .line 91
    .line 92
    iget-object v4, v4, Lwo1;->L:Lll4;

    .line 93
    .line 94
    move v6, v0

    .line 95
    :goto_2
    if-eqz v4, :cond_7

    .line 96
    .line 97
    iget v7, v4, Lll4;->y:I

    .line 98
    .line 99
    and-int/2addr v7, p2

    .line 100
    if-eqz v7, :cond_6

    .line 101
    .line 102
    add-int/lit8 v6, v6, 0x1

    .line 103
    .line 104
    if-ne v6, v5, :cond_3

    .line 105
    .line 106
    move-object v2, v4

    .line 107
    goto :goto_3

    .line 108
    :cond_3
    if-nez v3, :cond_4

    .line 109
    .line 110
    new-instance v3, Leq4;

    .line 111
    .line 112
    new-array v7, p2, [Lll4;

    .line 113
    .line 114
    invoke-direct {v3, v7}, Leq4;-><init>([Ljava/lang/Object;)V

    .line 115
    .line 116
    .line 117
    :cond_4
    if-eqz v2, :cond_5

    .line 118
    .line 119
    invoke-virtual {v3, v2}, Leq4;->b(Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    move-object v2, v1

    .line 123
    :cond_5
    invoke-virtual {v3, v4}, Leq4;->b(Ljava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    :cond_6
    :goto_3
    iget-object v4, v4, Lll4;->B:Lll4;

    .line 127
    .line 128
    goto :goto_2

    .line 129
    :cond_7
    if-ne v6, v5, :cond_8

    .line 130
    .line 131
    goto :goto_1

    .line 132
    :cond_8
    invoke-static {v3}, Lrc9;->j(Leq4;)Lll4;

    .line 133
    .line 134
    .line 135
    move-result-object v2

    .line 136
    goto :goto_1

    .line 137
    :cond_9
    iget-object p0, p0, Lll4;->B:Lll4;

    .line 138
    .line 139
    goto :goto_0

    .line 140
    :cond_a
    :goto_4
    return v0
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

.method public final g(Luy3;)Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
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
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method
