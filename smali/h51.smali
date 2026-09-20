.class public final Lh51;
.super Lll4;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lgz1;
.implements Lmy3;


# instance fields
.field public K:Lvb5;

.field public L:Ljb;

.field public M:Lj51;

.field public N:F


# virtual methods
.method public final K0()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

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
.end method

.method public final V0(J)J
    .locals 6

    .line 1
    invoke-static {p1, p2}, Lwu6;->e(J)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const-wide/16 p0, 0x0

    .line 8
    .line 9
    return-wide p0

    .line 10
    :cond_0
    iget-object v0, p0, Lh51;->K:Lvb5;

    .line 11
    .line 12
    invoke-virtual {v0}, Lvb5;->i()J

    .line 13
    .line 14
    .line 15
    move-result-wide v0

    .line 16
    const-wide v2, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    cmp-long v2, v0, v2

    .line 22
    .line 23
    if-nez v2, :cond_1

    .line 24
    .line 25
    goto :goto_2

    .line 26
    :cond_1
    invoke-static {v0, v1}, Lwu6;->d(J)F

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    invoke-static {v2}, Ljava/lang/Float;->isInfinite(F)Z

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    if-nez v3, :cond_2

    .line 35
    .line 36
    invoke-static {v2}, Ljava/lang/Float;->isNaN(F)Z

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    if-nez v3, :cond_2

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_2
    invoke-static {p1, p2}, Lwu6;->d(J)F

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    :goto_0
    invoke-static {v0, v1}, Lwu6;->b(J)F

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    invoke-static {v0}, Ljava/lang/Float;->isInfinite(F)Z

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    if-nez v1, :cond_3

    .line 56
    .line 57
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    if-nez v1, :cond_3

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_3
    invoke-static {p1, p2}, Lwu6;->b(J)F

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    :goto_1
    invoke-static {v2, v0}, Lfb5;->a(FF)J

    .line 69
    .line 70
    .line 71
    move-result-wide v0

    .line 72
    iget-object p0, p0, Lh51;->M:Lj51;

    .line 73
    .line 74
    invoke-interface {p0, v0, v1, p1, p2}, Lj51;->c(JJ)J

    .line 75
    .line 76
    .line 77
    move-result-wide v2

    .line 78
    sget p0, Lyf6;->a:I

    .line 79
    .line 80
    const/16 p0, 0x20

    .line 81
    .line 82
    shr-long v4, v2, p0

    .line 83
    .line 84
    long-to-int p0, v4

    .line 85
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 86
    .line 87
    .line 88
    move-result p0

    .line 89
    invoke-static {p0}, Ljava/lang/Float;->isInfinite(F)Z

    .line 90
    .line 91
    .line 92
    move-result v4

    .line 93
    if-nez v4, :cond_4

    .line 94
    .line 95
    invoke-static {p0}, Ljava/lang/Float;->isNaN(F)Z

    .line 96
    .line 97
    .line 98
    move-result p0

    .line 99
    if-nez p0, :cond_4

    .line 100
    .line 101
    const-wide v4, 0xffffffffL

    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    and-long/2addr v4, v2

    .line 107
    long-to-int p0, v4

    .line 108
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 109
    .line 110
    .line 111
    move-result p0

    .line 112
    invoke-static {p0}, Ljava/lang/Float;->isInfinite(F)Z

    .line 113
    .line 114
    .line 115
    move-result v4

    .line 116
    if-nez v4, :cond_4

    .line 117
    .line 118
    invoke-static {p0}, Ljava/lang/Float;->isNaN(F)Z

    .line 119
    .line 120
    .line 121
    move-result p0

    .line 122
    if-nez p0, :cond_4

    .line 123
    .line 124
    invoke-static {v0, v1, v2, v3}, Lya5;->w(JJ)J

    .line 125
    .line 126
    .line 127
    move-result-wide p0

    .line 128
    return-wide p0

    .line 129
    :cond_4
    :goto_2
    return-wide p1
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

