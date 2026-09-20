.class public final Lef0;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public final a:Lhf0;

.field public final b:Lcg0;

.field public final c:Lfg0;

.field public final d:J

.field public final e:Lpy6;

.field public final f:[I

.field public final g:Ltc0;

.field public h:J

.field public i:I


# direct methods
.method public constructor <init>(Lhf0;Lcg0;Lfg0;J)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lef0;->a:Lhf0;

    .line 14
    .line 15
    iput-object p2, p0, Lef0;->b:Lcg0;

    .line 16
    .line 17
    iput-object p3, p0, Lef0;->c:Lfg0;

    .line 18
    .line 19
    iput-wide p4, p0, Lef0;->d:J

    .line 20
    .line 21
    iget-object p3, p2, Lcg0;->w:[B

    .line 22
    .line 23
    array-length p4, p3

    .line 24
    if-lez p4, :cond_3

    .line 25
    .line 26
    invoke-interface {p1}, Lhf0;->g()Ltc0;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    iput-object p1, p0, Lef0;->e:Lpy6;

    .line 31
    .line 32
    array-length p1, p3

    .line 33
    new-array p1, p1, [I

    .line 34
    .line 35
    array-length p3, p3

    .line 36
    const/4 p4, 0x0

    .line 37
    const/4 p5, 0x1

    .line 38
    :goto_0
    if-ge p5, p3, :cond_2

    .line 39
    .line 40
    :goto_1
    if-lez p4, :cond_0

    .line 41
    .line 42
    invoke-virtual {p2, p5}, Lcg0;->a(I)B

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    invoke-virtual {p2, p4}, Lcg0;->a(I)B

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    if-eq v0, v1, :cond_0

    .line 51
    .line 52
    add-int/lit8 p4, p4, -0x1

    .line 53
    .line 54
    aget p4, p1, p4

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_0
    invoke-virtual {p2, p5}, Lcg0;->a(I)B

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    invoke-virtual {p2, p4}, Lcg0;->a(I)B

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    if-ne v0, v1, :cond_1

    .line 66
    .line 67
    add-int/lit8 p4, p4, 0x1

    .line 68
    .line 69
    :cond_1
    aput p4, p1, p5

    .line 70
    .line 71
    add-int/lit8 p5, p5, 0x1

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_2
    iput-object p1, p0, Lef0;->f:[I

    .line 75
    .line 76
    new-instance p1, Ltc0;

    .line 77
    .line 78
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 79
    .line 80
    .line 81
    iput-object p1, p0, Lef0;->g:Ltc0;

    .line 82
    .line 83
    return-void

    .line 84
    :cond_3
    const-string p0, "Empty match string not permitted for scanning"

    .line 85
    .line 86
    invoke-static {p0}, Lh;->q(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    const/4 p0, 0x0

    .line 90
    throw p0
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
.method public final a(Lh61;)Ljava/lang/Object;
    .locals 12

    .line 1
    instance-of v0, p1, Lbf0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lbf0;

    .line 7
    .line 8
    iget v1, v0, Lbf0;->B:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lbf0;->B:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lbf0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lbf0;-><init>(Lef0;Lh61;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lbf0;->z:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lbf0;->B:I

    .line 28
    .line 29
    sget-object v2, Lvs7;->a:Lvs7;

    .line 30
    .line 31
    const/4 v3, 0x3

    .line 32
    const/4 v4, 0x2

    .line 33
    const/4 v5, 0x1

    .line 34
    iget-object v6, p0, Lef0;->e:Lpy6;

    .line 35
    .line 36
    sget-object v7, Lp81;->w:Lp81;

    .line 37
    .line 38
    if-eqz v1, :cond_3

    .line 39
    .line 40
    if-eq v1, v5, :cond_2

    .line 41
    .line 42
    if-eq v1, v4, :cond_3

    .line 43
    .line 44
    if-ne v1, v3, :cond_1

    .line 45
    .line 46
    invoke-static {p1}, Lo85;->q(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    return-object v2

    .line 50
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 51
    .line 52
    invoke-static {p0}, Lh;->s(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    const/4 p0, 0x0

    .line 56
    return-object p0

    .line 57
    :cond_2
    invoke-static {p1}, Lo85;->q(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_3
    invoke-static {p1}, Lo85;->q(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    :cond_4
    invoke-interface {v6}, Lpy6;->x()Z

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    if-eqz p1, :cond_6

    .line 69
    .line 70
    iput v5, v0, Lbf0;->B:I

    .line 71
    .line 72
    sget-object p1, Lhf0;->a:Lgf0;

    .line 73
    .line 74
    iget-object p1, p0, Lef0;->a:Lhf0;

    .line 75
    .line 76
    invoke-interface {p1, v5, v0}, Lhf0;->d(ILh61;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    if-ne p1, v7, :cond_5

    .line 81
    .line 82
    goto :goto_2

    .line 83
    :cond_5
    :goto_1
    check-cast p1, Ljava/lang/Boolean;

    .line 84
    .line 85
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 86
    .line 87
    .line 88
    move-result p1

    .line 89
    if-eqz p1, :cond_8

    .line 90
    .line 91
    :cond_6
    iget-object p1, p0, Lef0;->b:Lcg0;

    .line 92
    .line 93
    const/4 v1, 0x0

    .line 94
    invoke-virtual {p1, v1}, Lcg0;->a(I)B

    .line 95
    .line 96
    .line 97
    move-result p1

    .line 98
    const-wide/16 v8, 0x0

    .line 99
    .line 100
    const/4 v1, 0x6

    .line 101
    invoke-static {v6, p1, v8, v9, v1}, Li75;->g(Lpy6;BJI)J

    .line 102
    .line 103
    .line 104
    move-result-wide v8

    .line 105
    const-wide/16 v10, -0x1

    .line 106
    .line 107
    cmp-long p1, v8, v10

    .line 108
    .line 109
    iget-object v1, p0, Lef0;->c:Lfg0;

    .line 110
    .line 111
    if-nez p1, :cond_7

    .line 112
    .line 113
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 114
    .line 115
    .line 116
    move-object p1, v6

    .line 117
    check-cast p1, Ltc0;

    .line 118
    .line 119
    iget-wide v8, p1, Ltc0;->y:J

    .line 120
    .line 121
    invoke-virtual {p0, v8, v9}, Lef0;->b(J)V

    .line 122
    .line 123
    .line 124
    iget-wide v8, p0, Lef0;->h:J

    .line 125
    .line 126
    invoke-interface {v1}, Lfg0;->e()Ltc0;

    .line 127
    .line 128
    .line 129
    move-result-object v10

    .line 130
    invoke-virtual {p1, v10}, Ltc0;->v(Ltc0;)J

    .line 131
    .line 132
    .line 133
    move-result-wide v10

    .line 134
    add-long/2addr v10, v8

    .line 135
    iput-wide v10, p0, Lef0;->h:J

    .line 136
    .line 137
    iput v4, v0, Lbf0;->B:I

    .line 138
    .line 139
    invoke-static {v1, v0}, Lgl0;->S(Lfg0;Lh61;)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    if-ne p1, v7, :cond_4

    .line 144
    .line 145
    goto :goto_2

    .line 146
    :cond_7
    invoke-virtual {p0, v8, v9}, Lef0;->b(J)V

    .line 147
    .line 148
    .line 149
    iget-wide v4, p0, Lef0;->h:J

    .line 150
    .line 151
    invoke-interface {v1}, Lfg0;->e()Ltc0;

    .line 152
    .line 153
    .line 154
    move-result-object p1

    .line 155
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 156
    .line 157
    .line 158
    invoke-interface {v6, p1, v8, v9}, Lfw5;->y(Ltc0;J)J

    .line 159
    .line 160
    .line 161
    move-result-wide v8

    .line 162
    add-long/2addr v8, v4

    .line 163
    iput-wide v8, p0, Lef0;->h:J

    .line 164
    .line 165
    iput v3, v0, Lbf0;->B:I

    .line 166
    .line 167
    invoke-static {v1, v0}, Lgl0;->S(Lfg0;Lh61;)Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object p0

    .line 171
    if-ne p0, v7, :cond_8

    .line 172
    .line 173
    :goto_2
    return-object v7

    .line 174
    :cond_8
    return-object v2
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
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
.end method

.method public final b(J)V
    .locals 3

    .line 1
    iget-wide v0, p0, Lef0;->h:J

    .line 2
    .line 3
    add-long/2addr v0, p1

    .line 4
    iget-wide p1, p0, Lef0;->d:J

    .line 5
    .line 6
    cmp-long v0, v0, p1

    .line 7
    .line 8
    if-gtz v0, :cond_0

    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    new-instance v0, Ljava/io/IOException;

    .line 12
    .line 13
    const-string v1, "Limit of "

    .line 14
    .line 15
    const-string v2, " bytes exceeded while searching for \""

    .line 16
    .line 17
    invoke-static {p1, p2, v1, v2}, Lhl6;->q(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    iget-object p0, p0, Lef0;->b:Lcg0;

    .line 22
    .line 23
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    iget-object p0, p0, Lcg0;->w:[B

    .line 27
    .line 28
    invoke-static {p0}, Lk57;->k0([B)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    const-string p2, "\n"

    .line 33
    .line 34
    const-string v1, "\\n"

    .line 35
    .line 36
    invoke-static {p0, p2, v1}, Lk57;->s0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const/16 p0, 0x22

    .line 44
    .line 45
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    invoke-direct {v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    throw v0
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

.method public final c(Lh61;)Ljava/lang/Object;
    .locals 13

    .line 1
    instance-of v0, p1, Lcf0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lcf0;

    .line 7
    .line 8
    iget v1, v0, Lcf0;->B:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lcf0;->B:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcf0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lcf0;-><init>(Lef0;Lh61;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lcf0;->z:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lcf0;->B:I

    .line 28
    .line 29
    sget-object v2, Lp81;->w:Lp81;

    .line 30
    .line 31
    iget-object v3, p0, Lef0;->e:Lpy6;

    .line 32
    .line 33
    const/4 v4, 0x2

    .line 34
    const/4 v5, 0x1

    .line 35
    if-eqz v1, :cond_3

    .line 36
    .line 37
    if-eq v1, v5, :cond_2

    .line 38
    .line 39
    if-ne v1, v4, :cond_1

    .line 40
    .line 41
    invoke-static {p1}, Lo85;->q(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    goto/16 :goto_7

    .line 45
    .line 46
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 47
    .line 48
    invoke-static {p0}, Lh;->s(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    const/4 p0, 0x0

    .line 52
    return-object p0

    .line 53
    :cond_2
    invoke-static {p1}, Lo85;->q(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    goto :goto_2

    .line 57
    :cond_3
    invoke-static {p1}, Lo85;->q(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    :goto_1
    invoke-interface {v3}, Lpy6;->x()Z

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    if-eqz p1, :cond_6

    .line 65
    .line 66
    iput v5, v0, Lcf0;->B:I

    .line 67
    .line 68
    sget-object p1, Lhf0;->a:Lgf0;

    .line 69
    .line 70
    iget-object p1, p0, Lef0;->a:Lhf0;

    .line 71
    .line 72
    invoke-interface {p1, v5, v0}, Lhf0;->d(ILh61;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    if-ne p1, v2, :cond_4

    .line 77
    .line 78
    goto :goto_6

    .line 79
    :cond_4
    :goto_2
    check-cast p1, Ljava/lang/Boolean;

    .line 80
    .line 81
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 82
    .line 83
    .line 84
    move-result p1

    .line 85
    if-eqz p1, :cond_5

    .line 86
    .line 87
    goto :goto_3

    .line 88
    :cond_5
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 89
    .line 90
    return-object p0

    .line 91
    :cond_6
    :goto_3
    invoke-interface {v3}, Lpy6;->readByte()B

    .line 92
    .line 93
    .line 94
    move-result p1

    .line 95
    iget v1, p0, Lef0;->i:I

    .line 96
    .line 97
    iget-object v6, p0, Lef0;->g:Ltc0;

    .line 98
    .line 99
    iget-object v7, p0, Lef0;->b:Lcg0;

    .line 100
    .line 101
    if-lez v1, :cond_a

    .line 102
    .line 103
    invoke-virtual {v7, v1}, Lcg0;->a(I)B

    .line 104
    .line 105
    .line 106
    move-result v1

    .line 107
    if-eq p1, v1, :cond_a

    .line 108
    .line 109
    iget v1, p0, Lef0;->i:I

    .line 110
    .line 111
    :goto_4
    iget v8, p0, Lef0;->i:I

    .line 112
    .line 113
    if-lez v8, :cond_7

    .line 114
    .line 115
    invoke-virtual {v7, v8}, Lcg0;->a(I)B

    .line 116
    .line 117
    .line 118
    move-result v8

    .line 119
    if-eq p1, v8, :cond_7

    .line 120
    .line 121
    iget v8, p0, Lef0;->i:I

    .line 122
    .line 123
    sub-int/2addr v8, v5

    .line 124
    iget-object v9, p0, Lef0;->f:[I

    .line 125
    .line 126
    aget v8, v9, v8

    .line 127
    .line 128
    iput v8, p0, Lef0;->i:I

    .line 129
    .line 130
    goto :goto_4

    .line 131
    :cond_7
    iget v8, p0, Lef0;->i:I

    .line 132
    .line 133
    sub-int/2addr v1, v8

    .line 134
    int-to-long v8, v1

    .line 135
    invoke-virtual {p0, v8, v9}, Lef0;->b(J)V

    .line 136
    .line 137
    .line 138
    iget-wide v10, p0, Lef0;->h:J

    .line 139
    .line 140
    iget-object v1, p0, Lef0;->c:Lfg0;

    .line 141
    .line 142
    invoke-interface {v1}, Lfg0;->e()Ltc0;

    .line 143
    .line 144
    .line 145
    move-result-object v12

    .line 146
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 147
    .line 148
    .line 149
    invoke-virtual {v6, v12, v8, v9}, Ltc0;->y(Ltc0;J)J

    .line 150
    .line 151
    .line 152
    move-result-wide v8

    .line 153
    add-long/2addr v8, v10

    .line 154
    iput-wide v8, p0, Lef0;->h:J

    .line 155
    .line 156
    iget v8, p0, Lef0;->i:I

    .line 157
    .line 158
    if-nez v8, :cond_a

    .line 159
    .line 160
    invoke-virtual {v7, v8}, Lcg0;->a(I)B

    .line 161
    .line 162
    .line 163
    move-result v8

    .line 164
    if-eq p1, v8, :cond_a

    .line 165
    .line 166
    int-to-byte p1, p1

    .line 167
    iput v4, v0, Lcf0;->B:I

    .line 168
    .line 169
    invoke-interface {v1}, Lfg0;->e()Ltc0;

    .line 170
    .line 171
    .line 172
    move-result-object v3

    .line 173
    invoke-virtual {v3, p1}, Ltc0;->G(B)V

    .line 174
    .line 175
    .line 176
    invoke-static {v1, v0}, Lgl0;->S(Lfg0;Lh61;)Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object p1

    .line 180
    if-ne p1, v2, :cond_8

    .line 181
    .line 182
    goto :goto_5

    .line 183
    :cond_8
    sget-object p1, Lvs7;->a:Lvs7;

    .line 184
    .line 185
    :goto_5
    if-ne p1, v2, :cond_9

    .line 186
    .line 187
    :goto_6
    return-object v2

    .line 188
    :cond_9
    :goto_7
    iget-wide v0, p0, Lef0;->h:J

    .line 189
    .line 190
    const-wide/16 v2, 0x1

    .line 191
    .line 192
    add-long/2addr v0, v2

    .line 193
    iput-wide v0, p0, Lef0;->h:J

    .line 194
    .line 195
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 196
    .line 197
    return-object p0

    .line 198
    :cond_a
    iget v1, p0, Lef0;->i:I

    .line 199
    .line 200
    add-int/2addr v1, v5

    .line 201
    iput v1, p0, Lef0;->i:I

    .line 202
    .line 203
    iget-object v7, v7, Lcg0;->w:[B

    .line 204
    .line 205
    array-length v7, v7

    .line 206
    if-ne v1, v7, :cond_b

    .line 207
    .line 208
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 209
    .line 210
    return-object p0

    .line 211
    :cond_b
    int-to-byte p1, p1

    .line 212
    invoke-virtual {v6, p1}, Ltc0;->G(B)V

    .line 213
    .line 214
    .line 215
    goto/16 :goto_1
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

.method public final d(ZLh61;)Ljava/lang/Object;
    .locals 9

    .line 1
    instance-of v0, p2, Ldf0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Ldf0;

    .line 7
    .line 8
    iget v1, v0, Ldf0;->C:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Ldf0;->C:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Ldf0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Ldf0;-><init>(Lef0;Lh61;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Ldf0;->A:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Ldf0;->C:I

    .line 28
    .line 29
    const/4 v2, 0x4

    .line 30
    const/4 v3, 0x3

    .line 31
    const/4 v4, 0x2

    .line 32
    const/4 v5, 0x1

    .line 33
    sget-object v6, Lp81;->w:Lp81;

    .line 34
    .line 35
    if-eqz v1, :cond_5

    .line 36
    .line 37
    if-eq v1, v5, :cond_4

    .line 38
    .line 39
    if-eq v1, v4, :cond_3

    .line 40
    .line 41
    if-eq v1, v3, :cond_2

    .line 42
    .line 43
    if-ne v1, v2, :cond_1

    .line 44
    .line 45
    invoke-static {p2}, Lo85;->q(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    goto :goto_2

    .line 49
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 50
    .line 51
    invoke-static {p0}, Lh;->s(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    const/4 p0, 0x0

    .line 55
    return-object p0

    .line 56
    :cond_2
    iget-boolean p1, v0, Ldf0;->z:Z

    .line 57
    .line 58
    invoke-static {p2}, Lo85;->q(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    goto/16 :goto_6

    .line 62
    .line 63
    :cond_3
    iget-boolean p1, v0, Ldf0;->z:Z

    .line 64
    .line 65
    invoke-static {p2}, Lo85;->q(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    goto/16 :goto_4

    .line 69
    .line 70
    :cond_4
    iget-boolean p1, v0, Ldf0;->z:Z

    .line 71
    .line 72
    invoke-static {p2}, Lo85;->q(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_5
    invoke-static {p2}, Lo85;->q(Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    const-wide/16 v7, 0x0

    .line 80
    .line 81
    iput-wide v7, p0, Lef0;->h:J

    .line 82
    .line 83
    :cond_6
    iget-object p2, p0, Lef0;->e:Lpy6;

    .line 84
    .line 85
    invoke-interface {p2}, Lpy6;->x()Z

    .line 86
    .line 87
    .line 88
    move-result p2

    .line 89
    if-eqz p2, :cond_b

    .line 90
    .line 91
    iput-boolean p1, v0, Ldf0;->z:Z

    .line 92
    .line 93
    iput v5, v0, Ldf0;->C:I

    .line 94
    .line 95
    sget-object p2, Lhf0;->a:Lgf0;

    .line 96
    .line 97
    iget-object p2, p0, Lef0;->a:Lhf0;

    .line 98
    .line 99
    invoke-interface {p2, v5, v0}, Lhf0;->d(ILh61;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object p2

    .line 103
    if-ne p2, v6, :cond_7

    .line 104
    .line 105
    goto :goto_5

    .line 106
    :cond_7
    :goto_1
    check-cast p2, Ljava/lang/Boolean;

    .line 107
    .line 108
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 109
    .line 110
    .line 111
    move-result p2

    .line 112
    if-eqz p2, :cond_8

    .line 113
    .line 114
    goto :goto_3

    .line 115
    :cond_8
    if-eqz p1, :cond_a

    .line 116
    .line 117
    iget-wide v3, p0, Lef0;->h:J

    .line 118
    .line 119
    iget-object p2, p0, Lef0;->g:Ltc0;

    .line 120
    .line 121
    iget-object v1, p0, Lef0;->c:Lfg0;

    .line 122
    .line 123
    invoke-interface {v1}, Lfg0;->e()Ltc0;

    .line 124
    .line 125
    .line 126
    move-result-object v5

    .line 127
    invoke-virtual {p2, v5}, Ltc0;->v(Ltc0;)J

    .line 128
    .line 129
    .line 130
    move-result-wide v7

    .line 131
    add-long/2addr v7, v3

    .line 132
    iput-wide v7, p0, Lef0;->h:J

    .line 133
    .line 134
    iput-boolean p1, v0, Ldf0;->z:Z

    .line 135
    .line 136
    iput v2, v0, Ldf0;->C:I

    .line 137
    .line 138
    invoke-interface {v1, v0}, Lfg0;->c(Lh61;)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    if-ne p1, v6, :cond_9

    .line 143
    .line 144
    goto :goto_5

    .line 145
    :cond_9
    :goto_2
    iget-wide p0, p0, Lef0;->h:J

    .line 146
    .line 147
    new-instance p2, Ljava/lang/Long;

    .line 148
    .line 149
    invoke-direct {p2, p0, p1}, Ljava/lang/Long;-><init>(J)V

    .line 150
    .line 151
    .line 152
    return-object p2

    .line 153
    :cond_a
    new-instance p1, Ljava/io/IOException;

    .line 154
    .line 155
    iget-object p0, p0, Lef0;->b:Lcg0;

    .line 156
    .line 157
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 158
    .line 159
    .line 160
    iget-object p0, p0, Lcg0;->w:[B

    .line 161
    .line 162
    invoke-static {p0}, Lk57;->k0([B)Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object p0

    .line 166
    const-string p2, "\n"

    .line 167
    .line 168
    const-string v0, "\\n"

    .line 169
    .line 170
    invoke-static {p0, p2, v0}, Lk57;->s0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object p0

    .line 174
    new-instance p2, Ljava/lang/StringBuilder;

    .line 175
    .line 176
    const-string v0, "Expected \""

    .line 177
    .line 178
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 179
    .line 180
    .line 181
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 182
    .line 183
    .line 184
    const-string p0, "\" but encountered end of input"

    .line 185
    .line 186
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 187
    .line 188
    .line 189
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object p0

    .line 193
    invoke-direct {p1, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 194
    .line 195
    .line 196
    throw p1

    .line 197
    :cond_b
    :goto_3
    iput-boolean p1, v0, Ldf0;->z:Z

    .line 198
    .line 199
    iput v4, v0, Ldf0;->C:I

    .line 200
    .line 201
    invoke-virtual {p0, v0}, Lef0;->a(Lh61;)Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object p2

    .line 205
    if-ne p2, v6, :cond_c

    .line 206
    .line 207
    goto :goto_5

    .line 208
    :cond_c
    :goto_4
    iput-boolean p1, v0, Ldf0;->z:Z

    .line 209
    .line 210
    iput v3, v0, Ldf0;->C:I

    .line 211
    .line 212
    invoke-virtual {p0, v0}, Lef0;->c(Lh61;)Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object p2

    .line 216
    if-ne p2, v6, :cond_d

    .line 217
    .line 218
    :goto_5
    return-object v6

    .line 219
    :cond_d
    :goto_6
    check-cast p2, Ljava/lang/Boolean;

    .line 220
    .line 221
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 222
    .line 223
    .line 224
    move-result p2

    .line 225
    if-eqz p2, :cond_6

    .line 226
    .line 227
    iget-wide p0, p0, Lef0;->h:J

    .line 228
    .line 229
    new-instance p2, Ljava/lang/Long;

    .line 230
    .line 231
    invoke-direct {p2, p0, p1}, Ljava/lang/Long;-><init>(J)V

    .line 232
    .line 233
    .line 234
    return-object p2
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
.end method
