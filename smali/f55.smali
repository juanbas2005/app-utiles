.class public abstract Lf55;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# static fields
.field public static a:Lx83;

.field public static b:Lx83;

.field public static final synthetic c:I

.field public static d:J

.field public static e:Ljava/lang/reflect/Method;

.field public static f:Ljava/lang/reflect/Method;

.field public static g:Ljava/lang/reflect/Method;

.field public static h:Lx83;


# direct methods
.method public static final a(Lzc9;Leb0;)Ljj6;
    .locals 4

    .line 1
    invoke-virtual {p0}, Lzc9;->b()Lfc1;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object p0, p0, Lzc9;->z:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Ltt2;

    .line 8
    .line 9
    sget-object v1, Lfc1;->w:Lfc1;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    const/4 v3, 0x1

    .line 13
    if-ne v0, v1, :cond_0

    .line 14
    .line 15
    move v0, v3

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move v0, v2

    .line 18
    :goto_0
    new-instance v1, Ljj6;

    .line 19
    .line 20
    invoke-static {p0, v0, v3, p1}, Lf55;->c(Ltt2;ZZLeb0;)Lij6;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    invoke-static {p0, v0, v2, p1}, Lf55;->c(Ltt2;ZZLeb0;)Lij6;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-direct {v1, v3, p0, v0}, Ljj6;-><init>(Lij6;Lij6;Z)V

    .line 29
    .line 30
    .line 31
    return-object v1
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

.method public static final b(Lzc9;Ltt2;Lij6;)Lij6;
    .locals 13

    .line 1
    iget v0, p1, Ltt2;->c:I

    .line 2
    .line 3
    iget v1, p1, Ltt2;->b:I

    .line 4
    .line 5
    iget-boolean v2, p0, Lzc9;->x:Z

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move v5, v1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move v5, v0

    .line 12
    :goto_0
    iget-object v3, p1, Ltt2;->e:Ljava/lang/Object;

    .line 13
    .line 14
    move-object v9, v3

    .line 15
    check-cast v9, Lbg7;

    .line 16
    .line 17
    iget v10, p1, Ltt2;->d:I

    .line 18
    .line 19
    new-instance v3, Lpb5;

    .line 20
    .line 21
    invoke-direct {v3, v5, p1}, Lpb5;-><init>(ILtt2;)V

    .line 22
    .line 23
    .line 24
    sget-object v11, Li44;->x:Li44;

    .line 25
    .line 26
    invoke-static {v11, v3}, Lrg3;->y(Li44;Lsr2;)Lnz3;

    .line 27
    .line 28
    .line 29
    move-result-object v8

    .line 30
    if-eqz v2, :cond_1

    .line 31
    .line 32
    move v6, v0

    .line 33
    goto :goto_1

    .line 34
    :cond_1
    move v6, v1

    .line 35
    :goto_1
    new-instance v3, Lmj6;

    .line 36
    .line 37
    move-object v7, p0

    .line 38
    move-object v4, p1

    .line 39
    invoke-direct/range {v3 .. v8}, Lmj6;-><init>(Ltt2;IILzc9;Lnz3;)V

    .line 40
    .line 41
    .line 42
    invoke-static {v11, v3}, Lrg3;->y(Li44;Lsr2;)Lnz3;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    const-wide/16 v6, 0x1

    .line 47
    .line 48
    iget-wide v11, p2, Lij6;->c:J

    .line 49
    .line 50
    cmp-long p1, v6, v11

    .line 51
    .line 52
    if-eqz p1, :cond_2

    .line 53
    .line 54
    invoke-interface {p0}, Lnz3;->getValue()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    check-cast p0, Lij6;

    .line 59
    .line 60
    return-object p0

    .line 61
    :cond_2
    if-ne v5, v10, :cond_3

    .line 62
    .line 63
    return-object p2

    .line 64
    :cond_3
    iget-object p1, v9, Lbg7;->b:Lpn4;

    .line 65
    .line 66
    invoke-virtual {p1, v10}, Lpn4;->d(I)I

    .line 67
    .line 68
    .line 69
    move-result p1

    .line 70
    invoke-interface {v8}, Lnz3;->getValue()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    check-cast v3, Ljava/lang/Number;

    .line 75
    .line 76
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 77
    .line 78
    .line 79
    move-result v3

    .line 80
    if-eq v3, p1, :cond_4

    .line 81
    .line 82
    invoke-interface {p0}, Lnz3;->getValue()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    check-cast p0, Lij6;

    .line 87
    .line 88
    return-object p0

    .line 89
    :cond_4
    iget p1, p2, Lij6;->b:I

    .line 90
    .line 91
    invoke-virtual {v9, p1}, Lbg7;->j(I)J

    .line 92
    .line 93
    .line 94
    move-result-wide v6

    .line 95
    const/4 p2, -0x1

    .line 96
    if-ne v10, p2, :cond_5

    .line 97
    .line 98
    goto :goto_4

    .line 99
    :cond_5
    if-ne v5, v10, :cond_6

    .line 100
    .line 101
    goto :goto_6

    .line 102
    :cond_6
    sget-object p2, Lfc1;->w:Lfc1;

    .line 103
    .line 104
    if-ge v1, v0, :cond_7

    .line 105
    .line 106
    sget-object v0, Lfc1;->x:Lfc1;

    .line 107
    .line 108
    goto :goto_2

    .line 109
    :cond_7
    if-le v1, v0, :cond_8

    .line 110
    .line 111
    move-object v0, p2

    .line 112
    goto :goto_2

    .line 113
    :cond_8
    sget-object v0, Lfc1;->y:Lfc1;

    .line 114
    .line 115
    :goto_2
    if-ne v0, p2, :cond_9

    .line 116
    .line 117
    const/4 p2, 0x1

    .line 118
    goto :goto_3

    .line 119
    :cond_9
    const/4 p2, 0x0

    .line 120
    :goto_3
    xor-int/2addr p2, v2

    .line 121
    if-eqz p2, :cond_a

    .line 122
    .line 123
    if-ge v5, v10, :cond_d

    .line 124
    .line 125
    goto :goto_4

    .line 126
    :cond_a
    if-le v5, v10, :cond_d

    .line 127
    .line 128
    :goto_4
    sget p2, Llg7;->c:I

    .line 129
    .line 130
    const/16 p2, 0x20

    .line 131
    .line 132
    shr-long v0, v6, p2

    .line 133
    .line 134
    long-to-int p2, v0

    .line 135
    if-eq p1, p2, :cond_c

    .line 136
    .line 137
    const-wide v0, 0xffffffffL

    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    and-long/2addr v0, v6

    .line 143
    long-to-int p2, v0

    .line 144
    if-ne p1, p2, :cond_b

    .line 145
    .line 146
    goto :goto_5

    .line 147
    :cond_b
    invoke-virtual {v4, v5}, Ltt2;->b(I)Lij6;

    .line 148
    .line 149
    .line 150
    move-result-object p0

    .line 151
    return-object p0

    .line 152
    :cond_c
    :goto_5
    invoke-interface {p0}, Lnz3;->getValue()Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object p0

    .line 156
    check-cast p0, Lij6;

    .line 157
    .line 158
    return-object p0

    .line 159
    :cond_d
    :goto_6
    invoke-virtual {v4, v5}, Ltt2;->b(I)Lij6;

    .line 160
    .line 161
    .line 162
    move-result-object p0

    .line 163
    return-object p0
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