.method public final W0(J)J
    .locals 13

    .line 1
    invoke-static {p1, p2}, Lk31;->f(J)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {p1, p2}, Lk31;->e(J)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    :cond_0
    move-wide v6, p1

    .line 14
    goto :goto_1

    .line 15
    :cond_1
    invoke-static {p1, p2}, Lk31;->d(J)Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-eqz v2, :cond_2

    .line 20
    .line 21
    invoke-static {p1, p2}, Lk31;->c(J)Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-eqz v2, :cond_2

    .line 26
    .line 27
    const/4 v2, 0x1

    .line 28
    goto :goto_0

    .line 29
    :cond_2
    const/4 v2, 0x0

    .line 30
    :goto_0
    iget-object v3, p0, Lh51;->K:Lvb5;

    .line 31
    .line 32
    invoke-virtual {v3}, Lvb5;->i()J

    .line 33
    .line 34
    .line 35
    move-result-wide v3

    .line 36
    const-wide v5, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    cmp-long v5, v3, v5

    .line 42
    .line 43
    if-nez v5, :cond_3

    .line 44
    .line 45
    if-eqz v2, :cond_0

    .line 46
    .line 47
    invoke-static {p1, p2}, Lk31;->h(J)I

    .line 48
    .line 49
    .line 50
    move-result v8

    .line 51
    invoke-static {p1, p2}, Lk31;->g(J)I

    .line 52
    .line 53
    .line 54
    move-result v10

    .line 55
    const/4 v11, 0x0

    .line 56
    const/16 v12, 0xa

    .line 57
    .line 58
    const/4 v9, 0x0

    .line 59
    move-wide v6, p1

    .line 60
    invoke-static/range {v6 .. v12}, Lk31;->a(JIIIII)J

    .line 61
    .line 62
    .line 63
    move-result-wide p0

    .line 64
    return-wide p0

    .line 65
    :goto_1
    return-wide v6

    .line 66
    :cond_3
    move-wide v6, p1

    .line 67
    if-eqz v2, :cond_5

    .line 68
    .line 69
    if-nez v0, :cond_4

    .line 70
    .line 71
    if-eqz v1, :cond_5

    .line 72
    .line 73
    :cond_4
    invoke-static {v6, v7}, Lk31;->h(J)I

    .line 74
    .line 75
    .line 76
    move-result p1

    .line 77
    int-to-float p1, p1

    .line 78
    invoke-static {v6, v7}, Lk31;->g(J)I

    .line 79
    .line 80
    .line 81
    move-result p2

    .line 82
    :goto_2
    int-to-float p2, p2

    .line 83
    goto :goto_4

    .line 84
    :cond_5
    invoke-static {v3, v4}, Lwu6;->d(J)F

    .line 85
    .line 86
    .line 87
    move-result p1

    .line 88
    invoke-static {v3, v4}, Lwu6;->b(J)F

    .line 89
    .line 90
    .line 91
    move-result p2

    .line 92
    invoke-static {p1}, Ljava/lang/Float;->isInfinite(F)Z

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    if-nez v0, :cond_6

    .line 97
    .line 98
    invoke-static {p1}, Ljava/lang/Float;->isNaN(F)Z

    .line 99
    .line 100
    .line 101
    move-result v0

    .line 102
    if-nez v0, :cond_6

    .line 103
    .line 104
    sget-object v0, Lk18;->b:Lqx5;

    .line 105
    .line 106
    invoke-static {v6, v7}, Lk31;->j(J)I

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    int-to-float v0, v0

    .line 111
    invoke-static {v6, v7}, Lk31;->h(J)I

    .line 112
    .line 113
    .line 114
    move-result v1

    .line 115
    int-to-float v1, v1

    .line 116
    invoke-static {p1, v0, v1}, Lz65;->o(FFF)F

    .line 117
    .line 118
    .line 119
    move-result p1

    .line 120
    goto :goto_3

    .line 121
    :cond_6
    invoke-static {v6, v7}, Lk31;->j(J)I

    .line 122
    .line 123
    .line 124
    move-result p1

    .line 125
    int-to-float p1, p1

    .line 126
    :goto_3
    invoke-static {p2}, Ljava/lang/Float;->isInfinite(F)Z

    .line 127
    .line 128
    .line 129
    move-result v0

    .line 130
    if-nez v0, :cond_7

    .line 131
    .line 132
    invoke-static {p2}, Ljava/lang/Float;->isNaN(F)Z

    .line 133
    .line 134
    .line 135
    move-result v0

    .line 136
    if-nez v0, :cond_7

    .line 137
    .line 138
    sget-object v0, Lk18;->b:Lqx5;

    .line 139
    .line 140
    invoke-static {v6, v7}, Lk31;->i(J)I

    .line 141
    .line 142
    .line 143
    move-result v0

    .line 144
    int-to-float v0, v0

    .line 145
    invoke-static {v6, v7}, Lk31;->g(J)I

    .line 146
    .line 147
    .line 148
    move-result v1

    .line 149
    int-to-float v1, v1

    .line 150
    invoke-static {p2, v0, v1}, Lz65;->o(FFF)F

    .line 151
    .line 152
    .line 153
    move-result p2

    .line 154
    goto :goto_4

    .line 155
    :cond_7
    invoke-static {v6, v7}, Lk31;->i(J)I

    .line 156
    .line 157
    .line 158
    move-result p2

    .line 159
    goto :goto_2

    .line 160
    :goto_4
    invoke-static {p1, p2}, Lfb5;->a(FF)J

    .line 161
    .line 162
    .line 163
    move-result-wide p1

    .line 164
    invoke-virtual {p0, p1, p2}, Lh51;->V0(J)J

    .line 165
    .line 166
    .line 167
    move-result-wide p0

    .line 168
    invoke-static {p0, p1}, Lwu6;->d(J)F

    .line 169
    .line 170
    .line 171
    move-result p2

    .line 172
    invoke-static {p0, p1}, Lwu6;->b(J)F

    .line 173
    .line 174
    .line 175
    move-result p0

    .line 176
    invoke-static {p2}, Ldh4;->C(F)I

    .line 177
    .line 178
    .line 179
    move-result p1

    .line 180
    invoke-static {v6, v7, p1}, Lm31;->g(JI)I

    .line 181
    .line 182
    .line 183
    move-result v2

    .line 184
    invoke-static {p0}, Ldh4;->C(F)I

    .line 185
    .line 186
    .line 187
    move-result p0

    .line 188
    invoke-static {v6, v7, p0}, Lm31;->f(JI)I

    .line 189
    .line 190
    .line 191
    move-result v4

    .line 192
    const/4 v5, 0x0

    .line 193
    move-wide v0, v6

    .line 194
    const/16 v6, 0xa

    .line 195
    .line 196
    const/4 v3, 0x0

    .line 197
    invoke-static/range {v0 .. v6}, Lk31;->a(JIIIII)J

    .line 198
    .line 199
    .line 200
    move-result-wide p0

    .line 201
    return-wide p0
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
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
.end method

