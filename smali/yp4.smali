.class public Lyp4;
.super Lix6;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# static fields
.field public static final n:[I


# instance fields
.field public final e:Lvr2;

.field public final f:Lvr2;

.field public g:I

.field public h:Lup4;

.field public i:Ljava/util/ArrayList;

.field public j:Lmx6;

.field public k:[I

.field public l:I

.field public m:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [I

    .line 3
    .line 4
    sput-object v0, Lyp4;->n:[I

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
.end method

.method public constructor <init>(JLmx6;Lvr2;Lvr2;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lix6;-><init>(JLmx6;)V

    .line 2
    .line 3
    .line 4
    iput-object p4, p0, Lyp4;->e:Lvr2;

    .line 5
    .line 6
    iput-object p5, p0, Lyp4;->f:Lvr2;

    .line 7
    .line 8
    sget-object p1, Lmx6;->A:Lmx6;

    .line 9
    .line 10
    iput-object p1, p0, Lyp4;->j:Lmx6;

    .line 11
    .line 12
    sget-object p1, Lyp4;->n:[I

    .line 13
    .line 14
    iput-object p1, p0, Lyp4;->k:[I

    .line 15
    .line 16
    const/4 p1, 0x1

    .line 17
    iput p1, p0, Lyp4;->l:I

    .line 18
    .line 19
    return-void
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
.end method


# virtual methods
.method public final A(J)V
    .locals 2

    .line 1
    sget-object v0, Lnx6;->c:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lyp4;->j:Lmx6;

    .line 5
    .line 6
    invoke-virtual {v1, p1, p2}, Lmx6;->n(J)Lmx6;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iput-object p1, p0, Lyp4;->j:Lmx6;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    .line 12
    monitor-exit v0

    .line 13
    return-void

    .line 14
    :catchall_0
    move-exception p0

    .line 15
    monitor-exit v0

    .line 16
    throw p0
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

.method public B(Lup4;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lyp4;->h:Lup4;

    .line 2
    .line 3
    return-void
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

.method public C(Lvr2;Lvr2;)Lyp4;
    .locals 11

    .line 1
    iget-boolean v0, p0, Lix6;->c:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const-string v0, "Cannot use a disposed snapshot"

    .line 6
    .line 7
    invoke-static {v0}, Lvm5;->a(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    iget-boolean v0, p0, Lyp4;->m:Z

    .line 11
    .line 12
    if-eqz v0, :cond_2

    .line 13
    .line 14
    iget v0, p0, Lix6;->d:I

    .line 15
    .line 16
    if-ltz v0, :cond_1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    const-string v0, "Unsupported operation on a disposed or applied snapshot"

    .line 20
    .line 21
    invoke-static {v0}, Lvm5;->b(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    :cond_2
    :goto_0
    invoke-virtual {p0}, Lix6;->g()J

    .line 25
    .line 26
    .line 27
    move-result-wide v0

    .line 28
    invoke-virtual {p0, v0, v1}, Lyp4;->A(J)V

    .line 29
    .line 30
    .line 31
    sget-object v1, Lnx6;->c:Ljava/lang/Object;

    .line 32
    .line 33
    monitor-enter v1

    .line 34
    :try_start_0
    sget-wide v3, Lnx6;->e:J

    .line 35
    .line 36
    const-wide/16 v9, 0x1

    .line 37
    .line 38
    add-long v5, v3, v9

    .line 39
    .line 40
    sput-wide v5, Lnx6;->e:J

    .line 41
    .line 42
    sget-object v0, Lnx6;->d:Lmx6;

    .line 43
    .line 44
    invoke-virtual {v0, v3, v4}, Lmx6;->n(J)Lmx6;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    sput-object v0, Lnx6;->d:Lmx6;

    .line 49
    .line 50
    invoke-virtual {p0}, Lix6;->d()Lmx6;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-virtual {v0, v3, v4}, Lmx6;->n(J)Lmx6;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    invoke-virtual {p0, v2}, Lix6;->r(Lmx6;)V

    .line 59
    .line 60
    .line 61
    new-instance v2, Lrx4;

    .line 62
    .line 63
    invoke-virtual {p0}, Lix6;->g()J

    .line 64
    .line 65
    .line 66
    move-result-wide v5

    .line 67
    add-long/2addr v5, v9

    .line 68
    invoke-static {v0, v5, v6, v3, v4}, Lnx6;->d(Lmx6;JJ)Lmx6;

    .line 69
    .line 70
    .line 71
    move-result-object v5

    .line 72
    invoke-virtual {p0}, Lyp4;->y()Lvr2;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    const/4 v6, 0x1

    .line 77
    invoke-static {p1, v0, v6}, Lnx6;->k(Lvr2;Lvr2;Z)Lvr2;

    .line 78
    .line 79
    .line 80
    move-result-object v6

    .line 81
    invoke-virtual {p0}, Lyp4;->i()Lvr2;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    invoke-static {p2, p1}, Lnx6;->l(Lvr2;Lvr2;)Lvr2;

    .line 86
    .line 87
    .line 88
    move-result-object v7

    .line 89
    move-object v8, p0

    .line 90
    invoke-direct/range {v2 .. v8}, Lrx4;-><init>(JLmx6;Lvr2;Lvr2;Lyp4;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 91
    .line 92
    .line 93
    monitor-exit v1

    .line 94
    iget-boolean p0, v8, Lyp4;->m:Z

    .line 95
    .line 96
    if-nez p0, :cond_3

    .line 97
    .line 98
    iget-boolean p0, v8, Lix6;->c:Z

    .line 99
    .line 100
    if-nez p0, :cond_3

    .line 101
    .line 102
    invoke-virtual {v8}, Lix6;->g()J

    .line 103
    .line 104
    .line 105
    move-result-wide p0

    .line 106
    monitor-enter v1

    .line 107
    :try_start_1
    sget-wide v3, Lnx6;->e:J

    .line 108
    .line 109
    add-long v5, v3, v9

    .line 110
    .line 111
    sput-wide v5, Lnx6;->e:J

    .line 112
    .line 113
    invoke-virtual {v8, v3, v4}, Lix6;->s(J)V

    .line 114
    .line 115
    .line 116
    sget-object p2, Lnx6;->d:Lmx6;

    .line 117
    .line 118
    invoke-virtual {v8}, Lix6;->g()J

    .line 119
    .line 120
    .line 121
    move-result-wide v3

    .line 122
    invoke-virtual {p2, v3, v4}, Lmx6;->n(J)Lmx6;

    .line 123
    .line 124
    .line 125
    move-result-object p2

    .line 126
    sput-object p2, Lnx6;->d:Lmx6;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 127
    .line 128
    monitor-exit v1

    .line 129
    invoke-virtual {v8}, Lix6;->d()Lmx6;

    .line 130
    .line 131
    .line 132
    move-result-object p2

    .line 133
    add-long/2addr p0, v9

    .line 134
    invoke-virtual {v8}, Lix6;->g()J

    .line 135
    .line 136
    .line 137
    move-result-wide v0

    .line 138
    invoke-static {p2, p0, p1, v0, v1}, Lnx6;->d(Lmx6;JJ)Lmx6;

    .line 139
    .line 140
    .line 141
    move-result-object p0

    .line 142
    invoke-virtual {v8, p0}, Lix6;->r(Lmx6;)V

    .line 143
    .line 144
    .line 145
    return-object v2

    .line 146
    :catchall_0
    move-exception v0

    .line 147
    move-object p0, v0

    .line 148
    monitor-exit v1

    .line 149
    throw p0

    .line 150
    :cond_3
    return-object v2

    .line 151
    :catchall_1
    move-exception v0

    .line 152
    move-object p0, v0

    .line 153
    monitor-exit v1

    .line 154
    throw p0
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

.method public final b()V
    .locals 3

    .line 1
    sget-object v0, Lnx6;->d:Lmx6;

    .line 2
    .line 3
    invoke-virtual {p0}, Lix6;->g()J

    .line 4
    .line 5
    .line 6
    move-result-wide v1

    .line 7
    invoke-virtual {v0, v1, v2}, Lmx6;->g(J)Lmx6;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-object p0, p0, Lyp4;->j:Lmx6;

    .line 12
    .line 13
    invoke-virtual {v0, p0}, Lmx6;->f(Lmx6;)Lmx6;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    sput-object p0, Lnx6;->d:Lmx6;

    .line 18
    .line 19
    return-void
    .line 20
    .line 21
.end method

.method public c()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lix6;->c:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lix6;->c:Z

    .line 7
    .line 8
    sget-object v0, Lnx6;->c:Ljava/lang/Object;

    .line 9
    .line 10
    monitor-enter v0

    .line 11
    :try_start_0
    invoke-virtual {p0}, Lix6;->o()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    .line 13
    .line 14
    monitor-exit v0

    .line 15
    invoke-virtual {p0}, Lyp4;->l()V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :catchall_0
    move-exception p0

    .line 20
    monitor-exit v0

    .line 21
    throw p0

    .line 22
    :cond_0
    return-void
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
.end method

.method public bridge synthetic e()Lvr2;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lyp4;->y()Lvr2;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
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

.method public f()Z
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

.method public h()I
    .locals 0

    .line 1
    iget p0, p0, Lyp4;->g:I

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

.method public i()Lvr2;
    .locals 0

    .line 1
    iget-object p0, p0, Lyp4;->f:Lvr2;

    .line 2
    .line 3
    return-object p0
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

.method public k()V
    .locals 1

    .line 1
    iget v0, p0, Lyp4;->l:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    iput v0, p0, Lyp4;->l:I

    .line 6
    .line 7
    return-void
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

.method public l()V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lyp4;->l:I

    .line 4
    .line 5
    if-lez v1, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const-string v1, "no pending nested snapshots"

    .line 9
    .line 10
    invoke-static {v1}, Lvm5;->a(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    :goto_0
    iget v1, v0, Lyp4;->l:I

    .line 14
    .line 15
    add-int/lit8 v1, v1, -0x1

    .line 16
    .line 17
    iput v1, v0, Lyp4;->l:I

    .line 18
    .line 19
    if-nez v1, :cond_8

    .line 20
    .line 21
    iget-boolean v1, v0, Lyp4;->m:Z

    .line 22
    .line 23
    if-nez v1, :cond_8

    .line 24
    .line 25
    invoke-virtual {v0}, Lyp4;->x()Lup4;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    if-eqz v1, :cond_7

    .line 30
    .line 31
    iget-boolean v2, v0, Lyp4;->m:Z

    .line 32
    .line 33
    if-eqz v2, :cond_1

    .line 34
    .line 35
    const-string v2, "Unsupported operation on a snapshot that has been applied"

    .line 36
    .line 37
    invoke-static {v2}, Lvm5;->b(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    :cond_1
    const/4 v2, 0x0

    .line 41
    invoke-virtual {v0, v2}, Lyp4;->B(Lup4;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0}, Lix6;->g()J

    .line 45
    .line 46
    .line 47
    move-result-wide v2

    .line 48
    iget-object v4, v1, Lup4;->b:[Ljava/lang/Object;

    .line 49
    .line 50
    iget-object v1, v1, Lup4;->a:[J

    .line 51
    .line 52
    array-length v5, v1

    .line 53
    add-int/lit8 v5, v5, -0x2

    .line 54
    .line 55
    if-ltz v5, :cond_7

    .line 56
    .line 57
    const/4 v7, 0x0

    .line 58
    :goto_1
    aget-wide v8, v1, v7

    .line 59
    .line 60
    not-long v10, v8

    .line 61
    const/4 v12, 0x7

    .line 62
    shl-long/2addr v10, v12

    .line 63
    and-long/2addr v10, v8

    .line 64
    const-wide v12, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    and-long/2addr v10, v12

    .line 70
    cmp-long v10, v10, v12

    .line 71
    .line 72
    if-eqz v10, :cond_6

    .line 73
    .line 74
    sub-int v10, v7, v5

    .line 75
    .line 76
    not-int v10, v10

    .line 77
    ushr-int/lit8 v10, v10, 0x1f

    .line 78
    .line 79
    const/16 v11, 0x8

    .line 80
    .line 81
    rsub-int/lit8 v10, v10, 0x8

    .line 82
    .line 83
    const/4 v12, 0x0

    .line 84
    :goto_2
    if-ge v12, v10, :cond_5

    .line 85
    .line 86
    const-wide/16 v13, 0xff

    .line 87
    .line 88
    and-long/2addr v13, v8

    .line 89
    const-wide/16 v15, 0x80

    .line 90
    .line 91
    cmp-long v13, v13, v15

    .line 92
    .line 93
    if-gez v13, :cond_4

    .line 94
    .line 95
    shl-int/lit8 v13, v7, 0x3

    .line 96
    .line 97
    add-int/2addr v13, v12

    .line 98
    aget-object v13, v4, v13

    .line 99
    .line 100
    check-cast v13, Ln37;

    .line 101
    .line 102
    invoke-interface {v13}, Ln37;->getFirstStateRecord()Lp37;

    .line 103
    .line 104
    .line 105
    move-result-object v13

    .line 106
    :goto_3
    if-eqz v13, :cond_4

    .line 107
    .line 108
    iget-wide v14, v13, Lp37;->a:J

    .line 109
    .line 110
    cmp-long v16, v14, v2

    .line 111
    .line 112
    if-eqz v16, :cond_2

    .line 113
    .line 114
    iget-object v6, v0, Lyp4;->j:Lmx6;

    .line 115
    .line 116
    invoke-static {v14, v15}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 117
    .line 118
    .line 119
    move-result-object v14

    .line 120
    invoke-static {v6, v14}, Ldt0;->q0(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    move-result v6

    .line 124
    if-eqz v6, :cond_3

    .line 125
    .line 126
    :cond_2
    sget-object v6, Lnx6;->a:Lnf6;

    .line 127
    .line 128
    const-wide/16 v14, 0x0

    .line 129
    .line 130
    iput-wide v14, v13, Lp37;->a:J

    .line 131
    .line 132
    :cond_3
    iget-object v13, v13, Lp37;->b:Lp37;

    .line 133
    .line 134
    goto :goto_3

    .line 135
    :cond_4
    shr-long/2addr v8, v11

    .line 136
    add-int/lit8 v12, v12, 0x1

    .line 137
    .line 138
    goto :goto_2

    .line 139
    :cond_5
    if-ne v10, v11, :cond_7

    .line 140
    .line 141
    :cond_6
    if-eq v7, v5, :cond_7

    .line 142
    .line 143
    add-int/lit8 v7, v7, 0x1

    .line 144
    .line 145
    goto :goto_1

    .line 146
    :cond_7
    invoke-virtual {v0}, Lix6;->a()V

    .line 147
    .line 148
    .line 149
    :cond_8
    return-void
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

.method public m()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lyp4;->m:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-boolean v0, p0, Lix6;->c:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-virtual {p0}, Lyp4;->v()V

    .line 11
    .line 12
    .line 13
    :cond_1
    :goto_0
    return-void
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public n(Ln37;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lyp4;->x()Lup4;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    sget-object v0, Lcg6;->a:Lup4;

    .line 8
    .line 9
    new-instance v0, Lup4;

    .line 10
    .line 11
    invoke-direct {v0}, Lup4;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, v0}, Lyp4;->B(Lup4;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    invoke-virtual {v0, p1}, Lup4;->a(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    return-void
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

.method public final p()V
    .locals 3

    .line 1
    iget-object v0, p0, Lyp4;->k:[I

    .line 2
    .line 3
    array-length v0, v0

    .line 4
    const/4 v1, 0x0

    .line 5
    :goto_0
    if-ge v1, v0, :cond_0

    .line 6
    .line 7
    iget-object v2, p0, Lyp4;->k:[I

    .line 8
    .line 9
    aget v2, v2, v1

    .line 10
    .line 11
    invoke-static {v2}, Lnx6;->u(I)V

    .line 12
    .line 13
    .line 14
    add-int/lit8 v1, v1, 0x1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    invoke-virtual {p0}, Lix6;->o()V

    .line 18
    .line 19
    .line 20
    return-void
    .line 21
.end method

.method public t(I)V
    .locals 0

    .line 1
    iput p1, p0, Lyp4;->g:I

    .line 2
    .line 3
    return-void
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

.method public u(Lvr2;)Lix6;
    .locals 11

    .line 1
    iget-boolean v0, p0, Lix6;->c:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const-string v0, "Cannot use a disposed snapshot"

    .line 6
    .line 7
    invoke-static {v0}, Lvm5;->a(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    iget-boolean v0, p0, Lyp4;->m:Z

    .line 11
    .line 12
    if-eqz v0, :cond_2

    .line 13
    .line 14
    iget v0, p0, Lix6;->d:I

    .line 15
    .line 16
    if-ltz v0, :cond_1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    const-string v0, "Unsupported operation on a disposed or applied snapshot"

    .line 20
    .line 21
    invoke-static {v0}, Lvm5;->b(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    :cond_2
    :goto_0
    invoke-virtual {p0}, Lix6;->g()J

    .line 25
    .line 26
    .line 27
    move-result-wide v0

    .line 28
    invoke-virtual {p0}, Lix6;->g()J

    .line 29
    .line 30
    .line 31
    move-result-wide v2

    .line 32
    invoke-virtual {p0, v2, v3}, Lyp4;->A(J)V

    .line 33
    .line 34
    .line 35
    sget-object v2, Lnx6;->c:Ljava/lang/Object;

    .line 36
    .line 37
    monitor-enter v2

    .line 38
    :try_start_0
    sget-wide v4, Lnx6;->e:J

    .line 39
    .line 40
    const-wide/16 v9, 0x1

    .line 41
    .line 42
    add-long v6, v4, v9

    .line 43
    .line 44
    sput-wide v6, Lnx6;->e:J

    .line 45
    .line 46
    sget-object v3, Lnx6;->d:Lmx6;

    .line 47
    .line 48
    invoke-virtual {v3, v4, v5}, Lmx6;->n(J)Lmx6;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    sput-object v3, Lnx6;->d:Lmx6;

    .line 53
    .line 54
    new-instance v3, Lsx4;

    .line 55
    .line 56
    invoke-virtual {p0}, Lix6;->d()Lmx6;

    .line 57
    .line 58
    .line 59
    move-result-object v6

    .line 60
    add-long/2addr v0, v9

    .line 61
    invoke-static {v6, v0, v1, v4, v5}, Lnx6;->d(Lmx6;JJ)Lmx6;

    .line 62
    .line 63
    .line 64
    move-result-object v6

    .line 65
    invoke-virtual {p0}, Lyp4;->y()Lvr2;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    const/4 v1, 0x1

    .line 70
    invoke-static {p1, v0, v1}, Lnx6;->k(Lvr2;Lvr2;Z)Lvr2;

    .line 71
    .line 72
    .line 73
    move-result-object v7

    .line 74
    move-object v8, p0

    .line 75
    invoke-direct/range {v3 .. v8}, Lsx4;-><init>(JLmx6;Lvr2;Lix6;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 76
    .line 77
    .line 78
    monitor-exit v2

    .line 79
    iget-boolean p0, v8, Lyp4;->m:Z

    .line 80
    .line 81
    if-nez p0, :cond_3

    .line 82
    .line 83
    iget-boolean p0, v8, Lix6;->c:Z

    .line 84
    .line 85
    if-nez p0, :cond_3

    .line 86
    .line 87
    invoke-virtual {v8}, Lix6;->g()J

    .line 88
    .line 89
    .line 90
    move-result-wide p0

    .line 91
    monitor-enter v2

    .line 92
    :try_start_1
    sget-wide v0, Lnx6;->e:J

    .line 93
    .line 94
    add-long v4, v0, v9

    .line 95
    .line 96
    sput-wide v4, Lnx6;->e:J

    .line 97
    .line 98
    invoke-virtual {v8, v0, v1}, Lix6;->s(J)V

    .line 99
    .line 100
    .line 101
    sget-object v0, Lnx6;->d:Lmx6;

    .line 102
    .line 103
    invoke-virtual {v8}, Lix6;->g()J

    .line 104
    .line 105
    .line 106
    move-result-wide v4

    .line 107
    invoke-virtual {v0, v4, v5}, Lmx6;->n(J)Lmx6;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    sput-object v0, Lnx6;->d:Lmx6;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 112
    .line 113
    monitor-exit v2

    .line 114
    invoke-virtual {v8}, Lix6;->d()Lmx6;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    add-long/2addr p0, v9

    .line 119
    invoke-virtual {v8}, Lix6;->g()J

    .line 120
    .line 121
    .line 122
    move-result-wide v1

    .line 123
    invoke-static {v0, p0, p1, v1, v2}, Lnx6;->d(Lmx6;JJ)Lmx6;

    .line 124
    .line 125
    .line 126
    move-result-object p0

    .line 127
    invoke-virtual {v8, p0}, Lix6;->r(Lmx6;)V

    .line 128
    .line 129
    .line 130
    return-object v3

    .line 131
    :catchall_0
    move-exception v0

    .line 132
    move-object p0, v0

    .line 133
    monitor-exit v2

    .line 134
    throw p0

    .line 135
    :cond_3
    return-object v3

    .line 136
    :catchall_1
    move-exception v0

    .line 137
    move-object p0, v0

    .line 138
    monitor-exit v2

    .line 139
    throw p0
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

.method public final v()V
    .locals 9

    .line 1
    invoke-virtual {p0}, Lix6;->g()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    invoke-virtual {p0, v0, v1}, Lyp4;->A(J)V

    .line 6
    .line 7
    .line 8
    iget-boolean v0, p0, Lyp4;->m:Z

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    iget-boolean v0, p0, Lix6;->c:Z

    .line 13
    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    invoke-virtual {p0}, Lix6;->g()J

    .line 17
    .line 18
    .line 19
    move-result-wide v0

    .line 20
    sget-object v2, Lnx6;->c:Ljava/lang/Object;

    .line 21
    .line 22
    monitor-enter v2

    .line 23
    :try_start_0
    sget-wide v3, Lnx6;->e:J

    .line 24
    .line 25
    const-wide/16 v5, 0x1

    .line 26
    .line 27
    add-long v7, v3, v5

    .line 28
    .line 29
    sput-wide v7, Lnx6;->e:J

    .line 30
    .line 31
    invoke-virtual {p0, v3, v4}, Lix6;->s(J)V

    .line 32
    .line 33
    .line 34
    sget-object v3, Lnx6;->d:Lmx6;

    .line 35
    .line 36
    invoke-virtual {p0}, Lix6;->g()J

    .line 37
    .line 38
    .line 39
    move-result-wide v7

    .line 40
    invoke-virtual {v3, v7, v8}, Lmx6;->n(J)Lmx6;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    sput-object v3, Lnx6;->d:Lmx6;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 45
    .line 46
    monitor-exit v2

    .line 47
    invoke-virtual {p0}, Lix6;->d()Lmx6;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    add-long/2addr v0, v5

    .line 52
    invoke-virtual {p0}, Lix6;->g()J

    .line 53
    .line 54
    .line 55
    move-result-wide v3

    .line 56
    invoke-static {v2, v0, v1, v3, v4}, Lnx6;->d(Lmx6;JJ)Lmx6;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-virtual {p0, v0}, Lix6;->r(Lmx6;)V

    .line 61
    .line 62
    .line 63
    return-void

    .line 64
    :catchall_0
    move-exception p0

    .line 65
    monitor-exit v2

    .line 66
    throw p0

    .line 67
    :cond_0
    return-void
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

.method public w()Lf55;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual {v0}, Lyp4;->x()Lup4;

    .line 4
    .line 5
    .line 6
    move-result-object v3

    .line 7
    const/4 v6, 0x0

    .line 8
    if-eqz v3, :cond_0

    .line 9
    .line 10
    sget-object v1, Lnx6;->j:Lew2;

    .line 11
    .line 12
    iget-wide v1, v1, Lix6;->b:J

    .line 13
    .line 14
    sget-object v4, Lnx6;->d:Lmx6;

    .line 15
    .line 16
    invoke-virtual {v4, v1, v2}, Lmx6;->g(J)Lmx6;

    .line 17
    .line 18
    .line 19
    move-result-object v4

    .line 20
    invoke-static {v1, v2, v0, v4}, Lnx6;->b(JLyp4;Lmx6;)Ljava/util/HashMap;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    move-object v4, v1

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    move-object v4, v6

    .line 27
    :goto_0
    sget-object v1, La42;->w:La42;

    .line 28
    .line 29
    sget-object v7, Lnx6;->c:Ljava/lang/Object;

    .line 30
    .line 31
    monitor-enter v7

    .line 32
    :try_start_0
    invoke-static {v0}, Lnx6;->c(Lix6;)V

    .line 33
    .line 34
    .line 35
    if-eqz v3, :cond_3

    .line 36
    .line 37
    iget v2, v3, Lup4;->d:I

    .line 38
    .line 39
    if-nez v2, :cond_1

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    sget-object v8, Lnx6;->j:Lew2;

    .line 43
    .line 44
    sget-wide v1, Lnx6;->e:J

    .line 45
    .line 46
    sget-object v5, Lnx6;->d:Lmx6;

    .line 47
    .line 48
    iget-wide v9, v8, Lix6;->b:J

    .line 49
    .line 50
    invoke-virtual {v5, v9, v10}, Lmx6;->g(J)Lmx6;

    .line 51
    .line 52
    .line 53
    move-result-object v5

    .line 54
    invoke-virtual/range {v0 .. v5}, Lyp4;->z(JLup4;Ljava/util/HashMap;Lmx6;)Lf55;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    sget-object v2, Lkx6;->i:Lkx6;

    .line 59
    .line 60
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 64
    if-nez v2, :cond_2

    .line 65
    .line 66
    monitor-exit v7

    .line 67
    return-object v1

    .line 68
    :cond_2
    :try_start_1
    invoke-virtual {v0}, Lyp4;->b()V

    .line 69
    .line 70
    .line 71
    iget-object v1, v8, Lyp4;->h:Lup4;

    .line 72
    .line 73
    sget-object v2, Lnx6;->a:Lnf6;

    .line 74
    .line 75
    invoke-static {v8, v2}, Lnx6;->v(Lew2;Lvr2;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0, v6}, Lyp4;->B(Lup4;)V

    .line 79
    .line 80
    .line 81
    iput-object v6, v8, Lyp4;->h:Lup4;

    .line 82
    .line 83
    sget-object v2, Lnx6;->h:Ljava/util/List;

    .line 84
    .line 85
    goto :goto_2

    .line 86
    :catchall_0
    move-exception v0

    .line 87
    goto/16 :goto_c

    .line 88
    .line 89
    :cond_3
    :goto_1
    invoke-virtual {v0}, Lyp4;->b()V

    .line 90
    .line 91
    .line 92
    sget-object v2, Lnx6;->j:Lew2;

    .line 93
    .line 94
    iget-object v4, v2, Lyp4;->h:Lup4;

    .line 95
    .line 96
    sget-object v5, Lnx6;->a:Lnf6;

    .line 97
    .line 98
    invoke-static {v2, v5}, Lnx6;->v(Lew2;Lvr2;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    if-eqz v4, :cond_4

    .line 102
    .line 103
    invoke-virtual {v4}, Lup4;->h()Z

    .line 104
    .line 105
    .line 106
    move-result v2

    .line 107
    if-eqz v2, :cond_4

    .line 108
    .line 109
    sget-object v1, Lnx6;->h:Ljava/util/List;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 110
    .line 111
    move-object v2, v1

    .line 112
    move-object v1, v4

    .line 113
    goto :goto_2

    .line 114
    :cond_4
    move-object v2, v1

    .line 115
    move-object v1, v6

    .line 116
    :goto_2
    monitor-exit v7

    .line 117
    const/4 v4, 0x1

    .line 118
    iput-boolean v4, v0, Lyp4;->m:Z

    .line 119
    .line 120
    if-eqz v1, :cond_5

    .line 121
    .line 122
    new-instance v5, Ldg6;

    .line 123
    .line 124
    invoke-direct {v5, v1}, Ldg6;-><init>(Lup4;)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v1}, Lup4;->g()Z

    .line 128
    .line 129
    .line 130
    move-result v7

    .line 131
    if-nez v7, :cond_5

    .line 132
    .line 133
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    .line 134
    .line 135
    .line 136
    move-result v7

    .line 137
    const/4 v8, 0x0

    .line 138
    :goto_3
    if-ge v8, v7, :cond_5

    .line 139
    .line 140
    invoke-interface {v2, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v9

    .line 144
    check-cast v9, Lgs2;

    .line 145
    .line 146
    invoke-interface {v9, v5, v0}, Lgs2;->H(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    add-int/lit8 v8, v8, 0x1

    .line 150
    .line 151
    goto :goto_3

    .line 152
    :cond_5
    if-eqz v3, :cond_6

    .line 153
    .line 154
    invoke-virtual {v3}, Lup4;->h()Z

    .line 155
    .line 156
    .line 157
    move-result v5

    .line 158
    if-eqz v5, :cond_6

    .line 159
    .line 160
    new-instance v5, Ldg6;

    .line 161
    .line 162
    invoke-direct {v5, v3}, Ldg6;-><init>(Lup4;)V

    .line 163
    .line 164
    .line 165
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    .line 166
    .line 167
    .line 168
    move-result v7

    .line 169
    const/4 v8, 0x0

    .line 170
    :goto_4
    if-ge v8, v7, :cond_6

    .line 171
    .line 172
    invoke-interface {v2, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v9

    .line 176
    check-cast v9, Lgs2;

    .line 177
    .line 178
    invoke-interface {v9, v5, v0}, Lgs2;->H(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    add-int/lit8 v8, v8, 0x1

    .line 182
    .line 183
    goto :goto_4

    .line 184
    :cond_6
    sget-object v2, Lnx6;->c:Ljava/lang/Object;

    .line 185
    .line 186
    monitor-enter v2

    .line 187
    :try_start_2
    invoke-virtual {v0}, Lyp4;->p()V

    .line 188
    .line 189
    .line 190
    invoke-static {}, Lnx6;->f()V

    .line 191
    .line 192
    .line 193
    const/4 v5, 0x7

    .line 194
    const-wide v11, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    const/16 v13, 0x8

    .line 200
    .line 201
    if-eqz v1, :cond_a

    .line 202
    .line 203
    iget-object v14, v1, Lup4;->b:[Ljava/lang/Object;

    .line 204
    .line 205
    iget-object v1, v1, Lup4;->a:[J

    .line 206
    .line 207
    array-length v15, v1

    .line 208
    add-int/lit8 v15, v15, -0x2

    .line 209
    .line 210
    if-ltz v15, :cond_a

    .line 211
    .line 212
    const/4 v4, 0x0

    .line 213
    const-wide/16 v16, 0x80

    .line 214
    .line 215
    :goto_5
    aget-wide v7, v1, v4

    .line 216
    .line 217
    const-wide/16 v18, 0xff

    .line 218
    .line 219
    not-long v9, v7

    .line 220
    shl-long/2addr v9, v5

    .line 221
    and-long/2addr v9, v7

    .line 222
    and-long/2addr v9, v11

    .line 223
    cmp-long v9, v9, v11

    .line 224
    .line 225
    if-eqz v9, :cond_9

    .line 226
    .line 227
    sub-int v9, v4, v15

    .line 228
    .line 229
    not-int v9, v9

    .line 230
    ushr-int/lit8 v9, v9, 0x1f

    .line 231
    .line 232
    rsub-int/lit8 v9, v9, 0x8

    .line 233
    .line 234
    const/4 v10, 0x0

    .line 235
    :goto_6
    if-ge v10, v9, :cond_8

    .line 236
    .line 237
    and-long v20, v7, v18

    .line 238
    .line 239
    cmp-long v20, v20, v16

    .line 240
    .line 241
    if-gez v20, :cond_7

    .line 242
    .line 243
    shl-int/lit8 v20, v4, 0x3

    .line 244
    .line 245
    add-int v20, v20, v10

    .line 246
    .line 247
    aget-object v20, v14, v20

    .line 248
    .line 249
    check-cast v20, Ln37;

    .line 250
    .line 251
    invoke-static/range {v20 .. v20}, Lnx6;->q(Ln37;)V

    .line 252
    .line 253
    .line 254
    goto :goto_7

    .line 255
    :catchall_1
    move-exception v0

    .line 256
    goto :goto_b

    .line 257
    :cond_7
    :goto_7
    shr-long/2addr v7, v13

    .line 258
    add-int/lit8 v10, v10, 0x1

    .line 259
    .line 260
    goto :goto_6

    .line 261
    :cond_8
    if-ne v9, v13, :cond_b

    .line 262
    .line 263
    :cond_9
    if-eq v4, v15, :cond_b

    .line 264
    .line 265
    add-int/lit8 v4, v4, 0x1

    .line 266
    .line 267
    goto :goto_5

    .line 268
    :cond_a
    const-wide/16 v16, 0x80

    .line 269
    .line 270
    const-wide/16 v18, 0xff

    .line 271
    .line 272
    :cond_b
    if-eqz v3, :cond_f

    .line 273
    .line 274
    iget-object v1, v3, Lup4;->b:[Ljava/lang/Object;

    .line 275
    .line 276
    iget-object v3, v3, Lup4;->a:[J

    .line 277
    .line 278
    array-length v4, v3

    .line 279
    add-int/lit8 v4, v4, -0x2

    .line 280
    .line 281
    if-ltz v4, :cond_f

    .line 282
    .line 283
    const/4 v7, 0x0

    .line 284
    :goto_8
    aget-wide v8, v3, v7

    .line 285
    .line 286
    not-long v14, v8

    .line 287
    shl-long/2addr v14, v5

    .line 288
    and-long/2addr v14, v8

    .line 289
    and-long/2addr v14, v11

    .line 290
    cmp-long v10, v14, v11

    .line 291
    .line 292
    if-eqz v10, :cond_e

    .line 293
    .line 294
    sub-int v10, v7, v4

    .line 295
    .line 296
    not-int v10, v10

    .line 297
    ushr-int/lit8 v10, v10, 0x1f

    .line 298
    .line 299
    rsub-int/lit8 v10, v10, 0x8

    .line 300
    .line 301
    const/4 v14, 0x0

    .line 302
    :goto_9
    if-ge v14, v10, :cond_d

    .line 303
    .line 304
    and-long v20, v8, v18

    .line 305
    .line 306
    cmp-long v15, v20, v16

    .line 307
    .line 308
    if-gez v15, :cond_c

    .line 309
    .line 310
    shl-int/lit8 v15, v7, 0x3

    .line 311
    .line 312
    add-int/2addr v15, v14

    .line 313
    aget-object v15, v1, v15

    .line 314
    .line 315
    check-cast v15, Ln37;

    .line 316
    .line 317
    invoke-static {v15}, Lnx6;->q(Ln37;)V

    .line 318
    .line 319
    .line 320
    :cond_c
    shr-long/2addr v8, v13

    .line 321
    add-int/lit8 v14, v14, 0x1

    .line 322
    .line 323
    goto :goto_9

    .line 324
    :cond_d
    if-ne v10, v13, :cond_f

    .line 325
    .line 326
    :cond_e
    if-eq v7, v4, :cond_f

    .line 327
    .line 328
    add-int/lit8 v7, v7, 0x1

    .line 329
    .line 330
    goto :goto_8

    .line 331
    :cond_f
    iget-object v1, v0, Lyp4;->i:Ljava/util/ArrayList;

    .line 332
    .line 333
    if-eqz v1, :cond_10

    .line 334
    .line 335
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 336
    .line 337
    .line 338
    move-result v3

    .line 339
    const/4 v4, 0x0

    .line 340
    :goto_a
    if-ge v4, v3, :cond_10

    .line 341
    .line 342
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 343
    .line 344
    .line 345
    move-result-object v5

    .line 346
    check-cast v5, Ln37;

    .line 347
    .line 348
    invoke-static {v5}, Lnx6;->q(Ln37;)V

    .line 349
    .line 350
    .line 351
    add-int/lit8 v4, v4, 0x1

    .line 352
    .line 353
    goto :goto_a

    .line 354
    :cond_10
    iput-object v6, v0, Lyp4;->i:Ljava/util/ArrayList;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 355
    .line 356
    monitor-exit v2

    .line 357
    sget-object v0, Lkx6;->i:Lkx6;

    .line 358
    .line 359
    return-object v0

    .line 360
    :goto_b
    monitor-exit v2

    .line 361
    throw v0

    .line 362
    :goto_c
    monitor-exit v7

    .line 363
    throw v0
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

.method public x()Lup4;
    .locals 0

    .line 1
    iget-object p0, p0, Lyp4;->h:Lup4;

    .line 2
    .line 3
    return-object p0
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

.method public y()Lvr2;
    .locals 0

    .line 1
    iget-object p0, p0, Lyp4;->e:Lvr2;

    .line 2
    .line 3
    return-object p0
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

.method public final z(JLup4;Ljava/util/HashMap;Lmx6;)Lf55;
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-wide/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v3, p3

    .line 6
    .line 7
    move-object/from16 v4, p4

    .line 8
    .line 9
    invoke-virtual {v0}, Lix6;->d()Lmx6;

    .line 10
    .line 11
    .line 12
    move-result-object v5

    .line 13
    invoke-virtual {v0}, Lix6;->g()J

    .line 14
    .line 15
    .line 16
    move-result-wide v6

    .line 17
    invoke-virtual {v5, v6, v7}, Lmx6;->n(J)Lmx6;

    .line 18
    .line 19
    .line 20
    move-result-object v5

    .line 21
    iget-object v6, v0, Lyp4;->j:Lmx6;

    .line 22
    .line 23
    invoke-virtual {v5, v6}, Lmx6;->l(Lmx6;)Lmx6;

    .line 24
    .line 25
    .line 26
    move-result-object v5

    .line 27
    iget-object v6, v3, Lup4;->b:[Ljava/lang/Object;

    .line 28
    .line 29
    iget-object v7, v3, Lup4;->a:[J

    .line 30
    .line 31
    array-length v8, v7

    .line 32
    add-int/lit8 v8, v8, -0x2

    .line 33
    .line 34
    if-ltz v8, :cond_12

    .line 35
    .line 36
    const/4 v11, 0x0

    .line 37
    const/4 v12, 0x0

    .line 38
    const/4 v13, 0x0

    .line 39
    :goto_0
    aget-wide v14, v7, v11

    .line 40
    .line 41
    const/16 v16, 0x0

    .line 42
    .line 43
    not-long v9, v14

    .line 44
    const/16 v17, 0x7

    .line 45
    .line 46
    shl-long v9, v9, v17

    .line 47
    .line 48
    and-long/2addr v9, v14

    .line 49
    const-wide v17, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    and-long v9, v9, v17

    .line 55
    .line 56
    cmp-long v9, v9, v17

    .line 57
    .line 58
    if-eqz v9, :cond_10

    .line 59
    .line 60
    sub-int v9, v11, v8

    .line 61
    .line 62
    not-int v9, v9

    .line 63
    ushr-int/lit8 v9, v9, 0x1f

    .line 64
    .line 65
    const/16 v10, 0x8

    .line 66
    .line 67
    rsub-int/lit8 v9, v9, 0x8

    .line 68
    .line 69
    move/from16 v17, v10

    .line 70
    .line 71
    const/4 v10, 0x0

    .line 72
    :goto_1
    if-ge v10, v9, :cond_f

    .line 73
    .line 74
    const-wide/16 v18, 0xff

    .line 75
    .line 76
    and-long v18, v14, v18

    .line 77
    .line 78
    const-wide/16 v20, 0x80

    .line 79
    .line 80
    cmp-long v18, v18, v20

    .line 81
    .line 82
    if-gez v18, :cond_e

    .line 83
    .line 84
    shl-int/lit8 v18, v11, 0x3

    .line 85
    .line 86
    add-int v18, v18, v10

    .line 87
    .line 88
    aget-object v18, v6, v18

    .line 89
    .line 90
    move-object/from16 v19, v6

    .line 91
    .line 92
    move-object/from16 v6, v18

    .line 93
    .line 94
    check-cast v6, Ln37;

    .line 95
    .line 96
    move-object/from16 v18, v7

    .line 97
    .line 98
    invoke-interface {v6}, Ln37;->getFirstStateRecord()Lp37;

    .line 99
    .line 100
    .line 101
    move-result-object v7

    .line 102
    move/from16 v20, v10

    .line 103
    .line 104
    move-object/from16 v21, v12

    .line 105
    .line 106
    move-object/from16 v10, p5

    .line 107
    .line 108
    invoke-static {v7, v1, v2, v10}, Lnx6;->s(Lp37;JLmx6;)Lp37;

    .line 109
    .line 110
    .line 111
    move-result-object v12

    .line 112
    if-nez v12, :cond_0

    .line 113
    .line 114
    move-object/from16 v22, v13

    .line 115
    .line 116
    move-wide/from16 v23, v14

    .line 117
    .line 118
    goto :goto_2

    .line 119
    :cond_0
    move-object/from16 v22, v13

    .line 120
    .line 121
    move-wide/from16 v23, v14

    .line 122
    .line 123
    invoke-virtual {v0}, Lix6;->g()J

    .line 124
    .line 125
    .line 126
    move-result-wide v13

    .line 127
    invoke-static {v7, v13, v14, v5}, Lnx6;->s(Lp37;JLmx6;)Lp37;

    .line 128
    .line 129
    .line 130
    move-result-object v13

    .line 131
    if-nez v13, :cond_1

    .line 132
    .line 133
    goto :goto_2

    .line 134
    :cond_1
    iget-wide v14, v13, Lp37;->a:J

    .line 135
    .line 136
    const-wide/16 v25, 0x1

    .line 137
    .line 138
    cmp-long v14, v14, v25

    .line 139
    .line 140
    if-nez v14, :cond_3

    .line 141
    .line 142
    :cond_2
    :goto_2
    move-object/from16 v25, v5

    .line 143
    .line 144
    goto/16 :goto_8

    .line 145
    .line 146
    :cond_3
    invoke-virtual {v12, v13}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 147
    .line 148
    .line 149
    move-result v14

    .line 150
    if-nez v14, :cond_2

    .line 151
    .line 152
    invoke-virtual {v0}, Lix6;->g()J

    .line 153
    .line 154
    .line 155
    move-result-wide v14

    .line 156
    move-object/from16 v25, v5

    .line 157
    .line 158
    invoke-virtual {v0}, Lix6;->d()Lmx6;

    .line 159
    .line 160
    .line 161
    move-result-object v5

    .line 162
    invoke-static {v7, v14, v15, v5}, Lnx6;->s(Lp37;JLmx6;)Lp37;

    .line 163
    .line 164
    .line 165
    move-result-object v5

    .line 166
    if-eqz v5, :cond_c

    .line 167
    .line 168
    if-eqz v4, :cond_4

    .line 169
    .line 170
    invoke-interface {v4, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v7

    .line 174
    check-cast v7, Lp37;

    .line 175
    .line 176
    if-nez v7, :cond_5

    .line 177
    .line 178
    :cond_4
    invoke-interface {v6, v13, v12, v5}, Ln37;->mergeRecords(Lp37;Lp37;Lp37;)Lp37;

    .line 179
    .line 180
    .line 181
    move-result-object v7

    .line 182
    :cond_5
    if-nez v7, :cond_6

    .line 183
    .line 184
    new-instance v1, Ljx6;

    .line 185
    .line 186
    invoke-direct {v1, v0}, Ljx6;-><init>(Lyp4;)V

    .line 187
    .line 188
    .line 189
    return-object v1

    .line 190
    :cond_6
    invoke-virtual {v7, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 191
    .line 192
    .line 193
    move-result v5

    .line 194
    if-nez v5, :cond_d

    .line 195
    .line 196
    invoke-virtual {v7, v12}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 197
    .line 198
    .line 199
    move-result v5

    .line 200
    if-eqz v5, :cond_9

    .line 201
    .line 202
    if-nez v21, :cond_7

    .line 203
    .line 204
    new-instance v5, Ljava/util/ArrayList;

    .line 205
    .line 206
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 207
    .line 208
    .line 209
    goto :goto_3

    .line 210
    :cond_7
    move-object/from16 v5, v21

    .line 211
    .line 212
    :goto_3
    invoke-virtual {v0}, Lix6;->g()J

    .line 213
    .line 214
    .line 215
    move-result-wide v13

    .line 216
    invoke-virtual {v12, v13, v14}, Lp37;->b(J)Lp37;

    .line 217
    .line 218
    .line 219
    move-result-object v7

    .line 220
    new-instance v12, Lyb5;

    .line 221
    .line 222
    invoke-direct {v12, v6, v7}, Lyb5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 223
    .line 224
    .line 225
    invoke-interface {v5, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 226
    .line 227
    .line 228
    if-nez v22, :cond_8

    .line 229
    .line 230
    new-instance v7, Ljava/util/ArrayList;

    .line 231
    .line 232
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 233
    .line 234
    .line 235
    move-object v13, v7

    .line 236
    goto :goto_4

    .line 237
    :cond_8
    move-object/from16 v13, v22

    .line 238
    .line 239
    :goto_4
    invoke-interface {v13, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 240
    .line 241
    .line 242
    move-object v12, v5

    .line 243
    goto :goto_9

    .line 244
    :cond_9
    if-nez v21, :cond_a

    .line 245
    .line 246
    new-instance v5, Ljava/util/ArrayList;

    .line 247
    .line 248
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 249
    .line 250
    .line 251
    move-object v12, v5

    .line 252
    goto :goto_5

    .line 253
    :cond_a
    move-object/from16 v12, v21

    .line 254
    .line 255
    :goto_5
    invoke-virtual {v7, v13}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 256
    .line 257
    .line 258
    move-result v5

    .line 259
    if-nez v5, :cond_b

    .line 260
    .line 261
    new-instance v5, Lyb5;

    .line 262
    .line 263
    invoke-direct {v5, v6, v7}, Lyb5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 264
    .line 265
    .line 266
    goto :goto_6

    .line 267
    :cond_b
    invoke-virtual {v0}, Lix6;->g()J

    .line 268
    .line 269
    .line 270
    move-result-wide v14

    .line 271
    invoke-virtual {v13, v14, v15}, Lp37;->b(J)Lp37;

    .line 272
    .line 273
    .line 274
    move-result-object v5

    .line 275
    new-instance v7, Lyb5;

    .line 276
    .line 277
    invoke-direct {v7, v6, v5}, Lyb5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 278
    .line 279
    .line 280
    move-object v5, v7

    .line 281
    :goto_6
    invoke-interface {v12, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 282
    .line 283
    .line 284
    :goto_7
    move-object/from16 v13, v22

    .line 285
    .line 286
    goto :goto_9

    .line 287
    :cond_c
    invoke-static {}, Lnx6;->r()V

    .line 288
    .line 289
    .line 290
    throw v16

    .line 291
    :cond_d
    :goto_8
    move-object/from16 v12, v21

    .line 292
    .line 293
    goto :goto_7

    .line 294
    :cond_e
    move-object/from16 v25, v5

    .line 295
    .line 296
    move-object/from16 v19, v6

    .line 297
    .line 298
    move-object/from16 v18, v7

    .line 299
    .line 300
    move/from16 v20, v10

    .line 301
    .line 302
    move-object/from16 v21, v12

    .line 303
    .line 304
    move-object/from16 v22, v13

    .line 305
    .line 306
    move-wide/from16 v23, v14

    .line 307
    .line 308
    move-object/from16 v10, p5

    .line 309
    .line 310
    :goto_9
    shr-long v14, v23, v17

    .line 311
    .line 312
    add-int/lit8 v5, v20, 0x1

    .line 313
    .line 314
    move v10, v5

    .line 315
    move-object/from16 v7, v18

    .line 316
    .line 317
    move-object/from16 v6, v19

    .line 318
    .line 319
    move-object/from16 v5, v25

    .line 320
    .line 321
    goto/16 :goto_1

    .line 322
    .line 323
    :cond_f
    move-object/from16 v10, p5

    .line 324
    .line 325
    move-object/from16 v25, v5

    .line 326
    .line 327
    move-object/from16 v19, v6

    .line 328
    .line 329
    move-object/from16 v18, v7

    .line 330
    .line 331
    move-object/from16 v21, v12

    .line 332
    .line 333
    move-object/from16 v22, v13

    .line 334
    .line 335
    move/from16 v5, v17

    .line 336
    .line 337
    if-ne v9, v5, :cond_13

    .line 338
    .line 339
    goto :goto_a

    .line 340
    :cond_10
    move-object/from16 v10, p5

    .line 341
    .line 342
    move-object/from16 v25, v5

    .line 343
    .line 344
    move-object/from16 v19, v6

    .line 345
    .line 346
    move-object/from16 v18, v7

    .line 347
    .line 348
    :goto_a
    if-eq v11, v8, :cond_11

    .line 349
    .line 350
    add-int/lit8 v11, v11, 0x1

    .line 351
    .line 352
    move-object/from16 v7, v18

    .line 353
    .line 354
    move-object/from16 v6, v19

    .line 355
    .line 356
    move-object/from16 v5, v25

    .line 357
    .line 358
    goto/16 :goto_0

    .line 359
    .line 360
    :cond_11
    move-object v9, v12

    .line 361
    goto :goto_b

    .line 362
    :cond_12
    const/16 v16, 0x0

    .line 363
    .line 364
    move-object/from16 v9, v16

    .line 365
    .line 366
    move-object v13, v9

    .line 367
    :goto_b
    move-object v12, v9

    .line 368
    :cond_13
    if-eqz v12, :cond_14

    .line 369
    .line 370
    invoke-virtual {v0}, Lyp4;->v()V

    .line 371
    .line 372
    .line 373
    invoke-interface {v12}, Ljava/util/Collection;->size()I

    .line 374
    .line 375
    .line 376
    move-result v4

    .line 377
    const/4 v5, 0x0

    .line 378
    :goto_c
    if-ge v5, v4, :cond_14

    .line 379
    .line 380
    invoke-interface {v12, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 381
    .line 382
    .line 383
    move-result-object v6

    .line 384
    check-cast v6, Lyb5;

    .line 385
    .line 386
    iget-object v7, v6, Lyb5;->w:Ljava/lang/Object;

    .line 387
    .line 388
    check-cast v7, Ln37;

    .line 389
    .line 390
    iget-object v6, v6, Lyb5;->x:Ljava/lang/Object;

    .line 391
    .line 392
    check-cast v6, Lp37;

    .line 393
    .line 394
    iput-wide v1, v6, Lp37;->a:J

    .line 395
    .line 396
    sget-object v8, Lnx6;->c:Ljava/lang/Object;

    .line 397
    .line 398
    monitor-enter v8

    .line 399
    :try_start_0
    invoke-interface {v7}, Ln37;->getFirstStateRecord()Lp37;

    .line 400
    .line 401
    .line 402
    move-result-object v9

    .line 403
    iput-object v9, v6, Lp37;->b:Lp37;

    .line 404
    .line 405
    invoke-interface {v7, v6}, Ln37;->prependStateRecord(Lp37;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 406
    .line 407
    .line 408
    monitor-exit v8

    .line 409
    add-int/lit8 v5, v5, 0x1

    .line 410
    .line 411
    goto :goto_c

    .line 412
    :catchall_0
    move-exception v0

    .line 413
    monitor-exit v8

    .line 414
    throw v0

    .line 415
    :cond_14
    if-eqz v13, :cond_17

    .line 416
    .line 417
    invoke-interface {v13}, Ljava/util/Collection;->size()I

    .line 418
    .line 419
    .line 420
    move-result v1

    .line 421
    const/4 v10, 0x0

    .line 422
    :goto_d
    if-ge v10, v1, :cond_15

    .line 423
    .line 424
    invoke-interface {v13, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 425
    .line 426
    .line 427
    move-result-object v2

    .line 428
    check-cast v2, Ln37;

    .line 429
    .line 430
    invoke-virtual {v3, v2}, Lup4;->l(Ljava/lang/Object;)Z

    .line 431
    .line 432
    .line 433
    add-int/lit8 v10, v10, 0x1

    .line 434
    .line 435
    goto :goto_d

    .line 436
    :cond_15
    iget-object v1, v0, Lyp4;->i:Ljava/util/ArrayList;

    .line 437
    .line 438
    if-nez v1, :cond_16

    .line 439
    .line 440
    goto :goto_e

    .line 441
    :cond_16
    invoke-static {v1, v13}, Ldt0;->M0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 442
    .line 443
    .line 444
    move-result-object v13

    .line 445
    :goto_e
    iput-object v13, v0, Lyp4;->i:Ljava/util/ArrayList;

    .line 446
    .line 447
    :cond_17
    sget-object v0, Lkx6;->i:Lkx6;

    .line 448
    .line 449
    return-object v0
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
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
.end method