.method public static final c(Ltt2;ZZLeb0;)Lij6;
    .locals 2

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    iget v0, p0, Ltt2;->b:I

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iget v0, p0, Ltt2;->c:I

    .line 7
    .line 8
    :goto_0
    invoke-interface {p3, v0, p0}, Leb0;->A(ILtt2;)J

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    xor-int/2addr p1, p2

    .line 13
    if-eqz p1, :cond_1

    .line 14
    .line 15
    sget p1, Llg7;->c:I

    .line 16
    .line 17
    const/16 p1, 0x20

    .line 18
    .line 19
    shr-long p1, v0, p1

    .line 20
    .line 21
    :goto_1
    long-to-int p1, p1

    .line 22
    goto :goto_2

    .line 23
    :cond_1
    sget p1, Llg7;->c:I

    .line 24
    .line 25
    const-wide p1, 0xffffffffL

    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    and-long/2addr p1, v0

    .line 31
    goto :goto_1

    .line 32
    :goto_2
    invoke-virtual {p0, p1}, Ltt2;->b(I)Lij6;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    return-object p0
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

.method public static final d(Lij6;Ltt2;I)Lij6;
    .locals 2

    .line 1
    iget-object p1, p1, Ltt2;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p1, Lbg7;

    .line 4
    .line 5
    invoke-virtual {p1, p2}, Lbg7;->a(I)Lp56;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iget-wide v0, p0, Lij6;->c:J

    .line 10
    .line 11
    new-instance p0, Lij6;

    .line 12
    .line 13
    invoke-direct {p0, p1, p2, v0, v1}, Lij6;-><init>(Lp56;IJ)V

    .line 14
    .line 15
    .line 16
    return-object p0
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