.method public final Z(Ldd4;Lgh4;I)I
    .locals 4

    .line 1
    iget-object p1, p0, Lh51;->K:Lvb5;

    .line 2
    .line 3
    invoke-virtual {p1}, Lvb5;->i()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    const-wide v2, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    cmp-long p1, v0, v2

    .line 13
    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    const/16 p1, 0xd

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    invoke-static {v0, p3, v0, v0, p1}, Lm31;->b(IIIII)J

    .line 20
    .line 21
    .line 22
    move-result-wide v0

    .line 23
    invoke-virtual {p0, v0, v1}, Lh51;->W0(J)J

    .line 24
    .line 25
    .line 26
    move-result-wide v0

    .line 27
    invoke-static {v0, v1}, Lk31;->h(J)I

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    invoke-interface {p2, p1}, Lgh4;->c(I)I

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    int-to-float p2, p3

    .line 36
    int-to-float p3, p1

    .line 37
    invoke-static {p2, p3}, Lfb5;->a(FF)J

    .line 38
    .line 39
    .line 40
    move-result-wide p2

    .line 41
    invoke-virtual {p0, p2, p3}, Lh51;->V0(J)J

    .line 42
    .line 43
    .line 44
    move-result-wide p2

    .line 45
    invoke-static {p2, p3}, Lwu6;->b(J)F

    .line 46
    .line 47
    .line 48
    move-result p0

    .line 49
    invoke-static {p0}, Ldh4;->C(F)I

    .line 50
    .line 51
    .line 52
    move-result p0

    .line 53
    invoke-static {p0, p1}, Ljava/lang/Math;->max(II)I

    .line 54
    .line 55
    .line 56
    move-result p0

    .line 57
    return p0

    .line 58
    :cond_0
    invoke-interface {p2, p3}, Lgh4;->c(I)I

    .line 59
    .line 60
    .line 61
    move-result p0

    .line 62
    return p0
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

