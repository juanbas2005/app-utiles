.class public final Lnn0;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lfi2;


# instance fields
.field public final synthetic A:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lh06;Lfi2;[Ljava/lang/String;[I)V
    .locals 1

    .line 1
    const/4 v0, 0x5

    .line 2
    iput v0, p0, Lnn0;->w:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lnn0;->x:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, Lnn0;->A:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p3, p0, Lnn0;->y:Ljava/lang/Object;

    .line 12
    .line 13
    iput-object p4, p0, Lnn0;->z:Ljava/lang/Object;

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

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 16
    iput p5, p0, Lnn0;->w:I

    iput-object p1, p0, Lnn0;->x:Ljava/lang/Object;

    iput-object p2, p0, Lnn0;->y:Ljava/lang/Object;

    iput-object p3, p0, Lnn0;->z:Ljava/lang/Object;

    iput-object p4, p0, Lnn0;->A:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ldf3;Lf61;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-object v0, p0, Lnn0;->A:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lji8;

    .line 4
    .line 5
    iget-object v1, p0, Lnn0;->z:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lji8;

    .line 8
    .line 9
    iget-object v2, p0, Lnn0;->x:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, Lji8;

    .line 12
    .line 13
    iget-object v3, p0, Lnn0;->y:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v3, Lcq4;

    .line 16
    .line 17
    instance-of v4, p2, Lbq4;

    .line 18
    .line 19
    if-eqz v4, :cond_0

    .line 20
    .line 21
    move-object v4, p2

    .line 22
    check-cast v4, Lbq4;

    .line 23
    .line 24
    iget v5, v4, Lbq4;->E:I

    .line 25
    .line 26
    const/high16 v6, -0x80000000

    .line 27
    .line 28
    and-int v7, v5, v6

    .line 29
    .line 30
    if-eqz v7, :cond_0

    .line 31
    .line 32
    sub-int/2addr v5, v6

    .line 33
    iput v5, v4, Lbq4;->E:I

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    new-instance v4, Lbq4;

    .line 37
    .line 38
    invoke-direct {v4, p0, p2}, Lbq4;-><init>(Lnn0;Lf61;)V

    .line 39
    .line 40
    .line 41
    :goto_0
    iget-object p0, v4, Lbq4;->C:Ljava/lang/Object;

    .line 42
    .line 43
    iget p2, v4, Lbq4;->E:I

    .line 44
    .line 45
    sget-object v5, Lvs7;->a:Lvs7;

    .line 46
    .line 47
    const/4 v6, 0x1

    .line 48
    if-eqz p2, :cond_2

    .line 49
    .line 50
    if-ne p2, v6, :cond_1

    .line 51
    .line 52
    iget-object p1, v4, Lbq4;->B:Ljava/util/Iterator;

    .line 53
    .line 54
    iget-object p2, v4, Lbq4;->A:Lcq4;

    .line 55
    .line 56
    iget-object v0, v4, Lbq4;->z:Ldf3;

    .line 57
    .line 58
    invoke-static {p0}, Lo85;->q(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    move-object v3, p2

    .line 62
    move-object p0, v0

    .line 63
    goto/16 :goto_5

    .line 64
    .line 65
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 66
    .line 67
    invoke-static {p0}, Lh;->s(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    const/4 p0, 0x0

    .line 71
    return-object p0

    .line 72
    :cond_2
    invoke-static {p0}, Lo85;->q(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    instance-of p0, p1, Leo5;

    .line 76
    .line 77
    if-eqz p0, :cond_3

    .line 78
    .line 79
    invoke-virtual {v2, p1}, Lji8;->n(Ldf3;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v3, v6}, Lcq4;->c(Z)V

    .line 83
    .line 84
    .line 85
    return-object v5

    .line 86
    :cond_3
    instance-of p0, p1, Lfo5;

    .line 87
    .line 88
    const/4 p2, 0x0

    .line 89
    if-eqz p0, :cond_5

    .line 90
    .line 91
    check-cast p1, Lfo5;

    .line 92
    .line 93
    iget-object p0, p1, Lfo5;->a:Leo5;

    .line 94
    .line 95
    invoke-virtual {v2, p0}, Lji8;->B(Ldf3;)V

    .line 96
    .line 97
    .line 98
    iget-object p0, v2, Lji8;->x:Ljava/lang/Object;

    .line 99
    .line 100
    if-eqz p0, :cond_4

    .line 101
    .line 102
    goto :goto_1

    .line 103
    :cond_4
    move v6, p2

    .line 104
    :goto_1
    invoke-virtual {v3, v6}, Lcq4;->c(Z)V

    .line 105
    .line 106
    .line 107
    return-object v5

    .line 108
    :cond_5
    instance-of p0, p1, Ldo5;

    .line 109
    .line 110
    if-eqz p0, :cond_7

    .line 111
    .line 112
    check-cast p1, Ldo5;

    .line 113
    .line 114
    iget-object p0, p1, Ldo5;->a:Leo5;

    .line 115
    .line 116
    invoke-virtual {v2, p0}, Lji8;->B(Ldf3;)V

    .line 117
    .line 118
    .line 119
    iget-object p0, v2, Lji8;->x:Ljava/lang/Object;

    .line 120
    .line 121
    if-eqz p0, :cond_6

    .line 122
    .line 123
    goto :goto_2

    .line 124
    :cond_6
    move v6, p2

    .line 125
    :goto_2
    invoke-virtual {v3, v6}, Lcq4;->c(Z)V

    .line 126
    .line 127
    .line 128
    return-object v5

    .line 129
    :cond_7
    instance-of p0, p1, Lr23;

    .line 130
    .line 131
    if-eqz p0, :cond_8

    .line 132
    .line 133
    invoke-virtual {v1, p1}, Lji8;->n(Ldf3;)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v3, v6}, Lcq4;->b(Z)V

    .line 137
    .line 138
    .line 139
    return-object v5

    .line 140
    :cond_8
    instance-of p0, p1, Ls23;

    .line 141
    .line 142
    if-eqz p0, :cond_a

    .line 143
    .line 144
    check-cast p1, Ls23;

    .line 145
    .line 146
    iget-object p0, p1, Ls23;->a:Lr23;

    .line 147
    .line 148
    invoke-virtual {v1, p0}, Lji8;->B(Ldf3;)V

    .line 149
    .line 150
    .line 151
    iget-object p0, v1, Lji8;->x:Ljava/lang/Object;

    .line 152
    .line 153
    if-eqz p0, :cond_9

    .line 154
    .line 155
    goto :goto_3

    .line 156
    :cond_9
    move v6, p2

    .line 157
    :goto_3
    invoke-virtual {v3, v6}, Lcq4;->b(Z)V

    .line 158
    .line 159
    .line 160
    return-object v5

    .line 161
    :cond_a
    instance-of p0, p1, Ldk2;

    .line 162
    .line 163
    if-eqz p0, :cond_b

    .line 164
    .line 165
    invoke-virtual {v0, p1}, Lji8;->n(Ldf3;)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {v3, v6}, Lcq4;->a(Z)V

    .line 169
    .line 170
    .line 171
    return-object v5

    .line 172
    :cond_b
    instance-of p0, p1, Lek2;

    .line 173
    .line 174
    if-eqz p0, :cond_d

    .line 175
    .line 176
    check-cast p1, Lek2;

    .line 177
    .line 178
    iget-object p0, p1, Lek2;->a:Ldk2;

    .line 179
    .line 180
    invoke-virtual {v0, p0}, Lji8;->B(Ldf3;)V

    .line 181
    .line 182
    .line 183
    iget-object p0, v0, Lji8;->x:Ljava/lang/Object;

    .line 184
    .line 185
    if-eqz p0, :cond_c

    .line 186
    .line 187
    goto :goto_4

    .line 188
    :cond_c
    move v6, p2

    .line 189
    :goto_4
    invoke-virtual {v3, v6}, Lcq4;->a(Z)V

    .line 190
    .line 191
    .line 192
    return-object v5

    .line 193
    :cond_d
    iget-object p0, v3, Lcq4;->b:Lay6;

    .line 194
    .line 195
    iget-object p0, p0, Lay6;->x:Lox6;

    .line 196
    .line 197
    invoke-virtual {p0}, Lox6;->iterator()Ljava/util/Iterator;

    .line 198
    .line 199
    .line 200
    move-result-object p0

    .line 201
    move-object v8, p1

    .line 202
    move-object p1, p0

    .line 203
    move-object p0, v8

    .line 204
    :cond_e
    :goto_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 205
    .line 206
    .line 207
    move-result p2

    .line 208
    if-eqz p2, :cond_f

    .line 209
    .line 210
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object p2

    .line 214
    check-cast p2, Ljava/util/Map$Entry;

    .line 215
    .line 216
    invoke-interface {p2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-result-object p2

    .line 220
    check-cast p2, Lb67;

    .line 221
    .line 222
    iput-object p0, v4, Lbq4;->z:Ldf3;

    .line 223
    .line 224
    iput-object v3, v4, Lbq4;->A:Lcq4;

    .line 225
    .line 226
    iput-object p1, v4, Lbq4;->B:Ljava/util/Iterator;

    .line 227
    .line 228
    iput v6, v4, Lbq4;->E:I

    .line 229
    .line 230
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 231
    .line 232
    .line 233
    sget-object p2, Lp81;->w:Lp81;

    .line 234
    .line 235
    if-ne v5, p2, :cond_e

    .line 236
    .line 237
    return-object p2

    .line 238
    :cond_f
    return-object v5
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

.method public b([ILf61;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget-object v0, p0, Lnn0;->y:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, [Ljava/lang/String;

    .line 4
    .line 5
    iget-object v1, p0, Lnn0;->A:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lfi2;

    .line 8
    .line 9
    iget-object v2, p0, Lnn0;->x:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, Lh06;

    .line 12
    .line 13
    instance-of v3, p2, Lwn7;

    .line 14
    .line 15
    if-eqz v3, :cond_0

    .line 16
    .line 17
    move-object v3, p2

    .line 18
    check-cast v3, Lwn7;

    .line 19
    .line 20
    iget v4, v3, Lwn7;->C:I

    .line 21
    .line 22
    const/high16 v5, -0x80000000

    .line 23
    .line 24
    and-int v6, v4, v5

    .line 25
    .line 26
    if-eqz v6, :cond_0

    .line 27
    .line 28
    sub-int/2addr v4, v5

    .line 29
    iput v4, v3, Lwn7;->C:I

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    new-instance v3, Lwn7;

    .line 33
    .line 34
    invoke-direct {v3, p0, p2}, Lwn7;-><init>(Lnn0;Lf61;)V

    .line 35
    .line 36
    .line 37
    :goto_0
    iget-object p2, v3, Lwn7;->A:Ljava/lang/Object;

    .line 38
    .line 39
    iget v4, v3, Lwn7;->C:I

    .line 40
    .line 41
    const/4 v5, 0x0

    .line 42
    const/4 v6, 0x2

    .line 43
    const/4 v7, 0x1

    .line 44
    if-eqz v4, :cond_3

    .line 45
    .line 46
    if-eq v4, v7, :cond_2

    .line 47
    .line 48
    if-ne v4, v6, :cond_1

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
    return-object v5

    .line 57
    :cond_2
    :goto_1
    iget-object p1, v3, Lwn7;->z:[I

    .line 58
    .line 59
    invoke-static {p2}, Lo85;->q(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    goto :goto_4

    .line 63
    :cond_3
    invoke-static {p2}, Lo85;->q(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    iget-object p2, v2, Lh06;->w:Ljava/lang/Object;

    .line 67
    .line 68
    sget-object v4, Lp81;->w:Lp81;

    .line 69
    .line 70
    if-nez p2, :cond_4

    .line 71
    .line 72
    invoke-static {v0}, Lqs;->r1([Ljava/lang/Object;)Ljava/util/Set;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    iput-object p1, v3, Lwn7;->z:[I

    .line 77
    .line 78
    iput v7, v3, Lwn7;->C:I

    .line 79
    .line 80
    invoke-interface {v1, p0, v3}, Lfi2;->k(Ljava/lang/Object;Lf61;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    if-ne p0, v4, :cond_8

    .line 85
    .line 86
    goto :goto_3

    .line 87
    :cond_4
    iget-object p0, p0, Lnn0;->z:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast p0, [I

    .line 90
    .line 91
    new-instance p2, Ljava/util/ArrayList;

    .line 92
    .line 93
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 94
    .line 95
    .line 96
    array-length v7, v0

    .line 97
    const/4 v8, 0x0

    .line 98
    move v9, v8

    .line 99
    :goto_2
    if-ge v8, v7, :cond_7

    .line 100
    .line 101
    aget-object v10, v0, v8

    .line 102
    .line 103
    add-int/lit8 v11, v9, 0x1

    .line 104
    .line 105
    iget-object v12, v2, Lh06;->w:Ljava/lang/Object;

    .line 106
    .line 107
    if-eqz v12, :cond_6

    .line 108
    .line 109
    check-cast v12, [I

    .line 110
    .line 111
    aget v9, p0, v9

    .line 112
    .line 113
    aget v12, v12, v9

    .line 114
    .line 115
    aget v9, p1, v9

    .line 116
    .line 117
    if-eq v12, v9, :cond_5

    .line 118
    .line 119
    invoke-virtual {p2, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    :cond_5
    add-int/lit8 v8, v8, 0x1

    .line 123
    .line 124
    move v9, v11

    .line 125
    goto :goto_2

    .line 126
    :cond_6
    const-string p0, "Required value was null."

    .line 127
    .line 128
    invoke-static {p0}, Lh;->s(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    return-object v5

    .line 132
    :cond_7
    invoke-virtual {p2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 133
    .line 134
    .line 135
    move-result p0

    .line 136
    if-nez p0, :cond_8

    .line 137
    .line 138
    invoke-static {p2}, Ldt0;->g1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 139
    .line 140
    .line 141
    move-result-object p0

    .line 142
    iput-object p1, v3, Lwn7;->z:[I

    .line 143
    .line 144
    iput v6, v3, Lwn7;->C:I

    .line 145
    .line 146
    invoke-interface {v1, p0, v3}, Lfi2;->k(Ljava/lang/Object;Lf61;)Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object p0

    .line 150
    if-ne p0, v4, :cond_8

    .line 151
    .line 152
    :goto_3
    return-object v4

    .line 153
    :cond_8
    :goto_4
    iput-object p1, v2, Lh06;->w:Ljava/lang/Object;

    .line 154
    .line 155
    sget-object p0, Lvs7;->a:Lvs7;

    .line 156
    .line 157
    return-object p0
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

.method public final k(Ljava/lang/Object;Lf61;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget v0, p0, Lnn0;->w:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    sget-object v2, Lvs7;->a:Lvs7;

    .line 5
    .line 6
    iget-object v3, p0, Lnn0;->A:Ljava/lang/Object;

    .line 7
    .line 8
    iget-object v4, p0, Lnn0;->x:Ljava/lang/Object;

    .line 9
    .line 10
    iget-object v5, p0, Lnn0;->y:Ljava/lang/Object;

    .line 11
    .line 12
    iget-object v6, p0, Lnn0;->z:Ljava/lang/Object;

    .line 13
    .line 14
    packed-switch v0, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    check-cast p1, [I

    .line 18
    .line 19
    invoke-virtual {p0, p1, p2}, Lnn0;->b([ILf61;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0

    .line 24
    :pswitch_0
    check-cast p1, Ldf3;

    .line 25
    .line 26
    invoke-virtual {p0, p1, p2}, Lnn0;->a(Ldf3;Lf61;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0

    .line 31
    :pswitch_1
    check-cast p1, Ldf3;

    .line 32
    .line 33
    check-cast v6, Lf06;

    .line 34
    .line 35
    check-cast v5, Lf06;

    .line 36
    .line 37
    check-cast v4, Lf06;

    .line 38
    .line 39
    instance-of p0, p1, Leo5;

    .line 40
    .line 41
    if-eqz p0, :cond_0

    .line 42
    .line 43
    iget p0, v4, Lf06;->w:I

    .line 44
    .line 45
    add-int/2addr p0, v1

    .line 46
    iput p0, v4, Lf06;->w:I

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_0
    instance-of p0, p1, Lfo5;

    .line 50
    .line 51
    if-eqz p0, :cond_1

    .line 52
    .line 53
    iget p0, v4, Lf06;->w:I

    .line 54
    .line 55
    add-int/lit8 p0, p0, -0x1

    .line 56
    .line 57
    iput p0, v4, Lf06;->w:I

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_1
    instance-of p0, p1, Ldo5;

    .line 61
    .line 62
    if-eqz p0, :cond_2

    .line 63
    .line 64
    iget p0, v4, Lf06;->w:I

    .line 65
    .line 66
    add-int/lit8 p0, p0, -0x1

    .line 67
    .line 68
    iput p0, v4, Lf06;->w:I

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_2
    instance-of p0, p1, Lr23;

    .line 72
    .line 73
    if-eqz p0, :cond_3

    .line 74
    .line 75
    iget p0, v5, Lf06;->w:I

    .line 76
    .line 77
    add-int/2addr p0, v1

    .line 78
    iput p0, v5, Lf06;->w:I

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_3
    instance-of p0, p1, Ls23;

    .line 82
    .line 83
    if-eqz p0, :cond_4

    .line 84
    .line 85
    iget p0, v5, Lf06;->w:I

    .line 86
    .line 87
    add-int/lit8 p0, p0, -0x1

    .line 88
    .line 89
    iput p0, v5, Lf06;->w:I

    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_4
    instance-of p0, p1, Ldk2;

    .line 93
    .line 94
    if-eqz p0, :cond_5

    .line 95
    .line 96
    iget p0, v6, Lf06;->w:I

    .line 97
    .line 98
    add-int/2addr p0, v1

    .line 99
    iput p0, v6, Lf06;->w:I

    .line 100
    .line 101
    goto :goto_0

    .line 102
    :cond_5
    instance-of p0, p1, Lek2;

    .line 103
    .line 104
    if-eqz p0, :cond_6

    .line 105
    .line 106
    iget p0, v6, Lf06;->w:I

    .line 107
    .line 108
    add-int/lit8 p0, p0, -0x1

    .line 109
    .line 110
    iput p0, v6, Lf06;->w:I

    .line 111
    .line 112
    :cond_6
    :goto_0
    iget p0, v4, Lf06;->w:I

    .line 113
    .line 114
    const/4 p1, 0x0

    .line 115
    if-lez p0, :cond_7

    .line 116
    .line 117
    move p0, v1

    .line 118
    goto :goto_1

    .line 119
    :cond_7
    move p0, p1

    .line 120
    :goto_1
    iget p2, v5, Lf06;->w:I

    .line 121
    .line 122
    if-lez p2, :cond_8

    .line 123
    .line 124
    move p2, v1

    .line 125
    goto :goto_2

    .line 126
    :cond_8
    move p2, p1

    .line 127
    :goto_2
    iget v0, v6, Lf06;->w:I

    .line 128
    .line 129
    if-lez v0, :cond_9

    .line 130
    .line 131
    move v0, v1

    .line 132
    goto :goto_3

    .line 133
    :cond_9
    move v0, p1

    .line 134
    :goto_3
    check-cast v3, Lil1;

    .line 135
    .line 136
    iget-boolean v4, v3, Lil1;->L:Z

    .line 137
    .line 138
    if-eq v4, p0, :cond_a

    .line 139
    .line 140
    iput-boolean p0, v3, Lil1;->L:Z

    .line 141
    .line 142
    move p1, v1

    .line 143
    :cond_a
    iget-boolean p0, v3, Lil1;->M:Z

    .line 144
    .line 145
    if-eq p0, p2, :cond_b

    .line 146
    .line 147
    iput-boolean p2, v3, Lil1;->M:Z

    .line 148
    .line 149
    move p1, v1

    .line 150
    :cond_b
    iget-boolean p0, v3, Lil1;->N:Z

    .line 151
    .line 152
    if-eq p0, v0, :cond_c

    .line 153
    .line 154
    iput-boolean v0, v3, Lil1;->N:Z

    .line 155
    .line 156
    goto :goto_4

    .line 157
    :cond_c
    move v1, p1

    .line 158
    :goto_4
    if-eqz v1, :cond_d

    .line 159
    .line 160
    invoke-static {v3}, Lrc9;->e0(Lgz1;)V

    .line 161
    .line 162
    .line 163
    :cond_d
    return-object v2

    .line 164
    :pswitch_2
    check-cast p1, Ljava/lang/Number;

    .line 165
    .line 166
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 167
    .line 168
    .line 169
    check-cast v4, Ls34;

    .line 170
    .line 171
    invoke-virtual {v4}, Ls34;->h()I

    .line 172
    .line 173
    .line 174
    move-result p0

    .line 175
    div-int/lit8 p0, p0, 0xc

    .line 176
    .line 177
    invoke-virtual {v4}, Ls34;->h()I

    .line 178
    .line 179
    .line 180
    move-result p1

    .line 181
    rem-int/lit8 p1, p1, 0xc

    .line 182
    .line 183
    add-int/2addr p1, v1

    .line 184
    check-cast v5, Lvr2;

    .line 185
    .line 186
    check-cast v6, Lvh0;

    .line 187
    .line 188
    check-cast v3, Lre3;

    .line 189
    .line 190
    iget p2, v3, Lpe3;->w:I

    .line 191
    .line 192
    add-int/2addr p2, p0

    .line 193
    invoke-virtual {v6, p2, p1}, Lvh0;->e(II)Lyh0;

    .line 194
    .line 195
    .line 196
    move-result-object p0

    .line 197
    iget-wide p0, p0, Lyh0;->e:J

    .line 198
    .line 199
    new-instance p2, Ljava/lang/Long;

    .line 200
    .line 201
    invoke-direct {p2, p0, p1}, Ljava/lang/Long;-><init>(J)V

    .line 202
    .line 203
    .line 204
    invoke-interface {v5, p2}, Lvr2;->y(Ljava/lang/Object;)Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    return-object v2

    .line 208
    :pswitch_3
    check-cast p1, Ljava/lang/Boolean;

    .line 209
    .line 210
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 211
    .line 212
    .line 213
    move-result p0

    .line 214
    check-cast v6, Lze7;

    .line 215
    .line 216
    check-cast v4, Lu44;

    .line 217
    .line 218
    if-eqz p0, :cond_e

    .line 219
    .line 220
    invoke-virtual {v4}, Lu44;->b()Z

    .line 221
    .line 222
    .line 223
    move-result p0

    .line 224
    if-eqz p0, :cond_e

    .line 225
    .line 226
    check-cast v5, Lrf7;

    .line 227
    .line 228
    invoke-virtual {v6}, Lze7;->n()Lhf7;

    .line 229
    .line 230
    .line 231
    move-result-object p0

    .line 232
    check-cast v3, Lc93;

    .line 233
    .line 234
    iget-object p1, v6, Lze7;->b:Lv35;

    .line 235
    .line 236
    invoke-static {v5, v4, p0, v3, p1}, Lpv8;->N(Lrf7;Lu44;Lhf7;Lc93;Lv35;)V

    .line 237
    .line 238
    .line 239
    goto :goto_5

    .line 240
    :cond_e
    invoke-static {v4}, Lpv8;->C(Lu44;)V

    .line 241
    .line 242
    .line 243
    :goto_5
    return-object v2

    .line 244
    :pswitch_4
    check-cast v4, Lh06;

    .line 245
    .line 246
    instance-of v0, p2, Lmn0;

    .line 247
    .line 248
    if-eqz v0, :cond_f

    .line 249
    .line 250
    move-object v0, p2

    .line 251
    check-cast v0, Lmn0;

    .line 252
    .line 253
    iget v7, v0, Lmn0;->C:I

    .line 254
    .line 255
    const/high16 v8, -0x80000000

    .line 256
    .line 257
    and-int v9, v7, v8

    .line 258
    .line 259
    if-eqz v9, :cond_f

    .line 260
    .line 261
    sub-int/2addr v7, v8

    .line 262
    iput v7, v0, Lmn0;->C:I

    .line 263
    .line 264
    goto :goto_6

    .line 265
    :cond_f
    new-instance v0, Lmn0;

    .line 266
    .line 267
    invoke-direct {v0, p0, p2}, Lmn0;-><init>(Lnn0;Lf61;)V

    .line 268
    .line 269
    .line 270
    :goto_6
    iget-object p0, v0, Lmn0;->A:Ljava/lang/Object;

    .line 271
    .line 272
    iget p2, v0, Lmn0;->C:I

    .line 273
    .line 274
    const/4 v7, 0x0

    .line 275
    if-eqz p2, :cond_11

    .line 276
    .line 277
    if-ne p2, v1, :cond_10

    .line 278
    .line 279
    iget-object p1, v0, Lmn0;->z:Ljava/lang/Object;

    .line 280
    .line 281
    invoke-static {p0}, Lo85;->q(Ljava/lang/Object;)V

    .line 282
    .line 283
    .line 284
    goto :goto_7

    .line 285
    :cond_10
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 286
    .line 287
    invoke-static {p0}, Lh;->s(Ljava/lang/String;)V

    .line 288
    .line 289
    .line 290
    move-object v2, v7

    .line 291
    goto :goto_8

    .line 292
    :cond_11
    invoke-static {p0}, Lo85;->q(Ljava/lang/Object;)V

    .line 293
    .line 294
    .line 295
    iget-object p0, v4, Lh06;->w:Ljava/lang/Object;

    .line 296
    .line 297
    check-cast p0, Lel3;

    .line 298
    .line 299
    if-eqz p0, :cond_12

    .line 300
    .line 301
    new-instance p2, Lkotlinx/coroutines/flow/internal/ChildCancelledException;

    .line 302
    .line 303
    const-string v8, "Child of the scoped flow was cancelled"

    .line 304
    .line 305
    invoke-direct {p2, v8}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    .line 306
    .line 307
    .line 308
    invoke-interface {p0, p2}, Lel3;->o(Ljava/util/concurrent/CancellationException;)V

    .line 309
    .line 310
    .line 311
    iput-object p1, v0, Lmn0;->z:Ljava/lang/Object;

    .line 312
    .line 313
    iput v1, v0, Lmn0;->C:I

    .line 314
    .line 315
    invoke-interface {p0, v0}, Lel3;->j0(Lh61;)Ljava/lang/Object;

    .line 316
    .line 317
    .line 318
    move-result-object p0

    .line 319
    sget-object p2, Lp81;->w:Lp81;

    .line 320
    .line 321
    if-ne p0, p2, :cond_12

    .line 322
    .line 323
    move-object v2, p2

    .line 324
    goto :goto_8

    .line 325
    :cond_12
    :goto_7
    check-cast v5, Lo81;

    .line 326
    .line 327
    new-instance p0, Lln0;

    .line 328
    .line 329
    check-cast v6, Lon0;

    .line 330
    .line 331
    check-cast v3, Lfi2;

    .line 332
    .line 333
    invoke-direct {p0, v6, v3, p1, v7}, Lln0;-><init>(Lon0;Lfi2;Ljava/lang/Object;Lf61;)V

    .line 334
    .line 335
    .line 336
    sget-object p1, Lr81;->z:Lr81;

    .line 337
    .line 338
    invoke-static {v5, v7, p1, p0, v1}, Lar7;->H(Lo81;Le81;Lr81;Lgs2;I)Lh27;

    .line 339
    .line 340
    .line 341
    move-result-object p0

    .line 342
    iput-object p0, v4, Lh06;->w:Ljava/lang/Object;

    .line 343
    .line 344
    :goto_8
    return-object v2

    .line 345
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