.method public static f(I)Ls96;
    .locals 12

    .line 1
    and-int/lit8 p0, p0, 0x1

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    const/16 p0, 0x8

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/16 p0, 0xa

    .line 9
    .line 10
    :goto_0
    sget v0, Lj18;->b:F

    .line 11
    .line 12
    int-to-float v1, p0

    .line 13
    div-float/2addr v0, v1

    .line 14
    float-to-double v2, v0

    .line 15
    invoke-static {v2, v3}, Ljava/lang/Math;->cos(D)D

    .line 16
    .line 17
    .line 18
    move-result-wide v2

    .line 19
    double-to-float v0, v2

    .line 20
    const/high16 v2, 0x3f800000    # 1.0f

    .line 21
    .line 22
    div-float v0, v2, v0

    .line 23
    .line 24
    new-instance v3, Ly71;

    .line 25
    .line 26
    const/4 v4, 0x2

    .line 27
    invoke-direct {v3, v4, v2}, Ly71;-><init>(IF)V

    .line 28
    .line 29
    .line 30
    mul-int/lit8 v2, p0, 0x2

    .line 31
    .line 32
    new-array v2, v2, [F

    .line 33
    .line 34
    const/4 v5, 0x0

    .line 35
    move v6, v5

    .line 36
    :goto_1
    const/4 v7, 0x0

    .line 37
    if-ge v5, p0, :cond_1

    .line 38
    .line 39
    sget v8, Lj18;->b:F

    .line 40
    .line 41
    div-float/2addr v8, v1

    .line 42
    const/high16 v9, 0x40000000    # 2.0f

    .line 43
    .line 44
    mul-float/2addr v8, v9

    .line 45
    int-to-float v9, v5

    .line 46
    mul-float/2addr v8, v9

    .line 47
    invoke-static {v0, v8}, Lj18;->e(FF)J

    .line 48
    .line 49
    .line 50
    move-result-wide v8

    .line 51
    invoke-static {v7, v7}, Lmh2;->a(FF)J

    .line 52
    .line 53
    .line 54
    move-result-wide v10

    .line 55
    invoke-static {v8, v9, v10, v11}, Ljb5;->D(JJ)J

    .line 56
    .line 57
    .line 58
    move-result-wide v7

    .line 59
    add-int/lit8 v9, v6, 0x1

    .line 60
    .line 61
    invoke-static {v7, v8}, Ljb5;->r(J)F

    .line 62
    .line 63
    .line 64
    move-result v10

    .line 65
    aput v10, v2, v6

    .line 66
    .line 67
    add-int/2addr v6, v4

    .line 68
    invoke-static {v7, v8}, Ljb5;->s(J)F

    .line 69
    .line 70
    .line 71
    move-result v7

    .line 72
    aput v7, v2, v9

    .line 73
    .line 74
    add-int/lit8 v5, v5, 0x1

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_1
    const/4 p0, 0x0

    .line 78
    invoke-static {v2, v3, p0, v7, v7}, La35;->b([FLy71;Ljava/util/AbstractList;FF)Ls96;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    return-object p0
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

.method public static final g(Lvo1;)Lyc7;
    .locals 13

    .line 1
    new-instance v2, Lwc7;

    .line 2
    .line 3
    invoke-direct {v2}, Lwc7;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lno6;

    .line 7
    .line 8
    const/4 v7, 0x0

    .line 9
    const/16 v8, 0x1d

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    const-class v3, Lwc7;

    .line 13
    .line 14
    const-string v4, "addFilter"

    .line 15
    .line 16
    const-string v5, "addFilter$foundation(Lkotlin/jvm/functions/Function1;)V"

    .line 17
    .line 18
    const/4 v6, 0x0

    .line 19
    invoke-direct/range {v0 .. v8}, Lno6;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;III)V

    .line 20
    .line 21
    .line 22
    new-instance v1, Lay5;

    .line 23
    .line 24
    const/16 v3, 0x15

    .line 25
    .line 26
    invoke-direct {v1, v3, v2}, Lay5;-><init>(ILjava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    new-instance v3, Lay5;

    .line 30
    .line 31
    invoke-direct {v3, v1, v0}, Lay5;-><init>(Lay5;Lno6;)V

    .line 32
    .line 33
    .line 34
    sget-object v0, Lad7;->a:Lad7;

    .line 35
    .line 36
    invoke-static {p0, v0, v3}, Lh75;->t(Lvo1;Ljava/lang/Object;Lvr2;)V

    .line 37
    .line 38
    .line 39
    new-instance p0, Llp4;

    .line 40
    .line 41
    invoke-direct {p0}, Llp4;-><init>()V

    .line 42
    .line 43
    .line 44
    iget-object v0, v2, Lwc7;->a:Llp4;

    .line 45
    .line 46
    iget-object v1, v0, Llp4;->a:[Ljava/lang/Object;

    .line 47
    .line 48
    iget v0, v0, Llp4;->b:I

    .line 49
    .line 50
    const/4 v3, 0x0

    .line 51
    const/4 v4, 0x1

    .line 52
    const/4 v5, 0x0

    .line 53
    move v6, v3

    .line 54
    move v7, v4

    .line 55
    move-object v8, v5

    .line 56
    :goto_0
    sget-object v9, Lld7;->b:Lld7;

    .line 57
    .line 58
    if-ge v6, v0, :cond_6

    .line 59
    .line 60
    aget-object v10, v1, v6

    .line 61
    .line 62
    check-cast v10, Lxc7;

    .line 63
    .line 64
    if-eqz v7, :cond_0

    .line 65
    .line 66
    if-eq v10, v9, :cond_5

    .line 67
    .line 68
    :cond_0
    if-ne v10, v9, :cond_1

    .line 69
    .line 70
    if-ne v8, v9, :cond_1

    .line 71
    .line 72
    goto :goto_2

    .line 73
    :cond_1
    if-ne v10, v9, :cond_2

    .line 74
    .line 75
    goto :goto_3

    .line 76
    :cond_2
    iget-object v7, v2, Lwc7;->b:Llp4;

    .line 77
    .line 78
    iget-object v9, v7, Llp4;->a:[Ljava/lang/Object;

    .line 79
    .line 80
    iget v7, v7, Llp4;->b:I

    .line 81
    .line 82
    move v11, v3

    .line 83
    :goto_1
    if-ge v11, v7, :cond_4

    .line 84
    .line 85
    aget-object v12, v9, v11

    .line 86
    .line 87
    check-cast v12, Lvr2;

    .line 88
    .line 89
    invoke-interface {v12, v10}, Lvr2;->y(Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v12

    .line 93
    check-cast v12, Ljava/lang/Boolean;

    .line 94
    .line 95
    invoke-virtual {v12}, Ljava/lang/Boolean;->booleanValue()Z

    .line 96
    .line 97
    .line 98
    move-result v12

    .line 99
    if-nez v12, :cond_3

    .line 100
    .line 101
    :goto_2
    move v7, v3

    .line 102
    goto :goto_4

    .line 103
    :cond_3
    add-int/lit8 v11, v11, 0x1

    .line 104
    .line 105
    goto :goto_1

    .line 106
    :cond_4
    :goto_3
    invoke-virtual {p0, v10}, Llp4;->a(Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    move v7, v3

    .line 110
    move-object v8, v10

    .line 111
    :cond_5
    :goto_4
    add-int/lit8 v6, v6, 0x1

    .line 112
    .line 113
    goto :goto_0

    .line 114
    :cond_6
    invoke-virtual {p0}, Llp4;->h()Z

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    if-eqz v0, :cond_7

    .line 119
    .line 120
    goto :goto_5

    .line 121
    :cond_7
    iget-object v0, p0, Llp4;->a:[Ljava/lang/Object;

    .line 122
    .line 123
    iget v1, p0, Llp4;->b:I

    .line 124
    .line 125
    sub-int/2addr v1, v4

    .line 126
    aget-object v5, v0, v1

    .line 127
    .line 128
    :goto_5
    check-cast v5, Lxc7;

    .line 129
    .line 130
    if-ne v5, v9, :cond_8

    .line 131
    .line 132
    iget v0, p0, Llp4;->b:I

    .line 133
    .line 134
    sub-int/2addr v0, v4

    .line 135
    invoke-virtual {p0, v0}, Llp4;->k(I)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    :cond_8
    new-instance v0, Lyc7;

    .line 139
    .line 140
    iget-object v1, p0, Llp4;->c:Ljp4;

    .line 141
    .line 142
    if-eqz v1, :cond_9

    .line 143
    .line 144
    goto :goto_6

    .line 145
    :cond_9
    new-instance v1, Ljp4;

    .line 146
    .line 147
    invoke-direct {v1, v3, p0}, Ljp4;-><init>(ILjava/lang/Object;)V

    .line 148
    .line 149
    .line 150
    iput-object v1, p0, Llp4;->c:Ljp4;

    .line 151
    .line 152
    :goto_6
    invoke-direct {v0, v1}, Lyc7;-><init>(Ljava/util/List;)V

    .line 153
    .line 154
    .line 155
    return-object v0
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

.method public static final h(J[BIII)V
    .locals 4

    .line 1
    rsub-int/lit8 p4, p4, 0x7

    .line 2
    .line 3
    rsub-int/lit8 p5, p5, 0x8

    .line 4
    .line 5
    if-gt p5, p4, :cond_0

    .line 6
    .line 7
    :goto_0
    shl-int/lit8 v0, p4, 0x3

    .line 8
    .line 9
    shr-long v0, p0, v0

    .line 10
    .line 11
    const-wide/16 v2, 0xff

    .line 12
    .line 13
    and-long/2addr v0, v2

    .line 14
    long-to-int v0, v0

    .line 15
    sget-object v1, Lqz2;->a:[I

    .line 16
    .line 17
    aget v0, v1, v0

    .line 18
    .line 19
    add-int/lit8 v1, p3, 0x1

    .line 20
    .line 21
    shr-int/lit8 v2, v0, 0x8

    .line 22
    .line 23
    int-to-byte v2, v2

    .line 24
    aput-byte v2, p2, p3

    .line 25
    .line 26
    add-int/lit8 p3, p3, 0x2

    .line 27
    .line 28
    int-to-byte v0, v0

    .line 29
    aput-byte v0, p2, v1

    .line 30
    .line 31
    if-eq p4, p5, :cond_0

    .line 32
    .line 33
    add-int/lit8 p4, p4, -0x1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    return-void
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

.method public static final i(Lj77;Ljava/lang/String;)Lhm5;
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    check-cast p0, Lm77;

    .line 5
    .line 6
    iget-object p0, p0, Lm77;->i:Lbe1;

    .line 7
    .line 8
    iget-object p0, p0, Lbe1;->a:Ljava/util/LinkedHashMap;

    .line 9
    .line 10
    const-string v0, "rest"

    .line 11
    .line 12
    invoke-virtual {p0, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    instance-of v0, p0, Lgm5;

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    move-object p0, v1

    .line 22
    :cond_0
    check-cast p0, Lgm5;

    .line 23
    .line 24
    if-eqz p0, :cond_1

    .line 25
    .line 26
    new-instance v0, Lhm5;

    .line 27
    .line 28
    invoke-direct {v0, p0, p1}, Lhm5;-><init>(Lgm5;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    return-object v0

    .line 32
    :cond_1
    sget-object p0, Lb26;->a:Lc26;

    .line 33
    .line 34
    const-class p1, Lgm5;

    .line 35
    .line 36
    invoke-virtual {p0, p1}, Lc26;->b(Ljava/lang/Class;)Lgq3;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-interface {v0}, Lgq3;->A()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-virtual {p0, p1}, Lc26;->b(Ljava/lang/Class;)Lgq3;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    invoke-interface {p0}, Lgq3;->A()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    const-string p1, " within your SupabaseClientBuilder"

    .line 53
    .line 54
    const-string v2, "Plugin rest not installed or not of type "

    .line 55
    .line 56
    const-string v3, ". Consider installing "

    .line 57
    .line 58
    invoke-static {v2, v0, v3, p0, p1}, Lkj6;->m(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    return-object v1
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

.method public static final j(Ljava/lang/reflect/Constructor;)Ljava/lang/String;
    .locals 6

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    sget-object v4, Ll06;->I:Ll06;

    .line 12
    .line 13
    const/16 v5, 0x18

    .line 14
    .line 15
    const-string v1, ""

    .line 16
    .line 17
    const-string v2, "<init>("

    .line 18
    .line 19
    const-string v3, ")V"

    .line 20
    .line 21
    invoke-static/range {v0 .. v5}, Lqs;->f1([Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvr2;I)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public static final k(Ljava/lang/reflect/Field;)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-static {v1}, Lmn3;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, "()"

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    invoke-static {p0}, Lm06;->b(Ljava/lang/Class;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
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

.method public static final l(Ljava/lang/reflect/Method;)Ljava/lang/String;
    .locals 8

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    sget-object v6, Ll06;->J:Ll06;

    .line 24
    .line 25
    const/16 v7, 0x18

    .line 26
    .line 27
    const-string v3, ""

    .line 28
    .line 29
    const-string v4, "("

    .line 30
    .line 31
    const-string v5, ")"

    .line 32
    .line 33
    invoke-static/range {v2 .. v7}, Lqs;->f1([Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvr2;I)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    invoke-static {p0}, Lm06;->b(Ljava/lang/Class;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    return-object p0
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

.method public static final m()Lx83;
    .locals 16

    .line 1
    sget-object v0, Lf55;->a:Lx83;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    new-instance v1, Lw83;

    .line 7
    .line 8
    const/4 v9, 0x0

    .line 9
    const/16 v11, 0x60

    .line 10
    .line 11
    const-string v2, "Filled.Password"

    .line 12
    .line 13
    const/high16 v3, 0x41c00000    # 24.0f

    .line 14
    .line 15
    const/high16 v4, 0x41c00000    # 24.0f

    .line 16
    .line 17
    const/high16 v5, 0x41c00000    # 24.0f

    .line 18
    .line 19
    const/high16 v6, 0x41c00000    # 24.0f

    .line 20
    .line 21
    const-wide/16 v7, 0x0

    .line 22
    .line 23
    const/4 v10, 0x0

    .line 24
    invoke-direct/range {v1 .. v11}, Lw83;-><init>(Ljava/lang/String;FFFFJIZI)V

    .line 25
    .line 26
    .line 27
    sget v0, Le38;->a:I

    .line 28
    .line 29
    new-instance v0, Lky6;

    .line 30
    .line 31
    sget-wide v2, Ljt0;->b:J

    .line 32
    .line 33
    invoke-direct {v0, v2, v3}, Lky6;-><init>(J)V

    .line 34
    .line 35
    .line 36
    new-instance v2, Lbe5;

    .line 37
    .line 38
    invoke-direct {v2}, Lbe5;-><init>()V

    .line 39
    .line 40
    .line 41
    const/high16 v3, 0x40000000    # 2.0f

    .line 42
    .line 43
    const/high16 v4, 0x41880000    # 17.0f

    .line 44
    .line 45
    invoke-virtual {v2, v3, v4}, Lbe5;->j(FF)V

    .line 46
    .line 47
    .line 48
    const/high16 v5, 0x41a00000    # 20.0f

    .line 49
    .line 50
    invoke-virtual {v2, v5}, Lbe5;->g(F)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v2, v3}, Lbe5;->n(F)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v2, v3}, Lbe5;->f(F)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v2, v4}, Lbe5;->m(F)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v2}, Lbe5;->c()V

    .line 63
    .line 64
    .line 65
    const v3, 0x4049999a    # 3.15f

    .line 66
    .line 67
    .line 68
    const v6, 0x414f3333    # 12.95f

    .line 69
    .line 70
    .line 71
    invoke-virtual {v2, v3, v6}, Lbe5;->j(FF)V

    .line 72
    .line 73
    .line 74
    const/high16 v7, 0x40800000    # 4.0f

    .line 75
    .line 76
    const v8, 0x4137851f    # 11.47f

    .line 77
    .line 78
    .line 79
    invoke-virtual {v2, v7, v8}, Lbe5;->h(FF)V

    .line 80
    .line 81
    .line 82
    const v9, 0x3f59999a    # 0.85f

    .line 83
    .line 84
    .line 85
    const v10, 0x3fbd70a4    # 1.48f

    .line 86
    .line 87
    .line 88
    invoke-virtual {v2, v9, v10}, Lbe5;->i(FF)V

    .line 89
    .line 90
    .line 91
    const v11, 0x3fa66666    # 1.3f

    .line 92
    .line 93
    .line 94
    const/high16 v12, -0x40c00000    # -0.75f

    .line 95
    .line 96
    invoke-virtual {v2, v11, v12}, Lbe5;->i(FF)V

    .line 97
    .line 98
    .line 99
    const v13, 0x412b851f    # 10.72f

    .line 100
    .line 101
    .line 102
    const v14, 0x40a9999a    # 5.3f

    .line 103
    .line 104
    .line 105
    invoke-virtual {v2, v14, v13}, Lbe5;->h(FF)V

    .line 106
    .line 107
    .line 108
    const/high16 v13, 0x40e00000    # 7.0f

    .line 109
    .line 110
    invoke-virtual {v2, v13}, Lbe5;->f(F)V

    .line 111
    .line 112
    .line 113
    const/high16 v15, -0x40400000    # -1.5f

    .line 114
    .line 115
    invoke-virtual {v2, v15}, Lbe5;->n(F)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v2, v14}, Lbe5;->f(F)V

    .line 119
    .line 120
    .line 121
    const v14, -0x4043d70a    # -1.47f

    .line 122
    .line 123
    .line 124
    invoke-virtual {v2, v9, v14}, Lbe5;->i(FF)V

    .line 125
    .line 126
    .line 127
    const v4, 0x409b3333    # 4.85f

    .line 128
    .line 129
    .line 130
    invoke-virtual {v2, v4, v13}, Lbe5;->h(FF)V

    .line 131
    .line 132
    .line 133
    const v4, 0x4107851f    # 8.47f

    .line 134
    .line 135
    .line 136
    invoke-virtual {v2, v7, v4}, Lbe5;->h(FF)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v2, v3, v13}, Lbe5;->h(FF)V

    .line 140
    .line 141
    .line 142
    const v7, -0x4059999a    # -1.3f

    .line 143
    .line 144
    .line 145
    const/high16 v5, 0x3f400000    # 0.75f

    .line 146
    .line 147
    invoke-virtual {v2, v7, v5}, Lbe5;->i(FF)V

    .line 148
    .line 149
    .line 150
    const v7, 0x402ccccd    # 2.7f

    .line 151
    .line 152
    .line 153
    const v4, 0x4113851f    # 9.22f

    .line 154
    .line 155
    .line 156
    invoke-virtual {v2, v7, v4}, Lbe5;->h(FF)V

    .line 157
    .line 158
    .line 159
    const/high16 v7, 0x3f800000    # 1.0f

    .line 160
    .line 161
    invoke-virtual {v2, v7}, Lbe5;->f(F)V

    .line 162
    .line 163
    .line 164
    const/high16 v7, 0x3fc00000    # 1.5f

    .line 165
    .line 166
    invoke-virtual {v2, v7}, Lbe5;->n(F)V

    .line 167
    .line 168
    .line 169
    const v4, 0x3fd9999a    # 1.7f

    .line 170
    .line 171
    .line 172
    invoke-virtual {v2, v4}, Lbe5;->g(F)V

    .line 173
    .line 174
    .line 175
    const v4, 0x3feccccd    # 1.85f

    .line 176
    .line 177
    .line 178
    const v7, 0x41433333    # 12.2f

    .line 179
    .line 180
    .line 181
    invoke-virtual {v2, v4, v7}, Lbe5;->h(FF)V

    .line 182
    .line 183
    .line 184
    invoke-virtual {v2, v3, v6}, Lbe5;->h(FF)V

    .line 185
    .line 186
    .line 187
    invoke-virtual {v2}, Lbe5;->c()V

    .line 188
    .line 189
    .line 190
    const v3, 0x411d999a    # 9.85f

    .line 191
    .line 192
    .line 193
    invoke-virtual {v2, v3, v7}, Lbe5;->j(FF)V

    .line 194
    .line 195
    .line 196
    invoke-virtual {v2, v11, v5}, Lbe5;->i(FF)V

    .line 197
    .line 198
    .line 199
    const/high16 v4, 0x41400000    # 12.0f

    .line 200
    .line 201
    invoke-virtual {v2, v4, v8}, Lbe5;->h(FF)V

    .line 202
    .line 203
    .line 204
    invoke-virtual {v2, v9, v10}, Lbe5;->i(FF)V

    .line 205
    .line 206
    .line 207
    invoke-virtual {v2, v11, v12}, Lbe5;->i(FF)V

    .line 208
    .line 209
    .line 210
    const v6, -0x40a66666    # -0.85f

    .line 211
    .line 212
    .line 213
    const v12, -0x40428f5c    # -1.48f

    .line 214
    .line 215
    .line 216
    invoke-virtual {v2, v6, v12}, Lbe5;->i(FF)V

    .line 217
    .line 218
    .line 219
    const/high16 v12, 0x41700000    # 15.0f

    .line 220
    .line 221
    invoke-virtual {v2, v12}, Lbe5;->f(F)V

    .line 222
    .line 223
    .line 224
    invoke-virtual {v2, v15}, Lbe5;->n(F)V

    .line 225
    .line 226
    .line 227
    const v12, -0x40266666    # -1.7f

    .line 228
    .line 229
    .line 230
    invoke-virtual {v2, v12}, Lbe5;->g(F)V

    .line 231
    .line 232
    .line 233
    invoke-virtual {v2, v9, v14}, Lbe5;->i(FF)V

    .line 234
    .line 235
    .line 236
    const v15, 0x414d999a    # 12.85f

    .line 237
    .line 238
    .line 239
    invoke-virtual {v2, v15, v13}, Lbe5;->h(FF)V

    .line 240
    .line 241
    .line 242
    const v15, 0x4107851f    # 8.47f

    .line 243
    .line 244
    .line 245
    invoke-virtual {v2, v4, v15}, Lbe5;->h(FF)V

    .line 246
    .line 247
    .line 248
    const v4, 0x41326666    # 11.15f

    .line 249
    .line 250
    .line 251
    invoke-virtual {v2, v4, v13}, Lbe5;->h(FF)V

    .line 252
    .line 253
    .line 254
    const v4, -0x4059999a    # -1.3f

    .line 255
    .line 256
    .line 257
    invoke-virtual {v2, v4, v5}, Lbe5;->i(FF)V

    .line 258
    .line 259
    .line 260
    const v4, 0x3fbc28f6    # 1.47f

    .line 261
    .line 262
    .line 263
    invoke-virtual {v2, v9, v4}, Lbe5;->i(FF)V

    .line 264
    .line 265
    .line 266
    const/high16 v15, 0x41100000    # 9.0f

    .line 267
    .line 268
    invoke-virtual {v2, v15}, Lbe5;->f(F)V

    .line 269
    .line 270
    .line 271
    const/high16 v15, 0x3fc00000    # 1.5f

    .line 272
    .line 273
    invoke-virtual {v2, v15}, Lbe5;->n(F)V

    .line 274
    .line 275
    .line 276
    const v15, 0x3fd9999a    # 1.7f

    .line 277
    .line 278
    .line 279
    invoke-virtual {v2, v15}, Lbe5;->g(F)V

    .line 280
    .line 281
    .line 282
    invoke-virtual {v2, v3, v7}, Lbe5;->h(FF)V

    .line 283
    .line 284
    .line 285
    invoke-virtual {v2}, Lbe5;->c()V

    .line 286
    .line 287
    .line 288
    const/high16 v3, 0x41b80000    # 23.0f

    .line 289
    .line 290
    const v7, 0x4113851f    # 9.22f

    .line 291
    .line 292
    .line 293
    invoke-virtual {v2, v3, v7}, Lbe5;->j(FF)V

    .line 294
    .line 295
    .line 296
    invoke-virtual {v2, v12}, Lbe5;->g(F)V

    .line 297
    .line 298
    .line 299
    invoke-virtual {v2, v9, v14}, Lbe5;->i(FF)V

    .line 300
    .line 301
    .line 302
    const v7, 0x41a6cccd    # 20.85f

    .line 303
    .line 304
    .line 305
    invoke-virtual {v2, v7, v13}, Lbe5;->h(FF)V

    .line 306
    .line 307
    .line 308
    const/high16 v7, 0x41a00000    # 20.0f

    .line 309
    .line 310
    const v15, 0x4107851f    # 8.47f

    .line 311
    .line 312
    .line 313
    invoke-virtual {v2, v7, v15}, Lbe5;->h(FF)V

    .line 314
    .line 315
    .line 316
    const v12, 0x41993333    # 19.15f

    .line 317
    .line 318
    .line 319
    invoke-virtual {v2, v12, v13}, Lbe5;->h(FF)V

    .line 320
    .line 321
    .line 322
    const v12, -0x4059999a    # -1.3f

    .line 323
    .line 324
    .line 325
    invoke-virtual {v2, v12, v5}, Lbe5;->i(FF)V

    .line 326
    .line 327
    .line 328
    invoke-virtual {v2, v9, v4}, Lbe5;->i(FF)V

    .line 329
    .line 330
    .line 331
    const/high16 v4, 0x41880000    # 17.0f

    .line 332
    .line 333
    invoke-virtual {v2, v4}, Lbe5;->f(F)V

    .line 334
    .line 335
    .line 336
    const/high16 v15, 0x3fc00000    # 1.5f

    .line 337
    .line 338
    invoke-virtual {v2, v15}, Lbe5;->n(F)V

    .line 339
    .line 340
    .line 341
    const v15, 0x3fd9999a    # 1.7f

    .line 342
    .line 343
    .line 344
    invoke-virtual {v2, v15}, Lbe5;->g(F)V

    .line 345
    .line 346
    .line 347
    invoke-virtual {v2, v6, v10}, Lbe5;->i(FF)V

    .line 348
    .line 349
    .line 350
    invoke-virtual {v2, v11, v5}, Lbe5;->i(FF)V

    .line 351
    .line 352
    .line 353
    invoke-virtual {v2, v7, v8}, Lbe5;->h(FF)V

    .line 354
    .line 355
    .line 356
    invoke-virtual {v2, v9, v10}, Lbe5;->i(FF)V

    .line 357
    .line 358
    .line 359
    const/high16 v4, -0x40c00000    # -0.75f

    .line 360
    .line 361
    invoke-virtual {v2, v11, v4}, Lbe5;->i(FF)V

    .line 362
    .line 363
    .line 364
    const v4, -0x40428f5c    # -1.48f

    .line 365
    .line 366
    .line 367
    invoke-virtual {v2, v6, v4}, Lbe5;->i(FF)V

    .line 368
    .line 369
    .line 370
    invoke-virtual {v2, v3}, Lbe5;->f(F)V

    .line 371
    .line 372
    .line 373
    const v7, 0x4113851f    # 9.22f

    .line 374
    .line 375
    .line 376
    invoke-virtual {v2, v7}, Lbe5;->m(F)V

    .line 377
    .line 378
    .line 379
    invoke-virtual {v2}, Lbe5;->c()V

    .line 380
    .line 381
    .line 382
    iget-object v2, v2, Lbe5;->a:Ljava/util/ArrayList;

    .line 383
    .line 384
    const/16 v3, 0x3800

    .line 385
    .line 386
    invoke-static {v1, v2, v0, v3}, Lw83;->a(Lw83;Ljava/util/List;Lky6;I)V

    .line 387
    .line 388
    .line 389
    invoke-virtual {v1}, Lw83;->b()Lx83;

    .line 390
    .line 391
    .line 392
    move-result-object v0

    .line 393
    sput-object v0, Lf55;->a:Lx83;

    .line 394
    .line 395
    return-object v0
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
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
.end method

.method public static final n(Lj77;)Lgm5;
    .locals 5

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    check-cast p0, Lm77;

    .line 5
    .line 6
    iget-object p0, p0, Lm77;->i:Lbe1;

    .line 7
    .line 8
    iget-object p0, p0, Lbe1;->a:Ljava/util/LinkedHashMap;

    .line 9
    .line 10
    const-string v0, "rest"

    .line 11
    .line 12
    invoke-virtual {p0, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    instance-of v0, p0, Lgm5;

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    move-object p0, v1

    .line 22
    :cond_0
    check-cast p0, Lgm5;

    .line 23
    .line 24
    if-eqz p0, :cond_1

    .line 25
    .line 26
    return-object p0

    .line 27
    :cond_1
    sget-object p0, Lb26;->a:Lc26;

    .line 28
    .line 29
    const-class v0, Lgm5;

    .line 30
    .line 31
    invoke-virtual {p0, v0}, Lc26;->b(Ljava/lang/Class;)Lgq3;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-interface {v2}, Lgq3;->A()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-virtual {p0, v0}, Lc26;->b(Ljava/lang/Class;)Lgq3;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    invoke-interface {p0}, Lgq3;->A()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    const-string v0, " within your SupabaseClientBuilder"

    .line 48
    .line 49
    const-string v3, "Plugin rest not installed or not of type "

    .line 50
    .line 51
    const-string v4, ". Consider installing "

    .line 52
    .line 53
    invoke-static {v3, v2, v4, p0, v0}, Lkj6;->m(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    return-object v1
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

.method public static o(Ljava/lang/String;Ljava/lang/Exception;)V
    .locals 2

    .line 1
    instance-of v0, p1, Ljava/lang/reflect/InvocationTargetException;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    instance-of p1, p0, Ljava/lang/RuntimeException;

    .line 10
    .line 11
    if-nez p1, :cond_0

    .line 12
    .line 13
    invoke-static {p0}, Lrf2;->o(Ljava/lang/Throwable;)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    check-cast p0, Ljava/lang/RuntimeException;

    .line 18
    .line 19
    throw p0

    .line 20
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    const-string v1, "Unable to call "

    .line 23
    .line 24
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string p0, " via reflection"

    .line 31
    .line 32
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    const-string v0, "Trace"

    .line 40
    .line 41
    invoke-static {v0, p0, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 42
    .line 43
    .line 44
    return-void
    .line 45
    .line 46
    .line 47
.end method

.method public static p()Z
    .locals 6

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1d

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    invoke-static {}, Ltk7;->c()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0

    .line 12
    :cond_0
    const-string v0, "isTagEnabled"

    .line 13
    .line 14
    const-class v1, Landroid/os/Trace;

    .line 15
    .line 16
    :try_start_0
    sget-object v2, Lf55;->e:Ljava/lang/reflect/Method;

    .line 17
    .line 18
    const/4 v3, 0x0

    .line 19
    if-nez v2, :cond_1

    .line 20
    .line 21
    const-string v2, "TRACE_TAG_APP"

    .line 22
    .line 23
    invoke-virtual {v1, v2}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-virtual {v2, v3}, Ljava/lang/reflect/Field;->getLong(Ljava/lang/Object;)J

    .line 28
    .line 29
    .line 30
    move-result-wide v4

    .line 31
    sput-wide v4, Lf55;->d:J

    .line 32
    .line 33
    sget-object v2, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 34
    .line 35
    filled-new-array {v2}, [Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-virtual {v1, v0, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    sput-object v1, Lf55;->e:Ljava/lang/reflect/Method;

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :catch_0
    move-exception v1

    .line 47
    goto :goto_1

    .line 48
    :cond_1
    :goto_0
    sget-object v1, Lf55;->e:Ljava/lang/reflect/Method;

    .line 49
    .line 50
    sget-wide v4, Lf55;->d:J

    .line 51
    .line 52
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    invoke-virtual {v1, v3, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    check-cast v1, Ljava/lang/Boolean;

    .line 65
    .line 66
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 67
    .line 68
    .line 69
    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 70
    return v0

    .line 71
    :goto_1
    invoke-static {v0, v1}, Lf55;->o(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 72
    .line 73
    .line 74
    const/4 v0, 0x0

    .line 75
    return v0
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

.method public static q(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    sub-int/2addr v0, v1

    .line 10
    if-ltz v0, :cond_2

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    if-gt v0, v1, :cond_2

    .line 14
    .line 15
    new-instance v0, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    add-int/2addr v2, v1

    .line 26
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 27
    .line 28
    .line 29
    const/4 v1, 0x0

    .line 30
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-ge v1, v2, :cond_1

    .line 35
    .line 36
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    if-le v2, v1, :cond_0

    .line 48
    .line 49
    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    return-object p0

    .line 64
    :cond_2
    const-string p0, "Invalid input received"

    .line 65
    .line 66
    invoke-static {p0}, Lh;->q(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    const/4 p0, 0x0

    .line 70
    return-object p0
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

.method public static final r(Lll4;JJLvr2;)Lph7;
    .locals 10

    .line 1
    invoke-static {p0}, Lrc9;->O0(Lvo1;)Luy3;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v3, v0, Luy3;->x:I

    .line 6
    .line 7
    invoke-static {v0}, Lxy3;->a(Luy3;)Lp95;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Lje;

    .line 12
    .line 13
    invoke-virtual {v0}, Lje;->getRectManager()Lny5;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iget-object v2, v0, Lny5;->d:Lqh7;

    .line 18
    .line 19
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    const-wide/16 v4, 0x0

    .line 23
    .line 24
    cmp-long v1, p3, v4

    .line 25
    .line 26
    if-nez v1, :cond_0

    .line 27
    .line 28
    move-wide v6, p1

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    move-wide v6, p3

    .line 31
    :goto_0
    iget-object p3, v2, Lqh7;->a:Lyo4;

    .line 32
    .line 33
    new-instance v1, Lph7;

    .line 34
    .line 35
    move-object v8, p0

    .line 36
    move-wide v4, p1

    .line 37
    move-object v9, p5

    .line 38
    invoke-direct/range {v1 .. v9}, Lph7;-><init>(Lqh7;IJJLll4;Lvr2;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p3, v3}, Lme3;->b(I)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    if-nez p0, :cond_1

    .line 46
    .line 47
    invoke-virtual {p3, v3, v1}, Lyo4;->i(ILjava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    move-object p0, v1

    .line 51
    :cond_1
    check-cast p0, Lph7;

    .line 52
    .line 53
    if-eq p0, v1, :cond_3

    .line 54
    .line 55
    :goto_1
    iget-object p1, p0, Lph7;->f:Lph7;

    .line 56
    .line 57
    if-eqz p1, :cond_2

    .line 58
    .line 59
    move-object p0, p1

    .line 60
    goto :goto_1

    .line 61
    :cond_2
    iput-object v1, p0, Lph7;->f:Lph7;

    .line 62
    .line 63
    :cond_3
    iget-object p0, v8, Lll4;->w:Lll4;

    .line 64
    .line 65
    invoke-static {p0}, Lrc9;->O0(Lvo1;)Luy3;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    invoke-static {p0}, Lny5;->d(Luy3;)Z

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    if-eqz p1, :cond_4

    .line 74
    .line 75
    iget-object p1, v0, Lny5;->c:Lig;

    .line 76
    .line 77
    invoke-virtual {v0, p0}, Lny5;->e(Luy3;)I

    .line 78
    .line 79
    .line 80
    move-result p0

    .line 81
    iget-object p1, p1, Lig;->c:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast p1, [J

    .line 84
    .line 85
    add-int/lit8 p0, p0, 0x2

    .line 86
    .line 87
    aget-wide p2, p1, p0

    .line 88
    .line 89
    const-wide p4, 0x6fffffffffffffffL    # 3.1050361846014175E231

    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    and-long/2addr p2, p4

    .line 95
    const-wide/high16 p4, -0x7000000000000000L

    .line 96
    .line 97
    or-long/2addr p2, p4

    .line 98
    aput-wide p2, p1, p0

    .line 99
    .line 100
    :cond_4
    const/4 p0, 0x1

    .line 101
    iput-boolean p0, v0, Lny5;->f:Z

    .line 102
    .line 103
    invoke-virtual {v0}, Lny5;->k()V

    .line 104
    .line 105
    .line 106
    return-object v1
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

.method public static s(ILy71;)Ls96;
    .locals 9

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    mul-int/lit8 v0, p0, 0x4

    .line 5
    .line 6
    new-array v0, v0, [F

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    move v2, v1

    .line 10
    :goto_0
    const/4 v3, 0x0

    .line 11
    if-ge v1, p0, :cond_0

    .line 12
    .line 13
    sget v4, Lj18;->b:F

    .line 14
    .line 15
    int-to-float v5, p0

    .line 16
    div-float/2addr v4, v5

    .line 17
    const/high16 v5, 0x40000000    # 2.0f

    .line 18
    .line 19
    mul-float/2addr v5, v4

    .line 20
    int-to-float v6, v1

    .line 21
    mul-float/2addr v5, v6

    .line 22
    const/high16 v6, 0x3f800000    # 1.0f

    .line 23
    .line 24
    invoke-static {v6, v5}, Lj18;->e(FF)J

    .line 25
    .line 26
    .line 27
    move-result-wide v5

    .line 28
    add-int/lit8 v7, v2, 0x1

    .line 29
    .line 30
    invoke-static {v5, v6}, Ljb5;->r(J)F

    .line 31
    .line 32
    .line 33
    move-result v8

    .line 34
    add-float/2addr v8, v3

    .line 35
    aput v8, v0, v2

    .line 36
    .line 37
    add-int/lit8 v8, v2, 0x2

    .line 38
    .line 39
    invoke-static {v5, v6}, Ljb5;->s(J)F

    .line 40
    .line 41
    .line 42
    move-result v5

    .line 43
    add-float/2addr v5, v3

    .line 44
    aput v5, v0, v7

    .line 45
    .line 46
    mul-int/lit8 v5, v1, 0x2

    .line 47
    .line 48
    add-int/lit8 v5, v5, 0x1

    .line 49
    .line 50
    int-to-float v5, v5

    .line 51
    mul-float/2addr v4, v5

    .line 52
    const v5, 0x3f4ccccd    # 0.8f

    .line 53
    .line 54
    .line 55
    invoke-static {v5, v4}, Lj18;->e(FF)J

    .line 56
    .line 57
    .line 58
    move-result-wide v4

    .line 59
    add-int/lit8 v6, v2, 0x3

    .line 60
    .line 61
    invoke-static {v4, v5}, Ljb5;->r(J)F

    .line 62
    .line 63
    .line 64
    move-result v7

    .line 65
    add-float/2addr v7, v3

    .line 66
    aput v7, v0, v8

    .line 67
    .line 68
    add-int/lit8 v2, v2, 0x4

    .line 69
    .line 70
    invoke-static {v4, v5}, Ljb5;->s(J)F

    .line 71
    .line 72
    .line 73
    move-result v4

    .line 74
    add-float/2addr v4, v3

    .line 75
    aput v4, v0, v6

    .line 76
    .line 77
    add-int/lit8 v1, v1, 0x1

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_0
    const/4 p0, 0x0

    .line 81
    invoke-static {v0, p1, p0, v3, v3}, La35;->b([FLy71;Ljava/util/AbstractList;FF)Ls96;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    return-object p0
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

.method public static final t(Ljava/lang/String;)Llr7;
    .locals 10

    .line 1
    const/16 v0, 0xa

    .line 2
    .line 3
    invoke-static {v0}, Lrd3;->i(I)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    goto :goto_1

    .line 13
    :cond_0
    const/4 v2, 0x0

    .line 14
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    const/16 v4, 0x30

    .line 19
    .line 20
    if-ge v3, v4, :cond_1

    .line 21
    .line 22
    const/4 v4, 0x1

    .line 23
    if-eq v1, v4, :cond_6

    .line 24
    .line 25
    const/16 v5, 0x2b

    .line 26
    .line 27
    if-eq v3, v5, :cond_2

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_1
    move v4, v2

    .line 31
    :cond_2
    const v3, 0x71c71c7

    .line 32
    .line 33
    .line 34
    move v5, v3

    .line 35
    :goto_0
    if-ge v4, v1, :cond_8

    .line 36
    .line 37
    invoke-virtual {p0, v4}, Ljava/lang/String;->charAt(I)C

    .line 38
    .line 39
    .line 40
    move-result v6

    .line 41
    invoke-static {v6, v0}, Ljava/lang/Character;->digit(II)I

    .line 42
    .line 43
    .line 44
    move-result v6

    .line 45
    if-gez v6, :cond_3

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_3
    const/high16 v7, -0x80000000

    .line 49
    .line 50
    xor-int v8, v2, v7

    .line 51
    .line 52
    xor-int v9, v5, v7

    .line 53
    .line 54
    invoke-static {v8, v9}, Ljava/lang/Integer;->compare(II)I

    .line 55
    .line 56
    .line 57
    move-result v9

    .line 58
    if-lez v9, :cond_5

    .line 59
    .line 60
    if-ne v5, v3, :cond_6

    .line 61
    .line 62
    const v5, -0x66666667

    .line 63
    .line 64
    .line 65
    invoke-static {v8, v5}, Ljava/lang/Integer;->compare(II)I

    .line 66
    .line 67
    .line 68
    move-result v5

    .line 69
    if-lez v5, :cond_4

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_4
    const v5, 0x19999999

    .line 73
    .line 74
    .line 75
    :cond_5
    mul-int/lit8 v2, v2, 0xa

    .line 76
    .line 77
    add-int/2addr v6, v2

    .line 78
    xor-int v8, v6, v7

    .line 79
    .line 80
    xor-int/2addr v2, v7

    .line 81
    invoke-static {v8, v2}, Ljava/lang/Integer;->compare(II)I

    .line 82
    .line 83
    .line 84
    move-result v2

    .line 85
    if-gez v2, :cond_7

    .line 86
    .line 87
    :cond_6
    :goto_1
    const/4 p0, 0x0

    .line 88
    return-object p0

    .line 89
    :cond_7
    add-int/lit8 v4, v4, 0x1

    .line 90
    .line 91
    move v2, v6

    .line 92
    goto :goto_0

    .line 93
    :cond_8
    new-instance p0, Llr7;

    .line 94
    .line 95
    invoke-direct {p0, v2}, Llr7;-><init>(I)V

    .line 96
    .line 97
    .line 98
    return-object p0
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

.method public static final u(Ljava/lang/String;)Lqr7;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    const/16 v1, 0xa

    .line 7
    .line 8
    invoke-static {v1}, Lrd3;->i(I)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-nez v2, :cond_0

    .line 16
    .line 17
    goto :goto_1

    .line 18
    :cond_0
    const/4 v3, 0x0

    .line 19
    invoke-virtual {v0, v3}, Ljava/lang/String;->charAt(I)C

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    const/16 v5, 0x30

    .line 24
    .line 25
    if-ge v4, v5, :cond_1

    .line 26
    .line 27
    const/4 v3, 0x1

    .line 28
    if-eq v2, v3, :cond_5

    .line 29
    .line 30
    const/16 v5, 0x2b

    .line 31
    .line 32
    if-eq v4, v5, :cond_1

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_1
    const-wide/16 v4, 0x0

    .line 36
    .line 37
    const-wide v6, 0x71c71c71c71c71cL

    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    move-wide v8, v6

    .line 43
    :goto_0
    if-ge v3, v2, :cond_7

    .line 44
    .line 45
    invoke-virtual {v0, v3}, Ljava/lang/String;->charAt(I)C

    .line 46
    .line 47
    .line 48
    move-result v10

    .line 49
    invoke-static {v10, v1}, Ljava/lang/Character;->digit(II)I

    .line 50
    .line 51
    .line 52
    move-result v10

    .line 53
    if-gez v10, :cond_2

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_2
    const-wide/high16 v11, -0x8000000000000000L

    .line 57
    .line 58
    xor-long v13, v4, v11

    .line 59
    .line 60
    move v15, v2

    .line 61
    xor-long v1, v8, v11

    .line 62
    .line 63
    invoke-static {v13, v14, v1, v2}, Ljava/lang/Long;->compare(JJ)I

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    if-lez v1, :cond_4

    .line 68
    .line 69
    cmp-long v1, v8, v6

    .line 70
    .line 71
    if-nez v1, :cond_5

    .line 72
    .line 73
    const-wide v1, -0x6666666666666667L    # -2.353437368264535E-185

    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    invoke-static {v13, v14, v1, v2}, Ljava/lang/Long;->compare(JJ)I

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    if-lez v1, :cond_3

    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_3
    const-wide v8, 0x1999999999999999L    # 2.353437368264535E-185

    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    :cond_4
    const-wide/16 v1, 0xa

    .line 91
    .line 92
    mul-long/2addr v4, v1

    .line 93
    int-to-long v1, v10

    .line 94
    const-wide v13, 0xffffffffL

    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    and-long/2addr v1, v13

    .line 100
    add-long/2addr v1, v4

    .line 101
    xor-long v13, v1, v11

    .line 102
    .line 103
    xor-long/2addr v4, v11

    .line 104
    invoke-static {v13, v14, v4, v5}, Ljava/lang/Long;->compare(JJ)I

    .line 105
    .line 106
    .line 107
    move-result v4

    .line 108
    if-gez v4, :cond_6

    .line 109
    .line 110
    :cond_5
    :goto_1
    const/4 v0, 0x0

    .line 111
    return-object v0

    .line 112
    :cond_6
    add-int/lit8 v3, v3, 0x1

    .line 113
    .line 114
    move-wide v4, v1

    .line 115
    move v2, v15

    .line 116
    const/16 v1, 0xa

    .line 117
    .line 118
    goto :goto_0

    .line 119
    :cond_7
    new-instance v0, Lqr7;

    .line 120
    .line 121
    invoke-direct {v0, v4, v5}, Lqr7;-><init>(J)V

    .line 122
    .line 123
    .line 124
    return-object v0
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

.method public static v(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/16 v1, 0x7f

    .line 6
    .line 7
    if-gt v0, v1, :cond_0

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
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

.method public static final w(ILjava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    const-string v2, "Expected "

    .line 6
    .line 7
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string p2, " at index "

    .line 14
    .line 15
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    const-string p2, ", but was \'"

    .line 22
    .line 23
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1, p0}, Ljava/lang/String;->charAt(I)C

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const/16 p0, 0x27

    .line 34
    .line 35
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    throw v0
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

.method public static final x(Landroid/net/Uri;)Ljava/io/File;
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "file"

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_2

    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/net/Uri;->getQuery()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    invoke-virtual {p0}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_0

    .line 32
    .line 33
    new-instance v0, Ljava/io/File;

    .line 34
    .line 35
    invoke-virtual {p0}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-direct {v0, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    return-object v0

    .line 43
    :cond_0
    new-instance p0, Lcom/google/android/gms/internal/measurement/zzsi;

    .line 44
    .line 45
    const-string v0, "Did not expect uri to have authority"

    .line 46
    .line 47
    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    throw p0

    .line 51
    :cond_1
    new-instance p0, Lcom/google/android/gms/internal/measurement/zzsi;

    .line 52
    .line 53
    const-string v0, "Did not expect uri to have query"

    .line 54
    .line 55
    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    throw p0

    .line 59
    :cond_2
    new-instance p0, Lcom/google/android/gms/internal/measurement/zzsi;

    .line 60
    .line 61
    const-string v0, "Scheme must be \'file\'"

    .line 62
    .line 63
    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

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
.end method

.method public static final y(Ljava/lang/StringBuilder;Ljava/util/Iterator;Ltz2;)V
    .locals 2

    .line 1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    if-eqz p2, :cond_0

    .line 6
    .line 7
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    check-cast p2, Ljava/util/Map$Entry;

    .line 12
    .line 13
    invoke-interface {p2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {v0}, Ltz2;->n(Ljava/lang/Object;)Ljava/lang/CharSequence;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 22
    .line 23
    .line 24
    const-string v0, " : "

    .line 25
    .line 26
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 27
    .line 28
    .line 29
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    invoke-static {p2}, Ltz2;->n(Ljava/lang/Object;)Ljava/lang/CharSequence;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 38
    .line 39
    .line 40
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 41
    .line 42
    .line 43
    move-result p2

    .line 44
    if-eqz p2, :cond_0

    .line 45
    .line 46
    const-string p2, ",\n  "

    .line 47
    .line 48
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 49
    .line 50
    .line 51
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p2

    .line 55
    check-cast p2, Ljava/util/Map$Entry;

    .line 56
    .line 57
    invoke-interface {p2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    invoke-static {v1}, Ltz2;->n(Ljava/lang/Object;)Ljava/lang/CharSequence;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 66
    .line 67
    .line 68
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 69
    .line 70
    .line 71
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p2

    .line 75
    invoke-static {p2}, Ltz2;->n(Ljava/lang/Object;)Ljava/lang/CharSequence;

    .line 76
    .line 77
    .line 78
    move-result-object p2

    .line 79
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 80
    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_0
    return-void
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
.method public abstract e()V
.end method