.method public final c(Loh4;Lgh4;J)Lmh4;
    .locals 1

    .line 1
    invoke-virtual {p0, p3, p4}, Lh51;->W0(J)J

    .line 2
    .line 3
    .line 4
    move-result-wide p3

    .line 5
    invoke-interface {p2, p3, p4}, Lgh4;->y(J)Leh5;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    iget p2, p0, Leh5;->w:I

    .line 10
    .line 11
    iget p3, p0, Leh5;->x:I

    .line 12
    .line 13
    new-instance p4, Lws;

    .line 14
    .line 15
    const/4 v0, 0x3

    .line 16
    invoke-direct {p4, p0, v0}, Lws;-><init>(Leh5;I)V

    .line 17
    .line 18
    .line 19
    sget-object p0, Lb42;->w:Lb42;

    .line 20
    .line 21
    invoke-interface {p1, p2, p3, p0, p4}, Loh4;->d0(IILjava/util/Map;Lvr2;)Lmh4;

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

.method public final f(Ldd4;Lgh4;I)I
    .locals 4

    .line 1
    iget-object p1, p0, Lh51;->K:Lvb5;

    .line 2
    .line 3
    invoke-virtual {p1}, Lvb5;->i()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    const-wide v2, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    cmp-long p1, v0, v2

    .line 13
    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    const/4 p1, 0x7

    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-static {v0, v0, v0, p3, p1}, Lm31;->b(IIIII)J

    .line 19
    .line 20
    .line 21
    move-result-wide v0

    .line 22
    invoke-virtual {p0, v0, v1}, Lh51;->W0(J)J

    .line 23
    .line 24
    .line 25
    move-result-wide v0

    .line 26
    invoke-static {v0, v1}, Lk31;->g(J)I

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    invoke-interface {p2, p1}, Lgh4;->v(I)I

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    int-to-float p2, p1

    .line 35
    int-to-float p3, p3

    .line 36
    invoke-static {p2, p3}, Lfb5;->a(FF)J

    .line 37
    .line 38
    .line 39
    move-result-wide p2

    .line 40
    invoke-virtual {p0, p2, p3}, Lh51;->V0(J)J

    .line 41
    .line 42
    .line 43
    move-result-wide p2

    .line 44
    invoke-static {p2, p3}, Lwu6;->d(J)F

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    invoke-static {p0}, Ldh4;->C(F)I

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    invoke-static {p0, p1}, Ljava/lang/Math;->max(II)I

    .line 53
    .line 54
    .line 55
    move-result p0

    .line 56
    return p0

    .line 57
    :cond_0
    invoke-interface {p2, p3}, Lgh4;->v(I)I

    .line 58
    .line 59
    .line 60
    move-result p0

    .line 61
    return p0
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

