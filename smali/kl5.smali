.class public final Lkl5;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lkl7;
.implements Lcw5;


# instance fields
.field public final a:Lg22;

.field public final b:Lu11;

.field public final c:Z

.field public final d:Las;

.field public volatile e:Z


# direct methods
.method public constructor <init>(Lg22;Lu11;Z)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lkl5;->a:Lg22;

    .line 8
    .line 9
    iput-object p2, p0, Lkl5;->b:Lu11;

    .line 10
    .line 11
    iput-boolean p3, p0, Lkl5;->c:Z

    .line 12
    .line 13
    new-instance p1, Las;

    .line 14
    .line 15
    invoke-direct {p1}, Las;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object p1, p0, Lkl5;->d:Las;

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
.method public final a(Ljl7;Lgs2;La97;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-boolean v0, p0, Lkl5;->e:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/16 v2, 0x15

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    iget-object v0, p3, Lh61;->x:Le81;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    iget-object v3, p0, Lkl5;->a:Lg22;

    .line 14
    .line 15
    invoke-interface {v0, v3}, Le81;->a0(Ld81;)Lc81;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Lg11;

    .line 20
    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    iget-object v0, v0, Lg11;->x:Lkl5;

    .line 24
    .line 25
    if-ne v0, p0, :cond_0

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2, p3}, Lkl5;->g(Ljl7;Lgs2;Lh61;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    return-object p0

    .line 32
    :cond_0
    const-string p0, "Attempted to use connection on a different coroutine"

    .line 33
    .line 34
    invoke-static {v2, p0}, Ll55;->w(ILjava/lang/String;)V

    .line 35
    .line 36
    .line 37
    throw v1

    .line 38
    :cond_1
    const-string p0, "Connection is recycled"

    .line 39
    .line 40
    invoke-static {v2, p0}, Ll55;->w(ILjava/lang/String;)V

    .line 41
    .line 42
    .line 43
    throw v1
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

.method public final b(Lf61;)Ljava/lang/Boolean;
    .locals 3

    .line 1
    iget-boolean v0, p0, Lkl5;->e:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/16 v2, 0x15

    .line 5
    .line 6
    if-nez v0, :cond_3

    .line 7
    .line 8
    check-cast p1, Lh61;

    .line 9
    .line 10
    iget-object p1, p1, Lh61;->x:Le81;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lkl5;->a:Lg22;

    .line 16
    .line 17
    invoke-interface {p1, v0}, Le81;->a0(Ld81;)Lc81;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    check-cast p1, Lg11;

    .line 22
    .line 23
    if-eqz p1, :cond_2

    .line 24
    .line 25
    iget-object p1, p1, Lg11;->x:Lkl5;

    .line 26
    .line 27
    if-ne p1, p0, :cond_2

    .line 28
    .line 29
    iget-object p1, p0, Lkl5;->d:Las;

    .line 30
    .line 31
    invoke-virtual {p1}, Las;->isEmpty()Z

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    if-eqz p1, :cond_1

    .line 36
    .line 37
    iget-object p0, p0, Lkl5;->b:Lu11;

    .line 38
    .line 39
    iget-object p0, p0, Lu11;->w:Lua6;

    .line 40
    .line 41
    invoke-interface {p0}, Lua6;->Z()Z

    .line 42
    .line 43
    .line 44
    move-result p0

    .line 45
    if-eqz p0, :cond_0

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    const/4 p0, 0x0

    .line 49
    goto :goto_1

    .line 50
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 51
    :goto_1
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    return-object p0

    .line 56
    :cond_2
    const-string p0, "Attempted to use connection on a different coroutine"

    .line 57
    .line 58
    invoke-static {v2, p0}, Ll55;->w(ILjava/lang/String;)V

    .line 59
    .line 60
    .line 61
    throw v1

    .line 62
    :cond_3
    const-string p0, "Connection is recycled"

    .line 63
    .line 64
    invoke-static {v2, p0}, Ll55;->w(ILjava/lang/String;)V

    .line 65
    .line 66
    .line 67
    throw v1
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

.method public final c()Lua6;
    .locals 0

    .line 1
    iget-object p0, p0, Lkl5;->b:Lu11;

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

.method public final d(Ljava/lang/String;Lvr2;Lh61;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p3, Ljl5;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Ljl5;

    .line 7
    .line 8
    iget v1, v0, Ljl5;->E:I

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
    iput v1, v0, Ljl5;->E:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Ljl5;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Ljl5;-><init>(Lkl5;Lh61;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Ljl5;->C:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lp81;->w:Lp81;

    .line 28
    .line 29
    iget v2, v0, Ljl5;->E:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    const/4 v4, 0x0

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    if-ne v2, v3, :cond_1

    .line 36
    .line 37
    iget-object p1, v0, Ljl5;->B:Lu11;

    .line 38
    .line 39
    iget-object p2, v0, Ljl5;->A:Lvr2;

    .line 40
    .line 41
    iget-object v0, v0, Ljl5;->z:Ljava/lang/String;

    .line 42
    .line 43
    invoke-static {p3}, Lo85;->q(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    move-object p3, p1

    .line 47
    move-object p1, v0

    .line 48
    goto :goto_1

    .line 49
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 50
    .line 51
    invoke-static {p0}, Lh;->s(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    return-object v4

    .line 55
    :cond_2
    invoke-static {p3}, Lo85;->q(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    iget-boolean p3, p0, Lkl5;->e:Z

    .line 59
    .line 60
    const/16 v2, 0x15

    .line 61
    .line 62
    if-nez p3, :cond_5

    .line 63
    .line 64
    iget-object p3, v0, Lh61;->x:Le81;

    .line 65
    .line 66
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    iget-object v5, p0, Lkl5;->a:Lg22;

    .line 70
    .line 71
    invoke-interface {p3, v5}, Le81;->a0(Ld81;)Lc81;

    .line 72
    .line 73
    .line 74
    move-result-object p3

    .line 75
    check-cast p3, Lg11;

    .line 76
    .line 77
    if-eqz p3, :cond_4

    .line 78
    .line 79
    iget-object p3, p3, Lg11;->x:Lkl5;

    .line 80
    .line 81
    if-ne p3, p0, :cond_4

    .line 82
    .line 83
    iget-object p3, p0, Lkl5;->b:Lu11;

    .line 84
    .line 85
    iput-object p1, v0, Ljl5;->z:Ljava/lang/String;

    .line 86
    .line 87
    iput-object p2, v0, Ljl5;->A:Lvr2;

    .line 88
    .line 89
    iput-object p3, v0, Ljl5;->B:Lu11;

    .line 90
    .line 91
    iput v3, v0, Ljl5;->E:I

    .line 92
    .line 93
    iget-object v2, p3, Lu11;->x:Loq4;

    .line 94
    .line 95
    invoke-interface {v2, v0}, Loq4;->a(Lf61;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    if-ne v0, v1, :cond_3

    .line 100
    .line 101
    return-object v1

    .line 102
    :cond_3
    :goto_1
    :try_start_0
    new-instance v0, Lel5;

    .line 103
    .line 104
    iget-object v1, p0, Lkl5;->b:Lu11;

    .line 105
    .line 106
    invoke-virtual {v1, p1}, Lu11;->k0(Ljava/lang/String;)Lab6;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    invoke-direct {v0, p0, p1}, Lel5;-><init>(Lkl5;Lab6;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 111
    .line 112
    .line 113
    :try_start_1
    invoke-interface {p2, v0}, Lvr2;->y(Ljava/lang/Object;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 117
    :try_start_2
    invoke-static {v0, v4}, Ldh4;->f(Lab6;Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 118
    .line 119
    .line 120
    invoke-interface {p3, v4}, Loq4;->k(Ljava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    return-object p0

    .line 124
    :catchall_0
    move-exception p0

    .line 125
    goto :goto_2

    .line 126
    :catchall_1
    move-exception p0

    .line 127
    :try_start_3
    throw p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 128
    :catchall_2
    move-exception p1

    .line 129
    :try_start_4
    invoke-static {v0, p0}, Ldh4;->f(Lab6;Ljava/lang/Throwable;)V

    .line 130
    .line 131
    .line 132
    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 133
    :goto_2
    invoke-interface {p3, v4}, Loq4;->k(Ljava/lang/Object;)V

    .line 134
    .line 135
    .line 136
    throw p0

    .line 137
    :cond_4
    const-string p0, "Attempted to use connection on a different coroutine"

    .line 138
    .line 139
    invoke-static {v2, p0}, Ll55;->w(ILjava/lang/String;)V

    .line 140
    .line 141
    .line 142
    throw v4

    .line 143
    :cond_5
    const-string p0, "Connection is recycled"

    .line 144
    .line 145
    invoke-static {v2, p0}, Ll55;->w(ILjava/lang/String;)V

    .line 146
    .line 147
    .line 148
    throw v4
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

.method public final e(Ljl7;Lh61;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-object v0, p0, Lkl5;->d:Las;

    .line 2
    .line 3
    const-string v1, "SAVEPOINT \'"

    .line 4
    .line 5
    instance-of v2, p2, Lgl5;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, p2

    .line 10
    check-cast v2, Lgl5;

    .line 11
    .line 12
    iget v3, v2, Lgl5;->D:I

    .line 13
    .line 14
    const/high16 v4, -0x80000000

    .line 15
    .line 16
    and-int v5, v3, v4

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    sub-int/2addr v3, v4

    .line 21
    iput v3, v2, Lgl5;->D:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, Lgl5;

    .line 25
    .line 26
    invoke-direct {v2, p0, p2}, Lgl5;-><init>(Lkl5;Lh61;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object p2, v2, Lgl5;->B:Ljava/lang/Object;

    .line 30
    .line 31
    iget v3, v2, Lgl5;->D:I

    .line 32
    .line 33
    const/4 v4, 0x1

    .line 34
    iget-object p0, p0, Lkl5;->b:Lu11;

    .line 35
    .line 36
    const/4 v5, 0x0

    .line 37
    if-eqz v3, :cond_2

    .line 38
    .line 39
    if-ne v3, v4, :cond_1

    .line 40
    .line 41
    iget-object p1, v2, Lgl5;->A:Lu11;

    .line 42
    .line 43
    iget-object v2, v2, Lgl5;->z:Ljl7;

    .line 44
    .line 45
    invoke-static {p2}, Lo85;->q(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    move-object p2, p1

    .line 49
    move-object p1, v2

    .line 50
    goto :goto_1

    .line 51
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 52
    .line 53
    invoke-static {p0}, Lh;->s(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    return-object v5

    .line 57
    :cond_2
    invoke-static {p2}, Lo85;->q(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    iput-object p1, v2, Lgl5;->z:Ljl7;

    .line 61
    .line 62
    iput-object p0, v2, Lgl5;->A:Lu11;

    .line 63
    .line 64
    iput v4, v2, Lgl5;->D:I

    .line 65
    .line 66
    iget-object p2, p0, Lu11;->x:Loq4;

    .line 67
    .line 68
    invoke-interface {p2, v2}, Loq4;->a(Lf61;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p2

    .line 72
    sget-object v2, Lp81;->w:Lp81;

    .line 73
    .line 74
    if-ne p2, v2, :cond_3

    .line 75
    .line 76
    return-object v2

    .line 77
    :cond_3
    move-object p2, p0

    .line 78
    :goto_1
    :try_start_0
    iget v2, v0, Las;->y:I

    .line 79
    .line 80
    invoke-virtual {v0}, Las;->isEmpty()Z

    .line 81
    .line 82
    .line 83
    move-result v3

    .line 84
    if-eqz v3, :cond_7

    .line 85
    .line 86
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 87
    .line 88
    .line 89
    move-result p1

    .line 90
    if-eqz p1, :cond_6

    .line 91
    .line 92
    if-eq p1, v4, :cond_5

    .line 93
    .line 94
    const/4 v1, 0x2

    .line 95
    if-ne p1, v1, :cond_4

    .line 96
    .line 97
    const-string p1, "BEGIN EXCLUSIVE TRANSACTION"

    .line 98
    .line 99
    invoke-static {p0, p1}, Ll55;->m(Lua6;Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    goto :goto_2

    .line 103
    :catchall_0
    move-exception p0

    .line 104
    goto :goto_3

    .line 105
    :cond_4
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    .line 106
    .line 107
    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    .line 108
    .line 109
    .line 110
    throw p0

    .line 111
    :cond_5
    const-string p1, "BEGIN IMMEDIATE TRANSACTION"

    .line 112
    .line 113
    invoke-static {p0, p1}, Ll55;->m(Lua6;Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    goto :goto_2

    .line 117
    :cond_6
    const-string p1, "BEGIN DEFERRED TRANSACTION"

    .line 118
    .line 119
    invoke-static {p0, p1}, Ll55;->m(Lua6;Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    goto :goto_2

    .line 123
    :cond_7
    new-instance p1, Ljava/lang/StringBuilder;

    .line 124
    .line 125
    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    const/16 v1, 0x27

    .line 132
    .line 133
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    invoke-static {p0, p1}, Ll55;->m(Lua6;Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    :goto_2
    new-instance p0, Lfl5;

    .line 144
    .line 145
    invoke-direct {p0, v2}, Lfl5;-><init>(I)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {v0, p0}, Las;->addLast(Ljava/lang/Object;)V

    .line 149
    .line 150
    .line 151
    sget-object p0, Lvs7;->a:Lvs7;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 152
    .line 153
    invoke-interface {p2, v5}, Loq4;->k(Ljava/lang/Object;)V

    .line 154
    .line 155
    .line 156
    return-object p0

    .line 157
    :goto_3
    invoke-interface {p2, v5}, Loq4;->k(Ljava/lang/Object;)V

    .line 158
    .line 159
    .line 160
    throw p0
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

.method public final f(ZLh61;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-object v0, p0, Lkl5;->d:Las;

    .line 2
    .line 3
    const-string v1, "ROLLBACK TRANSACTION TO SAVEPOINT \'"

    .line 4
    .line 5
    const-string v2, "RELEASE SAVEPOINT \'"

    .line 6
    .line 7
    instance-of v3, p2, Lhl5;

    .line 8
    .line 9
    if-eqz v3, :cond_0

    .line 10
    .line 11
    move-object v3, p2

    .line 12
    check-cast v3, Lhl5;

    .line 13
    .line 14
    iget v4, v3, Lhl5;->D:I

    .line 15
    .line 16
    const/high16 v5, -0x80000000

    .line 17
    .line 18
    and-int v6, v4, v5

    .line 19
    .line 20
    if-eqz v6, :cond_0

    .line 21
    .line 22
    sub-int/2addr v4, v5

    .line 23
    iput v4, v3, Lhl5;->D:I

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    new-instance v3, Lhl5;

    .line 27
    .line 28
    invoke-direct {v3, p0, p2}, Lhl5;-><init>(Lkl5;Lh61;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    iget-object p2, v3, Lhl5;->B:Ljava/lang/Object;

    .line 32
    .line 33
    iget v4, v3, Lhl5;->D:I

    .line 34
    .line 35
    const/4 v5, 0x1

    .line 36
    iget-object p0, p0, Lkl5;->b:Lu11;

    .line 37
    .line 38
    const/4 v6, 0x0

    .line 39
    if-eqz v4, :cond_2

    .line 40
    .line 41
    if-ne v4, v5, :cond_1

    .line 42
    .line 43
    iget-boolean p1, v3, Lhl5;->z:Z

    .line 44
    .line 45
    iget-object v3, v3, Lhl5;->A:Lu11;

    .line 46
    .line 47
    invoke-static {p2}, Lo85;->q(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 52
    .line 53
    invoke-static {p0}, Lh;->s(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    return-object v6

    .line 57
    :cond_2
    invoke-static {p2}, Lo85;->q(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    iput-object p0, v3, Lhl5;->A:Lu11;

    .line 61
    .line 62
    iput-boolean p1, v3, Lhl5;->z:Z

    .line 63
    .line 64
    iput v5, v3, Lhl5;->D:I

    .line 65
    .line 66
    iget-object p2, p0, Lu11;->x:Loq4;

    .line 67
    .line 68
    invoke-interface {p2, v3}, Loq4;->a(Lf61;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p2

    .line 72
    sget-object v3, Lp81;->w:Lp81;

    .line 73
    .line 74
    if-ne p2, v3, :cond_3

    .line 75
    .line 76
    return-object v3

    .line 77
    :cond_3
    move-object v3, p0

    .line 78
    :goto_1
    :try_start_0
    invoke-virtual {v0}, Las;->isEmpty()Z

    .line 79
    .line 80
    .line 81
    move-result p2

    .line 82
    if-nez p2, :cond_7

    .line 83
    .line 84
    invoke-static {v0}, Lit0;->k0(Ljava/util/List;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object p2

    .line 88
    check-cast p2, Lfl5;

    .line 89
    .line 90
    const/16 v4, 0x27

    .line 91
    .line 92
    if-eqz p1, :cond_5

    .line 93
    .line 94
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v0}, Las;->isEmpty()Z

    .line 98
    .line 99
    .line 100
    move-result p1

    .line 101
    if-eqz p1, :cond_4

    .line 102
    .line 103
    const-string p1, "END TRANSACTION"

    .line 104
    .line 105
    invoke-static {p0, p1}, Ll55;->m(Lua6;Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    goto :goto_2

    .line 109
    :catchall_0
    move-exception p0

    .line 110
    goto :goto_3

    .line 111
    :cond_4
    new-instance p1, Ljava/lang/StringBuilder;

    .line 112
    .line 113
    invoke-direct {p1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    iget p2, p2, Lfl5;->a:I

    .line 117
    .line 118
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    invoke-static {p0, p1}, Ll55;->m(Lua6;Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    goto :goto_2

    .line 132
    :cond_5
    invoke-virtual {v0}, Las;->isEmpty()Z

    .line 133
    .line 134
    .line 135
    move-result p1

    .line 136
    if-eqz p1, :cond_6

    .line 137
    .line 138
    const-string p1, "ROLLBACK TRANSACTION"

    .line 139
    .line 140
    invoke-static {p0, p1}, Ll55;->m(Lua6;Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    goto :goto_2

    .line 144
    :cond_6
    new-instance p1, Ljava/lang/StringBuilder;

    .line 145
    .line 146
    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    iget p2, p2, Lfl5;->a:I

    .line 150
    .line 151
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 152
    .line 153
    .line 154
    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object p1

    .line 161
    invoke-static {p0, p1}, Ll55;->m(Lua6;Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    :goto_2
    sget-object p0, Lvs7;->a:Lvs7;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 165
    .line 166
    invoke-interface {v3, v6}, Loq4;->k(Ljava/lang/Object;)V

    .line 167
    .line 168
    .line 169
    return-object p0

    .line 170
    :cond_7
    :try_start_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 171
    .line 172
    const-string p1, "Not in a transaction"

    .line 173
    .line 174
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    throw p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 178
    :goto_3
    invoke-interface {v3, v6}, Loq4;->k(Ljava/lang/Object;)V

    .line 179
    .line 180
    .line 181
    throw p0
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

.method public final g(Ljl7;Lgs2;Lh61;)Ljava/lang/Object;
    .locals 10

    .line 1
    instance-of v0, p3, Lil5;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lil5;

    .line 7
    .line 8
    iget v1, v0, Lil5;->E:I

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
    iput v1, v0, Lil5;->E:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lil5;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Lil5;-><init>(Lkl5;Lh61;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Lil5;->C:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lil5;->E:I

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    const/4 v3, 0x0

    .line 31
    const/4 v4, 0x5

    .line 32
    const/4 v5, 0x3

    .line 33
    const/4 v6, 0x2

    .line 34
    const/4 v7, 0x1

    .line 35
    sget-object v8, Lp81;->w:Lp81;

    .line 36
    .line 37
    if-eqz v1, :cond_5

    .line 38
    .line 39
    if-eq v1, v7, :cond_4

    .line 40
    .line 41
    if-eq v1, v6, :cond_3

    .line 42
    .line 43
    if-eq v1, v5, :cond_2

    .line 44
    .line 45
    const/4 p0, 0x4

    .line 46
    if-eq v1, p0, :cond_2

    .line 47
    .line 48
    if-eq v1, v4, :cond_1

    .line 49
    .line 50
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 51
    .line 52
    invoke-static {p0}, Lh;->s(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    return-object v2

    .line 56
    :cond_1
    iget-object p0, v0, Lil5;->A:Ljava/lang/Throwable;

    .line 57
    .line 58
    iget-object p1, v0, Lil5;->z:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast p1, Ljava/lang/Throwable;

    .line 61
    .line 62
    :try_start_0
    invoke-static {p3}, Lo85;->q(Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0

    .line 63
    .line 64
    .line 65
    goto/16 :goto_6

    .line 66
    .line 67
    :catch_0
    move-exception p2

    .line 68
    goto/16 :goto_5

    .line 69
    .line 70
    :cond_2
    iget-object p0, v0, Lil5;->z:Ljava/lang/Object;

    .line 71
    .line 72
    invoke-static {p3}, Lo85;->q(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    return-object p0

    .line 76
    :cond_3
    iget p1, v0, Lil5;->B:I

    .line 77
    .line 78
    :try_start_1
    invoke-static {p3}, Lo85;->q(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 79
    .line 80
    .line 81
    goto :goto_2

    .line 82
    :catchall_0
    move-exception p1

    .line 83
    goto :goto_3

    .line 84
    :cond_4
    iget-object p1, v0, Lil5;->z:Ljava/lang/Object;

    .line 85
    .line 86
    move-object p2, p1

    .line 87
    check-cast p2, Lgs2;

    .line 88
    .line 89
    invoke-static {p3}, Lo85;->q(Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_5
    invoke-static {p3}, Lo85;->q(Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    if-nez p1, :cond_6

    .line 97
    .line 98
    sget-object p1, Ljl7;->w:Ljl7;

    .line 99
    .line 100
    :cond_6
    iput-object p2, v0, Lil5;->z:Ljava/lang/Object;

    .line 101
    .line 102
    iput v7, v0, Lil5;->E:I

    .line 103
    .line 104
    invoke-virtual {p0, p1, v0}, Lkl5;->e(Ljl7;Lh61;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    if-ne p1, v8, :cond_7

    .line 109
    .line 110
    goto :goto_4

    .line 111
    :cond_7
    :goto_1
    :try_start_2
    new-instance p1, Lrd5;

    .line 112
    .line 113
    invoke-direct {p1, v7, p0}, Lrd5;-><init>(ILjava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    iput-object v2, v0, Lil5;->z:Ljava/lang/Object;

    .line 117
    .line 118
    iput v7, v0, Lil5;->B:I

    .line 119
    .line 120
    iput v6, v0, Lil5;->E:I

    .line 121
    .line 122
    invoke-interface {p2, p1, v0}, Lgs2;->H(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object p3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 126
    if-ne p3, v8, :cond_8

    .line 127
    .line 128
    goto :goto_4

    .line 129
    :cond_8
    move p1, v7

    .line 130
    :goto_2
    if-eqz p1, :cond_9

    .line 131
    .line 132
    move v3, v7

    .line 133
    :cond_9
    iput-object p3, v0, Lil5;->z:Ljava/lang/Object;

    .line 134
    .line 135
    iput v5, v0, Lil5;->E:I

    .line 136
    .line 137
    invoke-virtual {p0, v3, v0}, Lkl5;->f(ZLh61;)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object p0

    .line 141
    if-ne p0, v8, :cond_a

    .line 142
    .line 143
    goto :goto_4

    .line 144
    :cond_a
    return-object p3

    .line 145
    :goto_3
    :try_start_3
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 146
    :catchall_1
    move-exception p2

    .line 147
    :try_start_4
    iput-object p1, v0, Lil5;->z:Ljava/lang/Object;

    .line 148
    .line 149
    iput-object p2, v0, Lil5;->A:Ljava/lang/Throwable;

    .line 150
    .line 151
    iput v4, v0, Lil5;->E:I

    .line 152
    .line 153
    invoke-virtual {p0, v3, v0}, Lkl5;->f(ZLh61;)Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object p0
    :try_end_4
    .catch Landroid/database/SQLException; {:try_start_4 .. :try_end_4} :catch_1

    .line 157
    if-ne p0, v8, :cond_b

    .line 158
    .line 159
    :goto_4
    return-object v8

    .line 160
    :cond_b
    move-object p0, p2

    .line 161
    goto :goto_6

    .line 162
    :catch_1
    move-exception p0

    .line 163
    move-object v9, p2

    .line 164
    move-object p2, p0

    .line 165
    move-object p0, v9

    .line 166
    :goto_5
    if-eqz p1, :cond_c

    .line 167
    .line 168
    invoke-static {p1, p2}, Lsu0;->b(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 169
    .line 170
    .line 171
    :goto_6
    throw p0

    .line 172
    :cond_c
    throw p2
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