.method public final i0(Ldd4;Lgh4;I)I
    .locals 4

    .line 1
    iget-object p1, p0, Lh51;->K:Lvb5;

    .line 2
    .line 3
    invoke-virtual {p1}, Lvb5;->i()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    const-wide v2, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    cmp-long p1, v0, v2

    .line 13
    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    const/16 p1, 0xd

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    invoke-static {v0, p3, v0, v0, p1}, Lm31;->b(IIIII)J

    .line 20
    .line 21
    .line 22
    move-result-wide v0

    .line 23
    invoke-virtual {p0, v0, v1}, Lh51;->W0(J)J

    .line 24
    .line 25
    .line 26
    move-result-wide v0

    .line 27
    invoke-static {v0, v1}, Lk31;->h(J)I

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    invoke-interface {p2, p1}, Lgh4;->W(I)I

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    int-to-float p2, p3

    .line 36
    int-to-float p3, p1

    .line 37
    invoke-static {p2, p3}, Lfb5;->a(FF)J

    .line 38
    .line 39
    .line 40
    move-result-wide p2

    .line 41
    invoke-virtual {p0, p2, p3}, Lh51;->V0(J)J

    .line 42
    .line 43
    .line 44
    move-result-wide p2

    .line 45
    invoke-static {p2, p3}, Lwu6;->b(J)F

    .line 46
    .line 47
    .line 48
    move-result p0

    .line 49
    invoke-static {p0}, Ldh4;->C(F)I

    .line 50
    .line 51
    .line 52
    move-result p0

    .line 53
    invoke-static {p0, p1}, Ljava/lang/Math;->max(II)I

    .line 54
    .line 55
    .line 56
    move-result p0

    .line 57
    return p0

    .line 58
    :cond_0
    invoke-interface {p2, p3}, Lgh4;->W(I)I

    .line 59
    .line 60
    .line 61
    move-result p0

    .line 62
    return p0
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

.method public final p0(Lwy3;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v6, v1, Lwy3;->w:Ltk0;

    .line 6
    .line 7
    invoke-interface {v6}, Lhz1;->e()J

    .line 8
    .line 9
    .line 10
    move-result-wide v2

    .line 11
    invoke-virtual {v0, v2, v3}, Lh51;->V0(J)J

    .line 12
    .line 13
    .line 14
    move-result-wide v2

    .line 15
    iget-object v7, v0, Lh51;->L:Ljb;

    .line 16
    .line 17
    sget-object v4, Lk18;->b:Lqx5;

    .line 18
    .line 19
    invoke-static {v2, v3}, Lwu6;->d(J)F

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    invoke-static {v4}, Ldh4;->C(F)I

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    invoke-static {v2, v3}, Lwu6;->b(J)F

    .line 28
    .line 29
    .line 30
    move-result v5

    .line 31
    invoke-static {v5}, Ldh4;->C(F)I

    .line 32
    .line 33
    .line 34
    move-result v5

    .line 35
    int-to-long v8, v4

    .line 36
    const/16 v4, 0x20

    .line 37
    .line 38
    shl-long/2addr v8, v4

    .line 39
    int-to-long v10, v5

    .line 40
    const-wide v13, 0xffffffffL

    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    and-long/2addr v10, v13

    .line 46
    or-long/2addr v8, v10

    .line 47
    invoke-interface {v6}, Lhz1;->e()J

    .line 48
    .line 49
    .line 50
    move-result-wide v10

    .line 51
    invoke-static {v10, v11}, Lwu6;->d(J)F

    .line 52
    .line 53
    .line 54
    move-result v5

    .line 55
    invoke-static {v5}, Ldh4;->C(F)I

    .line 56
    .line 57
    .line 58
    move-result v5

    .line 59
    invoke-static {v10, v11}, Lwu6;->b(J)F

    .line 60
    .line 61
    .line 62
    move-result v10

    .line 63
    invoke-static {v10}, Ldh4;->C(F)I

    .line 64
    .line 65
    .line 66
    move-result v10

    .line 67
    int-to-long v11, v5

    .line 68
    shl-long/2addr v11, v4

    .line 69
    move v15, v4

    .line 70
    int-to-long v4, v10

    .line 71
    and-long/2addr v4, v13

    .line 72
    or-long v10, v11, v4

    .line 73
    .line 74
    invoke-virtual {v1}, Lwy3;->getLayoutDirection()Ley3;

    .line 75
    .line 76
    .line 77
    move-result-object v12

    .line 78
    invoke-interface/range {v7 .. v12}, Ljb;->a(JJLey3;)J

    .line 79
    .line 80
    .line 81
    move-result-wide v4

    .line 82
    shr-long v7, v4, v15

    .line 83
    .line 84
    long-to-int v7, v7

    .line 85
    and-long/2addr v4, v13

    .line 86
    long-to-int v4, v4

    .line 87
    int-to-float v7, v7

    .line 88
    int-to-float v8, v4

    .line 89
    iget-object v4, v6, Ltk0;->x:Lwr0;

    .line 90
    .line 91
    iget-object v4, v4, Lwr0;->x:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast v4, Lji8;

    .line 94
    .line 95
    invoke-virtual {v4, v7, v8}, Lji8;->F(FF)V

    .line 96
    .line 97
    .line 98
    iget-object v4, v0, Lh51;->K:Lvb5;

    .line 99
    .line 100
    iget v0, v0, Lh51;->N:F

    .line 101
    .line 102
    const/4 v5, 0x0

    .line 103
    move-object/from16 v16, v4

    .line 104
    .line 105
    move v4, v0

    .line 106
    move-object/from16 v0, v16

    .line 107
    .line 108
    invoke-virtual/range {v0 .. v5}, Lvb5;->g(Lwy3;JFLlt0;)V

    .line 109
    .line 110
    .line 111
    iget-object v0, v6, Ltk0;->x:Lwr0;

    .line 112
    .line 113
    iget-object v0, v0, Lwr0;->x:Ljava/lang/Object;

    .line 114
    .line 115
    check-cast v0, Lji8;

    .line 116
    .line 117
    neg-float v1, v7

    .line 118
    neg-float v2, v8

    .line 119
    invoke-virtual {v0, v1, v2}, Lji8;->F(FF)V

    .line 120
    .line 121
    .line 122
    invoke-virtual/range {p1 .. p1}, Lwy3;->a()V

    .line 123
    .line 124
    .line 125
    return-void
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

.method public final s0(Ldd4;Lgh4;I)I
    .locals 4

    .line 1
    iget-object p1, p0, Lh51;->K:Lvb5;

    .line 2
    .line 3
    invoke-virtual {p1}, Lvb5;->i()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    const-wide v2, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    cmp-long p1, v0, v2

    .line 13
    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    const/4 p1, 0x7

    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-static {v0, v0, v0, p3, p1}, Lm31;->b(IIIII)J

    .line 19
    .line 20
    .line 21
    move-result-wide v0

    .line 22
    invoke-virtual {p0, v0, v1}, Lh51;->W0(J)J

    .line 23
    .line 24
    .line 25
    move-result-wide v0

    .line 26
    invoke-static {v0, v1}, Lk31;->g(J)I

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    invoke-interface {p2, p1}, Lgh4;->l(I)I

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    int-to-float p2, p1

    .line 35
    int-to-float p3, p3

    .line 36
    invoke-static {p2, p3}, Lfb5;->a(FF)J

    .line 37
    .line 38
    .line 39
    move-result-wide p2

    .line 40
    invoke-virtual {p0, p2, p3}, Lh51;->V0(J)J

    .line 41
    .line 42
    .line 43
    move-result-wide p2

    .line 44
    invoke-static {p2, p3}, Lwu6;->d(J)F

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    invoke-static {p0}, Ldh4;->C(F)I

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    invoke-static {p0, p1}, Ljava/lang/Math;->max(II)I

    .line 53
    .line 54
    .line 55
    move-result p0

    .line 56
    return p0

    .line 57
    :cond_0
    invoke-interface {p2, p3}, Lgh4;->l(I)I

    .line 58
    .line 59
    .line 60
    move-result p0

    .line 61
    return p0
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
